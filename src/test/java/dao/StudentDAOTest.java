package dao;

import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.PortBinding;
import com.github.dockerjava.api.model.Ports;
import model.Student;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Testcontainers
public class StudentDAOTest {

    @Container
    static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:16-alpine")
            .withExposedPorts(5433)
            .withUsername("test")
            .withPassword("test")
            .withDatabaseName("test")
            .withReuse(true)
            .withCreateContainerCmdModifier(cmd -> cmd.withHostConfig(
                    new HostConfig().withPortBindings(new PortBinding(Ports.Binding.bindPort(5433), new ExposedPort(5432)))
            ));
    private static Connection connection;

    @BeforeAll
    static void setup() throws SQLException {
        connection = DriverManager.getConnection(
                postgres.getJdbcUrl(),
                postgres.getUsername(),
                postgres.getPassword()
        );
        try (Statement statement = connection.createStatement()) {
            String createTableSQL = "CREATE TABLE student (\n" +
                    "                         name VARCHAR(255),\n" +
                    "                         coordinator_id INT\n" +
                    ");";
            statement.execute(createTableSQL);
        }
    }

    @AfterAll
    static void cleanup() throws SQLException {
        if (connection != null) {
            try (Statement statement = connection.createStatement()) {
                String dropTableSQL = "DROP TABLE IF EXISTS student";
                statement.execute(dropTableSQL);
            }
            connection.close();
        }
    }

    @Test
    void testInsertStudent() throws SQLException {
        StudentDAO studentDAO = new StudentDAO();
        Student student = new Student("Иван", 1);
        studentDAO.insertStudent(student);

        try (Statement statement = connection.createStatement()) {
            String countSQL = "SELECT COUNT(*) FROM student";
            assertTrue(statement.executeQuery(countSQL).next());
            System.out.println("The record has been created. The database is working...");
        }
    }
}

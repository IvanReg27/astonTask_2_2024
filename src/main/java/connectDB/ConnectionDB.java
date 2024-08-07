package connectDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {
    private static final String DB_USERNAME = "db.jdbcUsername";
    private static final String DB_PASSWORD = "db.jdbcPassword";
    private static final String DB_URL = "db.jdbcURL";

    public Connection getConnection() {
        Connection connection = null;

        try {
            Properties properties = new Properties();
            InputStream inStream = new FileInputStream("C:\\Users\\Ivan\\IdeaProjects\\astonTask_2_2024\\src\\main\\resources\\db.properties");
            properties.load(inStream);

            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(
                    properties.getProperty(DB_URL),
                    properties.getProperty(DB_USERNAME),
                    properties.getProperty(DB_PASSWORD)
            );

            // Print the connection object for debugging
            System.out.println("Connection: " + connection);

        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Class Not Found Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }
}

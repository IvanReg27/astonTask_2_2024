-- Создание таблиц
CREATE TABLE Course (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL
);

CREATE TABLE Coordinator (
                             id SERIAL PRIMARY KEY,
                             name VARCHAR(255) NOT NULL
);

CREATE TABLE Student (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(255) NOT NULL,
                         coordinator_id INT REFERENCES Coordinator(id)
);

CREATE TABLE CourseStudent (
                               course_id INT REFERENCES Course(id),
                               student_id INT REFERENCES Student(id),
                               PRIMARY KEY (course_id, student_id)
);

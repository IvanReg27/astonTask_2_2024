package servlet;

import java.util.List;

public class CourseServlet {
    protected int id;
    protected String course;
    protected List<Student> student;

    public CourseServlet() {
    }
    public CourseServlet(int id, String course) {
        this.id = id;
        this.course = course;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String city) {
        this.course = city;
    }
}

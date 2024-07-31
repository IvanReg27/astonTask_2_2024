package model;

import java.util.List;

public class Student {
    protected int id;
    protected String name;
    protected String coordinator;
    protected List<Course> courses;

    public Student() {
    }
    public Student(String name, String coordinator) {
        super();
        this.name = name;
        this.coordinator = coordinator;
    }
    public Student(int id, String name, String coordinator) {
        super();
        this.id = id;
        this.name = name;
        this.coordinator = coordinator;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCoordinator() {
        return coordinator;
    }
    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }
}

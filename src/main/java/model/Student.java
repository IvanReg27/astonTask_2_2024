package model;

import java.util.List;

public class Student {
    protected int id;
    protected String name;
    protected int coordinator_id;
    protected List<Course> courses;

    public Student() {
    }

    public Student(int id, String name, int coordinator_id) {
        this.id = id;
        this.name = name;
        this.coordinator_id = coordinator_id;
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

    public int getCoordinator_id() {
        return coordinator_id;
    }

    public void setCoordinator_id(int coordinator_id) {
        this.coordinator_id = coordinator_id;
    }
}

package model;

import java.util.List;

public class Coordinator {
    protected int id;
    protected String name;
    protected List<Student> students;

    public Coordinator() {
    }

    public Coordinator(int id, String name) {
        this.id = id;
        this.name = name;
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
}

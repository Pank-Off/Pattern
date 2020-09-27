package com.pattern.prototype;

public class Project implements Copyable {
    private int id;
    private String name;

    Project(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public Object copy() {
        return new Project(id, name);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

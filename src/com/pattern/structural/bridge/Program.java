package com.pattern.structural.bridge;

public abstract class Program {
    protected Developer developer;
    private String name;
    private int id;
    private double version;

    public Program(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", version=" + version +
                '}';
    }

    void getInfo() {
        System.out.println(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    abstract void doWork();
}

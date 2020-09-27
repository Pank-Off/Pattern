package com.pattern.creational.prototype;

public class Prototype {
    public static void main(String[] args) {
        Project project = new Project(1, "First project");
        ProjectFactory projectFactory = new ProjectFactory(project);

        Project copyProject = projectFactory.getCopy();
        System.out.println(project);
        System.out.println(copyProject);
    }
}

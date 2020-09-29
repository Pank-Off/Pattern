package com.pattern.structural.composite;

public class Composite {
    public static void main(String[] args) {
        Team team = new Team();
        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);
        team.addDeveloper(new JavaDeveloper());
        team.createProject();
        System.out.println("===============================");
        team.removeDeveloper(cppDeveloper);
        team.createProject();
    }
}

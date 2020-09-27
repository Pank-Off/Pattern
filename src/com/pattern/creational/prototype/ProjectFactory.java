package com.pattern.creational.prototype;

public class ProjectFactory {
    private Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    Project getCopy() {
        return (Project) project.copy();
    }
}

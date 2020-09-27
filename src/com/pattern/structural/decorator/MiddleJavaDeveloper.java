package com.pattern.structural.decorator;

public class MiddleJavaDeveloper extends DeveloperDecorator {
    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }

    String fixBug() {
        return "Fix bug. ";
    }

    @Override
    public String makeJob() {
        return developer.makeJob() + fixBug();
    }
}

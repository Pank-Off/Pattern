package com.pattern.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    String codeReview() {
        return "Make Code review. ";
    }

    @Override
    public String makeJob() {
        return developer.makeJob() + codeReview();
    }
}

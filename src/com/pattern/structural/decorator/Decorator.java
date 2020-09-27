package com.pattern.structural.decorator;

public class Decorator {
    public static void main(String[] args) {
        DeveloperDecorator developer = new SeniorJavaDeveloper(new MiddleJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}

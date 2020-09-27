package com.pattern.factory;

public class Factory {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    public static DeveloperFactory createDeveloperFactory(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}

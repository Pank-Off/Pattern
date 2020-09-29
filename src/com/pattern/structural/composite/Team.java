package com.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    void createProject() {
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}

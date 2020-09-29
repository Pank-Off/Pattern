package com.pattern.behavioral.iterator;


public class IteratorMainClass {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Kirill", new String[]{"Java", "Git", "Maven"});
        Iterator iterator = javaDeveloper.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

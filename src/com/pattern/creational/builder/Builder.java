package com.pattern.creational.builder;


public class Builder {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitWebSiteBuilder());
        WebSite webSite = director.createWebSite();
        System.out.println(webSite);
    }
}

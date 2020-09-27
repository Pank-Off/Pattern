package com.pattern.creational.builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite createWebSite() {
        builder.createWebSite();
        builder.setName();
        builder.setCms();
        builder.setPrice();
        WebSite webSite = builder.getWebSite();
        return webSite;
    }
}

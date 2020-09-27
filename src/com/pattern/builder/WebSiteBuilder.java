package com.pattern.builder;

public abstract class WebSiteBuilder {

    WebSite webSite;

    void createWebSite() {
        webSite = new WebSite();
    }

    abstract void setName();

    abstract void setCms();

    abstract void setPrice();

    WebSite getWebSite() {
        return webSite;
    }

}

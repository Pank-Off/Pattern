package com.pattern.creational.builder;

public class VisitWebSiteBuilder extends WebSiteBuilder {

    @Override
    void setName() {
        webSite.setName("Visit Web Site");
    }

    @Override
    void setCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void setPrice() {
        webSite.setPrice(10000);
    }

}

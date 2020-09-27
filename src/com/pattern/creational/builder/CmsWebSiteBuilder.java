package com.pattern.creational.builder;

public class CmsWebSiteBuilder extends WebSiteBuilder {
    @Override
    void setName() {
        webSite.setName("CmsWebSite");
    }

    @Override
    void setCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void setPrice() {
        webSite.setPrice(10);
    }
}

package com.pattern.creational.builder;

public class WebSite {
    private String name;
    private Cms Cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        Cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", Cms=" + Cms +
                ", price=" + price +
                '}';
    }
}

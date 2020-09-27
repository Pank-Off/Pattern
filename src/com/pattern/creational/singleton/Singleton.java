package com.pattern.creational.singleton;

public class Singleton {
    public static void main(String[] args) {
        Instance instance1 = Instance.getInstance();
        Instance instance2 = Instance.getInstance();

        instance1.setLog("log1 ");
        instance2.setLog("log2 ");

        System.out.println(instance1);
        System.out.println(instance2);

        System.out.println(instance1.showLog());
        System.out.println(instance2.showLog());
    }
}

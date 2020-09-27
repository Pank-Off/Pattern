package com.pattern.singleton;

public class Instance {
    private static Instance instance;
    private String log = "";

    private Instance() {
    }

    public synchronized static Instance getInstance() {
        if (instance == null) {
            instance = new Instance();
        }
        return instance;
    }

    void setLog(String log) {
        this.log += log;
    }

    String showLog() {
        return log;
    }
}

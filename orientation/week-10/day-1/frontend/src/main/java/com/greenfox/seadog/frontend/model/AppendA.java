package com.greenfox.seadog.frontend.model;

public class AppendA {

    private String appended;

    public AppendA(String appendable) {
        appended = appendable + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}

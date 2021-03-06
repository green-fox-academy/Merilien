package com.greenfox.seadog.frontend.model;

public class DoubleAmount {
    private int received;
    private int result;

    public DoubleAmount(int received) {
        this.received = received;
        result = received * 2;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

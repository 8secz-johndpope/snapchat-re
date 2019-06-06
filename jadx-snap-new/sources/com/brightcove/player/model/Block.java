package com.brightcove.player.model;

public class Block extends StyledElement {
    protected Integer a;
    protected Integer b;
    private String j;

    public int getBeginTime() {
        return this.a.intValue();
    }

    public int getEndTime() {
        return this.b.intValue();
    }

    public String getRegion() {
        return this.j;
    }

    public void setBeginTime(int i) {
        this.a = Integer.valueOf(i);
    }

    public void setEndTime(int i) {
        this.b = Integer.valueOf(i);
    }

    public void setRegion(String str) {
        this.j = str;
    }
}

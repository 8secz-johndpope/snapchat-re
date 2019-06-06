package com.brightcove.player.model;

import java.io.Serializable;

public class Element implements Serializable {
    protected String c;

    public String getID() {
        return this.c;
    }

    public void setID(String str) {
        this.c = str;
    }
}

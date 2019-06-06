package com.brightcove.player.model;

import java.util.Locale;

public class Region extends StyledElement {
    private Length a;
    private Length b;
    private Length j;
    private Length k;
    private DisplayAlign l;

    public enum DisplayAlign {
        BEFORE,
        CENTER,
        AFTER;

        public static DisplayAlign fromString(String str) {
            return valueOf(str.toUpperCase(Locale.US));
        }
    }

    public DisplayAlign getDisplayAlign() {
        return this.l;
    }

    public Length getExtentX() {
        return this.j;
    }

    public Length getExtentY() {
        return this.k;
    }

    public Length getOriginX() {
        return this.a;
    }

    public Length getOriginY() {
        return this.b;
    }

    public void setDisplayAlign(DisplayAlign displayAlign) {
        this.l = displayAlign;
    }

    public void setExtentX(Length length) {
        this.j = length;
    }

    public void setExtentY(Length length) {
        this.k = length;
    }

    public void setOriginX(Length length) {
        this.a = length;
    }

    public void setOriginY(Length length) {
        this.b = length;
    }
}

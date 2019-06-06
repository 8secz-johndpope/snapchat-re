package com.brightcove.player.model;

public class Span extends StyledElement {
    private String a;

    public Span(StyledElement styledElement) {
        if (styledElement != null) {
            this.c = styledElement.getID();
            this.d = styledElement.getStyleName();
            this.e = styledElement.getColor();
            this.f = styledElement.getBackgroundColor();
            this.g = styledElement.getFontSize();
            this.h = styledElement.getFontStyle();
            this.i = styledElement.getFontFamily();
            return;
        }
        throw new IllegalArgumentException("must provide a StyledElement");
    }

    public Span(String str) {
        this.a = str;
    }

    public String getText() {
        return this.a;
    }

    public void setText(String str) {
        this.a = str;
    }
}

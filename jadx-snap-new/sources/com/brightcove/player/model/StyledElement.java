package com.brightcove.player.model;

public class StyledElement extends Element {
    private FontWeight a;
    private TextDecoration b;
    protected String d;
    protected String e;
    protected String f;
    protected Length g;
    protected FontStyle h;
    protected String i;
    private TextAlign j;

    public enum FontStyle {
        UNDEFINED,
        NORMAL,
        ITALIC
    }

    public enum FontWeight {
        UNDEFINED,
        NORMAL,
        BOLD
    }

    public enum TextAlign {
        UNDEFINED,
        START,
        LEFT,
        CENTER,
        RIGHT,
        END
    }

    public enum TextDecoration {
        NONE,
        UNDERLINE,
        NOUNDERLINE,
        LINETHROUGH,
        NOLINETHROUGH,
        OVERLINE,
        NOOVERLINE
    }

    public enum Unit {
        UNDEFINED,
        EMS,
        PERCENT,
        PX,
        PT;

        public static Unit fromString(String str) {
            return str == null ? UNDEFINED : str.equals("%") ? PERCENT : valueOf(str);
        }
    }

    public String getBackgroundColor() {
        return this.f;
    }

    public String getColor() {
        return this.e;
    }

    public String getFontFamily() {
        return this.i;
    }

    public Length getFontSize() {
        return this.g;
    }

    public FontStyle getFontStyle() {
        return this.h;
    }

    public FontWeight getFontWeight() {
        return this.a;
    }

    public String getStyleName() {
        return this.d;
    }

    public TextAlign getTextAlign() {
        return this.j;
    }

    public TextDecoration getTextDecoration() {
        return this.b;
    }

    public void setBackgroundColor(String str) {
        this.f = str;
    }

    public void setColor(String str) {
        this.e = str;
    }

    public void setFontFamily(String str) {
        this.i = str;
    }

    public void setFontSize(Length length) {
        this.g = length;
    }

    public void setFontStyle(FontStyle fontStyle) {
        this.h = fontStyle;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.a = fontWeight;
    }

    public void setStyleName(String str) {
        this.d = str;
    }

    public void setTextAlign(TextAlign textAlign) {
        this.j = textAlign;
    }

    public void setTextDecoration(TextDecoration textDecoration) {
        this.b = textDecoration;
    }
}

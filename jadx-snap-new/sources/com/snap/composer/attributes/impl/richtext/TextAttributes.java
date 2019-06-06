package com.snap.composer.attributes.impl.richtext;

import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.composer.attributes.impl.fonts.FontCache;
import com.snap.composer.attributes.impl.fonts.FontStyle;
import com.snap.composer.attributes.impl.fonts.FontWeight;
import com.snap.composer.attributes.impl.richtext.SpanBuilder.Spans;
import com.snap.composer.exceptions.AttributeError;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akgc;
import java.util.ArrayList;
import java.util.List;

public final class TextAttributes {
    public static final Companion Companion = new Companion();
    private static final TextAttributes k = new TextAttributes(null, null, null, 12, null, null, null, null, -16777216, Alignment.ALIGN_NORMAL);
    private static final TextAttributes l = new TextAttributes(null, null, null, 12, null, null, null, null, -16777216, Alignment.ALIGN_CENTER);
    private FontWeight a;
    private FontStyle b;
    private TextDecoration c;
    private int d;
    private String e;
    private String f;
    private Float g;
    private Float h;
    private int i;
    private Alignment j;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final TextAttributes getButtonDefault() {
            return TextAttributes.l;
        }

        public final TextAttributes getDefault() {
            return TextAttributes.k;
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextDecoration.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TextDecoration.UNDERLINE.ordinal()] = 1;
            $EnumSwitchMapping$0[TextDecoration.STRIKETHROUGH.ordinal()] = 2;
            $EnumSwitchMapping$0[TextDecoration.NONE.ordinal()] = 3;
        }
    }

    static final class a extends akcs implements akbl<Object, ajxw> {
        private /* synthetic */ List a;

        a(List list) {
            this.a = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b(obj, "it");
            this.a.add(obj);
            return ajxw.a;
        }
    }

    public TextAttributes(FontWeight fontWeight, FontStyle fontStyle, TextDecoration textDecoration, int i, String str, String str2, Float f, Float f2, int i2, Alignment alignment) {
        akcr.b(alignment, Event.ALIGNMENT);
        this.a = fontWeight;
        this.b = fontStyle;
        this.c = textDecoration;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = f;
        this.h = f2;
        this.i = i2;
        this.j = alignment;
    }

    public static /* synthetic */ TextAttributes copy$default(TextAttributes textAttributes, FontWeight fontWeight, FontStyle fontStyle, TextDecoration textDecoration, int i, String str, String str2, Float f, Float f2, int i2, Alignment alignment, int i3, Object obj) {
        TextAttributes textAttributes2 = textAttributes;
        int i4 = i3;
        return textAttributes.copy((i4 & 1) != 0 ? textAttributes2.a : fontWeight, (i4 & 2) != 0 ? textAttributes2.b : fontStyle, (i4 & 4) != 0 ? textAttributes2.c : textDecoration, (i4 & 8) != 0 ? textAttributes2.d : i, (i4 & 16) != 0 ? textAttributes2.e : str, (i4 & 32) != 0 ? textAttributes2.f : str2, (i4 & 64) != 0 ? textAttributes2.g : f, (i4 & 128) != 0 ? textAttributes2.h : f2, (i4 & 256) != 0 ? textAttributes2.i : i2, (i4 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? textAttributes2.j : alignment);
    }

    public final void applyFont(String str) {
        int i;
        akcr.b(str, "font");
        Object toLowerCase = str.toLowerCase();
        akcr.a(toLowerCase, "(this as java.lang.String).toLowerCase()");
        int hashCode = toLowerCase.hashCode();
        String str2;
        if (hashCode != 3029410) {
            switch (hashCode) {
                case -873453351:
                    str2 = "title1";
                    if (toLowerCase.equals(str2)) {
                        this.f = str2;
                        i = 25;
                        break;
                    }
                    break;
                case -873453350:
                    str2 = "title2";
                    if (toLowerCase.equals(str2)) {
                        this.f = str2;
                        i = 19;
                        break;
                    }
                    break;
                case -873453349:
                    str2 = "title3";
                    if (toLowerCase.equals(str2)) {
                        this.f = str2;
                        i = 17;
                        break;
                    }
                    break;
            }
        }
        str2 = Tags.BODY;
        if (toLowerCase.equals(str2)) {
            this.f = str2;
            i = 14;
        }
        List a = akgc.a((CharSequence) str, new String[]{" "}, 0, 6);
        this.f = (String) a.get(0);
        if (a.size() > 1) {
            try {
                this.d = Integer.parseInt(akgc.b(akgc.b((String) a.get(1), (CharSequence) "px"), (CharSequence) "pt"));
                return;
            } catch (NumberFormatException unused) {
                StringBuilder stringBuilder = new StringBuilder("Found ");
                stringBuilder.append((String) a.get(1));
                stringBuilder.append(", expected integer for font size");
                throw new AttributeError(stringBuilder.toString());
            }
        }
        return;
        this.d = i;
    }

    public final void applyFontStyle(String str) {
        akcr.b(str, "attributeVal");
        FontStyle fontStyle = (str.hashCode() == -1178781136 && str.equals("italic")) ? FontStyle.ITALIC : FontStyle.NORMAL;
        this.b = fontStyle;
    }

    public final void applyFontWeight(java.lang.String r2) {
        /*
        r1 = this;
        r0 = "attributeVal";
        defpackage.akcr.b(r2, r0);
        r0 = r2.hashCode();
        switch(r0) {
            case -1039745817: goto L_0x0039;
            case 3029637: goto L_0x002e;
            case 93818879: goto L_0x0023;
            case 102970646: goto L_0x0018;
            case 577667189: goto L_0x000d;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x003f;
    L_0x000d:
        r0 = "demi-bold";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x003f;
    L_0x0015:
        r2 = com.snap.composer.attributes.impl.fonts.FontWeight.DEMI_BOLD;
        goto L_0x0041;
    L_0x0018:
        r0 = "light";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x003f;
    L_0x0020:
        r2 = com.snap.composer.attributes.impl.fonts.FontWeight.LIGHT;
        goto L_0x0041;
    L_0x0023:
        r0 = "black";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x003f;
    L_0x002b:
        r2 = com.snap.composer.attributes.impl.fonts.FontWeight.BLACK;
        goto L_0x0041;
    L_0x002e:
        r0 = "bold";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x003f;
    L_0x0036:
        r2 = com.snap.composer.attributes.impl.fonts.FontWeight.BOLD;
        goto L_0x0041;
    L_0x0039:
        r0 = "normal";
        r2 = r2.equals(r0);
    L_0x003f:
        r2 = com.snap.composer.attributes.impl.fonts.FontWeight.NORMAL;
    L_0x0041:
        r1.a = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.richtext.TextAttributes.applyFontWeight(java.lang.String):void");
    }

    public final void applyTextAlign(String str) {
        Alignment alignment;
        akcr.b(str, "attributeVal");
        int hashCode = str.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 108511772 && str.equals("right")) {
                alignment = Alignment.ALIGN_OPPOSITE;
                this.j = alignment;
            }
        } else if (str.equals("center")) {
            alignment = Alignment.ALIGN_CENTER;
            this.j = alignment;
        }
        alignment = Alignment.ALIGN_NORMAL;
        this.j = alignment;
    }

    public final void applyTextDecoration(String str) {
        TextDecoration textDecoration;
        akcr.b(str, "attributeVal");
        int hashCode = str.hashCode();
        if (hashCode != -1026963764) {
            if (hashCode == -972521773 && str.equals("strikethrough")) {
                textDecoration = TextDecoration.STRIKETHROUGH;
                this.c = textDecoration;
            }
        } else if (str.equals("underline")) {
            textDecoration = TextDecoration.UNDERLINE;
            this.c = textDecoration;
        }
        textDecoration = TextDecoration.NONE;
        this.c = textDecoration;
    }

    public final FontWeight component1() {
        return this.a;
    }

    public final Alignment component10() {
        return this.j;
    }

    public final FontStyle component2() {
        return this.b;
    }

    public final TextDecoration component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final Float component7() {
        return this.g;
    }

    public final Float component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    public final TextAttributes copy(FontWeight fontWeight, FontStyle fontStyle, TextDecoration textDecoration, int i, String str, String str2, Float f, Float f2, int i2, Alignment alignment) {
        Alignment alignment2 = alignment;
        akcr.b(alignment2, Event.ALIGNMENT);
        return new TextAttributes(fontWeight, fontStyle, textDecoration, i, str, str2, f, f2, i2, alignment2);
    }

    public final void enumerateSpans(FontCache fontCache, akbl<Object, ajxw> akbl) {
        akcr.b(fontCache, "fontCache");
        akcr.b(akbl, "closure");
        akbl.invoke(new AbsoluteSizeSpan(this.d, true));
        akbl.invoke(new ForegroundColorSpan(this.i));
        akbl.invoke(new Standard(this.j));
        TextDecoration textDecoration = this.c;
        if (textDecoration != null) {
            Object underlineSpan;
            if (textDecoration == null) {
                akcr.a();
            }
            int i = WhenMappings.$EnumSwitchMapping$0[textDecoration.ordinal()];
            if (i == 1) {
                underlineSpan = new UnderlineSpan();
            } else if (i == 2) {
                underlineSpan = new StrikethroughSpan();
            }
            akbl.invoke(underlineSpan);
        }
        Typeface resolveTypeface = resolveTypeface(fontCache);
        if (resolveTypeface != null) {
            akbl.invoke(new CustomTypefaceSpan(resolveTypeface));
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAttributes) {
                TextAttributes textAttributes = (TextAttributes) obj;
                if (akcr.a(this.a, textAttributes.a) && akcr.a(this.b, textAttributes.b) && akcr.a(this.c, textAttributes.c)) {
                    if ((this.d == textAttributes.d ? 1 : null) != null && akcr.a(this.e, textAttributes.e) && akcr.a(this.f, textAttributes.f) && akcr.a(this.g, textAttributes.g) && akcr.a(this.h, textAttributes.h)) {
                        if ((this.i == textAttributes.i ? 1 : null) == null || !akcr.a(this.j, textAttributes.j)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Alignment getAlignment() {
        return this.j;
    }

    public final int getColor() {
        return this.i;
    }

    public final String getFontFamily() {
        return this.e;
    }

    public final String getFontName() {
        return this.f;
    }

    public final int getFontSize() {
        return this.d;
    }

    public final Float getLetterSpacing() {
        return this.h;
    }

    public final Float getLineHeight() {
        return this.g;
    }

    public final Spans getSpans(int i, int i2, FontCache fontCache) {
        akcr.b(fontCache, "fontCache");
        List arrayList = new ArrayList();
        enumerateSpans(fontCache, new a(arrayList));
        return new Spans(i, i2, arrayList);
    }

    public final FontStyle getStyle() {
        return this.b;
    }

    public final TextDecoration getTextDecoration() {
        return this.c;
    }

    public final FontWeight getWeight() {
        return this.a;
    }

    public final int hashCode() {
        FontWeight fontWeight = this.a;
        int i = 0;
        int hashCode = (fontWeight != null ? fontWeight.hashCode() : 0) * 31;
        FontStyle fontStyle = this.b;
        hashCode = (hashCode + (fontStyle != null ? fontStyle.hashCode() : 0)) * 31;
        TextDecoration textDecoration = this.c;
        hashCode = (((hashCode + (textDecoration != null ? textDecoration.hashCode() : 0)) * 31) + this.d) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Float f = this.g;
        hashCode = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        f = this.h;
        hashCode = (((hashCode + (f != null ? f.hashCode() : 0)) * 31) + this.i) * 31;
        Alignment alignment = this.j;
        if (alignment != null) {
            i = alignment.hashCode();
        }
        return hashCode + i;
    }

    public final Typeface resolveTypeface(FontCache fontCache) {
        akcr.b(fontCache, "fontCache");
        return (this.e == null && this.f == null && this.a == null && this.b == null) ? null : fontCache.getTypeface(this.e, this.f, this.a, this.b);
    }

    public final void setAlignment(Alignment alignment) {
        akcr.b(alignment, "<set-?>");
        this.j = alignment;
    }

    public final void setColor(int i) {
        this.i = i;
    }

    public final void setFontFamily(String str) {
        this.e = str;
    }

    public final void setFontName(String str) {
        this.f = str;
    }

    public final void setFontSize(int i) {
        this.d = i;
    }

    public final void setLetterSpacing(Float f) {
        this.h = f;
    }

    public final void setLineHeight(Float f) {
        this.g = f;
    }

    public final void setStyle(FontStyle fontStyle) {
        this.b = fontStyle;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        this.c = textDecoration;
    }

    public final void setWeight(FontWeight fontWeight) {
        this.a = fontWeight;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextAttributes(weight=");
        stringBuilder.append(this.a);
        stringBuilder.append(", style=");
        stringBuilder.append(this.b);
        stringBuilder.append(", textDecoration=");
        stringBuilder.append(this.c);
        stringBuilder.append(", fontSize=");
        stringBuilder.append(this.d);
        stringBuilder.append(", fontFamily=");
        stringBuilder.append(this.e);
        stringBuilder.append(", fontName=");
        stringBuilder.append(this.f);
        stringBuilder.append(", lineHeight=");
        stringBuilder.append(this.g);
        stringBuilder.append(", letterSpacing=");
        stringBuilder.append(this.h);
        stringBuilder.append(", color=");
        stringBuilder.append(this.i);
        stringBuilder.append(", alignment=");
        stringBuilder.append(this.j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

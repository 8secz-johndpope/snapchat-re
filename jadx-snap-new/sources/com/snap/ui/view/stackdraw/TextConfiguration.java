package com.snap.ui.view.stackdraw;

import android.graphics.Paint.Align;
import android.graphics.Typeface;
import com.brightcove.player.captioning.TTMLParser.Attributes;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.akco;
import defpackage.akcr;

public final class TextConfiguration {
    private final boolean includeFontPadding;
    private final int maxLines;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private float shadowRadius;
    private final Align textAlign;
    private int textColor;
    private float textSize;
    private final Typeface typeface;

    public TextConfiguration() {
        this(0, null, null, false, 0, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0, 1023, null);
    }

    public TextConfiguration(int i, Align align, Typeface typeface, boolean z, int i2, float f, float f2, float f3, float f4, int i3) {
        akcr.b(align, Attributes.TEXT_ALIGN);
        akcr.b(typeface, "typeface");
        this.maxLines = i;
        this.textAlign = align;
        this.typeface = typeface;
        this.includeFontPadding = z;
        this.textColor = i2;
        this.textSize = f;
        this.shadowRadius = f2;
        this.shadowDx = f3;
        this.shadowDy = f4;
        this.shadowColor = i3;
    }

    public /* synthetic */ TextConfiguration(int i, Align align, Typeface typeface, boolean z, int i2, float f, float f2, float f3, float f4, int i3, int i4, akco akco) {
        Typeface typeface2;
        int i5 = i4;
        int i6 = (i5 & 1) != 0 ? Integer.MAX_VALUE : i;
        Align align2 = (i5 & 2) != 0 ? Align.LEFT : align;
        if ((i5 & 4) != 0) {
            typeface2 = Typeface.DEFAULT;
            akcr.a((Object) typeface2, "Typeface.DEFAULT");
        } else {
            typeface2 = typeface;
        }
        boolean z2 = (i5 & 8) != 0 ? true : z;
        int i7 = (i5 & 16) != 0 ? -16777216 : i2;
        float f5 = (i5 & 32) != 0 ? 25.0f : f;
        int i8 = i5 & 64;
        float f6 = MapboxConstants.MINIMUM_ZOOM;
        float f7 = i8 != 0 ? MapboxConstants.MINIMUM_ZOOM : f2;
        float f8 = (i5 & 128) != 0 ? MapboxConstants.MINIMUM_ZOOM : f3;
        if ((i5 & 256) == 0) {
            f6 = f4;
        }
        this(i6, align2, typeface2, z2, i7, f5, f7, f8, f6, (i5 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? 0 : i3);
    }

    public static /* synthetic */ TextConfiguration copy$default(TextConfiguration textConfiguration, int i, Align align, Typeface typeface, boolean z, int i2, float f, float f2, float f3, float f4, int i3, int i4, Object obj) {
        TextConfiguration textConfiguration2 = textConfiguration;
        int i5 = i4;
        return textConfiguration.copy((i5 & 1) != 0 ? textConfiguration2.maxLines : i, (i5 & 2) != 0 ? textConfiguration2.textAlign : align, (i5 & 4) != 0 ? textConfiguration2.typeface : typeface, (i5 & 8) != 0 ? textConfiguration2.includeFontPadding : z, (i5 & 16) != 0 ? textConfiguration2.textColor : i2, (i5 & 32) != 0 ? textConfiguration2.textSize : f, (i5 & 64) != 0 ? textConfiguration2.shadowRadius : f2, (i5 & 128) != 0 ? textConfiguration2.shadowDx : f3, (i5 & 256) != 0 ? textConfiguration2.shadowDy : f4, (i5 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? textConfiguration2.shadowColor : i3);
    }

    public final int component1() {
        return this.maxLines;
    }

    public final int component10() {
        return this.shadowColor;
    }

    public final Align component2() {
        return this.textAlign;
    }

    public final Typeface component3() {
        return this.typeface;
    }

    public final boolean component4() {
        return this.includeFontPadding;
    }

    public final int component5() {
        return this.textColor;
    }

    public final float component6() {
        return this.textSize;
    }

    public final float component7() {
        return this.shadowRadius;
    }

    public final float component8() {
        return this.shadowDx;
    }

    public final float component9() {
        return this.shadowDy;
    }

    public final TextConfiguration copy(int i, Align align, Typeface typeface, boolean z, int i2, float f, float f2, float f3, float f4, int i3) {
        Align align2 = align;
        akcr.b(align, Attributes.TEXT_ALIGN);
        Typeface typeface2 = typeface;
        akcr.b(typeface, "typeface");
        return new TextConfiguration(i, align2, typeface2, z, i2, f, f2, f3, f4, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextConfiguration) {
                TextConfiguration textConfiguration = (TextConfiguration) obj;
                if ((this.maxLines == textConfiguration.maxLines ? 1 : null) != null && akcr.a(this.textAlign, textConfiguration.textAlign) && akcr.a(this.typeface, textConfiguration.typeface)) {
                    if ((this.includeFontPadding == textConfiguration.includeFontPadding ? 1 : null) != null) {
                        if ((this.textColor == textConfiguration.textColor ? 1 : null) != null && Float.compare(this.textSize, textConfiguration.textSize) == 0 && Float.compare(this.shadowRadius, textConfiguration.shadowRadius) == 0 && Float.compare(this.shadowDx, textConfiguration.shadowDx) == 0 && Float.compare(this.shadowDy, textConfiguration.shadowDy) == 0) {
                            if ((this.shadowColor == textConfiguration.shadowColor ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final float getShadowDx() {
        return this.shadowDx;
    }

    public final float getShadowDy() {
        return this.shadowDy;
    }

    public final float getShadowRadius() {
        return this.shadowRadius;
    }

    public final Align getTextAlign() {
        return this.textAlign;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public final int hashCode() {
        int i = this.maxLines * 31;
        Align align = this.textAlign;
        int i2 = 0;
        i = (i + (align != null ? align.hashCode() : 0)) * 31;
        Typeface typeface = this.typeface;
        if (typeface != null) {
            i2 = typeface.hashCode();
        }
        i = (i + i2) * 31;
        int i3 = this.includeFontPadding;
        if (i3 != 0) {
            i3 = 1;
        }
        return ((((((((((((i + i3) * 31) + this.textColor) * 31) + Float.floatToIntBits(this.textSize)) * 31) + Float.floatToIntBits(this.shadowRadius)) * 31) + Float.floatToIntBits(this.shadowDx)) * 31) + Float.floatToIntBits(this.shadowDy)) * 31) + this.shadowColor;
    }

    public final void setShadowColor(int i) {
        this.shadowColor = i;
    }

    public final void setShadowDx(float f) {
        this.shadowDx = f;
    }

    public final void setShadowDy(float f) {
        this.shadowDy = f;
    }

    public final void setShadowRadius(float f) {
        this.shadowRadius = f;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextConfiguration(maxLines=");
        stringBuilder.append(this.maxLines);
        stringBuilder.append(", textAlign=");
        stringBuilder.append(this.textAlign);
        stringBuilder.append(", typeface=");
        stringBuilder.append(this.typeface);
        stringBuilder.append(", includeFontPadding=");
        stringBuilder.append(this.includeFontPadding);
        stringBuilder.append(", textColor=");
        stringBuilder.append(this.textColor);
        stringBuilder.append(", textSize=");
        stringBuilder.append(this.textSize);
        stringBuilder.append(", shadowRadius=");
        stringBuilder.append(this.shadowRadius);
        stringBuilder.append(", shadowDx=");
        stringBuilder.append(this.shadowDx);
        stringBuilder.append(", shadowDy=");
        stringBuilder.append(this.shadowDy);
        stringBuilder.append(", shadowColor=");
        stringBuilder.append(this.shadowColor);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

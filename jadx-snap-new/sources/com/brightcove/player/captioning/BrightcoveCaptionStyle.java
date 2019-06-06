package com.brightcove.player.captioning;

import com.brightcove.player.captioning.preferences.CaptionConstants;
import defpackage.xx.a;

public abstract class BrightcoveCaptionStyle {

    public interface Builder {
        Builder backgroundColor(int i);

        Builder backgroundOpacity(int i);

        BrightcoveCaptionStyle build();

        Builder edgeColor(int i);

        Builder edgeType(int i);

        Builder fontSize(String str);

        Builder foregroundColor(int i);

        Builder foregroundOpacity(int i);

        Builder preset(int i);

        Builder typeface(String str);

        Builder windowColor(int i);

        Builder windowOpacity(int i);
    }

    public static Builder builder() {
        return new a();
    }

    public static BrightcoveCaptionStyle createCaptionStyle(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return builder().preset(-1).fontSize(str).typeface(str2).foregroundColor(i).foregroundOpacity(i2).edgeType(i3).edgeColor(i4).backgroundColor(i5).backgroundOpacity(i6).windowColor(i7).windowOpacity(i8).build();
    }

    public static BrightcoveCaptionStyle createCaptionStyleFromPreset(String str, int i) {
        int i2;
        int i3 = -256;
        if (i == 1) {
            i2 = -1;
            i3 = -16777216;
        } else if (i == 2) {
            i2 = -16777216;
        } else if (i != 3) {
            i2 = -16777216;
            i3 = -1;
        } else {
            i2 = -16776961;
        }
        return builder().preset(i).fontSize(str).typeface(CaptionConstants.DEFAULT_TYPEFACE).foregroundColor(i3).foregroundOpacity(-1).edgeType(0).edgeColor(-16777216).backgroundColor(i2).backgroundOpacity(-1).windowColor(0).windowOpacity(0).build();
    }

    public static com.brightcove.player.captioning.BrightcoveCaptionStyle updateStyleByPreferenceKey(com.brightcove.player.captioning.BrightcoveCaptionStyle r12, java.lang.String r13, java.lang.Object r14) {
        /*
        r0 = r12.typeface();
        r1 = r12.fontSize();
        r2 = r12.foregroundColor();
        r3 = r12.foregroundOpacity();
        r4 = r12.edgeType();
        r5 = r12.edgeColor();
        r6 = r12.backgroundColor();
        r7 = r12.backgroundOpacity();
        r8 = r12.windowColor();
        r9 = r12.windowOpacity();
        r10 = r13.hashCode();
        r11 = 0;
        switch(r10) {
            case -1236731529: goto L_0x008c;
            case -1009808097: goto L_0x0081;
            case -762839331: goto L_0x0077;
            case -339562066: goto L_0x006d;
            case -280051019: goto L_0x0063;
            case 75674378: goto L_0x0059;
            case 332759354: goto L_0x004f;
            case 1205119556: goto L_0x0045;
            case 1424864313: goto L_0x003b;
            case 1786850802: goto L_0x0031;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x0097;
    L_0x0031:
        r10 = "captioning_foreground_opacity";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x0039:
        r10 = 3;
        goto L_0x0098;
    L_0x003b:
        r10 = "captioning_edge_type";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x0043:
        r10 = 4;
        goto L_0x0098;
    L_0x0045:
        r10 = "captioning_edge_color";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x004d:
        r10 = 5;
        goto L_0x0098;
    L_0x004f:
        r10 = "captioning_typeface";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x0057:
        r10 = 1;
        goto L_0x0098;
    L_0x0059:
        r10 = "captioning_foreground_color";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x0061:
        r10 = 2;
        goto L_0x0098;
    L_0x0063:
        r10 = "captioning_background_color";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x006b:
        r10 = 6;
        goto L_0x0098;
    L_0x006d:
        r10 = "captioning_font_size";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x0075:
        r10 = 0;
        goto L_0x0098;
    L_0x0077:
        r10 = "captioning_background_opacity";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x007f:
        r10 = 7;
        goto L_0x0098;
    L_0x0081:
        r10 = "captioning_window_opacity";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x0089:
        r10 = 9;
        goto L_0x0098;
    L_0x008c:
        r10 = "captioning_window_color";
        r10 = r13.equals(r10);
        if (r10 == 0) goto L_0x0097;
    L_0x0094:
        r10 = 8;
        goto L_0x0098;
    L_0x0097:
        r10 = -1;
    L_0x0098:
        switch(r10) {
            case 0: goto L_0x00e7;
            case 1: goto L_0x00e3;
            case 2: goto L_0x00dc;
            case 3: goto L_0x00d5;
            case 4: goto L_0x00ce;
            case 5: goto L_0x00c7;
            case 6: goto L_0x00c0;
            case 7: goto L_0x00b9;
            case 8: goto L_0x00b2;
            case 9: goto L_0x00ab;
            default: goto L_0x009b;
        };
    L_0x009b:
        r13 = java.lang.String.valueOf(r13);
        r14 = "Unexpected preference: ";
        r13 = r14.concat(r13);
        r14 = "BrightcoveCaptionStyle";
        android.util.Log.v(r14, r13);
        goto L_0x00ea;
    L_0x00ab:
        r14 = (java.lang.Integer) r14;
        r9 = r14.intValue();
        goto L_0x00ea;
    L_0x00b2:
        r14 = (java.lang.Integer) r14;
        r8 = r14.intValue();
        goto L_0x00ea;
    L_0x00b9:
        r14 = (java.lang.Integer) r14;
        r7 = r14.intValue();
        goto L_0x00ea;
    L_0x00c0:
        r14 = (java.lang.Integer) r14;
        r6 = r14.intValue();
        goto L_0x00ea;
    L_0x00c7:
        r14 = (java.lang.Integer) r14;
        r5 = r14.intValue();
        goto L_0x00ea;
    L_0x00ce:
        r14 = (java.lang.Integer) r14;
        r4 = r14.intValue();
        goto L_0x00ea;
    L_0x00d5:
        r14 = (java.lang.Integer) r14;
        r3 = r14.intValue();
        goto L_0x00ea;
    L_0x00dc:
        r14 = (java.lang.Integer) r14;
        r2 = r14.intValue();
        goto L_0x00ea;
    L_0x00e3:
        r0 = r14;
        r0 = (java.lang.String) r0;
        goto L_0x00ea;
    L_0x00e7:
        r1 = r14;
        r1 = (java.lang.String) r1;
    L_0x00ea:
        if (r6 != 0) goto L_0x00ed;
    L_0x00ec:
        r7 = 0;
    L_0x00ed:
        if (r8 != 0) goto L_0x00f0;
    L_0x00ef:
        r9 = 0;
    L_0x00f0:
        r13 = builder();
        r12 = r12.preset();
        r12 = r13.preset(r12);
        r12 = r12.fontSize(r1);
        r12 = r12.typeface(r0);
        r12 = r12.foregroundColor(r2);
        r12 = r12.foregroundOpacity(r3);
        r12 = r12.edgeType(r4);
        r12 = r12.edgeColor(r5);
        r12 = r12.backgroundColor(r6);
        r12 = r12.backgroundOpacity(r7);
        r12 = r12.windowColor(r8);
        r12 = r12.windowOpacity(r9);
        r12 = r12.build();
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.captioning.BrightcoveCaptionStyle.updateStyleByPreferenceKey(com.brightcove.player.captioning.BrightcoveCaptionStyle, java.lang.String, java.lang.Object):com.brightcove.player.captioning.BrightcoveCaptionStyle");
    }

    public abstract int backgroundColor();

    public abstract int backgroundOpacity();

    public abstract int edgeColor();

    public abstract int edgeType();

    public abstract String fontSize();

    public abstract int foregroundColor();

    public abstract int foregroundOpacity();

    public abstract int preset();

    public abstract String typeface();

    public void validate() {
    }

    public abstract int windowColor();

    public abstract int windowOpacity();
}

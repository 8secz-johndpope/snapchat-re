package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Log;

@TargetApi(16)
/* renamed from: bqk */
public final class bqk {
    public final String a;
    public final String b;
    public final CodecCapabilities c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Missing block: B:32:0x005c, code skipped:
            if (r3 != null) goto L_0x0060;
     */
    bqk(java.lang.String r1, java.lang.String r2, android.media.MediaCodecInfo.CodecCapabilities r3, boolean r4, boolean r5, boolean r6) {
        /*
        r0 = this;
        r0.<init>();
        r1 = defpackage.byo.a(r1);
        r1 = (java.lang.String) r1;
        r0.a = r1;
        r0.b = r2;
        r0.c = r3;
        r0.g = r4;
        r1 = 1;
        r2 = 0;
        if (r5 != 0) goto L_0x002c;
    L_0x0015:
        if (r3 == 0) goto L_0x002c;
    L_0x0017:
        r4 = defpackage.bzo.a;
        r5 = 19;
        if (r4 < r5) goto L_0x0027;
    L_0x001d:
        r4 = "adaptive-playback";
        r4 = r3.isFeatureSupported(r4);
        if (r4 == 0) goto L_0x0027;
    L_0x0025:
        r4 = 1;
        goto L_0x0028;
    L_0x0027:
        r4 = 0;
    L_0x0028:
        if (r4 == 0) goto L_0x002c;
    L_0x002a:
        r4 = 1;
        goto L_0x002d;
    L_0x002c:
        r4 = 0;
    L_0x002d:
        r0.d = r4;
        r4 = 21;
        if (r3 == 0) goto L_0x0046;
    L_0x0033:
        r5 = defpackage.bzo.a;
        if (r5 < r4) goto L_0x0041;
    L_0x0037:
        r5 = "tunneled-playback";
        r5 = r3.isFeatureSupported(r5);
        if (r5 == 0) goto L_0x0041;
    L_0x003f:
        r5 = 1;
        goto L_0x0042;
    L_0x0041:
        r5 = 0;
    L_0x0042:
        if (r5 == 0) goto L_0x0046;
    L_0x0044:
        r5 = 1;
        goto L_0x0047;
    L_0x0046:
        r5 = 0;
    L_0x0047:
        r0.e = r5;
        if (r6 != 0) goto L_0x0060;
    L_0x004b:
        if (r3 == 0) goto L_0x005f;
    L_0x004d:
        r5 = defpackage.bzo.a;
        if (r5 < r4) goto L_0x005b;
    L_0x0051:
        r4 = "secure-playback";
        r3 = r3.isFeatureSupported(r4);
        if (r3 == 0) goto L_0x005b;
    L_0x0059:
        r3 = 1;
        goto L_0x005c;
    L_0x005b:
        r3 = 0;
    L_0x005c:
        if (r3 == 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0060;
    L_0x005f:
        r1 = 0;
    L_0x0060:
        r0.f = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqk.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):void");
    }

    public static bqk a(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new bqk(str, str2, codecCapabilities, false, z, z2);
    }

    @TargetApi(21)
    private static boolean a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    public final void a(String str) {
        StringBuilder stringBuilder = new StringBuilder("NoSupport [");
        stringBuilder.append(str);
        str = "] [";
        stringBuilder.append(str);
        stringBuilder.append(this.a);
        stringBuilder.append(ppy.d);
        stringBuilder.append(this.b);
        stringBuilder.append(str);
        stringBuilder.append(bzo.e);
        stringBuilder.append("]");
        Log.d("MediaCodecInfo", stringBuilder.toString());
    }

    @TargetApi(21)
    public final boolean a(int i, int i2, double d) {
        String str;
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (!bqk.a(videoCapabilities, i, i2, d)) {
                    String str2 = "x";
                    StringBuilder stringBuilder;
                    if (i >= i2 || !bqk.a(videoCapabilities, i2, i, d)) {
                        stringBuilder = new StringBuilder("sizeAndRate.support, ");
                        stringBuilder.append(i);
                        stringBuilder.append(str2);
                        stringBuilder.append(i2);
                        stringBuilder.append(str2);
                        stringBuilder.append(d);
                        str = stringBuilder.toString();
                    } else {
                        stringBuilder = new StringBuilder("sizeAndRate.rotated, ");
                        stringBuilder.append(i);
                        stringBuilder.append(str2);
                        stringBuilder.append(i2);
                        stringBuilder.append(str2);
                        stringBuilder.append(d);
                        str = stringBuilder.toString();
                        StringBuilder stringBuilder2 = new StringBuilder("AssumedSupport [");
                        stringBuilder2.append(str);
                        str = "] [";
                        stringBuilder2.append(str);
                        stringBuilder2.append(this.a);
                        stringBuilder2.append(ppy.d);
                        stringBuilder2.append(this.b);
                        stringBuilder2.append(str);
                        stringBuilder2.append(bzo.e);
                        stringBuilder2.append("]");
                        Log.d("MediaCodecInfo", stringBuilder2.toString());
                    }
                }
                return true;
            }
        }
        a(str);
        return false;
    }

    public final CodecProfileLevel[] a() {
        CodecCapabilities codecCapabilities = this.c;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new CodecProfileLevel[0] : this.c.profileLevels;
    }
}

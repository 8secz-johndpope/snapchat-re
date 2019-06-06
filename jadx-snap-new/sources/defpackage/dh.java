package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: dh */
public final class dh implements Interpolator {
    private float[] a;
    private float[] b;

    public dh(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private dh(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a = hi.a(resources, theme, attributeSet, db.l);
        String str = "pathData";
        if (hi.a(xmlPullParser, str)) {
            str = hi.b(a, xmlPullParser, str, 4);
            Path a2 = hk.a(str);
            if (a2 != null) {
                a(a2);
            } else {
                throw new InflateException("The path is null, which is created from ".concat(String.valueOf(str)));
            }
        }
        str = "controlX1";
        if (hi.a(xmlPullParser, str)) {
            String str2 = "controlY1";
            if (hi.a(xmlPullParser, str2)) {
                float a3 = hi.a(a, xmlPullParser, str, 0, (float) MapboxConstants.MINIMUM_ZOOM);
                float a4 = hi.a(a, xmlPullParser, str2, 1, (float) MapboxConstants.MINIMUM_ZOOM);
                str = "controlX2";
                boolean a5 = hi.a(xmlPullParser, str);
                String str3 = "controlY2";
                if (a5 == hi.a(xmlPullParser, str3)) {
                    Path path;
                    if (a5) {
                        float a6 = hi.a(a, xmlPullParser, str, 2, (float) MapboxConstants.MINIMUM_ZOOM);
                        float a7 = hi.a(a, xmlPullParser, str3, 3, (float) MapboxConstants.MINIMUM_ZOOM);
                        path = new Path();
                        path.moveTo(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
                        path.cubicTo(a3, a4, a6, a7, 1.0f, 1.0f);
                    } else {
                        path = new Path();
                        path.moveTo(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
                        path.quadTo(a3, a4, 1.0f, 1.0f);
                    }
                    a(path);
                } else {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
        a.recycle();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0100 in {4, 17, 19, 22, 24, 26, 28} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private void a(android.graphics.Path r11) {
        /*
        r10 = this;
        r0 = new android.graphics.PathMeasure;
        r1 = 0;
        r0.<init>(r11, r1);
        r11 = r0.getLength();
        r2 = 990057071; // 0x3b03126f float:0.002 double:4.89153186E-315;
        r2 = r11 / r2;
        r2 = (int) r2;
        r3 = 1;
        r2 = r2 + r3;
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r2 = java.lang.Math.min(r4, r2);
        if (r2 <= 0) goto L_0x00f0;
        r4 = new float[r2];
        r10.a = r4;
        r4 = new float[r2];
        r10.b = r4;
        r4 = 2;
        r4 = new float[r4];
        r5 = 0;
        if (r5 >= r2) goto L_0x0041;
        r6 = (float) r5;
        r6 = r6 * r11;
        r7 = r2 + -1;
        r7 = (float) r7;
        r6 = r6 / r7;
        r7 = 0;
        r0.getPosTan(r6, r4, r7);
        r6 = r10.a;
        r7 = r4[r1];
        r6[r5] = r7;
        r6 = r10.b;
        r7 = r4[r3];
        r6[r5] = r7;
        r5 = r5 + 1;
        goto L_0x0026;
        r11 = r10.a;
        r11 = r11[r1];
        r11 = java.lang.Math.abs(r11);
        r4 = (double) r11;
        r6 = 4532020583610935537; // 0x3ee4f8b588e368f1 float:-1.3686737E-33 double:1.0E-5;
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 > 0) goto L_0x00b5;
        r11 = r10.b;
        r11 = r11[r1];
        r11 = java.lang.Math.abs(r11);
        r4 = (double) r11;
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 > 0) goto L_0x00b5;
        r11 = r10.a;
        r4 = r2 + -1;
        r11 = r11[r4];
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r11 = r11 - r5;
        r11 = java.lang.Math.abs(r11);
        r8 = (double) r11;
        r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r11 > 0) goto L_0x00b5;
        r11 = r10.b;
        r11 = r11[r4];
        r11 = r11 - r5;
        r11 = java.lang.Math.abs(r11);
        r4 = (double) r11;
        r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r11 > 0) goto L_0x00b5;
        r11 = 0;
        r11 = 0;
        r3 = 0;
        if (r1 >= r2) goto L_0x00a6;
        r4 = r10.a;
        r5 = r11 + 1;
        r11 = r4[r11];
        r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1));
        if (r3 < 0) goto L_0x0096;
        r4[r1] = r11;
        r1 = r1 + 1;
        r3 = r11;
        r11 = r5;
        goto L_0x0083;
        r0 = new java.lang.IllegalArgumentException;
        r11 = java.lang.String.valueOf(r11);
        r1 = "The Path cannot loop back on itself, x :";
        r11 = r1.concat(r11);
        r0.<init>(r11);
        throw r0;
        r11 = r0.nextContour();
        if (r11 != 0) goto L_0x00ad;
        return;
        r11 = new java.lang.IllegalArgumentException;
        r0 = "The Path should be continuous, can't have 2+ contours";
        r11.<init>(r0);
        throw r11;
        r11 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r4 = "The Path must start at (0,0) and end at (1,1) start: ";
        r0.<init>(r4);
        r4 = r10.a;
        r4 = r4[r1];
        r0.append(r4);
        r4 = ",";
        r0.append(r4);
        r5 = r10.b;
        r1 = r5[r1];
        r0.append(r1);
        r1 = " end:";
        r0.append(r1);
        r1 = r10.a;
        r2 = r2 - r3;
        r1 = r1[r2];
        r0.append(r1);
        r0.append(r4);
        r1 = r10.b;
        r1 = r1[r2];
        r0.append(r1);
        r0 = r0.toString();
        r11.<init>(r0);
        throw r11;
        r0 = new java.lang.IllegalArgumentException;
        r11 = java.lang.String.valueOf(r11);
        r1 = "The Path has a invalid length ";
        r11 = r1.concat(r11);
        r0.<init>(r11);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.a(android.graphics.Path):void");
    }

    public final float getInterpolation(float f) {
        if (f <= MapboxConstants.MINIMUM_ZOOM) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == MapboxConstants.MINIMUM_ZOOM) {
            return this.b[i];
        }
        f = (f - fArr[i]) / f2;
        float[] fArr2 = this.b;
        float f3 = fArr2[i];
        return f3 + (f * (fArr2[length] - f3));
    }
}

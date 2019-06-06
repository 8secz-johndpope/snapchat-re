package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zom.a;

/* renamed from: zpa */
public final class zpa extends a {
    private static Interpolator a;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x002c  */
    public final android.animation.Animator a(android.view.ViewGroup r4, android.view.View r5, defpackage.zog r6) {
        /*
        r3 = this;
        if (r6 == 0) goto L_0x0013;
    L_0x0002:
        r6 = r6.b;
        r0 = "android:top";
        r6 = r6.get(r0);
        r6 = (java.lang.Float) r6;
        if (r6 == 0) goto L_0x0013;
    L_0x000e:
        r6 = r6.floatValue();
        goto L_0x0014;
    L_0x0013:
        r6 = 0;
    L_0x0014:
        r0 = android.view.View.TRANSLATION_Y;
        r1 = 2;
        r1 = new float[r1];
        r2 = 0;
        r1[r2] = r6;
        r6 = 1;
        r4 = r4.getHeight();
        r4 = (float) r4;
        r1[r6] = r4;
        r4 = android.animation.ObjectAnimator.ofFloat(r5, r0, r1);
        r5 = a;
        if (r5 != 0) goto L_0x0035;
    L_0x002c:
        r5 = new android.view.animation.DecelerateInterpolator;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5.<init>(r6);
        a = r5;
    L_0x0035:
        r5 = a;
        r4.setInterpolator(r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpa.a(android.view.ViewGroup, android.view.View, zog):android.animation.Animator");
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        return valueAnimator;
    }

    public final void a(zog zog) {
        super.a(zog);
        zog.b.put("android:top", Float.valueOf(zog.a.getTranslationY()));
    }
}

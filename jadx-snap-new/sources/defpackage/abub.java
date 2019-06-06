package defpackage;

import android.animation.TimeAnimator;
import android.animation.TimeAnimator.TimeListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import com.snapchat.android.framework.ui.animations.ArcView;

/* renamed from: abub */
public final class abub extends TimeAnimator implements TimeListener {
    int a = 700;
    int b = MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS;
    public float c = 280.0f;
    private final ArcView d;
    private TimeInterpolator e;
    private int f = 1;
    private float g = 240.0f;
    private long h = 0;
    private long i = -1;

    public abub(ArcView arcView) {
        this.d = arcView;
        this.e = new LinearInterpolator();
        setTimeListener(this);
    }

    private void a() {
        this.h = 0;
        this.i = -1;
    }

    public final void a(int i) {
        if (i == 3) {
            this.i = this.h + ((long) this.a);
        }
        this.f = i;
    }

    public final void cancel() {
        super.cancel();
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    public final void onTimeUpdate(android.animation.TimeAnimator r3, long r4, long r6) {
        /*
        r2 = this;
        r2.h = r4;
        r3 = r2.f;
        r4 = 1;
        r5 = 3;
        if (r3 != r4) goto L_0x0015;
    L_0x0008:
        r6 = r2.h;
        r3 = r2.a;
        r0 = (long) r3;
        r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r3 < 0) goto L_0x0015;
    L_0x0011:
        r3 = 2;
        r2.f = r3;
        goto L_0x0022;
    L_0x0015:
        r3 = r2.f;
        if (r3 != r5) goto L_0x0022;
    L_0x0019:
        r6 = r2.h;
        r0 = r2.i;
        r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r3 < 0) goto L_0x0022;
    L_0x0021:
        return;
    L_0x0022:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = r2.f;
        if (r6 != r4) goto L_0x0030;
    L_0x0028:
        r3 = r2.h;
    L_0x002a:
        r3 = (float) r3;
        r4 = r2.a;
        r4 = (float) r4;
        r3 = r3 / r4;
        goto L_0x0038;
    L_0x0030:
        if (r6 != r5) goto L_0x0038;
    L_0x0032:
        r3 = r2.i;
        r6 = r2.h;
        r3 = r3 - r6;
        goto L_0x002a;
    L_0x0038:
        r4 = r2.e;
        r3 = r4.getInterpolation(r3);
        r4 = r2.e;
        r6 = r2.h;
        r6 = (float) r6;
        r7 = r2.b;
        r7 = (float) r7;
        r6 = r6 / r7;
        r4 = r4.getInterpolation(r6);
        r6 = r2.f;
        r7 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        if (r6 != r5) goto L_0x0061;
    L_0x0051:
        r5 = r2.d;
        r3 = -r3;
        r6 = r2.g;
        r3 = r3 * r6;
        r5.d = r3;
        r3 = r2.c;
        r6 = r6 + r3;
        r4 = r4 * r7;
        r6 = r6 + r4;
        r5.c = r6;
        goto L_0x006e;
    L_0x0061:
        r5 = r2.d;
        r6 = r2.g;
        r3 = r3 * r6;
        r5.d = r3;
        r3 = r2.c;
        r4 = r4 * r7;
        r3 = r3 + r4;
        r5.c = r3;
    L_0x006e:
        r3 = r2.d;
        r3.postInvalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abub.onTimeUpdate(android.animation.TimeAnimator, long, long):void");
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    public final void start() {
        a();
        super.start();
    }
}

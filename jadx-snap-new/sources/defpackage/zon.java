package defpackage;

/* renamed from: zon */
public final class zon extends zob {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    public final android.animation.Animator a(android.view.ViewGroup r3, defpackage.zog r4, defpackage.zog r5) {
        /*
        r2 = this;
        r0 = 0;
        if (r5 == 0) goto L_0x000c;
    L_0x0003:
        r1 = r5.a;
    L_0x0005:
        r1 = (defpackage.zop) r1;
        r1 = r1.getCustomTransitionDelegate();
        goto L_0x0012;
    L_0x000c:
        if (r4 == 0) goto L_0x0011;
    L_0x000e:
        r1 = r4.a;
        goto L_0x0005;
    L_0x0011:
        r1 = r0;
    L_0x0012:
        if (r1 == 0) goto L_0x0019;
    L_0x0014:
        r3 = r1.createAnimator(r3, r4, r5);
        return r3;
    L_0x0019:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zon.a(android.view.ViewGroup, zog, zog):android.animation.Animator");
    }

    public final void a(zog zog) {
        zoo customTransitionDelegate = ((zop) zog.a).getCustomTransitionDelegate();
        if (customTransitionDelegate != null) {
            customTransitionDelegate.captureStartValues(zog);
        }
    }

    public final void b(zog zog) {
        zoo customTransitionDelegate = ((zop) zog.a).getCustomTransitionDelegate();
        if (customTransitionDelegate != null) {
            customTransitionDelegate.captureEndValues(zog);
        }
    }
}

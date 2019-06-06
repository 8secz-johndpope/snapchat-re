package defpackage;

import defpackage.aept.a;
import defpackage.aept.b;

/* renamed from: lfk */
public final /* synthetic */ class lfk {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[a.values().length];
        a = iArr;
        iArr[a.UNRECOGNIZED_VALUE.ordinal()] = 1;
        a[a.REAR.ordinal()] = 2;
        a[a.FRONT.ordinal()] = 3;
        iArr = new int[b.values().length];
        b = iArr;
        iArr[b.SRT_INTERSTITIAL.ordinal()] = 1;
        b[b.SRT_CONTEXT.ordinal()] = 2;
        b[b.UNRECOGNIZED_VALUE.ordinal()] = 3;
    }
}

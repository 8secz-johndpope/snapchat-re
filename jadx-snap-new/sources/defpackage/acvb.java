package defpackage;

import defpackage.actz.b;

/* renamed from: acvb */
public final /* synthetic */ class acvb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[b.values().length];
        a = iArr;
        iArr[b.WRONG_THREAD.ordinal()] = 1;
        a[b.NOT_SWITCHED.ordinal()] = 2;
        a[b.DEAD.ordinal()] = 3;
        a[b.READY.ordinal()] = 4;
    }
}

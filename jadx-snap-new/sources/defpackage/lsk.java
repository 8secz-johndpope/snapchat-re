package defpackage;

import defpackage.mwa.b;

/* renamed from: lsk */
public final /* synthetic */ class lsk {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[b.values().length];
        a = iArr;
        iArr[b.COMPLETED.ordinal()] = 1;
        a[b.IN_PROGRESS.ordinal()] = 2;
        a[b.PENDING.ordinal()] = 3;
    }
}

package defpackage;

import defpackage.abwb.a;
import defpackage.abwb.b;

/* renamed from: abwc */
public final /* synthetic */ class abwc {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[b.values().length];
        a = iArr;
        iArr[b.VERTICAL.ordinal()] = 1;
        a[b.HORIZONTAL.ordinal()] = 2;
        iArr = new int[b.values().length];
        b = iArr;
        iArr[b.VERTICAL.ordinal()] = 1;
        b[b.HORIZONTAL.ordinal()] = 2;
        iArr = new int[a.values().length];
        c = iArr;
        iArr[a.TOP_EDGE.ordinal()] = 1;
        c[a.RIGHT_EDGE.ordinal()] = 2;
        c[a.BOTTOM_EDGE.ordinal()] = 3;
        c[a.LEFT_EDGE.ordinal()] = 4;
    }
}

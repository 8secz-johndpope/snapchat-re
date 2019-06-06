package defpackage;

import defpackage.adgo.c;
import defpackage.adgo.d;

/* renamed from: adgr */
public final /* synthetic */ class adgr {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[c.values().length];
        a = iArr;
        iArr[c.PREVIOUS_SYNC.ordinal()] = 1;
        a[c.NEXT_SYNC.ordinal()] = 2;
        a[c.CLOSEST_SYNC.ordinal()] = 3;
        iArr = new int[d.values().length];
        b = iArr;
        iArr[d.VIDEO.ordinal()] = 1;
        b[d.AUDIO.ordinal()] = 2;
    }
}

package defpackage;

/* renamed from: qya */
public final /* synthetic */ class qya {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[qxu.values().length];
        a = iArr;
        iArr[qxu.LEGACY.ordinal()] = 1;
        a[qxu.LEGACY_LOQ.ordinal()] = 2;
        a[qxu.ARROYO_FEED_FIRST.ordinal()] = 3;
        a[qxu.ARROYO_FEED_PAGINATION.ordinal()] = 4;
        a[qxu.ARROYO_FEED_FIRST_COLD.ordinal()] = 5;
        a[qxu.ARROYO_FEED_FIRST_LOGIN.ordinal()] = 6;
        a[qxu.NONE.ordinal()] = 7;
        iArr = new int[qxt.values().length];
        b = iArr;
        iArr[qxt.PAGINATION.ordinal()] = 1;
        b[qxt.GROUP_ONLY_SYNC.ordinal()] = 2;
        iArr = new int[qxt.values().length];
        c = iArr;
        iArr[qxt.COLD_START.ordinal()] = 1;
        c[qxt.WARM_START.ordinal()] = 2;
    }
}

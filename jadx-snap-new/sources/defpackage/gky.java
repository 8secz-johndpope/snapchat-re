package defpackage;

import defpackage.ryz.c;

/* renamed from: gky */
public final /* synthetic */ class gky {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[c.values().length];
        a = iArr;
        iArr[c.METADATA.ordinal()] = 1;
        a[c.SMALL_MEDIA.ordinal()] = 2;
        a[c.LARGE_MEDIA.ordinal()] = 3;
        a[c.UPLOAD.ordinal()] = 4;
        a[c.STREAMING.ordinal()] = 5;
        iArr = new int[iex.values().length];
        b = iArr;
        iArr[iex.WWAN.ordinal()] = 1;
        b[iex.WIFI.ordinal()] = 2;
        b[iex.NOT_REACHABLE.ordinal()] = 3;
        b[iex.UNRECOGNIZED_VALUE.ordinal()] = 4;
        iArr = new int[gdj.values().length];
        c = iArr;
        iArr[gdj.FOREGROUND.ordinal()] = 1;
        iArr = new int[saf.a().length];
        d = iArr;
        iArr[0] = 1;
        d[1] = 2;
        iArr = new int[rzc.values().length];
        e = iArr;
        iArr[rzc.UserVisible.ordinal()] = 1;
        e[rzc.UserInitiated.ordinal()] = 2;
        e[rzc.Streaming.ordinal()] = 3;
        e[rzc.Prefetch.ordinal()] = 4;
        e[rzc.ForegroundPrefetch.ordinal()] = 5;
        e[rzc.BackgroundPrefetch.ordinal()] = 6;
    }
}

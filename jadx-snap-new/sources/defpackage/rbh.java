package defpackage;

/* renamed from: rbh */
public final /* synthetic */ class rbh {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    private static /* synthetic */ int[] f;

    static {
        int[] iArr = new int[rbg.values().length];
        a = iArr;
        iArr[rbg.CALL_INCOMING.ordinal()] = 1;
        a[rbg.CALL_UPDATE.ordinal()] = 2;
        iArr = new int[rbg.values().length];
        b = iArr;
        iArr[rbg.TYPING_ENTER.ordinal()] = 1;
        b[rbg.TYPING_IN_PROGRESS.ordinal()] = 2;
        b[rbg.TYPING_PAUSE.ordinal()] = 3;
        iArr = new int[rbg.values().length];
        c = iArr;
        iArr[rbg.COGNAC_ACTIVE.ordinal()] = 1;
        iArr = new int[rbg.values().length];
        d = iArr;
        iArr[rbg.TYPING_ENTER.ordinal()] = 1;
        d[rbg.TYPING_IN_PROGRESS.ordinal()] = 2;
        d[rbg.TYPING_PAUSE.ordinal()] = 3;
        d[rbg.TYPING_CANCEL.ordinal()] = 4;
        d[rbg.TYPING_RECEIVE.ordinal()] = 5;
        iArr = new int[rbg.values().length];
        f = iArr;
        iArr[rbg.TYPING_CANCEL.ordinal()] = 1;
        f[rbg.TYPING_RECEIVE.ordinal()] = 2;
        f[rbg.CALL_END.ordinal()] = 3;
        f[rbg.COGNAC_END.ordinal()] = 4;
        iArr = new int[rbg.values().length];
        e = iArr;
        iArr[rbg.TYPING_RECEIVE.ordinal()] = 1;
        e[rbg.CALL_END.ordinal()] = 2;
    }
}

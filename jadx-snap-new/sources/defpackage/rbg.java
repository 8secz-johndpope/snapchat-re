package defpackage;

/* renamed from: rbg */
public enum rbg {
    CALL_INCOMING,
    CALL_UPDATE,
    CALL_END,
    TYPING_ENTER,
    TYPING_IN_PROGRESS,
    TYPING_PAUSE,
    TYPING_RECEIVE,
    TYPING_CANCEL,
    COGNAC_ACTIVE,
    COGNAC_END,
    NONE;

    public final boolean a() {
        int i = rbh.a[ordinal()];
        return i == 1 || i == 2;
    }

    public final boolean b() {
        int i = rbh.b[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public final boolean c() {
        return rbh.c[ordinal()] == 1;
    }
}

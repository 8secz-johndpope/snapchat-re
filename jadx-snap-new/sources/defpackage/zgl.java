package defpackage;

/* renamed from: zgl */
public final class zgl implements ajej {
    private final ajej a;
    private final String b;

    public zgl(ajej ajej, String str) {
        this.a = ajej;
        this.b = str;
    }

    public final void dispose() {
        this.a.dispose();
    }

    public final boolean isDisposed() {
        return this.a.isDisposed();
    }
}

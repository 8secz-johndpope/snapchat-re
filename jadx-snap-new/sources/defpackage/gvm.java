package defpackage;

/* renamed from: gvm */
public final class gvm implements ajej {
    public final boolean a;
    private final ajej b;

    public gvm(ajej ajej, boolean z) {
        akcr.b(ajej, "disposable");
        this.b = ajej;
        this.a = z;
    }

    public final void dispose() {
        this.b.dispose();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }
}

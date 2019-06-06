package defpackage;

/* renamed from: ajfq */
public enum ajfq implements ajga<Object> {
    INSTANCE,
    NEVER;

    public static void a(ajcz ajcz) {
        ajcz.a(INSTANCE);
        ajcz.a();
    }

    public static void a(ajdv<?> ajdv) {
        ajdv.a(INSTANCE);
        ajdv.a();
    }

    public static void a(Throwable th, ajcz ajcz) {
        ajcz.a(INSTANCE);
        ajcz.a(th);
    }

    public static void a(Throwable th, ajdl<?> ajdl) {
        ajdl.a(INSTANCE);
        ajdl.a(th);
    }

    public static void a(Throwable th, ajdv<?> ajdv) {
        ajdv.a(INSTANCE);
        ajdv.a(th);
    }

    public static void a(Throwable th, ajdz<?> ajdz) {
        ajdz.a(INSTANCE);
        ajdz.a(th);
    }

    public final int a(int i) {
        return i & 2;
    }

    public final void clear() {
    }

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        return null;
    }
}

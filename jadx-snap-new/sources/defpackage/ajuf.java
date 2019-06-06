package defpackage;

/* renamed from: ajuf */
public enum ajuf implements ajgc<Object> {
    ;

    private ajuf(String str) {
    }

    public static void a(akux<?> akux) {
        akux.a(INSTANCE);
        akux.a();
    }

    public static void a(Throwable th, akux<?> akux) {
        akux.a(INSTANCE);
        akux.a(th);
    }

    public final int a(int i) {
        return i & 2;
    }

    public final void a(long j) {
        ajui.b(j);
    }

    public final void b() {
    }

    public final void clear() {
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

    public final String toString() {
        return "EmptySubscription";
    }
}

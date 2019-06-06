package defpackage;

/* renamed from: ajgl */
public final class ajgl<T> extends ajgk<T> {
    public final void a(T t) {
        if (this.a == null) {
            this.a = t;
            this.c.dispose();
            countDown();
        }
    }

    public final void a(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}

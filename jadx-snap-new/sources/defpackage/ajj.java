package defpackage;

import android.os.Looper;

/* renamed from: ajj */
final class ajj<Z> implements ajn<Z> {
    final boolean a;
    a b;
    aio c;
    private final ajn<Z> d;
    private int e;
    private boolean f;

    /* renamed from: ajj$a */
    interface a {
        void b(aio aio, ajj<?> ajj);
    }

    ajj(ajn<Z> ajn, boolean z) {
        if (ajn != null) {
            this.d = ajn;
            this.a = z;
            return;
        }
        throw new NullPointerException("Wrapped resource must not be null");
    }

    public final Z a() {
        return this.d.a();
    }

    public final int b() {
        return this.d.b();
    }

    public final void c() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f = true;
            this.d.c();
        }
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        if (this.e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                this.b.b(this.c, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }
}

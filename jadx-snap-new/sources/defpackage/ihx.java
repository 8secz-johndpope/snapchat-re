package defpackage;

import com.google.common.base.Supplier;

/* renamed from: ihx */
public final class ihx<T> implements Supplier<T> {
    private volatile T a;
    private volatile a<T> b;

    /* renamed from: ihx$a */
    public interface a<T> {
        T initialize();
    }

    public ihx(a<T> aVar) {
        this.b = aVar;
    }

    public final boolean a() {
        return this.b == null;
    }

    public final T get() {
        T t = this.a;
        if (this.b != null) {
            synchronized (this) {
                if (this.b != null) {
                    t = this.b.initialize();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}

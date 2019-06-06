package defpackage;

import com.google.common.base.Supplier;

/* renamed from: abpo */
public abstract class abpo<T> implements Supplier<T> {
    private volatile transient T a = null;

    public static <T> abpo<T> a(final Supplier<T> supplier) {
        return new abpo<T>() {
            /* Access modifiers changed, original: protected|final */
            public final T a() {
                return supplier.get();
            }
        };
    }

    public abstract T a();

    public final boolean b() {
        return this.a != null;
    }

    public T get() {
        T t = this.a;
        if (t == null) {
            synchronized (this) {
                t = this.a;
                if (t == null) {
                    t = a();
                    this.a = t;
                }
            }
        }
        return t;
    }
}

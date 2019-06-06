package defpackage;

/* renamed from: ajgp */
public class ajgp<T> extends ajgh<T> {
    protected final ajdv<? super T> a;
    private T b;

    public ajgp(ajdv<? super T> ajdv) {
        this.a = ajdv;
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void b() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.a.a();
        }
    }

    public final void b(T t) {
        int i = get();
        if ((i & 54) == 0) {
            Object t2;
            ajdv ajdv = this.a;
            if (i == 8) {
                this.b = t2;
                lazySet(16);
                t2 = null;
            } else {
                lazySet(2);
            }
            ajdv.a(t2);
            if (get() != 4) {
                ajdv.a();
            }
        }
    }

    public final void b(Throwable th) {
        if ((get() & 54) != 0) {
            ajvo.a(th);
            return;
        }
        lazySet(2);
        this.a.a(th);
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public void dispose() {
        set(4);
        this.b = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.b;
        this.b = null;
        lazySet(32);
        return obj;
    }
}

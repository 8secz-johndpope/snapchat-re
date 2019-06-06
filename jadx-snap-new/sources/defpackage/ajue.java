package defpackage;

/* renamed from: ajue */
public class ajue<T> extends ajuc<T> {
    protected final akux<? super T> a;
    protected T b;

    public ajue(akux<? super T> akux) {
        this.a = akux;
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void a(long j) {
        if (ajui.b(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            Object obj = this.b;
                            if (obj != null) {
                                this.b = null;
                                akux akux = this.a;
                                akux.a(obj);
                                if (get() != 4) {
                                    akux.a();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public void b() {
        set(4);
        this.b = null;
    }

    public final void b(T t) {
        akux akux;
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    akux = this.a;
                    akux.a((Object) t);
                    if (get() != 4) {
                        akux.a();
                    }
                    return;
                }
                this.b = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.b = null;
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.b = t;
        lazySet(16);
        akux = this.a;
        akux.a((Object) t);
        if (get() != 4) {
            akux.a();
        }
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}

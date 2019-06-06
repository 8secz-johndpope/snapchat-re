package defpackage;

/* renamed from: abxn */
public final class abxn<T> implements abxq<T> {
    public T a;
    public T b;
    private final akbw<T, T, T> c;

    public abxn(T t, akbw<? super T, ? super T, ? extends T> akbw) {
        akcr.b(akbw, "interpolator");
        this.c = akbw;
        this.a = t;
        this.b = t;
    }

    public final T a() {
        return this.c.invoke(this.a, this.b);
    }
}

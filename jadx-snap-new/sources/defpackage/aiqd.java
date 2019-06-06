package defpackage;

/* renamed from: aiqd */
public final class aiqd<T> implements aipn<T>, aiqc<T> {
    private final T a;

    static {
        aiqd aiqd = new aiqd(null);
    }

    private aiqd(T t) {
        this.a = t;
    }

    public static <T> aiqc<T> a(T t) {
        return new aiqd(aiqf.a(t, "instance cannot be null"));
    }

    public final T get() {
        return this.a;
    }
}

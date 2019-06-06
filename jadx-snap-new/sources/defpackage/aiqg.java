package defpackage;

/* renamed from: aiqg */
public final class aiqg<T> implements ajwy<T> {
    private static final Object a = new Object();
    private static /* synthetic */ boolean d = (aiqg.class.desiredAssertionStatus() ^ 1);
    private volatile ajwy<T> b;
    private volatile Object c = a;

    private aiqg(ajwy<T> ajwy) {
        if (d || ajwy != null) {
            this.b = ajwy;
            return;
        }
        throw new AssertionError();
    }

    public static <P extends ajwy<T>, T> ajwy<T> a(P p) {
        return ((p instanceof aiqg) || (p instanceof aiqb)) ? p : new aiqg((ajwy) aiqf.a(p));
    }

    public final T get() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        ajwy ajwy = this.b;
        if (ajwy == null) {
            return this.c;
        }
        obj = ajwy.get();
        this.c = obj;
        this.b = null;
        return obj;
    }
}

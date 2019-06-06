package defpackage;

/* renamed from: am */
public abstract class am<T> extends at {
    public am(ap apVar) {
        super(apVar);
    }

    public abstract void a(ae aeVar, T t);

    public final void a(T t) {
        ae b = b();
        try {
            a(b, t);
            b.executeInsert();
        } finally {
            a(b);
        }
    }
}

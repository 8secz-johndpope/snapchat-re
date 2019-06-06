package defpackage;

/* renamed from: aipq */
public interface aipq<T> {

    /* renamed from: aipq$a */
    public static abstract class a<T> implements b<T> {
        public abstract aipq<T> a();

        public abstract void a(T t);

        public final aipq<T> b(T t) {
            a(t);
            return a();
        }
    }

    /* renamed from: aipq$b */
    public interface b<T> {
        aipq<T> b(T t);
    }

    void a(T t);
}

package defpackage;

import com.google.protobuf.nano.MessageNano;

/* renamed from: evg */
public interface evg {

    /* renamed from: evg$a */
    public static abstract class a<T> implements Comparable<Object> {

        /* renamed from: evg$a$a */
        public static abstract class a<T> {
            public acce a;

            public final acce a() {
                acce acce = this.a;
                if (acce == null) {
                    akcr.a("signals");
                }
                return acce;
            }

            public abstract a<T> b();
        }

        public abstract boolean a();

        public abstract boolean a(Object obj);

        public abstract int b(Object obj);

        public int compareTo(Object obj) {
            akcr.b(obj, "other");
            if (a(obj)) {
                return b(obj);
            }
            throw new IllegalArgumentException("Other can not be compared to");
        }
    }

    ajcx a();

    ajdx<Boolean> a(fth fth, acce acce);

    <T extends MessageNano> ajdx<T> a(fth fth, acce acce, T t);

    boolean a(fth fth);

    void b();

    boolean b(fth fth, acce acce);

    float c(fth fth, acce acce);

    void c();

    double d(fth fth, acce acce);

    int e(fth fth, acce acce);

    long f(fth fth, acce acce);

    String g(fth fth, acce acce);

    byte[] h(fth fth, acce acce);
}

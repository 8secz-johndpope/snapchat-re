package defpackage;

import java.security.MessageDigest;

/* renamed from: ze */
public final class ze<T> {
    public static final a<Object> a = new 1();
    final T b;
    final a<T> c;
    final String d;
    volatile byte[] e;

    /* renamed from: ze$a */
    public interface a<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    /* renamed from: ze$1 */
    class 1 implements a<Object> {
        1() {
        }

        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public ze(String str, T t, a<T> aVar) {
        this.d = ahl.a(str);
        this.b = t;
        this.c = (a) ahl.a((Object) aVar, "Argument must not be null");
    }

    public static <T> ze<T> a(String str, T t) {
        return new ze(str, t, a);
    }

    public static <T> ze<T> a(String str, T t, a<T> aVar) {
        return new ze(str, t, aVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ze)) {
            return false;
        }
        return this.d.equals(((ze) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Option{key='");
        stringBuilder.append(this.d);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

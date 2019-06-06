package defpackage;

import java.io.Serializable;

/* renamed from: aknd */
public abstract class aknd<L, M, R> implements Serializable, Comparable<aknd<L, M, R>> {
    public static <L, M, R> aknd<L, M, R> a(L l, M m, R r) {
        return new aknb(l, m, r);
    }

    public abstract L a();

    public abstract M b();

    public abstract R c();

    public /* synthetic */ int compareTo(Object obj) {
        aknd aknd = (aknd) obj;
        return new akmb().a(a(), aknd.a(), null).a(b(), aknd.b(), null).a(c(), aknd.c(), null).a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aknd) {
            aknd aknd = (aknd) obj;
            return aklu.a(a(), aknd.a()) && aklu.a(b(), aknd.b()) && aklu.a(c(), aknd.c());
        }
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (a() == null ? 0 : a().hashCode()) ^ (b() == null ? 0 : b().hashCode());
        if (c() != null) {
            i = c().hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(a());
        stringBuilder.append(',');
        stringBuilder.append(b());
        stringBuilder.append(',');
        stringBuilder.append(c());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

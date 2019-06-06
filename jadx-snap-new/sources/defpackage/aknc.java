package defpackage;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: aknc */
public abstract class aknc<L, R> implements Serializable, Comparable<aknc<L, R>>, Entry<L, R> {
    public static <L, R> aknc<L, R> a(L l, R r) {
        return new akna(l, r);
    }

    public abstract L a();

    public abstract R b();

    public /* synthetic */ int compareTo(Object obj) {
        aknc aknc = (aknc) obj;
        return new akmb().a(a(), aknc.a(), null).a(b(), aknc.b(), null).a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            return aklu.a(getKey(), entry.getKey()) && aklu.a(getValue(), entry.getValue());
        }
    }

    public final L getKey() {
        return a();
    }

    public R getValue() {
        return b();
    }

    public int hashCode() {
        int i = 0;
        int hashCode = getKey() == null ? 0 : getKey().hashCode();
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(a());
        stringBuilder.append(',');
        stringBuilder.append(b());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

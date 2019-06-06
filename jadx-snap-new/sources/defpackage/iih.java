package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: iih */
public final class iih<T> extends WeakReference<T> {
    public iih(T t) {
        super(t);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iih)) {
            return false;
        }
        Object obj2 = get();
        return obj2 == null ? false : obj2.equals(((iih) obj).get());
    }

    public final int hashCode() {
        Object obj = get();
        return obj != null ? obj.hashCode() : 0;
    }
}

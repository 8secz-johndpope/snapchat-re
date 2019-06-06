package defpackage;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

/* renamed from: abpj */
public abstract class abpj<T> implements abpl<T> {
    protected volatile Set<T> a;

    protected abpj() {
        a();
    }

    public abstract void a();

    public abstract boolean a(T t);

    public abstract boolean a(Collection<? extends T> collection);

    public final int b() {
        return this.a.size();
    }

    public abstract boolean b(T t);

    public final boolean b(Collection<? extends T> collection) {
        Preconditions.checkNotNull(collection);
        return a((Collection) collection);
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final boolean c(T t) {
        Preconditions.checkNotNull(t);
        return a((Object) t);
    }

    public final void d() {
        a();
    }

    public final synchronized boolean d(T t) {
        if (t != null) {
            if (this.a.contains(t)) {
                return b((Object) t);
            }
        }
        return false;
    }

    public final boolean e(T t) {
        return this.a.contains(t);
    }
}

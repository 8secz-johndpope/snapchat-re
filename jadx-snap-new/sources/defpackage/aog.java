package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aog */
public final class aog {
    private static final apr a = new apr();
    private final Map<apr, aof<?, ?>> b = new HashMap();

    public final <T, Z> aof<T, Z> a(Class<T> cls, Class<Z> cls2) {
        aof aof;
        synchronized (a) {
            a.a(cls, cls2);
            aof = (aof) this.b.get(a);
        }
        return aof == null ? aoh.a : aof;
    }

    public final <T, Z> void a(Class<T> cls, Class<Z> cls2, aof<T, Z> aof) {
        this.b.put(new apr(cls, cls2), aof);
    }
}

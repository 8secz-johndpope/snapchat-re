package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ann */
public final class ann {
    private static final apr a = new apr();
    private final Map<apr, anm<?, ?>> b = new HashMap();

    public final <Z, R> anm<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls.equals(cls2)) {
            return ano.a;
        }
        anm anm;
        synchronized (a) {
            a.a(cls, cls2);
            anm = (anm) this.b.get(a);
        }
        if (anm != null) {
            return anm;
        }
        StringBuilder stringBuilder = new StringBuilder("No transcoder registered for ");
        stringBuilder.append(cls);
        stringBuilder.append(" and ");
        stringBuilder.append(cls2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final <Z, R> void a(Class<Z> cls, Class<R> cls2, anm<Z, R> anm) {
        this.b.put(new apr(cls, cls2), anm);
    }
}

package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agb */
public final class agb {
    public final iv<ahk, List<Class<?>>> a = new iv();
    private final AtomicReference<ahk> b = new AtomicReference();

    public final List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List list;
        Object obj = (ahk) this.b.getAndSet(null);
        if (obj == null) {
            obj = new ahk(cls, cls2, cls3);
        } else {
            obj.a(cls, cls2, cls3);
        }
        synchronized (this.a) {
            list = (List) this.a.get(obj);
        }
        this.b.set(obj);
        return list;
    }
}

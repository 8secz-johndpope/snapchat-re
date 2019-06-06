package defpackage;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aga */
public final class aga {
    public static final aav<?, ?, ?> a = new aav(Object.class, Object.class, Object.class, Collections.singletonList(new aak(Object.class, Object.class, Object.class, Collections.emptyList(), new afc(), null)), null);
    public final iv<ahk, aav<?, ?, ?>> b = new iv();
    private final AtomicReference<ahk> c = new AtomicReference();

    public final <Data, TResource, Transcode> aav<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        aav aav;
        ahk ahk = (ahk) this.c.getAndSet(null);
        if (ahk == null) {
            ahk = new ahk();
        }
        ahk.a(cls, cls2, cls3);
        synchronized (this.b) {
            aav = (aav) this.b.get(ahk);
        }
        this.c.set(ahk);
        return aav;
    }
}

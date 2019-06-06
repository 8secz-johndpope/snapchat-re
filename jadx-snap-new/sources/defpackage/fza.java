package defpackage;

import java.util.Map;

/* renamed from: fza */
public final class fza implements aiqc<hwo> {
    private final ajwy<Map<Class<? extends hwg<?>>, ajdx<hwm<?, ?>>>> a;

    public static hwo a(Map<Class<? extends hwg<?>>, ajdx<hwm<?, ?>>> map) {
        return (hwo) aiqf.a(new hwo(map), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fza.a((Map) this.a.get());
    }
}

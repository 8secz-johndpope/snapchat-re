package defpackage;

import com.google.gson.TypeAdapterFactory;
import java.util.Map;
import java.util.Set;

/* renamed from: idy */
public final class idy implements aiqc<iha> {
    private final ajwy<abss> a;
    private final ajwy<Map<Class<?>, igz<?>>> b;
    private final ajwy<Set<TypeAdapterFactory>> c;

    public static iha a(abss abss, Map<Class<?>, igz<?>> map, Set<TypeAdapterFactory> set) {
        return (iha) aiqf.a(idr.a(abss, map, set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return idy.a((abss) this.a.get(), (Map) this.b.get(), (Set) this.c.get());
    }
}

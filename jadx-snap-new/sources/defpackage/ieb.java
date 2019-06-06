package defpackage;

import com.google.common.collect.ImmutableSet;
import com.google.gson.TypeAdapterFactory;
import java.util.Set;

/* renamed from: ieb */
public final class ieb implements aiqc<Set<TypeAdapterFactory>> {
    static {
        ieb ieb = new ieb();
    }

    public static Set<TypeAdapterFactory> a() {
        return (Set) aiqf.a(ImmutableSet.of(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ieb.a();
    }
}

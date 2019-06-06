package defpackage;

import com.google.common.collect.ImmutableSet;
import com.google.gson.TypeAdapterFactory;
import defpackage.qzh.d;
import java.util.Set;

/* renamed from: qyt */
public final class qyt implements aiqc<Set<TypeAdapterFactory>> {
    static {
        qyt qyt = new qyt();
    }

    public static Set<TypeAdapterFactory> a() {
        Object of = ImmutableSet.of(new d());
        akcr.a(of, "ImmutableSet.of(ServerPr…del.JsonAdapterFactory())");
        return (Set) aiqf.a((Set) of, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return qyt.a();
    }
}

package defpackage;

import android.os.Build.VERSION;
import java.util.Collections;
import java.util.Set;

/* renamed from: czv */
public final class czv implements aiqc<Set<dat<? extends das<?>>>> {
    private final ajwy<daw> a;

    public static Set<dat<? extends das<?>>> a(ajwy<daw> ajwy) {
        return (Set) aiqf.a(VERSION.SDK_INT >= 21 ? Collections.singleton(ajwy.get()) : Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return czv.a(this.a);
    }
}

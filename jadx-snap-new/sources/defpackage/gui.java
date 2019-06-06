package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import java.util.Collections;
import java.util.Set;

/* renamed from: gui */
public final class gui implements aiqc<Set<AllUpdatesProcessor>> {
    static {
        gui gui = new gui();
    }

    public static Set<AllUpdatesProcessor> a() {
        return (Set) aiqf.a(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gui.a();
    }
}

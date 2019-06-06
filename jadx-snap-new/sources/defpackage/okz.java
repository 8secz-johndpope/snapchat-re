package defpackage;

import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: okz */
public final class okz implements aiqc<Set<ygh>> {
    private final ajwy<oyk> a;
    private final ajwy<oyl> b;

    public static Set<ygh> a(oyk oyk, oyl oyl) {
        akcr.b(oyk, "memoriesMediaFileGroup");
        akcr.b(oyl, "memoriesThumbnailsFileGroup");
        Object newHashSet = Sets.newHashSet(oyk, oyl);
        akcr.a(newHashSet, "Sets.newHashSet(memories…oriesThumbnailsFileGroup)");
        return (Set) aiqf.a((Set) newHashSet, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return okz.a((oyk) this.a.get(), (oyl) this.b.get());
    }
}

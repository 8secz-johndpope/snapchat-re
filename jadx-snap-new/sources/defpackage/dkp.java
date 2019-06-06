package defpackage;

import com.google.common.base.Splitter;
import com.google.common.collect.Sets;
import java.util.Set;

/* renamed from: dkp */
public final class dkp implements aiqc<Set<String>> {
    private final ajwy<ftl> a;

    public static Set<String> a(ftl ftl) {
        return (Set) aiqf.a(Sets.newHashSet(Splitter.on(ppy.b).trimResults().split(ftl.j(djg.VIEWER_EVENT_BLACKLIST))), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dkp.a((ftl) this.a.get());
    }
}

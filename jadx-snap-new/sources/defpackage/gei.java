package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: gei */
public final class gei {
    public static final boolean a(geg geg) {
        akcr.b(geg, "receiver$0");
        return rzh.a((Collection) geg.g());
    }

    public static final boolean a(Set<? extends gdy> set) {
        return set != null ? set.contains(gdy.READ_CACHE_ONLY) || set.contains(gdy.CHECK_CACHE_ONLY) : false;
    }

    public static final String b(geg geg) {
        akcr.b(geg, "receiver$0");
        geo f = geg.f();
        if (f != null) {
            return ((gfp) f).m.getName();
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.core.net.content.api.RegistrableContentType");
    }

    public static final boolean c(geg geg) {
        akcr.b(geg, "receiver$0");
        return gei.a(geg.h());
    }
}

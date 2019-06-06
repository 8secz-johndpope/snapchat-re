package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.snap.security.snaptoken.SnapTokenHttpInterface;
import java.util.List;
import java.util.Set;

/* renamed from: whq */
public abstract class whq {
    static SnapTokenHttpInterface a(gcy gcy) {
        return (SnapTokenHttpInterface) gcy.b(SnapTokenHttpInterface.class);
    }

    static Set<List<akhn>> a(aipn<iha> aipn, ajwy<wiw> ajwy) {
        return ImmutableSet.of(ImmutableList.of(new wig(aipn, ajwy)));
    }

    static Set<glu> a(wiw wiw, ajei ajei) {
        akcr.b(wiw, "snapTokenProvider");
        akcr.b(ajei, "clearOnLogout");
        return ImmutableSet.of(new wji(wiw, ajei));
    }
}

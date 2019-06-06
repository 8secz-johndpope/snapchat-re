package defpackage;

import defpackage.rzo.a;
import java.util.List;

/* renamed from: gld */
public final class gld implements a<ryz, glv, glq> {
    public final /* synthetic */ ryv a(Object obj, Object obj2) {
        List list = (List) ((glv) obj).a.get(rzf.a.STREAMING);
        return !list.isEmpty() ? new rzq((rzf) list.get(0)) : null;
    }
}

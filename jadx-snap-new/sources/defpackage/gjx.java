package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gjx */
final class gjx<T> implements akwk<akhw, T> {
    private final String a = "InterceptingGsonResponseBodyConverter";
    private final akwk<akhw, T> b;
    private final List<gjy> c;
    private final Executor d;

    gjx(akwk<akhw, T> akwk, List<gjy> list, Executor executor) {
        this.b = akwk;
        this.c = new ArrayList(list);
        this.d = executor;
    }

    private T a(akhw akhw) {
        Object a = this.b.a(akhw);
        if (a != null) {
            this.d.execute(new -$$Lambda$gjx$wQToF6eEDGIjFI_A-EL-B3SmOgM(this, a));
        }
        return a;
    }

    private /* synthetic */ void b(Object obj) {
        for (gjy intercept : this.c) {
            try {
                intercept.intercept(obj);
            } catch (Exception unused) {
            }
        }
    }
}

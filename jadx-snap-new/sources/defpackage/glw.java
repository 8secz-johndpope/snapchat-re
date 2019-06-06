package defpackage;

import defpackage.rzf.a;
import java.util.List;
import java.util.Map;

/* renamed from: glw */
public final class glw extends glf<glv> {
    private final ryo b;

    public glw(ryo ryo) {
        super("PendingStateTransformer");
        this.b = ryo;
    }

    /* Access modifiers changed, original: final */
    public final Map<a, List<rzf<ryz>>> a() {
        return this.b.a();
    }

    public final void a(rzf<ryz> rzf) {
        this.b.a(rzf);
    }

    public final /* synthetic */ Object b() {
        return new glv(a());
    }

    public final boolean b(rzf<ryz> rzf) {
        return this.b.b(rzf);
    }
}

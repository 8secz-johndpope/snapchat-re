package defpackage;

import java.util.List;

/* renamed from: ebo */
public final class ebo {
    public final ajdx<List<abyi>> a;
    public final ebp b;
    public final gtt c;
    public final boolean d;

    /* renamed from: ebo$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (abyi) ajyu.f(list);
        }
    }

    public /* synthetic */ ebo(ajdx ajdx, ebp ebp) {
        this(ajdx, ebp, null, true);
    }

    public ebo(ajdx<List<abyi>> ajdx, ebp ebp, gtt gtt, boolean z) {
        akcr.b(ajdx, "mediaPackages");
        akcr.b(ebp, "mediaTypeConfig");
        this.a = ajdx;
        this.b = ebp;
        this.c = gtt;
        this.d = z;
    }

    public final ajdx<abyi> a() {
        Object f = this.a.f(a.a);
        akcr.a(f, "mediaPackages.map { it.first() }");
        return f;
    }
}

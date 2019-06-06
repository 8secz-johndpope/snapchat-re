package defpackage;

import defpackage.lyx.b;

/* renamed from: lyk */
public final class lyk implements ajdu<b, b> {
    private final ajdp<Boolean> a;
    private final ajdp<lqf> b;
    private final zfw c;

    /* renamed from: lyk$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldHide");
            return bool.booleanValue() ? defpackage.lyx.b.a.a : new b.b();
        }
    }

    /* renamed from: lyk$b */
    static final class b<T1, T2> implements ajey<defpackage.lyx.b, defpackage.lyx.b> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            defpackage.lyx.b bVar = (defpackage.lyx.b) obj;
            defpackage.lyx.b bVar2 = (defpackage.lyx.b) obj2;
            akcr.b(bVar, "old");
            akcr.b(bVar2, "new");
            return akcr.a(akde.a(bVar.getClass()), akde.a(bVar2.getClass()));
        }
    }

    public lyk(ajdp<Boolean> ajdp, ajdp<lqf> ajdp2, zfw zfw) {
        akcr.b(ajdp, "hideWhen");
        akcr.b(ajdp2, "cameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ajdp2;
        this.c = zfw;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object a = ajdp.b((ajdt) ajdp, (ajdt) ajdp.b((ajdt) this.a, (ajdt) lqg.a(this.b, this.c)).p(a.a)).a((ajey) b.a);
        akcr.a(a, "Observable.merge(upstrea…ld::class == new::class }");
        return (ajdt) a;
    }
}

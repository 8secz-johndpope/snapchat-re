package defpackage;

import defpackage.lum.b;

/* renamed from: lue */
public final class lue implements ajdu<b, b> {
    private final ajdp<Boolean> a;
    private final ajdp<lqf> b;
    private final zfw c;

    /* renamed from: lue$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            Object obj = (Boolean) t2;
            b bVar = (b) t1;
            akcr.a(obj, "shouldHide");
            return obj.booleanValue() ? b.b.a : bVar;
        }
    }

    /* renamed from: lue$b */
    static final class b<T1, T2> implements ajey<defpackage.lum.b, defpackage.lum.b> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            defpackage.lum.b bVar = (defpackage.lum.b) obj;
            defpackage.lum.b bVar2 = (defpackage.lum.b) obj2;
            akcr.b(bVar, "old");
            akcr.b(bVar2, "new");
            return akcr.a(akde.a(bVar.getClass()), akde.a(bVar2.getClass()));
        }
    }

    public lue(ajdp<Boolean> ajdp, ajdp<lqf> ajdp2, zfw zfw) {
        akcr.b(ajdp, "hideWhen");
        akcr.b(ajdp2, "cameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ajdp2;
        this.c = zfw;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object h = ajdp.b((ajdt) this.a, (ajdt) lqg.a(this.b, this.c)).h(Boolean.TRUE);
        akcr.a(h, "shouldHideEvents");
        ajdp = ajdp.a((ajdt) ajdp, (ajdt) h, (ajex) new a());
        if (ajdp == null) {
            akcr.a();
        }
        Object a = ajdp.a((ajey) b.a);
        akcr.a(a, "Observables.combineLates…ld::class == new::class }");
        return (ajdt) a;
    }
}

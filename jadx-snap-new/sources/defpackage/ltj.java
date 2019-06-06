package defpackage;

import defpackage.ltr.b;

/* renamed from: ltj */
public final class ltj implements ajdu<b, b> {
    private final ajdp<Boolean> a;
    private final ajdp<lqf> b;
    private final zfw c;

    /* renamed from: ltj$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            Object obj = (Boolean) t2;
            b bVar = (b) t1;
            akcr.a(obj, "shouldHide");
            return obj.booleanValue() ? defpackage.ltr.b.a.a : bVar;
        }
    }

    /* renamed from: ltj$b */
    static final class b<T1, T2> implements ajey<defpackage.ltr.b, defpackage.ltr.b> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            defpackage.ltr.b bVar = (defpackage.ltr.b) obj;
            defpackage.ltr.b bVar2 = (defpackage.ltr.b) obj2;
            akcr.b(bVar, "old");
            akcr.b(bVar2, "new");
            return akcr.a(akde.a(bVar.getClass()), akde.a(bVar2.getClass()));
        }
    }

    public ltj(ajdp<Boolean> ajdp, ajdp<lqf> ajdp2, zfw zfw) {
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

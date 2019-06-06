package defpackage;

import defpackage.lzq.b;
import defpackage.lzq.b.a;

/* renamed from: lzg */
public final class lzg implements ajdu<b, b> {
    private final akbw<b, b, b> a = d.a;
    private final ajdp<lqf> b;
    private final ajdp<Boolean> c;
    private final zfw d;

    /* renamed from: lzg$d */
    static final class d extends akcs implements akbw<b, b, b> {
        public static final d a = new d();

        d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            obj = (b) obj;
            obj2 = (b) obj2;
            akcr.b(obj, "first");
            akcr.b(obj2, "second");
            b.b bVar = (akcr.a(obj, a.a) || akcr.a(obj2, a.a)) ? a.a : new b.b();
            return bVar;
        }
    }

    /* renamed from: lzg$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "shouldHide");
            return bool.booleanValue() ? a.a : new defpackage.lzq.b.b();
        }
    }

    /* renamed from: lzg$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        private /* synthetic */ akbw a;

        public a(akbw akbw) {
            this.a = akbw;
        }

        public final R apply(T1 t1, T2 t2) {
            return this.a.invoke(t1, t2);
        }
    }

    /* renamed from: lzg$c */
    static final class c<T1, T2> implements ajey<b, b> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            akcr.b(bVar, "old");
            akcr.b(bVar2, "new");
            return akcr.a(akde.a(bVar.getClass()), akde.a(bVar2.getClass()));
        }
    }

    public lzg(ajdp<lqf> ajdp, ajdp<Boolean> ajdp2, zfw zfw) {
        akcr.b(ajdp, "cameraLifecycle");
        akcr.b(ajdp2, "hideWhen");
        akcr.b(zfw, "qualifiedSchedulers");
        this.b = ajdp;
        this.c = ajdp2;
        this.d = zfw;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object p = ajdp.b((ajdt) lqg.a(this.b, this.d), (ajdt) this.c).p(b.a);
        akcr.a(p, "Observable.merge(cameraL…                        }");
        ajdp = ajdp.a((ajdt) ajdp, (ajdt) p, (ajex) new a(this.a));
        if (ajdp == null) {
            akcr.a();
        }
        Object a = ajdp.a((ajey) c.a);
        akcr.a(a, "Observables.combineLates…ld::class == new::class }");
        return (ajdt) a;
    }
}

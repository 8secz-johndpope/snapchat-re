package defpackage;

import defpackage.mec.a.d;
import defpackage.mft.b.b.b;
import defpackage.mft.b.c;

/* renamed from: mdk */
public final class mdk implements mhi<mha> {
    final ajdp<ajxw> a;
    private final mdu b;
    private final mhi<mfj> c;

    /* renamed from: mdk$a */
    public static final class a implements mha {
        private /* synthetic */ mdk a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ mec c;
        private /* synthetic */ mft d;

        /* renamed from: mdk$a$c */
        static final class c<T, R> implements ajfc<T, R> {
            public static final c a = new c();

            c() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((ajxw) obj, "it");
                return defpackage.mft.a.b.a.a;
            }
        }

        /* renamed from: mdk$a$b */
        public static final class b<T> implements ajfl<Object> {
            public static final b a = new b();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof c;
            }
        }

        /* renamed from: mdk$a$d */
        static final class d<T, R> implements ajfc<T, R> {
            public static final d a = new d();

            d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((c) obj, "it");
                return defpackage.mec.a.a.a;
            }
        }

        /* renamed from: mdk$a$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof b;
            }
        }

        /* renamed from: mdk$a$e */
        static final class e<T, R> implements ajfc<T, R> {
            public static final e a = new e();

            e() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((b) obj, "it");
                return d.b.a;
            }
        }

        a(mdk mdk, ajdp ajdp, mec mec, mft mft) {
            this.a = mdk;
            this.b = ajdp;
            this.c = mec;
            this.d = mft;
        }

        public final ajej a() {
            ajei ajei = new ajei();
            ajej l = this.b.l();
            akcr.a((Object) l, "startButtonUi.subscribe()");
            ajvv.a(ajei, l);
            ajdp b = this.c.b();
            akbl akbl = mdl.a;
            if (akbl != null) {
                akbl = new mdm(akbl);
            }
            l = b.u((ajfc) akbl).f(this.d.a());
            akcr.a((Object) l, "snappablesUseCase.output…tartButtonUseCase.inputs)");
            ajvv.a(ajei, l);
            Object p = this.a.a.p(c.a);
            akcr.a(p, "startButtonLoadingSignal…ase.Action.Show.Loading }");
            l = p.f(this.d.a());
            akcr.a((Object) l, "startButtonLoadingSignal…tartButtonUseCase.inputs)");
            ajvv.a(ajei, l);
            p = this.d.b().a((ajfl) b.a).a(c.class);
            String str = "this.filter { it is R }.cast(R::class.java)";
            akcr.a(p, str);
            l = p.p(d.a).f(this.c.a());
            akcr.a((Object) l, "startButtonUseCase.whenT…snappablesUseCase.inputs)");
            ajvv.a(ajei, l);
            p = this.d.b().a((ajfl) a.a).a(b.class);
            akcr.a(p, str);
            l = p.p(e.a).f(this.c.a());
            akcr.a((Object) l, "startButtonUseCase.whenS…snappablesUseCase.inputs)");
            ajvv.a(ajei, l);
            return ajei;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public mdk(mdu mdu, mhi<mfj> mhi, ajdp<ajxw> ajdp) {
        akcr.b(mdu, "snappablesComponent");
        akcr.b(mhi, "startButtonBuilder");
        akcr.b(ajdp, "startButtonLoadingSignal");
        this.b = mdu;
        this.c = mhi;
        this.a = ajdp;
    }

    public final /* synthetic */ Object a() {
        mfj mfj = (mfj) this.c.a();
        return new a(this, ajpy.k(mfj.b()).a(), this.b.i(), mfj.e());
    }
}

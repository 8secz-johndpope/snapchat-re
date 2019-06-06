package defpackage;

/* renamed from: mdh */
public final class mdh implements mhi<mha> {
    private final mdu a;
    private final mhi<mej> b;

    /* renamed from: mdh$a */
    public static final class a implements mha {
        private /* synthetic */ ajdp a;
        private /* synthetic */ mec b;
        private /* synthetic */ meo c;

        /* renamed from: mdh$a$a */
        public static final class a<T> implements ajfl<Object> {
            public static final a a = new a();

            public final boolean test(Object obj) {
                akcr.b(obj, "it");
                return obj instanceof defpackage.meo.b.a;
            }
        }

        /* renamed from: mdh$a$b */
        static final class b<T, R> implements ajfc<T, R> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.meo.b.a) obj, "it");
                return defpackage.mec.a.b.a;
            }
        }

        a(ajdp ajdp, mec mec, meo meo) {
            this.a = ajdp;
            this.b = mec;
            this.c = meo;
        }

        public final ajej a() {
            ajei ajei = new ajei();
            ajej l = this.a.l();
            akcr.a((Object) l, "closeButtonUi.subscribe()");
            ajvv.a(ajei, l);
            ajdp b = this.b.b();
            akbl akbl = mdi.a;
            if (akbl != null) {
                akbl = new mdj(akbl);
            }
            l = b.u((ajfc) akbl).f(this.c.a());
            akcr.a((Object) l, "snappablesUseCase.output…loseButtonUseCase.inputs)");
            ajvv.a(ajei, l);
            Object a = this.c.b().a((ajfl) a.a).a(defpackage.meo.b.a.class);
            akcr.a(a, "this.filter { it is R }.cast(R::class.java)");
            l = a.p(b.a).f(this.b.a());
            akcr.a((Object) l, "closeButtonUseCase.whenC…snappablesUseCase.inputs)");
            ajvv.a(ajei, l);
            return ajei;
        }

        public final ajdp<Object> b() {
            return defpackage.mha.a.a(this);
        }
    }

    public mdh(mdu mdu, mhi<mej> mhi) {
        akcr.b(mdu, "snappablesComponent");
        akcr.b(mhi, "fullscreenCloseButtonBuildable");
        this.a = mdu;
        this.b = mhi;
    }

    public final /* synthetic */ Object a() {
        mej mej = (mej) this.b.a();
        return new a(mej.b(), this.a.i(), mej.d());
    }
}

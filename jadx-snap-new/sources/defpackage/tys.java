package defpackage;

/* renamed from: tys */
public final class tys implements tyr {
    private final ajxe a;
    private final ajdx<Boolean> b;

    /* renamed from: tys$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: tys$c */
    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ toc b;

        c(zgb zgb, toc toc) {
            this.a = zgb;
            this.b = toc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b.callsite("PreviewLabelModeConfigImpl"));
        }
    }

    /* renamed from: tys$b */
    static final class b<T1, T2, R> implements ajex<abkq, Integer, Boolean> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            abkq abkq = (abkq) obj;
            int intValue = ((Number) obj2).intValue();
            akcr.b(abkq, "userSession");
            return Boolean.valueOf(zks.a(abkq.h, intValue));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tys.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public tys(toc toc, zgb zgb, ftl ftl, ajwy<gpb> ajwy) {
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ftl, "configurationProvider");
        akcr.b(ajwy, "userAuthStore");
        this.a = ajxh.a(new c(zgb, toc));
        Object a = ajdp.b((ajdt) ((gpb) ajwy.get()).c(), (ajdt) ftl.s(jic.NUM_SNAPS_SENT), (ajex) b.a).b((ajdw) ((zfw) this.a.b()).f()).d(Boolean.FALSE).a();
        akcr.a(a, "Observable.zip(\n        …\n                .cache()");
        this.b = a;
    }

    public final ajdx<Boolean> a() {
        return this.b;
    }
}

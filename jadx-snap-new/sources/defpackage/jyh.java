package defpackage;

/* renamed from: jyh */
public final class jyh implements jyp {
    final ajwy<jwo> a;
    final ajwy<jzo> b;
    private final ajxe c = ajxh.a(new a(this));
    private ajwy<kal> d;

    /* renamed from: jyh$a */
    static final class a extends akcs implements akbk<jyp> {
        private /* synthetic */ jyh a;

        a(jyh jyh) {
            this.a = jyh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a.get();
            return (jyp) this.a.b.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(jyh.class), "controller", "getController()Lcom/snap/imageloading/internal/api/ImageLoadingMemoryController;");
    }

    public jyh(ajwy<jwo> ajwy, ajwy<jzo> ajwy2, ajwy<kal> ajwy3) {
        akcr.b(ajwy, "config");
        akcr.b(ajwy2, "glide3Controller");
        akcr.b(ajwy3, "glide4Controller");
        this.a = ajwy;
        this.b = ajwy2;
        this.d = ajwy3;
    }

    private final jyp b() {
        return (jyp) this.c.b();
    }

    public final void a() {
        b().a();
    }

    public final void a(int i) {
        b().a(i);
    }
}

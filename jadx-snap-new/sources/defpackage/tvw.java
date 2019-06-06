package defpackage;

/* renamed from: tvw */
public final class tvw implements tpw {
    final ajxe a = ajxh.a(new a(this));
    final aipn<tvp> b;
    private final String c = "EditsActivator";
    private final ajei d = new ajei();

    /* renamed from: tvw$a */
    static final class a extends akcs implements akbk<tvp> {
        private /* synthetic */ tvw a;

        a(tvw tvw) {
            this.a = tvw;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tvp) this.a.b.get();
        }
    }

    /* renamed from: tvw$b */
    static final class b implements ajev {
        private /* synthetic */ tvw a;

        b(tvw tvw) {
            this.a = tvw;
        }

        public final void run() {
            ((tvp) this.a.a.b()).dispose();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tvw.class), "editsComposer", "getEditsComposer()Lcom/snap/preview/edits/EditsComposer;");
    }

    public tvw(aipn<tvp> aipn) {
        akcr.b(aipn, "editsComposerLazy");
        this.b = aipn;
    }

    public final String a() {
        return this.c;
    }

    public final ajej start() {
        this.d.a(ajek.a((ajev) new b(this)));
        return this.d;
    }
}

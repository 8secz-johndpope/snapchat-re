package defpackage;

/* renamed from: jyj */
public final class jyj implements jxg {
    private final ajxe a;

    /* renamed from: jyj$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            akcr.a(this.a.get(), "releaseManager.get()");
            return Boolean.valueOf(abss.j());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(jyj.class), "isUiOrInstrumentationTestEnabled", "isUiOrInstrumentationTestEnabled()Z");
    }

    public jyj(ajwy<abss> ajwy) {
        akcr.b(ajwy, "releaseManager");
        this.a = ajxh.a(new a(ajwy));
    }
}

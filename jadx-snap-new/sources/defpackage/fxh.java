package defpackage;

/* renamed from: fxh */
public final class fxh {
    final ajwy<ftl> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: fxh$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ fxh a;

        a(fxh fxh) {
            this.a = fxh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.a.get()).a((fth) fxs.DECK_APP_STATE_MANAGEMENT));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(fxh.class), "isEnabled", "isEnabled()Z");
    }

    public fxh(ajwy<ftl> ajwy) {
        akcr.b(ajwy, "configProvider");
        this.a = ajwy;
    }

    public final boolean a() {
        return ((Boolean) this.b.b()).booleanValue();
    }
}

package defpackage;

/* renamed from: zre */
public final class zre {
    private final ajxe a;
    private final ajxe b;

    /* renamed from: zre$b */
    static final class b extends akcs implements akbk<tnj> {
        private /* synthetic */ aipn a;

        b(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tnj) this.a.get();
        }
    }

    /* renamed from: zre$a */
    static final class a extends akcs implements akbk<ihh> {
        private /* synthetic */ aipn a;

        a(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zre.class), "preferences", "getPreferences()Lcom/snap/prefs/Preferences;"), new akdc(akde.a(zre.class), "clock", "getClock()Lcom/snap/framework/time/Clock;")};
    }

    public zre(aipn<tnj> aipn, aipn<ihh> aipn2) {
        akcr.b(aipn, "preferencesLazy");
        akcr.b(aipn2, "clockLazy");
        this.a = ajxh.a(new b(aipn));
        this.b = ajxh.a(new a(aipn2));
    }

    public final tnj a() {
        return (tnj) this.a.b();
    }

    public final ihh b() {
        return (ihh) this.b.b();
    }
}

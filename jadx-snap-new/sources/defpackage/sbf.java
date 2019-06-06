package defpackage;

/* renamed from: sbf */
public final class sbf implements sah {
    private final zgb a;
    private final rzx b;

    /* renamed from: sbf$a */
    static final class a extends akcs implements akbl<Throwable, Boolean> {
        private /* synthetic */ sbf a;
        private /* synthetic */ idd b;

        a(sbf sbf, idd idd) {
            this.a = sbf;
            this.b = idd;
            super(1);
        }

        private boolean a(Throwable th) {
            akcr.b(th, "it");
            try {
                zgd.a(this.b);
                boolean a = this.a.a(th);
                return a;
            } finally {
                zgd.a(null);
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(a((Throwable) obj));
        }
    }

    public sbf(zgb zgb, rzx rzx) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(rzx, "noNetworkDetector");
        this.a = zgb;
        this.b = rzx;
    }

    public final <T> igm<T> a(idd idd, int i, int i2) {
        akcr.b(idd, "callsite");
        return new igm(zgb.a(idd).b(), i, i2, new a(this, idd));
    }

    public final boolean a(Throwable th) {
        akcr.b(th, "exception");
        return this.b.a(th);
    }
}

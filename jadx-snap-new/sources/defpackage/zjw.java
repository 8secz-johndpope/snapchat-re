package defpackage;

import defpackage.acie.a;

/* renamed from: zjw */
public final class zjw {
    public zjm a;
    public acig<zjm, zjk> b;
    public acih c;
    public final achb<zjm, zjk> d;

    /* renamed from: zjw$b */
    static final class b implements Runnable {
        private /* synthetic */ akbk a;

        b(akbk akbk) {
            this.a = akbk;
        }

        public final void run() {
            this.a.invoke();
        }
    }

    /* renamed from: zjw$a */
    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ zjw a;
        private /* synthetic */ acig b;

        a(zjw zjw, acig acig) {
            this.a = zjw;
            this.b = acig;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.d.b(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: zjw$c */
    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ zjw a;
        private /* synthetic */ zjm b;
        private /* synthetic */ boolean c;
        private /* synthetic */ acig d;
        private /* synthetic */ acih e;

        c(zjw zjw, zjm zjm, boolean z, acig acig, acih acih) {
            this.a = zjw;
            this.b = zjm;
            this.c = z;
            this.d = acig;
            this.e = acih;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            zjw zjw = this.a;
            zjm zjm = this.b;
            boolean z = this.c;
            acig acig = this.d;
            acih acih = this.e;
            acig acik = zjm != null ? new acik(zjm, z, acih) : new acid();
            if (acig == null) {
                acig = new acid();
            }
            zjw.d.b((acig) a.a(new acig[]{acik, acig}, acih));
            return ajxw.a;
        }
    }

    public zjw(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        this.d = achb;
    }

    private final void a(akbk<ajxw> akbk) {
        if (this.d.a().getHeight() == 0 || this.d.a().getWidth() == 0) {
            zhd.a(this.d.a(), new b(akbk));
        } else {
            akbk.invoke();
        }
    }

    public static /* synthetic */ void a(zjw zjw, zjm zjm, boolean z, acig acig, acih acih, int i) {
        if ((i & 1) != 0) {
            zjm = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            acig = null;
        }
        if ((i & 8) != 0) {
            acih = null;
        }
        zjw.a(zjm, z, acig, acih);
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(acig<zjm, zjk> acig) {
        akcr.b(acig, "navigable");
        a((akbk) new a(this, acig));
    }

    public final void a(zjm zjm, boolean z, acig<zjm, zjk> acig, acih acih) {
        if (this.d.c) {
            a((akbk) new c(this, zjm, z, acig, acih));
            return;
        }
        this.a = zjm;
        this.b = acig;
        this.c = acih;
    }
}

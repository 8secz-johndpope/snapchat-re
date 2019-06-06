package defpackage;

import defpackage.kqe.al;
import defpackage.kqe.b;

/* renamed from: kri */
public final class kri implements ksu {
    private final kre a;

    /* renamed from: kri$c */
    static final class c extends akcs implements akbk<aapo> {
        private /* synthetic */ String a;
        private /* synthetic */ kri b;
        private /* synthetic */ krv c;

        c(String str, kri kri, krv krv) {
            this.a = str;
            this.b = kri;
            this.c = krv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aapo aapo = new aapo();
            aapo.a(this.a);
            aapo.a(this.c.a());
            aapo.b("[applied]");
            return aapo;
        }
    }

    /* renamed from: kri$a */
    static final class a extends akcs implements akbk<aapl> {
        private /* synthetic */ String a;
        private /* synthetic */ kri b;
        private /* synthetic */ b c;
        private /* synthetic */ krv d;

        a(String str, kri kri, b bVar, krv krv) {
            this.a = str;
            this.b = kri;
            this.c = bVar;
            this.d = krv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aapl aapl = new aapl();
            aapl.a(this.a);
            aapl.b(this.c.b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c.c);
            stringBuilder.append("[applied]");
            aapl.c(stringBuilder.toString());
            aapl.a(this.d.a());
            return aapl;
        }
    }

    /* renamed from: kri$b */
    static final class b extends akcs implements akbk<aapl> {
        private /* synthetic */ String a;
        private /* synthetic */ kri b;
        private /* synthetic */ defpackage.kqe.b c;
        private /* synthetic */ krv d;

        b(String str, kri kri, defpackage.kqe.b bVar, krv krv) {
            this.a = str;
            this.b = kri;
            this.c = bVar;
            this.d = krv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aapl aapl = new aapl();
            aapl.a(this.a);
            aapl.b(this.c.b);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c.c);
            stringBuilder.append("[upcoming]");
            aapl.c(stringBuilder.toString());
            aapl.a(this.d.a());
            return aapl;
        }
    }

    /* renamed from: kri$d */
    static final class d extends akcs implements akbk<aapo> {
        private /* synthetic */ String a;
        private /* synthetic */ kri b;
        private /* synthetic */ krv c;

        d(String str, kri kri, krv krv) {
            this.a = str;
            this.b = kri;
            this.c = krv;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aapo aapo = new aapo();
            aapo.a(this.a);
            aapo.a(this.c.a());
            aapo.b("[upcoming]");
            return aapo;
        }
    }

    public kri(kre kre) {
        akcr.b(kre, "blizzardEventLogger");
        this.a = kre;
    }

    public final void a(al alVar, krv krv) {
        akcr.b(alVar, "event");
        akcr.b(krv, "analyticsDeviceClass");
        String str = alVar.b;
        if (str != null) {
            this.a.a(new c(str, this, krv));
        }
        String str2 = alVar.c;
        if (str2 != null) {
            this.a.a(new d(str2, this, krv));
        }
    }

    public final void a(b bVar, krv krv) {
        akcr.b(bVar, "event");
        akcr.b(krv, "analyticsDeviceClass");
        String str = bVar.d;
        if (str != null) {
            this.a.a(new a(str, this, bVar, krv));
        }
        str = bVar.e;
        if (str != null) {
            this.a.a(new b(str, this, bVar, krv));
        }
    }
}

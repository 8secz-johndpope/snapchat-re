package defpackage;

import defpackage.kqe.c.c;
import defpackage.kqe.c.e;
import defpackage.mhk.b;
import java.util.concurrent.TimeUnit;

/* renamed from: ksa */
public final class ksa implements kse {
    private final kre a;
    private final mhk b;

    /* renamed from: ksa$a */
    static final class a extends akcs implements akbk<aapk> {
        private /* synthetic */ long a;
        private /* synthetic */ ksg b;

        a(long j, ksg ksg) {
            this.a = j;
            this.b = ksg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aapk aapk = new aapk();
            aapk.a(aapj.CAROUSEL);
            double d = (double) (this.a - this.b.b);
            Double.isNaN(d);
            aapk.a(Double.valueOf(d / 1000.0d));
            return aapk;
        }
    }

    /* renamed from: ksa$b */
    static final class b extends akcs implements akbk<abfe> {
        private /* synthetic */ ksa a;
        private /* synthetic */ c b;

        b(ksa ksa, c cVar) {
            this.a = ksa;
            this.b = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ksa.a(new abfe(), this.b);
        }
    }

    /* renamed from: ksa$c */
    static final class c extends akcs implements akbk<abfe> {
        private /* synthetic */ ksa a;
        private /* synthetic */ long b;
        private /* synthetic */ defpackage.kqe.c.c c;

        c(ksa ksa, long j, defpackage.kqe.c.c cVar) {
            this.a = ksa;
            this.b = j;
            this.c = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abfg abfg = new abfg();
            double d = (double) this.b;
            Double.isNaN(d);
            abfg.a(Double.valueOf(d / 1000.0d));
            return ksa.a((abfe) abfg, this.c);
        }
    }

    /* renamed from: ksa$d */
    static final class d extends akcs implements akbk<abfd> {
        private /* synthetic */ e a;

        d(e eVar) {
            this.a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abfd abfd = new abfd();
            abfd.a(abey.UNLOCK_LENS);
            abfd.b(this.a.b.a);
            abfd.a(abff.THREE_COLUMNS);
            abfd.a(abfi.LENS_OBJECT);
            abfd.a(Long.valueOf((long) this.a.c));
            abfd.a(aaua.LENS_EXPLORER);
            abfd.a(aake.COMMUNITY_LENSES);
            abfd.a(ksb.a(this.a.d));
            return abfd;
        }
    }

    /* renamed from: ksa$e */
    static final class e extends akcs implements akbk<aakc> {
        private /* synthetic */ ksg a;

        e(ksg ksg) {
            this.a = ksg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aakc aakc = new aakc();
            aakc.a(aaua.LENS_EXPLORER);
            aakc.setSessionId(this.a.a);
            return aakc;
        }
    }

    public /* synthetic */ ksa(kre kre) {
        this(kre, b.a);
    }

    private ksa(kre kre, mhk mhk) {
        akcr.b(kre, "eventLogger");
        akcr.b(mhk, "clock");
        this.a = kre;
        this.b = mhk;
    }

    public final void a(c cVar) {
        akcr.b(cVar, "event");
        this.a.a(new b(this, cVar));
    }

    public final void a(c cVar, long j) {
        akcr.b(cVar, "event");
        this.a.a(new c(this, j, cVar));
    }

    public final void a(e eVar) {
        akcr.b(eVar, "event");
        this.a.a(new d(eVar));
    }

    public final void a(ksg ksg) {
        akcr.b(ksg, "session");
        this.a.a(new e(ksg));
    }

    public final void b(ksg ksg) {
        akcr.b(ksg, "session");
        this.a.a(new a(this.b.a(TimeUnit.MILLISECONDS), ksg));
    }
}

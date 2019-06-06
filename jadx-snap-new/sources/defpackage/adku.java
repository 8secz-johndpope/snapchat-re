package defpackage;

import defpackage.adkk.a.a;
import defpackage.adkk.a.a.b;
import defpackage.adkk.a.a.c;

/* renamed from: adku */
public final class adku implements adkt {
    private final ajxe a;
    private final aipn<dib> b;
    private final aipn<ilv> c;

    /* renamed from: adku$c */
    static final class c implements Runnable {
        private /* synthetic */ adkw a;
        private /* synthetic */ adku b;
        private /* synthetic */ adkx c;

        c(adkw adkw, adku adku, adkx adkx) {
            this.a = adkw;
            this.b = adku;
            this.c = adkx;
        }

        public final void run() {
            this.b.a(this.c, this.a, true);
        }
    }

    /* renamed from: adku$e */
    static final class e extends akcs implements akbk<ajdw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(adfa.a.callsite("ImagePlayerEventLoggerImpl")).g();
        }
    }

    /* renamed from: adku$a */
    static final class a implements Runnable {
        private /* synthetic */ adku a;
        private /* synthetic */ adkx b;
        private /* synthetic */ defpackage.adkk.a.a c;

        a(adku adku, adkx adkx, defpackage.adkk.a.a aVar) {
            this.a = adku;
            this.b = adkx;
            this.c = aVar;
        }

        public final void run() {
            adkw adkw;
            adku adku = this.a;
            adkx adkx = this.b;
            defpackage.adkk.a.a aVar = this.c;
            akcr.b(aVar, "error");
            if (aVar instanceof c) {
                adkw = adkw.SETUP;
            } else if (aVar instanceof b) {
                adkw = adkw.RENDERING;
            } else if (aVar instanceof defpackage.adkk.a.a.a) {
                adkw = adkw.RELEASE;
            } else {
                throw new ajxk();
            }
            adku.a(adkx, adkw, false);
        }
    }

    /* renamed from: adku$b */
    static final class b implements Runnable {
        private /* synthetic */ adku a;
        private /* synthetic */ adkx b;

        b(adku adku, adkx adkx) {
            this.a = adku;
            this.b = adkx;
        }

        public final void run() {
            this.a.a(this.b);
        }
    }

    /* renamed from: adku$d */
    static final class d implements Runnable {
        private /* synthetic */ adku a;
        private /* synthetic */ adkx b;

        d(adku adku, adkx adkx) {
            this.a = adku;
            this.b = adkx;
        }

        public final void run() {
            this.a.a(this.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(adku.class), "scheduler", "getScheduler()Lio/reactivex/Scheduler;");
    }

    public adku(aipn<dib> aipn, aipn<ilv> aipn2, zgb zgb) {
        akcr.b(aipn, "blizzardEventLogger");
        akcr.b(aipn2, "graphene");
        akcr.b(zgb, "schedulersProvider");
        this.b = aipn;
        this.c = aipn2;
        this.a = ajxh.a(new e(zgb));
    }

    private final ajdw a() {
        return (ajdw) this.a.b();
    }

    private final void a(String str, adkw adkw, Long l) {
        if (l != null) {
            ((ilv) this.c.get()).a(iol.IMAGE_PLAYER.a("tag", str).a("section", (Enum) adkw), l.longValue());
        }
    }

    /* JADX WARNING: Missing block: B:3:0x000d, code skipped:
            if (r1 == null) goto L_0x000f;
     */
    public final void a(defpackage.adkx r7) {
        /*
        r6 = this;
        r0 = "sessionRecord";
        defpackage.akcr.b(r7, r0);
        r0 = r7.d;
        r1 = r7.b;
        if (r1 == 0) goto L_0x000f;
    L_0x000b:
        r1 = r1.b;
        if (r1 != 0) goto L_0x0011;
    L_0x000f:
        r1 = "SUCCESS";
    L_0x0011:
        r2 = new aacb;
        r2.<init>();
        r2.a(r0);
        r3 = r7.c;
        r4 = 0;
        if (r3 == 0) goto L_0x0023;
    L_0x001e:
        r3 = r3.getName();
        goto L_0x0024;
    L_0x0023:
        r3 = r4;
    L_0x0024:
        r2.b(r3);
        r3 = r7.e;
        r5 = defpackage.adhl.GLES20;
        if (r3 != r5) goto L_0x0030;
    L_0x002d:
        r3 = defpackage.aaof.GLES20;
        goto L_0x0032;
    L_0x0030:
        r3 = defpackage.aaof.GLES30;
    L_0x0032:
        r2.a(r3);
        r2.c(r1);
        r3 = r7.b;
        if (r3 == 0) goto L_0x0044;
    L_0x003c:
        r3 = r3.a;
        if (r3 == 0) goto L_0x0044;
    L_0x0040:
        r4 = r3.getMessage();
    L_0x0044:
        r2.d(r4);
        r3 = defpackage.adkw.SETUP;
        r3 = r7.a(r3);
        r2.a(r3);
        r3 = defpackage.adkw.SETUP_TO_FIRST_FRAME;
        r3 = r7.a(r3);
        r2.b(r3);
        r3 = defpackage.adkw.RELEASE;
        r7 = r7.a(r3);
        r2.c(r7);
        r7 = r6.b;
        r7 = r7.get();
        r7 = (defpackage.dib) r7;
        r3 = r2;
        r3 = (defpackage.aajt) r3;
        r7.a(r3);
        r7 = r6.c;
        r7 = r7.get();
        r7 = (defpackage.ilv) r7;
        r3 = defpackage.iol.IMAGE_PLAYER;
        r4 = "tag";
        r3 = r3.a(r4, r0);
        r4 = "status";
        r1 = r3.a(r4, r1);
        r7.c(r1, 1);
        r7 = defpackage.adkw.SETUP;
        r1 = r2.a();
        r6.a(r0, r7, r1);
        r7 = defpackage.adkw.SETUP_TO_FIRST_FRAME;
        r1 = r2.b();
        r6.a(r0, r7, r1);
        r7 = defpackage.adkw.RELEASE;
        r1 = r2.c();
        r6.a(r0, r7, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adku.a(adkx):void");
    }

    public final synchronized void a(adkx adkx, a aVar) {
        akcr.b(adkx, "sessionRecord");
        akcr.b(aVar, "error");
        a().a((Runnable) new a(this, adkx, aVar));
        if ((adkx.b != null ? 1 : null) == null) {
            akcr.b(aVar, "error");
            adkx.b = aVar;
            a().a((Runnable) new b(this, adkx));
        }
    }

    public final synchronized void a(adkx adkx, adks adks) {
        akcr.b(adkx, "sessionRecord");
        akcr.b(adks, "event");
        akcr.b(adks, "event");
        adkx.a.put(adks, Long.valueOf(adkx.f.a()));
        akcr.b(adks, "event");
        int i = adky.a[adks.ordinal()];
        adkw adkw = i != 1 ? i != 2 ? i != 3 ? null : adkw.RELEASE : adkw.RENDERING : adkw.SETUP;
        if (adkw != null) {
            a().a((Runnable) new c(adkw, this, adkx));
        }
        if (adks == adks.RELEASE_FINISH) {
            a().a((Runnable) new d(this, adkx));
        }
    }

    public final void a(adkx adkx, adkw adkw, boolean z) {
        akcr.b(adkx, "sessionRecord");
        String str = "section";
        akcr.b(adkw, str);
        ((ilv) this.c.get()).c(iol.IMAGE_PLAYER.a("tag", adkx.d).a(str, adkw.toString()).a("section_status", z), 1);
    }
}

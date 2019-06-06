package defpackage;

import defpackage.rzu.b;
import defpackage.sbt.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: rzk */
public final class rzk<Req extends ryz, PendingState, ExecutingState> implements ryw<Req> {
    private final Executor a;
    private final ryt<Req> b;
    private final rzi<Req, PendingState> c;
    private final rzi<Req, ExecutingState> d;
    private final rys<Req, PendingState, ExecutingState> e;
    private final Map<String, b<Req>> f;
    private final a g;
    private final ajei h = new ajei();
    private final rzn<Req> i;
    private final rzd<Req> j;
    private final ihh k;
    private final zfw l;

    /* renamed from: rzk$b */
    static final class b<Req extends ryz> implements rzf<Req> {
        final rzf<Req> a;
        final ryw.a b;
        final sbt<rzu> c;
        final String d;
        final sar.a e;
        private final long f;

        b(rzf<Req> rzf, ryw.a aVar, a aVar2) {
            this.a = rzf;
            this.b = aVar;
            this.c = aVar2.a();
            this.e = new sar.a();
            this.d = rzf.c();
            this.f = rzf.b();
        }

        b(b<Req> bVar, rzf<Req> rzf) {
            this.d = bVar.d;
            this.b = bVar.b;
            this.c = bVar.c;
            this.f = bVar.f;
            this.a = rzf;
            this.e = bVar.e;
        }

        /* Access modifiers changed, original: final */
        public final void a(Runnable runnable) {
            this.c.addListener(new -$$Lambda$rzk$b$1CTTA3rmE9R2ZsxIkb39kTyA6OU(this, runnable));
        }

        /* Access modifiers changed, original: final */
        public final void a(Req req, ifl ifl) {
            if (rzh.b(req.b)) {
                if (this.e.c == sas.a) {
                    this.e.e(ifl);
                }
            } else if (this.e.c != sas.a) {
                this.e.e(sas.a);
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(sad<rzu> sad) {
            this.c.addListener(sad);
        }

        public final long b() {
            return this.f;
        }

        public final String c() {
            return this.d;
        }

        public final rzf.a d() {
            return this.a.d();
        }

        /* renamed from: e */
        public final Req a() {
            return (ryz) this.a.a();
        }
    }

    /* renamed from: rzk$a */
    static final class a<Req extends ryz> implements rzb<Req> {
        private final String a;
        private final rzk<Req, ?, ?> b;

        a(String str, rzk<Req, ?, ?> rzk) {
            this.a = str;
            this.b = rzk;
        }

        public final void a(ryu<Req> ryu) {
            this.b.a.execute(new -$$Lambda$rzk$g0CnkO_D3g5Tz5vJRQg9H2CixWY(this.b, this.a, ryu));
        }

        public final void a(b bVar) {
            this.b.a.execute(new -$$Lambda$rzk$VcKWZgCBkOfh4GUBUBZ2377-cHE(this.b, this.a, bVar));
        }

        public final void b() {
            this.b.a.execute(new -$$Lambda$rzk$MG9pPF9V0OVPSPNFB2J4CNESExY(this.b, this.a));
        }
    }

    public rzk(Executor executor, ryt<Req> ryt, rzi<Req, PendingState> rzi, rzi<Req, ExecutingState> rzi2, rys<Req, PendingState, ExecutingState> rys, ryy ryy, rzn<Req> rzn, rzd<Req> rzd, ihh ihh, zfw zfw, Map<String, b<Req>> map) {
        this.i = rzn;
        this.a = executor;
        this.b = ryt;
        this.c = rzi;
        this.d = rzi2;
        this.e = rys;
        this.j = rzd;
        this.k = ihh;
        this.f = map;
        this.g = sbu.a(executor, sbx.a("DefaultNetworkManager"));
        this.h.a(ryy.b().a(new -$$Lambda$rzk$raHeYAmh2F8CG6_YsvHH73qlI-k(this), new -$$Lambda$rzk$d-BMAj0It6itVLmjQAtIPow3p6E(this)));
        this.l = zfw;
    }

    private void a() {
        while (true) {
            ryv b = b();
            Object obj = null;
            Object obj2 = (b == null || b.a() == null) ? 1 : null;
            if (obj2 == null) {
                b bVar = (b) b.a();
                if (!(bVar == null || bVar.a().f())) {
                    this.c.b(bVar);
                    this.f.remove(bVar.d);
                    this.l.g().a(new -$$Lambda$rzk$vF-9QaYUPibuRXC0uhPT0SstCxo(this, bVar));
                    obj = 1;
                }
                if (obj == null && bVar != null) {
                    rzn rzn = this.i;
                    ifl ifl = new ifl(this.k);
                    rzn.c(bVar.a.a());
                    bVar.e.b(ifl);
                    this.c.b(bVar);
                    this.d.a(bVar);
                    bVar.c.a(this.b.a(bVar, new -$$Lambda$rzk$qrG8tEX1nlc1b5UbvLu98vPU5yE(this, bVar)));
                }
            } else {
                return;
            }
        }
    }

    private void a(String str) {
        this.a.execute(new -$$Lambda$rzk$JOpkCUCMpzbYinEm8fVELtcG294(this));
    }

    private void a(Throwable th) {
    }

    private /* synthetic */ void a(b bVar, sat sat, sat sat2, sao sao) {
        b bVar2 = bVar;
        sao sao2 = sao;
        bVar2.e.c(sat.c().g);
        bVar2.e.a(sat.c().i);
        sao.a aVar = new sao.a(sao2.a, sao2.d, sao2.b, sao2.c, sao2.e, sao2.f, sao2.g, sao2.h, sao2.i);
        sar a = bVar2.e.a();
        akcr.b(a, "<set-?>");
        aVar.d = a;
        this.i.a(bVar.a(), sat2, aVar.a());
    }

    private ryv<Req> b() {
        return this.e.a(this.c.b(), this.d.b());
    }

    private /* synthetic */ void b(b bVar, sat sat, sat sat2) {
        rzn rzn = this.i;
        ifl ifl = new ifl(this.k);
        rzn.c(bVar.a.a(), sat);
        bVar.e.f(ifl);
        this.d.b(bVar);
        this.f.remove(bVar.d);
        sat.a(new -$$Lambda$rzk$Q_ROkWuDk3trbFgvyImV9DnUlnI(this, bVar, sat2, sat));
        a();
    }

    public final rzb<Req> a(Req req, ryw.a aVar) {
        b bVar = new b(this.j.a(req), aVar, this.g);
        rzn rzn = this.i;
        ifl ifl = new ifl(this.k);
        bVar.e.a(ifl);
        bVar.a((ryz) bVar.a.a(), ifl);
        rzn.a(bVar.a.a(), bVar.d);
        this.a.execute(new -$$Lambda$rzk$jsmpgNj41Vh8XbD3sRX1I3O5h90(this, bVar));
        return new a(bVar.d, this);
    }
}

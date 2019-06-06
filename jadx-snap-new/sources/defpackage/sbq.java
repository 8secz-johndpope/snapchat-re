package defpackage;

import com.google.common.collect.ImmutableSet;
import defpackage.rzu.b;
import defpackage.sal.a;
import defpackage.sbp.c;
import defpackage.sbp.d;
import defpackage.sbp.e;
import defpackage.sbp.f;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: sbq */
final class sbq implements sal {
    final sbt<a> a;
    final sbt<a> b;
    final rzu c;
    private final UUID d;
    private final sak e;
    private final rzv<sai> f;
    private final sao.a g;
    private final sbt<sao> h;
    private final rzu.a i;
    private final b j;
    private volatile sak<sai> k;
    private volatile saq<sai> l;
    private final sbp m;
    private final Set<sav> n;
    private boolean o = false;
    private final sar.a p;
    private final sbt<rzz> q;
    private final AtomicBoolean r = new AtomicBoolean(false);
    private final ihh s;

    /* renamed from: sbq$2 */
    class 2 implements rzu.a {
        2() {
        }

        public final void a(UUID uuid, long j, long j2, long j3, long j4) {
            sbq.this.a(uuid, j, j2, j3, j4);
        }

        public final void a(UUID uuid, long j, boolean z) {
            sbq.this.a(uuid, j, z);
        }

        public final void a(UUID uuid, Throwable th, san san) {
            sbq.this.a(th, san);
        }
    }

    /* renamed from: sbq$1 */
    class 1 implements rzu {
        1() {
        }

        public final void a() {
            sbq.this.a.addListener(new -$$Lambda$XtwDtyK7yw00itprd_gXHfOpKSE(sbq.this));
        }

        public final void a(rzu.a aVar) {
            sbq.this.b.addListener(new -$$Lambda$sbq$1$f1abquxmmKBh6_ubiteqtyj8yVs(aVar));
        }

        public final void a(b bVar) {
            sbq.this.b.addListener(new -$$Lambda$sbq$1$Rf1C6ntdtw1u9lAGS-8KZpYhlNA(bVar));
        }
    }

    /* renamed from: sbq$3 */
    class 3 implements b {
        3() {
        }

        public final void a(UUID uuid) {
            sbq.this.a(uuid);
        }

        public final void a(UUID uuid, long j, long j2, long j3) {
            sbq.this.a(uuid, j, j2, j3);
        }
    }

    /* renamed from: sbq$a */
    static class a {

        /* renamed from: sbq$a$4 */
        static class 4 extends a {
            private /* synthetic */ UUID a;
            private /* synthetic */ Long b;
            private /* synthetic */ Long c;
            private /* synthetic */ Long d;

            4(UUID uuid, Long l, Long l2, Long l3) {
                this.a = uuid;
                this.b = l;
                this.c = l2;
                this.d = l3;
                super();
            }

            public final void a(b bVar) {
                bVar.a(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue());
            }
        }

        /* renamed from: sbq$a$3 */
        static class 3 extends a {
            private /* synthetic */ UUID a;
            private /* synthetic */ long b;
            private /* synthetic */ boolean c;

            3(UUID uuid, long j, boolean z) {
                this.a = uuid;
                this.b = j;
                this.c = z;
                super();
            }

            public final void a(defpackage.rzu.a aVar) {
                aVar.a(this.a, this.b, this.c);
            }
        }

        /* renamed from: sbq$a$1 */
        static class 1 extends a {
            private /* synthetic */ UUID a;
            private /* synthetic */ Long b;
            private /* synthetic */ Long c;
            private /* synthetic */ Long d;
            private /* synthetic */ Long e;

            1(UUID uuid, Long l, Long l2, Long l3, Long l4) {
                this.a = uuid;
                this.b = l;
                this.c = l2;
                this.d = l3;
                this.e = l4;
                super();
            }

            public final void a(defpackage.rzu.a aVar) {
                aVar.a(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue(), this.e.longValue());
            }
        }

        /* renamed from: sbq$a$5 */
        static class 5 extends a {
            private /* synthetic */ UUID a;

            5(UUID uuid) {
                this.a = uuid;
                super();
            }

            public final void a(b bVar) {
                bVar.a(this.a);
            }
        }

        /* renamed from: sbq$a$2 */
        static class 2 extends a {
            private /* synthetic */ UUID a;
            private /* synthetic */ Throwable b;
            private /* synthetic */ san c;

            2(UUID uuid, Throwable th, san san) {
                this.a = uuid;
                this.b = th;
                this.c = san;
                super();
            }

            public final void a(defpackage.rzu.a aVar) {
                aVar.a(this.a, this.b, this.c);
            }
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public void a(defpackage.rzu.a aVar) {
        }

        public void a(b bVar) {
        }
    }

    sbq(sak sak, rzv<sai> rzv, sbt.a aVar, ihh ihh, rzu.a aVar2) {
        this.s = ihh;
        this.d = iig.a();
        this.e = sak;
        this.k = sak;
        this.l = sbj.a;
        this.f = rzv;
        this.a = aVar.a();
        this.n = new HashSet();
        this.m = new sbp();
        this.p = new sar.a();
        this.g = new sao.a((byte) 0);
        this.q = aVar.a();
        this.h = aVar.a();
        this.b = aVar.b();
        this.i = new 2();
        this.j = new 3();
        this.c = new 1();
        a(sak.i(), "FilterChainRequestContext");
        if (aVar2 != null) {
            this.c.a(aVar2);
        }
    }

    public final UUID a() {
        return this.d;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized sat<sai> a(Throwable th) {
        return b(sbj.a(this.l, th));
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(Throwable th, san san) {
        if (this.r.compareAndSet(false, true)) {
            this.p.f(new ifl(this.s));
            sar a = this.p.a();
            sao.a aVar = this.g;
            akcr.b(a, "responseInfo");
            if (th != null) {
                aVar.a(th);
            }
            if (san != null) {
                akcr.b(san, "errorInfo");
                aVar.c = san;
            }
            aVar.d = a;
            akcr.b(this, "context");
            akcr.b(a, "responseInfo");
            sbp.a(this, new e(this, th, san));
            this.b.a(new 2(this.d, th, san));
            if (th != null || this.a.a() == null) {
                this.q.a(sas.b);
            }
            this.q.addListener(new -$$Lambda$sbq$Pq7WWCl936pF2ZAUdcYikt-oL1w(this));
        }
    }

    public final synchronized void a(UUID uuid) {
        if (!this.r.get()) {
            this.b.a(new 5(uuid));
        }
    }

    public final synchronized void a(UUID uuid, long j, long j2, long j3) {
        if (!this.r.get()) {
            this.b.a(new 4(uuid, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(UUID uuid, long j, long j2, long j3, long j4) {
        if (!this.r.get()) {
            sao.a aVar = this.g;
            aVar.e = j3;
            aVar.f = j2;
            aVar.g = j4;
            this.b.a(new 1(uuid, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)));
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(UUID uuid, long j, boolean z) {
        if (!this.r.get()) {
            this.p.d(new ifl(this.s));
            this.p.a = z;
            this.b.a(new 3(uuid, j, z));
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(sak<sai> sak) {
        this.k = sak;
        this.p.a(new ifl(this.s));
        akcr.b(this, "context");
        sbp.a(this, new c(this));
    }

    public final void a(a aVar) {
        this.a.a(aVar);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(saq<sai> saq) {
        this.l = saq;
    }

    /* Access modifiers changed, original: final */
    public final void a(sat<sai> sat) {
        this.f.onResult(sat);
    }

    public final boolean a(String str, String str2) {
        return this.n.add(new sav(str, str2));
    }

    public final sak<sai> b() {
        return this.k;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized sat<sai> b(saq<sai> saq) {
        sat a;
        a((saq) saq);
        akcr.b(this, "context");
        sbp.a(this, new f(this));
        sao.a aVar = this.g;
        int i = saq.b;
        Throwable th = saq.f;
        String str = saq.e;
        aVar.a = i;
        aVar.b = str;
        if (th != null) {
            aVar.a(th);
        }
        if (saq.f != null || this.a.a() == null) {
            a(saq.f, saq.g);
        }
        a = sbk.a(this.k, saq, this.p.a(), this.h);
        a.a(new -$$Lambda$sbq$DpAjFMeZaUHCFAIpWHDVS5GiTvY(this, a));
        return a;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(sak<sai> sak) {
        this.k = sak;
        if (!this.o) {
            this.o = true;
            this.p.b(new ifl(this.s));
            akcr.b(this, "context");
            sbp.a(this, new d(this));
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(a aVar) {
        akcr.b(this, "context");
        sbp.a(this, new sbp.a(this));
        aVar.cancel();
    }

    public final sak<sai> c() {
        return this.e;
    }

    public final saq<sai> d() {
        return this.l;
    }

    public final rzu.a e() {
        return this.i;
    }

    public final b f() {
        return this.j;
    }

    public final sar.a g() {
        return this.p;
    }

    public final sad<rzz> h() {
        sbt sbt = this.q;
        sbt.getClass();
        return new -$$Lambda$NpZiNJ4zSGOApoiBtDI73uVYrfw(sbt);
    }

    public final ImmutableSet<sav> i() {
        return ImmutableSet.copyOf(this.n);
    }
}

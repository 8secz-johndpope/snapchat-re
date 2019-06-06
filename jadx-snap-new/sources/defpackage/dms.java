package defpackage;

import com.google.common.base.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dms */
public final class dms implements dlv, dmp {
    private static final long b = TimeUnit.DAYS.toMillis(1);
    final ihh a;
    private final dmn c;
    private final dmm d;
    private final dlz e;
    private final dlx f;
    private final dmo g;
    private final dmv h;
    private volatile dml<acgd> i;
    private volatile dml<a> j;
    private final AtomicReference<Boolean> k = new AtomicReference(null);
    private final AtomicInteger l = new AtomicInteger(0);
    private final ajws<b> m = new ajwl().r();
    private final ajws<b> n = new ajwl().r();
    private final ajwl<dml<acgd>> o = new ajwl();
    private final ajwl<Optional<dml<a>>> p = new ajwl();

    /* renamed from: dms$b */
    class b {
        final c a;
        final boolean b;
        private long c;

        private b(c cVar, boolean z) {
            this.a = cVar;
            this.b = z;
            this.c = dms.this.a.a();
        }

        /* synthetic */ b(dms dms, c cVar, boolean z, byte b) {
            this(cVar, z);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("_");
            stringBuilder.append(this.b ? "PROD" : "DEV");
            return stringBuilder.toString();
        }
    }

    /* renamed from: dms$a */
    static class a {
        final String a;
        private aceu b;

        public a(String str, aceu aceu) {
            this.a = str;
            this.b = aceu;
        }
    }

    /* renamed from: dms$c */
    enum c {
        LOAD_LOCALLY,
        REFRESH_IF_NEEDED
    }

    public dms(dmn dmn, dmm dmm, dlz dlz, dlx dlx, dmo dmo, ihh ihh, dmv dmv) {
        this.c = dmn;
        this.d = dmm;
        this.e = dlz;
        this.f = dlx;
        this.g = dmo;
        this.a = ihh;
        this.h = dmv;
        zfw a = zgb.a(dlw.a, "DefaultBoltConfigProvider");
        this.m.d(1000, TimeUnit.MILLISECONDS, a.f()).a((ajdw) a.f()).a(new -$$Lambda$dms$Pb1gvccfyFNAVXuyrWYWePEclgY(this), false, 1, ajde.a).a(-$$Lambda$Ak8QL176mRumGTfug98PPjKgiWY.INSTANCE).p(-$$Lambda$oaPmSvE-KrPkIcm24OKK5C0C3wQ.INSTANCE).a(this.o);
        this.n.a((ajdw) a.f()).p(new -$$Lambda$dms$mKrpdPc7Yj4aEpXcpnNSK5igPRc(this)).a(this.p);
        this.g.a(this);
        this.n.a((Object) new b(this, c.LOAD_LOCALLY, this.h.a(), (byte) 0));
    }

    private ajdp<Optional<dml<acgd>>> a(b bVar) {
        long a = this.a.a();
        boolean z = bVar.b;
        int incrementAndGet = this.l.incrementAndGet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        return ajdx.b(Optional.fromNullable(dms.a(this.i, z))).a(new -$$Lambda$dms$G7Z8WA4ATTTZxbKLrwTAdYoPNH0(this, z, atomicBoolean2)).a(new -$$Lambda$dms$m4xSiq9TILMwuYRCvCFJLnJT_gk(this, incrementAndGet, bVar, atomicBoolean, atomicBoolean3, z)).g(-$$Lambda$dms$dzfhwLGU4DhYcuYS4loDtazKTiY.INSTANCE).c(new -$$Lambda$dms$hTIB0F4xBUcOR3mE1egCHIpCNJQ(this, bVar, a, atomicBoolean, atomicBoolean2, atomicBoolean3)).i();
    }

    private static <T> dml<T> a(dml<T> dml, boolean z) {
        return (dml == null || dml.c != z) ? null : dml;
    }

    private static /* synthetic */ Optional b(Optional optional, Throwable th) {
        return optional;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:26|27|(1:29)|30) */
    /* JADX WARNING: Missing block: B:27:?, code skipped:
            r7 = com.google.common.base.Optional.fromNullable(r0);
     */
    /* JADX WARNING: Missing block: B:28:0x005d, code skipped:
            if (r0 != null) goto L_0x005f;
     */
    /* JADX WARNING: Missing block: B:29:0x005f, code skipped:
            r6.j = r0;
     */
    /* JADX WARNING: Missing block: B:30:0x0061, code skipped:
            return r7;
     */
    private com.google.common.base.Optional<defpackage.dml<defpackage.dms.a>> b(defpackage.dms.b r7) {
        /*
        r6 = this;
        java.lang.System.currentTimeMillis();
        r7 = r7.b;
        r0 = r6.j;
        r0 = defpackage.dms.a(r0, r7);
        r1 = r6.g;	 Catch:{ all -> 0x0062 }
        r1 = r1.a();	 Catch:{ all -> 0x0062 }
        r2 = com.google.common.base.Strings.isNullOrEmpty(r1);	 Catch:{ all -> 0x0062 }
        if (r2 == 0) goto L_0x0020;
    L_0x0017:
        r7 = com.google.common.base.Optional.fromNullable(r0);	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x001f;
    L_0x001d:
        r6.j = r0;
    L_0x001f:
        return r7;
    L_0x0020:
        if (r0 == 0) goto L_0x0039;
    L_0x0022:
        r2 = r0.a();	 Catch:{ all -> 0x0062 }
        r2 = (defpackage.dms.a) r2;	 Catch:{ all -> 0x0062 }
        r2 = r2.a;	 Catch:{ all -> 0x0062 }
        r2 = r1.equals(r2);	 Catch:{ all -> 0x0062 }
        if (r2 == 0) goto L_0x0039;
    L_0x0030:
        r7 = com.google.common.base.Optional.of(r0);	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x0038;
    L_0x0036:
        r6.j = r0;
    L_0x0038:
        return r7;
    L_0x0039:
        r2 = r6.e;	 Catch:{ IOException -> 0x0059 }
        r2 = r2.a(r1);	 Catch:{ IOException -> 0x0059 }
        r3 = new dms$a;	 Catch:{ all -> 0x0062 }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x0062 }
        r1 = new dml;	 Catch:{ all -> 0x0062 }
        r2 = r6.a;	 Catch:{ all -> 0x0062 }
        r4 = r2.a();	 Catch:{ all -> 0x0062 }
        r1.<init>(r3, r4, r7);	 Catch:{ all -> 0x0062 }
        r7 = com.google.common.base.Optional.of(r1);	 Catch:{ all -> 0x0056 }
        r6.j = r1;
        return r7;
    L_0x0056:
        r7 = move-exception;
        r0 = r1;
        goto L_0x0063;
    L_0x0059:
        r7 = com.google.common.base.Optional.fromNullable(r0);	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x0061;
    L_0x005f:
        r6.j = r0;
    L_0x0061:
        return r7;
    L_0x0062:
        r7 = move-exception;
    L_0x0063:
        if (r0 == 0) goto L_0x0067;
    L_0x0065:
        r6.j = r0;
    L_0x0067:
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dms.b(dms$b):com.google.common.base.Optional");
    }

    public final ajdx<acgd> a() {
        long a = this.a.a();
        boolean a2 = this.h.a();
        this.m.a((Object) new b(this, c.REFRESH_IF_NEEDED, a2, (byte) 0));
        return this.o.a((ajfl) new -$$Lambda$dms$9caCCuv5YhV2Z-QrvPibtG4JKAA(a2)).p(-$$Lambda$jZM66qO_qWR-4ejWwKsKSJrK-x8.INSTANCE).e().a(new -$$Lambda$dms$a_5yGPgs_d6oMKQXZqiupeVWdLY(this, a));
    }

    public final void b() {
        this.m.a((Object) new b(this, c.LOAD_LOCALLY, this.h.a(), (byte) 0));
    }

    public final void c() {
        this.n.a((Object) new b(this, c.REFRESH_IF_NEEDED, this.h.a(), (byte) 0));
    }
}

package defpackage;

import defpackage.rxa.a;
import defpackage.rxa.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: rxb */
public final class rxb implements rxa {
    volatile rxc a;
    private final rxf b;
    private final ihh c;
    private final Map<String, a> d = new HashMap();
    private final rzr e;
    private final int f;
    private volatile Boolean g;
    private final Map<String, Long> h = new HashMap();
    private final Set<String> i = new HashSet();
    private volatile long j = 0;
    private volatile boolean k = false;
    private final ajdw l;
    private final b m;

    /* renamed from: rxb$b */
    public static class b implements a {
        private final ajdw a;
        private final ihh b;
        private final rzr c;

        public b(ajdw ajdw, ihh ihh, rzr rzr) {
            this.a = ajdw;
            this.b = ihh;
            this.c = rzr;
        }

        public final rxa a(rxc rxc, defpackage.rxa.b bVar) {
            rxb rxb = new rxb(this.a, this.b, bVar, this.c);
            rxb.a = rxc;
            return rxb;
        }
    }

    /* renamed from: rxb$a */
    static class a {
        final long a;
        final long b;

        a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public rxb(ajdw ajdw, ihh ihh, b bVar, rzr rzr) {
        this.c = ihh;
        this.b = new rxf();
        this.f = 102400;
        this.l = ajdw;
        this.m = bVar;
        this.e = rzr;
    }

    private long a() {
        if (this.g != null) {
            return !this.g.booleanValue() ? -1 : b();
        } else {
            long b = b();
            this.g = Boolean.valueOf(b != -1);
            return b;
        }
    }

    private long b() {
        return this.m == b.DOWNLOAD ? this.e.a() : this.e.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    private void b(java.lang.String r10, long r11) {
        /*
        r9 = this;
        r0 = r9.d;
        r10 = r0.remove(r10);
        r10 = (defpackage.rxb.a) r10;
        if (r10 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = r10.b;
        r11 = r11 - r0;
        r0 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r11 = r11 / r0;
        r0 = r9.a();
        r2 = r10.a;
        r0 = r0 - r2;
        r2 = 20;
        r10 = 0;
        r4 = 1;
        r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r5 <= 0) goto L_0x0029;
    L_0x0021:
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 <= 0) goto L_0x0029;
    L_0x0027:
        r2 = 1;
        goto L_0x002a;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        if (r2 == 0) goto L_0x009c;
    L_0x002c:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r2;
        r0 = r0 / r11;
        r11 = r9.b;
        r2 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r0 = java.lang.Math.max(r0, r2);
        r12 = r11.c;
        r2 = r11.a;
        r5 = 4603579539044433920; // 0x3fe3333330000000 float:4.656613E-10 double:0.5999999940395355;
        if (r12 <= r2) goto L_0x005f;
    L_0x0043:
        r2 = r11.b;
        r2 = (double) r2;
        r2 = java.lang.Math.log(r2);
        r2 = r2 * r5;
        r5 = 4600877379429072896; // 0x3fd99999a0000000 float:-1.0842022E-19 double:0.4000000059604645;
        r0 = (double) r0;
        r0 = java.lang.Math.log(r0);
        r0 = r0 * r5;
        r2 = r2 + r0;
    L_0x0057:
        r0 = java.lang.Math.exp(r2);
        r0 = (long) r0;
    L_0x005c:
        r11.b = r0;
        goto L_0x0085;
    L_0x005f:
        r12 = r11.c;
        if (r12 <= 0) goto L_0x005c;
    L_0x0063:
        r12 = r11.c;
        r2 = (double) r12;
        java.lang.Double.isNaN(r2);
        r2 = r2 * r5;
        r12 = r11.c;
        r5 = (double) r12;
        r7 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        java.lang.Double.isNaN(r5);
        r5 = r5 + r7;
        r2 = r2 / r5;
        r7 = r7 - r2;
        r5 = r11.b;
        r5 = (double) r5;
        r5 = java.lang.Math.log(r5);
        r2 = r2 * r5;
        r0 = (double) r0;
        r0 = java.lang.Math.log(r0);
        r7 = r7 * r0;
        r2 = r2 + r7;
        goto L_0x0057;
    L_0x0085:
        r12 = r11.c;
        r12 = r12 + r4;
        r11.c = r12;
        r11 = r9.b;
        r11 = r11.b;
        r0 = r9.a;
        if (r0 == 0) goto L_0x009c;
    L_0x0092:
        r1 = r9.m;
        r2 = defpackage.rxa.b.DOWNLOAD;
        if (r1 != r2) goto L_0x0099;
    L_0x0098:
        r10 = 1;
    L_0x0099:
        r0.a(r11, r10);
    L_0x009c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxb.b(java.lang.String, long):void");
    }

    private synchronized boolean b(String str) {
        Long l = (Long) this.h.remove(str);
        if (l != null) {
            this.j -= l.longValue();
        }
        return this.i.remove(str);
    }

    private /* synthetic */ void c(String str) {
        b(str, this.c.d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    private synchronized boolean c(java.lang.String r6, long r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.h;	 Catch:{ all -> 0x0044 }
        r0 = r0.containsKey(r6);	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0017;
    L_0x0009:
        r0 = r5.h;	 Catch:{ all -> 0x0044 }
        r1 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0044 }
        r0.put(r6, r1);	 Catch:{ all -> 0x0044 }
        r0 = r5.j;	 Catch:{ all -> 0x0044 }
        r0 = r0 + r7;
        r5.j = r0;	 Catch:{ all -> 0x0044 }
    L_0x0017:
        r0 = r5.i;	 Catch:{ all -> 0x0044 }
        r0 = r0.contains(r6);	 Catch:{ all -> 0x0044 }
        r1 = 1;
        if (r0 == 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r5);
        return r1;
    L_0x0022:
        r2 = 102400; // 0x19000 float:1.43493E-40 double:5.05923E-319;
        r0 = 0;
        r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0038;
    L_0x002a:
        r7 = r5.j;	 Catch:{ all -> 0x0044 }
        r2 = 204800; // 0x32000 float:2.86986E-40 double:1.011846E-318;
        r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
        if (r4 > 0) goto L_0x0036;
    L_0x0033:
        r7 = r5.k;	 Catch:{ all -> 0x0044 }
        goto L_0x0038;
    L_0x0036:
        r7 = 1;
        goto L_0x0039;
    L_0x0038:
        r7 = 0;
    L_0x0039:
        if (r7 == 0) goto L_0x0042;
    L_0x003b:
        r7 = r5.i;	 Catch:{ all -> 0x0044 }
        r7.add(r6);	 Catch:{ all -> 0x0044 }
        monitor-exit(r5);
        return r1;
    L_0x0042:
        monitor-exit(r5);
        return r0;
    L_0x0044:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxb.c(java.lang.String, long):boolean");
    }

    private /* synthetic */ void d(String str) {
        long d = this.c.d();
        if (this.d.containsKey(str)) {
            a aVar = (a) this.d.get(str);
            Object obj = null;
            if (aVar != null && (d - aVar.b) / 1000000 > 1000) {
                obj = 1;
            }
            if (obj != null) {
                b(str, d);
            }
            return;
        }
        this.d.put(str, new a(a(), d));
    }

    public final void a(String str) {
        if (b(str)) {
            this.l.a(new -$$Lambda$rxb$PcmFff6c8SACgp55TGUacuchX2A(this, str));
        }
    }

    public final void a(String str, long j) {
        if (c(str, j)) {
            this.l.a(new -$$Lambda$rxb$naE4i1AQRn9b2CBRnGNPK-OYbCw(this, str));
        }
    }
}

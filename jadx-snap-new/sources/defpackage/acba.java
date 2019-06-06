package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.acaz.a;
import defpackage.acaz.b;
import defpackage.acaz.c;
import defpackage.acaz.d;
import defpackage.acaz.e;
import defpackage.acaz.f;
import defpackage.acaz.g;
import defpackage.acaz.h;
import defpackage.acaz.i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: acba */
public final class acba implements acay {
    private adie A;
    private adfh B;
    private boolean C;
    private c D;
    private f E;
    private i F;
    private adgw G;
    private adkq H;
    private ListenableFuture I;
    private volatile long J;
    private volatile Uri K;
    private volatile boolean L;
    private volatile a M;
    private final adoe N;
    public adkn a;
    public Surface b;
    volatile int c;
    volatile int d;
    private final ide e;
    private final zfw f;
    private final zgb g;
    private final admb h;
    private final adnj i;
    private final adnv j;
    private final ajei k;
    private final AtomicBoolean l;
    private final abss m;
    private final ilv n;
    private final dib o;
    private final kpc p;
    private final adge q;
    private ajwl<Boolean> r;
    private boolean s;
    private volatile boolean t;
    private boolean u;
    private double v;
    private boolean w;
    private float x;
    private adhl y;
    private adiv z;

    /* renamed from: acba$a */
    enum a {
        INITIALIZED_NO_DATA_SOURCE,
        DATA_SOURCE_SET,
        RELEASED_NO_DATA_SOURCE
    }

    public acba(Context context, adnj adnj, zgb zgb, ilv ilv, dib dib, kpc kpc, adge adge, adoe adoe) {
        Context context2 = context;
        adnj adnj2 = adnj;
        this(adfa.a, adnj2, new adlz(Integer.valueOf(-1)), new adnv(context), zgb, abss.a(), new adie(), ilv, dib, kpc, adge, adoe);
    }

    private acba(ide ide, adnj adnj, admb admb, adnv adnv, zgb zgb, abss abss, adie adie, ilv ilv, dib dib, kpc kpc, adge adge, adoe adoe) {
        ide ide2 = ide;
        this.k = new ajei();
        this.l = new AtomicBoolean(false);
        this.r = ajwl.i(Boolean.FALSE);
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = 1.0d;
        this.w = false;
        this.x = 1.0f;
        this.y = adhl.GLES20;
        this.z = new adii();
        this.C = false;
        this.c = 0;
        this.d = 0;
        this.J = 0;
        this.L = false;
        this.M = a.INITIALIZED_NO_DATA_SOURCE;
        this.e = ide2;
        this.i = adnj;
        this.h = admb;
        this.j = adnv;
        this.g = zgb;
        this.f = zgb.a(ide.callsite("ScMediaPlayer"));
        this.m = abss;
        this.A = adie;
        this.n = ilv;
        this.o = dib;
        this.p = kpc;
        this.q = adge;
        this.N = adoe;
    }

    public acba(ide ide, Context context, adnj adnj, zgb zgb, kpc kpc, adge adge, adoe adoe) {
        Context context2 = context;
        ide ide2 = ide;
        adnj adnj2 = adnj;
        this(ide2, adnj2, new adlz(Integer.valueOf(-1)), new adnv(context), zgb, abss.a(), new adie(), null, null, kpc, adge, adoe);
    }

    private void r() {
        synchronized (this.l) {
            if (this.H != null) {
                this.H = null;
            }
        }
        this.k.a();
        this.r.a();
        this.r = ajwl.i(Boolean.FALSE);
    }

    private /* synthetic */ void s() {
        f fVar = this.E;
        if (fVar != null) {
            fVar.onPrepared(this);
        }
        i iVar = this.F;
        if (iVar != null) {
            iVar.b(this, this.c, this.d);
        }
        abyd.a.incrementAndGet();
    }

    /* JADX WARNING: Missing block: B:26:0x0030, code skipped:
            return;
     */
    public final void a() {
        /*
        r5 = this;
        r0 = r5.l;	 Catch:{ all -> 0x0034 }
        monitor-enter(r0);	 Catch:{ all -> 0x0034 }
        r1 = 0;
        r5.t = r1;	 Catch:{ all -> 0x0031 }
        r2 = r5.H;	 Catch:{ all -> 0x0031 }
        if (r2 != 0) goto L_0x0012;
    L_0x000a:
        r1 = 1;
        r5.C = r1;	 Catch:{ all -> 0x0031 }
        r5.q();	 Catch:{ all -> 0x0031 }
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0012:
        r2 = r5.H;	 Catch:{ all -> 0x0031 }
        r2 = r2.c();	 Catch:{ all -> 0x0031 }
        if (r2 != 0) goto L_0x002f;
    L_0x001a:
        r2 = r5.H;	 Catch:{ all -> 0x0031 }
        r3 = r2.f;	 Catch:{ all -> 0x0031 }
        monitor-enter(r3);	 Catch:{ all -> 0x0031 }
        r4 = r2.e;	 Catch:{ all -> 0x002c }
        if (r4 == 0) goto L_0x0028;
    L_0x0023:
        r4 = r2.e;	 Catch:{ all -> 0x002c }
        r4.g();	 Catch:{ all -> 0x002c }
    L_0x0028:
        r2.a = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r3);	 Catch:{ all -> 0x002c }
        goto L_0x002f;
    L_0x002c:
        r1 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002c }
        throw r1;	 Catch:{ all -> 0x0031 }
    L_0x002f:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        return;
    L_0x0031:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        throw r1;	 Catch:{ all -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acba.a():void");
    }

    public final void a(double d) {
        this.v = d;
        synchronized (this.l) {
            if (this.H != null) {
                this.H.a(d);
            }
        }
    }

    public final void a(float f, float f2) {
        this.x = (f + f2) / 2.0f;
        synchronized (this.l) {
            if (this.H != null) {
                this.H.a(this.x);
            }
        }
    }

    public final void a(int i) {
        synchronized (this.l) {
            if (this.H != null) {
                adkq adkq = this.H;
                synchronized (adkq.f) {
                    if (adkq.e != null) {
                        adkq.e.b(i);
                    } else {
                        adkq.c = i;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b A:{Catch:{ CancellationException | ExecutionException -> 0x0038, TimeoutException -> 0x0033 }} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A:{SYNTHETIC, Splitter:B:15:0x0025} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|(2:13|(2:15|16)(1:17))) */
    public final void a(long r5, boolean r7) {
        /*
        r4 = this;
        r0 = r4.l;
        monitor-enter(r0);
        r1 = 1;
        r4.t = r1;	 Catch:{ all -> 0x003a }
        r2 = r4.H;	 Catch:{ all -> 0x003a }
        if (r2 == 0) goto L_0x0038;
    L_0x000a:
        r2 = r4.H;	 Catch:{ adkc -> 0x0015 }
        r2.d = r7;	 Catch:{ adkc -> 0x0015 }
        r7 = r4.h;	 Catch:{ adkc -> 0x0015 }
        r2 = r4.H;	 Catch:{ adkc -> 0x0015 }
        r7.b(r2);	 Catch:{ adkc -> 0x0015 }
    L_0x0015:
        r7 = r4.I;	 Catch:{ all -> 0x003a }
        if (r7 == 0) goto L_0x0038;
    L_0x0019:
        r2 = 0;
        r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r7 == 0) goto L_0x0038;
    L_0x001f:
        r2 = -1;
        r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r7 >= 0) goto L_0x002b;
    L_0x0025:
        r5 = r4.I;	 Catch:{ CancellationException | ExecutionException -> 0x0038, CancellationException | ExecutionException -> 0x0038, TimeoutException -> 0x0033 }
        com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r5);	 Catch:{ CancellationException | ExecutionException -> 0x0038, CancellationException | ExecutionException -> 0x0038, TimeoutException -> 0x0033 }
        goto L_0x0038;
    L_0x002b:
        r7 = r4.I;	 Catch:{ CancellationException | ExecutionException -> 0x0038, CancellationException | ExecutionException -> 0x0038, TimeoutException -> 0x0033 }
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ CancellationException | ExecutionException -> 0x0038, CancellationException | ExecutionException -> 0x0038, TimeoutException -> 0x0033 }
        com.google.common.util.concurrent.Uninterruptibles.getUninterruptibly(r7, r5, r2);	 Catch:{ CancellationException | ExecutionException -> 0x0038, CancellationException | ExecutionException -> 0x0038, TimeoutException -> 0x0033 }
        goto L_0x0038;
    L_0x0033:
        r5 = r4.I;	 Catch:{ all -> 0x003a }
        r5.cancel(r1);	 Catch:{ all -> 0x003a }
    L_0x0038:
        monitor-exit(r0);	 Catch:{ all -> 0x003a }
        return;
    L_0x003a:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003a }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acba.a(long, boolean):void");
    }

    public final void a(a aVar) {
    }

    public final void a(b bVar) {
    }

    public final void a(c cVar) {
        this.D = cVar;
    }

    public final void a(d dVar) {
    }

    public final void a(e eVar) {
    }

    public final void a(f fVar) {
        this.E = fVar;
    }

    public final void a(g gVar) {
    }

    public final void a(h hVar) {
    }

    public final void a(i iVar) {
        this.F = iVar;
    }

    public final void a(adfh adfh) {
        synchronized (this.l) {
            this.B = adfh;
        }
    }

    public final void a(adie adie) {
        synchronized (this.l) {
            this.A = adie;
        }
    }

    public final void a(adiv adiv) {
        synchronized (this.l) {
            this.z = adiv;
        }
    }

    public final void a(adkn adkn) {
        this.a = adkn;
    }

    public final void a(Context context, Uri uri, Map<String, String> map) {
        if (this.m.c() && uri == null) {
            throw new IllegalStateException("Source uri is set to null, this will crash prepareAsync later");
        }
        if (this.K != null) {
            r();
        }
        this.K = uri;
        this.M = a.DATA_SOURCE_SET;
    }

    public final void a(Surface surface) {
        this.b = surface;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Throwable th) {
        if (this.D != null && !this.t) {
            this.D.a(this, abyh.MEDIA_ERROR_PLAYBACK);
        }
    }

    public final void a(boolean z) {
        this.w = z;
    }

    public final void b() {
        synchronized (this.l) {
            if (this.H != null) {
                this.H.b();
            }
        }
    }

    public final void b(int i) {
    }

    public final void b(boolean z) {
        this.L = z;
        synchronized (this.l) {
            if (this.H != null) {
                this.H.a(z);
            }
        }
    }

    public final void c() {
        this.k.a(this.q.g().b((ajdw) this.f.f()).f(new -$$Lambda$acba$3jLQ8F8mLn3geVIH0s9taZ_tZrY(this, this.K.getPath())).e(new -$$Lambda$acba$Adew2s8huOULRICLBcpLBWdQvrA(this)).a((ajdw) this.f.l()).a(new -$$Lambda$acba$5h5f2qyVmb69261yJix-t6YCgiE(this), new -$$Lambda$pOVRr527NQFKvcyMEHsQPCswDkY(this)));
    }

    public final void c(boolean z) {
        a(3000, z);
    }

    public final void d() {
        r();
        if (this.b != null) {
            this.b = null;
        }
        this.d = 0;
        this.c = 0;
        this.J = 0;
        this.M = a.RELEASED_NO_DATA_SOURCE;
        this.K = null;
        abyd.a.decrementAndGet();
    }

    public final void e() {
        a(0, false);
    }

    public final void f() {
        a(0, false);
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.l) {
            z = this.H != null && this.H.c();
        }
        return z;
    }

    public final int j() {
        return (int) this.J;
    }

    public final int k() {
        synchronized (this.l) {
            if (this.H != null) {
                int a = this.H.a(1);
                return a;
            }
            return 0;
        }
    }

    public final int l() {
        return 0;
    }

    public final void m() {
    }

    public final void n() {
    }

    public final boolean o() {
        return false;
    }

    public final aaun p() {
        return aaun.SC_MEDIA_PLAYER;
    }

    /* Access modifiers changed, original: protected|final */
    public final void q() {
        if (this.K != null && this.b != null) {
            this.k.a(this.r.a((ajdw) this.f.h()).f(new -$$Lambda$acba$97EDwOdgNpM7hkhzKo8QNlliIKQ(this)));
        }
    }

    public final List<Long> v() {
        adkq adkq = this.H;
        return adkq == null ? null : adkq.d();
    }

    public final ajdp<adgw> x() {
        return this.r.k(new -$$Lambda$acba$brKhaIPTy4D1LD271mQGqFFKfzo(this));
    }

    public final void y() {
        this.s = true;
    }
}

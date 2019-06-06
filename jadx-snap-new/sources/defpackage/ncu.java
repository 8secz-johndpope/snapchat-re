package defpackage;

import android.location.Location;
import com.google.common.base.Strings;
import com.google.common.collect.EvictingQueue;
import defpackage.nct.a;
import defpackage.nct.b;
import defpackage.nct.c;
import defpackage.nct.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ncu */
public final class ncu implements nct {
    private final List<WeakReference<a>> A = new ArrayList();
    private final zgc B;
    private final aipn<ndg> C;
    private ajwo<Location> D = new ajwo();
    private AtomicBoolean E = new AtomicBoolean(false);
    final ajdw a;
    final ajwy<nco> b;
    long c;
    boolean d;
    long e;
    final aipn<nce> f;
    final Object g = new Object();
    Location h;
    final EvictingQueue<Location> i = EvictingQueue.create(50);
    final nci j;
    final abpt<ncv> k = new abpt();
    b l;
    private final ncl m = new a(this);
    private final aipn<ncc> n;
    private final aipn<c> o;
    private final abkc p;
    private final aipn<abkd> q;
    private final aipn<ncx> r;
    private final aipn<nbs> s;
    private boolean t;
    private final Object u = new Object();
    private final abkc.a v = new b(this, (byte) 0);
    private final List<Location> w = new ArrayList();
    private ScheduledFuture<?> x;
    private boolean y;
    private boolean z;

    /* renamed from: ncu$a */
    static class a extends ncl {
        private final WeakReference<ncu> b;

        public a(ncu ncu) {
            this.b = new WeakReference(ncu);
        }

        public final Location a() {
            ncu ncu = (ncu) this.b.get();
            return ncu != null ? ncu.a() : null;
        }

        public final void a(ncv ncv) {
            ncu ncu = (ncu) this.b.get();
            if (ncu != null) {
                ncu.k.d(ncv);
            }
        }

        public final void b(ncv ncv) {
            ncu ncu = (ncu) this.b.get();
            if (ncu != null) {
                ncu.k.c(ncv);
            }
        }
    }

    /* renamed from: ncu$b */
    class b implements abkc.a {
        private b() {
        }

        /* synthetic */ b(ncu ncu, byte b) {
            this();
        }

        /* JADX WARNING: Missing block: B:14:0x005e, code skipped:
            if (r4 == null) goto L_0x006d;
     */
        /* JADX WARNING: Missing block: B:16:0x0064, code skipped:
            if (r3.a.l == null) goto L_0x006d;
     */
        /* JADX WARNING: Missing block: B:17:0x0066, code skipped:
            r3.a.l.a(r4);
     */
        /* JADX WARNING: Missing block: B:18:0x006d, code skipped:
            return;
     */
        public final void a(boolean r4, boolean r5, java.lang.Exception r6, defpackage.algp r7) {
            /*
            r3 = this;
            r0 = defpackage.ncu.this;
            monitor-enter(r0);
            r1 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r2 = 0;
            r1.d = r2;	 Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x000c;
        L_0x000a:
            if (r4 == 0) goto L_0x000e;
        L_0x000c:
            if (r6 == 0) goto L_0x002e;
        L_0x000e:
            r4 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
            r6 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r6 = r6.c;	 Catch:{ all -> 0x0083 }
            r1 = 1;
            r6 = r6 << r1;
            r4 = java.lang.Math.min(r4, r6);	 Catch:{ all -> 0x0083 }
            r6 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r6.c = r4;	 Catch:{ all -> 0x0083 }
            r6 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r6 = r6.b;	 Catch:{ all -> 0x0083 }
            r6 = r6.get();	 Catch:{ all -> 0x0083 }
            r6 = (defpackage.nco) r6;	 Catch:{ all -> 0x0083 }
            r6.a(r4);	 Catch:{ all -> 0x0083 }
            r4 = 0;
            goto L_0x005d;
        L_0x002e:
            if (r7 == 0) goto L_0x006e;
        L_0x0030:
            r4 = r7.b;	 Catch:{ all -> 0x0083 }
            r1 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
            r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
            if (r6 > 0) goto L_0x003c;
        L_0x003b:
            goto L_0x006e;
        L_0x003c:
            r4 = r7.b;	 Catch:{ all -> 0x0083 }
            r1 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
            r4 = r4 * r1;
            r4 = java.lang.Math.round(r4);	 Catch:{ all -> 0x0083 }
            r5 = (int) r4;	 Catch:{ all -> 0x0083 }
            r4 = (long) r5;	 Catch:{ all -> 0x0083 }
            r6 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r6.c = r4;	 Catch:{ all -> 0x0083 }
            r6 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r6 = r6.b;	 Catch:{ all -> 0x0083 }
            r6 = r6.get();	 Catch:{ all -> 0x0083 }
            r6 = (defpackage.nco) r6;	 Catch:{ all -> 0x0083 }
            r6.a(r4);	 Catch:{ all -> 0x0083 }
            r4 = r7.a;	 Catch:{ all -> 0x0083 }
        L_0x005d:
            monitor-exit(r0);	 Catch:{ all -> 0x0083 }
            if (r4 == 0) goto L_0x006d;
        L_0x0060:
            r5 = defpackage.ncu.this;
            r5 = r5.l;
            if (r5 == 0) goto L_0x006d;
        L_0x0066:
            r5 = defpackage.ncu.this;
            r5 = r5.l;
            r5.a(r4);
        L_0x006d:
            return;
        L_0x006e:
            r4 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r5 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
            r4.c = r5;	 Catch:{ all -> 0x0083 }
            r4 = defpackage.ncu.this;	 Catch:{ all -> 0x0083 }
            r4 = r4.b;	 Catch:{ all -> 0x0083 }
            r4 = r4.get();	 Catch:{ all -> 0x0083 }
            r4 = (defpackage.nco) r4;	 Catch:{ all -> 0x0083 }
            r4.a(r5);	 Catch:{ all -> 0x0083 }
            monitor-exit(r0);	 Catch:{ all -> 0x0083 }
            return;
        L_0x0083:
            r4 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0083 }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ncu$b.a(boolean, boolean, java.lang.Exception, algp):void");
        }
    }

    /* renamed from: ncu$1 */
    class 1 implements ajej {
        1() {
        }

        private /* synthetic */ void a() {
            ncu ncu = ncu.this;
            ncu.c();
            synchronized (ncu.g) {
                ncu.h = null;
            }
            synchronized (ncu) {
                ncu.i.clear();
                ncu.e = 0;
                ncu.d = false;
                ncu.c = 30000;
                ((nco) ncu.b.get()).a(30000);
            }
            ncu.j.b();
            ((nce) ncu.f.get()).A();
            ((nce) ncu.f.get()).B();
            ((nce) ncu.f.get()).F();
        }

        public final void dispose() {
            ncu.this.a.a(new -$$Lambda$ncu$1$ntgSCN4wVmAnw0F5mS3Bmk_ZUvg(this));
        }

        public final boolean isDisposed() {
            return false;
        }
    }

    public ncu(ajei ajei, aipn<nce> aipn, aipn<ide> aipn2, aipn<abkd> aipn3, aipn<nfx> aipn4, aipn<ncc> aipn5, aipn<d> aipn6, aipn<c> aipn7, aipn<zgb> aipn8, aipn<ncx> aipn9, aipn<ndg> aipn10, aipn<nci> aipn11, aipn<nbs> aipn12, ajwy<nco> ajwy) {
        ajei ajei2 = ajei;
        aipn<nce> aipn13 = aipn;
        this.f = aipn13;
        this.q = aipn3;
        this.o = aipn7;
        aipn<ide> aipn14 = aipn2;
        aipn<nfx> aipn15 = aipn4;
        this.p = new abkc(aipn2, aipn4, aipn8, aipn);
        aipn8.get();
        String str = "UserLocationManagerImpl";
        this.B = zgb.a(((ide) aipn2.get()).callsite(str)).a();
        this.n = aipn5;
        this.r = aipn9;
        aipn8.get();
        this.a = zgb.a(((ide) aipn2.get()).callsite(str)).b();
        this.C = aipn10;
        this.b = ajwy;
        d dVar = (d) aipn6.get();
        ajej f = dVar.b().f(new -$$Lambda$ncu$E3LbIa0icnrQRjWzfho5FnWc9c4(this));
        if (ajei2 != null) {
            ajei.a(f);
        }
        this.j = (nci) aipn11.get();
        nci nci = this.j;
        nci.b = dVar;
        nci.a = new WeakReference(this);
        this.s = aipn12;
        if (ajei2 != null) {
            ajei.a(new 1());
        }
    }

    public static boolean b(Location location) {
        return Math.abs(location.getLatitude()) > 9.999999747378752E-6d || Math.abs(location.getLongitude()) > 9.999999747378752E-6d;
    }

    private synchronized void d(boolean z) {
        if (this.j.a(z) && this.x != null) {
            this.x.cancel(true);
            int a = this.j.a();
            if (((nbs) this.s.get()).a()) {
                a = ((nbs) this.s.get()).b();
            }
            this.x = this.B.scheduleAtFixedRate(this.j, 0, (long) a, TimeUnit.MILLISECONDS);
        }
    }

    public final Location a() {
        Location location;
        synchronized (this.g) {
            location = this.h;
        }
        return location;
    }

    public final synchronized void a(Location location) {
        this.i.add(location);
    }

    public final void a(final WeakReference<a> weakReference) {
        Location location;
        synchronized (this.g) {
            location = this.h;
        }
        synchronized (this.u) {
            if (location != null) {
                weakReference.get();
                abmr.a(new Runnable() {
                    public final void run() {
                        a aVar = (a) weakReference.get();
                        if (aVar != null) {
                            Location location;
                            synchronized (ncu.this.g) {
                                location = ncu.this.h;
                            }
                            aVar.a(location);
                        }
                    }
                });
            } else {
                abmr.a(new Runnable() {
                    public final void run() {
                        a aVar = (a) weakReference.get();
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                });
                this.A.add(weakReference);
            }
        }
    }

    public final void a(b bVar) {
        this.l = bVar;
    }

    public final void a(boolean z) {
        synchronized (this) {
            if (z) {
                this.c = 5000;
                ((nco) this.b.get()).a(5000);
            }
        }
        d(z);
        if (this.r.get() instanceof ncj) {
            ((ncj) this.r.get()).a.a(Boolean.valueOf(z));
        }
    }

    public final synchronized void b() {
        this.e = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(this.i);
        this.i.clear();
        this.d = true;
        nby nby = new nby(arrayList, this.t);
        this.t = false;
        abkc abkc = this.p;
        wjg a = ((c) this.o.get()).a();
        abkc.a aVar = this.v;
        abkd abkd = (abkd) this.q.get();
        abkc.d.get();
        algo a2 = abkd.a(0, nby);
        if (a2 != null) {
            HashMap hashMap = new HashMap();
            String q = ((nce) abkc.d.get()).q();
            if (!Strings.isNullOrEmpty(q)) {
                hashMap.put("x-snapchat-personal-version", q);
            }
            ngm ngm = new ngm(aVar);
            if (a != null) {
                a.a(wjd.LOCATION_SPRINKLER, new nfy((ide) abkc.a.get(), hashMap, a2, ngm, (nfx) abkc.b.get(), (zgb) abkc.c.get()));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x008d in {6, 16, 18, 20, 25, 26, 29, 33, 37} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void b(boolean r9) {
        /*
        r8 = this;
        r8.a(r9);
        monitor-enter(r8);
        r0 = r8.z;	 Catch:{ all -> 0x008a }
        if (r0 != 0) goto L_0x000a;	 Catch:{ all -> 0x008a }
        monitor-exit(r8);	 Catch:{ all -> 0x008a }
        return;	 Catch:{ all -> 0x008a }
        monitor-exit(r8);	 Catch:{ all -> 0x008a }
        r0 = r8.C;
        r0 = r0.get();
        r0 = (defpackage.ndg) r0;
        r1 = "UserLocationManagerImpl";
        r0.a(r1);
        monitor-enter(r8);
        r0 = r8.y;	 Catch:{ all -> 0x0087 }
        if (r0 == 0) goto L_0x002b;	 Catch:{ all -> 0x0087 }
        r0 = r8.j;	 Catch:{ all -> 0x0087 }
        r0 = r0.a();	 Catch:{ all -> 0x0087 }
        r1 = defpackage.nci.b(r9);	 Catch:{ all -> 0x0087 }
        if (r0 != r1) goto L_0x002b;	 Catch:{ all -> 0x0087 }
        monitor-exit(r8);	 Catch:{ all -> 0x0087 }
        return;	 Catch:{ all -> 0x0087 }
        if (r9 == 0) goto L_0x003d;	 Catch:{ all -> 0x0087 }
        r0 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ all -> 0x0087 }
        r8.c = r0;	 Catch:{ all -> 0x0087 }
        r2 = r8.b;	 Catch:{ all -> 0x0087 }
        r2 = r2.get();	 Catch:{ all -> 0x0087 }
        r2 = (defpackage.nco) r2;	 Catch:{ all -> 0x0087 }
        r2.a(r0);	 Catch:{ all -> 0x0087 }
        goto L_0x004a;	 Catch:{ all -> 0x0087 }
        r0 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;	 Catch:{ all -> 0x0087 }
        r8.c = r0;	 Catch:{ all -> 0x0087 }
        r2 = r8.b;	 Catch:{ all -> 0x0087 }
        r2 = r2.get();	 Catch:{ all -> 0x0087 }
        r2 = (defpackage.nco) r2;	 Catch:{ all -> 0x0087 }
        goto L_0x0039;	 Catch:{ all -> 0x0087 }
        r0 = 0;	 Catch:{ all -> 0x0087 }
        r8.e = r0;	 Catch:{ all -> 0x0087 }
        r0 = r8.y;	 Catch:{ all -> 0x0087 }
        if (r0 != 0) goto L_0x0082;	 Catch:{ all -> 0x0087 }
        r0 = 1;	 Catch:{ all -> 0x0087 }
        r8.t = r0;	 Catch:{ all -> 0x0087 }
        r8.y = r0;	 Catch:{ all -> 0x0087 }
        r0 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;	 Catch:{ all -> 0x0087 }
        r1 = r8.s;	 Catch:{ all -> 0x0087 }
        r1 = r1.get();	 Catch:{ all -> 0x0087 }
        r1 = (defpackage.nbs) r1;	 Catch:{ all -> 0x0087 }
        r1 = r1.a();	 Catch:{ all -> 0x0087 }
        if (r1 == 0) goto L_0x0073;	 Catch:{ all -> 0x0087 }
        r0 = r8.s;	 Catch:{ all -> 0x0087 }
        r0 = r0.get();	 Catch:{ all -> 0x0087 }
        r0 = (defpackage.nbs) r0;	 Catch:{ all -> 0x0087 }
        r0 = r0.b();	 Catch:{ all -> 0x0087 }
        r1 = r8.B;	 Catch:{ all -> 0x0087 }
        r2 = r8.j;	 Catch:{ all -> 0x0087 }
        r3 = 0;	 Catch:{ all -> 0x0087 }
        r5 = (long) r0;	 Catch:{ all -> 0x0087 }
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x0087 }
        r0 = r1.scheduleAtFixedRate(r2, r3, r5, r7);	 Catch:{ all -> 0x0087 }
        r8.x = r0;	 Catch:{ all -> 0x0087 }
        monitor-exit(r8);	 Catch:{ all -> 0x0087 }
        r8.d(r9);
        return;
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0087 }
        throw r9;
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x008a }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncu.b(boolean):void");
    }

    public final void c() {
        a(false);
        ((ndg) this.C.get()).b("UserLocationManagerImpl");
        synchronized (this) {
            if (this.y) {
                this.y = false;
                if (this.x != null) {
                    this.x.cancel(true);
                    this.x = null;
                }
                this.j.b();
            }
        }
        synchronized (this.g) {
            if (this.h != null) {
                nce nce = (nce) this.f.get();
                float[] fArr = new float[1];
                Location.distanceBetween((double) nce.n(), (double) nce.o(), this.h.getLatitude(), this.h.getLongitude(), fArr);
                if (fArr[0] > 5.0f) {
                    nce.a((float) this.h.getLatitude());
                    nce.b((float) this.h.getLongitude());
                    nce.G();
                }
            }
        }
    }

    public final synchronized void c(boolean z) {
        this.z = z;
    }

    public final boolean d() {
        return ((ncc) this.n.get()).a();
    }

    public final void e() {
        ncl.a = this.m;
    }

    public final ajdp<Location> f() {
        return this.D;
    }

    public final void g() {
        this.E.set(true);
    }

    public final boolean h() {
        return this.E.get();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void i() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.t) {
            currentTimeMillis -= this.e;
            Object obj = 1;
            Object obj2 = (!this.d || currentTimeMillis >= 60000) ? null : 1;
            if (currentTimeMillis < this.c) {
                obj = null;
            }
            if (obj2 == null) {
                if (obj == null) {
                    return;
                }
            }
            return;
        }
        b();
    }
}

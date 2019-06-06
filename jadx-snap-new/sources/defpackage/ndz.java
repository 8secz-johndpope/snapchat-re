package defpackage;

import android.location.Location;
import android.os.SystemClock;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import defpackage.ndo.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@Deprecated
/* renamed from: ndz */
public final class ndz implements abos, b {
    private static final Function<Location, Long> a = new 1();
    private final CopyOnWriteArraySet<a> b = new CopyOnWriteArraySet();
    private final ajei c;
    private final ncx d;
    private final AtomicReference<abpt<ndo>> e = new AtomicReference(new abpt());
    private final ndn f;
    private final ief g;
    private final nde h;
    private final ncc i;
    private final ajdw j;
    private final ndm k;
    private final AtomicReference<nbt> l = new AtomicReference();
    private final Object m = new Object();
    private long n = -1;
    private UUID o = null;
    private final AtomicReference<Location> p = new AtomicReference();
    private final AtomicReference<ajej> q = new AtomicReference();
    private final AtomicReference<ajej> r = new AtomicReference();
    private final AtomicReference<ajej> s = new AtomicReference();
    private boolean t = false;
    private final abss u;

    /* renamed from: ndz$a */
    public interface a {
        void a(Location location);
    }

    /* renamed from: ndz$1 */
    static class 1 implements Function<Location, Long> {
        1() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return Long.valueOf(((Location) obj).getTime());
        }
    }

    static {
        abqo abqo = new abqo();
    }

    public ndz(abss abss, nde nde, ndn ndn, ief ief, ncc ncc, ide ide, ndm ndm, ncx ncx, ajei ajei) {
        this.k = ndm;
        this.h = nde;
        this.f = ndn;
        this.u = abss;
        this.g = ief;
        this.i = ncc;
        this.j = zgb.a(ide.callsite("UserCurrentLocationProvider")).b();
        this.d = ncx;
        this.c = ajei;
        e();
    }

    private synchronized void a(ncc ncc) {
        abmr.a("This method must not be called from the Main Thread.");
        ajej ajej = (ajej) this.q.get();
        if (ajej != null && ajej.isDisposed()) {
            e();
        }
        if (ncc.a()) {
            if (((abpt) this.e.get()).c()) {
                f();
            }
            h();
            synchronized (this.m) {
                j();
                this.o = abpu.a();
                this.n = System.currentTimeMillis();
            }
            this.t = true;
        }
    }

    private synchronized void a(boolean z) {
        this.k.a(z);
        b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x009a in {2, 11, 22, 25, 28, 29, 33, 36, 39} preds:[]
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
    private android.location.Location b(defpackage.ncc r8) {
        /*
        r7 = this;
        r0 = "This method must not be called from the Main Thread.";
        defpackage.abmr.a(r0);
        r8 = r8.a();
        r0 = 0;
        if (r8 != 0) goto L_0x000d;
        return r0;
        r8 = r7.p;
        monitor-enter(r8);
        r1 = r7.p;	 Catch:{ all -> 0x0097 }
        r1 = r1.get();	 Catch:{ all -> 0x0097 }
        r1 = (android.location.Location) r1;	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x0022;	 Catch:{ all -> 0x0097 }
        r2 = defpackage.ndz.b(r1);	 Catch:{ all -> 0x0097 }
        if (r2 == 0) goto L_0x0022;	 Catch:{ all -> 0x0097 }
        monitor-exit(r8);	 Catch:{ all -> 0x0097 }
        return r1;	 Catch:{ all -> 0x0097 }
        r1 = new java.util.TreeSet;	 Catch:{ all -> 0x0097 }
        r1.<init>();	 Catch:{ all -> 0x0097 }
        r2 = r7.e;	 Catch:{ all -> 0x0097 }
        r2 = r2.get();	 Catch:{ all -> 0x0097 }
        r2 = (defpackage.abpt) r2;	 Catch:{ all -> 0x0097 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0097 }
        r3 = r2.hasNext();	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x007f;	 Catch:{ all -> 0x0097 }
        r3 = r2.next();	 Catch:{ all -> 0x0097 }
        r3 = (defpackage.ndo) r3;	 Catch:{ all -> 0x0097 }
        r4 = r3.c();	 Catch:{ all -> 0x0097 }
        if (r4 == 0) goto L_0x0033;	 Catch:{ all -> 0x0097 }
        r5 = defpackage.ndz.b(r4);	 Catch:{ all -> 0x0097 }
        if (r5 == 0) goto L_0x0033;	 Catch:{ all -> 0x0097 }
        r3 = r3.f();	 Catch:{ all -> 0x0097 }
        if (r0 == 0) goto L_0x005d;	 Catch:{ all -> 0x0097 }
        r5 = r4.getAccuracy();	 Catch:{ all -> 0x0097 }
        r6 = r0.getAccuracy();	 Catch:{ all -> 0x0097 }
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));	 Catch:{ all -> 0x0097 }
        if (r5 >= 0) goto L_0x0033;	 Catch:{ all -> 0x0097 }
        r0 = r4.getAccuracy();	 Catch:{ all -> 0x0097 }
        r5 = r4.getAccuracy();	 Catch:{ all -> 0x0097 }
        r0 = r0 - r5;	 Catch:{ all -> 0x0097 }
        r0 = java.lang.Math.abs(r0);	 Catch:{ all -> 0x0097 }
        r5 = 925353388; // 0x3727c5ac float:1.0E-5 double:4.571853193E-315;	 Catch:{ all -> 0x0097 }
        r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1));	 Catch:{ all -> 0x0097 }
        if (r0 <= 0) goto L_0x0074;	 Catch:{ all -> 0x0097 }
        r1.clear();	 Catch:{ all -> 0x0097 }
        r0 = android.text.TextUtils.isEmpty(r3);	 Catch:{ all -> 0x0097 }
        if (r0 != 0) goto L_0x007d;	 Catch:{ all -> 0x0097 }
        r1.add(r3);	 Catch:{ all -> 0x0097 }
        r0 = r4;	 Catch:{ all -> 0x0097 }
        goto L_0x0033;	 Catch:{ all -> 0x0097 }
        if (r0 == 0) goto L_0x0090;	 Catch:{ all -> 0x0097 }
        r2 = r1.isEmpty();	 Catch:{ all -> 0x0097 }
        if (r2 != 0) goto L_0x0090;	 Catch:{ all -> 0x0097 }
        r2 = ";";	 Catch:{ all -> 0x0097 }
        r1 = defpackage.abps.a(r1, r2);	 Catch:{ all -> 0x0097 }
        r0.setProvider(r1);	 Catch:{ all -> 0x0097 }
        r1 = r7.p;	 Catch:{ all -> 0x0097 }
        r1.set(r0);	 Catch:{ all -> 0x0097 }
        monitor-exit(r8);	 Catch:{ all -> 0x0097 }
        return r0;	 Catch:{ all -> 0x0097 }
        r0 = move-exception;	 Catch:{ all -> 0x0097 }
        monitor-exit(r8);	 Catch:{ all -> 0x0097 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndz.b(ncc):android.location.Location");
    }

    private static boolean b(Location location) {
        return SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos() < 600000000000L;
    }

    private void e() {
        ncx ncx = this.d;
        if (ncx != null) {
            ajej a = ncx.a().j(ajfu.a).a(this.j).a(new -$$Lambda$ndz$e_jxMaefXSLMM5aRgSqE63T1byQ(this), -$$Lambda$ndz$EDpwWW4ddSQWuPCKL06vZ9sxLEo.INSTANCE);
            this.q.set(a);
            this.c.a(a);
        }
    }

    private void f() {
        this.e.set(this.k.a());
        Iterator it = ((abpt) this.e.get()).iterator();
        while (it.hasNext()) {
            ndo ndo = (ndo) it.next();
            ndo.a((b) this);
            ndo.a((nbt) this.l.get());
        }
    }

    private void g() {
        Iterator it = ((abpt) this.e.get()).iterator();
        while (it.hasNext()) {
            ((ndo) it.next()).b((b) this);
        }
    }

    private void h() {
        Iterator it = ((abpt) this.e.get()).iterator();
        while (it.hasNext()) {
            ((ndo) it.next()).b();
        }
    }

    private void i() {
        Iterator it = ((abpt) this.e.get()).iterator();
        while (it.hasNext()) {
            ((ndo) it.next()).a();
        }
    }

    private void j() {
        if (this.n != -1) {
            System.currentTimeMillis();
            this.n = -1;
        }
    }

    public final Location a() {
        return b(this.i);
    }

    public final ImmutableList<Location> a(TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((abpt) this.e.get()).iterator();
        while (it.hasNext()) {
            arrayList.add(((ndo) it.next()).e());
        }
        long currentTimeMillis = System.currentTimeMillis() - timeUnit.toMillis(30);
        Ordering onResultOf = Ordering.natural().onResultOf(a);
        Builder builder = new Builder();
        for (Object obj : Iterables.mergeSorted(arrayList, onResultOf)) {
            if (obj.getTime() - currentTimeMillis > 1000) {
                currentTimeMillis = obj.getTime();
                builder.add(obj);
            }
        }
        return builder.build();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:50:0x00e5 in {5, 6, 10, 11, 15, 16, 20, 21, 22, 27, 30, 31, 34, 35, 36, 39, 43, 44, 46, 49} preds:[]
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
    public final void a(android.location.Location r12) {
        /*
        r11 = this;
        r0 = r11.p;
        monitor-enter(r0);
        r1 = r11.p;	 Catch:{ all -> 0x00e2 }
        r1 = r1.get();	 Catch:{ all -> 0x00e2 }
        r2 = 1;	 Catch:{ all -> 0x00e2 }
        r3 = 0;	 Catch:{ all -> 0x00e2 }
        if (r1 != 0) goto L_0x000f;	 Catch:{ all -> 0x00e2 }
        r1 = 1;	 Catch:{ all -> 0x00e2 }
        goto L_0x0010;	 Catch:{ all -> 0x00e2 }
        r1 = 0;	 Catch:{ all -> 0x00e2 }
        if (r1 != 0) goto L_0x00b7;	 Catch:{ all -> 0x00e2 }
        r4 = r12.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00e2 }
        r1 = r11.p;	 Catch:{ all -> 0x00e2 }
        r1 = r1.get();	 Catch:{ all -> 0x00e2 }
        r1 = (android.location.Location) r1;	 Catch:{ all -> 0x00e2 }
        r6 = r1.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00e2 }
        r4 = r4 - r6;	 Catch:{ all -> 0x00e2 }
        r6 = 60000000000; // 0xdf8475800 float:-1.6172686E34 double:2.96439387505E-313;	 Catch:{ all -> 0x00e2 }
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x00e2 }
        if (r1 <= 0) goto L_0x002e;	 Catch:{ all -> 0x00e2 }
        r1 = 1;	 Catch:{ all -> 0x00e2 }
        goto L_0x002f;	 Catch:{ all -> 0x00e2 }
        r1 = 0;	 Catch:{ all -> 0x00e2 }
        if (r1 != 0) goto L_0x00b7;	 Catch:{ all -> 0x00e2 }
        r1 = r11.p;	 Catch:{ all -> 0x00e2 }
        r1 = r1.get();	 Catch:{ all -> 0x00e2 }
        r1 = (android.location.Location) r1;	 Catch:{ all -> 0x00e2 }
        r1 = r12.distanceTo(r1);	 Catch:{ all -> 0x00e2 }
        r4 = (double) r1;	 Catch:{ all -> 0x00e2 }
        r6 = 4613937818241073152; // 0x4008000000000000 float:0.0 double:3.0;	 Catch:{ all -> 0x00e2 }
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x00e2 }
        if (r1 <= 0) goto L_0x0046;	 Catch:{ all -> 0x00e2 }
        r1 = 1;	 Catch:{ all -> 0x00e2 }
        goto L_0x0047;	 Catch:{ all -> 0x00e2 }
        r1 = 0;	 Catch:{ all -> 0x00e2 }
        if (r1 != 0) goto L_0x0070;	 Catch:{ all -> 0x00e2 }
        r12.getAccuracy();	 Catch:{ all -> 0x00e2 }
        r1 = r11.p;	 Catch:{ all -> 0x00e2 }
        r1 = r1.get();	 Catch:{ all -> 0x00e2 }
        r1 = (android.location.Location) r1;	 Catch:{ all -> 0x00e2 }
        r1.getAccuracy();	 Catch:{ all -> 0x00e2 }
        r1 = r12.getAccuracy();	 Catch:{ all -> 0x00e2 }
        r4 = r11.p;	 Catch:{ all -> 0x00e2 }
        r4 = r4.get();	 Catch:{ all -> 0x00e2 }
        r4 = (android.location.Location) r4;	 Catch:{ all -> 0x00e2 }
        r4 = r4.getAccuracy();	 Catch:{ all -> 0x00e2 }
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));	 Catch:{ all -> 0x00e2 }
        if (r1 >= 0) goto L_0x006d;	 Catch:{ all -> 0x00e2 }
        r1 = 1;	 Catch:{ all -> 0x00e2 }
        goto L_0x006e;	 Catch:{ all -> 0x00e2 }
        r1 = 0;	 Catch:{ all -> 0x00e2 }
        if (r1 == 0) goto L_0x00e0;	 Catch:{ all -> 0x00e2 }
        r1 = r11.p;	 Catch:{ all -> 0x00e2 }
        r1 = r1.get();	 Catch:{ all -> 0x00e2 }
        r1 = (android.location.Location) r1;	 Catch:{ all -> 0x00e2 }
        r4 = r12.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00e2 }
        r6 = 0;	 Catch:{ all -> 0x00e2 }
        r8 = 0;	 Catch:{ all -> 0x00e2 }
        r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x00e2 }
        if (r9 != 0) goto L_0x008c;	 Catch:{ all -> 0x00e2 }
        r4 = r1.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00e2 }
        r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x00e2 }
        if (r9 != 0) goto L_0x008c;	 Catch:{ all -> 0x00e2 }
        goto L_0x00a9;	 Catch:{ all -> 0x00e2 }
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x00e2 }
        r5 = r12.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00e2 }
        r9 = r1.getElapsedRealtimeNanos();	 Catch:{ all -> 0x00e2 }
        r5 = r5 - r9;	 Catch:{ all -> 0x00e2 }
        r7 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x00e2 }
        r4 = r4.convert(r5, r7);	 Catch:{ all -> 0x00e2 }
        r4 = (float) r4;	 Catch:{ all -> 0x00e2 }
        r5 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));	 Catch:{ all -> 0x00e2 }
        if (r5 != 0) goto L_0x00a3;	 Catch:{ all -> 0x00e2 }
        goto L_0x00a9;	 Catch:{ all -> 0x00e2 }
        r1 = r12.distanceTo(r1);	 Catch:{ all -> 0x00e2 }
        r8 = r1 / r4;	 Catch:{ all -> 0x00e2 }
        r4 = (double) r8;	 Catch:{ all -> 0x00e2 }
        r6 = 4589496314688972224; // 0x3fb12a94ff0025c0 float:-1.703372E38 double:0.067056;	 Catch:{ all -> 0x00e2 }
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x00e2 }
        if (r1 >= 0) goto L_0x00b4;	 Catch:{ all -> 0x00e2 }
        goto L_0x00b5;	 Catch:{ all -> 0x00e2 }
        r2 = 0;	 Catch:{ all -> 0x00e2 }
        if (r2 == 0) goto L_0x00e0;	 Catch:{ all -> 0x00e2 }
        r1 = r11.p;	 Catch:{ all -> 0x00e2 }
        r1 = r1.get();	 Catch:{ all -> 0x00e2 }
        if (r1 == 0) goto L_0x00c5;	 Catch:{ all -> 0x00e2 }
        r1 = r11.p;	 Catch:{ all -> 0x00e2 }
        r2 = 0;	 Catch:{ all -> 0x00e2 }
        r1.set(r2);	 Catch:{ all -> 0x00e2 }
        r1 = r11.b;	 Catch:{ all -> 0x00e2 }
        r1 = r1.iterator();	 Catch:{ all -> 0x00e2 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x00e2 }
        if (r2 == 0) goto L_0x00db;	 Catch:{ all -> 0x00e2 }
        r2 = r1.next();	 Catch:{ all -> 0x00e2 }
        r2 = (defpackage.ndz.a) r2;	 Catch:{ all -> 0x00e2 }
        r2.a(r12);	 Catch:{ all -> 0x00e2 }
        goto L_0x00cb;	 Catch:{ all -> 0x00e2 }
        r1 = r11.h;	 Catch:{ all -> 0x00e2 }
        r1.a(r12);	 Catch:{ all -> 0x00e2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00e2 }
        return;	 Catch:{ all -> 0x00e2 }
        r12 = move-exception;	 Catch:{ all -> 0x00e2 }
        monitor-exit(r0);	 Catch:{ all -> 0x00e2 }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndz.a(android.location.Location):void");
    }

    public final synchronized void a(StringBuilder stringBuilder) {
        stringBuilder.append("UserCurrentLocationProvider");
        stringBuilder.append("isLocationStarted [");
        stringBuilder.append(this.t);
        stringBuilder.append("]");
        stringBuilder.append("\n");
        stringBuilder.append("mLocationListeners size [");
        stringBuilder.append(((abpt) this.e.get()).b());
        stringBuilder.append("]");
        stringBuilder.append("\n");
        stringBuilder.append("mOnLocationChangedCallbackSet size [");
        stringBuilder.append(this.b.size());
        stringBuilder.append("]");
        stringBuilder.append("\n");
    }

    public final void a(a aVar) {
        this.b.add(aVar);
    }

    public final synchronized void b() {
        if (!this.i.a()) {
            return;
        }
        if (this.t) {
            i();
            g();
            f();
            h();
        }
    }

    public final void b(a aVar) {
        this.b.remove(aVar);
    }

    public final synchronized void c() {
        a(this.i);
    }

    public final synchronized void d() {
        abmr.a("This method must not be called from the Main Thread.");
        synchronized (this.m) {
            j();
        }
        abmr.a("This method must not be called from the Main Thread.");
        i();
        g();
        this.t = false;
    }
}

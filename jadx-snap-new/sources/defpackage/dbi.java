package defpackage;

import android.os.SystemClock;
import com.google.common.util.concurrent.AtomicLongMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dbi */
public class dbi extends dat<dbk> {
    final AtomicInteger a = new AtomicInteger(0);
    final AtomicLong b = new AtomicLong(0);
    final AtomicLongMap<String> c;
    volatile boolean d = true;
    private final a e = new a(0);
    private final a f = new a(10);
    private final abqo g;
    private final AtomicInteger h = new AtomicInteger(0);
    private final ajdw i;
    private final AtomicLongMap<String> j;
    private final Map<String, Long> k;
    private final ajwy<ifa> l;
    private final ajdw m;
    private ajej n;
    private final AtomicReference<ajej> o;
    private long p = -1;
    private long q = -1;

    /* renamed from: dbi$a */
    static final class a {
        final int a;
        final AtomicReference<b> b = new AtomicReference(new b(0, 0, 0, (byte) 0));
        final AtomicInteger c = new AtomicInteger();

        /* renamed from: dbi$a$b */
        static class b {
            final long a;
            final long b;
            final long c;

            private b(long j, long j2, long j3) {
                this.a = j;
                this.b = j2;
                this.c = j3;
            }

            /* synthetic */ b(long j, long j2, long j3, byte b) {
                this(j, j2, j3);
            }
        }

        /* renamed from: dbi$a$a */
        static class a {
            final long a;
            final long b;

            a(b bVar) {
                this.a = bVar.b;
                this.b = bVar.c;
            }
        }

        public a(int i) {
            this.a = i;
        }

        private b a(long j, long j2, b bVar) {
            long j3 = j2;
            b bVar2 = bVar;
            long j4 = bVar2.a;
            long j5 = j4 - ((long) this.a);
            long j6 = j3 > j5 ? 1 : 0;
            long max = Math.max(j, j5);
            j3 = Math.max(j3, j5);
            j5 = bVar2.b;
            long j7 = bVar2.c;
            j6 = Math.max(j3 - max, j6);
            max = max < j4 ? j3 < j4 ? (((long) this.a) - j6) - (j4 - j3) : ((long) this.a) - (j4 - max) : (long) this.a;
            return new b(j3 + ((long) this.a), j5 + j6, j7 + max, (byte) 0);
        }

        public final long a(long j, long j2) {
            b bVar;
            j = TimeUnit.MILLISECONDS.toSeconds(j);
            j2 = TimeUnit.MILLISECONDS.toSeconds(j2);
            boolean z = false;
            do {
                bVar = (b) this.b.get();
                b a = a(j, j2, bVar);
                if (bVar.a >= a.a) {
                    break;
                }
                z = this.b.compareAndSet(bVar, a);
            } while (!z);
            if (!z) {
                return 0;
            }
            if (bVar.a <= j) {
                this.c.getAndIncrement();
            }
            return bVar.b + bVar.c;
        }
    }

    protected dbi(ajwy<ifa> ajwy, abqo abqo) {
        this.g = abqo;
        this.c = AtomicLongMap.create();
        this.j = AtomicLongMap.create();
        this.k = new HashMap();
        this.o = new AtomicReference();
        this.l = ajwy;
        String str = "RadioStateCollectorBasicImpl";
        this.i = zgb.a(dad.a.callsite(str)).d();
        this.m = zgb.a(dad.a.callsite(str)).j();
        this.n = ajfq.INSTANCE;
    }

    private static String a(String str) {
        try {
            str = new URL(str).getPath();
            if (str != null) {
                int i = 30;
                if (str.length() >= 30) {
                    int indexOf = str.indexOf(47, 1);
                    if (indexOf != -1) {
                        i = Math.min(indexOf, 30);
                    }
                    str = str.substring(0, i);
                }
            }
            return str == null ? "UNKNOWN" : str;
        } catch (MalformedURLException unused) {
            return str;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x009b in {5, 6, 9, 10, 16, 17, 20, 21, 23, 25} preds:[]
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
    private void a(defpackage.dbi.a r6, long r7, long r9) {
        /*
        r5 = this;
        r0 = r6.a;	 Catch:{ all -> 0x0099 }
        if (r0 <= 0) goto L_0x0095;	 Catch:{ all -> 0x0099 }
        r0 = r5.p;	 Catch:{ all -> 0x0099 }
        r2 = -1;	 Catch:{ all -> 0x0099 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ all -> 0x0099 }
        if (r4 != 0) goto L_0x000d;	 Catch:{ all -> 0x0099 }
        goto L_0x0013;	 Catch:{ all -> 0x0099 }
        r0 = r5.p;	 Catch:{ all -> 0x0099 }
        r7 = java.lang.Math.min(r0, r7);	 Catch:{ all -> 0x0099 }
        r5.p = r7;	 Catch:{ all -> 0x0099 }
        r7 = r5.q;	 Catch:{ all -> 0x0099 }
        r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));	 Catch:{ all -> 0x0099 }
        if (r0 != 0) goto L_0x001c;	 Catch:{ all -> 0x0099 }
        goto L_0x0022;	 Catch:{ all -> 0x0099 }
        r7 = r5.q;	 Catch:{ all -> 0x0099 }
        r9 = java.lang.Math.max(r7, r9);	 Catch:{ all -> 0x0099 }
        r5.q = r9;	 Catch:{ all -> 0x0099 }
        r7 = new java.util.HashMap;	 Catch:{ all -> 0x0099 }
        r8 = r5.c;	 Catch:{ all -> 0x0099 }
        r8 = r8.asMap();	 Catch:{ all -> 0x0099 }
        r7.<init>(r8);	 Catch:{ all -> 0x0099 }
        r8 = r5.c;	 Catch:{ all -> 0x0099 }
        r8.clear();	 Catch:{ all -> 0x0099 }
        r7 = r7.entrySet();	 Catch:{ all -> 0x0099 }
        r7 = r7.iterator();	 Catch:{ all -> 0x0099 }
        r8 = r7.hasNext();	 Catch:{ all -> 0x0099 }
        if (r8 == 0) goto L_0x0077;	 Catch:{ all -> 0x0099 }
        r8 = r7.next();	 Catch:{ all -> 0x0099 }
        r8 = (java.util.Map.Entry) r8;	 Catch:{ all -> 0x0099 }
        r9 = r8.getKey();	 Catch:{ all -> 0x0099 }
        r9 = (java.lang.String) r9;	 Catch:{ all -> 0x0099 }
        r8 = r8.getValue();	 Catch:{ all -> 0x0099 }
        r8 = (java.lang.Long) r8;	 Catch:{ all -> 0x0099 }
        r10 = r5.k;	 Catch:{ all -> 0x0099 }
        r10 = r10.get(r9);	 Catch:{ all -> 0x0099 }
        r10 = (java.lang.Long) r10;	 Catch:{ all -> 0x0099 }
        if (r10 != 0) goto L_0x0064;	 Catch:{ all -> 0x0099 }
        r10 = r5.k;	 Catch:{ all -> 0x0099 }
        r10.put(r9, r8);	 Catch:{ all -> 0x0099 }
        goto L_0x003c;	 Catch:{ all -> 0x0099 }
        r0 = r5.k;	 Catch:{ all -> 0x0099 }
        r1 = r10.longValue();	 Catch:{ all -> 0x0099 }
        r3 = r8.longValue();	 Catch:{ all -> 0x0099 }
        r1 = r1 + r3;	 Catch:{ all -> 0x0099 }
        r8 = java.lang.Long.valueOf(r1);	 Catch:{ all -> 0x0099 }
        r0.put(r9, r8);	 Catch:{ all -> 0x0099 }
        goto L_0x003c;	 Catch:{ all -> 0x0099 }
        r7 = r5.o;	 Catch:{ all -> 0x0099 }
        r8 = r5.i;	 Catch:{ all -> 0x0099 }
        r9 = new -$$Lambda$dbi$_0TbqsROefqEWjLHzSDb-KHfuGU;	 Catch:{ all -> 0x0099 }
        r9.<init>(r5, r6);	 Catch:{ all -> 0x0099 }
        r6 = r6.a;	 Catch:{ all -> 0x0099 }
        r0 = (long) r6;	 Catch:{ all -> 0x0099 }
        r6 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0099 }
        r6 = r8.a(r9, r0, r6);	 Catch:{ all -> 0x0099 }
        r6 = r7.getAndSet(r6);	 Catch:{ all -> 0x0099 }
        r6 = (defpackage.ajej) r6;	 Catch:{ all -> 0x0099 }
        if (r6 == 0) goto L_0x0094;	 Catch:{ all -> 0x0099 }
        r6.dispose();	 Catch:{ all -> 0x0099 }
        return;	 Catch:{ all -> 0x0099 }
        r6.a(r7, r9);	 Catch:{ all -> 0x0099 }
        return;
        r6 = move-exception;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbi.a(dbi$a, long, long):void");
    }

    private /* synthetic */ void b(a aVar, long j, long j2) {
        a(aVar, j, j2);
    }

    private /* synthetic */ void c(a aVar, long j, long j2) {
        a(aVar, j, j2);
    }

    private a h() {
        if (this.h.get() != 1) {
            this.d = true;
            return this.f;
        }
        this.d = false;
        return this.e;
    }

    public String a(Map<String, Long> map) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Entry entry : map.entrySet()) {
            stringBuilder.append('\"');
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("\":");
            stringBuilder.append(entry.getValue());
            stringBuilder.append(',');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public void a(int i) {
        if (this.a.get() > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.b.get();
            this.i.a(new -$$Lambda$dbi$qptvReSM27gNWGMdqgmDTmUJ3T0(this, h(), j, elapsedRealtime));
            this.b.set(elapsedRealtime);
        }
        this.h.set(i);
    }

    public boolean a(dbk dbk) {
        a aVar = new a((b) this.f.b.get());
        dbk.b = aVar.a;
        dbk.a = aVar.b;
        dbk.c = this.f.c.get();
        b bVar = (b) this.e.b.get();
        dbk.d = bVar.b + bVar.c;
        dbk.e = this.e.c.get();
        dbk.f = a(this.j.asMap());
        this.j.clear();
        return true;
    }

    /* renamed from: d */
    public dbk b() {
        return new dbk();
    }

    public synchronized void dispose() {
        if (!isDisposed()) {
            this.n.dispose();
            g();
            this.c.clear();
            super.dispose();
        }
    }

    public synchronized void e() {
        this.n = ((ifa) this.l.get()).e().b(this.m).a(-$$Lambda$Ak8QL176mRumGTfug98PPjKgiWY.INSTANCE).p(-$$Lambda$vXGM0H5Yl_rA94tLCo0jBnSyXeg.INSTANCE).p(-$$Lambda$qRMvwc6xchxdkuV6zXxiD_AT3nA.INSTANCE).j(ajfu.a).f(new -$$Lambda$J4kYxuRBPa__YdpRpovFWCKUJN0(this));
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        if (!isDisposed() && this.a.get() > 0 && this.a.decrementAndGet() <= 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.b.get();
            this.i.a(new -$$Lambda$dbi$xtMOl-gjPrUR-xc2dC3R9PLYo-Y(this, h(), j, elapsedRealtime));
        }
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        ajej ajej = (ajej) this.o.getAndSet(null);
        if (ajej != null) {
            ajej.dispose();
        }
    }

    public synchronized boolean isDisposed() {
        return super.isDisposed();
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: avq */
public class avq<K, V> {
    private static long c = TimeUnit.MINUTES.toMillis(5);
    public final avp<K, b<K, V>> a;
    public final avp<K, b<K, V>> b;
    private Map<Bitmap, Object> d = new WeakHashMap();
    private final avs<V> e;
    private final a f;
    private final aui<avr> g;
    private avr h;
    private long i;

    /* renamed from: avq$a */
    public interface a {
    }

    /* renamed from: avq$b */
    static class b<K, V> {
        public final K a;
        public final auq<V> b;
        public int c = 0;
        public boolean d = false;
        public final c<K> e;

        b(K k, auq<V> auq, c<K> cVar) {
            this.a = auh.a((Object) k);
            this.b = (auq) auh.a(auq.b(auq));
            this.e = cVar;
        }
    }

    /* renamed from: avq$c */
    public interface c<K> {
        void a(K k, boolean z);
    }

    public avq(avs<V> avs, a aVar, aui<avr> aui) {
        this.e = avs;
        this.a = new avp(a((avs) avs));
        this.b = new avp(a((avs) avs));
        this.f = aVar;
        this.g = aui;
        this.h = (avr) this.g.get();
        this.i = SystemClock.uptimeMillis();
    }

    private avs<b<K, V>> a(final avs<V> avs) {
        return new avs<b<K, V>>() {
            public final /* synthetic */ int getSizeInBytes(Object obj) {
                return avs.getSizeInBytes(((b) obj).b.a());
            }
        };
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0051 in {9, 16, 18, 23, 26} preds:[]
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
    private synchronized java.util.ArrayList<defpackage.avq.b<K, V>> a(int r4, int r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = 0;
        r4 = java.lang.Math.max(r4, r0);	 Catch:{ all -> 0x004e }
        r5 = java.lang.Math.max(r5, r0);	 Catch:{ all -> 0x004e }
        r0 = r3.a;	 Catch:{ all -> 0x004e }
        r0 = r0.a();	 Catch:{ all -> 0x004e }
        if (r0 > r4) goto L_0x001d;	 Catch:{ all -> 0x004e }
        r0 = r3.a;	 Catch:{ all -> 0x004e }
        r0 = r0.b();	 Catch:{ all -> 0x004e }
        if (r0 > r5) goto L_0x001d;
        r4 = 0;
        monitor-exit(r3);
        return r4;
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x004e }
        r0.<init>();	 Catch:{ all -> 0x004e }
        r1 = r3.a;	 Catch:{ all -> 0x004e }
        r1 = r1.a();	 Catch:{ all -> 0x004e }
        if (r1 > r4) goto L_0x0035;	 Catch:{ all -> 0x004e }
        r1 = r3.a;	 Catch:{ all -> 0x004e }
        r1 = r1.b();	 Catch:{ all -> 0x004e }
        if (r1 <= r5) goto L_0x0033;
        goto L_0x0035;
        monitor-exit(r3);
        return r0;
        r1 = r3.a;	 Catch:{ all -> 0x004e }
        r1 = r1.c();	 Catch:{ all -> 0x004e }
        r2 = r3.a;	 Catch:{ all -> 0x004e }
        r2.c(r1);	 Catch:{ all -> 0x004e }
        r2 = r3.b;	 Catch:{ all -> 0x004e }
        r1 = r2.c(r1);	 Catch:{ all -> 0x004e }
        r1 = (defpackage.avq.b) r1;	 Catch:{ all -> 0x004e }
        if (r1 == 0) goto L_0x0022;	 Catch:{ all -> 0x004e }
        r0.add(r1);	 Catch:{ all -> 0x004e }
        goto L_0x0022;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avq.a(int, int):java.util.ArrayList");
    }

    public static void b(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                avq.e((b) it.next());
            }
        }
    }

    private synchronized int c() {
        return this.b.a() - this.a.a();
    }

    private synchronized int d() {
        return this.b.b() - this.a.b();
    }

    private synchronized auq<V> d(final b<K, V> bVar) {
        g(bVar);
        return auq.a(bVar.b.a(), new aur<V>() {
            public final void release(V v) {
                boolean a;
                auq c;
                avq avq = avq.this;
                b bVar = bVar;
                auh.a((Object) bVar);
                synchronized (avq) {
                    avq.b(bVar);
                    a = avq.a(bVar);
                    c = avq.c(bVar);
                }
                auq.c(c);
                if (!a) {
                    bVar = null;
                }
                if (!(bVar == null || bVar.e == null)) {
                    bVar.e.a(bVar.a, true);
                }
                avq.a();
                avq.b();
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0028 in {9, 11, 12, 15} preds:[]
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
    private synchronized boolean d(V r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.e;	 Catch:{ all -> 0x0025 }
        r3 = r0.getSizeInBytes(r3);	 Catch:{ all -> 0x0025 }
        r0 = r2.h;	 Catch:{ all -> 0x0025 }
        r0 = r0.c;	 Catch:{ all -> 0x0025 }
        if (r3 > r0) goto L_0x0023;	 Catch:{ all -> 0x0025 }
        r0 = r2.c();	 Catch:{ all -> 0x0025 }
        r1 = 23;	 Catch:{ all -> 0x0025 }
        if (r0 > r1) goto L_0x0023;	 Catch:{ all -> 0x0025 }
        r0 = r2.d();	 Catch:{ all -> 0x0025 }
        r1 = r2.h;	 Catch:{ all -> 0x0025 }
        r1 = r1.a;	 Catch:{ all -> 0x0025 }
        r1 = r1 - r3;
        if (r0 > r1) goto L_0x0023;
        r3 = 1;
        monitor-exit(r2);
        return r3;
        r3 = 0;
        goto L_0x0021;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avq.d(java.lang.Object):boolean");
    }

    private static <K, V> void e(b<K, V> bVar) {
        if (bVar != null && bVar.e != null) {
            bVar.e.a(bVar.a, false);
        }
    }

    private synchronized void f(b<K, V> bVar) {
        auh.a((Object) bVar);
        auh.b(!bVar.d);
        bVar.d = true;
    }

    private synchronized void g(b<K, V> bVar) {
        auh.a((Object) bVar);
        auh.b(!bVar.d);
        bVar.c++;
    }

    public final auq<V> a(K k) {
        b bVar;
        auq<V> d;
        auh.a((Object) k);
        synchronized (this) {
            bVar = (b) this.a.c(k);
            b bVar2 = (b) this.b.b(k);
            d = bVar2 != null ? d(bVar2) : null;
        }
        avq.e(bVar);
        a();
        b();
        return d;
    }

    public final auq<V> a(K k, auq<V> auq, c<K> cVar) {
        b bVar;
        auq<V> auq2;
        auq c;
        auh.a((Object) k);
        auh.a((Object) auq);
        a();
        synchronized (this) {
            bVar = (b) this.a.c(k);
            b bVar2 = (b) this.b.c(k);
            auq2 = null;
            if (bVar2 != null) {
                f(bVar2);
                c = c(bVar2);
            } else {
                c = null;
            }
            if (d(auq.a())) {
                b bVar3 = new b(k, auq, cVar);
                this.b.a(k, bVar3);
                auq2 = d(bVar3);
            }
        }
        auq.c(c);
        avq.e(bVar);
        b();
        return auq2;
    }

    public final synchronized void a() {
        if (this.i + c <= SystemClock.uptimeMillis()) {
            this.i = SystemClock.uptimeMillis();
            this.h = (avr) this.g.get();
        }
    }

    public final void a(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                auq.c(c((b) it.next()));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0018 in {7, 9, 10, 13} preds:[]
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
    final synchronized boolean a(defpackage.avq.b<K, V> r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r3.d;	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x0013;	 Catch:{ all -> 0x0015 }
        r0 = r3.c;	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x0013;	 Catch:{ all -> 0x0015 }
        r0 = r2.a;	 Catch:{ all -> 0x0015 }
        r1 = r3.a;	 Catch:{ all -> 0x0015 }
        r0.a(r1, r3);	 Catch:{ all -> 0x0015 }
        r3 = 1;
        monitor-exit(r2);
        return r3;
        r3 = 0;
        goto L_0x0011;
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avq.a(avq$b):boolean");
    }

    public final auq<V> b(K k) {
        b bVar;
        Object obj;
        auq<V> auq;
        auh.a((Object) k);
        synchronized (this) {
            bVar = (b) this.a.c(k);
            obj = 1;
            boolean z = false;
            if (bVar != null) {
                Object obj2 = (b) this.b.c(k);
                auh.a(obj2);
                if (obj2.c == 0) {
                    z = true;
                }
                auh.b(z);
                auq = obj2.b;
            } else {
                auq = null;
                obj = null;
            }
        }
        if (obj != null) {
            avq.e(bVar);
        }
        return auq;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        ArrayList a;
        synchronized (this) {
            a = a(Math.min(24, 24 - c()), Math.min(this.h.b, this.h.a - d()));
            c(a);
        }
        a(a);
        avq.b(a);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(b<K, V> bVar) {
        auh.a((Object) bVar);
        auh.b(bVar.c > 0);
        bVar.c--;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized auq<V> c(b<K, V> bVar) {
        auh.a((Object) bVar);
        if (!bVar.d || bVar.c != 0) {
            return null;
        }
        return bVar.b;
    }

    public final synchronized void c(ArrayList<b<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f((b) it.next());
            }
        }
    }

    public final synchronized boolean c(K k) {
        return this.b.a(k);
    }
}

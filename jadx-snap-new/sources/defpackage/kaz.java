package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kaz */
public final class kaz<T extends ajej> implements ajej, Cloneable {
    private T a;
    private AtomicInteger b;
    private String c;
    private Throwable d;

    private kaz(T t, AtomicInteger atomicInteger, String str, Throwable th) {
        this.a = t;
        this.b = atomicInteger;
        this.c = str;
        this.d = th;
    }

    public static <T extends ajej> kaz<T> a(T t, String str) {
        return new kaz(t, new AtomicInteger(1), str, null);
    }

    public static <T extends ajej> kaz<T> a(T t, String str, Throwable th) {
        return new kaz(t, new AtomicInteger(1), str, th);
    }

    public static <T extends ajej> kaz<T> a(kaz<T> kaz, String str) {
        return kaz == null ? null : kaz.b(str);
    }

    public static boolean a(kaz<?> kaz) {
        return (kaz == null || kaz.isDisposed()) ? false : true;
    }

    private synchronized kaz<T> b() {
        return a("");
    }

    public static void b(kaz<?> kaz) {
        if (kaz.a((kaz) kaz)) {
            kaz.dispose();
        }
    }

    private void c() {
        if (isDisposed() || this.a.isDisposed()) {
            throw new kba("Resource has been released");
        }
    }

    public final synchronized T a() {
        c();
        return this.a;
    }

    public final synchronized kaz<T> a(String str) {
        c();
        this.b.incrementAndGet();
        return new kaz(this.a, this.b, str, null);
    }

    public final synchronized kaz<T> b(String str) {
        if (isDisposed()) {
            return null;
        }
        return a(str);
    }

    public final /* synthetic */ Object clone() {
        return b();
    }

    public final synchronized void dispose() {
        if (!isDisposed()) {
            if (this.b.decrementAndGet() == 0) {
                this.a.dispose();
            }
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void finalize() {
        try {
            if (isDisposed()) {
                super.finalize();
            } else {
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean isDisposed() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.a;	 Catch:{ all -> 0x000a }
        if (r0 != 0) goto L_0x0008;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x0006;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaz.isDisposed():boolean");
    }
}

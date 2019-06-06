package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: aus */
public final class aus<T> {
    static final Map<Object, Integer> a = new IdentityHashMap();
    T b;
    final aur<T> c;
    private int d = 1;

    /* renamed from: aus$a */
    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public aus(T t, aur<T> aur) {
        this.b = auh.a((Object) t);
        this.c = (aur) auh.a((Object) aur);
        synchronized (a) {
            Integer num = (Integer) a.get(t);
            if (num == null) {
                a.put(t, Integer.valueOf(1));
            } else {
                a.put(t, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private static boolean a(aus<?> aus) {
        return aus.d();
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
    private synchronized boolean d() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x000a }
        if (r0 <= 0) goto L_0x0008;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aus.d():boolean");
    }

    private void e() {
        if (!aus.a(this)) {
            throw new a();
        }
    }

    public final synchronized T a() {
        return this.b;
    }

    public final synchronized void b() {
        e();
        this.d++;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized int c() {
        e();
        auh.a(this.d > 0);
        this.d--;
        return this.d;
    }
}

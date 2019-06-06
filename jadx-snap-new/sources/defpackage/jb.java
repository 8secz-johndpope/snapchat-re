package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: jb */
public class jb<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public jb(int i) {
        if (i > 0) {
            this.c = i;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x0070 in {7, 12, 15, 18, 20, 23} preds:[]
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
    private void a(int r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x006d }
        if (r0 < 0) goto L_0x004e;	 Catch:{ all -> 0x006d }
        r0 = r4.a;	 Catch:{ all -> 0x006d }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x0011;	 Catch:{ all -> 0x006d }
        r0 = r4.b;	 Catch:{ all -> 0x006d }
        if (r0 != 0) goto L_0x004e;	 Catch:{ all -> 0x006d }
        r0 = r4.b;	 Catch:{ all -> 0x006d }
        if (r0 <= r5) goto L_0x004c;	 Catch:{ all -> 0x006d }
        r0 = r4.a;	 Catch:{ all -> 0x006d }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x001e;	 Catch:{ all -> 0x006d }
        goto L_0x004c;	 Catch:{ all -> 0x006d }
        r0 = r4.a;	 Catch:{ all -> 0x006d }
        r0 = r0.entrySet();	 Catch:{ all -> 0x006d }
        r0 = r0.iterator();	 Catch:{ all -> 0x006d }
        r0 = r0.next();	 Catch:{ all -> 0x006d }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x006d }
        r1 = r0.getKey();	 Catch:{ all -> 0x006d }
        r0 = r0.getValue();	 Catch:{ all -> 0x006d }
        r2 = r4.a;	 Catch:{ all -> 0x006d }
        r2.remove(r1);	 Catch:{ all -> 0x006d }
        r2 = r4.b;	 Catch:{ all -> 0x006d }
        r3 = 1;	 Catch:{ all -> 0x006d }
        r2 = r2 - r3;	 Catch:{ all -> 0x006d }
        r4.b = r2;	 Catch:{ all -> 0x006d }
        r2 = r4.e;	 Catch:{ all -> 0x006d }
        r2 = r2 + r3;	 Catch:{ all -> 0x006d }
        r4.e = r2;	 Catch:{ all -> 0x006d }
        monitor-exit(r4);	 Catch:{ all -> 0x006d }
        r2 = 0;
        r4.a(r3, r1, r0, r2);
        goto L_0x0000;
        monitor-exit(r4);	 Catch:{ all -> 0x006d }
        return;	 Catch:{ all -> 0x006d }
        r5 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x006d }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006d }
        r0.<init>();	 Catch:{ all -> 0x006d }
        r1 = r4.getClass();	 Catch:{ all -> 0x006d }
        r1 = r1.getName();	 Catch:{ all -> 0x006d }
        r0.append(r1);	 Catch:{ all -> 0x006d }
        r1 = ".sizeOf() is reporting inconsistent results!";	 Catch:{ all -> 0x006d }
        r0.append(r1);	 Catch:{ all -> 0x006d }
        r0 = r0.toString();	 Catch:{ all -> 0x006d }
        r5.<init>(r0);	 Catch:{ all -> 0x006d }
        throw r5;	 Catch:{ all -> 0x006d }
        r5 = move-exception;	 Catch:{ all -> 0x006d }
        monitor-exit(r4);	 Catch:{ all -> 0x006d }
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb.a(int):void");
    }

    public final V a(K k) {
        if (k != null) {
            synchronized (this) {
                Object obj = this.a.get(k);
                if (obj != null) {
                    this.f++;
                    return obj;
                }
                this.g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final V a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        Object put;
        synchronized (this) {
            this.d++;
            this.b++;
            put = this.a.put(k, v);
            if (put != null) {
                this.b--;
            }
        }
        if (put != null) {
            a(false, k, put, v);
        }
        a(this.c);
        return put;
    }

    public final void a() {
        a(-1);
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z, K k, V v, V v2) {
    }

    public final V b(K k) {
        if (k != null) {
            Object remove;
            synchronized (this) {
                remove = this.a.remove(k);
                if (remove != null) {
                    this.b--;
                }
            }
            if (remove != null) {
                a(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        i = this.f + this.g;
        i = i != 0 ? (this.f * 100) / i : 0;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i)});
    }
}

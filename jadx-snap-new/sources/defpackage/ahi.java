package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ahi */
public class ahi<T, Y> {
    private final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;
    private long d;

    public ahi(long j) {
        this.b = j;
        this.c = j;
    }

    private void c() {
        a(this.c);
    }

    /* Access modifiers changed, original: protected */
    public int a(Y y) {
        return 1;
    }

    public final void a() {
        a(0);
    }

    public final synchronized void a(float f) {
        if (f >= MapboxConstants.MINIMUM_ZOOM) {
            this.c = (long) Math.round(((float) this.b) * f);
            c();
        } else {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0035 in {5, 7, 10} preds:[]
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
    protected final synchronized void a(long r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.d;	 Catch:{ all -> 0x0032 }
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));	 Catch:{ all -> 0x0032 }
        if (r2 <= 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
        r0 = r7.a;	 Catch:{ all -> 0x0032 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0032 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0032 }
        r1 = r0.next();	 Catch:{ all -> 0x0032 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0032 }
        r2 = r1.getValue();	 Catch:{ all -> 0x0032 }
        r3 = r7.d;	 Catch:{ all -> 0x0032 }
        r5 = r7.a(r2);	 Catch:{ all -> 0x0032 }
        r5 = (long) r5;	 Catch:{ all -> 0x0032 }
        r3 = r3 - r5;	 Catch:{ all -> 0x0032 }
        r7.d = r3;	 Catch:{ all -> 0x0032 }
        r1 = r1.getKey();	 Catch:{ all -> 0x0032 }
        r0.remove();	 Catch:{ all -> 0x0032 }
        r7.a(r1, r2);	 Catch:{ all -> 0x0032 }
        goto L_0x0001;
        monitor-exit(r7);
        return;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahi.a(long):void");
    }

    /* Access modifiers changed, original: protected */
    public void a(T t, Y y) {
    }

    public final synchronized long b() {
        return this.c;
    }

    public final synchronized Y b(T t) {
        return this.a.get(t);
    }

    public final synchronized Y b(T t, Y y) {
        long a = (long) a((Object) y);
        if (a >= this.c) {
            a(t, y);
            return null;
        }
        if (y != null) {
            this.d += a;
        }
        Object put = this.a.put(t, y);
        if (put != null) {
            this.d -= (long) a(put);
            if (!put.equals(y)) {
                a(t, put);
            }
        }
        c();
        return put;
    }

    public final synchronized Y c(T t) {
        Object remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.d -= (long) a(remove);
        }
        return remove;
    }
}

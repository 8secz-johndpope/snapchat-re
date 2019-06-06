package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;

/* renamed from: auq */
public class auq<T> implements Closeable, Cloneable {
    private static Class<auq> b = auq.class;
    private static final aur<Closeable> d = new 1();
    public aus<T> a;
    private boolean c = false;

    /* renamed from: auq$1 */
    static class 1 implements aur<Closeable> {
        1() {
        }

        public final /* synthetic */ void release(Object obj) {
            Closeable closeable = (Closeable) obj;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    try {
                        aud.a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    private auq(aus<T> aus) {
        this.a = (aus) auh.a((Object) aus);
        aus.b();
    }

    protected auq(T t, aur<T> aur) {
        this.a = new aus(t, aur);
    }

    public static <T extends Closeable> auq<T> a(T t) {
        return t == null ? null : new auq(t, d);
    }

    public static <T> auq<T> a(T t, aur<T> aur) {
        return t == null ? null : new auq(t, aur);
    }

    public static <T> List<auq<T>> a(Collection<auq<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (auq b : collection) {
            arrayList.add(auq.b(b));
        }
        return arrayList;
    }

    public static void a(Iterable<? extends auq<?>> iterable) {
        if (iterable != null) {
            for (auq c : iterable) {
                auq.c(c);
            }
        }
    }

    public static boolean a(auq<?> auq) {
        return auq != null && auq.d();
    }

    public static <T> auq<T> b(auq<T> auq) {
        return auq != null ? auq.c() : null;
    }

    public static void c(auq<?> auq) {
        if (auq != null) {
            auq.close();
        }
    }

    public final synchronized T a() {
        auh.b(!this.c);
        return this.a.a();
    }

    /* renamed from: b */
    public final synchronized auq<T> clone() {
        auh.b(d());
        return new auq(this.a);
    }

    public final synchronized auq<T> c() {
        if (!d()) {
            return null;
        }
        return clone();
    }

    /* JADX WARNING: Missing block: B:8:0x000b, code skipped:
            r1 = r7.a;
     */
    /* JADX WARNING: Missing block: B:9:0x0011, code skipped:
            if (r1.c() != 0) goto L_0x006e;
     */
    /* JADX WARNING: Missing block: B:10:0x0013, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r2 = r1.b;
            r1.b = null;
     */
    /* JADX WARNING: Missing block: B:13:0x0019, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:14:0x001a, code skipped:
            r1.c.release(r2);
            r4 = defpackage.aus.a;
     */
    /* JADX WARNING: Missing block: B:15:0x0021, code skipped:
            monitor-enter(r4);
     */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r1 = (java.lang.Integer) defpackage.aus.a.get(r2);
     */
    /* JADX WARNING: Missing block: B:18:0x002a, code skipped:
            if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Missing block: B:19:0x002c, code skipped:
            r1 = "SharedReference";
            r5 = "No entry in sLiveObjects for value of type %s";
            r0 = new java.lang.Object[]{r2.getClass()};
     */
    /* JADX WARNING: Missing block: B:20:0x0040, code skipped:
            if (defpackage.auk.a.a(6) == false) goto L_0x0066;
     */
    /* JADX WARNING: Missing block: B:21:0x0042, code skipped:
            defpackage.auk.a.d(r1, java.lang.String.format(null, r5, r0));
     */
    /* JADX WARNING: Missing block: B:23:0x0050, code skipped:
            if (r1.intValue() != 1) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:24:0x0052, code skipped:
            defpackage.aus.a.remove(r2);
     */
    /* JADX WARNING: Missing block: B:25:0x0058, code skipped:
            defpackage.aus.a.put(r2, java.lang.Integer.valueOf(r1.intValue() - 1));
     */
    /* JADX WARNING: Missing block: B:26:0x0066, code skipped:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:27:0x0067, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:35:0x006e, code skipped:
            return;
     */
    public void close() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.c;	 Catch:{ all -> 0x006f }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r7);	 Catch:{ all -> 0x006f }
        return;
    L_0x0007:
        r0 = 1;
        r7.c = r0;	 Catch:{ all -> 0x006f }
        monitor-exit(r7);	 Catch:{ all -> 0x006f }
        r1 = r7.a;
        r2 = r1.c();
        if (r2 != 0) goto L_0x006e;
    L_0x0013:
        monitor-enter(r1);
        r2 = r1.b;	 Catch:{ all -> 0x006b }
        r3 = 0;
        r1.b = r3;	 Catch:{ all -> 0x006b }
        monitor-exit(r1);	 Catch:{ all -> 0x006b }
        r1 = r1.c;
        r1.release(r2);
        r4 = defpackage.aus.a;
        monitor-enter(r4);
        r1 = defpackage.aus.a;	 Catch:{ all -> 0x0068 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0068 }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x0068 }
        if (r1 != 0) goto L_0x004c;
    L_0x002c:
        r1 = "SharedReference";
        r5 = "No entry in sLiveObjects for value of type %s";
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0068 }
        r6 = 0;
        r2 = r2.getClass();	 Catch:{ all -> 0x0068 }
        r0[r6] = r2;	 Catch:{ all -> 0x0068 }
        r2 = defpackage.auk.a;	 Catch:{ all -> 0x0068 }
        r6 = 6;
        r2 = r2.a(r6);	 Catch:{ all -> 0x0068 }
        if (r2 == 0) goto L_0x0066;
    L_0x0042:
        r2 = defpackage.auk.a;	 Catch:{ all -> 0x0068 }
        r0 = java.lang.String.format(r3, r5, r0);	 Catch:{ all -> 0x0068 }
        r2.d(r1, r0);	 Catch:{ all -> 0x0068 }
        goto L_0x0066;
    L_0x004c:
        r3 = r1.intValue();	 Catch:{ all -> 0x0068 }
        if (r3 != r0) goto L_0x0058;
    L_0x0052:
        r0 = defpackage.aus.a;	 Catch:{ all -> 0x0068 }
        r0.remove(r2);	 Catch:{ all -> 0x0068 }
        goto L_0x0066;
    L_0x0058:
        r3 = defpackage.aus.a;	 Catch:{ all -> 0x0068 }
        r1 = r1.intValue();	 Catch:{ all -> 0x0068 }
        r1 = r1 - r0;
        r0 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0068 }
        r3.put(r2, r0);	 Catch:{ all -> 0x0068 }
    L_0x0066:
        monitor-exit(r4);	 Catch:{ all -> 0x0068 }
        return;
    L_0x0068:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0068 }
        throw r0;
    L_0x006b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x006b }
        throw r0;
    L_0x006e:
        return;
    L_0x006f:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x006f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auq.close():void");
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
    public final synchronized boolean d() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.c;	 Catch:{ all -> 0x000a }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auq.d():boolean");
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (this.c) {
                    super.finalize();
                    return;
                }
                auk.b(b, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.a)), this.a.a().getClass().getSimpleName());
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
        }
    }
}

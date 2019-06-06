package defpackage;

import defpackage.jf.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: acu */
public final class acu {
    private static final c a = new c();
    private static final acq<Object, Object> b = new a();
    private final List<b<?, ?>> c;
    private final c d;
    private final Set<b<?, ?>> e;
    private final a<List<Throwable>> f;

    /* renamed from: acu$b */
    static class b<Model, Data> {
        final Class<Data> a;
        final acr<? extends Model, ? extends Data> b;
        private final Class<Model> c;

        public b(Class<Model> cls, Class<Data> cls2, acr<? extends Model, ? extends Data> acr) {
            this.c = cls;
            this.a = cls2;
            this.b = acr;
        }

        public final boolean a(Class<?> cls) {
            return this.c.isAssignableFrom(cls);
        }
    }

    /* renamed from: acu$c */
    static class c {
        c() {
        }
    }

    /* renamed from: acu$a */
    static class a implements acq<Object, Object> {
        a() {
        }

        public final defpackage.acq.a<Object> a(Object obj, int i, int i2, zf zfVar) {
            return null;
        }

        public final boolean a(Object obj) {
            return false;
        }
    }

    public acu(a<List<Throwable>> aVar) {
        this(aVar, a);
    }

    private acu(a<List<Throwable>> aVar, c cVar) {
        this.c = new ArrayList();
        this.e = new HashSet();
        this.f = aVar;
        this.d = cVar;
    }

    private <Model, Data> acq<Model, Data> a(b<?, ?> bVar) {
        return (acq) ahl.a(bVar.b.a(this), "Argument must not be null");
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, acr<? extends Model, ? extends Data> acr, boolean z) {
        b bVar = new b(cls, cls2, acr);
        List list = this.c;
        list.add(z ? list.size() : 0, bVar);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:43:0x007e in {7, 12, 13, 15, 20, 26, 31, 34, 40, 42} preds:[]
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
    public final synchronized <Model, Data> defpackage.acq<Model, Data> a(java.lang.Class<Model> r8, java.lang.Class<Data> r9) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x0075 }
        r0.<init>();	 Catch:{ Throwable -> 0x0075 }
        r1 = r7.c;	 Catch:{ Throwable -> 0x0075 }
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x0075 }
        r2 = 0;	 Catch:{ Throwable -> 0x0075 }
        r3 = 1;	 Catch:{ Throwable -> 0x0075 }
        r4 = 0;	 Catch:{ Throwable -> 0x0075 }
        r5 = r1.hasNext();	 Catch:{ Throwable -> 0x0075 }
        if (r5 == 0) goto L_0x004a;	 Catch:{ Throwable -> 0x0075 }
        r5 = r1.next();	 Catch:{ Throwable -> 0x0075 }
        r5 = (defpackage.acu.b) r5;	 Catch:{ Throwable -> 0x0075 }
        r6 = r7.e;	 Catch:{ Throwable -> 0x0075 }
        r6 = r6.contains(r5);	 Catch:{ Throwable -> 0x0075 }
        if (r6 == 0) goto L_0x0025;	 Catch:{ Throwable -> 0x0075 }
        r4 = 1;	 Catch:{ Throwable -> 0x0075 }
        goto L_0x000f;	 Catch:{ Throwable -> 0x0075 }
        r6 = r5.a(r8);	 Catch:{ Throwable -> 0x0075 }
        if (r6 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x0075 }
        r6 = r5.a;	 Catch:{ Throwable -> 0x0075 }
        r6 = r6.isAssignableFrom(r9);	 Catch:{ Throwable -> 0x0075 }
        if (r6 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x0075 }
        r6 = 1;	 Catch:{ Throwable -> 0x0075 }
        goto L_0x0036;	 Catch:{ Throwable -> 0x0075 }
        r6 = 0;	 Catch:{ Throwable -> 0x0075 }
        if (r6 == 0) goto L_0x000f;	 Catch:{ Throwable -> 0x0075 }
        r6 = r7.e;	 Catch:{ Throwable -> 0x0075 }
        r6.add(r5);	 Catch:{ Throwable -> 0x0075 }
        r6 = r7.a(r5);	 Catch:{ Throwable -> 0x0075 }
        r0.add(r6);	 Catch:{ Throwable -> 0x0075 }
        r6 = r7.e;	 Catch:{ Throwable -> 0x0075 }
        r6.remove(r5);	 Catch:{ Throwable -> 0x0075 }
        goto L_0x000f;	 Catch:{ Throwable -> 0x0075 }
        r1 = r0.size();	 Catch:{ Throwable -> 0x0075 }
        if (r1 <= r3) goto L_0x0059;	 Catch:{ Throwable -> 0x0075 }
        r8 = r7.f;	 Catch:{ Throwable -> 0x0075 }
        r9 = new act;	 Catch:{ Throwable -> 0x0075 }
        r9.<init>(r0, r8);	 Catch:{ Throwable -> 0x0075 }
        monitor-exit(r7);
        return r9;
        r1 = r0.size();	 Catch:{ Throwable -> 0x0075 }
        if (r1 != r3) goto L_0x0067;	 Catch:{ Throwable -> 0x0075 }
        r8 = r0.get(r2);	 Catch:{ Throwable -> 0x0075 }
        r8 = (defpackage.acq) r8;	 Catch:{ Throwable -> 0x0075 }
        monitor-exit(r7);
        return r8;
        if (r4 == 0) goto L_0x006d;
        r8 = b;	 Catch:{ Throwable -> 0x0075 }
        monitor-exit(r7);
        return r8;
        r0 = new yl$c;	 Catch:{ Throwable -> 0x0075 }
        r0.<init>(r8, r9);	 Catch:{ Throwable -> 0x0075 }
        throw r0;	 Catch:{ Throwable -> 0x0075 }
        r8 = move-exception;
        goto L_0x007c;
        r8 = move-exception;
        r9 = r7.e;	 Catch:{ all -> 0x0073 }
        r9.clear();	 Catch:{ all -> 0x0073 }
        throw r8;	 Catch:{ all -> 0x0073 }
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acu.a(java.lang.Class, java.lang.Class):acq");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0045 in {10, 12, 18, 20} preds:[]
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
    final synchronized <Model> java.util.List<defpackage.acq<Model, ?>> a(java.lang.Class<Model> r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new java.util.ArrayList;	 Catch:{ Throwable -> 0x003c }
        r0.<init>();	 Catch:{ Throwable -> 0x003c }
        r1 = r4.c;	 Catch:{ Throwable -> 0x003c }
        r1 = r1.iterator();	 Catch:{ Throwable -> 0x003c }
        r2 = r1.hasNext();	 Catch:{ Throwable -> 0x003c }
        if (r2 == 0) goto L_0x0038;	 Catch:{ Throwable -> 0x003c }
        r2 = r1.next();	 Catch:{ Throwable -> 0x003c }
        r2 = (defpackage.acu.b) r2;	 Catch:{ Throwable -> 0x003c }
        r3 = r4.e;	 Catch:{ Throwable -> 0x003c }
        r3 = r3.contains(r2);	 Catch:{ Throwable -> 0x003c }
        if (r3 != 0) goto L_0x000c;	 Catch:{ Throwable -> 0x003c }
        r3 = r2.a(r5);	 Catch:{ Throwable -> 0x003c }
        if (r3 == 0) goto L_0x000c;	 Catch:{ Throwable -> 0x003c }
        r3 = r4.e;	 Catch:{ Throwable -> 0x003c }
        r3.add(r2);	 Catch:{ Throwable -> 0x003c }
        r3 = r4.a(r2);	 Catch:{ Throwable -> 0x003c }
        r0.add(r3);	 Catch:{ Throwable -> 0x003c }
        r3 = r4.e;	 Catch:{ Throwable -> 0x003c }
        r3.remove(r2);	 Catch:{ Throwable -> 0x003c }
        goto L_0x000c;
        monitor-exit(r4);
        return r0;
        r5 = move-exception;
        goto L_0x0043;
        r5 = move-exception;
        r0 = r4.e;	 Catch:{ all -> 0x003a }
        r0.clear();	 Catch:{ all -> 0x003a }
        throw r5;	 Catch:{ all -> 0x003a }
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acu.a(java.lang.Class):java.util.List");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, acr<? extends Model, ? extends Data> acr) {
        a(cls, cls2, acr, true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0031 in {10, 12, 15} preds:[]
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
    final synchronized java.util.List<java.lang.Class<?>> b(java.lang.Class<?> r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x002e }
        r0.<init>();	 Catch:{ all -> 0x002e }
        r1 = r4.c;	 Catch:{ all -> 0x002e }
        r1 = r1.iterator();	 Catch:{ all -> 0x002e }
        r2 = r1.hasNext();	 Catch:{ all -> 0x002e }
        if (r2 == 0) goto L_0x002c;	 Catch:{ all -> 0x002e }
        r2 = r1.next();	 Catch:{ all -> 0x002e }
        r2 = (defpackage.acu.b) r2;	 Catch:{ all -> 0x002e }
        r3 = r2.a;	 Catch:{ all -> 0x002e }
        r3 = r0.contains(r3);	 Catch:{ all -> 0x002e }
        if (r3 != 0) goto L_0x000c;	 Catch:{ all -> 0x002e }
        r3 = r2.a(r5);	 Catch:{ all -> 0x002e }
        if (r3 == 0) goto L_0x000c;	 Catch:{ all -> 0x002e }
        r2 = r2.a;	 Catch:{ all -> 0x002e }
        r0.add(r2);	 Catch:{ all -> 0x002e }
        goto L_0x000c;
        monitor-exit(r4);
        return r0;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acu.b(java.lang.Class):java.util.List");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, acr<? extends Model, ? extends Data> acr) {
        a(cls, cls2, acr, false);
    }
}

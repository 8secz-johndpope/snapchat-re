package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: afb */
public final class afb {
    private final List<a<?, ?>> a = new ArrayList();

    /* renamed from: afb$a */
    static final class a<Z, R> {
        final afa<Z, R> a;
        private final Class<Z> b;
        private final Class<R> c;

        a(Class<Z> cls, Class<R> cls2, afa<Z, R> afa) {
            this.b = cls;
            this.c = cls2;
            this.a = afa;
        }

        public final boolean a(Class<?> cls, Class<?> cls2) {
            return this.b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.c);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x0046 in {6, 15, 18, 21} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized <Z, R> defpackage.afa<Z, R> a(java.lang.Class<Z> r4, java.lang.Class<R> r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r5.isAssignableFrom(r4);	 Catch:{ all -> 0x0043 }
        if (r0 == 0) goto L_0x000b;	 Catch:{ all -> 0x0043 }
        r4 = defpackage.afc.a;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);
        return r4;
        r0 = r3.a;	 Catch:{ all -> 0x0043 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0043 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0043 }
        if (r1 == 0) goto L_0x0027;	 Catch:{ all -> 0x0043 }
        r1 = r0.next();	 Catch:{ all -> 0x0043 }
        r1 = (defpackage.afb.a) r1;	 Catch:{ all -> 0x0043 }
        r2 = r1.a(r4, r5);	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x0011;	 Catch:{ all -> 0x0043 }
        r4 = r1.a;	 Catch:{ all -> 0x0043 }
        monitor-exit(r3);
        return r4;
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0043 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0043 }
        r2 = "No transcoder registered to transcode from ";	 Catch:{ all -> 0x0043 }
        r1.<init>(r2);	 Catch:{ all -> 0x0043 }
        r1.append(r4);	 Catch:{ all -> 0x0043 }
        r4 = " to ";	 Catch:{ all -> 0x0043 }
        r1.append(r4);	 Catch:{ all -> 0x0043 }
        r1.append(r5);	 Catch:{ all -> 0x0043 }
        r4 = r1.toString();	 Catch:{ all -> 0x0043 }
        r0.<init>(r4);	 Catch:{ all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x0043 }
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afb.a(java.lang.Class, java.lang.Class):afa");
    }

    public final synchronized <Z, R> void a(Class<Z> cls, Class<R> cls2, afa<Z, R> afa) {
        this.a.add(new a(cls, cls2, afa));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0032 in {6, 14, 16, 19} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized <Z, R> java.util.List<java.lang.Class<R>> b(java.lang.Class<Z> r4, java.lang.Class<R> r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x002f }
        r0.<init>();	 Catch:{ all -> 0x002f }
        r1 = r5.isAssignableFrom(r4);	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x0011;	 Catch:{ all -> 0x002f }
        r0.add(r5);	 Catch:{ all -> 0x002f }
        monitor-exit(r3);
        return r0;
        r1 = r3.a;	 Catch:{ all -> 0x002f }
        r1 = r1.iterator();	 Catch:{ all -> 0x002f }
        r2 = r1.hasNext();	 Catch:{ all -> 0x002f }
        if (r2 == 0) goto L_0x002d;	 Catch:{ all -> 0x002f }
        r2 = r1.next();	 Catch:{ all -> 0x002f }
        r2 = (defpackage.afb.a) r2;	 Catch:{ all -> 0x002f }
        r2 = r2.a(r4, r5);	 Catch:{ all -> 0x002f }
        if (r2 == 0) goto L_0x0017;	 Catch:{ all -> 0x002f }
        r0.add(r5);	 Catch:{ all -> 0x002f }
        goto L_0x0017;
        monitor-exit(r3);
        return r0;
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afb.b(java.lang.Class, java.lang.Class):java.util.List");
    }
}

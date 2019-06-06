package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: ainb */
public abstract class ainb<RowType> {
    public final aint i = new aint();
    public final Set<a> j = ainr.b();
    public final List<ainb<?>> k;
    public final akbl<ainn, RowType> l;

    /* renamed from: ainb$a */
    public interface a {
        void a();
    }

    public ainb(List<ainb<?>> list, akbl<? super ainn, ? extends RowType> akbl) {
        akcr.b(list, "queries");
        akcr.b(akbl, "mapper");
        this.k = list;
        this.l = akbl;
    }

    public abstract ainn a();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0020 in {7, 9, 12} preds:[]
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
    public final void b() {
        /*
        r3 = this;
        r0 = r3.i;
        monitor-enter(r0);
        r1 = r3.j;	 Catch:{ all -> 0x001d }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x001d }
        r1 = r1.iterator();	 Catch:{ all -> 0x001d }
        r2 = r1.hasNext();	 Catch:{ all -> 0x001d }
        if (r2 == 0) goto L_0x001b;	 Catch:{ all -> 0x001d }
        r2 = r1.next();	 Catch:{ all -> 0x001d }
        r2 = (defpackage.ainb.a) r2;	 Catch:{ all -> 0x001d }
        r2.a();	 Catch:{ all -> 0x001d }
        goto L_0x000b;
        monitor-exit(r0);
        return;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ainb.b():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x002e in {6, 8, 14, 16} preds:[]
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
    public final java.util.List<RowType> c() {
        /*
        r5 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.List) r0;
        r1 = r5.a();
        r1 = (java.io.Closeable) r1;
        r2 = 0;
        r3 = r1;	 Catch:{ Throwable -> 0x0027 }
        r3 = (defpackage.ainn) r3;	 Catch:{ Throwable -> 0x0027 }
        r4 = r3.next();	 Catch:{ Throwable -> 0x0027 }
        if (r4 == 0) goto L_0x0021;	 Catch:{ Throwable -> 0x0027 }
        r4 = r5.l;	 Catch:{ Throwable -> 0x0027 }
        r4 = r4.invoke(r3);	 Catch:{ Throwable -> 0x0027 }
        r0.add(r4);	 Catch:{ Throwable -> 0x0027 }
        goto L_0x0011;
        defpackage.akax.a(r1, r2);
        return r0;
        r0 = move-exception;
        goto L_0x002a;
        r0 = move-exception;
        r2 = r0;
        throw r2;	 Catch:{ all -> 0x0025 }
        defpackage.akax.a(r1, r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ainb.c():java.util.List");
    }

    public final RowType d() {
        Object e = e();
        if (e != null) {
            return e;
        }
        throw new NullPointerException("ResultSet returned null for ".concat(String.valueOf(this)));
    }

    /* JADX WARNING: Missing block: B:18:0x003a, code skipped:
            defpackage.akax.a(r0, r1);
     */
    public final RowType e() {
        /*
        r5 = this;
        r0 = r5.a();
        r0 = (java.io.Closeable) r0;
        r1 = 0;
        r2 = r0;
        r2 = (defpackage.ainn) r2;	 Catch:{ Throwable -> 0x0038 }
        r3 = r2.next();	 Catch:{ Throwable -> 0x0038 }
        if (r3 != 0) goto L_0x0014;
    L_0x0010:
        defpackage.akax.a(r0, r1);
        return r1;
    L_0x0014:
        r3 = r5.l;	 Catch:{ Throwable -> 0x0038 }
        r3 = r3.invoke(r2);	 Catch:{ Throwable -> 0x0038 }
        r2 = r2.next();	 Catch:{ Throwable -> 0x0038 }
        if (r2 != 0) goto L_0x0024;
    L_0x0020:
        defpackage.akax.a(r0, r1);
        return r3;
    L_0x0024:
        r2 = new java.lang.IllegalStateException;	 Catch:{ Throwable -> 0x0038 }
        r3 = "ResultSet returned more than 1 row for ";
        r4 = java.lang.String.valueOf(r5);	 Catch:{ Throwable -> 0x0038 }
        r3 = r3.concat(r4);	 Catch:{ Throwable -> 0x0038 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0038 }
        r2 = (java.lang.Throwable) r2;	 Catch:{ Throwable -> 0x0038 }
        throw r2;	 Catch:{ Throwable -> 0x0038 }
    L_0x0036:
        r2 = move-exception;
        goto L_0x003a;
    L_0x0038:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0036 }
    L_0x003a:
        defpackage.akax.a(r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ainb.e():java.lang.Object");
    }
}

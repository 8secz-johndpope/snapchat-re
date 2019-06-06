package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ohz */
public final class ohz extends ieo implements ajej, Cloneable {
    public final Map<ohy, ohx> a;
    private final idd b;

    /* renamed from: ohz$a */
    public static final class a {
        private final Map<ohy, ohx> a = new LinkedHashMap();
        private final idd b;

        public a(idd idd) {
            akcr.b(idd, "caller");
            this.b = idd;
        }

        public final a a(ohy ohy, ohx ohx) {
            akcr.b(ohy, "tag");
            akcr.b(ohx, "bitmap");
            this.a.put(ohy, ohx);
            return this;
        }

        public final ohz a() {
            return new ohz(this.b, this.a);
        }
    }

    public ohz(idd idd, Map<ohy, ohx> map) {
        akcr.b(idd, "caller");
        akcr.b(map, "bitmaps");
        super((byte) 0);
        this.b = idd;
        this.a = map;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0078 in {5, 9, 12, 15} preds:[]
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
    public final synchronized defpackage.ohz a(defpackage.idd r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = "newOwner";	 Catch:{ all -> 0x0075 }
        defpackage.akcr.b(r5, r0);	 Catch:{ all -> 0x0075 }
        r0 = r4.a;	 Catch:{ all -> 0x0075 }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x0075 }
        r2 = r0.size();	 Catch:{ all -> 0x0075 }
        r1.<init>(r2);	 Catch:{ all -> 0x0075 }
        r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x0075 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0075 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0075 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0075 }
        if (r2 == 0) goto L_0x0035;	 Catch:{ all -> 0x0075 }
        r2 = r0.next();	 Catch:{ all -> 0x0075 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0075 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0075 }
        r2 = (defpackage.ohx) r2;	 Catch:{ all -> 0x0075 }
        r2 = r2.a(r5);	 Catch:{ all -> 0x0075 }
        r1.add(r2);	 Catch:{ all -> 0x0075 }
        goto L_0x001b;	 Catch:{ all -> 0x0075 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0075 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0075 }
        r0 = 10;	 Catch:{ all -> 0x0075 }
        r0 = defpackage.ajyn.a(r1, r0);	 Catch:{ all -> 0x0075 }
        r0 = defpackage.ajzm.a(r0);	 Catch:{ all -> 0x0075 }
        r2 = 16;	 Catch:{ all -> 0x0075 }
        r0 = defpackage.akef.b(r0, r2);	 Catch:{ all -> 0x0075 }
        r2 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x0075 }
        r2.<init>(r0);	 Catch:{ all -> 0x0075 }
        r2 = (java.util.Map) r2;	 Catch:{ all -> 0x0075 }
        r0 = r1.iterator();	 Catch:{ all -> 0x0075 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0075 }
        if (r1 == 0) goto L_0x006e;	 Catch:{ all -> 0x0075 }
        r1 = r0.next();	 Catch:{ all -> 0x0075 }
        r1 = (defpackage.ohx) r1;	 Catch:{ all -> 0x0075 }
        r3 = r1.d;	 Catch:{ all -> 0x0075 }
        r1 = defpackage.ajxs.a(r3, r1);	 Catch:{ all -> 0x0075 }
        r3 = r1.a;	 Catch:{ all -> 0x0075 }
        r1 = r1.b;	 Catch:{ all -> 0x0075 }
        r2.put(r3, r1);	 Catch:{ all -> 0x0075 }
        goto L_0x0054;	 Catch:{ all -> 0x0075 }
        r0 = new ohz;	 Catch:{ all -> 0x0075 }
        r0.<init>(r5, r2);	 Catch:{ all -> 0x0075 }
        monitor-exit(r4);
        return r0;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohz.a(idd):ohz");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0026 in {6, 8, 11} preds:[]
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
    public final synchronized void a() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.a;	 Catch:{ all -> 0x0023 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0023 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0023 }
        r1 = r0.hasNext();	 Catch:{ all -> 0x0023 }
        if (r1 == 0) goto L_0x0021;	 Catch:{ all -> 0x0023 }
        r1 = r0.next();	 Catch:{ all -> 0x0023 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ all -> 0x0023 }
        r1 = r1.getValue();	 Catch:{ all -> 0x0023 }
        r1 = (defpackage.ohx) r1;	 Catch:{ all -> 0x0023 }
        r1.m();	 Catch:{ all -> 0x0023 }
        goto L_0x000b;
        monitor-exit(r2);
        return;
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohz.a():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x006f in {6, 17, 19, 21, 24, 27} preds:[]
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
    public final synchronized defpackage.ohz b(defpackage.idd r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = "newOwner";	 Catch:{ all -> 0x006c }
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x006c }
        r0 = r6.isDisposed();	 Catch:{ all -> 0x006c }
        r1 = 0;
        if (r0 == 0) goto L_0x000f;
        monitor-exit(r6);
        return r1;
        r0 = new java.util.LinkedHashMap;	 Catch:{ all -> 0x006c }
        r0.<init>();	 Catch:{ all -> 0x006c }
        r2 = r6.a;	 Catch:{ all -> 0x006c }
        r2 = r2.entrySet();	 Catch:{ all -> 0x006c }
        r2 = r2.iterator();	 Catch:{ all -> 0x006c }
        r3 = r2.hasNext();	 Catch:{ all -> 0x006c }
        if (r3 == 0) goto L_0x0063;	 Catch:{ all -> 0x006c }
        r3 = r2.next();	 Catch:{ all -> 0x006c }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x006c }
        r4 = r3.getValue();	 Catch:{ all -> 0x006c }
        r4 = (defpackage.ohx) r4;	 Catch:{ all -> 0x006c }
        r4 = r4.b(r7);	 Catch:{ all -> 0x006c }
        if (r4 != 0) goto L_0x0058;	 Catch:{ all -> 0x006c }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x006c }
        r7 = r0.entrySet();	 Catch:{ all -> 0x006c }
        r7 = r7.iterator();	 Catch:{ all -> 0x006c }
        r0 = r7.hasNext();	 Catch:{ all -> 0x006c }
        if (r0 == 0) goto L_0x0056;	 Catch:{ all -> 0x006c }
        r0 = r7.next();	 Catch:{ all -> 0x006c }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x006c }
        r0 = r0.getValue();	 Catch:{ all -> 0x006c }
        r0 = (defpackage.ohx) r0;	 Catch:{ all -> 0x006c }
        r0.dispose();	 Catch:{ all -> 0x006c }
        goto L_0x0040;
        monitor-exit(r6);
        return r1;
        r5 = r0;	 Catch:{ all -> 0x006c }
        r5 = (java.util.Map) r5;	 Catch:{ all -> 0x006c }
        r3 = r3.getKey();	 Catch:{ all -> 0x006c }
        r5.put(r3, r4);	 Catch:{ all -> 0x006c }
        goto L_0x001e;	 Catch:{ all -> 0x006c }
        r1 = new ohz;	 Catch:{ all -> 0x006c }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x006c }
        r1.<init>(r7, r0);	 Catch:{ all -> 0x006c }
        monitor-exit(r6);
        return r1;
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohz.b(idd):ohz");
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final ohx c() {
        return (ohx) this.a.get(ohy.SCREEN);
    }

    public final Object clone() {
        return super.clone();
    }

    public final ohx d() {
        ohx ohx = (ohx) this.a.get(ohy.SKY_FILTER);
        if (ohx == null) {
            ohx = (ohx) this.a.get(ohy.STYLIZED);
        }
        if (ohx == null) {
            ohx = (ohx) this.a.get(ohy.MAGIC_TOOLS);
        }
        if (ohx == null) {
            ohx = (ohx) this.a.get(ohy.LENSES_TOOL);
        }
        return ohx == null ? (ohx) this.a.get(ohy.VIDEO) : ohx;
    }

    public final synchronized void dispose() {
        m();
    }

    public final synchronized boolean isDisposed() {
        return n();
    }
}

package defpackage;

import defpackage.lsd.b;

/* renamed from: lss */
public final class lss implements ajdu<b, b> {
    final int a;
    final boolean b;
    final boolean c;

    /* renamed from: lss$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ lss a;

        a(lss lss) {
            this.a = lss;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:72:0x0155 in {13, 14, 15, 16, 17, 27, 28, 29, 30, 31, 34, 35, 41, 43, 49, 50, 51, 61, 62, 63, 66, 67, 68, 69, 71} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private defpackage.lsd.b a(defpackage.lsd.b r19) {
            /*
            r18 = this;
            r1 = r18;
            r0 = r19;
            r2 = "model";
            defpackage.akcr.b(r0, r2);
            r2 = r0 instanceof defpackage.lsd.b.b;	 Catch:{ all -> 0x0153 }
            if (r2 == 0) goto L_0x0152;	 Catch:{ all -> 0x0153 }
            r2 = r1.a;	 Catch:{ all -> 0x0153 }
            r2 = r2.b;	 Catch:{ all -> 0x0153 }
            r3 = 1;	 Catch:{ all -> 0x0153 }
            r4 = 0;	 Catch:{ all -> 0x0153 }
            if (r2 == 0) goto L_0x0046;	 Catch:{ all -> 0x0153 }
            r2 = r1.a;	 Catch:{ all -> 0x0153 }
            r2 = r2.a;	 Catch:{ all -> 0x0153 }
            r5 = r0;	 Catch:{ all -> 0x0153 }
            r5 = (defpackage.lsd.b.b) r5;	 Catch:{ all -> 0x0153 }
            r5 = r5.b;	 Catch:{ all -> 0x0153 }
            r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x0153 }
            r5 = r5.iterator();	 Catch:{ all -> 0x0153 }
            r6 = 0;	 Catch:{ all -> 0x0153 }
            r7 = r5.hasNext();	 Catch:{ all -> 0x0153 }
            if (r7 == 0) goto L_0x0040;	 Catch:{ all -> 0x0153 }
            r7 = r5.next();	 Catch:{ all -> 0x0153 }
            r7 = (defpackage.lrw.a) r7;	 Catch:{ all -> 0x0153 }
            r8 = r7 instanceof defpackage.lrw.a.c;	 Catch:{ all -> 0x0153 }
            if (r8 != 0) goto L_0x003d;	 Catch:{ all -> 0x0153 }
            r7 = r7.a();	 Catch:{ all -> 0x0153 }
            if (r7 != 0) goto L_0x003d;	 Catch:{ all -> 0x0153 }
            r7 = 1;	 Catch:{ all -> 0x0153 }
            goto L_0x003e;	 Catch:{ all -> 0x0153 }
            r7 = 0;	 Catch:{ all -> 0x0153 }
            r6 = r6 + r7;	 Catch:{ all -> 0x0153 }
            goto L_0x0025;	 Catch:{ all -> 0x0153 }
            r2 = r2 - r6;	 Catch:{ all -> 0x0153 }
            r2 = java.lang.Math.max(r4, r2);	 Catch:{ all -> 0x0153 }
            goto L_0x0047;	 Catch:{ all -> 0x0153 }
            r2 = 0;	 Catch:{ all -> 0x0153 }
            r5 = r1.a;	 Catch:{ all -> 0x0153 }
            r5 = r5.c;	 Catch:{ all -> 0x0153 }
            if (r5 == 0) goto L_0x007e;	 Catch:{ all -> 0x0153 }
            r5 = r1.a;	 Catch:{ all -> 0x0153 }
            r5 = r5.a;	 Catch:{ all -> 0x0153 }
            r6 = r0;	 Catch:{ all -> 0x0153 }
            r6 = (defpackage.lsd.b.b) r6;	 Catch:{ all -> 0x0153 }
            r6 = r6.b;	 Catch:{ all -> 0x0153 }
            r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x0153 }
            r6 = r6.iterator();	 Catch:{ all -> 0x0153 }
            r7 = 0;	 Catch:{ all -> 0x0153 }
            r8 = r6.hasNext();	 Catch:{ all -> 0x0153 }
            if (r8 == 0) goto L_0x0078;	 Catch:{ all -> 0x0153 }
            r8 = r6.next();	 Catch:{ all -> 0x0153 }
            r8 = (defpackage.lrw.a) r8;	 Catch:{ all -> 0x0153 }
            r9 = r8 instanceof defpackage.lrw.a.c;	 Catch:{ all -> 0x0153 }
            if (r9 != 0) goto L_0x0075;	 Catch:{ all -> 0x0153 }
            r8 = r8.a();	 Catch:{ all -> 0x0153 }
            if (r8 == 0) goto L_0x0075;	 Catch:{ all -> 0x0153 }
            r8 = 1;	 Catch:{ all -> 0x0153 }
            goto L_0x0076;	 Catch:{ all -> 0x0153 }
            r8 = 0;	 Catch:{ all -> 0x0153 }
            r7 = r7 + r8;	 Catch:{ all -> 0x0153 }
            goto L_0x005d;	 Catch:{ all -> 0x0153 }
            r5 = r5 - r7;	 Catch:{ all -> 0x0153 }
            r5 = java.lang.Math.max(r4, r5);	 Catch:{ all -> 0x0153 }
            goto L_0x007f;	 Catch:{ all -> 0x0153 }
            r5 = 0;	 Catch:{ all -> 0x0153 }
            if (r2 > 0) goto L_0x0088;	 Catch:{ all -> 0x0153 }
            if (r5 <= 0) goto L_0x0084;	 Catch:{ all -> 0x0153 }
            goto L_0x0088;	 Catch:{ all -> 0x0153 }
            r0 = (defpackage.lsd.b.b) r0;	 Catch:{ all -> 0x0153 }
            goto L_0x0150;	 Catch:{ all -> 0x0153 }
            r6 = r0;	 Catch:{ all -> 0x0153 }
            r6 = (defpackage.lsd.b.b) r6;	 Catch:{ all -> 0x0153 }
            r6 = r6.b;	 Catch:{ all -> 0x0153 }
            r6 = (java.util.Collection) r6;	 Catch:{ all -> 0x0153 }
            r6 = defpackage.ajyu.h(r6);	 Catch:{ all -> 0x0153 }
            r7 = 6;	 Catch:{ all -> 0x0153 }
            if (r2 <= 0) goto L_0x00b3;	 Catch:{ all -> 0x0153 }
            r8 = 1;	 Catch:{ all -> 0x0153 }
            r9 = r6.size();	 Catch:{ all -> 0x0153 }
            r10 = defpackage.lst.a;	 Catch:{ all -> 0x0153 }
            r11 = "InsertFakeItemsIfMissingViewModelTransformer+";	 Catch:{ all -> 0x0153 }
            r12 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0153 }
            r11 = r11.concat(r12);	 Catch:{ all -> 0x0153 }
            r10 = defpackage.lrw.a.d.a(r10, r11, r4, r4, r7);	 Catch:{ all -> 0x0153 }
            r6.add(r9, r10);	 Catch:{ all -> 0x0153 }
            if (r8 == r2) goto L_0x00b3;	 Catch:{ all -> 0x0153 }
            r8 = r8 + 1;	 Catch:{ all -> 0x0153 }
            goto L_0x0097;	 Catch:{ all -> 0x0153 }
            if (r5 <= 0) goto L_0x00cb;	 Catch:{ all -> 0x0153 }
            r2 = defpackage.lst.b;	 Catch:{ all -> 0x0153 }
            r8 = "InsertFakeItemsIfMissingViewModelTransformer-";	 Catch:{ all -> 0x0153 }
            r9 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x0153 }
            r8 = r8.concat(r9);	 Catch:{ all -> 0x0153 }
            r2 = defpackage.lrw.a.d.a(r2, r8, r4, r4, r7);	 Catch:{ all -> 0x0153 }
            r6.add(r4, r2);	 Catch:{ all -> 0x0153 }
            r5 = r5 + -1;	 Catch:{ all -> 0x0153 }
            goto L_0x00b3;	 Catch:{ all -> 0x0153 }
            r2 = r6.iterator();	 Catch:{ all -> 0x0153 }
            r5 = 0;	 Catch:{ all -> 0x0153 }
            r7 = r2.hasNext();	 Catch:{ all -> 0x0153 }
            r8 = -1;	 Catch:{ all -> 0x0153 }
            if (r7 == 0) goto L_0x00e5;	 Catch:{ all -> 0x0153 }
            r7 = r2.next();	 Catch:{ all -> 0x0153 }
            r7 = (defpackage.lrw.a) r7;	 Catch:{ all -> 0x0153 }
            r7 = r7 instanceof defpackage.lrw.a.c;	 Catch:{ all -> 0x0153 }
            if (r7 == 0) goto L_0x00e2;	 Catch:{ all -> 0x0153 }
            goto L_0x00e6;	 Catch:{ all -> 0x0153 }
            r5 = r5 + 1;	 Catch:{ all -> 0x0153 }
            goto L_0x00d0;	 Catch:{ all -> 0x0153 }
            r5 = -1;	 Catch:{ all -> 0x0153 }
            r2 = r0;	 Catch:{ all -> 0x0153 }
            r2 = (defpackage.lsd.b.b) r2;	 Catch:{ all -> 0x0153 }
            r2 = r2.b();	 Catch:{ all -> 0x0153 }
            if (r2 != 0) goto L_0x0133;	 Catch:{ all -> 0x0153 }
            r2 = r0;	 Catch:{ all -> 0x0153 }
            r2 = (defpackage.lsd.b.b) r2;	 Catch:{ all -> 0x0153 }
            r2 = r2.b;	 Catch:{ all -> 0x0153 }
            r2 = r2.size();	 Catch:{ all -> 0x0153 }
            r7 = r0;	 Catch:{ all -> 0x0153 }
            r7 = (defpackage.lsd.b.b) r7;	 Catch:{ all -> 0x0153 }
            r7 = r7.c;	 Catch:{ all -> 0x0153 }
            r7 = r7 + r3;	 Catch:{ all -> 0x0153 }
            if (r2 <= r7) goto L_0x0133;	 Catch:{ all -> 0x0153 }
            r2 = r6.iterator();	 Catch:{ all -> 0x0153 }
            r3 = r2.hasNext();	 Catch:{ all -> 0x0153 }
            if (r3 == 0) goto L_0x0131;	 Catch:{ all -> 0x0153 }
            r3 = r2.next();	 Catch:{ all -> 0x0153 }
            r3 = (defpackage.lrw.a) r3;	 Catch:{ all -> 0x0153 }
            r3 = r3.d();	 Catch:{ all -> 0x0153 }
            r5 = r0;	 Catch:{ all -> 0x0153 }
            r5 = (defpackage.lsd.b.b) r5;	 Catch:{ all -> 0x0153 }
            r5 = r5.b;	 Catch:{ all -> 0x0153 }
            r7 = r0;	 Catch:{ all -> 0x0153 }
            r7 = (defpackage.lsd.b.b) r7;	 Catch:{ all -> 0x0153 }
            r7 = r7.c;	 Catch:{ all -> 0x0153 }
            r5 = r5.get(r7);	 Catch:{ all -> 0x0153 }
            r5 = (defpackage.lrw.a) r5;	 Catch:{ all -> 0x0153 }
            r5 = r5.d();	 Catch:{ all -> 0x0153 }
            r3 = defpackage.akcr.a(r3, r5);	 Catch:{ all -> 0x0153 }
            if (r3 != 0) goto L_0x0134;	 Catch:{ all -> 0x0153 }
            r4 = r4 + 1;	 Catch:{ all -> 0x0153 }
            goto L_0x0104;	 Catch:{ all -> 0x0153 }
            r4 = -1;	 Catch:{ all -> 0x0153 }
            goto L_0x0134;	 Catch:{ all -> 0x0153 }
            r4 = r5;	 Catch:{ all -> 0x0153 }
            r9 = r0;	 Catch:{ all -> 0x0153 }
            r9 = (defpackage.lsd.b.b) r9;	 Catch:{ all -> 0x0153 }
            r10 = 0;	 Catch:{ all -> 0x0153 }
            r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x0153 }
            r11 = defpackage.ajyu.k(r6);	 Catch:{ all -> 0x0153 }
            if (r4 != r8) goto L_0x0144;	 Catch:{ all -> 0x0153 }
            r0 = (defpackage.lsd.b.b) r0;	 Catch:{ all -> 0x0153 }
            r4 = r0.c;	 Catch:{ all -> 0x0153 }
            r12 = r4;	 Catch:{ all -> 0x0153 }
            r13 = 0;	 Catch:{ all -> 0x0153 }
            r14 = 0;	 Catch:{ all -> 0x0153 }
            r15 = 0;	 Catch:{ all -> 0x0153 }
            r16 = 0;	 Catch:{ all -> 0x0153 }
            r17 = 121; // 0x79 float:1.7E-43 double:6.0E-322;	 Catch:{ all -> 0x0153 }
            r0 = defpackage.lsd.b.b.a(r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x0153 }
            r0 = (defpackage.lsd.b) r0;	 Catch:{ all -> 0x0153 }
            return r0;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lss$a.a(lsd$b):lsd$b");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((b) obj);
        }
    }

    public lss() {
        this(0, false, false, 7);
    }

    private lss(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        if ((this.a > 0 ? 1 : null) == null) {
            throw new IllegalArgumentException("insertPerSide must be greater than 0".toString());
        }
    }

    public /* synthetic */ lss(int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        this(i, z, z2);
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        Object p = ajdp.p(new a(this));
        akcr.a(p, "upstream.map { model ->\n…}\n            }\n        }");
        return (ajdt) p;
    }
}

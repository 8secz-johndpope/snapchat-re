package defpackage;

/* renamed from: gfg */
public final class gfg {
    private static final gfc[] a = gfc.values();

    private static final int a(int i, int i2) {
        return Math.max(i, 0) + Math.max(i2, 0);
    }

    private static final long a(long j, long j2) {
        return Math.max(j, 0) + Math.max(j2, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:67:0x01b1 in {3, 13, 14, 17, 19, 22, 25, 28, 29, 30, 35, 36, 39, 40, 42, 43, 46, 48, 49, 52, 54, 58, 59, 60, 61, 62, 64, 66} preds:[]
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
    public static final defpackage.gff a(java.util.List<defpackage.gff> r37) {
        /*
        r0 = r37;
        r1 = "receiver$0";
        defpackage.akcr.b(r0, r1);
        r2 = r37.isEmpty();
        if (r2 == 0) goto L_0x001f;
        r0 = new gff;
        r4 = defpackage.gfc.UNKNOWN;
        r5 = 0;
        r6 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r3 = r0;
        r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12);
        return r0;
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x01a7;
        r2 = r0.next();
        r3 = r0.hasNext();
        if (r3 == 0) goto L_0x01a4;
        r3 = r0.next();
        r3 = (defpackage.gff) r3;
        r2 = (defpackage.gff) r2;
        r14 = new gff;
        r4 = r2.a;
        r5 = r3.a;
        r6 = a;
        r4 = r4.ordinal();
        r5 = r5.ordinal();
        r4 = java.lang.Math.max(r4, r5);
        r5 = r6[r4];
        r6 = r2.c;
        r8 = r3.c;
        r7 = defpackage.gfg.a(r6, r8);
        r4 = r2.b;
        if (r4 == 0) goto L_0x0065;
        r4 = r3.b;
        if (r4 == 0) goto L_0x0065;
        r10 = 1;
        goto L_0x0066;
        r10 = 0;
        r4 = r2.d;
        r11 = r3.d;
        if (r4 != 0) goto L_0x0071;
        r28 = r7;
        r13 = r10;
        r9 = r11;
        goto L_0x00dc;
        if (r11 != 0) goto L_0x0078;
        r9 = r4;
        r28 = r7;
        r13 = r10;
        goto L_0x00dc;
        r12 = new gfj;
        r13 = r4.a;
        r15 = r11.a;
        r16 = java.lang.Math.max(r13, r15);
        r28 = r7;
        r6 = r4.b;
        r13 = r10;
        r9 = r11.b;
        r17 = defpackage.gfg.a(r6, r9);
        r6 = r4.c;
        r9 = r11.c;
        r19 = defpackage.gfg.a(r6, r9);
        r6 = r4.d;
        r9 = r11.d;
        r21 = defpackage.gfg.a(r6, r9);
        r6 = r4.e;
        r7 = r11.e;
        r23 = defpackage.gfg.a(r6, r7);
        r6 = r4.f;
        r9 = r11.f;
        r24 = defpackage.gfg.a(r6, r9);
        r6 = r4.g;
        r7 = r11.g;
        r9 = "";
        r10 = defpackage.akcr.a(r6, r9);
        if (r10 == 0) goto L_0x00bc;
        r26 = r7;
        goto L_0x00cf;
        r9 = defpackage.akcr.a(r7, r9);
        if (r9 == 0) goto L_0x00c3;
        goto L_0x00c9;
        r7 = defpackage.akcr.a(r6, r7);
        if (r7 == 0) goto L_0x00cc;
        r26 = r6;
        goto L_0x00cf;
        r6 = "...";
        goto L_0x00c9;
        r4 = r4.h;
        r6 = r11.h;
        r27 = defpackage.ajzm.a(r4, r6);
        r15 = r12;
        r15.<init>(r16, r17, r19, r21, r23, r24, r26, r27);
        r9 = r12;
        r4 = r2.e;
        r6 = r3.e;
        defpackage.akcr.b(r4, r1);
        r7 = "other";
        defpackage.akcr.b(r6, r7);
        r10 = new gdz;
        r11 = r4.a;
        r21 = r9;
        r8 = r6.a;
        r16 = defpackage.gfg.a(r11, r8);
        r8 = r4.b;
        r11 = r6.b;
        r18 = defpackage.gfg.a(r8, r11);
        r4 = r4.c;
        if (r4 == 0) goto L_0x0107;
        r4 = r6.c;
        if (r4 == 0) goto L_0x0107;
        r20 = 1;
        goto L_0x0109;
        r20 = 0;
        r15 = r10;
        r15.<init>(r16, r18, r20);
        r4 = r2.f;
        r6 = r3.f;
        if (r4 != 0) goto L_0x0117;
        r11 = r6;
        r16 = r10;
        goto L_0x0135;
        if (r6 != 0) goto L_0x011b;
        r11 = r4;
        goto L_0x0114;
        r8 = new gfa;
        r11 = r4.a;
        r15 = r8;
        r7 = r6.a;
        r7 = defpackage.gfg.a(r11, r7);
        r11 = r4.b;
        r16 = r10;
        r9 = r6.b;
        r9 = defpackage.gfg.a(r11, r9);
        r6 = r15;
        r6.<init>(r7, r9);
        r11 = r6;
        r6 = r2.g;
        r7 = r3.g;
        if (r6 != 0) goto L_0x013e;
        r10 = r5;
        r15 = r7;
        goto L_0x015a;
        if (r7 != 0) goto L_0x0143;
        r10 = r5;
        r15 = r6;
        goto L_0x015a;
        r8 = new gdu;
        r9 = r6.a;
        r10 = r7.a;
        r9 = defpackage.gfg.a(r9, r10);
        r10 = r5;
        r4 = r6.b;
        r6 = r7.b;
        r4 = defpackage.gfg.a(r4, r6);
        r8.<init>(r9, r4);
        r15 = r8;
        r2 = r2.h;
        r3 = r3.h;
        if (r2 != 0) goto L_0x0162;
        r2 = r3;
        goto L_0x0193;
        if (r3 != 0) goto L_0x0165;
        goto L_0x0193;
        r4 = new gdv;
        r5 = r2.a;
        r7 = r3.a;
        r31 = defpackage.gfg.a(r5, r7);
        r5 = r2.b;
        r7 = r3.b;
        r33 = defpackage.gfg.a(r5, r7);
        r5 = r2.c;
        r6 = r3.c;
        if (r5 != 0) goto L_0x0183;
        if (r6 == 0) goto L_0x0180;
        goto L_0x0183;
        r35 = 0;
        goto L_0x0185;
        r35 = 1;
        r2 = r2.d;
        r3 = r3.d;
        r36 = defpackage.gfg.a(r2, r3);
        r30 = r4;
        r30.<init>(r31, r33, r35, r36);
        r2 = r4;
        r4 = r14;
        r5 = r10;
        r6 = r13;
        r7 = r28;
        r9 = r21;
        r10 = r16;
        r12 = r15;
        r13 = r2;
        r4.<init>(r5, r6, r7, r9, r10, r11, r12, r13);
        r2 = r14;
        goto L_0x002f;
        r2 = (defpackage.gff) r2;
        return r2;
        r0 = new java.lang.UnsupportedOperationException;
        r1 = "Empty collection can't be reduced.";
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfg.a(java.util.List):gff");
    }
}

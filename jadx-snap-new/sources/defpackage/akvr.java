package defpackage;

/* renamed from: akvr */
public final class akvr {
    private static void a(byte[] bArr) {
        if (bArr != null) {
            akwc.a(bArr);
        }
    }

    private static void a(int[] iArr) {
        if (iArr != null) {
            akwc.a(iArr);
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    private static void a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, 112, iArr2, 0, 16);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 8; i4 > 0; i4--) {
            akvr.a(iArr2, iArr, i2, iArr3);
            akvo.a(iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (i2 + 64) - i3;
            i2 += 16;
        }
        System.arraycopy(iArr4, 0, iArr, 0, 128);
    }

    private static void a(int[][] iArr) {
        for (int[] a : iArr) {
            akvr.a(a);
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        } else if (bArr2 != null) {
            return akvr.b(bArr, bArr2);
        } else {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, int i) {
        akvq akvq = new akvq(new akvm());
        akvq.a(bArr, bArr2);
        return ((akwb) akvq.a(i << 3)).a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00ac in {4, 12, 15, 18, 21, 24, 27, 30} preds:[]
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
    private static byte[] b(byte[] r17, byte[] r18) {
        /*
        r0 = r17;
        r1 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r2 = r18;
        r1 = defpackage.akvr.a(r0, r2, r1);
        r2 = 0;
        r3 = r1.length;	 Catch:{ all -> 0x00a4 }
        r4 = 2;	 Catch:{ all -> 0x00a4 }
        r3 = r3 >>> r4;	 Catch:{ all -> 0x00a4 }
        r2 = new int[r3];	 Catch:{ all -> 0x00a4 }
        r5 = 0;	 Catch:{ all -> 0x00a4 }
        r6 = 0;	 Catch:{ all -> 0x00a4 }
        r7 = 0;	 Catch:{ all -> 0x00a4 }
        if (r6 >= r3) goto L_0x0020;	 Catch:{ all -> 0x00a4 }
        r8 = defpackage.akwe.a(r1, r7);	 Catch:{ all -> 0x00a4 }
        r2[r6] = r8;	 Catch:{ all -> 0x00a4 }
        r7 = r7 + 4;	 Catch:{ all -> 0x00a4 }
        r6 = r6 + 1;	 Catch:{ all -> 0x00a4 }
        goto L_0x0013;	 Catch:{ all -> 0x00a4 }
        r6 = 0;	 Catch:{ all -> 0x00a4 }
        if (r6 >= r3) goto L_0x008a;	 Catch:{ all -> 0x00a4 }
        r7 = 16;	 Catch:{ all -> 0x00a4 }
        r8 = new int[r7];	 Catch:{ all -> 0x00a4 }
        r7 = new int[r7];	 Catch:{ all -> 0x00a4 }
        r9 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ all -> 0x00a4 }
        r10 = new int[r9];	 Catch:{ all -> 0x00a4 }
        r11 = new int[r9];	 Catch:{ all -> 0x00a4 }
        r12 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ all -> 0x00a4 }
        r13 = new int[r12][];	 Catch:{ all -> 0x00a4 }
        r15 = 1;
        r14 = 4;
        java.lang.System.arraycopy(r2, r6, r11, r5, r9);	 Catch:{ all -> 0x0076 }
        r4 = 0;	 Catch:{ all -> 0x0076 }
        if (r4 >= r12) goto L_0x0047;	 Catch:{ all -> 0x0076 }
        r16 = defpackage.akwc.b(r11);	 Catch:{ all -> 0x0076 }
        r13[r4] = r16;	 Catch:{ all -> 0x0076 }
        defpackage.akvr.a(r11, r8, r7, r10, r14);	 Catch:{ all -> 0x0076 }
        r4 = r4 + 1;	 Catch:{ all -> 0x0076 }
        goto L_0x0039;	 Catch:{ all -> 0x0076 }
        r4 = 0;	 Catch:{ all -> 0x0076 }
        if (r4 >= r12) goto L_0x005d;	 Catch:{ all -> 0x0076 }
        r16 = 112; // 0x70 float:1.57E-43 double:5.53E-322;	 Catch:{ all -> 0x0076 }
        r12 = r11[r16];	 Catch:{ all -> 0x0076 }
        r12 = r12 & 4095;	 Catch:{ all -> 0x0076 }
        r12 = r13[r12];	 Catch:{ all -> 0x0076 }
        defpackage.akvr.a(r11, r12, r5, r11);	 Catch:{ all -> 0x0076 }
        defpackage.akvr.a(r11, r8, r7, r10, r14);	 Catch:{ all -> 0x0076 }
        r4 = r4 + 1;	 Catch:{ all -> 0x0076 }
        r12 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ all -> 0x0076 }
        goto L_0x0048;	 Catch:{ all -> 0x0076 }
        java.lang.System.arraycopy(r11, r5, r2, r6, r9);	 Catch:{ all -> 0x0076 }
        defpackage.akvr.a(r13);	 Catch:{ all -> 0x00a4 }
        r4 = new int[r14][];	 Catch:{ all -> 0x00a4 }
        r4[r5] = r11;	 Catch:{ all -> 0x00a4 }
        r4[r15] = r8;	 Catch:{ all -> 0x00a4 }
        r8 = 2;	 Catch:{ all -> 0x00a4 }
        r4[r8] = r7;	 Catch:{ all -> 0x00a4 }
        r7 = 3;	 Catch:{ all -> 0x00a4 }
        r4[r7] = r10;	 Catch:{ all -> 0x00a4 }
        defpackage.akvr.a(r4);	 Catch:{ all -> 0x00a4 }
        r6 = r6 + 128;	 Catch:{ all -> 0x00a4 }
        r4 = 2;	 Catch:{ all -> 0x00a4 }
        goto L_0x0021;	 Catch:{ all -> 0x00a4 }
        r0 = move-exception;	 Catch:{ all -> 0x00a4 }
        defpackage.akvr.a(r13);	 Catch:{ all -> 0x00a4 }
        r3 = new int[r14][];	 Catch:{ all -> 0x00a4 }
        r3[r5] = r11;	 Catch:{ all -> 0x00a4 }
        r3[r15] = r8;	 Catch:{ all -> 0x00a4 }
        r4 = 2;	 Catch:{ all -> 0x00a4 }
        r3[r4] = r7;	 Catch:{ all -> 0x00a4 }
        r4 = 3;	 Catch:{ all -> 0x00a4 }
        r3[r4] = r10;	 Catch:{ all -> 0x00a4 }
        defpackage.akvr.a(r3);	 Catch:{ all -> 0x00a4 }
        throw r0;	 Catch:{ all -> 0x00a4 }
        r4 = 0;	 Catch:{ all -> 0x00a4 }
        if (r5 >= r3) goto L_0x0097;	 Catch:{ all -> 0x00a4 }
        r6 = r2[r5];	 Catch:{ all -> 0x00a4 }
        defpackage.akwe.b(r6, r1, r4);	 Catch:{ all -> 0x00a4 }
        r4 = r4 + 4;	 Catch:{ all -> 0x00a4 }
        r5 = r5 + 1;	 Catch:{ all -> 0x00a4 }
        goto L_0x008b;	 Catch:{ all -> 0x00a4 }
        r3 = 32;	 Catch:{ all -> 0x00a4 }
        r0 = defpackage.akvr.a(r0, r1, r3);	 Catch:{ all -> 0x00a4 }
        defpackage.akvr.a(r1);
        defpackage.akvr.a(r2);
        return r0;
        r0 = move-exception;
        defpackage.akvr.a(r1);
        defpackage.akvr.a(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akvr.b(byte[], byte[]):byte[]");
    }
}

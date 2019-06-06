package defpackage;

/* renamed from: auv */
public final class auv {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] b = new char[256];
    private static final char[] c = new char[256];
    private static final byte[] d = new byte[103];

    static {
        int i;
        for (int i2 = 0; i2 < 256; i2++) {
            char[] cArr = b;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(i2 >> 4) & 15];
            c[i2] = cArr2[i2 & 15];
        }
        for (i = 0; i <= 70; i++) {
            d[i] = (byte) -1;
        }
        for (i = 0; i < 10; i = (byte) (i + 1)) {
            d[i + 48] = i;
        }
        for (int i3 = 0; i3 < 6; i3 = (byte) (i3 + 1)) {
            byte[] bArr = d;
            byte b = (byte) (i3 + 10);
            bArr[i3 + 65] = b;
            bArr[i3 + 97] = b;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x005a in {7, 10, 13, 16, 17, 18, 20, 22, 24} preds:[]
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
    public static byte[] a(java.lang.String r10) {
        /*
        r0 = r10.length();
        r1 = r0 & 1;
        if (r1 != 0) goto L_0x0052;
        r1 = r0 >> 1;
        r1 = new byte[r1];
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        if (r3 >= r0) goto L_0x003e;
        r6 = r3 + 1;
        r3 = r10.charAt(r3);
        r7 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r3 <= r7) goto L_0x001d;
        goto L_0x003f;
        r8 = d;
        r3 = r8[r3];
        r8 = -1;
        if (r3 != r8) goto L_0x0025;
        goto L_0x003f;
        r9 = r6 + 1;
        r6 = r10.charAt(r6);
        if (r6 <= r7) goto L_0x002e;
        goto L_0x003f;
        r7 = d;
        r6 = r7[r6];
        if (r6 != r8) goto L_0x0035;
        goto L_0x003f;
        r3 = r3 << 4;
        r3 = r3 | r6;
        r3 = (byte) r3;
        r1[r4] = r3;
        r4 = r4 + r5;
        r3 = r9;
        goto L_0x000f;
        r5 = 0;
        if (r5 != 0) goto L_0x0042;
        return r1;
        r0 = new java.lang.IllegalArgumentException;
        r10 = java.lang.String.valueOf(r10);
        r1 = "Invalid hexadecimal digit: ";
        r10 = r1.concat(r10);
        r0.<init>(r10);
        throw r0;
        r10 = new java.lang.IllegalArgumentException;
        r0 = "Odd number of characters.";
        r10.<init>(r0);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auv.a(java.lang.String):byte[]");
    }
}

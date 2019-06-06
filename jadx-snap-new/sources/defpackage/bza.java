package defpackage;

/* renamed from: bza */
public final class bza {
    public static final byte[] a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    public static final float[] b = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    /* renamed from: bza$a */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* renamed from: bza$b */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final float d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;

        public b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = z;
            this.f = z2;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = z3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0065 in {13, 14, 15, 19, 20, 23, 26, 29} preds:[]
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
    public static int a(byte[] r8, int r9) {
        /*
        r0 = c;
        monitor-enter(r0);
        r1 = 0;
        r2 = 0;
        r3 = 0;
        if (r2 >= r9) goto L_0x003e;
        r4 = r9 + -2;
        if (r2 >= r4) goto L_0x0021;
        r4 = r8[r2];	 Catch:{ all -> 0x0062 }
        if (r4 != 0) goto L_0x001e;	 Catch:{ all -> 0x0062 }
        r4 = r2 + 1;	 Catch:{ all -> 0x0062 }
        r4 = r8[r4];	 Catch:{ all -> 0x0062 }
        if (r4 != 0) goto L_0x001e;	 Catch:{ all -> 0x0062 }
        r4 = r2 + 2;	 Catch:{ all -> 0x0062 }
        r4 = r8[r4];	 Catch:{ all -> 0x0062 }
        r5 = 3;	 Catch:{ all -> 0x0062 }
        if (r4 != r5) goto L_0x001e;	 Catch:{ all -> 0x0062 }
        goto L_0x0022;	 Catch:{ all -> 0x0062 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0062 }
        goto L_0x0008;	 Catch:{ all -> 0x0062 }
        r2 = r9;	 Catch:{ all -> 0x0062 }
        if (r2 >= r9) goto L_0x0006;	 Catch:{ all -> 0x0062 }
        r4 = d;	 Catch:{ all -> 0x0062 }
        r4 = r4.length;	 Catch:{ all -> 0x0062 }
        if (r4 > r3) goto L_0x0034;	 Catch:{ all -> 0x0062 }
        r4 = d;	 Catch:{ all -> 0x0062 }
        r5 = r4.length;	 Catch:{ all -> 0x0062 }
        r5 = r5 << 1;	 Catch:{ all -> 0x0062 }
        r4 = java.util.Arrays.copyOf(r4, r5);	 Catch:{ all -> 0x0062 }
        d = r4;	 Catch:{ all -> 0x0062 }
        r4 = d;	 Catch:{ all -> 0x0062 }
        r5 = r3 + 1;	 Catch:{ all -> 0x0062 }
        r4[r3] = r2;	 Catch:{ all -> 0x0062 }
        r2 = r2 + 3;	 Catch:{ all -> 0x0062 }
        r3 = r5;	 Catch:{ all -> 0x0062 }
        goto L_0x0006;	 Catch:{ all -> 0x0062 }
        r9 = r9 - r3;	 Catch:{ all -> 0x0062 }
        r2 = 0;	 Catch:{ all -> 0x0062 }
        r4 = 0;	 Catch:{ all -> 0x0062 }
        r5 = 0;	 Catch:{ all -> 0x0062 }
        if (r2 >= r3) goto L_0x005b;	 Catch:{ all -> 0x0062 }
        r6 = d;	 Catch:{ all -> 0x0062 }
        r6 = r6[r2];	 Catch:{ all -> 0x0062 }
        r6 = r6 - r5;	 Catch:{ all -> 0x0062 }
        java.lang.System.arraycopy(r8, r5, r8, r4, r6);	 Catch:{ all -> 0x0062 }
        r4 = r4 + r6;	 Catch:{ all -> 0x0062 }
        r7 = r4 + 1;	 Catch:{ all -> 0x0062 }
        r8[r4] = r1;	 Catch:{ all -> 0x0062 }
        r4 = r7 + 1;	 Catch:{ all -> 0x0062 }
        r8[r7] = r1;	 Catch:{ all -> 0x0062 }
        r6 = r6 + 3;	 Catch:{ all -> 0x0062 }
        r5 = r5 + r6;	 Catch:{ all -> 0x0062 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0062 }
        goto L_0x0042;	 Catch:{ all -> 0x0062 }
        r1 = r9 - r4;	 Catch:{ all -> 0x0062 }
        java.lang.System.arraycopy(r8, r5, r8, r4, r1);	 Catch:{ all -> 0x0062 }
        monitor-exit(r0);	 Catch:{ all -> 0x0062 }
        return r9;	 Catch:{ all -> 0x0062 }
        r8 = move-exception;	 Catch:{ all -> 0x0062 }
        monitor-exit(r0);	 Catch:{ all -> 0x0062 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bza.a(byte[], int):int");
    }

    /* JADX WARNING: Missing block: B:64:0x0096, code skipped:
            r8 = true;
     */
    public static int a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
        r0 = r9 - r8;
        r1 = 0;
        r2 = 1;
        if (r0 < 0) goto L_0x0008;
    L_0x0006:
        r3 = 1;
        goto L_0x0009;
    L_0x0008:
        r3 = 0;
    L_0x0009:
        defpackage.byo.b(r3);
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        return r9;
    L_0x000f:
        r3 = 2;
        if (r10 == 0) goto L_0x0040;
    L_0x0012:
        r4 = r10[r1];
        if (r4 == 0) goto L_0x001c;
    L_0x0016:
        defpackage.bza.a(r10);
        r8 = r8 + -3;
        return r8;
    L_0x001c:
        if (r0 <= r2) goto L_0x002b;
    L_0x001e:
        r4 = r10[r2];
        if (r4 == 0) goto L_0x002b;
    L_0x0022:
        r4 = r7[r8];
        if (r4 != r2) goto L_0x002b;
    L_0x0026:
        defpackage.bza.a(r10);
        r8 = r8 - r3;
        return r8;
    L_0x002b:
        if (r0 <= r3) goto L_0x0040;
    L_0x002d:
        r4 = r10[r3];
        if (r4 == 0) goto L_0x0040;
    L_0x0031:
        r4 = r7[r8];
        if (r4 != 0) goto L_0x0040;
    L_0x0035:
        r4 = r8 + 1;
        r4 = r7[r4];
        if (r4 != r2) goto L_0x0040;
    L_0x003b:
        defpackage.bza.a(r10);
        r8 = r8 - r2;
        return r8;
    L_0x0040:
        r4 = r9 + -1;
        r8 = r8 + r3;
    L_0x0043:
        if (r8 >= r4) goto L_0x0066;
    L_0x0045:
        r5 = r7[r8];
        r5 = r5 & 254;
        if (r5 != 0) goto L_0x0063;
    L_0x004b:
        r5 = r8 + -2;
        r6 = r7[r5];
        if (r6 != 0) goto L_0x0061;
    L_0x0051:
        r6 = r8 + -1;
        r6 = r7[r6];
        if (r6 != 0) goto L_0x0061;
    L_0x0057:
        r6 = r7[r8];
        if (r6 != r2) goto L_0x0061;
    L_0x005b:
        if (r10 == 0) goto L_0x0060;
    L_0x005d:
        defpackage.bza.a(r10);
    L_0x0060:
        return r5;
    L_0x0061:
        r8 = r8 + -2;
    L_0x0063:
        r8 = r8 + 3;
        goto L_0x0043;
    L_0x0066:
        if (r10 == 0) goto L_0x00ba;
    L_0x0068:
        if (r0 <= r3) goto L_0x007d;
    L_0x006a:
        r8 = r9 + -3;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x007b;
    L_0x0070:
        r8 = r9 + -2;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x007b;
    L_0x0076:
        r8 = r7[r4];
        if (r8 != r2) goto L_0x007b;
    L_0x007a:
        goto L_0x0096;
    L_0x007b:
        r8 = 0;
        goto L_0x0097;
    L_0x007d:
        if (r0 != r3) goto L_0x008e;
    L_0x007f:
        r8 = r10[r3];
        if (r8 == 0) goto L_0x007b;
    L_0x0083:
        r8 = r9 + -2;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x007b;
    L_0x0089:
        r8 = r7[r4];
        if (r8 != r2) goto L_0x007b;
    L_0x008d:
        goto L_0x0096;
    L_0x008e:
        r8 = r10[r2];
        if (r8 == 0) goto L_0x007b;
    L_0x0092:
        r8 = r7[r4];
        if (r8 != r2) goto L_0x007b;
    L_0x0096:
        r8 = 1;
    L_0x0097:
        r10[r1] = r8;
        if (r0 <= r2) goto L_0x00a6;
    L_0x009b:
        r8 = r9 + -2;
        r8 = r7[r8];
        if (r8 != 0) goto L_0x00b0;
    L_0x00a1:
        r8 = r7[r4];
        if (r8 != 0) goto L_0x00b0;
    L_0x00a5:
        goto L_0x00ae;
    L_0x00a6:
        r8 = r10[r3];
        if (r8 == 0) goto L_0x00b0;
    L_0x00aa:
        r8 = r7[r4];
        if (r8 != 0) goto L_0x00b0;
    L_0x00ae:
        r8 = 1;
        goto L_0x00b1;
    L_0x00b0:
        r8 = 0;
    L_0x00b1:
        r10[r2] = r8;
        r7 = r7[r4];
        if (r7 != 0) goto L_0x00b8;
    L_0x00b7:
        r1 = 1;
    L_0x00b8:
        r10[r3] = r1;
    L_0x00ba:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bza.a(byte[], int, int, boolean[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013f  */
    public static defpackage.bza.b a(byte[] r18, int r19, int r20) {
        /*
        r0 = new bzd;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r0.<init>(r1, r2, r3);
        r1 = 8;
        r0.a(r1);
        r2 = r0.c(r1);
        r3 = 16;
        r0.a(r3);
        r5 = r0.e();
        r4 = 3;
        r6 = 0;
        r7 = 1;
        r8 = 100;
        if (r2 == r8) goto L_0x004c;
    L_0x0024:
        r8 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r2 == r8) goto L_0x004c;
    L_0x0028:
        r8 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r2 == r8) goto L_0x004c;
    L_0x002c:
        r8 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        if (r2 == r8) goto L_0x004c;
    L_0x0030:
        r8 = 44;
        if (r2 == r8) goto L_0x004c;
    L_0x0034:
        r8 = 83;
        if (r2 == r8) goto L_0x004c;
    L_0x0038:
        r8 = 86;
        if (r2 == r8) goto L_0x004c;
    L_0x003c:
        r8 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r2 == r8) goto L_0x004c;
    L_0x0040:
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 == r8) goto L_0x004c;
    L_0x0044:
        r8 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        if (r2 != r8) goto L_0x0049;
    L_0x0048:
        goto L_0x004c;
    L_0x0049:
        r2 = 1;
        r9 = 0;
        goto L_0x009c;
    L_0x004c:
        r2 = r0.e();
        if (r2 != r4) goto L_0x0057;
    L_0x0052:
        r8 = r0.b();
        goto L_0x0058;
    L_0x0057:
        r8 = 0;
    L_0x0058:
        r0.e();
        r0.e();
        r0.a();
        r9 = r0.b();
        if (r9 == 0) goto L_0x009b;
    L_0x0067:
        if (r2 == r4) goto L_0x006c;
    L_0x0069:
        r9 = 8;
        goto L_0x006e;
    L_0x006c:
        r9 = 12;
    L_0x006e:
        r10 = 0;
    L_0x006f:
        if (r10 >= r9) goto L_0x009b;
    L_0x0071:
        r11 = r0.b();
        if (r11 == 0) goto L_0x0098;
    L_0x0077:
        r11 = 6;
        if (r10 >= r11) goto L_0x007d;
    L_0x007a:
        r11 = 16;
        goto L_0x007f;
    L_0x007d:
        r11 = 64;
    L_0x007f:
        r12 = 0;
        r13 = 8;
        r14 = 8;
    L_0x0084:
        if (r12 >= r11) goto L_0x0098;
    L_0x0086:
        if (r13 == 0) goto L_0x0091;
    L_0x0088:
        r13 = r0.d();
        r13 = r13 + r14;
        r13 = r13 + 256;
        r13 = r13 % 256;
    L_0x0091:
        if (r13 != 0) goto L_0x0094;
    L_0x0093:
        goto L_0x0095;
    L_0x0094:
        r14 = r13;
    L_0x0095:
        r12 = r12 + 1;
        goto L_0x0084;
    L_0x0098:
        r10 = r10 + 1;
        goto L_0x006f;
    L_0x009b:
        r9 = r8;
    L_0x009c:
        r8 = r0.e();
        r11 = r8 + 4;
        r12 = r0.e();
        if (r12 != 0) goto L_0x00b0;
    L_0x00a8:
        r8 = r0.e();
        r8 = r8 + 4;
        r13 = r8;
        goto L_0x00d1;
    L_0x00b0:
        if (r12 != r7) goto L_0x00d0;
    L_0x00b2:
        r8 = r0.b();
        r0.d();
        r0.d();
        r10 = r0.e();
        r13 = (long) r10;
        r10 = 0;
    L_0x00c2:
        r3 = (long) r10;
        r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r15 >= 0) goto L_0x00cd;
    L_0x00c7:
        r0.e();
        r10 = r10 + 1;
        goto L_0x00c2;
    L_0x00cd:
        r14 = r8;
        r13 = 0;
        goto L_0x00d2;
    L_0x00d0:
        r13 = 0;
    L_0x00d1:
        r14 = 0;
    L_0x00d2:
        r0.e();
        r0.a();
        r3 = r0.e();
        r3 = r3 + r7;
        r4 = r0.e();
        r4 = r4 + r7;
        r10 = r0.b();
        r6 = 2;
        r8 = 2 - r10;
        r8 = r8 * r4;
        if (r10 != 0) goto L_0x00ef;
    L_0x00ec:
        r0.a();
    L_0x00ef:
        r0.a();
        r3 = r3 << 4;
        r4 = r8 << 4;
        r8 = r0.b();
        if (r8 == 0) goto L_0x0125;
    L_0x00fc:
        r8 = r0.e();
        r15 = r0.e();
        r16 = r0.e();
        r17 = r0.e();
        if (r2 != 0) goto L_0x0111;
    L_0x010e:
        r6 = r6 - r10;
        r1 = 1;
        goto L_0x011c;
    L_0x0111:
        r1 = 3;
        if (r2 != r1) goto L_0x0116;
    L_0x0114:
        r1 = 1;
        goto L_0x0117;
    L_0x0116:
        r1 = 2;
    L_0x0117:
        if (r2 != r7) goto L_0x011a;
    L_0x0119:
        r7 = 2;
    L_0x011a:
        r6 = r6 - r10;
        r6 = r6 * r7;
    L_0x011c:
        r8 = r8 + r15;
        r8 = r8 * r1;
        r3 = r3 - r8;
        r16 = r16 + r17;
        r16 = r16 * r6;
        r4 = r4 - r16;
    L_0x0125:
        r6 = r3;
        r7 = r4;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r0.b();
        if (r2 == 0) goto L_0x016b;
    L_0x012f:
        r2 = r0.b();
        if (r2 == 0) goto L_0x016b;
    L_0x0135:
        r2 = 8;
        r2 = r0.c(r2);
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r2 != r3) goto L_0x0152;
    L_0x013f:
        r3 = 16;
        r2 = r0.c(r3);
        r0 = r0.c(r3);
        if (r2 == 0) goto L_0x0150;
    L_0x014b:
        if (r0 == 0) goto L_0x0150;
    L_0x014d:
        r1 = (float) r2;
        r0 = (float) r0;
        r1 = r1 / r0;
    L_0x0150:
        r8 = r1;
        goto L_0x016d;
    L_0x0152:
        r0 = 17;
        if (r2 >= r0) goto L_0x015c;
    L_0x0156:
        r0 = b;
        r0 = r0[r2];
        r8 = r0;
        goto L_0x016d;
    L_0x015c:
        r0 = java.lang.String.valueOf(r2);
        r2 = "Unexpected aspect_ratio_idc value: ";
        r0 = r2.concat(r0);
        r2 = "NalUnitUtil";
        android.util.Log.w(r2, r0);
    L_0x016b:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x016d:
        r0 = new bza$b;
        r4 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bza.a(byte[], int, int):bza$b");
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static a b(byte[] bArr, int i) {
        bzd bzd = new bzd(bArr, 3, i);
        bzd.a(8);
        int e = bzd.e();
        i = bzd.e();
        bzd.a();
        return new a(e, i, bzd.b());
    }
}

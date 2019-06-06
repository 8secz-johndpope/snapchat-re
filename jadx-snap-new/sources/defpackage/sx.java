package defpackage;

/* renamed from: sx */
public final class sx {
    public static String a(boolean z) {
        return z ? "True" : "False";
    }

    public static String a(byte[] bArr) {
        return new String(sz.a(bArr));
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            throw new ss("Empty convert-string", 5);
        }
        Object toLowerCase = str.toLowerCase();
        try {
            toLowerCase = Integer.parseInt(toLowerCase);
            return toLowerCase != null;
        } catch (NumberFormatException unused) {
            return "true".equals(toLowerCase) || "t".equals(toLowerCase) || "on".equals(toLowerCase) || "yes".equals(toLowerCase);
        }
    }

    public static int b(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
                }
            } catch (NumberFormatException unused) {
                throw new ss("Invalid integer string", 5);
            }
        }
        throw new ss("Empty convert-string", 5);
    }

    public static long c(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
                }
            } catch (NumberFormatException unused) {
                throw new ss("Invalid long string", 5);
            }
        }
        throw new ss("Empty convert-string", 5);
    }

    public static double d(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Double.parseDouble(str);
                }
            } catch (NumberFormatException unused) {
                throw new ss("Invalid double string", 5);
            }
        }
        throw new ss("Empty convert-string", 5);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:140:0x0236 in {10, 15, 17, 20, 27, 29, 36, 38, 55, 57, 58, 75, 77, 88, 90, 94, 96, 97, 104, 106, 111, 116, 119, 124, 126, 128, 129, 132, 134, 135, 137, 139} preds:[]
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
    public static defpackage.sq e(java.lang.String r12) {
        /*
        r0 = 5;
        if (r12 == 0) goto L_0x022e;
        r1 = r12.length();
        if (r1 == 0) goto L_0x022e;
        r1 = new ti;
        r1.<init>();
        if (r12 == 0) goto L_0x0225;
        r2 = r12.length();
        if (r2 == 0) goto L_0x0224;
        r2 = new tf;
        r2.<init>(r12);
        r12 = 0;
        r3 = r2.a(r12);
        r4 = 45;
        if (r3 != r4) goto L_0x0027;
        r2.c();
        r3 = 9999; // 0x270f float:1.4012E-41 double:4.94E-320;
        r5 = "Invalid year in date string";
        r3 = r2.a(r5, r3);
        r5 = r2.a();
        if (r5 == 0) goto L_0x0044;
        r5 = r2.b();
        if (r5 != r4) goto L_0x003c;
        goto L_0x0044;
        r12 = new ss;
        r1 = "Invalid date string, after year";
        r12.<init>(r1, r0);
        throw r12;
        r5 = r2.a(r12);
        if (r5 != r4) goto L_0x004b;
        r3 = -r3;
        r1.a(r3);
        r3 = r2.a();
        if (r3 == 0) goto L_0x0224;
        r2.c();
        r3 = 12;
        r5 = "Invalid month in date string";
        r3 = r2.a(r5, r3);
        r5 = r2.a();
        if (r5 == 0) goto L_0x0074;
        r5 = r2.b();
        if (r5 != r4) goto L_0x006c;
        goto L_0x0074;
        r12 = new ss;
        r1 = "Invalid date string, after month";
        r12.<init>(r1, r0);
        throw r12;
        r1.b(r3);
        r3 = r2.a();
        if (r3 == 0) goto L_0x0224;
        r2.c();
        r3 = 31;
        r5 = "Invalid day in date string";
        r3 = r2.a(r5, r3);
        r5 = r2.a();
        if (r5 == 0) goto L_0x009f;
        r5 = r2.b();
        r6 = 84;
        if (r5 != r6) goto L_0x0097;
        goto L_0x009f;
        r12 = new ss;
        r1 = "Invalid date string, after day";
        r12.<init>(r1, r0);
        throw r12;
        r1.c(r3);
        r3 = r2.a();
        if (r3 == 0) goto L_0x0224;
        r2.c();
        r3 = 23;
        r5 = "Invalid hour in date string";
        r5 = r2.a(r5, r3);
        r1.d(r5);
        r5 = r2.a();
        if (r5 == 0) goto L_0x0224;
        r5 = r2.b();
        r6 = 59;
        r7 = 58;
        r8 = 43;
        r9 = 90;
        if (r5 != r7) goto L_0x00fd;
        r2.c();
        r5 = "Invalid minute in date string";
        r5 = r2.a(r5, r6);
        r10 = r2.a();
        if (r10 == 0) goto L_0x00fa;
        r10 = r2.b();
        if (r10 == r7) goto L_0x00fa;
        r10 = r2.b();
        if (r10 == r9) goto L_0x00fa;
        r10 = r2.b();
        if (r10 == r8) goto L_0x00fa;
        r10 = r2.b();
        if (r10 != r4) goto L_0x00f2;
        goto L_0x00fa;
        r12 = new ss;
        r1 = "Invalid date string, after minute";
        r12.<init>(r1, r0);
        throw r12;
        r1.e(r5);
        r5 = r2.a();
        if (r5 == 0) goto L_0x0224;
        r5 = r2.a();
        if (r5 == 0) goto L_0x0190;
        r5 = r2.b();
        if (r5 != r7) goto L_0x0190;
        r2.c();
        r5 = "Invalid whole seconds in date string";
        r5 = r2.a(r5, r6);
        r10 = r2.a();
        r11 = 46;
        if (r10 == 0) goto L_0x0141;
        r10 = r2.b();
        if (r10 == r11) goto L_0x0141;
        r10 = r2.b();
        if (r10 == r9) goto L_0x0141;
        r10 = r2.b();
        if (r10 == r8) goto L_0x0141;
        r10 = r2.b();
        if (r10 != r4) goto L_0x0139;
        goto L_0x0141;
        r12 = new ss;
        r1 = "Invalid date string, after whole seconds";
        r12.<init>(r1, r0);
        throw r12;
        r1.f(r5);
        r5 = r2.b();
        if (r5 != r11) goto L_0x01ab;
        r2.c();
        r5 = r2.a;
        r10 = 999999999; // 0x3b9ac9ff float:0.004723787 double:4.940656453E-315;
        r11 = "Invalid fractional seconds in date string";
        r10 = r2.a(r11, r10);
        r11 = r2.a();
        if (r11 == 0) goto L_0x0179;
        r11 = r2.b();
        if (r11 == r9) goto L_0x0179;
        r11 = r2.b();
        if (r11 == r8) goto L_0x0179;
        r11 = r2.b();
        if (r11 != r4) goto L_0x0171;
        goto L_0x0179;
        r12 = new ss;
        r1 = "Invalid date string, after fractional second";
        r12.<init>(r1, r0);
        throw r12;
        r11 = r2.a;
        r11 = r11 - r5;
        r5 = 9;
        if (r11 <= r5) goto L_0x0185;
        r10 = r10 / 10;
        r11 = r11 + -1;
        goto L_0x017c;
        if (r11 >= r5) goto L_0x018c;
        r10 = r10 * 10;
        r11 = r11 + 1;
        goto L_0x0185;
        r1.g(r10);
        goto L_0x01ab;
        r5 = r2.b();
        if (r5 == r9) goto L_0x01ab;
        r5 = r2.b();
        if (r5 == r8) goto L_0x01ab;
        r5 = r2.b();
        if (r5 != r4) goto L_0x01a3;
        goto L_0x01ab;
        r12 = new ss;
        r1 = "Invalid date string, after time";
        r12.<init>(r1, r0);
        throw r12;
        r5 = r2.a();
        if (r5 == 0) goto L_0x0224;
        r5 = r2.b();
        if (r5 != r9) goto L_0x01bb;
        r2.c();
        goto L_0x01ff;
        r5 = r2.a();
        if (r5 == 0) goto L_0x01ff;
        r5 = r2.b();
        if (r5 != r8) goto L_0x01c9;
        r4 = 1;
        goto L_0x01d0;
        r5 = r2.b();
        if (r5 != r4) goto L_0x01f7;
        r4 = -1;
        r2.c();
        r5 = "Invalid time zone hour in date string";
        r3 = r2.a(r5, r3);
        r5 = r2.a();
        if (r5 == 0) goto L_0x0201;
        r12 = r2.b();
        if (r12 != r7) goto L_0x01ef;
        r2.c();
        r12 = "Invalid time zone minute in date string";
        r12 = r2.a(r12, r6);
        goto L_0x0201;
        r12 = new ss;
        r1 = "Invalid date string, after time zone hour";
        r12.<init>(r1, r0);
        throw r12;
        r12 = new ss;
        r1 = "Time zone must begin with 'Z', '+', or '-'";
        r12.<init>(r1, r0);
        throw r12;
        r3 = 0;
        r4 = 0;
        r3 = r3 * 3600;
        r3 = r3 * 1000;
        r12 = r12 * 60;
        r12 = r12 * 1000;
        r3 = r3 + r12;
        r3 = r3 * r4;
        r12 = new java.util.SimpleTimeZone;
        r4 = "";
        r12.<init>(r3, r4);
        r1.a(r12);
        r12 = r2.a();
        if (r12 != 0) goto L_0x021c;
        goto L_0x0224;
        r12 = new ss;
        r1 = "Invalid date string, extra chars at end";
        r12.<init>(r1, r0);
        throw r12;
        return r1;
        r12 = new ss;
        r0 = 4;
        r1 = "Parameter must not be null";
        r12.<init>(r1, r0);
        throw r12;
        r12 = new ss;
        r1 = "Empty convert-string";
        r12.<init>(r1, r0);
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx.e(java.lang.String):sq");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00b4 in {6, 9, 11, 15, 19, 22, 25, 26, 29} preds:[]
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
    public static byte[] f(java.lang.String r7) {
        /*
        r7 = r7.getBytes();	 Catch:{ Throwable -> 0x00aa }
        r0 = 0;	 Catch:{ Throwable -> 0x00aa }
        r1 = 0;	 Catch:{ Throwable -> 0x00aa }
        r2 = 0;	 Catch:{ Throwable -> 0x00aa }
        r3 = r7.length;	 Catch:{ Throwable -> 0x00aa }
        if (r1 >= r3) goto L_0x0026;	 Catch:{ Throwable -> 0x00aa }
        r3 = defpackage.sz.a;	 Catch:{ Throwable -> 0x00aa }
        r4 = r7[r1];	 Catch:{ Throwable -> 0x00aa }
        r3 = r3[r4];	 Catch:{ Throwable -> 0x00aa }
        if (r3 < 0) goto L_0x0018;	 Catch:{ Throwable -> 0x00aa }
        r4 = r2 + 1;	 Catch:{ Throwable -> 0x00aa }
        r7[r2] = r3;	 Catch:{ Throwable -> 0x00aa }
        r2 = r4;	 Catch:{ Throwable -> 0x00aa }
        goto L_0x001b;	 Catch:{ Throwable -> 0x00aa }
        r4 = -1;	 Catch:{ Throwable -> 0x00aa }
        if (r3 == r4) goto L_0x001e;	 Catch:{ Throwable -> 0x00aa }
        r1 = r1 + 1;	 Catch:{ Throwable -> 0x00aa }
        goto L_0x0007;	 Catch:{ Throwable -> 0x00aa }
        r7 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00aa }
        r0 = "Invalid base 64 string";	 Catch:{ Throwable -> 0x00aa }
        r7.<init>(r0);	 Catch:{ Throwable -> 0x00aa }
        throw r7;	 Catch:{ Throwable -> 0x00aa }
        if (r2 <= 0) goto L_0x0032;	 Catch:{ Throwable -> 0x00aa }
        r1 = r2 + -1;	 Catch:{ Throwable -> 0x00aa }
        r1 = r7[r1];	 Catch:{ Throwable -> 0x00aa }
        r3 = -3;	 Catch:{ Throwable -> 0x00aa }
        if (r1 != r3) goto L_0x0032;	 Catch:{ Throwable -> 0x00aa }
        r2 = r2 + -1;	 Catch:{ Throwable -> 0x00aa }
        goto L_0x0026;	 Catch:{ Throwable -> 0x00aa }
        r2 = r2 * 3;	 Catch:{ Throwable -> 0x00aa }
        r2 = r2 / 4;	 Catch:{ Throwable -> 0x00aa }
        r1 = new byte[r2];	 Catch:{ Throwable -> 0x00aa }
        r2 = 0;	 Catch:{ Throwable -> 0x00aa }
        r3 = r1.length;	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 + -2;	 Catch:{ Throwable -> 0x00aa }
        if (r0 >= r3) goto L_0x007b;	 Catch:{ Throwable -> 0x00aa }
        r3 = r7[r2];	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 << 2;	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 & 255;	 Catch:{ Throwable -> 0x00aa }
        r4 = r2 + 1;	 Catch:{ Throwable -> 0x00aa }
        r5 = r7[r4];	 Catch:{ Throwable -> 0x00aa }
        r5 = r5 >>> 4;	 Catch:{ Throwable -> 0x00aa }
        r5 = r5 & 3;	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 | r5;	 Catch:{ Throwable -> 0x00aa }
        r3 = (byte) r3;	 Catch:{ Throwable -> 0x00aa }
        r1[r0] = r3;	 Catch:{ Throwable -> 0x00aa }
        r3 = r0 + 1;	 Catch:{ Throwable -> 0x00aa }
        r4 = r7[r4];	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 << 4;	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 & 255;	 Catch:{ Throwable -> 0x00aa }
        r5 = r2 + 2;	 Catch:{ Throwable -> 0x00aa }
        r6 = r7[r5];	 Catch:{ Throwable -> 0x00aa }
        r6 = r6 >>> 2;	 Catch:{ Throwable -> 0x00aa }
        r6 = r6 & 15;	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 | r6;	 Catch:{ Throwable -> 0x00aa }
        r4 = (byte) r4;	 Catch:{ Throwable -> 0x00aa }
        r1[r3] = r4;	 Catch:{ Throwable -> 0x00aa }
        r3 = r0 + 2;	 Catch:{ Throwable -> 0x00aa }
        r4 = r7[r5];	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 << 6;	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 & 255;	 Catch:{ Throwable -> 0x00aa }
        r5 = r2 + 3;	 Catch:{ Throwable -> 0x00aa }
        r5 = r7[r5];	 Catch:{ Throwable -> 0x00aa }
        r5 = r5 & 63;	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 | r5;	 Catch:{ Throwable -> 0x00aa }
        r4 = (byte) r4;	 Catch:{ Throwable -> 0x00aa }
        r1[r3] = r4;	 Catch:{ Throwable -> 0x00aa }
        r2 = r2 + 4;	 Catch:{ Throwable -> 0x00aa }
        r0 = r0 + 3;	 Catch:{ Throwable -> 0x00aa }
        goto L_0x0039;	 Catch:{ Throwable -> 0x00aa }
        r3 = r1.length;	 Catch:{ Throwable -> 0x00aa }
        if (r0 >= r3) goto L_0x0090;	 Catch:{ Throwable -> 0x00aa }
        r3 = r7[r2];	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 << 2;	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 & 255;	 Catch:{ Throwable -> 0x00aa }
        r4 = r2 + 1;	 Catch:{ Throwable -> 0x00aa }
        r4 = r7[r4];	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 >>> 4;	 Catch:{ Throwable -> 0x00aa }
        r4 = r4 & 3;	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 | r4;	 Catch:{ Throwable -> 0x00aa }
        r3 = (byte) r3;	 Catch:{ Throwable -> 0x00aa }
        r1[r0] = r3;	 Catch:{ Throwable -> 0x00aa }
        r0 = r0 + 1;	 Catch:{ Throwable -> 0x00aa }
        r3 = r1.length;	 Catch:{ Throwable -> 0x00aa }
        if (r0 >= r3) goto L_0x00a9;	 Catch:{ Throwable -> 0x00aa }
        r3 = r2 + 1;	 Catch:{ Throwable -> 0x00aa }
        r3 = r7[r3];	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 << 4;	 Catch:{ Throwable -> 0x00aa }
        r3 = r3 & 255;	 Catch:{ Throwable -> 0x00aa }
        r2 = r2 + 2;	 Catch:{ Throwable -> 0x00aa }
        r7 = r7[r2];	 Catch:{ Throwable -> 0x00aa }
        r7 = r7 >>> 2;	 Catch:{ Throwable -> 0x00aa }
        r7 = r7 & 15;	 Catch:{ Throwable -> 0x00aa }
        r7 = r7 | r3;	 Catch:{ Throwable -> 0x00aa }
        r7 = (byte) r7;	 Catch:{ Throwable -> 0x00aa }
        r1[r0] = r7;	 Catch:{ Throwable -> 0x00aa }
        return r1;
        r7 = move-exception;
        r0 = new ss;
        r1 = 5;
        r2 = "Invalid base64 string";
        r0.<init>(r2, r1, r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx.f(java.lang.String):byte[]");
    }
}

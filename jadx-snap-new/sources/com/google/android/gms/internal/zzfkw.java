package com.google.android.gms.internal;

final class zzfkw extends zzfkt {
    zzfkw() {
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zzfks.zzmu(i);
        }
        if (i2 == 1) {
            return zzfks.zzam(i, zzfkq.zzb(bArr, j));
        }
        if (i2 == 2) {
            return zzfks.zzi(i, zzfkq.zzb(bArr, j), zzfkq.zzb(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARNING: Missing block: B:26:0x004f, code skipped:
            return -1;
     */
    /* JADX WARNING: Missing block: B:57:0x00aa, code skipped:
            return -1;
     */
    private static int zzb(byte[] r11, long r12, int r14) {
        /*
        r0 = 0;
        r1 = 1;
        r3 = 16;
        if (r14 >= r3) goto L_0x0009;
    L_0x0007:
        r3 = 0;
        goto L_0x001b;
    L_0x0009:
        r4 = r12;
        r3 = 0;
    L_0x000b:
        if (r3 >= r14) goto L_0x001a;
    L_0x000d:
        r6 = r4 + r1;
        r4 = com.google.android.gms.internal.zzfkq.zzb(r11, r4);
        if (r4 >= 0) goto L_0x0016;
    L_0x0015:
        goto L_0x001b;
    L_0x0016:
        r3 = r3 + 1;
        r4 = r6;
        goto L_0x000b;
    L_0x001a:
        r3 = r14;
    L_0x001b:
        r14 = r14 - r3;
        r3 = (long) r3;
        r12 = r12 + r3;
    L_0x001e:
        r3 = 0;
    L_0x001f:
        if (r14 <= 0) goto L_0x002f;
    L_0x0021:
        r3 = r12 + r1;
        r12 = com.google.android.gms.internal.zzfkq.zzb(r11, r12);
        if (r12 < 0) goto L_0x0032;
    L_0x0029:
        r14 = r14 + -1;
        r9 = r3;
        r3 = r12;
        r12 = r9;
        goto L_0x001f;
    L_0x002f:
        r9 = r12;
        r12 = r3;
        r3 = r9;
    L_0x0032:
        if (r14 != 0) goto L_0x0035;
    L_0x0034:
        return r0;
    L_0x0035:
        r14 = r14 + -1;
        r13 = -32;
        r5 = -65;
        r6 = -1;
        if (r12 >= r13) goto L_0x0050;
    L_0x003e:
        if (r14 != 0) goto L_0x0041;
    L_0x0040:
        return r12;
    L_0x0041:
        r14 = r14 + -1;
        r13 = -62;
        if (r12 < r13) goto L_0x004f;
    L_0x0047:
        r12 = r3 + r1;
        r3 = com.google.android.gms.internal.zzfkq.zzb(r11, r3);
        if (r3 <= r5) goto L_0x001e;
    L_0x004f:
        return r6;
    L_0x0050:
        r7 = -16;
        if (r12 >= r7) goto L_0x007b;
    L_0x0054:
        r7 = 2;
        if (r14 >= r7) goto L_0x005c;
    L_0x0057:
        r11 = zza(r11, r12, r3, r14);
        return r11;
    L_0x005c:
        r14 = r14 + -2;
        r7 = r3 + r1;
        r3 = com.google.android.gms.internal.zzfkq.zzb(r11, r3);
        if (r3 > r5) goto L_0x007a;
    L_0x0066:
        r4 = -96;
        if (r12 != r13) goto L_0x006c;
    L_0x006a:
        if (r3 < r4) goto L_0x007a;
    L_0x006c:
        r13 = -19;
        if (r12 != r13) goto L_0x0072;
    L_0x0070:
        if (r3 >= r4) goto L_0x007a;
    L_0x0072:
        r12 = r7 + r1;
        r3 = com.google.android.gms.internal.zzfkq.zzb(r11, r7);
        if (r3 <= r5) goto L_0x001e;
    L_0x007a:
        return r6;
    L_0x007b:
        r13 = 3;
        if (r14 >= r13) goto L_0x0083;
    L_0x007e:
        r11 = zza(r11, r12, r3, r14);
        return r11;
    L_0x0083:
        r14 = r14 + -3;
        r7 = r3 + r1;
        r13 = com.google.android.gms.internal.zzfkq.zzb(r11, r3);
        if (r13 > r5) goto L_0x00aa;
    L_0x008d:
        r12 = r12 << 28;
        r13 = r13 + 112;
        r12 = r12 + r13;
        r12 = r12 >> 30;
        if (r12 != 0) goto L_0x00aa;
    L_0x0096:
        r12 = r7 + r1;
        r3 = com.google.android.gms.internal.zzfkq.zzb(r11, r7);
        if (r3 > r5) goto L_0x00aa;
    L_0x009e:
        r3 = r12 + r1;
        r12 = com.google.android.gms.internal.zzfkq.zzb(r11, r12);
        if (r12 <= r5) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00aa;
    L_0x00a7:
        r12 = r3;
        goto L_0x001e;
    L_0x00aa:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfkw.zzb(byte[], long, int):int");
    }

    /* Access modifiers changed, original: final */
    public final int zzb(int i, byte[] bArr, int i2, int i3) {
        if (((i2 | i3) | (bArr.length - i3)) >= 0) {
            long j = (long) i2;
            return zzb(bArr, j, (int) (((long) i3) - j));
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:56:0x016a in {9, 12, 18, 19, 24, 27, 30, 37, 38, 39, 41, 47, 49, 51, 53, 55} preds:[]
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
    final int zzb(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
        r22 = this;
        r0 = r23;
        r1 = r24;
        r2 = r25;
        r3 = r26;
        r4 = (long) r2;
        r6 = (long) r3;
        r6 = r6 + r4;
        r8 = r23.length();
        r9 = " at index ";
        r10 = "Failed writing ";
        if (r8 > r3) goto L_0x0146;
        r11 = r1.length;
        r11 = r11 - r3;
        if (r11 < r2) goto L_0x0146;
        r2 = 0;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r11 = 1;
        if (r2 >= r8) goto L_0x002f;
        r13 = r0.charAt(r2);
        if (r13 >= r3) goto L_0x002f;
        r11 = r11 + r4;
        r3 = (byte) r13;
        com.google.android.gms.internal.zzfkq.zza(r1, r4, r3);
        r2 = r2 + 1;
        r4 = r11;
        goto L_0x001a;
        if (r2 != r8) goto L_0x0033;
        r0 = (int) r4;
        return r0;
        if (r2 >= r8) goto L_0x0144;
        r13 = r0.charAt(r2);
        if (r13 >= r3) goto L_0x004b;
        r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r14 >= 0) goto L_0x004b;
        r14 = r4 + r11;
        r13 = (byte) r13;
        com.google.android.gms.internal.zzfkq.zza(r1, r4, r13);
        r4 = r11;
        r12 = r14;
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        goto L_0x00fb;
        r14 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r13 >= r14) goto L_0x0075;
        r14 = 2;
        r14 = r6 - r14;
        r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
        if (r16 > 0) goto L_0x0075;
        r14 = r4 + r11;
        r3 = r13 >>> 6;
        r3 = r3 | 960;
        r3 = (byte) r3;
        com.google.android.gms.internal.zzfkq.zza(r1, r4, r3);
        r3 = r14 + r11;
        r5 = r13 & 63;
        r13 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5 = r5 | r13;
        r5 = (byte) r5;
        com.google.android.gms.internal.zzfkq.zza(r1, r14, r5);
        r20 = r11;
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r12 = r3;
        r4 = r20;
        goto L_0x00fb;
        r3 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        r14 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r13 < r14) goto L_0x007f;
        if (r3 >= r13) goto L_0x00ae;
        r15 = 3;
        r15 = r6 - r15;
        r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1));
        if (r17 > 0) goto L_0x00ae;
        r14 = r4 + r11;
        r3 = r13 >>> 12;
        r3 = r3 | 480;
        r3 = (byte) r3;
        com.google.android.gms.internal.zzfkq.zza(r1, r4, r3);
        r3 = r14 + r11;
        r5 = r13 >>> 6;
        r5 = r5 & 63;
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5 = r5 | r11;
        r5 = (byte) r5;
        com.google.android.gms.internal.zzfkq.zza(r1, r14, r5);
        r14 = 1;
        r18 = r3 + r14;
        r5 = r13 & 63;
        r5 = r5 | r11;
        r5 = (byte) r5;
        com.google.android.gms.internal.zzfkq.zza(r1, r3, r5);
        r12 = r18;
        r4 = 1;
        goto L_0x0047;
        r11 = 4;
        r11 = r6 - r11;
        r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1));
        if (r15 > 0) goto L_0x010f;
        r3 = r2 + 1;
        if (r3 == r8) goto L_0x0107;
        r2 = r0.charAt(r3);
        r11 = java.lang.Character.isSurrogatePair(r13, r2);
        if (r11 == 0) goto L_0x0106;
        r2 = java.lang.Character.toCodePoint(r13, r2);
        r11 = 1;
        r13 = r4 + r11;
        r15 = r2 >>> 18;
        r15 = r15 | 240;
        r15 = (byte) r15;
        com.google.android.gms.internal.zzfkq.zza(r1, r4, r15);
        r4 = r13 + r11;
        r15 = r2 >>> 12;
        r15 = r15 & 63;
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r12 = r15 | 128;
        r12 = (byte) r12;
        com.google.android.gms.internal.zzfkq.zza(r1, r13, r12);
        r12 = 1;
        r14 = r4 + r12;
        r16 = r2 >>> 6;
        r12 = r16 & 63;
        r12 = r12 | r11;
        r12 = (byte) r12;
        com.google.android.gms.internal.zzfkq.zza(r1, r4, r12);
        r4 = 1;
        r12 = r14 + r4;
        r2 = r2 & 63;
        r2 = r2 | r11;
        r2 = (byte) r2;
        com.google.android.gms.internal.zzfkq.zza(r1, r14, r2);
        r2 = r3;
        r2 = r2 + 1;
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r20 = r4;
        r4 = r12;
        r11 = r20;
        goto L_0x0033;
        r2 = r3;
        r0 = new com.google.android.gms.internal.zzfkv;
        r2 = r2 + -1;
        r0.<init>(r2, r8);
        throw r0;
        if (r14 > r13) goto L_0x0127;
        if (r13 > r3) goto L_0x0127;
        r1 = r2 + 1;
        if (r1 == r8) goto L_0x0121;
        r0 = r0.charAt(r1);
        r0 = java.lang.Character.isSurrogatePair(r13, r0);
        if (r0 != 0) goto L_0x0127;
        r0 = new com.google.android.gms.internal.zzfkv;
        r0.<init>(r2, r8);
        throw r0;
        r0 = new java.lang.ArrayIndexOutOfBoundsException;
        r1 = 46;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r2.append(r10);
        r2.append(r13);
        r2.append(r9);
        r2.append(r4);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
        r0 = (int) r4;
        return r0;
        r1 = new java.lang.ArrayIndexOutOfBoundsException;
        r8 = r8 + -1;
        r0 = r0.charAt(r8);
        r2 = r2 + r3;
        r3 = 37;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r4.append(r10);
        r4.append(r0);
        r4.append(r9);
        r4.append(r2);
        r0 = r4.toString();
        r1.<init>(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfkw.zzb(java.lang.CharSequence, byte[], int, int):int");
    }
}

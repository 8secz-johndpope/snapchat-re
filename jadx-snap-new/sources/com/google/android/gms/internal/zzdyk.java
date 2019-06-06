package com.google.android.gms.internal;

final class zzdyk {
    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    private static long zzd(byte[] bArr, int i, int i2) {
        return (zzg(bArr, i) >> i2) & 67108863;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0208 in {7, 8, 10, 12} preds:[]
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
    static byte[] zzf(byte[] r53, byte[] r54) {
        /*
        r0 = r53;
        r1 = r54;
        r2 = r0.length;
        r3 = 32;
        if (r2 != r3) goto L_0x0200;
        r2 = 0;
        r4 = zzd(r0, r2, r2);
        r6 = 67108863; // 0x3ffffff float:1.5046327E-36 double:3.31561837E-316;
        r4 = r4 & r6;
        r8 = 2;
        r9 = 3;
        r10 = zzd(r0, r9, r8);
        r12 = 67108611; // 0x3ffff03 float:1.5046101E-36 double:3.3156059E-316;
        r10 = r10 & r12;
        r12 = 4;
        r13 = 6;
        r14 = zzd(r0, r13, r12);
        r16 = 67092735; // 0x3ffc0ff float:1.5031863E-36 double:3.31482154E-316;
        r14 = r14 & r16;
        r3 = 9;
        r17 = zzd(r0, r3, r13);
        r19 = 66076671; // 0x3f03fff float:1.4120625E-36 double:3.2646213E-316;
        r17 = r17 & r19;
        r6 = 8;
        r7 = 12;
        r21 = zzd(r0, r7, r6);
        r23 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r21 = r21 & r23;
        r23 = 5;
        r25 = r10 * r23;
        r27 = r14 * r23;
        r29 = r17 * r23;
        r31 = r21 * r23;
        r6 = 17;
        r6 = new byte[r6];
        r33 = 0;
        r35 = r33;
        r37 = r35;
        r39 = r37;
        r41 = r39;
        r7 = 0;
        r3 = r1.length;
        r12 = 16;
        r43 = 26;
        if (r7 >= r3) goto L_0x0135;
        r3 = r1.length;
        r3 = r3 - r7;
        r3 = java.lang.Math.min(r12, r3);
        java.lang.System.arraycopy(r1, r7, r6, r2, r3);
        r44 = 1;
        r6[r3] = r44;
        if (r3 == r12) goto L_0x0075;
        r3 = r3 + 1;
        r12 = 17;
        java.util.Arrays.fill(r6, r3, r12, r2);
        r45 = zzd(r6, r2, r2);
        r41 = r41 + r45;
        r45 = zzd(r6, r9, r8);
        r33 = r33 + r45;
        r3 = 4;
        r45 = zzd(r6, r13, r3);
        r35 = r35 + r45;
        r3 = 9;
        r45 = zzd(r6, r3, r13);
        r37 = r37 + r45;
        r3 = 12;
        r12 = 8;
        r45 = zzd(r6, r3, r12);
        r3 = 16;
        r3 = r6[r3];
        r3 = r3 << 24;
        r8 = (long) r3;
        r8 = r45 | r8;
        r39 = r39 + r8;
        r8 = r41 * r4;
        r44 = r33 * r31;
        r8 = r8 + r44;
        r44 = r35 * r29;
        r8 = r8 + r44;
        r44 = r37 * r27;
        r8 = r8 + r44;
        r44 = r39 * r25;
        r8 = r8 + r44;
        r44 = r41 * r10;
        r47 = r33 * r4;
        r44 = r44 + r47;
        r47 = r35 * r31;
        r44 = r44 + r47;
        r47 = r37 * r29;
        r44 = r44 + r47;
        r47 = r39 * r27;
        r44 = r44 + r47;
        r47 = r41 * r14;
        r49 = r33 * r10;
        r47 = r47 + r49;
        r49 = r35 * r4;
        r47 = r47 + r49;
        r49 = r37 * r31;
        r47 = r47 + r49;
        r49 = r39 * r29;
        r47 = r47 + r49;
        r49 = r41 * r17;
        r51 = r33 * r14;
        r49 = r49 + r51;
        r51 = r35 * r10;
        r49 = r49 + r51;
        r51 = r37 * r4;
        r49 = r49 + r51;
        r51 = r39 * r31;
        r49 = r49 + r51;
        r41 = r41 * r21;
        r33 = r33 * r17;
        r41 = r41 + r33;
        r35 = r35 * r14;
        r41 = r41 + r35;
        r37 = r37 * r10;
        r41 = r41 + r37;
        r39 = r39 * r4;
        r41 = r41 + r39;
        r33 = r8 >> r43;
        r19 = 67108863; // 0x3ffffff float:1.5046327E-36 double:3.31561837E-316;
        r8 = r8 & r19;
        r44 = r44 + r33;
        r33 = r44 >> r43;
        r35 = r44 & r19;
        r47 = r47 + r33;
        r33 = r47 >> r43;
        r37 = r47 & r19;
        r49 = r49 + r33;
        r33 = r49 >> r43;
        r39 = r49 & r19;
        r41 = r41 + r33;
        r33 = r41 >> r43;
        r41 = r41 & r19;
        r33 = r33 * r23;
        r8 = r8 + r33;
        r33 = r8 >> r43;
        r8 = r8 & r19;
        r33 = r35 + r33;
        r7 = r7 + 16;
        r35 = r37;
        r37 = r39;
        r39 = r41;
        r12 = 4;
        r41 = r8;
        r8 = 2;
        r9 = 3;
        goto L_0x0058;
        r19 = 67108863; // 0x3ffffff float:1.5046327E-36 double:3.31561837E-316;
        r3 = r33 >> r43;
        r5 = r33 & r19;
        r35 = r35 + r3;
        r3 = r35 >> r43;
        r7 = r35 & r19;
        r37 = r37 + r3;
        r3 = r37 >> r43;
        r9 = r37 & r19;
        r39 = r39 + r3;
        r3 = r39 >> r43;
        r11 = r39 & r19;
        r3 = r3 * r23;
        r41 = r41 + r3;
        r3 = r41 >> r43;
        r14 = r41 & r19;
        r5 = r5 + r3;
        r23 = r14 + r23;
        r3 = r23 >> r43;
        r17 = r23 & r19;
        r3 = r3 + r5;
        r21 = r3 >> r43;
        r3 = r3 & r19;
        r21 = r7 + r21;
        r23 = r21 >> r43;
        r21 = r21 & r19;
        r23 = r9 + r23;
        r25 = r23 >> r43;
        r19 = r23 & r19;
        r25 = r11 + r25;
        r23 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r25 = r25 - r23;
        r1 = 63;
        r23 = r25 >> r1;
        r14 = r14 & r23;
        r5 = r5 & r23;
        r7 = r7 & r23;
        r9 = r9 & r23;
        r11 = r11 & r23;
        r27 = -1;
        r23 = r23 ^ r27;
        r17 = r17 & r23;
        r14 = r14 | r17;
        r3 = r3 & r23;
        r3 = r3 | r5;
        r5 = r21 & r23;
        r5 = r5 | r7;
        r7 = r19 & r23;
        r7 = r7 | r9;
        r9 = r25 & r23;
        r9 = r9 | r11;
        r11 = r3 << r43;
        r11 = r11 | r14;
        r14 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r11 = r11 & r14;
        r3 = r3 >> r13;
        r1 = 20;
        r17 = r5 << r1;
        r3 = r3 | r17;
        r3 = r3 & r14;
        r1 = 12;
        r5 = r5 >> r1;
        r1 = 14;
        r17 = r7 << r1;
        r5 = r5 | r17;
        r5 = r5 & r14;
        r1 = 18;
        r7 = r7 >> r1;
        r1 = 8;
        r9 = r9 << r1;
        r7 = r7 | r9;
        r7 = r7 & r14;
        r1 = 16;
        r9 = zzg(r0, r1);
        r11 = r11 + r9;
        r9 = r11 & r14;
        r1 = 20;
        r17 = zzg(r0, r1);
        r3 = r3 + r17;
        r1 = 32;
        r11 = r11 >> r1;
        r3 = r3 + r11;
        r11 = r3 & r14;
        r13 = 24;
        r16 = zzg(r0, r13);
        r5 = r5 + r16;
        r3 = r3 >> r1;
        r5 = r5 + r3;
        r3 = r5 & r14;
        r13 = 28;
        r16 = zzg(r0, r13);
        r7 = r7 + r16;
        r0 = r5 >> r1;
        r7 = r7 + r0;
        r0 = r7 & r14;
        r5 = 16;
        r5 = new byte[r5];
        zza(r5, r9, r2);
        r2 = 4;
        zza(r5, r11, r2);
        r2 = 8;
        zza(r5, r3, r2);
        r2 = 12;
        zza(r5, r0, r2);
        return r5;
        r0 = new java.lang.IllegalArgumentException;
        r1 = "The key length in bytes must be 32.";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdyk.zzf(byte[], byte[]):byte[]");
    }

    private static long zzg(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)))) & 4294967295L;
    }
}

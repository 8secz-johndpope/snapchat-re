package com.google.android.gms.internal;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class zzdxg implements zzdsy {
    private final SecretKeySpec zzmkf;
    private final byte[] zzmki;
    private final byte[] zzmkj;
    private final int zzmkk;

    public zzdxg(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.zzmkk = i;
            this.zzmkf = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.zzmkf);
            this.zzmki = zzak(instance.doFinal(new byte[16]));
            this.zzmkj = zzak(this.zzmki);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] zza(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] zze;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            zze = zze(bArr2, this.zzmki);
        } else {
            zze = cipher.doFinal(bArr2);
            byte[] bArr3 = zze;
            i = 0;
            while (i3 - i > 16) {
                for (int i4 = 0; i4 < 16; i4++) {
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr[(i2 + i) + i4]);
                }
                bArr3 = cipher.doFinal(bArr3);
                i += 16;
            }
            zze = Arrays.copyOfRange(bArr, i + i2, i2 + i3);
            if (zze.length == 16) {
                zze = zze(zze, this.zzmki);
            } else {
                bArr = Arrays.copyOf(this.zzmkj, 16);
                for (int i5 = 0; i5 < zze.length; i5++) {
                    bArr[i5] = (byte) (bArr[i5] ^ zze[i5]);
                }
                bArr[zze.length] = (byte) (bArr[zze.length] ^ 128);
                zze = bArr;
            }
            zze = zze(bArr3, zze);
        }
        return cipher.doFinal(zze);
    }

    private static byte[] zzak(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        i2 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i2 ^ i);
        return bArr2;
    }

    private static byte[] zze(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x007f in {4, 5, 7} preds:[]
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
    public final byte[] zzd(byte[] r16, byte[] r17) {
        /*
        r15 = this;
        r6 = r15;
        r7 = r16;
        r0 = r7.length;
        r1 = r6.zzmkk;
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = r2 - r1;
        r8 = 16;
        r2 = r2 - r8;
        if (r0 > r2) goto L_0x0077;
        r0 = r7.length;
        r0 = r0 + r1;
        r0 = r0 + r8;
        r9 = new byte[r0];
        r3 = com.google.android.gms.internal.zzdyl.zzgy(r1);
        r0 = r6.zzmkk;
        r10 = 0;
        java.lang.System.arraycopy(r3, r10, r9, r10, r0);
        r0 = "AES/ECB/NOPADDING";
        r11 = javax.crypto.Cipher.getInstance(r0);
        r0 = r6.zzmkf;
        r12 = 1;
        r11.init(r12, r0);
        r2 = 0;
        r4 = 0;
        r5 = r3.length;
        r0 = r15;
        r1 = r11;
        r13 = r0.zza(r1, r2, r3, r4, r5);
        r2 = 1;
        r3 = r17;
        r5 = r3.length;
        r14 = r0.zza(r1, r2, r3, r4, r5);
        r0 = "AES/CTR/NOPADDING";
        r0 = javax.crypto.Cipher.getInstance(r0);
        r1 = r6.zzmkf;
        r2 = new javax.crypto.spec.IvParameterSpec;
        r2.<init>(r13);
        r0.init(r12, r1, r2);
        r2 = 0;
        r3 = r7.length;
        r5 = r6.zzmkk;
        r1 = r16;
        r4 = r9;
        r0.doFinal(r1, r2, r3, r4, r5);
        r2 = 2;
        r4 = r6.zzmkk;
        r5 = r7.length;
        r0 = r15;
        r1 = r11;
        r3 = r9;
        r0 = r0.zza(r1, r2, r3, r4, r5);
        r1 = r7.length;
        r2 = r6.zzmkk;
        r1 = r1 + r2;
        if (r10 >= r8) goto L_0x0076;
        r2 = r1 + r10;
        r3 = r14[r10];
        r4 = r13[r10];
        r3 = r3 ^ r4;
        r4 = r0[r10];
        r3 = r3 ^ r4;
        r3 = (byte) r3;
        r9[r2] = r3;
        r10 = r10 + 1;
        goto L_0x0064;
        return r9;
        r0 = new java.security.GeneralSecurityException;
        r1 = "plaintext too long";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdxg.zzd(byte[], byte[]):byte[]");
    }
}

package com.google.android.gms.internal;

final class zzfks {
    private static final zzfkt zzptx;

    static {
        Object obj = (zzfkq.zzdcd() && zzfkq.zzdce()) ? 1 : null;
        zzptx = obj != null ? new zzfkw() : new zzfku();
    }

    static int zza(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return zzptx.zzb(charSequence, bArr, i, i2);
    }

    private static int zzam(int i, int i2) {
        return (i > -12 || i2 > -65) ? -1 : i ^ (i2 << 8);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x007c in {4, 9, 14, 21, 23, 24, 25, 27, 29} preds:[]
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
    static int zzd(java.lang.CharSequence r8) {
        /*
        r0 = r8.length();
        r1 = 0;
        r2 = 0;
        if (r2 >= r0) goto L_0x0013;
        r3 = r8.charAt(r2);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 >= r4) goto L_0x0013;
        r2 = r2 + 1;
        goto L_0x0006;
        r3 = r0;
        if (r2 >= r0) goto L_0x0059;
        r4 = r8.charAt(r2);
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r4 >= r5) goto L_0x0026;
        r4 = 127 - r4;
        r4 = r4 >>> 31;
        r3 = r3 + r4;
        r2 = r2 + 1;
        goto L_0x0014;
        r4 = r8.length();
        if (r2 >= r4) goto L_0x0058;
        r6 = r8.charAt(r2);
        if (r6 >= r5) goto L_0x0038;
        r6 = 127 - r6;
        r6 = r6 >>> 31;
        r1 = r1 + r6;
        goto L_0x0055;
        r1 = r1 + 2;
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r7 > r6) goto L_0x0055;
        r7 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r6 > r7) goto L_0x0055;
        r6 = java.lang.Character.codePointAt(r8, r2);
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r6 < r7) goto L_0x004f;
        r2 = r2 + 1;
        goto L_0x0055;
        r8 = new com.google.android.gms.internal.zzfkv;
        r8.<init>(r2, r4);
        throw r8;
        r2 = r2 + 1;
        goto L_0x002a;
        r3 = r3 + r1;
        if (r3 < r0) goto L_0x005c;
        return r3;
        r8 = new java.lang.IllegalArgumentException;
        r0 = (long) r3;
        r2 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r0 = r0 + r2;
        r2 = 54;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "UTF-8 length does not fit in int: ";
        r3.append(r2);
        r3.append(r0);
        r0 = r3.toString();
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfks.zzd(java.lang.CharSequence):int");
    }

    private static int zzi(int i, int i2, int i3) {
        return (i > -12 || i2 > -65 || i3 > -65) ? -1 : (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean zzl(byte[] bArr, int i, int i2) {
        return zzptx.zzb(0, bArr, i, i2) == 0;
    }

    private static int zzm(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        i2 -= i;
        if (i2 == 0) {
            return zzmu(b);
        }
        if (i2 == 1) {
            return zzam(b, bArr[i]);
        }
        if (i2 == 2) {
            return zzi(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    private static int zzmu(int i) {
        return i > -12 ? -1 : i;
    }
}

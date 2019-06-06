package com.google.android.gms.internal;

class zzfgz extends zzfgy {
    protected final byte[] zzjwl;

    zzfgz(byte[] bArr) {
        this.zzjwl = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfgs) || size() != ((zzfgs) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzfgz)) {
            return obj.equals(this);
        }
        zzfgz zzfgz = (zzfgz) obj;
        int zzcxt = zzcxt();
        int zzcxt2 = zzfgz.zzcxt();
        return (zzcxt == 0 || zzcxt2 == 0 || zzcxt == zzcxt2) ? zza(zzfgz, 0, size()) : false;
    }

    public int size() {
        return this.zzjwl.length;
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzfgr zzfgr) {
        zzfgr.zze(this.zzjwl, zzcxu(), size());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x008f in {10, 11, 13, 15, 17, 19} preds:[]
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
    final boolean zza(com.google.android.gms.internal.zzfgs r6, int r7, int r8) {
        /*
        r5 = this;
        r0 = r6.size();
        if (r8 > r0) goto L_0x006f;
        r0 = r7 + r8;
        r1 = r6.size();
        if (r0 > r1) goto L_0x0044;
        r1 = r6 instanceof com.google.android.gms.internal.zzfgz;
        r2 = 0;
        if (r1 == 0) goto L_0x0037;
        r6 = (com.google.android.gms.internal.zzfgz) r6;
        r0 = r5.zzjwl;
        r1 = r6.zzjwl;
        r3 = r5.zzcxu();
        r3 = r3 + r8;
        r8 = r5.zzcxu();
        r6 = r6.zzcxu();
        r6 = r6 + r7;
        if (r8 >= r3) goto L_0x0035;
        r7 = r0[r8];
        r4 = r1[r6];
        if (r7 == r4) goto L_0x0030;
        return r2;
        r8 = r8 + 1;
        r6 = r6 + 1;
        goto L_0x0027;
        r6 = 1;
        return r6;
        r6 = r6.zzaa(r7, r0);
        r7 = r5.zzaa(r2, r8);
        r6 = r6.equals(r7);
        return r6;
        r0 = new java.lang.IllegalArgumentException;
        r6 = r6.size();
        r1 = 59;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Ran off end of other: ";
        r2.append(r1);
        r2.append(r7);
        r7 = ", ";
        r2.append(r7);
        r2.append(r8);
        r2.append(r7);
        r2.append(r6);
        r6 = r2.toString();
        r0.<init>(r6);
        throw r0;
        r6 = new java.lang.IllegalArgumentException;
        r7 = r5.size();
        r0 = 40;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r0);
        r0 = "Length too large: ";
        r1.append(r0);
        r1.append(r8);
        r1.append(r7);
        r7 = r1.toString();
        r6.<init>(r7);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfgz.zza(com.google.android.gms.internal.zzfgs, int, int):boolean");
    }

    public final zzfgs zzaa(int i, int i2) {
        i2 = zzfgs.zzh(i, i2, size());
        return i2 == 0 ? zzfgs.zzpnw : new zzfgv(this.zzjwl, zzcxu() + i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzjwl, i, bArr, i2, i3);
    }

    public final zzfhb zzcxq() {
        return zzfhb.zzb(this.zzjwl, zzcxu(), size(), true);
    }

    /* Access modifiers changed, original: protected */
    public int zzcxu() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzg(int i, int i2, int i3) {
        return zzfhz.zza(i, this.zzjwl, zzcxu() + i2, i3);
    }

    public byte zzld(int i) {
        return this.zzjwl[i];
    }
}

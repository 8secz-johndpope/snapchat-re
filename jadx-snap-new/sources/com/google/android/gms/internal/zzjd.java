package com.google.android.gms.internal;

public final class zzjd extends zzflm<zzjd> {
    public Integer zzbcv;
    private Integer zzbcw;
    private zzjf zzbcx;
    public zzjg zzbcy;
    private zzje[] zzbcz;
    private zzjh zzbda;
    private zzjq zzbdb;
    private zzjp zzbdc;
    private zzjm zzbdd;
    private zzjn zzbde;
    private zzjw[] zzbdf;

    public zzjd() {
        this.zzbcv = null;
        this.zzbcw = null;
        this.zzbcx = null;
        this.zzbcy = null;
        this.zzbcz = zzje.zzhv();
        this.zzbda = null;
        this.zzbdb = null;
        this.zzbdc = null;
        this.zzbdd = null;
        this.zzbde = null;
        this.zzbdf = zzjw.zzhy();
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final com.google.android.gms.internal.zzjd zzg(com.google.android.gms.internal.zzflj r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.zzcxx();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x013b;
            case 56: goto L_0x0106;
            case 64: goto L_0x00f2;
            case 74: goto L_0x00e0;
            case 82: goto L_0x00d2;
            case 90: goto L_0x0094;
            case 98: goto L_0x0086;
            case 106: goto L_0x0078;
            case 114: goto L_0x006a;
            case 122: goto L_0x005b;
            case 130: goto L_0x004c;
            case 138: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r0 = com.google.android.gms.internal.zzflv.zzb(r7, r0);
        r2 = r6.zzbdf;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r2 = 0;
        goto L_0x001c;
    L_0x001b:
        r2 = r2.length;
    L_0x001c:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.zzjw[r0];
        if (r2 == 0) goto L_0x0026;
    L_0x0021:
        r3 = r6.zzbdf;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0026:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x003d;
    L_0x002b:
        r1 = new com.google.android.gms.internal.zzjw;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.zza(r1);
        r7.zzcxx();
        r2 = r2 + 1;
        goto L_0x0026;
    L_0x003d:
        r1 = new com.google.android.gms.internal.zzjw;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.zza(r1);
        r6.zzbdf = r0;
        goto L_0x0000;
    L_0x004c:
        r0 = r6.zzbde;
        if (r0 != 0) goto L_0x0057;
    L_0x0050:
        r0 = new com.google.android.gms.internal.zzjn;
        r0.<init>();
        r6.zzbde = r0;
    L_0x0057:
        r0 = r6.zzbde;
        goto L_0x00ed;
    L_0x005b:
        r0 = r6.zzbdd;
        if (r0 != 0) goto L_0x0066;
    L_0x005f:
        r0 = new com.google.android.gms.internal.zzjm;
        r0.<init>();
        r6.zzbdd = r0;
    L_0x0066:
        r0 = r6.zzbdd;
        goto L_0x00ed;
    L_0x006a:
        r0 = r6.zzbdc;
        if (r0 != 0) goto L_0x0075;
    L_0x006e:
        r0 = new com.google.android.gms.internal.zzjp;
        r0.<init>();
        r6.zzbdc = r0;
    L_0x0075:
        r0 = r6.zzbdc;
        goto L_0x00ed;
    L_0x0078:
        r0 = r6.zzbdb;
        if (r0 != 0) goto L_0x0083;
    L_0x007c:
        r0 = new com.google.android.gms.internal.zzjq;
        r0.<init>();
        r6.zzbdb = r0;
    L_0x0083:
        r0 = r6.zzbdb;
        goto L_0x00ed;
    L_0x0086:
        r0 = r6.zzbda;
        if (r0 != 0) goto L_0x0091;
    L_0x008a:
        r0 = new com.google.android.gms.internal.zzjh;
        r0.<init>();
        r6.zzbda = r0;
    L_0x0091:
        r0 = r6.zzbda;
        goto L_0x00ed;
    L_0x0094:
        r0 = 90;
        r0 = com.google.android.gms.internal.zzflv.zzb(r7, r0);
        r2 = r6.zzbcz;
        if (r2 != 0) goto L_0x00a0;
    L_0x009e:
        r2 = 0;
        goto L_0x00a1;
    L_0x00a0:
        r2 = r2.length;
    L_0x00a1:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.zzje[r0];
        if (r2 == 0) goto L_0x00ab;
    L_0x00a6:
        r3 = r6.zzbcz;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00ab:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00c2;
    L_0x00b0:
        r1 = new com.google.android.gms.internal.zzje;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.zza(r1);
        r7.zzcxx();
        r2 = r2 + 1;
        goto L_0x00ab;
    L_0x00c2:
        r1 = new com.google.android.gms.internal.zzje;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.zza(r1);
        r6.zzbcz = r0;
        goto L_0x0000;
    L_0x00d2:
        r0 = r6.zzbcy;
        if (r0 != 0) goto L_0x00dd;
    L_0x00d6:
        r0 = new com.google.android.gms.internal.zzjg;
        r0.<init>();
        r6.zzbcy = r0;
    L_0x00dd:
        r0 = r6.zzbcy;
        goto L_0x00ed;
    L_0x00e0:
        r0 = r6.zzbcx;
        if (r0 != 0) goto L_0x00eb;
    L_0x00e4:
        r0 = new com.google.android.gms.internal.zzjf;
        r0.<init>();
        r6.zzbcx = r0;
    L_0x00eb:
        r0 = r6.zzbcx;
    L_0x00ed:
        r7.zza(r0);
        goto L_0x0000;
    L_0x00f2:
        r1 = r7.getPosition();
        r2 = r7.zzcym();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = com.google.android.gms.internal.zzjc.zzd(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r6.zzbcw = r2;	 Catch:{ IllegalArgumentException -> 0x0133 }
        goto L_0x0000;
    L_0x0106:
        r1 = r7.getPosition();
        r2 = r7.zzcym();	 Catch:{ IllegalArgumentException -> 0x0133 }
        switch(r2) {
            case 0: goto L_0x0114;
            case 1: goto L_0x0114;
            case 2: goto L_0x0114;
            case 3: goto L_0x0114;
            case 4: goto L_0x0114;
            case 5: goto L_0x0114;
            case 6: goto L_0x0114;
            case 7: goto L_0x0114;
            case 8: goto L_0x0114;
            case 9: goto L_0x0114;
            default: goto L_0x0111;
        };	 Catch:{ IllegalArgumentException -> 0x0133 }
    L_0x0111:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0133 }
        goto L_0x011c;
    L_0x0114:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r6.zzbcv = r2;	 Catch:{ IllegalArgumentException -> 0x0133 }
        goto L_0x0000;
    L_0x011c:
        r4 = 43;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = " is not a valid enum AdInitiater";
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0133 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0133 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0133 }
    L_0x0133:
        r7.zzmw(r1);
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x013b:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzjd.zzg(com.google.android.gms.internal.zzflj):com.google.android.gms.internal.zzjd");
    }

    public final void zza(zzflk zzflk) {
        Integer num = this.zzbcv;
        if (num != null) {
            zzflk.zzad(7, num.intValue());
        }
        num = this.zzbcw;
        if (num != null) {
            zzflk.zzad(8, num.intValue());
        }
        zzfls zzfls = this.zzbcx;
        if (zzfls != null) {
            zzflk.zza(9, zzfls);
        }
        zzfls = this.zzbcy;
        if (zzfls != null) {
            zzflk.zza(10, zzfls);
        }
        zzje[] zzjeArr = this.zzbcz;
        int i = 0;
        if (zzjeArr != null && zzjeArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzje[] zzjeArr2 = this.zzbcz;
                if (i2 >= zzjeArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzjeArr2[i2];
                if (zzfls2 != null) {
                    zzflk.zza(11, zzfls2);
                }
                i2++;
            }
        }
        zzfls = this.zzbda;
        if (zzfls != null) {
            zzflk.zza(12, zzfls);
        }
        zzfls = this.zzbdb;
        if (zzfls != null) {
            zzflk.zza(13, zzfls);
        }
        zzfls = this.zzbdc;
        if (zzfls != null) {
            zzflk.zza(14, zzfls);
        }
        zzfls = this.zzbdd;
        if (zzfls != null) {
            zzflk.zza(15, zzfls);
        }
        zzfls = this.zzbde;
        if (zzfls != null) {
            zzflk.zza(16, zzfls);
        }
        zzjw[] zzjwArr = this.zzbdf;
        if (zzjwArr != null && zzjwArr.length > 0) {
            while (true) {
                zzjwArr = this.zzbdf;
                if (i >= zzjwArr.length) {
                    break;
                }
                zzfls = zzjwArr[i];
                if (zzfls != null) {
                    zzflk.zza(17, zzfls);
                }
                i++;
            }
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        Integer num = this.zzbcv;
        if (num != null) {
            zzq += zzflk.zzag(7, num.intValue());
        }
        num = this.zzbcw;
        if (num != null) {
            zzq += zzflk.zzag(8, num.intValue());
        }
        zzfls zzfls = this.zzbcx;
        if (zzfls != null) {
            zzq += zzflk.zzb(9, zzfls);
        }
        zzfls = this.zzbcy;
        if (zzfls != null) {
            zzq += zzflk.zzb(10, zzfls);
        }
        zzje[] zzjeArr = this.zzbcz;
        int i = 0;
        if (zzjeArr != null && zzjeArr.length > 0) {
            int i2 = zzq;
            zzq = 0;
            while (true) {
                zzje[] zzjeArr2 = this.zzbcz;
                if (zzq >= zzjeArr2.length) {
                    break;
                }
                zzfls zzfls2 = zzjeArr2[zzq];
                if (zzfls2 != null) {
                    i2 += zzflk.zzb(11, zzfls2);
                }
                zzq++;
            }
            zzq = i2;
        }
        zzfls = this.zzbda;
        if (zzfls != null) {
            zzq += zzflk.zzb(12, zzfls);
        }
        zzfls = this.zzbdb;
        if (zzfls != null) {
            zzq += zzflk.zzb(13, zzfls);
        }
        zzfls = this.zzbdc;
        if (zzfls != null) {
            zzq += zzflk.zzb(14, zzfls);
        }
        zzfls = this.zzbdd;
        if (zzfls != null) {
            zzq += zzflk.zzb(15, zzfls);
        }
        zzfls = this.zzbde;
        if (zzfls != null) {
            zzq += zzflk.zzb(16, zzfls);
        }
        zzjw[] zzjwArr = this.zzbdf;
        if (zzjwArr != null && zzjwArr.length > 0) {
            while (true) {
                zzjwArr = this.zzbdf;
                if (i >= zzjwArr.length) {
                    break;
                }
                zzfls = zzjwArr[i];
                if (zzfls != null) {
                    zzq += zzflk.zzb(17, zzfls);
                }
                i++;
            }
        }
        return zzq;
    }
}

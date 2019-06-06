package com.google.android.gms.internal;

public final class zzflw extends zzflm<zzflw> {
    public String url;
    public Integer zzbdh;
    private Integer zzpwf;
    public String zzpwg;
    private String zzpwh;
    public zzflx zzpwi;
    public zzfme[] zzpwj;
    public String zzpwk;
    public zzfmd zzpwl;
    private Boolean zzpwm;
    private String[] zzpwn;
    private String zzpwo;
    private Boolean zzpwp;
    private Boolean zzpwq;
    private byte[] zzpwr;
    public zzfmf zzpws;

    public zzflw() {
        this.zzbdh = null;
        this.zzpwf = null;
        this.url = null;
        this.zzpwg = null;
        this.zzpwh = null;
        this.zzpwi = null;
        this.zzpwj = zzfme.zzdct();
        this.zzpwk = null;
        this.zzpwl = null;
        this.zzpwm = null;
        this.zzpwn = zzflv.EMPTY_STRING_ARRAY;
        this.zzpwo = null;
        this.zzpwp = null;
        this.zzpwq = null;
        this.zzpwr = null;
        this.zzpws = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    private final com.google.android.gms.internal.zzflw zzbk(com.google.android.gms.internal.zzflj r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.zzcxx();
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case 0: goto L_0x016c;
            case 10: goto L_0x0164;
            case 18: goto L_0x015c;
            case 26: goto L_0x0154;
            case 34: goto L_0x0117;
            case 40: goto L_0x010b;
            case 50: goto L_0x00da;
            case 58: goto L_0x00d2;
            case 64: goto L_0x00c6;
            case 72: goto L_0x00ba;
            case 80: goto L_0x0085;
            case 88: goto L_0x004b;
            case 98: goto L_0x003a;
            case 106: goto L_0x0033;
            case 114: goto L_0x0025;
            case 122: goto L_0x001e;
            case 138: goto L_0x0010;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.zza(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000f:
        return r6;
    L_0x0010:
        r0 = r6.zzpws;
        if (r0 != 0) goto L_0x001b;
    L_0x0014:
        r0 = new com.google.android.gms.internal.zzfmf;
        r0.<init>();
        r6.zzpws = r0;
    L_0x001b:
        r0 = r6.zzpws;
        goto L_0x0047;
    L_0x001e:
        r0 = r7.readBytes();
        r6.zzpwr = r0;
        goto L_0x0000;
    L_0x0025:
        r0 = r6.zzpwl;
        if (r0 != 0) goto L_0x0030;
    L_0x0029:
        r0 = new com.google.android.gms.internal.zzfmd;
        r0.<init>();
        r6.zzpwl = r0;
    L_0x0030:
        r0 = r6.zzpwl;
        goto L_0x0047;
    L_0x0033:
        r0 = r7.readString();
        r6.zzpwk = r0;
        goto L_0x0000;
    L_0x003a:
        r0 = r6.zzpwi;
        if (r0 != 0) goto L_0x0045;
    L_0x003e:
        r0 = new com.google.android.gms.internal.zzflx;
        r0.<init>();
        r6.zzpwi = r0;
    L_0x0045:
        r0 = r6.zzpwi;
    L_0x0047:
        r7.zza(r0);
        goto L_0x0000;
    L_0x004b:
        r2 = r7.getPosition();
        r3 = r7.zzcya();	 Catch:{ IllegalArgumentException -> 0x0081 }
        if (r3 == 0) goto L_0x007a;
    L_0x0055:
        if (r3 == r1) goto L_0x007a;
    L_0x0057:
        r1 = 2;
        if (r3 == r1) goto L_0x007a;
    L_0x005a:
        r1 = 3;
        if (r3 == r1) goto L_0x007a;
    L_0x005d:
        r1 = 4;
        if (r3 != r1) goto L_0x0061;
    L_0x0060:
        goto L_0x007a;
    L_0x0061:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r4 = 39;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r3 = " is not a valid enum Verdict";
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r3 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0081 }
        r1.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0081 }
        throw r1;	 Catch:{ IllegalArgumentException -> 0x0081 }
    L_0x007a:
        r1 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalArgumentException -> 0x0081 }
        r6.zzpwf = r1;	 Catch:{ IllegalArgumentException -> 0x0081 }
        goto L_0x0000;
    L_0x0081:
        r7.zzmw(r2);
        goto L_0x00b5;
    L_0x0085:
        r1 = r7.getPosition();
        r2 = r7.zzcya();	 Catch:{ IllegalArgumentException -> 0x00b2 }
        switch(r2) {
            case 0: goto L_0x0093;
            case 1: goto L_0x0093;
            case 2: goto L_0x0093;
            case 3: goto L_0x0093;
            case 4: goto L_0x0093;
            case 5: goto L_0x0093;
            case 6: goto L_0x0093;
            case 7: goto L_0x0093;
            case 8: goto L_0x0093;
            case 9: goto L_0x0093;
            default: goto L_0x0090;
        };	 Catch:{ IllegalArgumentException -> 0x00b2 }
    L_0x0090:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        goto L_0x009b;
    L_0x0093:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r6.zzbdh = r2;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        goto L_0x0000;
    L_0x009b:
        r4 = 42;
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r2 = " is not a valid enum ReportType";
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00b2 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00b2 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00b2 }
    L_0x00b2:
        r7.zzmw(r1);
    L_0x00b5:
        r6.zza(r7, r0);
        goto L_0x0000;
    L_0x00ba:
        r0 = r7.zzcyd();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzpwq = r0;
        goto L_0x0000;
    L_0x00c6:
        r0 = r7.zzcyd();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzpwp = r0;
        goto L_0x0000;
    L_0x00d2:
        r0 = r7.readString();
        r6.zzpwo = r0;
        goto L_0x0000;
    L_0x00da:
        r0 = 50;
        r0 = com.google.android.gms.internal.zzflv.zzb(r7, r0);
        r3 = r6.zzpwn;
        if (r3 != 0) goto L_0x00e6;
    L_0x00e4:
        r3 = 0;
        goto L_0x00e7;
    L_0x00e6:
        r3 = r3.length;
    L_0x00e7:
        r0 = r0 + r3;
        r0 = new java.lang.String[r0];
        if (r3 == 0) goto L_0x00f1;
    L_0x00ec:
        r4 = r6.zzpwn;
        java.lang.System.arraycopy(r4, r2, r0, r2, r3);
    L_0x00f1:
        r2 = r0.length;
        r2 = r2 - r1;
        if (r3 >= r2) goto L_0x0101;
    L_0x00f5:
        r2 = r7.readString();
        r0[r3] = r2;
        r7.zzcxx();
        r3 = r3 + 1;
        goto L_0x00f1;
    L_0x0101:
        r1 = r7.readString();
        r0[r3] = r1;
        r6.zzpwn = r0;
        goto L_0x0000;
    L_0x010b:
        r0 = r7.zzcyd();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.zzpwm = r0;
        goto L_0x0000;
    L_0x0117:
        r0 = 34;
        r0 = com.google.android.gms.internal.zzflv.zzb(r7, r0);
        r3 = r6.zzpwj;
        if (r3 != 0) goto L_0x0123;
    L_0x0121:
        r3 = 0;
        goto L_0x0124;
    L_0x0123:
        r3 = r3.length;
    L_0x0124:
        r0 = r0 + r3;
        r0 = new com.google.android.gms.internal.zzfme[r0];
        if (r3 == 0) goto L_0x012e;
    L_0x0129:
        r4 = r6.zzpwj;
        java.lang.System.arraycopy(r4, r2, r0, r2, r3);
    L_0x012e:
        r2 = r0.length;
        r2 = r2 - r1;
        if (r3 >= r2) goto L_0x0144;
    L_0x0132:
        r2 = new com.google.android.gms.internal.zzfme;
        r2.<init>();
        r0[r3] = r2;
        r2 = r0[r3];
        r7.zza(r2);
        r7.zzcxx();
        r3 = r3 + 1;
        goto L_0x012e;
    L_0x0144:
        r1 = new com.google.android.gms.internal.zzfme;
        r1.<init>();
        r0[r3] = r1;
        r1 = r0[r3];
        r7.zza(r1);
        r6.zzpwj = r0;
        goto L_0x0000;
    L_0x0154:
        r0 = r7.readString();
        r6.zzpwh = r0;
        goto L_0x0000;
    L_0x015c:
        r0 = r7.readString();
        r6.zzpwg = r0;
        goto L_0x0000;
    L_0x0164:
        r0 = r7.readString();
        r6.url = r0;
        goto L_0x0000;
    L_0x016c:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzflw.zzbk(com.google.android.gms.internal.zzflj):com.google.android.gms.internal.zzflw");
    }

    public final void zza(zzflk zzflk) {
        String str = this.url;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        str = this.zzpwg;
        if (str != null) {
            zzflk.zzp(2, str);
        }
        str = this.zzpwh;
        if (str != null) {
            zzflk.zzp(3, str);
        }
        zzfme[] zzfmeArr = this.zzpwj;
        int i = 0;
        if (zzfmeArr != null && zzfmeArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzfme[] zzfmeArr2 = this.zzpwj;
                if (i2 >= zzfmeArr2.length) {
                    break;
                }
                zzfls zzfls = zzfmeArr2[i2];
                if (zzfls != null) {
                    zzflk.zza(4, zzfls);
                }
                i2++;
            }
        }
        Boolean bool = this.zzpwm;
        if (bool != null) {
            zzflk.zzl(5, bool.booleanValue());
        }
        String[] strArr = this.zzpwn;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.zzpwn;
                if (i >= strArr.length) {
                    break;
                }
                str = strArr[i];
                if (str != null) {
                    zzflk.zzp(6, str);
                }
                i++;
            }
        }
        str = this.zzpwo;
        if (str != null) {
            zzflk.zzp(7, str);
        }
        bool = this.zzpwp;
        if (bool != null) {
            zzflk.zzl(8, bool.booleanValue());
        }
        bool = this.zzpwq;
        if (bool != null) {
            zzflk.zzl(9, bool.booleanValue());
        }
        Integer num = this.zzbdh;
        if (num != null) {
            zzflk.zzad(10, num.intValue());
        }
        num = this.zzpwf;
        if (num != null) {
            zzflk.zzad(11, num.intValue());
        }
        zzfls zzfls2 = this.zzpwi;
        if (zzfls2 != null) {
            zzflk.zza(12, zzfls2);
        }
        str = this.zzpwk;
        if (str != null) {
            zzflk.zzp(13, str);
        }
        zzfls2 = this.zzpwl;
        if (zzfls2 != null) {
            zzflk.zza(14, zzfls2);
        }
        byte[] bArr = this.zzpwr;
        if (bArr != null) {
            zzflk.zzc(15, bArr);
        }
        zzfls2 = this.zzpws;
        if (zzfls2 != null) {
            zzflk.zza(17, zzfls2);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int i;
        int zzq = super.zzq();
        String str = this.url;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        str = this.zzpwg;
        if (str != null) {
            zzq += zzflk.zzq(2, str);
        }
        str = this.zzpwh;
        if (str != null) {
            zzq += zzflk.zzq(3, str);
        }
        zzfme[] zzfmeArr = this.zzpwj;
        int i2 = 0;
        if (zzfmeArr != null && zzfmeArr.length > 0) {
            i = zzq;
            zzq = 0;
            while (true) {
                zzfme[] zzfmeArr2 = this.zzpwj;
                if (zzq >= zzfmeArr2.length) {
                    break;
                }
                zzfls zzfls = zzfmeArr2[zzq];
                if (zzfls != null) {
                    i += zzflk.zzb(4, zzfls);
                }
                zzq++;
            }
            zzq = i;
        }
        Boolean bool = this.zzpwm;
        if (bool != null) {
            bool.booleanValue();
            zzq += zzflk.zzlw(5) + 1;
        }
        String[] strArr = this.zzpwn;
        if (strArr != null && strArr.length > 0) {
            i = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.zzpwn;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    i3++;
                    i += zzflk.zztx(str2);
                }
                i2++;
            }
            zzq = (zzq + i) + (i3 * 1);
        }
        str = this.zzpwo;
        if (str != null) {
            zzq += zzflk.zzq(7, str);
        }
        bool = this.zzpwp;
        if (bool != null) {
            bool.booleanValue();
            zzq += zzflk.zzlw(8) + 1;
        }
        bool = this.zzpwq;
        if (bool != null) {
            bool.booleanValue();
            zzq += zzflk.zzlw(9) + 1;
        }
        Integer num = this.zzbdh;
        if (num != null) {
            zzq += zzflk.zzag(10, num.intValue());
        }
        num = this.zzpwf;
        if (num != null) {
            zzq += zzflk.zzag(11, num.intValue());
        }
        zzfls zzfls2 = this.zzpwi;
        if (zzfls2 != null) {
            zzq += zzflk.zzb(12, zzfls2);
        }
        str = this.zzpwk;
        if (str != null) {
            zzq += zzflk.zzq(13, str);
        }
        zzfls2 = this.zzpwl;
        if (zzfls2 != null) {
            zzq += zzflk.zzb(14, zzfls2);
        }
        byte[] bArr = this.zzpwr;
        if (bArr != null) {
            zzq += zzflk.zzd(15, bArr);
        }
        zzfls2 = this.zzpws;
        return zzfls2 != null ? zzq + zzflk.zzb(17, zzfls2) : zzq;
    }
}

package com.google.android.gms.internal;

public final class zzjw extends zzflm<zzjw> {
    private static volatile zzjw[] zzbfy;
    private zzka zzbfz;
    private zzkc zzbga;
    private zzkd zzbgb;
    private zzke zzbgc;
    private zzjx zzbgd;
    private zzkb zzbge;
    private zzjz zzbgf;
    private Integer zzbgg;
    private Integer zzbgh;
    private zzju zzbgi;
    private Integer zzbgj;
    private Integer zzbgk;
    private Integer zzbgl;
    private Integer zzbgm;
    private Integer zzbgn;

    public zzjw() {
        this.zzbfz = null;
        this.zzbga = null;
        this.zzbgb = null;
        this.zzbgc = null;
        this.zzbgd = null;
        this.zzbge = null;
        this.zzbgf = null;
        this.zzbgg = null;
        this.zzbgh = null;
        this.zzbgi = null;
        this.zzbgj = null;
        this.zzbgk = null;
        this.zzbgl = null;
        this.zzbgm = null;
        this.zzbgn = null;
        this.zzpvl = null;
        this.zzpnr = -1;
    }

    public static zzjw[] zzhy() {
        if (zzbfy == null) {
            synchronized (zzflq.zzpvt) {
                if (zzbfy == null) {
                    zzbfy = new zzjw[0];
                }
            }
        }
        return zzbfy;
    }

    public final void zza(zzflk zzflk) {
        zzfls zzfls = this.zzbfz;
        if (zzfls != null) {
            zzflk.zza(5, zzfls);
        }
        zzfls = this.zzbga;
        if (zzfls != null) {
            zzflk.zza(6, zzfls);
        }
        zzfls = this.zzbgb;
        if (zzfls != null) {
            zzflk.zza(7, zzfls);
        }
        zzfls = this.zzbgc;
        if (zzfls != null) {
            zzflk.zza(8, zzfls);
        }
        zzfls = this.zzbgd;
        if (zzfls != null) {
            zzflk.zza(9, zzfls);
        }
        zzfls = this.zzbge;
        if (zzfls != null) {
            zzflk.zza(10, zzfls);
        }
        zzfls = this.zzbgf;
        if (zzfls != null) {
            zzflk.zza(11, zzfls);
        }
        Integer num = this.zzbgg;
        if (num != null) {
            zzflk.zzad(12, num.intValue());
        }
        num = this.zzbgh;
        if (num != null) {
            zzflk.zzad(13, num.intValue());
        }
        zzfls = this.zzbgi;
        if (zzfls != null) {
            zzflk.zza(14, zzfls);
        }
        num = this.zzbgj;
        if (num != null) {
            zzflk.zzad(15, num.intValue());
        }
        num = this.zzbgk;
        if (num != null) {
            zzflk.zzad(16, num.intValue());
        }
        num = this.zzbgl;
        if (num != null) {
            zzflk.zzad(17, num.intValue());
        }
        num = this.zzbgm;
        if (num != null) {
            zzflk.zzad(18, num.intValue());
        }
        num = this.zzbgn;
        if (num != null) {
            zzflk.zzad(19, num.intValue());
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        zzfls zzfls = this.zzbfz;
        if (zzfls != null) {
            zzq += zzflk.zzb(5, zzfls);
        }
        zzfls = this.zzbga;
        if (zzfls != null) {
            zzq += zzflk.zzb(6, zzfls);
        }
        zzfls = this.zzbgb;
        if (zzfls != null) {
            zzq += zzflk.zzb(7, zzfls);
        }
        zzfls = this.zzbgc;
        if (zzfls != null) {
            zzq += zzflk.zzb(8, zzfls);
        }
        zzfls = this.zzbgd;
        if (zzfls != null) {
            zzq += zzflk.zzb(9, zzfls);
        }
        zzfls = this.zzbge;
        if (zzfls != null) {
            zzq += zzflk.zzb(10, zzfls);
        }
        zzfls = this.zzbgf;
        if (zzfls != null) {
            zzq += zzflk.zzb(11, zzfls);
        }
        Integer num = this.zzbgg;
        if (num != null) {
            zzq += zzflk.zzag(12, num.intValue());
        }
        num = this.zzbgh;
        if (num != null) {
            zzq += zzflk.zzag(13, num.intValue());
        }
        zzfls = this.zzbgi;
        if (zzfls != null) {
            zzq += zzflk.zzb(14, zzfls);
        }
        num = this.zzbgj;
        if (num != null) {
            zzq += zzflk.zzag(15, num.intValue());
        }
        num = this.zzbgk;
        if (num != null) {
            zzq += zzflk.zzag(16, num.intValue());
        }
        num = this.zzbgl;
        if (num != null) {
            zzq += zzflk.zzag(17, num.intValue());
        }
        num = this.zzbgm;
        if (num != null) {
            zzq += zzflk.zzag(18, num.intValue());
        }
        num = this.zzbgn;
        return num != null ? zzq + zzflk.zzag(19, num.intValue()) : zzq;
    }
}

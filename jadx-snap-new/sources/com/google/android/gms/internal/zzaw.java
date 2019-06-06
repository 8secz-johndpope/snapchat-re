package com.google.android.gms.internal;

public final class zzaw extends zzflm<zzaw> {
    private String stackTrace;
    public String zzcm;
    public Long zzcn;
    private String zzco;
    private String zzcp;
    private Long zzcq;
    private Long zzcr;
    private String zzcs;
    private Long zzct;
    private String zzcu;

    public zzaw() {
        this.zzcm = null;
        this.zzcn = null;
        this.stackTrace = null;
        this.zzco = null;
        this.zzcp = null;
        this.zzcq = null;
        this.zzcr = null;
        this.zzcs = null;
        this.zzct = null;
        this.zzcu = null;
        this.zzpnr = -1;
    }

    public final void zza(zzflk zzflk) {
        String str = this.zzcm;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        Long l = this.zzcn;
        if (l != null) {
            zzflk.zzf(2, l.longValue());
        }
        str = this.stackTrace;
        if (str != null) {
            zzflk.zzp(3, str);
        }
        str = this.zzco;
        if (str != null) {
            zzflk.zzp(4, str);
        }
        str = this.zzcp;
        if (str != null) {
            zzflk.zzp(5, str);
        }
        l = this.zzcq;
        if (l != null) {
            zzflk.zzf(6, l.longValue());
        }
        l = this.zzcr;
        if (l != null) {
            zzflk.zzf(7, l.longValue());
        }
        str = this.zzcs;
        if (str != null) {
            zzflk.zzp(8, str);
        }
        l = this.zzct;
        if (l != null) {
            zzflk.zzf(9, l.longValue());
        }
        str = this.zzcu;
        if (str != null) {
            zzflk.zzp(10, str);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzcm;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        Long l = this.zzcn;
        if (l != null) {
            zzq += zzflk.zzc(2, l.longValue());
        }
        str = this.stackTrace;
        if (str != null) {
            zzq += zzflk.zzq(3, str);
        }
        str = this.zzco;
        if (str != null) {
            zzq += zzflk.zzq(4, str);
        }
        str = this.zzcp;
        if (str != null) {
            zzq += zzflk.zzq(5, str);
        }
        l = this.zzcq;
        if (l != null) {
            zzq += zzflk.zzc(6, l.longValue());
        }
        l = this.zzcr;
        if (l != null) {
            zzq += zzflk.zzc(7, l.longValue());
        }
        str = this.zzcs;
        if (str != null) {
            zzq += zzflk.zzq(8, str);
        }
        l = this.zzct;
        if (l != null) {
            zzq += zzflk.zzc(9, l.longValue());
        }
        str = this.zzcu;
        return str != null ? zzq + zzflk.zzq(10, str) : zzq;
    }
}

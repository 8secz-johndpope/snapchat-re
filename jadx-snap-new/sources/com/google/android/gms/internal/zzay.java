package com.google.android.gms.internal;

public final class zzay extends zzflm<zzay> {
    public String zzcv;
    private String zzcw;
    private String zzcx;
    private String zzcy;
    private String zzcz;

    public final void zza(zzflk zzflk) {
        String str = this.zzcv;
        if (str != null) {
            zzflk.zzp(1, str);
        }
        str = this.zzcw;
        if (str != null) {
            zzflk.zzp(2, str);
        }
        str = this.zzcx;
        if (str != null) {
            zzflk.zzp(3, str);
        }
        str = this.zzcy;
        if (str != null) {
            zzflk.zzp(4, str);
        }
        str = this.zzcz;
        if (str != null) {
            zzflk.zzp(5, str);
        }
        super.zza(zzflk);
    }

    /* Access modifiers changed, original: protected|final */
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzcv;
        if (str != null) {
            zzq += zzflk.zzq(1, str);
        }
        str = this.zzcw;
        if (str != null) {
            zzq += zzflk.zzq(2, str);
        }
        str = this.zzcx;
        if (str != null) {
            zzq += zzflk.zzq(3, str);
        }
        str = this.zzcy;
        if (str != null) {
            zzq += zzflk.zzq(4, str);
        }
        str = this.zzcz;
        return str != null ? zzq + zzflk.zzq(5, str) : zzq;
    }
}

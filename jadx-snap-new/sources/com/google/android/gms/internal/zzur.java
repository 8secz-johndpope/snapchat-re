package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzak;
import com.google.android.gms.ads.internal.zzbt;

final class zzur {
    zzak zzceg;
    zzkk zzceh;
    zztl zzcei;
    long zzcej;
    boolean zzcek;
    boolean zzcel;
    private /* synthetic */ zzuq zzcem;

    zzur(zzuq zzuq, zztk zztk) {
        this.zzcem = zzuq;
        this.zzceg = zztk.zzaw(zzuq.zzapp);
        this.zzcei = new zztl();
        zztl zztl = this.zzcei;
        zzak zzak = this.zzceg;
        zzak.zza(new zztm(zztl));
        zzak.zza(new zztu(zztl));
        zzak.zza(new zztw(zztl));
        zzak.zza(new zzty(zztl));
        zzak.zza(new zzua(zztl));
    }

    zzur(zzuq zzuq, zztk zztk, zzkk zzkk) {
        this(zzuq, zztk);
        this.zzceh = zzkk;
    }

    /* Access modifiers changed, original: final */
    public final boolean load() {
        if (this.zzcek) {
            return false;
        }
        zzkk zzkk = this.zzceh;
        if (zzkk == null) {
            zzkk = this.zzcem.zzced;
        }
        this.zzcel = this.zzceg.zzb(zzuo.zzi(zzkk));
        this.zzcek = true;
        this.zzcej = zzbt.zzes().currentTimeMillis();
        return true;
    }
}

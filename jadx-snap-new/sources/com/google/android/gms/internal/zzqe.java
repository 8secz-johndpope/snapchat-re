package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzqe implements zzt<Object> {
    private /* synthetic */ zzaan zzbze;
    private /* synthetic */ zzqb zzbzf;

    zzqe(zzqb zzqb, zzaan zzaan) {
        this.zzbzf = zzqb;
        this.zzbze = zzaan;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzaof zzaof = (zzaof) this.zzbzf.zzbzc.get();
        if (zzaof == null) {
            this.zzbze.zzb("/showOverlay", this);
        } else {
            zzaof.getView().setVisibility(0);
        }
    }
}

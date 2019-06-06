package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzqf implements zzt<Object> {
    private /* synthetic */ zzaan zzbze;
    private /* synthetic */ zzqb zzbzf;

    zzqf(zzqb zzqb, zzaan zzaan) {
        this.zzbzf = zzqb;
        this.zzbze = zzaan;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzaof zzaof = (zzaof) this.zzbzf.zzbzc.get();
        if (zzaof == null) {
            this.zzbze.zzb("/hideOverlay", this);
        } else {
            zzaof.getView().setVisibility(8);
        }
    }
}

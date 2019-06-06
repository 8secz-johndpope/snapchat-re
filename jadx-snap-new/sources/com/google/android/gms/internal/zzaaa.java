package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzaaa implements zzt<Object> {
    private /* synthetic */ zzzy zzcpf;
    private /* synthetic */ zzpo zzcpg;

    zzaaa(zzzy zzzy, zzpo zzpo) {
        this.zzcpf = zzzy;
        this.zzcpg = zzpo;
    }

    public final void zza(Object obj, Map<String, String> map) {
        this.zzcpf.zzc(this.zzcpg, (String) map.get("asset"));
    }
}

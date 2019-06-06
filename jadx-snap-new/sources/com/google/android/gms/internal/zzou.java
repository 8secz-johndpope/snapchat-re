package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@zzabh
public final class zzou {
    private final zzov zzanh;
    private final Map<String, zzot> zzbws = new HashMap();

    public zzou(zzov zzov) {
        this.zzanh = zzov;
    }

    public final void zza(String str, zzot zzot) {
        this.zzbws.put(str, zzot);
    }

    public final void zza(String str, String str2, long j) {
        zzov zzov = this.zzanh;
        zzot zzot = (zzot) this.zzbws.get(str2);
        String[] strArr = new String[]{str};
        if (!(zzov == null || zzot == null)) {
            zzov.zza(zzot, j, strArr);
        }
        Map map = this.zzbws;
        zzov = this.zzanh;
        map.put(str, zzov == null ? null : zzov.zzd(j));
    }

    public final zzov zzjn() {
        return this.zzanh;
    }
}

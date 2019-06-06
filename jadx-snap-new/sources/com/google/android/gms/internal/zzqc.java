package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzqc implements zzt<Object> {
    private /* synthetic */ zzaan zzbze;
    final /* synthetic */ zzqb zzbzf;

    zzqc(zzqb zzqb, zzaan zzaan) {
        this.zzbzf = zzqb;
        this.zzbze = zzaan;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzaof zzaof = (zzaof) this.zzbzf.zzbzc.get();
        if (zzaof == null) {
            this.zzbze.zzb("/loadHtml", this);
            return;
        }
        zzaof.zzua().zza(new zzqd(this, map, this.zzbze));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzaof.loadData(str, "text/html", "UTF-8");
        } else {
            zzaof.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}

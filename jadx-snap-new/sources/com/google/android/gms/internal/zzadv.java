package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class zzadv implements zzt<Object> {
    private /* synthetic */ zzadt zzcwp;

    zzadv(zzadt zzadt) {
        this.zzcwp = zzadt;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.zzcwp.mLock) {
            if (this.zzcwp.zzcwl.isDone()) {
                return;
            }
            zzadz zzadz = new zzadz(-2, map);
            if (this.zzcwp.zzcwj.equals(zzadz.getRequestId())) {
                String url = zzadz.getUrl();
                if (url == null) {
                    zzaky.zzcz("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (url.contains("%40mediation_adapters%40")) {
                    String replaceAll = url.replaceAll("%40mediation_adapters%40", zzahr.zzc(this.zzcwp.mContext, (String) map.get("check_adapters"), this.zzcwp.zzcwk));
                    zzadz.setUrl(replaceAll);
                    url = "Ad request URL modified to ";
                    replaceAll = String.valueOf(replaceAll);
                    zzahw.v(replaceAll.length() != 0 ? url.concat(replaceAll) : new String(url));
                }
                this.zzcwp.zzcwl.set(zzadz);
                return;
            }
        }
    }
}

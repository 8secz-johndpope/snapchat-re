package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class zzqa implements zzt<Object> {
    private final WeakReference<zzpw> zzapr;
    private final String zzarn;

    public zzqa(zzpw zzpw, String str) {
        this.zzapr = new WeakReference(zzpw);
        this.zzarn = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.zzarn.equals(str)) {
            try {
                Integer.parseInt((String) map.get("eventType"));
            } catch (Exception e) {
                zzaky.zzb("Parse Scion log event type error", e);
            }
            zzpw zzpw;
            if ("_ai".equals(str2)) {
                zzpw = (zzpw) this.zzapr.get();
                if (zzpw != null) {
                    zzpw.zzbx();
                }
            } else if ("_ac".equals(str2)) {
                zzpw = (zzpw) this.zzapr.get();
                if (zzpw != null) {
                    zzpw.zzby();
                }
            }
        }
    }
}

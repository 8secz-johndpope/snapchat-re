package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzov;
import java.util.Map;

@zzabh
public final class zzc implements zzt<zzaof> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzaof zzaof = (zzaof) obj;
        String str = (String) map.get("action");
        String str2;
        if ("tick".equals(str)) {
            str = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            str2 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str)) {
                zzaky.zzcz("No label given for CSI tick.");
                return;
            } else if (TextUtils.isEmpty(str2)) {
                zzaky.zzcz("No timestamp given for CSI tick.");
                return;
            } else {
                try {
                    long elapsedRealtime = zzbt.zzes().elapsedRealtime() + (Long.parseLong(str2) - zzbt.zzes().currentTimeMillis());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzaof.zztk().zza(str, str3, elapsedRealtime);
                    return;
                } catch (NumberFormatException e) {
                    zzaky.zzc("Malformed timestamp for CSI tick.", e);
                    return;
                }
            }
        }
        String str4 = "value";
        zzov zzjn;
        if ("experiment".equals(str)) {
            str2 = (String) map.get(str4);
            if (TextUtils.isEmpty(str2)) {
                zzaky.zzcz("No value given for CSI experiment.");
                return;
            }
            zzjn = zzaof.zztk().zzjn();
            if (zzjn == null) {
                zzaky.zzcz("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                zzjn.zzf("e", str2);
                return;
            }
        }
        if ("extra".equals(str)) {
            str = (String) map.get("name");
            str2 = (String) map.get(str4);
            if (TextUtils.isEmpty(str2)) {
                zzaky.zzcz("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str)) {
                zzaky.zzcz("No name given for CSI extra.");
            } else {
                zzjn = zzaof.zztk().zzjn();
                if (zzjn == null) {
                    zzaky.zzcz("No ticker for WebView, dropping extra parameter.");
                    return;
                }
                zzjn.zzf(str, str2);
            }
        }
    }
}

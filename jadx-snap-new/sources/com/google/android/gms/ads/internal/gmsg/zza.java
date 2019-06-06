package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaky;
import java.util.Map;

@zzabh
public final class zza implements zzt<Object> {
    private final zzb zzcbc;

    public zza(zzb zzb) {
        this.zzcbc = zzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzaky.zzcz("App event with no name parameter.");
        } else {
            this.zzcbc.onAppEvent(str, (String) map.get("info"));
        }
    }
}

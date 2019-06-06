package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import java.util.Map;

@zzabh
public final class zzyf {
    private final zzaof zzcct;
    private final boolean zzclm;
    private final String zzcln;

    public zzyf(zzaof zzaof, Map<String, String> map) {
        this.zzcct = zzaof;
        this.zzcln = (String) map.get("forceOrientation");
        String str = "allowOrientationChange";
        this.zzclm = map.containsKey(str) ? Boolean.parseBoolean((String) map.get(str)) : true;
    }

    public final void execute() {
        if (this.zzcct == null) {
            zzaky.zzcz("AdWebView is null");
            return;
        }
        int zzrh;
        if ("portrait".equalsIgnoreCase(this.zzcln)) {
            zzrh = zzbt.zzen().zzrh();
        } else {
            zzrh = "landscape".equalsIgnoreCase(this.zzcln) ? zzbt.zzen().zzrg() : this.zzclm ? -1 : zzbt.zzen().zzri();
        }
        this.zzcct.setRequestedOrientation(zzrh);
    }
}

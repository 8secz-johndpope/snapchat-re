package com.google.android.gms.ads.internal.js;

import org.json.JSONObject;

final class zzg implements Runnable {
    private /* synthetic */ String zzcfa;
    private /* synthetic */ JSONObject zzcfb;
    private /* synthetic */ zze zzcfc;

    zzg(zze zze, String str, JSONObject jSONObject) {
        this.zzcfc = zze;
        this.zzcfa = str;
        this.zzcfb = jSONObject;
    }

    public final void run() {
        this.zzcfc.zzcct.zzb(this.zzcfa, this.zzcfb);
    }
}

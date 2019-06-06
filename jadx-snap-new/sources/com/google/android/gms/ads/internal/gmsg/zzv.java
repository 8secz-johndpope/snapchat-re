package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzaky;
import org.json.JSONObject;

final class zzv implements Runnable {
    private /* synthetic */ JSONObject zzcca;
    private /* synthetic */ zzu zzccb;

    zzv(zzu zzu, JSONObject jSONObject) {
        this.zzccb = zzu;
        this.zzcca = jSONObject;
    }

    public final void run() {
        this.zzccb.zzcby.zza("fetchHttpRequestCompleted", this.zzcca);
        zzaky.zzby("Dispatched http response.");
    }
}

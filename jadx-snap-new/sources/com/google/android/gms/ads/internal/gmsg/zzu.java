package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.js.zza;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaky;
import java.util.Map;
import org.json.JSONObject;

final class zzu implements Runnable {
    private /* synthetic */ Map zzcbx;
    final /* synthetic */ zza zzcby;
    private /* synthetic */ HttpClient zzcbz;

    zzu(HttpClient httpClient, Map map, zza zza) {
        this.zzcbz = httpClient;
        this.zzcbx = map;
        this.zzcby = zza;
    }

    public final void run() {
        zzaky.zzby("Received Http request.");
        try {
            JSONObject send = this.zzcbz.send(new JSONObject((String) this.zzcbx.get("http_request")));
            if (send == null) {
                zzaky.e("Response should not be null.");
            } else {
                zzaij.zzdfn.post(new zzv(this, send));
            }
        } catch (Exception e) {
            zzaky.zzb("Error converting request to json.", e);
        }
    }
}

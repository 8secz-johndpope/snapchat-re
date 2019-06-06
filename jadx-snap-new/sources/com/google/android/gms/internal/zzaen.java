package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbt;
import org.json.JSONObject;

@zzabh
public final class zzaen implements zzadr {
    private zzux<JSONObject, JSONObject> zzczf;
    private zzux<JSONObject, JSONObject> zzczk;

    public zzaen(Context context) {
        zzvf zzb = zzbt.zzez().zzb(context, zzala.zzse());
        zzvb zzvb = zzvc.zzcgm;
        this.zzczk = zzb.zza("google.afma.request.getAdDictionary", zzvb, zzvb);
        zzvf zzb2 = zzbt.zzez().zzb(context, zzala.zzse());
        zzvb zzvb2 = zzvc.zzcgm;
        this.zzczf = zzb2.zza("google.afma.sdkConstants.getSdkConstants", zzvb2, zzvb2);
    }

    public final zzux<JSONObject, JSONObject> zzoe() {
        return this.zzczk;
    }

    public final zzux<JSONObject, JSONObject> zzof() {
        return this.zzczf;
    }
}

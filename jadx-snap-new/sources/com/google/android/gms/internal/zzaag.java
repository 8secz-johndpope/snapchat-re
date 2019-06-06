package com.google.android.gms.internal;

import org.json.JSONObject;

final /* synthetic */ class zzaag implements Runnable {
    private final zzamd zzcdi;
    private final zzaaf zzcpz;
    private final JSONObject zzcqa;

    zzaag(zzaaf zzaaf, JSONObject jSONObject, zzamd zzamd) {
        this.zzcpz = zzaaf;
        this.zzcqa = jSONObject;
        this.zzcdi = zzamd;
    }

    public final void run() {
        this.zzcpz.zza(this.zzcqa, this.zzcdi);
    }
}

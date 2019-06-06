package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;
import org.json.JSONObject;

final /* synthetic */ class zzvd implements zzuz {
    static final zzuz zzcgo = new zzvd();

    private zzvd() {
    }

    public final Object zze(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzvc.UTF_8));
    }
}

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzyj {
    private final boolean zzclr;
    private final boolean zzcls;
    private final boolean zzclt;
    private final boolean zzclu;
    private final boolean zzclv;

    private zzyj(zzyl zzyl) {
        this.zzclr = zzyl.zzclr;
        this.zzcls = zzyl.zzcls;
        this.zzclt = zzyl.zzclt;
        this.zzclu = zzyl.zzclu;
        this.zzclv = zzyl.zzclv;
    }

    /* synthetic */ zzyj(zzyl zzyl, zzyk zzyk) {
        this(zzyl);
    }

    public final JSONObject toJson() {
        try {
            return new JSONObject().put("sms", this.zzclr).put("tel", this.zzcls).put("calendar", this.zzclt).put("storePicture", this.zzclu).put("inlineVideo", this.zzclv);
        } catch (JSONException e) {
            zzaky.zzb("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}

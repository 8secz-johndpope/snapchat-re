package com.google.android.gms.internal;

import com.brightcove.player.media.ErrorFields;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public class zzyn {
    private final zzaof zzcct;
    private final String zzcmf;

    public zzyn(zzaof zzaof) {
        this(zzaof, "");
    }

    public zzyn(zzaof zzaof, String str) {
        this.zzcct = zzaof;
        this.zzcmf = str;
    }

    public final void zza(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zzcct.zza("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            zzaky.zzb("Error occured while obtaining screen information.", e);
        }
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        try {
            this.zzcct.zza("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzaky.zzb("Error occured while dispatching size change.", e);
        }
    }

    public final void zzbm(String str) {
        try {
            this.zzcct.zza("onError", new JSONObject().put(ErrorFields.MESSAGE, str).put("action", this.zzcmf));
        } catch (JSONException e) {
            zzaky.zzb("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzbn(String str) {
        try {
            this.zzcct.zza("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzaky.zzb("Error occured while dispatching ready Event.", e);
        }
    }

    public final void zzbo(String str) {
        try {
            this.zzcct.zza("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzaky.zzb("Error occured while dispatching state change.", e);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        try {
            this.zzcct.zza("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzaky.zzb("Error occured while dispatching default position.", e);
        }
    }
}

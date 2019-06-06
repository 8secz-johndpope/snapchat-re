package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzbt;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.samsung.android.sdk.camera.SCamera;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzabh
public final class zzok {
    private Context mContext = null;
    private String zzavp = null;
    private boolean zzbwc;
    private String zzbwd;
    private Map<String, String> zzbwe;

    public zzok(Context context, String str) {
        this.mContext = context;
        this.zzavp = str;
        this.zzbwc = ((Boolean) zzlc.zzio().zzd(zzoi.zzbne)).booleanValue();
        this.zzbwd = (String) zzlc.zzio().zzd(zzoi.zzbnf);
        this.zzbwe = new LinkedHashMap();
        this.zzbwe.put("s", "gmob_sdk");
        this.zzbwe.put("v", "3");
        this.zzbwe.put("os", VERSION.RELEASE);
        this.zzbwe.put("sdk", VERSION.SDK);
        Map map = this.zzbwe;
        zzbt.zzel();
        map.put(MapboxNavigationEvent.KEY_DEVICE, zzaij.zzrd());
        this.zzbwe.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        map = this.zzbwe;
        zzbt.zzel();
        map.put("is_lite_sdk", zzaij.zzas(context) ? SCamera.CAMERA_ID_FRONT : "0");
        Future zzo = zzbt.zzew().zzo(this.mContext);
        try {
            zzo.get();
            this.zzbwe.put("network_coarse", Integer.toString(((zzaea) zzo.get()).zzcyo));
            this.zzbwe.put("network_fine", Integer.toString(((zzaea) zzo.get()).zzcyp));
        } catch (Exception e) {
            zzbt.zzep().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* Access modifiers changed, original: final */
    public final Context getContext() {
        return this.mContext;
    }

    /* Access modifiers changed, original: final */
    public final String zzfw() {
        return this.zzavp;
    }

    /* Access modifiers changed, original: final */
    public final boolean zzjh() {
        return this.zzbwc;
    }

    /* Access modifiers changed, original: final */
    public final String zzji() {
        return this.zzbwd;
    }

    /* Access modifiers changed, original: final */
    public final Map<String, String> zzjj() {
        return this.zzbwe;
    }
}

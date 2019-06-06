package com.google.android.gms.ads.internal.js;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzako;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzaqa;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzlc;
import java.util.Map;
import org.json.JSONObject;

@zzabh
public final class zze implements zzc {
    private final Context mContext;
    private final zzaof zzcct;

    public zze(Context context, zzala zzala, zzcv zzcv, zzv zzv) {
        Context context2 = context;
        this.mContext = context2;
        this.zzcct = zzbt.zzem().zza(context2, zzaqa.zzvj(), "", false, false, zzcv, zzala, null, null, null, zziu.zzhp());
        this.zzcct.getView().setWillNotDraw(true);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzlc.zzij();
        if (zzako.zzsa()) {
            runnable.run();
        } else {
            zzaij.zzdfn.post(runnable);
        }
    }

    public final void destroy() {
        this.zzcct.destroy();
    }

    public final void zza(zzd zzd) {
        this.zzcct.zzua().zza(new zzk(this, zzd));
    }

    public final void zza(String str, zzt<? super zzaj> zzt) {
        this.zzcct.zzua().zza(str, new zzl(this, zzt));
    }

    public final void zza(String str, Map<String, ?> map) {
        this.zzcct.zza(str, (Map) map);
    }

    public final void zza(String str, JSONObject jSONObject) {
        this.zzcct.zza(str, jSONObject);
    }

    public final void zzb(String str, zzt<? super zzaj> zzt) {
        this.zzcct.zzua().zza(str, new zzf(zzt));
    }

    public final void zzb(String str, JSONObject jSONObject) {
        runOnUiThread(new zzg(this, str, jSONObject));
    }

    public final void zzbb(String str) {
        runOnUiThread(new zzh(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void zzbc(String str) {
        runOnUiThread(new zzj(this, str));
    }

    public final void zzbd(String str) {
        runOnUiThread(new zzi(this, str));
    }

    public final zzak zzly() {
        return new zzal(this);
    }
}

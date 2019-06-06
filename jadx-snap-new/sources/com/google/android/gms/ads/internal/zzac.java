package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzalg;
import com.google.android.gms.internal.zzali;
import com.google.android.gms.internal.zzalt;
import com.google.android.gms.internal.zzaly;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzvb;
import com.google.android.gms.internal.zzvc;
import com.google.android.gms.internal.zzvf;
import org.json.JSONObject;

@zzabh
public final class zzac {
    private Context mContext;
    private final Object mLock = new Object();
    private long zzaox = 0;

    public final void zza(Context context, zzala zzala, String str, Runnable runnable) {
        zza(context, zzala, true, null, str, null, runnable);
    }

    /* Access modifiers changed, original: final */
    public final void zza(Context context, zzala zzala, boolean z, zzahh zzahh, String str, String str2, Runnable runnable) {
        if (zzbt.zzes().elapsedRealtime() - this.zzaox < 5000) {
            zzaky.zzcz("Not retrying to fetch app settings");
            return;
        }
        this.zzaox = zzbt.zzes().elapsedRealtime();
        Object obj = 1;
        if (zzahh != null) {
            if ((zzbt.zzes().currentTimeMillis() - zzahh.zzpq() > ((Long) zzlc.zzio().zzd(zzoi.zzbtk)).longValue() ? 1 : null) == null && zzahh.zzpr()) {
                obj = null;
            }
        }
        if (obj != null) {
            if (context == null) {
                zzaky.zzcz("Context not provided to fetch application settings");
            } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                zzaky.zzcz("App settings could not be fetched. Required parameters missing");
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.mContext = applicationContext;
                zzvf zzb = zzbt.zzez().zzb(this.mContext, zzala);
                zzvb zzvb = zzvc.zzcgm;
                zzux zza = zzb.zza("google.afma.config.fetchAppSettings", zzvb, zzvb);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    zzalt zzf = zza.zzf(jSONObject);
                    zzalt zza2 = zzali.zza(zzf, zzad.zzaoy, zzaly.zzdju);
                    if (runnable != null) {
                        zzf.zza(runnable, zzaly.zzdju);
                    }
                    zzalg.zza(zza2, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    zzaky.zzb("Error requesting application settings", e);
                }
            }
        }
    }
}

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.gmsg.zzz;
import com.google.android.gms.ads.internal.js.JavascriptEngineFactory;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.ads.internal.zzbb;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzw;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzabh
public final class zzaar extends zzzw<zzaar> {
    private static final Object sLock = new Object();
    private static final long zzcqj = TimeUnit.SECONDS.toMillis(60);
    private static boolean zzcqk = false;
    private static zzn zzcql = null;
    private final Context mContext;
    private final Object mLock = new Object();
    private final zzala zzarg;
    private String zzarn;
    private final zzcv zzbyz;
    private final zzbb zzcpw;
    private JavascriptEngineFactory zzcqh;
    private zzalt<zzaof> zzcqi;
    private final zzz zzcqm;
    private final zzqa zzcqn;

    public zzaar(Context context, zzbb zzbb, String str, zzcv zzcv, zzala zzala) {
        zzaky.zzcy("Webview loading for native ads.");
        this.mContext = context;
        this.zzcpw = zzbb;
        this.zzbyz = zzcv;
        this.zzarg = zzala;
        this.zzarn = str;
        this.zzcqh = new JavascriptEngineFactory();
        zzbt.zzem();
        zzalt zza = zzaol.zza(this.mContext, this.zzarg, (String) zzlc.zzio().zzd(zzoi.zzbsi), this.zzbyz, this.zzcpw.zzbo());
        this.zzcqm = new zzz(this.mContext);
        this.zzcqn = new zzqa(zzbb, str);
        this.zzcqi = zzali.zza(zza, new zzaas(this), zzaly.zzdju);
        zzalg.zza(this.zzcqi, "WebViewNativeAdsUtil.constructor");
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void zza(zzaof zzaof, zzzx zzzx, zzamd zzamd, zzaof zzaof2, Map map) {
        String str = "success";
        try {
            JSONObject jSONObject;
            boolean z;
            String str2 = (String) map.get(str);
            String str3 = (String) map.get("failure");
            if (TextUtils.isEmpty(str3)) {
                jSONObject = new JSONObject(str2);
                z = true;
            } else {
                jSONObject = new JSONObject(str3);
                z = false;
            }
            if (this.zzarn.equals(jSONObject.optString("ads_id", ""))) {
                zzaof.zzb("/nativeAdPreProcess", zzzx.zzcov);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str, z);
                jSONObject2.put("json", jSONObject);
                zzamd.set(jSONObject2);
            }
        } catch (Throwable th) {
            zzaky.zzb("Error while preprocessing json.", th);
            zzamd.setException(th);
        }
    }

    public final void zza(String str, zzt zzt) {
        zzali.zza(this.zzcqi, new zzaax(this, str, zzt), zzaly.zzdjt);
    }

    public final void zza(String str, JSONObject jSONObject) {
        zzali.zza(this.zzcqi, new zzaaz(this, str, jSONObject), zzaly.zzdjt);
    }

    public final void zzb(String str, zzt zzt) {
        zzali.zza(this.zzcqi, new zzaay(this, str, zzt), zzaly.zzdjt);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ zzalt zzc(JSONObject jSONObject, zzaof zzaof) {
        jSONObject.put("ads_id", this.zzarn);
        zzamd zzamd = new zzamd();
        zzzx zzzx = new zzzx();
        zzt zzaaw = new zzaaw(this, zzaof, zzzx, zzamd);
        zzzx.zzcov = zzaaw;
        zzaof.zza("/nativeAdPreProcess", zzaaw);
        zzaof.zzb("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return zzamd;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ zzalt zzg(zzaof zzaof) {
        zzaky.zzcy("Javascript has loaded for native ads.");
        zzapu zzua = zzaof.zzua();
        zzbb zzbb = this.zzcpw;
        zzua.zza(zzbb, zzbb, zzbb, zzbb, false, null, new zzw(this.mContext, null, null), null, null);
        String str = "/logScionEvent";
        zzaof.zzua().zza(str, this.zzcqm);
        zzaof.zzua().zza(str, this.zzcqn);
        return zzali.zzh(zzaof);
    }

    public final zzalt<JSONObject> zzh(JSONObject jSONObject) {
        return zzali.zza(this.zzcqi, new zzaat(this, jSONObject), zzaly.zzdjt);
    }

    public final zzalt<JSONObject> zzi(JSONObject jSONObject) {
        return zzali.zza(this.zzcqi, new zzaau(this, jSONObject), zzaly.zzdjt);
    }

    public final zzalt<JSONObject> zzj(JSONObject jSONObject) {
        return zzali.zza(this.zzcqi, new zzaav(this, jSONObject), zzaly.zzdjt);
    }

    public final void zzmd() {
        zzali.zza(this.zzcqi, new zzaba(this), zzaly.zzdjt);
    }
}

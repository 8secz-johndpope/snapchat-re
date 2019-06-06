package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.zzbq;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzaer extends zzd implements zzafs {
    private static zzaer zzczu;
    private boolean zzaqf;
    private zzagt zzaqg;
    private boolean zzczv;
    private final zzaeo zzczw = new zzaeo(this.zzanm, this.zzanu, this, this);

    public zzaer(Context context, zzv zzv, zzko zzko, zzwf zzwf, zzala zzala) {
        super(context, zzko, null, zzwf, zzala, zzv);
        zzczu = this;
        this.zzaqg = new zzagt(context, null);
    }

    private static zzahe zzc(zzahe zzahe) {
        zzahe zzahe2 = zzahe;
        zzahw.v("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            zzads.zzb(zzahe2.zzdcw).remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzahe2.zzcvm.zzatx);
            String jSONObject2 = jSONObject.toString();
            zzvq zzvq = new zzvq(Arrays.asList(new zzvp[]{new zzvp(zzads.zzb(zzahe2.zzdcw).toString(), null, Arrays.asList(new String[]{"com.google.ads.mediation.admob.AdMobAdapter"}), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1)}), ((Long) zzlc.zzio().zzd(zzoi.zzbrg)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1, 0, 1, null, 0, -1, -1, false);
            return new zzahe(zzahe2.zzcvm, zzahe2.zzdcw, zzvq, zzahe2.zzaud, zzahe2.errorCode, zzahe2.zzdcn, zzahe2.zzdco, zzahe2.zzdch, zzahe2.zzdcu, null);
        } catch (JSONException e) {
            zzaky.zzb("Unable to generate ad state for non-mediated rewarded video.", e);
            return new zzahe(zzahe2.zzcvm, zzahe2.zzdcw, null, zzahe2.zzaud, 0, zzahe2.zzdcn, zzahe2.zzdco, zzahe2.zzdch, zzahe2.zzdcu, null);
        }
    }

    public static zzaer zzou() {
        return zzczu;
    }

    public final void destroy() {
        this.zzczw.destroy();
    }

    public final boolean isLoaded() {
        zzbq.zzgn("isLoaded must be called on the main UI thread.");
        return this.zzanm.zzaub == null && this.zzanm.zzauc == null && this.zzanm.zzaue != null;
    }

    public final void onContextChanged(Context context) {
        this.zzczw.onContextChanged(context);
    }

    public final void onRewardedVideoAdClosed() {
        if (zzbt.zzfh().zzu(this.zzanm.zzaiq)) {
            this.zzaqg.zzw(false);
        }
        zzbt();
    }

    public final void onRewardedVideoAdLeftApplication() {
        zzbu();
    }

    public final void onRewardedVideoAdOpened() {
        if (zzbt.zzfh().zzu(this.zzanm.zzaiq)) {
            this.zzaqg.zzw(true);
        }
        zza(this.zzanm.zzaue, false);
        zzbv();
    }

    public final void onRewardedVideoCompleted() {
        this.zzczw.zzot();
        zzca();
    }

    public final void onRewardedVideoStarted() {
        this.zzczw.zzos();
        zzbz();
    }

    public final void pause() {
        this.zzczw.pause();
    }

    public final void resume() {
        this.zzczw.resume();
    }

    public final void setImmersiveMode(boolean z) {
        zzbq.zzgn("setImmersiveMode must be called on the main UI thread.");
        this.zzaqf = z;
    }

    public final void zza(zzafi zzafi) {
        zzbq.zzgn("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzafi.zzatx)) {
            zzaky.zzcz("Invalid ad unit id. Aborting.");
            zzaij.zzdfn.post(new zzaes(this));
            return;
        }
        this.zzczv = false;
        this.zzanm.zzatx = zzafi.zzatx;
        this.zzaqg.setAdUnitId(zzafi.zzatx);
        super.zzb(zzafi.zzcrv);
    }

    public final void zza(zzahe zzahe, zzov zzov) {
        if (zzahe.errorCode != -2) {
            zzaij.zzdfn.post(new zzaet(this, zzahe));
            return;
        }
        this.zzanm.zzauf = zzahe;
        if (zzahe.zzdcj == null) {
            this.zzanm.zzauf = zzc(zzahe);
        }
        this.zzczw.zzor();
    }

    public final boolean zza(zzahd zzahd, zzahd zzahd2) {
        return zzaeo.zza(zzahd, zzahd2);
    }

    public final boolean zza(zzkk zzkk, zzahd zzahd, boolean z) {
        return false;
    }

    public final zzafy zzbq(String str) {
        return this.zzczw.zzbq(str);
    }

    public final void zzbt() {
        this.zzanm.zzaue = null;
        super.zzbt();
    }

    public final void zzc(zzagd zzagd) {
        zzagd = this.zzczw.zzd(zzagd);
        if (zzbt.zzfh().zzu(this.zzanm.zzaiq) && zzagd != null) {
            zzbt.zzfh().zza(this.zzanm.zzaiq, zzbt.zzfh().zzz(this.zzanm.zzaiq), this.zzanm.zzatx, zzagd.type, zzagd.zzdax);
        }
        zza(zzagd);
    }

    public final void zzdn() {
        onAdClicked();
    }

    public final void zzov() {
        zzbq.zzgn("showAd must be called on the main UI thread.");
        if (isLoaded()) {
            this.zzczw.zzv(this.zzaqf);
        } else {
            zzaky.zzcz("The reward video has not loaded.");
        }
    }
}

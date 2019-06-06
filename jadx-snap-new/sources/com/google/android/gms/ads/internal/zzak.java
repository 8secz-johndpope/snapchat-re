package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.gmsg.zzaf;
import com.google.android.gms.ads.internal.gmsg.zzag;
import com.google.android.gms.ads.internal.gmsg.zzx;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzacj;
import com.google.android.gms.internal.zzads;
import com.google.android.gms.internal.zzaeo;
import com.google.android.gms.internal.zzagd;
import com.google.android.gms.internal.zzagq;
import com.google.android.gms.internal.zzagt;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzaip;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzaof;
import com.google.android.gms.internal.zzapu;
import com.google.android.gms.internal.zzaqa;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzvp;
import com.google.android.gms.internal.zzvq;
import com.google.android.gms.internal.zzwf;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzak extends zzi implements zzag, zzx {
    private transient boolean zzaqb;
    private int zzaqc = -1;
    private boolean zzaqd;
    private float zzaqe;
    private boolean zzaqf;
    private zzagt zzaqg;
    private String zzaqh;
    private final String zzaqi;
    private final zzaeo zzaqj;

    public zzak(Context context, zzko zzko, String str, zzwf zzwf, zzala zzala, zzv zzv) {
        super(context, zzko, str, zzwf, zzala, zzv);
        boolean z = false;
        this.zzaqb = false;
        if (zzko != null) {
            if ("reward_mb".equals(zzko.zzbia)) {
                z = true;
            }
        }
        this.zzaqi = z ? "/Rewarded" : "/Interstitial";
        this.zzaqj = z ? new zzaeo(this.zzanm, this.zzanu, new zzam(this), this) : null;
    }

    private final void zza(Bundle bundle) {
        zzbt.zzel().zzb(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, "gmob-apps", bundle, false);
    }

    private static zzahe zzb(zzahe zzahe) {
        zzahe zzahe2 = zzahe;
        try {
            String jSONObject = zzads.zzb(zzahe2.zzdcw).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzahe2.zzcvm.zzatx);
            zzvp zzvp = new zzvp(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1);
            zzacj zzacj = zzahe2.zzdcw;
            zzvq zzvq = new zzvq(Collections.singletonList(zzvp), ((Long) zzlc.zzio().zzd(zzoi.zzbrg)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzacj.zzchz, zzacj.zzcia, "", -1, 0, 1, null, 0, -1, -1, false);
            return new zzahe(zzahe2.zzcvm, new zzacj(zzahe2.zzcvm, zzacj.zzcno, zzacj.body, Collections.emptyList(), Collections.emptyList(), zzacj.zzctn, true, zzacj.zzctp, Collections.emptyList(), zzacj.zzcic, zzacj.orientation, zzacj.zzctr, zzacj.zzcts, zzacj.zzctt, zzacj.zzctu, zzacj.zzctv, null, zzacj.zzctx, zzacj.zzbid, zzacj.zzcsd, zzacj.zzcty, zzacj.zzctz, zzacj.zzbdl, zzacj.zzbie, zzacj.zzbif, null, Collections.emptyList(), Collections.emptyList(), zzacj.zzcuf, zzacj.zzcug, zzacj.zzcsr, zzacj.zzcss, zzacj.zzchz, zzacj.zzcia, zzacj.zzcuh, null, zzacj.zzcuj, zzacj.zzcuk, zzacj.zzctd, zzacj.zzaqw, 0), zzvq, zzahe2.zzaud, zzahe2.errorCode, zzahe2.zzdcn, zzahe2.zzdco, null, zzahe2.zzdcu, null);
        } catch (JSONException e) {
            zzaky.zzb("Unable to generate ad state for an interstitial ad with pooling.", e);
            return zzahe2;
        }
    }

    private final boolean zzd(boolean z) {
        return this.zzaqj != null && z;
    }

    public final void setImmersiveMode(boolean z) {
        zzbq.zzgn("setImmersiveMode must be called on the main UI thread.");
        this.zzaqf = z;
    }

    public final void showInterstitial() {
        zzbq.zzgn("showInterstitial must be called on the main UI thread.");
        boolean z = this.zzanm.zzaue != null && this.zzanm.zzaue.zzcto;
        if (zzd(z)) {
            this.zzaqj.zzv(this.zzaqf);
            return;
        }
        String valueOf;
        if (zzbt.zzfh().zzt(this.zzanm.zzaiq)) {
            this.zzaqh = zzbt.zzfh().zzw(this.zzanm.zzaiq);
            valueOf = String.valueOf(this.zzaqh);
            String valueOf2 = String.valueOf(this.zzaqi);
            this.zzaqh = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.zzanm.zzaue == null) {
            zzaky.zzcz("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbqq)).booleanValue()) {
            Bundle bundle;
            valueOf = (this.zzanm.zzaiq.getApplicationContext() != null ? this.zzanm.zzaiq.getApplicationContext() : this.zzanm.zzaiq).getPackageName();
            String str = "action";
            String str2 = "appid";
            if (!this.zzaqb) {
                zzaky.zzcz("It is not recommended to show an interstitial before onAdLoaded completes.");
                bundle = new Bundle();
                bundle.putString(str2, valueOf);
                bundle.putString(str, "show_interstitial_before_load_finish");
                zza(bundle);
            }
            zzbt.zzel();
            if (!zzaij.zzan(this.zzanm.zzaiq)) {
                zzaky.zzcz("It is not recommended to show an interstitial when app is not in foreground.");
                bundle = new Bundle();
                bundle.putString(str2, valueOf);
                bundle.putString(str, "show_interstitial_app_not_in_foreground");
                zza(bundle);
            }
        }
        if (!this.zzanm.zzfp()) {
            if (this.zzanm.zzaue.zzcto && this.zzanm.zzaue.zzcjf != null) {
                try {
                    if (((Boolean) zzlc.zzio().zzd(zzoi.zzbpl)).booleanValue()) {
                        this.zzanm.zzaue.zzcjf.setImmersiveMode(this.zzaqf);
                    }
                    this.zzanm.zzaue.zzcjf.showInterstitial();
                } catch (RemoteException e) {
                    zzaky.zzc("Could not show interstitial.", e);
                    zzdk();
                }
            } else if (this.zzanm.zzaue.zzcnm == null) {
                zzaky.zzcz("The interstitial failed to load.");
            } else if (this.zzanm.zzaue.zzcnm.zzud()) {
                zzaky.zzcz("The interstitial is already showing.");
            } else {
                Bitmap zzao;
                this.zzanm.zzaue.zzcnm.zzah(true);
                this.zzanm.zzi(this.zzanm.zzaue.zzcnm.getView());
                if (this.zzanm.zzaue.zzdch != null) {
                    this.zzano.zza(this.zzanm.zzaud, this.zzanm.zzaue);
                }
                zzahd zzahd = this.zzanm.zzaue;
                if (zzahd.zzfz()) {
                    new zzgr(this.zzanm.zzaiq, zzahd.zzcnm.getView()).zza(zzahd.zzcnm);
                } else {
                    zzahd.zzcnm.zzua().zza(new zzal(this, zzahd));
                }
                if (this.zzanm.zzaqp) {
                    zzbt.zzel();
                    zzao = zzaij.zzao(this.zzanm.zzaiq);
                } else {
                    zzao = null;
                }
                this.zzaqc = zzbt.zzfe().zzb(zzao);
                if (!((Boolean) zzlc.zzio().zzd(zzoi.zzbrz)).booleanValue() || zzao == null) {
                    zzap zzap = new zzap(this.zzanm.zzaqp, zzdj(), false, MapboxConstants.MINIMUM_ZOOM, -1, this.zzaqf, this.zzanm.zzaue.zzaqw);
                    int requestedOrientation = this.zzanm.zzaue.zzcnm.getRequestedOrientation();
                    if (requestedOrientation == -1) {
                        requestedOrientation = this.zzanm.zzaue.orientation;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.zzanm.zzaue.zzcnm, requestedOrientation, this.zzanm.zzatz, this.zzanm.zzaue.zzctt, zzap);
                    zzbt.zzej();
                    zzl.zza(this.zzanm.zzaiq, adOverlayInfoParcel, true);
                    return;
                }
                new zzan(this, this.zzaqc).zzqj();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final zzaof zza(zzahe zzahe, zzw zzw, zzagq zzagq) {
        zzaof zza = zzbt.zzem().zza(this.zzanm.zzaiq, zzaqa.zzc(this.zzanm.zzaud), this.zzanm.zzaud.zzbia, false, false, this.zzanm.zzaty, this.zzanm.zzatz, this.zzanh, this, this.zzanp, zzahe.zzdcu);
        zza.zzua().zza(this, null, this, this, ((Boolean) zzlc.zzio().zzd(zzoi.zzbob)).booleanValue(), this, zzw, null, zzagq);
        zza(zza);
        zza.zzde(zzahe.zzcvm.zzcsi);
        zza.zzua().zza("/reward", new zzaf(this));
        return zza;
    }

    public final void zza(zzahe zzahe, zzov zzov) {
        if (zzahe.errorCode != -2) {
            super.zza(zzahe, zzov);
            return;
        }
        if (zzd(zzahe.zzdcj != null)) {
            this.zzaqj.zzor();
            return;
        }
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbpr)).booleanValue()) {
            int i = zzahe.zzdcw.zzcto ^ 1;
            if (zza.zza(zzahe.zzcvm.zzcrv) && i != 0) {
                this.zzanm.zzauf = zzb(zzahe);
            }
            super.zza(this.zzanm.zzauf, zzov);
            return;
        }
        super.zza(zzahe, zzov);
    }

    public final void zza(boolean z, float f) {
        this.zzaqd = z;
        this.zzaqe = f;
    }

    public final boolean zza(zzahd zzahd, zzahd zzahd2) {
        if (zzd(zzahd2.zzcto)) {
            return zzaeo.zza(zzahd, zzahd2);
        }
        if (!super.zza(zzahd, zzahd2)) {
            return false;
        }
        if (!(this.zzanm.zzfo() || this.zzanm.zzava == null || zzahd2.zzdch == null)) {
            this.zzano.zza(this.zzanm.zzaud, zzahd2, this.zzanm.zzava);
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zza(zzkk zzkk, zzahd zzahd, boolean z) {
        if (this.zzanm.zzfo() && zzahd.zzcnm != null) {
            zzbt.zzen();
            zzaip.zzh(zzahd.zzcnm);
        }
        return this.zzanl.zzea();
    }

    public final boolean zza(zzkk zzkk, zzov zzov) {
        if (this.zzanm.zzaue != null) {
            zzaky.zzcz("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.zzaqg == null && zza.zza(zzkk) && zzbt.zzfh().zzt(this.zzanm.zzaiq) && !TextUtils.isEmpty(this.zzanm.zzatx)) {
            this.zzaqg = new zzagt(this.zzanm.zzaiq, this.zzanm.zzatx);
        }
        return super.zza(zzkk, zzov);
    }

    public final void zzb(zzagd zzagd) {
        boolean z = this.zzanm.zzaue != null && this.zzanm.zzaue.zzcto;
        if (zzd(z)) {
            zza(this.zzaqj.zzd(zzagd));
            return;
        }
        if (this.zzanm.zzaue != null) {
            if (this.zzanm.zzaue.zzcue != null) {
                zzbt.zzel();
                zzaij.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, this.zzanm.zzaue.zzcue);
            }
            if (this.zzanm.zzaue.zzcuc != null) {
                zzagd = this.zzanm.zzaue.zzcuc;
            }
        }
        zza(zzagd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbt() {
        zzdk();
        super.zzbt();
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbw() {
        super.zzbw();
        this.zzaqb = true;
    }

    public final void zzcf() {
        super.zzcf();
        this.zzano.zzh(this.zzanm.zzaue);
        zzagt zzagt = this.zzaqg;
        if (zzagt != null) {
            zzagt.zzw(false);
        }
    }

    public final void zzcg() {
        recordImpression();
        super.zzcg();
        if (!(this.zzanm.zzaue == null || this.zzanm.zzaue.zzcnm == null)) {
            zzapu zzua = this.zzanm.zzaue.zzcnm.zzua();
            if (zzua != null) {
                zzua.zzut();
            }
        }
        if (!(!zzbt.zzfh().zzt(this.zzanm.zzaiq) || this.zzanm.zzaue == null || this.zzanm.zzaue.zzcnm == null)) {
            zzbt.zzfh().zzd(this.zzanm.zzaue.zzcnm.getContext(), this.zzaqh);
        }
        zzagt zzagt = this.zzaqg;
        if (zzagt != null) {
            zzagt.zzw(true);
        }
    }

    public final void zzda() {
        zzd zztw = this.zzanm.zzaue.zzcnm.zztw();
        if (zztw != null) {
            zztw.close();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean zzdj() {
        if (!(this.zzanm.zzaiq instanceof Activity)) {
            return false;
        }
        Window window = ((Activity) this.zzanm.zzaiq).getWindow();
        if (!(window == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (!(rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top)) {
                return true;
            }
        }
        return false;
    }

    public final void zzdk() {
        zzbt.zzfe().zzb(Integer.valueOf(this.zzaqc));
        if (this.zzanm.zzfo()) {
            this.zzanm.zzfm();
            this.zzanm.zzaue = null;
            this.zzanm.zzaqp = false;
            this.zzaqb = false;
        }
    }

    public final void zzdl() {
        boolean z = this.zzanm.zzaue != null && this.zzanm.zzaue.zzcto;
        if (zzd(z)) {
            this.zzaqj.zzos();
            zzbz();
            return;
        }
        if (!(this.zzanm.zzaue == null || this.zzanm.zzaue.zzdcm == null)) {
            zzbt.zzel();
            zzaij.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, this.zzanm.zzaue.zzdcm);
        }
        zzbz();
    }

    public final void zzdm() {
        boolean z = this.zzanm.zzaue != null && this.zzanm.zzaue.zzcto;
        if (zzd(z)) {
            this.zzaqj.zzot();
        }
        zzca();
    }

    public final void zze(boolean z) {
        this.zzanm.zzaqp = z;
    }
}

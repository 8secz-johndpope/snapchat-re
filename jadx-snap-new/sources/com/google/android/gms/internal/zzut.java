package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzak;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;

@zzabh
public final class zzut extends zzlu {
    private final String zzapp;
    private boolean zzaqf;
    private final zztk zzceb;
    private zzak zzceg;
    private final zzul zzcet;

    public zzut(Context context, String str, zzwf zzwf, zzala zzala, zzv zzv) {
        this(str, new zztk(context, zzwf, zzala, zzv));
    }

    private zzut(String str, zztk zztk) {
        this.zzapp = str;
        this.zzceb = zztk;
        this.zzcet = new zzul();
        zzbt.zzey().zza(zztk);
    }

    private final void abort() {
        if (this.zzceg == null) {
            this.zzceg = this.zzceb.zzav(this.zzapp);
            this.zzcet.zzd(this.zzceg);
        }
    }

    public final void destroy() {
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.destroy();
        }
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String getMediationAdapterClassName() {
        zzak zzak = this.zzceg;
        return zzak != null ? zzak.getMediationAdapterClassName() : null;
    }

    public final zzmm getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final boolean isLoading() {
        zzak zzak = this.zzceg;
        return zzak != null && zzak.isLoading();
    }

    public final boolean isReady() {
        zzak zzak = this.zzceg;
        return zzak != null && zzak.isReady();
    }

    public final void pause() {
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.pause();
        }
    }

    public final void resume() {
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.resume();
        }
    }

    public final void setImmersiveMode(boolean z) {
        this.zzaqf = z;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        abort();
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.setManualImpressionsEnabled(z);
        }
    }

    public final void setUserId(String str) {
    }

    public final void showInterstitial() {
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.setImmersiveMode(this.zzaqf);
            this.zzceg.showInterstitial();
            return;
        }
        zzaky.zzcz("Interstitial ad must be loaded before showInterstitial().");
    }

    public final void stopLoading() {
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.stopLoading();
        }
    }

    public final void zza(zzafc zzafc) {
        zzul zzul = this.zzcet;
        zzul.zzcdw = zzafc;
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzul.zzd(zzak);
        }
    }

    public final void zza(zzko zzko) {
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.zza(zzko);
        }
    }

    public final void zza(zzlf zzlf) {
        zzul zzul = this.zzcet;
        zzul.zzcdv = zzlf;
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzul.zzd(zzak);
        }
    }

    public final void zza(zzli zzli) {
        zzul zzul = this.zzcet;
        zzul.zzapd = zzli;
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzul.zzd(zzak);
        }
    }

    public final void zza(zzly zzly) {
        zzul zzul = this.zzcet;
        zzul.zzcdt = zzly;
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzul.zzd(zzak);
        }
    }

    public final void zza(zzme zzme) {
        abort();
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.zza(zzme);
        }
    }

    public final void zza(zzms zzms) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzns zzns) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    public final void zza(zzpb zzpb) {
        zzul zzul = this.zzcet;
        zzul.zzcdu = zzpb;
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzul.zzd(zzak);
        }
    }

    public final void zza(zzyx zzyx) {
        zzaky.zzcz("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzzd zzzd, String str) {
        zzaky.zzcz("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final boolean zzb(zzkk zzkk) {
        if (!zzuo.zzh(zzkk).contains("gw")) {
            abort();
        }
        if (zzuo.zzh(zzkk).contains("_skipMediation")) {
            abort();
        }
        if (zzkk.zzbhc != null) {
            abort();
        }
        zzak zzak = this.zzceg;
        if (zzak != null) {
            return zzak.zzb(zzkk);
        }
        zzuo zzey = zzbt.zzey();
        if (zzuo.zzh(zzkk).contains("_ad")) {
            zzey.zzb(zzkk, this.zzapp);
        }
        zzur zza = zzey.zza(zzkk, this.zzapp);
        if (zza != null) {
            if (zza.zzcek) {
                zzus.zzln().zzlq();
            } else {
                zza.load();
                zzus.zzln().zzlr();
            }
            this.zzceg = zza.zzceg;
            zza.zzcei.zza(this.zzcet);
            this.zzcet.zzd(this.zzceg);
            return zza.zzcel;
        }
        abort();
        zzus.zzln().zzlr();
        return this.zzceg.zzb(zzkk);
    }

    public final IObjectWrapper zzbp() {
        zzak zzak = this.zzceg;
        return zzak != null ? zzak.zzbp() : null;
    }

    public final zzko zzbq() {
        zzak zzak = this.zzceg;
        return zzak != null ? zzak.zzbq() : null;
    }

    public final void zzbs() {
        zzak zzak = this.zzceg;
        if (zzak != null) {
            zzak.zzbs();
        } else {
            zzaky.zzcz("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    public final zzly zzcc() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzli zzcd() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final String zzco() {
        zzak zzak = this.zzceg;
        return zzak != null ? zzak.zzco() : null;
    }
}

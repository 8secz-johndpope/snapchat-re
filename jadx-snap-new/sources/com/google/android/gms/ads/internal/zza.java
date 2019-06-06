package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.overlay.zzt;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzabj;
import com.google.android.gms.internal.zzaep;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzagd;
import com.google.android.gms.internal.zzagx;
import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;
import com.google.android.gms.internal.zzahf;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzahp;
import com.google.android.gms.internal.zzahu;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzako;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaqa;
import com.google.android.gms.internal.zzfu;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkl;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzlf;
import com.google.android.gms.internal.zzli;
import com.google.android.gms.internal.zzlu;
import com.google.android.gms.internal.zzly;
import com.google.android.gms.internal.zzme;
import com.google.android.gms.internal.zzmm;
import com.google.android.gms.internal.zzms;
import com.google.android.gms.internal.zznq;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzov;
import com.google.android.gms.internal.zzpb;
import com.google.android.gms.internal.zzyx;
import com.google.android.gms.internal.zzzd;
import com.google.android.gms.internal.zzzn;
import com.samsung.android.sdk.camera.SCamera;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;

@zzabh
public abstract class zza extends zzlu implements zzb, zzt, zzabj, zzahn, zzkf, zzzn {
    protected zzov zzanh;
    protected zzot zzani;
    private zzot zzanj;
    protected boolean zzank = false;
    protected final zzbj zzanl;
    protected final zzbu zzanm;
    protected transient zzkk zzann;
    protected final zzfu zzano;
    protected final zzv zzanp;

    zza(zzbu zzbu, zzbj zzbj, zzv zzv) {
        this.zzanm = zzbu;
        this.zzanl = new zzbj(this);
        this.zzanp = zzv;
        zzbt.zzel().zzah(this.zzanm.zzaiq);
        zzbt.zzel().zzai(this.zzanm.zzaiq);
        zzahu.zzaf(this.zzanm.zzaiq);
        zzbt.zzfi().initialize(this.zzanm.zzaiq);
        zzbt.zzep().zzd(this.zzanm.zzaiq, this.zzanm.zzatz);
        zzbt.zzer().initialize(this.zzanm.zzaiq);
        this.zzano = zzbt.zzep().zzqa();
        zzbt.zzeo().initialize(this.zzanm.zzaiq);
        zzbt.zzfk().initialize(this.zzanm.zzaiq);
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbsy)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new zzb(this, new CountDownLatch(((Integer) zzlc.zzio().zzd(zzoi.zzbta)).intValue()), timer), 0, ((Long) zzlc.zzio().zzd(zzoi.zzbsz)).longValue());
        }
    }

    protected static boolean zza(zzkk zzkk) {
        Bundle bundle = zzkk.zzbhf.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    private static long zzr(String str) {
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException unused) {
            str = "Invalid index for Url fetch time in CSI latency info.";
            zzaky.zzcz(str);
            return -1;
        } catch (NumberFormatException unused2) {
            str = "Cannot find valid format of Url fetch time in CSI latency info.";
            zzaky.zzcz(str);
            return -1;
        }
    }

    public void destroy() {
        zzbq.zzgn("destroy must be called on the main UI thread.");
        this.zzanl.cancel();
        this.zzano.zzi(this.zzanm.zzaue);
        zzbu zzbu = this.zzanm;
        if (zzbu.zzaua != null) {
            zzbu.zzaua.zzfs();
        }
        zzbu.zzaui = null;
        zzbu.zzauj = null;
        zzbu.zzauv = null;
        zzbu.zzauk = null;
        zzbu.zzg(false);
        if (zzbu.zzaua != null) {
            zzbu.zzaua.removeAllViews();
        }
        zzbu.zzfm();
        zzbu.zzfn();
        zzbu.zzaue = null;
    }

    public String getAdUnitId() {
        return this.zzanm.zzatx;
    }

    public zzmm getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return this.zzank;
    }

    public final boolean isReady() {
        zzbq.zzgn("isLoaded must be called on the main UI thread.");
        return this.zzanm.zzaub == null && this.zzanm.zzauc == null && this.zzanm.zzaue != null;
    }

    public void onAdClicked() {
        if (this.zzanm.zzaue == null) {
            zzaky.zzcz("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzaky.zzby("Pinging click URLs.");
        if (this.zzanm.zzaug != null) {
            this.zzanm.zzaug.zzpl();
        }
        if (this.zzanm.zzaue.zzchw != null) {
            zzbt.zzel();
            zzaij.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, zzc(this.zzanm.zzaue.zzchw));
        }
        if (this.zzanm.zzauh != null) {
            try {
                this.zzanm.zzauh.onAdClicked();
            } catch (RemoteException e) {
                zzaky.zzc("Could not notify onAdClicked event.", e);
            }
        }
    }

    public final void onAppEvent(String str, String str2) {
        if (this.zzanm.zzauj != null) {
            try {
                this.zzanm.zzauj.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzaky.zzc("Could not call the AppEventListener.", e);
            }
        }
    }

    public void pause() {
        zzbq.zzgn("pause must be called on the main UI thread.");
    }

    public void resume() {
        zzbq.zzgn("resume must be called on the main UI thread.");
    }

    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("onImmersiveModeUpdated is not supported for current ad type");
    }

    public void setManualImpressionsEnabled(boolean z) {
        zzaky.zzcz("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public final void setUserId(String str) {
        zzbq.zzgn("setUserId must be called on the main UI thread.");
        this.zzanm.zzaux = str;
    }

    public final void stopLoading() {
        zzbq.zzgn("stopLoading must be called on the main UI thread.");
        this.zzank = false;
        this.zzanm.zzg(true);
    }

    public final void zza(zzafc zzafc) {
        zzbq.zzgn("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzanm.zzauw = zzafc;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zza(zzagd zzagd) {
        if (this.zzanm.zzauw != null) {
            try {
                String str = "";
                int i = 1;
                if (zzagd != null) {
                    str = zzagd.type;
                    i = zzagd.zzdax;
                }
                this.zzanm.zzauw.zza(new zzaep(str, i));
            } catch (RemoteException e) {
                zzaky.zzc("Could not call RewardedVideoAdListener.onRewarded().", e);
            }
        }
    }

    public final void zza(zzahe zzahe) {
        if (!(zzahe.zzdcw.zzcts == -1 || TextUtils.isEmpty(zzahe.zzdcw.zzcub))) {
            long zzr = zzr(zzahe.zzdcw.zzcub);
            if (zzr != -1) {
                this.zzanh.zza(this.zzanh.zzd(zzahe.zzdcw.zzcts + zzr), "stc");
            }
        }
        this.zzanh.zzao(zzahe.zzdcw.zzcub);
        this.zzanh.zza(this.zzani, "arf");
        this.zzanj = this.zzanh.zzjo();
        this.zzanh.zzf("gqi", zzahe.zzdcw.zzbdl);
        zzbu zzbu = this.zzanm;
        zzbu.zzaub = null;
        zzbu.zzauf = zzahe;
        zzahe.zzdcu.zza(new zzc(this, zzahe));
        zzahe.zzdcu.zza(com.google.android.gms.internal.zziw.zza.zzb.AD_LOADED);
        zza(zzahe, this.zzanh);
    }

    public abstract void zza(zzahe zzahe, zzov zzov);

    public final void zza(zzko zzko) {
        zzbq.zzgn("setAdSize must be called on the main UI thread.");
        zzbu zzbu = this.zzanm;
        zzbu.zzaud = zzko;
        if (!(zzbu.zzaue == null || this.zzanm.zzaue.zzcnm == null || this.zzanm.zzavb != 0)) {
            this.zzanm.zzaue.zzcnm.zza(zzaqa.zzc(zzko));
        }
        if (this.zzanm.zzaua != null) {
            if (this.zzanm.zzaua.getChildCount() > 1) {
                this.zzanm.zzaua.removeView(this.zzanm.zzaua.getNextView());
            }
            this.zzanm.zzaua.setMinimumWidth(zzko.widthPixels);
            this.zzanm.zzaua.setMinimumHeight(zzko.heightPixels);
            this.zzanm.zzaua.requestLayout();
        }
    }

    public final void zza(zzlf zzlf) {
        zzbq.zzgn("setAdListener must be called on the main UI thread.");
        this.zzanm.zzauh = zzlf;
    }

    public final void zza(zzli zzli) {
        zzbq.zzgn("setAdListener must be called on the main UI thread.");
        this.zzanm.zzaui = zzli;
    }

    public final void zza(zzly zzly) {
        zzbq.zzgn("setAppEventListener must be called on the main UI thread.");
        this.zzanm.zzauj = zzly;
    }

    public final void zza(zzme zzme) {
        zzbq.zzgn("setCorrelationIdProvider must be called on the main UI thread");
        this.zzanm.zzauk = zzme;
    }

    public final void zza(zzms zzms) {
        zzbq.zzgn("setIconAdOptions must be called on the main UI thread.");
        this.zzanm.zzaus = zzms;
    }

    public final void zza(zzns zzns) {
        zzbq.zzgn("setVideoOptions must be called on the main UI thread.");
        this.zzanm.zzaur = zzns;
    }

    public final void zza(zzot zzot) {
        String str = "load_ad";
        this.zzanh = new zzov(((Boolean) zzlc.zzio().zzd(zzoi.zzbne)).booleanValue(), str, this.zzanm.zzaud.zzbia);
        this.zzanj = new zzot(-1, null, null);
        if (zzot == null) {
            this.zzani = new zzot(-1, null, null);
        } else {
            this.zzani = new zzot(zzot.getTime(), zzot.zzjl(), zzot.zzjm());
        }
    }

    public void zza(zzpb zzpb) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(zzyx zzyx) {
        zzaky.zzcz("setInAppPurchaseListener is deprecated and should not be called.");
    }

    public final void zza(zzzd zzzd, String str) {
        zzaky.zzcz("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    public final void zza(HashSet<zzahf> hashSet) {
        this.zzanm.zza(hashSet);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean zza(zzahd zzahd) {
        return false;
    }

    public abstract boolean zza(zzahd zzahd, zzahd zzahd2);

    public abstract boolean zza(zzkk zzkk, zzov zzov);

    public void zzb(zzahd zzahd) {
        this.zzanh.zza(this.zzanj, "awr");
        this.zzanm.zzauc = null;
        if (!(zzahd.errorCode == -2 || zzahd.errorCode == 3 || this.zzanm.zzfl() == null)) {
            zzbt.zzeq().zzb(this.zzanm.zzfl());
        }
        if (zzahd.errorCode == -1) {
            this.zzank = false;
            return;
        }
        if (zza(zzahd)) {
            zzaky.zzby("Ad refresh scheduled.");
        }
        if (zzahd.errorCode != -2) {
            zziu zziu;
            com.google.android.gms.internal.zziw.zza.zzb zzb;
            if (zzahd.errorCode == 3) {
                zziu = zzahd.zzdcu;
                zzb = com.google.android.gms.internal.zziw.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                zziu = zzahd.zzdcu;
                zzb = com.google.android.gms.internal.zziw.zza.zzb.AD_FAILED_TO_LOAD;
            }
            zziu.zza(zzb);
            zzi(zzahd.errorCode);
            return;
        }
        zzbu zzbu;
        if (this.zzanm.zzauz == null) {
            zzbu = this.zzanm;
            zzbu.zzauz = new zzahp(zzbu.zzatx);
        }
        if (this.zzanm.zzaua != null) {
            this.zzanm.zzaua.zzfr().zzcs(zzahd.zzcuj);
        }
        this.zzano.zzh(this.zzanm.zzaue);
        if (zza(this.zzanm.zzaue, zzahd)) {
            zzbu = this.zzanm;
            zzbu.zzaue = zzahd;
            if (zzbu.zzaug != null) {
                if (zzbu.zzaue != null) {
                    zzbu.zzaug.zzh(zzbu.zzaue.zzdcn);
                    zzbu.zzaug.zzi(zzbu.zzaue.zzdco);
                    zzbu.zzaug.zzy(zzbu.zzaue.zzcto);
                }
                zzbu.zzaug.zzx(zzbu.zzaud.zzbib);
            }
            zzov zzov = this.zzanh;
            boolean zzfz = this.zzanm.zzaue.zzfz();
            String str = SCamera.CAMERA_ID_FRONT;
            String str2 = "0";
            zzov.zzf("is_mraid", zzfz ? str : str2);
            this.zzanh.zzf("is_mediation", this.zzanm.zzaue.zzcto ? str : str2);
            if (!(this.zzanm.zzaue.zzcnm == null || this.zzanm.zzaue.zzcnm.zzua() == null)) {
                zzov = this.zzanh;
                if (!this.zzanm.zzaue.zzcnm.zzua().zzur()) {
                    str = str2;
                }
                zzov.zzf("is_delay_pl", str);
            }
            this.zzanh.zza(this.zzani, "ttc");
            if (zzbt.zzep().zzpv() != null) {
                zzbt.zzep().zzpv().zza(this.zzanh);
            }
            zzcb();
            if (this.zzanm.zzfo()) {
                zzbw();
            }
        }
        if (zzahd.zzchz != null) {
            zzbt.zzel().zza(this.zzanm.zzaiq, zzahd.zzchz);
        }
    }

    public boolean zzb(zzkk zzkk) {
        zzbq.zzgn("loadAd must be called on the main UI thread.");
        zzbt.zzer().zzhi();
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbpi)).booleanValue()) {
            zzkk = zzkk.zzhz();
            if (((Boolean) zzlc.zzio().zzd(zzoi.zzbpj)).booleanValue()) {
                zzkk.extras.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
            }
        }
        if (zzj.zzcw(this.zzanm.zzaiq) && zzkk.zzbhd != null) {
            zzkk = new zzkl(zzkk).zza(null).zzia();
        }
        if (this.zzanm.zzaub == null && this.zzanm.zzauc == null) {
            String str;
            zzaky.zzcy("Starting ad request.");
            zza(null);
            this.zzani = this.zzanh.zzjo();
            if (zzkk.zzbgy) {
                str = "This request is sent from a test device.";
            } else {
                zzlc.zzij();
                str = zzako.zzaz(this.zzanm.zzaiq);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 71);
                stringBuilder.append("Use AdRequest.Builder.addTestDevice(\"");
                stringBuilder.append(str);
                stringBuilder.append("\") to get test ads on this device.");
                str = stringBuilder.toString();
            }
            zzaky.zzcy(str);
            this.zzanl.zzf(zzkk);
            this.zzank = zza(zzkk, this.zzanh);
            return this.zzank;
        }
        zzaky.zzcz(this.zzann != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
        this.zzann = zzkk;
        return false;
    }

    public final zzv zzbo() {
        return this.zzanp;
    }

    public final IObjectWrapper zzbp() {
        zzbq.zzgn("getAdFrame must be called on the main UI thread.");
        return zzn.zzz(this.zzanm.zzaua);
    }

    public final zzko zzbq() {
        zzbq.zzgn("getAdSize must be called on the main UI thread.");
        return this.zzanm.zzaud == null ? null : new zznq(this.zzanm.zzaud);
    }

    public final void zzbr() {
        zzbu();
    }

    public final void zzbs() {
        zzbq.zzgn("recordManualImpression must be called on the main UI thread.");
        if (this.zzanm.zzaue == null) {
            zzaky.zzcz("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zzaky.zzby("Pinging manual tracking URLs.");
        if (!this.zzanm.zzaue.zzdcs) {
            List arrayList = new ArrayList();
            if (this.zzanm.zzaue.zzctq != null) {
                arrayList.addAll(this.zzanm.zzaue.zzctq);
            }
            if (!(this.zzanm.zzaue.zzcje == null || this.zzanm.zzaue.zzcje.zzchi == null)) {
                arrayList.addAll(this.zzanm.zzaue.zzcje.zzchi);
            }
            if (!arrayList.isEmpty()) {
                zzbt.zzel();
                zzaij.zza(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, arrayList);
                this.zzanm.zzaue.zzdcs = true;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void zzbt() {
        zzaky.zzcy("Ad closing.");
        if (this.zzanm.zzaui != null) {
            try {
                this.zzanm.zzaui.onAdClosed();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdClosed().", e);
            }
        }
        if (this.zzanm.zzauw != null) {
            try {
                this.zzanm.zzauw.onRewardedVideoAdClosed();
            } catch (RemoteException e2) {
                zzaky.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbu() {
        zzaky.zzcy("Ad leaving application.");
        if (this.zzanm.zzaui != null) {
            try {
                this.zzanm.zzaui.onAdLeftApplication();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        if (this.zzanm.zzauw != null) {
            try {
                this.zzanm.zzauw.onRewardedVideoAdLeftApplication();
            } catch (RemoteException e2) {
                zzaky.zzc("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbv() {
        zzaky.zzcy("Ad opening.");
        if (this.zzanm.zzaui != null) {
            try {
                this.zzanm.zzaui.onAdOpened();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdOpened().", e);
            }
        }
        if (this.zzanm.zzauw != null) {
            try {
                this.zzanm.zzauw.onRewardedVideoAdOpened();
            } catch (RemoteException e2) {
                zzaky.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void zzbw() {
        zzc(false);
    }

    public final void zzbx() {
        zzaky.zzcy("Ad impression.");
        if (this.zzanm.zzaui != null) {
            try {
                this.zzanm.zzaui.onAdImpression();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdImpression().", e);
            }
        }
    }

    public final void zzby() {
        zzaky.zzcy("Ad clicked.");
        if (this.zzanm.zzaui != null) {
            try {
                this.zzanm.zzaui.onAdClicked();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdClicked().", e);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzbz() {
        if (this.zzanm.zzauw != null) {
            try {
                this.zzanm.zzauw.onRewardedVideoStarted();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call RewardedVideoAdListener.onVideoStarted().", e);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final List<String> zzc(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String zzb : list) {
            arrayList.add(zzagx.zzb(zzb, this.zzanm.zzaiq));
        }
        return arrayList;
    }

    /* Access modifiers changed, original: protected */
    public void zzc(int i, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("Failed to load ad: ");
        stringBuilder.append(i);
        zzaky.zzcz(stringBuilder.toString());
        this.zzank = z;
        if (this.zzanm.zzaui != null) {
            try {
                this.zzanm.zzaui.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        if (this.zzanm.zzauw != null) {
            try {
                this.zzanm.zzauw.onRewardedVideoAdFailedToLoad(i);
            } catch (RemoteException e2) {
                zzaky.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void zzc(boolean z) {
        zzaky.zzcy("Ad finished loading.");
        this.zzank = z;
        if (this.zzanm.zzaui != null) {
            try {
                this.zzanm.zzaui.onAdLoaded();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call AdListener.onAdLoaded().", e);
            }
        }
        if (this.zzanm.zzauw != null) {
            try {
                this.zzanm.zzauw.onRewardedVideoAdLoaded();
            } catch (RemoteException e2) {
                zzaky.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean zzc(zzkk zzkk) {
        if (this.zzanm.zzaua == null) {
            return false;
        }
        ViewParent parent = this.zzanm.zzaua.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return zzbt.zzel().zza(view, view.getContext());
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzca() {
        if (this.zzanm.zzauw != null) {
            try {
                this.zzanm.zzauw.onRewardedVideoCompleted();
            } catch (RemoteException e) {
                zzaky.zzc("Could not call RewardedVideoAdListener.onRewardedVideoCompleted().", e);
            }
        }
    }

    public final void zzcb() {
        zzahd zzahd = this.zzanm.zzaue;
        if (zzahd != null && !TextUtils.isEmpty(zzahd.zzcuj) && !zzahd.zzdct && zzbt.zzev().zzrr()) {
            zzaky.zzby("Sending troubleshooting signals to the server.");
            zzbt.zzev().zzb(this.zzanm.zzaiq, this.zzanm.zzatz.zzcu, zzahd.zzcuj, this.zzanm.zzatx);
            zzahd.zzdct = true;
        }
    }

    public final zzly zzcc() {
        return this.zzanm.zzauj;
    }

    public final zzli zzcd() {
        return this.zzanm.zzaui;
    }

    /* Access modifiers changed, original: protected|final */
    public final void zzg(View view) {
        zzbv zzbv = this.zzanm.zzaua;
        if (zzbv != null) {
            zzbv.addView(view, zzbt.zzen().zzrj());
        }
    }

    public void zzi(int i) {
        zzc(i, false);
    }
}

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.common.internal.zzbq;

@zzabh
public final class zzxd implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zzwl zzckb;
    private NativeAdMapper zzckc;
    private zza zzckd;
    private NativeCustomTemplateAd zzcke;

    public zzxd(zzwl zzwl) {
        this.zzckb = zzwl;
    }

    private static void zza(MediationNativeAdapter mediationNativeAdapter, zza zza, NativeAdMapper nativeAdMapper) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new zzxa());
            if (nativeAdMapper != null && nativeAdMapper.hasVideoContent()) {
                nativeAdMapper.zza(videoController);
            }
        }
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        zzbq.zzgn("onAdClicked must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdClicked.");
        try {
            this.zzckb.onAdClicked();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzbq.zzgn("onAdClicked must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdClicked.");
        try {
            this.zzckb.onAdClicked();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        zzbq.zzgn("onAdClicked must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.zzckc;
        zza zza = this.zzckd;
        if (this.zzcke == null) {
            if (nativeAdMapper == null && zza == null) {
                zzaky.zzcz("Could not call onAdClicked since mapper is null.");
                return;
            }
            String str = "Could not call onAdClicked since setOverrideClickHandling is not set to true";
            if (zza != null && !zza.getOverrideClickHandling()) {
                zzaky.zzby(str);
                return;
            } else if (!(nativeAdMapper == null || nativeAdMapper.getOverrideClickHandling())) {
                zzaky.zzby(str);
                return;
            }
        }
        zzaky.zzby("Adapter called onAdClicked.");
        try {
            this.zzckb.onAdClicked();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdClicked.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        zzbq.zzgn("onAdClosed must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdClosed.");
        try {
            this.zzckb.onAdClosed();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdClosed.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzbq.zzgn("onAdClosed must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdClosed.");
        try {
            this.zzckb.onAdClosed();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdClosed.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        zzbq.zzgn("onAdClosed must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdClosed.");
        try {
            this.zzckb.onAdClosed();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdClosed.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        zzbq.zzgn("onAdFailedToLoad must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error. ");
        stringBuilder.append(i);
        zzaky.zzby(stringBuilder.toString());
        try {
            this.zzckb.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        zzbq.zzgn("onAdFailedToLoad must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        zzaky.zzby(stringBuilder.toString());
        try {
            this.zzckb.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        zzbq.zzgn("onAdFailedToLoad must be called on the main UI thread.");
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Adapter called onAdFailedToLoad with error ");
        stringBuilder.append(i);
        stringBuilder.append(".");
        zzaky.zzby(stringBuilder.toString());
        try {
            this.zzckb.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdFailedToLoad.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        zzbq.zzgn("onAdImpression must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.zzckc;
        zza zza = this.zzckd;
        if (this.zzcke == null) {
            if (nativeAdMapper == null && zza == null) {
                zzaky.zzcz("Could not call onAdImpression since AdMapper is null. ");
                return;
            }
            String str = "Could not call onAdImpression since setOverrideImpressionRecording is not set to true";
            if (zza != null && !zza.getOverrideImpressionRecording()) {
                zzaky.zzby(str);
                return;
            } else if (!(nativeAdMapper == null || nativeAdMapper.getOverrideImpressionRecording())) {
                zzaky.zzby(str);
                return;
            }
        }
        zzaky.zzby("Adapter called onAdImpression.");
        try {
            this.zzckb.onAdImpression();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdImpression.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        zzbq.zzgn("onAdLeftApplication must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLeftApplication.");
        try {
            this.zzckb.onAdLeftApplication();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzbq.zzgn("onAdLeftApplication must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLeftApplication.");
        try {
            this.zzckb.onAdLeftApplication();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        zzbq.zzgn("onAdLeftApplication must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLeftApplication.");
        try {
            this.zzckb.onAdLeftApplication();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLeftApplication.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        zzbq.zzgn("onAdLoaded must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLoaded.");
        try {
            this.zzckb.onAdLoaded();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzbq.zzgn("onAdLoaded must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLoaded.");
        try {
            this.zzckb.onAdLoaded();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        zzbq.zzgn("onAdLoaded must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLoaded.");
        this.zzckc = nativeAdMapper;
        this.zzckd = null;
        zza(mediationNativeAdapter, this.zzckd, this.zzckc);
        try {
            this.zzckb.onAdLoaded();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLoaded.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        zzbq.zzgn("onAdOpened must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdOpened.");
        try {
            this.zzckb.onAdOpened();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdOpened.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        zzbq.zzgn("onAdOpened must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdOpened.");
        try {
            this.zzckb.onAdOpened();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdOpened.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        zzbq.zzgn("onAdOpened must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdOpened.");
        try {
            this.zzckb.onAdOpened();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdOpened.", e);
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        zzbq.zzgn("onAppEvent must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAppEvent.");
        try {
            this.zzckb.onAppEvent(str, str2);
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAppEvent.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        zzbq.zzgn("onAdLoaded must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        String str = "Adapter called onAdLoaded with template id ";
        zzaky.zzby(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        this.zzcke = nativeCustomTemplateAd;
        try {
            this.zzckb.onAdLoaded();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLoaded.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzrr) {
            try {
                this.zzckb.zzb(((zzrr) nativeCustomTemplateAd).zzkx(), str);
                return;
            } catch (RemoteException e) {
                zzaky.zzc("Could not call onCustomClick.", e);
                return;
            }
        }
        zzaky.zzcz("Unexpected native custom template ad type.");
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, zza zza) {
        zzbq.zzgn("onAdLoaded must be called on the main UI thread.");
        zzaky.zzby("Adapter called onAdLoaded.");
        this.zzckd = zza;
        this.zzckc = null;
        zza(mediationNativeAdapter, this.zzckd, this.zzckc);
        try {
            this.zzckb.onAdLoaded();
        } catch (RemoteException e) {
            zzaky.zzc("Could not call onAdLoaded.", e);
        }
    }

    public final NativeAdMapper zzmy() {
        return this.zzckc;
    }

    public final zza zzmz() {
        return this.zzckd;
    }

    public final NativeCustomTemplateAd zzna() {
        return this.zzcke;
    }
}

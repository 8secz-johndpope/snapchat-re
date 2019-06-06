package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzaky;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner zzdtn;
    private CustomEventInterstitial zzdto;
    private CustomEventNative zzdtp;
    private View zzhm;

    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzdtq;
        private final MediationBannerListener zzhe;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzdtq = customEventAdapter;
            this.zzhe = mediationBannerListener;
        }
    }

    class zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzdtq;
        private final MediationInterstitialListener zzhf;

        public zzb(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzdtq = customEventAdapter;
            this.zzhf = mediationInterstitialListener;
        }
    }

    static class zzc implements CustomEventNativeListener {
        private final CustomEventAdapter zzdtq;
        private final MediationNativeListener zzhg;

        public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.zzdtq = customEventAdapter;
            this.zzhg = mediationNativeListener;
        }
    }

    private static <T> T zzi(String str) {
        Object str2;
        try {
            str2 = Class.forName(str2).newInstance();
            return str2;
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 46) + String.valueOf(message).length());
            stringBuilder.append("Could not instantiate custom event adapter: ");
            stringBuilder.append(str2);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            zzaky.zzcz(stringBuilder.toString());
            return null;
        }
    }

    public final View getBannerView() {
        return this.zzhm;
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.zzdtn;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzdto;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.zzdtp;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.zzdtn;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.zzdto;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.zzdtp;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.zzdtn;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.zzdto;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.zzdtp;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String str = "class_name";
        this.zzdtn = (CustomEventBanner) zzi(bundle.getString(str));
        if (this.zzdtn == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzdtn.requestBannerAd(context, new zza(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString(str)));
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        String str = "class_name";
        this.zzdto = (CustomEventInterstitial) zzi(bundle.getString(str));
        if (this.zzdto == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzdto.requestInterstitialAd(context, new zzb(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString(str)));
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        String str = "class_name";
        this.zzdtp = (CustomEventNative) zzi(bundle.getString(str));
        if (this.zzdtp == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        this.zzdtp.requestNativeAd(context, new zzc(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle2 == null ? null : bundle2.getBundle(bundle.getString(str)));
    }

    public final void showInterstitial() {
        this.zzdto.showInterstitial();
    }
}

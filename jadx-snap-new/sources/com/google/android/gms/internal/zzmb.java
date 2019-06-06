package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzmb extends IInterface {
    zzlo createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzwf zzwf, int i);

    zzyq createAdOverlay(IObjectWrapper iObjectWrapper);

    zzlt createBannerAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, zzwf zzwf, int i);

    zzza createInAppPurchaseManager(IObjectWrapper iObjectWrapper);

    zzlt createInterstitialAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, zzwf zzwf, int i);

    zzqw createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);

    zzrb createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    zzaex createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzwf zzwf, int i);

    zzlt createSearchAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, int i);

    zzmh getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper);

    zzmh getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i);
}

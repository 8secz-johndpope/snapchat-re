package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzako;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzaqk;
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzlc;
import com.google.android.gms.internal.zzmm;
import defpackage.bbm;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzabh
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zzb, MediationRewardedVideoAdAdapter, zzaqk {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzgs;
    private InterstitialAd zzgt;
    private AdLoader zzgu;
    private Context zzgv;
    private InterstitialAd zzgw;
    private MediationRewardedVideoAdListener zzgx;
    private RewardedVideoAdListener zzgy = new bbm(this);

    static class c extends zza {
        private final UnifiedNativeAd a;

        public c(UnifiedNativeAd unifiedNativeAd) {
            this.a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            zza(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzk(unifiedNativeAd.zzbl());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof zzd) {
                zzd.zzb(this.a);
            }
        }
    }

    static final class d extends AdListener implements AppEventListener, zzkf {
        private AbstractAdViewAdapter a;
        private MediationBannerListener b;

        public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.a = abstractAdViewAdapter;
            this.b = mediationBannerListener;
        }

        public final void onAdClicked() {
            this.b.onAdClicked(this.a);
        }

        public final void onAdClosed() {
            this.b.onAdClosed(this.a);
        }

        public final void onAdFailedToLoad(int i) {
            this.b.onAdFailedToLoad(this.a, i);
        }

        public final void onAdLeftApplication() {
            this.b.onAdLeftApplication(this.a);
        }

        public final void onAdLoaded() {
            this.b.onAdLoaded(this.a);
        }

        public final void onAdOpened() {
            this.b.onAdOpened(this.a);
        }

        public final void onAppEvent(String str, String str2) {
            this.b.zza(this.a, str, str2);
        }
    }

    static final class e extends AdListener implements zzkf {
        private AbstractAdViewAdapter a;
        private MediationInterstitialListener b;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.a = abstractAdViewAdapter;
            this.b = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            this.b.onAdClicked(this.a);
        }

        public final void onAdClosed() {
            this.b.onAdClosed(this.a);
        }

        public final void onAdFailedToLoad(int i) {
            this.b.onAdFailedToLoad(this.a, i);
        }

        public final void onAdLeftApplication() {
            this.b.onAdLeftApplication(this.a);
        }

        public final void onAdLoaded() {
            this.b.onAdLoaded(this.a);
        }

        public final void onAdOpened() {
            this.b.onAdOpened(this.a);
        }
    }

    static final class f extends AdListener implements OnAppInstallAdLoadedListener, OnContentAdLoadedListener, OnCustomClickListener, OnCustomTemplateAdLoadedListener, UnifiedNativeAd.zza {
        private AbstractAdViewAdapter a;
        private MediationNativeListener b;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.a = abstractAdViewAdapter;
            this.b = mediationNativeListener;
        }

        public final void onAdClicked() {
            this.b.onAdClicked(this.a);
        }

        public final void onAdClosed() {
            this.b.onAdClosed(this.a);
        }

        public final void onAdFailedToLoad(int i) {
            this.b.onAdFailedToLoad(this.a, i);
        }

        public final void onAdImpression() {
            this.b.onAdImpression(this.a);
        }

        public final void onAdLeftApplication() {
            this.b.onAdLeftApplication(this.a);
        }

        public final void onAdLoaded() {
        }

        public final void onAdOpened() {
            this.b.onAdOpened(this.a);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.b.onAdLoaded(this.a, new a(nativeAppInstallAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.b.onAdLoaded(this.a, new b(nativeContentAd));
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.b.zza(this.a, nativeCustomTemplateAd, str);
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.b.zza(this.a, nativeCustomTemplateAd);
        }

        public final void zza(UnifiedNativeAd unifiedNativeAd) {
            this.b.zza(this.a, new c(unifiedNativeAd));
        }
    }

    static class a extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd a;

        public a(NativeAppInstallAd nativeAppInstallAd) {
            this.a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.a);
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzamn.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.a);
            }
        }
    }

    static class b extends NativeContentAdMapper {
        private final NativeContentAd a;

        public b(NativeContentAd nativeContentAd) {
            this.a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.a);
            }
            NativeAdViewHolder nativeAdViewHolder = (NativeAdViewHolder) NativeAdViewHolder.zzamn.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.a);
            }
        }
    }

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Builder builder = new Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzlc.zzij();
            builder.addTestDevice(zzako.zzaz(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzgs;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzah(1).zzvp();
    }

    public zzmm getVideoController() {
        AdView adView = this.zzgs;
        if (adView != null) {
            VideoController videoController = adView.getVideoController();
            if (videoController != null) {
                return videoController.zzbh();
            }
        }
        return null;
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzgv = context.getApplicationContext();
        this.zzgx = mediationRewardedVideoAdListener;
        this.zzgx.onInitializationSucceeded(this);
    }

    public boolean isInitialized() {
        return this.zzgx != null;
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzgv;
        if (context == null || this.zzgx == null) {
            zzaky.e("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        this.zzgw = new InterstitialAd(context);
        this.zzgw.zza(true);
        this.zzgw.setAdUnitId(getAdUnitId(bundle));
        this.zzgw.setRewardedVideoAdListener(this.zzgy);
        this.zzgw.loadAd(zza(this.zzgv, mediationAdRequest, bundle2, bundle));
    }

    public void onDestroy() {
        AdView adView = this.zzgs;
        if (adView != null) {
            adView.destroy();
            this.zzgs = null;
        }
        if (this.zzgt != null) {
            this.zzgt = null;
        }
        if (this.zzgu != null) {
            this.zzgu = null;
        }
        if (this.zzgw != null) {
            this.zzgw = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzgt;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        interstitialAd = this.zzgw;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
    }

    public void onPause() {
        AdView adView = this.zzgs;
        if (adView != null) {
            adView.pause();
        }
    }

    public void onResume() {
        AdView adView = this.zzgs;
        if (adView != null) {
            adView.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgs = new AdView(context);
        this.zzgs.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzgs.setAdUnitId(getAdUnitId(bundle));
        this.zzgs.setAdListener(new d(this, mediationBannerListener));
        this.zzgs.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzgt = new InterstitialAd(context);
        this.zzgt.setAdUnitId(getAdUnitId(bundle));
        this.zzgt.setAdListener(new e(this, mediationInterstitialListener));
        this.zzgt.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        f fVar = new f(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(fVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.zznb()) {
            withAdListener.zza(fVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(fVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(fVar);
        }
        if (nativeMediationAdRequest.zznc()) {
            for (String str : nativeMediationAdRequest.zznd().keySet()) {
                withAdListener.forCustomTemplateAd(str, fVar, ((Boolean) nativeMediationAdRequest.zznd().get(str)).booleanValue() ? fVar : null);
            }
        }
        this.zzgu = withAdListener.build();
        this.zzgu.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzgt.show();
    }

    public void showVideo() {
        this.zzgw.show();
    }

    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzaex;
import com.google.android.gms.internal.zzaij;
import com.google.android.gms.internal.zzala;
import com.google.android.gms.internal.zzko;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlt;
import com.google.android.gms.internal.zzmc;
import com.google.android.gms.internal.zzmh;
import com.google.android.gms.internal.zzqj;
import com.google.android.gms.internal.zzql;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzwf;
import com.google.android.gms.internal.zzyq;
import com.google.android.gms.internal.zzza;
import java.util.HashMap;

@Keep
@zzabh
@DynamiteApi
public class ClientApi extends zzmc {
    public zzlo createAdLoaderBuilder(IObjectWrapper iObjectWrapper, String str, zzwf zzwf, int i) {
        Context context = (Context) zzn.zzy(iObjectWrapper);
        zzbt.zzel();
        return new zzaj(context, str, zzwf, new zzala(zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzaij.zzas(context)), zzv.zzc(context));
    }

    public zzyq createAdOverlay(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) zzn.zzy(iObjectWrapper);
        AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(activity.getIntent());
        if (zzc == null) {
            return new zzr(activity);
        }
        int i = zzc.zzcns;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new zzr(activity) : new com.google.android.gms.ads.internal.overlay.zzs(activity, zzc) : new zzy(activity) : new zzx(activity) : new zzq(activity);
    }

    public zzlt createBannerAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, zzwf zzwf, int i) {
        Context context = (Context) zzn.zzy(iObjectWrapper);
        zzbt.zzel();
        return new zzx(context, zzko, str, zzwf, new zzala(zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzaij.zzas(context)), zzv.zzc(context));
    }

    public zzza createInAppPurchaseManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    /* JADX WARNING: Missing block: B:3:0x0034, code skipped:
            if (((java.lang.Boolean) com.google.android.gms.internal.zzlc.zzio().zzd(com.google.android.gms.internal.zzoi.zzbpr)).booleanValue() == false) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:6:0x0048, code skipped:
            if (((java.lang.Boolean) com.google.android.gms.internal.zzlc.zzio().zzd(com.google.android.gms.internal.zzoi.zzbps)).booleanValue() != false) goto L_0x004c;
     */
    public com.google.android.gms.internal.zzlt createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper r8, com.google.android.gms.internal.zzko r9, java.lang.String r10, com.google.android.gms.internal.zzwf r11, int r12) {
        /*
        r7 = this;
        r8 = com.google.android.gms.dynamic.zzn.zzy(r8);
        r1 = r8;
        r1 = (android.content.Context) r1;
        com.google.android.gms.internal.zzoi.initialize(r1);
        r5 = new com.google.android.gms.internal.zzala;
        com.google.android.gms.ads.internal.zzbt.zzel();
        r8 = com.google.android.gms.internal.zzaij.zzas(r1);
        r0 = 1;
        r2 = 12211000; // 0xba5338 float:1.7111256E-38 double:6.0330356E-317;
        r5.<init>(r2, r12, r0, r8);
        r8 = r9.zzbia;
        r12 = "reward_mb";
        r8 = r12.equals(r8);
        if (r8 != 0) goto L_0x0036;
    L_0x0024:
        r12 = com.google.android.gms.internal.zzoi.zzbpr;
        r2 = com.google.android.gms.internal.zzlc.zzio();
        r12 = r2.zzd(r12);
        r12 = (java.lang.Boolean) r12;
        r12 = r12.booleanValue();
        if (r12 != 0) goto L_0x004c;
    L_0x0036:
        if (r8 == 0) goto L_0x004b;
    L_0x0038:
        r8 = com.google.android.gms.internal.zzoi.zzbps;
        r12 = com.google.android.gms.internal.zzlc.zzio();
        r8 = r12.zzd(r8);
        r8 = (java.lang.Boolean) r8;
        r8 = r8.booleanValue();
        if (r8 == 0) goto L_0x004b;
    L_0x004a:
        goto L_0x004c;
    L_0x004b:
        r0 = 0;
    L_0x004c:
        if (r0 == 0) goto L_0x005d;
    L_0x004e:
        r8 = new com.google.android.gms.internal.zzut;
        r9 = com.google.android.gms.ads.internal.zzv.zzc(r1);
        r0 = r8;
        r2 = r10;
        r3 = r11;
        r4 = r5;
        r5 = r9;
        r0.<init>(r1, r2, r3, r4, r5);
        return r8;
    L_0x005d:
        r8 = new com.google.android.gms.ads.internal.zzak;
        r6 = com.google.android.gms.ads.internal.zzv.zzc(r1);
        r0 = r8;
        r2 = r9;
        r3 = r10;
        r4 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.ClientApi.createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.zzko, java.lang.String, com.google.android.gms.internal.zzwf, int):com.google.android.gms.internal.zzlt");
    }

    public zzqw createNativeAdViewDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzqj((FrameLayout) zzn.zzy(iObjectWrapper), (FrameLayout) zzn.zzy(iObjectWrapper2));
    }

    public zzrb createNativeAdViewHolderDelegate(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzql((View) zzn.zzy(iObjectWrapper), (HashMap) zzn.zzy(iObjectWrapper2), (HashMap) zzn.zzy(iObjectWrapper3));
    }

    public zzaex createRewardedVideoAd(IObjectWrapper iObjectWrapper, zzwf zzwf, int i) {
        Context context = (Context) zzn.zzy(iObjectWrapper);
        zzbt.zzel();
        return new zzaeq(context, zzv.zzc(context), zzwf, new zzala(zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzaij.zzas(context)));
    }

    public zzlt createSearchAdManager(IObjectWrapper iObjectWrapper, zzko zzko, String str, int i) {
        Context context = (Context) zzn.zzy(iObjectWrapper);
        zzbt.zzel();
        return new zzbn(context, zzko, str, new zzala(zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzaij.zzas(context)));
    }

    public zzmh getMobileAdsSettingsManager(IObjectWrapper iObjectWrapper) {
        return null;
    }

    public zzmh getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iObjectWrapper, int i) {
        Context context = (Context) zzn.zzy(iObjectWrapper);
        zzbt.zzel();
        return zzax.zza(context, new zzala(zzs.GOOGLE_PLAY_SERVICES_VERSION_CODE, i, true, zzaij.zzas(context)));
    }
}

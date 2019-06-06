package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.zzs;
import defpackage.cc;
import defpackage.cc.a;

@zzabh
public final class zzxx implements MediationInterstitialAdapter {
    private Uri mUri;
    private Activity zzckp;
    private MediationInterstitialListener zzckq;

    public final void onDestroy() {
        zzaky.zzby("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzaky.zzby("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzaky.zzby("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzckq = mediationInterstitialListener;
        if (this.zzckq == null) {
            zzaky.zzcz("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            Object obj = (zzs.zzanr() && zzpf.zzh(context)) ? 1 : null;
            if (obj == null) {
                zzaky.zzcz("Default browser does not support custom tabs. Bailing out.");
                this.zzckq.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzaky.zzcz("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzckq.onAdFailedToLoad(this, 0);
                return;
            }
            this.zzckp = (Activity) context;
            this.mUri = Uri.parse(string);
            this.zzckq.onAdLoaded(this);
        } else {
            zzaky.zzcz("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzckq.onAdFailedToLoad(this, 0);
        }
    }

    public final void showInterstitial() {
        cc b = new a().b();
        b.a.setData(this.mUri);
        zzaij.zzdfn.post(new zzxz(this, new AdOverlayInfoParcel(new zzc(b.a), null, new zzxy(this), null, new zzala(0, 0, false))));
        zzbt.zzep().zzpz();
    }
}

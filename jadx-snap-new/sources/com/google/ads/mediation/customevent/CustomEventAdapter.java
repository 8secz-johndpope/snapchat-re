package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzaky;
import defpackage.bbc;
import defpackage.bbd;
import defpackage.bbf;
import defpackage.bbg;
import defpackage.bbj;
import defpackage.bbk;
import defpackage.bbl;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, bbl>, MediationInterstitialAdapter<CustomEventExtras, bbl> {
    private bbj a;
    private bbk b;

    static final class a {
        private final CustomEventAdapter a;
        private final bbf b;

        public a(CustomEventAdapter customEventAdapter, bbf bbf) {
            this.a = customEventAdapter;
            this.b = bbf;
        }
    }

    class b {
        private final CustomEventAdapter a;
        private final bbg b;

        public b(CustomEventAdapter customEventAdapter, bbg bbg) {
            this.a = customEventAdapter;
            this.b = bbg;
        }
    }

    private static <T> T a() {
        String str = null;
        try {
            str = Class.forName(null).newInstance();
            return str;
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder stringBuilder = new StringBuilder(("null".length() + 46) + String.valueOf(message).length());
            stringBuilder.append("Could not instantiate custom event adapter: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            zzaky.zzcz(stringBuilder.toString());
            return str;
        }
    }

    public final void destroy() {
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return null;
    }

    public final Class<bbl> getServerParametersType() {
        return bbl.class;
    }

    public final void requestBannerAd(bbf bbf, Activity activity, bbl bbl, bbc bbc, bbd bbd, CustomEventExtras customEventExtras) {
        this.a = (bbj) a();
        if (this.a == null) {
            bbf.onFailedToReceiveAd(this, defpackage.bbb.a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras != null) {
            customEventExtras.getExtra(null);
        }
        a aVar = new a(this, bbf);
    }

    public final void requestInterstitialAd(bbg bbg, Activity activity, bbl bbl, bbd bbd, CustomEventExtras customEventExtras) {
        this.b = (bbk) a();
        if (this.b == null) {
            bbg.onFailedToReceiveAd(this, defpackage.bbb.a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras != null) {
            customEventExtras.getExtra(null);
        }
        b bVar = new b(this, bbg);
    }

    public final void showInterstitial() {
    }
}

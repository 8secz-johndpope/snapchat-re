package com.google.ads.mediation;

import android.app.Activity;
import defpackage.bbd;
import defpackage.bbe;
import defpackage.bbg;
import defpackage.bbh;
import defpackage.bbi;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends bbi, SERVER_PARAMETERS extends bbh> extends bbe<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(bbg bbg, Activity activity, SERVER_PARAMETERS server_parameters, bbd bbd, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}

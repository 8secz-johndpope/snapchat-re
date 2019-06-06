package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import defpackage.bbc;
import defpackage.bbd;
import defpackage.bbe;
import defpackage.bbf;
import defpackage.bbh;
import defpackage.bbi;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends bbi, SERVER_PARAMETERS extends bbh> extends bbe<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(bbf bbf, Activity activity, SERVER_PARAMETERS server_parameters, bbc bbc, bbd bbd, ADDITIONAL_PARAMETERS additional_parameters);
}

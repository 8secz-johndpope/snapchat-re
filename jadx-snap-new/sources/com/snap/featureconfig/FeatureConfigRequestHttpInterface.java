package com.snap.featureconfig;

import defpackage.afeg;
import defpackage.afeo;
import defpackage.ajdx;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxy;

public interface FeatureConfigRequestHttpInterface {
    @akxy(a = "/bq/update_feature_settings")
    ajdx<akws<Void>> uploadEvents(@akxk afeg afeg);

    @akxy(a = "/loq/update_user")
    ajdx<akws<Void>> uploadUserRequest(@akxk afeo afeo);
}

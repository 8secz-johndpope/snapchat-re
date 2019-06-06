package com.snap.settings.api;

import defpackage.aepa;
import defpackage.aexl;
import defpackage.aexn;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;

public interface SettingsHttpInterface {
    @akxy(a = "/ph/settings")
    ajdx<akxa<aepa>> submitSettingRequest(@akxk aexl aexl);

    @akxy(a = "/ph/settings")
    ajdx<akxa<aexn>> submitSettingRequestForResponse(@akxk aexl aexl);
}

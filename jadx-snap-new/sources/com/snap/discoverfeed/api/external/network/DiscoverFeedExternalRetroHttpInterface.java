package com.snap.discoverfeed.api.external.network;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.gjh;
import defpackage.gji;
import defpackage.vgf;

public interface DiscoverFeedExternalRetroHttpInterface {
    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/ranking/update_user_profile")
    ajdx<akxa<vgf>> clearInterestTags(@akxk gji gji);

    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/ranking/user_profile_client_setting")
    ajdx<akxa<vgf>> getContentInterestTags(@akxk gji gji);
}

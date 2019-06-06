package com.snap.loginkit.lib.net;

import defpackage.aftr;
import defpackage.aftt;
import defpackage.aftz;
import defpackage.afub;
import defpackage.afun;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.gjg;

public interface LoginKitAuthHttpInterface {
    @akxu(a = {"__authorization: user"})
    @gjg
    @akxy(a = "/oauth2/sc/approval")
    ajdx<aftt> approveOAuthRequest(@akxk aftr aftr);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/oauth2/sc/denial")
    ajdx<akws<akhw>> denyOAuthRequest(@akxk afun afun);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/oauth2/sc/auth")
    ajdx<afub> validateOAuthRequest(@akxk aftz aftz);
}

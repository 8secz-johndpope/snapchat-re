package com.snap.bitmoji.net;

import defpackage.afyc;
import defpackage.afye;
import defpackage.afyg;
import defpackage.afyo;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.gjg;

public interface BitmojiAuthHttpInterface {
    @akxu(a = {"__authorization: user"})
    @gjg
    @akxy(a = "/oauth2/sc/approval")
    ajdx<afyc> validateApprovalOAuthRequest(@akxk afyo afyo);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/oauth2/sc/auth")
    ajdx<afyg> validateBitmojiOAuthRequest(@akxk afye afye);

    @akxu(a = {"__authorization: user"})
    @gjg
    @akxy(a = "/oauth2/sc/denial")
    ajdx<afyc> validateDenialOAuthRequest(@akxk afyo afyo);
}

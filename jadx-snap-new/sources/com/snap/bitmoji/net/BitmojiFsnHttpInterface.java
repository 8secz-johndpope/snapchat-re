package com.snap.bitmoji.net;

import defpackage.aedh;
import defpackage.aedn;
import defpackage.aeeh;
import defpackage.afyu;
import defpackage.afze;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;

public interface BitmojiFsnHttpInterface {
    @akxy(a = "/bitmoji/confirm_link")
    ajdx<aedn> confirmBitmojiLink(@akxk aedh aedh);

    @akxy(a = "bitmoji/request_token")
    ajdx<aeeh> getBitmojiRequestToken(@akxk aedh aedh);

    @akxy(a = "/bitmoji/get_dratinis")
    ajdx<afze> getBitmojiSelfie(@akxk aedh aedh);

    @akxy(a = "/bitmoji/get_dratini_pack")
    ajdx<afyu> getBitmojiSelfieIds(@akxk aedh aedh);

    @akxy(a = "/bitmoji/unlink")
    ajdx<akxa<akhw>> getBitmojiUnlinkRequest(@akxk aedh aedh);

    @akxy(a = "/bitmoji/change_dratini")
    ajdx<akxa<akhw>> updateBitmojiSelfie(@akxk aedh aedh);
}

package com.snap.messaging.talk;

import defpackage.afcx;
import defpackage.afcz;
import defpackage.afdd;
import defpackage.afdf;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.gjg;

public interface TalkHttpInterface {
    @akxu(a = {"__authorization: user"})
    @gjg
    @akxy(a = "/loq/fetch_talk_auth")
    ajdx<afcz> fetchAuth(@akxk afcx afcx);

    @akxy(a = "/loq/talk_calling")
    ajdx<afdf> sendCallingRequest(@akxk afdd afdd);
}

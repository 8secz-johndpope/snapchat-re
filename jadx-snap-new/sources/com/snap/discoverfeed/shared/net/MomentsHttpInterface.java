package com.snap.discoverfeed.shared.net;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxp;
import defpackage.akxy;
import defpackage.akyd;
import defpackage.gjh;
import defpackage.gji;
import defpackage.vhf;

public interface MomentsHttpInterface {
    @akxp(a = "/moments/fetch")
    ajdx<akxa<vhf>> getEndOfStreamStatus(@akyd(a = "storyId") String str);

    @gjh
    @akxy(a = "/moments/subscriptions/v0")
    ajdx<akxa<Object>> getLiveUpdateOptInSubscriptions(@akxk gji gji);
}

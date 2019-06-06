package com.snap.subscription.api.net;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;
import defpackage.gjh;
import defpackage.gji;
import defpackage.vdr;
import defpackage.vdx;
import defpackage.vfv;

public interface SubscriptionHttpInterface {
    @gjh
    @akxy(a = "/ranking/get_opt_ins")
    ajdx<akxa<vdr>> getOptIns(@akxk gji gji);

    @gjh
    @akxy(a = "/ranking/opt_in")
    ajdx<akxa<vdx>> optInStory(@akxk gji gji);

    @gjh
    @akxy(a = "/ranking/subscribe_story")
    ajdx<akxa<vfv>> subscribeStory(@akxk gji gji);
}

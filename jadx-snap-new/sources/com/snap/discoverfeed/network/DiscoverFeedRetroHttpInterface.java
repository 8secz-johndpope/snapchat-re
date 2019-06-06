package com.snap.discoverfeed.network;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.gjh;
import defpackage.gji;
import defpackage.ves;
import defpackage.vif;
import defpackage.vig;
import defpackage.vih;

public interface DiscoverFeedRetroHttpInterface {
    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/ranking/cheetah/stories")
    ajdx<akxa<vih>> getAllStories(@akxk gji gji);

    @akxy
    ajdx<akxa<vih>> getAllStoriesNonFsn(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk vig vig);

    @akxy
    ajdx<akxa<vif>> getBatchStoriesNonFsn(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk vig vig);

    @akxu(a = {"__authorization: user"})
    @gjh
    @akxy(a = "/ranking/cheetah/batch_stories")
    ajdx<akxa<vif>> getBatchStoriesResponse(@akxk gji gji);

    @gjh
    @akxy(a = "/ranking/hide_story")
    ajdx<akxa<ves>> hideStory(@akxk gji gji);
}

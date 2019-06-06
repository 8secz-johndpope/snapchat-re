package com.snap.discoverfeed.shared.net;

import defpackage.agmf;
import defpackage.agmh;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyd;
import defpackage.akyh;
import defpackage.gjh;
import defpackage.gji;
import defpackage.vfv;
import defpackage.vik;
import defpackage.vim;
import defpackage.vis;
import defpackage.viz;

public interface StoriesHttpInterface {
    @gjh
    @akxy(a = "/ranking/cheetah/story_lookup")
    ajdx<akxa<vim>> getStoryLookup(@akxk gji gji);

    @akxy
    ajdx<akxa<vim>> getStoryLookupNonFSN(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk vik vik);

    @gjh
    @akxy(a = "/ranking/cheetah/up_next")
    ajdx<akxa<Object>> getUpNextResponseFSN(@akxk gji gji);

    @akxy
    ajdx<akxa<Object>> getUpNextResponseNonFSN(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk vis vis);

    @gjh
    @akxy(a = "/sharing/create")
    ajdx<akxa<viz>> shareStoriesUrl(@akxk gji gji);

    @akxu(a = {"__authorization: user", "Accept: application/json"})
    @akxy(a = "/discover/linkable_check")
    ajdx<akxa<agmh>> sharedPublisherSnapLinkableCheck(@akyd(a = "region") String str, @akyd(a = "dsnap_id") String str2, @akxk agmf agmf);

    @gjh
    @akxy(a = "/ranking/subscribe_story")
    ajdx<akxa<vfv>> subscribeStory(@akxk gji gji);
}

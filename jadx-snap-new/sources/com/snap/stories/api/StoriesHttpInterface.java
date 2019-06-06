package com.snap.stories.api;

import com.snap.core.net.converter.JsonAuth;
import defpackage.aedh;
import defpackage.aeje;
import defpackage.aelt;
import defpackage.aelz;
import defpackage.aetk;
import defpackage.afem;
import defpackage.agba;
import defpackage.agbc;
import defpackage.agby;
import defpackage.agcq;
import defpackage.agcu;
import defpackage.agcw;
import defpackage.agcy;
import defpackage.agdc;
import defpackage.agde;
import defpackage.ajcx;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.alqz;
import defpackage.alra;

public interface StoriesHttpInterface {
    @JsonAuth(field = "json_request")
    @akxy(a = "/bq/create_mobstory")
    ajdx<agde> createMobStory(@akxk agdc agdc);

    @akxy(a = "/bq/delete_mobstory")
    ajcx deleteMobStory(@akxk agcq agcq);

    @akxy(a = "/shared/delete_story")
    ajcx deleteSharedStorySnap(@akxk aeje aeje);

    @akxy(a = "/bq/delete_story")
    ajcx deleteStorySnap(@akxk aeje aeje);

    @JsonAuth(field = "json_request")
    @akxy(a = "/bq/edit_mobstory")
    ajdx<agde> editMobStory(@akxk agdc agdc);

    @JsonAuth(field = "json_request")
    @akxy(a = "/bq/get_mobstory")
    ajdx<agcw> fetchGroupStories(@akxk agcu agcu);

    @akxy(a = "/bq/our_story")
    ajdx<aetk> fetchOurStories(@akxk aedh aedh);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/bq/story_auth")
    ajdx<alra> fetchPostableCustomStories(@akxk alqz alqz);

    @akxy(a = "/bq/preview")
    ajdx<agbc> fetchPublicUserStory(@akxk agba agba);

    @akxy(a = "/ufs/ranked_stories")
    ajdx<aelz> fetchStoriesUFS(@akxk aelt aelt);

    @akxy(a = "/bq/leave_mobstory")
    ajcx leaveMobStory(@akxk agcy agcy);

    @akxy(a = "/bq/update_stories")
    ajdx<akhw> updateStories(@akxk afem afem);

    @akxy(a = "/bq/update_stories_v2")
    ajdx<akhw> updateStoriesV2(@akxk agby agby);
}

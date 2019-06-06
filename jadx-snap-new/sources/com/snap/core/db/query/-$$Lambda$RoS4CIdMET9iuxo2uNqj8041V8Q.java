package com.snap.core.db.query;

import com.snap.core.db.query.FriendsFeedModel.SelectStoriesForPlayingCreator;
import com.snap.core.db.query.FriendsFeedModel.SelectStoriesForPlayingModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$RoS4CIdMET9iuxo2uNqj8041V8Q implements SelectStoriesForPlayingCreator {
    public static final /* synthetic */ -$$Lambda$RoS4CIdMET9iuxo2uNqj8041V8Q INSTANCE = new -$$Lambda$RoS4CIdMET9iuxo2uNqj8041V8Q();

    private /* synthetic */ -$$Lambda$RoS4CIdMET9iuxo2uNqj8041V8Q() {
    }

    public final SelectStoriesForPlayingModel create(long j, Long l, String str, String str2, Boolean bool, String str3, String str4, Long l2) {
        return new AutoValue_LegacyFriendsFeedQueries_PlayableStoryRecord(j, l, str, str2, bool, str3, str4, l2);
    }
}

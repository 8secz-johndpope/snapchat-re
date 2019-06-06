package com.snap.core.db.query;

import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.query.LegacySendToQueries.PostableStory;
import com.snap.core.db.query.SendToModel.GetAllPostableStoriesCreator;
import com.snap.core.db.query.SendToModel.GetAllPostableStoriesModel;
import com.snapchat.soju.android.Geofence;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$RooNxfzc3FBM2jP0FqCtYRgeKjw implements GetAllPostableStoriesCreator {
    public static final /* synthetic */ -$$Lambda$RooNxfzc3FBM2jP0FqCtYRgeKjw INSTANCE = new -$$Lambda$RooNxfzc3FBM2jP0FqCtYRgeKjw();

    private /* synthetic */ -$$Lambda$RooNxfzc3FBM2jP0FqCtYRgeKjw() {
    }

    public final GetAllPostableStoriesModel create(long j, String str, String str2, String str3, StoryKind storyKind, Boolean bool, GroupStoryType groupStoryType, String str4, String str5, Boolean bool2, Geofence geofence, GroupStoryRankType groupStoryRankType, String str6, Boolean bool3, Long l, Long l2, Long l3, String str7, PrivacyType privacyType, long j2, Long l4) {
        return PostableStory.create(j, str, str2, str3, storyKind, bool, groupStoryType, str4, str5, bool2, geofence, groupStoryRankType, str6, bool3, l, l2, l3, str7, privacyType, j2, l4);
    }
}

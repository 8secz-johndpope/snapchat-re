package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForThumbnailByStoryRowIdCreator;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForThumbnailByStoryRowIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$zVT5Qqeniyha2VJVBnjI4qLXjWs implements SelectStorySnapForThumbnailByStoryRowIdCreator {
    public static final /* synthetic */ -$$Lambda$zVT5Qqeniyha2VJVBnjI4qLXjWs INSTANCE = new -$$Lambda$zVT5Qqeniyha2VJVBnjI4qLXjWs();

    private /* synthetic */ -$$Lambda$zVT5Qqeniyha2VJVBnjI4qLXjWs() {
    }

    public final SelectStorySnapForThumbnailByStoryRowIdModel create(String str, boolean z, String str2, String str3, String str4, MessageClientStatus messageClientStatus, long j, Boolean bool, String str5, long j2, String str6, String str7, String str8, StoryKind storyKind, String str9) {
        return new AutoValue_StorySnapRecord_SelectStorySnapForThumbnailByStoryRowIdRecord(str, z, str2, str3, str4, messageClientStatus, j, bool, str5, j2, str6, str7, str8, storyKind, str9);
    }
}

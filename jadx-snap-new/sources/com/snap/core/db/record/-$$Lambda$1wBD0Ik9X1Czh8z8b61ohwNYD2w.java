package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForThumbnailByUsernameCreator;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForThumbnailByUsernameModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$1wBD0Ik9X1Czh8z8b61ohwNYD2w implements SelectStorySnapForThumbnailByUsernameCreator {
    public static final /* synthetic */ -$$Lambda$1wBD0Ik9X1Czh8z8b61ohwNYD2w INSTANCE = new -$$Lambda$1wBD0Ik9X1Czh8z8b61ohwNYD2w();

    private /* synthetic */ -$$Lambda$1wBD0Ik9X1Czh8z8b61ohwNYD2w() {
    }

    public final SelectStorySnapForThumbnailByUsernameModel create(String str, boolean z, String str2, String str3, String str4, MessageClientStatus messageClientStatus, long j, String str5, long j2, String str6, String str7, String str8, StoryKind storyKind, String str9) {
        return new AutoValue_StorySnapRecord_SelectStorySnapForThumbnailByUsernameRecord(str, z, str2, str3, str4, messageClientStatus, j, str5, j2, str6, str7, str8, storyKind, str9);
    }
}

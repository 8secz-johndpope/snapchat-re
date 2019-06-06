package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.GetStoryManagementStoriesMetadataCreator;
import com.snap.core.db.record.StorySnapModel.GetStoryManagementStoriesMetadataModel;
import defpackage.ageb;
import defpackage.agec;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$s2HIVRr5Zmfgnj077FBbsGTeiuE implements GetStoryManagementStoriesMetadataCreator {
    public static final /* synthetic */ -$$Lambda$s2HIVRr5Zmfgnj077FBbsGTeiuE INSTANCE = new -$$Lambda$s2HIVRr5Zmfgnj077FBbsGTeiuE();

    private /* synthetic */ -$$Lambda$s2HIVRr5Zmfgnj077FBbsGTeiuE() {
    }

    public final GetStoryManagementStoriesMetadataModel create(String str, MessageClientStatus messageClientStatus, long j, long j2, long j3, String str2, StoryKind storyKind, String str3, Long l, ageb ageb, String str4, agec agec, String str5, long j4, long j5) {
        return new AutoValue_StorySnapRecord_StoryManagementStoryMetadataRecord(str, messageClientStatus, j, j2, j3, str2, storyKind, str3, l, ageb, str4, agec, str5, j4, j5);
    }
}

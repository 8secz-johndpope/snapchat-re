package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapsCreator;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapsModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$5J3-GRPDL4nGadPxTCCs17llVxY implements SelectStorySnapsCreator {
    public static final /* synthetic */ -$$Lambda$5J3-GRPDL4nGadPxTCCs17llVxY INSTANCE = new -$$Lambda$5J3-GRPDL4nGadPxTCCs17llVxY();

    private /* synthetic */ -$$Lambda$5J3-GRPDL4nGadPxTCCs17llVxY() {
    }

    public final SelectStorySnapsModel create(long j, String str, String str2, Boolean bool, long j2, MessageClientStatus messageClientStatus, String str3, long j3, gcp gcp, String str4, String str5, String str6, String str7, long j4, boolean z, long j5, long j6, long j7, StoryKind storyKind, String str8) {
        return new AutoValue_StorySnapRecord_SelectStorySnapRecord(j, str, str2, bool, j2, messageClientStatus, str3, j3, gcp, str4, str5, str6, str7, j4, z, j5, j6, j7, storyKind, str8);
    }
}

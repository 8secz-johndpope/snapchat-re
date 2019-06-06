package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.GetStoryManagementStorySnapsCreator;
import com.snap.core.db.record.StorySnapModel.GetStoryManagementStorySnapsModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$n8yRTu2SXDs-9EDMYs6riqS7XEs implements GetStoryManagementStorySnapsCreator {
    public static final /* synthetic */ -$$Lambda$n8yRTu2SXDs-9EDMYs6riqS7XEs INSTANCE = new -$$Lambda$n8yRTu2SXDs-9EDMYs6riqS7XEs();

    private /* synthetic */ -$$Lambda$n8yRTu2SXDs-9EDMYs6riqS7XEs() {
    }

    public final GetStoryManagementStorySnapsModel create(long j, String str, String str2, Boolean bool, MessageClientStatus messageClientStatus, String str3, long j2, String str4, long j3, gcp gcp, String str5, String str6, String str7, String str8, long j4, boolean z, long j5, Boolean bool2, String str9, long j6, long j7, StoryKind storyKind, String str10) {
        return new AutoValue_StorySnapRecord_StoryManagementStorySnapRecord(j, str, str2, bool, messageClientStatus, str3, j2, str4, j3, gcp, str5, str6, str7, str8, j4, z, j5, bool2, str9, j6, j7, storyKind, str10);
    }
}

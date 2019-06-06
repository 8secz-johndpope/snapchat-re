package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetSnapsFromMessageForFeedCreator;
import com.snap.core.db.record.MessageModel.GetSnapsFromMessageForFeedModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$3VLMjETwX7Z2DR1XFm7c9cPj5w4 implements GetSnapsFromMessageForFeedCreator {
    public static final /* synthetic */ -$$Lambda$3VLMjETwX7Z2DR1XFm7c9cPj5w4 INSTANCE = new -$$Lambda$3VLMjETwX7Z2DR1XFm7c9cPj5w4();

    private /* synthetic */ -$$Lambda$3VLMjETwX7Z2DR1XFm7c9cPj5w4() {
    }

    public final GetSnapsFromMessageForFeedModel create(String str, SnapServerStatus snapServerStatus, String str2, long j, boolean z, long j2) {
        return new AutoValue_MessageRecord_GetSnapsForFeed(str, snapServerStatus, str2, j, z, j2);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapModel.GetSnapsForFeedCreator;
import com.snap.core.db.record.MessagingSnapModel.GetSnapsForFeedModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$sDj-C8Y6omJ7z3oF44xf-svvp8A implements GetSnapsForFeedCreator {
    public static final /* synthetic */ -$$Lambda$sDj-C8Y6omJ7z3oF44xf-svvp8A INSTANCE = new -$$Lambda$sDj-C8Y6omJ7z3oF44xf-svvp8A();

    private /* synthetic */ -$$Lambda$sDj-C8Y6omJ7z3oF44xf-svvp8A() {
    }

    public final GetSnapsForFeedModel create(String str, SnapServerStatus snapServerStatus, String str2, long j) {
        return new AutoValue_MessagingSnapRecord_SnapsForFeed(str, snapServerStatus, str2, j);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastViewedMessageCreator;
import com.snap.core.db.record.MessageModel.GetLastViewedMessageModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$fmscX62wZ4R_Z0B5lOGOQcaQLSg implements GetLastViewedMessageCreator {
    public static final /* synthetic */ -$$Lambda$fmscX62wZ4R_Z0B5lOGOQcaQLSg INSTANCE = new -$$Lambda$fmscX62wZ4R_Z0B5lOGOQcaQLSg();

    private /* synthetic */ -$$Lambda$fmscX62wZ4R_Z0B5lOGOQcaQLSg() {
    }

    public final GetLastViewedMessageModel create(long j, String str, Long l, long j2, MessageClientStatus messageClientStatus, Long l2) {
        return new AutoValue_MessageRecord_LastViewedMessageModel(j, str, l, j2, messageClientStatus, l2);
    }
}

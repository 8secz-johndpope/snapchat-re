package com.snap.core.db.record;

import com.snap.core.db.column.UpdateStatus;
import com.snap.core.db.record.PendingSnapModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$V7nnCPFXrBcpyTMT35FiqJiKRuY implements Creator {
    public static final /* synthetic */ -$$Lambda$V7nnCPFXrBcpyTMT35FiqJiKRuY INSTANCE = new -$$Lambda$V7nnCPFXrBcpyTMT35FiqJiKRuY();

    private /* synthetic */ -$$Lambda$V7nnCPFXrBcpyTMT35FiqJiKRuY() {
    }

    public final PendingSnapModel create(long j, long j2, String str, long j3, UpdateStatus updateStatus) {
        return new AutoValue_PendingSnapRecord(j, j2, str, j3, updateStatus);
    }
}

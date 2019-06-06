package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.SendToLastSnapRecipientsModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$41lYaZOnJX45dv-luwaG3DcCSp0 implements Creator {
    public static final /* synthetic */ -$$Lambda$41lYaZOnJX45dv-luwaG3DcCSp0 INSTANCE = new -$$Lambda$41lYaZOnJX45dv-luwaG3DcCSp0();

    private /* synthetic */ -$$Lambda$41lYaZOnJX45dv-luwaG3DcCSp0() {
    }

    public final SendToLastSnapRecipientsModel create(long j, String str, FeedKind feedKind, Long l) {
        return new AutoValue_SendToLastSnapRecipientsRecord(j, str, feedKind, l);
    }
}

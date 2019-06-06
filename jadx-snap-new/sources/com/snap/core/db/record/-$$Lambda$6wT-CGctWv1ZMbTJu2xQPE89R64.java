package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.MessagingSnapModel.GetSnapIdInfoForMessageIdCreator;
import com.snap.core.db.record.MessagingSnapModel.GetSnapIdInfoForMessageIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$6wT-CGctWv1ZMbTJu2xQPE89R64 implements GetSnapIdInfoForMessageIdCreator {
    public static final /* synthetic */ -$$Lambda$6wT-CGctWv1ZMbTJu2xQPE89R64 INSTANCE = new -$$Lambda$6wT-CGctWv1ZMbTJu2xQPE89R64();

    private /* synthetic */ -$$Lambda$6wT-CGctWv1ZMbTJu2xQPE89R64() {
    }

    public final GetSnapIdInfoForMessageIdModel create(String str, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2, String str3, Long l) {
        return new AutoValue_MessagingSnapRecord_SnapIdInfo(str, screenshottedOrReplayedState, str2, str3, l);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetSnapMessageInfoForKeyCreator;
import com.snap.core.db.record.MessageModel.GetSnapMessageInfoForKeyModel;
import defpackage.gcj;
import defpackage.gcm;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$sr29hp7e3-HvGFlvZr1yvnmUCTs implements GetSnapMessageInfoForKeyCreator {
    public static final /* synthetic */ -$$Lambda$sr29hp7e3-HvGFlvZr1yvnmUCTs INSTANCE = new -$$Lambda$sr29hp7e3-HvGFlvZr1yvnmUCTs();

    private /* synthetic */ -$$Lambda$sr29hp7e3-HvGFlvZr1yvnmUCTs() {
    }

    public final GetSnapMessageInfoForKeyModel create(String str, SnapServerStatus snapServerStatus, long j, gcm gcm, gcj gcj, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, String str2, String str3, String str4, long j2) {
        return new AutoValue_MessageRecord_SnapUpdateInfo(str, snapServerStatus, j, gcm, gcj, screenshottedOrReplayedState, l, str2, str3, str4, j2);
    }
}

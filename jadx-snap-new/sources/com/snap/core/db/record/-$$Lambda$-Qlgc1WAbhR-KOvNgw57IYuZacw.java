package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapModel.GetGroupSnapInfoCreator;
import com.snap.core.db.record.MessagingSnapModel.GetGroupSnapInfoModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$-Qlgc1WAbhR-KOvNgw57IYuZacw implements GetGroupSnapInfoCreator {
    public static final /* synthetic */ -$$Lambda$-Qlgc1WAbhR-KOvNgw57IYuZacw INSTANCE = new -$$Lambda$-Qlgc1WAbhR-KOvNgw57IYuZacw();

    private /* synthetic */ -$$Lambda$-Qlgc1WAbhR-KOvNgw57IYuZacw() {
    }

    public final GetGroupSnapInfoModel create(String str, SnapServerStatus snapServerStatus, Long l, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        return new AutoValue_MessagingSnapRecord_SnapStateInfo(str, snapServerStatus, l, screenshottedOrReplayedState);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetSnapStatesByIdsCreator;
import com.snap.core.db.record.MessageModel.GetSnapStatesByIdsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$rvEwGL02_sWfz_kNN2HXk4xU7Qo implements GetSnapStatesByIdsCreator {
    public static final /* synthetic */ -$$Lambda$rvEwGL02_sWfz_kNN2HXk4xU7Qo INSTANCE = new -$$Lambda$rvEwGL02_sWfz_kNN2HXk4xU7Qo();

    private /* synthetic */ -$$Lambda$rvEwGL02_sWfz_kNN2HXk4xU7Qo() {
    }

    public final GetSnapStatesByIdsModel create(String str, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        return new AutoValue_MessageRecord_GetSnapStatesByMessageIds(str, snapServerStatus, screenshottedOrReplayedState);
    }
}

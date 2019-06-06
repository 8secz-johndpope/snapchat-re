package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.MessagingSnapModel.GetSnapInfoForIdCreator;
import com.snap.core.db.record.MessagingSnapModel.GetSnapInfoForIdModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$AjPA_gZ_D9c5RmulYMQD2O9Z3lI implements GetSnapInfoForIdCreator {
    public static final /* synthetic */ -$$Lambda$AjPA_gZ_D9c5RmulYMQD2O9Z3lI INSTANCE = new -$$Lambda$AjPA_gZ_D9c5RmulYMQD2O9Z3lI();

    private /* synthetic */ -$$Lambda$AjPA_gZ_D9c5RmulYMQD2O9Z3lI() {
    }

    public final GetSnapInfoForIdModel create(String str, gcp gcp, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2) {
        return new AutoValue_MessagingSnapRecord_SnapInfo(str, gcp, screenshottedOrReplayedState, str2);
    }
}

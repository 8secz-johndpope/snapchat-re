package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetSnapMessageInfoForKeyNewCreator;
import com.snap.core.db.record.MessageModel.GetSnapMessageInfoForKeyNewModel;
import defpackage.gcj;
import defpackage.gcm;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$IZ9OTF4wL1zme8GklxpldP85taM implements GetSnapMessageInfoForKeyNewCreator {
    public static final /* synthetic */ -$$Lambda$IZ9OTF4wL1zme8GklxpldP85taM INSTANCE = new -$$Lambda$IZ9OTF4wL1zme8GklxpldP85taM();

    private /* synthetic */ -$$Lambda$IZ9OTF4wL1zme8GklxpldP85taM() {
    }

    public final GetSnapMessageInfoForKeyNewModel create(String str, SnapServerStatus snapServerStatus, long j, gcm gcm, gcj gcj, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, String str2, String str3, String str4, long j2) {
        return new AutoValue_MessageRecord_SnapUpdateInfoNew(str, snapServerStatus, j, gcm, gcj, screenshottedOrReplayedState, l, str2, str3, str4, j2);
    }
}

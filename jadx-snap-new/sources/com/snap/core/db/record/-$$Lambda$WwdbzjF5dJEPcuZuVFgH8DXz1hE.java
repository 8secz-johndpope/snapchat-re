package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.NetworkMessageModel.Creator;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.yfj;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$WwdbzjF5dJEPcuZuVFgH8DXz1hE implements Creator {
    public static final /* synthetic */ -$$Lambda$WwdbzjF5dJEPcuZuVFgH8DXz1hE INSTANCE = new -$$Lambda$WwdbzjF5dJEPcuZuVFgH8DXz1hE();

    private /* synthetic */ -$$Lambda$WwdbzjF5dJEPcuZuVFgH8DXz1hE() {
    }

    public final NetworkMessageModel create(long j, String str, String str2, long j2, Long l, long j3, Long l2, Long l3, List list, List list2, MessageClientStatus messageClientStatus, String str3, byte[] bArr, gcj gcj, gcm gcm, boolean z, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, Long l4, yfj yfj) {
        return new AutoValue_NetworkMessageRecord(j, str, str2, j2, l, j3, l2, l3, list, list2, messageClientStatus, str3, bArr, gcj, gcm, z, screenshottedOrReplayedState, snapServerStatus, l4, yfj);
    }
}

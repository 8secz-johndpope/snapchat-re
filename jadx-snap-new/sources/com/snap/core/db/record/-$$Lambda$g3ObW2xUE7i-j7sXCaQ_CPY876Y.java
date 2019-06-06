package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.Creator;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.yfj;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$g3ObW2xUE7i-j7sXCaQ_CPY876Y implements Creator {
    public static final /* synthetic */ -$$Lambda$g3ObW2xUE7i-j7sXCaQ_CPY876Y INSTANCE = new -$$Lambda$g3ObW2xUE7i-j7sXCaQ_CPY876Y();

    private /* synthetic */ -$$Lambda$g3ObW2xUE7i-j7sXCaQ_CPY876Y() {
    }

    public final MessageModel create(long j, long j2, String str, Long l, long j3, Long l2, Long l3, MessageClientStatus messageClientStatus, Long l4, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Float f, Boolean bool, Boolean bool2, String str9, String str10, Long l5, byte[] bArr, gcj gcj, gcm gcm, boolean z, String str11, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, Long l6, yfj yfj) {
        return new AutoValue_MessageRecord(j, j2, str, l, j3, l2, l3, messageClientStatus, l4, str2, str3, str4, str5, str6, str7, num, num2, str8, f, bool, bool2, str9, str10, l5, bArr, gcj, gcm, z, str11, screenshottedOrReplayedState, snapServerStatus, l6, yfj);
    }
}

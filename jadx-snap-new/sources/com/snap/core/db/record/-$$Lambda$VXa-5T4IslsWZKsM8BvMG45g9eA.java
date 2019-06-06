package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.LocalMessageActionModel.Creator;
import defpackage.gci;
import defpackage.gcj;
import java.util.List;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$VXa-5T4IslsWZKsM8BvMG45g9eA implements Creator {
    public static final /* synthetic */ -$$Lambda$VXa-5T4IslsWZKsM8BvMG45g9eA INSTANCE = new -$$Lambda$VXa-5T4IslsWZKsM8BvMG45g9eA();

    private /* synthetic */ -$$Lambda$VXa-5T4IslsWZKsM8BvMG45g9eA() {
    }

    public final LocalMessageActionModel create(long j, gci gci, long j2, String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5, List list, List list2, gcj gcj, Boolean bool, Integer num, MessageClientStatus messageClientStatus, String str3, byte[] bArr, byte[] bArr2, List list3, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus) {
        return new AutoValue_LocalMessageActionRecord(j, gci, j2, str, str2, l, l2, l3, l4, l5, list, list2, gcj, bool, num, messageClientStatus, str3, bArr, bArr2, list3, screenshottedOrReplayedState, snapServerStatus);
    }
}

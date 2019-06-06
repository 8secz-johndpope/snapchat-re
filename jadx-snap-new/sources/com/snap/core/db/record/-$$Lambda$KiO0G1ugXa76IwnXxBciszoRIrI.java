package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectBlockedFriendCreator;
import com.snap.core.db.record.FriendModel.SelectBlockedFriendModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$KiO0G1ugXa76IwnXxBciszoRIrI implements SelectBlockedFriendCreator {
    public static final /* synthetic */ -$$Lambda$KiO0G1ugXa76IwnXxBciszoRIrI INSTANCE = new -$$Lambda$KiO0G1ugXa76IwnXxBciszoRIrI();

    private /* synthetic */ -$$Lambda$KiO0G1ugXa76IwnXxBciszoRIrI() {
    }

    public final SelectBlockedFriendModel create(long j, String str, String str2, String str3, Long l, Long l2) {
        return new AutoValue_FriendRecord_DisplayInfo(j, str, str2, str3, l, l2);
    }
}

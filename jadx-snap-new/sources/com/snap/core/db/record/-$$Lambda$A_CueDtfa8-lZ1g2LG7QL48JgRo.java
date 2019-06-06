package com.snap.core.db.record;

import com.snap.core.db.record.FeedModel.SelectMembersForAvatarPickerCreator;
import com.snap.core.db.record.FeedModel.SelectMembersForAvatarPickerModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$A_CueDtfa8-lZ1g2LG7QL48JgRo implements SelectMembersForAvatarPickerCreator {
    public static final /* synthetic */ -$$Lambda$A_CueDtfa8-lZ1g2LG7QL48JgRo INSTANCE = new -$$Lambda$A_CueDtfa8-lZ1g2LG7QL48JgRo();

    private /* synthetic */ -$$Lambda$A_CueDtfa8-lZ1g2LG7QL48JgRo() {
    }

    public final SelectMembersForAvatarPickerModel create(String str, String str2) {
        return new AutoValue_FeedRecord_AvatarInfo(str, str2);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$eTxA-QCBW6pbNya6AdDT_IM3d4s implements Creator {
    public static final /* synthetic */ -$$Lambda$eTxA-QCBW6pbNya6AdDT_IM3d4s INSTANCE = new -$$Lambda$eTxA-QCBW6pbNya6AdDT_IM3d4s();

    private /* synthetic */ -$$Lambda$eTxA-QCBW6pbNya6AdDT_IM3d4s() {
    }

    public final StoryModel create(long j, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Long l2, Boolean bool2, StoryKind storyKind, GroupStoryType groupStoryType, Boolean bool3, Long l3) {
        return new AutoValue_StoryRecord(j, str, str2, str3, bool, str4, str5, l, l2, bool2, storyKind, groupStoryType, bool3, l3);
    }
}

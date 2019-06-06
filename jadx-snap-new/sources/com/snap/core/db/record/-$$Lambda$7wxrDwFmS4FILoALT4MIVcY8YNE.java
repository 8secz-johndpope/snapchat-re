package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapViewReportingInfoCreator;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapViewReportingInfoModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$7wxrDwFmS4FILoALT4MIVcY8YNE implements SelectStorySnapViewReportingInfoCreator {
    public static final /* synthetic */ -$$Lambda$7wxrDwFmS4FILoALT4MIVcY8YNE INSTANCE = new -$$Lambda$7wxrDwFmS4FILoALT4MIVcY8YNE();

    private /* synthetic */ -$$Lambda$7wxrDwFmS4FILoALT4MIVcY8YNE() {
    }

    public final SelectStorySnapViewReportingInfoModel create(String str, Boolean bool, Boolean bool2, String str2, String str3, StoryKind storyKind, String str4, FriendLinkType friendLinkType) {
        return new AutoValue_StorySnapRecord_SelectStorySnapViewReportingInfoRecord(str, bool, bool2, str2, str3, storyKind, str4, friendLinkType);
    }
}

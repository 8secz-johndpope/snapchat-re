package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.StorySnapModel.SelectStoryManagementChromeDataCreator;
import com.snap.core.db.record.StorySnapModel.SelectStoryManagementChromeDataModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$nfa2_8LFXT0gzmIzmAoVW9sa8bs implements SelectStoryManagementChromeDataCreator {
    public static final /* synthetic */ -$$Lambda$nfa2_8LFXT0gzmIzmAoVW9sa8bs INSTANCE = new -$$Lambda$nfa2_8LFXT0gzmIzmAoVW9sa8bs();

    private /* synthetic */ -$$Lambda$nfa2_8LFXT0gzmIzmAoVW9sa8bs() {
    }

    public final SelectStoryManagementChromeDataModel create(long j, MessageClientStatus messageClientStatus, String str) {
        return new AutoValue_StorySnapRecord_SelectStoryManagementChromeDataRecord(j, messageClientStatus, str);
    }
}

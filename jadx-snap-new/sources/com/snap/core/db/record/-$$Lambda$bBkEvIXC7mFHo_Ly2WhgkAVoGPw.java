package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.StorySnapModel.SelectSnapDataForDeletionCreator;
import com.snap.core.db.record.StorySnapModel.SelectSnapDataForDeletionModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$bBkEvIXC7mFHo_Ly2WhgkAVoGPw implements SelectSnapDataForDeletionCreator {
    public static final /* synthetic */ -$$Lambda$bBkEvIXC7mFHo_Ly2WhgkAVoGPw INSTANCE = new -$$Lambda$bBkEvIXC7mFHo_Ly2WhgkAVoGPw();

    private /* synthetic */ -$$Lambda$bBkEvIXC7mFHo_Ly2WhgkAVoGPw() {
    }

    public final SelectSnapDataForDeletionModel create(long j, long j2, String str, Long l, long j3, MessageClientStatus messageClientStatus) {
        return new AutoValue_StorySnapRecord_SelectSnapDataForDeletionRecord(j, j2, str, l, j3, messageClientStatus);
    }
}

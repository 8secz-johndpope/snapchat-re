package com.snap.core.db.record;

import com.snap.core.db.record.PublisherSnapPageModel.StoryInfoCreator;
import com.snap.core.db.record.PublisherSnapPageModel.StoryInfoModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$3CKqacAljsmbZ2Td-PpVvl8wxMA implements StoryInfoCreator {
    public static final /* synthetic */ -$$Lambda$3CKqacAljsmbZ2Td-PpVvl8wxMA INSTANCE = new -$$Lambda$3CKqacAljsmbZ2Td-PpVvl8wxMA();

    private /* synthetic */ -$$Lambda$3CKqacAljsmbZ2Td-PpVvl8wxMA() {
    }

    public final StoryInfoModel create(long j, String str, long j2) {
        return new AutoValue_PublisherSnapPageRecord_StoryInfoRecord(j, str, j2);
    }
}

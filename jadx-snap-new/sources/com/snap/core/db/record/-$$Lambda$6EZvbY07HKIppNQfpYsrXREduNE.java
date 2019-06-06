package com.snap.core.db.record;

import com.snap.core.db.record.DiscoverStorySnapModel.StoryMediaInfoCreator;
import com.snap.core.db.record.DiscoverStorySnapModel.StoryMediaInfoModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$6EZvbY07HKIppNQfpYsrXREduNE implements StoryMediaInfoCreator {
    public static final /* synthetic */ -$$Lambda$6EZvbY07HKIppNQfpYsrXREduNE INSTANCE = new -$$Lambda$6EZvbY07HKIppNQfpYsrXREduNE();

    private /* synthetic */ -$$Lambda$6EZvbY07HKIppNQfpYsrXREduNE() {
    }

    public final StoryMediaInfoModel create(String str, gcp gcp, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new AutoValue_DiscoverStorySnapRecord_StorySnapMediaInfoRecord(str, gcp, str2, str3, str4, str5, str6, str7, str8);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapModel.GetDownloadDataForStorySnapCreator;
import com.snap.core.db.record.StorySnapModel.GetDownloadDataForStorySnapModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$xa2yZJD7XGjpv60vHtiV1eacXaE implements GetDownloadDataForStorySnapCreator {
    public static final /* synthetic */ -$$Lambda$xa2yZJD7XGjpv60vHtiV1eacXaE INSTANCE = new -$$Lambda$xa2yZJD7XGjpv60vHtiV1eacXaE();

    private /* synthetic */ -$$Lambda$xa2yZJD7XGjpv60vHtiV1eacXaE() {
    }

    public final GetDownloadDataForStorySnapModel create(String str, String str2, gcp gcp, String str3, String str4, String str5, String str6) {
        return new AutoValue_StorySnapRecord_StorySnapDownload(str, str2, gcp, str3, str4, str5, str6);
    }
}

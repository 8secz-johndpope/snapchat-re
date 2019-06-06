package com.snap.core.db.record;

import com.snap.core.db.record.PromotedStorySnapModel.MediaFetchInfoCreator;
import com.snap.core.db.record.PromotedStorySnapModel.MediaFetchInfoModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$vtQKnqtKu2iShZRRNcKPTGta44o implements MediaFetchInfoCreator {
    public static final /* synthetic */ -$$Lambda$vtQKnqtKu2iShZRRNcKPTGta44o INSTANCE = new -$$Lambda$vtQKnqtKu2iShZRRNcKPTGta44o();

    private /* synthetic */ -$$Lambda$vtQKnqtKu2iShZRRNcKPTGta44o() {
    }

    public final MediaFetchInfoModel create(long j, String str, String str2) {
        return new AutoValue_PromotedStorySnapRecord_MediaFetchInfoRecord(j, str, str2);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.record.PublisherSnapPageModel.PageMediaInfoCreator;
import com.snap.core.db.record.PublisherSnapPageModel.PageMediaInfoModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$PXgpp22gSl2k3lEwYlxGtGIMo4U implements PageMediaInfoCreator {
    public static final /* synthetic */ -$$Lambda$PXgpp22gSl2k3lEwYlxGtGIMo4U INSTANCE = new -$$Lambda$PXgpp22gSl2k3lEwYlxGtGIMo4U();

    private /* synthetic */ -$$Lambda$PXgpp22gSl2k3lEwYlxGtGIMo4U() {
    }

    public final PageMediaInfoModel create(long j, String str) {
        return new AutoValue_PublisherSnapPageRecord_PageMediaInfoRecord(j, str);
    }
}

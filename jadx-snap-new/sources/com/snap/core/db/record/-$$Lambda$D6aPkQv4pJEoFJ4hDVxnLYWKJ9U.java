package com.snap.core.db.record;

import com.snap.core.db.column.PublisherPageSnapType;
import com.snap.core.db.record.PublisherSnapPageModel.PlayablePagesCreator;
import com.snap.core.db.record.PublisherSnapPageModel.PlayablePagesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$D6aPkQv4pJEoFJ4hDVxnLYWKJ9U implements PlayablePagesCreator {
    public static final /* synthetic */ -$$Lambda$D6aPkQv4pJEoFJ4hDVxnLYWKJ9U INSTANCE = new -$$Lambda$D6aPkQv4pJEoFJ4hDVxnLYWKJ9U();

    private /* synthetic */ -$$Lambda$D6aPkQv4pJEoFJ4hDVxnLYWKJ9U() {
    }

    public final PlayablePagesModel create(long j, long j2, String str, long j3, long j4, String str2, String str3, long j5, PublisherPageSnapType publisherPageSnapType, String str4, String str5, Long l, Long l2, Long l3, String str6) {
        return new AutoValue_PublisherSnapPageRecord_PlayablePagesRecord(j, j2, str, j3, j4, str2, str3, j5, publisherPageSnapType, str4, str5, l, l2, l3, str6);
    }
}

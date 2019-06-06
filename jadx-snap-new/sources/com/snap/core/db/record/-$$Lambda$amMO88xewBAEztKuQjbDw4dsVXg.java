package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.MessageModel.GetSnapMetadataForMessageIdCreator;
import com.snap.core.db.record.MessageModel.GetSnapMetadataForMessageIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$amMO88xewBAEztKuQjbDw4dsVXg implements GetSnapMetadataForMessageIdCreator {
    public static final /* synthetic */ -$$Lambda$amMO88xewBAEztKuQjbDw4dsVXg INSTANCE = new -$$Lambda$amMO88xewBAEztKuQjbDw4dsVXg();

    private /* synthetic */ -$$Lambda$amMO88xewBAEztKuQjbDw4dsVXg() {
    }

    public final GetSnapMetadataForMessageIdModel create(long j, byte[] bArr, FeedKind feedKind, String str, String str2) {
        return new AutoValue_MessageRecord_SnapMetadata(j, bArr, feedKind, str, str2);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForKeyCreator;
import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForKeyModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$N1Opv1v9hVPGZP2y6fsLPZHNwc4 implements GetMessageMediaInfoForKeyCreator {
    public static final /* synthetic */ -$$Lambda$N1Opv1v9hVPGZP2y6fsLPZHNwc4 INSTANCE = new -$$Lambda$N1Opv1v9hVPGZP2y6fsLPZHNwc4();

    private /* synthetic */ -$$Lambda$N1Opv1v9hVPGZP2y6fsLPZHNwc4() {
    }

    public final GetMessageMediaInfoForKeyModel create(String str, String str2, byte[] bArr, ReplyMedia replyMedia, String str3) {
        return new AutoValue_MessageRecord_MessageMediaForKeyInfo(str, str2, bArr, replyMedia, str3);
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.record.MessagingSnapModel.GetReplyMediaInfoForSnapRowIdCreator;
import com.snap.core.db.record.MessagingSnapModel.GetReplyMediaInfoForSnapRowIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$ErYPYrW6NXH5wxvGt1hAX1SNOpI implements GetReplyMediaInfoForSnapRowIdCreator {
    public static final /* synthetic */ -$$Lambda$ErYPYrW6NXH5wxvGt1hAX1SNOpI INSTANCE = new -$$Lambda$ErYPYrW6NXH5wxvGt1hAX1SNOpI();

    private /* synthetic */ -$$Lambda$ErYPYrW6NXH5wxvGt1hAX1SNOpI() {
    }

    public final GetReplyMediaInfoForSnapRowIdModel create(String str, ReplyMedia replyMedia, String str2) {
        return new AutoValue_MessagingSnapRecord_ReplyMediaInfo(str, replyMedia, str2);
    }
}

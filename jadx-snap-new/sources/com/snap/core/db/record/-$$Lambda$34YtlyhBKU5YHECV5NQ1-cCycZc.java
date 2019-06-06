package com.snap.core.db.record;

import com.snap.core.db.column.FriendmojiType;
import com.snap.core.db.record.FriendmojiModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$34YtlyhBKU5YHECV5NQ1-cCycZc implements Creator {
    public static final /* synthetic */ -$$Lambda$34YtlyhBKU5YHECV5NQ1-cCycZc INSTANCE = new -$$Lambda$34YtlyhBKU5YHECV5NQ1-cCycZc();

    private /* synthetic */ -$$Lambda$34YtlyhBKU5YHECV5NQ1-cCycZc() {
    }

    public final FriendmojiModel create(long j, String str, String str2, Long l, String str3, String str4, String str5, FriendmojiType friendmojiType) {
        return new AutoValue_FriendmojiRecord(j, str, str2, l, str3, str4, str5, friendmojiType);
    }
}

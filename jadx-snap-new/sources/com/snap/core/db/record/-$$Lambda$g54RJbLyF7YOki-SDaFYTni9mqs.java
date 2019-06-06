package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.MessageModel.GetSnapInfoWithContentFromMessageByMessageIdCreator;
import com.snap.core.db.record.MessageModel.GetSnapInfoWithContentFromMessageByMessageIdModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$g54RJbLyF7YOki-SDaFYTni9mqs implements GetSnapInfoWithContentFromMessageByMessageIdCreator {
    public static final /* synthetic */ -$$Lambda$g54RJbLyF7YOki-SDaFYTni9mqs INSTANCE = new -$$Lambda$g54RJbLyF7YOki-SDaFYTni9mqs();

    private /* synthetic */ -$$Lambda$g54RJbLyF7YOki-SDaFYTni9mqs() {
    }

    public final GetSnapInfoWithContentFromMessageByMessageIdModel create(long j, String str, String str2, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, byte[] bArr) {
        return new AutoValue_MessageRecord_GetSnapInfoWithContentFromMessageByMessageId(j, str, str2, screenshottedOrReplayedState, l, bArr);
    }
}

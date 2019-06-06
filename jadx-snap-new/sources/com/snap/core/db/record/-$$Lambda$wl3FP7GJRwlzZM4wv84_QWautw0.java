package com.snap.core.db.record;

import com.snap.core.db.record.MessageModel.GetContentForMessagesCreator;
import com.snap.core.db.record.MessageModel.GetContentForMessagesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$wl3FP7GJRwlzZM4wv84_QWautw0 implements GetContentForMessagesCreator {
    public static final /* synthetic */ -$$Lambda$wl3FP7GJRwlzZM4wv84_QWautw0 INSTANCE = new -$$Lambda$wl3FP7GJRwlzZM4wv84_QWautw0();

    private /* synthetic */ -$$Lambda$wl3FP7GJRwlzZM4wv84_QWautw0() {
    }

    public final GetContentForMessagesModel create(long j, String str, String str2, String str3, byte[] bArr, long j2, String str4) {
        return new AutoValue_MessageRecord_GetContentForMessageModel(j, str, str2, str3, bArr, j2, str4);
    }
}

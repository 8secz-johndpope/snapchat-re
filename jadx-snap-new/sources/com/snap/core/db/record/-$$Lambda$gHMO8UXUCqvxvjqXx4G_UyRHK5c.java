package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.MessageDumpCreator;
import com.snap.core.db.record.MessageModel.MessageDumpModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$gHMO8UXUCqvxvjqXx4G_UyRHK5c implements MessageDumpCreator {
    public static final /* synthetic */ -$$Lambda$gHMO8UXUCqvxvjqXx4G_UyRHK5c INSTANCE = new -$$Lambda$gHMO8UXUCqvxvjqXx4G_UyRHK5c();

    private /* synthetic */ -$$Lambda$gHMO8UXUCqvxvjqXx4G_UyRHK5c() {
    }

    public final MessageDumpModel create(String str, long j, String str2, long j2, String str3, MessageClientStatus messageClientStatus, Long l, String str4, boolean z) {
        return new AutoValue_MessageRecord_MessageDump(str, j, str2, j2, str3, messageClientStatus, l, str4, z);
    }
}

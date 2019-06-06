package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetLastMessageForMessageClientStatusCreator;
import com.snap.core.db.record.MessageModel.GetLastMessageForMessageClientStatusModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$PC3UlOEn_28x4h2TM4Dh3wrgEqY implements GetLastMessageForMessageClientStatusCreator {
    public static final /* synthetic */ -$$Lambda$PC3UlOEn_28x4h2TM4Dh3wrgEqY INSTANCE = new -$$Lambda$PC3UlOEn_28x4h2TM4Dh3wrgEqY();

    private /* synthetic */ -$$Lambda$PC3UlOEn_28x4h2TM4Dh3wrgEqY() {
    }

    public final GetLastMessageForMessageClientStatusModel create(Long l, Long l2, String str, String str2, String str3, Long l3, MessageClientStatus messageClientStatus, long j) {
        return new AutoValue_MessageRecord_LastMessageWithClientStatus(l, l2, str, str2, str3, l3, messageClientStatus, j);
    }
}

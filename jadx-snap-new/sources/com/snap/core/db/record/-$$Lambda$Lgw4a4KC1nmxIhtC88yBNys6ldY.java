package com.snap.core.db.record;

import com.snap.core.db.record.MultiRecipientSnapModel.SelectMultiRecipientSnapsCreator;
import com.snap.core.db.record.MultiRecipientSnapModel.SelectMultiRecipientSnapsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Lgw4a4KC1nmxIhtC88yBNys6ldY implements SelectMultiRecipientSnapsCreator {
    public static final /* synthetic */ -$$Lambda$Lgw4a4KC1nmxIhtC88yBNys6ldY INSTANCE = new -$$Lambda$Lgw4a4KC1nmxIhtC88yBNys6ldY();

    private /* synthetic */ -$$Lambda$Lgw4a4KC1nmxIhtC88yBNys6ldY() {
    }

    public final SelectMultiRecipientSnapsModel create(long j, String str, String str2, String str3, Long l) {
        return new AutoValue_MultiRecipientSnapRecord_MultiRecipientSnap(j, str, str2, str3, l);
    }
}

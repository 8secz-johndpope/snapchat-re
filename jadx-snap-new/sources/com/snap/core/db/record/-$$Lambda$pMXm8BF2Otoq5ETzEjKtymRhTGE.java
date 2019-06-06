package com.snap.core.db.record;

import com.snap.core.db.column.DdmlRecord;
import com.snap.core.db.record.DdmlDataModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$pMXm8BF2Otoq5ETzEjKtymRhTGE implements Creator {
    public static final /* synthetic */ -$$Lambda$pMXm8BF2Otoq5ETzEjKtymRhTGE INSTANCE = new -$$Lambda$pMXm8BF2Otoq5ETzEjKtymRhTGE();

    private /* synthetic */ -$$Lambda$pMXm8BF2Otoq5ETzEjKtymRhTGE() {
    }

    public final DdmlDataModel create(long j, String str, DdmlRecord ddmlRecord, long j2) {
        return new AutoValue_DdmlDataRecord(j, str, ddmlRecord, j2);
    }
}

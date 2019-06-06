package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.SequenceNumbersModel.SelectSequenceNumbersForDeltaCreator;
import com.snap.core.db.record.SequenceNumbersModel.SelectSequenceNumbersForDeltaModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$oPzODBMsBTeTs0kla_vQuePj15s implements SelectSequenceNumbersForDeltaCreator {
    public static final /* synthetic */ -$$Lambda$oPzODBMsBTeTs0kla_vQuePj15s INSTANCE = new -$$Lambda$oPzODBMsBTeTs0kla_vQuePj15s();

    private /* synthetic */ -$$Lambda$oPzODBMsBTeTs0kla_vQuePj15s() {
    }

    public final SelectSequenceNumbersForDeltaModel create(long j, String str, FeedKind feedKind, SequenceNumbersModel sequenceNumbersModel) {
        return new AutoValue_SequenceNumbersRecord_ForDelta(j, str, feedKind, (SequenceNumbersRecord) sequenceNumbersModel);
    }
}

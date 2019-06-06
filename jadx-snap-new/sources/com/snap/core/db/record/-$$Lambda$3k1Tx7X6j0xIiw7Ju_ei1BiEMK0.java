package com.snap.core.db.record;

import com.snap.core.db.record.SequenceNumbersModel.SelectSequenceNumbersForDeltaMultipleCreator;
import com.snap.core.db.record.SequenceNumbersModel.SelectSequenceNumbersForDeltaMultipleModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$3k1Tx7X6j0xIiw7Ju_ei1BiEMK0 implements SelectSequenceNumbersForDeltaMultipleCreator {
    public static final /* synthetic */ -$$Lambda$3k1Tx7X6j0xIiw7Ju_ei1BiEMK0 INSTANCE = new -$$Lambda$3k1Tx7X6j0xIiw7Ju_ei1BiEMK0();

    private /* synthetic */ -$$Lambda$3k1Tx7X6j0xIiw7Ju_ei1BiEMK0() {
    }

    public final SelectSequenceNumbersForDeltaMultipleModel create(String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5) {
        return new AutoValue_SequenceNumbersRecord_ForMultipleDelta(str, str2, l, l2, l3, l4, l5);
    }
}

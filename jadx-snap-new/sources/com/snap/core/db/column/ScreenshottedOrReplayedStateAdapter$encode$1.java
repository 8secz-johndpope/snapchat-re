package com.snap.core.db.column;

import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class ScreenshottedOrReplayedStateAdapter$encode$1 extends akcs implements akbl<Record, String> {
    public static final ScreenshottedOrReplayedStateAdapter$encode$1 INSTANCE = new ScreenshottedOrReplayedStateAdapter$encode$1();

    ScreenshottedOrReplayedStateAdapter$encode$1() {
        super(1);
    }

    public final String invoke(Record record) {
        akcr.b(record, "it");
        return Record.Companion.toString(record);
    }
}

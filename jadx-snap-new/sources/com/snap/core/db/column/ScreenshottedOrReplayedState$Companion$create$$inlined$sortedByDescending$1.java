package com.snap.core.db.column;

import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import defpackage.ajzy;
import java.util.Comparator;

public final class ScreenshottedOrReplayedState$Companion$create$$inlined$sortedByDescending$1<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return ajzy.a(Long.valueOf(((Record) t2).getTimestamp()), Long.valueOf(((Record) t).getTimestamp()));
    }
}

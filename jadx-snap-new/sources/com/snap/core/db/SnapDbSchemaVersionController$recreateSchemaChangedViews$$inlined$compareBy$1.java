package com.snap.core.db;

import com.snap.core.db.SnapDbSchema.Tables;
import defpackage.ajzy;
import java.util.Comparator;

public final class SnapDbSchemaVersionController$recreateSchemaChangedViews$$inlined$compareBy$1<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return ajzy.a(Integer.valueOf(((Tables) t).ordinal()), Integer.valueOf(((Tables) t2).ordinal()));
    }
}

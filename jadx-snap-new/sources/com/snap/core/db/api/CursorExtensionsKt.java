package com.snap.core.db.api;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.akcr;

public final class CursorExtensionsKt {
    public static final <R> CursorSequence<R> asSequence(Cursor cursor, ainw<R> ainw) {
        akcr.b(cursor, "receiver$0");
        akcr.b(ainw, "mapper");
        return new CursorSequence(cursor, ainw);
    }
}

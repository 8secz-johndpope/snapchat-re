package com.snap.core.db.api;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.akcr;
import defpackage.akez;
import java.io.Closeable;

public final class CursorSequence<R> implements akez<R>, Closeable {
    private final Cursor cursor;
    private final ainw<R> mapper;

    public CursorSequence(Cursor cursor, ainw<R> ainw) {
        akcr.b(cursor, "cursor");
        akcr.b(ainw, "mapper");
        this.cursor = cursor;
        this.mapper = ainw;
    }

    public final void close() {
        this.cursor.close();
    }

    public final Cursor getCursor() {
        return this.cursor;
    }

    public final ainw<R> getMapper() {
        return this.mapper;
    }

    public final CursorIterator<R> iterator() {
        return new CursorIterator(this.cursor, this.mapper);
    }
}

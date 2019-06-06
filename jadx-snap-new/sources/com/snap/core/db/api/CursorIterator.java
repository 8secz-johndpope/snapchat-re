package com.snap.core.db.api;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.akcr;
import defpackage.akdh;
import java.util.Iterator;

public final class CursorIterator<R> implements akdh, Iterator<R> {
    private final Cursor cursor;
    private final ainw<R> mapper;

    public CursorIterator(Cursor cursor, ainw<R> ainw) {
        akcr.b(cursor, "cursor");
        akcr.b(ainw, "mapper");
        this.cursor = cursor;
        this.mapper = ainw;
    }

    public final Cursor getCursor() {
        return this.cursor;
    }

    public final ainw<R> getMapper() {
        return this.mapper;
    }

    public final boolean hasNext() {
        return this.cursor.getPosition() < this.cursor.getCount() - 1;
    }

    public final R next() {
        this.cursor.moveToNext();
        return this.mapper.map(this.cursor);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

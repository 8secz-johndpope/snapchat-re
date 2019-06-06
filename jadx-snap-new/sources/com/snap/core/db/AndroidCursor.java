package com.snap.core.db;

import android.database.Cursor;
import defpackage.ainn;
import defpackage.akcr;

public final class AndroidCursor implements ainn {
    private final Cursor cursor;

    public AndroidCursor(Cursor cursor) {
        akcr.b(cursor, "cursor");
        this.cursor = cursor;
    }

    public final void close() {
        this.cursor.close();
    }

    public final byte[] getBytes(int i) {
        return this.cursor.isNull(i) ? null : this.cursor.getBlob(i);
    }

    public final Double getDouble(int i) {
        return this.cursor.isNull(i) ? null : Double.valueOf(this.cursor.getDouble(i));
    }

    public final Long getLong(int i) {
        return this.cursor.isNull(i) ? null : Long.valueOf(this.cursor.getLong(i));
    }

    public final String getString(int i) {
        return this.cursor.isNull(i) ? null : this.cursor.getString(i);
    }

    public final boolean next() {
        return this.cursor.moveToNext();
    }
}

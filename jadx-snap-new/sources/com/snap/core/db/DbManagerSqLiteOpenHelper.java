package com.snap.core.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

@Deprecated
public abstract class DbManagerSqLiteOpenHelper extends SQLiteOpenHelper {
    protected DbManagerSqLiteOpenHelper(Context context, String str, CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i, null);
    }

    public abstract void deleteDatabase();

    /* Access modifiers changed, original: 0000 */
    public void initializeDatabase() {
        super.getWritableDatabase();
    }
}

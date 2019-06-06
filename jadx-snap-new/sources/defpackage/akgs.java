package defpackage;

import android.database.Cursor;

/* renamed from: akgs */
public final class akgs {
    public static void a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}

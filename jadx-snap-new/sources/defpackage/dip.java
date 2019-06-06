package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* renamed from: dip */
public final class dip {
    static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s %s DEFAULT %s", new Object[]{str, str2, str3, str4}));
    }
}

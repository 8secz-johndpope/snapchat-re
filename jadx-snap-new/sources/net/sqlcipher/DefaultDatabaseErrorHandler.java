package net.sqlcipher;

import android.util.Log;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private final String TAG = getClass().getSimpleName();

    private void deleteDatabaseFile(String str) {
        if (!(str.equalsIgnoreCase(":memory:") || str.trim().length() == 0)) {
            Log.e(this.TAG, "deleting the database file: ".concat(String.valueOf(str)));
            try {
                new File(str).delete();
            } catch (Exception e) {
                String str2 = this.TAG;
                StringBuilder stringBuilder = new StringBuilder("delete failed: ");
                stringBuilder.append(e.getMessage());
                Log.w(str2, stringBuilder.toString());
            }
        }
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String str = this.TAG;
        StringBuilder stringBuilder = new StringBuilder("Corruption reported by sqlite on database, deleting: ");
        stringBuilder.append(sQLiteDatabase.getPath());
        Log.e(str, stringBuilder.toString());
        if (sQLiteDatabase.isOpen()) {
            Log.e(this.TAG, "Database object for corrupted database is already open, closing");
            try {
                sQLiteDatabase.close();
            } catch (Exception e) {
                Log.e(this.TAG, "Exception closing Database object for corrupted database, ignored", e);
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }
}

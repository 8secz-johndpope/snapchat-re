package com.snap.core.db.api;

import android.content.Context;
import defpackage.akcr;
import defpackage.akgb;

public final class SnapSqliteHelperKt {
    public static final String IN_MEMORY_DB_NAME = ":memory:";
    private static final String TAG = "SnapDb";

    public static final void deleteDatabaseFile(Context context, String str) {
        akcr.b(context, "context");
        akcr.b(str, "fileName");
        if (!isInMemoryDatabase(str)) {
            CharSequence charSequence = str;
            int length = charSequence.length() - 1;
            int i = 0;
            Object obj = null;
            while (i <= length) {
                Object obj2 = charSequence.charAt(obj == null ? i : length) <= ' ' ? 1 : null;
                if (obj != null) {
                    if (obj2 == null) {
                        break;
                    }
                    length--;
                } else if (obj2 == null) {
                    obj = 1;
                } else {
                    i++;
                }
            }
            if (charSequence.subSequence(i, length + 1).toString().length() != 0) {
                try {
                    context.deleteDatabase(str);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static final String getNormalizedDatabaseName(String str) {
        akcr.b(str, "fileName");
        return isInMemoryDatabase(str) ? null : str;
    }

    private static final boolean isInMemoryDatabase(String str) {
        return akgb.a(str, ":memory:", true);
    }
}

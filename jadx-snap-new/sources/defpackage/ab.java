package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: ab */
public interface ab {

    /* renamed from: ab$b */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* renamed from: ab$b$a */
        public static class a {
            public String a;
            public a b;
            private Context c;

            a(Context context) {
                this.c = context;
            }

            public final b a() {
                a aVar = this.b;
                if (aVar != null) {
                    Context context = this.c;
                    if (context != null) {
                        return new b(context, this.a, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }
        }

        b(Context context, String str, a aVar) {
            this.a = context;
            this.b = str;
            this.c = aVar;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* renamed from: ab$c */
    public interface c {
        ab a(b bVar);
    }

    /* renamed from: ab$a */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public static void a(String str) {
            if (!(str.equalsIgnoreCase(":memory:") || str.trim().length() == 0)) {
                String concat = "deleting the database file: ".concat(String.valueOf(str));
                String str2 = "SupportSQLite";
                Log.w(str2, concat);
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e(str2, "Could not delete the database file ".concat(String.valueOf(str)));
                        }
                    } catch (Exception e) {
                        Log.e(str2, "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w(str2, "delete failed: ", e2);
                }
            }
        }

        public abstract void a(aa aaVar);

        public abstract void a(aa aaVar, int i, int i2);

        public void b(aa aaVar) {
        }

        public void b(aa aaVar, int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder("Can't downgrade database from version ");
            stringBuilder.append(i);
            stringBuilder.append(" to ");
            stringBuilder.append(i2);
            throw new SQLiteException(stringBuilder.toString());
        }
    }

    void close();

    aa getReadableDatabase();

    aa getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}

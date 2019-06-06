package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: pb */
public interface pb {

    /* renamed from: pb$b */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* renamed from: pb$b$a */
        public static class a {
            public String a;
            public a b;
            private Context c;

            a(Context context) {
                this.c = context;
            }

            public final a a(String str) {
                this.a = str;
                return this;
            }

            public final a a(a aVar) {
                this.b = aVar;
                return this;
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

    /* renamed from: pb$a */
    public static abstract class a {
        private static final String TAG = "SupportSQLite";
        public final int version;

        public a(int i) {
            this.version = i;
        }

        private void deleteDatabaseFile(String str) {
            if (!(str.equalsIgnoreCase(":memory:") || str.trim().length() == 0)) {
                String concat = "deleting the database file: ".concat(String.valueOf(str));
                String str2 = TAG;
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

        public void onConfigure(pa paVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002d */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002b A:{ExcHandler: all (th java.lang.Throwable), PHI: r0 , Splitter:B:5:0x0026} */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing block: B:10:0x0031, code skipped:
            if (r0 != null) goto L_0x0033;
     */
        /* JADX WARNING: Missing block: B:11:0x0033, code skipped:
            r3 = r0.iterator();
     */
        /* JADX WARNING: Missing block: B:13:0x003b, code skipped:
            if (r3.hasNext() != false) goto L_0x003d;
     */
        /* JADX WARNING: Missing block: B:14:0x003d, code skipped:
            deleteDatabaseFile((java.lang.String) ((android.util.Pair) r3.next()).second);
     */
        /* JADX WARNING: Missing block: B:15:0x004b, code skipped:
            deleteDatabaseFile(r3.m());
     */
        public void onCorruption(defpackage.pa r3) {
            /*
            r2 = this;
            r0 = new java.lang.StringBuilder;
            r1 = "Corruption reported by sqlite on database: ";
            r0.<init>(r1);
            r1 = r3.m();
            r0.append(r1);
            r0 = r0.toString();
            r1 = "SupportSQLite";
            android.util.Log.e(r1, r0);
            r0 = r3.l();
            if (r0 != 0) goto L_0x0025;
        L_0x001d:
            r3 = r3.m();
            r2.deleteDatabaseFile(r3);
            return;
        L_0x0025:
            r0 = 0;
            r0 = r3.q();	 Catch:{ SQLiteException -> 0x002d, all -> 0x002b }
            goto L_0x002d;
        L_0x002b:
            r1 = move-exception;
            goto L_0x0031;
        L_0x002d:
            r3.close();	 Catch:{ IOException -> 0x0053, all -> 0x002b }
            goto L_0x0053;
        L_0x0031:
            if (r0 == 0) goto L_0x004b;
        L_0x0033:
            r3 = r0.iterator();
        L_0x0037:
            r0 = r3.hasNext();
            if (r0 == 0) goto L_0x0052;
        L_0x003d:
            r0 = r3.next();
            r0 = (android.util.Pair) r0;
            r0 = r0.second;
            r0 = (java.lang.String) r0;
            r2.deleteDatabaseFile(r0);
            goto L_0x0037;
        L_0x004b:
            r3 = r3.m();
            r2.deleteDatabaseFile(r3);
        L_0x0052:
            throw r1;
        L_0x0053:
            if (r0 == 0) goto L_0x001d;
        L_0x0055:
            r3 = r0.iterator();
        L_0x0059:
            r0 = r3.hasNext();
            if (r0 == 0) goto L_0x006d;
        L_0x005f:
            r0 = r3.next();
            r0 = (android.util.Pair) r0;
            r0 = r0.second;
            r0 = (java.lang.String) r0;
            r2.deleteDatabaseFile(r0);
            goto L_0x0059;
        L_0x006d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pb$a.onCorruption(pa):void");
        }

        public abstract void onCreate(pa paVar);

        public void onDowngrade(pa paVar, int i, int i2) {
            StringBuilder stringBuilder = new StringBuilder("Can't downgrade database from version ");
            stringBuilder.append(i);
            stringBuilder.append(" to ");
            stringBuilder.append(i2);
            throw new SQLiteException(stringBuilder.toString());
        }

        public void onOpen(pa paVar) {
        }

        public abstract void onUpgrade(pa paVar, int i, int i2);
    }

    /* renamed from: pb$c */
    public interface c {
        pb a(b bVar);
    }

    String a();

    void a(boolean z);

    pa b();

    pa c();

    void d();
}

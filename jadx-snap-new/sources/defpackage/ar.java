package defpackage;

import android.database.Cursor;
import defpackage.ab.a;

/* renamed from: ar */
public final class ar extends a {
    private ak b;
    private final a c;
    private final String d;
    private final String e;

    /* renamed from: ar$a */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a();

        public abstract void a(aa aaVar);

        public abstract void b(aa aaVar);

        public abstract void c(aa aaVar);

        public abstract void d(aa aaVar);
    }

    public ar(ak akVar, a aVar, String str) {
        this(akVar, aVar, "", str);
    }

    public ar(ak akVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = akVar;
        this.c = aVar;
        this.d = str;
        this.e = str2;
    }

    private void c(aa aaVar) {
        ar.d(aaVar);
        aaVar.execSQL(aq.a(this.d));
    }

    private static void d(aa aaVar) {
        aaVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean e(aa aaVar) {
        Cursor query = aaVar.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (query.moveToFirst() && query.getInt(0) != 0) {
                z = true;
            }
            query.close();
            return z;
        } catch (Throwable th) {
            query.close();
        }
    }

    public final void a(aa aaVar) {
        c(aaVar);
        this.c.b(aaVar);
        this.c.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    public final void a(defpackage.aa r6, int r7, int r8) {
        /*
        r5 = this;
        r0 = r5.b;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x003c;
    L_0x0006:
        r0 = r0.d;
        if (r7 != r8) goto L_0x000f;
    L_0x000a:
        r0 = java.util.Collections.emptyList();
        goto L_0x001d;
    L_0x000f:
        if (r8 <= r7) goto L_0x0013;
    L_0x0011:
        r3 = 1;
        goto L_0x0014;
    L_0x0013:
        r3 = 0;
    L_0x0014:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r0.a(r4, r3, r7, r8);
    L_0x001d:
        if (r0 == 0) goto L_0x003c;
    L_0x001f:
        r0 = r0.iterator();
    L_0x0023:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0033;
    L_0x0029:
        r2 = r0.next();
        r2 = (defpackage.au) r2;
        r2.a(r6);
        goto L_0x0023;
    L_0x0033:
        r0 = r5.c;
        r0.d(r6);
        r5.c(r6);
        goto L_0x003d;
    L_0x003c:
        r1 = 0;
    L_0x003d:
        if (r1 != 0) goto L_0x0073;
    L_0x003f:
        r0 = r5.b;
        if (r0 == 0) goto L_0x0052;
    L_0x0043:
        r0 = r0.h;
        if (r0 != 0) goto L_0x0052;
    L_0x0047:
        r7 = r5.c;
        r7.a(r6);
        r7 = r5.c;
        r7.b(r6);
        return;
    L_0x0052:
        r6 = new java.lang.IllegalStateException;
        r0 = new java.lang.StringBuilder;
        r1 = "A migration from ";
        r0.<init>(r1);
        r0.append(r7);
        r7 = " to ";
        r0.append(r7);
        r0.append(r8);
        r7 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.";
        r0.append(r7);
        r7 = r0.toString();
        r6.<init>(r7);
        throw r6;
    L_0x0073:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.a(aa, int, int):void");
    }

    public final void b(aa aaVar) {
        Object string;
        super.b(aaVar);
        if (ar.e(aaVar)) {
            Cursor query = aaVar.query(new z("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                string = query.moveToFirst() ? query.getString(0) : null;
                query.close();
            } catch (Throwable th) {
                query.close();
            }
        } else {
            string = null;
        }
        if (this.d.equals(string) || this.e.equals(string)) {
            this.c.c(aaVar);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
    }

    public final void b(aa aaVar, int i, int i2) {
        a(aaVar, i, i2);
    }
}

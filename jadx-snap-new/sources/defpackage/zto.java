package defpackage;

import android.content.Context;
import defpackage.akdd.d;
import defpackage.akdd.e;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: zto */
public final class zto implements gfo {
    final Context a;
    final ajwy<ilv> b;
    final ajwy<ihh> c;
    private final idd d = ztg.a.callsite("MemoriesMEOMigrationProcessor");
    private final ajwy<gqr> e;

    /* renamed from: zto$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zto$b */
    enum b {
        SUCCESS,
        SKIPPED,
        FAILED
    }

    /* renamed from: zto$c */
    static final class c implements Runnable {
        private /* synthetic */ File a;

        c(File file) {
            this.a = file;
        }

        public final void run() {
            new File(this.a, "gallery/gaLSOqnw0QE26xlb").delete();
            new File(this.a, "gallery/shappsahghks").delete();
        }
    }

    /* renamed from: zto$d */
    static final class d implements Runnable {
        private /* synthetic */ zto a;
        private /* synthetic */ defpackage.akdd.d b;
        private /* synthetic */ File c;
        private /* synthetic */ e d;

        d(zto zto, defpackage.akdd.d dVar, File file, e eVar) {
            this.a = zto;
            this.b = dVar;
            this.c = file;
            this.d = eVar;
        }

        public final void run() {
            this.b.a = ((ihh) this.a.c.get()).a();
            Object databasePath = this.a.a.getDatabasePath("gallery_database_encrypted.db");
            akcr.a(databasePath, "context.getDatabasePath(SQLITE_DB_NAME)");
            if (zto.c(databasePath)) {
                boolean a = this.a.a(this.a.a(this.c), this.a.b(this.c));
                this.d.a = a ? b.SUCCESS : b.FAILED;
            }
        }
    }

    /* renamed from: zto$e */
    static final class e implements ajev {
        private /* synthetic */ zto a;
        private /* synthetic */ d b;
        private /* synthetic */ defpackage.akdd.e c;

        e(zto zto, d dVar, defpackage.akdd.e eVar) {
            this.a = zto;
            this.b = dVar;
            this.c = eVar;
        }

        public final void run() {
            long a = ((ihh) this.a.c.get()).a() - this.b.a;
            String str = "result";
            ((ilv) this.a.b.get()).c(iom.MIGRATE_MEO_ATTEMPT.a(str, (Enum) (b) this.c.a), 1);
            ((ilv) this.a.b.get()).a(iom.MIGRATE_MEO_ATTEMPT.a(str, (Enum) (b) this.c.a), a);
        }
    }

    static {
        a aVar = new a();
    }

    public zto(Context context, ajwy<ilv> ajwy, ajwy<gqr> ajwy2, ajwy<ihh> ajwy3) {
        akcr.b(context, "context");
        akcr.b(ajwy, "graphene");
        akcr.b(ajwy2, "exceptionTracker");
        akcr.b(ajwy3, "clock");
        this.a = context;
        this.b = ajwy;
        this.e = ajwy2;
        this.c = ajwy3;
    }

    private final boolean a() {
        try {
            SQLiteDatabase.loadLibs(this.a);
            return true;
        } catch (Exception e) {
            ((gqr) this.e.get()).a(gqt.NORMAL, e, this.d.a("SQLCipherLibLoad"));
            return false;
        }
    }

    static boolean c(File file) {
        try {
            return file.exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0097, code skipped:
            defpackage.akax.a(r1, r6);
     */
    private final java.lang.String d(java.io.File r6) {
        /*
        r5 = this;
        r6 = defpackage.abrg.a(r6);
        r0 = "Files.openBufferedInputStream(file)";
        defpackage.akcr.a(r6, r0);
        r0 = "AES/GCM/NoPadding";
        r0 = javax.crypto.Cipher.getInstance(r0);
        r1 = r5.a;
        r1 = r1.getContentResolver();
        r2 = "android_id";
        r1 = android.provider.Settings.Secure.getString(r1, r2);
        if (r1 != 0) goto L_0x001f;
    L_0x001d:
        r1 = android.os.Build.FINGERPRINT;
    L_0x001f:
        r2 = "SHA-256";
        r2 = java.security.MessageDigest.getInstance(r2);
        if (r1 != 0) goto L_0x002a;
    L_0x0027:
        defpackage.akcr.a();
    L_0x002a:
        r3 = defpackage.akfp.a;
        if (r1 == 0) goto L_0x009b;
    L_0x002e:
        r1 = r1.getBytes(r3);
        r3 = "(this as java.lang.String).getBytes(charset)";
        defpackage.akcr.a(r1, r3);
        r2.update(r1);
        r1 = defpackage.akfp.a;
        r4 = "x7a1uiku7j888rh";
        r1 = r4.getBytes(r1);
        defpackage.akcr.a(r1, r3);
        r2.update(r1);
        r1 = r2.digest();
        r2 = new javax.crypto.spec.SecretKeySpec;
        r4 = "AES";
        r2.<init>(r1, r4);
        r2 = (java.security.Key) r2;
        r1 = defpackage.akfp.a;
        r4 = "j6eec6bezhjfux7";
        r1 = r4.getBytes(r1);
        defpackage.akcr.a(r1, r3);
        r3 = 2;
        r4 = new javax.crypto.spec.IvParameterSpec;
        r4.<init>(r1);
        r4 = (java.security.spec.AlgorithmParameterSpec) r4;
        r0.init(r3, r2, r4);
        r1 = "cipher";
        defpackage.akcr.a(r0, r1);
        r1 = new abmw;
        r6 = (java.io.InputStream) r6;
        r1.<init>(r6, r0);
        r1 = (java.io.Closeable) r1;
        r6 = 0;
        r0 = r1;
        r0 = (defpackage.abmw) r0;	 Catch:{ Throwable -> 0x0095 }
        r0 = (java.io.InputStream) r0;	 Catch:{ Throwable -> 0x0095 }
        r0 = defpackage.abrg.b(r0);	 Catch:{ Throwable -> 0x0095 }
        r2 = "Files.toByteArray(it)";
        defpackage.akcr.a(r0, r2);	 Catch:{ Throwable -> 0x0095 }
        r2 = defpackage.akfp.a;	 Catch:{ Throwable -> 0x0095 }
        r3 = new java.lang.String;	 Catch:{ Throwable -> 0x0095 }
        r3.<init>(r0, r2);	 Catch:{ Throwable -> 0x0095 }
        defpackage.akax.a(r1, r6);
        return r3;
    L_0x0093:
        r0 = move-exception;
        goto L_0x0097;
    L_0x0095:
        r6 = move-exception;
        throw r6;	 Catch:{ all -> 0x0093 }
    L_0x0097:
        defpackage.akax.a(r1, r6);
        throw r0;
    L_0x009b:
        r6 = new ajxt;
        r0 = "null cannot be cast to non-null type java.lang.String";
        r6.<init>(r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zto.d(java.io.File):java.lang.String");
    }

    public final ajcx a(File file, File file2, boolean z) {
        akcr.b(file, "internalFilesDir");
        akcr.b(file2, "migrationDir");
        d dVar = new d();
        dVar.a = 0;
        e eVar = new e();
        eVar.a = b.SKIPPED;
        ajcx a = ajcx.a((Runnable) new d(this, dVar, file, eVar)).a(ajfu.g);
        Object a2 = ajcx.a((Runnable) new c(file)).a(ajfu.g);
        akcr.a(a2, "Completable.fromRunnable…      }.onErrorComplete()");
        a2 = a.b((ajdb) a2).b((ajev) new e(this, dVar, eVar));
        akcr.a(a2, "Completable.fromRunnable…      )\n                }");
        return a2;
    }

    /* Access modifiers changed, original: final */
    public final String a(File file) {
        File file2 = new File(file, "gallery/gaLSOqnw0QE26xlb");
        String str = null;
        if (!zto.c(file2)) {
            return null;
        }
        try {
            str = d(file2);
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x005e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:3|(1:5)|(1:7)|8|9|10|11|12|13|(4:15|16|17|18)(7:20|21|22|23|24|25|(2:28|29)(2:30|31))) */
    /* JADX WARNING: Missing block: B:35:0x013f, code skipped:
            r7 = move-exception;
     */
    /* JADX WARNING: Missing block: B:36:0x0140, code skipped:
            ((defpackage.ilv) r6.b.get()).c(defpackage.iom.MIGRATE_MEO_DB_UNLOCK.a(r3, false), 1);
            ((defpackage.gqr) r6.e.get()).a(defpackage.gqt.NORMAL, r7, r6.d.a("SQLCipherUnlock"));
     */
    /* JADX WARNING: Missing block: B:37:0x0168, code skipped:
            return false;
     */
    public final boolean a(java.lang.String r7, java.lang.String r8) {
        /*
        r6 = this;
        r0 = r6.a();
        r1 = r6.b;
        r1 = r1.get();
        r1 = (defpackage.ilv) r1;
        r2 = defpackage.iom.MIGRATE_MEO_LIB_LOAD;
        r3 = "success";
        r2 = r2.a(r3, r0);
        r1.c(r2, 1);
        r1 = 0;
        if (r0 != 0) goto L_0x001b;
    L_0x001a:
        return r1;
    L_0x001b:
        r0 = "signature";
        if (r7 != 0) goto L_0x0032;
    L_0x001f:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (defpackage.ilv) r2;
        r4 = defpackage.iom.MIGRATE_MEO_DB_KEY_MISSING;
        r5 = "original";
        r4 = r4.a(r0, r5);
        r2.c(r4, 1);
    L_0x0032:
        if (r8 != 0) goto L_0x0047;
    L_0x0034:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (defpackage.ilv) r2;
        r4 = defpackage.iom.MIGRATE_MEO_DB_KEY_MISSING;
        r5 = "rekeyed";
        r0 = r4.a(r0, r5);
        r2.c(r0, 1);
    L_0x0047:
        r0 = r6.a;
        r2 = "gallery_database_encrypted.db";
        r0 = r0.getDatabasePath(r2);
        r2 = "context.getDatabasePath(SQLITE_DB_NAME)";
        defpackage.akcr.a(r0, r2);
        r0 = r0.getPath();
        r2 = 0;
        r7 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r0, r8, r2);	 Catch:{ Exception -> 0x005e }
        goto L_0x0062;
    L_0x005e:
        r7 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r0, r7, r2);	 Catch:{ Exception -> 0x013f }
    L_0x0062:
        r8 = r6.b;
        r8 = r8.get();
        r8 = (defpackage.ilv) r8;
        r0 = defpackage.iom.MIGRATE_MEO_DB_UNLOCK;
        r4 = 1;
        r0 = r0.a(r3, r4);
        r8.c(r0, 1);
        r8 = r6.a;
        r0 = "user_session_shared_pref";
        r8 = r8.getSharedPreferences(r0, r1);
        r0 = "key_user_id";
        r8 = r8.getString(r0, r2);
        r0 = "db";
        if (r8 != 0) goto L_0x009c;
    L_0x0086:
        r8 = r6.b;
        r8 = r8.get();
        r8 = (defpackage.ilv) r8;
        r2 = defpackage.iom.MIGRATE_MEO_USER_ID_MISSING;
        r2 = (defpackage.ily) r2;
        r8.c(r2, 1);
        defpackage.akcr.a(r7, r0);
        r7.close();	 Catch:{ Exception -> 0x009b }
    L_0x009b:
        return r1;
    L_0x009c:
        defpackage.akcr.a(r7, r0);	 Catch:{ Exception -> 0x0115 }
        r8 = defpackage.ztn.a(r7, r8);	 Catch:{ Exception -> 0x0115 }
        r0 = r6.b;
        r0 = r0.get();
        r0 = (defpackage.ilv) r0;
        r2 = defpackage.iom.MIGRATE_MEO_DB_READ;
        r2 = r2.a(r3, r4);
        r0.c(r2, 1);
        r7.close();	 Catch:{ Exception -> 0x00b7 }
    L_0x00b7:
        r7 = "available";
        if (r8 != 0) goto L_0x00cd;
    L_0x00bb:
        r8 = r6.b;
        r8 = r8.get();
        r8 = (defpackage.ilv) r8;
        r0 = defpackage.iom.MIGRATE_MEO_KEY_AVAILABLE;
        r7 = r0.a(r7, r1);
        r8.c(r7, 1);
        return r1;
    L_0x00cd:
        r0 = r6.b;
        r0 = r0.get();
        r0 = (defpackage.ilv) r0;
        r2 = defpackage.iom.MIGRATE_MEO_KEY_AVAILABLE;
        r7 = r2.a(r7, r4);
        r0.c(r7, 1);
        r7 = r6.a;
        r0 = "dataMigrationConfig";
        r7 = r7.getSharedPreferences(r0, r1);
        r7 = r7.edit();
        r0 = r8.a;
        r1 = "meo_hashed_passcode";
        r7.putString(r1, r0);
        r0 = r8.b;
        r1 = "meo_master_key";
        r7.putString(r1, r0);
        r8 = r8.c;
        r0 = "meo_master_iv";
        r7.putString(r0, r8);
        r7 = r7.commit();
        r8 = r6.b;
        r8 = r8.get();
        r8 = (defpackage.ilv) r8;
        r0 = defpackage.iom.MIGRATE_MEO_KEY_STORED;
        r0 = r0.a(r3, r7);
        r8.c(r0, 1);
        return r7;
    L_0x0115:
        r7 = move-exception;
        r8 = r6.b;
        r8 = r8.get();
        r8 = (defpackage.ilv) r8;
        r0 = defpackage.iom.MIGRATE_MEO_DB_READ;
        r0 = r0.a(r3, r1);
        r8.c(r0, 1);
        r8 = r6.e;
        r8 = r8.get();
        r8 = (defpackage.gqr) r8;
        r0 = defpackage.gqt.NORMAL;
        r7 = (java.lang.Throwable) r7;
        r2 = r6.d;
        r3 = "SQLCipherRead";
        r2 = r2.a(r3);
        r8.a(r0, r7, r2);
        return r1;
    L_0x013f:
        r7 = move-exception;
        r8 = r6.b;
        r8 = r8.get();
        r8 = (defpackage.ilv) r8;
        r0 = defpackage.iom.MIGRATE_MEO_DB_UNLOCK;
        r0 = r0.a(r3, r1);
        r8.c(r0, 1);
        r8 = r6.e;
        r8 = r8.get();
        r8 = (defpackage.gqr) r8;
        r0 = defpackage.gqt.NORMAL;
        r7 = (java.lang.Throwable) r7;
        r2 = r6.d;
        r3 = "SQLCipherUnlock";
        r2 = r2.a(r3);
        r8.a(r0, r7, r2);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zto.a(java.lang.String, java.lang.String):boolean");
    }

    /* Access modifiers changed, original: final */
    public final String b(File file) {
        File file2 = new File(file, "gallery/shappsahghks");
        String str = null;
        if (!zto.c(file2)) {
            return null;
        }
        try {
            str = d(file2);
            return str;
        } catch (Exception unused) {
            return str;
        }
    }
}

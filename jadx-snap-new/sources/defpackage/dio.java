package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: dio */
public final class dio extends SQLiteOpenHelper {
    private static List<String> a = ImmutableList.of("APP_APPLICATION_OPEN", "APP_SESSION_START", "APP_SESSION_END", "DIRECT_SNAP_CREATE");
    private final File b;
    private final String c;
    private final dip d;
    private final abss e;
    private final ilv f;
    private final String g;
    private Long h;
    private Long i;
    private Long j;

    /* renamed from: dio$a */
    public static class a {
        public final Map<String, Integer> a;
        public final String b;

        public a(Map<String, Integer> map, String str) {
            this.a = map;
            this.b = str;
        }
    }

    public dio(String str, Context context, abss abss, ilv ilv) {
        this(str, context, new dip(), abss, ilv);
    }

    private dio(String str, Context context, dip dip, abss abss, ilv ilv) {
        super(context, "com.snapchat.android.analytics.framework".concat(String.valueOf(str)), null, 4);
        this.h = null;
        this.i = null;
        this.j = null;
        this.c = String.format("%s%s", new Object[]{"com.snapchat.android.analytics.framework", str});
        this.b = context.getDatabasePath(this.c);
        this.d = dip;
        this.e = abss;
        this.f = ilv;
        this.g = str;
    }

    private synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (SQLiteException e) {
                throw new diq(1, e);
            } catch (IllegalStateException e2) {
                throw new diq(2, e2);
            }
        }
    }

    private static String b(List<dks> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (dks dks : list) {
            stringBuilder.append(dih.a(dks.a));
            stringBuilder.append(10);
        }
        return stringBuilder.toString();
    }

    private synchronized long f() {
        Long valueOf;
        try {
            valueOf = Long.valueOf(getReadableDatabase().compileStatement("SELECT COUNT(*) FROM events").simpleQueryForLong());
            this.h = valueOf;
        } catch (SQLiteException e) {
            throw new diq(1, e);
        }
        return valueOf.longValue();
    }

    private synchronized long g() {
        if (this.i != null) {
            return this.i.longValue();
        }
        return h();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x002a */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:7:?, code skipped:
            r5.f.c(defpackage.ino.SEQID_SAVE_EXCEPTION.a("logQ", defpackage.dih.b(r5.g)), 1);
     */
    /* JADX WARNING: Missing block: B:9:0x0040, code skipped:
            return;
     */
    private synchronized void g(long r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.getWritableDatabase();	 Catch:{ SQLiteException -> 0x002a }
        r1 = new android.content.ContentValues;	 Catch:{ SQLiteException -> 0x002a }
        r1.<init>();	 Catch:{ SQLiteException -> 0x002a }
        r2 = "_int_value";
        r3 = java.lang.Long.valueOf(r6);	 Catch:{ SQLiteException -> 0x002a }
        r1.put(r2, r3);	 Catch:{ SQLiteException -> 0x002a }
        r2 = "sequence_id";
        r3 = "_key=?";
        r4 = "last_used";
        r4 = new java.lang.String[]{r4};	 Catch:{ SQLiteException -> 0x002a }
        r0.update(r2, r1, r3, r4);	 Catch:{ SQLiteException -> 0x002a }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ SQLiteException -> 0x002a }
        r5.j = r6;	 Catch:{ SQLiteException -> 0x002a }
        monitor-exit(r5);
        return;
    L_0x0028:
        r6 = move-exception;
        goto L_0x0041;
    L_0x002a:
        r6 = r5.f;	 Catch:{ all -> 0x0028 }
        r7 = defpackage.ino.SEQID_SAVE_EXCEPTION;	 Catch:{ all -> 0x0028 }
        r0 = "logQ";
        r1 = r5.g;	 Catch:{ all -> 0x0028 }
        r1 = defpackage.dih.b(r1);	 Catch:{ all -> 0x0028 }
        r7 = r7.a(r0, r1);	 Catch:{ all -> 0x0028 }
        r0 = 1;
        r6.c(r7, r0);	 Catch:{ all -> 0x0028 }
        monitor-exit(r5);
        return;
    L_0x0041:
        throw r6;	 Catch:{ all -> 0x0042 }
    L_0x0042:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.g(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0077 in {6, 9, 15, 17, 20} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private synchronized long h() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = 1;
        r1 = r9.getReadableDatabase();	 Catch:{ SQLiteException -> 0x006c }
        r2 = new java.util.ArrayList;	 Catch:{ SQLiteException -> 0x006c }
        r3 = defpackage.dhx.c;	 Catch:{ SQLiteException -> 0x006c }
        r3 = r3.size();	 Catch:{ SQLiteException -> 0x006c }
        r2.<init>(r3);	 Catch:{ SQLiteException -> 0x006c }
        r3 = defpackage.dhx.c;	 Catch:{ SQLiteException -> 0x006c }
        r3 = r3.iterator();	 Catch:{ SQLiteException -> 0x006c }
        r4 = r3.hasNext();	 Catch:{ SQLiteException -> 0x006c }
        r5 = 2;	 Catch:{ SQLiteException -> 0x006c }
        r6 = 0;	 Catch:{ SQLiteException -> 0x006c }
        if (r4 == 0) goto L_0x0037;	 Catch:{ SQLiteException -> 0x006c }
        r4 = r3.next();	 Catch:{ SQLiteException -> 0x006c }
        r4 = (java.lang.String) r4;	 Catch:{ SQLiteException -> 0x006c }
        r7 = "%s LIKE '%%\"event_name\":\"%s\"%%'";	 Catch:{ SQLiteException -> 0x006c }
        r5 = new java.lang.Object[r5];	 Catch:{ SQLiteException -> 0x006c }
        r8 = "event";	 Catch:{ SQLiteException -> 0x006c }
        r5[r6] = r8;	 Catch:{ SQLiteException -> 0x006c }
        r5[r0] = r4;	 Catch:{ SQLiteException -> 0x006c }
        r4 = java.lang.String.format(r7, r5);	 Catch:{ SQLiteException -> 0x006c }
        r2.add(r4);	 Catch:{ SQLiteException -> 0x006c }
        goto L_0x0017;	 Catch:{ SQLiteException -> 0x006c }
        r3 = java.util.Locale.US;	 Catch:{ SQLiteException -> 0x006c }
        r4 = "SELECT COUNT(%s) FROM %s WHERE %s";	 Catch:{ SQLiteException -> 0x006c }
        r7 = 3;	 Catch:{ SQLiteException -> 0x006c }
        r7 = new java.lang.Object[r7];	 Catch:{ SQLiteException -> 0x006c }
        r8 = "id";	 Catch:{ SQLiteException -> 0x006c }
        r7[r6] = r8;	 Catch:{ SQLiteException -> 0x006c }
        r6 = "events";	 Catch:{ SQLiteException -> 0x006c }
        r7[r0] = r6;	 Catch:{ SQLiteException -> 0x006c }
        r6 = " OR ";	 Catch:{ SQLiteException -> 0x006c }
        r6 = com.google.common.base.Joiner.on(r6);	 Catch:{ SQLiteException -> 0x006c }
        r2 = r6.join(r2);	 Catch:{ SQLiteException -> 0x006c }
        r7[r5] = r2;	 Catch:{ SQLiteException -> 0x006c }
        r2 = java.lang.String.format(r3, r4, r7);	 Catch:{ SQLiteException -> 0x006c }
        r1 = r1.compileStatement(r2);	 Catch:{ SQLiteException -> 0x006c }
        r1 = r1.simpleQueryForLong();	 Catch:{ SQLiteException -> 0x006c }
        r1 = java.lang.Long.valueOf(r1);	 Catch:{ SQLiteException -> 0x006c }
        r9.i = r1;	 Catch:{ SQLiteException -> 0x006c }
        r0 = r1.longValue();	 Catch:{ SQLiteException -> 0x006c }
        monitor-exit(r9);
        return r0;
        r0 = move-exception;
        goto L_0x0073;
        r1 = move-exception;
        r2 = new diq;	 Catch:{ all -> 0x006a }
        r2.<init>(r0, r1);	 Catch:{ all -> 0x006a }
        throw r2;	 Catch:{ all -> 0x006a }
        throw r0;	 Catch:{ all -> 0x0074 }
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.h():long");
    }

    private synchronized void i() {
        try {
            this.f.c(ino.DATABESE_GOT_DELETED.a("logQ", dih.b(this.g)), 1);
            if (this.h != null) {
                this.f.c(ino.DATABESE_GOT_DELETED_EVENTS_LOST.a("logQ", dih.b(this.g)), this.h.longValue());
            }
            close();
            this.b.delete();
            this.h = null;
            this.i = null;
            this.j = null;
        } catch (SecurityException unused) {
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0076 in {7, 9, 12, 15, 21, 23, 26} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private synchronized long j() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = 0;
        r2 = 1;
        r4 = r9.getReadableDatabase();	 Catch:{ SQLException -> 0x005d }
        r5 = "select _int_value from sequence_id where _key=?";	 Catch:{ SQLException -> 0x005d }
        r6 = "last_used";	 Catch:{ SQLException -> 0x005d }
        r6 = new java.lang.String[]{r6};	 Catch:{ SQLException -> 0x005d }
        r4 = r4.rawQuery(r5, r6);	 Catch:{ SQLException -> 0x005d }
        r5 = r4.getCount();	 Catch:{ SQLException -> 0x005d }
        r6 = 1;	 Catch:{ SQLException -> 0x005d }
        if (r5 == r6) goto L_0x0040;	 Catch:{ SQLException -> 0x005d }
        r5 = r9.f;	 Catch:{ SQLException -> 0x005d }
        r6 = defpackage.ino.SEQID_INIT_ERROR;	 Catch:{ SQLException -> 0x005d }
        r7 = "logQ";	 Catch:{ SQLException -> 0x005d }
        r8 = r9.g;	 Catch:{ SQLException -> 0x005d }
        r8 = defpackage.dih.b(r8);	 Catch:{ SQLException -> 0x005d }
        r6 = r6.a(r7, r8);	 Catch:{ SQLException -> 0x005d }
        r5.c(r6, r2);	 Catch:{ SQLException -> 0x005d }
        r5 = r9.e;	 Catch:{ SQLException -> 0x005d }
        r5 = r5.c();	 Catch:{ SQLException -> 0x005d }
        if (r5 != 0) goto L_0x0038;	 Catch:{ SQLException -> 0x005d }
        goto L_0x0040;	 Catch:{ SQLException -> 0x005d }
        r0 = new java.lang.IllegalStateException;	 Catch:{ SQLException -> 0x005d }
        r1 = "seqid missing in sql table";	 Catch:{ SQLException -> 0x005d }
        r0.<init>(r1);	 Catch:{ SQLException -> 0x005d }
        throw r0;	 Catch:{ SQLException -> 0x005d }
        r5 = r4.moveToNext();	 Catch:{ SQLException -> 0x005d }
        if (r5 == 0) goto L_0x004c;	 Catch:{ SQLException -> 0x005d }
        r0 = 0;	 Catch:{ SQLException -> 0x005d }
        r0 = r4.getLong(r0);	 Catch:{ SQLException -> 0x005d }
        goto L_0x0040;	 Catch:{ SQLException -> 0x005d }
        defpackage.aklc.a(r4);	 Catch:{ SQLException -> 0x005d }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ SQLException -> 0x005d }
        r9.j = r0;	 Catch:{ SQLException -> 0x005d }
        r0 = r0.longValue();	 Catch:{ SQLException -> 0x005d }
        monitor-exit(r9);
        return r0;
        r0 = move-exception;
        goto L_0x0072;
        r0 = move-exception;
        r1 = r9.f;	 Catch:{ all -> 0x005b }
        r4 = defpackage.ino.SEQID_READ_EXCEPTION;	 Catch:{ all -> 0x005b }
        r5 = "logQ";	 Catch:{ all -> 0x005b }
        r6 = r9.g;	 Catch:{ all -> 0x005b }
        r6 = defpackage.dih.b(r6);	 Catch:{ all -> 0x005b }
        r4 = r4.a(r5, r6);	 Catch:{ all -> 0x005b }
        r1.c(r4, r2);	 Catch:{ all -> 0x005b }
        throw r0;	 Catch:{ all -> 0x005b }
        throw r0;	 Catch:{ all -> 0x0073 }
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.j():long");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized int a(dkt dkt) {
        int delete;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            String str = aqd.a;
            StringBuilder stringBuilder = new StringBuilder("id <= ");
            stringBuilder.append(dkt.d);
            delete = writableDatabase.delete(str, stringBuilder.toString(), null);
            if (delete != dkt.b()) {
                this.h = null;
                this.i = null;
            } else {
                if (this.h != null) {
                    this.h = Long.valueOf(this.h.longValue() - ((long) delete));
                }
                if (this.i != null) {
                    this.i = Long.valueOf(this.i.longValue() - ((long) dkt.b));
                }
            }
        } catch (SQLiteException e) {
            throw new diq(1, e);
        }
        return delete;
    }

    public final synchronized long a() {
        if (this.h != null) {
            return this.h.longValue();
        }
        return f();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0076 in {11, 13, 17, 23, 26, 29} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final synchronized android.util.Pair<java.lang.Long, java.util.List<defpackage.dks>> a(long r15) {
        /*
        r14 = this;
        monitor-enter(r14);
        r0 = -1;
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0073 }
        r2.<init>();	 Catch:{ all -> 0x0073 }
        r3 = 0;
        r4 = 1;
        r5 = r14.getReadableDatabase();	 Catch:{ SQLiteException -> 0x0068 }
        r12 = "id ASC";	 Catch:{ SQLiteException -> 0x0068 }
        r6 = "events";	 Catch:{ SQLiteException -> 0x0068 }
        r7 = "id";	 Catch:{ SQLiteException -> 0x0068 }
        r8 = "event";	 Catch:{ SQLiteException -> 0x0068 }
        r9 = "isKeyEvent";	 Catch:{ SQLiteException -> 0x0068 }
        r10 = "first_upload_ts";	 Catch:{ SQLiteException -> 0x0068 }
        r7 = new java.lang.String[]{r7, r8, r9, r10};	 Catch:{ SQLiteException -> 0x0068 }
        r8 = 0;	 Catch:{ SQLiteException -> 0x0068 }
        r9 = 0;	 Catch:{ SQLiteException -> 0x0068 }
        r10 = 0;	 Catch:{ SQLiteException -> 0x0068 }
        r11 = 0;	 Catch:{ SQLiteException -> 0x0068 }
        r13 = java.lang.Long.toString(r15);	 Catch:{ SQLiteException -> 0x0068 }
        r3 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13);	 Catch:{ SQLiteException -> 0x0068 }
        r5 = r3.moveToNext();	 Catch:{ SQLiteException -> 0x0068 }
        if (r5 == 0) goto L_0x0058;	 Catch:{ SQLiteException -> 0x0068 }
        r0 = 0;	 Catch:{ SQLiteException -> 0x0068 }
        r5 = r3.getLong(r0);	 Catch:{ SQLiteException -> 0x0068 }
        r1 = r3.getString(r4);	 Catch:{ SQLiteException -> 0x0068 }
        r7 = 2;	 Catch:{ SQLiteException -> 0x0068 }
        r7 = r3.getInt(r7);	 Catch:{ SQLiteException -> 0x0068 }
        if (r7 != r4) goto L_0x0041;	 Catch:{ SQLiteException -> 0x0068 }
        r0 = 1;	 Catch:{ SQLiteException -> 0x0068 }
        r7 = 3;	 Catch:{ SQLiteException -> 0x0068 }
        r7 = r3.getLong(r7);	 Catch:{ SQLiteException -> 0x0068 }
        r9 = new dks;	 Catch:{ SQLiteException -> 0x0068 }
        r10 = java.lang.Long.valueOf(r5);	 Catch:{ SQLiteException -> 0x0068 }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ SQLiteException -> 0x0068 }
        r9.<init>(r10, r1, r0, r7);	 Catch:{ SQLiteException -> 0x0068 }
        r2.add(r9);	 Catch:{ SQLiteException -> 0x0068 }
        r0 = r5;
        goto L_0x002a;
        defpackage.aklc.a(r3);	 Catch:{ all -> 0x0073 }
        r3 = new android.util.Pair;	 Catch:{ all -> 0x0073 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x0073 }
        r3.<init>(r0, r2);	 Catch:{ all -> 0x0073 }
        monitor-exit(r14);
        return r3;
        r0 = move-exception;
        goto L_0x006f;
        r0 = move-exception;
        r1 = new diq;	 Catch:{ all -> 0x0066 }
        r1.<init>(r4, r0);	 Catch:{ all -> 0x0066 }
        throw r1;	 Catch:{ all -> 0x0066 }
        defpackage.aklc.a(r3);	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
        r0 = move-exception;
        monitor-exit(r14);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.a(long):android.util.Pair");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A:{SYNTHETIC, Splitter:B:24:0x006d} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d A:{SYNTHETIC, Splitter:B:24:0x006d} */
    public final synchronized void a(long r11, long r13) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = 0;
        r1 = 2;
        r2 = 0;
        r3 = 1;
        r4 = r10.getWritableDatabase();	 Catch:{ SQLiteException -> 0x0048, all -> 0x0045 }
        r4.beginTransaction();	 Catch:{ SQLiteException -> 0x0043 }
        r5 = new android.content.ContentValues;	 Catch:{ SQLiteException -> 0x0043 }
        r5.<init>();	 Catch:{ SQLiteException -> 0x0043 }
        r6 = "first_upload_ts";
        r7 = java.lang.Long.valueOf(r13);	 Catch:{ SQLiteException -> 0x0043 }
        r5.put(r6, r7);	 Catch:{ SQLiteException -> 0x0043 }
        r6 = "%s IS ? AND %s <= ?";
        r7 = new java.lang.Object[r1];	 Catch:{ SQLiteException -> 0x0043 }
        r8 = "first_upload_ts";
        r7[r2] = r8;	 Catch:{ SQLiteException -> 0x0043 }
        r8 = "id";
        r7[r3] = r8;	 Catch:{ SQLiteException -> 0x0043 }
        r6 = java.lang.String.format(r6, r7);	 Catch:{ SQLiteException -> 0x0043 }
        r7 = new java.lang.String[r1];	 Catch:{ SQLiteException -> 0x0043 }
        r7[r2] = r0;	 Catch:{ SQLiteException -> 0x0043 }
        r0 = java.lang.String.valueOf(r11);	 Catch:{ SQLiteException -> 0x0043 }
        r7[r3] = r0;	 Catch:{ SQLiteException -> 0x0043 }
        r0 = "events";
        r4.update(r0, r5, r6, r7);	 Catch:{ SQLiteException -> 0x0043 }
        r4.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x0043 }
        r10.a(r4);	 Catch:{ all -> 0x0071 }
        monitor-exit(r10);
        return;
    L_0x0041:
        r11 = move-exception;
        goto L_0x006b;
    L_0x0043:
        r0 = move-exception;
        goto L_0x004c;
    L_0x0045:
        r11 = move-exception;
        r4 = r0;
        goto L_0x006b;
    L_0x0048:
        r4 = move-exception;
        r9 = r4;
        r4 = r0;
        r0 = r9;
    L_0x004c:
        r10.i();	 Catch:{ all -> 0x0041 }
        r5 = "Could not update timestamp %s for max id %s";
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0069 }
        r13 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x0069 }
        r1[r2] = r13;	 Catch:{ all -> 0x0069 }
        r11 = java.lang.Long.valueOf(r11);	 Catch:{ all -> 0x0069 }
        r1[r3] = r11;	 Catch:{ all -> 0x0069 }
        r11 = java.lang.String.format(r5, r1);	 Catch:{ all -> 0x0069 }
        r12 = new diq;	 Catch:{ all -> 0x0069 }
        r12.<init>(r3, r0, r11);	 Catch:{ all -> 0x0069 }
        throw r12;	 Catch:{ all -> 0x0069 }
    L_0x0069:
        r11 = move-exception;
        r3 = 0;
    L_0x006b:
        if (r3 == 0) goto L_0x0070;
    L_0x006d:
        r10.a(r4);	 Catch:{ all -> 0x0071 }
    L_0x0070:
        throw r11;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.a(long, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:56:0x00e0 in {11, 12, 19, 20, 23, 26, 31, 33, 35, 37, 39, 44, 46, 48, 51, 52, 55} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final synchronized void a(java.util.List<defpackage.dks> r17) {
        /*
        r16 = this;
        r1 = r16;
        monitor-enter(r16);
        r2 = 0;
        r3 = 0;
        r4 = 1;
        r5 = r16.getWritableDatabase();	 Catch:{ SQLiteException -> 0x00b8, all -> 0x00b5 }
        r5.beginTransaction();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r0 = r17.iterator();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r6 = 0;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r7 = 0;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = r0.hasNext();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        if (r8 == 0) goto L_0x0084;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = r0.next();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = (defpackage.dks) r8;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r9 = new android.content.ContentValues;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r9.<init>();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r10 = "event";	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = r8.a;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = defpackage.dih.a(r11);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r9.put(r10, r11);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r10 = "isKeyEvent";	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = r8.b;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        if (r11 == 0) goto L_0x0037;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = 1;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        goto L_0x0038;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = 0;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r9.put(r10, r11);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r10 = "first_upload_ts";	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = r8.b();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r9.put(r10, r11);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r10 = "events";	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r9 = r5.insert(r10, r2, r9);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = java.lang.System.currentTimeMillis();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r13 = r8.c;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = r11 - r13;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r13 = r1.f;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r14 = defpackage.ino.TIME_TO_FLUSH_EVENT;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r15 = "logQ";	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = r1.g;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = defpackage.dih.b(r2);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = r14.a(r15, r2);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r13.a(r2, r11);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r11 = -1;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        if (r2 == 0) goto L_0x0082;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r6 = r6 + 1;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = "event_name";	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = r8.b(r2);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        if (r2 == 0) goto L_0x0082;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = defpackage.dhx.c;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = r8.contains(r2);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        if (r2 == 0) goto L_0x0082;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r7 = r7 + 1;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r2 = 0;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        goto L_0x0013;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r0 = r1.h;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        if (r0 == 0) goto L_0x0096;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r0 = r1.h;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = r0.longValue();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r10 = (long) r6;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = r8 + r10;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r0 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r1.h = r0;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r0 = r1.i;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        if (r0 == 0) goto L_0x00a8;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r0 = r1.i;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = r0.longValue();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r6 = (long) r7;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r8 = r8 + r6;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r0 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r1.i = r0;	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r5.setTransactionSuccessful();	 Catch:{ SQLiteException -> 0x00b2, all -> 0x00b0 }
        r1.a(r5);	 Catch:{ all -> 0x00dd }
        monitor-exit(r16);
        return;
        r0 = move-exception;
        goto L_0x00d7;
        r0 = move-exception;
        r2 = r5;
        goto L_0x00ba;
        r0 = move-exception;
        r5 = 0;
        goto L_0x00d7;
        r0 = move-exception;
        r2 = 0;
        r16.i();	 Catch:{ all -> 0x00d5 }
        r5 = "Events: %s";	 Catch:{ all -> 0x00d1 }
        r6 = new java.lang.Object[r4];	 Catch:{ all -> 0x00d1 }
        r7 = defpackage.dio.b(r17);	 Catch:{ all -> 0x00d1 }
        r6[r3] = r7;	 Catch:{ all -> 0x00d1 }
        r5 = java.lang.String.format(r5, r6);	 Catch:{ all -> 0x00d1 }
        r6 = new diq;	 Catch:{ all -> 0x00d1 }
        r6.<init>(r4, r0, r5);	 Catch:{ all -> 0x00d1 }
        throw r6;	 Catch:{ all -> 0x00d1 }
        r0 = move-exception;
        r5 = r2;
        r4 = 0;
        goto L_0x00d7;
        r0 = move-exception;
        r5 = r2;
        if (r4 == 0) goto L_0x00dc;
        r1.a(r5);	 Catch:{ all -> 0x00dd }
        throw r0;	 Catch:{ all -> 0x00dd }
        r0 = move-exception;
        monitor-exit(r16);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.a(java.util.List):void");
    }

    public final synchronized long b() {
        return a() - g();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized long b(long j) {
        long j2;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            StringBuilder stringBuilder = new StringBuilder("SELECT id FROM events LIMIT 1 OFFSET ");
            stringBuilder.append(j - 1);
            SQLiteStatement compileStatement = readableDatabase.compileStatement(stringBuilder.toString());
            j2 = -1;
            try {
                j2 = compileStatement.simpleQueryForLong();
            } catch (SQLiteDoneException unused) {
            }
        } catch (SQLiteException e) {
            throw new diq(1, e);
        }
        return j2;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    @Deprecated
    public final synchronized int c(long j) {
        int delete;
        try {
            delete = getWritableDatabase().delete(aqd.a, "id <= ".concat(String.valueOf(j)), null);
            if (this.h != null) {
                this.h = Long.valueOf(this.h.longValue() - ((long) delete));
            }
            this.i = null;
        } catch (SQLiteException e) {
            throw new diq(1, e);
        }
        return delete;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x007b in {7, 12, 15, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final synchronized defpackage.dio.a c() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = com.google.common.collect.HashMultiset.create();	 Catch:{ all -> 0x0078 }
        r1 = r9.getReadableDatabase();	 Catch:{ all -> 0x0078 }
        r2 = "events";	 Catch:{ all -> 0x0078 }
        r3 = "event";	 Catch:{ all -> 0x0078 }
        r3 = new java.lang.String[]{r3};	 Catch:{ all -> 0x0078 }
        r4 = 0;	 Catch:{ all -> 0x0078 }
        r5 = 0;	 Catch:{ all -> 0x0078 }
        r6 = 0;	 Catch:{ all -> 0x0078 }
        r7 = 0;	 Catch:{ all -> 0x0078 }
        r8 = 0;	 Catch:{ all -> 0x0078 }
        r1 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0078 }
        r2 = 0;	 Catch:{ all -> 0x0078 }
        r3 = 0;	 Catch:{ all -> 0x0078 }
        r4 = r2;	 Catch:{ all -> 0x0078 }
        r2 = 0;	 Catch:{ all -> 0x0078 }
        r5 = r1.moveToNext();	 Catch:{ all -> 0x0078 }
        if (r5 == 0) goto L_0x003f;	 Catch:{ all -> 0x0078 }
        r5 = r1.getString(r3);	 Catch:{ all -> 0x0078 }
        r6 = defpackage.dih.a(r5);	 Catch:{ all -> 0x0078 }
        r7 = "event_name";	 Catch:{ all -> 0x0078 }
        r6 = r6.get(r7);	 Catch:{ all -> 0x0078 }
        r6 = (java.lang.String) r6;	 Catch:{ all -> 0x0078 }
        r7 = 1;	 Catch:{ all -> 0x0078 }
        r6 = r0.add(r6, r7);	 Catch:{ all -> 0x0078 }
        r6 = r6 + r7;	 Catch:{ all -> 0x0078 }
        if (r6 <= r2) goto L_0x001e;	 Catch:{ all -> 0x0078 }
        r4 = r5;	 Catch:{ all -> 0x0078 }
        r2 = r6;	 Catch:{ all -> 0x0078 }
        goto L_0x001e;	 Catch:{ all -> 0x0078 }
        r2 = com.google.common.collect.Maps.newLinkedHashMap();	 Catch:{ all -> 0x0078 }
        r3 = com.google.common.collect.Multisets.copyHighestCountFirst(r0);	 Catch:{ all -> 0x0078 }
        r3 = r3.elementSet();	 Catch:{ all -> 0x0078 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0078 }
        r5 = r3.hasNext();	 Catch:{ all -> 0x0078 }
        if (r5 == 0) goto L_0x006e;	 Catch:{ all -> 0x0078 }
        r5 = r3.next();	 Catch:{ all -> 0x0078 }
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x0078 }
        r6 = r0.count(r5);	 Catch:{ all -> 0x0078 }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ all -> 0x0078 }
        r2.put(r5, r6);	 Catch:{ all -> 0x0078 }
        r5 = r2.size();	 Catch:{ all -> 0x0078 }
        r6 = 10;	 Catch:{ all -> 0x0078 }
        if (r5 != r6) goto L_0x004f;	 Catch:{ all -> 0x0078 }
        defpackage.aklc.a(r1);	 Catch:{ all -> 0x0078 }
        r0 = new dio$a;	 Catch:{ all -> 0x0078 }
        r0.<init>(r2, r4);	 Catch:{ all -> 0x0078 }
        monitor-exit(r9);
        return r0;
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.c():dio$a");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized long d(long j) {
        int delete;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            String format = String.format(Locale.US, "SELECT %s FROM %s WHERE NOT %s LIMIT %d", new Object[]{"id", aqd.a, "isKeyEvent", Long.valueOf(j)});
            delete = writableDatabase.delete(aqd.a, String.format(Locale.US, "%s in (%s)", new Object[]{"id", format}), null);
            if (this.h != null) {
                this.h = Long.valueOf(this.h.longValue() - ((long) delete));
            }
            this.i = null;
        } catch (SQLiteException e) {
            throw new diq(1, e);
        }
        return (long) delete;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void d() {
        getWritableDatabase().delete(aqd.a, null, null);
        this.h = Long.valueOf(0);
        this.i = Long.valueOf(0);
    }

    public final synchronized long e() {
        if (this.j != null) {
            return this.j.longValue();
        }
        return j();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00a5 in {11, 12, 15, 19, 25, 27, 30} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final synchronized long e(long r11) {
        /*
        r10 = this;
        monitor-enter(r10);
        r0 = 1;
        r1 = r10.getWritableDatabase();	 Catch:{ SQLiteException -> 0x009a }
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x009a }
        r2.<init>();	 Catch:{ SQLiteException -> 0x009a }
        r3 = a;	 Catch:{ SQLiteException -> 0x009a }
        r4 = 2;	 Catch:{ SQLiteException -> 0x009a }
        r5 = 0;	 Catch:{ SQLiteException -> 0x009a }
        if (r3 == 0) goto L_0x004a;	 Catch:{ SQLiteException -> 0x009a }
        r3 = a;	 Catch:{ SQLiteException -> 0x009a }
        r3 = r3.isEmpty();	 Catch:{ SQLiteException -> 0x009a }
        if (r3 != 0) goto L_0x004a;	 Catch:{ SQLiteException -> 0x009a }
        r3 = "WHERE ";	 Catch:{ SQLiteException -> 0x009a }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x009a }
        r3 = 0;	 Catch:{ SQLiteException -> 0x009a }
        r6 = a;	 Catch:{ SQLiteException -> 0x009a }
        r6 = r6.size();	 Catch:{ SQLiteException -> 0x009a }
        if (r3 >= r6) goto L_0x004a;	 Catch:{ SQLiteException -> 0x009a }
        if (r3 == 0) goto L_0x002e;	 Catch:{ SQLiteException -> 0x009a }
        r6 = " AND ";	 Catch:{ SQLiteException -> 0x009a }
        r2.append(r6);	 Catch:{ SQLiteException -> 0x009a }
        r6 = java.util.Locale.US;	 Catch:{ SQLiteException -> 0x009a }
        r7 = "%s NOT LIKE '%%\"event_name\":\"%s\"%%'";	 Catch:{ SQLiteException -> 0x009a }
        r8 = new java.lang.Object[r4];	 Catch:{ SQLiteException -> 0x009a }
        r9 = "event";	 Catch:{ SQLiteException -> 0x009a }
        r8[r5] = r9;	 Catch:{ SQLiteException -> 0x009a }
        r9 = a;	 Catch:{ SQLiteException -> 0x009a }
        r9 = r9.get(r3);	 Catch:{ SQLiteException -> 0x009a }
        r8[r0] = r9;	 Catch:{ SQLiteException -> 0x009a }
        r6 = java.lang.String.format(r6, r7, r8);	 Catch:{ SQLiteException -> 0x009a }
        r2.append(r6);	 Catch:{ SQLiteException -> 0x009a }
        r3 = r3 + 1;	 Catch:{ SQLiteException -> 0x009a }
        goto L_0x001f;	 Catch:{ SQLiteException -> 0x009a }
        r3 = java.util.Locale.US;	 Catch:{ SQLiteException -> 0x009a }
        r6 = "SELECT %s FROM %s %s LIMIT %d";	 Catch:{ SQLiteException -> 0x009a }
        r7 = 4;	 Catch:{ SQLiteException -> 0x009a }
        r7 = new java.lang.Object[r7];	 Catch:{ SQLiteException -> 0x009a }
        r8 = "id";	 Catch:{ SQLiteException -> 0x009a }
        r7[r5] = r8;	 Catch:{ SQLiteException -> 0x009a }
        r8 = "events";	 Catch:{ SQLiteException -> 0x009a }
        r7[r0] = r8;	 Catch:{ SQLiteException -> 0x009a }
        r2 = r2.toString();	 Catch:{ SQLiteException -> 0x009a }
        r7[r4] = r2;	 Catch:{ SQLiteException -> 0x009a }
        r2 = 3;	 Catch:{ SQLiteException -> 0x009a }
        r11 = java.lang.Long.valueOf(r11);	 Catch:{ SQLiteException -> 0x009a }
        r7[r2] = r11;	 Catch:{ SQLiteException -> 0x009a }
        r11 = java.lang.String.format(r3, r6, r7);	 Catch:{ SQLiteException -> 0x009a }
        r12 = java.util.Locale.US;	 Catch:{ SQLiteException -> 0x009a }
        r2 = "%s in (%s)";	 Catch:{ SQLiteException -> 0x009a }
        r3 = new java.lang.Object[r4];	 Catch:{ SQLiteException -> 0x009a }
        r4 = "id";	 Catch:{ SQLiteException -> 0x009a }
        r3[r5] = r4;	 Catch:{ SQLiteException -> 0x009a }
        r3[r0] = r11;	 Catch:{ SQLiteException -> 0x009a }
        r11 = java.lang.String.format(r12, r2, r3);	 Catch:{ SQLiteException -> 0x009a }
        r12 = "events";	 Catch:{ SQLiteException -> 0x009a }
        r2 = 0;	 Catch:{ SQLiteException -> 0x009a }
        r11 = r1.delete(r12, r11, r2);	 Catch:{ SQLiteException -> 0x009a }
        r12 = r10.h;	 Catch:{ SQLiteException -> 0x009a }
        if (r12 == 0) goto L_0x0093;	 Catch:{ SQLiteException -> 0x009a }
        r12 = r10.h;	 Catch:{ SQLiteException -> 0x009a }
        r3 = r12.longValue();	 Catch:{ SQLiteException -> 0x009a }
        r5 = (long) r11;	 Catch:{ SQLiteException -> 0x009a }
        r3 = r3 - r5;	 Catch:{ SQLiteException -> 0x009a }
        r12 = java.lang.Long.valueOf(r3);	 Catch:{ SQLiteException -> 0x009a }
        r10.h = r12;	 Catch:{ SQLiteException -> 0x009a }
        r10.i = r2;	 Catch:{ SQLiteException -> 0x009a }
        r11 = (long) r11;
        monitor-exit(r10);
        return r11;
        r11 = move-exception;
        goto L_0x00a1;
        r11 = move-exception;
        r12 = new diq;	 Catch:{ all -> 0x0098 }
        r12.<init>(r0, r11);	 Catch:{ all -> 0x0098 }
        throw r12;	 Catch:{ all -> 0x0098 }
        throw r11;	 Catch:{ all -> 0x00a2 }
        r11 = move-exception;
        monitor-exit(r10);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dio.e(long):long");
    }

    public final synchronized void f(long j) {
        if (this.j == null || j != this.j.longValue()) {
            g(j);
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        setWriteAheadLoggingEnabled(true);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT,isKeyEvent BOOLEAN,first_upload_ts INT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sequence_id (_key TEXT PRIMARY KEY,_int_value INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("INSERT INTO sequence_id VALUES ('last_used', 0)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = "INTEGER";
        String str2 = aqd.a;
        if (i < 2) {
            dip.a(sQLiteDatabase, str2, "isKeyEvent", str, "0");
        }
        if (i < 3) {
            dip.a(sQLiteDatabase, str2, "first_upload_ts", str, "NULL");
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sequence_id (_key TEXT PRIMARY KEY,_int_value INTEGER NOT NULL);");
            sQLiteDatabase.execSQL("INSERT INTO sequence_id VALUES ('last_used', 0)");
        }
    }
}

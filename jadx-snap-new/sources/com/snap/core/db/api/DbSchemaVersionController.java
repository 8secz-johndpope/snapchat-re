package com.snap.core.db.api;

import com.brightcove.player.event.Event;
import defpackage.ajxk;
import defpackage.akcr;
import defpackage.gqr;
import defpackage.gqt;
import defpackage.ide;
import defpackage.pa;
import defpackage.zfd;
import java.sql.SQLException;

public abstract class DbSchemaVersionController {
    private final DbSchema schema;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TableType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TableType.TABLE.ordinal()] = 1;
            $EnumSwitchMapping$0[TableType.VIEW.ordinal()] = 2;
        }
    }

    public DbSchemaVersionController(DbSchema dbSchema) {
        akcr.b(dbSchema, "schema");
        this.schema = dbSchema;
    }

    private final void dropTable(pa paVar, TableSpec tableSpec) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[tableSpec.getTableType().ordinal()];
        if (i == 1) {
            str = "TABLE";
        } else if (i == 2) {
            str = "VIEW";
        } else {
            throw new ajxk();
        }
        StringBuilder stringBuilder = new StringBuilder("DROP ");
        stringBuilder.append(str);
        stringBuilder.append(" IF EXISTS ");
        stringBuilder.append(tableSpec.getTableName());
        paVar.c(stringBuilder.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0075 in {11, 13, 19, 21, 27, 29} preds:[]
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
    protected final void addColumn(defpackage.pa r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
        r4 = this;
        r0 = "db";
        defpackage.akcr.b(r5, r0);
        r0 = "tableName";
        defpackage.akcr.b(r6, r0);
        r0 = "columnName";
        defpackage.akcr.b(r7, r0);
        r0 = "alterTableStatement";
        defpackage.akcr.b(r8, r0);
        r0 = 0;
        r1 = "select * from sqlite_master";
        r1 = r5.a(r1, r0);
        r1 = (java.io.Closeable) r1;
        r2 = r1;	 Catch:{ Throwable -> 0x006e }
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x006e }
        r3 = "it";	 Catch:{ Throwable -> 0x006e }
        defpackage.akcr.a(r2, r3);	 Catch:{ Throwable -> 0x006e }
        r2.getCount();	 Catch:{ Throwable -> 0x006e }
        defpackage.akax.a(r1, r0);
        r1 = new java.lang.StringBuilder;
        r2 = "PRAGMA table_info(";
        r1.<init>(r2);
        r1.append(r6);
        r6 = 41;
        r1.append(r6);
        r6 = r1.toString();
        r6 = r5.a(r6, r0);
        r6 = (java.io.Closeable) r6;
        r1 = r6;	 Catch:{ Throwable -> 0x0065 }
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x0065 }
        r2 = r1.moveToNext();	 Catch:{ Throwable -> 0x0065 }
        if (r2 == 0) goto L_0x005c;	 Catch:{ Throwable -> 0x0065 }
        r2 = 1;	 Catch:{ Throwable -> 0x0065 }
        r3 = r1.getString(r2);	 Catch:{ Throwable -> 0x0065 }
        r2 = defpackage.akgb.a(r3, r7, r2);	 Catch:{ Throwable -> 0x0065 }
        if (r2 == 0) goto L_0x0047;
        defpackage.akax.a(r6, r0);
        return;
        defpackage.akax.a(r6, r0);
        r5.c(r8);
        return;
        r5 = move-exception;
        goto L_0x0068;
        r5 = move-exception;
        r0 = r5;
        throw r0;	 Catch:{ all -> 0x0063 }
        defpackage.akax.a(r6, r0);
        throw r5;
        r5 = move-exception;
        goto L_0x0071;
        r5 = move-exception;
        r0 = r5;
        throw r0;	 Catch:{ all -> 0x006c }
        defpackage.akax.a(r1, r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.api.DbSchemaVersionController.addColumn(pa, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void create(pa paVar) {
        akcr.b(paVar, "db");
        for (TableSpec createTable : this.schema.getTables()) {
            createTable(paVar, createTable);
        }
        for (IndexSpec createIndex : this.schema.getIndices()) {
            createIndex(paVar, createIndex);
        }
        for (TriggerSpec createTrigger : this.schema.getTriggers()) {
            createTrigger(paVar, createTrigger);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void createIndex(pa paVar, IndexSpec indexSpec) {
        akcr.b(paVar, "db");
        akcr.b(indexSpec, Event.INDEX);
        paVar.c(IndexSpecKt.getCreateIndexQuery(indexSpec));
    }

    /* Access modifiers changed, original: protected|final */
    public final void createTable(pa paVar, TableSpec tableSpec) {
        akcr.b(paVar, "db");
        akcr.b(tableSpec, "table");
        paVar.c(tableSpec.getCreationStatement());
    }

    /* Access modifiers changed, original: protected|final */
    public final void createTable(pa paVar, String str) {
        akcr.b(paVar, "db");
        akcr.b(str, "creationStatement");
        paVar.c(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void createTrigger(pa paVar, TriggerSpec triggerSpec) {
        akcr.b(paVar, "db");
        akcr.b(triggerSpec, "triggerSpec");
        paVar.c(triggerSpec.getTriggerStatement());
    }

    /* Access modifiers changed, original: protected|final */
    public final void dropIndex(pa paVar, IndexSpec indexSpec) {
        akcr.b(paVar, "db");
        akcr.b(indexSpec, Event.INDEX);
        StringBuilder stringBuilder = new StringBuilder("DROP INDEX IF EXISTS ");
        stringBuilder.append(indexSpec.getIndexName());
        paVar.c(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final void dropTable(pa paVar, String str) {
        akcr.b(paVar, "db");
        akcr.b(str, "table");
        paVar.c("DROP TABLE IF EXISTS ".concat(String.valueOf(str)));
    }

    /* Access modifiers changed, original: protected|final */
    public final void dropTrigger(pa paVar, TriggerSpec triggerSpec) {
        akcr.b(paVar, "db");
        akcr.b(triggerSpec, "trigger");
        StringBuilder stringBuilder = new StringBuilder("DROP TRIGGER IF EXISTS ");
        stringBuilder.append(triggerSpec.getTriggerName());
        paVar.c(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final void executeStatement(pa paVar, String str) {
        akcr.b(paVar, "db");
        akcr.b(str, "statement");
        paVar.c(str);
    }

    public String getInitialTableCreationStatement(TableSpec tableSpec) {
        akcr.b(tableSpec, "table");
        return null;
    }

    public Integer getMinUpgradableVersion() {
        return null;
    }

    public final DbSchema getSchema() {
        return this.schema;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x00b8 in {13, 14, 19, 21, 23, 29, 31} preds:[]
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
    public final java.util.List<com.snap.core.db.api.ConstraintSpec> getTableConstraints(java.lang.String r7, defpackage.pa r8) {
        /*
        r6 = this;
        r0 = "tableName";
        defpackage.akcr.b(r7, r0);
        r0 = "db";
        defpackage.akcr.b(r8, r0);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = (java.util.List) r0;
        r1 = new java.lang.StringBuilder;
        r2 = "SELECT type, sql FROM sqlite_master WHERE tbl_name='";
        r1.<init>(r2);
        r1.append(r7);
        r2 = 39;
        r1.append(r2);
        r1 = r1.toString();
        r1 = defpackage.akfu.b(r1);
        r2 = 0;
        r8 = r8.a(r1, r2);
        r8 = (java.io.Closeable) r8;
        r1 = r8;	 Catch:{ Throwable -> 0x00b1 }
        r1 = (android.database.Cursor) r1;	 Catch:{ Throwable -> 0x00b1 }
        r1.moveToFirst();	 Catch:{ Throwable -> 0x00b1 }
        r3 = r1.moveToNext();	 Catch:{ Throwable -> 0x00b1 }
        if (r3 == 0) goto L_0x00a5;	 Catch:{ Throwable -> 0x00b1 }
        r3 = "type";	 Catch:{ Throwable -> 0x00b1 }
        r3 = r1.getColumnIndex(r3);	 Catch:{ Throwable -> 0x00b1 }
        r3 = r1.getString(r3);	 Catch:{ Throwable -> 0x00b1 }
        r4 = "it.getString(it.getColumnIndex(\"type\"))";	 Catch:{ Throwable -> 0x00b1 }
        defpackage.akcr.a(r3, r4);	 Catch:{ Throwable -> 0x00b1 }
        r4 = java.util.Locale.ENGLISH;	 Catch:{ Throwable -> 0x00b1 }
        r5 = "Locale.ENGLISH";	 Catch:{ Throwable -> 0x00b1 }
        defpackage.akcr.a(r4, r5);	 Catch:{ Throwable -> 0x00b1 }
        if (r3 == 0) goto L_0x009d;	 Catch:{ Throwable -> 0x00b1 }
        r3 = r3.toUpperCase(r4);	 Catch:{ Throwable -> 0x00b1 }
        r4 = "(this as java.lang.String).toUpperCase(locale)";	 Catch:{ Throwable -> 0x00b1 }
        defpackage.akcr.a(r3, r4);	 Catch:{ Throwable -> 0x00b1 }
        r4 = com.snap.core.db.api.ConstraintType.INDEX;	 Catch:{ Throwable -> 0x00b1 }
        r4 = r4.toString();	 Catch:{ Throwable -> 0x00b1 }
        r4 = defpackage.akcr.a(r3, r4);	 Catch:{ Throwable -> 0x00b1 }
        r5 = "sql";
        if (r4 == 0) goto L_0x007f;
        r3 = r1.getColumnIndex(r5);	 Catch:{ Throwable -> 0x00b1 }
        r3 = r1.getString(r3);	 Catch:{ Throwable -> 0x00b1 }
        if (r3 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x00b1 }
        r4 = new com.snap.core.db.api.ConstraintSpec;	 Catch:{ Throwable -> 0x00b1 }
        r5 = com.snap.core.db.api.ConstraintType.INDEX;	 Catch:{ Throwable -> 0x00b1 }
        r4.<init>(r7, r3, r5);	 Catch:{ Throwable -> 0x00b1 }
        r0.add(r4);	 Catch:{ Throwable -> 0x00b1 }
        goto L_0x0035;	 Catch:{ Throwable -> 0x00b1 }
        r4 = com.snap.core.db.api.ConstraintType.TRIGGER;	 Catch:{ Throwable -> 0x00b1 }
        r4 = r4.toString();	 Catch:{ Throwable -> 0x00b1 }
        r3 = defpackage.akcr.a(r3, r4);	 Catch:{ Throwable -> 0x00b1 }
        if (r3 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x00b1 }
        r3 = r1.getColumnIndex(r5);	 Catch:{ Throwable -> 0x00b1 }
        r3 = r1.getString(r3);	 Catch:{ Throwable -> 0x00b1 }
        if (r3 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x00b1 }
        r4 = new com.snap.core.db.api.ConstraintSpec;	 Catch:{ Throwable -> 0x00b1 }
        r5 = com.snap.core.db.api.ConstraintType.TRIGGER;	 Catch:{ Throwable -> 0x00b1 }
        r4.<init>(r7, r3, r5);	 Catch:{ Throwable -> 0x00b1 }
        goto L_0x007b;	 Catch:{ Throwable -> 0x00b1 }
        r7 = new ajxt;	 Catch:{ Throwable -> 0x00b1 }
        r0 = "null cannot be cast to non-null type java.lang.String";	 Catch:{ Throwable -> 0x00b1 }
        r7.<init>(r0);	 Catch:{ Throwable -> 0x00b1 }
        throw r7;	 Catch:{ Throwable -> 0x00b1 }
        defpackage.akax.a(r8, r2);
        r0 = (java.lang.Iterable) r0;
        r7 = defpackage.ajyu.k(r0);
        return r7;
        r7 = move-exception;
        goto L_0x00b4;
        r7 = move-exception;
        r2 = r7;
        throw r2;	 Catch:{ all -> 0x00af }
        defpackage.akax.a(r8, r2);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.api.DbSchemaVersionController.getTableConstraints(java.lang.String, pa):java.util.List");
    }

    public final void onUpgrade(gqr gqr, pa paVar, int i, int i2) {
        ide attribution;
        StringBuilder stringBuilder;
        akcr.b(gqr, "exceptionTracker");
        akcr.b(paVar, "db");
        Integer minUpgradableVersion = getMinUpgradableVersion();
        if (i < (minUpgradableVersion != null ? minUpgradableVersion.intValue() : 0)) {
            try {
                reset(paVar);
                return;
            } catch (SQLException e) {
                attribution = this.schema.getAttribution();
                stringBuilder = new StringBuilder("db-downgrade-");
                stringBuilder.append(i);
                stringBuilder.append('-');
                stringBuilder.append(i2);
                throw new zfd(attribution.callsite(stringBuilder.toString()), (Throwable) e, null, 12);
            }
        }
        try {
            upgrade(paVar, i, i2);
        } catch (SQLException e2) {
            gqt gqt = gqt.HIGH;
            Throwable th = e2;
            ide attribution2 = this.schema.getAttribution();
            StringBuilder stringBuilder2 = new StringBuilder("db-upgrade-");
            stringBuilder2.append(i);
            stringBuilder2.append('-');
            stringBuilder2.append(i2);
            gqr.a(gqt, th, attribution2.callsite(stringBuilder2.toString()));
            try {
                reset(paVar);
            } catch (SQLException e3) {
                attribution = this.schema.getAttribution();
                stringBuilder = new StringBuilder("db-upgrade-reset-");
                stringBuilder.append(i);
                stringBuilder.append('-');
                stringBuilder.append(i2);
                throw new zfd(attribution.callsite(stringBuilder.toString()), (Throwable) e3, null, 12);
            }
        }
    }

    public void purge(pa paVar) {
        akcr.b(paVar, "db");
        for (TableSpec dropTable : this.schema.getTables()) {
            dropTable(paVar, dropTable);
        }
        for (IndexSpec dropIndex : this.schema.getIndices()) {
            dropIndex(paVar, dropIndex);
        }
        for (TriggerSpec dropTrigger : this.schema.getTriggers()) {
            dropTrigger(paVar, dropTrigger);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void recreateTable(pa paVar, TableSpec tableSpec) {
        akcr.b(paVar, "db");
        akcr.b(tableSpec, "table");
        StringBuilder stringBuilder = new StringBuilder("DROP TABLE IF EXISTS ");
        stringBuilder.append(tableSpec.getTableName());
        paVar.c(stringBuilder.toString());
        paVar.c(tableSpec.getCreationStatement());
    }

    public final void recreateView(pa paVar, TableSpec tableSpec) {
        akcr.b(paVar, "db");
        akcr.b(tableSpec, "table");
        StringBuilder stringBuilder = new StringBuilder("DROP VIEW IF EXISTS ");
        stringBuilder.append(tableSpec.getTableName());
        paVar.c(stringBuilder.toString());
        paVar.c(tableSpec.getCreationStatement());
    }

    /* Access modifiers changed, original: protected|final */
    public final void renameTable(pa paVar, String str, String str2) {
        akcr.b(paVar, "db");
        akcr.b(str, "currentTableName");
        akcr.b(str2, "newTableName");
        StringBuilder stringBuilder = new StringBuilder("ALTER TABLE ");
        stringBuilder.append(str);
        stringBuilder.append(" RENAME TO ");
        stringBuilder.append(str2);
        stringBuilder.append(';');
        paVar.c(stringBuilder.toString());
    }

    public void reset(pa paVar) {
        akcr.b(paVar, "db");
        purge(paVar);
        create(paVar);
    }

    public abstract void upgrade(pa paVar, int i, int i2);
}

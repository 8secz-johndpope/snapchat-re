package com.snap.core.db.api;

import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.akcr;

public final class BriteDatabaseExtensionsKt {
    public static final int DEFAULT_VALUE_DELETE_QUERY = 0;
    public static final long DEFAULT_VALUE_INSERT_QUERY = -1;
    public static final int DEFAULT_VALUE_UPDATE_QUERY = 0;
    private static final Exception UNKNOWN_SQL_TYPE_EXCEPTION = new Exception("Unrecognized SqlDelightStatement Type.");

    public static final int executeDelete(DbClient dbClient, ainy ainy) {
        akcr.b(dbClient, "receiver$0");
        akcr.b(ainy, "delete");
        return dbClient.executeUpdateDelete(ainy);
    }

    public static final int executeDelete(DbClient dbClient, ainy ainy, DbTransaction dbTransaction) {
        akcr.b(dbClient, "receiver$0");
        akcr.b(ainy, "delete");
        akcr.b(dbTransaction, "tx");
        return dbClient.executeUpdateDelete(ainy, dbTransaction);
    }

    public static final int executeUpdate(DbClient dbClient, ainy ainy) {
        akcr.b(dbClient, "receiver$0");
        akcr.b(ainy, "update");
        return dbClient.executeUpdateDelete(ainy);
    }

    public static final int executeUpdate(DbClient dbClient, ainy ainy, DbTransaction dbTransaction) {
        akcr.b(dbClient, "receiver$0");
        akcr.b(ainy, "update");
        akcr.b(dbTransaction, "tx");
        return dbClient.executeUpdateDelete(ainy, dbTransaction);
    }

    public static final Exception getUNKNOWN_SQL_TYPE_EXCEPTION() {
        return UNKNOWN_SQL_TYPE_EXCEPTION;
    }

    /* JADX WARNING: Missing block: B:9:0x002b, code skipped:
            defpackage.akax.a(r1, r2);
     */
    public static final <R> R queryFirst(com.snap.core.db.api.DbClient r1, defpackage.ainx r2, defpackage.ainw<R> r3) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r1, r0);
        r0 = "statement";
        defpackage.akcr.b(r2, r0);
        r0 = "mapper";
        defpackage.akcr.b(r3, r0);
        r1 = r1.query(r2);
        r1 = com.snap.core.db.api.CursorExtensionsKt.asSequence(r1, r3);
        r1 = (java.io.Closeable) r1;
        r2 = 0;
        r3 = r1;
        r3 = (com.snap.core.db.api.CursorSequence) r3;	 Catch:{ Throwable -> 0x0029 }
        r3 = (defpackage.akez) r3;	 Catch:{ Throwable -> 0x0029 }
        r3 = defpackage.akfh.b(r3);	 Catch:{ Throwable -> 0x0029 }
        defpackage.akax.a(r1, r2);
        return r3;
    L_0x0027:
        r3 = move-exception;
        goto L_0x002b;
    L_0x0029:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0027 }
    L_0x002b:
        defpackage.akax.a(r1, r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.api.BriteDatabaseExtensionsKt.queryFirst(com.snap.core.db.api.DbClient, ainx, ainw):java.lang.Object");
    }

    /* JADX WARNING: Missing block: B:9:0x002b, code skipped:
            defpackage.akax.a(r1, r2);
     */
    public static final <R> java.util.List<R> queryList(com.snap.core.db.api.DbClient r1, defpackage.ainx r2, defpackage.ainw<R> r3) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r1, r0);
        r0 = "statement";
        defpackage.akcr.b(r2, r0);
        r0 = "mapper";
        defpackage.akcr.b(r3, r0);
        r1 = r1.query(r2);
        r1 = com.snap.core.db.api.CursorExtensionsKt.asSequence(r1, r3);
        r1 = (java.io.Closeable) r1;
        r2 = 0;
        r3 = r1;
        r3 = (com.snap.core.db.api.CursorSequence) r3;	 Catch:{ Throwable -> 0x0029 }
        r3 = (defpackage.akez) r3;	 Catch:{ Throwable -> 0x0029 }
        r3 = defpackage.akfh.d(r3);	 Catch:{ Throwable -> 0x0029 }
        defpackage.akax.a(r1, r2);
        return r3;
    L_0x0027:
        r3 = move-exception;
        goto L_0x002b;
    L_0x0029:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0027 }
    L_0x002b:
        defpackage.akax.a(r1, r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.api.BriteDatabaseExtensionsKt.queryList(com.snap.core.db.api.DbClient, ainx, ainw):java.util.List");
    }

    public static final <R> CursorSequence<R> querySequence(DbClient dbClient, ainx ainx, ainw<R> ainw) {
        akcr.b(dbClient, "receiver$0");
        akcr.b(ainx, "statement");
        akcr.b(ainw, "mapper");
        return CursorExtensionsKt.asSequence(dbClient.query(ainx), ainw);
    }
}

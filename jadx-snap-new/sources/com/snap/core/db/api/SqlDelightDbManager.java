package com.snap.core.db.api;

import android.content.Context;
import defpackage.ainf;
import defpackage.ainf.a;
import defpackage.aino;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajev;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.idd;
import defpackage.pa;

public interface SqlDelightDbManager {
    <TValue> ajdx<TValue> callInTransaction(idd idd, akbl<? super a, ? extends TValue> akbl);

    <TValue> TValue callInTransactionImmediately(String str, akbl<? super a, ? extends TValue> akbl);

    void ensureInitialized();

    SqlDelightDbClient getDbClient(idd idd);

    ainf getQueryWrapper();

    int getSessionId();

    aino getSqlDriver();

    pa getWritableDatabase();

    ajcx init(Context context);

    ainf initSqldelight(aino aino);

    boolean isDbScheduler();

    ajcx reset(Context context, ajev ajev);

    ajcx runInTransaction(idd idd, akbl<? super a, ajxw> akbl);

    void runInTransactionImmediately(String str, int i, akbl<? super a, ajxw> akbl);

    ajdw scheduler();

    void throwIfNotDbScheduler();
}

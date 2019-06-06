package com.snap.core.db.api;

import android.content.Context;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ajcx;
import defpackage.ajdj;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.akbl;
import defpackage.idd;
import defpackage.ide;
import defpackage.pa;

public interface DbManager {
    <TValue> ajdx<TValue> callInTransaction(idd idd, akbl<DbTransaction, TValue> akbl);

    <T> ajdj<T> firstElement(ainx ainx, ainw<T> ainw);

    pa getDatabase();

    DbClient getDbClient(idd idd);

    DbClient getDbClient(ide ide);

    ajcx init(Context context);

    boolean isDbScheduler();

    ajcx reset(Context context, ajev ajev);

    <TValue> ajdx<TValue> scheduleCallInTransaction(String str, akbl<DbTransaction, TValue> akbl);

    ajcx scheduleRunInTransaction(String str, ajfb<DbTransaction> ajfb);

    ajdw scheduler();

    void throwIfNotDbScheduler();
}

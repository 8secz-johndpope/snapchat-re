package com.snap.core.db.api;

import android.database.Cursor;
import com.google.common.base.Optional;
import defpackage.ainb;
import defpackage.ainf;
import defpackage.ainf.a;
import defpackage.ainn;
import defpackage.ajcx;
import defpackage.ajdp;
import defpackage.ajdx;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.pa;
import java.util.List;

public interface SqlDelightDbClient {
    <T> ajdx<T> callInTransaction(String str, akbl<? super a, ? extends T> akbl);

    <T> T callInTransactionImmediately(String str, akbl<? super a, ? extends T> akbl);

    void execute(String str);

    int getChangedRowCount();

    ainf getDatabase();

    long getLastInsertedRowId();

    pa getWritableDatabase();

    <R> ainn query(String str, ainb<? extends R> ainb);

    Cursor query(String str, String str2);

    <R> boolean query(String str, ainb<? extends R> ainb, akbl<? super R, ajxw> akbl);

    <T> ajdp<List<T>> queryAndMapToList(String str, ainb<? extends T> ainb);

    <T> ajdp<T> queryAndMapToOne(String str, ainb<? extends T> ainb);

    <T> ajdp<T> queryAndMapToOneNonNull(String str, ainb<? extends T> ainb);

    <T> ajdx<T> queryAndMapToOneOrDefault(String str, ainb<? extends T> ainb, T t);

    <T> ajdx<T> queryAndMapToOneOrError(String str, ainb<? extends T> ainb);

    <T> ajdp<Optional<T>> queryAndMapToOptional(String str, ainb<? extends T> ainb);

    <R> List<R> queryAsList(String str, ainb<? extends R> ainb);

    <R> R queryFirst(String str, ainb<? extends R> ainb);

    <R> R queryFirst(String str, ainb<? extends R> ainb, R r);

    ajcx runInTransaction(String str, akbl<? super a, ajxw> akbl);

    ajcx runInTransactionCompat(String str, ajfb<a> ajfb);

    void runInTransactionImmediately(String str, akbl<? super a, ajxw> akbl);
}

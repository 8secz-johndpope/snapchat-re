package com.snap.core.db.api;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ajcx;
import defpackage.ajdp;
import defpackage.ajdx;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.pa;
import java.util.List;
import java.util.Set;

public interface DbClient {
    <T> ajdx<T> callInTransaction(String str, akbl<? super DbTransaction, ? extends T> akbl);

    void execute(String str);

    void executeAndTrigger(String str, String str2, Object... objArr);

    long executeInsert(ainy ainy);

    long executeInsert(ainy ainy, DbTransaction dbTransaction);

    int executeUpdateDelete(ainy ainy);

    int executeUpdateDelete(ainy ainy, DbTransaction dbTransaction);

    pa getWritableDatabase();

    Cursor query(ainx ainx);

    Cursor query(String str);

    <R> List<R> query(ainx ainx, ainw<R> ainw);

    <R> boolean query(ainx ainx, ainw<R> ainw, akbl<? super R, ajxw> akbl);

    <T> ajdp<List<T>> queryAndMapToList(ainx ainx, akbl<? super Cursor, ? extends T> akbl);

    <T> ajdp<List<T>> queryAndMapToList(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl);

    <T> ajdp<List<T>> queryAndMapToList(String str, Set<String> set, ainx ainx, akbl<? super Cursor, ? extends T> akbl);

    <T> ajdp<T> queryAndMapToOne(ainx ainx, akbl<? super Cursor, ? extends T> akbl);

    <T> ajdp<T> queryAndMapToOne(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl);

    <T> ajdx<T> queryAndMapToOneOrDefault(ainx ainx, akbl<? super Cursor, ? extends T> akbl, T t);

    <T> ajdx<T> queryAndMapToOneOrDefault(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl, T t);

    <T> ajdp<T> queryAndMapToOneOrDefaultObservable(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl, T t);

    <T> ajdx<T> queryAndMapToOneOrError(ainx ainx, akbl<? super Cursor, ? extends T> akbl);

    <T> ajdx<T> queryAndMapToOneOrError(String str, ainx ainx, akbl<? super Cursor, ? extends T> akbl);

    <R> R queryFirst(ainx ainx, ainw<R> ainw);

    <R> R queryFirst(ainx ainx, ainw<R> ainw, R r);

    ajcx runInTransaction(String str, akbl<? super DbTransaction, ajxw> akbl);

    ajcx runInTransactionCompat(String str, ajfb<DbTransaction> ajfb);

    void throwIfNotDbScheduler();
}

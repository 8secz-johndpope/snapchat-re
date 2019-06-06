package com.snap.core.db.record;

import defpackage.adsh;
import defpackage.ainb;
import defpackage.ainf;
import defpackage.akcf;
import java.util.Collection;

public interface DataConsumptionQueries extends ainf {
    void createFetchBeginTimeIndex();

    void createFirstAccessedTimeIndex();

    void deleteAll();

    void deleteAllConsumedRows();

    void deleteOldRecords(Long l);

    ainb<DataConsumption> filterUnconsumedRows(Collection<String> collection);

    <T> ainb<T> filterUnconsumedRows(Collection<String> collection, akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf);

    void insertRow(String str, String str2, String str3, String str4, Long l, Long l2, adsh adsh);

    ainb<DataConsumption> selectAll();

    <T> ainb<T> selectAll(akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf);

    ainb<DataConsumption> selectAllConsumedRows();

    <T> ainb<T> selectAllConsumedRows(akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf);

    ainb<DataConsumption> selectAllNewlyFetchedRows(Long l);

    <T> ainb<T> selectAllNewlyFetchedRows(Long l, akcf<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super adsh, ? extends T> akcf);

    void setFirstAccessedTimeToLastestEntry(Long l, String str);
}

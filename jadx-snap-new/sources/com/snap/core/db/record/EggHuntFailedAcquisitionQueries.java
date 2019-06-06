package com.snap.core.db.record;

import defpackage.ainb;
import defpackage.ainf;
import defpackage.akcb;

public interface EggHuntFailedAcquisitionQueries extends ainf {
    void createFetchBeginTimeIndex();

    void deleteRow(String str);

    void insertRow(String str, long j, long j2);

    ainb<EggHuntFailedAcquisition> selectAll();

    <T> ainb<T> selectAll(akcb<? super Long, ? super String, ? super Long, ? super Long, ? extends T> akcb);
}

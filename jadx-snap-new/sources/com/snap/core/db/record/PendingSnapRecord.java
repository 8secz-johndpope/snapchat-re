package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.UpdateStatus;
import com.snap.core.db.record.PendingSnapModel.Factory;
import com.snap.core.db.record.PendingSnapModel.GetPendingSnapInfoModel;
import defpackage.ainu;
import defpackage.ainv;

@AutoValue
public abstract class PendingSnapRecord implements PendingSnapModel {
    public static final Factory<PendingSnapRecord> FACTORY = new Factory(-$$Lambda$V7nnCPFXrBcpyTMT35FiqJiKRuY.INSTANCE, UPDATE_STATUS_ADAPTER);
    private static final ainu<UpdateStatus, String> UPDATE_STATUS_ADAPTER = ainv.a(UpdateStatus.class);

    @AutoValue
    public static abstract class PendingSnapInfo implements GetPendingSnapInfoModel {
    }
}

package com.snap.core.db.api;

import com.snap.core.db.api.TransactionTracker.TrackingToken;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class TransactionTracker$reportTransactionEnded$$inlined$synchronized$lambda$1 extends akcs implements akbl<TrackingToken, Boolean> {
    final /* synthetic */ long $cutoff$inlined;
    final /* synthetic */ TransactionTracker this$0;

    TransactionTracker$reportTransactionEnded$$inlined$synchronized$lambda$1(TransactionTracker transactionTracker, long j) {
        this.this$0 = transactionTracker;
        this.$cutoff$inlined = j;
        super(1);
    }

    public final boolean invoke(TrackingToken trackingToken) {
        akcr.b(trackingToken, "it");
        Long endTimeMillis = trackingToken.getEndTimeMillis();
        if (endTimeMillis != null) {
            if ((((Number) endTimeMillis).longValue() < this.$cutoff$inlined ? 1 : null) == 1) {
                return true;
            }
        }
        return false;
    }
}

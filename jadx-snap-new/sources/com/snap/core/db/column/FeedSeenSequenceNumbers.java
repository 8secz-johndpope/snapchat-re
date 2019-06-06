package com.snap.core.db.column;

import com.google.common.collect.Table;
import com.snap.core.db.record.SeenSequenceNumbersModel;
import defpackage.akcr;

public final class FeedSeenSequenceNumbers {
    private final Table<Long, Long, Long> sequenceNumbers;

    public FeedSeenSequenceNumbers(Table<Long, Long, Long> table) {
        akcr.b(table, SeenSequenceNumbersModel.SEQUENCENUMBERS);
        this.sequenceNumbers = table;
    }

    public static /* synthetic */ FeedSeenSequenceNumbers copy$default(FeedSeenSequenceNumbers feedSeenSequenceNumbers, Table table, int i, Object obj) {
        if ((i & 1) != 0) {
            table = feedSeenSequenceNumbers.sequenceNumbers;
        }
        return feedSeenSequenceNumbers.copy(table);
    }

    public final Table<Long, Long, Long> component1() {
        return this.sequenceNumbers;
    }

    public final FeedSeenSequenceNumbers copy(Table<Long, Long, Long> table) {
        akcr.b(table, SeenSequenceNumbersModel.SEQUENCENUMBERS);
        return new FeedSeenSequenceNumbers(table);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.sequenceNumbers, ((com.snap.core.db.column.FeedSeenSequenceNumbers) r2).sequenceNumbers) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.core.db.column.FeedSeenSequenceNumbers;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.core.db.column.FeedSeenSequenceNumbers) r2;
        r0 = r1.sequenceNumbers;
        r2 = r2.sequenceNumbers;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.FeedSeenSequenceNumbers.equals(java.lang.Object):boolean");
    }

    public final Long getSequenceNumber(long j, long j2) {
        return (Long) this.sequenceNumbers.get(Long.valueOf(j), Long.valueOf(j2));
    }

    public final Table<Long, Long, Long> getSequenceNumbers() {
        return this.sequenceNumbers;
    }

    public final int hashCode() {
        Table table = this.sequenceNumbers;
        return table != null ? table.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedSeenSequenceNumbers(sequenceNumbers=");
        stringBuilder.append(this.sequenceNumbers);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

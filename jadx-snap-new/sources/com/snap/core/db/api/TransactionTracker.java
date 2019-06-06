package com.snap.core.db.api;

import defpackage.ajyr;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akeb;
import defpackage.ihh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class TransactionTracker {
    private final ihh clock;
    private final List<TrackingToken> transactions = new ArrayList();

    public static final class TrackingToken {
        private final ihh clock;
        private Long endTimeMillis;
        private Long startTimeMillis;
        private final long submissionTimeMillis;
        private final String tag;
        private DbTransaction transaction;

        public TrackingToken(ihh ihh, String str, long j, DbTransaction dbTransaction, Long l, Long l2) {
            akcr.b(ihh, "clock");
            akcr.b(str, "tag");
            this.clock = ihh;
            this.tag = str;
            this.submissionTimeMillis = j;
            this.transaction = dbTransaction;
            this.startTimeMillis = l;
            this.endTimeMillis = l2;
        }

        public /* synthetic */ TrackingToken(ihh ihh, String str, long j, DbTransaction dbTransaction, Long l, Long l2, int i, akco akco) {
            this(ihh, str, j, (i & 8) != 0 ? null : dbTransaction, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2);
        }

        private final ihh component1() {
            return this.clock;
        }

        public static /* synthetic */ TrackingToken copy$default(TrackingToken trackingToken, ihh ihh, String str, long j, DbTransaction dbTransaction, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                ihh = trackingToken.clock;
            }
            if ((i & 2) != 0) {
                str = trackingToken.tag;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                j = trackingToken.submissionTimeMillis;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                dbTransaction = trackingToken.transaction;
            }
            DbTransaction dbTransaction2 = dbTransaction;
            if ((i & 16) != 0) {
                l = trackingToken.startTimeMillis;
            }
            Long l3 = l;
            if ((i & 32) != 0) {
                l2 = trackingToken.endTimeMillis;
            }
            return trackingToken.copy(ihh, str2, j2, dbTransaction2, l3, l2);
        }

        private final long orNow(Long l) {
            return l != null ? l.longValue() : this.clock.a();
        }

        public final String component2() {
            return this.tag;
        }

        public final long component3() {
            return this.submissionTimeMillis;
        }

        public final DbTransaction component4() {
            return this.transaction;
        }

        public final Long component5() {
            return this.startTimeMillis;
        }

        public final Long component6() {
            return this.endTimeMillis;
        }

        public final TrackingToken copy(ihh ihh, String str, long j, DbTransaction dbTransaction, Long l, Long l2) {
            ihh ihh2 = ihh;
            akcr.b(ihh, "clock");
            String str2 = str;
            akcr.b(str, "tag");
            return new TrackingToken(ihh2, str2, j, dbTransaction, l, l2);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TrackingToken) {
                    TrackingToken trackingToken = (TrackingToken) obj;
                    if (akcr.a(this.clock, trackingToken.clock) && akcr.a(this.tag, trackingToken.tag)) {
                        if (!((this.submissionTimeMillis == trackingToken.submissionTimeMillis ? 1 : null) != null && akcr.a(this.transaction, trackingToken.transaction) && akcr.a(this.startTimeMillis, trackingToken.startTimeMillis) && akcr.a(this.endTimeMillis, trackingToken.endTimeMillis))) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final Long getEndTimeMillis() {
            return this.endTimeMillis;
        }

        public final akeb getQueuedRange() {
            return new akeb(this.submissionTimeMillis, orNow(this.startTimeMillis));
        }

        public final akeb getRunningRange() {
            return new akeb(orNow(this.startTimeMillis), orNow(this.endTimeMillis));
        }

        public final Long getStartTimeMillis() {
            return this.startTimeMillis;
        }

        public final long getSubmissionTimeMillis() {
            return this.submissionTimeMillis;
        }

        public final String getTag() {
            return this.tag;
        }

        public final DbTransaction getTransaction() {
            return this.transaction;
        }

        public final int hashCode() {
            ihh ihh = this.clock;
            int i = 0;
            int hashCode = (ihh != null ? ihh.hashCode() : 0) * 31;
            String str = this.tag;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            long j = this.submissionTimeMillis;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            DbTransaction dbTransaction = this.transaction;
            hashCode = (hashCode + (dbTransaction != null ? dbTransaction.hashCode() : 0)) * 31;
            Long l = this.startTimeMillis;
            hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
            l = this.endTimeMillis;
            if (l != null) {
                i = l.hashCode();
            }
            return hashCode + i;
        }

        public final void setEndTimeMillis(Long l) {
            this.endTimeMillis = l;
        }

        public final void setStartTimeMillis(Long l) {
            this.startTimeMillis = l;
        }

        public final void setTransaction(DbTransaction dbTransaction) {
            this.transaction = dbTransaction;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("TrackingToken(clock=");
            stringBuilder.append(this.clock);
            stringBuilder.append(", tag=");
            stringBuilder.append(this.tag);
            stringBuilder.append(", submissionTimeMillis=");
            stringBuilder.append(this.submissionTimeMillis);
            stringBuilder.append(", transaction=");
            stringBuilder.append(this.transaction);
            stringBuilder.append(", startTimeMillis=");
            stringBuilder.append(this.startTimeMillis);
            stringBuilder.append(", endTimeMillis=");
            stringBuilder.append(this.endTimeMillis);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public TransactionTracker(ihh ihh) {
        akcr.b(ihh, "clock");
        this.clock = ihh;
    }

    public final TrackingToken getBiggestBlocker(akeb akeb) {
        Object obj;
        akcr.b(akeb, "timeInterval");
        Iterator it = getBlockingTransactions(akeb).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            long access$intersection = TransactionTrackerKt.intersection(((TrackingToken) next).getRunningRange(), akeb);
            while (it.hasNext()) {
                Object next2 = it.next();
                long access$intersection2 = TransactionTrackerKt.intersection(((TrackingToken) next2).getRunningRange(), akeb);
                if (access$intersection < access$intersection2) {
                    next = next2;
                    access$intersection = access$intersection2;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        return (TrackingToken) obj;
    }

    public final List<TrackingToken> getBlockingTransactions(akeb akeb) {
        akcr.b(akeb, "timeInterval");
        Collection arrayList = new ArrayList();
        for (Object next : getTransactions()) {
            if ((TransactionTrackerKt.intersection(((TrackingToken) next).getRunningRange(), akeb) > 0 ? 1 : null) != null) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public final List<TrackingToken> getTransactions() {
        return this.transactions;
    }

    public final void reportTransactionEnded(TrackingToken trackingToken) {
        akcr.b(trackingToken, "token");
        long a = this.clock.a();
        trackingToken.setEndTimeMillis(Long.valueOf(a));
        a -= 60000;
        synchronized (this.transactions) {
            ajyr.a(this.transactions, (akbl) new TransactionTracker$reportTransactionEnded$$inlined$synchronized$lambda$1(this, a));
        }
    }

    public final void reportTransactionStarted(TrackingToken trackingToken, DbTransaction dbTransaction) {
        akcr.b(trackingToken, "token");
        akcr.b(dbTransaction, "tx");
        trackingToken.setStartTimeMillis(Long.valueOf(this.clock.a()));
        trackingToken.setTransaction(dbTransaction);
    }

    public final TrackingToken reportTransactionSubmitted(String str) {
        akcr.b(str, "tag");
        ihh ihh = this.clock;
        TrackingToken trackingToken = new TrackingToken(ihh, str, ihh.a(), null, null, null, 56, null);
        synchronized (this.transactions) {
            this.transactions.add(trackingToken);
        }
        return trackingToken;
    }
}

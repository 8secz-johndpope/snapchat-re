package com.snap.core.db.record;

import defpackage.acbu;

final class AutoValue_BenchmarkRequestRecord extends BenchmarkRequestRecord {
    private final long _id;
    private final long benchmarkId;
    private final acbu benchmarkResult;
    private final Long expirationTsSec;
    private final Boolean hasBeenScheduled;

    AutoValue_BenchmarkRequestRecord(long j, long j2, Long l, Boolean bool, acbu acbu) {
        this._id = j;
        this.benchmarkId = j2;
        this.expirationTsSec = l;
        this.hasBeenScheduled = bool;
        this.benchmarkResult = acbu;
    }

    public final long _id() {
        return this._id;
    }

    public final long benchmarkId() {
        return this.benchmarkId;
    }

    public final acbu benchmarkResult() {
        return this.benchmarkResult;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BenchmarkRequestRecord) {
            BenchmarkRequestRecord benchmarkRequestRecord = (BenchmarkRequestRecord) obj;
            if (this._id == benchmarkRequestRecord._id() && this.benchmarkId == benchmarkRequestRecord.benchmarkId()) {
                Long l = this.expirationTsSec;
                if (l != null ? !l.equals(benchmarkRequestRecord.expirationTsSec()) : benchmarkRequestRecord.expirationTsSec() != null) {
                    Boolean bool = this.hasBeenScheduled;
                    if (bool != null ? !bool.equals(benchmarkRequestRecord.hasBeenScheduled()) : benchmarkRequestRecord.hasBeenScheduled() != null) {
                        acbu acbu = this.benchmarkResult;
                        return acbu != null ? !acbu.equals(benchmarkRequestRecord.benchmarkResult()) : benchmarkRequestRecord.benchmarkResult() != null;
                    }
                }
            }
        }
    }

    public final Long expirationTsSec() {
        return this.expirationTsSec;
    }

    public final Boolean hasBeenScheduled() {
        return this.hasBeenScheduled;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.benchmarkId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.expirationTsSec;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.hasBeenScheduled;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        acbu acbu = this.benchmarkResult;
        if (acbu != null) {
            i2 = acbu.hashCode();
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BenchmarkRequestRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", benchmarkId=");
        stringBuilder.append(this.benchmarkId);
        stringBuilder.append(", expirationTsSec=");
        stringBuilder.append(this.expirationTsSec);
        stringBuilder.append(", hasBeenScheduled=");
        stringBuilder.append(this.hasBeenScheduled);
        stringBuilder.append(", benchmarkResult=");
        stringBuilder.append(this.benchmarkResult);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

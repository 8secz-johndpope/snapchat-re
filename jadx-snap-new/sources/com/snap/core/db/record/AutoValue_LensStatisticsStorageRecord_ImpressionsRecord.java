package com.snap.core.db.record;

import com.snap.core.db.record.LensStatisticsStorageRecord.ImpressionsRecord;

final class AutoValue_LensStatisticsStorageRecord_ImpressionsRecord extends ImpressionsRecord {
    private final int impressionCount;
    private final String lensId;

    AutoValue_LensStatisticsStorageRecord_ImpressionsRecord(String str, int i) {
        if (str != null) {
            this.lensId = str;
            this.impressionCount = i;
            return;
        }
        throw new NullPointerException("Null lensId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImpressionsRecord) {
            ImpressionsRecord impressionsRecord = (ImpressionsRecord) obj;
            return this.lensId.equals(impressionsRecord.lensId()) && this.impressionCount == impressionsRecord.impressionCount();
        }
    }

    public final int hashCode() {
        return ((this.lensId.hashCode() ^ 1000003) * 1000003) ^ this.impressionCount;
    }

    public final int impressionCount() {
        return this.impressionCount;
    }

    public final String lensId() {
        return this.lensId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ImpressionsRecord{lensId=");
        stringBuilder.append(this.lensId);
        stringBuilder.append(", impressionCount=");
        stringBuilder.append(this.impressionCount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

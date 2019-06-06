package com.snap.core.db.record;

import com.snap.core.db.record.PendingSnapRecord.PendingSnapInfo;
import defpackage.gcp;

final class AutoValue_PendingSnapRecord_PendingSnapInfo extends PendingSnapInfo {
    private final String esId;
    private final String snapId;
    private final gcp snapType;
    private final long timestamp;

    AutoValue_PendingSnapRecord_PendingSnapInfo(String str, gcp gcp, long j, String str2) {
        if (str != null) {
            this.snapId = str;
            if (gcp != null) {
                this.snapType = gcp;
                this.timestamp = j;
                this.esId = str2;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PendingSnapInfo) {
            PendingSnapInfo pendingSnapInfo = (PendingSnapInfo) obj;
            if (this.snapId.equals(pendingSnapInfo.snapId()) && this.snapType.equals(pendingSnapInfo.snapType()) && this.timestamp == pendingSnapInfo.timestamp()) {
                String str = this.esId;
                return str != null ? !str.equals(pendingSnapInfo.esId()) : pendingSnapInfo.esId() != null;
            }
        }
    }

    public final String esId() {
        return this.esId;
    }

    public final int hashCode() {
        int hashCode = (((this.snapId.hashCode() ^ 1000003) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str = this.esId;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String snapId() {
        return this.snapId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PendingSnapInfo{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", esId=");
        stringBuilder.append(this.esId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

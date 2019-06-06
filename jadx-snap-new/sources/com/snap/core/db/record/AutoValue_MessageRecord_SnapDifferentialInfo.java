package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.SnapDifferentialInfo;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.gcp;

final class AutoValue_MessageRecord_SnapDifferentialInfo extends SnapDifferentialInfo {
    private final long messageRowId;
    private final String messageType;
    private final gcj preserved;
    private final gcm savedStates;
    private final SnapServerStatus serverStatus;
    private final String snapId;
    private final gcp snapType;
    private final long timestamp;

    AutoValue_MessageRecord_SnapDifferentialInfo(String str, long j, long j2, gcp gcp, String str2, SnapServerStatus snapServerStatus, gcm gcm, gcj gcj) {
        if (str != null) {
            this.snapId = str;
            this.messageRowId = j;
            this.timestamp = j2;
            if (gcp != null) {
                this.snapType = gcp;
                this.messageType = str2;
                this.serverStatus = snapServerStatus;
                this.savedStates = gcm;
                if (gcj != null) {
                    this.preserved = gcj;
                    return;
                }
                throw new NullPointerException("Null preserved");
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapDifferentialInfo) {
            SnapDifferentialInfo snapDifferentialInfo = (SnapDifferentialInfo) obj;
            if (this.snapId.equals(snapDifferentialInfo.snapId()) && this.messageRowId == snapDifferentialInfo.messageRowId() && this.timestamp == snapDifferentialInfo.timestamp() && this.snapType.equals(snapDifferentialInfo.snapType())) {
                String str = this.messageType;
                if (str != null ? !str.equals(snapDifferentialInfo.messageType()) : snapDifferentialInfo.messageType() != null) {
                    SnapServerStatus snapServerStatus = this.serverStatus;
                    if (snapServerStatus != null ? !snapServerStatus.equals(snapDifferentialInfo.serverStatus()) : snapDifferentialInfo.serverStatus() != null) {
                        gcm gcm = this.savedStates;
                        if (gcm != null ? !gcm.equals(snapDifferentialInfo.savedStates()) : snapDifferentialInfo.savedStates() != null) {
                            if (this.preserved.equals(snapDifferentialInfo.preserved())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        long j = this.messageRowId;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        j = this.timestamp;
        hashCode = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        String str = this.messageType;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        gcm gcm = this.savedStates;
        if (gcm != null) {
            i = gcm.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.preserved.hashCode();
    }

    public final long messageRowId() {
        return this.messageRowId;
    }

    public final String messageType() {
        return this.messageType;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final gcm savedStates() {
        return this.savedStates;
    }

    public final SnapServerStatus serverStatus() {
        return this.serverStatus;
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
        StringBuilder stringBuilder = new StringBuilder("SnapDifferentialInfo{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", messageRowId=");
        stringBuilder.append(this.messageRowId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.messageType);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.savedStates);
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

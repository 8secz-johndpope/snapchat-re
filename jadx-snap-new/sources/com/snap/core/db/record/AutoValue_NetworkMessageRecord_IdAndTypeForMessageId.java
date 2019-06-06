package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.NetworkMessageRecord.IdAndTypeForMessageId;

final class AutoValue_NetworkMessageRecord_IdAndTypeForMessageId extends IdAndTypeForMessageId {
    private final long _id;
    private final String messageType;
    private final SnapServerStatus snapServerStatus;

    AutoValue_NetworkMessageRecord_IdAndTypeForMessageId(long j, String str, SnapServerStatus snapServerStatus) {
        this._id = j;
        if (str != null) {
            this.messageType = str;
            this.snapServerStatus = snapServerStatus;
            return;
        }
        throw new NullPointerException("Null messageType");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IdAndTypeForMessageId) {
            IdAndTypeForMessageId idAndTypeForMessageId = (IdAndTypeForMessageId) obj;
            if (this._id == idAndTypeForMessageId._id() && this.messageType.equals(idAndTypeForMessageId.messageType())) {
                SnapServerStatus snapServerStatus = this.snapServerStatus;
                return snapServerStatus != null ? !snapServerStatus.equals(idAndTypeForMessageId.snapServerStatus()) : idAndTypeForMessageId.snapServerStatus() != null;
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.messageType.hashCode()) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        return (snapServerStatus == null ? 0 : snapServerStatus.hashCode()) ^ hashCode;
    }

    public final String messageType() {
        return this.messageType;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdAndTypeForMessageId{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.messageType);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

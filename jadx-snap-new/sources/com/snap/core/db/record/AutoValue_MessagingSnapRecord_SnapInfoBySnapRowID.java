package com.snap.core.db.record;

import com.snap.core.db.record.MessagingSnapRecord.SnapInfoBySnapRowID;

final class AutoValue_MessagingSnapRecord_SnapInfoBySnapRowID extends SnapInfoBySnapRowID {
    private final String attachmentUrl;
    private final String snapId;
    private final long timestamp;
    private final String username;

    AutoValue_MessagingSnapRecord_SnapInfoBySnapRowID(String str, long j, String str2, String str3) {
        if (str != null) {
            this.snapId = str;
            this.timestamp = j;
            this.attachmentUrl = str2;
            if (str3 != null) {
                this.username = str3;
                return;
            }
            throw new NullPointerException("Null username");
        }
        throw new NullPointerException("Null snapId");
    }

    public final String attachmentUrl() {
        return this.attachmentUrl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapInfoBySnapRowID) {
            SnapInfoBySnapRowID snapInfoBySnapRowID = (SnapInfoBySnapRowID) obj;
            if (this.snapId.equals(snapInfoBySnapRowID.snapId()) && this.timestamp == snapInfoBySnapRowID.timestamp()) {
                String str = this.attachmentUrl;
                if (str != null ? !str.equals(snapInfoBySnapRowID.attachmentUrl()) : snapInfoBySnapRowID.attachmentUrl() != null) {
                    if (this.username.equals(snapInfoBySnapRowID.username())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str = this.attachmentUrl;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.username.hashCode();
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapInfoBySnapRowID{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.GetSnapsForFeed;

final class AutoValue_MessageRecord_GetSnapsForFeed extends GetSnapsForFeed {
    private final long isSelfConversation;
    private final String key;
    private final boolean released;
    private final SnapServerStatus snapServerStatus;
    private final long timestamp;
    private final String username;

    AutoValue_MessageRecord_GetSnapsForFeed(String str, SnapServerStatus snapServerStatus, String str2, long j, boolean z, long j2) {
        if (str != null) {
            this.key = str;
            this.snapServerStatus = snapServerStatus;
            if (str2 != null) {
                this.username = str2;
                this.timestamp = j;
                this.released = z;
                this.isSelfConversation = j2;
                return;
            }
            throw new NullPointerException("Null username");
        }
        throw new NullPointerException("Null key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetSnapsForFeed) {
            GetSnapsForFeed getSnapsForFeed = (GetSnapsForFeed) obj;
            if (this.key.equals(getSnapsForFeed.key())) {
                SnapServerStatus snapServerStatus = this.snapServerStatus;
                if (snapServerStatus != null ? !snapServerStatus.equals(getSnapsForFeed.snapServerStatus()) : getSnapsForFeed.snapServerStatus() != null) {
                    return this.username.equals(getSnapsForFeed.username()) && this.timestamp == getSnapsForFeed.timestamp() && this.released == getSnapsForFeed.released() && this.isSelfConversation == getSnapsForFeed.isSelfConversation();
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        hashCode = (((hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003) ^ this.username.hashCode()) * 1000003;
        long j = this.timestamp;
        hashCode = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (this.released ? 1231 : 1237)) * 1000003;
        long j2 = this.isSelfConversation;
        return hashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final long isSelfConversation() {
        return this.isSelfConversation;
    }

    public final String key() {
        return this.key;
    }

    public final boolean released() {
        return this.released;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetSnapsForFeed{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append(", isSelfConversation=");
        stringBuilder.append(this.isSelfConversation);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}

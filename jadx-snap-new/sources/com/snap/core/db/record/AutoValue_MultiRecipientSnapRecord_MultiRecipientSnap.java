package com.snap.core.db.record;

import com.snap.core.db.record.MultiRecipientSnapRecord.MultiRecipientSnap;

final class AutoValue_MultiRecipientSnapRecord_MultiRecipientSnap extends MultiRecipientSnap {
    private final long _id;
    private final String displayInteractionType;
    private final String displayName;
    private final String key;
    private final Long lastInteractionTimestamp;

    AutoValue_MultiRecipientSnapRecord_MultiRecipientSnap(long j, String str, String str2, String str3, Long l) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.displayName = str2;
            this.displayInteractionType = str3;
            this.lastInteractionTimestamp = l;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MultiRecipientSnap) {
            MultiRecipientSnap multiRecipientSnap = (MultiRecipientSnap) obj;
            if (this._id == multiRecipientSnap._id() && this.key.equals(multiRecipientSnap.key())) {
                String str = this.displayName;
                if (str != null ? !str.equals(multiRecipientSnap.displayName()) : multiRecipientSnap.displayName() != null) {
                    str = this.displayInteractionType;
                    if (str != null ? !str.equals(multiRecipientSnap.displayInteractionType()) : multiRecipientSnap.displayInteractionType() != null) {
                        Long l = this.lastInteractionTimestamp;
                        return l != null ? !l.equals(multiRecipientSnap.lastInteractionTimestamp()) : multiRecipientSnap.lastInteractionTimestamp() != null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.displayName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayInteractionType;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.lastInteractionTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiRecipientSnap{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

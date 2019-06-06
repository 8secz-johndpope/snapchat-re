package com.snap.core.db.record;

import com.snap.core.db.record.MessageRecord.MessageInfo;
import defpackage.gcj;
import defpackage.gcm;

final class AutoValue_MessageRecord_MessageInfo extends MessageInfo {
    private final long _id;
    private final String key;
    private final gcj preserved;
    private final boolean released;
    private final gcm savedStates;
    private final Long seenTimestamp;
    private final long timestamp;

    AutoValue_MessageRecord_MessageInfo(String str, long j, long j2, Long l, gcm gcm, gcj gcj, boolean z) {
        if (str != null) {
            this.key = str;
            this._id = j;
            this.timestamp = j2;
            this.seenTimestamp = l;
            this.savedStates = gcm;
            if (gcj != null) {
                this.preserved = gcj;
                this.released = z;
                return;
            }
            throw new NullPointerException("Null preserved");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageInfo) {
            MessageInfo messageInfo = (MessageInfo) obj;
            if (this.key.equals(messageInfo.key()) && this._id == messageInfo._id() && this.timestamp == messageInfo.timestamp()) {
                Long l = this.seenTimestamp;
                if (l != null ? !l.equals(messageInfo.seenTimestamp()) : messageInfo.seenTimestamp() != null) {
                    gcm gcm = this.savedStates;
                    if (gcm != null ? !gcm.equals(messageInfo.savedStates()) : messageInfo.savedStates() != null) {
                        return this.preserved.equals(messageInfo.preserved()) && this.released == messageInfo.released();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        long j = this._id;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.seenTimestamp;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        gcm gcm = this.savedStates;
        if (gcm != null) {
            i = gcm.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.preserved.hashCode()) * 1000003) ^ (this.released ? 1231 : 1237);
    }

    public final String key() {
        return this.key;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final boolean released() {
        return this.released;
    }

    public final gcm savedStates() {
        return this.savedStates;
    }

    public final Long seenTimestamp() {
        return this.seenTimestamp;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageInfo{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", _id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", seenTimestamp=");
        stringBuilder.append(this.seenTimestamp);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.savedStates);
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

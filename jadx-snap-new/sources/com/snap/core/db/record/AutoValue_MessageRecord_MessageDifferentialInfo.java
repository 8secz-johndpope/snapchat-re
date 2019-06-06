package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.MessageDifferentialInfo;
import defpackage.gcj;
import defpackage.gcm;

final class AutoValue_MessageRecord_MessageDifferentialInfo extends MessageDifferentialInfo {
    private final MessageClientStatus clientStatus;
    private final long id;
    private final String key;
    private final gcj preserved;
    private final gcm savedStates;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_MessageDifferentialInfo(long j, String str, long j2, String str2, MessageClientStatus messageClientStatus, gcj gcj, gcm gcm) {
        this.id = j;
        if (str != null) {
            this.key = str;
            this.timestamp = j2;
            this.type = str2;
            this.clientStatus = messageClientStatus;
            if (gcj != null) {
                this.preserved = gcj;
                this.savedStates = gcm;
                return;
            }
            throw new NullPointerException("Null preserved");
        }
        throw new NullPointerException("Null key");
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageDifferentialInfo) {
            MessageDifferentialInfo messageDifferentialInfo = (MessageDifferentialInfo) obj;
            if (this.id == messageDifferentialInfo.id() && this.key.equals(messageDifferentialInfo.key()) && this.timestamp == messageDifferentialInfo.timestamp()) {
                String str = this.type;
                if (str != null ? !str.equals(messageDifferentialInfo.type()) : messageDifferentialInfo.type() != null) {
                    MessageClientStatus messageClientStatus = this.clientStatus;
                    if (messageClientStatus != null ? !messageClientStatus.equals(messageDifferentialInfo.clientStatus()) : messageDifferentialInfo.clientStatus() != null) {
                        if (this.preserved.equals(messageDifferentialInfo.preserved())) {
                            gcm gcm = this.savedStates;
                            return gcm != null ? !gcm.equals(messageDifferentialInfo.savedStates()) : messageDifferentialInfo.savedStates() != null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this.id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        long j2 = this.timestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.type;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (((hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003) ^ this.preserved.hashCode()) * 1000003;
        gcm gcm = this.savedStates;
        if (gcm != null) {
            i = gcm.hashCode();
        }
        return hashCode ^ i;
    }

    public final long id() {
        return this.id;
    }

    public final String key() {
        return this.key;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final gcm savedStates() {
        return this.savedStates;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageDifferentialInfo{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.savedStates);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

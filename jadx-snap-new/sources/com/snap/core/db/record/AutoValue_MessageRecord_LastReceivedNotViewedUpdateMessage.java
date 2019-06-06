package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastReceivedNotViewedUpdateMessage;
import defpackage.gcj;
import defpackage.gcm;
import java.util.Arrays;

final class AutoValue_MessageRecord_LastReceivedNotViewedUpdateMessage extends LastReceivedNotViewedUpdateMessage {
    private final MessageClientStatus clientStatus;
    private final byte[] content;
    private final Long feedRowId;
    private final String key;
    private final FeedKind kind;
    private final long messageRetentionInMinutes;
    private final gcj preserved;
    private final boolean released;
    private final gcm savedStates;
    private final Long seenTimestamp;
    private final Long senderId;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastReceivedNotViewedUpdateMessage(Long l, String str, Long l2, String str2, long j, Long l3, byte[] bArr, MessageClientStatus messageClientStatus, boolean z, Long l4, gcj gcj, gcm gcm, long j2, FeedKind feedKind) {
        String str3 = str;
        gcj gcj2 = gcj;
        FeedKind feedKind2 = feedKind;
        this.feedRowId = l;
        if (str3 != null) {
            this.key = str3;
            this.senderId = l2;
            this.type = str2;
            this.timestamp = j;
            this.sequenceNumber = l3;
            this.content = bArr;
            this.clientStatus = messageClientStatus;
            this.released = z;
            this.seenTimestamp = l4;
            if (gcj2 != null) {
                this.preserved = gcj2;
                this.savedStates = gcm;
                this.messageRetentionInMinutes = j2;
                if (feedKind2 != null) {
                    this.kind = feedKind2;
                    return;
                }
                throw new NullPointerException("Null kind");
            }
            throw new NullPointerException("Null preserved");
        }
        throw new NullPointerException("Null key");
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final byte[] content() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastReceivedNotViewedUpdateMessage) {
            LastReceivedNotViewedUpdateMessage lastReceivedNotViewedUpdateMessage = (LastReceivedNotViewedUpdateMessage) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastReceivedNotViewedUpdateMessage.feedRowId()) : lastReceivedNotViewedUpdateMessage.feedRowId() != null) {
                if (this.key.equals(lastReceivedNotViewedUpdateMessage.key())) {
                    l = this.senderId;
                    if (l != null ? !l.equals(lastReceivedNotViewedUpdateMessage.senderId()) : lastReceivedNotViewedUpdateMessage.senderId() != null) {
                        String str = this.type;
                        if (str != null ? !str.equals(lastReceivedNotViewedUpdateMessage.type()) : lastReceivedNotViewedUpdateMessage.type() != null) {
                            if (this.timestamp == lastReceivedNotViewedUpdateMessage.timestamp()) {
                                l = this.sequenceNumber;
                                if (l != null ? !l.equals(lastReceivedNotViewedUpdateMessage.sequenceNumber()) : lastReceivedNotViewedUpdateMessage.sequenceNumber() != null) {
                                    if (Arrays.equals(this.content, lastReceivedNotViewedUpdateMessage instanceof AutoValue_MessageRecord_LastReceivedNotViewedUpdateMessage ? ((AutoValue_MessageRecord_LastReceivedNotViewedUpdateMessage) lastReceivedNotViewedUpdateMessage).content : lastReceivedNotViewedUpdateMessage.content())) {
                                        MessageClientStatus messageClientStatus = this.clientStatus;
                                        if (messageClientStatus != null ? !messageClientStatus.equals(lastReceivedNotViewedUpdateMessage.clientStatus()) : lastReceivedNotViewedUpdateMessage.clientStatus() != null) {
                                            if (this.released == lastReceivedNotViewedUpdateMessage.released()) {
                                                l = this.seenTimestamp;
                                                if (l != null ? !l.equals(lastReceivedNotViewedUpdateMessage.seenTimestamp()) : lastReceivedNotViewedUpdateMessage.seenTimestamp() != null) {
                                                    if (this.preserved.equals(lastReceivedNotViewedUpdateMessage.preserved())) {
                                                        gcm gcm = this.savedStates;
                                                        if (gcm != null ? !gcm.equals(lastReceivedNotViewedUpdateMessage.savedStates()) : lastReceivedNotViewedUpdateMessage.savedStates() != null) {
                                                            return this.messageRetentionInMinutes == lastReceivedNotViewedUpdateMessage.messageRetentionInMinutes() && this.kind.equals(lastReceivedNotViewedUpdateMessage.kind());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        Long l = this.feedRowId;
        int i = 0;
        int hashCode = ((((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        Long l2 = this.senderId;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str = this.type;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        l2 = this.sequenceNumber;
        hashCode = (((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (((hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003) ^ (this.released ? 1231 : 1237)) * 1000003;
        l2 = this.seenTimestamp;
        hashCode = (((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ this.preserved.hashCode()) * 1000003;
        gcm gcm = this.savedStates;
        if (gcm != null) {
            i = gcm.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        j = this.messageRetentionInMinutes;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.kind.hashCode();
    }

    public final String key() {
        return this.key;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final long messageRetentionInMinutes() {
        return this.messageRetentionInMinutes;
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

    public final Long senderId() {
        return this.senderId;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LastReceivedNotViewedUpdateMessage{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append(", seenTimestamp=");
        stringBuilder.append(this.seenTimestamp);
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.savedStates);
        stringBuilder.append(", messageRetentionInMinutes=");
        stringBuilder.append(this.messageRetentionInMinutes);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

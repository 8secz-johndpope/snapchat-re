package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastReceivedNotViewedChat;
import defpackage.gcj;
import defpackage.gcm;

final class AutoValue_MessageRecord_LastReceivedNotViewedChat extends LastReceivedNotViewedChat {
    private final MessageClientStatus clientStatus;
    private final Long feedRowId;
    private final String key;
    private final FeedKind kind;
    private final Long messageRetentionInMinutes;
    private final gcj preserved;
    private final boolean released;
    private final gcm savedStates;
    private final Long seenTimestamp;
    private final Long senderId;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastReceivedNotViewedChat(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3, boolean z, Long l4, gcj gcj, gcm gcm, Long l5, FeedKind feedKind) {
        this.feedRowId = l;
        if (str != null) {
            this.key = str;
            this.senderId = l2;
            this.type = str2;
            this.timestamp = j;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l3;
            this.released = z;
            this.seenTimestamp = l4;
            if (gcj != null) {
                this.preserved = gcj;
                this.savedStates = gcm;
                this.messageRetentionInMinutes = l5;
                this.kind = feedKind;
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
        if (obj instanceof LastReceivedNotViewedChat) {
            LastReceivedNotViewedChat lastReceivedNotViewedChat = (LastReceivedNotViewedChat) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastReceivedNotViewedChat.feedRowId()) : lastReceivedNotViewedChat.feedRowId() != null) {
                if (this.key.equals(lastReceivedNotViewedChat.key())) {
                    l = this.senderId;
                    if (l != null ? !l.equals(lastReceivedNotViewedChat.senderId()) : lastReceivedNotViewedChat.senderId() != null) {
                        String str = this.type;
                        if (str != null ? !str.equals(lastReceivedNotViewedChat.type()) : lastReceivedNotViewedChat.type() != null) {
                            if (this.timestamp == lastReceivedNotViewedChat.timestamp()) {
                                MessageClientStatus messageClientStatus = this.clientStatus;
                                if (messageClientStatus != null ? !messageClientStatus.equals(lastReceivedNotViewedChat.clientStatus()) : lastReceivedNotViewedChat.clientStatus() != null) {
                                    l = this.sequenceNumber;
                                    if (l != null ? !l.equals(lastReceivedNotViewedChat.sequenceNumber()) : lastReceivedNotViewedChat.sequenceNumber() != null) {
                                        if (this.released == lastReceivedNotViewedChat.released()) {
                                            l = this.seenTimestamp;
                                            if (l != null ? !l.equals(lastReceivedNotViewedChat.seenTimestamp()) : lastReceivedNotViewedChat.seenTimestamp() != null) {
                                                if (this.preserved.equals(lastReceivedNotViewedChat.preserved())) {
                                                    gcm gcm = this.savedStates;
                                                    if (gcm != null ? !gcm.equals(lastReceivedNotViewedChat.savedStates()) : lastReceivedNotViewedChat.savedStates() != null) {
                                                        l = this.messageRetentionInMinutes;
                                                        if (l != null ? !l.equals(lastReceivedNotViewedChat.messageRetentionInMinutes()) : lastReceivedNotViewedChat.messageRetentionInMinutes() != null) {
                                                            FeedKind feedKind = this.kind;
                                                            return feedKind != null ? !feedKind.equals(lastReceivedNotViewedChat.kind()) : lastReceivedNotViewedChat.kind() != null;
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
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        l2 = this.sequenceNumber;
        hashCode = (((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.released ? 1231 : 1237)) * 1000003;
        l2 = this.seenTimestamp;
        hashCode = (((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ this.preserved.hashCode()) * 1000003;
        gcm gcm = this.savedStates;
        hashCode = (hashCode ^ (gcm == null ? 0 : gcm.hashCode())) * 1000003;
        l2 = this.messageRetentionInMinutes;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        FeedKind feedKind = this.kind;
        if (feedKind != null) {
            i = feedKind.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final Long messageRetentionInMinutes() {
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
        StringBuilder stringBuilder = new StringBuilder("LastReceivedNotViewedChat{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
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

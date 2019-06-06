package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastSentNotViewedChat;

final class AutoValue_MessageRecord_LastSentNotViewedChat extends LastSentNotViewedChat {
    private final MessageClientStatus clientStatus;
    private final Long feedRowId;
    private final FriendLinkType friendLinkType;
    private final String key;
    private final Long senderId;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;
    private final String username;

    AutoValue_MessageRecord_LastSentNotViewedChat(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3, FriendLinkType friendLinkType, String str3) {
        this.feedRowId = l;
        if (str != null) {
            this.key = str;
            this.senderId = l2;
            this.type = str2;
            this.timestamp = j;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l3;
            this.friendLinkType = friendLinkType;
            this.username = str3;
            return;
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
        if (obj instanceof LastSentNotViewedChat) {
            LastSentNotViewedChat lastSentNotViewedChat = (LastSentNotViewedChat) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastSentNotViewedChat.feedRowId()) : lastSentNotViewedChat.feedRowId() != null) {
                if (this.key.equals(lastSentNotViewedChat.key())) {
                    l = this.senderId;
                    if (l != null ? !l.equals(lastSentNotViewedChat.senderId()) : lastSentNotViewedChat.senderId() != null) {
                        String str = this.type;
                        if (str != null ? !str.equals(lastSentNotViewedChat.type()) : lastSentNotViewedChat.type() != null) {
                            if (this.timestamp == lastSentNotViewedChat.timestamp()) {
                                MessageClientStatus messageClientStatus = this.clientStatus;
                                if (messageClientStatus != null ? !messageClientStatus.equals(lastSentNotViewedChat.clientStatus()) : lastSentNotViewedChat.clientStatus() != null) {
                                    l = this.sequenceNumber;
                                    if (l != null ? !l.equals(lastSentNotViewedChat.sequenceNumber()) : lastSentNotViewedChat.sequenceNumber() != null) {
                                        FriendLinkType friendLinkType = this.friendLinkType;
                                        if (friendLinkType != null ? !friendLinkType.equals(lastSentNotViewedChat.friendLinkType()) : lastSentNotViewedChat.friendLinkType() != null) {
                                            str = this.username;
                                            return str != null ? !str.equals(lastSentNotViewedChat.username()) : lastSentNotViewedChat.username() != null;
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

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
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
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        hashCode = (hashCode ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        String str2 = this.username;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
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
        StringBuilder stringBuilder = new StringBuilder("LastSentNotViewedChat{feedRowId=");
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
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }

    public final String username() {
        return this.username;
    }
}

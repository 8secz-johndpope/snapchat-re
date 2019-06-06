package com.snap.core.db.record;

import com.snap.core.db.record.MessageRecord.MessageMediaForIdInfo;
import java.util.Arrays;

final class AutoValue_MessageRecord_MessageMediaForIdInfo extends MessageMediaForIdInfo {
    private final byte[] content;
    private final String conversationId;
    private final String key;
    private final String senderId;
    private final String type;

    AutoValue_MessageRecord_MessageMediaForIdInfo(String str, String str2, String str3, byte[] bArr, String str4) {
        if (str != null) {
            this.conversationId = str;
            if (str2 != null) {
                this.key = str2;
                this.type = str3;
                this.content = bArr;
                if (str4 != null) {
                    this.senderId = str4;
                    return;
                }
                throw new NullPointerException("Null senderId");
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null conversationId");
    }

    public final byte[] content() {
        return this.content;
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageMediaForIdInfo) {
            MessageMediaForIdInfo messageMediaForIdInfo = (MessageMediaForIdInfo) obj;
            if (this.conversationId.equals(messageMediaForIdInfo.conversationId()) && this.key.equals(messageMediaForIdInfo.key())) {
                String str = this.type;
                if (str != null ? !str.equals(messageMediaForIdInfo.type()) : messageMediaForIdInfo.type() != null) {
                    return Arrays.equals(this.content, messageMediaForIdInfo instanceof AutoValue_MessageRecord_MessageMediaForIdInfo ? ((AutoValue_MessageRecord_MessageMediaForIdInfo) messageMediaForIdInfo).content : messageMediaForIdInfo.content()) && this.senderId.equals(messageMediaForIdInfo.senderId());
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.conversationId.hashCode() ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.type;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003) ^ this.senderId.hashCode();
    }

    public final String key() {
        return this.key;
    }

    public final String senderId() {
        return this.senderId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageMediaForIdInfo{conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

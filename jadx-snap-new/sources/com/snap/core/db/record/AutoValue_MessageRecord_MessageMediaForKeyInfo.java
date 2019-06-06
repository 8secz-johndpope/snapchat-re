package com.snap.core.db.record;

import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.record.MessageRecord.MessageMediaForKeyInfo;
import java.util.Arrays;

final class AutoValue_MessageRecord_MessageMediaForKeyInfo extends MessageMediaForKeyInfo {
    private final byte[] content;
    private final String conversationId;
    private final String senderId;
    private final ReplyMedia snapReplyMedia;
    private final String type;

    AutoValue_MessageRecord_MessageMediaForKeyInfo(String str, String str2, byte[] bArr, ReplyMedia replyMedia, String str3) {
        if (str != null) {
            this.conversationId = str;
            this.type = str2;
            this.content = bArr;
            this.snapReplyMedia = replyMedia;
            if (str3 != null) {
                this.senderId = str3;
                return;
            }
            throw new NullPointerException("Null senderId");
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
        if (obj instanceof MessageMediaForKeyInfo) {
            MessageMediaForKeyInfo messageMediaForKeyInfo = (MessageMediaForKeyInfo) obj;
            if (this.conversationId.equals(messageMediaForKeyInfo.conversationId())) {
                String str = this.type;
                if (str != null ? !str.equals(messageMediaForKeyInfo.type()) : messageMediaForKeyInfo.type() != null) {
                    if (Arrays.equals(this.content, messageMediaForKeyInfo instanceof AutoValue_MessageRecord_MessageMediaForKeyInfo ? ((AutoValue_MessageRecord_MessageMediaForKeyInfo) messageMediaForKeyInfo).content : messageMediaForKeyInfo.content())) {
                        ReplyMedia replyMedia = this.snapReplyMedia;
                        if (replyMedia != null ? !replyMedia.equals(messageMediaForKeyInfo.snapReplyMedia()) : messageMediaForKeyInfo.snapReplyMedia() != null) {
                            if (this.senderId.equals(messageMediaForKeyInfo.senderId())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.conversationId.hashCode() ^ 1000003) * 1000003;
        String str = this.type;
        int i = 0;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003;
        ReplyMedia replyMedia = this.snapReplyMedia;
        if (replyMedia != null) {
            i = replyMedia.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.senderId.hashCode();
    }

    public final String senderId() {
        return this.senderId;
    }

    public final ReplyMedia snapReplyMedia() {
        return this.snapReplyMedia;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageMediaForKeyInfo{conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", snapReplyMedia=");
        stringBuilder.append(this.snapReplyMedia);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

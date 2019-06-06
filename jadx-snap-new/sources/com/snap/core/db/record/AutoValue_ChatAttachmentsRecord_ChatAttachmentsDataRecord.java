package com.snap.core.db.record;

import com.snap.core.db.record.ChatAttachmentsRecord.ChatAttachmentsDataRecord;

final class AutoValue_ChatAttachmentsRecord_ChatAttachmentsDataRecord extends ChatAttachmentsDataRecord {
    private final String attachedContent;
    private final String attachedDisplayName;
    private final String attachedUrl;
    private final String attachedUserId;
    private final String attachedUsername;
    private final String conversationId;
    private final Long savedTimestamp;
    private final String senderDisplayName;
    private final String senderUserId;
    private final String senderUsername;
    private final long sentTimestamp;
    private final String thumbnailUrl;
    private final String type;

    AutoValue_ChatAttachmentsRecord_ChatAttachmentsDataRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, Long l) {
        if (str != null) {
            this.type = str;
            if (str2 != null) {
                this.conversationId = str2;
                this.thumbnailUrl = str3;
                if (str4 != null) {
                    this.attachedContent = str4;
                    this.attachedUrl = str5;
                    this.attachedUserId = str6;
                    this.attachedUsername = str7;
                    this.attachedDisplayName = str8;
                    this.senderUserId = str9;
                    this.senderUsername = str10;
                    this.senderDisplayName = str11;
                    this.sentTimestamp = j;
                    this.savedTimestamp = l;
                    return;
                }
                throw new NullPointerException("Null attachedContent");
            }
            throw new NullPointerException("Null conversationId");
        }
        throw new NullPointerException("Null type");
    }

    public final String attachedContent() {
        return this.attachedContent;
    }

    public final String attachedDisplayName() {
        return this.attachedDisplayName;
    }

    public final String attachedUrl() {
        return this.attachedUrl;
    }

    public final String attachedUserId() {
        return this.attachedUserId;
    }

    public final String attachedUsername() {
        return this.attachedUsername;
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ChatAttachmentsDataRecord) {
            ChatAttachmentsDataRecord chatAttachmentsDataRecord = (ChatAttachmentsDataRecord) obj;
            if (this.type.equals(chatAttachmentsDataRecord.type()) && this.conversationId.equals(chatAttachmentsDataRecord.conversationId())) {
                String str = this.thumbnailUrl;
                if (str != null ? !str.equals(chatAttachmentsDataRecord.thumbnailUrl()) : chatAttachmentsDataRecord.thumbnailUrl() != null) {
                    if (this.attachedContent.equals(chatAttachmentsDataRecord.attachedContent())) {
                        str = this.attachedUrl;
                        if (str != null ? !str.equals(chatAttachmentsDataRecord.attachedUrl()) : chatAttachmentsDataRecord.attachedUrl() != null) {
                            str = this.attachedUserId;
                            if (str != null ? !str.equals(chatAttachmentsDataRecord.attachedUserId()) : chatAttachmentsDataRecord.attachedUserId() != null) {
                                str = this.attachedUsername;
                                if (str != null ? !str.equals(chatAttachmentsDataRecord.attachedUsername()) : chatAttachmentsDataRecord.attachedUsername() != null) {
                                    str = this.attachedDisplayName;
                                    if (str != null ? !str.equals(chatAttachmentsDataRecord.attachedDisplayName()) : chatAttachmentsDataRecord.attachedDisplayName() != null) {
                                        str = this.senderUserId;
                                        if (str != null ? !str.equals(chatAttachmentsDataRecord.senderUserId()) : chatAttachmentsDataRecord.senderUserId() != null) {
                                            str = this.senderUsername;
                                            if (str != null ? !str.equals(chatAttachmentsDataRecord.senderUsername()) : chatAttachmentsDataRecord.senderUsername() != null) {
                                                str = this.senderDisplayName;
                                                if (str != null ? !str.equals(chatAttachmentsDataRecord.senderDisplayName()) : chatAttachmentsDataRecord.senderDisplayName() != null) {
                                                    if (this.sentTimestamp == chatAttachmentsDataRecord.sentTimestamp()) {
                                                        Long l = this.savedTimestamp;
                                                        return l != null ? !l.equals(chatAttachmentsDataRecord.savedTimestamp()) : chatAttachmentsDataRecord.savedTimestamp() != null;
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

    public final int hashCode() {
        int hashCode = (((this.type.hashCode() ^ 1000003) * 1000003) ^ this.conversationId.hashCode()) * 1000003;
        String str = this.thumbnailUrl;
        int i = 0;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.attachedContent.hashCode()) * 1000003;
        str = this.attachedUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.attachedUserId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.attachedUsername;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.attachedDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.senderUserId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.senderUsername;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.senderDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j = this.sentTimestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.savedTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long savedTimestamp() {
        return this.savedTimestamp;
    }

    public final String senderDisplayName() {
        return this.senderDisplayName;
    }

    public final String senderUserId() {
        return this.senderUserId;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final long sentTimestamp() {
        return this.sentTimestamp;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChatAttachmentsDataRecord{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", attachedContent=");
        stringBuilder.append(this.attachedContent);
        stringBuilder.append(", attachedUrl=");
        stringBuilder.append(this.attachedUrl);
        stringBuilder.append(", attachedUserId=");
        stringBuilder.append(this.attachedUserId);
        stringBuilder.append(", attachedUsername=");
        stringBuilder.append(this.attachedUsername);
        stringBuilder.append(", attachedDisplayName=");
        stringBuilder.append(this.attachedDisplayName);
        stringBuilder.append(", senderUserId=");
        stringBuilder.append(this.senderUserId);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", senderDisplayName=");
        stringBuilder.append(this.senderDisplayName);
        stringBuilder.append(", sentTimestamp=");
        stringBuilder.append(this.sentTimestamp);
        stringBuilder.append(", savedTimestamp=");
        stringBuilder.append(this.savedTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

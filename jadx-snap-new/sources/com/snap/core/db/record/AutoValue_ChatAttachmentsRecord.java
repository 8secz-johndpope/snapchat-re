package com.snap.core.db.record;

final class AutoValue_ChatAttachmentsRecord extends ChatAttachmentsRecord {
    private final long _id;
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

    AutoValue_ChatAttachmentsRecord(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j2, Long l) {
        String str12 = str;
        String str13 = str2;
        String str14 = str4;
        this._id = j;
        if (str12 != null) {
            this.type = str12;
            if (str13 != null) {
                this.conversationId = str13;
                this.thumbnailUrl = str3;
                if (str14 != null) {
                    this.attachedContent = str14;
                    this.attachedUrl = str5;
                    this.attachedUserId = str6;
                    this.attachedUsername = str7;
                    this.attachedDisplayName = str8;
                    this.senderUserId = str9;
                    this.senderUsername = str10;
                    this.senderDisplayName = str11;
                    this.sentTimestamp = j2;
                    this.savedTimestamp = l;
                    return;
                }
                throw new NullPointerException("Null attachedContent");
            }
            throw new NullPointerException("Null conversationId");
        }
        throw new NullPointerException("Null type");
    }

    public final long _id() {
        return this._id;
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
        if (obj instanceof ChatAttachmentsRecord) {
            ChatAttachmentsRecord chatAttachmentsRecord = (ChatAttachmentsRecord) obj;
            if (this._id == chatAttachmentsRecord._id() && this.type.equals(chatAttachmentsRecord.type()) && this.conversationId.equals(chatAttachmentsRecord.conversationId())) {
                String str = this.thumbnailUrl;
                if (str != null ? !str.equals(chatAttachmentsRecord.thumbnailUrl()) : chatAttachmentsRecord.thumbnailUrl() != null) {
                    if (this.attachedContent.equals(chatAttachmentsRecord.attachedContent())) {
                        str = this.attachedUrl;
                        if (str != null ? !str.equals(chatAttachmentsRecord.attachedUrl()) : chatAttachmentsRecord.attachedUrl() != null) {
                            str = this.attachedUserId;
                            if (str != null ? !str.equals(chatAttachmentsRecord.attachedUserId()) : chatAttachmentsRecord.attachedUserId() != null) {
                                str = this.attachedUsername;
                                if (str != null ? !str.equals(chatAttachmentsRecord.attachedUsername()) : chatAttachmentsRecord.attachedUsername() != null) {
                                    str = this.attachedDisplayName;
                                    if (str != null ? !str.equals(chatAttachmentsRecord.attachedDisplayName()) : chatAttachmentsRecord.attachedDisplayName() != null) {
                                        str = this.senderUserId;
                                        if (str != null ? !str.equals(chatAttachmentsRecord.senderUserId()) : chatAttachmentsRecord.senderUserId() != null) {
                                            str = this.senderUsername;
                                            if (str != null ? !str.equals(chatAttachmentsRecord.senderUsername()) : chatAttachmentsRecord.senderUsername() != null) {
                                                str = this.senderDisplayName;
                                                if (str != null ? !str.equals(chatAttachmentsRecord.senderDisplayName()) : chatAttachmentsRecord.senderDisplayName() != null) {
                                                    if (this.sentTimestamp == chatAttachmentsRecord.sentTimestamp()) {
                                                        Long l = this.savedTimestamp;
                                                        return l != null ? !l.equals(chatAttachmentsRecord.savedTimestamp()) : chatAttachmentsRecord.savedTimestamp() != null;
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
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.conversationId.hashCode()) * 1000003;
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
        long j2 = this.sentTimestamp;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
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
        StringBuilder stringBuilder = new StringBuilder("ChatAttachmentsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", type=");
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

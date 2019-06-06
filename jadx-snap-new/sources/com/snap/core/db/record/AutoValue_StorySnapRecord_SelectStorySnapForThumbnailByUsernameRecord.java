package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByUsernameRecord;

final class AutoValue_StorySnapRecord_SelectStorySnapForThumbnailByUsernameRecord extends SelectStorySnapForThumbnailByUsernameRecord {
    private final String clientId;
    private final MessageClientStatus clientStatus;
    private final String displayName;
    private final StoryKind kind;
    private final String largeThumbnailUrl;
    private final String mediaId;
    private final String mediaKey;
    private final boolean needAuth;
    private final String snapId;
    private final String storyId;
    private final long storyRowId;
    private final String thumbnailIv;
    private final String thumbnailUrl;
    private final long timestamp;

    AutoValue_StorySnapRecord_SelectStorySnapForThumbnailByUsernameRecord(String str, boolean z, String str2, String str3, String str4, MessageClientStatus messageClientStatus, long j, String str5, long j2, String str6, String str7, String str8, StoryKind storyKind, String str9) {
        String str10 = str;
        String str11 = str5;
        String str12 = str8;
        StoryKind storyKind2 = storyKind;
        if (str10 != null) {
            this.clientId = str10;
            this.needAuth = z;
            this.largeThumbnailUrl = str2;
            this.thumbnailUrl = str3;
            this.thumbnailIv = str4;
            this.clientStatus = messageClientStatus;
            this.storyRowId = j;
            if (str11 != null) {
                this.snapId = str11;
                this.timestamp = j2;
                this.mediaId = str6;
                this.mediaKey = str7;
                if (str12 != null) {
                    this.storyId = str12;
                    if (storyKind2 != null) {
                        this.kind = storyKind2;
                        this.displayName = str9;
                        return;
                    }
                    throw new NullPointerException("Null kind");
                }
                throw new NullPointerException("Null storyId");
            }
            throw new NullPointerException("Null snapId");
        }
        throw new NullPointerException("Null clientId");
    }

    public final String clientId() {
        return this.clientId;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectStorySnapForThumbnailByUsernameRecord) {
            SelectStorySnapForThumbnailByUsernameRecord selectStorySnapForThumbnailByUsernameRecord = (SelectStorySnapForThumbnailByUsernameRecord) obj;
            if (this.clientId.equals(selectStorySnapForThumbnailByUsernameRecord.clientId()) && this.needAuth == selectStorySnapForThumbnailByUsernameRecord.needAuth()) {
                String str = this.largeThumbnailUrl;
                if (str != null ? !str.equals(selectStorySnapForThumbnailByUsernameRecord.largeThumbnailUrl()) : selectStorySnapForThumbnailByUsernameRecord.largeThumbnailUrl() != null) {
                    str = this.thumbnailUrl;
                    if (str != null ? !str.equals(selectStorySnapForThumbnailByUsernameRecord.thumbnailUrl()) : selectStorySnapForThumbnailByUsernameRecord.thumbnailUrl() != null) {
                        str = this.thumbnailIv;
                        if (str != null ? !str.equals(selectStorySnapForThumbnailByUsernameRecord.thumbnailIv()) : selectStorySnapForThumbnailByUsernameRecord.thumbnailIv() != null) {
                            MessageClientStatus messageClientStatus = this.clientStatus;
                            if (messageClientStatus != null ? !messageClientStatus.equals(selectStorySnapForThumbnailByUsernameRecord.clientStatus()) : selectStorySnapForThumbnailByUsernameRecord.clientStatus() != null) {
                                if (this.storyRowId == selectStorySnapForThumbnailByUsernameRecord.storyRowId() && this.snapId.equals(selectStorySnapForThumbnailByUsernameRecord.snapId()) && this.timestamp == selectStorySnapForThumbnailByUsernameRecord.timestamp()) {
                                    str = this.mediaId;
                                    if (str != null ? !str.equals(selectStorySnapForThumbnailByUsernameRecord.mediaId()) : selectStorySnapForThumbnailByUsernameRecord.mediaId() != null) {
                                        str = this.mediaKey;
                                        if (str != null ? !str.equals(selectStorySnapForThumbnailByUsernameRecord.mediaKey()) : selectStorySnapForThumbnailByUsernameRecord.mediaKey() != null) {
                                            if (this.storyId.equals(selectStorySnapForThumbnailByUsernameRecord.storyId()) && this.kind.equals(selectStorySnapForThumbnailByUsernameRecord.kind())) {
                                                str = this.displayName;
                                                return str != null ? !str.equals(selectStorySnapForThumbnailByUsernameRecord.displayName()) : selectStorySnapForThumbnailByUsernameRecord.displayName() != null;
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
        int hashCode = (((this.clientId.hashCode() ^ 1000003) * 1000003) ^ (this.needAuth ? 1231 : 1237)) * 1000003;
        String str = this.largeThumbnailUrl;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.thumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.thumbnailIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        long j = this.storyRowId;
        hashCode = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        str = this.mediaId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        hashCode = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.storyId.hashCode()) * 1000003) ^ this.kind.hashCode()) * 1000003;
        String str2 = this.displayName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final StoryKind kind() {
        return this.kind;
    }

    public final String largeThumbnailUrl() {
        return this.largeThumbnailUrl;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final String mediaKey() {
        return this.mediaKey;
    }

    public final boolean needAuth() {
        return this.needAuth;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String thumbnailIv() {
        return this.thumbnailIv;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectStorySnapForThumbnailByUsernameRecord{clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", needAuth=");
        stringBuilder.append(this.needAuth);
        stringBuilder.append(", largeThumbnailUrl=");
        stringBuilder.append(this.largeThumbnailUrl);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", thumbnailIv=");
        stringBuilder.append(this.thumbnailIv);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

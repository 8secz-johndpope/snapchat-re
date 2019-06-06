package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.SelectFriendStorySnapForThumbnailRecord;

final class AutoValue_StorySnapRecord_SelectFriendStorySnapForThumbnailRecord extends SelectFriendStorySnapForThumbnailRecord {
    private final String largeThumbnailUrl;
    private final String mediaId;
    private final String mediaKey;
    private final boolean needAuth;
    private final String snapId;
    private final String thumbnailIv;
    private final String thumbnailUrl;

    AutoValue_StorySnapRecord_SelectFriendStorySnapForThumbnailRecord(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.thumbnailUrl = str;
        this.largeThumbnailUrl = str2;
        this.thumbnailIv = str3;
        this.needAuth = z;
        if (str4 != null) {
            this.snapId = str4;
            this.mediaId = str5;
            this.mediaKey = str6;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectFriendStorySnapForThumbnailRecord) {
            SelectFriendStorySnapForThumbnailRecord selectFriendStorySnapForThumbnailRecord = (SelectFriendStorySnapForThumbnailRecord) obj;
            String str = this.thumbnailUrl;
            if (str != null ? !str.equals(selectFriendStorySnapForThumbnailRecord.thumbnailUrl()) : selectFriendStorySnapForThumbnailRecord.thumbnailUrl() != null) {
                str = this.largeThumbnailUrl;
                if (str != null ? !str.equals(selectFriendStorySnapForThumbnailRecord.largeThumbnailUrl()) : selectFriendStorySnapForThumbnailRecord.largeThumbnailUrl() != null) {
                    str = this.thumbnailIv;
                    if (str != null ? !str.equals(selectFriendStorySnapForThumbnailRecord.thumbnailIv()) : selectFriendStorySnapForThumbnailRecord.thumbnailIv() != null) {
                        if (this.needAuth == selectFriendStorySnapForThumbnailRecord.needAuth() && this.snapId.equals(selectFriendStorySnapForThumbnailRecord.snapId())) {
                            str = this.mediaId;
                            if (str != null ? !str.equals(selectFriendStorySnapForThumbnailRecord.mediaId()) : selectFriendStorySnapForThumbnailRecord.mediaId() != null) {
                                str = this.mediaKey;
                                return str != null ? !str.equals(selectFriendStorySnapForThumbnailRecord.mediaKey()) : selectFriendStorySnapForThumbnailRecord.mediaKey() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.thumbnailUrl;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.largeThumbnailUrl;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.thumbnailIv;
        hashCode = (((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.needAuth ? 1231 : 1237)) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        str2 = this.mediaId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mediaKey;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode ^ i;
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

    public final String thumbnailIv() {
        return this.thumbnailIv;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectFriendStorySnapForThumbnailRecord{thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", largeThumbnailUrl=");
        stringBuilder.append(this.largeThumbnailUrl);
        stringBuilder.append(", thumbnailIv=");
        stringBuilder.append(this.thumbnailIv);
        stringBuilder.append(", needAuth=");
        stringBuilder.append(this.needAuth);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

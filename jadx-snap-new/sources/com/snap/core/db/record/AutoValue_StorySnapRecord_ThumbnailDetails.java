package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.ThumbnailDetails;

final class AutoValue_StorySnapRecord_ThumbnailDetails extends ThumbnailDetails {
    private final String largeThumbnailUrl;
    private final String mediaId;
    private final String mediaKey;
    private final boolean needAuth;
    private final String snapId;
    private final String thumbnailIv;
    private final String thumbnailUrl;
    private final Boolean viewed;

    AutoValue_StorySnapRecord_ThumbnailDetails(String str, String str2, String str3, String str4, String str5, boolean z, String str6, Boolean bool) {
        if (str != null) {
            this.snapId = str;
            this.mediaKey = str2;
            this.largeThumbnailUrl = str3;
            this.thumbnailUrl = str4;
            this.thumbnailIv = str5;
            this.needAuth = z;
            this.mediaId = str6;
            this.viewed = bool;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ThumbnailDetails) {
            ThumbnailDetails thumbnailDetails = (ThumbnailDetails) obj;
            if (this.snapId.equals(thumbnailDetails.snapId())) {
                String str = this.mediaKey;
                if (str != null ? !str.equals(thumbnailDetails.mediaKey()) : thumbnailDetails.mediaKey() != null) {
                    str = this.largeThumbnailUrl;
                    if (str != null ? !str.equals(thumbnailDetails.largeThumbnailUrl()) : thumbnailDetails.largeThumbnailUrl() != null) {
                        str = this.thumbnailUrl;
                        if (str != null ? !str.equals(thumbnailDetails.thumbnailUrl()) : thumbnailDetails.thumbnailUrl() != null) {
                            str = this.thumbnailIv;
                            if (str != null ? !str.equals(thumbnailDetails.thumbnailIv()) : thumbnailDetails.thumbnailIv() != null) {
                                if (this.needAuth == thumbnailDetails.needAuth()) {
                                    str = this.mediaId;
                                    if (str != null ? !str.equals(thumbnailDetails.mediaId()) : thumbnailDetails.mediaId() != null) {
                                        Boolean bool = this.viewed;
                                        return bool != null ? !bool.equals(thumbnailDetails.viewed()) : thumbnailDetails.viewed() != null;
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
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        String str = this.mediaKey;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.largeThumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.thumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.thumbnailIv;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.needAuth ? 1231 : 1237)) * 1000003;
        str = this.mediaId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.viewed;
        if (bool != null) {
            i = bool.hashCode();
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
        StringBuilder stringBuilder = new StringBuilder("ThumbnailDetails{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", largeThumbnailUrl=");
        stringBuilder.append(this.largeThumbnailUrl);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", thumbnailIv=");
        stringBuilder.append(this.thumbnailIv);
        stringBuilder.append(", needAuth=");
        stringBuilder.append(this.needAuth);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Boolean viewed() {
        return this.viewed;
    }
}

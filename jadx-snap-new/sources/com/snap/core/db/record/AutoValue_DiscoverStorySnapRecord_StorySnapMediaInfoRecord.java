package com.snap.core.db.record;

import com.snap.core.db.record.DiscoverStorySnapRecord.StorySnapMediaInfoRecord;
import defpackage.gcp;

final class AutoValue_DiscoverStorySnapRecord_StorySnapMediaInfoRecord extends StorySnapMediaInfoRecord {
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final gcp mediaType;
    private final String mediaUrl;
    private final String rawSnapId;
    private final String streamingMediaIv;
    private final String streamingMediaKey;
    private final String streamingMetadataUrl;

    AutoValue_DiscoverStorySnapRecord_StorySnapMediaInfoRecord(String str, gcp gcp, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str != null) {
            this.rawSnapId = str;
            if (gcp != null) {
                this.mediaType = gcp;
                this.mediaId = str2;
                this.mediaUrl = str3;
                this.mediaKey = str4;
                this.mediaIv = str5;
                this.streamingMetadataUrl = str6;
                this.streamingMediaKey = str7;
                this.streamingMediaIv = str8;
                return;
            }
            throw new NullPointerException("Null mediaType");
        }
        throw new NullPointerException("Null rawSnapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorySnapMediaInfoRecord) {
            StorySnapMediaInfoRecord storySnapMediaInfoRecord = (StorySnapMediaInfoRecord) obj;
            if (this.rawSnapId.equals(storySnapMediaInfoRecord.rawSnapId()) && this.mediaType.equals(storySnapMediaInfoRecord.mediaType())) {
                String str = this.mediaId;
                if (str != null ? !str.equals(storySnapMediaInfoRecord.mediaId()) : storySnapMediaInfoRecord.mediaId() != null) {
                    str = this.mediaUrl;
                    if (str != null ? !str.equals(storySnapMediaInfoRecord.mediaUrl()) : storySnapMediaInfoRecord.mediaUrl() != null) {
                        str = this.mediaKey;
                        if (str != null ? !str.equals(storySnapMediaInfoRecord.mediaKey()) : storySnapMediaInfoRecord.mediaKey() != null) {
                            str = this.mediaIv;
                            if (str != null ? !str.equals(storySnapMediaInfoRecord.mediaIv()) : storySnapMediaInfoRecord.mediaIv() != null) {
                                str = this.streamingMetadataUrl;
                                if (str != null ? !str.equals(storySnapMediaInfoRecord.streamingMetadataUrl()) : storySnapMediaInfoRecord.streamingMetadataUrl() != null) {
                                    str = this.streamingMediaKey;
                                    if (str != null ? !str.equals(storySnapMediaInfoRecord.streamingMediaKey()) : storySnapMediaInfoRecord.streamingMediaKey() != null) {
                                        str = this.streamingMediaIv;
                                        return str != null ? !str.equals(storySnapMediaInfoRecord.streamingMediaIv()) : storySnapMediaInfoRecord.streamingMediaIv() != null;
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
        int hashCode = (((this.rawSnapId.hashCode() ^ 1000003) * 1000003) ^ this.mediaType.hashCode()) * 1000003;
        String str = this.mediaId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.streamingMetadataUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.streamingMediaKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.streamingMediaIv;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final String mediaIv() {
        return this.mediaIv;
    }

    public final String mediaKey() {
        return this.mediaKey;
    }

    public final gcp mediaType() {
        return this.mediaType;
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final String rawSnapId() {
        return this.rawSnapId;
    }

    public final String streamingMediaIv() {
        return this.streamingMediaIv;
    }

    public final String streamingMediaKey() {
        return this.streamingMediaKey;
    }

    public final String streamingMetadataUrl() {
        return this.streamingMetadataUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySnapMediaInfoRecord{rawSnapId=");
        stringBuilder.append(this.rawSnapId);
        stringBuilder.append(", mediaType=");
        stringBuilder.append(this.mediaType);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", streamingMetadataUrl=");
        stringBuilder.append(this.streamingMetadataUrl);
        stringBuilder.append(", streamingMediaKey=");
        stringBuilder.append(this.streamingMediaKey);
        stringBuilder.append(", streamingMediaIv=");
        stringBuilder.append(this.streamingMediaIv);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

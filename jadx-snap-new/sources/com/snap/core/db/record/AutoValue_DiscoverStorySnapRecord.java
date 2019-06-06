package com.snap.core.db.record;

import com.snap.core.db.column.DynamicSnapSource;
import com.snap.core.db.column.FeatureType;
import defpackage.gcp;

final class AutoValue_DiscoverStorySnapRecord extends DiscoverStorySnapRecord {
    private final long _id;
    private final String attachmentUrl;
    private final long creationTimestampMs;
    private final String displayName;
    private final long duration;
    private final DynamicSnapSource dynamicSnapSource;
    private final String encryptedGeoLoggingData;
    private final long expirationTimestampMs;
    private final FeatureType featureType;
    private final String filterId;
    private final boolean hasSnappablesMetadata;
    private final boolean isInfiniteDuration;
    private final boolean isZipped;
    private final String lensId;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final gcp mediaType;
    private final String mediaUrl;
    private final String rawSnapId;
    private final boolean shareable;
    private final String snapSource;
    private final String storyFilterId;
    private final String storyId;
    private final long storyRowId;
    private final String streamingMediaIv;
    private final String streamingMediaKey;
    private final String streamingMetadataUrl;
    private final String subTitles;
    private final String thumbnailUrl;
    private final long timestamp;
    private final String title;
    private final String unlockablesSnapInfo;
    private final String venueId;

    AutoValue_DiscoverStorySnapRecord(long j, String str, long j2, String str2, long j3, long j4, String str3, String str4, String str5, String str6, String str7, boolean z, gcp gcp, String str8, String str9, String str10, String str11, long j5, boolean z2, boolean z3, String str12, String str13, String str14, FeatureType featureType, String str15, long j6, String str16, boolean z4, DynamicSnapSource dynamicSnapSource, String str17, String str18, String str19, String str20, String str21) {
        String str22 = str;
        String str23 = str2;
        gcp gcp2 = gcp;
        FeatureType featureType2 = featureType;
        DynamicSnapSource dynamicSnapSource2 = dynamicSnapSource;
        this._id = j;
        if (str22 != null) {
            this.storyId = str22;
            this.storyRowId = j2;
            if (str23 != null) {
                this.rawSnapId = str23;
                this.creationTimestampMs = j3;
                this.expirationTimestampMs = j4;
                this.title = str3;
                this.subTitles = str4;
                this.attachmentUrl = str5;
                this.lensId = str6;
                this.snapSource = str7;
                this.hasSnappablesMetadata = z;
                if (gcp2 != null) {
                    this.mediaType = gcp2;
                    this.mediaId = str8;
                    this.mediaUrl = str9;
                    this.mediaKey = str10;
                    this.mediaIv = str11;
                    this.duration = j5;
                    this.isZipped = z2;
                    this.isInfiniteDuration = z3;
                    this.streamingMediaKey = str12;
                    this.streamingMediaIv = str13;
                    this.streamingMetadataUrl = str14;
                    if (featureType2 != null) {
                        this.featureType = featureType2;
                        this.displayName = str15;
                        this.timestamp = j6;
                        this.thumbnailUrl = str16;
                        this.shareable = z4;
                        if (dynamicSnapSource2 != null) {
                            this.dynamicSnapSource = dynamicSnapSource2;
                            this.filterId = str17;
                            this.storyFilterId = str18;
                            this.venueId = str19;
                            this.unlockablesSnapInfo = str20;
                            this.encryptedGeoLoggingData = str21;
                            return;
                        }
                        throw new NullPointerException("Null dynamicSnapSource");
                    }
                    throw new NullPointerException("Null featureType");
                }
                throw new NullPointerException("Null mediaType");
            }
            throw new NullPointerException("Null rawSnapId");
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final String attachmentUrl() {
        return this.attachmentUrl;
    }

    public final long creationTimestampMs() {
        return this.creationTimestampMs;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final long duration() {
        return this.duration;
    }

    public final DynamicSnapSource dynamicSnapSource() {
        return this.dynamicSnapSource;
    }

    public final String encryptedGeoLoggingData() {
        return this.encryptedGeoLoggingData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DiscoverStorySnapRecord) {
            DiscoverStorySnapRecord discoverStorySnapRecord = (DiscoverStorySnapRecord) obj;
            if (this._id == discoverStorySnapRecord._id() && this.storyId.equals(discoverStorySnapRecord.storyId()) && this.storyRowId == discoverStorySnapRecord.storyRowId() && this.rawSnapId.equals(discoverStorySnapRecord.rawSnapId()) && this.creationTimestampMs == discoverStorySnapRecord.creationTimestampMs() && this.expirationTimestampMs == discoverStorySnapRecord.expirationTimestampMs()) {
                String str = this.title;
                if (str != null ? !str.equals(discoverStorySnapRecord.title()) : discoverStorySnapRecord.title() != null) {
                    str = this.subTitles;
                    if (str != null ? !str.equals(discoverStorySnapRecord.subTitles()) : discoverStorySnapRecord.subTitles() != null) {
                        str = this.attachmentUrl;
                        if (str != null ? !str.equals(discoverStorySnapRecord.attachmentUrl()) : discoverStorySnapRecord.attachmentUrl() != null) {
                            str = this.lensId;
                            if (str != null ? !str.equals(discoverStorySnapRecord.lensId()) : discoverStorySnapRecord.lensId() != null) {
                                str = this.snapSource;
                                if (str != null ? !str.equals(discoverStorySnapRecord.snapSource()) : discoverStorySnapRecord.snapSource() != null) {
                                    if (this.hasSnappablesMetadata == discoverStorySnapRecord.hasSnappablesMetadata() && this.mediaType.equals(discoverStorySnapRecord.mediaType())) {
                                        str = this.mediaId;
                                        if (str != null ? !str.equals(discoverStorySnapRecord.mediaId()) : discoverStorySnapRecord.mediaId() != null) {
                                            str = this.mediaUrl;
                                            if (str != null ? !str.equals(discoverStorySnapRecord.mediaUrl()) : discoverStorySnapRecord.mediaUrl() != null) {
                                                str = this.mediaKey;
                                                if (str != null ? !str.equals(discoverStorySnapRecord.mediaKey()) : discoverStorySnapRecord.mediaKey() != null) {
                                                    str = this.mediaIv;
                                                    if (str != null ? !str.equals(discoverStorySnapRecord.mediaIv()) : discoverStorySnapRecord.mediaIv() != null) {
                                                        if (this.duration == discoverStorySnapRecord.duration() && this.isZipped == discoverStorySnapRecord.isZipped() && this.isInfiniteDuration == discoverStorySnapRecord.isInfiniteDuration()) {
                                                            str = this.streamingMediaKey;
                                                            if (str != null ? !str.equals(discoverStorySnapRecord.streamingMediaKey()) : discoverStorySnapRecord.streamingMediaKey() != null) {
                                                                str = this.streamingMediaIv;
                                                                if (str != null ? !str.equals(discoverStorySnapRecord.streamingMediaIv()) : discoverStorySnapRecord.streamingMediaIv() != null) {
                                                                    str = this.streamingMetadataUrl;
                                                                    if (str != null ? !str.equals(discoverStorySnapRecord.streamingMetadataUrl()) : discoverStorySnapRecord.streamingMetadataUrl() != null) {
                                                                        if (this.featureType.equals(discoverStorySnapRecord.featureType())) {
                                                                            str = this.displayName;
                                                                            if (str != null ? !str.equals(discoverStorySnapRecord.displayName()) : discoverStorySnapRecord.displayName() != null) {
                                                                                if (this.timestamp == discoverStorySnapRecord.timestamp()) {
                                                                                    str = this.thumbnailUrl;
                                                                                    if (str != null ? !str.equals(discoverStorySnapRecord.thumbnailUrl()) : discoverStorySnapRecord.thumbnailUrl() != null) {
                                                                                        if (this.shareable == discoverStorySnapRecord.shareable() && this.dynamicSnapSource.equals(discoverStorySnapRecord.dynamicSnapSource())) {
                                                                                            str = this.filterId;
                                                                                            if (str != null ? !str.equals(discoverStorySnapRecord.filterId()) : discoverStorySnapRecord.filterId() != null) {
                                                                                                str = this.storyFilterId;
                                                                                                if (str != null ? !str.equals(discoverStorySnapRecord.storyFilterId()) : discoverStorySnapRecord.storyFilterId() != null) {
                                                                                                    str = this.venueId;
                                                                                                    if (str != null ? !str.equals(discoverStorySnapRecord.venueId()) : discoverStorySnapRecord.venueId() != null) {
                                                                                                        str = this.unlockablesSnapInfo;
                                                                                                        if (str != null ? !str.equals(discoverStorySnapRecord.unlockablesSnapInfo()) : discoverStorySnapRecord.unlockablesSnapInfo() != null) {
                                                                                                            str = this.encryptedGeoLoggingData;
                                                                                                            return str != null ? !str.equals(discoverStorySnapRecord.encryptedGeoLoggingData()) : discoverStorySnapRecord.encryptedGeoLoggingData() != null;
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

    public final long expirationTimestampMs() {
        return this.expirationTimestampMs;
    }

    public final FeatureType featureType() {
        return this.featureType;
    }

    public final String filterId() {
        return this.filterId;
    }

    public final boolean hasSnappablesMetadata() {
        return this.hasSnappablesMetadata;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        long j2 = this.storyRowId;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.rawSnapId.hashCode()) * 1000003;
        j2 = this.creationTimestampMs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.expirationTimestampMs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.title;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.subTitles;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.attachmentUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.lensId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.snapSource;
        int i2 = 1231;
        hashCode = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.hasSnappablesMetadata ? 1231 : 1237)) * 1000003) ^ this.mediaType.hashCode()) * 1000003;
        str = this.mediaId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.duration;
        hashCode = (((((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.isZipped ? 1231 : 1237)) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        str = this.streamingMediaKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.streamingMediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.streamingMetadataUrl;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.featureType.hashCode()) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        j3 = this.timestamp;
        hashCode = (hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str2 = this.thumbnailUrl;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        if (!this.shareable) {
            i2 = 1237;
        }
        hashCode = (((hashCode ^ i2) * 1000003) ^ this.dynamicSnapSource.hashCode()) * 1000003;
        str2 = this.filterId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.storyFilterId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.venueId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.unlockablesSnapInfo;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.encryptedGeoLoggingData;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isInfiniteDuration() {
        return this.isInfiniteDuration;
    }

    public final boolean isZipped() {
        return this.isZipped;
    }

    public final String lensId() {
        return this.lensId;
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

    public final boolean shareable() {
        return this.shareable;
    }

    public final String snapSource() {
        return this.snapSource;
    }

    public final String storyFilterId() {
        return this.storyFilterId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
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

    public final String subTitles() {
        return this.subTitles;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String title() {
        return this.title;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DiscoverStorySnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", rawSnapId=");
        stringBuilder.append(this.rawSnapId);
        stringBuilder.append(", creationTimestampMs=");
        stringBuilder.append(this.creationTimestampMs);
        stringBuilder.append(", expirationTimestampMs=");
        stringBuilder.append(this.expirationTimestampMs);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", subTitles=");
        stringBuilder.append(this.subTitles);
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
        stringBuilder.append(", lensId=");
        stringBuilder.append(this.lensId);
        stringBuilder.append(", snapSource=");
        stringBuilder.append(this.snapSource);
        stringBuilder.append(", hasSnappablesMetadata=");
        stringBuilder.append(this.hasSnappablesMetadata);
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
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(", isZipped=");
        stringBuilder.append(this.isZipped);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", streamingMediaKey=");
        stringBuilder.append(this.streamingMediaKey);
        stringBuilder.append(", streamingMediaIv=");
        stringBuilder.append(this.streamingMediaIv);
        stringBuilder.append(", streamingMetadataUrl=");
        stringBuilder.append(this.streamingMetadataUrl);
        stringBuilder.append(", featureType=");
        stringBuilder.append(this.featureType);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", shareable=");
        stringBuilder.append(this.shareable);
        stringBuilder.append(", dynamicSnapSource=");
        stringBuilder.append(this.dynamicSnapSource);
        stringBuilder.append(", filterId=");
        stringBuilder.append(this.filterId);
        stringBuilder.append(", storyFilterId=");
        stringBuilder.append(this.storyFilterId);
        stringBuilder.append(", venueId=");
        stringBuilder.append(this.venueId);
        stringBuilder.append(", unlockablesSnapInfo=");
        stringBuilder.append(this.unlockablesSnapInfo);
        stringBuilder.append(", encryptedGeoLoggingData=");
        stringBuilder.append(this.encryptedGeoLoggingData);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String unlockablesSnapInfo() {
        return this.unlockablesSnapInfo;
    }

    public final String venueId() {
        return this.venueId;
    }
}

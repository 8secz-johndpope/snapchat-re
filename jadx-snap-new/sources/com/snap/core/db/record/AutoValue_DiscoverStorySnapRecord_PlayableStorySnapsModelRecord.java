package com.snap.core.db.record;

import com.snap.core.db.column.DynamicSnapSource;
import com.snap.core.db.record.DiscoverStorySnapRecord.PlayableStorySnapsModelRecord;
import defpackage.gcp;

final class AutoValue_DiscoverStorySnapRecord_PlayableStorySnapsModelRecord extends PlayableStorySnapsModelRecord {
    private final long _id;
    private final String attachmentUrl;
    private final long creationTimestampMs;
    private final String displayName;
    private final long duration;
    private final DynamicSnapSource dynamicSnapSource;
    private final String encryptedGeoLoggingData;
    private final long expirationTimestampMs;
    private final String filterId;
    private final boolean isInfiniteDuration;
    private final boolean isZipped;
    private final Long lastView;
    private final String lensId;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final gcp mediaType;
    private final String mediaUrl;
    private final String rawSnapId;
    private final boolean shareable;
    private final String storyFilterId;
    private final String storyId;
    private final long storyRowId;
    private final String streamingMediaIv;
    private final String streamingMediaKey;
    private final String streamingMetadataUrl;
    private final String subTitles;
    private final String thumbnailUrl;
    private final String title;
    private final String unlockablesSnapInfo;
    private final String venueId;

    AutoValue_DiscoverStorySnapRecord_PlayableStorySnapsModelRecord(long j, String str, long j2, String str2, long j3, String str3, String str4, String str5, String str6, gcp gcp, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j4, boolean z, boolean z2, Long l, String str14, String str15, long j5, boolean z3, DynamicSnapSource dynamicSnapSource, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        String str22 = str2;
        gcp gcp2 = gcp;
        DynamicSnapSource dynamicSnapSource2 = dynamicSnapSource;
        this._id = j;
        if (str21 != null) {
            this.storyId = str21;
            this.storyRowId = j2;
            if (str22 != null) {
                this.rawSnapId = str22;
                this.creationTimestampMs = j3;
                this.title = str3;
                this.subTitles = str4;
                this.attachmentUrl = str5;
                this.lensId = str6;
                if (gcp2 != null) {
                    this.mediaType = gcp2;
                    this.mediaId = str7;
                    this.mediaUrl = str8;
                    this.mediaKey = str9;
                    this.mediaIv = str10;
                    this.streamingMetadataUrl = str11;
                    this.streamingMediaKey = str12;
                    this.streamingMediaIv = str13;
                    this.duration = j4;
                    this.isZipped = z;
                    this.isInfiniteDuration = z2;
                    this.lastView = l;
                    this.displayName = str14;
                    this.thumbnailUrl = str15;
                    this.expirationTimestampMs = j5;
                    this.shareable = z3;
                    if (dynamicSnapSource2 != null) {
                        this.dynamicSnapSource = dynamicSnapSource2;
                        this.filterId = str16;
                        this.storyFilterId = str17;
                        this.venueId = str18;
                        this.unlockablesSnapInfo = str19;
                        this.encryptedGeoLoggingData = str20;
                        return;
                    }
                    throw new NullPointerException("Null dynamicSnapSource");
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
        if (obj instanceof PlayableStorySnapsModelRecord) {
            PlayableStorySnapsModelRecord playableStorySnapsModelRecord = (PlayableStorySnapsModelRecord) obj;
            if (this._id == playableStorySnapsModelRecord._id() && this.storyId.equals(playableStorySnapsModelRecord.storyId()) && this.storyRowId == playableStorySnapsModelRecord.storyRowId() && this.rawSnapId.equals(playableStorySnapsModelRecord.rawSnapId()) && this.creationTimestampMs == playableStorySnapsModelRecord.creationTimestampMs()) {
                String str = this.title;
                if (str != null ? !str.equals(playableStorySnapsModelRecord.title()) : playableStorySnapsModelRecord.title() != null) {
                    str = this.subTitles;
                    if (str != null ? !str.equals(playableStorySnapsModelRecord.subTitles()) : playableStorySnapsModelRecord.subTitles() != null) {
                        str = this.attachmentUrl;
                        if (str != null ? !str.equals(playableStorySnapsModelRecord.attachmentUrl()) : playableStorySnapsModelRecord.attachmentUrl() != null) {
                            str = this.lensId;
                            if (str != null ? !str.equals(playableStorySnapsModelRecord.lensId()) : playableStorySnapsModelRecord.lensId() != null) {
                                if (this.mediaType.equals(playableStorySnapsModelRecord.mediaType())) {
                                    str = this.mediaId;
                                    if (str != null ? !str.equals(playableStorySnapsModelRecord.mediaId()) : playableStorySnapsModelRecord.mediaId() != null) {
                                        str = this.mediaUrl;
                                        if (str != null ? !str.equals(playableStorySnapsModelRecord.mediaUrl()) : playableStorySnapsModelRecord.mediaUrl() != null) {
                                            str = this.mediaKey;
                                            if (str != null ? !str.equals(playableStorySnapsModelRecord.mediaKey()) : playableStorySnapsModelRecord.mediaKey() != null) {
                                                str = this.mediaIv;
                                                if (str != null ? !str.equals(playableStorySnapsModelRecord.mediaIv()) : playableStorySnapsModelRecord.mediaIv() != null) {
                                                    str = this.streamingMetadataUrl;
                                                    if (str != null ? !str.equals(playableStorySnapsModelRecord.streamingMetadataUrl()) : playableStorySnapsModelRecord.streamingMetadataUrl() != null) {
                                                        str = this.streamingMediaKey;
                                                        if (str != null ? !str.equals(playableStorySnapsModelRecord.streamingMediaKey()) : playableStorySnapsModelRecord.streamingMediaKey() != null) {
                                                            str = this.streamingMediaIv;
                                                            if (str != null ? !str.equals(playableStorySnapsModelRecord.streamingMediaIv()) : playableStorySnapsModelRecord.streamingMediaIv() != null) {
                                                                if (this.duration == playableStorySnapsModelRecord.duration() && this.isZipped == playableStorySnapsModelRecord.isZipped() && this.isInfiniteDuration == playableStorySnapsModelRecord.isInfiniteDuration()) {
                                                                    Long l = this.lastView;
                                                                    if (l != null ? !l.equals(playableStorySnapsModelRecord.lastView()) : playableStorySnapsModelRecord.lastView() != null) {
                                                                        str = this.displayName;
                                                                        if (str != null ? !str.equals(playableStorySnapsModelRecord.displayName()) : playableStorySnapsModelRecord.displayName() != null) {
                                                                            str = this.thumbnailUrl;
                                                                            if (str != null ? !str.equals(playableStorySnapsModelRecord.thumbnailUrl()) : playableStorySnapsModelRecord.thumbnailUrl() != null) {
                                                                                if (this.expirationTimestampMs == playableStorySnapsModelRecord.expirationTimestampMs() && this.shareable == playableStorySnapsModelRecord.shareable() && this.dynamicSnapSource.equals(playableStorySnapsModelRecord.dynamicSnapSource())) {
                                                                                    str = this.filterId;
                                                                                    if (str != null ? !str.equals(playableStorySnapsModelRecord.filterId()) : playableStorySnapsModelRecord.filterId() != null) {
                                                                                        str = this.storyFilterId;
                                                                                        if (str != null ? !str.equals(playableStorySnapsModelRecord.storyFilterId()) : playableStorySnapsModelRecord.storyFilterId() != null) {
                                                                                            str = this.venueId;
                                                                                            if (str != null ? !str.equals(playableStorySnapsModelRecord.venueId()) : playableStorySnapsModelRecord.venueId() != null) {
                                                                                                str = this.unlockablesSnapInfo;
                                                                                                if (str != null ? !str.equals(playableStorySnapsModelRecord.unlockablesSnapInfo()) : playableStorySnapsModelRecord.unlockablesSnapInfo() != null) {
                                                                                                    str = this.encryptedGeoLoggingData;
                                                                                                    return str != null ? !str.equals(playableStorySnapsModelRecord.encryptedGeoLoggingData()) : playableStorySnapsModelRecord.encryptedGeoLoggingData() != null;
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

    public final String filterId() {
        return this.filterId;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        long j2 = this.storyRowId;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.rawSnapId.hashCode()) * 1000003;
        j2 = this.creationTimestampMs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.title;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.subTitles;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.attachmentUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.lensId;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mediaType.hashCode()) * 1000003;
        str = this.mediaId;
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
        str = this.streamingMediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.duration;
        hashCode = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i2 = 1231;
        hashCode = (((hashCode ^ (this.isZipped ? 1231 : 1237)) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        Long l = this.lastView;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.thumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j4 = this.expirationTimestampMs;
        hashCode = (hashCode ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        if (!this.shareable) {
            i2 = 1237;
        }
        hashCode = (((hashCode ^ i2) * 1000003) ^ this.dynamicSnapSource.hashCode()) * 1000003;
        String str2 = this.filterId;
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

    public final Long lastView() {
        return this.lastView;
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

    public final String title() {
        return this.title;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayableStorySnapsModelRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", rawSnapId=");
        stringBuilder.append(this.rawSnapId);
        stringBuilder.append(", creationTimestampMs=");
        stringBuilder.append(this.creationTimestampMs);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", subTitles=");
        stringBuilder.append(this.subTitles);
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
        stringBuilder.append(", lensId=");
        stringBuilder.append(this.lensId);
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
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(", isZipped=");
        stringBuilder.append(this.isZipped);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", lastView=");
        stringBuilder.append(this.lastView);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", expirationTimestampMs=");
        stringBuilder.append(this.expirationTimestampMs);
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

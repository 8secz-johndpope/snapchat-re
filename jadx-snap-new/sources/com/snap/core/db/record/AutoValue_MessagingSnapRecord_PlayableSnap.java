package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.record.MessagingSnapRecord.PlayableSnap;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_PlayableSnap extends PlayableSnap {
    private final String attachmentUrl;
    private final String cognacAttachmentUri;
    private final long durationInMs;
    private final GeofilterMetadata geofilterMetadata;
    private final String groupType;
    private final boolean isInfiniteDuration;
    private final FeedKind kind;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final String snapId;
    private final gcp snapType;
    private final Long storyRowId;
    private final long timestamp;
    private final Boolean zipped;

    AutoValue_MessagingSnapRecord_PlayableSnap(String str, long j, String str2, String str3, String str4, gcp gcp, String str5, long j2, Boolean bool, boolean z, Long l, String str6, String str7, String str8, GeofilterMetadata geofilterMetadata, FeedKind feedKind) {
        String str9 = str;
        gcp gcp2 = gcp;
        if (str9 != null) {
            this.snapId = str9;
            this.timestamp = j;
            this.mediaId = str2;
            this.mediaIv = str3;
            this.mediaKey = str4;
            if (gcp2 != null) {
                this.snapType = gcp2;
                this.mediaUrl = str5;
                this.durationInMs = j2;
                this.zipped = bool;
                this.isInfiniteDuration = z;
                this.storyRowId = l;
                this.groupType = str6;
                this.attachmentUrl = str7;
                this.cognacAttachmentUri = str8;
                this.geofilterMetadata = geofilterMetadata;
                this.kind = feedKind;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final String attachmentUrl() {
        return this.attachmentUrl;
    }

    public final String cognacAttachmentUri() {
        return this.cognacAttachmentUri;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayableSnap) {
            PlayableSnap playableSnap = (PlayableSnap) obj;
            if (this.snapId.equals(playableSnap.snapId()) && this.timestamp == playableSnap.timestamp()) {
                String str = this.mediaId;
                if (str != null ? !str.equals(playableSnap.mediaId()) : playableSnap.mediaId() != null) {
                    str = this.mediaIv;
                    if (str != null ? !str.equals(playableSnap.mediaIv()) : playableSnap.mediaIv() != null) {
                        str = this.mediaKey;
                        if (str != null ? !str.equals(playableSnap.mediaKey()) : playableSnap.mediaKey() != null) {
                            if (this.snapType.equals(playableSnap.snapType())) {
                                str = this.mediaUrl;
                                if (str != null ? !str.equals(playableSnap.mediaUrl()) : playableSnap.mediaUrl() != null) {
                                    if (this.durationInMs == playableSnap.durationInMs()) {
                                        Boolean bool = this.zipped;
                                        if (bool != null ? !bool.equals(playableSnap.zipped()) : playableSnap.zipped() != null) {
                                            if (this.isInfiniteDuration == playableSnap.isInfiniteDuration()) {
                                                Long l = this.storyRowId;
                                                if (l != null ? !l.equals(playableSnap.storyRowId()) : playableSnap.storyRowId() != null) {
                                                    str = this.groupType;
                                                    if (str != null ? !str.equals(playableSnap.groupType()) : playableSnap.groupType() != null) {
                                                        str = this.attachmentUrl;
                                                        if (str != null ? !str.equals(playableSnap.attachmentUrl()) : playableSnap.attachmentUrl() != null) {
                                                            str = this.cognacAttachmentUri;
                                                            if (str != null ? !str.equals(playableSnap.cognacAttachmentUri()) : playableSnap.cognacAttachmentUri() != null) {
                                                                GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
                                                                if (geofilterMetadata != null ? !geofilterMetadata.equals(playableSnap.geofilterMetadata()) : playableSnap.geofilterMetadata() != null) {
                                                                    FeedKind feedKind = this.kind;
                                                                    return feedKind != null ? !feedKind.equals(playableSnap.kind()) : playableSnap.kind() != null;
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

    public final GeofilterMetadata geofilterMetadata() {
        return this.geofilterMetadata;
    }

    public final String groupType() {
        return this.groupType;
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str = this.mediaId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        str = this.mediaUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.durationInMs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Boolean bool = this.zipped;
        hashCode = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        Long l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.groupType;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.attachmentUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.cognacAttachmentUri;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
        hashCode = (hashCode ^ (geofilterMetadata == null ? 0 : geofilterMetadata.hashCode())) * 1000003;
        FeedKind feedKind = this.kind;
        if (feedKind != null) {
            i = feedKind.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isInfiniteDuration() {
        return this.isInfiniteDuration;
    }

    public final FeedKind kind() {
        return this.kind;
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

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayableSnap{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
        stringBuilder.append(", zipped=");
        stringBuilder.append(this.zipped);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", groupType=");
        stringBuilder.append(this.groupType);
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
        stringBuilder.append(", cognacAttachmentUri=");
        stringBuilder.append(this.cognacAttachmentUri);
        stringBuilder.append(", geofilterMetadata=");
        stringBuilder.append(this.geofilterMetadata);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Boolean zipped() {
        return this.zipped;
    }
}

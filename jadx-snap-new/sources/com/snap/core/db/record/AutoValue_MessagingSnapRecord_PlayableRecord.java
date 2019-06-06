package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.record.MessagingSnapRecord.PlayableRecord;
import defpackage.aesg;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_PlayableRecord extends PlayableRecord {
    private final String Message_mediaId;
    private final String attachmentUrl;
    private final String cognacAttachmentUri;
    private final aesg directDownloadUrl;
    private final long durationInMs;
    private final GeofilterMetadata geofilterMetadata;
    private final boolean isInfiniteDuration;
    private final FeedKind kind;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final long messageRowId;
    private final String senderUsername;
    private final String snapId;
    private final long snapRowId;
    private final gcp snapType;
    private final long timestamp;
    private final Boolean zipped;

    AutoValue_MessagingSnapRecord_PlayableRecord(long j, long j2, FeedKind feedKind, String str, gcp gcp, String str2, String str3, String str4, long j3, boolean z, long j4, String str5, Boolean bool, String str6, String str7, String str8, String str9, aesg aesg, GeofilterMetadata geofilterMetadata) {
        String str10 = str;
        gcp gcp2 = gcp;
        String str11 = str9;
        this.messageRowId = j;
        this.snapRowId = j2;
        this.kind = feedKind;
        if (str10 != null) {
            this.snapId = str10;
            if (gcp2 != null) {
                this.snapType = gcp2;
                this.mediaUrl = str2;
                this.mediaKey = str3;
                this.mediaIv = str4;
                this.durationInMs = j3;
                this.isInfiniteDuration = z;
                this.timestamp = j4;
                this.mediaId = str5;
                this.zipped = bool;
                this.attachmentUrl = str6;
                this.cognacAttachmentUri = str7;
                this.Message_mediaId = str8;
                if (str11 != null) {
                    this.senderUsername = str11;
                    this.directDownloadUrl = aesg;
                    this.geofilterMetadata = geofilterMetadata;
                    return;
                }
                throw new NullPointerException("Null senderUsername");
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final String Message_mediaId() {
        return this.Message_mediaId;
    }

    public final String attachmentUrl() {
        return this.attachmentUrl;
    }

    public final String cognacAttachmentUri() {
        return this.cognacAttachmentUri;
    }

    public final aesg directDownloadUrl() {
        return this.directDownloadUrl;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayableRecord) {
            PlayableRecord playableRecord = (PlayableRecord) obj;
            if (this.messageRowId == playableRecord.messageRowId() && this.snapRowId == playableRecord.snapRowId()) {
                FeedKind feedKind = this.kind;
                if (feedKind != null ? !feedKind.equals(playableRecord.kind()) : playableRecord.kind() != null) {
                    if (this.snapId.equals(playableRecord.snapId()) && this.snapType.equals(playableRecord.snapType())) {
                        String str = this.mediaUrl;
                        if (str != null ? !str.equals(playableRecord.mediaUrl()) : playableRecord.mediaUrl() != null) {
                            str = this.mediaKey;
                            if (str != null ? !str.equals(playableRecord.mediaKey()) : playableRecord.mediaKey() != null) {
                                str = this.mediaIv;
                                if (str != null ? !str.equals(playableRecord.mediaIv()) : playableRecord.mediaIv() != null) {
                                    if (this.durationInMs == playableRecord.durationInMs() && this.isInfiniteDuration == playableRecord.isInfiniteDuration() && this.timestamp == playableRecord.timestamp()) {
                                        str = this.mediaId;
                                        if (str != null ? !str.equals(playableRecord.mediaId()) : playableRecord.mediaId() != null) {
                                            Boolean bool = this.zipped;
                                            if (bool != null ? !bool.equals(playableRecord.zipped()) : playableRecord.zipped() != null) {
                                                str = this.attachmentUrl;
                                                if (str != null ? !str.equals(playableRecord.attachmentUrl()) : playableRecord.attachmentUrl() != null) {
                                                    str = this.cognacAttachmentUri;
                                                    if (str != null ? !str.equals(playableRecord.cognacAttachmentUri()) : playableRecord.cognacAttachmentUri() != null) {
                                                        str = this.Message_mediaId;
                                                        if (str != null ? !str.equals(playableRecord.Message_mediaId()) : playableRecord.Message_mediaId() != null) {
                                                            if (this.senderUsername.equals(playableRecord.senderUsername())) {
                                                                aesg aesg = this.directDownloadUrl;
                                                                if (aesg != null ? !aesg.equals(playableRecord.directDownloadUrl()) : playableRecord.directDownloadUrl() != null) {
                                                                    GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
                                                                    return geofilterMetadata != null ? !geofilterMetadata.equals(playableRecord.geofilterMetadata()) : playableRecord.geofilterMetadata() != null;
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

    public final int hashCode() {
        long j = this.messageRowId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.snapRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        FeedKind feedKind = this.kind;
        int i2 = 0;
        i = (((((i ^ (feedKind == null ? 0 : feedKind.hashCode())) * 1000003) ^ this.snapId.hashCode()) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        String str = this.mediaUrl;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.durationInMs;
        i = (((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        j3 = this.timestamp;
        i = (i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str2 = this.mediaId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.zipped;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str2 = this.attachmentUrl;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.cognacAttachmentUri;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.Message_mediaId;
        i = (((i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.senderUsername.hashCode()) * 1000003;
        aesg aesg = this.directDownloadUrl;
        i = (i ^ (aesg == null ? 0 : aesg.hashCode())) * 1000003;
        GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
        if (geofilterMetadata != null) {
            i2 = geofilterMetadata.hashCode();
        }
        return i ^ i2;
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

    public final long messageRowId() {
        return this.messageRowId;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayableRecord{messageRowId=");
        stringBuilder.append(this.messageRowId);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", zipped=");
        stringBuilder.append(this.zipped);
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
        stringBuilder.append(", cognacAttachmentUri=");
        stringBuilder.append(this.cognacAttachmentUri);
        stringBuilder.append(", Message_mediaId=");
        stringBuilder.append(this.Message_mediaId);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", directDownloadUrl=");
        stringBuilder.append(this.directDownloadUrl);
        stringBuilder.append(", geofilterMetadata=");
        stringBuilder.append(this.geofilterMetadata);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Boolean zipped() {
        return this.zipped;
    }
}

package com.snap.core.db.record;

import defpackage.gcp;

final class AutoValue_SnapRecord extends SnapRecord {
    private final long _id;
    private final String attachmentUrl;
    private final String cognacAttachmentUri;
    private final long durationInMs;
    private final String groupType;
    private final boolean isInfiniteDuration;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final String snapId;
    private final gcp snapType;
    private final Long storyRowId;
    private final long timestamp;
    private final Boolean zipped;

    AutoValue_SnapRecord(long j, String str, long j2, String str2, String str3, String str4, gcp gcp, String str5, long j3, String str6, String str7, Boolean bool, Long l, boolean z, String str8) {
        String str9 = str;
        gcp gcp2 = gcp;
        this._id = j;
        if (str9 != null) {
            this.snapId = str9;
            this.timestamp = j2;
            this.mediaId = str2;
            this.mediaIv = str3;
            this.mediaKey = str4;
            if (gcp2 != null) {
                this.snapType = gcp2;
                this.mediaUrl = str5;
                this.durationInMs = j3;
                this.attachmentUrl = str6;
                this.cognacAttachmentUri = str7;
                this.zipped = bool;
                this.storyRowId = l;
                this.isInfiniteDuration = z;
                this.groupType = str8;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final long _id() {
        return this._id;
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
        if (obj instanceof SnapRecord) {
            SnapRecord snapRecord = (SnapRecord) obj;
            if (this._id == snapRecord._id() && this.snapId.equals(snapRecord.snapId()) && this.timestamp == snapRecord.timestamp()) {
                String str = this.mediaId;
                if (str != null ? !str.equals(snapRecord.mediaId()) : snapRecord.mediaId() != null) {
                    str = this.mediaIv;
                    if (str != null ? !str.equals(snapRecord.mediaIv()) : snapRecord.mediaIv() != null) {
                        str = this.mediaKey;
                        if (str != null ? !str.equals(snapRecord.mediaKey()) : snapRecord.mediaKey() != null) {
                            if (this.snapType.equals(snapRecord.snapType())) {
                                str = this.mediaUrl;
                                if (str != null ? !str.equals(snapRecord.mediaUrl()) : snapRecord.mediaUrl() != null) {
                                    if (this.durationInMs == snapRecord.durationInMs()) {
                                        str = this.attachmentUrl;
                                        if (str != null ? !str.equals(snapRecord.attachmentUrl()) : snapRecord.attachmentUrl() != null) {
                                            str = this.cognacAttachmentUri;
                                            if (str != null ? !str.equals(snapRecord.cognacAttachmentUri()) : snapRecord.cognacAttachmentUri() != null) {
                                                Boolean bool = this.zipped;
                                                if (bool != null ? !bool.equals(snapRecord.zipped()) : snapRecord.zipped() != null) {
                                                    Long l = this.storyRowId;
                                                    if (l != null ? !l.equals(snapRecord.storyRowId()) : snapRecord.storyRowId() != null) {
                                                        if (this.isInfiniteDuration == snapRecord.isInfiniteDuration()) {
                                                            str = this.groupType;
                                                            return str != null ? !str.equals(snapRecord.groupType()) : snapRecord.groupType() != null;
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

    public final String groupType() {
        return this.groupType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        long j2 = this.timestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.mediaId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        str = this.mediaUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.durationInMs;
        hashCode = (hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str2 = this.attachmentUrl;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.cognacAttachmentUri;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.zipped;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.storyRowId;
        hashCode = (((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        String str3 = this.groupType;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isInfiniteDuration() {
        return this.isInfiniteDuration;
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
        StringBuilder stringBuilder = new StringBuilder("SnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", snapId=");
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
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
        stringBuilder.append(", cognacAttachmentUri=");
        stringBuilder.append(this.cognacAttachmentUri);
        stringBuilder.append(", zipped=");
        stringBuilder.append(this.zipped);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", groupType=");
        stringBuilder.append(this.groupType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Boolean zipped() {
        return this.zipped;
    }
}

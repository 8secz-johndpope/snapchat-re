package com.snap.core.db.record;

import com.snap.core.db.record.SnapRecord.PlayableSnapRecord;
import defpackage.gcp;

final class AutoValue_SnapRecord_PlayableSnapRecord extends PlayableSnapRecord {
    private final long durationInMs;
    private final String groupType;
    private final long id;
    private final boolean isInfiniteDuration;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final String snapId;
    private final gcp snapType;
    private final long timestamp;
    private final Boolean zipped;

    AutoValue_SnapRecord_PlayableSnapRecord(long j, String str, long j2, String str2, String str3, String str4, gcp gcp, String str5, long j3, Boolean bool, boolean z, String str6) {
        this.id = j;
        if (str != null) {
            this.snapId = str;
            this.timestamp = j2;
            this.mediaId = str2;
            this.mediaIv = str3;
            this.mediaKey = str4;
            if (gcp != null) {
                this.snapType = gcp;
                this.mediaUrl = str5;
                this.durationInMs = j3;
                this.zipped = bool;
                this.isInfiniteDuration = z;
                this.groupType = str6;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayableSnapRecord) {
            PlayableSnapRecord playableSnapRecord = (PlayableSnapRecord) obj;
            if (this.id == playableSnapRecord.id() && this.snapId.equals(playableSnapRecord.snapId()) && this.timestamp == playableSnapRecord.timestamp()) {
                String str = this.mediaId;
                if (str != null ? !str.equals(playableSnapRecord.mediaId()) : playableSnapRecord.mediaId() != null) {
                    str = this.mediaIv;
                    if (str != null ? !str.equals(playableSnapRecord.mediaIv()) : playableSnapRecord.mediaIv() != null) {
                        str = this.mediaKey;
                        if (str != null ? !str.equals(playableSnapRecord.mediaKey()) : playableSnapRecord.mediaKey() != null) {
                            if (this.snapType.equals(playableSnapRecord.snapType())) {
                                str = this.mediaUrl;
                                if (str != null ? !str.equals(playableSnapRecord.mediaUrl()) : playableSnapRecord.mediaUrl() != null) {
                                    if (this.durationInMs == playableSnapRecord.durationInMs()) {
                                        Boolean bool = this.zipped;
                                        if (bool != null ? !bool.equals(playableSnapRecord.zipped()) : playableSnapRecord.zipped() != null) {
                                            if (this.isInfiniteDuration == playableSnapRecord.isInfiniteDuration()) {
                                                str = this.groupType;
                                                return str != null ? !str.equals(playableSnapRecord.groupType()) : playableSnapRecord.groupType() != null;
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
        long j = this.id;
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
        Boolean bool = this.zipped;
        hashCode = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        String str2 = this.groupType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final long id() {
        return this.id;
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

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayableSnapRecord{id=");
        stringBuilder.append(this.id);
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
        stringBuilder.append(", zipped=");
        stringBuilder.append(this.zipped);
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

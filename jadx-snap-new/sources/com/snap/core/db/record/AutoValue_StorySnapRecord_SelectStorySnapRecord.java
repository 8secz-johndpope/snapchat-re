package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapRecord;
import defpackage.gcp;

final class AutoValue_StorySnapRecord_SelectStorySnapRecord extends SelectStorySnapRecord {
    private final long _id;
    private final String clientId;
    private final MessageClientStatus clientStatus;
    private final long durationInMs;
    private final boolean isInfiniteDuration;
    private final StoryKind kind;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final String snapId;
    private final long snapRowId;
    private final gcp snapType;
    private final String storyId;
    private final long storyRowId;
    private final long timestamp;
    private final long totalScreenshotCount;
    private final long totalViewCount;
    private final String username;
    private final Boolean viewed;

    AutoValue_StorySnapRecord_SelectStorySnapRecord(long j, String str, String str2, Boolean bool, long j2, MessageClientStatus messageClientStatus, String str3, long j3, gcp gcp, String str4, String str5, String str6, String str7, long j4, boolean z, long j5, long j6, long j7, StoryKind storyKind, String str8) {
        String str9 = str2;
        String str10 = str3;
        gcp gcp2 = gcp;
        this._id = j;
        this.username = str;
        if (str9 != null) {
            this.clientId = str9;
            this.viewed = bool;
            this.snapRowId = j2;
            this.clientStatus = messageClientStatus;
            if (str10 != null) {
                this.snapId = str10;
                this.storyRowId = j3;
                if (gcp2 != null) {
                    this.snapType = gcp2;
                    this.mediaUrl = str4;
                    this.mediaKey = str5;
                    this.mediaIv = str6;
                    this.mediaId = str7;
                    this.durationInMs = j4;
                    this.isInfiniteDuration = z;
                    this.timestamp = j5;
                    this.totalViewCount = j6;
                    this.totalScreenshotCount = j7;
                    this.kind = storyKind;
                    this.storyId = str8;
                    return;
                }
                throw new NullPointerException("Null snapType");
            }
            throw new NullPointerException("Null snapId");
        }
        throw new NullPointerException("Null clientId");
    }

    public final long _id() {
        return this._id;
    }

    public final String clientId() {
        return this.clientId;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectStorySnapRecord) {
            SelectStorySnapRecord selectStorySnapRecord = (SelectStorySnapRecord) obj;
            if (this._id == selectStorySnapRecord._id()) {
                String str = this.username;
                if (str != null ? !str.equals(selectStorySnapRecord.username()) : selectStorySnapRecord.username() != null) {
                    if (this.clientId.equals(selectStorySnapRecord.clientId())) {
                        Boolean bool = this.viewed;
                        if (bool != null ? !bool.equals(selectStorySnapRecord.viewed()) : selectStorySnapRecord.viewed() != null) {
                            if (this.snapRowId == selectStorySnapRecord.snapRowId()) {
                                MessageClientStatus messageClientStatus = this.clientStatus;
                                if (messageClientStatus != null ? !messageClientStatus.equals(selectStorySnapRecord.clientStatus()) : selectStorySnapRecord.clientStatus() != null) {
                                    if (this.snapId.equals(selectStorySnapRecord.snapId()) && this.storyRowId == selectStorySnapRecord.storyRowId() && this.snapType.equals(selectStorySnapRecord.snapType())) {
                                        str = this.mediaUrl;
                                        if (str != null ? !str.equals(selectStorySnapRecord.mediaUrl()) : selectStorySnapRecord.mediaUrl() != null) {
                                            str = this.mediaKey;
                                            if (str != null ? !str.equals(selectStorySnapRecord.mediaKey()) : selectStorySnapRecord.mediaKey() != null) {
                                                str = this.mediaIv;
                                                if (str != null ? !str.equals(selectStorySnapRecord.mediaIv()) : selectStorySnapRecord.mediaIv() != null) {
                                                    str = this.mediaId;
                                                    if (str != null ? !str.equals(selectStorySnapRecord.mediaId()) : selectStorySnapRecord.mediaId() != null) {
                                                        if (this.durationInMs == selectStorySnapRecord.durationInMs() && this.isInfiniteDuration == selectStorySnapRecord.isInfiniteDuration() && this.timestamp == selectStorySnapRecord.timestamp() && this.totalViewCount == selectStorySnapRecord.totalViewCount() && this.totalScreenshotCount == selectStorySnapRecord.totalScreenshotCount()) {
                                                            StoryKind storyKind = this.kind;
                                                            if (storyKind != null ? !storyKind.equals(selectStorySnapRecord.kind()) : selectStorySnapRecord.kind() != null) {
                                                                str = this.storyId;
                                                                return str != null ? !str.equals(selectStorySnapRecord.storyId()) : selectStorySnapRecord.storyId() != null;
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

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.username;
        int i2 = 0;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.clientId.hashCode()) * 1000003;
        Boolean bool = this.viewed;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        long j2 = this.snapRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (((i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        j2 = this.storyRowId;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        str = this.mediaUrl;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        j2 = this.durationInMs;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        j2 = this.timestamp;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.totalViewCount;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.totalScreenshotCount;
        i = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        StoryKind storyKind = this.kind;
        i = (i ^ (storyKind == null ? 0 : storyKind.hashCode())) * 1000003;
        String str2 = this.storyId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i ^ i2;
    }

    public final boolean isInfiniteDuration() {
        return this.isInfiniteDuration;
    }

    public final StoryKind kind() {
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

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectStorySnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", totalViewCount=");
        stringBuilder.append(this.totalViewCount);
        stringBuilder.append(", totalScreenshotCount=");
        stringBuilder.append(this.totalScreenshotCount);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long totalScreenshotCount() {
        return this.totalScreenshotCount;
    }

    public final long totalViewCount() {
        return this.totalViewCount;
    }

    public final String username() {
        return this.username;
    }

    public final Boolean viewed() {
        return this.viewed;
    }
}

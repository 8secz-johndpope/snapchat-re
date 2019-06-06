package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord;
import defpackage.gcp;

final class AutoValue_StorySnapRecord_StoryManagementStorySnapRecord extends StoryManagementStorySnapRecord {
    private final long _id;
    private final String attachmentUrl;
    private final String captionTextDisplay;
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
    private final Boolean zipped;

    AutoValue_StorySnapRecord_StoryManagementStorySnapRecord(long j, String str, String str2, Boolean bool, MessageClientStatus messageClientStatus, String str3, long j2, String str4, long j3, gcp gcp, String str5, String str6, String str7, String str8, long j4, boolean z, long j5, Boolean bool2, String str9, long j6, long j7, StoryKind storyKind, String str10) {
        String str11 = str2;
        String str12 = str4;
        gcp gcp2 = gcp;
        StoryKind storyKind2 = storyKind;
        String str13 = str10;
        this._id = j;
        this.username = str;
        if (str11 != null) {
            this.clientId = str11;
            this.viewed = bool;
            this.clientStatus = messageClientStatus;
            this.captionTextDisplay = str3;
            this.snapRowId = j2;
            if (str12 != null) {
                this.snapId = str12;
                this.storyRowId = j3;
                if (gcp2 != null) {
                    this.snapType = gcp2;
                    this.mediaUrl = str5;
                    this.mediaKey = str6;
                    this.mediaIv = str7;
                    this.mediaId = str8;
                    this.durationInMs = j4;
                    this.isInfiniteDuration = z;
                    this.timestamp = j5;
                    this.zipped = bool2;
                    this.attachmentUrl = str9;
                    this.totalViewCount = j6;
                    this.totalScreenshotCount = j7;
                    if (storyKind2 != null) {
                        this.kind = storyKind2;
                        if (str13 != null) {
                            this.storyId = str13;
                            return;
                        }
                        throw new NullPointerException("Null storyId");
                    }
                    throw new NullPointerException("Null kind");
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

    public final String attachmentUrl() {
        return this.attachmentUrl;
    }

    public final String captionTextDisplay() {
        return this.captionTextDisplay;
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
        if (obj instanceof StoryManagementStorySnapRecord) {
            StoryManagementStorySnapRecord storyManagementStorySnapRecord = (StoryManagementStorySnapRecord) obj;
            if (this._id == storyManagementStorySnapRecord._id()) {
                String str = this.username;
                if (str != null ? !str.equals(storyManagementStorySnapRecord.username()) : storyManagementStorySnapRecord.username() != null) {
                    if (this.clientId.equals(storyManagementStorySnapRecord.clientId())) {
                        Boolean bool = this.viewed;
                        if (bool != null ? !bool.equals(storyManagementStorySnapRecord.viewed()) : storyManagementStorySnapRecord.viewed() != null) {
                            MessageClientStatus messageClientStatus = this.clientStatus;
                            if (messageClientStatus != null ? !messageClientStatus.equals(storyManagementStorySnapRecord.clientStatus()) : storyManagementStorySnapRecord.clientStatus() != null) {
                                str = this.captionTextDisplay;
                                if (str != null ? !str.equals(storyManagementStorySnapRecord.captionTextDisplay()) : storyManagementStorySnapRecord.captionTextDisplay() != null) {
                                    if (this.snapRowId == storyManagementStorySnapRecord.snapRowId() && this.snapId.equals(storyManagementStorySnapRecord.snapId()) && this.storyRowId == storyManagementStorySnapRecord.storyRowId() && this.snapType.equals(storyManagementStorySnapRecord.snapType())) {
                                        str = this.mediaUrl;
                                        if (str != null ? !str.equals(storyManagementStorySnapRecord.mediaUrl()) : storyManagementStorySnapRecord.mediaUrl() != null) {
                                            str = this.mediaKey;
                                            if (str != null ? !str.equals(storyManagementStorySnapRecord.mediaKey()) : storyManagementStorySnapRecord.mediaKey() != null) {
                                                str = this.mediaIv;
                                                if (str != null ? !str.equals(storyManagementStorySnapRecord.mediaIv()) : storyManagementStorySnapRecord.mediaIv() != null) {
                                                    str = this.mediaId;
                                                    if (str != null ? !str.equals(storyManagementStorySnapRecord.mediaId()) : storyManagementStorySnapRecord.mediaId() != null) {
                                                        if (this.durationInMs == storyManagementStorySnapRecord.durationInMs() && this.isInfiniteDuration == storyManagementStorySnapRecord.isInfiniteDuration() && this.timestamp == storyManagementStorySnapRecord.timestamp()) {
                                                            bool = this.zipped;
                                                            if (bool != null ? !bool.equals(storyManagementStorySnapRecord.zipped()) : storyManagementStorySnapRecord.zipped() != null) {
                                                                str = this.attachmentUrl;
                                                                if (str != null ? !str.equals(storyManagementStorySnapRecord.attachmentUrl()) : storyManagementStorySnapRecord.attachmentUrl() != null) {
                                                                    return this.totalViewCount == storyManagementStorySnapRecord.totalViewCount() && this.totalScreenshotCount == storyManagementStorySnapRecord.totalScreenshotCount() && this.kind.equals(storyManagementStorySnapRecord.kind()) && this.storyId.equals(storyManagementStorySnapRecord.storyId());
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

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.username;
        int i2 = 0;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.clientId.hashCode()) * 1000003;
        Boolean bool = this.viewed;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        str = this.captionTextDisplay;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.snapRowId;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.snapId.hashCode()) * 1000003;
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
        bool = this.zipped;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.attachmentUrl;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i ^ i2) * 1000003;
        long j3 = this.totalViewCount;
        i = (i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        j3 = this.totalScreenshotCount;
        return this.storyId.hashCode() ^ ((((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.kind.hashCode()) * 1000003);
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
        StringBuilder stringBuilder = new StringBuilder("StoryManagementStorySnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", captionTextDisplay=");
        stringBuilder.append(this.captionTextDisplay);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
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
        stringBuilder.append(", zipped=");
        stringBuilder.append(this.zipped);
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
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

    public final Boolean zipped() {
        return this.zipped;
    }
}

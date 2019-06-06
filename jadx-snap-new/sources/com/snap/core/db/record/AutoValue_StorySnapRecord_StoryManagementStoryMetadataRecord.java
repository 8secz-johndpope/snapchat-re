package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStoryMetadataRecord;
import defpackage.ageb;
import defpackage.agec;

final class AutoValue_StorySnapRecord_StoryManagementStoryMetadataRecord extends StoryManagementStoryMetadataRecord {
    private final String clientId;
    private final MessageClientStatus clientStatus;
    private final String creatorUsername;
    private final String displayName;
    private final long failedToAddCount;
    private final StoryKind kind;
    private final long maxViewCount;
    private final String storyId;
    private final long storyRowId;
    private final ageb storyType;
    private final String subText;
    private final long totalScreenshotCount;
    private final agec typeExtraData;
    private final Long viewed;
    private final long waitingToAddCount;

    AutoValue_StorySnapRecord_StoryManagementStoryMetadataRecord(String str, MessageClientStatus messageClientStatus, long j, long j2, long j3, String str2, StoryKind storyKind, String str3, Long l, ageb ageb, String str4, agec agec, String str5, long j4, long j5) {
        String str6 = str2;
        StoryKind storyKind2 = storyKind;
        this.clientId = str;
        this.clientStatus = messageClientStatus;
        this.maxViewCount = j;
        this.totalScreenshotCount = j2;
        this.storyRowId = j3;
        if (str6 != null) {
            this.storyId = str6;
            if (storyKind2 != null) {
                this.kind = storyKind2;
                this.displayName = str3;
                this.viewed = l;
                this.storyType = ageb;
                this.subText = str4;
                this.typeExtraData = agec;
                this.creatorUsername = str5;
                this.waitingToAddCount = j4;
                this.failedToAddCount = j5;
                return;
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null storyId");
    }

    public final String clientId() {
        return this.clientId;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final String creatorUsername() {
        return this.creatorUsername;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StoryManagementStoryMetadataRecord) {
            StoryManagementStoryMetadataRecord storyManagementStoryMetadataRecord = (StoryManagementStoryMetadataRecord) obj;
            String str = this.clientId;
            if (str != null ? !str.equals(storyManagementStoryMetadataRecord.clientId()) : storyManagementStoryMetadataRecord.clientId() != null) {
                MessageClientStatus messageClientStatus = this.clientStatus;
                if (messageClientStatus != null ? !messageClientStatus.equals(storyManagementStoryMetadataRecord.clientStatus()) : storyManagementStoryMetadataRecord.clientStatus() != null) {
                    if (this.maxViewCount == storyManagementStoryMetadataRecord.maxViewCount() && this.totalScreenshotCount == storyManagementStoryMetadataRecord.totalScreenshotCount() && this.storyRowId == storyManagementStoryMetadataRecord.storyRowId() && this.storyId.equals(storyManagementStoryMetadataRecord.storyId()) && this.kind.equals(storyManagementStoryMetadataRecord.kind())) {
                        str = this.displayName;
                        if (str != null ? !str.equals(storyManagementStoryMetadataRecord.displayName()) : storyManagementStoryMetadataRecord.displayName() != null) {
                            Long l = this.viewed;
                            if (l != null ? !l.equals(storyManagementStoryMetadataRecord.viewed()) : storyManagementStoryMetadataRecord.viewed() != null) {
                                ageb ageb = this.storyType;
                                if (ageb != null ? !ageb.equals(storyManagementStoryMetadataRecord.storyType()) : storyManagementStoryMetadataRecord.storyType() != null) {
                                    str = this.subText;
                                    if (str != null ? !str.equals(storyManagementStoryMetadataRecord.subText()) : storyManagementStoryMetadataRecord.subText() != null) {
                                        agec agec = this.typeExtraData;
                                        if (agec != null ? !agec.equals(storyManagementStoryMetadataRecord.typeExtraData()) : storyManagementStoryMetadataRecord.typeExtraData() != null) {
                                            str = this.creatorUsername;
                                            if (str != null ? !str.equals(storyManagementStoryMetadataRecord.creatorUsername()) : storyManagementStoryMetadataRecord.creatorUsername() != null) {
                                                return this.waitingToAddCount == storyManagementStoryMetadataRecord.waitingToAddCount() && this.failedToAddCount == storyManagementStoryMetadataRecord.failedToAddCount();
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

    public final long failedToAddCount() {
        return this.failedToAddCount;
    }

    public final int hashCode() {
        String str = this.clientId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        long j = this.maxViewCount;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        j = this.totalScreenshotCount;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        j = this.storyRowId;
        hashCode = (((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.storyId.hashCode()) * 1000003) ^ this.kind.hashCode()) * 1000003;
        String str2 = this.displayName;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.viewed;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        ageb ageb = this.storyType;
        hashCode = (hashCode ^ (ageb == null ? 0 : ageb.hashCode())) * 1000003;
        str2 = this.subText;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        agec agec = this.typeExtraData;
        hashCode = (hashCode ^ (agec == null ? 0 : agec.hashCode())) * 1000003;
        str2 = this.creatorUsername;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        j = this.waitingToAddCount;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.failedToAddCount;
        return hashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final StoryKind kind() {
        return this.kind;
    }

    public final long maxViewCount() {
        return this.maxViewCount;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final ageb storyType() {
        return this.storyType;
    }

    public final String subText() {
        return this.subText;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StoryManagementStoryMetadataRecord{clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", maxViewCount=");
        stringBuilder.append(this.maxViewCount);
        stringBuilder.append(", totalScreenshotCount=");
        stringBuilder.append(this.totalScreenshotCount);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", storyType=");
        stringBuilder.append(this.storyType);
        stringBuilder.append(", subText=");
        stringBuilder.append(this.subText);
        stringBuilder.append(", typeExtraData=");
        stringBuilder.append(this.typeExtraData);
        stringBuilder.append(", creatorUsername=");
        stringBuilder.append(this.creatorUsername);
        stringBuilder.append(", waitingToAddCount=");
        stringBuilder.append(this.waitingToAddCount);
        stringBuilder.append(", failedToAddCount=");
        stringBuilder.append(this.failedToAddCount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long totalScreenshotCount() {
        return this.totalScreenshotCount;
    }

    public final agec typeExtraData() {
        return this.typeExtraData;
    }

    public final Long viewed() {
        return this.viewed;
    }

    public final long waitingToAddCount() {
        return this.waitingToAddCount;
    }
}

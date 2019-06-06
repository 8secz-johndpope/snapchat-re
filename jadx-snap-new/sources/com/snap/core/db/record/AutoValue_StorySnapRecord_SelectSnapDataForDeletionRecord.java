package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.StorySnapRecord.SelectSnapDataForDeletionRecord;

final class AutoValue_StorySnapRecord_SelectSnapDataForDeletionRecord extends SelectSnapDataForDeletionRecord {
    private final MessageClientStatus clientStatus;
    private final Long expirationTimestamp;
    private final String snapId;
    private final long snapRowId;
    private final long storyRowId;
    private final long storySnapRowId;

    AutoValue_StorySnapRecord_SelectSnapDataForDeletionRecord(long j, long j2, String str, Long l, long j3, MessageClientStatus messageClientStatus) {
        this.storySnapRowId = j;
        this.snapRowId = j2;
        if (str != null) {
            this.snapId = str;
            this.expirationTimestamp = l;
            this.storyRowId = j3;
            this.clientStatus = messageClientStatus;
            return;
        }
        throw new NullPointerException("Null snapId");
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectSnapDataForDeletionRecord) {
            SelectSnapDataForDeletionRecord selectSnapDataForDeletionRecord = (SelectSnapDataForDeletionRecord) obj;
            if (this.storySnapRowId == selectSnapDataForDeletionRecord.storySnapRowId() && this.snapRowId == selectSnapDataForDeletionRecord.snapRowId() && this.snapId.equals(selectSnapDataForDeletionRecord.snapId())) {
                Long l = this.expirationTimestamp;
                if (l != null ? !l.equals(selectSnapDataForDeletionRecord.expirationTimestamp()) : selectSnapDataForDeletionRecord.expirationTimestamp() != null) {
                    if (this.storyRowId == selectSnapDataForDeletionRecord.storyRowId()) {
                        MessageClientStatus messageClientStatus = this.clientStatus;
                        return messageClientStatus != null ? !messageClientStatus.equals(selectSnapDataForDeletionRecord.clientStatus()) : selectSnapDataForDeletionRecord.clientStatus() != null;
                    }
                }
            }
        }
    }

    public final Long expirationTimestamp() {
        return this.expirationTimestamp;
    }

    public final int hashCode() {
        long j = this.storySnapRowId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.snapRowId;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        Long l = this.expirationTimestamp;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j3 = this.storyRowId;
        i = (i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        if (messageClientStatus != null) {
            i2 = messageClientStatus.hashCode();
        }
        return i ^ i2;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final long storySnapRowId() {
        return this.storySnapRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectSnapDataForDeletionRecord{storySnapRowId=");
        stringBuilder.append(this.storySnapRowId);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", expirationTimestamp=");
        stringBuilder.append(this.expirationTimestamp);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

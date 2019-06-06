package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.StorySnapRecord.SelectStoryManagementChromeDataRecord;

final class AutoValue_StorySnapRecord_SelectStoryManagementChromeDataRecord extends SelectStoryManagementChromeDataRecord {
    private final String clientId;
    private final MessageClientStatus clientStatus;
    private final long totalViewCount;

    AutoValue_StorySnapRecord_SelectStoryManagementChromeDataRecord(long j, MessageClientStatus messageClientStatus, String str) {
        this.totalViewCount = j;
        this.clientStatus = messageClientStatus;
        if (str != null) {
            this.clientId = str;
            return;
        }
        throw new NullPointerException("Null clientId");
    }

    public final String clientId() {
        return this.clientId;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectStoryManagementChromeDataRecord) {
            SelectStoryManagementChromeDataRecord selectStoryManagementChromeDataRecord = (SelectStoryManagementChromeDataRecord) obj;
            if (this.totalViewCount == selectStoryManagementChromeDataRecord.totalViewCount()) {
                MessageClientStatus messageClientStatus = this.clientStatus;
                if (messageClientStatus != null ? !messageClientStatus.equals(selectStoryManagementChromeDataRecord.clientStatus()) : selectStoryManagementChromeDataRecord.clientStatus() != null) {
                    if (this.clientId.equals(selectStoryManagementChromeDataRecord.clientId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.totalViewCount;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        return this.clientId.hashCode() ^ ((i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectStoryManagementChromeDataRecord{totalViewCount=");
        stringBuilder.append(this.totalViewCount);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long totalViewCount() {
        return this.totalViewCount;
    }
}

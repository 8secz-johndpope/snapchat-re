package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.SelectLocallyPersistedPostedFieldsRecord;

final class AutoValue_StorySnapRecord_SelectLocallyPersistedPostedFieldsRecord extends SelectLocallyPersistedPostedFieldsRecord {
    private final String clientId;
    private final Long postedTimestamp;
    private final long storyRowId;
    private final Boolean viewed;

    AutoValue_StorySnapRecord_SelectLocallyPersistedPostedFieldsRecord(long j, String str, Boolean bool, Long l) {
        this.storyRowId = j;
        if (str != null) {
            this.clientId = str;
            this.viewed = bool;
            this.postedTimestamp = l;
            return;
        }
        throw new NullPointerException("Null clientId");
    }

    public final String clientId() {
        return this.clientId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectLocallyPersistedPostedFieldsRecord) {
            SelectLocallyPersistedPostedFieldsRecord selectLocallyPersistedPostedFieldsRecord = (SelectLocallyPersistedPostedFieldsRecord) obj;
            if (this.storyRowId == selectLocallyPersistedPostedFieldsRecord.storyRowId() && this.clientId.equals(selectLocallyPersistedPostedFieldsRecord.clientId())) {
                Boolean bool = this.viewed;
                if (bool != null ? !bool.equals(selectLocallyPersistedPostedFieldsRecord.viewed()) : selectLocallyPersistedPostedFieldsRecord.viewed() != null) {
                    Long l = this.postedTimestamp;
                    return l != null ? !l.equals(selectLocallyPersistedPostedFieldsRecord.postedTimestamp()) : selectLocallyPersistedPostedFieldsRecord.postedTimestamp() != null;
                }
            }
        }
    }

    public final int hashCode() {
        long j = this.storyRowId;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.clientId.hashCode()) * 1000003;
        Boolean bool = this.viewed;
        int i = 0;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.postedTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long postedTimestamp() {
        return this.postedTimestamp;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectLocallyPersistedPostedFieldsRecord{storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", postedTimestamp=");
        stringBuilder.append(this.postedTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Boolean viewed() {
        return this.viewed;
    }
}

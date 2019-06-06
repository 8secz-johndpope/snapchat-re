package com.snap.core.db.record;

import com.snap.core.db.column.PlaybackSnapType;
import com.snap.core.db.record.PlaybackSnapViewRecord.SelectAll;

final class AutoValue_PlaybackSnapViewRecord_SelectAll extends SelectAll {
    private final long snapExpirationTimestampMillis;
    private final String snapId;
    private final long snapRowId;
    private final String storyId;
    private final Long storyRowId;
    private final PlaybackSnapType type;

    AutoValue_PlaybackSnapViewRecord_SelectAll(PlaybackSnapType playbackSnapType, long j, String str, long j2, String str2, Long l) {
        if (playbackSnapType != null) {
            this.type = playbackSnapType;
            this.snapRowId = j;
            if (str != null) {
                this.snapId = str;
                this.snapExpirationTimestampMillis = j2;
                this.storyId = str2;
                this.storyRowId = l;
                return;
            }
            throw new NullPointerException("Null snapId");
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectAll) {
            SelectAll selectAll = (SelectAll) obj;
            if (this.type.equals(selectAll.type()) && this.snapRowId == selectAll.snapRowId() && this.snapId.equals(selectAll.snapId()) && this.snapExpirationTimestampMillis == selectAll.snapExpirationTimestampMillis()) {
                String str = this.storyId;
                if (str != null ? !str.equals(selectAll.storyId()) : selectAll.storyId() != null) {
                    Long l = this.storyRowId;
                    return l != null ? !l.equals(selectAll.storyRowId()) : selectAll.storyRowId() != null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        long j = this.snapRowId;
        hashCode = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        j = this.snapExpirationTimestampMillis;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str = this.storyId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.storyRowId;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final long snapExpirationTimestampMillis() {
        return this.snapExpirationTimestampMillis;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectAll{type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", snapExpirationTimestampMillis=");
        stringBuilder.append(this.snapExpirationTimestampMillis);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final PlaybackSnapType type() {
        return this.type;
    }
}

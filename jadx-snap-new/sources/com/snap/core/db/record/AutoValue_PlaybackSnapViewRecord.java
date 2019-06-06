package com.snap.core.db.record;

import com.snap.core.db.column.PlaybackSnapType;

final class AutoValue_PlaybackSnapViewRecord extends PlaybackSnapViewRecord {
    private final long _id;
    private final long snapExpirationTimestampMillis;
    private final String snapId;
    private final long snapRowId;
    private final Long snapTimestampMillis;
    private final String storyId;
    private final Long storyRowId;
    private final PlaybackSnapType type;
    private final Long viewDurationMillis;
    private final long viewStartTimestampMillis;

    AutoValue_PlaybackSnapViewRecord(long j, PlaybackSnapType playbackSnapType, long j2, String str, long j3, Long l, Long l2, long j4, String str2, Long l3) {
        this._id = j;
        if (playbackSnapType != null) {
            this.type = playbackSnapType;
            this.snapRowId = j2;
            if (str != null) {
                this.snapId = str;
                this.viewStartTimestampMillis = j3;
                this.viewDurationMillis = l;
                this.snapTimestampMillis = l2;
                this.snapExpirationTimestampMillis = j4;
                this.storyId = str2;
                this.storyRowId = l3;
                return;
            }
            throw new NullPointerException("Null snapId");
        }
        throw new NullPointerException("Null type");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaybackSnapViewRecord) {
            PlaybackSnapViewRecord playbackSnapViewRecord = (PlaybackSnapViewRecord) obj;
            if (this._id == playbackSnapViewRecord._id() && this.type.equals(playbackSnapViewRecord.type()) && this.snapRowId == playbackSnapViewRecord.snapRowId() && this.snapId.equals(playbackSnapViewRecord.snapId()) && this.viewStartTimestampMillis == playbackSnapViewRecord.viewStartTimestampMillis()) {
                Long l = this.viewDurationMillis;
                if (l != null ? !l.equals(playbackSnapViewRecord.viewDurationMillis()) : playbackSnapViewRecord.viewDurationMillis() != null) {
                    l = this.snapTimestampMillis;
                    if (l != null ? !l.equals(playbackSnapViewRecord.snapTimestampMillis()) : playbackSnapViewRecord.snapTimestampMillis() != null) {
                        if (this.snapExpirationTimestampMillis == playbackSnapViewRecord.snapExpirationTimestampMillis()) {
                            String str = this.storyId;
                            if (str != null ? !str.equals(playbackSnapViewRecord.storyId()) : playbackSnapViewRecord.storyId() != null) {
                                l = this.storyRowId;
                                return l != null ? !l.equals(playbackSnapViewRecord.storyRowId()) : playbackSnapViewRecord.storyRowId() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003;
        long j2 = this.snapRowId;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        j2 = this.viewStartTimestampMillis;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.viewDurationMillis;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.snapTimestampMillis;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j3 = this.snapExpirationTimestampMillis;
        hashCode = (hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str = this.storyId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l2 = this.storyRowId;
        if (l2 != null) {
            i = l2.hashCode();
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

    public final Long snapTimestampMillis() {
        return this.snapTimestampMillis;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackSnapViewRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", viewStartTimestampMillis=");
        stringBuilder.append(this.viewStartTimestampMillis);
        stringBuilder.append(", viewDurationMillis=");
        stringBuilder.append(this.viewDurationMillis);
        stringBuilder.append(", snapTimestampMillis=");
        stringBuilder.append(this.snapTimestampMillis);
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

    public final Long viewDurationMillis() {
        return this.viewDurationMillis;
    }

    public final long viewStartTimestampMillis() {
        return this.viewStartTimestampMillis;
    }
}

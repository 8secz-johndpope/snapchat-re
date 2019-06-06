package com.snap.core.db.record;

import com.snap.core.db.record.FeedRecord.ReadWriteTimeInfo;
import defpackage.gcp;

final class AutoValue_FeedRecord_ReadWriteTimeInfo extends ReadWriteTimeInfo {
    private final long _id;
    private final String displayInteractionType;
    private final long displayTimestamp;
    private final Long lastInteractionTimestamp;
    private final Long lastInteractionUserId;
    private final Long lastReadTimestamp;
    private final String lastReader;
    private final Long lastReaderUserId;
    private final gcp lastSnapType;
    private final Long lastWriteTimestamp;
    private final String lastWriteType;
    private final String lastWriter;
    private final Long lastWriterUserId;
    private final long sortingTimestamp;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final Boolean storyViewed;

    AutoValue_FeedRecord_ReadWriteTimeInfo(long j, Long l, Long l2, String str, Long l3, Long l4, String str2, String str3, long j2, String str4, Long l5, long j3, Long l6, gcp gcp, Long l7, Long l8, Boolean bool) {
        this._id = j;
        this.lastInteractionTimestamp = l;
        this.lastReadTimestamp = l2;
        this.lastReader = str;
        this.lastReaderUserId = l3;
        this.lastWriteTimestamp = l4;
        this.lastWriteType = str2;
        this.lastWriter = str3;
        this.displayTimestamp = j2;
        this.displayInteractionType = str4;
        this.lastInteractionUserId = l5;
        this.sortingTimestamp = j3;
        this.lastWriterUserId = l6;
        this.lastSnapType = gcp;
        this.storyLatestTimestamp = l7;
        this.storyLatestExpirationTimestamp = l8;
        this.storyViewed = bool;
    }

    public final long _id() {
        return this._id;
    }

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final long displayTimestamp() {
        return this.displayTimestamp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReadWriteTimeInfo) {
            ReadWriteTimeInfo readWriteTimeInfo = (ReadWriteTimeInfo) obj;
            if (this._id == readWriteTimeInfo._id()) {
                Long l = this.lastInteractionTimestamp;
                if (l != null ? !l.equals(readWriteTimeInfo.lastInteractionTimestamp()) : readWriteTimeInfo.lastInteractionTimestamp() != null) {
                    l = this.lastReadTimestamp;
                    if (l != null ? !l.equals(readWriteTimeInfo.lastReadTimestamp()) : readWriteTimeInfo.lastReadTimestamp() != null) {
                        String str = this.lastReader;
                        if (str != null ? !str.equals(readWriteTimeInfo.lastReader()) : readWriteTimeInfo.lastReader() != null) {
                            l = this.lastReaderUserId;
                            if (l != null ? !l.equals(readWriteTimeInfo.lastReaderUserId()) : readWriteTimeInfo.lastReaderUserId() != null) {
                                l = this.lastWriteTimestamp;
                                if (l != null ? !l.equals(readWriteTimeInfo.lastWriteTimestamp()) : readWriteTimeInfo.lastWriteTimestamp() != null) {
                                    str = this.lastWriteType;
                                    if (str != null ? !str.equals(readWriteTimeInfo.lastWriteType()) : readWriteTimeInfo.lastWriteType() != null) {
                                        str = this.lastWriter;
                                        if (str != null ? !str.equals(readWriteTimeInfo.lastWriter()) : readWriteTimeInfo.lastWriter() != null) {
                                            if (this.displayTimestamp == readWriteTimeInfo.displayTimestamp()) {
                                                str = this.displayInteractionType;
                                                if (str != null ? !str.equals(readWriteTimeInfo.displayInteractionType()) : readWriteTimeInfo.displayInteractionType() != null) {
                                                    l = this.lastInteractionUserId;
                                                    if (l != null ? !l.equals(readWriteTimeInfo.lastInteractionUserId()) : readWriteTimeInfo.lastInteractionUserId() != null) {
                                                        if (this.sortingTimestamp == readWriteTimeInfo.sortingTimestamp()) {
                                                            l = this.lastWriterUserId;
                                                            if (l != null ? !l.equals(readWriteTimeInfo.lastWriterUserId()) : readWriteTimeInfo.lastWriterUserId() != null) {
                                                                gcp gcp = this.lastSnapType;
                                                                if (gcp != null ? !gcp.equals(readWriteTimeInfo.lastSnapType()) : readWriteTimeInfo.lastSnapType() != null) {
                                                                    l = this.storyLatestTimestamp;
                                                                    if (l != null ? !l.equals(readWriteTimeInfo.storyLatestTimestamp()) : readWriteTimeInfo.storyLatestTimestamp() != null) {
                                                                        l = this.storyLatestExpirationTimestamp;
                                                                        if (l != null ? !l.equals(readWriteTimeInfo.storyLatestExpirationTimestamp()) : readWriteTimeInfo.storyLatestExpirationTimestamp() != null) {
                                                                            Boolean bool = this.storyViewed;
                                                                            return bool != null ? !bool.equals(readWriteTimeInfo.storyViewed()) : readWriteTimeInfo.storyViewed() != null;
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
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this.lastInteractionTimestamp;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastReadTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.lastReader;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.lastReaderUserId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastWriteTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.lastWriteType;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.lastWriter;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.displayTimestamp;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        str = this.displayInteractionType;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.lastInteractionUserId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        j2 = this.sortingTimestamp;
        i = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l2 = this.lastWriterUserId;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        gcp gcp = this.lastSnapType;
        i = (i ^ (gcp == null ? 0 : gcp.hashCode())) * 1000003;
        l2 = this.storyLatestTimestamp;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        l2 = this.storyLatestExpirationTimestamp;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i ^ i2;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final Long lastInteractionUserId() {
        return this.lastInteractionUserId;
    }

    public final Long lastReadTimestamp() {
        return this.lastReadTimestamp;
    }

    public final String lastReader() {
        return this.lastReader;
    }

    public final Long lastReaderUserId() {
        return this.lastReaderUserId;
    }

    public final gcp lastSnapType() {
        return this.lastSnapType;
    }

    public final Long lastWriteTimestamp() {
        return this.lastWriteTimestamp;
    }

    public final String lastWriteType() {
        return this.lastWriteType;
    }

    public final String lastWriter() {
        return this.lastWriter;
    }

    public final Long lastWriterUserId() {
        return this.lastWriterUserId;
    }

    public final long sortingTimestamp() {
        return this.sortingTimestamp;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReadWriteTimeInfo{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", lastReadTimestamp=");
        stringBuilder.append(this.lastReadTimestamp);
        stringBuilder.append(", lastReader=");
        stringBuilder.append(this.lastReader);
        stringBuilder.append(", lastReaderUserId=");
        stringBuilder.append(this.lastReaderUserId);
        stringBuilder.append(", lastWriteTimestamp=");
        stringBuilder.append(this.lastWriteTimestamp);
        stringBuilder.append(", lastWriteType=");
        stringBuilder.append(this.lastWriteType);
        stringBuilder.append(", lastWriter=");
        stringBuilder.append(this.lastWriter);
        stringBuilder.append(", displayTimestamp=");
        stringBuilder.append(this.displayTimestamp);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append(", lastInteractionUserId=");
        stringBuilder.append(this.lastInteractionUserId);
        stringBuilder.append(", sortingTimestamp=");
        stringBuilder.append(this.sortingTimestamp);
        stringBuilder.append(", lastWriterUserId=");
        stringBuilder.append(this.lastWriterUserId);
        stringBuilder.append(", lastSnapType=");
        stringBuilder.append(this.lastSnapType);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

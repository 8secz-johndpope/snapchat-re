package com.snap.core.db.record;

import com.snap.core.db.column.PublisherPageSnapType;
import com.snap.core.db.record.PublisherSnapPageRecord.PlayablePagesRecord;

final class AutoValue_PublisherSnapPageRecord_PlayablePagesRecord extends PlayablePagesRecord {
    private final long _id;
    private final Long adType;
    private final long editionId;
    private final Long lastView;
    private final String pageHash;
    private final long pageId;
    private final Long publishTimestampMs;
    private final String publisherFormalName;
    private final long publisherId;
    private final String publisherName;
    private final PublisherPageSnapType snapType;
    private final String storyId;
    private final long storyRowId;
    private final String thumbnailUrl;
    private final String url;

    AutoValue_PublisherSnapPageRecord_PlayablePagesRecord(long j, long j2, String str, long j3, long j4, String str2, String str3, long j5, PublisherPageSnapType publisherPageSnapType, String str4, String str5, Long l, Long l2, Long l3, String str6) {
        String str7 = str;
        PublisherPageSnapType publisherPageSnapType2 = publisherPageSnapType;
        this._id = j;
        this.pageId = j2;
        if (str7 != null) {
            this.storyId = str7;
            this.storyRowId = j3;
            this.editionId = j4;
            this.publisherFormalName = str2;
            this.publisherName = str3;
            this.publisherId = j5;
            if (publisherPageSnapType2 != null) {
                this.snapType = publisherPageSnapType2;
                this.url = str4;
                this.pageHash = str5;
                this.adType = l;
                this.lastView = l2;
                this.publishTimestampMs = l3;
                this.thumbnailUrl = str6;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final Long adType() {
        return this.adType;
    }

    public final long editionId() {
        return this.editionId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayablePagesRecord) {
            PlayablePagesRecord playablePagesRecord = (PlayablePagesRecord) obj;
            if (this._id == playablePagesRecord._id() && this.pageId == playablePagesRecord.pageId() && this.storyId.equals(playablePagesRecord.storyId()) && this.storyRowId == playablePagesRecord.storyRowId() && this.editionId == playablePagesRecord.editionId()) {
                String str = this.publisherFormalName;
                if (str != null ? !str.equals(playablePagesRecord.publisherFormalName()) : playablePagesRecord.publisherFormalName() != null) {
                    str = this.publisherName;
                    if (str != null ? !str.equals(playablePagesRecord.publisherName()) : playablePagesRecord.publisherName() != null) {
                        if (this.publisherId == playablePagesRecord.publisherId() && this.snapType.equals(playablePagesRecord.snapType())) {
                            str = this.url;
                            if (str != null ? !str.equals(playablePagesRecord.url()) : playablePagesRecord.url() != null) {
                                str = this.pageHash;
                                if (str != null ? !str.equals(playablePagesRecord.pageHash()) : playablePagesRecord.pageHash() != null) {
                                    Long l = this.adType;
                                    if (l != null ? !l.equals(playablePagesRecord.adType()) : playablePagesRecord.adType() != null) {
                                        l = this.lastView;
                                        if (l != null ? !l.equals(playablePagesRecord.lastView()) : playablePagesRecord.lastView() != null) {
                                            l = this.publishTimestampMs;
                                            if (l != null ? !l.equals(playablePagesRecord.publishTimestampMs()) : playablePagesRecord.publishTimestampMs() != null) {
                                                str = this.thumbnailUrl;
                                                return str != null ? !str.equals(playablePagesRecord.thumbnailUrl()) : playablePagesRecord.thumbnailUrl() != null;
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
        long j2 = this.pageId;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        j2 = this.storyRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.editionId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.publisherFormalName;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.publisherName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.publisherId;
        i = (((i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        String str2 = this.url;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.pageHash;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.adType;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastView;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.publishTimestampMs;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str3 = this.thumbnailUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i ^ i2;
    }

    public final Long lastView() {
        return this.lastView;
    }

    public final String pageHash() {
        return this.pageHash;
    }

    public final long pageId() {
        return this.pageId;
    }

    public final Long publishTimestampMs() {
        return this.publishTimestampMs;
    }

    public final String publisherFormalName() {
        return this.publisherFormalName;
    }

    public final long publisherId() {
        return this.publisherId;
    }

    public final String publisherName() {
        return this.publisherName;
    }

    public final PublisherPageSnapType snapType() {
        return this.snapType;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayablePagesRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", pageId=");
        stringBuilder.append(this.pageId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", editionId=");
        stringBuilder.append(this.editionId);
        stringBuilder.append(", publisherFormalName=");
        stringBuilder.append(this.publisherFormalName);
        stringBuilder.append(", publisherName=");
        stringBuilder.append(this.publisherName);
        stringBuilder.append(", publisherId=");
        stringBuilder.append(this.publisherId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", pageHash=");
        stringBuilder.append(this.pageHash);
        stringBuilder.append(", adType=");
        stringBuilder.append(this.adType);
        stringBuilder.append(", lastView=");
        stringBuilder.append(this.lastView);
        stringBuilder.append(", publishTimestampMs=");
        stringBuilder.append(this.publishTimestampMs);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String url() {
        return this.url;
    }
}

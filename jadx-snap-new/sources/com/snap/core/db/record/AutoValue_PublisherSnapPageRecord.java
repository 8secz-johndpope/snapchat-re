package com.snap.core.db.record;

import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.PublisherPageSnapType;

final class AutoValue_PublisherSnapPageRecord extends PublisherSnapPageRecord {
    private final long _id;
    private final Long adType;
    private final long editionId;
    private final FeatureType featureType;
    private final boolean isAutoAdvance;
    private final boolean isSkippable;
    private final String pageHash;
    private final long pageId;
    private final Long publishTimestampMs;
    private final String publisherFormalName;
    private final long publisherId;
    private final String publisherName;
    private final boolean shareable;
    private final String slugType;
    private final PublisherPageSnapType snapType;
    private final String storyId;
    private final long storyRowId;
    private final String swipeUpKey;
    private final String thumbnailUrl;
    private final Long tileBadgeBgColor;
    private final Long tileBadgeSize;
    private final Long tileBadgeTextColor;
    private final String tileBadgeTitle;
    private final String tileHeadline;
    private final String tileId;
    private final String tileImageUrl;
    private final Long tileProgress;
    private final String tileShowSubtitle;
    private final long timestamp;
    private final String url;

    AutoValue_PublisherSnapPageRecord(long j, long j2, String str, long j3, long j4, String str2, String str3, PublisherPageSnapType publisherPageSnapType, String str4, String str5, Long l, String str6, boolean z, boolean z2, boolean z3, String str7, FeatureType featureType, Long l2, String str8, long j5, long j6, String str9, String str10, String str11, Long l3, String str12, Long l4, String str13, Long l5, Long l6) {
        String str14 = str;
        PublisherPageSnapType publisherPageSnapType2 = publisherPageSnapType;
        FeatureType featureType2 = featureType;
        this._id = j;
        this.pageId = j2;
        if (str14 != null) {
            this.storyId = str14;
            this.storyRowId = j3;
            this.editionId = j4;
            this.publisherFormalName = str2;
            this.publisherName = str3;
            if (publisherPageSnapType2 != null) {
                this.snapType = publisherPageSnapType2;
                this.url = str4;
                this.pageHash = str5;
                this.adType = l;
                this.swipeUpKey = str6;
                this.shareable = z;
                this.isAutoAdvance = z2;
                this.isSkippable = z3;
                this.slugType = str7;
                if (featureType2 != null) {
                    this.featureType = featureType2;
                    this.publishTimestampMs = l2;
                    this.thumbnailUrl = str8;
                    this.timestamp = j5;
                    this.publisherId = j6;
                    this.tileId = str9;
                    this.tileImageUrl = str10;
                    this.tileHeadline = str11;
                    this.tileProgress = l3;
                    this.tileShowSubtitle = str12;
                    this.tileBadgeSize = l4;
                    this.tileBadgeTitle = str13;
                    this.tileBadgeBgColor = l5;
                    this.tileBadgeTextColor = l6;
                    return;
                }
                throw new NullPointerException("Null featureType");
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
        if (obj instanceof PublisherSnapPageRecord) {
            PublisherSnapPageRecord publisherSnapPageRecord = (PublisherSnapPageRecord) obj;
            if (this._id == publisherSnapPageRecord._id() && this.pageId == publisherSnapPageRecord.pageId() && this.storyId.equals(publisherSnapPageRecord.storyId()) && this.storyRowId == publisherSnapPageRecord.storyRowId() && this.editionId == publisherSnapPageRecord.editionId()) {
                String str = this.publisherFormalName;
                if (str != null ? !str.equals(publisherSnapPageRecord.publisherFormalName()) : publisherSnapPageRecord.publisherFormalName() != null) {
                    str = this.publisherName;
                    if (str != null ? !str.equals(publisherSnapPageRecord.publisherName()) : publisherSnapPageRecord.publisherName() != null) {
                        if (this.snapType.equals(publisherSnapPageRecord.snapType())) {
                            str = this.url;
                            if (str != null ? !str.equals(publisherSnapPageRecord.url()) : publisherSnapPageRecord.url() != null) {
                                str = this.pageHash;
                                if (str != null ? !str.equals(publisherSnapPageRecord.pageHash()) : publisherSnapPageRecord.pageHash() != null) {
                                    Long l = this.adType;
                                    if (l != null ? !l.equals(publisherSnapPageRecord.adType()) : publisherSnapPageRecord.adType() != null) {
                                        str = this.swipeUpKey;
                                        if (str != null ? !str.equals(publisherSnapPageRecord.swipeUpKey()) : publisherSnapPageRecord.swipeUpKey() != null) {
                                            if (this.shareable == publisherSnapPageRecord.shareable() && this.isAutoAdvance == publisherSnapPageRecord.isAutoAdvance() && this.isSkippable == publisherSnapPageRecord.isSkippable()) {
                                                str = this.slugType;
                                                if (str != null ? !str.equals(publisherSnapPageRecord.slugType()) : publisherSnapPageRecord.slugType() != null) {
                                                    if (this.featureType.equals(publisherSnapPageRecord.featureType())) {
                                                        l = this.publishTimestampMs;
                                                        if (l != null ? !l.equals(publisherSnapPageRecord.publishTimestampMs()) : publisherSnapPageRecord.publishTimestampMs() != null) {
                                                            str = this.thumbnailUrl;
                                                            if (str != null ? !str.equals(publisherSnapPageRecord.thumbnailUrl()) : publisherSnapPageRecord.thumbnailUrl() != null) {
                                                                if (this.timestamp == publisherSnapPageRecord.timestamp() && this.publisherId == publisherSnapPageRecord.publisherId()) {
                                                                    str = this.tileId;
                                                                    if (str != null ? !str.equals(publisherSnapPageRecord.tileId()) : publisherSnapPageRecord.tileId() != null) {
                                                                        str = this.tileImageUrl;
                                                                        if (str != null ? !str.equals(publisherSnapPageRecord.tileImageUrl()) : publisherSnapPageRecord.tileImageUrl() != null) {
                                                                            str = this.tileHeadline;
                                                                            if (str != null ? !str.equals(publisherSnapPageRecord.tileHeadline()) : publisherSnapPageRecord.tileHeadline() != null) {
                                                                                l = this.tileProgress;
                                                                                if (l != null ? !l.equals(publisherSnapPageRecord.tileProgress()) : publisherSnapPageRecord.tileProgress() != null) {
                                                                                    str = this.tileShowSubtitle;
                                                                                    if (str != null ? !str.equals(publisherSnapPageRecord.tileShowSubtitle()) : publisherSnapPageRecord.tileShowSubtitle() != null) {
                                                                                        l = this.tileBadgeSize;
                                                                                        if (l != null ? !l.equals(publisherSnapPageRecord.tileBadgeSize()) : publisherSnapPageRecord.tileBadgeSize() != null) {
                                                                                            str = this.tileBadgeTitle;
                                                                                            if (str != null ? !str.equals(publisherSnapPageRecord.tileBadgeTitle()) : publisherSnapPageRecord.tileBadgeTitle() != null) {
                                                                                                l = this.tileBadgeBgColor;
                                                                                                if (l != null ? !l.equals(publisherSnapPageRecord.tileBadgeBgColor()) : publisherSnapPageRecord.tileBadgeBgColor() != null) {
                                                                                                    l = this.tileBadgeTextColor;
                                                                                                    return l != null ? !l.equals(publisherSnapPageRecord.tileBadgeTextColor()) : publisherSnapPageRecord.tileBadgeTextColor() != null;
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
                        }
                    }
                }
            }
        }
    }

    public final FeatureType featureType() {
        return this.featureType;
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
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        str = this.url;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.pageHash;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.adType;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.swipeUpKey;
        int i3 = 1231;
        i = (((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.shareable ? 1231 : 1237)) * 1000003) ^ (this.isAutoAdvance ? 1231 : 1237)) * 1000003;
        if (!this.isSkippable) {
            i3 = 1237;
        }
        i = (i ^ i3) * 1000003;
        str = this.slugType;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.featureType.hashCode()) * 1000003;
        l = this.publishTimestampMs;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.thumbnailUrl;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.timestamp;
        i = (i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        j3 = this.publisherId;
        i = (i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str2 = this.tileId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.tileImageUrl;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.tileHeadline;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l2 = this.tileProgress;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        str2 = this.tileShowSubtitle;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        l2 = this.tileBadgeSize;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        str2 = this.tileBadgeTitle;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        l2 = this.tileBadgeBgColor;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.tileBadgeTextColor;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        return i ^ i2;
    }

    public final boolean isAutoAdvance() {
        return this.isAutoAdvance;
    }

    public final boolean isSkippable() {
        return this.isSkippable;
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

    public final boolean shareable() {
        return this.shareable;
    }

    public final String slugType() {
        return this.slugType;
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

    public final String swipeUpKey() {
        return this.swipeUpKey;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final Long tileBadgeBgColor() {
        return this.tileBadgeBgColor;
    }

    public final Long tileBadgeSize() {
        return this.tileBadgeSize;
    }

    public final Long tileBadgeTextColor() {
        return this.tileBadgeTextColor;
    }

    public final String tileBadgeTitle() {
        return this.tileBadgeTitle;
    }

    public final String tileHeadline() {
        return this.tileHeadline;
    }

    public final String tileId() {
        return this.tileId;
    }

    public final String tileImageUrl() {
        return this.tileImageUrl;
    }

    public final Long tileProgress() {
        return this.tileProgress;
    }

    public final String tileShowSubtitle() {
        return this.tileShowSubtitle;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PublisherSnapPageRecord{_id=");
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
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", pageHash=");
        stringBuilder.append(this.pageHash);
        stringBuilder.append(", adType=");
        stringBuilder.append(this.adType);
        stringBuilder.append(", swipeUpKey=");
        stringBuilder.append(this.swipeUpKey);
        stringBuilder.append(", shareable=");
        stringBuilder.append(this.shareable);
        stringBuilder.append(", isAutoAdvance=");
        stringBuilder.append(this.isAutoAdvance);
        stringBuilder.append(", isSkippable=");
        stringBuilder.append(this.isSkippable);
        stringBuilder.append(", slugType=");
        stringBuilder.append(this.slugType);
        stringBuilder.append(", featureType=");
        stringBuilder.append(this.featureType);
        stringBuilder.append(", publishTimestampMs=");
        stringBuilder.append(this.publishTimestampMs);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", publisherId=");
        stringBuilder.append(this.publisherId);
        stringBuilder.append(", tileId=");
        stringBuilder.append(this.tileId);
        stringBuilder.append(", tileImageUrl=");
        stringBuilder.append(this.tileImageUrl);
        stringBuilder.append(", tileHeadline=");
        stringBuilder.append(this.tileHeadline);
        stringBuilder.append(", tileProgress=");
        stringBuilder.append(this.tileProgress);
        stringBuilder.append(", tileShowSubtitle=");
        stringBuilder.append(this.tileShowSubtitle);
        stringBuilder.append(", tileBadgeSize=");
        stringBuilder.append(this.tileBadgeSize);
        stringBuilder.append(", tileBadgeTitle=");
        stringBuilder.append(this.tileBadgeTitle);
        stringBuilder.append(", tileBadgeBgColor=");
        stringBuilder.append(this.tileBadgeBgColor);
        stringBuilder.append(", tileBadgeTextColor=");
        stringBuilder.append(this.tileBadgeTextColor);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String url() {
        return this.url;
    }
}

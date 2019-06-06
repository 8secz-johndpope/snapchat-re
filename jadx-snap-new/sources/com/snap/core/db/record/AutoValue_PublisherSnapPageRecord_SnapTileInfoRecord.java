package com.snap.core.db.record;

import com.snap.core.db.record.PublisherSnapPageRecord.SnapTileInfoRecord;

final class AutoValue_PublisherSnapPageRecord_SnapTileInfoRecord extends SnapTileInfoRecord {
    private final long _id;
    private final Long lastView;
    private final long pageId;
    private final Long tileBadgeBgColor;
    private final Long tileBadgeSize;
    private final Long tileBadgeTextColor;
    private final String tileBadgeTitle;
    private final String tileHeadline;
    private final String tileId;
    private final String tileImageUrl;
    private final Long tileProgress;
    private final String tileShowSubtitle;

    AutoValue_PublisherSnapPageRecord_SnapTileInfoRecord(long j, long j2, String str, String str2, String str3, Long l, String str4, Long l2, String str5, Long l3, Long l4, Long l5) {
        this._id = j;
        this.pageId = j2;
        this.tileId = str;
        this.tileImageUrl = str2;
        this.tileHeadline = str3;
        this.tileProgress = l;
        this.tileShowSubtitle = str4;
        this.tileBadgeSize = l2;
        this.tileBadgeTitle = str5;
        this.tileBadgeBgColor = l3;
        this.tileBadgeTextColor = l4;
        this.lastView = l5;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapTileInfoRecord) {
            SnapTileInfoRecord snapTileInfoRecord = (SnapTileInfoRecord) obj;
            if (this._id == snapTileInfoRecord._id() && this.pageId == snapTileInfoRecord.pageId()) {
                String str = this.tileId;
                if (str != null ? !str.equals(snapTileInfoRecord.tileId()) : snapTileInfoRecord.tileId() != null) {
                    str = this.tileImageUrl;
                    if (str != null ? !str.equals(snapTileInfoRecord.tileImageUrl()) : snapTileInfoRecord.tileImageUrl() != null) {
                        str = this.tileHeadline;
                        if (str != null ? !str.equals(snapTileInfoRecord.tileHeadline()) : snapTileInfoRecord.tileHeadline() != null) {
                            Long l = this.tileProgress;
                            if (l != null ? !l.equals(snapTileInfoRecord.tileProgress()) : snapTileInfoRecord.tileProgress() != null) {
                                str = this.tileShowSubtitle;
                                if (str != null ? !str.equals(snapTileInfoRecord.tileShowSubtitle()) : snapTileInfoRecord.tileShowSubtitle() != null) {
                                    l = this.tileBadgeSize;
                                    if (l != null ? !l.equals(snapTileInfoRecord.tileBadgeSize()) : snapTileInfoRecord.tileBadgeSize() != null) {
                                        str = this.tileBadgeTitle;
                                        if (str != null ? !str.equals(snapTileInfoRecord.tileBadgeTitle()) : snapTileInfoRecord.tileBadgeTitle() != null) {
                                            l = this.tileBadgeBgColor;
                                            if (l != null ? !l.equals(snapTileInfoRecord.tileBadgeBgColor()) : snapTileInfoRecord.tileBadgeBgColor() != null) {
                                                l = this.tileBadgeTextColor;
                                                if (l != null ? !l.equals(snapTileInfoRecord.tileBadgeTextColor()) : snapTileInfoRecord.tileBadgeTextColor() != null) {
                                                    l = this.lastView;
                                                    return l != null ? !l.equals(snapTileInfoRecord.lastView()) : snapTileInfoRecord.lastView() != null;
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
        long j2 = this.pageId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.tileId;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.tileImageUrl;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.tileHeadline;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.tileProgress;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.tileShowSubtitle;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.tileBadgeSize;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.tileBadgeTitle;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.tileBadgeBgColor;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.tileBadgeTextColor;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.lastView;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final Long lastView() {
        return this.lastView;
    }

    public final long pageId() {
        return this.pageId;
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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapTileInfoRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", pageId=");
        stringBuilder.append(this.pageId);
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
        stringBuilder.append(", lastView=");
        stringBuilder.append(this.lastView);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

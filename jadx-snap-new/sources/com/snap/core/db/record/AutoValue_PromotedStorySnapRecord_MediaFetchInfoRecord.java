package com.snap.core.db.record;

import com.snap.core.db.record.PromotedStorySnapRecord.MediaFetchInfoRecord;

final class AutoValue_PromotedStorySnapRecord_MediaFetchInfoRecord extends MediaFetchInfoRecord {
    private final long _id;
    private final String adSnapKey;
    private final String mediaUrl;

    AutoValue_PromotedStorySnapRecord_MediaFetchInfoRecord(long j, String str, String str2) {
        this._id = j;
        this.adSnapKey = str;
        if (str2 != null) {
            this.mediaUrl = str2;
            return;
        }
        throw new NullPointerException("Null mediaUrl");
    }

    public final long _id() {
        return this._id;
    }

    public final String adSnapKey() {
        return this.adSnapKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaFetchInfoRecord) {
            MediaFetchInfoRecord mediaFetchInfoRecord = (MediaFetchInfoRecord) obj;
            if (this._id == mediaFetchInfoRecord._id()) {
                String str = this.adSnapKey;
                if (str != null ? !str.equals(mediaFetchInfoRecord.adSnapKey()) : mediaFetchInfoRecord.adSnapKey() != null) {
                    if (this.mediaUrl.equals(mediaFetchInfoRecord.mediaUrl())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.adSnapKey;
        return this.mediaUrl.hashCode() ^ ((i ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MediaFetchInfoRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", adSnapKey=");
        stringBuilder.append(this.adSnapKey);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

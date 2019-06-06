package com.snap.core.db.record;

import com.snap.core.db.record.PublisherSnapPageRecord.PageMediaInfoRecord;

final class AutoValue_PublisherSnapPageRecord_PageMediaInfoRecord extends PageMediaInfoRecord {
    private final long _id;
    private final String url;

    AutoValue_PublisherSnapPageRecord_PageMediaInfoRecord(long j, String str) {
        this._id = j;
        this.url = str;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PageMediaInfoRecord) {
            PageMediaInfoRecord pageMediaInfoRecord = (PageMediaInfoRecord) obj;
            if (this._id == pageMediaInfoRecord._id()) {
                String str = this.url;
                return str != null ? !str.equals(pageMediaInfoRecord.url()) : pageMediaInfoRecord.url() != null;
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.url;
        return (str == null ? 0 : str.hashCode()) ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PageMediaInfoRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String url() {
        return this.url;
    }
}

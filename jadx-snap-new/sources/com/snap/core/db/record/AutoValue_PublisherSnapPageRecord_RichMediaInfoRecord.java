package com.snap.core.db.record;

import com.snap.core.db.record.PublisherSnapPageRecord.RichMediaInfoRecord;

final class AutoValue_PublisherSnapPageRecord_RichMediaInfoRecord extends RichMediaInfoRecord {
    private final boolean isAutoAdvance;
    private final boolean isSkippable;
    private final boolean shareable;
    private final String slugType;
    private final String swipeUpKey;

    AutoValue_PublisherSnapPageRecord_RichMediaInfoRecord(String str, boolean z, boolean z2, boolean z3, String str2) {
        this.swipeUpKey = str;
        this.shareable = z;
        this.isAutoAdvance = z2;
        this.isSkippable = z3;
        this.slugType = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RichMediaInfoRecord) {
            RichMediaInfoRecord richMediaInfoRecord = (RichMediaInfoRecord) obj;
            String str = this.swipeUpKey;
            if (str != null ? !str.equals(richMediaInfoRecord.swipeUpKey()) : richMediaInfoRecord.swipeUpKey() != null) {
                if (this.shareable == richMediaInfoRecord.shareable() && this.isAutoAdvance == richMediaInfoRecord.isAutoAdvance() && this.isSkippable == richMediaInfoRecord.isSkippable()) {
                    str = this.slugType;
                    return str != null ? !str.equals(richMediaInfoRecord.slugType()) : richMediaInfoRecord.slugType() != null;
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.swipeUpKey;
        int i = 0;
        int i2 = 1231;
        int hashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (this.shareable ? 1231 : 1237)) * 1000003) ^ (this.isAutoAdvance ? 1231 : 1237)) * 1000003;
        if (!this.isSkippable) {
            i2 = 1237;
        }
        hashCode = (hashCode ^ i2) * 1000003;
        String str2 = this.slugType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isAutoAdvance() {
        return this.isAutoAdvance;
    }

    public final boolean isSkippable() {
        return this.isSkippable;
    }

    public final boolean shareable() {
        return this.shareable;
    }

    public final String slugType() {
        return this.slugType;
    }

    public final String swipeUpKey() {
        return this.swipeUpKey;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RichMediaInfoRecord{swipeUpKey=");
        stringBuilder.append(this.swipeUpKey);
        stringBuilder.append(", shareable=");
        stringBuilder.append(this.shareable);
        stringBuilder.append(", isAutoAdvance=");
        stringBuilder.append(this.isAutoAdvance);
        stringBuilder.append(", isSkippable=");
        stringBuilder.append(this.isSkippable);
        stringBuilder.append(", slugType=");
        stringBuilder.append(this.slugType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.record;

final class AutoValue_ContactRecord extends ContactRecord {
    private final long _id;
    private final boolean added;
    private final String displayName;
    private final Long friendRowId;
    private final boolean isSnapchatter;
    private final Long lastModifiedTimestamp;
    private final String phone;

    AutoValue_ContactRecord(long j, Long l, String str, String str2, Long l2, boolean z, boolean z2) {
        this._id = j;
        this.friendRowId = l;
        this.displayName = str;
        if (str2 != null) {
            this.phone = str2;
            this.lastModifiedTimestamp = l2;
            this.isSnapchatter = z;
            this.added = z2;
            return;
        }
        throw new NullPointerException("Null phone");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean added() {
        return this.added;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ContactRecord) {
            ContactRecord contactRecord = (ContactRecord) obj;
            if (this._id == contactRecord._id()) {
                Long l = this.friendRowId;
                if (l != null ? !l.equals(contactRecord.friendRowId()) : contactRecord.friendRowId() != null) {
                    String str = this.displayName;
                    if (str != null ? !str.equals(contactRecord.displayName()) : contactRecord.displayName() != null) {
                        if (this.phone.equals(contactRecord.phone())) {
                            l = this.lastModifiedTimestamp;
                            if (l != null ? !l.equals(contactRecord.lastModifiedTimestamp()) : contactRecord.lastModifiedTimestamp() != null) {
                                return this.isSnapchatter == contactRecord.isSnapchatter() && this.added == contactRecord.added();
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this.friendRowId;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.displayName;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.phone.hashCode()) * 1000003;
        l = this.lastModifiedTimestamp;
        if (l != null) {
            i2 = l.hashCode();
        }
        i = (i ^ i2) * 1000003;
        i2 = 1231;
        i = (i ^ (this.isSnapchatter ? 1231 : 1237)) * 1000003;
        if (!this.added) {
            i2 = 1237;
        }
        return i ^ i2;
    }

    public final boolean isSnapchatter() {
        return this.isSnapchatter;
    }

    public final Long lastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    public final String phone() {
        return this.phone;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContactRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", phone=");
        stringBuilder.append(this.phone);
        stringBuilder.append(", lastModifiedTimestamp=");
        stringBuilder.append(this.lastModifiedTimestamp);
        stringBuilder.append(", isSnapchatter=");
        stringBuilder.append(this.isSnapchatter);
        stringBuilder.append(", added=");
        stringBuilder.append(this.added);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

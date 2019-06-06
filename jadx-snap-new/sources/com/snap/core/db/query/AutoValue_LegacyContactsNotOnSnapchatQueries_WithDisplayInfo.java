package com.snap.core.db.query;

import com.snap.core.db.query.LegacyContactsNotOnSnapchatQueries.WithDisplayInfo;

final class AutoValue_LegacyContactsNotOnSnapchatQueries_WithDisplayInfo extends WithDisplayInfo {
    private final long _id;
    private final String displayName;
    private final String phone;

    AutoValue_LegacyContactsNotOnSnapchatQueries_WithDisplayInfo(long j, String str, String str2) {
        this._id = j;
        this.displayName = str;
        if (str2 != null) {
            this.phone = str2;
            return;
        }
        throw new NullPointerException("Null phone");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WithDisplayInfo) {
            WithDisplayInfo withDisplayInfo = (WithDisplayInfo) obj;
            if (this._id == withDisplayInfo._id()) {
                String str = this.displayName;
                if (str != null ? !str.equals(withDisplayInfo.displayName()) : withDisplayInfo.displayName() != null) {
                    if (this.phone.equals(withDisplayInfo.phone())) {
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
        String str = this.displayName;
        return this.phone.hashCode() ^ ((i ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public final String phone() {
        return this.phone;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("WithDisplayInfo{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", phone=");
        stringBuilder.append(this.phone);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.query;

import com.snap.core.db.query.LegacyFriendsFeedQueries.NonFailed;

final class AutoValue_LegacyFriendsFeedQueries_NonFailed extends NonFailed {
    private final long _id;
    private final String displayInteractionType;
    private final String key;

    AutoValue_LegacyFriendsFeedQueries_NonFailed(long j, String str, String str2) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.displayInteractionType = str2;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayInteractionType() {
        return this.displayInteractionType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NonFailed) {
            NonFailed nonFailed = (NonFailed) obj;
            if (this._id == nonFailed._id() && this.key.equals(nonFailed.key())) {
                String str = this.displayInteractionType;
                return str != null ? !str.equals(nonFailed.displayInteractionType()) : nonFailed.displayInteractionType() != null;
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.displayInteractionType;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public final String key() {
        return this.key;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NonFailed{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", displayInteractionType=");
        stringBuilder.append(this.displayInteractionType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

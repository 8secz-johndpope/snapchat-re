package com.snap.core.db.record;

import com.snap.core.db.column.CardType;

final class AutoValue_StorySubscriptionRecord extends StorySubscriptionRecord {
    private final long _id;
    private final long addedTimestampMs;
    private final CardType cardType;
    private final Boolean isNotifOptedIn;
    private final Boolean isSubscribed;
    private final String storyId;

    AutoValue_StorySubscriptionRecord(long j, String str, Boolean bool, CardType cardType, long j2, Boolean bool2) {
        this._id = j;
        if (str != null) {
            this.storyId = str;
            this.isSubscribed = bool;
            if (cardType != null) {
                this.cardType = cardType;
                this.addedTimestampMs = j2;
                this.isNotifOptedIn = bool2;
                return;
            }
            throw new NullPointerException("Null cardType");
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final long addedTimestampMs() {
        return this.addedTimestampMs;
    }

    public final CardType cardType() {
        return this.cardType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorySubscriptionRecord) {
            StorySubscriptionRecord storySubscriptionRecord = (StorySubscriptionRecord) obj;
            if (this._id == storySubscriptionRecord._id() && this.storyId.equals(storySubscriptionRecord.storyId())) {
                Boolean bool = this.isSubscribed;
                if (bool != null ? !bool.equals(storySubscriptionRecord.isSubscribed()) : storySubscriptionRecord.isSubscribed() != null) {
                    if (this.cardType.equals(storySubscriptionRecord.cardType()) && this.addedTimestampMs == storySubscriptionRecord.addedTimestampMs()) {
                        bool = this.isNotifOptedIn;
                        return bool != null ? !bool.equals(storySubscriptionRecord.isNotifOptedIn()) : storySubscriptionRecord.isNotifOptedIn() != null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        Boolean bool = this.isSubscribed;
        int i = 0;
        hashCode = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.cardType.hashCode()) * 1000003;
        long j2 = this.addedTimestampMs;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Boolean bool2 = this.isNotifOptedIn;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isNotifOptedIn() {
        return this.isNotifOptedIn;
    }

    public final Boolean isSubscribed() {
        return this.isSubscribed;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySubscriptionRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", isSubscribed=");
        stringBuilder.append(this.isSubscribed);
        stringBuilder.append(", cardType=");
        stringBuilder.append(this.cardType);
        stringBuilder.append(", addedTimestampMs=");
        stringBuilder.append(this.addedTimestampMs);
        stringBuilder.append(", isNotifOptedIn=");
        stringBuilder.append(this.isNotifOptedIn);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapRecord.BrandFriendliness;

final class AutoValue_StorySnapRecord_BrandFriendliness extends BrandFriendliness {
    private final Integer brandFriendliness;
    private final String snapId;
    private final String storyId;

    AutoValue_StorySnapRecord_BrandFriendliness(String str, String str2, Integer num) {
        if (str != null) {
            this.storyId = str;
            if (str2 != null) {
                this.snapId = str2;
                this.brandFriendliness = num;
                return;
            }
            throw new NullPointerException("Null snapId");
        }
        throw new NullPointerException("Null storyId");
    }

    public final Integer brandFriendliness() {
        return this.brandFriendliness;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BrandFriendliness) {
            BrandFriendliness brandFriendliness = (BrandFriendliness) obj;
            if (this.storyId.equals(brandFriendliness.storyId()) && this.snapId.equals(brandFriendliness.snapId())) {
                Integer num = this.brandFriendliness;
                return num != null ? !num.equals(brandFriendliness.brandFriendliness()) : brandFriendliness.brandFriendliness() != null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.storyId.hashCode() ^ 1000003) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        Integer num = this.brandFriendliness;
        return hashCode ^ (num == null ? 0 : num.hashCode());
    }

    public final String snapId() {
        return this.snapId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BrandFriendliness{storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", brandFriendliness=");
        stringBuilder.append(this.brandFriendliness);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

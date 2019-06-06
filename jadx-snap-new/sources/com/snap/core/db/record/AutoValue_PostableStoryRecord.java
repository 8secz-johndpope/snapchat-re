package com.snap.core.db.record;

import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.PrivacyType;
import com.snapchat.soju.android.Geofence;

final class AutoValue_PostableStoryRecord extends PostableStoryRecord {
    private final long _id;
    private final Long creationTimestamp;
    private final String customTitle;
    private final Geofence geofence;
    private final GroupStoryRankType groupStoryRankType;
    private final Boolean hasActiveStory;
    private final Boolean isSpectaclesStory;
    private final Long lastActionTimestamp;
    private final Long mostRecentPostTimestamp;
    private final PrivacyType myStoryPrivacyOverride;
    private final String storyId;
    private final Long storyRowId;
    private final String subtext;
    private final Long thirdPartyAppStoryTtl;
    private final String thumbnailUrl;

    AutoValue_PostableStoryRecord(long j, String str, Long l, String str2, Boolean bool, Geofence geofence, GroupStoryRankType groupStoryRankType, String str3, Boolean bool2, Long l2, Long l3, Long l4, String str4, PrivacyType privacyType, Long l5) {
        String str5 = str;
        this._id = j;
        if (str5 != null) {
            this.storyId = str5;
            this.storyRowId = l;
            this.subtext = str2;
            this.isSpectaclesStory = bool;
            this.geofence = geofence;
            this.groupStoryRankType = groupStoryRankType;
            this.customTitle = str3;
            this.hasActiveStory = bool2;
            this.lastActionTimestamp = l2;
            this.mostRecentPostTimestamp = l3;
            this.creationTimestamp = l4;
            this.thumbnailUrl = str4;
            this.myStoryPrivacyOverride = privacyType;
            this.thirdPartyAppStoryTtl = l5;
            return;
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final Long creationTimestamp() {
        return this.creationTimestamp;
    }

    public final String customTitle() {
        return this.customTitle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PostableStoryRecord) {
            PostableStoryRecord postableStoryRecord = (PostableStoryRecord) obj;
            if (this._id == postableStoryRecord._id() && this.storyId.equals(postableStoryRecord.storyId())) {
                Long l = this.storyRowId;
                if (l != null ? !l.equals(postableStoryRecord.storyRowId()) : postableStoryRecord.storyRowId() != null) {
                    String str = this.subtext;
                    if (str != null ? !str.equals(postableStoryRecord.subtext()) : postableStoryRecord.subtext() != null) {
                        Boolean bool = this.isSpectaclesStory;
                        if (bool != null ? !bool.equals(postableStoryRecord.isSpectaclesStory()) : postableStoryRecord.isSpectaclesStory() != null) {
                            Geofence geofence = this.geofence;
                            if (geofence != null ? !geofence.equals(postableStoryRecord.geofence()) : postableStoryRecord.geofence() != null) {
                                GroupStoryRankType groupStoryRankType = this.groupStoryRankType;
                                if (groupStoryRankType != null ? !groupStoryRankType.equals(postableStoryRecord.groupStoryRankType()) : postableStoryRecord.groupStoryRankType() != null) {
                                    str = this.customTitle;
                                    if (str != null ? !str.equals(postableStoryRecord.customTitle()) : postableStoryRecord.customTitle() != null) {
                                        bool = this.hasActiveStory;
                                        if (bool != null ? !bool.equals(postableStoryRecord.hasActiveStory()) : postableStoryRecord.hasActiveStory() != null) {
                                            l = this.lastActionTimestamp;
                                            if (l != null ? !l.equals(postableStoryRecord.lastActionTimestamp()) : postableStoryRecord.lastActionTimestamp() != null) {
                                                l = this.mostRecentPostTimestamp;
                                                if (l != null ? !l.equals(postableStoryRecord.mostRecentPostTimestamp()) : postableStoryRecord.mostRecentPostTimestamp() != null) {
                                                    l = this.creationTimestamp;
                                                    if (l != null ? !l.equals(postableStoryRecord.creationTimestamp()) : postableStoryRecord.creationTimestamp() != null) {
                                                        str = this.thumbnailUrl;
                                                        if (str != null ? !str.equals(postableStoryRecord.thumbnailUrl()) : postableStoryRecord.thumbnailUrl() != null) {
                                                            PrivacyType privacyType = this.myStoryPrivacyOverride;
                                                            if (privacyType != null ? !privacyType.equals(postableStoryRecord.myStoryPrivacyOverride()) : postableStoryRecord.myStoryPrivacyOverride() != null) {
                                                                l = this.thirdPartyAppStoryTtl;
                                                                return l != null ? !l.equals(postableStoryRecord.thirdPartyAppStoryTtl()) : postableStoryRecord.thirdPartyAppStoryTtl() != null;
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

    public final Geofence geofence() {
        return this.geofence;
    }

    public final GroupStoryRankType groupStoryRankType() {
        return this.groupStoryRankType;
    }

    public final Boolean hasActiveStory() {
        return this.hasActiveStory;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        Long l = this.storyRowId;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.subtext;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.isSpectaclesStory;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Geofence geofence = this.geofence;
        hashCode = (hashCode ^ (geofence == null ? 0 : geofence.hashCode())) * 1000003;
        GroupStoryRankType groupStoryRankType = this.groupStoryRankType;
        hashCode = (hashCode ^ (groupStoryRankType == null ? 0 : groupStoryRankType.hashCode())) * 1000003;
        str = this.customTitle;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.hasActiveStory;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.lastActionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.mostRecentPostTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.creationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.thumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        PrivacyType privacyType = this.myStoryPrivacyOverride;
        hashCode = (hashCode ^ (privacyType == null ? 0 : privacyType.hashCode())) * 1000003;
        Long l2 = this.thirdPartyAppStoryTtl;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isSpectaclesStory() {
        return this.isSpectaclesStory;
    }

    public final Long lastActionTimestamp() {
        return this.lastActionTimestamp;
    }

    public final Long mostRecentPostTimestamp() {
        return this.mostRecentPostTimestamp;
    }

    public final PrivacyType myStoryPrivacyOverride() {
        return this.myStoryPrivacyOverride;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final String subtext() {
        return this.subtext;
    }

    public final Long thirdPartyAppStoryTtl() {
        return this.thirdPartyAppStoryTtl;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PostableStoryRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", subtext=");
        stringBuilder.append(this.subtext);
        stringBuilder.append(", isSpectaclesStory=");
        stringBuilder.append(this.isSpectaclesStory);
        stringBuilder.append(", geofence=");
        stringBuilder.append(this.geofence);
        stringBuilder.append(", groupStoryRankType=");
        stringBuilder.append(this.groupStoryRankType);
        stringBuilder.append(", customTitle=");
        stringBuilder.append(this.customTitle);
        stringBuilder.append(", hasActiveStory=");
        stringBuilder.append(this.hasActiveStory);
        stringBuilder.append(", lastActionTimestamp=");
        stringBuilder.append(this.lastActionTimestamp);
        stringBuilder.append(", mostRecentPostTimestamp=");
        stringBuilder.append(this.mostRecentPostTimestamp);
        stringBuilder.append(", creationTimestamp=");
        stringBuilder.append(this.creationTimestamp);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", myStoryPrivacyOverride=");
        stringBuilder.append(this.myStoryPrivacyOverride);
        stringBuilder.append(", thirdPartyAppStoryTtl=");
        stringBuilder.append(this.thirdPartyAppStoryTtl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

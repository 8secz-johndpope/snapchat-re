package com.snap.core.db.record;

import com.snap.core.db.column.AdType;
import com.snap.core.db.record.PromotedStorySnapRecord.PlayablePromotedSnapRecord;

final class AutoValue_PromotedStorySnapRecord_PlayablePromotedSnapRecord extends PlayablePromotedSnapRecord {
    private final long _id;
    private final String adSnapKey;
    private final AdType adType;
    private final String brandName;
    private final String headline;
    private final Long lastView;
    private final String mediaUrl;
    private final String politicalAdName;
    private final String snapId;
    private final String storyId;
    private final long storyRowId;
    private final long timestamp;

    AutoValue_PromotedStorySnapRecord_PlayablePromotedSnapRecord(long j, String str, long j2, String str2, AdType adType, String str3, String str4, String str5, String str6, String str7, Long l, long j3) {
        this._id = j;
        if (str != null) {
            this.snapId = str;
            this.storyRowId = j2;
            if (str2 != null) {
                this.storyId = str2;
                this.adType = adType;
                this.brandName = str3;
                this.headline = str4;
                this.adSnapKey = str5;
                if (str6 != null) {
                    this.mediaUrl = str6;
                    this.politicalAdName = str7;
                    this.lastView = l;
                    this.timestamp = j3;
                    return;
                }
                throw new NullPointerException("Null mediaUrl");
            }
            throw new NullPointerException("Null storyId");
        }
        throw new NullPointerException("Null snapId");
    }

    public final long _id() {
        return this._id;
    }

    public final String adSnapKey() {
        return this.adSnapKey;
    }

    public final AdType adType() {
        return this.adType;
    }

    public final String brandName() {
        return this.brandName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayablePromotedSnapRecord) {
            PlayablePromotedSnapRecord playablePromotedSnapRecord = (PlayablePromotedSnapRecord) obj;
            if (this._id == playablePromotedSnapRecord._id() && this.snapId.equals(playablePromotedSnapRecord.snapId()) && this.storyRowId == playablePromotedSnapRecord.storyRowId() && this.storyId.equals(playablePromotedSnapRecord.storyId())) {
                AdType adType = this.adType;
                if (adType != null ? !adType.equals(playablePromotedSnapRecord.adType()) : playablePromotedSnapRecord.adType() != null) {
                    String str = this.brandName;
                    if (str != null ? !str.equals(playablePromotedSnapRecord.brandName()) : playablePromotedSnapRecord.brandName() != null) {
                        str = this.headline;
                        if (str != null ? !str.equals(playablePromotedSnapRecord.headline()) : playablePromotedSnapRecord.headline() != null) {
                            str = this.adSnapKey;
                            if (str != null ? !str.equals(playablePromotedSnapRecord.adSnapKey()) : playablePromotedSnapRecord.adSnapKey() != null) {
                                if (this.mediaUrl.equals(playablePromotedSnapRecord.mediaUrl())) {
                                    str = this.politicalAdName;
                                    if (str != null ? !str.equals(playablePromotedSnapRecord.politicalAdName()) : playablePromotedSnapRecord.politicalAdName() != null) {
                                        Long l = this.lastView;
                                        if (l != null ? !l.equals(playablePromotedSnapRecord.lastView()) : playablePromotedSnapRecord.lastView() != null) {
                                            if (this.timestamp == playablePromotedSnapRecord.timestamp()) {
                                                return true;
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
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        long j2 = this.storyRowId;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        AdType adType = this.adType;
        int i = 0;
        hashCode = (hashCode ^ (adType == null ? 0 : adType.hashCode())) * 1000003;
        String str = this.brandName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.headline;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.adSnapKey;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.mediaUrl.hashCode()) * 1000003;
        str = this.politicalAdName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.lastView;
        if (l != null) {
            i = l.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        j2 = this.timestamp;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final String headline() {
        return this.headline;
    }

    public final Long lastView() {
        return this.lastView;
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final String politicalAdName() {
        return this.politicalAdName;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayablePromotedSnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", adType=");
        stringBuilder.append(this.adType);
        stringBuilder.append(", brandName=");
        stringBuilder.append(this.brandName);
        stringBuilder.append(", headline=");
        stringBuilder.append(this.headline);
        stringBuilder.append(", adSnapKey=");
        stringBuilder.append(this.adSnapKey);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", politicalAdName=");
        stringBuilder.append(this.politicalAdName);
        stringBuilder.append(", lastView=");
        stringBuilder.append(this.lastView);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.AdType;
import com.snap.core.db.column.FeatureType;

final class AutoValue_PromotedStorySnapRecord extends PromotedStorySnapRecord {
    private final long _id;
    private final String adSnapKey;
    private final AdType adType;
    private final String brandName;
    private final FeatureType featureType;
    private final String headline;
    private final Long mediaDurationMillis;
    private final String mediaUrl;
    private final String politicalAdName;
    private final String snapId;
    private final String storyId;
    private final long storyRowId;
    private final long timestamp;

    AutoValue_PromotedStorySnapRecord(long j, String str, String str2, long j2, FeatureType featureType, String str3, Long l, String str4, String str5, String str6, AdType adType, long j3, String str7) {
        String str8 = str;
        String str9 = str2;
        FeatureType featureType2 = featureType;
        String str10 = str3;
        this._id = j;
        if (str8 != null) {
            this.snapId = str8;
            if (str9 != null) {
                this.storyId = str9;
                this.storyRowId = j2;
                if (featureType2 != null) {
                    this.featureType = featureType2;
                    if (str10 != null) {
                        this.mediaUrl = str10;
                        this.mediaDurationMillis = l;
                        this.adSnapKey = str4;
                        this.brandName = str5;
                        this.headline = str6;
                        this.adType = adType;
                        this.timestamp = j3;
                        this.politicalAdName = str7;
                        return;
                    }
                    throw new NullPointerException("Null mediaUrl");
                }
                throw new NullPointerException("Null featureType");
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
        if (obj instanceof PromotedStorySnapRecord) {
            PromotedStorySnapRecord promotedStorySnapRecord = (PromotedStorySnapRecord) obj;
            if (this._id == promotedStorySnapRecord._id() && this.snapId.equals(promotedStorySnapRecord.snapId()) && this.storyId.equals(promotedStorySnapRecord.storyId()) && this.storyRowId == promotedStorySnapRecord.storyRowId() && this.featureType.equals(promotedStorySnapRecord.featureType()) && this.mediaUrl.equals(promotedStorySnapRecord.mediaUrl())) {
                Long l = this.mediaDurationMillis;
                if (l != null ? !l.equals(promotedStorySnapRecord.mediaDurationMillis()) : promotedStorySnapRecord.mediaDurationMillis() != null) {
                    String str = this.adSnapKey;
                    if (str != null ? !str.equals(promotedStorySnapRecord.adSnapKey()) : promotedStorySnapRecord.adSnapKey() != null) {
                        str = this.brandName;
                        if (str != null ? !str.equals(promotedStorySnapRecord.brandName()) : promotedStorySnapRecord.brandName() != null) {
                            str = this.headline;
                            if (str != null ? !str.equals(promotedStorySnapRecord.headline()) : promotedStorySnapRecord.headline() != null) {
                                AdType adType = this.adType;
                                if (adType != null ? !adType.equals(promotedStorySnapRecord.adType()) : promotedStorySnapRecord.adType() != null) {
                                    if (this.timestamp == promotedStorySnapRecord.timestamp()) {
                                        str = this.politicalAdName;
                                        return str != null ? !str.equals(promotedStorySnapRecord.politicalAdName()) : promotedStorySnapRecord.politicalAdName() != null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final FeatureType featureType() {
        return this.featureType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.snapId.hashCode()) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        long j2 = this.storyRowId;
        hashCode = (((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.featureType.hashCode()) * 1000003) ^ this.mediaUrl.hashCode()) * 1000003;
        Long l = this.mediaDurationMillis;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.adSnapKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.brandName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.headline;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AdType adType = this.adType;
        hashCode = (hashCode ^ (adType == null ? 0 : adType.hashCode())) * 1000003;
        long j3 = this.timestamp;
        hashCode = (hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str2 = this.politicalAdName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String headline() {
        return this.headline;
    }

    public final Long mediaDurationMillis() {
        return this.mediaDurationMillis;
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
        StringBuilder stringBuilder = new StringBuilder("PromotedStorySnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", featureType=");
        stringBuilder.append(this.featureType);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaDurationMillis=");
        stringBuilder.append(this.mediaDurationMillis);
        stringBuilder.append(", adSnapKey=");
        stringBuilder.append(this.adSnapKey);
        stringBuilder.append(", brandName=");
        stringBuilder.append(this.brandName);
        stringBuilder.append(", headline=");
        stringBuilder.append(this.headline);
        stringBuilder.append(", adType=");
        stringBuilder.append(this.adType);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", politicalAdName=");
        stringBuilder.append(this.politicalAdName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.record;

import defpackage.ageb;
import defpackage.agec;
import defpackage.ageh;
import java.util.List;

final class AutoValue_MobStoryMetadataRecord extends MobStoryMetadataRecord {
    private final long _id;
    private final Long createTimestamp;
    private final String creatorDisplayName;
    private final Long creatorFriendRowId;
    private final String creatorUserId;
    private final String creatorUsername;
    private final String displayName;
    private final long storyRowId;
    private final ageb storyType;
    private final String subText;
    private final agec typeExtraData;
    private final List<ageh> usersWithAbilities;

    AutoValue_MobStoryMetadataRecord(long j, long j2, Long l, String str, String str2, String str3, Long l2, String str4, String str5, ageb ageb, agec agec, List<ageh> list) {
        this._id = j;
        this.storyRowId = j2;
        this.creatorFriendRowId = l;
        this.creatorUserId = str;
        this.creatorUsername = str2;
        this.creatorDisplayName = str3;
        this.createTimestamp = l2;
        this.displayName = str4;
        this.subText = str5;
        if (ageb != null) {
            this.storyType = ageb;
            if (agec != null) {
                this.typeExtraData = agec;
                this.usersWithAbilities = list;
                return;
            }
            throw new NullPointerException("Null typeExtraData");
        }
        throw new NullPointerException("Null storyType");
    }

    public final long _id() {
        return this._id;
    }

    public final Long createTimestamp() {
        return this.createTimestamp;
    }

    public final String creatorDisplayName() {
        return this.creatorDisplayName;
    }

    public final Long creatorFriendRowId() {
        return this.creatorFriendRowId;
    }

    public final String creatorUserId() {
        return this.creatorUserId;
    }

    public final String creatorUsername() {
        return this.creatorUsername;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MobStoryMetadataRecord) {
            MobStoryMetadataRecord mobStoryMetadataRecord = (MobStoryMetadataRecord) obj;
            if (this._id == mobStoryMetadataRecord._id() && this.storyRowId == mobStoryMetadataRecord.storyRowId()) {
                Long l = this.creatorFriendRowId;
                if (l != null ? !l.equals(mobStoryMetadataRecord.creatorFriendRowId()) : mobStoryMetadataRecord.creatorFriendRowId() != null) {
                    String str = this.creatorUserId;
                    if (str != null ? !str.equals(mobStoryMetadataRecord.creatorUserId()) : mobStoryMetadataRecord.creatorUserId() != null) {
                        str = this.creatorUsername;
                        if (str != null ? !str.equals(mobStoryMetadataRecord.creatorUsername()) : mobStoryMetadataRecord.creatorUsername() != null) {
                            str = this.creatorDisplayName;
                            if (str != null ? !str.equals(mobStoryMetadataRecord.creatorDisplayName()) : mobStoryMetadataRecord.creatorDisplayName() != null) {
                                l = this.createTimestamp;
                                if (l != null ? !l.equals(mobStoryMetadataRecord.createTimestamp()) : mobStoryMetadataRecord.createTimestamp() != null) {
                                    str = this.displayName;
                                    if (str != null ? !str.equals(mobStoryMetadataRecord.displayName()) : mobStoryMetadataRecord.displayName() != null) {
                                        str = this.subText;
                                        if (str != null ? !str.equals(mobStoryMetadataRecord.subText()) : mobStoryMetadataRecord.subText() != null) {
                                            if (this.storyType.equals(mobStoryMetadataRecord.storyType()) && this.typeExtraData.equals(mobStoryMetadataRecord.typeExtraData())) {
                                                List list = this.usersWithAbilities;
                                                return list != null ? !list.equals(mobStoryMetadataRecord.usersWithAbilities()) : mobStoryMetadataRecord.usersWithAbilities() != null;
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

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.storyRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.creatorFriendRowId;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.creatorUserId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.creatorUsername;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.creatorDisplayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.createTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.displayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.subText;
        i = (((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.storyType.hashCode()) * 1000003) ^ this.typeExtraData.hashCode()) * 1000003;
        List list = this.usersWithAbilities;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i ^ i2;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final ageb storyType() {
        return this.storyType;
    }

    public final String subText() {
        return this.subText;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MobStoryMetadataRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", creatorFriendRowId=");
        stringBuilder.append(this.creatorFriendRowId);
        stringBuilder.append(", creatorUserId=");
        stringBuilder.append(this.creatorUserId);
        stringBuilder.append(", creatorUsername=");
        stringBuilder.append(this.creatorUsername);
        stringBuilder.append(", creatorDisplayName=");
        stringBuilder.append(this.creatorDisplayName);
        stringBuilder.append(", createTimestamp=");
        stringBuilder.append(this.createTimestamp);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", subText=");
        stringBuilder.append(this.subText);
        stringBuilder.append(", storyType=");
        stringBuilder.append(this.storyType);
        stringBuilder.append(", typeExtraData=");
        stringBuilder.append(this.typeExtraData);
        stringBuilder.append(", usersWithAbilities=");
        stringBuilder.append(this.usersWithAbilities);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final agec typeExtraData() {
        return this.typeExtraData;
    }

    public final List<ageh> usersWithAbilities() {
        return this.usersWithAbilities;
    }
}

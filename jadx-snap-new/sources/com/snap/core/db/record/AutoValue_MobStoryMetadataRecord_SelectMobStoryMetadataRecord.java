package com.snap.core.db.record;

import com.snap.core.db.record.MobStoryMetadataRecord.SelectMobStoryMetadataRecord;
import defpackage.ageb;
import defpackage.agec;
import defpackage.ageh;
import java.util.List;

final class AutoValue_MobStoryMetadataRecord_SelectMobStoryMetadataRecord extends SelectMobStoryMetadataRecord {
    private final long _id;
    private final Long createTimestamp;
    private final String creatorDisplayName;
    private final String creatorUserId;
    private final String creatorUsername;
    private final String displayName;
    private final String storyId;
    private final long storyRowId;
    private final ageb storyType;
    private final String subText;
    private final agec typeExtraData;
    private final List<ageh> usersWithAbilities;

    AutoValue_MobStoryMetadataRecord_SelectMobStoryMetadataRecord(long j, long j2, String str, String str2, String str3, Long l, String str4, String str5, ageb ageb, agec agec, List<ageh> list, String str6) {
        this._id = j;
        this.storyRowId = j2;
        this.creatorUserId = str;
        this.creatorUsername = str2;
        this.creatorDisplayName = str3;
        this.createTimestamp = l;
        this.displayName = str4;
        this.subText = str5;
        if (ageb != null) {
            this.storyType = ageb;
            if (agec != null) {
                this.typeExtraData = agec;
                this.usersWithAbilities = list;
                if (str6 != null) {
                    this.storyId = str6;
                    return;
                }
                throw new NullPointerException("Null storyId");
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
        if (obj instanceof SelectMobStoryMetadataRecord) {
            SelectMobStoryMetadataRecord selectMobStoryMetadataRecord = (SelectMobStoryMetadataRecord) obj;
            if (this._id == selectMobStoryMetadataRecord._id() && this.storyRowId == selectMobStoryMetadataRecord.storyRowId()) {
                String str = this.creatorUserId;
                if (str != null ? !str.equals(selectMobStoryMetadataRecord.creatorUserId()) : selectMobStoryMetadataRecord.creatorUserId() != null) {
                    str = this.creatorUsername;
                    if (str != null ? !str.equals(selectMobStoryMetadataRecord.creatorUsername()) : selectMobStoryMetadataRecord.creatorUsername() != null) {
                        str = this.creatorDisplayName;
                        if (str != null ? !str.equals(selectMobStoryMetadataRecord.creatorDisplayName()) : selectMobStoryMetadataRecord.creatorDisplayName() != null) {
                            Long l = this.createTimestamp;
                            if (l != null ? !l.equals(selectMobStoryMetadataRecord.createTimestamp()) : selectMobStoryMetadataRecord.createTimestamp() != null) {
                                str = this.displayName;
                                if (str != null ? !str.equals(selectMobStoryMetadataRecord.displayName()) : selectMobStoryMetadataRecord.displayName() != null) {
                                    str = this.subText;
                                    if (str != null ? !str.equals(selectMobStoryMetadataRecord.subText()) : selectMobStoryMetadataRecord.subText() != null) {
                                        if (this.storyType.equals(selectMobStoryMetadataRecord.storyType()) && this.typeExtraData.equals(selectMobStoryMetadataRecord.typeExtraData())) {
                                            List list = this.usersWithAbilities;
                                            if (list != null ? !list.equals(selectMobStoryMetadataRecord.usersWithAbilities()) : selectMobStoryMetadataRecord.usersWithAbilities() != null) {
                                                if (this.storyId.equals(selectMobStoryMetadataRecord.storyId())) {
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
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.storyRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.creatorUserId;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.creatorUsername;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.creatorDisplayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.createTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.displayName;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.subText;
        i = (((((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.storyType.hashCode()) * 1000003) ^ this.typeExtraData.hashCode()) * 1000003;
        List list = this.usersWithAbilities;
        if (list != null) {
            i2 = list.hashCode();
        }
        return this.storyId.hashCode() ^ ((i ^ i2) * 1000003);
    }

    public final String storyId() {
        return this.storyId;
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
        StringBuilder stringBuilder = new StringBuilder("SelectMobStoryMetadataRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
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
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
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

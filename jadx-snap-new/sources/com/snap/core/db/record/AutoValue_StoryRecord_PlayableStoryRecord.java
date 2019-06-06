package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StoryRecord.PlayableStoryRecord;
import defpackage.agec;

final class AutoValue_StoryRecord_PlayableStoryRecord extends PlayableStoryRecord {
    private final long _id;
    private final String displayName;
    private final Friendmojis emoji;
    private final Long feedId;
    private final String feedKey;
    private final FeedKind feedKind;
    private final GroupStoryType groupStoryType;
    private final agec groupStoryTypeExtraData;
    private final StoryKind kind;
    private final String storyId;
    private final String username;

    AutoValue_StoryRecord_PlayableStoryRecord(long j, String str, String str2, StoryKind storyKind, GroupStoryType groupStoryType, String str3, Friendmojis friendmojis, Long l, String str4, FeedKind feedKind, agec agec) {
        this._id = j;
        if (str != null) {
            this.storyId = str;
            this.username = str2;
            if (storyKind != null) {
                this.kind = storyKind;
                this.groupStoryType = groupStoryType;
                this.displayName = str3;
                this.emoji = friendmojis;
                this.feedId = l;
                this.feedKey = str4;
                this.feedKind = feedKind;
                this.groupStoryTypeExtraData = agec;
                return;
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null storyId");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final Friendmojis emoji() {
        return this.emoji;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayableStoryRecord) {
            PlayableStoryRecord playableStoryRecord = (PlayableStoryRecord) obj;
            if (this._id == playableStoryRecord._id() && this.storyId.equals(playableStoryRecord.storyId())) {
                String str = this.username;
                if (str != null ? !str.equals(playableStoryRecord.username()) : playableStoryRecord.username() != null) {
                    if (this.kind.equals(playableStoryRecord.kind())) {
                        GroupStoryType groupStoryType = this.groupStoryType;
                        if (groupStoryType != null ? !groupStoryType.equals(playableStoryRecord.groupStoryType()) : playableStoryRecord.groupStoryType() != null) {
                            str = this.displayName;
                            if (str != null ? !str.equals(playableStoryRecord.displayName()) : playableStoryRecord.displayName() != null) {
                                Friendmojis friendmojis = this.emoji;
                                if (friendmojis != null ? !friendmojis.equals(playableStoryRecord.emoji()) : playableStoryRecord.emoji() != null) {
                                    Long l = this.feedId;
                                    if (l != null ? !l.equals(playableStoryRecord.feedId()) : playableStoryRecord.feedId() != null) {
                                        str = this.feedKey;
                                        if (str != null ? !str.equals(playableStoryRecord.feedKey()) : playableStoryRecord.feedKey() != null) {
                                            FeedKind feedKind = this.feedKind;
                                            if (feedKind != null ? !feedKind.equals(playableStoryRecord.feedKind()) : playableStoryRecord.feedKind() != null) {
                                                agec agec = this.groupStoryTypeExtraData;
                                                return agec != null ? !agec.equals(playableStoryRecord.groupStoryTypeExtraData()) : playableStoryRecord.groupStoryTypeExtraData() != null;
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

    public final Long feedId() {
        return this.feedId;
    }

    public final String feedKey() {
        return this.feedKey;
    }

    public final FeedKind feedKind() {
        return this.feedKind;
    }

    public final GroupStoryType groupStoryType() {
        return this.groupStoryType;
    }

    public final agec groupStoryTypeExtraData() {
        return this.groupStoryTypeExtraData;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        String str = this.username;
        int i = 0;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003;
        GroupStoryType groupStoryType = this.groupStoryType;
        hashCode = (hashCode ^ (groupStoryType == null ? 0 : groupStoryType.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Friendmojis friendmojis = this.emoji;
        hashCode = (hashCode ^ (friendmojis == null ? 0 : friendmojis.hashCode())) * 1000003;
        Long l = this.feedId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.feedKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        FeedKind feedKind = this.feedKind;
        hashCode = (hashCode ^ (feedKind == null ? 0 : feedKind.hashCode())) * 1000003;
        agec agec = this.groupStoryTypeExtraData;
        if (agec != null) {
            i = agec.hashCode();
        }
        return hashCode ^ i;
    }

    public final StoryKind kind() {
        return this.kind;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlayableStoryRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", groupStoryType=");
        stringBuilder.append(this.groupStoryType);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", emoji=");
        stringBuilder.append(this.emoji);
        stringBuilder.append(", feedId=");
        stringBuilder.append(this.feedId);
        stringBuilder.append(", feedKey=");
        stringBuilder.append(this.feedKey);
        stringBuilder.append(", feedKind=");
        stringBuilder.append(this.feedKind);
        stringBuilder.append(", groupStoryTypeExtraData=");
        stringBuilder.append(this.groupStoryTypeExtraData);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}

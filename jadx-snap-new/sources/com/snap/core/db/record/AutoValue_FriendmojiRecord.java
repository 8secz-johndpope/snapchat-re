package com.snap.core.db.record;

import com.snap.core.db.column.FriendmojiType;

final class AutoValue_FriendmojiRecord extends FriendmojiRecord {
    private final long _id;
    private final String category;
    private final String description;
    private final String emoji;
    private final FriendmojiType friendmojiType;
    private final String pickerDescription;
    private final Long rank;
    private final String title;

    AutoValue_FriendmojiRecord(long j, String str, String str2, Long l, String str3, String str4, String str5, FriendmojiType friendmojiType) {
        this._id = j;
        if (str != null) {
            this.category = str;
            this.emoji = str2;
            this.rank = l;
            this.title = str3;
            this.description = str4;
            this.pickerDescription = str5;
            this.friendmojiType = friendmojiType;
            return;
        }
        throw new NullPointerException("Null category");
    }

    public final long _id() {
        return this._id;
    }

    public final String category() {
        return this.category;
    }

    public final String description() {
        return this.description;
    }

    public final String emoji() {
        return this.emoji;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendmojiRecord) {
            FriendmojiRecord friendmojiRecord = (FriendmojiRecord) obj;
            if (this._id == friendmojiRecord._id() && this.category.equals(friendmojiRecord.category())) {
                String str = this.emoji;
                if (str != null ? !str.equals(friendmojiRecord.emoji()) : friendmojiRecord.emoji() != null) {
                    Long l = this.rank;
                    if (l != null ? !l.equals(friendmojiRecord.rank()) : friendmojiRecord.rank() != null) {
                        str = this.title;
                        if (str != null ? !str.equals(friendmojiRecord.title()) : friendmojiRecord.title() != null) {
                            str = this.description;
                            if (str != null ? !str.equals(friendmojiRecord.description()) : friendmojiRecord.description() != null) {
                                str = this.pickerDescription;
                                if (str != null ? !str.equals(friendmojiRecord.pickerDescription()) : friendmojiRecord.pickerDescription() != null) {
                                    FriendmojiType friendmojiType = this.friendmojiType;
                                    return friendmojiType != null ? !friendmojiType.equals(friendmojiRecord.friendmojiType()) : friendmojiRecord.friendmojiType() != null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final FriendmojiType friendmojiType() {
        return this.friendmojiType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.category.hashCode()) * 1000003;
        String str = this.emoji;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.rank;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.title;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.description;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.pickerDescription;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        FriendmojiType friendmojiType = this.friendmojiType;
        if (friendmojiType != null) {
            i = friendmojiType.hashCode();
        }
        return hashCode ^ i;
    }

    public final String pickerDescription() {
        return this.pickerDescription;
    }

    public final Long rank() {
        return this.rank;
    }

    public final String title() {
        return this.title;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendmojiRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", category=");
        stringBuilder.append(this.category);
        stringBuilder.append(", emoji=");
        stringBuilder.append(this.emoji);
        stringBuilder.append(", rank=");
        stringBuilder.append(this.rank);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", pickerDescription=");
        stringBuilder.append(this.pickerDescription);
        stringBuilder.append(", friendmojiType=");
        stringBuilder.append(this.friendmojiType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

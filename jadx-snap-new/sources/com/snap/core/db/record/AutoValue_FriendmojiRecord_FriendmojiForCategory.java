package com.snap.core.db.record;

import com.snap.core.db.column.FriendmojiType;
import com.snap.core.db.record.FriendmojiRecord.FriendmojiForCategory;

final class AutoValue_FriendmojiRecord_FriendmojiForCategory extends FriendmojiForCategory {
    private final String description;
    private final String emoji;
    private final FriendmojiType friendmojiType;
    private final Long rank;
    private final String title;

    AutoValue_FriendmojiRecord_FriendmojiForCategory(String str, Long l, FriendmojiType friendmojiType, String str2, String str3) {
        this.emoji = str;
        this.rank = l;
        this.friendmojiType = friendmojiType;
        this.title = str2;
        this.description = str3;
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
        if (obj instanceof FriendmojiForCategory) {
            FriendmojiForCategory friendmojiForCategory = (FriendmojiForCategory) obj;
            String str = this.emoji;
            if (str != null ? !str.equals(friendmojiForCategory.emoji()) : friendmojiForCategory.emoji() != null) {
                Long l = this.rank;
                if (l != null ? !l.equals(friendmojiForCategory.rank()) : friendmojiForCategory.rank() != null) {
                    FriendmojiType friendmojiType = this.friendmojiType;
                    if (friendmojiType != null ? !friendmojiType.equals(friendmojiForCategory.friendmojiType()) : friendmojiForCategory.friendmojiType() != null) {
                        str = this.title;
                        if (str != null ? !str.equals(friendmojiForCategory.title()) : friendmojiForCategory.title() != null) {
                            str = this.description;
                            return str != null ? !str.equals(friendmojiForCategory.description()) : friendmojiForCategory.description() != null;
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
        String str = this.emoji;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Long l = this.rank;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        FriendmojiType friendmojiType = this.friendmojiType;
        hashCode = (hashCode ^ (friendmojiType == null ? 0 : friendmojiType.hashCode())) * 1000003;
        String str2 = this.title;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.description;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long rank() {
        return this.rank;
    }

    public final String title() {
        return this.title;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendmojiForCategory{emoji=");
        stringBuilder.append(this.emoji);
        stringBuilder.append(", rank=");
        stringBuilder.append(this.rank);
        stringBuilder.append(", friendmojiType=");
        stringBuilder.append(this.friendmojiType);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", description=");
        stringBuilder.append(this.description);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

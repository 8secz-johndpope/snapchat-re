package com.snap.core.db.record;

import com.snap.core.db.record.FriendmojiRecord.FriendmojiForType;

final class AutoValue_FriendmojiRecord_FriendmojiForType extends FriendmojiForType {
    private final String category;
    private final String description;
    private final String emoji;
    private final String pickerDescription;
    private final Long rank;
    private final String title;

    AutoValue_FriendmojiRecord_FriendmojiForType(String str, String str2, Long l, String str3, String str4, String str5) {
        if (str != null) {
            this.category = str;
            this.emoji = str2;
            this.rank = l;
            this.title = str3;
            this.description = str4;
            this.pickerDescription = str5;
            return;
        }
        throw new NullPointerException("Null category");
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
        if (obj instanceof FriendmojiForType) {
            FriendmojiForType friendmojiForType = (FriendmojiForType) obj;
            if (this.category.equals(friendmojiForType.category())) {
                String str = this.emoji;
                if (str != null ? !str.equals(friendmojiForType.emoji()) : friendmojiForType.emoji() != null) {
                    Long l = this.rank;
                    if (l != null ? !l.equals(friendmojiForType.rank()) : friendmojiForType.rank() != null) {
                        str = this.title;
                        if (str != null ? !str.equals(friendmojiForType.title()) : friendmojiForType.title() != null) {
                            str = this.description;
                            if (str != null ? !str.equals(friendmojiForType.description()) : friendmojiForType.description() != null) {
                                str = this.pickerDescription;
                                return str != null ? !str.equals(friendmojiForType.pickerDescription()) : friendmojiForType.pickerDescription() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.category.hashCode() ^ 1000003) * 1000003;
        String str = this.emoji;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.rank;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.title;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.description;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.pickerDescription;
        if (str2 != null) {
            i = str2.hashCode();
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
        StringBuilder stringBuilder = new StringBuilder("FriendmojiForType{category=");
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
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.record;

import com.snap.core.db.record.FriendmojiRecord.FriendmojiDict;

final class AutoValue_FriendmojiRecord_FriendmojiDict extends FriendmojiDict {
    private final String category;
    private final String emoji;
    private final String title;

    AutoValue_FriendmojiRecord_FriendmojiDict(String str, String str2, String str3) {
        this.emoji = str;
        if (str2 != null) {
            this.category = str2;
            this.title = str3;
            return;
        }
        throw new NullPointerException("Null category");
    }

    public final String category() {
        return this.category;
    }

    public final String emoji() {
        return this.emoji;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendmojiDict) {
            FriendmojiDict friendmojiDict = (FriendmojiDict) obj;
            String str = this.emoji;
            if (str != null ? !str.equals(friendmojiDict.emoji()) : friendmojiDict.emoji() != null) {
                if (this.category.equals(friendmojiDict.category())) {
                    str = this.title;
                    return str != null ? !str.equals(friendmojiDict.title()) : friendmojiDict.title() != null;
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.emoji;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.category.hashCode()) * 1000003;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String title() {
        return this.title;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendmojiDict{emoji=");
        stringBuilder.append(this.emoji);
        stringBuilder.append(", category=");
        stringBuilder.append(this.category);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

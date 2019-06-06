package com.snap.core.db.column;

import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class Friendmojis$baseFriendmojis$1 extends akcs implements akbl<FriendmojiCategory, String> {
    public static final Friendmojis$baseFriendmojis$1 INSTANCE = new Friendmojis$baseFriendmojis$1();

    Friendmojis$baseFriendmojis$1() {
        super(1);
    }

    public final String invoke(FriendmojiCategory friendmojiCategory) {
        akcr.b(friendmojiCategory, "category");
        return friendmojiCategory.getEmoji();
    }
}

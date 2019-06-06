package com.snap.core.db.column;

import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.FriendmojiModel;
import defpackage.aemr;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akgb;

public enum FriendmojiCategory {
    BIRTHDAY("🎂", FriendModel.BIRTHDAY),
    STREAK("🔥", "on_fire"),
    MUTUAL_BFS("😎", "you_share_BF"),
    MUTUAL_BESTIES("😁", "your_number_one_bf_is_their_number_one_bf"),
    THEIR_BF_BUT("😏", "you_are_one_of_there_bf_but_they_are_not_your"),
    BFS("😊", "one_of_your_bf"),
    BESTIES("💛", "number_one_bf"),
    BFF("❤️", "number_one_bf_for_two_weeks"),
    SUPER_BFF("💕", "number_one_bf_for_two_months"),
    SNAP_BOT("🤖", OFFICIAL_STORIES_FRIENDMOJI_PREFIX),
    GHOST("👻", "ghost"),
    GROUP("✨", "group"),
    UNRECOGNIZED(r2, r2);
    
    public static final Companion Companion = null;
    public static final String OFFICIAL_STORIES_FRIENDMOJI_PREFIX = "official_story";
    private final String category;
    private final String emoji;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final FriendmojiCategory from(aemr aemr) {
            akcr.b(aemr, "sojufriendmoji");
            String str = aemr.a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1329484604:
                        if (str.equals("you_share_BF")) {
                            return FriendmojiCategory.MUTUAL_BFS;
                        }
                        break;
                    case -1326222186:
                        if (str.equals("on_fire")) {
                            return FriendmojiCategory.STREAK;
                        }
                        break;
                    case -1133742454:
                        if (str.equals("number_one_bf_for_two_weeks")) {
                            return FriendmojiCategory.BFF;
                        }
                        break;
                    case -1063057464:
                        if (str.equals("number_one_bf_for_two_months")) {
                            return FriendmojiCategory.SUPER_BFF;
                        }
                        break;
                    case -419306093:
                        if (str.equals("snap_streak")) {
                            return FriendmojiCategory.STREAK;
                        }
                        break;
                    case 65818599:
                        if (str.equals("you_are_one_of_there_bf_but_they_are_not_your")) {
                            return FriendmojiCategory.THEIR_BF_BUT;
                        }
                        break;
                    case 98331279:
                        if (str.equals("ghost")) {
                            return FriendmojiCategory.GHOST;
                        }
                        break;
                    case 100247777:
                        if (str.equals("one_of_your_bf")) {
                            return FriendmojiCategory.BFS;
                        }
                        break;
                    case 274198131:
                        if (str.equals("number_one_bf")) {
                            return FriendmojiCategory.BESTIES;
                        }
                        break;
                    case 2134086033:
                        if (str.equals("your_number_one_bf_is_their_number_one_bf")) {
                            return FriendmojiCategory.MUTUAL_BESTIES;
                        }
                        break;
                }
            }
            Object obj = aemr.a;
            akcr.a(obj, "sojufriendmoji.categoryName");
            return akgb.b(obj, FriendmojiCategory.OFFICIAL_STORIES_FRIENDMOJI_PREFIX, false) ? FriendmojiCategory.SNAP_BOT : FriendmojiCategory.UNRECOGNIZED;
        }

        public final boolean isCategoryNameOfficialStory(String str) {
            akcr.b(str, "categoryName");
            return akgb.b(str, FriendmojiCategory.OFFICIAL_STORIES_FRIENDMOJI_PREFIX, false);
        }

        public final boolean isSojuFriendmojiOfficialStory(aemr aemr) {
            akcr.b(aemr, "sojuFriendmoji");
            Companion companion = this;
            Object obj = aemr.a;
            akcr.a(obj, "sojuFriendmoji.categoryName");
            return companion.isCategoryNameOfficialStory(obj);
        }
    }

    static {
        Companion = new Companion();
    }

    protected FriendmojiCategory(String str, String str2) {
        akcr.b(str, FriendmojiModel.EMOJI);
        akcr.b(str2, "category");
        this.emoji = str;
        this.category = str2;
    }

    public static final FriendmojiCategory from(aemr aemr) {
        return Companion.from(aemr);
    }

    public static final boolean isCategoryNameOfficialStory(String str) {
        return Companion.isCategoryNameOfficialStory(str);
    }

    public static final boolean isSojuFriendmojiOfficialStory(aemr aemr) {
        return Companion.isSojuFriendmojiOfficialStory(aemr);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getEmoji() {
        return this.emoji;
    }
}

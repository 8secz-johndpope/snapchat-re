package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.ContactModel;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.FriendWhoAddedMeModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import com.snap.core.db.record.SuggestedFriendModel;
import com.snap.core.db.record.SuggestedFriendPlacementModel;
import com.snap.core.db.record.TopSuggestedFriendModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface AddFriendsSearchModel {

    public static final class Factory<T1 extends SuggestedFriendPlacementModel> {
        com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<T1> suggestedFriendPlacementModelFactory;

        final class SelectAddFriendsSearchQuery extends ainx {
            private final com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> suggestedFriendPlacementModelFactory;
            private final FriendSuggestionPlacement suggestionPlacement;

            SelectAddFriendsSearchQuery(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
                super("SELECT\n    DISTINCT Friend._id,\n    Friend.username,\n    Friend.userId,\n    Friend.displayName,\n    Friend.bitmojiSelfieId,\n    Friend.bitmojiAvatarId,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    addedMeInfo.added AS addedMe_isAdded,\n    addedMeInfo.ignored AS isIgnored,\n    addedMeInfo.addSource AS addSource,\n    suggestedInfo.added AS suggested_isAdded,\n    suggestedInfo.hidden AS isHidden,\n    suggestedInfo.suggestionReason AS suggestionReason,\n    suggestedInfo.suggestionToken AS suggestionToken,\n    Contact.added AS contact_isAdded,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    addedMeInfo.hasViewed AS friendRequestViewed\nFROM\nFriend\n-- AddedMe\nLEFT OUTER JOIN FriendWhoAddedMe AS addedMeInfo ON Friend._id = addedMeInfo.friendRowId\n-- Suggested\nLEFT OUTER JOIN SuggestedFriend AS suggestedInfo ON Friend._id = suggestedInfo.friendRowId\nLEFT OUTER JOIN SuggestedFriendPlacement AS placement ON Friend._id = placement.friendRowId\nLEFT OUTER JOIN TopSuggestedFriend AS topSuggested ON placement.suggestionPlacement = topSuggested.suggestionPlacement\n    AND Friend.userId = topSuggested.userId\n-- ContactsOnSnapchat\nLEFT OUTER JOIN Contact ON Friend._id = Contact.friendRowId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON (Story.userName = Friend.username AND Story.kind = 0)\nWHERE\n    (addedMeInfo.ignored = 0 AND Friend.reverseAddedTimestamp > 0 AND Friend.friendLinkType != 2)\n    OR (suggestedInfo.hidden = 0 AND placement.suggestionPlacement = ?1 AND friendLinkType != 2)\n    OR (Contact.isSnapchatter = 1  AND Friend.friendLinkType != 2)\nORDER BY Friend.reverseAddedTimestamp DESC", new aioa(FriendModel.TABLE_NAME, FriendWhoAddedMeModel.TABLE_NAME, SuggestedFriendModel.TABLE_NAME, SuggestedFriendPlacementModel.TABLE_NAME, TopSuggestedFriendModel.TABLE_NAME, ContactModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this.suggestedFriendPlacementModelFactory = factory;
                this.suggestionPlacement = friendSuggestionPlacement;
            }

            public final void bindTo(pc pcVar) {
                FriendSuggestionPlacement friendSuggestionPlacement = this.suggestionPlacement;
                if (friendSuggestionPlacement != null) {
                    pcVar.bindLong(1, ((Long) this.suggestedFriendPlacementModelFactory.suggestionPlacementAdapter.encode(friendSuggestionPlacement)).longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public Factory(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<T1> factory) {
            this.suggestedFriendPlacementModelFactory = factory;
        }

        public final ainx getAllAddedFriendNames() {
            return new ainx("SELECT\n    Friend.username\nFROM Friend\nLEFT OUTER JOIN Feed ON Friend._id = Feed.friendRowId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON Friend.username = Story.storyId\nWHERE (friendLinkType IN (0, 4)\n    OR (friendLinkType IS 1 AND addedTimestamp IS NOT 0))", new aioa(FriendModel.TABLE_NAME, FeedModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
        }

        public final ainw<String> getAllAddedFriendNamesMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx selectAddFriendsSearch(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
            return new SelectAddFriendsSearchQuery(factory, friendSuggestionPlacement);
        }

        public final <R extends SelectAddFriendsSearchModel> SelectAddFriendsSearchMapper<R> selectAddFriendsSearchMapper(SelectAddFriendsSearchCreator<R> selectAddFriendsSearchCreator) {
            return new SelectAddFriendsSearchMapper(selectAddFriendsSearchCreator);
        }
    }

    public interface SelectAddFriendsSearchCreator<T extends SelectAddFriendsSearchModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, Long l, Long l2, Boolean bool, Boolean bool2, String str6, Boolean bool3, Boolean bool4, String str7, String str8, Boolean bool5, Long l3, Boolean bool6, Long l4, Long l5, Boolean bool7);
    }

    public interface SelectAddFriendsSearchModel {
        long _id();

        String addSource();

        Boolean addedMe_isAdded();

        Long addedTimestamp();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        Boolean contact_isAdded();

        String displayName();

        Boolean friendRequestViewed();

        Boolean isHidden();

        Boolean isIgnored();

        Long reverseAddedTimestamp();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Long storyRowId();

        Boolean storyViewed();

        Boolean suggested_isAdded();

        String suggestionReason();

        String suggestionToken();

        String userId();

        String username();
    }

    public static final class SelectAddFriendsSearchMapper<T extends SelectAddFriendsSearchModel> implements ainw<T> {
        private final SelectAddFriendsSearchCreator<T> creator;

        public SelectAddFriendsSearchMapper(SelectAddFriendsSearchCreator<T> selectAddFriendsSearchCreator) {
            this.creator = selectAddFriendsSearchCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            Cursor cursor2 = cursor;
            SelectAddFriendsSearchCreator selectAddFriendsSearchCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            Long valueOf = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            Long valueOf2 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            if (cursor2.isNull(8)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(8) == 1);
            }
            if (cursor2.isNull(9)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            String string6 = cursor2.isNull(10) ? null : cursor2.getString(10);
            if (cursor2.isNull(11)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(11) == 1);
            }
            if (cursor2.isNull(12)) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(cursor2.getInt(12) == 1);
            }
            String string7 = cursor2.isNull(13) ? null : cursor2.getString(13);
            String string8 = cursor2.isNull(14) ? null : cursor2.getString(14);
            if (cursor2.isNull(15)) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(cursor2.getInt(15) == 1);
            }
            Long valueOf3 = cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16));
            if (cursor2.isNull(17)) {
                bool6 = null;
            } else {
                bool6 = Boolean.valueOf(cursor2.getInt(17) == 1);
            }
            Long valueOf4 = cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18));
            Long valueOf5 = cursor2.isNull(19) ? null : Long.valueOf(cursor2.getLong(19));
            if (cursor2.isNull(20)) {
                bool7 = null;
            } else {
                bool7 = Boolean.valueOf(cursor2.getInt(20) == 1);
            }
            return selectAddFriendsSearchCreator.create(j, string, string2, string3, string4, string5, valueOf, valueOf2, bool, bool2, string6, bool3, bool4, string7, string8, bool5, valueOf3, bool6, valueOf4, valueOf5, bool7);
        }
    }
}

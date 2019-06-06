package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import com.snap.core.db.record.SuggestedFriendModel;
import com.snap.core.db.record.SuggestedFriendPlacementModel;
import com.snap.core.db.record.TopSuggestedFriendModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface FriendsFeedSuggestedFriendsModel {

    public interface SelectSuggestedFriendsCreator<T extends SelectSuggestedFriendsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, Long l, Boolean bool3, Long l2, Long l3);
    }

    public static final class Factory<T1 extends SuggestedFriendPlacementModel> {
        com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<T1> suggestedFriendPlacementModelFactory;

        final class SelectSuggestedFriendsQuery extends ainx {
            private final com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> suggestedFriendPlacementModelFactory;
            private final FriendSuggestionPlacement suggestionPlacement;

            SelectSuggestedFriendsQuery(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
                super("SELECT\n    Friend._id,\n    Friend.username,\n    Friend.userId,\n    Friend.displayName,\n    Friend.bitmojiSelfieId,\n    Friend.bitmojiAvatarId,\n    displayInfo.added AS isAdded,\n    displayInfo.hidden AS isHidden,\n    displayInfo.suggestionReason AS suggestionReason,\n    displayInfo.suggestionToken AS suggestionToken,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp\nFROM\nFriend\nLEFT OUTER JOIN SuggestedFriend AS displayInfo ON Friend._id = displayInfo.friendRowId\nLEFT OUTER JOIN SuggestedFriendPlacement AS placement ON Friend._id = placement.friendRowId\nLEFT OUTER JOIN TopSuggestedFriend AS topSuggested ON placement.suggestionPlacement = topSuggested.suggestionPlacement\n    AND Friend.userId = topSuggested.userId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON (Story.userName = Friend.username AND Story.kind = 0)\nWHERE displayInfo.hidden = 0 AND placement.suggestionPlacement = ?1 AND friendLinkType != 2\nORDER BY topSuggested.priority DESC", new aioa(FriendModel.TABLE_NAME, SuggestedFriendModel.TABLE_NAME, SuggestedFriendPlacementModel.TABLE_NAME, TopSuggestedFriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
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

        public final ainx selectSuggestedFriends(com.snap.core.db.record.SuggestedFriendPlacementModel.Factory<? extends SuggestedFriendPlacementModel> factory, FriendSuggestionPlacement friendSuggestionPlacement) {
            return new SelectSuggestedFriendsQuery(factory, friendSuggestionPlacement);
        }

        public final <R extends SelectSuggestedFriendsModel> SelectSuggestedFriendsMapper<R> selectSuggestedFriendsMapper(SelectSuggestedFriendsCreator<R> selectSuggestedFriendsCreator) {
            return new SelectSuggestedFriendsMapper(selectSuggestedFriendsCreator);
        }
    }

    public static final class SelectSuggestedFriendsMapper<T extends SelectSuggestedFriendsModel> implements ainw<T> {
        private final SelectSuggestedFriendsCreator<T> creator;

        public SelectSuggestedFriendsMapper(SelectSuggestedFriendsCreator<T> selectSuggestedFriendsCreator) {
            this.creator = selectSuggestedFriendsCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Cursor cursor2 = cursor;
            SelectSuggestedFriendsCreator selectSuggestedFriendsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            if (cursor2.isNull(6)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(6) == 1);
            }
            if (cursor2.isNull(7)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(7) == 1);
            }
            String string6 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string7 = cursor2.isNull(9) ? null : cursor2.getString(9);
            Long valueOf = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            if (cursor2.isNull(11)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(11) == 1);
            }
            return selectSuggestedFriendsCreator.create(j, string, string2, string3, string4, string5, bool, bool2, string6, string7, valueOf, bool3, cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)), cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13)));
        }
    }

    public interface SelectSuggestedFriendsModel {
        long _id();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        Boolean isAdded();

        Boolean isHidden();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Long storyRowId();

        Boolean storyViewed();

        String suggestionReason();

        String suggestionToken();

        String userId();

        String username();
    }
}

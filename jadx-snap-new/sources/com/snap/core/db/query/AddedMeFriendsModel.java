package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.FriendWhoAddedMeModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StorySnapModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;
import defpackage.pc;

public interface AddedMeFriendsModel {

    public interface SelectAddedMeFriendsCreator<T extends SelectAddedMeFriendsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, Long l, Long l2, boolean z, boolean z2, String str6, Long l3, Boolean bool, Long l4, Long l5, boolean z3);
    }

    public static final class Factory {

        final class GetNewAddedMeFriendCountQuery extends ainx {
            private final Long reverseAddedTimestamp;

            GetNewAddedMeFriendCountQuery(Long l) {
                super("SELECT COUNT(Friend._id)\nFROM Friend\nINNER JOIN FriendWhoAddedMe AS displayInfo ON Friend._id = displayInfo.friendRowId\nWHERE displayInfo.ignored = 0\n    AND Friend.reverseAddedTimestamp > ?1\n    AND Friend.friendLinkType != 2", new aioa(FriendModel.TABLE_NAME, FriendWhoAddedMeModel.TABLE_NAME));
                this.reverseAddedTimestamp = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.reverseAddedTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class GetUnreciprocatedAddedMeAndUnseenAddedMeBackCountQuery extends ainx {
            private final Long reverseAddedTimestamp;

            GetUnreciprocatedAddedMeAndUnseenAddedMeBackCountQuery(Long l) {
                super("SELECT COUNT(Friend._id)\nFROM Friend\nINNER JOIN FriendWhoAddedMe AS displayInfo ON Friend._id = displayInfo.friendRowId\nWHERE\n    (displayInfo.ignored = 0 AND Friend.reverseAddedTimestamp > ?1 AND Friend.friendLinkType = 0)\n    OR\n    (displayInfo.ignored = 0 AND Friend.reverseAddedTimestamp > 0 AND Friend.friendLinkType = 4 AND Friend.addedTimestamp <= 0)\n    OR\n    (displayInfo.ignored = 0 AND Friend.reverseAddedTimestamp > 0 AND Friend.friendLinkType = 1 AND Friend.addedTimestamp <= 0)", new aioa(FriendModel.TABLE_NAME, FriendWhoAddedMeModel.TABLE_NAME));
                this.reverseAddedTimestamp = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.reverseAddedTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class GetUnviewedAddedMeFriendCountQuery extends ainx {
            private final Long reverseAddedTimestamp;

            GetUnviewedAddedMeFriendCountQuery(Long l) {
                super("SELECT COUNT(Friend._id)\nFROM Friend\nINNER JOIN FriendWhoAddedMe AS displayInfo ON Friend._id = displayInfo.friendRowId\nWHERE displayInfo.ignored = 0\n    AND (Friend.reverseAddedTimestamp > ?1 OR displayInfo.hasViewed = 0)\n    AND Friend.friendLinkType != 2", new aioa(FriendModel.TABLE_NAME, FriendWhoAddedMeModel.TABLE_NAME));
                this.reverseAddedTimestamp = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.reverseAddedTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public final ainx getAddedMeChange() {
            return new ainx("SELECT 0 FROM FriendWhoAddedMe", new aioa(FriendWhoAddedMeModel.TABLE_NAME));
        }

        public final ainw<Long> getAddedMeChangeMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getNewAddedMeFriendCount(Long l) {
            return new GetNewAddedMeFriendCountQuery(l);
        }

        public final ainw<Long> getNewAddedMeFriendCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getUnreciprocatedAddedMeAndUnseenAddedMeBackCount(Long l) {
            return new GetUnreciprocatedAddedMeAndUnseenAddedMeBackCountQuery(l);
        }

        public final ainw<Long> getUnreciprocatedAddedMeAndUnseenAddedMeBackCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getUnviewedAddedMeFriendCount(Long l) {
            return new GetUnviewedAddedMeFriendCountQuery(l);
        }

        public final ainw<Long> getUnviewedAddedMeFriendCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectAddedMeFriends() {
            return new ainx("SELECT\n    Friend._id,\n    Friend.username,\n    Friend.userId,\n    Friend.displayName,\n    Friend.bitmojiSelfieId,\n    Friend.bitmojiAvatarId,\n    Friend.addedTimestamp,\n    Friend.reverseAddedTimestamp,\n    displayInfo.added AS isAdded,\n    displayInfo.ignored AS isIgnored,\n    displayInfo.addSource AS addSource,\n    Story.storyRowIdNullable AS storyRowId,\n    Story.viewed AS storyViewed,\n    Story.latestTimeStamp AS storyLatestTimestamp,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp,\n    displayInfo.hasViewed AS hasViewed\nFROM\nFriend\nINNER JOIN FriendWhoAddedMe AS displayInfo ON Friend._id = displayInfo.friendRowId\nLEFT OUTER JOIN StoryViewActiveSnaps AS Story ON (Story.userName = Friend.username AND Story.kind = 0)\nWHERE displayInfo.ignored = 0 AND Friend.reverseAddedTimestamp > 0 AND Friend.friendLinkType != 2\nORDER BY displayInfo.hasViewed ASC, Friend.reverseAddedTimestamp DESC", new aioa(FriendModel.TABLE_NAME, FriendWhoAddedMeModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
        }

        public final <R extends SelectAddedMeFriendsModel> SelectAddedMeFriendsMapper<R> selectAddedMeFriendsMapper(SelectAddedMeFriendsCreator<R> selectAddedMeFriendsCreator) {
            return new SelectAddedMeFriendsMapper(selectAddedMeFriendsCreator);
        }
    }

    public static final class SelectAddedMeFriendsMapper<T extends SelectAddedMeFriendsModel> implements ainw<T> {
        private final SelectAddedMeFriendsCreator<T> creator;

        public SelectAddedMeFriendsMapper(SelectAddedMeFriendsCreator<T> selectAddedMeFriendsCreator) {
            this.creator = selectAddedMeFriendsCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectAddedMeFriendsCreator selectAddedMeFriendsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            String string5 = cursor2.isNull(5) ? null : cursor2.getString(5);
            Long valueOf = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            Long valueOf2 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            boolean z = cursor2.getInt(8) == 1;
            boolean z2 = cursor2.getInt(9) == 1;
            String string6 = cursor2.isNull(10) ? null : cursor2.getString(10);
            Long valueOf3 = cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11));
            if (cursor2.isNull(12)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(12) == 1);
            }
            return selectAddedMeFriendsCreator.create(j, string, string2, string3, string4, string5, valueOf, valueOf2, z, z2, string6, valueOf3, bool, cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13)), cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14)), cursor2.getInt(15) == 1);
        }
    }

    public interface SelectAddedMeFriendsModel {
        long _id();

        String addSource();

        Long addedTimestamp();

        String bitmojiAvatarId();

        String bitmojiSelfieId();

        String displayName();

        boolean hasViewed();

        boolean isAdded();

        boolean isIgnored();

        Long reverseAddedTimestamp();

        Long storyLatestExpirationTimestamp();

        Long storyLatestTimestamp();

        Long storyRowId();

        Boolean storyViewed();

        String userId();

        String username();
    }
}

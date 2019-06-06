package com.snap.core.db.query;

import android.database.Cursor;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.aioa;

public interface BitmojiModel {

    public static final class Factory {
        public final ainx getAvatarIdForAllFriends() {
            return new ainx("SELECT DISTINCT\n    Friend.bitmojiAvatarId\nFROM Friend\nWHERE Friend.username != 'teamsnapchat' AND\n      (Friend.friendLinkType IS 0\n      OR (Friend.friendLinkType IS 1 AND Friend.addedTimestamp IS NOT 0))", new aioa(FriendModel.TABLE_NAME));
        }

        public final ainw<String> getAvatarIdForAllFriendsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx getAvatarIdForRecentFriends() {
            return new ainx("SELECT DISTINCT\n    Friend.bitmojiAvatarId\nFROM Feed\nLEFT OUTER JOIN Friend ON Feed.friendRowId = Friend._id\nWHERE Friend.username != 'teamsnapchat' AND\n      (Friend.friendLinkType IS 0\n      OR (Friend.friendLinkType IS 1 AND Friend.addedTimestamp IS NOT 0))\nORDER BY Feed.lastInteractionTimestamp DESC", new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
        }

        public final ainw<String> getAvatarIdForRecentFriendsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }
    }
}

package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FriendSuggestionPlacement;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface TopSuggestedFriendModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS TopSuggestedFriend(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    userId TEXT NOT NULL UNIQUE,\n    suggestionPlacement INTEGER,\n    priority INTEGER NOT NULL\n)";
    @Deprecated
    public static final String PRIORITY = "priority";
    @Deprecated
    public static final String SUGGESTIONPLACEMENT = "suggestionPlacement";
    @Deprecated
    public static final String TABLE_NAME = "TopSuggestedFriend";
    @Deprecated
    public static final String USERID = "userId";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends TopSuggestedFriendModel> {
        T create(long j, String str, FriendSuggestionPlacement friendSuggestionPlacement, long j2);
    }

    public static final class Factory<T extends TopSuggestedFriendModel> {
        public final Creator<T> creator;
        public final ainu<FriendSuggestionPlacement, Long> suggestionPlacementAdapter;

        public Factory(Creator<T> creator, ainu<FriendSuggestionPlacement, Long> ainu) {
            this.creator = creator;
            this.suggestionPlacementAdapter = ainu;
        }

        public final ainx selectAllFromTopSuggestedFriend() {
            return new ainx("SELECT * FROM TopSuggestedFriend", new aioa(TopSuggestedFriendModel.TABLE_NAME));
        }

        public final Mapper<T> selectAllFromTopSuggestedFriendMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends TopSuggestedFriendModel> implements ainw<T> {
        private final Factory<T> topSuggestedFriendModelFactory;

        public Mapper(Factory<T> factory) {
            this.topSuggestedFriendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.topSuggestedFriendModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : (FriendSuggestionPlacement) this.topSuggestedFriendModelFactory.suggestionPlacementAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.getLong(3));
        }
    }

    public static final class InsertRow extends ainy {
        private final Factory<? extends TopSuggestedFriendModel> topSuggestedFriendModelFactory;

        public InsertRow(pa paVar, Factory<? extends TopSuggestedFriendModel> factory) {
            super(TopSuggestedFriendModel.TABLE_NAME, paVar.a("INSERT INTO TopSuggestedFriend(\n    userId,\n    suggestionPlacement,\n    priority)\nVALUES(?, ?, ?)"));
            this.topSuggestedFriendModelFactory = factory;
        }

        public final void bind(String str, FriendSuggestionPlacement friendSuggestionPlacement, long j) {
            bindString(1, str);
            if (friendSuggestionPlacement == null) {
                bindNull(2);
            } else {
                bindLong(2, ((Long) this.topSuggestedFriendModelFactory.suggestionPlacementAdapter.encode(friendSuggestionPlacement)).longValue());
            }
            bindLong(3, j);
        }
    }

    public static final class Purge extends ainy {
        public Purge(pa paVar) {
            super(TopSuggestedFriendModel.TABLE_NAME, paVar.a("DELETE FROM TopSuggestedFriend"));
        }
    }

    long _id();

    long priority();

    FriendSuggestionPlacement suggestionPlacement();

    String userId();
}

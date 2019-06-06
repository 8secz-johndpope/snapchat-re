package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FriendSuggestionPlacement;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface SuggestedFriendPlacementModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS SuggestedFriendPlacement(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    suggestionPlacement INTEGER,\n    friendRowId INTEGER NOT NULL\n)";
    @Deprecated
    public static final String FRIENDROWID = "friendRowId";
    @Deprecated
    public static final String SUGGESTIONPLACEMENT = "suggestionPlacement";
    @Deprecated
    public static final String TABLE_NAME = "SuggestedFriendPlacement";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends SuggestedFriendPlacementModel> {
        T create(long j, FriendSuggestionPlacement friendSuggestionPlacement, long j2);
    }

    public static final class Factory<T extends SuggestedFriendPlacementModel> {
        public final Creator<T> creator;
        public final ainu<FriendSuggestionPlacement, Long> suggestionPlacementAdapter;

        public Factory(Creator<T> creator, ainu<FriendSuggestionPlacement, Long> ainu) {
            this.creator = creator;
            this.suggestionPlacementAdapter = ainu;
        }
    }

    public static final class Mapper<T extends SuggestedFriendPlacementModel> implements ainw<T> {
        private final Factory<T> suggestedFriendPlacementModelFactory;

        public Mapper(Factory<T> factory) {
            this.suggestedFriendPlacementModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.suggestedFriendPlacementModelFactory.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : (FriendSuggestionPlacement) this.suggestedFriendPlacementModelFactory.suggestionPlacementAdapter.decode(Long.valueOf(cursor.getLong(1))), cursor.getLong(2));
        }
    }

    public static final class InsertRow extends ainy {
        private final Factory<? extends SuggestedFriendPlacementModel> suggestedFriendPlacementModelFactory;

        public InsertRow(pa paVar, Factory<? extends SuggestedFriendPlacementModel> factory) {
            super(SuggestedFriendPlacementModel.TABLE_NAME, paVar.a("INSERT INTO SuggestedFriendPlacement(\n    suggestionPlacement,\n    friendRowId)\nVALUES(?, ?)"));
            this.suggestedFriendPlacementModelFactory = factory;
        }

        public final void bind(FriendSuggestionPlacement friendSuggestionPlacement, long j) {
            if (friendSuggestionPlacement == null) {
                bindNull(1);
            } else {
                bindLong(1, ((Long) this.suggestedFriendPlacementModelFactory.suggestionPlacementAdapter.encode(friendSuggestionPlacement)).longValue());
            }
            bindLong(2, j);
        }
    }

    public static final class Purge extends ainy {
        public Purge(pa paVar) {
            super(SuggestedFriendPlacementModel.TABLE_NAME, paVar.a("DELETE FROM SuggestedFriendPlacement"));
        }
    }

    public static final class RemoveSuggestedFriendPlacements extends ainy {
        public RemoveSuggestedFriendPlacements(pa paVar) {
            super(SuggestedFriendPlacementModel.TABLE_NAME, paVar.a("DELETE FROM SuggestedFriendPlacement\nWHERE friendRowId = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    long _id();

    long friendRowId();

    FriendSuggestionPlacement suggestionPlacement();
}

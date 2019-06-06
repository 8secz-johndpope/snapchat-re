package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface BestFriendModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS BestFriend(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    friendRowId INTEGER NOT NULL\n)";
    @Deprecated
    public static final String FRIENDROWID = "friendRowId";
    @Deprecated
    public static final String TABLE_NAME = "BestFriend";
    @Deprecated
    public static final String _ID = "_id";

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(BestFriendModel.TABLE_NAME, paVar.a("DELETE FROM BestFriend"));
        }
    }

    public static final class InsertRow extends ainy {
        public InsertRow(pa paVar) {
            super(BestFriendModel.TABLE_NAME, paVar.a("INSERT INTO BestFriend(friendRowId)\nVALUES (?)"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public interface Creator<T extends BestFriendModel> {
        T create(long j, long j2);
    }

    public static final class Factory<T extends BestFriendModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }
    }

    public static final class Mapper<T extends BestFriendModel> implements ainw<T> {
        private final Factory<T> bestFriendModelFactory;

        public Mapper(Factory<T> factory) {
            this.bestFriendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.bestFriendModelFactory.creator.create(cursor.getLong(0), cursor.getLong(1));
        }
    }

    long _id();

    long friendRowId();
}

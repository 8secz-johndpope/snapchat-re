package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface FriendsFeedServerSignalsModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FriendsFeedServerSignals(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL UNIQUE,\n    serverSignals TEXT\n)";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String SERVERSIGNALS = "serverSignals";
    @Deprecated
    public static final String TABLE_NAME = "FriendsFeedServerSignals";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends FriendsFeedServerSignalsModel> {
        T create(long j, long j2, String str);
    }

    public static final class Factory<T extends FriendsFeedServerSignalsModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }
    }

    public static final class Mapper<T extends FriendsFeedServerSignalsModel> implements ainw<T> {
        private final Factory<T> friendsFeedServerSignalsModelFactory;

        public Mapper(Factory<T> factory) {
            this.friendsFeedServerSignalsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.friendsFeedServerSignalsModelFactory.creator.create(cursor.getLong(0), cursor.getLong(1), cursor.isNull(2) ? null : cursor.getString(2));
        }
    }

    public static final class DeleteAllServerSignals extends ainy {
        public DeleteAllServerSignals(pa paVar) {
            super(FriendsFeedServerSignalsModel.TABLE_NAME, paVar.a("DELETE FROM FriendsFeedServerSignals"));
        }
    }

    public static final class ReplaceServerSignals extends ainy {
        public ReplaceServerSignals(pa paVar) {
            super(FriendsFeedServerSignalsModel.TABLE_NAME, paVar.a("REPLACE INTO FriendsFeedServerSignals(feedRowId, serverSignals)\nVALUES(?, ?)"));
        }

        public final void bind(long j, String str) {
            bindLong(1, j);
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
        }
    }

    long _id();

    long feedRowId();

    String serverSignals();
}

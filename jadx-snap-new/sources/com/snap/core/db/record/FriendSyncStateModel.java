package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface FriendSyncStateModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FriendSyncState (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    token TEXT\n)";
    @Deprecated
    public static final String TABLE_NAME = "FriendSyncState";
    @Deprecated
    public static final String TOKEN = "token";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends FriendSyncStateModel> {
        T create(long j, String str);
    }

    public static final class Factory<T extends FriendSyncStateModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getValueFromFriendSyncState() {
            return new ainx("SELECT token\nFROM FriendSyncState\nLIMIT 1", new aioa(FriendSyncStateModel.TABLE_NAME));
        }

        public final ainw<String> getValueFromFriendSyncStateMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }
    }

    public static final class UpdateValue extends ainy {
        public UpdateValue(pa paVar) {
            super(FriendSyncStateModel.TABLE_NAME, paVar.a("UPDATE FriendSyncState\nSET token=?"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class Mapper<T extends FriendSyncStateModel> implements ainw<T> {
        private final Factory<T> friendSyncStateModelFactory;

        public Mapper(Factory<T> factory) {
            this.friendSyncStateModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.friendSyncStateModelFactory.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1));
        }
    }

    public static final class CreateEntry extends ainy {
        public CreateEntry(pa paVar) {
            super(FriendSyncStateModel.TABLE_NAME, paVar.a("INSERT INTO FriendSyncState(token) VALUES(?)"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    long _id();

    String token();
}

package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface FeedSyncStateModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FeedSyncState (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    token TEXT\n)";
    @Deprecated
    public static final String TABLE_NAME = "FeedSyncState";
    @Deprecated
    public static final String TOKEN = "token";
    @Deprecated
    public static final String _ID = "_id";

    public static final class DeleteValue extends ainy {
        public DeleteValue(pa paVar) {
            super(FeedSyncStateModel.TABLE_NAME, paVar.a("DELETE FROM FeedSyncState"));
        }
    }

    public interface Creator<T extends FeedSyncStateModel> {
        T create(long j, String str);
    }

    public static final class Factory<T extends FeedSyncStateModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getValue() {
            return new ainx("SELECT token\nFROM FeedSyncState\nLIMIT 1", new aioa(FeedSyncStateModel.TABLE_NAME));
        }

        public final ainw<String> getValueMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }
    }

    public static final class Mapper<T extends FeedSyncStateModel> implements ainw<T> {
        private final Factory<T> feedSyncStateModelFactory;

        public Mapper(Factory<T> factory) {
            this.feedSyncStateModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.feedSyncStateModelFactory.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1));
        }
    }

    public static final class InsertValue extends ainy {
        public InsertValue(pa paVar) {
            super(FeedSyncStateModel.TABLE_NAME, paVar.a("INSERT INTO FeedSyncState(token) VALUES(?)"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class UpdateValue extends ainy {
        public UpdateValue(pa paVar) {
            super(FeedSyncStateModel.TABLE_NAME, paVar.a("UPDATE FeedSyncState\nSET token=?"));
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

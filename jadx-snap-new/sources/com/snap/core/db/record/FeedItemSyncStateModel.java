package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface FeedItemSyncStateModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FeedItemSyncState (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL UNIQUE\n)";
    public static final String DROPTABLE = "DROP TABLE FeedItemSyncState";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String TABLE_NAME = "FeedItemSyncState";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends FeedItemSyncStateModel> {
        T create(long j, long j2);
    }

    public static final class Factory<T extends FeedItemSyncStateModel> {
        public final Creator<T> creator;

        final class SelectValueQuery extends ainx {
            private final long feedRowId;

            SelectValueQuery(long j) {
                super("SELECT\n_id\nFROM\nFeedItemSyncState\nWHERE feedRowId = ?1", new aioa(FeedItemSyncStateModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectValue(long j) {
            return new SelectValueQuery(j);
        }

        public final ainw<Long> selectValueMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }
    }

    public static final class Mapper<T extends FeedItemSyncStateModel> implements ainw<T> {
        private final Factory<T> feedItemSyncStateModelFactory;

        public Mapper(Factory<T> factory) {
            this.feedItemSyncStateModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.feedItemSyncStateModelFactory.creator.create(cursor.getLong(0), cursor.getLong(1));
        }
    }

    public static final class DeleteValue extends ainy {
        public DeleteValue(pa paVar) {
            super(FeedItemSyncStateModel.TABLE_NAME, paVar.a("DELETE FROM FeedItemSyncState WHERE feedRowId = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class DeleteValues extends ainy {
        public DeleteValues(pa paVar) {
            super(FeedItemSyncStateModel.TABLE_NAME, paVar.a("DELETE FROM FeedItemSyncState"));
        }
    }

    public static final class InsertOrIgnoreValue extends ainy {
        public InsertOrIgnoreValue(pa paVar) {
            super(FeedItemSyncStateModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO FeedItemSyncState(feedRowId) VALUES(?)"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertOrReplaceValue extends ainy {
        public InsertOrReplaceValue(pa paVar) {
            super(FeedItemSyncStateModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO FeedItemSyncState(feedRowId) VALUES(?)"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    long _id();

    long feedRowId();
}

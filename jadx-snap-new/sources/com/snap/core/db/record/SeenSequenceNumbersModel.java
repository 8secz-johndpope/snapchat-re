package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeedSeenSequenceNumbers;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface SeenSequenceNumbersModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS SeenSequenceNumbers(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL UNIQUE,\n    sequenceNumbers BLOB\n)";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String SEQUENCENUMBERS = "sequenceNumbers";
    @Deprecated
    public static final String TABLE_NAME = "SeenSequenceNumbers";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends SeenSequenceNumbersModel> {
        T create(long j, long j2, FeedSeenSequenceNumbers feedSeenSequenceNumbers);
    }

    public static final class Factory<T extends SeenSequenceNumbersModel> {
        public final Creator<T> creator;
        public final ainu<FeedSeenSequenceNumbers, byte[]> sequenceNumbersAdapter;

        final class GetSeenSequenceNumbersQuery extends ainx {
            private final long feedRowId;

            GetSeenSequenceNumbersQuery(long j) {
                super("SELECT\n    sequenceNumbers\nFROM SeenSequenceNumbers\nWHERE feedRowId = ?1", new aioa(SeenSequenceNumbersModel.TABLE_NAME));
                this.feedRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
            }
        }

        public Factory(Creator<T> creator, ainu<FeedSeenSequenceNumbers, byte[]> ainu) {
            this.creator = creator;
            this.sequenceNumbersAdapter = ainu;
        }

        public final ainx getSeenSequenceNumbers(long j) {
            return new GetSeenSequenceNumbersQuery(j);
        }

        public final ainw<FeedSeenSequenceNumbers> getSeenSequenceNumbersMapper() {
            return new ainw<FeedSeenSequenceNumbers>() {
                public FeedSeenSequenceNumbers map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (FeedSeenSequenceNumbers) Factory.this.sequenceNumbersAdapter.decode(cursor.getBlob(0));
                }
            };
        }
    }

    public static final class Mapper<T extends SeenSequenceNumbersModel> implements ainw<T> {
        private final Factory<T> seenSequenceNumbersModelFactory;

        public Mapper(Factory<T> factory) {
            this.seenSequenceNumbersModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.seenSequenceNumbersModelFactory.creator.create(cursor.getLong(0), cursor.getLong(1), cursor.isNull(2) ? null : (FeedSeenSequenceNumbers) this.seenSequenceNumbersModelFactory.sequenceNumbersAdapter.decode(cursor.getBlob(2)));
        }
    }

    public static final class ClearAllSeenSequenceNumbers extends ainy {
        public ClearAllSeenSequenceNumbers(pa paVar) {
            super(SeenSequenceNumbersModel.TABLE_NAME, paVar.a("DELETE FROM SeenSequenceNumbers"));
        }
    }

    public static final class ClearSequenceNumbersForGroup extends ainy {
        public ClearSequenceNumbersForGroup(pa paVar) {
            super(SeenSequenceNumbersModel.TABLE_NAME, paVar.a("DELETE FROM SeenSequenceNumbers WHERE feedRowId=?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class InsertSeenSequenceNumbers extends ainy {
        private final Factory<? extends SeenSequenceNumbersModel> seenSequenceNumbersModelFactory;

        public InsertSeenSequenceNumbers(pa paVar, Factory<? extends SeenSequenceNumbersModel> factory) {
            super(SeenSequenceNumbersModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO SeenSequenceNumbers(feedRowId, sequenceNumbers)\nVALUES (?1, ?2)"));
            this.seenSequenceNumbersModelFactory = factory;
        }

        public final void bind(long j, FeedSeenSequenceNumbers feedSeenSequenceNumbers) {
            bindLong(1, j);
            if (feedSeenSequenceNumbers == null) {
                bindNull(2);
            } else {
                bindBlob(2, (byte[]) this.seenSequenceNumbersModelFactory.sequenceNumbersAdapter.encode(feedSeenSequenceNumbers));
            }
        }
    }

    long _id();

    long feedRowId();

    FeedSeenSequenceNumbers sequenceNumbers();
}

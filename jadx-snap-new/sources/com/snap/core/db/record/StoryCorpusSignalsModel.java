package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface StoryCorpusSignalsModel {
    @Deprecated
    public static final String CORPUS = "corpus";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS StoryCorpusSignals(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    corpus INTEGER NOT NULL,\n    numSnapsViewed INTEGER NOT NULL DEFAULT 0,\n    totalWatchTimeSeconds REAL NOT NULL DEFAULT 0,\n    totalImpressionTimeSeconds REAL NOT NULL DEFAULT 0,\n    UNIQUE(corpus) ON CONFLICT IGNORE\n)";
    @Deprecated
    public static final String NUMSNAPSVIEWED = "numSnapsViewed";
    @Deprecated
    public static final String TABLE_NAME = "StoryCorpusSignals";
    @Deprecated
    public static final String TOTALIMPRESSIONTIMESECONDS = "totalImpressionTimeSeconds";
    @Deprecated
    public static final String TOTALWATCHTIMESECONDS = "totalWatchTimeSeconds";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends StoryCorpusSignalsModel> {
        T create(long j, long j2, long j3, double d, double d2);
    }

    public static final class Factory<T extends StoryCorpusSignalsModel> {
        public final Creator<T> creator;

        final class SelectRowIdByCorpusQuery extends ainx {
            private final long corpus;

            SelectRowIdByCorpusQuery(long j) {
                super("SELECT _id FROM StoryCorpusSignals\nWHERE corpus = ?1", new aioa(StoryCorpusSignalsModel.TABLE_NAME));
                this.corpus = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.corpus);
            }
        }

        final class SelectSignalQuery extends ainx {
            private final long _id;

            SelectSignalQuery(long j) {
                super("SELECT * FROM StoryCorpusSignals\nWHERE _id = ?1", new aioa(StoryCorpusSignalsModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class StoryCorpusBulkSelectSignalsQuery extends ainx {
            private final long[] corpus;

            StoryCorpusBulkSelectSignalsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM StoryCorpusSignals\nWHERE corpus IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(StoryCorpusSignalsModel.TABLE_NAME));
                this.corpus = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.corpus;
                int length = jArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectRowIdByCorpus(long j) {
            return new SelectRowIdByCorpusQuery(j);
        }

        public final ainw<Long> selectRowIdByCorpusMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectSignal(long j) {
            return new SelectSignalQuery(j);
        }

        public final Mapper<T> selectSignalMapper() {
            return new Mapper(this);
        }

        public final ainx storyCorpusBulkSelectSignals(long[] jArr) {
            return new StoryCorpusBulkSelectSignalsQuery(jArr);
        }

        public final Mapper<T> storyCorpusBulkSelectSignalsMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends StoryCorpusSignalsModel> implements ainw<T> {
        private final Factory<T> storyCorpusSignalsModelFactory;

        public Mapper(Factory<T> factory) {
            this.storyCorpusSignalsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.storyCorpusSignalsModelFactory.creator.create(cursor.getLong(0), cursor.getLong(1), cursor.getLong(2), cursor.getDouble(3), cursor.getDouble(4));
        }
    }

    public static final class IncrementNumSnapsViewedAndTotalWatchTimeSeconds extends ainy {
        public IncrementNumSnapsViewedAndTotalWatchTimeSeconds(pa paVar) {
            super(StoryCorpusSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryCorpusSignals\nSET numSnapsViewed = numSnapsViewed + ?,\n    totalWatchTimeSeconds = totalWatchTimeSeconds + ?\nWHERE _id = ?"));
        }

        public final void bind(double d, double d2, long j) {
            bindDouble(1, d);
            bindDouble(2, d2);
            bindLong(3, j);
        }
    }

    public static final class IncrementTotalImpressionTimeSeconds extends ainy {
        public IncrementTotalImpressionTimeSeconds(pa paVar) {
            super(StoryCorpusSignalsModel.TABLE_NAME, paVar.a("UPDATE StoryCorpusSignals\nSET totalImpressionTimeSeconds = totalImpressionTimeSeconds + ?\nWHERE _id = ?"));
        }

        public final void bind(double d, long j) {
            bindDouble(1, d);
            bindLong(2, j);
        }
    }

    public static final class InsertOrIgnoreSignal extends ainy {
        public InsertOrIgnoreSignal(pa paVar) {
            super(StoryCorpusSignalsModel.TABLE_NAME, paVar.a("INSERT OR IGNORE INTO StoryCorpusSignals(\n    corpus\n) VALUES(?)"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    long _id();

    long corpus();

    long numSnapsViewed();

    double totalImpressionTimeSeconds();

    double totalWatchTimeSeconds();
}

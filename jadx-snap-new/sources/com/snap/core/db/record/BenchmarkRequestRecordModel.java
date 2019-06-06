package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.acbu;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface BenchmarkRequestRecordModel {
    @Deprecated
    public static final String BENCHMARKID = "benchmarkId";
    @Deprecated
    public static final String BENCHMARKRESULT = "benchmarkResult";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS BenchmarkRequestRecord (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    benchmarkId INTEGER NOT NULL UNIQUE,\n    expirationTsSec INTEGER,\n    hasBeenScheduled INTEGER DEFAULT 0,\n    benchmarkResult BLOB DEFAULT NULL\n)";
    @Deprecated
    public static final String EXPIRATIONTSSEC = "expirationTsSec";
    @Deprecated
    public static final String HASBEENSCHEDULED = "hasBeenScheduled";
    @Deprecated
    public static final String TABLE_NAME = "BenchmarkRequestRecord";
    @Deprecated
    public static final String _ID = "_id";

    public static final class Factory<T extends BenchmarkRequestRecordModel> {
        public final ainu<acbu, byte[]> benchmarkResultAdapter;
        public final Creator<T> creator;

        final class GetPendingBenchmarksQuery extends ainx {
            private final Long expirationTsSec;

            GetPendingBenchmarksQuery(Long l) {
                super("SELECT\n    * -- Dirty hack for SqlDelight to generate the mapper\nFROM\n    BenchmarkRequestRecord\nWHERE\n    hasBeenScheduled = 0\n    AND (expirationTsSec > ?1 OR expirationTsSec IS NULL)", new aioa(BenchmarkRequestRecordModel.TABLE_NAME));
                this.expirationTsSec = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.expirationTsSec;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public Factory(Creator<T> creator, ainu<acbu, byte[]> ainu) {
            this.creator = creator;
            this.benchmarkResultAdapter = ainu;
        }

        public final ainx GetPendingBenchmarks(Long l) {
            return new GetPendingBenchmarksQuery(l);
        }

        public final ainx GetUnreportedResults() {
            return new ainx("SELECT\n    * -- Dirty hack for SqlDelight to generate the mapper\nFROM\n    BenchmarkRequestRecord\nWHERE\n    benchmarkResult IS NOT NULL", new aioa(BenchmarkRequestRecordModel.TABLE_NAME));
        }

        public final Mapper<T> getPendingBenchmarksMapper() {
            return new Mapper(this);
        }

        public final Mapper<T> getUnreportedResultsMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends BenchmarkRequestRecordModel> implements ainw<T> {
        private final Factory<T> benchmarkRequestRecordModelFactory;

        public Mapper(Factory<T> factory) {
            this.benchmarkRequestRecordModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Creator creator = this.benchmarkRequestRecordModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            Long valueOf = cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2));
            if (cursor.isNull(3)) {
                bool = null;
            } else {
                if (cursor.getInt(3) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return creator.create(j, j2, valueOf, bool, cursor.isNull(4) ? null : (acbu) this.benchmarkRequestRecordModelFactory.benchmarkResultAdapter.decode(cursor.getBlob(4)));
        }
    }

    public interface Creator<T extends BenchmarkRequestRecordModel> {
        T create(long j, long j2, Long l, Boolean bool, acbu acbu);
    }

    public static final class InsertOrReplaceBenchmarkRequest extends ainy {
        public InsertOrReplaceBenchmarkRequest(pa paVar) {
            super(BenchmarkRequestRecordModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO BenchmarkRequestRecord(\n    benchmarkId,\n    expirationTsSec\n) VALUES (?, ?)"));
        }

        public final void bind(long j, Long l) {
            bindLong(1, j);
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
        }
    }

    public static final class MarkBenchmarkScheduled extends ainy {
        public MarkBenchmarkScheduled(pa paVar) {
            super(BenchmarkRequestRecordModel.TABLE_NAME, paVar.a("UPDATE BenchmarkRequestRecord\nSET hasBeenScheduled = 1\nWHERE benchmarkId = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class RemoveBenchmarkRequest extends ainy {
        public RemoveBenchmarkRequest(pa paVar) {
            super(BenchmarkRequestRecordModel.TABLE_NAME, paVar.a("DELETE\nFROM BenchmarkRequestRecord\nWHERE benchmarkId = ? AND benchmarkResult IS NOT NULL"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class UpdateBenchmarkResult extends ainy {
        private final Factory<? extends BenchmarkRequestRecordModel> benchmarkRequestRecordModelFactory;

        public UpdateBenchmarkResult(pa paVar, Factory<? extends BenchmarkRequestRecordModel> factory) {
            super(BenchmarkRequestRecordModel.TABLE_NAME, paVar.a("UPDATE BenchmarkRequestRecord\nSET benchmarkResult = ?\nWHERE benchmarkId = ? AND hasBeenScheduled = 1"));
            this.benchmarkRequestRecordModelFactory = factory;
        }

        public final void bind(acbu acbu, long j) {
            if (acbu == null) {
                bindNull(1);
            } else {
                bindBlob(1, (byte[]) this.benchmarkRequestRecordModelFactory.benchmarkResultAdapter.encode(acbu));
            }
            bindLong(2, j);
        }
    }

    long _id();

    long benchmarkId();

    acbu benchmarkResult();

    Long expirationTsSec();

    Boolean hasBeenScheduled();
}

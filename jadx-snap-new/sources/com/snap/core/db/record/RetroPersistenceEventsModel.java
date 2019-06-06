package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.RetroEventsCategory;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface RetroPersistenceEventsModel {
    @Deprecated
    public static final String BATCHTRACKURL = "batchTrackUrl";
    @Deprecated
    public static final String CATEGORY = "category";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS RetroPersistenceEvents (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    category INTEGER NOT NULL,\n    batchTrackUrl TEXT,\n    singleTrackUrl TEXT NOT NULL,\n    payload BLOB NOT NULL,\n    numberOfAttempts INTEGER NOT NULL DEFAULT 1,\n    expirationTimestampMillis INTEGER NOT NULL\n)";
    @Deprecated
    public static final String EXPIRATIONTIMESTAMPMILLIS = "expirationTimestampMillis";
    @Deprecated
    public static final String NUMBEROFATTEMPTS = "numberOfAttempts";
    @Deprecated
    public static final String PAYLOAD = "payload";
    @Deprecated
    public static final String SINGLETRACKURL = "singleTrackUrl";
    @Deprecated
    public static final String TABLE_NAME = "RetroPersistenceEvents";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends RetroPersistenceEventsModel> {
        T create(long j, RetroEventsCategory retroEventsCategory, String str, String str2, byte[] bArr, long j2, long j3);
    }

    public static final class Factory<T extends RetroPersistenceEventsModel> {
        public final ainu<RetroEventsCategory, Long> categoryAdapter;
        public final Creator<T> creator;

        final class GetEventOfIdQuery extends ainx {
            private final long _id;

            GetEventOfIdQuery(long j) {
                super("SELECT RetroPersistenceEvents._id,\n       RetroPersistenceEvents.category,\n       RetroPersistenceEvents.batchTrackUrl,\n       RetroPersistenceEvents.singleTrackUrl,\n       RetroPersistenceEvents.payload,\n       RetroPersistenceEvents.numberOfAttempts,\n       RetroPersistenceEvents.expirationTimestampMillis\nFROM RetroPersistenceEvents\nWHERE _id = ?1", new aioa(RetroPersistenceEventsModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        public Factory(Creator<T> creator, ainu<RetroEventsCategory, Long> ainu) {
            this.creator = creator;
            this.categoryAdapter = ainu;
        }

        public final ainx getEventOfId(long j) {
            return new GetEventOfIdQuery(j);
        }

        public final <R extends GetEventOfIdModel> GetEventOfIdMapper<R, T> getEventOfIdMapper(GetEventOfIdCreator<R> getEventOfIdCreator) {
            return new GetEventOfIdMapper(getEventOfIdCreator, this);
        }
    }

    public interface GetEventOfIdCreator<T extends GetEventOfIdModel> {
        T create(long j, RetroEventsCategory retroEventsCategory, String str, String str2, byte[] bArr, long j2, long j3);
    }

    public interface GetEventOfIdModel {
        long _id();

        String batchTrackUrl();

        RetroEventsCategory category();

        long expirationTimestampMillis();

        long numberOfAttempts();

        byte[] payload();

        String singleTrackUrl();
    }

    public static final class GetEventOfIdMapper<T extends GetEventOfIdModel, T1 extends RetroPersistenceEventsModel> implements ainw<T> {
        private final GetEventOfIdCreator<T> creator;
        private final Factory<T1> retroPersistenceEventsModelFactory;

        public GetEventOfIdMapper(GetEventOfIdCreator<T> getEventOfIdCreator, Factory<T1> factory) {
            this.creator = getEventOfIdCreator;
            this.retroPersistenceEventsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), (RetroEventsCategory) this.retroPersistenceEventsModelFactory.categoryAdapter.decode(Long.valueOf(cursor.getLong(1))), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3), cursor.getBlob(4), cursor.getLong(5), cursor.getLong(6));
        }
    }

    public static final class Mapper<T extends RetroPersistenceEventsModel> implements ainw<T> {
        private final Factory<T> retroPersistenceEventsModelFactory;

        public Mapper(Factory<T> factory) {
            this.retroPersistenceEventsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.retroPersistenceEventsModelFactory.creator.create(cursor.getLong(0), (RetroEventsCategory) this.retroPersistenceEventsModelFactory.categoryAdapter.decode(Long.valueOf(cursor.getLong(1))), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3), cursor.getBlob(4), cursor.getLong(5), cursor.getLong(6));
        }
    }

    public static final class DeleteEventOfId extends ainy {
        public DeleteEventOfId(pa paVar) {
            super(RetroPersistenceEventsModel.TABLE_NAME, paVar.a("DELETE\nFROM RetroPersistenceEvents\nWHERE _id = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class DeleteExpiredEvent extends ainy {
        public DeleteExpiredEvent(pa paVar) {
            super(RetroPersistenceEventsModel.TABLE_NAME, paVar.a("DELETE\nFROM RetroPersistenceEvents\nWHERE expirationTimestampMillis < ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class PersistEvent extends ainy {
        private final Factory<? extends RetroPersistenceEventsModel> retroPersistenceEventsModelFactory;

        public PersistEvent(pa paVar, Factory<? extends RetroPersistenceEventsModel> factory) {
            super(RetroPersistenceEventsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO RetroPersistenceEvents (\n    category,\n    batchTrackUrl,\n    singleTrackUrl,\n    payload,\n    numberOfAttempts,\n    expirationTimestampMillis)\nVALUES (?, ?, ?, ?, ?, ?)"));
            this.retroPersistenceEventsModelFactory = factory;
        }

        public final void bind(RetroEventsCategory retroEventsCategory, String str, String str2, byte[] bArr, long j, long j2) {
            bindLong(1, ((Long) this.retroPersistenceEventsModelFactory.categoryAdapter.encode(retroEventsCategory)).longValue());
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
            bindString(3, str2);
            bindBlob(4, bArr);
            bindLong(5, j);
            bindLong(6, j2);
        }
    }

    public static final class UpdateNumberOfAttempts extends ainy {
        public UpdateNumberOfAttempts(pa paVar) {
            super(RetroPersistenceEventsModel.TABLE_NAME, paVar.a("UPDATE RetroPersistenceEvents\nSET numberOfAttempts = ?\nWHERE _id = ?"));
        }

        public final void bind(long j, long j2) {
            bindLong(1, j);
            bindLong(2, j2);
        }
    }

    long _id();

    String batchTrackUrl();

    RetroEventsCategory category();

    long expirationTimestampMillis();

    long numberOfAttempts();

    byte[] payload();

    String singleTrackUrl();
}

package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.UpdateStatus;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.gcp;
import defpackage.pa;
import defpackage.pc;

public interface PendingSnapModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS PendingSnap(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL,\n    snapId TEXT NOT NULL UNIQUE,\n    timestamp INTEGER NOT NULL,\n    updateStatus TEXT NOT NULL\n)";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String SNAPID = "snapId";
    @Deprecated
    public static final String TABLE_NAME = "PendingSnap";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String UPDATESTATUS = "updateStatus";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends PendingSnapModel> {
        T create(long j, long j2, String str, long j3, UpdateStatus updateStatus);
    }

    public static final class Factory<T extends PendingSnapModel> {
        public final Creator<T> creator;
        public final ainu<UpdateStatus, String> updateStatusAdapter;

        final class GetPendingSnapIdForSnapIdQuery extends ainx {
            private final String snapId;

            GetPendingSnapIdForSnapIdQuery(String str) {
                super("SELECT _id\nFROM PendingSnap\nWHERE snapId=?1\nLIMIT 1", new aioa(PendingSnapModel.TABLE_NAME));
                this.snapId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.snapId);
            }
        }

        final class GetPendingSnapInfoQuery extends ainx {
            private final long feedRowId;
            private final UpdateStatus updateStatus;

            GetPendingSnapInfoQuery(long j, UpdateStatus updateStatus) {
                super("SELECT\nSnap.snapId,\nSnap.snapType,\nSnap.timestamp,\nesId\nFROM MessagingSnap JOIN Snap\nON MessagingSnap.snapRowId = Snap._id\nWHERE Snap.snapId IN\n(\nSELECT snapId\nFROM PendingSnap\nWHERE feedRowId=?1\nAND updateStatus=?2\n)\nORDER BY timestamp ASC", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, PendingSnapModel.TABLE_NAME));
                this.feedRowId = j;
                this.updateStatus = updateStatus;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.feedRowId);
                pcVar.bindString(2, (String) Factory.this.updateStatusAdapter.encode(this.updateStatus));
            }
        }

        public Factory(Creator<T> creator, ainu<UpdateStatus, String> ainu) {
            this.creator = creator;
            this.updateStatusAdapter = ainu;
        }

        public final ainx getPendingSnapIdForSnapId(String str) {
            return new GetPendingSnapIdForSnapIdQuery(str);
        }

        public final ainw<Long> getPendingSnapIdForSnapIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getPendingSnapInfo(long j, UpdateStatus updateStatus) {
            return new GetPendingSnapInfoQuery(j, updateStatus);
        }

        public final <R extends GetPendingSnapInfoModel, T1 extends SnapModel> GetPendingSnapInfoMapper<R, T1> getPendingSnapInfoMapper(GetPendingSnapInfoCreator<R> getPendingSnapInfoCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory) {
            return new GetPendingSnapInfoMapper(getPendingSnapInfoCreator, factory);
        }
    }

    public interface GetPendingSnapInfoCreator<T extends GetPendingSnapInfoModel> {
        T create(String str, gcp gcp, long j, String str2);
    }

    public interface GetPendingSnapInfoModel {
        String esId();

        String snapId();

        gcp snapType();

        long timestamp();
    }

    public static final class GetPendingSnapInfoMapper<T extends GetPendingSnapInfoModel, T1 extends SnapModel> implements ainw<T> {
        private final GetPendingSnapInfoCreator<T> creator;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetPendingSnapInfoMapper(GetPendingSnapInfoCreator<T> getPendingSnapInfoCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory) {
            this.creator = getPendingSnapInfoCreator;
            this.snapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(1))), cursor.getLong(2), cursor.isNull(3) ? null : cursor.getString(3));
        }
    }

    public static final class Mapper<T extends PendingSnapModel> implements ainw<T> {
        private final Factory<T> pendingSnapModelFactory;

        public Mapper(Factory<T> factory) {
            this.pendingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.pendingSnapModelFactory.creator.create(cursor.getLong(0), cursor.getLong(1), cursor.getString(2), cursor.getLong(3), (UpdateStatus) this.pendingSnapModelFactory.updateStatusAdapter.decode(cursor.getString(4)));
        }
    }

    public static final class ClearPendingSnapsForFeed extends ainy {
        public ClearPendingSnapsForFeed(pa paVar) {
            super(PendingSnapModel.TABLE_NAME, paVar.a("DELETE\nFROM PendingSnap\nWHERE feedRowId=?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class DeletePendingSnap extends ainy {
        private final com.snap.core.db.record.MessagingSnapModel.Factory<? extends MessagingSnapModel> messagingSnapModelFactory;

        public DeletePendingSnap(pa paVar, com.snap.core.db.record.MessagingSnapModel.Factory<? extends MessagingSnapModel> factory) {
            super(PendingSnapModel.TABLE_NAME, paVar.a("DELETE\nFROM PendingSnap\nWHERE snapId IN (\nSELECT Snap.snapId\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nWHERE serverStatus = ?\nAND feedRowId = ?\n)"));
            this.messagingSnapModelFactory = factory;
        }

        public final void bind(SnapServerStatus snapServerStatus, Long l) {
            if (snapServerStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messagingSnapModelFactory.serverStatusAdapter.encode(snapServerStatus));
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
        }
    }

    public static final class InsertPendingSnap extends ainy {
        private final Factory<? extends PendingSnapModel> pendingSnapModelFactory;

        public InsertPendingSnap(pa paVar, Factory<? extends PendingSnapModel> factory) {
            super(PendingSnapModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO PendingSnap(feedRowId, snapId, timestamp, updateStatus)\nVALUES(?, ?, ?, ?)"));
            this.pendingSnapModelFactory = factory;
        }

        public final void bind(long j, String str, long j2, UpdateStatus updateStatus) {
            bindLong(1, j);
            bindString(2, str);
            bindLong(3, j2);
            bindString(4, (String) this.pendingSnapModelFactory.updateStatusAdapter.encode(updateStatus));
        }
    }

    public static final class UpdatePendingSnapUpdateStatus extends ainy {
        private final Factory<? extends PendingSnapModel> pendingSnapModelFactory;

        public UpdatePendingSnapUpdateStatus(pa paVar, Factory<? extends PendingSnapModel> factory) {
            super(PendingSnapModel.TABLE_NAME, paVar.a("UPDATE PendingSnap\nSET updateStatus=?\nWHERE snapId = ?"));
            this.pendingSnapModelFactory = factory;
        }

        public final void bind(UpdateStatus updateStatus, String str) {
            bindString(1, (String) this.pendingSnapModelFactory.updateStatusAdapter.encode(updateStatus));
            bindString(2, str);
        }
    }

    long _id();

    long feedRowId();

    String snapId();

    long timestamp();

    UpdateStatus updateStatus();
}

package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.DdmlRecord;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface DdmlDataModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS DdmlData(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    dataId TEXT,\n    record TEXT,\n    timestamp INTEGER NOT NULL\n)";
    @Deprecated
    public static final String DATAID = "dataId";
    @Deprecated
    public static final String RECORD = "record";
    @Deprecated
    public static final String TABLE_NAME = "DdmlData";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends DdmlDataModel> {
        T create(long j, String str, DdmlRecord ddmlRecord, long j2);
    }

    public static final class Factory<T extends DdmlDataModel> {
        public final Creator<T> creator;
        public final ainu<DdmlRecord, String> recordAdapter;

        final class NumRowsForDataIdQuery extends ainx {
            private final String dataId;

            NumRowsForDataIdQuery(String str) {
                super("SELECT COUNT(*)\nFROM DdmlData\nWHERE dataId= ?1", new aioa(DdmlDataModel.TABLE_NAME));
                this.dataId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.dataId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectForDataIdQuery extends ainx {
            private final String dataId;

            SelectForDataIdQuery(String str) {
                super("SELECT * FROM DdmlData\nWHERE dataId= ?1", new aioa(DdmlDataModel.TABLE_NAME));
                this.dataId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.dataId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public Factory(Creator<T> creator, ainu<DdmlRecord, String> ainu) {
            this.creator = creator;
            this.recordAdapter = ainu;
        }

        public final ainx getDataIds() {
            return new ainx("SELECT dataId\nFROM DdmlData\nGROUP BY dataId", new aioa(DdmlDataModel.TABLE_NAME));
        }

        public final ainw<String> getDataIdsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx getOldestRecordTimestamp() {
            return new ainx("SELECT MIN(timestamp)\nFROM DdmlData", new aioa(DdmlDataModel.TABLE_NAME));
        }

        public final ainw<Long> getOldestRecordTimestampMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx numRowsForDataId(String str) {
            return new NumRowsForDataIdQuery(str);
        }

        public final ainw<Long> numRowsForDataIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectForDataId(String str) {
            return new SelectForDataIdQuery(str);
        }

        public final Mapper<T> selectForDataIdMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends DdmlDataModel> implements ainw<T> {
        private final Factory<T> ddmlDataModelFactory;

        public Mapper(Factory<T> factory) {
            this.ddmlDataModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.ddmlDataModelFactory.creator;
            long j = cursor.getLong(0);
            DdmlRecord ddmlRecord = null;
            String string = cursor.isNull(1) ? null : cursor.getString(1);
            if (!cursor.isNull(2)) {
                ddmlRecord = (DdmlRecord) this.ddmlDataModelFactory.recordAdapter.decode(cursor.getString(2));
            }
            return creator.create(j, string, ddmlRecord, cursor.getLong(3));
        }
    }

    public static final class DeleteForDataId extends ainy {
        public DeleteForDataId(pa paVar) {
            super(DdmlDataModel.TABLE_NAME, paVar.a("DELETE FROM DdmlData\nWHERE dataId= ?"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class InsertRow extends ainy {
        private final Factory<? extends DdmlDataModel> ddmlDataModelFactory;

        public InsertRow(pa paVar, Factory<? extends DdmlDataModel> factory) {
            super(DdmlDataModel.TABLE_NAME, paVar.a("INSERT INTO DdmlData(\n    dataId,\n    record,\n    timestamp)\nVALUES(?, ?, ?)"));
            this.ddmlDataModelFactory = factory;
        }

        public final void bind(String str, DdmlRecord ddmlRecord, long j) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (ddmlRecord == null) {
                bindNull(2);
            } else {
                bindString(2, (String) this.ddmlDataModelFactory.recordAdapter.encode(ddmlRecord));
            }
            bindLong(3, j);
        }
    }

    long _id();

    String dataId();

    DdmlRecord record();

    long timestamp();
}

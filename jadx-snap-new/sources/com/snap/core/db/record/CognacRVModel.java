package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface CognacRVModel {
    @Deprecated
    public static final String APPID = "appId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS CognacRV (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    requestId TEXT NOT NULL UNIQUE,\n\n    appId TEXT NOT NULL,\n    slotId TEXT NOT NULL,\n    timestamp INTEGER NOT NULL,\n    payload TEXT\n)";
    @Deprecated
    public static final String PAYLOAD = "payload";
    @Deprecated
    public static final String REQUESTID = "requestId";
    @Deprecated
    public static final String SLOTID = "slotId";
    @Deprecated
    public static final String TABLE_NAME = "CognacRV";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends CognacRVModel> {
        T create(long j, String str, String str2, String str3, long j2, String str4);
    }

    public static final class Factory<T extends CognacRVModel> {
        public final Creator<T> creator;

        final class SelectRVForAppIdQuery extends ainx {
            private final String appId;

            SelectRVForAppIdQuery(String str) {
                super("SELECT *\nFROM CognacRV\nWHERE appId = ?1", new aioa(CognacRVModel.TABLE_NAME));
                this.appId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.appId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectRVForAppId(String str) {
            return new SelectRVForAppIdQuery(str);
        }

        public final Mapper<T> selectRVForAppIdMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends CognacRVModel> implements ainw<T> {
        private final Factory<T> cognacRVModelFactory;

        public Mapper(Factory<T> factory) {
            this.cognacRVModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.cognacRVModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getLong(4), cursor.isNull(5) ? null : cursor.getString(5));
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(CognacRVModel.TABLE_NAME, paVar.a("DELETE FROM CognacRV"));
        }
    }

    public static final class DeleteRV extends ainy {
        public DeleteRV(pa paVar) {
            super(CognacRVModel.TABLE_NAME, paVar.a("DELETE FROM CognacRV\nWHERE requestId = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertRow extends ainy {
        public InsertRow(pa paVar) {
            super(CognacRVModel.TABLE_NAME, paVar.a("INSERT INTO CognacRV(\n    requestId,\n    appId,\n    slotId,\n    timestamp,\n    payload)\nVALUES(?,?,?,?,?)"));
        }

        public final void bind(String str, String str2, String str3, long j, String str4) {
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
            bindLong(4, j);
            if (str4 == null) {
                bindNull(5);
            } else {
                bindString(5, str4);
            }
        }
    }

    long _id();

    String appId();

    String payload();

    String requestId();

    String slotId();

    long timestamp();
}

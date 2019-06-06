package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface StorySyncStateModel {
    @Deprecated
    public static final String CHECKSUM = "checksum";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS StorySyncState (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    checksum TEXT,\n    metadata TEXT\n)";
    @Deprecated
    public static final String METADATA = "metadata";
    @Deprecated
    public static final String TABLE_NAME = "StorySyncState";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends StorySyncStateModel> {
        T create(long j, String str, String str2);
    }

    public static final class Factory<T extends StorySyncStateModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getRecord() {
            return new ainx("SELECT\n*\nFROM StorySyncState\nLIMIT 1", new aioa(StorySyncStateModel.TABLE_NAME));
        }

        public final Mapper<T> getRecordMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends StorySyncStateModel> implements ainw<T> {
        private final Factory<T> storySyncStateModelFactory;

        public Mapper(Factory<T> factory) {
            this.storySyncStateModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.storySyncStateModelFactory.creator;
            long j = cursor.getLong(0);
            String str = null;
            String string = cursor.isNull(1) ? null : cursor.getString(1);
            if (!cursor.isNull(2)) {
                str = cursor.getString(2);
            }
            return creator.create(j, string, str);
        }
    }

    public static final class UpdateValue extends ainy {
        public UpdateValue(pa paVar) {
            super(StorySyncStateModel.TABLE_NAME, paVar.a("UPDATE StorySyncState\nSET checksum=?, metadata=?"));
        }

        public final void bind(String str, String str2) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
        }
    }

    public static final class CreateEntry extends ainy {
        public CreateEntry(pa paVar) {
            super(StorySyncStateModel.TABLE_NAME, paVar.a("INSERT INTO StorySyncState(checksum) VALUES(NULL)"));
        }
    }

    long _id();

    String checksum();

    String metadata();
}

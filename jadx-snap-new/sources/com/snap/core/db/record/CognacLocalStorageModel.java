package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface CognacLocalStorageModel {
    @Deprecated
    public static final String APPID = "appId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS CognacLocalStorage (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    appId TEXT NOT NULL,\n    key TEXT NOT NULL,\n    value TEXT NOT NULL\n)";
    @Deprecated
    public static final String KEY = "key";
    @Deprecated
    public static final String TABLE_NAME = "CognacLocalStorage";
    @Deprecated
    public static final String VALUE = "value";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends CognacLocalStorageModel> {
        T create(long j, String str, String str2, String str3);
    }

    public static final class Factory<T extends CognacLocalStorageModel> {
        public final Creator<T> creator;

        final class SelectDataForAppIdQuery extends ainx {
            private final String appId;

            SelectDataForAppIdQuery(String str) {
                super("SELECT *\nFROM CognacLocalStorage\nWHERE appId = ?1", new aioa(CognacLocalStorageModel.TABLE_NAME));
                this.appId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.appId);
            }
        }

        final class SelectDataQuery extends ainx {
            private final String appId;
            private final String key;

            SelectDataQuery(String str, String str2) {
                super("SELECT *\nFROM CognacLocalStorage\nWHERE appId = ?1\nAND key = ?2", new aioa(CognacLocalStorageModel.TABLE_NAME));
                this.appId = str;
                this.key = str2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.appId);
                pcVar.bindString(2, this.key);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectData(String str, String str2) {
            return new SelectDataQuery(str, str2);
        }

        public final ainx selectDataForAppId(String str) {
            return new SelectDataForAppIdQuery(str);
        }

        public final Mapper<T> selectDataForAppIdMapper() {
            return new Mapper(this);
        }

        public final Mapper<T> selectDataMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends CognacLocalStorageModel> implements ainw<T> {
        private final Factory<T> cognacLocalStorageModelFactory;

        public Mapper(Factory<T> factory) {
            this.cognacLocalStorageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.cognacLocalStorageModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
        }
    }

    public static final class DeleteData extends ainy {
        public DeleteData(pa paVar) {
            super(CognacLocalStorageModel.TABLE_NAME, paVar.a("DELETE FROM CognacLocalStorage\nWHERE appId = ?\nAND key = ?"));
        }

        public final void bind(String str, String str2) {
            bindString(1, str);
            bindString(2, str2);
        }
    }

    public static final class InsertData extends ainy {
        public InsertData(pa paVar) {
            super(CognacLocalStorageModel.TABLE_NAME, paVar.a("INSERT INTO CognacLocalStorage(\n    appId,\n    key,\n    value)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, String str2, String str3) {
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
        }
    }

    public static final class UpdateData extends ainy {
        public UpdateData(pa paVar) {
            super(CognacLocalStorageModel.TABLE_NAME, paVar.a("UPDATE CognacLocalStorage\nSET value = ?\nWHERE appId = ?\nAND key = ?"));
        }

        public final void bind(String str, String str2, String str3) {
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
        }
    }

    long _id();

    String appId();

    String key();

    String value();
}

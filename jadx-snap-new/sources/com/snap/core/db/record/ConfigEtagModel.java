package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface ConfigEtagModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ConfigEtag (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    etag TEXT NOT NULL\n)";
    @Deprecated
    public static final String ETAG = "etag";
    @Deprecated
    public static final String TABLE_NAME = "ConfigEtag";
    @Deprecated
    public static final String _ID = "_id";

    public static final class Factory<T extends ConfigEtagModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx GetEtag() {
            return new ainx("SELECT etag FROM ConfigEtag\nWHERE _id = 0", new aioa(ConfigEtagModel.TABLE_NAME));
        }

        public final ainw<String> getEtagMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }
    }

    public interface Creator<T extends ConfigEtagModel> {
        T create(long j, String str);
    }

    public static final class Mapper<T extends ConfigEtagModel> implements ainw<T> {
        private final Factory<T> configEtagModelFactory;

        public Mapper(Factory<T> factory) {
            this.configEtagModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.configEtagModelFactory.creator.create(cursor.getLong(0), cursor.getString(1));
        }
    }

    public static final class InsertOrReplaceEtag extends ainy {
        public InsertOrReplaceEtag(pa paVar) {
            super(ConfigEtagModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO ConfigEtag(_id, etag)\nVALUES (0, ?)"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    long _id();

    String etag();
}

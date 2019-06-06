package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface ConnectedAppScopesModel {
    @Deprecated
    public static final String APPID = "appId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ConnectedAppScopes(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    appId TEXT NOT NULL,\n    name TEXT NOT NULL,\n    description TEXT,\n    toggleable INTEGER,\n    iconUrl TEXT,\n\n    UNIQUE(appId, name)\n)";
    @Deprecated
    public static final String DESCRIPTION = "description";
    @Deprecated
    public static final String ICONURL = "iconUrl";
    @Deprecated
    public static final String NAME = "name";
    @Deprecated
    public static final String TABLE_NAME = "ConnectedAppScopes";
    @Deprecated
    public static final String TOGGLEABLE = "toggleable";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends ConnectedAppScopesModel> {
        T create(long j, String str, String str2, String str3, Boolean bool, String str4);
    }

    public static final class Factory<T extends ConnectedAppScopesModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }
    }

    public static final class Mapper<T extends ConnectedAppScopesModel> implements ainw<T> {
        private final Factory<T> connectedAppScopesModelFactory;

        public Mapper(Factory<T> factory) {
            this.connectedAppScopesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Creator creator = this.connectedAppScopesModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            String string2 = cursor.getString(2);
            String string3 = cursor.isNull(3) ? null : cursor.getString(3);
            if (cursor.isNull(4)) {
                bool = null;
            } else {
                if (cursor.getInt(4) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return creator.create(j, string, string2, string3, bool, cursor.isNull(5) ? null : cursor.getString(5));
        }
    }

    public static final class UpdateScope extends ainy {
        public UpdateScope(pa paVar) {
            super(ConnectedAppScopesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO ConnectedAppScopes(\n    appId,\n    name,\n    description,\n    toggleable,\n    iconUrl)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, String str2, String str3, Boolean bool, String str4) {
            bindString(1, str);
            bindString(2, str2);
            if (str3 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (str4 == null) {
                bindNull(5);
            } else {
                bindString(5, str4);
            }
        }
    }

    long _id();

    String appId();

    String description();

    String iconUrl();

    String name();

    Boolean toggleable();
}

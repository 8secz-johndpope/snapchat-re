package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface ConnectedAppsModel {
    @Deprecated
    public static final String APPICONURL = "appIconUrl";
    @Deprecated
    public static final String APPID = "appId";
    @Deprecated
    public static final String APPNAME = "appName";
    @Deprecated
    public static final String APPSTORYDISPLAYNAME = "appStoryDisplayName";
    @Deprecated
    public static final String APPSTORYICONURL = "appStoryIconUrl";
    @Deprecated
    public static final String APPSTORYTTLDAYS = "appStoryTTLDays";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ConnectedApps(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n   appId TEXT NOT NULL UNIQUE, -- uuid format\n   appName TEXT NOT NULL,\n   appIconUrl TEXT,\n   appStoryDisplayName TEXT,\n   appStoryIconUrl TEXT,\n   appStoryTTLDays INTEGER\n)";
    @Deprecated
    public static final String TABLE_NAME = "ConnectedApps";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends ConnectedAppsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, Long l);
    }

    public static final class Factory<T extends ConnectedAppsModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }
    }

    public static final class Mapper<T extends ConnectedAppsModel> implements ainw<T> {
        private final Factory<T> connectedAppsModelFactory;

        public Mapper(Factory<T> factory) {
            this.connectedAppsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.connectedAppsModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6)));
        }
    }

    public static final class UpdateApp extends ainy {
        public UpdateApp(pa paVar) {
            super(ConnectedAppsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO ConnectedApps(\n    appId,\n    appName,\n    appIconUrl,\n    appStoryDisplayName,\n    appStoryIconUrl,\n    appStoryTTLDays)\nVALUES(?, ?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, Long l) {
            bindString(1, str);
            bindString(2, str2);
            if (str3 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            if (str4 == null) {
                bindNull(4);
            } else {
                bindString(4, str4);
            }
            if (str5 == null) {
                bindNull(5);
            } else {
                bindString(5, str5);
            }
            if (l == null) {
                bindNull(6);
            } else {
                bindLong(6, l.longValue());
            }
        }
    }

    long _id();

    String appIconUrl();

    String appId();

    String appName();

    String appStoryDisplayName();

    String appStoryIconUrl();

    Long appStoryTTLDays();
}

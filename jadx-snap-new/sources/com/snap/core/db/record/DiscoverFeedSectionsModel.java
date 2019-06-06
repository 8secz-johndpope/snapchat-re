package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface DiscoverFeedSectionsModel {
    public static final String ADDUSELARGETILESCOLUMN = "ALTER TABLE DiscoverFeedSections\nADD useLargeTiles INTEGER NOT NULL DEFAULT 0";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS DiscoverFeedSections(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    sectionId INTEGER NOT NULL,\n    loggingKey TEXT,\n    sectionKeyName TEXT,\n    isLocal INTEGER NOT NULL DEFAULT 0,\n    useLargeTiles INTEGER NOT NULL DEFAULT 0\n)";
    @Deprecated
    public static final String ISLOCAL = "isLocal";
    @Deprecated
    public static final String LOGGINGKEY = "loggingKey";
    @Deprecated
    public static final String SECTIONID = "sectionId";
    @Deprecated
    public static final String SECTIONKEYNAME = "sectionKeyName";
    @Deprecated
    public static final String TABLE_NAME = "DiscoverFeedSections";
    @Deprecated
    public static final String USELARGETILES = "useLargeTiles";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends DiscoverFeedSectionsModel> {
        T create(long j, long j2, String str, String str2, boolean z, boolean z2);
    }

    public static final class Factory<T extends DiscoverFeedSectionsModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectAllSections() {
            return new ainx("SELECT * FROM DiscoverFeedSections", new aioa(DiscoverFeedSectionsModel.TABLE_NAME));
        }

        public final Mapper<T> selectAllSectionsMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends DiscoverFeedSectionsModel> implements ainw<T> {
        private final Factory<T> discoverFeedSectionsModelFactory;

        public Mapper(Factory<T> factory) {
            this.discoverFeedSectionsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.discoverFeedSectionsModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            String string = cursor.isNull(2) ? null : cursor.getString(2);
            String string2 = cursor.isNull(3) ? null : cursor.getString(3);
            boolean z2 = cursor.getInt(4) == 1;
            if (cursor.getInt(5) == 1) {
                z = true;
            }
            return creator.create(j, j2, string, string2, z2, z);
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(DiscoverFeedSectionsModel.TABLE_NAME, paVar.a("DELETE FROM DiscoverFeedSections"));
        }
    }

    public static final class InsertSection extends ainy {
        public InsertSection(pa paVar) {
            super(DiscoverFeedSectionsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO DiscoverFeedSections(\n    sectionId,\n    loggingKey,\n    sectionKeyName,\n    isLocal,\n    useLargeTiles)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(long j, String str, String str2, boolean z, boolean z2) {
            bindLong(1, j);
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            long j2 = 1;
            bindLong(4, z ? 1 : 0);
            if (!z2) {
                j2 = 0;
            }
            bindLong(5, j2);
        }
    }

    long _id();

    boolean isLocal();

    String loggingKey();

    long sectionId();

    String sectionKeyName();

    boolean useLargeTiles();
}

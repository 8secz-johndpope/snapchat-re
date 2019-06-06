package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface FriendWhoAddedMeModel {
    @Deprecated
    public static final String ADDED = "added";
    public static final String ADDHASVIEWED = "ALTER TABLE FriendWhoAddedMe\nADD COLUMN hasViewed INTEGER NOT NULL DEFAULT 0";
    @Deprecated
    public static final String ADDSOURCE = "addSource";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS FriendWhoAddedMe(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    friendRowId INTEGER NOT NULL UNIQUE,\n    userId TEXT NOT NULL UNIQUE,\n\n    addSource TEXT,\n\n    added INTEGER DEFAULT 0 NOT NULL,\n    ignored INTEGER DEFAULT 0 NOT NULL,\n    hasViewed INTEGER DEFAULT 0 NOT NULL\n)";
    @Deprecated
    public static final String FRIENDROWID = "friendRowId";
    @Deprecated
    public static final String HASVIEWED = "hasViewed";
    @Deprecated
    public static final String IGNORED = "ignored";
    @Deprecated
    public static final String TABLE_NAME = "FriendWhoAddedMe";
    @Deprecated
    public static final String USERID = "userId";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends FriendWhoAddedMeModel> {
        T create(long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3);
    }

    public static final class Factory<T extends FriendWhoAddedMeModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }
    }

    public static final class Mapper<T extends FriendWhoAddedMeModel> implements ainw<T> {
        private final Factory<T> friendWhoAddedMeModelFactory;

        public Mapper(Factory<T> factory) {
            this.friendWhoAddedMeModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.friendWhoAddedMeModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            String string = cursor.getString(2);
            String string2 = cursor.isNull(3) ? null : cursor.getString(3);
            boolean z2 = cursor.getInt(4) == 1;
            boolean z3 = cursor.getInt(5) == 1;
            if (cursor.getInt(6) == 1) {
                z = true;
            }
            return creator.create(j, j2, string, string2, z2, z3, z);
        }
    }

    public static final class InsertNewRow extends ainy {
        public InsertNewRow(pa paVar) {
            super(FriendWhoAddedMeModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO FriendWhoAddedMe(\n    friendRowId,\n    userId,\n    addSource,\n    added,\n    hasViewed)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(long j, String str, String str2, boolean z, boolean z2) {
            bindLong(1, j);
            bindString(2, str);
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

    public static final class InsertRow extends ainy {
        public InsertRow(pa paVar) {
            super(FriendWhoAddedMeModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO FriendWhoAddedMe(\n    friendRowId,\n    userId,\n    addSource,\n    added)\nVALUES(?, ?, ?, ?)"));
        }

        public final void bind(long j, String str, String str2, boolean z) {
            bindLong(1, j);
            bindString(2, str);
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            bindLong(4, z ? 1 : 0);
        }
    }

    public static final class Purge extends ainy {
        public Purge(pa paVar) {
            super(FriendWhoAddedMeModel.TABLE_NAME, paVar.a("DELETE FROM FriendWhoAddedMe"));
        }
    }

    public static final class RemoveFriendWhoAddedMe extends ainy {
        public RemoveFriendWhoAddedMe(pa paVar) {
            super(FriendWhoAddedMeModel.TABLE_NAME, paVar.a("DELETE FROM FriendWhoAddedMe\nWHERE userId = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class SetAdded extends ainy {
        public SetAdded(pa paVar) {
            super(FriendWhoAddedMeModel.TABLE_NAME, paVar.a("UPDATE FriendWhoAddedMe\nSET added = ?\nWHERE friendRowId = ?"));
        }

        public final void bind(boolean z, long j) {
            bindLong(1, z ? 1 : 0);
            bindLong(2, j);
        }
    }

    public static final class SetIgnored extends ainy {
        public SetIgnored(pa paVar) {
            super(FriendWhoAddedMeModel.TABLE_NAME, paVar.a("UPDATE FriendWhoAddedMe\nSET ignored = ?\nWHERE friendRowId = ?"));
        }

        public final void bind(boolean z, long j) {
            bindLong(1, z ? 1 : 0);
            bindLong(2, j);
        }
    }

    public static final class SetViewed extends ainy {
        public SetViewed(pa paVar) {
            super(FriendWhoAddedMeModel.TABLE_NAME, paVar.a("UPDATE FriendWhoAddedMe\nSET hasViewed = ?\nWHERE friendRowId = ?"));
        }

        public final void bind(boolean z, long j) {
            bindLong(1, z ? 1 : 0);
            bindLong(2, j);
        }
    }

    long _id();

    String addSource();

    boolean added();

    long friendRowId();

    boolean hasViewed();

    boolean ignored();

    String userId();
}

package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface SuggestedFriendModel {
    @Deprecated
    public static final String ADDED = "added";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS SuggestedFriend(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    friendRowId INTEGER NOT NULL UNIQUE,\n    userId TEXT NOT NULL UNIQUE,\n\n    suggestionReason TEXT,\n    suggestionToken TEXT,\n\n    added INTEGER DEFAULT 0 NOT NULL,\n    hidden INTEGER DEFAULT 0 NOT NULL\n)";
    @Deprecated
    public static final String FRIENDROWID = "friendRowId";
    @Deprecated
    public static final String HIDDEN = "hidden";
    @Deprecated
    public static final String SUGGESTIONREASON = "suggestionReason";
    @Deprecated
    public static final String SUGGESTIONTOKEN = "suggestionToken";
    @Deprecated
    public static final String TABLE_NAME = "SuggestedFriend";
    @Deprecated
    public static final String USERID = "userId";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends SuggestedFriendModel> {
        T create(long j, long j2, String str, String str2, String str3, boolean z, boolean z2);
    }

    public static final class Factory<T extends SuggestedFriendModel> {
        public final Creator<T> creator;

        final class SelectAddedByUserIdQuery extends ainx {
            private final String userId;

            SelectAddedByUserIdQuery(String str) {
                super("SELECT added FROM SuggestedFriend\nWHERE userId = ?1", new aioa(SuggestedFriendModel.TABLE_NAME));
                this.userId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.userId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectAddedByUserId(String str) {
            return new SelectAddedByUserIdQuery(str);
        }

        public final ainw<Boolean> selectAddedByUserIdMapper() {
            return new ainw<Boolean>() {
                public Boolean map(Cursor cursor) {
                    boolean z = false;
                    if (cursor.getInt(0) == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
        }
    }

    public static final class Mapper<T extends SuggestedFriendModel> implements ainw<T> {
        private final Factory<T> suggestedFriendModelFactory;

        public Mapper(Factory<T> factory) {
            this.suggestedFriendModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.suggestedFriendModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            String string = cursor.getString(2);
            String string2 = cursor.isNull(3) ? null : cursor.getString(3);
            String string3 = cursor.isNull(4) ? null : cursor.getString(4);
            boolean z2 = cursor.getInt(5) == 1;
            if (cursor.getInt(6) == 1) {
                z = true;
            }
            return creator.create(j, j2, string, string2, string3, z2, z);
        }
    }

    public static final class InsertRow extends ainy {
        public InsertRow(pa paVar) {
            super(SuggestedFriendModel.TABLE_NAME, paVar.a("INSERT INTO SuggestedFriend(\n    friendRowId,\n    userId,\n    suggestionReason,\n    suggestionToken)\nVALUES(?, ?, ?, ?)"));
        }

        public final void bind(long j, String str, String str2, String str3) {
            bindLong(1, j);
            bindString(2, str);
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (str3 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
        }
    }

    public static final class Purge extends ainy {
        public Purge(pa paVar) {
            super(SuggestedFriendModel.TABLE_NAME, paVar.a("DELETE FROM SuggestedFriend"));
        }
    }

    public static final class RemoveSuggestedFriend extends ainy {
        public RemoveSuggestedFriend(pa paVar) {
            super(SuggestedFriendModel.TABLE_NAME, paVar.a("DELETE FROM SuggestedFriend\nWHERE friendRowId = ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class SetAdded extends ainy {
        public SetAdded(pa paVar) {
            super(SuggestedFriendModel.TABLE_NAME, paVar.a("UPDATE SuggestedFriend\nSET added = ?\nWHERE friendRowId = ?"));
        }

        public final void bind(boolean z, long j) {
            bindLong(1, z ? 1 : 0);
            bindLong(2, j);
        }
    }

    public static final class SetHidden extends ainy {
        public SetHidden(pa paVar) {
            super(SuggestedFriendModel.TABLE_NAME, paVar.a("UPDATE SuggestedFriend\nSET hidden = ?\nWHERE friendRowId = ?"));
        }

        public final void bind(boolean z, long j) {
            bindLong(1, z ? 1 : 0);
            bindLong(2, j);
        }
    }

    long _id();

    boolean added();

    long friendRowId();

    boolean hidden();

    String suggestionReason();

    String suggestionToken();

    String userId();
}

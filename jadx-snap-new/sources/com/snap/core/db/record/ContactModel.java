package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface ContactModel {
    @Deprecated
    public static final String ADDED = "added";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Contact(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    friendRowId INTEGER,\n\n    displayName TEXT,\n    phone TEXT NOT NULL,\n    lastModifiedTimestamp INTEGER,\n    isSnapchatter INTEGER DEFAULT 0 NOT NULL,\n\n    added INTEGER DEFAULT 0 NOT NULL\n)";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    @Deprecated
    public static final String FRIENDROWID = "friendRowId";
    @Deprecated
    public static final String ISSNAPCHATTER = "isSnapchatter";
    @Deprecated
    public static final String LASTMODIFIEDTIMESTAMP = "lastModifiedTimestamp";
    @Deprecated
    public static final String PHONE = "phone";
    @Deprecated
    public static final String TABLE_NAME = "Contact";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends ContactModel> {
        T create(long j, Long l, String str, String str2, Long l2, boolean z, boolean z2);
    }

    public static final class Factory<T extends ContactModel> {
        public final Creator<T> creator;

        final class SelectIdForDisplayNameFromContactQuery extends ainx {
            private final String displayName;
            private final boolean isSnapchatter;

            SelectIdForDisplayNameFromContactQuery(String str, boolean z) {
                super("SELECT _id FROM Contact\nWHERE displayName=?1 AND isSnapchatter=?2", new aioa(ContactModel.TABLE_NAME));
                this.displayName = str;
                this.isSnapchatter = z;
            }

            public final void bindTo(pc pcVar) {
                String str = this.displayName;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, this.isSnapchatter ? 1 : 0);
            }
        }

        final class SelectIdForKeyFromContactQuery extends ainx {
            private final Long friendRowId;
            private final boolean isSnapchatter;

            SelectIdForKeyFromContactQuery(Long l, boolean z) {
                super("SELECT _id FROM Contact\nWHERE friendRowId=?1 AND isSnapchatter=?2", new aioa(ContactModel.TABLE_NAME));
                this.friendRowId = l;
                this.isSnapchatter = z;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.friendRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, this.isSnapchatter ? 1 : 0);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectIdForDisplayNameFromContact(String str, boolean z) {
            return new SelectIdForDisplayNameFromContactQuery(str, z);
        }

        public final ainw<Long> selectIdForDisplayNameFromContactMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectIdForKeyFromContact(Long l, boolean z) {
            return new SelectIdForKeyFromContactQuery(l, z);
        }

        public final ainw<Long> selectIdForKeyFromContactMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }
    }

    public static final class Mapper<T extends ContactModel> implements ainw<T> {
        private final Factory<T> contactModelFactory;

        public Mapper(Factory<T> factory) {
            this.contactModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.contactModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            Long l = null;
            Long valueOf = cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1));
            String string = cursor.isNull(2) ? null : cursor.getString(2);
            String string2 = cursor.getString(3);
            if (!cursor.isNull(4)) {
                l = Long.valueOf(cursor.getLong(4));
            }
            Long l2 = l;
            boolean z2 = cursor.getInt(5) == 1;
            if (cursor.getInt(6) == 1) {
                z = true;
            }
            return creator.create(j, valueOf, string, string2, l2, z2, z);
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(ContactModel.TABLE_NAME, paVar.a("DELETE FROM Contact"));
        }
    }

    public static final class InsertRow extends ainy {
        public InsertRow(pa paVar) {
            super(ContactModel.TABLE_NAME, paVar.a("INSERT INTO Contact(\n    friendRowId,\n    displayName,\n    phone,\n    lastModifiedTimestamp,\n    isSnapchatter)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(Long l, String str, String str2, Long l2, boolean z) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
            bindString(3, str2);
            if (l2 == null) {
                bindNull(4);
            } else {
                bindLong(4, l2.longValue());
            }
            bindLong(5, z ? 1 : 0);
        }
    }

    public static final class RemoveAddedContact extends ainy {
        public RemoveAddedContact(pa paVar) {
            super(ContactModel.TABLE_NAME, paVar.a("DELETE FROM Contact\nWHERE added = 1"));
        }
    }

    public static final class SetAdded extends ainy {
        public SetAdded(pa paVar) {
            super(ContactModel.TABLE_NAME, paVar.a("UPDATE Contact\nSET added = ?\nWHERE friendRowId = ?"));
        }

        public final void bind(boolean z, Long l) {
            bindLong(1, z ? 1 : 0);
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
        }
    }

    public static final class UpdateContact extends ainy {
        public UpdateContact(pa paVar) {
            super(ContactModel.TABLE_NAME, paVar.a("UPDATE Contact\nSET displayName=?,\n    phone=?,\n    lastModifiedTimestamp=?,\n    isSnapchatter=?\nWHERE _id=?"));
        }

        public final void bind(String str, String str2, Long l, boolean z, long j) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            bindString(2, str2);
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            bindLong(4, z ? 1 : 0);
            bindLong(5, j);
        }
    }

    long _id();

    boolean added();

    String displayName();

    Long friendRowId();

    boolean isSnapchatter();

    Long lastModifiedTimestamp();

    String phone();
}

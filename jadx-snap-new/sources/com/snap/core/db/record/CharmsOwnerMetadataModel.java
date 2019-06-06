package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface CharmsOwnerMetadataModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS CharmsOwnerMetadata(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    ownerId TEXT NOT NULL UNIQUE,\n    syncToken BLOB NOT NULL,\n    unviewedCount INTEGER NOT NULL DEFAULT 0\n)";
    @Deprecated
    public static final String OWNERID = "ownerId";
    @Deprecated
    public static final String SYNCTOKEN = "syncToken";
    @Deprecated
    public static final String TABLE_NAME = "CharmsOwnerMetadata";
    @Deprecated
    public static final String UNVIEWEDCOUNT = "unviewedCount";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends CharmsOwnerMetadataModel> {
        T create(long j, String str, byte[] bArr, long j2);
    }

    public static final class Factory<T extends CharmsOwnerMetadataModel> {
        public final Creator<T> creator;

        final class SelectTokenForOwnerIdQuery extends ainx {
            private final String ownerId;

            SelectTokenForOwnerIdQuery(String str) {
                super("SELECT syncToken\nFROM CharmsOwnerMetadata\nWHERE ownerId = ?1", new aioa(CharmsOwnerMetadataModel.TABLE_NAME));
                this.ownerId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.ownerId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectTokenForOwnerId(String str) {
            return new SelectTokenForOwnerIdQuery(str);
        }

        public final ainw<byte[]> selectTokenForOwnerIdMapper() {
            return new ainw<byte[]>() {
                public byte[] map(Cursor cursor) {
                    return cursor.getBlob(0);
                }
            };
        }
    }

    public static final class Mapper<T extends CharmsOwnerMetadataModel> implements ainw<T> {
        private final Factory<T> charmsOwnerMetadataModelFactory;

        public Mapper(Factory<T> factory) {
            this.charmsOwnerMetadataModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.charmsOwnerMetadataModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getBlob(2), cursor.getLong(3));
        }
    }

    public static final class InsertToken extends ainy {
        public InsertToken(pa paVar) {
            super(CharmsOwnerMetadataModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO CharmsOwnerMetadata(\n    ownerId,\n    syncToken\n)\nVALUES(?, ?)"));
        }

        public final void bind(String str, byte[] bArr) {
            bindString(1, str);
            bindBlob(2, bArr);
        }
    }

    long _id();

    String ownerId();

    byte[] syncToken();

    long unviewedCount();
}

package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface SnapTokenModel {
    @Deprecated
    public static final String ACCESSTOKENS = "accessTokens";
    @Deprecated
    public static final String ACCESSTOKENSPB = "accessTokensPb";
    public static final String ADDACCESSTOKENSPB = "ALTER TABLE SnapToken\nADD COLUMN accessTokensPb BLOB";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS SnapToken(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    userId TEXT NOT NULL UNIQUE,\n    accessTokens TEXT NOT NULL,\n    refreshToken TEXT NOT NULL,\n    accessTokensPb BLOB\n)";
    @Deprecated
    public static final String REFRESHTOKEN = "refreshToken";
    @Deprecated
    public static final String TABLE_NAME = "SnapToken";
    @Deprecated
    public static final String USERID = "userId";
    @Deprecated
    public static final String _ID = "_id";

    public static final class Factory<T extends SnapTokenModel> {
        public final Creator<T> creator;

        final class GetRefreshTokenByUserIdQuery extends ainx {
            private final String userId;

            GetRefreshTokenByUserIdQuery(String str) {
                super("SELECT refreshToken\nFROM SnapToken\nWHERE userId = ?1", new aioa(SnapTokenModel.TABLE_NAME));
                this.userId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.userId);
            }
        }

        final class GetAccessTokenPbByUserIdQuery extends ainx {
            private final String userId;

            GetAccessTokenPbByUserIdQuery(String str) {
                super("SELECT accessTokensPb\nFROM SnapToken\nWHERE userId = ?1", new aioa(SnapTokenModel.TABLE_NAME));
                this.userId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.userId);
            }
        }

        final class GetAccessTokenByUserIdQuery extends ainx {
            private final String userId;

            GetAccessTokenByUserIdQuery(String str) {
                super("SELECT accessTokens\nFROM SnapToken\nWHERE userId = ?1", new aioa(SnapTokenModel.TABLE_NAME));
                this.userId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.userId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getAccessTokenByUserId(String str) {
            return new GetAccessTokenByUserIdQuery(str);
        }

        public final ainw<String> getAccessTokenByUserIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getAccessTokenPbByUserId(String str) {
            return new GetAccessTokenPbByUserIdQuery(str);
        }

        public final ainw<byte[]> getAccessTokenPbByUserIdMapper() {
            return new ainw<byte[]>() {
                public byte[] map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getBlob(0);
                }
            };
        }

        public final ainx getRefreshTokenByUserId(String str) {
            return new GetRefreshTokenByUserIdQuery(str);
        }

        public final ainw<String> getRefreshTokenByUserIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }
    }

    public interface Creator<T extends SnapTokenModel> {
        T create(long j, String str, String str2, String str3, byte[] bArr);
    }

    public static final class Mapper<T extends SnapTokenModel> implements ainw<T> {
        private final Factory<T> snapTokenModelFactory;

        public Mapper(Factory<T> factory) {
            this.snapTokenModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.snapTokenModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.isNull(4) ? null : cursor.getBlob(4));
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(SnapTokenModel.TABLE_NAME, paVar.a("DELETE FROM SnapToken"));
        }
    }

    public static final class ClearTokensByUserId extends ainy {
        public ClearTokensByUserId(pa paVar) {
            super(SnapTokenModel.TABLE_NAME, paVar.a("DELETE FROM SnapToken\nWHERE userId = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class PutAccessToken extends ainy {
        public PutAccessToken(pa paVar) {
            super(SnapTokenModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO SnapToken(\n    userId,\n    accessTokens,\n    refreshToken,\n    accessTokensPb)\nVALUES(?, ?, ?, ?)"));
        }

        public final void bind(String str, String str2, String str3, byte[] bArr) {
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
            if (bArr == null) {
                bindNull(4);
            } else {
                bindBlob(4, bArr);
            }
        }
    }

    public static final class UpdateAccessToken extends ainy {
        public UpdateAccessToken(pa paVar) {
            super(SnapTokenModel.TABLE_NAME, paVar.a("UPDATE SnapToken\nSET accessTokens = ?\nWHERE userId = ?"));
        }

        public final void bind(String str, String str2) {
            bindString(1, str);
            bindString(2, str2);
        }
    }

    public static final class UpdateAccessTokenPb extends ainy {
        public UpdateAccessTokenPb(pa paVar) {
            super(SnapTokenModel.TABLE_NAME, paVar.a("UPDATE SnapToken\nSET accessTokensPb = ?\nWHERE userId = ?"));
        }

        public final void bind(byte[] bArr, String str) {
            if (bArr == null) {
                bindNull(1);
            } else {
                bindBlob(1, bArr);
            }
            bindString(2, str);
        }
    }

    long _id();

    String accessTokens();

    byte[] accessTokensPb();

    String refreshToken();

    String userId();
}

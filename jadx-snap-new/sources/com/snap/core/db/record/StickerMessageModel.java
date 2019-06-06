package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface StickerMessageModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS StickerMessage(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    packId TEXT,\n    stickerId TEXT,\n    type TEXT,\n    creationTime INTEGER,\n    lastUsedTime INTEGER,\n    faceCutOriginSnapId TEXT,\n    customStickerType TEXT,\n    encKey TEXT,\n    encIv TEXT)";
    @Deprecated
    public static final String CREATIONTIME = "creationTime";
    @Deprecated
    public static final String CUSTOMSTICKERTYPE = "customStickerType";
    @Deprecated
    public static final String ENCIV = "encIv";
    @Deprecated
    public static final String ENCKEY = "encKey";
    @Deprecated
    public static final String FACECUTORIGINSNAPID = "faceCutOriginSnapId";
    @Deprecated
    public static final String LASTUSEDTIME = "lastUsedTime";
    @Deprecated
    public static final String PACKID = "packId";
    @Deprecated
    public static final String STICKERID = "stickerId";
    @Deprecated
    public static final String TABLE_NAME = "StickerMessage";
    @Deprecated
    public static final String TYPE = "type";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends StickerMessageModel> {
        T create(long j, String str, String str2, String str3, Long l, Long l2, String str4, String str5, String str6, String str7);
    }

    public static final class Factory<T extends StickerMessageModel> {
        public final Creator<T> creator;

        final class FindStickerIdQuery extends ainx {
            private final String packId;
            private final String stickerId;

            FindStickerIdQuery(String str, String str2) {
                super("SELECT _id FROM StickerMessage\nWHERE packId = ?1 AND stickerId = ?2", new aioa(StickerMessageModel.TABLE_NAME));
                this.packId = str;
                this.stickerId = str2;
            }

            public final void bindTo(pc pcVar) {
                String str = this.packId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                str = this.stickerId;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetStickerQuery extends ainx {
            private final long _id;

            GetStickerQuery(long j) {
                super("SELECT *\nFROM StickerMessage\nWHERE _id = ?1", new aioa(StickerMessageModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx findStickerId(String str, String str2) {
            return new FindStickerIdQuery(str, str2);
        }

        public final ainw<Long> findStickerIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getSticker(long j) {
            return new GetStickerQuery(j);
        }

        public final Mapper<T> getStickerMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends StickerMessageModel> implements ainw<T> {
        private final Factory<T> stickerMessageModelFactory;

        public Mapper(Factory<T> factory) {
            this.stickerMessageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.stickerMessageModelFactory.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)), cursor.isNull(6) ? null : cursor.getString(6), cursor.isNull(7) ? null : cursor.getString(7), cursor.isNull(8) ? null : cursor.getString(8), cursor.isNull(9) ? null : cursor.getString(9));
        }
    }

    public static final class InsertSticker extends ainy {
        public InsertSticker(pa paVar) {
            super(StickerMessageModel.TABLE_NAME, paVar.a("INSERT INTO StickerMessage(\n    packId,\n    stickerId,\n    type,\n    creationTime,\n    lastUsedTime,\n    faceCutOriginSnapId,\n    customStickerType,\n    encKey,\n    encIv)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, String str2, String str3, Long l, Long l2, String str4, String str5, String str6, String str7) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (str3 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            if (l == null) {
                bindNull(4);
            } else {
                bindLong(4, l.longValue());
            }
            if (l2 == null) {
                bindNull(5);
            } else {
                bindLong(5, l2.longValue());
            }
            if (str4 == null) {
                bindNull(6);
            } else {
                bindString(6, str4);
            }
            if (str5 == null) {
                bindNull(7);
            } else {
                bindString(7, str5);
            }
            if (str6 == null) {
                bindNull(8);
            } else {
                bindString(8, str6);
            }
            if (str7 == null) {
                bindNull(9);
            } else {
                bindString(9, str7);
            }
        }
    }

    public static final class UpdateLastUsedTime extends ainy {
        public UpdateLastUsedTime(pa paVar) {
            super(StickerMessageModel.TABLE_NAME, paVar.a("UPDATE StickerMessage\nSET lastUsedTime = ?\nWHERE _id = ?"));
        }

        public final void bind(Long l, long j) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindLong(2, j);
        }
    }

    long _id();

    Long creationTime();

    String customStickerType();

    String encIv();

    String encKey();

    String faceCutOriginSnapId();

    Long lastUsedTime();

    String packId();

    String stickerId();

    String type();
}

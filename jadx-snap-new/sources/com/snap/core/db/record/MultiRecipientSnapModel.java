package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.model.MessageRecipient;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;
import java.util.List;

public interface MultiRecipientSnapModel {
    public static final String ADDRECIPIENTS = "ALTER TABLE MultiRecipientSnap\nADD recipients TEXT";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS MultiRecipientSnap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    key TEXT NOT NULL UNIQUE,\n    displayName TEXT,\n    displayInteractionType TEXT,\n    lastInteractionTimestamp INTEGER DEFAULT 0,\n    recipients TEXT\n)";
    @Deprecated
    public static final String DISPLAYINTERACTIONTYPE = "displayInteractionType";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    @Deprecated
    public static final String KEY = "key";
    @Deprecated
    public static final String LASTINTERACTIONTIMESTAMP = "lastInteractionTimestamp";
    @Deprecated
    public static final String RECIPIENTS = "recipients";
    @Deprecated
    public static final String TABLE_NAME = "MultiRecipientSnap";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends MultiRecipientSnapModel> {
        T create(long j, String str, String str2, String str3, Long l, List<MessageRecipient> list);
    }

    public static final class Factory<T extends MultiRecipientSnapModel> {
        public final Creator<T> creator;
        public final ainu<List<MessageRecipient>, String> recipientsAdapter;

        final class GetMultiRecipientKeyForIdQuery extends ainx {
            private final long _id;

            GetMultiRecipientKeyForIdQuery(long j) {
                super("SELECT key\nFROM MultiRecipientSnap\nWHERE _id=?1\nLIMIT 1", new aioa(MultiRecipientSnapModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetMultiRecipientSnapIdForKeyQuery extends ainx {
            private final String key;

            GetMultiRecipientSnapIdForKeyQuery(String str) {
                super("SELECT _id\nFROM MultiRecipientSnap\nWHERE key=?1\nLIMIT 1", new aioa(MultiRecipientSnapModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetRecipientsForKeyQuery extends ainx {
            private final String key;

            GetRecipientsForKeyQuery(String str) {
                super("SELECT recipients\nFROM MultiRecipientSnap\nWHERE key=?1\nLIMIT 1", new aioa(MultiRecipientSnapModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        public Factory(Creator<T> creator, ainu<List<MessageRecipient>, String> ainu) {
            this.creator = creator;
            this.recipientsAdapter = ainu;
        }

        public final ainx getMultiRecipientKeyForId(long j) {
            return new GetMultiRecipientKeyForIdQuery(j);
        }

        public final ainw<String> getMultiRecipientKeyForIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getMultiRecipientSnapIdForKey(String str) {
            return new GetMultiRecipientSnapIdForKeyQuery(str);
        }

        public final ainw<Long> getMultiRecipientSnapIdForKeyMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getRecipientsForKey(String str) {
            return new GetRecipientsForKeyQuery(str);
        }

        public final ainw<List<MessageRecipient>> getRecipientsForKeyMapper() {
            return new ainw<List<MessageRecipient>>() {
                public List<MessageRecipient> map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (List) Factory.this.recipientsAdapter.decode(cursor.getString(0));
                }
            };
        }

        public final ainx selectMultiRecipientSnaps() {
            return new ainx("SELECT\n    _id,\n    key,\n    displayName,\n    displayInteractionType,\n    lastInteractionTimestamp\nFROM MultiRecipientSnap\nORDER BY lastInteractionTimestamp DESC", new aioa(MultiRecipientSnapModel.TABLE_NAME));
        }

        public final <R extends SelectMultiRecipientSnapsModel> SelectMultiRecipientSnapsMapper<R> selectMultiRecipientSnapsMapper(SelectMultiRecipientSnapsCreator<R> selectMultiRecipientSnapsCreator) {
            return new SelectMultiRecipientSnapsMapper(selectMultiRecipientSnapsCreator);
        }
    }

    public interface SelectMultiRecipientSnapsCreator<T extends SelectMultiRecipientSnapsModel> {
        T create(long j, String str, String str2, String str3, Long l);
    }

    public interface SelectMultiRecipientSnapsModel {
        long _id();

        String displayInteractionType();

        String displayName();

        String key();

        Long lastInteractionTimestamp();
    }

    public static final class Mapper<T extends MultiRecipientSnapModel> implements ainw<T> {
        private final Factory<T> multiRecipientSnapModelFactory;

        public Mapper(Factory<T> factory) {
            this.multiRecipientSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.multiRecipientSnapModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.isNull(5) ? null : (List) this.multiRecipientSnapModelFactory.recipientsAdapter.decode(cursor.getString(5)));
        }
    }

    public static final class SelectMultiRecipientSnapsMapper<T extends SelectMultiRecipientSnapsModel> implements ainw<T> {
        private final SelectMultiRecipientSnapsCreator<T> creator;

        public SelectMultiRecipientSnapsMapper(SelectMultiRecipientSnapsCreator<T> selectMultiRecipientSnapsCreator) {
            this.creator = selectMultiRecipientSnapsCreator;
        }

        public final T map(Cursor cursor) {
            SelectMultiRecipientSnapsCreator selectMultiRecipientSnapsCreator = this.creator;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            Long l = null;
            String string2 = cursor.isNull(2) ? null : cursor.getString(2);
            String string3 = cursor.isNull(3) ? null : cursor.getString(3);
            if (!cursor.isNull(4)) {
                l = Long.valueOf(cursor.getLong(4));
            }
            return selectMultiRecipientSnapsCreator.create(j, string, string2, string3, l);
        }
    }

    public static final class DeleteMultiRecipientSnapForKey extends ainy {
        public DeleteMultiRecipientSnapForKey(pa paVar) {
            super(MultiRecipientSnapModel.TABLE_NAME, paVar.a("DELETE\nFROM MultiRecipientSnap\nWHERE key=?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertMultiRecipientSnap extends ainy {
        public InsertMultiRecipientSnap(pa paVar) {
            super(MultiRecipientSnapModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO MultiRecipientSnap(\n    key,\n    displayName,\n    lastInteractionTimestamp,\n    displayInteractionType)\nVALUES(?, ?, ?, ?)"));
        }

        public final void bind(String str, String str2, Long l, String str3) {
            bindString(1, str);
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            if (str3 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
        }
    }

    public static final class InsertMultiRecipientSnapWithRecipients extends ainy {
        private final Factory<? extends MultiRecipientSnapModel> multiRecipientSnapModelFactory;

        public InsertMultiRecipientSnapWithRecipients(pa paVar, Factory<? extends MultiRecipientSnapModel> factory) {
            super(MultiRecipientSnapModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO MultiRecipientSnap(\n    key,\n    displayName,\n    lastInteractionTimestamp,\n    displayInteractionType,\n    recipients)\nVALUES(?, ?, ?, ?, ?)"));
            this.multiRecipientSnapModelFactory = factory;
        }

        public final void bind(String str, String str2, Long l, String str3, List<MessageRecipient> list) {
            bindString(1, str);
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            if (str3 == null) {
                bindNull(4);
            } else {
                bindString(4, str3);
            }
            if (list == null) {
                bindNull(5);
            } else {
                bindString(5, (String) this.multiRecipientSnapModelFactory.recipientsAdapter.encode(list));
            }
        }
    }

    public static final class SetDisplayInteractionTypeForMultiRecipientSnaps extends ainy {
        public SetDisplayInteractionTypeForMultiRecipientSnaps(pa paVar) {
            super(MultiRecipientSnapModel.TABLE_NAME, paVar.a("UPDATE MultiRecipientSnap\nSET displayInteractionType = ?\nWHERE displayInteractionType = ? AND lastInteractionTimestamp < ?"));
        }

        public final void bind(String str, String str2, Long l) {
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
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
        }
    }

    long _id();

    String displayInteractionType();

    String displayName();

    String key();

    Long lastInteractionTimestamp();

    List<MessageRecipient> recipients();
}

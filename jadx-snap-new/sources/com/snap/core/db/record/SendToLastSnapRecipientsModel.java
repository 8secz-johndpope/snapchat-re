package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeedKind;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface SendToLastSnapRecipientsModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS SendToLastSnapRecipients(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    key TEXT NOT NULL, -- feed id for groups, userId for friends\n    feedKind INTEGER,\n    selectionTimestamp INTEGER\n)";
    @Deprecated
    public static final String FEEDKIND = "feedKind";
    @Deprecated
    public static final String KEY = "key";
    @Deprecated
    public static final String SELECTIONTIMESTAMP = "selectionTimestamp";
    @Deprecated
    public static final String TABLE_NAME = "SendToLastSnapRecipients";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends SendToLastSnapRecipientsModel> {
        T create(long j, String str, FeedKind feedKind, Long l);
    }

    public static final class Factory<T extends SendToLastSnapRecipientsModel> {
        public final Creator<T> creator;
        public final ainu<FeedKind, Long> feedKindAdapter;

        public Factory(Creator<T> creator, ainu<FeedKind, Long> ainu) {
            this.creator = creator;
            this.feedKindAdapter = ainu;
        }
    }

    public static final class Mapper<T extends SendToLastSnapRecipientsModel> implements ainw<T> {
        private final Factory<T> sendToLastSnapRecipientsModelFactory;

        public Mapper(Factory<T> factory) {
            this.sendToLastSnapRecipientsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.sendToLastSnapRecipientsModelFactory.creator;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            Long l = null;
            FeedKind feedKind = cursor.isNull(2) ? null : (FeedKind) this.sendToLastSnapRecipientsModelFactory.feedKindAdapter.decode(Long.valueOf(cursor.getLong(2)));
            if (!cursor.isNull(3)) {
                l = Long.valueOf(cursor.getLong(3));
            }
            return creator.create(j, string, feedKind, l);
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(SendToLastSnapRecipientsModel.TABLE_NAME, paVar.a("DELETE FROM SendToLastSnapRecipients"));
        }
    }

    public static final class InsertRow extends ainy {
        private final Factory<? extends SendToLastSnapRecipientsModel> sendToLastSnapRecipientsModelFactory;

        public InsertRow(pa paVar, Factory<? extends SendToLastSnapRecipientsModel> factory) {
            super(SendToLastSnapRecipientsModel.TABLE_NAME, paVar.a("INSERT INTO SendToLastSnapRecipients(\n    key,\n    feedKind,\n    selectionTimestamp)\nVALUES(?, ?, ?)"));
            this.sendToLastSnapRecipientsModelFactory = factory;
        }

        public final void bind(String str, FeedKind feedKind, Long l) {
            bindString(1, str);
            if (feedKind == null) {
                bindNull(2);
            } else {
                bindLong(2, ((Long) this.sendToLastSnapRecipientsModelFactory.feedKindAdapter.encode(feedKind)).longValue());
            }
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
        }
    }

    long _id();

    FeedKind feedKind();

    String key();

    Long selectionTimestamp();
}

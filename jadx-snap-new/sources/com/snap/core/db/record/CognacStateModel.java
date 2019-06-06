package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface CognacStateModel {
    @Deprecated
    public static final String CONVERSATIONID = "conversationId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS CognacState (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    conversationId TEXT NOT NULL UNIQUE,\n    lastInteractionTimestamp INTEGER NOT NULL\n)";
    @Deprecated
    public static final String LASTINTERACTIONTIMESTAMP = "lastInteractionTimestamp";
    @Deprecated
    public static final String TABLE_NAME = "CognacState";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends CognacStateModel> {
        T create(long j, String str, long j2);
    }

    public static final class Factory<T extends CognacStateModel> {
        public final Creator<T> creator;

        final class SelectStateForConversationQuery extends ainx {
            private final String conversationId;

            SelectStateForConversationQuery(String str) {
                super("SELECT *\nFROM CognacState\nWHERE conversationId = ?1", new aioa(CognacStateModel.TABLE_NAME));
                this.conversationId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.conversationId);
            }
        }

        final class SelectStateForConversationsQuery extends ainx {
            private final String[] conversationId;

            SelectStateForConversationsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM CognacState\nWHERE conversationId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(CognacStateModel.TABLE_NAME));
                this.conversationId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.conversationId;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectStateForConversation(String str) {
            return new SelectStateForConversationQuery(str);
        }

        public final Mapper<T> selectStateForConversationMapper() {
            return new Mapper(this);
        }

        public final ainx selectStateForConversations(String[] strArr) {
            return new SelectStateForConversationsQuery(strArr);
        }

        public final Mapper<T> selectStateForConversationsMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends CognacStateModel> implements ainw<T> {
        private final Factory<T> cognacStateModelFactory;

        public Mapper(Factory<T> factory) {
            this.cognacStateModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.cognacStateModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getLong(2));
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(CognacStateModel.TABLE_NAME, paVar.a("DELETE FROM CognacState"));
        }
    }

    public static final class InsertRow extends ainy {
        public InsertRow(pa paVar) {
            super(CognacStateModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO CognacState(\n    conversationId,\n    lastInteractionTimestamp)\nVALUES(?,?)"));
        }

        public final void bind(String str, long j) {
            bindString(1, str);
            bindLong(2, j);
        }
    }

    long _id();

    String conversationId();

    long lastInteractionTimestamp();
}

package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface TalkAuthContextModel {
    @Deprecated
    public static final String CONVERSATIONID = "conversationId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS TalkAuthContext (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    conversationId TEXT NOT NULL,\n    sessionType TEXT NOT NULL,\n    sessionId TEXT NOT NULL,\n\n    scopeId TEXT NOT NULL,\n    mac TEXT NOT NULL,\n    token TEXT NOT NULL,\n\n    UNIQUE(conversationId, sessionType, sessionId) ON CONFLICT REPLACE\n)";
    @Deprecated
    public static final String MAC = "mac";
    @Deprecated
    public static final String SCOPEID = "scopeId";
    @Deprecated
    public static final String SESSIONID = "sessionId";
    @Deprecated
    public static final String SESSIONTYPE = "sessionType";
    @Deprecated
    public static final String TABLE_NAME = "TalkAuthContext";
    @Deprecated
    public static final String TOKEN = "token";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends TalkAuthContextModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6);
    }

    public static final class Factory<T extends TalkAuthContextModel> {
        public final Creator<T> creator;

        final class SelectTalkAuthContextQuery extends ainx {
            private final String conversationId;
            private final String sessionId;
            private final String sessionType;

            SelectTalkAuthContextQuery(String str, String str2, String str3) {
                super("SELECT scopeId, mac, token\nFROM TalkAuthContext\nWHERE conversationId = ?1 AND sessionType = ?2 AND sessionId = ?3\nLIMIT 1", new aioa(TalkAuthContextModel.TABLE_NAME));
                this.conversationId = str;
                this.sessionType = str2;
                this.sessionId = str3;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.conversationId);
                pcVar.bindString(2, this.sessionType);
                pcVar.bindString(3, this.sessionId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectAllFromTalkAuthContext() {
            return new ainx("SELECT _id, conversationId, sessionType, sessionId, scopeId, mac, token\nFROM TalkAuthContext", new aioa(TalkAuthContextModel.TABLE_NAME));
        }

        public final <R extends SelectAllFromTalkAuthContextModel> SelectAllFromTalkAuthContextMapper<R> selectAllFromTalkAuthContextMapper(SelectAllFromTalkAuthContextCreator<R> selectAllFromTalkAuthContextCreator) {
            return new SelectAllFromTalkAuthContextMapper(selectAllFromTalkAuthContextCreator);
        }

        public final ainx selectTalkAuthContext(String str, String str2, String str3) {
            return new SelectTalkAuthContextQuery(str, str2, str3);
        }

        public final <R extends SelectTalkAuthContextModel> SelectTalkAuthContextMapper<R> selectTalkAuthContextMapper(SelectTalkAuthContextCreator<R> selectTalkAuthContextCreator) {
            return new SelectTalkAuthContextMapper(selectTalkAuthContextCreator);
        }
    }

    public interface SelectAllFromTalkAuthContextCreator<T extends SelectAllFromTalkAuthContextModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6);
    }

    public interface SelectAllFromTalkAuthContextModel {
        long _id();

        String conversationId();

        String mac();

        String scopeId();

        String sessionId();

        String sessionType();

        String token();
    }

    public interface SelectTalkAuthContextCreator<T extends SelectTalkAuthContextModel> {
        T create(String str, String str2, String str3);
    }

    public interface SelectTalkAuthContextModel {
        String mac();

        String scopeId();

        String token();
    }

    public static final class Mapper<T extends TalkAuthContextModel> implements ainw<T> {
        private final Factory<T> talkAuthContextModelFactory;

        public Mapper(Factory<T> factory) {
            this.talkAuthContextModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.talkAuthContextModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
        }
    }

    public static final class SelectAllFromTalkAuthContextMapper<T extends SelectAllFromTalkAuthContextModel> implements ainw<T> {
        private final SelectAllFromTalkAuthContextCreator<T> creator;

        public SelectAllFromTalkAuthContextMapper(SelectAllFromTalkAuthContextCreator<T> selectAllFromTalkAuthContextCreator) {
            this.creator = selectAllFromTalkAuthContextCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6));
        }
    }

    public static final class SelectTalkAuthContextMapper<T extends SelectTalkAuthContextModel> implements ainw<T> {
        private final SelectTalkAuthContextCreator<T> creator;

        public SelectTalkAuthContextMapper(SelectTalkAuthContextCreator<T> selectTalkAuthContextCreator) {
            this.creator = selectTalkAuthContextCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getString(1), cursor.getString(2));
        }
    }

    public static final class DeleteTalkAuthContext extends ainy {
        public DeleteTalkAuthContext(pa paVar) {
            super(TalkAuthContextModel.TABLE_NAME, paVar.a("DELETE FROM TalkAuthContext\nWHERE conversationId = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertTalkAuthContext extends ainy {
        public InsertTalkAuthContext(pa paVar) {
            super(TalkAuthContextModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO TalkAuthContext(conversationId, sessionType, sessionId, scopeId, mac, token)\nVALUES (?, ?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6) {
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
            bindString(4, str4);
            bindString(5, str5);
            bindString(6, str6);
        }
    }

    long _id();

    String conversationId();

    String mac();

    String scopeId();

    String sessionId();

    String sessionType();

    String token();
}

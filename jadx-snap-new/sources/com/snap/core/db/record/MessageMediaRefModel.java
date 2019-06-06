package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface MessageMediaRefModel {
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS MessageMediaRef(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    messageId TEXT NOT NULL,  -- NOT UNIQUE, the same message can have multiple actions performed ON it \n    mediaType INTEGER NOT NULL,\n    uri TEXT NOT NULL\n)";
    @Deprecated
    public static final String MEDIATYPE = "mediaType";
    @Deprecated
    public static final String MESSAGEID = "messageId";
    @Deprecated
    public static final String TABLE_NAME = "MessageMediaRef";
    @Deprecated
    public static final String URI = "uri";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends MessageMediaRefModel> {
        T create(long j, String str, long j2, String str2);
    }

    public static final class Factory<T extends MessageMediaRefModel> {
        public final Creator<T> creator;

        final class GetMediaRefsByMessageIdQuery extends ainx {
            private final String messageId;

            GetMediaRefsByMessageIdQuery(String str) {
                super("SELECT *\nFROM MessageMediaRef\nWHERE messageId = ?1", new aioa(MessageMediaRefModel.TABLE_NAME));
                this.messageId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getMediaRefsByMessageId(String str) {
            return new GetMediaRefsByMessageIdQuery(str);
        }

        public final Mapper<T> getMediaRefsByMessageIdMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends MessageMediaRefModel> implements ainw<T> {
        private final Factory<T> messageMediaRefModelFactory;

        public Mapper(Factory<T> factory) {
            this.messageMediaRefModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.messageMediaRefModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getLong(2), cursor.getString(3));
        }
    }

    public static final class DeleteMediaRefs extends ainy {
        public DeleteMediaRefs(pa paVar) {
            super(MessageMediaRefModel.TABLE_NAME, paVar.a("DELETE FROM MessageMediaRef\nWHERE messageId = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertMediaRef extends ainy {
        public InsertMediaRef(pa paVar) {
            super(MessageMediaRefModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO MessageMediaRef (\n    messageId,\n    mediaType,\n    uri\n)\nVALUES(?,?, ?)"));
        }

        public final void bind(String str, long j, String str2) {
            bindString(1, str);
            bindLong(2, j);
            bindString(3, str2);
        }
    }

    long _id();

    long mediaType();

    String messageId();

    String uri();
}

package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface ChatAttachmentsModel {
    @Deprecated
    public static final String ATTACHEDCONTENT = "attachedContent";
    @Deprecated
    public static final String ATTACHEDDISPLAYNAME = "attachedDisplayName";
    @Deprecated
    public static final String ATTACHEDURL = "attachedUrl";
    @Deprecated
    public static final String ATTACHEDUSERID = "attachedUserId";
    @Deprecated
    public static final String ATTACHEDUSERNAME = "attachedUsername";
    @Deprecated
    public static final String CONVERSATIONID = "conversationId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ChatAttachments(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    type TEXT NOT NULL,\n    conversationId TEXT NOT NULL,\n    thumbnailUrl TEXT,\n    attachedContent TEXT NOT NULL,\n    attachedUrl TEXT,\n\n    -- for snapchatters --\n    attachedUserId TEXT,\n    attachedUsername TEXT,\n    attachedDisplayName TEXT,\n\n    -- for sender --\n    senderUserId TEXT,\n    senderUsername TEXT,\n    senderDisplayName TEXT,\n    sentTimestamp INTEGER NOT NULL,\n\n    savedTimestamp INTEGER\n)";
    @Deprecated
    public static final String SAVEDTIMESTAMP = "savedTimestamp";
    @Deprecated
    public static final String SENDERDISPLAYNAME = "senderDisplayName";
    @Deprecated
    public static final String SENDERUSERID = "senderUserId";
    @Deprecated
    public static final String SENDERUSERNAME = "senderUsername";
    @Deprecated
    public static final String SENTTIMESTAMP = "sentTimestamp";
    @Deprecated
    public static final String TABLE_NAME = "ChatAttachments";
    @Deprecated
    public static final String THUMBNAILURL = "thumbnailUrl";
    @Deprecated
    public static final String TYPE = "type";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends ChatAttachmentsModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j2, Long l);
    }

    public static final class Factory<T extends ChatAttachmentsModel> {
        public final Creator<T> creator;

        final class SelectAttachemntsForConversationIdQuery extends ainx {
            private final String conversationId;

            SelectAttachemntsForConversationIdQuery(String str) {
                super("SELECT\n    type,\n    conversationId,\n    thumbnailUrl,\n    attachedContent,\n    attachedUrl,\n    attachedUserId,\n    attachedUsername,\n    attachedDisplayName,\n    senderUserId,\n    senderUsername,\n    senderDisplayName,\n    sentTimestamp,\n    savedTimestamp\nFROM ChatAttachments\nWHERE conversationId = ?1", new aioa(ChatAttachmentsModel.TABLE_NAME));
                this.conversationId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.conversationId);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectAttachemntsForConversationId(String str) {
            return new SelectAttachemntsForConversationIdQuery(str);
        }

        public final <R extends SelectAttachemntsForConversationIdModel> SelectAttachemntsForConversationIdMapper<R> selectAttachemntsForConversationIdMapper(SelectAttachemntsForConversationIdCreator<R> selectAttachemntsForConversationIdCreator) {
            return new SelectAttachemntsForConversationIdMapper(selectAttachemntsForConversationIdCreator);
        }
    }

    public interface SelectAttachemntsForConversationIdCreator<T extends SelectAttachemntsForConversationIdModel> {
        T create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, Long l);
    }

    public interface SelectAttachemntsForConversationIdModel {
        String attachedContent();

        String attachedDisplayName();

        String attachedUrl();

        String attachedUserId();

        String attachedUsername();

        String conversationId();

        Long savedTimestamp();

        String senderDisplayName();

        String senderUserId();

        String senderUsername();

        long sentTimestamp();

        String thumbnailUrl();

        String type();
    }

    public static final class Mapper<T extends ChatAttachmentsModel> implements ainw<T> {
        private final Factory<T> chatAttachmentsModelFactory;

        public Mapper(Factory<T> factory) {
            this.chatAttachmentsModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.chatAttachmentsModelFactory.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getString(2), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.getLong(12), cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13)));
        }
    }

    public static final class SelectAttachemntsForConversationIdMapper<T extends SelectAttachemntsForConversationIdModel> implements ainw<T> {
        private final SelectAttachemntsForConversationIdCreator<T> creator;

        public SelectAttachemntsForConversationIdMapper(SelectAttachemntsForConversationIdCreator<T> selectAttachemntsForConversationIdCreator) {
            this.creator = selectAttachemntsForConversationIdCreator;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getString(0), cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.getLong(11), cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)));
        }
    }

    public static final class InsertAttachment extends ainy {
        public InsertAttachment(pa paVar) {
            super(ChatAttachmentsModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO ChatAttachments(\n    type,\n    conversationId,\n    thumbnailUrl,\n    attachedContent,\n    attachedUrl,\n    attachedUserId,\n    attachedUsername,\n    attachedDisplayName,\n    senderUserId,\n    senderUsername,\n    senderDisplayName,\n    sentTimestamp,\n    savedTimestamp\n)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, Long l) {
            bindString(1, str);
            bindString(2, str2);
            if (str3 == null) {
                bindNull(3);
            } else {
                bindString(3, str3);
            }
            bindString(4, str4);
            if (str5 == null) {
                bindNull(5);
            } else {
                bindString(5, str5);
            }
            if (str6 == null) {
                bindNull(6);
            } else {
                bindString(6, str6);
            }
            if (str7 == null) {
                bindNull(7);
            } else {
                bindString(7, str7);
            }
            if (str8 == null) {
                bindNull(8);
            } else {
                bindString(8, str8);
            }
            if (str9 == null) {
                bindNull(9);
            } else {
                bindString(9, str9);
            }
            if (str10 == null) {
                bindNull(10);
            } else {
                bindString(10, str10);
            }
            if (str11 == null) {
                bindNull(11);
            } else {
                bindString(11, str11);
            }
            bindLong(12, j);
            if (l == null) {
                bindNull(13);
            } else {
                bindLong(13, l.longValue());
            }
        }
    }

    public static final class RemoveAttachmentsForChat extends ainy {
        public RemoveAttachmentsForChat(pa paVar) {
            super(ChatAttachmentsModel.TABLE_NAME, paVar.a("DELETE FROM ChatAttachments\nWHERE conversationId = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    long _id();

    String attachedContent();

    String attachedDisplayName();

    String attachedUrl();

    String attachedUserId();

    String attachedUsername();

    String conversationId();

    Long savedTimestamp();

    String senderDisplayName();

    String senderUserId();

    String senderUsername();

    long sentTimestamp();

    String thumbnailUrl();

    String type();
}

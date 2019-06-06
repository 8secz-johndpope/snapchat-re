package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.MessageClientStatus;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface MultiRecipientSendingSnapModel {
    @Deprecated
    public static final String CLIENTSTATUS = "clientStatus";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS MultiRecipientSendingSnap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    -- Concatenation of recipients' user name and group id.\n    recipientsList TEXT NOT NULL,\n    -- Concatenation of recipient's display name.\n    -- Is shown as primary text on feed cell.\n    feedDisplayName TEXT NOT NULL,\n    -- LocalMessageAction's messageId.\n    messageId TEXT NOT NULL,\n    clientStatus INTEGER NOT NULL,\n    -- last update timestamp\n    timestamp INTEGER NOT NULL DEFAULT 0,\n\n    -- A group of recipients can have multiple sending messages.\n    UNIQUE(recipientsList, messageId)\n)";
    @Deprecated
    public static final String FEEDDISPLAYNAME = "feedDisplayName";
    @Deprecated
    public static final String MESSAGEID = "messageId";
    @Deprecated
    public static final String RECIPIENTSLIST = "recipientsList";
    @Deprecated
    public static final String TABLE_NAME = "MultiRecipientSendingSnap";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends MultiRecipientSendingSnapModel> {
        T create(long j, String str, String str2, String str3, MessageClientStatus messageClientStatus, long j2);
    }

    public interface GetSendingMessagesCreator<T extends GetSendingMessagesModel> {
        T create(long j, String str, String str2, String str3, MessageClientStatus messageClientStatus, long j2);
    }

    public static final class Factory<T extends MultiRecipientSendingSnapModel> {
        public final ainu<MessageClientStatus, Long> clientStatusAdapter;
        public final Creator<T> creator;

        public Factory(Creator<T> creator, ainu<MessageClientStatus, Long> ainu) {
            this.creator = creator;
            this.clientStatusAdapter = ainu;
        }

        public final ainx getSendingMessages() {
            return new ainx("SELECT\n    MultiRecipientSendingSnap._id,\n    MultiRecipientSendingSnap.recipientsList,\n    MultiRecipientSendingSnap.feedDisplayName,\n    MultiRecipientSendingSnap.messageId,\n    MultiRecipientSendingSnap.clientStatus,\n    MultiRecipientSendingSnap.timestamp\nFROM MultiRecipientSendingSnap", new aioa(MultiRecipientSendingSnapModel.TABLE_NAME));
        }

        public final <R extends GetSendingMessagesModel> GetSendingMessagesMapper<R, T> getSendingMessagesMapper(GetSendingMessagesCreator<R> getSendingMessagesCreator) {
            return new GetSendingMessagesMapper(getSendingMessagesCreator, this);
        }
    }

    public static final class GetSendingMessagesMapper<T extends GetSendingMessagesModel, T1 extends MultiRecipientSendingSnapModel> implements ainw<T> {
        private final GetSendingMessagesCreator<T> creator;
        private final Factory<T1> multiRecipientSendingSnapModelFactory;

        public GetSendingMessagesMapper(GetSendingMessagesCreator<T> getSendingMessagesCreator, Factory<T1> factory) {
            this.creator = getSendingMessagesCreator;
            this.multiRecipientSendingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), (MessageClientStatus) this.multiRecipientSendingSnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor.getLong(4))), cursor.getLong(5));
        }
    }

    public interface GetSendingMessagesModel {
        long _id();

        MessageClientStatus clientStatus();

        String feedDisplayName();

        String messageId();

        String recipientsList();

        long timestamp();
    }

    public static final class Mapper<T extends MultiRecipientSendingSnapModel> implements ainw<T> {
        private final Factory<T> multiRecipientSendingSnapModelFactory;

        public Mapper(Factory<T> factory) {
            this.multiRecipientSendingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.multiRecipientSendingSnapModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), (MessageClientStatus) this.multiRecipientSendingSnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor.getLong(4))), cursor.getLong(5));
        }
    }

    public static final class DeleteSendingFeedCell extends ainy {
        public DeleteSendingFeedCell(pa paVar) {
            super(MultiRecipientSendingSnapModel.TABLE_NAME, paVar.a("DELETE FROM MultiRecipientSendingSnap\nWHERE recipientsList = ?1"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class DeleteSendingFeedCellForMessage extends ainy {
        public DeleteSendingFeedCellForMessage(pa paVar) {
            super(MultiRecipientSendingSnapModel.TABLE_NAME, paVar.a("DELETE FROM MultiRecipientSendingSnap\nWHERE recipientsList = ?1 AND messageId = ?2"));
        }

        public final void bind(String str, String str2) {
            bindString(1, str);
            bindString(2, str2);
        }
    }

    public static final class SetSendingMessage extends ainy {
        private final Factory<? extends MultiRecipientSendingSnapModel> multiRecipientSendingSnapModelFactory;

        public SetSendingMessage(pa paVar, Factory<? extends MultiRecipientSendingSnapModel> factory) {
            super(MultiRecipientSendingSnapModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO MultiRecipientSendingSnap(\n    recipientsList,\n    feedDisplayName,\n    messageId,\n    clientStatus,\n    timestamp\n)\nVALUES(?1, ?2, ?3, ?4, ?5)"));
            this.multiRecipientSendingSnapModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, MessageClientStatus messageClientStatus, long j) {
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
            bindLong(4, ((Long) this.multiRecipientSendingSnapModelFactory.clientStatusAdapter.encode(messageClientStatus)).longValue());
            bindLong(5, j);
        }
    }

    long _id();

    MessageClientStatus clientStatus();

    String feedDisplayName();

    String messageId();

    String recipientsList();

    long timestamp();
}

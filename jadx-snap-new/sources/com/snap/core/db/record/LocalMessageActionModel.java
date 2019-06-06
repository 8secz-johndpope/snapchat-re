package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.model.MessageRecipient;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gci;
import defpackage.gcj;
import defpackage.pa;
import defpackage.pc;
import java.util.List;

public interface LocalMessageActionModel {
    @Deprecated
    public static final String ACTIONTIMESTAMP = "actionTimestamp";
    @Deprecated
    public static final String ACTIONTYPE = "actionType";
    public static final String ADDSCREENSHOTTEDORREPLAYED = "ALTER TABLE LocalMessageAction\nADD screenshottedOrReplayed TEXT";
    public static final String ADDSNAPSERVERSTATUS = "ALTER TABLE LocalMessageAction\nADD snapServerStatus TEXT";
    @Deprecated
    public static final String ANALYTICS = "analytics";
    @Deprecated
    public static final String CLIENTSTATUS = "clientStatus";
    @Deprecated
    public static final String CONTENT = "content";
    @Deprecated
    public static final String CONVERSATIONID = "conversationId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS LocalMessageAction(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    actionType INTEGER NOT NULL,\n    actionTimestamp INTEGER NOT NULL,\n\n    messageId TEXT NOT NULL,  -- NOT UNIQUE, the same message can have multiple actions performed ON it \n    conversationId TEXT,\n\n    sentTimestamp INTEGER,\n    seenTimestamp INTEGER,\n\n     -- reference to the user in the friends table \n    senderUserId INTEGER,\n\n    sequenceNumber INTEGER,\n    groupVersion INTEGER,\n\n     -- These will both be comma separated lists of FK references to users in the friends table by _id \n    seenBy TEXT,\n    recipientUserIds TEXT,\n\n     -- preservation state \n    preserved INTEGER,\n\n    currentUserSaved INTEGER,\n    currentUserSaveVersion INTEGER,\n\n    clientStatus INTEGER,\n\n     -- The content to render for the message, the \"messageType\" should describe this content and indicate who can render it \n    messageType TEXT,\n    content BLOB,\n    analytics BLOB,\n\n    recipients TEXT,\n\n    -- Snap Specific attributes\n    screenshottedOrReplayed TEXT,\n    snapServerStatus TEXT\n    -- lastInteraction timestamp can be derived from the actionTimestamp\n)";
    @Deprecated
    public static final String CURRENTUSERSAVED = "currentUserSaved";
    @Deprecated
    public static final String CURRENTUSERSAVEVERSION = "currentUserSaveVersion";
    @Deprecated
    public static final String GROUPVERSION = "groupVersion";
    @Deprecated
    public static final String MESSAGEID = "messageId";
    @Deprecated
    public static final String MESSAGETYPE = "messageType";
    @Deprecated
    public static final String PRESERVED = "preserved";
    @Deprecated
    public static final String RECIPIENTS = "recipients";
    @Deprecated
    public static final String RECIPIENTUSERIDS = "recipientUserIds";
    @Deprecated
    public static final String SCREENSHOTTEDORREPLAYED = "screenshottedOrReplayed";
    @Deprecated
    public static final String SEENBY = "seenBy";
    @Deprecated
    public static final String SEENTIMESTAMP = "seenTimestamp";
    @Deprecated
    public static final String SENDERUSERID = "senderUserId";
    @Deprecated
    public static final String SENTTIMESTAMP = "sentTimestamp";
    @Deprecated
    public static final String SEQUENCENUMBER = "sequenceNumber";
    @Deprecated
    public static final String SNAPSERVERSTATUS = "snapServerStatus";
    @Deprecated
    public static final String TABLE_NAME = "LocalMessageAction";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends LocalMessageActionModel> {
        T create(long j, gci gci, long j2, String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5, List<Long> list, List<Long> list2, gcj gcj, Boolean bool, Integer num, MessageClientStatus messageClientStatus, String str3, byte[] bArr, byte[] bArr2, List<MessageRecipient> list3, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus);
    }

    public static final class Factory<T extends LocalMessageActionModel> {
        public final ainu<gci, Long> actionTypeAdapter;
        public final ainu<MessageClientStatus, Long> clientStatusAdapter;
        public final Creator<T> creator;
        public final ainu<gcj, Long> preservedAdapter;
        public final ainu<List<Long>, String> recipientUserIdsAdapter;
        public final ainu<List<MessageRecipient>, String> recipientsAdapter;
        public final ainu<ScreenshottedOrReplayedState, String> screenshottedOrReplayedAdapter;
        public final ainu<List<Long>, String> seenByAdapter;
        public final ainu<SnapServerStatus, String> snapServerStatusAdapter;

        final class GetLocalMessageCountByActionQuery extends ainx {
            private final gci actionType;

            GetLocalMessageCountByActionQuery(gci gci) {
                super("SELECT COUNT(DISTINCT messageId)\nFROM LocalMessageAction\nWHERE actionType=?1", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.actionType = gci;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.actionTypeAdapter.encode(this.actionType)).longValue());
            }
        }

        final class DeleteLocalActionsForMessageIdsQuery extends ainx {
            private final String[] messageId;

            DeleteLocalActionsForMessageIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM LocalMessageAction\nWHERE messageId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(LocalMessageActionModel.TABLE_NAME));
                this.messageId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.messageId;
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

        final class GetActionsByConversationIdQuery extends ainx {
            private final String conversationId;

            GetActionsByConversationIdQuery(String str) {
                super("SELECT *\nFROM LocalMessageAction\nWHERE conversationId=?1\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.conversationId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class GetChangedMessageIdsByActionAndConversationQuery extends ainx {
            private final gci actionType;
            private final String conversationId;

            GetChangedMessageIdsByActionAndConversationQuery(gci gci, String str) {
                super("SELECT messageId\nFROM LocalMessageAction\nWHERE actionType=?1 AND conversationId=?2\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.actionType = gci;
                this.conversationId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.actionTypeAdapter.encode(this.actionType)).longValue());
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetChangedMessageIdsByActionQuery extends ainx {
            private final gci actionType;

            GetChangedMessageIdsByActionQuery(gci gci) {
                super("SELECT messageId\nFROM LocalMessageAction\nWHERE actionType=?1\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.actionType = gci;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.actionTypeAdapter.encode(this.actionType)).longValue());
            }
        }

        final class GetLocalMessageActionByIdQuery extends ainx {
            private final long _id;

            GetLocalMessageActionByIdQuery(long j) {
                super("SELECT *\nFROM LocalMessageAction\nWHERE _id=?1\nLIMIT 1", new aioa(LocalMessageActionModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetLocalMessageActionByMessageIdConversationAndActionQuery extends ainx {
            private final gci actionType;
            private final String conversationId;
            private final String messageId;

            GetLocalMessageActionByMessageIdConversationAndActionQuery(String str, String str2, gci gci) {
                super("SELECT *\nFROM LocalMessageAction\nWHERE messageId=?1 AND conversationId=?2 AND actionType=?3\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.messageId = str;
                this.conversationId = str2;
                this.actionType = gci;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
                pcVar.bindLong(3, ((Long) Factory.this.actionTypeAdapter.encode(this.actionType)).longValue());
            }
        }

        final class GetLocalMessageActionsByNetworkMessageConversationIdQuery extends ainx {
            private final String conversationId;

            GetLocalMessageActionsByNetworkMessageConversationIdQuery(String str) {
                super("SELECT *\nFROM LocalMessageAction\nWHERE messageId IN (SELECT messageId FROM NetworkMessage WHERE NetworkMessage.conversationId=?1)\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME, NetworkMessageModel.TABLE_NAME));
                this.conversationId = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class GetLocalMessageIdsByConversationIdAndActionQuery extends ainx {
            private final gci actionType;
            private final String conversationId;

            GetLocalMessageIdsByConversationIdAndActionQuery(String str, gci gci) {
                super("SELECT DISTINCT messageId\nFROM LocalMessageAction\nWHERE conversationId=?1 AND actionType=?2\nORDER BY _id", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.conversationId = str;
                this.actionType = gci;
            }

            public final void bindTo(pc pcVar) {
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, ((Long) Factory.this.actionTypeAdapter.encode(this.actionType)).longValue());
            }
        }

        final class GetUpdatesByActionQuery extends ainx {
            private final gci actionType;

            GetUpdatesByActionQuery(gci gci) {
                super("SELECT *\nFROM LocalMessageAction\nWHERE actionType=?1\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.actionType = gci;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.actionTypeAdapter.encode(this.actionType)).longValue());
            }
        }

        final class GetUpdatesToMessageByActionQuery extends ainx {
            private final gci actionType;
            private final String messageId;

            GetUpdatesToMessageByActionQuery(String str, gci gci) {
                super("SELECT *\nFROM LocalMessageAction\nWHERE messageId=?1 AND actionType=?2\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.messageId = str;
                this.actionType = gci;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
                pcVar.bindLong(2, ((Long) Factory.this.actionTypeAdapter.encode(this.actionType)).longValue());
            }
        }

        final class GetUpdatesToMessageQuery extends ainx {
            private final String arg1;

            GetUpdatesToMessageQuery(String str) {
                super("SELECT *\nFROM LocalMessageAction\nWHERE messageId LIKE '%'||?1  -- TODO(alex): this IS a temporory solution until we properly differentiate story actions \nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.arg1 = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.arg1;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectClientStatusQuery extends ainx {
            private final String messageId;

            SelectClientStatusQuery(String str) {
                super("SELECT clientStatus\nFROM LocalMessageAction\nWHERE messageId = ?1", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.messageId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
            }
        }

        final class SelectRecipientsQuery extends ainx {
            private final String messageId;

            SelectRecipientsQuery(String str) {
                super("SELECT recipients\nFROM LocalMessageAction\nWHERE messageId = ?1", new aioa(LocalMessageActionModel.TABLE_NAME));
                this.messageId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
            }
        }

        public Factory(Creator<T> creator, ainu<gci, Long> ainu, ainu<List<Long>, String> ainu2, ainu<List<Long>, String> ainu3, ainu<gcj, Long> ainu4, ainu<MessageClientStatus, Long> ainu5, ainu<List<MessageRecipient>, String> ainu6, ainu<ScreenshottedOrReplayedState, String> ainu7, ainu<SnapServerStatus, String> ainu8) {
            this.creator = creator;
            this.actionTypeAdapter = ainu;
            this.seenByAdapter = ainu2;
            this.recipientUserIdsAdapter = ainu3;
            this.preservedAdapter = ainu4;
            this.clientStatusAdapter = ainu5;
            this.recipientsAdapter = ainu6;
            this.screenshottedOrReplayedAdapter = ainu7;
            this.snapServerStatusAdapter = ainu8;
        }

        public final ainx deleteLocalActionsForMessageIds(String[] strArr) {
            return new DeleteLocalActionsForMessageIdsQuery(strArr);
        }

        public final ainx getActionsByConversationId(String str) {
            return new GetActionsByConversationIdQuery(str);
        }

        public final Mapper<T> getActionsByConversationIdMapper() {
            return new Mapper(this);
        }

        public final ainx getChangedMessageIdsByAction(gci gci) {
            return new GetChangedMessageIdsByActionQuery(gci);
        }

        public final ainx getChangedMessageIdsByActionAndConversation(gci gci, String str) {
            return new GetChangedMessageIdsByActionAndConversationQuery(gci, str);
        }

        public final ainw<String> getChangedMessageIdsByActionAndConversationMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainw<String> getChangedMessageIdsByActionMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getLocalMessageActionById(long j) {
            return new GetLocalMessageActionByIdQuery(j);
        }

        public final Mapper<T> getLocalMessageActionByIdMapper() {
            return new Mapper(this);
        }

        public final ainx getLocalMessageActionByMessageIdConversationAndAction(String str, String str2, gci gci) {
            return new GetLocalMessageActionByMessageIdConversationAndActionQuery(str, str2, gci);
        }

        public final Mapper<T> getLocalMessageActionByMessageIdConversationAndActionMapper() {
            return new Mapper(this);
        }

        public final ainx getLocalMessageActions() {
            return new ainx("SELECT *\nFROM LocalMessageAction\nORDER BY _id ASC", new aioa(LocalMessageActionModel.TABLE_NAME));
        }

        public final ainx getLocalMessageActionsByNetworkMessageConversationId(String str) {
            return new GetLocalMessageActionsByNetworkMessageConversationIdQuery(str);
        }

        public final Mapper<T> getLocalMessageActionsByNetworkMessageConversationIdMapper() {
            return new Mapper(this);
        }

        public final Mapper<T> getLocalMessageActionsMapper() {
            return new Mapper(this);
        }

        public final ainx getLocalMessageCountByAction(gci gci) {
            return new GetLocalMessageCountByActionQuery(gci);
        }

        public final ainw<Long> getLocalMessageCountByActionMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getLocalMessageIdsByConversationIdAndAction(String str, gci gci) {
            return new GetLocalMessageIdsByConversationIdAndActionQuery(str, gci);
        }

        public final ainw<String> getLocalMessageIdsByConversationIdAndActionMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getUpdatesByAction(gci gci) {
            return new GetUpdatesByActionQuery(gci);
        }

        public final Mapper<T> getUpdatesByActionMapper() {
            return new Mapper(this);
        }

        public final ainx getUpdatesToMessage(String str) {
            return new GetUpdatesToMessageQuery(str);
        }

        public final ainx getUpdatesToMessageByAction(String str, gci gci) {
            return new GetUpdatesToMessageByActionQuery(str, gci);
        }

        public final Mapper<T> getUpdatesToMessageByActionMapper() {
            return new Mapper(this);
        }

        public final Mapper<T> getUpdatesToMessageMapper() {
            return new Mapper(this);
        }

        public final ainx selectClientStatus(String str) {
            return new SelectClientStatusQuery(str);
        }

        public final ainw<MessageClientStatus> selectClientStatusMapper() {
            return new ainw<MessageClientStatus>() {
                public MessageClientStatus map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (MessageClientStatus) Factory.this.clientStatusAdapter.decode(Long.valueOf(cursor.getLong(0)));
                }
            };
        }

        public final ainx selectRecipients(String str) {
            return new SelectRecipientsQuery(str);
        }

        public final ainw<List<MessageRecipient>> selectRecipientsMapper() {
            return new ainw<List<MessageRecipient>>() {
                public List<MessageRecipient> map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (List) Factory.this.recipientsAdapter.decode(cursor.getString(0));
                }
            };
        }
    }

    public static final class MessageActionPersistedToServer extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public MessageActionPersistedToServer(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("DELETE FROM LocalMessageAction\nWHERE actionType=? AND messageId=?"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(gci gci, String str) {
            bindLong(1, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            bindString(2, str);
        }
    }

    public static final class DeletePersistedSaveStateChanges extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public DeletePersistedSaveStateChanges(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("DELETE FROM LocalMessageAction\nWHERE messageId=? AND actionType=? AND currentUserSaveVersion<=?"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(String str, gci gci, Integer num) {
            bindString(1, str);
            bindLong(2, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            if (num == null) {
                bindNull(3);
            } else {
                bindLong(3, (long) num.intValue());
            }
        }
    }

    public static final class Mapper<T extends LocalMessageActionModel> implements ainw<T> {
        private final Factory<T> localMessageActionModelFactory;

        public Mapper(Factory<T> factory) {
            this.localMessageActionModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            Creator creator = this.localMessageActionModelFactory.creator;
            long j = cursor2.getLong(0);
            gci gci = (gci) this.localMessageActionModelFactory.actionTypeAdapter.decode(Long.valueOf(cursor2.getLong(1)));
            long j2 = cursor2.getLong(2);
            String string = cursor2.getString(3);
            String string2 = cursor2.isNull(4) ? null : cursor2.getString(4);
            Long valueOf = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Long valueOf2 = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            Long valueOf3 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            Long valueOf4 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            Long valueOf5 = cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9));
            List list = cursor2.isNull(10) ? null : (List) this.localMessageActionModelFactory.seenByAdapter.decode(cursor2.getString(10));
            List list2 = cursor2.isNull(11) ? null : (List) this.localMessageActionModelFactory.recipientUserIdsAdapter.decode(cursor2.getString(11));
            gcj gcj = cursor2.isNull(12) ? null : (gcj) this.localMessageActionModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(12)));
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            return creator.create(j, gci, j2, string, string2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, list, list2, gcj, bool, cursor2.isNull(14) ? null : Integer.valueOf(cursor2.getInt(14)), cursor2.isNull(15) ? null : (MessageClientStatus) this.localMessageActionModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(15))), cursor2.isNull(16) ? null : cursor2.getString(16), cursor2.isNull(17) ? null : cursor2.getBlob(17), cursor2.isNull(18) ? null : cursor2.getBlob(18), cursor2.isNull(19) ? null : (List) this.localMessageActionModelFactory.recipientsAdapter.decode(cursor2.getString(19)), cursor2.isNull(20) ? null : (ScreenshottedOrReplayedState) this.localMessageActionModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(20)), cursor2.isNull(21) ? null : (SnapServerStatus) this.localMessageActionModelFactory.snapServerStatusAdapter.decode(cursor2.getString(21)));
        }
    }

    public static final class ConversationIdChangedAction extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public ConversationIdChangedAction(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("INSERT INTO LocalMessageAction(\n    actionType,\n    actionTimestamp,\n    messageId,\n    conversationId)\nVALUES(?,?,?,?)"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(gci gci, long j, String str, String str2) {
            bindLong(1, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            bindLong(2, j);
            bindString(3, str);
            if (str2 == null) {
                bindNull(4);
            } else {
                bindString(4, str2);
            }
        }
    }

    public static final class DeletePersistedPreserveStateChanges extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public DeletePersistedPreserveStateChanges(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("DELETE FROM LocalMessageAction\nWHERE messageId=? AND actionType=?"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(String str, gci gci) {
            bindString(1, str);
            bindLong(2, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
        }
    }

    public static final class DeletePersistedReleaseActions extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public DeletePersistedReleaseActions(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("DELETE FROM LocalMessageAction\nWHERE conversationId=?1 AND sequenceNumber<=?2 AND senderUserId=?3 AND actionType=?4"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(String str, Long l, Long l2, gci gci) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            if (l2 == null) {
                bindNull(3);
            } else {
                bindLong(3, l2.longValue());
            }
            bindLong(4, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
        }
    }

    public static final class MarkAsReleasedAction extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public MarkAsReleasedAction(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("INSERT INTO LocalMessageAction(\n    actionType,\n    actionTimestamp,\n    messageId,\n    conversationId,\n    senderUserId,\n    sequenceNumber)\nVALUES(?,?,?,?,?,?)"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(gci gci, long j, String str, String str2, Long l, Long l2) {
            bindLong(1, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            bindLong(2, j);
            bindString(3, str);
            if (str2 == null) {
                bindNull(4);
            } else {
                bindString(4, str2);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
            if (l2 == null) {
                bindNull(6);
            } else {
                bindLong(6, l2.longValue());
            }
        }
    }

    public static final class MessagePreserveStateUpdateAction extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public MessagePreserveStateUpdateAction(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("INSERT INTO LocalMessageAction(\n    actionType,\n    actionTimestamp,\n    messageId,\n    preserved)\nVALUES(?,?,?,?)"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(gci gci, long j, String str, gcj gcj) {
            bindLong(1, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            bindLong(2, j);
            bindString(3, str);
            if (gcj == null) {
                bindNull(4);
            } else {
                bindLong(4, ((Long) this.localMessageActionModelFactory.preservedAdapter.encode(gcj)).longValue());
            }
        }
    }

    public static final class MessageSaveStateUpdateAction extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public MessageSaveStateUpdateAction(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("INSERT INTO LocalMessageAction(\n    actionType,\n    actionTimestamp,\n    messageId,\n    currentUserSaved,\n    currentUserSaveVersion)\nVALUES(?,?,?,?,?)"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(gci gci, long j, String str, Boolean bool, Integer num) {
            bindLong(1, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            bindLong(2, j);
            bindString(3, str);
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (num == null) {
                bindNull(5);
            } else {
                bindLong(5, (long) num.intValue());
            }
        }
    }

    public static final class MessageSendBeginAction extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public MessageSendBeginAction(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("INSERT INTO LocalMessageAction(\n    actionType,\n    actionTimestamp,\n    conversationId,\n    messageId,\n    sentTimestamp,\n    senderUserId,\n    preserved,\n    clientStatus,\n    messageType,\n    content,\n    analytics,\n    recipients)\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?)"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(gci gci, long j, String str, String str2, Long l, Long l2, gcj gcj, MessageClientStatus messageClientStatus, String str3, byte[] bArr, byte[] bArr2, List<MessageRecipient> list) {
            bindLong(1, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            bindLong(2, j);
            if (str == null) {
                bindNull(3);
            } else {
                bindString(3, str);
            }
            bindString(4, str2);
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
            if (l2 == null) {
                bindNull(6);
            } else {
                bindLong(6, l2.longValue());
            }
            if (gcj == null) {
                bindNull(7);
            } else {
                bindLong(7, ((Long) this.localMessageActionModelFactory.preservedAdapter.encode(gcj)).longValue());
            }
            if (messageClientStatus == null) {
                bindNull(8);
            } else {
                bindLong(8, ((Long) this.localMessageActionModelFactory.clientStatusAdapter.encode(messageClientStatus)).longValue());
            }
            if (str3 == null) {
                bindNull(9);
            } else {
                bindString(9, str3);
            }
            if (bArr == null) {
                bindNull(10);
            } else {
                bindBlob(10, bArr);
            }
            if (bArr2 == null) {
                bindNull(11);
            } else {
                bindBlob(11, bArr2);
            }
            if (list == null) {
                bindNull(12);
            } else {
                bindString(12, (String) this.localMessageActionModelFactory.recipientsAdapter.encode(list));
            }
        }
    }

    public static final class MessageSendUpdateAction extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public MessageSendUpdateAction(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("UPDATE LocalMessageAction\nSET\n    clientStatus=?,\n    content=?,\n    analytics=?\nWHERE actionType=? AND messageId=?"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, byte[] bArr, byte[] bArr2, gci gci, String str) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindLong(1, ((Long) this.localMessageActionModelFactory.clientStatusAdapter.encode(messageClientStatus)).longValue());
            }
            if (bArr == null) {
                bindNull(2);
            } else {
                bindBlob(2, bArr);
            }
            if (bArr2 == null) {
                bindNull(3);
            } else {
                bindBlob(3, bArr2);
            }
            bindLong(4, ((Long) this.localMessageActionModelFactory.actionTypeAdapter.encode(gci)).longValue());
            bindString(5, str);
        }
    }

    public static final class UpdateRecipients extends ainy {
        private final Factory<? extends LocalMessageActionModel> localMessageActionModelFactory;

        public UpdateRecipients(pa paVar, Factory<? extends LocalMessageActionModel> factory) {
            super(LocalMessageActionModel.TABLE_NAME, paVar.a("UPDATE LocalMessageAction\nSET recipients = ?\nWHERE messageId = ?"));
            this.localMessageActionModelFactory = factory;
        }

        public final void bind(List<MessageRecipient> list, String str) {
            if (list == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.localMessageActionModelFactory.recipientsAdapter.encode(list));
            }
            bindString(2, str);
        }
    }

    long _id();

    long actionTimestamp();

    gci actionType();

    byte[] analytics();

    MessageClientStatus clientStatus();

    byte[] content();

    String conversationId();

    Integer currentUserSaveVersion();

    Boolean currentUserSaved();

    Long groupVersion();

    String messageId();

    String messageType();

    gcj preserved();

    List<Long> recipientUserIds();

    List<MessageRecipient> recipients();

    ScreenshottedOrReplayedState screenshottedOrReplayed();

    List<Long> seenBy();

    Long seenTimestamp();

    Long senderUserId();

    Long sentTimestamp();

    Long sequenceNumber();

    SnapServerStatus snapServerStatus();
}

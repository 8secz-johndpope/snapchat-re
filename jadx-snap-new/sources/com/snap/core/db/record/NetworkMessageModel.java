package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.pa;
import defpackage.pc;
import defpackage.yfj;
import java.util.List;

public interface NetworkMessageModel {
    public static final String ADDLASTINTERACTIONTIMESTAMP = "ALTER TABLE NetworkMessage\nADD lastInteractionTimestamp INTEGER";
    public static final String ADDRELEASED = "ALTER TABLE NetworkMessage\nADD released INTEGER NOT NULL DEFAULT 0";
    public static final String ADDSCREENSHOTTEDORREPLAYED = "ALTER TABLE NetworkMessage\nADD screenshottedOrReplayed TEXT";
    public static final String ADDSNAPSERVERSTATUS = "ALTER TABLE NetworkMessage\nADD snapServerStatus TEXT";
    public static final String ADDVIEWERLIST = "ALTER TABLE NetworkMessage\nADD viewerList BLOB";
    @Deprecated
    public static final String CLIENTSTATUS = "clientStatus";
    @Deprecated
    public static final String CONTENT = "content";
    @Deprecated
    public static final String CONVERSATIONID = "conversationId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS NetworkMessage(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    messageId TEXT NOT NULL UNIQUE,\n    conversationId TEXT,\n\n    sentTimestamp INTEGER NOT NULL,\n   -- Important, this should ONLY be used for message retention and never displayed to the user\n    seenTimestamp INTEGER,\n\n    senderId INTEGER NOT NULL,\n\n    sequenceNumber INTEGER,\n     -- DEPRECATED\n    groupVersion INTEGER,\n\n     -- DEPRECATED\n    seenBy TEXT,\n    savedBy TEXT,\n\n    clientStatus TEXT,\n\n     -- The content to render for the message, the \"messageType\" should describe this content and indicate who can render it \n    messageType TEXT NOT NULL,\n    content BLOB NOT NULL,\n    preserved INTEGER NOT NULL,\n    savedStates TEXT,\n--      release state -> true means if this is a message I sent, other has viewed my message;\n--                                  if this is a message I received, I have viewed the message;\n    released INTEGER NOT NULL DEFAULT 0,\n\n    -- Snap Specific\n    screenshottedOrReplayed TEXT,\n    -- Snap Specific\n    snapServerStatus TEXT,\n\n    -- last received/viewed/screenshot/replay timestamp for snaps & release ts for chats\n    lastInteractionTimestamp INTEGER,\n    -- Snap Specific | group snap viewer list of friendRowId --\n    viewerList BLOB\n)";
    public static final String DROPALLNETWORKMESSAGES = "DROP TABLE IF EXISTS NetworkMessage";
    @Deprecated
    public static final String GROUPVERSION = "groupVersion";
    @Deprecated
    public static final String LASTINTERACTIONTIMESTAMP = "lastInteractionTimestamp";
    @Deprecated
    public static final String MESSAGEID = "messageId";
    @Deprecated
    public static final String MESSAGETYPE = "messageType";
    @Deprecated
    public static final String PRESERVED = "preserved";
    @Deprecated
    public static final String RELEASED = "released";
    @Deprecated
    public static final String SAVEDBY = "savedBy";
    @Deprecated
    public static final String SAVEDSTATES = "savedStates";
    @Deprecated
    public static final String SCREENSHOTTEDORREPLAYED = "screenshottedOrReplayed";
    @Deprecated
    public static final String SEENBY = "seenBy";
    @Deprecated
    public static final String SEENTIMESTAMP = "seenTimestamp";
    @Deprecated
    public static final String SENDERID = "senderId";
    @Deprecated
    public static final String SENTTIMESTAMP = "sentTimestamp";
    @Deprecated
    public static final String SEQUENCENUMBER = "sequenceNumber";
    @Deprecated
    public static final String SNAPSERVERSTATUS = "snapServerStatus";
    @Deprecated
    public static final String TABLE_NAME = "NetworkMessage";
    @Deprecated
    public static final String VIEWERLIST = "viewerList";
    @Deprecated
    public static final String _ID = "_id";

    public interface GetIdAndTypeForMessageIdModel {
        long _id();

        String messageType();

        SnapServerStatus snapServerStatus();
    }

    public interface GetUnreleasedMessagesForConversationModel {
        Long lastInteractionTimestamp();

        String messageId();

        String messageType();

        long senderId();

        Long sequenceNumber();
    }

    public static final class Factory<T extends NetworkMessageModel> {
        public final ainu<MessageClientStatus, String> clientStatusAdapter;
        public final Creator<T> creator;
        public final ainu<gcj, Long> preservedAdapter;
        public final ainu<List<String>, String> savedByAdapter;
        public final ainu<gcm, String> savedStatesAdapter;
        public final ainu<ScreenshottedOrReplayedState, String> screenshottedOrReplayedAdapter;
        public final ainu<List<String>, String> seenByAdapter;
        public final ainu<SnapServerStatus, String> snapServerStatusAdapter;
        public final ainu<yfj, byte[]> viewerListAdapter;

        final class CheckForMessagesOfTypeQuery extends ainx {
            private final String messageType;

            CheckForMessagesOfTypeQuery(String str) {
                super("SELECT _id\nFROM NetworkMessage\nWHERE messageType=?1\nLIMIT 1", new aioa(NetworkMessageModel.TABLE_NAME));
                this.messageType = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageType);
            }
        }

        final class GetIdAndTypeForMessageIdQuery extends ainx {
            private final String messageId;

            GetIdAndTypeForMessageIdQuery(String str) {
                super("SELECT _id, messageType, snapServerStatus\nFROM NetworkMessage\nWHERE messageId=?1", new aioa(NetworkMessageModel.TABLE_NAME));
                this.messageId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
            }
        }

        final class GetUnreleasedMessagesForConversationQuery extends ainx {
            private final String conversationId;
            private final String messageType;

            GetUnreleasedMessagesForConversationQuery(String str, String str2) {
                super("SELECT\nmessageId,\nsenderId,\nsequenceNumber,\nlastInteractionTimestamp,\nmessageType\nFROM NetworkMessage\nWHERE conversationId=?1 AND released=0 AND messageType!=?2", new aioa(NetworkMessageModel.TABLE_NAME));
                this.conversationId = str;
                this.messageType = str2;
            }

            public final void bindTo(pc pcVar) {
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindString(2, this.messageType);
            }
        }

        final class DeleteNetworkMessagesForMessageIdsQuery extends ainx {
            private final String[] messageId;

            DeleteNetworkMessagesForMessageIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM NetworkMessage\nWHERE messageId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(NetworkMessageModel.TABLE_NAME));
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

        final class GetIdForMessageIdQuery extends ainx {
            private final String messageId;

            GetIdForMessageIdQuery(String str) {
                super("SELECT _id\nFROM NetworkMessage\nWHERE messageId=?1", new aioa(NetworkMessageModel.TABLE_NAME));
                this.messageId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
            }
        }

        final class GetMessagesForConversationQuery extends ainx {
            private final String conversationId;

            GetMessagesForConversationQuery(String str) {
                super("SELECT *\nFROM NetworkMessage\nWHERE NetworkMessage.conversationId=?1\nORDER BY NetworkMessage.sentTimestamp DESC", new aioa(NetworkMessageModel.TABLE_NAME));
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

        final class GetMessagesFromUserQuery extends ainx {
            private final String conversationId;
            private final long senderId;

            GetMessagesFromUserQuery(String str, long j) {
                super("SELECT\n    messageId\nFROM NetworkMessage\nWHERE conversationId=?1 AND senderId=?2", new aioa(NetworkMessageModel.TABLE_NAME));
                this.conversationId = str;
                this.senderId = j;
            }

            public final void bindTo(pc pcVar) {
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, this.senderId);
            }
        }

        final class GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberQuery extends ainx {
            private final String conversationId;
            private final String messageType;
            private final long senderId;
            private final Long sequenceNumber;

            GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberQuery(String str, long j, Long l, String str2) {
                super("SELECT messageId, messageType\nFROM NetworkMessage\nWHERE conversationId=?1 AND senderId=?2 AND sequenceNumber<=?3 AND released=0 AND messageType!=?4", new aioa(NetworkMessageModel.TABLE_NAME));
                this.conversationId = str;
                this.senderId = j;
                this.sequenceNumber = l;
                this.messageType = str2;
            }

            public final void bindTo(pc pcVar) {
                String str = this.conversationId;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, this.senderId);
                Long l = this.sequenceNumber;
                if (l != null) {
                    pcVar.bindLong(3, l.longValue());
                } else {
                    pcVar.bindNull(3);
                }
                pcVar.bindString(4, this.messageType);
            }
        }

        final class GetNetworkMessageForMessageIdQuery extends ainx {
            private final String messageId;

            GetNetworkMessageForMessageIdQuery(String str) {
                super("SELECT *\nFROM NetworkMessage\nWHERE messageId=?1\nLIMIT 1", new aioa(NetworkMessageModel.TABLE_NAME));
                this.messageId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
            }
        }

        final class GetNetworkMessagesForMessageIdsQuery extends ainx {
            private final String[] messageId;

            GetNetworkMessagesForMessageIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM NetworkMessage\nWHERE messageId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(NetworkMessageModel.TABLE_NAME));
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

        final class GetSavedStatesForMessageQuery extends ainx {
            private final String messageId;

            GetSavedStatesForMessageQuery(String str) {
                super("SELECT savedStates\nFROM NetworkMessage\nWHERE messageId=?1\nLIMIT 1", new aioa(NetworkMessageModel.TABLE_NAME));
                this.messageId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.messageId);
            }
        }

        final class UpdateReleaseStateOnMessagesQuery extends ainx {
            private final Object arg2;
            private final String[] messageId;
            private final boolean released;
            private final Long seenTimestamp;

            UpdateReleaseStateOnMessagesQuery(boolean z, Object obj, Long l, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("UPDATE NetworkMessage\nSET released=?1, lastInteractionTimestamp=COALESCE(lastInteractionTimestamp, ?2), seenTimestamp=?3\nWHERE messageId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(NetworkMessageModel.TABLE_NAME));
                this.released = z;
                this.arg2 = obj;
                this.seenTimestamp = l;
                this.messageId = strArr;
            }

            public final void bindTo(pc pcVar) {
                long j = 1;
                pcVar.bindLong(1, this.released ? 1 : 0);
                Object obj = this.arg2;
                if (obj == null) {
                    pcVar.bindNull(2);
                } else if (obj instanceof String) {
                    pcVar.bindString(2, (String) obj);
                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short)) {
                    pcVar.bindLong(2, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 0;
                    }
                    pcVar.bindLong(2, j);
                } else if (obj instanceof byte[]) {
                    pcVar.bindBlob(2, (byte[]) obj);
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    pcVar.bindDouble(2, ((Double) obj).doubleValue());
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of String, Integer, Short, Long, Float, Double, Boolean, or byte[] to argument arg2");
                }
                Long l = this.seenTimestamp;
                if (l != null) {
                    pcVar.bindLong(3, l.longValue());
                } else {
                    pcVar.bindNull(3);
                }
                int i = 4;
                String[] strArr = this.messageId;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        public Factory(Creator<T> creator, ainu<List<String>, String> ainu, ainu<List<String>, String> ainu2, ainu<MessageClientStatus, String> ainu3, ainu<gcj, Long> ainu4, ainu<gcm, String> ainu5, ainu<ScreenshottedOrReplayedState, String> ainu6, ainu<SnapServerStatus, String> ainu7, ainu<yfj, byte[]> ainu8) {
            this.creator = creator;
            this.seenByAdapter = ainu;
            this.savedByAdapter = ainu2;
            this.clientStatusAdapter = ainu3;
            this.preservedAdapter = ainu4;
            this.savedStatesAdapter = ainu5;
            this.screenshottedOrReplayedAdapter = ainu6;
            this.snapServerStatusAdapter = ainu7;
            this.viewerListAdapter = ainu8;
        }

        public final ainx checkForMessagesOfType(String str) {
            return new CheckForMessagesOfTypeQuery(str);
        }

        public final ainw<Long> checkForMessagesOfTypeMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx deleteNetworkMessagesForMessageIds(String[] strArr) {
            return new DeleteNetworkMessagesForMessageIdsQuery(strArr);
        }

        public final ainx getIdAndTypeForMessageId(String str) {
            return new GetIdAndTypeForMessageIdQuery(str);
        }

        public final <R extends GetIdAndTypeForMessageIdModel> GetIdAndTypeForMessageIdMapper<R, T> getIdAndTypeForMessageIdMapper(GetIdAndTypeForMessageIdCreator<R> getIdAndTypeForMessageIdCreator) {
            return new GetIdAndTypeForMessageIdMapper(getIdAndTypeForMessageIdCreator, this);
        }

        public final ainx getIdForMessageId(String str) {
            return new GetIdForMessageIdQuery(str);
        }

        public final ainw<Long> getIdForMessageIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getMessagesForConversation(String str) {
            return new GetMessagesForConversationQuery(str);
        }

        public final Mapper<T> getMessagesForConversationMapper() {
            return new Mapper(this);
        }

        public final ainx getMessagesFromUser(String str, long j) {
            return new GetMessagesFromUserQuery(str, j);
        }

        public final ainw<String> getMessagesFromUserMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getMessagesYetToBeReleasedUpToAndIncludingSequenceNumber(String str, long j, Long l, String str2) {
            return new GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberQuery(str, j, l, str2);
        }

        public final <R extends GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel> GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberMapper<R> getMessagesYetToBeReleasedUpToAndIncludingSequenceNumberMapper(GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator<R> getMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator) {
            return new GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberMapper(getMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator);
        }

        public final ainx getNetworkMessageForMessageId(String str) {
            return new GetNetworkMessageForMessageIdQuery(str);
        }

        public final Mapper<T> getNetworkMessageForMessageIdMapper() {
            return new Mapper(this);
        }

        public final ainx getNetworkMessagesForMessageIds(String[] strArr) {
            return new GetNetworkMessagesForMessageIdsQuery(strArr);
        }

        public final Mapper<T> getNetworkMessagesForMessageIdsMapper() {
            return new Mapper(this);
        }

        public final ainx getSavedStatesForMessage(String str) {
            return new GetSavedStatesForMessageQuery(str);
        }

        public final ainw<gcm> getSavedStatesForMessageMapper() {
            return new ainw<gcm>() {
                public gcm map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (gcm) Factory.this.savedStatesAdapter.decode(cursor.getString(0));
                }
            };
        }

        public final ainx getUnreleasedMessagesForConversation(String str, String str2) {
            return new GetUnreleasedMessagesForConversationQuery(str, str2);
        }

        public final <R extends GetUnreleasedMessagesForConversationModel> GetUnreleasedMessagesForConversationMapper<R> getUnreleasedMessagesForConversationMapper(GetUnreleasedMessagesForConversationCreator<R> getUnreleasedMessagesForConversationCreator) {
            return new GetUnreleasedMessagesForConversationMapper(getUnreleasedMessagesForConversationCreator);
        }

        public final ainx selectAllNetworkMessages() {
            return new ainx("SELECT *\nFROM NetworkMessage\nORDER BY _id", new aioa(NetworkMessageModel.TABLE_NAME));
        }

        public final Mapper<T> selectAllNetworkMessagesMapper() {
            return new Mapper(this);
        }

        public final ainx updateReleaseStateOnMessages(boolean z, Object obj, Long l, String[] strArr) {
            return new UpdateReleaseStateOnMessagesQuery(z, obj, l, strArr);
        }
    }

    public interface Creator<T extends NetworkMessageModel> {
        T create(long j, String str, String str2, long j2, Long l, long j3, Long l2, Long l3, List<String> list, List<String> list2, MessageClientStatus messageClientStatus, String str3, byte[] bArr, gcj gcj, gcm gcm, boolean z, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, Long l4, yfj yfj);
    }

    public interface GetIdAndTypeForMessageIdCreator<T extends GetIdAndTypeForMessageIdModel> {
        T create(long j, String str, SnapServerStatus snapServerStatus);
    }

    public interface GetUnreleasedMessagesForConversationCreator<T extends GetUnreleasedMessagesForConversationModel> {
        T create(String str, long j, Long l, Long l2, String str2);
    }

    public interface GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator<T extends GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel> {
        T create(String str, String str2);
    }

    public static final class GetIdAndTypeForMessageIdMapper<T extends GetIdAndTypeForMessageIdModel, T1 extends NetworkMessageModel> implements ainw<T> {
        private final GetIdAndTypeForMessageIdCreator<T> creator;
        private final Factory<T1> networkMessageModelFactory;

        public GetIdAndTypeForMessageIdMapper(GetIdAndTypeForMessageIdCreator<T> getIdAndTypeForMessageIdCreator, Factory<T1> factory) {
            this.creator = getIdAndTypeForMessageIdCreator;
            this.networkMessageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.isNull(2) ? null : (SnapServerStatus) this.networkMessageModelFactory.snapServerStatusAdapter.decode(cursor.getString(2)));
        }
    }

    public static final class GetUnreleasedMessagesForConversationMapper<T extends GetUnreleasedMessagesForConversationModel> implements ainw<T> {
        private final GetUnreleasedMessagesForConversationCreator<T> creator;

        public GetUnreleasedMessagesForConversationMapper(GetUnreleasedMessagesForConversationCreator<T> getUnreleasedMessagesForConversationCreator) {
            this.creator = getUnreleasedMessagesForConversationCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.getString(4));
        }
    }

    public static final class GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberMapper<T extends GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel> implements ainw<T> {
        private final GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator<T> creator;

        public GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberMapper(GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator<T> getMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator) {
            this.creator = getMessagesYetToBeReleasedUpToAndIncludingSequenceNumberCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getString(1));
        }
    }

    public interface GetMessagesYetToBeReleasedUpToAndIncludingSequenceNumberModel {
        String messageId();

        String messageType();
    }

    public static final class Mapper<T extends NetworkMessageModel> implements ainw<T> {
        private final Factory<T> networkMessageModelFactory;

        public Mapper(Factory<T> factory) {
            this.networkMessageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.networkMessageModelFactory.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.getLong(3), cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4)), cursor2.getLong(5), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7)), cursor2.isNull(8) ? null : (List) this.networkMessageModelFactory.seenByAdapter.decode(cursor2.getString(8)), cursor2.isNull(9) ? null : (List) this.networkMessageModelFactory.savedByAdapter.decode(cursor2.getString(9)), cursor2.isNull(10) ? null : (MessageClientStatus) this.networkMessageModelFactory.clientStatusAdapter.decode(cursor2.getString(10)), cursor2.getString(11), cursor2.getBlob(12), (gcj) this.networkMessageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(13))), cursor2.isNull(14) ? null : (gcm) this.networkMessageModelFactory.savedStatesAdapter.decode(cursor2.getString(14)), cursor2.getInt(15) == 1, cursor2.isNull(16) ? null : (ScreenshottedOrReplayedState) this.networkMessageModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(16)), cursor2.isNull(17) ? null : (SnapServerStatus) this.networkMessageModelFactory.snapServerStatusAdapter.decode(cursor2.getString(17)), cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18)), cursor2.isNull(19) ? null : (yfj) this.networkMessageModelFactory.viewerListAdapter.decode(cursor2.getBlob(19)));
        }
    }

    public static final class DeleteAllMessages extends ainy {
        public DeleteAllMessages(pa paVar) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("DELETE FROM NetworkMessage"));
        }
    }

    public static final class DeleteMessageForMessageId extends ainy {
        public DeleteMessageForMessageId(pa paVar) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("DELETE FROM NetworkMessage\nWHERE messageId=?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class DeleteMessagesOfType extends ainy {
        public DeleteMessagesOfType(pa paVar) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("DELETE FROM NetworkMessage\nWHERE messageType=?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertMessage extends ainy {
        private final Factory<? extends NetworkMessageModel> networkMessageModelFactory;

        public InsertMessage(pa paVar, Factory<? extends NetworkMessageModel> factory) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("INSERT INTO NetworkMessage(\n    messageId,\n    conversationId,\n\n    sentTimestamp,\n    senderId,\n\n    sequenceNumber,\n\n    clientStatus,\n    messageType,\n    content,\n    preserved,\n    savedStates,\n    screenshottedOrReplayed,\n    snapServerStatus,\n    viewerList)\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)"));
            this.networkMessageModelFactory = factory;
        }

        public final void bind(String str, String str2, long j, long j2, Long l, MessageClientStatus messageClientStatus, String str3, byte[] bArr, gcj gcj, gcm gcm, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj) {
            String str4 = str2;
            MessageClientStatus messageClientStatus2 = messageClientStatus;
            gcm gcm2 = gcm;
            ScreenshottedOrReplayedState screenshottedOrReplayedState2 = screenshottedOrReplayedState;
            SnapServerStatus snapServerStatus2 = snapServerStatus;
            yfj yfj2 = yfj;
            String str5 = str;
            bindString(1, str);
            if (str4 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            long j3 = j;
            bindLong(3, j);
            j3 = j2;
            bindLong(4, j2);
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
            if (messageClientStatus2 == null) {
                bindNull(6);
            } else {
                bindString(6, (String) this.networkMessageModelFactory.clientStatusAdapter.encode(messageClientStatus2));
            }
            bindString(7, str3);
            bindBlob(8, bArr);
            bindLong(9, ((Long) this.networkMessageModelFactory.preservedAdapter.encode(gcj)).longValue());
            if (gcm2 == null) {
                bindNull(10);
            } else {
                bindString(10, (String) this.networkMessageModelFactory.savedStatesAdapter.encode(gcm2));
            }
            if (screenshottedOrReplayedState2 == null) {
                bindNull(11);
            } else {
                bindString(11, (String) this.networkMessageModelFactory.screenshottedOrReplayedAdapter.encode(screenshottedOrReplayedState2));
            }
            if (snapServerStatus2 == null) {
                bindNull(12);
            } else {
                bindString(12, (String) this.networkMessageModelFactory.snapServerStatusAdapter.encode(snapServerStatus2));
            }
            if (yfj2 == null) {
                bindNull(13);
            } else {
                bindBlob(13, (byte[]) this.networkMessageModelFactory.viewerListAdapter.encode(yfj2));
            }
        }
    }

    public static final class ReplaceMessageWithEraseMessage extends ainy {
        public ReplaceMessageWithEraseMessage(pa paVar) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET\n    messageType = 'erased_message',\n    clientStatus = 'OK',\n    content = '',\n    preserved = 0,\n    savedStates = NULL,\n    released = 0\nWHERE messageId = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class UpdateContentForId extends ainy {
        public UpdateContentForId(pa paVar) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET content=?, messageType=?\nWHERE _id=?"));
        }

        public final void bind(byte[] bArr, String str, long j) {
            bindBlob(1, bArr);
            bindString(2, str);
            bindLong(3, j);
        }
    }

    public static final class UpdateMessageClientStatus extends ainy {
        private final Factory<? extends NetworkMessageModel> networkMessageModelFactory;

        public UpdateMessageClientStatus(pa paVar, Factory<? extends NetworkMessageModel> factory) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET clientStatus=?\nWHERE messageId=?"));
            this.networkMessageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, String str) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.networkMessageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            bindString(2, str);
        }
    }

    public static final class UpdateMessagePreservationState extends ainy {
        private final Factory<? extends NetworkMessageModel> networkMessageModelFactory;

        public UpdateMessagePreservationState(pa paVar, Factory<? extends NetworkMessageModel> factory) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET preserved=?\nWHERE messageId=?"));
            this.networkMessageModelFactory = factory;
        }

        public final void bind(gcj gcj, String str) {
            bindLong(1, ((Long) this.networkMessageModelFactory.preservedAdapter.encode(gcj)).longValue());
            bindString(2, str);
        }
    }

    public static final class UpdateNetworkMessageSaveState extends ainy {
        private final Factory<? extends NetworkMessageModel> networkMessageModelFactory;

        public UpdateNetworkMessageSaveState(pa paVar, Factory<? extends NetworkMessageModel> factory) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET savedStates=?\nWHERE messageId=?"));
            this.networkMessageModelFactory = factory;
        }

        public final void bind(gcm gcm, String str) {
            if (gcm == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.networkMessageModelFactory.savedStatesAdapter.encode(gcm));
            }
            bindString(2, str);
        }
    }

    public static final class UpdateSequenceNumberForMessageId extends ainy {
        public UpdateSequenceNumberForMessageId(pa paVar) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET sequenceNumber=?\nWHERE messageId=?"));
        }

        public final void bind(Long l, String str) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindString(2, str);
        }
    }

    public static final class UpdateSnapServerStatus extends ainy {
        private final Factory<? extends NetworkMessageModel> networkMessageModelFactory;

        public UpdateSnapServerStatus(pa paVar, Factory<? extends NetworkMessageModel> factory) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET snapServerStatus=?\nWHERE messageId=?"));
            this.networkMessageModelFactory = factory;
        }

        public final void bind(SnapServerStatus snapServerStatus, String str) {
            if (snapServerStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.networkMessageModelFactory.snapServerStatusAdapter.encode(snapServerStatus));
            }
            bindString(2, str);
        }
    }

    public static final class UpdateSnapState extends ainy {
        private final Factory<? extends NetworkMessageModel> networkMessageModelFactory;

        public UpdateSnapState(pa paVar, Factory<? extends NetworkMessageModel> factory) {
            super(NetworkMessageModel.TABLE_NAME, paVar.a("UPDATE NetworkMessage\nSET\nsnapServerStatus=?,\nscreenshottedOrReplayed=?,\nviewerList=?,\nlastInteractionTimestamp=?\nWHERE messageId=?"));
            this.networkMessageModelFactory = factory;
        }

        public final void bind(SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, yfj yfj, Long l, String str) {
            if (snapServerStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.networkMessageModelFactory.snapServerStatusAdapter.encode(snapServerStatus));
            }
            if (screenshottedOrReplayedState == null) {
                bindNull(2);
            } else {
                bindString(2, (String) this.networkMessageModelFactory.screenshottedOrReplayedAdapter.encode(screenshottedOrReplayedState));
            }
            if (yfj == null) {
                bindNull(3);
            } else {
                bindBlob(3, (byte[]) this.networkMessageModelFactory.viewerListAdapter.encode(yfj));
            }
            if (l == null) {
                bindNull(4);
            } else {
                bindLong(4, l.longValue());
            }
            bindString(5, str);
        }
    }

    long _id();

    MessageClientStatus clientStatus();

    byte[] content();

    String conversationId();

    Long groupVersion();

    Long lastInteractionTimestamp();

    String messageId();

    String messageType();

    gcj preserved();

    boolean released();

    List<String> savedBy();

    gcm savedStates();

    ScreenshottedOrReplayedState screenshottedOrReplayed();

    List<String> seenBy();

    Long seenTimestamp();

    long senderId();

    long sentTimestamp();

    Long sequenceNumber();

    SnapServerStatus snapServerStatus();

    yfj viewerList();
}

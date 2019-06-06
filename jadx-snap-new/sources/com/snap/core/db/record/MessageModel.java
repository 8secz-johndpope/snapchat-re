package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import defpackage.aesg;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.gcp;
import defpackage.pa;
import defpackage.pc;
import defpackage.yfj;

public interface MessageModel {
    public static final String ADDLASTINTERACTIONTIMESTAMP = "ALTER TABLE Message\nADD lastInteractionTimestamp INTEGER";
    public static final String ADDMODIFIEDTIMESTAMP = "ALTER TABLE Message\nADD _modifiedTimestamp INTEGER NOT NULL DEFAULT 0";
    public static final String ADDRELEASED = "ALTER TABLE Message\nADD released INTEGER NOT NULL DEFAULT 0";
    public static final String ADDSCREENSHOTTEDORREPLAYED = "ALTER TABLE Message\nADD screenshottedOrReplayed TEXT";
    public static final String ADDSEENTIMESTAMP = "ALTER TABLE Message\nADD seenTimestamp INTEGER";
    public static final String ADDSNAPSERVERSTATUS = "ALTER TABLE Message\nADD snapServerStatus TEXT";
    public static final String ADDVIEWERLIST = "ALTER TABLE Message\nADD viewerList BLOB";
    @Deprecated
    public static final String CLIENTSTATUS = "clientStatus";
    @Deprecated
    public static final String CONTENT = "content";
    public static final String CREATEMODIFICATIONINSERTTRIGGER = "CREATE TRIGGER IF NOT EXISTS message_modifiedTimestamp_insert AFTER INSERT ON Message\n  BEGIN\n    -- This calculation will provide milliseconds since epoch time (currently the only way to get it through sqlite)\n    UPDATE Message SET _modifiedTimestamp = CAST((strftime('%J', 'now') - 2440587.5)*86400000 AS INTEGER) WHERE _id = new._id;\n  END";
    public static final String CREATEMODIFICATIONTRIGGER = "CREATE TRIGGER IF NOT EXISTS message_modifiedTimestamp AFTER UPDATE ON Message\n  BEGIN\n    -- This calculation will provide milliseconds since epoch time (currently the only way to get it through sqlite)\n    UPDATE Message SET _modifiedTimestamp = CAST((strftime('%J', 'now') - 2440587.5)*86400000 AS INTEGER) WHERE _id = old._id;\n  END";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Message(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    _modifiedTimestamp INTEGER NOT NULL DEFAULT 0,\n    key TEXT NOT NULL UNIQUE,\n    feedRowId INTEGER REFERENCES Feed(_id) ON DELETE CASCADE,\n    -- Timestamp when the message was sent\n    timestamp INTEGER NOT NULL,\n   -- Important, this should ONLY be used for message retention and never displayed to the user\n    seenTimestamp INTEGER,\n    senderId INTEGER,\n    clientStatus TEXT,\n    sequenceNumber INTEGER,\n\n    type TEXT,\n\n     -- DEPRECATED\n    cryptoKey TEXT,\n    cryptoIV TEXT,\n\n    -- All of these media attributes are DEPRECATED\n    mediaId TEXT,\n    mediaType TEXT,\n    mediaUrl TEXT,\n    mediaWidth INTEGER,\n    mediaHeight INTEGER,\n    mediaOwner TEXT,\n    mediaTimerSec REAL,\n    mediaIsInfinite INTEGER,\n    mediaZipped INTEGER,\n    mediaVenueId TEXT,\n    mediaSourceId TEXT,\n     -- DEPRECATED\n    payloadId INTEGER,\n\n     -- The content to render for the message, the \"type\" should describe this content and indicate who can render it\n    content BLOB,\n     -- preservation state\n    preserved INTEGER NOT NULL,\n    savedStates TEXT,\n--      release state -> true means if this is a message I sent, other has viewed my message;\n--                                  if this is a message I received, I have viewed the message;\n    released INTEGER NOT NULL DEFAULT 0,\n     -- DEPRECATED\n    messageOrderingKey TEXT,\n\n    -- Snap Specific\n    screenshottedOrReplayed TEXT,\n    -- Snap Specific\n    snapServerStatus TEXT,\n    -- last received/viewed/screenshot/replay timestamp for snaps & release ts for chats\n    lastInteractionTimestamp INTEGER,\n    -- Snap Specific, group snap viewer list of friendRowId --\n    viewerList BLOB\n)";
    @Deprecated
    public static final String CRYPTOIV = "cryptoIV";
    @Deprecated
    public static final String CRYPTOKEY = "cryptoKey";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String KEY = "key";
    @Deprecated
    public static final String LASTINTERACTIONTIMESTAMP = "lastInteractionTimestamp";
    @Deprecated
    public static final String MEDIAHEIGHT = "mediaHeight";
    @Deprecated
    public static final String MEDIAID = "mediaId";
    @Deprecated
    public static final String MEDIAISINFINITE = "mediaIsInfinite";
    @Deprecated
    public static final String MEDIAOWNER = "mediaOwner";
    @Deprecated
    public static final String MEDIASOURCEID = "mediaSourceId";
    @Deprecated
    public static final String MEDIATIMERSEC = "mediaTimerSec";
    @Deprecated
    public static final String MEDIATYPE = "mediaType";
    @Deprecated
    public static final String MEDIAURL = "mediaUrl";
    @Deprecated
    public static final String MEDIAVENUEID = "mediaVenueId";
    @Deprecated
    public static final String MEDIAWIDTH = "mediaWidth";
    @Deprecated
    public static final String MEDIAZIPPED = "mediaZipped";
    @Deprecated
    public static final String MESSAGEORDERINGKEY = "messageOrderingKey";
    @Deprecated
    public static final String PAYLOADID = "payloadId";
    @Deprecated
    public static final String PRESERVED = "preserved";
    @Deprecated
    public static final String RELEASED = "released";
    @Deprecated
    public static final String SAVEDSTATES = "savedStates";
    @Deprecated
    public static final String SCREENSHOTTEDORREPLAYED = "screenshottedOrReplayed";
    @Deprecated
    public static final String SEENTIMESTAMP = "seenTimestamp";
    @Deprecated
    public static final String SENDERID = "senderId";
    @Deprecated
    public static final String SEQUENCENUMBER = "sequenceNumber";
    @Deprecated
    public static final String SNAPSERVERSTATUS = "snapServerStatus";
    @Deprecated
    public static final String TABLE_NAME = "Message";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String TYPE = "type";
    @Deprecated
    public static final String VIEWERLIST = "viewerList";
    @Deprecated
    public static final String _ID = "_id";
    @Deprecated
    public static final String _MODIFIEDTIMESTAMP = "_modifiedTimestamp";

    public interface GetMessagesForFeedCreator<T extends GetMessagesForFeedModel> {
        T create(long j, long j2, String str, String str2, long j3, Long l, Long l2, byte[] bArr, gcm gcm, MessageClientStatus messageClientStatus, Long l3, String str3, boolean z, String str4, String str5, SnapServerStatus snapServerStatus, SnapServerStatus snapServerStatus2, String str6, yfj yfj, ScreenshottedOrReplayedState screenshottedOrReplayedState, ScreenshottedOrReplayedState screenshottedOrReplayedState2, ReplyMedia replyMedia, gcp gcp, Long l4, FeedKind feedKind, gcj gcj, Integer num, Long l5, long j4);
    }

    public interface GetPlayableSnapsForFeedCreator<T extends GetPlayableSnapsForFeedModel> {
        T create(long j, String str, String str2, long j2, Long l, byte[] bArr, MessageClientStatus messageClientStatus, String str3, boolean z, String str4, String str5, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, FeedKind feedKind, gcj gcj);
    }

    public interface GetLastMessageForFeedExcludingStatusCreator<T extends GetLastMessageForFeedExcludingStatusModel> {
        T create(long j, String str, long j2, MessageClientStatus messageClientStatus, Long l, gcp gcp, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2, Long l2);
    }

    public interface GetMessageMediaInfoForSnapIdCreator<T extends GetMessageMediaInfoForSnapIdModel> {
        T create(String str, String str2, String str3, String str4, String str5, String str6, aesg aesg, gcp gcp);
    }

    public interface GetMessageMediaInfoForIdCreator<T extends GetMessageMediaInfoForIdModel> {
        T create(String str, String str2, String str3, byte[] bArr, String str4);
    }

    public interface GetMessageMediaInfoForKeyCreator<T extends GetMessageMediaInfoForKeyModel> {
        T create(String str, String str2, byte[] bArr, ReplyMedia replyMedia, String str3);
    }

    public interface GetMessageByKeyCreator<T extends GetMessageByKeyModel> {
        T create(String str, long j, long j2, Long l, gcm gcm, gcj gcj, boolean z);
    }

    public interface GetSnapMessageInfoForKeyCreator<T extends GetSnapMessageInfoForKeyModel> {
        T create(String str, SnapServerStatus snapServerStatus, long j, gcm gcm, gcj gcj, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, String str2, String str3, String str4, long j2);
    }

    public interface GetMessageInfoForDifferentialUpdateCreator<T extends GetMessageInfoForDifferentialUpdateModel> {
        T create(long j, String str, long j2, String str2, MessageClientStatus messageClientStatus, gcj gcj, gcm gcm);
    }

    public interface GetSnapInfoForDifferentialUpdateCreator<T extends GetSnapInfoForDifferentialUpdateModel> {
        T create(String str, long j, long j2, gcp gcp, String str2, SnapServerStatus snapServerStatus, gcm gcm, gcj gcj);
    }

    public interface GetLastReleasedChatCreator<T extends GetLastReleasedChatModel> {
        T create(String str, Long l, String str2, long j, MessageClientStatus messageClientStatus, Long l2);
    }

    public interface GetLastReceivedNotViewedChatCreator<T extends GetLastReceivedNotViewedChatModel> {
        T create(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3, boolean z, Long l4, gcj gcj, gcm gcm, Long l5, FeedKind feedKind);
    }

    public interface GetLastReceivedViewedChatCreator<T extends GetLastReceivedViewedChatModel> {
        T create(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3);
    }

    public interface GetLastSentNotViewedChatCreator<T extends GetLastSentNotViewedChatModel> {
        T create(Long l, String str, Long l2, String str2, long j, MessageClientStatus messageClientStatus, Long l3, FriendLinkType friendLinkType, String str3);
    }

    public interface GetLastSentViewedChatCreator<T extends GetLastSentViewedChatModel> {
        T create(Long l, String str, Long l2, String str2, long j, Long l3, MessageClientStatus messageClientStatus, Long l4);
    }

    public interface GetLastReceivedNotViewedUpdateMessageCreator<T extends GetLastReceivedNotViewedUpdateMessageModel> {
        T create(Long l, String str, Long l2, String str2, long j, Long l3, byte[] bArr, MessageClientStatus messageClientStatus, boolean z, Long l4, gcj gcj, gcm gcm, long j2, FeedKind feedKind);
    }

    public interface GetLastMessageForMessageClientStatusCreator<T extends GetLastMessageForMessageClientStatusModel> {
        T create(Long l, Long l2, String str, String str2, String str3, Long l3, MessageClientStatus messageClientStatus, long j);
    }

    public interface GetLastViewedMessageCreator<T extends GetLastViewedMessageModel> {
        T create(long j, String str, Long l, long j2, MessageClientStatus messageClientStatus, Long l2);
    }

    public interface MessageDumpCreator<T extends MessageDumpModel> {
        T create(String str, long j, String str2, long j2, String str3, MessageClientStatus messageClientStatus, Long l, String str4, boolean z);
    }

    public interface GetBasicInfoForMessageCreator<T extends GetBasicInfoForMessageModel> {
        T create(String str, Long l, String str2, String str3);
    }

    public interface GetReceivedSnapsCreator<T extends GetReceivedSnapsModel> {
        T create(Long l, Long l2, String str, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr);
    }

    public interface GetLastSentSnapForMessageCreator<T extends GetLastSentSnapForMessageModel> {
        T create(Long l, Long l2, String str, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, byte[] bArr2, FriendLinkType friendLinkType);
    }

    public interface GetContentForMessagesCreator<T extends GetContentForMessagesModel> {
        T create(long j, String str, String str2, String str3, byte[] bArr, long j2, String str4);
    }

    public interface GetSnapInfoFromMessageByMessageIdCreator<T extends GetSnapInfoFromMessageByMessageIdModel> {
        T create(long j, String str, String str2, String str3, long j2, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj, Long l);
    }

    public interface GetSnapInfoWithContentFromMessageByMessageIdCreator<T extends GetSnapInfoWithContentFromMessageByMessageIdModel> {
        T create(long j, String str, String str2, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, byte[] bArr);
    }

    public interface GetSnapOperaInfoByRowIdCreator<T extends GetSnapOperaInfoByRowIdModel> {
        T create(Long l, String str, String str2, Long l2, long j, byte[] bArr, FeedKind feedKind, String str3);
    }

    public interface GetSnapsOlderThanTimestampCreator<T extends GetSnapsOlderThanTimestampModel> {
        T create(String str, Long l);
    }

    public interface GetSnapsFromMessageForFeedCreator<T extends GetSnapsFromMessageForFeedModel> {
        T create(String str, SnapServerStatus snapServerStatus, String str2, long j, boolean z, long j2);
    }

    public interface GetSnapMessageInfoForKeyNewCreator<T extends GetSnapMessageInfoForKeyNewModel> {
        T create(String str, SnapServerStatus snapServerStatus, long j, gcm gcm, gcj gcj, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, String str2, String str3, String str4, long j2);
    }

    public interface GetSnapMetadataForMessageIdCreator<T extends GetSnapMetadataForMessageIdModel> {
        T create(long j, byte[] bArr, FeedKind feedKind, String str, String str2);
    }

    public interface GetSnapStatesByIdsCreator<T extends GetSnapStatesByIdsModel> {
        T create(String str, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState);
    }

    public interface GetMessageInfoForDifferentialUpdateModel {
        MessageClientStatus clientStatus();

        long id();

        String key();

        gcj preserved();

        gcm savedStates();

        long timestamp();

        String type();
    }

    public interface GetLastReceivedNotViewedChatModel {
        MessageClientStatus clientStatus();

        Long feedRowId();

        String key();

        FeedKind kind();

        Long messageRetentionInMinutes();

        gcj preserved();

        boolean released();

        gcm savedStates();

        Long seenTimestamp();

        Long senderId();

        Long sequenceNumber();

        long timestamp();

        String type();
    }

    public interface Creator<T extends MessageModel> {
        T create(long j, long j2, String str, Long l, long j3, Long l2, Long l3, MessageClientStatus messageClientStatus, Long l4, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Float f, Boolean bool, Boolean bool2, String str9, String str10, Long l5, byte[] bArr, gcj gcj, gcm gcm, boolean z, String str11, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, Long l6, yfj yfj);
    }

    public static final class Factory<T extends MessageModel> {
        public final ainu<MessageClientStatus, String> clientStatusAdapter;
        public final Creator<T> creator;
        public final ainu<gcj, Long> preservedAdapter;
        public final ainu<gcm, String> savedStatesAdapter;
        public final ainu<ScreenshottedOrReplayedState, String> screenshottedOrReplayedAdapter;
        public final ainu<SnapServerStatus, String> snapServerStatusAdapter;
        public final ainu<yfj, byte[]> viewerListAdapter;

        final class GetMessageInfoForDifferentialUpdateQuery extends ainx {
            private final Long feedRowId;
            private final long timestamp;

            GetMessageInfoForDifferentialUpdateQuery(Long l, long j) {
                super("SELECT\n_id AS id,\nkey,\ntimestamp,\ntype,\nclientStatus,\npreserved,\nsavedStates\nFROM\nMessage\nWHERE feedRowId = ?1 AND timestamp > ?2", new aioa(MessageModel.TABLE_NAME));
                this.feedRowId = l;
                this.timestamp = j;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, this.timestamp);
            }
        }

        final class GetLastMessageForMessageClientStatusQuery extends ainx {
            private final MessageClientStatus[] clientStatus;
            private final Long[] feedRowId;
            private final String[] type;

            GetLastMessageForMessageClientStatusQuery(Long[] lArr, MessageClientStatus[] messageClientStatusArr, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        Message.feedRowId,\n        Message.senderId,\n        Message.key AS chatMessageId,\n        Snap.snapId,\n        Message.type,\n        Message.senderId,\n        Message.clientStatus,\n        Message.timestamp\n    FROM Message\n    LEFT JOIN MessagingSnap ON MessagingSnap.messageRowId = Message._id\n    LEFT JOIN Snap ON MessagingSnap.snapRowId = Snap._id\n    WHERE Message.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\n        AND Message.clientStatus IN ");
                stringBuilder.append(ainz.a(messageClientStatusArr.length));
                stringBuilder.append("\n        AND Message.type NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append("\n    ORDER BY Message.feedRowId, Message.timestamp ASC\n) GROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.feedRowId = lArr;
                this.clientStatus = messageClientStatusArr;
                this.type = strArr;
            }

            public final void bindTo(pc pcVar) {
                int length;
                int i;
                int i2;
                int i3;
                int i4;
                Long[] lArr = this.feedRowId;
                int i5 = 0;
                if (lArr != null) {
                    length = lArr.length;
                    i = 0;
                    i2 = 1;
                    while (i < length) {
                        i3 = i2 + 1;
                        pcVar.bindLong(i2, lArr[i].longValue());
                        i++;
                        i2 = i3;
                    }
                } else {
                    i2 = 2;
                    pcVar.bindNull(1);
                }
                MessageClientStatus[] messageClientStatusArr = this.clientStatus;
                if (messageClientStatusArr != null) {
                    i = messageClientStatusArr.length;
                    length = 0;
                    while (length < i) {
                        i3 = i2 + 1;
                        pcVar.bindString(i2, (String) Factory.this.clientStatusAdapter.encode(messageClientStatusArr[length]));
                        length++;
                        i2 = i3;
                    }
                    i4 = i2;
                } else {
                    i4 = i2 + 1;
                    pcVar.bindNull(i2);
                }
                String[] strArr = this.type;
                if (strArr != null) {
                    length = strArr.length;
                    while (i5 < length) {
                        int i6 = i4 + 1;
                        pcVar.bindString(i4, strArr[i5]);
                        i5++;
                        i4 = i6;
                    }
                    return;
                }
                pcVar.bindNull(i4);
            }
        }

        final class GetLastReceivedNotViewedChatQuery extends ainx {
            private final Long[] feedRowId;
            private final String[] type;
            private final String username;

            GetLastReceivedNotViewedChatQuery(String str, Long[] lArr, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        Message.feedRowId,\n        Message.key,\n        Message.senderId,\n        Message.type,\n        Message.timestamp,\n        Message.clientStatus,\n        Message.sequenceNumber,\n        -- fields used for expiration check\n        Message.released,\n        Message.seenTimestamp,\n        Message.preserved,\n        Message.savedStates,\n        Feed.messageRetentionInMinutes,\n        Feed.kind\n    FROM Message\n    LEFT OUTER JOIN Friend ON Message.senderId = Friend._id\n    LEFT OUTER JOIN Feed ON Message.feedRowId = Feed._id\n    WHERE\n        -- sender's username != {myUsername}\n        Friend.username != ?1\n        -- message.type!='snap'\n        AND Message.released = 0\n        AND Message.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\n        AND Message.type NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append("\n    ORDER BY Message.feedRowId, Message.timestamp ASC\n)\nGROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.username = str;
                this.feedRowId = lArr;
                this.type = strArr;
            }

            public final void bindTo(pc pcVar) {
                int i;
                int i2;
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                Long[] lArr = this.feedRowId;
                int i3 = 0;
                if (lArr != null) {
                    int length = lArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        int i4 = i2 + 1;
                        pcVar.bindLong(i2, lArr[i].longValue());
                        i++;
                        i2 = i4;
                    }
                } else {
                    i2 = 3;
                    pcVar.bindNull(2);
                }
                String[] strArr = this.type;
                if (strArr != null) {
                    i = strArr.length;
                    while (i3 < i) {
                        int i5 = i2 + 1;
                        pcVar.bindString(i2, strArr[i3]);
                        i3++;
                        i2 = i5;
                    }
                    return;
                }
                pcVar.bindNull(i2);
            }
        }

        final class GetSortingTimestampForFeedQuery extends ainx {
            private final Long feedRowId;
            private final String[] type;

            GetSortingTimestampForFeedQuery(Long l, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT MAX(Message.timestamp)\nFROM Message\nINNER JOIN Feed ON Message.feedRowId = Feed._id\nINNER JOIN Friend ON Message.senderId = Friend._id\nWHERE\n    Message.feedRowId = ?1\n    AND Message.type NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.feedRowId = l;
                this.type = strArr;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                String[] strArr = this.type;
                int i = 2;
                if (strArr != null) {
                    int length = strArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindString(i, strArr[i2]);
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(2);
            }
        }

        final class DeleteMessagesForKeysQuery extends ainx {
            private final String[] key;

            DeleteMessagesForKeysQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Message\nWHERE key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
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

        final class GetBasicInfoForMessageQuery extends ainx {
            private final long _id;

            GetBasicInfoForMessageQuery(long j) {
                super("SELECT\nMessage.key,\nMessage.sequenceNumber,\nMessage.type,\nFriend.username AS senderUsername\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nWHERE Message._id =?1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetContentForMessagesQuery extends ainx {
            private final long[] _id;

            GetContentForMessagesQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Message._id,\n    Message.key,\n    Friend.username AS senderUsername,\n    Message.type,\n    Message.content,\n    Message.timestamp,\n    Feed.key\nFROM Message\nJOIN Friend ON Friend._id = Message.senderId\nJOIN Feed ON Feed._id = Message.feedRowId\nWHERE Message._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this._id = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this._id;
                int length = jArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetIsArroyoForMessageKeyQuery extends ainx {
            private final String key;

            GetIsArroyoForMessageKeyQuery(String str) {
                super("SELECT\n    Feed.isArroyo\nFROM Message\nJOIN Feed ON Feed._id = Message.feedRowId\nWHERE Message.key = ?1\nLIMIT 1", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetLastMessageForFeedExcludingStatusQuery extends ainx {
            private final MessageClientStatus clientStatus;
            private final Long feedRowId;

            GetLastMessageForFeedExcludingStatusQuery(Long l, MessageClientStatus messageClientStatus) {
                super("SELECT\n    Message._id,\n    Message.type,\n    Message.timestamp,\n    Message.clientStatus,\n    Message.sequenceNumber,\n    Snap.snapType AS snapType,\n    MessagingSnap.serverStatus AS snapServerStatus,\n    MessagingSnap.screenshottedOrReplayed AS snapScreenshottedOrReplayed,\n    Friend.username AS senderUsername,\n    Friend._id AS senderUserId\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN MessagingSnap ON Message._id = MessagingSnap.messageRowId\nLEFT OUTER JOIN Snap ON MessagingSnap.snapRowId = Snap._id\nWHERE Message.feedRowId=?1 AND Message.clientStatus != ?2\nORDER BY Message.timestamp DESC\nLIMIT 1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.feedRowId = l;
                this.clientStatus = messageClientStatus;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                MessageClientStatus messageClientStatus = this.clientStatus;
                if (messageClientStatus != null) {
                    pcVar.bindString(2, (String) Factory.this.clientStatusAdapter.encode(messageClientStatus));
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetLastMessageForFeedQuery extends ainx {
            private final Long feedRowId;

            GetLastMessageForFeedQuery(Long l) {
                super("SELECT\n    Message._id,\n    Message.type,\n    Message.timestamp,\n    Message.clientStatus,\n    Message.sequenceNumber,\n    Snap.snapType AS snapType,\n    MessagingSnap.serverStatus AS snapServerStatus,\n    MessagingSnap.screenshottedOrReplayed AS snapScreenshottedOrReplayed,\n    Friend.username AS senderUsername,\n    Friend._id AS senderUserId\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN MessagingSnap ON Message._id = MessagingSnap.messageRowId\nLEFT OUTER JOIN Snap ON MessagingSnap.snapRowId = Snap._id\nWHERE Message.feedRowId=?1\nORDER BY Message.timestamp DESC\nLIMIT 1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.feedRowId = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class GetLastReceivedNotViewedUpdateMessageQuery extends ainx {
            private final Long[] feedRowId;
            private final String username;

            GetLastReceivedNotViewedUpdateMessageQuery(String str, Long[] lArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        Message.feedRowId,\n        Message.key,\n        Message.senderId,\n        Message.type,\n        Message.timestamp,\n        Message.sequenceNumber,\n        Message.content,\n        -- fields used for expiration check\n        Message.clientStatus,\n        Message.released,\n        Message.seenTimestamp,\n        Message.preserved,\n        Message.savedStates,\n        Feed.messageRetentionInMinutes,\n        Feed.kind\n    FROM Message\n    JOIN Feed ON Message.feedRowId = Feed._id\n    LEFT OUTER JOIN Friend ON Message.senderId = Friend._id\n    WHERE\n        -- sender's username != {myUsername}\n        Friend.username != ?1\n        AND Message.type='update_message'\n        AND Message.released = 0\n        AND Message.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\n    ORDER BY Message.feedRowId, Message.timestamp ASC\n)\nGROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
                this.feedRowId = lArr;
            }

            public final void bindTo(pc pcVar) {
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                Long[] lArr = this.feedRowId;
                int i = 2;
                if (lArr != null) {
                    int length = lArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindLong(i, lArr[i2].longValue());
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(2);
            }
        }

        final class GetLastReceivedViewedChatQuery extends ainx {
            private final Long[] feedRowId;
            private final String[] type;
            private final String username;

            GetLastReceivedViewedChatQuery(String str, String[] strArr, Long[] lArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        Message.feedRowId,\n        Message.key,\n        Message.senderId,\n        Message.type,\n        Message.timestamp,\n        Message.clientStatus,\n        Message.sequenceNumber\n    FROM Message\n    LEFT OUTER JOIN Friend ON Message.senderId = Friend._id\n    WHERE\n        -- sender's username != {myUsername}\n        Friend.username != ?1\n        -- message.type!='snap'\n        AND Message.type NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append("\n        AND Message.released = 1\n        AND Message.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\n    ORDER BY Message.feedRowId, Message.timestamp ASC\n) GROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
                this.type = strArr;
                this.feedRowId = lArr;
            }

            public final void bindTo(pc pcVar) {
                int i;
                int i2;
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                String[] strArr = this.type;
                int i3 = 0;
                if (strArr != null) {
                    int length = strArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        int i4 = i2 + 1;
                        pcVar.bindString(i2, strArr[i]);
                        i++;
                        i2 = i4;
                    }
                } else {
                    i2 = 3;
                    pcVar.bindNull(2);
                }
                Long[] lArr = this.feedRowId;
                if (lArr != null) {
                    i = lArr.length;
                    while (i3 < i) {
                        int i5 = i2 + 1;
                        pcVar.bindLong(i2, lArr[i3].longValue());
                        i3++;
                        i2 = i5;
                    }
                    return;
                }
                pcVar.bindNull(i2);
            }
        }

        final class GetLastReleasedChatQuery extends ainx {
            private final Long feedRowId;
            private final Long sequenceNumber;
            private final String type;
            private final String username;

            GetLastReleasedChatQuery(Long l, String str, String str2, Long l2) {
                super("SELECT\n    Message.key,\n    Message.senderId,\n    Message.type,\n    Message.timestamp,\n    Message.clientStatus,\n    Message.sequenceNumber\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN Feed ON Message.feedRowId = Feed._id\nWHERE Message.feedRowId=?1\n    -- sender's username\n    AND Friend.username=?2\n    -- message.type!='snap'\n    AND Message.type!=?3\n    AND Message.sequenceNumber<=?4\nORDER BY Message.timestamp DESC\nLIMIT 1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.feedRowId = l;
                this.username = str;
                this.type = str2;
                this.sequenceNumber = l2;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
                str = this.type;
                if (str != null) {
                    pcVar.bindString(3, str);
                } else {
                    pcVar.bindNull(3);
                }
                l = this.sequenceNumber;
                if (l != null) {
                    pcVar.bindLong(4, l.longValue());
                } else {
                    pcVar.bindNull(4);
                }
            }
        }

        final class GetLastSentNotViewedChatQuery extends ainx {
            private final Long[] feedRowId;
            private final String[] type;
            private final String username;

            GetLastSentNotViewedChatQuery(String str, String[] strArr, Long[] lArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        Message.feedRowId,\n        Message.key,\n        Message.senderId,\n        Message.type,\n        Message.timestamp,\n        Message.clientStatus,\n        Message.sequenceNumber,\n        Correspondent.friendLinkType,\n        Correspondent.username\n    FROM Message\n    LEFT OUTER JOIN Friend AS Self ON Message.senderId = Self._id\n    LEFT OUTER JOIN Feed ON Message.feedRowId = Feed._id\n    LEFT OUTER JOIN Friend AS Correspondent ON Feed.friendRowId = Correspondent._id\n    WHERE\n        -- sender's username == {myUsername}\n        Self.username=?1\n        -- message.type!='snap'\n        AND Message.type NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append("\n        AND Message.released = 0\n        AND Message.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\n    ORDER BY Message.feedRowId, Message.timestamp ASC\n) GROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.username = str;
                this.type = strArr;
                this.feedRowId = lArr;
            }

            public final void bindTo(pc pcVar) {
                int i;
                int i2;
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                String[] strArr = this.type;
                int i3 = 0;
                if (strArr != null) {
                    int length = strArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        int i4 = i2 + 1;
                        pcVar.bindString(i2, strArr[i]);
                        i++;
                        i2 = i4;
                    }
                } else {
                    i2 = 3;
                    pcVar.bindNull(2);
                }
                Long[] lArr = this.feedRowId;
                if (lArr != null) {
                    i = lArr.length;
                    while (i3 < i) {
                        int i5 = i2 + 1;
                        pcVar.bindLong(i2, lArr[i3].longValue());
                        i3++;
                        i2 = i5;
                    }
                    return;
                }
                pcVar.bindNull(i2);
            }
        }

        final class GetLastSentSnapForMessageQuery extends ainx {
            private final long[] _id;
            private final SnapServerStatus[] snapServerStatus;
            private final String username;

            GetLastSentSnapForMessageQuery(String str, SnapServerStatus[] snapServerStatusArr, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        Message.feedRowId,\n        Message.senderId,\n        Message.key,\n        Message.timestamp AS messageTimestamp, -- sent timestamp\n        MAX(ifnull(Message.lastInteractionTimestamp, 0), Message.timestamp) AS interactionTimestamp,\n        Message.snapServerStatus, -- com.snap.core.db.column.SnapServerStatus\n        Message.screenshottedOrReplayed,\n        Message.content,\n        Feed.authToken,\n        Correspondent.friendLinkType\n    FROM Message\n    INNER JOIN Feed ON Message.feedRowId = Feed._id\n    INNER JOIN Friend AS Self ON Message.senderId = Self._id\n    -- left outer join because Feed.friendRowId is null for group chat --\n    LEFT OUTER JOIN Friend AS Correspondent ON Feed.friendRowId = Correspondent._id\n    WHERE\n        -- sender's username = {myUsername}\n        Self.username = ?1\n        AND Message.snapServerStatus IN ");
                stringBuilder.append(ainz.a(snapServerStatusArr.length));
                stringBuilder.append("\n        AND Feed._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                stringBuilder.append("\n    ORDER BY Message.feedRowId, MAX(ifnull(Message.lastInteractionTimestamp, 0), Message.timestamp) ASC\n) GROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
                this.snapServerStatus = snapServerStatusArr;
                this._id = jArr;
            }

            public final void bindTo(pc pcVar) {
                int length;
                int i;
                int i2;
                pcVar.bindString(1, this.username);
                SnapServerStatus[] snapServerStatusArr = this.snapServerStatus;
                int i3 = 0;
                if (snapServerStatusArr != null) {
                    length = snapServerStatusArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        int i4 = i2 + 1;
                        pcVar.bindString(i2, (String) Factory.this.snapServerStatusAdapter.encode(snapServerStatusArr[i]));
                        i++;
                        i2 = i4;
                    }
                } else {
                    i2 = 3;
                    pcVar.bindNull(2);
                }
                long[] jArr = this._id;
                i = jArr.length;
                while (i3 < i) {
                    length = i2 + 1;
                    pcVar.bindLong(i2, jArr[i3]);
                    i3++;
                    i2 = length;
                }
            }
        }

        final class GetLastSentViewedChatQuery extends ainx {
            private final Long[] feedRowId;
            private final String[] type;
            private final String username;

            GetLastSentViewedChatQuery(String str, String[] strArr, Long[] lArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        Message.feedRowId,\n        Message.key,\n        Message.senderId,\n        Message.type,\n        Message.timestamp,\n        Message.lastInteractionTimestamp,\n        Message.clientStatus,\n        Message.sequenceNumber\n    FROM Message\n    LEFT OUTER JOIN Friend AS Self ON Message.senderId = Self._id\n    WHERE\n        -- sender's username = {myUsername}\n        Self.username = ?1\n        -- message.type!='snap'\n        AND Message.type NOT IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append("\n        AND Message.released = 1\n        AND Message.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\n    ORDER BY Message.feedRowId, Message.timestamp ASC\n) GROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
                this.type = strArr;
                this.feedRowId = lArr;
            }

            public final void bindTo(pc pcVar) {
                int i;
                int i2;
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                String[] strArr = this.type;
                int i3 = 0;
                if (strArr != null) {
                    int length = strArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        int i4 = i2 + 1;
                        pcVar.bindString(i2, strArr[i]);
                        i++;
                        i2 = i4;
                    }
                } else {
                    i2 = 3;
                    pcVar.bindNull(2);
                }
                Long[] lArr = this.feedRowId;
                if (lArr != null) {
                    i = lArr.length;
                    while (i3 < i) {
                        int i5 = i2 + 1;
                        pcVar.bindLong(i2, lArr[i3].longValue());
                        i3++;
                        i2 = i5;
                    }
                    return;
                }
                pcVar.bindNull(i2);
            }
        }

        final class GetLastSnapTimestampForFeedQuery extends ainx {
            private final Long feedRowId;
            private final String type;

            GetLastSnapTimestampForFeedQuery(String str, Long l) {
                super("SELECT\n    timestamp\nFROM Message\nWHERE type=?1 -- SNAP\nAND feedRowId=?2\nORDER BY Message.timestamp DESC\nLIMIT 1", new aioa(MessageModel.TABLE_NAME));
                this.type = str;
                this.feedRowId = l;
            }

            public final void bindTo(pc pcVar) {
                String str = this.type;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetLastViewedMessageQuery extends ainx {
            private final Long feedRowId;
            private final Long sequenceNumber;
            private final String username;

            GetLastViewedMessageQuery(Long l, String str, Long l2) {
                super("SELECT\n    Message._id,\n    Message.type,\n    Message.senderId,\n    Message.timestamp,\n    Message.clientStatus,\n    Message.sequenceNumber\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN Feed ON Message.feedRowId = Feed._id\nWHERE Message.feedRowId=?1\n    -- Friend.username = {friend's username} AND Message.sequenceNumber <= {friend's seqNum I viewed}\n    AND (Friend.username = ?2 AND Message.sequenceNumber <= ?3)\nORDER BY Message.timestamp DESC\nLIMIT 1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.feedRowId = l;
                this.username = str;
                this.sequenceNumber = l2;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
                l = this.sequenceNumber;
                if (l != null) {
                    pcVar.bindLong(3, l.longValue());
                } else {
                    pcVar.bindNull(3);
                }
            }
        }

        final class GetMessageByKeyQuery extends ainx {
            private final String key;

            GetMessageByKeyQuery(String str) {
                super("SELECT\nMessage.key,\nMessage._id,\nMessage.timestamp,\nMessage.seenTimestamp,\nMessage.savedStates,\nMessage.preserved,\nMessage.released\nFROM Message\nWHERE Message.key = ?1", new aioa(MessageModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetMessageIdForKeyQuery extends ainx {
            private final Long feedRowId;
            private final String key;

            GetMessageIdForKeyQuery(String str, Long l) {
                super("SELECT _id\nFROM Message\nWHERE key=?1 AND feedRowId=?2\nLIMIT 1", new aioa(MessageModel.TABLE_NAME));
                this.key = str;
                this.feedRowId = l;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetMessageIdsWithStatusQuery extends ainx {
            private final long _id;
            private final MessageClientStatus clientStatus;

            GetMessageIdsWithStatusQuery(long j, MessageClientStatus messageClientStatus) {
                super("SELECT\nMessage.key\nFROM Message\nJOIN Feed ON Feed._id = ?1\nWHERE Message.clientStatus = ?2", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this._id = j;
                this.clientStatus = messageClientStatus;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
                MessageClientStatus messageClientStatus = this.clientStatus;
                if (messageClientStatus != null) {
                    pcVar.bindString(2, (String) Factory.this.clientStatusAdapter.encode(messageClientStatus));
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetMessageMediaInfoForIdQuery extends ainx {
            private final long _id;

            GetMessageMediaInfoForIdQuery(long j) {
                super("SELECT\n    Feed.key AS conversationId,\n    Message.key,\n    Message.type,\n    Message.content,\n    Friend.username AS senderId\nFROM Message\nJOIN Feed ON Feed._id = Message.feedRowId\nJOIN Friend ON Message.senderId = Friend._id\nWHERE Message._id = ?1", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetMessageMediaInfoForKeyQuery extends ainx {
            private final String key;

            GetMessageMediaInfoForKeyQuery(String str) {
                super("SELECT\n    Feed.key AS conversationId,\n    Message.type,\n    Message.content,\n    MessagingSnap.replyMedia AS snapReplyMedia,\n    Friend.username AS senderId\nFROM Message\nJOIN Feed ON Feed._id = Message.feedRowId\nJOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN MessagingSnap ON Message._id = MessagingSnap.messageRowId\nWHERE Message.key = ?1", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetMessageMediaInfoForSnapIdQuery extends ainx {
            private final long snapRowId;

            GetMessageMediaInfoForSnapIdQuery(long j) {
                super("SELECT\n    Feed.key AS conversationId,\n    Message.mediaId,\n    Message.key,\n    Message.cryptoKey,\n    Message.cryptoIV,\n    Friend.username AS senderId,\n    MessagingSnap.directDownloadUrl,\n    Snap.snapType\nFROM Message\nJOIN Feed ON Feed._id = Message.feedRowId\nJOIN MessagingSnap ON MessagingSnap.messageRowId = Message._id\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nJOIN Friend ON Message.senderId = Friend._id\nWHERE Message._id = (SELECT MessagingSnap.messageRowId FROM MessagingSnap WHERE snapRowId = ?1)", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.snapRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.snapRowId);
            }
        }

        final class GetMessagesForFeedQuery extends ainx {
            private final Object arg2;
            private final Object arg3;
            private final Long feedRowId;
            private final String username;

            GetMessagesForFeedQuery(Long l, Object obj, Object obj2, String str) {
                super("SELECT\n    Message._id,\n    Message._modifiedTimestamp,\n    Message.key,\n    Message.type,\n    Message.timestamp,\n    Message.seenTimestamp,\n    Message.feedRowId,\n    Message.content,\n    Message.savedStates,\n    Message.clientStatus,\n    Message.sequenceNumber,\n    Feed.key AS feedKey,\n    Message.released,\n    Friend.displayName AS senderDisplayName,\n    Friend.username AS senderUsername,\n\n    -- until the snap refactor is fully rolled out we need to grab duplicate columns here because the row adapter\n    -- doesn't work with the ifnull method\n    MessagingSnap.serverStatus AS snapServerStatus,\n    Message.snapServerStatus AS newSnapServerStatus,\n    MessagingSnap.viewerList,\n    Message.viewerList AS newViewerList,\n    MessagingSnap.screenshottedOrReplayed AS screenshotOrReplayed,\n    Message.screenshottedOrReplayed AS newScreenshotOrReplayed,\n    MessagingSnap.replyMedia AS snapReplyMedia,\n    Snap.snapType AS snapType,\n    Snap._id AS snapRowId,\n    Feed.kind AS feedKind,\n    Message.preserved,\n    FeedMember.color AS senderColor,\n    Feed.messageRetentionInMinutes AS messageRetentionInMinutes,\n    (Feed.friendRowId=Message.senderId AND Friend.username=?4) AS isSelfConversation\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN MessagingSnap ON Message._id = MessagingSnap.messageRowId\nLEFT OUTER JOIN Feed ON Feed._id = Message.feedRowId\nLEFT OUTER JOIN Snap ON MessagingSnap.snapRowId = Snap._id\nLEFT OUTER JOIN FeedMember ON Message.feedRowId = FeedMember.feedRowId AND Message.senderId = FeedMember.friendRowId\nWHERE Message.feedRowId=?1\nORDER BY Message.timestamp DESC\n-- when doing pagination, we need to make sure all unviewed chats are returned to user\nLIMIT CASE\n    WHEN ?2 > 0 THEN MAX(?3, (SELECT count(*) FROM Message WHERE Message.released=0 AND Message.feedRowId=?1))\n    ELSE (SELECT count(*) FROM Message WHERE Message.feedRowId=?1) END", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, FeedModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedMemberModel.TABLE_NAME));
                this.feedRowId = l;
                this.arg2 = obj;
                this.arg3 = obj2;
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                Object obj = this.arg2;
                long j = 0;
                if (obj == null) {
                    pcVar.bindNull(2);
                } else if (obj instanceof String) {
                    pcVar.bindString(2, (String) obj);
                } else {
                    long longValue;
                    if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short)) {
                        longValue = ((Long) obj).longValue();
                    } else if (obj instanceof Boolean) {
                        longValue = ((Boolean) obj).booleanValue() ? 0 : 1;
                    } else if (obj instanceof byte[]) {
                        pcVar.bindBlob(2, (byte[]) obj);
                    } else if ((obj instanceof Float) || (obj instanceof Double)) {
                        pcVar.bindDouble(2, ((Double) obj).doubleValue());
                    } else {
                        throw new IllegalArgumentException("Attempting to bind an object that is not one of String, Integer, Short, Long, Float, Double, Boolean, or byte[] to argument arg2");
                    }
                    pcVar.bindLong(2, longValue);
                }
                obj = this.arg3;
                if (obj == null) {
                    pcVar.bindNull(3);
                } else if (obj instanceof String) {
                    pcVar.bindString(3, (String) obj);
                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short)) {
                    pcVar.bindLong(3, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    if (!((Boolean) obj).booleanValue()) {
                        j = 1;
                    }
                    pcVar.bindLong(3, j);
                } else if (obj instanceof byte[]) {
                    pcVar.bindBlob(3, (byte[]) obj);
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    pcVar.bindDouble(3, ((Double) obj).doubleValue());
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of String, Integer, Short, Long, Float, Double, Boolean, or byte[] to argument arg3");
                }
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(4, str);
                } else {
                    pcVar.bindNull(4);
                }
            }
        }

        final class GetMischiefPlayableSnapInfoForIdQuery extends ainx {
            private final long _id;

            GetMischiefPlayableSnapInfoForIdQuery(long j) {
                super("SELECT\n    Feed.key AS conversationId,\n    Message.mediaId,\n    Friend.username AS senderId\nFROM Message\nJOIN Feed ON Feed._id = Message.feedRowId\nJOIN MessagingSnap ON MessagingSnap.messageRowId = Message._id\nJOIN Friend ON Message.senderId = Friend._id\nWHERE Message._id = ?1", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetPlayableSnapsForFeedQuery extends ainx {
            private final Long feedRowId;
            private final SnapServerStatus snapServerStatus;
            private final String type;
            private final String username;

            GetPlayableSnapsForFeedQuery(Long l, SnapServerStatus snapServerStatus, String str, String str2) {
                super("SELECT\n    Message._id,\n    Message.key,\n    Message.type,\n    Message.timestamp,\n    Message.feedRowId,\n    Message.content,\n    Message.clientStatus,\n    Feed.key AS feedKey,\n    Message.released,\n    Friend.displayName AS senderDisplayName,\n    Friend.username AS senderUsername,\n    snapServerStatus,\n    screenshottedOrReplayed,\n    Feed.kind AS feedKind,\n    Message.preserved\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN Feed ON Feed._id = Message.feedRowId\nWHERE Message.feedRowId=?1 AND Message.snapServerStatus=?2 AND Message.type=?3 -- snap\nAND ((Feed.friendRowId=Message.senderId AND Friend.username=?4) OR Friend.username!=?4) -- my username\nORDER BY Message.timestamp ASC", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.feedRowId = l;
                this.snapServerStatus = snapServerStatus;
                this.type = str;
                this.username = str2;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                SnapServerStatus snapServerStatus = this.snapServerStatus;
                if (snapServerStatus != null) {
                    pcVar.bindString(2, (String) Factory.this.snapServerStatusAdapter.encode(snapServerStatus));
                } else {
                    pcVar.bindNull(2);
                }
                String str = this.type;
                if (str != null) {
                    pcVar.bindString(3, str);
                } else {
                    pcVar.bindNull(3);
                }
                str = this.username;
                if (str != null) {
                    pcVar.bindString(4, str);
                } else {
                    pcVar.bindNull(4);
                }
            }
        }

        final class GetReceivedSnapsQuery extends ainx {
            private final Long[] feedRowId;
            private final SnapServerStatus[] snapServerStatus;
            private final String username;

            GetReceivedSnapsQuery(String str, SnapServerStatus[] snapServerStatusArr, Long[] lArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Message.feedRowId,\n    Message.senderId,\n    Message.key,\n    Message.timestamp AS messageTimestamp, -- received timestamp\n    MAX(ifnull(Message.lastInteractionTimestamp, 0), Message.timestamp) AS interactionTimestamp, -- last received/viewed/screenshot/replay timestamp\n    Message.snapServerStatus,\n    Message.screenshottedOrReplayed,\n    Message.content\nFROM Message\nINNER JOIN Friend ON Message.senderId = Friend._id\nINNER JOIN Feed ON Feed._id = Message.feedRowId\nWHERE\n-- sender's username != {myUsername}\n((Feed.friendRowId=Message.senderId AND Friend.username=?1) OR Friend.username != ?1)\nAND Message.snapServerStatus IN ");
                stringBuilder.append(ainz.a(snapServerStatusArr.length));
                stringBuilder.append("\nAND Message.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\nORDER BY Message.feedRowId, MAX(ifnull(Message.lastInteractionTimestamp, 0), Message.timestamp) ASC");
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.username = str;
                this.snapServerStatus = snapServerStatusArr;
                this.feedRowId = lArr;
            }

            public final void bindTo(pc pcVar) {
                int i;
                int i2;
                pcVar.bindString(1, this.username);
                SnapServerStatus[] snapServerStatusArr = this.snapServerStatus;
                int i3 = 0;
                if (snapServerStatusArr != null) {
                    int length = snapServerStatusArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        int i4 = i2 + 1;
                        pcVar.bindString(i2, (String) Factory.this.snapServerStatusAdapter.encode(snapServerStatusArr[i]));
                        i++;
                        i2 = i4;
                    }
                } else {
                    i2 = 3;
                    pcVar.bindNull(2);
                }
                Long[] lArr = this.feedRowId;
                if (lArr != null) {
                    i = lArr.length;
                    while (i3 < i) {
                        int i5 = i2 + 1;
                        pcVar.bindLong(i2, lArr[i3].longValue());
                        i3++;
                        i2 = i5;
                    }
                    return;
                }
                pcVar.bindNull(i2);
            }
        }

        final class GetSequenceNumberByMessageIdQuery extends ainx {
            private final String key;

            GetSequenceNumberByMessageIdQuery(String str) {
                super("SELECT\n    Message.sequenceNumber\nFROM Message\nWHERE Message.key = ?1\nLIMIT 1", new aioa(MessageModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetSnapInfoForDifferentialUpdateQuery extends ainx {
            private final Long feedRowId;
            private final long timestamp;

            GetSnapInfoForDifferentialUpdateQuery(Long l, long j) {
                super("SELECT\nSnap.snapId,\nMessagingSnap.messageRowId,\nSnap.timestamp,\nSnap.snapType,\nMessage.type AS messageType,\nMessagingSnap.serverStatus AS serverStatus,\nMessage.savedStates,\nMessage.preserved\nFROM MessagingSnap\nJOIN Message ON messageRowId = Message._id\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nWHERE MessagingSnap.feedRowId =?1 AND Snap.timestamp > ?2", new aioa(MessagingSnapModel.TABLE_NAME, MessageModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.feedRowId = l;
                this.timestamp = j;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, this.timestamp);
            }
        }

        final class GetSnapInfoFromMessageByMessageIdQuery extends ainx {
            private final String key;

            GetSnapInfoFromMessageByMessageIdQuery(String str) {
                super("SELECT\n    Message._id,\n    Message.key,\n    Friend.username AS senderUsername,\n    Message.type,\n    Message.timestamp,\n    Message.screenshottedOrReplayed,\n    Message.snapServerStatus,\n    Message.viewerList,\n    Message.lastInteractionTimestamp\nFROM Message\nJOIN Friend ON Friend._id = Message.senderId\nWHERE Message.key=?1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetSnapInfoWithContentFromMessageByMessageIdQuery extends ainx {
            private final String key;

            GetSnapInfoWithContentFromMessageByMessageIdQuery(String str) {
                super("SELECT\n    Message._id,\n    Message.key,\n    Friend.username AS senderUsername,\n    Message.screenshottedOrReplayed,\n    Message.sequenceNumber,\n    Message.content\nFROM Message\nJOIN Friend ON Friend._id = Message.senderId\nWHERE Message.key = ?1\nLIMIT 1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetSnapMessageInfoForKeyNewQuery extends ainx {
            private final String key;

            GetSnapMessageInfoForKeyNewQuery(String str) {
                super("SELECT\n    Message.key,\n    Message.snapServerStatus,\n    Message.timestamp,\n    Message.savedStates,\n    Message.preserved,\n    Message.screenshottedOrReplayed,\n    Feed.lastReadTimestamp,\n    Feed.lastReader,\n    Feed.lastWriter,\n    Feed.key AS convId,\n    Feed._id AS feedRowId\nFROM Message\nJOIN Feed ON Feed._id = Message.feedRowId\nWHERE Message.key = ?1", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetSnapMessageInfoForKeyQuery extends ainx {
            private final String key;

            GetSnapMessageInfoForKeyQuery(String str) {
                super("SELECT\n    Message.key,\n    MessagingSnap.serverStatus,\n    Message.timestamp,\n    Message.savedStates,\n    Message.preserved,\n    MessagingSnap.screenshottedOrReplayed AS snapScreenshottedOrReplayed,\n    Feed.lastReadTimestamp,\n    Feed.lastReader,\n    Feed.lastWriter,\n    Feed.key AS convId,\n    Feed._id AS feedRowId\nFROM Message\nJOIN MessagingSnap ON MessagingSnap.messageRowId = Message._id\nJOIN Feed ON Feed._id = Message.feedRowId\nWHERE Message.key = ?1", new aioa(MessageModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetSnapMetadataForMessageIdQuery extends ainx {
            private final String key;

            GetSnapMetadataForMessageIdQuery(String str) {
                super("SELECT\n    Message._id,\n    Message.content,\n    Feed.kind AS feedKind,\n    Feed.key AS conversationId,\n    Friend.username AS senderUsername\nFROM Message\nJOIN Feed ON Message.feedRowId = Feed._id\nJOIN Friend ON Friend._id = Message.senderId\nWHERE Message.key=?1", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetSnapOperaInfoByRowIdQuery extends ainx {
            private final long _id;

            GetSnapOperaInfoByRowIdQuery(long j) {
                super("SELECT\n    Message.feedRowId,\n    Friend.displayName,\n    Friend.username,\n    Friend.score,\n    Message.timestamp,\n    Message.content,\n    Feed.kind,\n    Feed.key AS feedKey\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN Feed ON feedRowId = Feed._id\nWHERE Message._id = ?1", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetSnapServerStatusForMessageQuery extends ainx {
            private final String key;

            GetSnapServerStatusForMessageQuery(String str) {
                super("SELECT snapServerStatus\nFROM Message\nWHERE key=?1\nLIMIT 1", new aioa(MessageModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetSnapStatesByIdsQuery extends ainx {
            private final String[] key;

            GetSnapStatesByIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    key,\n    snapServerStatus,\n    screenshottedOrReplayed\nFROM Message\nWHERE key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
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

        final class GetSnapsFromMessageForFeedQuery extends ainx {
            private final Long feedRowId;
            private final String type;
            private final String username;

            GetSnapsFromMessageForFeedQuery(String str, Long l, String str2) {
                super("SELECT\n    Message.key,\n    snapServerStatus,\n    Friend.username AS username,\n    timestamp,\n    released,\n    (Feed.friendRowId=Message.senderId AND Friend.username=?3) AS isSelfConversation\nFROM Message\nJOIN Friend ON Friend._id = Message.senderId\nLEFT OUTER JOIN Feed ON Feed._id = Message.feedRowId\nWHERE type=?1 -- SNAP\nAND feedRowId=?2", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.type = str;
                this.feedRowId = l;
                this.username = str2;
            }

            public final void bindTo(pc pcVar) {
                String str = this.type;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
                pcVar.bindString(3, this.username);
            }
        }

        final class GetSnapsOlderThanTimestampQuery extends ainx {
            private final SnapServerStatus snapServerStatus;
            private final long timestamp;
            private final String type;

            GetSnapsOlderThanTimestampQuery(String str, SnapServerStatus snapServerStatus, long j) {
                super("SELECT\n    key,\n    feedRowId\nFROM Message\nWHERE type=?1  -- SNAP\nAND snapServerStatus=?2 -- DELIVERED\nAND timestamp<?3", new aioa(MessageModel.TABLE_NAME));
                this.type = str;
                this.snapServerStatus = snapServerStatus;
                this.timestamp = j;
            }

            public final void bindTo(pc pcVar) {
                String str = this.type;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                SnapServerStatus snapServerStatus = this.snapServerStatus;
                if (snapServerStatus != null) {
                    pcVar.bindString(2, (String) Factory.this.snapServerStatusAdapter.encode(snapServerStatus));
                } else {
                    pcVar.bindNull(2);
                }
                pcVar.bindLong(3, this.timestamp);
            }
        }

        final class GetTimestampByMessageIdQuery extends ainx {
            private final String key;

            GetTimestampByMessageIdQuery(String str) {
                super("SELECT\n    timestamp\nFROM Message\nWHERE key = ?1", new aioa(MessageModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetUnreadSendersQuery extends ainx {
            private final Long feedId;
            private final String senderUsername;
            private final String system_username;
            private final String username;

            GetUnreadSendersQuery(Long l, String str, String str2, String str3) {
                super("SELECT DISTINCT\n    coalesce(Friend.displayName, Friend.username)\nFROM Friend\nJOIN Message ON Message.senderId = Friend._id\nLEFT OUTER JOIN MessagingSnap ON Message._id = MessagingSnap.messageRowId\nWHERE Message.feedRowId = ?1\nAND Friend.username NOT IN (?2, ?3, ?4)\nAND Message.released = 0\nAND (Message.type != 'snap' OR MessagingSnap.serverStatus NOT IN ('VIEWED','SCREENSHOT'))\nORDER BY Message.timestamp DESC", new aioa(FriendModel.TABLE_NAME, MessageModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME));
                this.feedId = l;
                this.username = str;
                this.senderUsername = str2;
                this.system_username = str3;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindString(2, this.username);
                pcVar.bindString(3, this.senderUsername);
                pcVar.bindString(4, this.system_username);
            }
        }

        final class GetViewerDisplayNameForDirectMessageQuery extends ainx {
            private final long _id;

            GetViewerDisplayNameForDirectMessageQuery(long j) {
                super("SELECT\nFriend.displayName AS viewerDisplayName\nFROM Message\nLEFT OUTER JOIN Feed ON Message.feedRowId = Feed._id\nLEFT OUTER JOIN Friend ON Feed.friendRowId = Friend._id\nWHERE Message._id =?1 AND Message.released = 1 AND Feed.kind = 0", new aioa(MessageModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class MessageDumpQuery extends ainx {
            private final Long feedRowId;

            MessageDumpQuery(Long l) {
                super("SELECT\n    Feed.key AS conversationKey,\n    Message._id,\n    Message.key,\n    Message.timestamp,\n    Friend.username AS senderUsername,\n    Message.clientStatus,\n    Message.sequenceNumber,\n    Message.type,\n    Message.released\nFROM Message\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nLEFT OUTER JOIN Feed ON Message.feedRowId = Feed._id\nWHERE Message.feedRowId=?1\nORDER BY Message.timestamp DESC", new aioa(MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.feedRowId = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectReleasedDirectSnapsQuery extends ainx {
            private final Long feedRowId;
            private final com.snap.core.db.record.MessagingSnapModel.Factory<? extends MessagingSnapModel> messagingSnapModelFactory;
            private final SnapServerStatus[] serverStatus;
            private final long timestamp;
            private final long timestamp_;
            private final String username;
            private final String username_;

            SelectReleasedDirectSnapsQuery(com.snap.core.db.record.MessagingSnapModel.Factory<? extends MessagingSnapModel> factory, Long l, String str, long j, String str2, long j2, SnapServerStatus[] snapServerStatusArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT Message.key\nFROM Message\nLEFT OUTER JOIN MessagingSnap ON MessagingSnap.messageRowId = Message._id\nLEFT OUTER JOIN Friend ON Message.senderId = Friend._id\nWHERE Message.feedRowId = ?1\nAND ((Friend.username != ?2 AND Message.timestamp <= ?3) OR (Friend.username == ?4 AND Message.timestamp <= ?5))\nAND MessagingSnap.serverStatus IN ");
                stringBuilder.append(ainz.a(snapServerStatusArr.length));
                super(stringBuilder.toString(), new aioa(MessageModel.TABLE_NAME, MessagingSnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.messagingSnapModelFactory = factory;
                this.feedRowId = l;
                this.username = str;
                this.timestamp = j;
                this.username_ = str2;
                this.timestamp_ = j2;
                this.serverStatus = snapServerStatusArr;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
                pcVar.bindLong(3, this.timestamp);
                str = this.username_;
                if (str != null) {
                    pcVar.bindString(4, str);
                } else {
                    pcVar.bindNull(4);
                }
                pcVar.bindLong(5, this.timestamp_);
                SnapServerStatus[] snapServerStatusArr = this.serverStatus;
                int i = 6;
                if (snapServerStatusArr != null) {
                    int length = snapServerStatusArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindString(i, (String) this.messagingSnapModelFactory.serverStatusAdapter.encode(snapServerStatusArr[i2]));
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(6);
            }
        }

        public Factory(Creator<T> creator, ainu<MessageClientStatus, String> ainu, ainu<gcj, Long> ainu2, ainu<gcm, String> ainu3, ainu<ScreenshottedOrReplayedState, String> ainu4, ainu<SnapServerStatus, String> ainu5, ainu<yfj, byte[]> ainu6) {
            this.creator = creator;
            this.clientStatusAdapter = ainu;
            this.preservedAdapter = ainu2;
            this.savedStatesAdapter = ainu3;
            this.screenshottedOrReplayedAdapter = ainu4;
            this.snapServerStatusAdapter = ainu5;
            this.viewerListAdapter = ainu6;
        }

        public final ainx deleteMessagesForKeys(String[] strArr) {
            return new DeleteMessagesForKeysQuery(strArr);
        }

        public final ainx getBasicInfoForMessage(long j) {
            return new GetBasicInfoForMessageQuery(j);
        }

        public final <R extends GetBasicInfoForMessageModel> GetBasicInfoForMessageMapper<R> getBasicInfoForMessageMapper(GetBasicInfoForMessageCreator<R> getBasicInfoForMessageCreator) {
            return new GetBasicInfoForMessageMapper(getBasicInfoForMessageCreator);
        }

        public final ainx getContentForMessages(long[] jArr) {
            return new GetContentForMessagesQuery(jArr);
        }

        public final <R extends GetContentForMessagesModel> GetContentForMessagesMapper<R> getContentForMessagesMapper(GetContentForMessagesCreator<R> getContentForMessagesCreator) {
            return new GetContentForMessagesMapper(getContentForMessagesCreator);
        }

        public final ainx getIsArroyoForMessageKey(String str) {
            return new GetIsArroyoForMessageKeyQuery(str);
        }

        public final ainw<Boolean> getIsArroyoForMessageKeyMapper() {
            return new ainw<Boolean>() {
                public Boolean map(Cursor cursor) {
                    boolean z = false;
                    if (cursor.getInt(0) == 1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            };
        }

        public final ainx getLastMessageForFeed(Long l) {
            return new GetLastMessageForFeedQuery(l);
        }

        public final ainx getLastMessageForFeedExcludingStatus(Long l, MessageClientStatus messageClientStatus) {
            return new GetLastMessageForFeedExcludingStatusQuery(l, messageClientStatus);
        }

        public final <R extends GetLastMessageForFeedExcludingStatusModel, T2 extends SnapModel, T3 extends MessagingSnapModel> GetLastMessageForFeedExcludingStatusMapper<R, T, T2, T3> getLastMessageForFeedExcludingStatusMapper(GetLastMessageForFeedExcludingStatusCreator<R> getLastMessageForFeedExcludingStatusCreator, com.snap.core.db.record.SnapModel.Factory<T2> factory, com.snap.core.db.record.MessagingSnapModel.Factory<T3> factory2) {
            return new GetLastMessageForFeedExcludingStatusMapper(getLastMessageForFeedExcludingStatusCreator, this, factory, factory2);
        }

        public final <R extends GetLastMessageForFeedModel, T2 extends SnapModel, T3 extends MessagingSnapModel> GetLastMessageForFeedMapper<R, T, T2, T3> getLastMessageForFeedMapper(GetLastMessageForFeedCreator<R> getLastMessageForFeedCreator, com.snap.core.db.record.SnapModel.Factory<T2> factory, com.snap.core.db.record.MessagingSnapModel.Factory<T3> factory2) {
            return new GetLastMessageForFeedMapper(getLastMessageForFeedCreator, this, factory, factory2);
        }

        public final ainx getLastMessageForMessageClientStatus(Long[] lArr, MessageClientStatus[] messageClientStatusArr, String[] strArr) {
            return new GetLastMessageForMessageClientStatusQuery(lArr, messageClientStatusArr, strArr);
        }

        public final <R extends GetLastMessageForMessageClientStatusModel> GetLastMessageForMessageClientStatusMapper<R, T> getLastMessageForMessageClientStatusMapper(GetLastMessageForMessageClientStatusCreator<R> getLastMessageForMessageClientStatusCreator) {
            return new GetLastMessageForMessageClientStatusMapper(getLastMessageForMessageClientStatusCreator, this);
        }

        public final ainx getLastReceivedNotViewedChat(String str, Long[] lArr, String[] strArr) {
            return new GetLastReceivedNotViewedChatQuery(str, lArr, strArr);
        }

        public final <R extends GetLastReceivedNotViewedChatModel, T2 extends FeedModel> GetLastReceivedNotViewedChatMapper<R, T, T2> getLastReceivedNotViewedChatMapper(GetLastReceivedNotViewedChatCreator<R> getLastReceivedNotViewedChatCreator, com.snap.core.db.record.FeedModel.Factory<T2> factory) {
            return new GetLastReceivedNotViewedChatMapper(getLastReceivedNotViewedChatCreator, this, factory);
        }

        public final ainx getLastReceivedNotViewedUpdateMessage(String str, Long[] lArr) {
            return new GetLastReceivedNotViewedUpdateMessageQuery(str, lArr);
        }

        public final <R extends GetLastReceivedNotViewedUpdateMessageModel, T2 extends FeedModel> GetLastReceivedNotViewedUpdateMessageMapper<R, T, T2> getLastReceivedNotViewedUpdateMessageMapper(GetLastReceivedNotViewedUpdateMessageCreator<R> getLastReceivedNotViewedUpdateMessageCreator, com.snap.core.db.record.FeedModel.Factory<T2> factory) {
            return new GetLastReceivedNotViewedUpdateMessageMapper(getLastReceivedNotViewedUpdateMessageCreator, this, factory);
        }

        public final ainx getLastReceivedViewedChat(String str, String[] strArr, Long[] lArr) {
            return new GetLastReceivedViewedChatQuery(str, strArr, lArr);
        }

        public final <R extends GetLastReceivedViewedChatModel> GetLastReceivedViewedChatMapper<R, T> getLastReceivedViewedChatMapper(GetLastReceivedViewedChatCreator<R> getLastReceivedViewedChatCreator) {
            return new GetLastReceivedViewedChatMapper(getLastReceivedViewedChatCreator, this);
        }

        public final ainx getLastReleasedChat(Long l, String str, String str2, Long l2) {
            return new GetLastReleasedChatQuery(l, str, str2, l2);
        }

        public final <R extends GetLastReleasedChatModel> GetLastReleasedChatMapper<R, T> getLastReleasedChatMapper(GetLastReleasedChatCreator<R> getLastReleasedChatCreator) {
            return new GetLastReleasedChatMapper(getLastReleasedChatCreator, this);
        }

        public final ainx getLastSentNotViewedChat(String str, String[] strArr, Long[] lArr) {
            return new GetLastSentNotViewedChatQuery(str, strArr, lArr);
        }

        public final <R extends GetLastSentNotViewedChatModel, T2 extends FriendModel> GetLastSentNotViewedChatMapper<R, T, T2> getLastSentNotViewedChatMapper(GetLastSentNotViewedChatCreator<R> getLastSentNotViewedChatCreator, com.snap.core.db.record.FriendModel.Factory<T2> factory) {
            return new GetLastSentNotViewedChatMapper(getLastSentNotViewedChatCreator, this, factory);
        }

        public final ainx getLastSentSnapForMessage(String str, SnapServerStatus[] snapServerStatusArr, long[] jArr) {
            return new GetLastSentSnapForMessageQuery(str, snapServerStatusArr, jArr);
        }

        public final <R extends GetLastSentSnapForMessageModel, T2 extends FriendModel> GetLastSentSnapForMessageMapper<R, T, T2> getLastSentSnapForMessageMapper(GetLastSentSnapForMessageCreator<R> getLastSentSnapForMessageCreator, com.snap.core.db.record.FriendModel.Factory<T2> factory) {
            return new GetLastSentSnapForMessageMapper(getLastSentSnapForMessageCreator, this, factory);
        }

        public final ainx getLastSentViewedChat(String str, String[] strArr, Long[] lArr) {
            return new GetLastSentViewedChatQuery(str, strArr, lArr);
        }

        public final <R extends GetLastSentViewedChatModel> GetLastSentViewedChatMapper<R, T> getLastSentViewedChatMapper(GetLastSentViewedChatCreator<R> getLastSentViewedChatCreator) {
            return new GetLastSentViewedChatMapper(getLastSentViewedChatCreator, this);
        }

        public final ainx getLastSnapTimestampForFeed(String str, Long l) {
            return new GetLastSnapTimestampForFeedQuery(str, l);
        }

        public final ainw<Long> getLastSnapTimestampForFeedMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getLastViewedMessage(Long l, String str, Long l2) {
            return new GetLastViewedMessageQuery(l, str, l2);
        }

        public final <R extends GetLastViewedMessageModel> GetLastViewedMessageMapper<R, T> getLastViewedMessageMapper(GetLastViewedMessageCreator<R> getLastViewedMessageCreator) {
            return new GetLastViewedMessageMapper(getLastViewedMessageCreator, this);
        }

        public final ainx getMessageByKey(String str) {
            return new GetMessageByKeyQuery(str);
        }

        public final <R extends GetMessageByKeyModel> GetMessageByKeyMapper<R, T> getMessageByKeyMapper(GetMessageByKeyCreator<R> getMessageByKeyCreator) {
            return new GetMessageByKeyMapper(getMessageByKeyCreator, this);
        }

        public final ainx getMessageIdForKey(String str, Long l) {
            return new GetMessageIdForKeyQuery(str, l);
        }

        public final ainw<Long> getMessageIdForKeyMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getMessageIdsWithStatus(long j, MessageClientStatus messageClientStatus) {
            return new GetMessageIdsWithStatusQuery(j, messageClientStatus);
        }

        public final ainw<String> getMessageIdsWithStatusMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getMessageInfoForDifferentialUpdate(Long l, long j) {
            return new GetMessageInfoForDifferentialUpdateQuery(l, j);
        }

        public final <R extends GetMessageInfoForDifferentialUpdateModel> GetMessageInfoForDifferentialUpdateMapper<R, T> getMessageInfoForDifferentialUpdateMapper(GetMessageInfoForDifferentialUpdateCreator<R> getMessageInfoForDifferentialUpdateCreator) {
            return new GetMessageInfoForDifferentialUpdateMapper(getMessageInfoForDifferentialUpdateCreator, this);
        }

        public final ainx getMessageMediaInfoForId(long j) {
            return new GetMessageMediaInfoForIdQuery(j);
        }

        public final <R extends GetMessageMediaInfoForIdModel> GetMessageMediaInfoForIdMapper<R> getMessageMediaInfoForIdMapper(GetMessageMediaInfoForIdCreator<R> getMessageMediaInfoForIdCreator) {
            return new GetMessageMediaInfoForIdMapper(getMessageMediaInfoForIdCreator);
        }

        public final ainx getMessageMediaInfoForKey(String str) {
            return new GetMessageMediaInfoForKeyQuery(str);
        }

        public final <R extends GetMessageMediaInfoForKeyModel, T1 extends MessagingSnapModel> GetMessageMediaInfoForKeyMapper<R, T1> getMessageMediaInfoForKeyMapper(GetMessageMediaInfoForKeyCreator<R> getMessageMediaInfoForKeyCreator, com.snap.core.db.record.MessagingSnapModel.Factory<T1> factory) {
            return new GetMessageMediaInfoForKeyMapper(getMessageMediaInfoForKeyCreator, factory);
        }

        public final ainx getMessageMediaInfoForSnapId(long j) {
            return new GetMessageMediaInfoForSnapIdQuery(j);
        }

        public final <R extends GetMessageMediaInfoForSnapIdModel, T1 extends MessagingSnapModel, T2 extends SnapModel> GetMessageMediaInfoForSnapIdMapper<R, T1, T2> getMessageMediaInfoForSnapIdMapper(GetMessageMediaInfoForSnapIdCreator<R> getMessageMediaInfoForSnapIdCreator, com.snap.core.db.record.MessagingSnapModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2) {
            return new GetMessageMediaInfoForSnapIdMapper(getMessageMediaInfoForSnapIdCreator, factory, factory2);
        }

        public final ainx getMessagesForFeed(Long l, Object obj, Object obj2, String str) {
            return new GetMessagesForFeedQuery(l, obj, obj2, str);
        }

        public final <R extends GetMessagesForFeedModel, T2 extends MessagingSnapModel, T3 extends SnapModel, T4 extends FeedModel> GetMessagesForFeedMapper<R, T, T2, T3, T4> getMessagesForFeedMapper(GetMessagesForFeedCreator<R> getMessagesForFeedCreator, com.snap.core.db.record.MessagingSnapModel.Factory<T2> factory, com.snap.core.db.record.SnapModel.Factory<T3> factory2, com.snap.core.db.record.FeedModel.Factory<T4> factory3) {
            return new GetMessagesForFeedMapper(getMessagesForFeedCreator, this, factory, factory2, factory3);
        }

        public final ainx getMischiefPlayableSnapInfoForId(long j) {
            return new GetMischiefPlayableSnapInfoForIdQuery(j);
        }

        public final <R extends GetMischiefPlayableSnapInfoForIdModel> GetMischiefPlayableSnapInfoForIdMapper<R> getMischiefPlayableSnapInfoForIdMapper(GetMischiefPlayableSnapInfoForIdCreator<R> getMischiefPlayableSnapInfoForIdCreator) {
            return new GetMischiefPlayableSnapInfoForIdMapper(getMischiefPlayableSnapInfoForIdCreator);
        }

        public final ainx getPlayableSnapsForFeed(Long l, SnapServerStatus snapServerStatus, String str, String str2) {
            return new GetPlayableSnapsForFeedQuery(l, snapServerStatus, str, str2);
        }

        public final <R extends GetPlayableSnapsForFeedModel, T2 extends FeedModel> GetPlayableSnapsForFeedMapper<R, T, T2> getPlayableSnapsForFeedMapper(GetPlayableSnapsForFeedCreator<R> getPlayableSnapsForFeedCreator, com.snap.core.db.record.FeedModel.Factory<T2> factory) {
            return new GetPlayableSnapsForFeedMapper(getPlayableSnapsForFeedCreator, this, factory);
        }

        public final ainx getReceivedSnaps(String str, SnapServerStatus[] snapServerStatusArr, Long[] lArr) {
            return new GetReceivedSnapsQuery(str, snapServerStatusArr, lArr);
        }

        public final <R extends GetReceivedSnapsModel> GetReceivedSnapsMapper<R, T> getReceivedSnapsMapper(GetReceivedSnapsCreator<R> getReceivedSnapsCreator) {
            return new GetReceivedSnapsMapper(getReceivedSnapsCreator, this);
        }

        public final ainx getSequenceNumberByMessageId(String str) {
            return new GetSequenceNumberByMessageIdQuery(str);
        }

        public final ainw<Long> getSequenceNumberByMessageIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getSnapInfoForDifferentialUpdate(Long l, long j) {
            return new GetSnapInfoForDifferentialUpdateQuery(l, j);
        }

        public final <R extends GetSnapInfoForDifferentialUpdateModel, T1 extends SnapModel, T2 extends MessagingSnapModel> GetSnapInfoForDifferentialUpdateMapper<R, T1, T2, T> getSnapInfoForDifferentialUpdateMapper(GetSnapInfoForDifferentialUpdateCreator<R> getSnapInfoForDifferentialUpdateCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.MessagingSnapModel.Factory<T2> factory2) {
            return new GetSnapInfoForDifferentialUpdateMapper(getSnapInfoForDifferentialUpdateCreator, factory, factory2, this);
        }

        public final ainx getSnapInfoFromMessageByMessageId(String str) {
            return new GetSnapInfoFromMessageByMessageIdQuery(str);
        }

        public final <R extends GetSnapInfoFromMessageByMessageIdModel> GetSnapInfoFromMessageByMessageIdMapper<R, T> getSnapInfoFromMessageByMessageIdMapper(GetSnapInfoFromMessageByMessageIdCreator<R> getSnapInfoFromMessageByMessageIdCreator) {
            return new GetSnapInfoFromMessageByMessageIdMapper(getSnapInfoFromMessageByMessageIdCreator, this);
        }

        public final ainx getSnapInfoWithContentFromMessageByMessageId(String str) {
            return new GetSnapInfoWithContentFromMessageByMessageIdQuery(str);
        }

        public final <R extends GetSnapInfoWithContentFromMessageByMessageIdModel> GetSnapInfoWithContentFromMessageByMessageIdMapper<R, T> getSnapInfoWithContentFromMessageByMessageIdMapper(GetSnapInfoWithContentFromMessageByMessageIdCreator<R> getSnapInfoWithContentFromMessageByMessageIdCreator) {
            return new GetSnapInfoWithContentFromMessageByMessageIdMapper(getSnapInfoWithContentFromMessageByMessageIdCreator, this);
        }

        public final ainx getSnapMessageInfoForKey(String str) {
            return new GetSnapMessageInfoForKeyQuery(str);
        }

        public final <R extends GetSnapMessageInfoForKeyModel, T1 extends MessagingSnapModel> GetSnapMessageInfoForKeyMapper<R, T1, T> getSnapMessageInfoForKeyMapper(GetSnapMessageInfoForKeyCreator<R> getSnapMessageInfoForKeyCreator, com.snap.core.db.record.MessagingSnapModel.Factory<T1> factory) {
            return new GetSnapMessageInfoForKeyMapper(getSnapMessageInfoForKeyCreator, factory, this);
        }

        public final ainx getSnapMessageInfoForKeyNew(String str) {
            return new GetSnapMessageInfoForKeyNewQuery(str);
        }

        public final <R extends GetSnapMessageInfoForKeyNewModel> GetSnapMessageInfoForKeyNewMapper<R, T> getSnapMessageInfoForKeyNewMapper(GetSnapMessageInfoForKeyNewCreator<R> getSnapMessageInfoForKeyNewCreator) {
            return new GetSnapMessageInfoForKeyNewMapper(getSnapMessageInfoForKeyNewCreator, this);
        }

        public final ainx getSnapMetadataForMessageId(String str) {
            return new GetSnapMetadataForMessageIdQuery(str);
        }

        public final <R extends GetSnapMetadataForMessageIdModel, T1 extends FeedModel> GetSnapMetadataForMessageIdMapper<R, T1> getSnapMetadataForMessageIdMapper(GetSnapMetadataForMessageIdCreator<R> getSnapMetadataForMessageIdCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory) {
            return new GetSnapMetadataForMessageIdMapper(getSnapMetadataForMessageIdCreator, factory);
        }

        public final ainx getSnapOperaInfoByRowId(long j) {
            return new GetSnapOperaInfoByRowIdQuery(j);
        }

        public final <R extends GetSnapOperaInfoByRowIdModel, T1 extends FeedModel> GetSnapOperaInfoByRowIdMapper<R, T1> getSnapOperaInfoByRowIdMapper(GetSnapOperaInfoByRowIdCreator<R> getSnapOperaInfoByRowIdCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory) {
            return new GetSnapOperaInfoByRowIdMapper(getSnapOperaInfoByRowIdCreator, factory);
        }

        public final ainx getSnapServerStatusForMessage(String str) {
            return new GetSnapServerStatusForMessageQuery(str);
        }

        public final ainw<SnapServerStatus> getSnapServerStatusForMessageMapper() {
            return new ainw<SnapServerStatus>() {
                public SnapServerStatus map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (SnapServerStatus) Factory.this.snapServerStatusAdapter.decode(cursor.getString(0));
                }
            };
        }

        public final ainx getSnapStatesByIds(String[] strArr) {
            return new GetSnapStatesByIdsQuery(strArr);
        }

        public final <R extends GetSnapStatesByIdsModel> GetSnapStatesByIdsMapper<R, T> getSnapStatesByIdsMapper(GetSnapStatesByIdsCreator<R> getSnapStatesByIdsCreator) {
            return new GetSnapStatesByIdsMapper(getSnapStatesByIdsCreator, this);
        }

        public final ainx getSnapsFromMessageForFeed(String str, Long l, String str2) {
            return new GetSnapsFromMessageForFeedQuery(str, l, str2);
        }

        public final <R extends GetSnapsFromMessageForFeedModel> GetSnapsFromMessageForFeedMapper<R, T> getSnapsFromMessageForFeedMapper(GetSnapsFromMessageForFeedCreator<R> getSnapsFromMessageForFeedCreator) {
            return new GetSnapsFromMessageForFeedMapper(getSnapsFromMessageForFeedCreator, this);
        }

        public final ainx getSnapsOlderThanTimestamp(String str, SnapServerStatus snapServerStatus, long j) {
            return new GetSnapsOlderThanTimestampQuery(str, snapServerStatus, j);
        }

        public final <R extends GetSnapsOlderThanTimestampModel> GetSnapsOlderThanTimestampMapper<R> getSnapsOlderThanTimestampMapper(GetSnapsOlderThanTimestampCreator<R> getSnapsOlderThanTimestampCreator) {
            return new GetSnapsOlderThanTimestampMapper(getSnapsOlderThanTimestampCreator);
        }

        public final ainx getSortingTimestampForFeed(Long l, String[] strArr) {
            return new GetSortingTimestampForFeedQuery(l, strArr);
        }

        public final ainw<Long> getSortingTimestampForFeedMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getTimestampByMessageId(String str) {
            return new GetTimestampByMessageIdQuery(str);
        }

        public final ainw<Long> getTimestampByMessageIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getUnreadSenders(Long l, String str, String str2, String str3) {
            return new GetUnreadSendersQuery(l, str, str2, str3);
        }

        public final ainw<String> getUnreadSendersMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getViewerDisplayNameForDirectMessage(long j) {
            return new GetViewerDisplayNameForDirectMessageQuery(j);
        }

        public final ainw<String> getViewerDisplayNameForDirectMessageMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx messageDump(Long l) {
            return new MessageDumpQuery(l);
        }

        public final <R extends MessageDumpModel> MessageDumpMapper<R, T> messageDumpMapper(MessageDumpCreator<R> messageDumpCreator) {
            return new MessageDumpMapper(messageDumpCreator, this);
        }

        public final ainx selectReleasedDirectSnaps(com.snap.core.db.record.MessagingSnapModel.Factory<? extends MessagingSnapModel> factory, Long l, String str, long j, String str2, long j2, SnapServerStatus[] snapServerStatusArr) {
            return new SelectReleasedDirectSnapsQuery(factory, l, str, j, str2, j2, snapServerStatusArr);
        }

        public final ainw<String> selectReleasedDirectSnapsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }
    }

    public static final class GetMessagesForFeedMapper<T extends GetMessagesForFeedModel, T1 extends MessageModel, T2 extends MessagingSnapModel, T3 extends SnapModel, T4 extends FeedModel> implements ainw<T> {
        private final GetMessagesForFeedCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T4> feedModelFactory;
        private final Factory<T1> messageModelFactory;
        private final com.snap.core.db.record.MessagingSnapModel.Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T3> snapModelFactory;

        public GetMessagesForFeedMapper(GetMessagesForFeedCreator<T> getMessagesForFeedCreator, Factory<T1> factory, com.snap.core.db.record.MessagingSnapModel.Factory<T2> factory2, com.snap.core.db.record.SnapModel.Factory<T3> factory3, com.snap.core.db.record.FeedModel.Factory<T4> factory4) {
            this.creator = getMessagesForFeedCreator;
            this.messageModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
            this.snapModelFactory = factory3;
            this.feedModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getLong(1), cursor2.getString(2), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.getLong(4), cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5)), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.isNull(7) ? null : cursor2.getBlob(7), cursor2.isNull(8) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor2.getString(8)), cursor2.isNull(9) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.getInt(12) == 1, cursor2.isNull(13) ? null : cursor2.getString(13), cursor2.isNull(14) ? null : cursor2.getString(14), cursor2.isNull(15) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor2.getString(15)), cursor2.isNull(16) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor2.getString(16)), cursor2.isNull(17) ? null : cursor2.getString(17), cursor2.isNull(18) ? null : (yfj) this.messageModelFactory.viewerListAdapter.decode(cursor2.getBlob(18)), cursor2.isNull(19) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(19)), cursor2.isNull(20) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(20)), cursor2.isNull(21) ? null : (ReplyMedia) this.messagingSnapModelFactory.replyMediaAdapter.decode(cursor2.getString(21)), cursor2.isNull(22) ? null : (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(22))), cursor2.isNull(23) ? null : Long.valueOf(cursor2.getLong(23)), cursor2.isNull(24) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(24))), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(25))), cursor2.isNull(26) ? null : Integer.valueOf(cursor2.getInt(26)), cursor2.isNull(27) ? null : Long.valueOf(cursor2.getLong(27)), cursor2.getLong(28));
        }
    }

    public static final class GetPlayableSnapsForFeedMapper<T extends GetPlayableSnapsForFeedModel, T1 extends MessageModel, T2 extends FeedModel> implements ainw<T> {
        private final GetPlayableSnapsForFeedCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T2> feedModelFactory;
        private final Factory<T1> messageModelFactory;

        public GetPlayableSnapsForFeedMapper(GetPlayableSnapsForFeedCreator<T> getPlayableSnapsForFeedCreator, Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T2> factory2) {
            this.creator = getPlayableSnapsForFeedCreator;
            this.messageModelFactory = factory;
            this.feedModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.getLong(3), cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4)), cursor2.isNull(5) ? null : cursor2.getBlob(5), cursor2.isNull(6) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(6)), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.getInt(8) == 1, cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.isNull(11) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor2.getString(11)), cursor2.isNull(12) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(12)), cursor2.isNull(13) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(13))), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(14))));
        }
    }

    public static final class GetLastMessageForFeedExcludingStatusMapper<T extends GetLastMessageForFeedExcludingStatusModel, T1 extends MessageModel, T2 extends SnapModel, T3 extends MessagingSnapModel> implements ainw<T> {
        private final GetLastMessageForFeedExcludingStatusCreator<T> creator;
        private final Factory<T1> messageModelFactory;
        private final com.snap.core.db.record.MessagingSnapModel.Factory<T3> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;

        public GetLastMessageForFeedExcludingStatusMapper(GetLastMessageForFeedExcludingStatusCreator<T> getLastMessageForFeedExcludingStatusCreator, Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, com.snap.core.db.record.MessagingSnapModel.Factory<T3> factory3) {
            this.creator = getLastMessageForFeedExcludingStatusCreator;
            this.messageModelFactory = factory;
            this.snapModelFactory = factory2;
            this.messagingSnapModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.isNull(1) ? null : cursor2.getString(1), cursor2.getLong(2), cursor2.isNull(3) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(3)), cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4)), cursor2.isNull(5) ? null : (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5))), cursor2.isNull(6) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor2.getString(6)), cursor2.isNull(7) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(7)), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)));
        }
    }

    public static final class GetMessageMediaInfoForSnapIdMapper<T extends GetMessageMediaInfoForSnapIdModel, T1 extends MessagingSnapModel, T2 extends SnapModel> implements ainw<T> {
        private final GetMessageMediaInfoForSnapIdCreator<T> creator;
        private final com.snap.core.db.record.MessagingSnapModel.Factory<T1> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;

        public GetMessageMediaInfoForSnapIdMapper(GetMessageMediaInfoForSnapIdCreator<T> getMessageMediaInfoForSnapIdCreator, com.snap.core.db.record.MessagingSnapModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2) {
            this.creator = getMessageMediaInfoForSnapIdCreator;
            this.messagingSnapModelFactory = factory;
            this.snapModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            GetMessageMediaInfoForSnapIdCreator getMessageMediaInfoForSnapIdCreator = this.creator;
            String string = cursor.getString(0);
            aesg aesg = null;
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            String string3 = cursor.getString(2);
            String string4 = cursor.isNull(3) ? null : cursor.getString(3);
            String string5 = cursor.isNull(4) ? null : cursor.getString(4);
            String string6 = cursor.getString(5);
            if (!cursor.isNull(6)) {
                aesg = (aesg) this.messagingSnapModelFactory.directDownloadUrlAdapter.decode(cursor.getString(6));
            }
            return getMessageMediaInfoForSnapIdCreator.create(string, string2, string3, string4, string5, string6, aesg, (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(7))));
        }
    }

    public static final class GetMessageMediaInfoForIdMapper<T extends GetMessageMediaInfoForIdModel> implements ainw<T> {
        private final GetMessageMediaInfoForIdCreator<T> creator;

        public GetMessageMediaInfoForIdMapper(GetMessageMediaInfoForIdCreator<T> getMessageMediaInfoForIdCreator) {
            this.creator = getMessageMediaInfoForIdCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getBlob(3), cursor.getString(4));
        }
    }

    public static final class GetMessageMediaInfoForKeyMapper<T extends GetMessageMediaInfoForKeyModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetMessageMediaInfoForKeyCreator<T> creator;
        private final com.snap.core.db.record.MessagingSnapModel.Factory<T1> messagingSnapModelFactory;

        public GetMessageMediaInfoForKeyMapper(GetMessageMediaInfoForKeyCreator<T> getMessageMediaInfoForKeyCreator, com.snap.core.db.record.MessagingSnapModel.Factory<T1> factory) {
            this.creator = getMessageMediaInfoForKeyCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetMessageMediaInfoForKeyCreator getMessageMediaInfoForKeyCreator = this.creator;
            String string = cursor.getString(0);
            ReplyMedia replyMedia = null;
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            byte[] blob = cursor.isNull(2) ? null : cursor.getBlob(2);
            if (!cursor.isNull(3)) {
                replyMedia = (ReplyMedia) this.messagingSnapModelFactory.replyMediaAdapter.decode(cursor.getString(3));
            }
            return getMessageMediaInfoForKeyCreator.create(string, string2, blob, replyMedia, cursor.getString(4));
        }
    }

    public static final class GetMessageByKeyMapper<T extends GetMessageByKeyModel, T1 extends MessageModel> implements ainw<T> {
        private final GetMessageByKeyCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetMessageByKeyMapper(GetMessageByKeyCreator<T> getMessageByKeyCreator, Factory<T1> factory) {
            this.creator = getMessageByKeyCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1), cursor.getLong(2), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.isNull(4) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor.getString(4)), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor.getLong(5))), cursor.getInt(6) == 1);
        }
    }

    public static final class GetSnapMessageInfoForKeyMapper<T extends GetSnapMessageInfoForKeyModel, T1 extends MessagingSnapModel, T2 extends MessageModel> implements ainw<T> {
        private final GetSnapMessageInfoForKeyCreator<T> creator;
        private final Factory<T2> messageModelFactory;
        private final com.snap.core.db.record.MessagingSnapModel.Factory<T1> messagingSnapModelFactory;

        public GetSnapMessageInfoForKeyMapper(GetSnapMessageInfoForKeyCreator<T> getSnapMessageInfoForKeyCreator, com.snap.core.db.record.MessagingSnapModel.Factory<T1> factory, Factory<T2> factory2) {
            this.creator = getSnapMessageInfoForKeyCreator;
            this.messagingSnapModelFactory = factory;
            this.messageModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getString(0), cursor2.isNull(1) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor2.getString(1)), cursor2.getLong(2), cursor2.isNull(3) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor2.getString(3)), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(4))), cursor2.isNull(5) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(5)), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.getString(9), cursor2.getLong(10));
        }
    }

    public static final class GetMessageInfoForDifferentialUpdateMapper<T extends GetMessageInfoForDifferentialUpdateModel, T1 extends MessageModel> implements ainw<T> {
        private final GetMessageInfoForDifferentialUpdateCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetMessageInfoForDifferentialUpdateMapper(GetMessageInfoForDifferentialUpdateCreator<T> getMessageInfoForDifferentialUpdateCreator, Factory<T1> factory) {
            this.creator = getMessageInfoForDifferentialUpdateCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getLong(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor.getString(4)), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor.getLong(5))), cursor.isNull(6) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor.getString(6)));
        }
    }

    public static final class GetSnapInfoForDifferentialUpdateMapper<T extends GetSnapInfoForDifferentialUpdateModel, T1 extends SnapModel, T2 extends MessagingSnapModel, T3 extends MessageModel> implements ainw<T> {
        private final GetSnapInfoForDifferentialUpdateCreator<T> creator;
        private final Factory<T3> messageModelFactory;
        private final com.snap.core.db.record.MessagingSnapModel.Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetSnapInfoForDifferentialUpdateMapper(GetSnapInfoForDifferentialUpdateCreator<T> getSnapInfoForDifferentialUpdateCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.MessagingSnapModel.Factory<T2> factory2, Factory<T3> factory3) {
            this.creator = getSnapInfoForDifferentialUpdateCreator;
            this.snapModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
            this.messageModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            GetSnapInfoForDifferentialUpdateCreator getSnapInfoForDifferentialUpdateCreator = this.creator;
            String string = cursor.getString(0);
            long j = cursor.getLong(1);
            long j2 = cursor.getLong(2);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(3)));
            gcm gcm = null;
            String string2 = cursor.isNull(4) ? null : cursor.getString(4);
            SnapServerStatus snapServerStatus = cursor.isNull(5) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor.getString(5));
            if (!cursor.isNull(6)) {
                gcm = (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor.getString(6));
            }
            return getSnapInfoForDifferentialUpdateCreator.create(string, j, j2, gcp, string2, snapServerStatus, gcm, (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor.getLong(7))));
        }
    }

    public static final class GetLastReleasedChatMapper<T extends GetLastReleasedChatModel, T1 extends MessageModel> implements ainw<T> {
        private final GetLastReleasedChatCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetLastReleasedChatMapper(GetLastReleasedChatCreator<T> getLastReleasedChatCreator, Factory<T1> factory) {
            this.creator = getLastReleasedChatCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)), cursor.isNull(2) ? null : cursor.getString(2), cursor.getLong(3), cursor.isNull(4) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor.getString(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)));
        }
    }

    public static final class GetLastReceivedNotViewedChatMapper<T extends GetLastReceivedNotViewedChatModel, T1 extends MessageModel, T2 extends FeedModel> implements ainw<T> {
        private final GetLastReceivedNotViewedChatCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T2> feedModelFactory;
        private final Factory<T1> messageModelFactory;

        public GetLastReceivedNotViewedChatMapper(GetLastReceivedNotViewedChatCreator<T> getLastReceivedNotViewedChatCreator, Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T2> factory2) {
            this.creator = getLastReceivedNotViewedChatCreator;
            this.messageModelFactory = factory;
            this.feedModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.isNull(0) ? null : Long.valueOf(cursor2.getLong(0)), cursor2.getString(1), cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2)), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.getLong(4), cursor2.isNull(5) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(5)), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.getInt(7) == 1, cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8)), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(9))), cursor2.isNull(10) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor2.getString(10)), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)), cursor2.isNull(12) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(12))));
        }
    }

    public static final class GetLastReceivedViewedChatMapper<T extends GetLastReceivedViewedChatModel, T1 extends MessageModel> implements ainw<T> {
        private final GetLastReceivedViewedChatCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetLastReceivedViewedChatMapper(GetLastReceivedViewedChatCreator<T> getLastReceivedViewedChatCreator, Factory<T1> factory) {
            this.creator = getLastReceivedViewedChatCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0)), cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : cursor.getString(3), cursor.getLong(4), cursor.isNull(5) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor.getString(5)), cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6)));
        }
    }

    public static final class GetLastSentNotViewedChatMapper<T extends GetLastSentNotViewedChatModel, T1 extends MessageModel, T2 extends FriendModel> implements ainw<T> {
        private final GetLastSentNotViewedChatCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;
        private final Factory<T1> messageModelFactory;

        public GetLastSentNotViewedChatMapper(GetLastSentNotViewedChatCreator<T> getLastSentNotViewedChatCreator, Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = getLastSentNotViewedChatCreator;
            this.messageModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0)), cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : cursor.getString(3), cursor.getLong(4), cursor.isNull(5) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor.getString(5)), cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6)), cursor.isNull(7) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(7))), cursor.isNull(8) ? null : cursor.getString(8));
        }
    }

    public static final class GetLastSentViewedChatMapper<T extends GetLastSentViewedChatModel, T1 extends MessageModel> implements ainw<T> {
        private final GetLastSentViewedChatCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetLastSentViewedChatMapper(GetLastSentViewedChatCreator<T> getLastSentViewedChatCreator, Factory<T1> factory) {
            this.creator = getLastSentViewedChatCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0)), cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : cursor.getString(3), cursor.getLong(4), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)), cursor.isNull(6) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor.getString(6)), cursor.isNull(7) ? null : Long.valueOf(cursor.getLong(7)));
        }
    }

    public static final class GetLastReceivedNotViewedUpdateMessageMapper<T extends GetLastReceivedNotViewedUpdateMessageModel, T1 extends MessageModel, T2 extends FeedModel> implements ainw<T> {
        private final GetLastReceivedNotViewedUpdateMessageCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T2> feedModelFactory;
        private final Factory<T1> messageModelFactory;

        public GetLastReceivedNotViewedUpdateMessageMapper(GetLastReceivedNotViewedUpdateMessageCreator<T> getLastReceivedNotViewedUpdateMessageCreator, Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T2> factory2) {
            this.creator = getLastReceivedNotViewedUpdateMessageCreator;
            this.messageModelFactory = factory;
            this.feedModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.isNull(0) ? null : Long.valueOf(cursor2.getLong(0)), cursor2.getString(1), cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2)), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.getLong(4), cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5)), cursor2.isNull(6) ? null : cursor2.getBlob(6), cursor2.isNull(7) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(7)), cursor2.getInt(8) == 1, cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(10))), cursor2.isNull(11) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor2.getString(11)), cursor2.getLong(12), (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(13))));
        }
    }

    public static final class GetLastMessageForMessageClientStatusMapper<T extends GetLastMessageForMessageClientStatusModel, T1 extends MessageModel> implements ainw<T> {
        private final GetLastMessageForMessageClientStatusCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetLastMessageForMessageClientStatusMapper(GetLastMessageForMessageClientStatusCreator<T> getLastMessageForMessageClientStatusCreator, Factory<T1> factory) {
            this.creator = getLastMessageForMessageClientStatusCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetLastMessageForMessageClientStatusCreator getLastMessageForMessageClientStatusCreator = this.creator;
            MessageClientStatus messageClientStatus = null;
            Long valueOf = cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0));
            Long valueOf2 = cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1));
            String string = cursor.getString(2);
            String string2 = cursor.isNull(3) ? null : cursor.getString(3);
            String string3 = cursor.isNull(4) ? null : cursor.getString(4);
            Long valueOf3 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
            if (!cursor.isNull(6)) {
                messageClientStatus = (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor.getString(6));
            }
            return getLastMessageForMessageClientStatusCreator.create(valueOf, valueOf2, string, string2, string3, valueOf3, messageClientStatus, cursor.getLong(7));
        }
    }

    public static final class GetLastViewedMessageMapper<T extends GetLastViewedMessageModel, T1 extends MessageModel> implements ainw<T> {
        private final GetLastViewedMessageCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetLastViewedMessageMapper(GetLastViewedMessageCreator<T> getLastViewedMessageCreator, Factory<T1> factory) {
            this.creator = getLastViewedMessageCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.getLong(3), cursor.isNull(4) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor.getString(4)), cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5)));
        }
    }

    public static final class MessageDumpMapper<T extends MessageDumpModel, T1 extends MessageModel> implements ainw<T> {
        private final MessageDumpCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public MessageDumpMapper(MessageDumpCreator<T> messageDumpCreator, Factory<T1> factory) {
            this.creator = messageDumpCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            MessageDumpCreator messageDumpCreator = this.creator;
            String str = null;
            String string = cursor2.isNull(0) ? null : cursor2.getString(0);
            long j = cursor2.getLong(1);
            String string2 = cursor2.getString(2);
            long j2 = cursor2.getLong(3);
            String string3 = cursor2.isNull(4) ? null : cursor2.getString(4);
            MessageClientStatus messageClientStatus = cursor2.isNull(5) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(5));
            Long valueOf = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            if (!cursor2.isNull(7)) {
                str = cursor2.getString(7);
            }
            return messageDumpCreator.create(string, j, string2, j2, string3, messageClientStatus, valueOf, str, cursor2.getInt(8) == 1);
        }
    }

    public static final class GetBasicInfoForMessageMapper<T extends GetBasicInfoForMessageModel> implements ainw<T> {
        private final GetBasicInfoForMessageCreator<T> creator;

        public GetBasicInfoForMessageMapper(GetBasicInfoForMessageCreator<T> getBasicInfoForMessageCreator) {
            this.creator = getBasicInfoForMessageCreator;
        }

        public final T map(Cursor cursor) {
            GetBasicInfoForMessageCreator getBasicInfoForMessageCreator = this.creator;
            String string = cursor.getString(0);
            String str = null;
            Long valueOf = cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1));
            String string2 = cursor.isNull(2) ? null : cursor.getString(2);
            if (!cursor.isNull(3)) {
                str = cursor.getString(3);
            }
            return getBasicInfoForMessageCreator.create(string, valueOf, string2, str);
        }
    }

    public static final class GetReceivedSnapsMapper<T extends GetReceivedSnapsModel, T1 extends MessageModel> implements ainw<T> {
        private final GetReceivedSnapsCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetReceivedSnapsMapper(GetReceivedSnapsCreator<T> getReceivedSnapsCreator, Factory<T1> factory) {
            this.creator = getReceivedSnapsCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0)), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)), cursor.getString(2), cursor.getLong(3), cursor.getLong(4), cursor.isNull(5) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor.getString(5)), cursor.isNull(6) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(6)), cursor.isNull(7) ? null : cursor.getBlob(7));
        }
    }

    public static final class GetLastSentSnapForMessageMapper<T extends GetLastSentSnapForMessageModel, T1 extends MessageModel, T2 extends FriendModel> implements ainw<T> {
        private final GetLastSentSnapForMessageCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;
        private final Factory<T1> messageModelFactory;

        public GetLastSentSnapForMessageMapper(GetLastSentSnapForMessageCreator<T> getLastSentSnapForMessageCreator, Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = getLastSentSnapForMessageCreator;
            this.messageModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.isNull(0) ? null : Long.valueOf(cursor2.getLong(0)), cursor2.isNull(1) ? null : Long.valueOf(cursor2.getLong(1)), cursor2.getString(2), cursor2.getLong(3), cursor2.getLong(4), cursor2.isNull(5) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor2.getString(5)), cursor2.isNull(6) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(6)), cursor2.isNull(7) ? null : cursor2.getBlob(7), cursor2.isNull(8) ? null : cursor2.getBlob(8), cursor2.isNull(9) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(9))));
        }
    }

    public static final class GetContentForMessagesMapper<T extends GetContentForMessagesModel> implements ainw<T> {
        private final GetContentForMessagesCreator<T> creator;

        public GetContentForMessagesMapper(GetContentForMessagesCreator<T> getContentForMessagesCreator) {
            this.creator = getContentForMessagesCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getBlob(4), cursor.getLong(5), cursor.getString(6));
        }
    }

    public static final class GetSnapInfoFromMessageByMessageIdMapper<T extends GetSnapInfoFromMessageByMessageIdModel, T1 extends MessageModel> implements ainw<T> {
        private final GetSnapInfoFromMessageByMessageIdCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetSnapInfoFromMessageByMessageIdMapper(GetSnapInfoFromMessageByMessageIdCreator<T> getSnapInfoFromMessageByMessageIdCreator, Factory<T1> factory) {
            this.creator = getSnapInfoFromMessageByMessageIdCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.getLong(4), cursor.isNull(5) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(5)), cursor.isNull(6) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor.getString(6)), cursor.isNull(7) ? null : (yfj) this.messageModelFactory.viewerListAdapter.decode(cursor.getBlob(7)), cursor.isNull(8) ? null : Long.valueOf(cursor.getLong(8)));
        }
    }

    public static final class GetSnapInfoWithContentFromMessageByMessageIdMapper<T extends GetSnapInfoWithContentFromMessageByMessageIdModel, T1 extends MessageModel> implements ainw<T> {
        private final GetSnapInfoWithContentFromMessageByMessageIdCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetSnapInfoWithContentFromMessageByMessageIdMapper(GetSnapInfoWithContentFromMessageByMessageIdCreator<T> getSnapInfoWithContentFromMessageByMessageIdCreator, Factory<T1> factory) {
            this.creator = getSnapInfoWithContentFromMessageByMessageIdCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetSnapInfoWithContentFromMessageByMessageIdCreator getSnapInfoWithContentFromMessageByMessageIdCreator = this.creator;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            String string2 = cursor.getString(2);
            byte[] bArr = null;
            ScreenshottedOrReplayedState screenshottedOrReplayedState = cursor.isNull(3) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(3));
            Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
            if (!cursor.isNull(5)) {
                bArr = cursor.getBlob(5);
            }
            return getSnapInfoWithContentFromMessageByMessageIdCreator.create(j, string, string2, screenshottedOrReplayedState, valueOf, bArr);
        }
    }

    public static final class GetSnapOperaInfoByRowIdMapper<T extends GetSnapOperaInfoByRowIdModel, T1 extends FeedModel> implements ainw<T> {
        private final GetSnapOperaInfoByRowIdCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;

        public GetSnapOperaInfoByRowIdMapper(GetSnapOperaInfoByRowIdCreator<T> getSnapOperaInfoByRowIdCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory) {
            this.creator = getSnapOperaInfoByRowIdCreator;
            this.feedModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0)), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.getLong(4), cursor.isNull(5) ? null : cursor.getBlob(5), cursor.isNull(6) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor.getLong(6))), cursor.isNull(7) ? null : cursor.getString(7));
        }
    }

    public static final class GetSnapsOlderThanTimestampMapper<T extends GetSnapsOlderThanTimestampModel> implements ainw<T> {
        private final GetSnapsOlderThanTimestampCreator<T> creator;

        public GetSnapsOlderThanTimestampMapper(GetSnapsOlderThanTimestampCreator<T> getSnapsOlderThanTimestampCreator) {
            this.creator = getSnapsOlderThanTimestampCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)));
        }
    }

    public static final class GetSnapsFromMessageForFeedMapper<T extends GetSnapsFromMessageForFeedModel, T1 extends MessageModel> implements ainw<T> {
        private final GetSnapsFromMessageForFeedCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetSnapsFromMessageForFeedMapper(GetSnapsFromMessageForFeedCreator<T> getSnapsFromMessageForFeedCreator, Factory<T1> factory) {
            this.creator = getSnapsFromMessageForFeedCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor.getString(1)), cursor.getString(2), cursor.getLong(3), cursor.getInt(4) == 1, cursor.getLong(5));
        }
    }

    public static final class GetSnapMessageInfoForKeyNewMapper<T extends GetSnapMessageInfoForKeyNewModel, T1 extends MessageModel> implements ainw<T> {
        private final GetSnapMessageInfoForKeyNewCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetSnapMessageInfoForKeyNewMapper(GetSnapMessageInfoForKeyNewCreator<T> getSnapMessageInfoForKeyNewCreator, Factory<T1> factory) {
            this.creator = getSnapMessageInfoForKeyNewCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getString(0), cursor2.isNull(1) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor2.getString(1)), cursor2.getLong(2), cursor2.isNull(3) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor2.getString(3)), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(4))), cursor2.isNull(5) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(5)), cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6)), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.getString(9), cursor2.getLong(10));
        }
    }

    public static final class GetSnapMetadataForMessageIdMapper<T extends GetSnapMetadataForMessageIdModel, T1 extends FeedModel> implements ainw<T> {
        private final GetSnapMetadataForMessageIdCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;

        public GetSnapMetadataForMessageIdMapper(GetSnapMetadataForMessageIdCreator<T> getSnapMetadataForMessageIdCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory) {
            this.creator = getSnapMetadataForMessageIdCreator;
            this.feedModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getBlob(1), (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.getString(3), cursor.getString(4));
        }
    }

    public static final class GetSnapStatesByIdsMapper<T extends GetSnapStatesByIdsModel, T1 extends MessageModel> implements ainw<T> {
        private final GetSnapStatesByIdsCreator<T> creator;
        private final Factory<T1> messageModelFactory;

        public GetSnapStatesByIdsMapper(GetSnapStatesByIdsCreator<T> getSnapStatesByIdsCreator, Factory<T1> factory) {
            this.creator = getSnapStatesByIdsCreator;
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetSnapStatesByIdsCreator getSnapStatesByIdsCreator = this.creator;
            String string = cursor.getString(0);
            ScreenshottedOrReplayedState screenshottedOrReplayedState = null;
            SnapServerStatus snapServerStatus = cursor.isNull(1) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor.getString(1));
            if (!cursor.isNull(2)) {
                screenshottedOrReplayedState = (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(2));
            }
            return getSnapStatesByIdsCreator.create(string, snapServerStatus, screenshottedOrReplayedState);
        }
    }

    public interface GetBasicInfoForMessageModel {
        String key();

        String senderUsername();

        Long sequenceNumber();

        String type();
    }

    public interface GetContentForMessagesModel {
        String Feed_key();

        long _id();

        byte[] content();

        String key();

        String senderUsername();

        long timestamp();

        String type();
    }

    public interface GetLastMessageForFeedCreator<T extends GetLastMessageForFeedModel> {
        T create(long j, String str, long j2, MessageClientStatus messageClientStatus, Long l, gcp gcp, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2, Long l2);
    }

    public interface GetLastMessageForFeedExcludingStatusModel {
        long _id();

        MessageClientStatus clientStatus();

        Long senderUserId();

        String senderUsername();

        Long sequenceNumber();

        ScreenshottedOrReplayedState snapScreenshottedOrReplayed();

        SnapServerStatus snapServerStatus();

        gcp snapType();

        long timestamp();

        String type();
    }

    public interface GetLastMessageForFeedModel {
        long _id();

        MessageClientStatus clientStatus();

        Long senderUserId();

        String senderUsername();

        Long sequenceNumber();

        ScreenshottedOrReplayedState snapScreenshottedOrReplayed();

        SnapServerStatus snapServerStatus();

        gcp snapType();

        long timestamp();

        String type();
    }

    public interface GetLastMessageForMessageClientStatusModel {
        Long Message_senderId();

        String chatMessageId();

        MessageClientStatus clientStatus();

        Long feedRowId();

        Long senderId();

        String snapId();

        long timestamp();

        String type();
    }

    public interface GetLastReceivedNotViewedUpdateMessageModel {
        MessageClientStatus clientStatus();

        byte[] content();

        Long feedRowId();

        String key();

        FeedKind kind();

        long messageRetentionInMinutes();

        gcj preserved();

        boolean released();

        gcm savedStates();

        Long seenTimestamp();

        Long senderId();

        Long sequenceNumber();

        long timestamp();

        String type();
    }

    public interface GetLastReceivedViewedChatModel {
        MessageClientStatus clientStatus();

        Long feedRowId();

        String key();

        Long senderId();

        Long sequenceNumber();

        long timestamp();

        String type();
    }

    public interface GetLastReleasedChatModel {
        MessageClientStatus clientStatus();

        String key();

        Long senderId();

        Long sequenceNumber();

        long timestamp();

        String type();
    }

    public interface GetLastSentNotViewedChatModel {
        MessageClientStatus clientStatus();

        Long feedRowId();

        FriendLinkType friendLinkType();

        String key();

        Long senderId();

        Long sequenceNumber();

        long timestamp();

        String type();

        String username();
    }

    public interface GetLastSentSnapForMessageModel {
        byte[] authToken();

        byte[] content();

        Long feedRowId();

        FriendLinkType friendLinkType();

        long interactionTimestamp();

        String key();

        long messageTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        Long senderId();

        SnapServerStatus snapServerStatus();
    }

    public interface GetLastSentViewedChatModel {
        MessageClientStatus clientStatus();

        Long feedRowId();

        String key();

        Long lastInteractionTimestamp();

        Long senderId();

        Long sequenceNumber();

        long timestamp();

        String type();
    }

    public interface GetLastViewedMessageModel {
        long _id();

        MessageClientStatus clientStatus();

        Long senderId();

        Long sequenceNumber();

        long timestamp();

        String type();
    }

    public interface GetMessageByKeyModel {
        long _id();

        String key();

        gcj preserved();

        boolean released();

        gcm savedStates();

        Long seenTimestamp();

        long timestamp();
    }

    public interface GetMessageMediaInfoForIdModel {
        byte[] content();

        String conversationId();

        String key();

        String senderId();

        String type();
    }

    public interface GetMessageMediaInfoForKeyModel {
        byte[] content();

        String conversationId();

        String senderId();

        ReplyMedia snapReplyMedia();

        String type();
    }

    public interface GetMessageMediaInfoForSnapIdModel {
        String conversationId();

        String cryptoIV();

        String cryptoKey();

        aesg directDownloadUrl();

        String key();

        String mediaId();

        String senderId();

        gcp snapType();
    }

    public interface GetMessagesForFeedModel {
        long _id();

        long _modifiedTimestamp();

        MessageClientStatus clientStatus();

        byte[] content();

        String feedKey();

        FeedKind feedKind();

        Long feedRowId();

        long isSelfConversation();

        String key();

        Long messageRetentionInMinutes();

        ScreenshottedOrReplayedState newScreenshotOrReplayed();

        SnapServerStatus newSnapServerStatus();

        yfj newViewerList();

        gcj preserved();

        boolean released();

        gcm savedStates();

        ScreenshottedOrReplayedState screenshotOrReplayed();

        Long seenTimestamp();

        Integer senderColor();

        String senderDisplayName();

        String senderUsername();

        Long sequenceNumber();

        ReplyMedia snapReplyMedia();

        Long snapRowId();

        SnapServerStatus snapServerStatus();

        gcp snapType();

        long timestamp();

        String type();

        String viewerList();
    }

    public interface GetMischiefPlayableSnapInfoForIdCreator<T extends GetMischiefPlayableSnapInfoForIdModel> {
        T create(String str, String str2, String str3);
    }

    public interface GetMischiefPlayableSnapInfoForIdModel {
        String conversationId();

        String mediaId();

        String senderId();
    }

    public interface GetPlayableSnapsForFeedModel {
        long _id();

        MessageClientStatus clientStatus();

        byte[] content();

        String feedKey();

        FeedKind feedKind();

        Long feedRowId();

        String key();

        gcj preserved();

        boolean released();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        String senderDisplayName();

        String senderUsername();

        SnapServerStatus snapServerStatus();

        long timestamp();

        String type();
    }

    public interface GetReceivedSnapsModel {
        byte[] content();

        Long feedRowId();

        long interactionTimestamp();

        String key();

        long messageTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        Long senderId();

        SnapServerStatus snapServerStatus();
    }

    public interface GetSnapInfoForDifferentialUpdateModel {
        long messageRowId();

        String messageType();

        gcj preserved();

        gcm savedStates();

        SnapServerStatus serverStatus();

        String snapId();

        gcp snapType();

        long timestamp();
    }

    public interface GetSnapInfoFromMessageByMessageIdModel {
        long _id();

        String key();

        Long lastInteractionTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        String senderUsername();

        SnapServerStatus snapServerStatus();

        long timestamp();

        String type();

        yfj viewerList();
    }

    public interface GetSnapInfoWithContentFromMessageByMessageIdModel {
        long _id();

        byte[] content();

        String key();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        String senderUsername();

        Long sequenceNumber();
    }

    public interface GetSnapMessageInfoForKeyModel {
        String convId();

        long feedRowId();

        String key();

        Long lastReadTimestamp();

        String lastReader();

        String lastWriter();

        gcj preserved();

        gcm savedStates();

        SnapServerStatus serverStatus();

        ScreenshottedOrReplayedState snapScreenshottedOrReplayed();

        long timestamp();
    }

    public interface GetSnapMessageInfoForKeyNewModel {
        String convId();

        long feedRowId();

        String key();

        Long lastReadTimestamp();

        String lastReader();

        String lastWriter();

        gcj preserved();

        gcm savedStates();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        SnapServerStatus snapServerStatus();

        long timestamp();
    }

    public interface GetSnapMetadataForMessageIdModel {
        long _id();

        byte[] content();

        String conversationId();

        FeedKind feedKind();

        String senderUsername();
    }

    public interface GetSnapOperaInfoByRowIdModel {
        byte[] content();

        String displayName();

        String feedKey();

        Long feedRowId();

        FeedKind kind();

        Long score();

        long timestamp();

        String username();
    }

    public interface GetSnapStatesByIdsModel {
        String key();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        SnapServerStatus snapServerStatus();
    }

    public interface GetSnapsFromMessageForFeedModel {
        long isSelfConversation();

        String key();

        boolean released();

        SnapServerStatus snapServerStatus();

        long timestamp();

        String username();
    }

    public interface GetSnapsOlderThanTimestampModel {
        Long feedRowId();

        String key();
    }

    public interface MessageDumpModel {
        long _id();

        MessageClientStatus clientStatus();

        String conversationKey();

        String key();

        boolean released();

        String senderUsername();

        Long sequenceNumber();

        long timestamp();

        String type();
    }

    public static final class GetLastMessageForFeedMapper<T extends GetLastMessageForFeedModel, T1 extends MessageModel, T2 extends SnapModel, T3 extends MessagingSnapModel> implements ainw<T> {
        private final GetLastMessageForFeedCreator<T> creator;
        private final Factory<T1> messageModelFactory;
        private final com.snap.core.db.record.MessagingSnapModel.Factory<T3> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;

        public GetLastMessageForFeedMapper(GetLastMessageForFeedCreator<T> getLastMessageForFeedCreator, Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, com.snap.core.db.record.MessagingSnapModel.Factory<T3> factory3) {
            this.creator = getLastMessageForFeedCreator;
            this.messageModelFactory = factory;
            this.snapModelFactory = factory2;
            this.messagingSnapModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.isNull(1) ? null : cursor2.getString(1), cursor2.getLong(2), cursor2.isNull(3) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(3)), cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4)), cursor2.isNull(5) ? null : (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5))), cursor2.isNull(6) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor2.getString(6)), cursor2.isNull(7) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(7)), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)));
        }
    }

    public static final class GetMischiefPlayableSnapInfoForIdMapper<T extends GetMischiefPlayableSnapInfoForIdModel> implements ainw<T> {
        private final GetMischiefPlayableSnapInfoForIdCreator<T> creator;

        public GetMischiefPlayableSnapInfoForIdMapper(GetMischiefPlayableSnapInfoForIdCreator<T> getMischiefPlayableSnapInfoForIdCreator) {
            this.creator = getMischiefPlayableSnapInfoForIdCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.getString(2));
        }
    }

    public static final class Mapper<T extends MessageModel> implements ainw<T> {
        private final Factory<T> messageModelFactory;

        public Mapper(Factory<T> factory) {
            this.messageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            Creator creator = this.messageModelFactory.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            String string = cursor2.getString(2);
            Long valueOf = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            long j3 = cursor2.getLong(4);
            Long valueOf2 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Long valueOf3 = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            MessageClientStatus messageClientStatus = cursor2.isNull(7) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(7));
            Long valueOf4 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            String string2 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string3 = cursor2.isNull(10) ? null : cursor2.getString(10);
            String string4 = cursor2.isNull(11) ? null : cursor2.getString(11);
            String string5 = cursor2.isNull(12) ? null : cursor2.getString(12);
            String string6 = cursor2.isNull(13) ? null : cursor2.getString(13);
            String string7 = cursor2.isNull(14) ? null : cursor2.getString(14);
            Integer valueOf5 = cursor2.isNull(15) ? null : Integer.valueOf(cursor2.getInt(15));
            Integer valueOf6 = cursor2.isNull(16) ? null : Integer.valueOf(cursor2.getInt(16));
            String string8 = cursor2.isNull(17) ? null : cursor2.getString(17);
            Float valueOf7 = cursor2.isNull(18) ? null : Float.valueOf(cursor2.getFloat(18));
            if (cursor2.isNull(19)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(19) == 1);
            }
            if (cursor2.isNull(20)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(20) == 1);
            }
            return creator.create(j, j2, string, valueOf, j3, valueOf2, valueOf3, messageClientStatus, valueOf4, string2, string3, string4, string5, string6, string7, valueOf5, valueOf6, string8, valueOf7, bool, bool2, cursor2.isNull(21) ? null : cursor2.getString(21), cursor2.isNull(22) ? null : cursor2.getString(22), cursor2.isNull(23) ? null : Long.valueOf(cursor2.getLong(23)), cursor2.isNull(24) ? null : cursor2.getBlob(24), (gcj) this.messageModelFactory.preservedAdapter.decode(Long.valueOf(cursor2.getLong(25))), cursor2.isNull(26) ? null : (gcm) this.messageModelFactory.savedStatesAdapter.decode(cursor2.getString(26)), cursor2.getInt(27) == 1, cursor2.isNull(28) ? null : cursor2.getString(28), cursor2.isNull(29) ? null : (ScreenshottedOrReplayedState) this.messageModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(29)), cursor2.isNull(30) ? null : (SnapServerStatus) this.messageModelFactory.snapServerStatusAdapter.decode(cursor2.getString(30)), cursor2.isNull(31) ? null : Long.valueOf(cursor2.getLong(31)), cursor2.isNull(32) ? null : (yfj) this.messageModelFactory.viewerListAdapter.decode(cursor2.getBlob(32)));
        }
    }

    public static final class ClearAllMessages extends ainy {
        public ClearAllMessages(pa paVar) {
            super(MessageModel.TABLE_NAME, paVar.a("DELETE FROM Message"));
        }
    }

    public static final class ClearMessagesForFeed extends ainy {
        public ClearMessagesForFeed(pa paVar) {
            super(MessageModel.TABLE_NAME, paVar.a("DELETE FROM Message\nWHERE feedRowId=?"));
        }

        public final void bind(Long l) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
        }
    }

    public static final class DeleteFailedMessagesNotInConveration extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public DeleteFailedMessagesNotInConveration(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("DELETE FROM Message\nWHERE clientStatus=?1 AND feedRowId=?2 AND key NOT IN (?3)"));
            this.messageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, Long l, String str) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            bindString(3, str);
        }
    }

    public static final class DeleteMessageForKey extends ainy {
        public DeleteMessageForKey(pa paVar) {
            super(MessageModel.TABLE_NAME, paVar.a("DELETE FROM Message\nWHERE key LIKE ?||'%' AND feedRowId=?"));
        }

        public final void bind(String str, Long l) {
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
        }
    }

    public static final class DeleteMessageFromConversationWithStatus extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public DeleteMessageFromConversationWithStatus(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("DELETE FROM Message\nWHERE clientStatus=?1 AND feedRowId=?2"));
            this.messageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, Long l) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
        }
    }

    public static final class DropMessagesByType extends ainy {
        public DropMessagesByType(pa paVar) {
            super(MessageModel.TABLE_NAME, paVar.a("DELETE FROM Message\nWHERE type=?"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class DropMessagesByTypeAndFeed extends ainy {
        public DropMessagesByTypeAndFeed(pa paVar) {
            super(MessageModel.TABLE_NAME, paVar.a("DELETE FROM Message\nWHERE feedRowId=? AND type=?"));
        }

        public final void bind(Long l, String str) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            if (str == null) {
                bindNull(2);
            } else {
                bindString(2, str);
            }
        }
    }

    public static final class InsertBasic extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public InsertBasic(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("INSERT INTO Message(\n    key,\n    feedRowId,\n    senderId,\n    timestamp,\n    sequenceNumber,\n    clientStatus,\n    type,\n    content,\n    preserved)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, 0)"));
            this.messageModelFactory = factory;
        }

        public final void bind(String str, Long l, Long l2, long j, Long l3, MessageClientStatus messageClientStatus, String str2, byte[] bArr) {
            bindString(1, str);
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
            bindLong(4, j);
            if (l3 == null) {
                bindNull(5);
            } else {
                bindLong(5, l3.longValue());
            }
            if (messageClientStatus == null) {
                bindNull(6);
            } else {
                bindString(6, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            if (str2 == null) {
                bindNull(7);
            } else {
                bindString(7, str2);
            }
            if (bArr == null) {
                bindNull(8);
            } else {
                bindBlob(8, bArr);
            }
        }
    }

    public static final class InsertContent extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public InsertContent(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("INSERT INTO Message(\n    key,\n    feedRowId,\n    senderId,\n    timestamp,\n    seenTimestamp,\n    sequenceNumber,\n    clientStatus,\n    type,\n    content,\n    preserved,\n    savedStates,\n    released,\n    screenshottedOrReplayed,\n    snapServerStatus,\n    viewerList,\n    lastInteractionTimestamp)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.messageModelFactory = factory;
        }

        public final void bind(String str, Long l, Long l2, long j, Long l3, Long l4, MessageClientStatus messageClientStatus, String str2, byte[] bArr, gcj gcj, gcm gcm, boolean z, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj, Long l5) {
            MessageClientStatus messageClientStatus2 = messageClientStatus;
            String str3 = str2;
            byte[] bArr2 = bArr;
            gcm gcm2 = gcm;
            ScreenshottedOrReplayedState screenshottedOrReplayedState2 = screenshottedOrReplayedState;
            SnapServerStatus snapServerStatus2 = snapServerStatus;
            yfj yfj2 = yfj;
            String str4 = str;
            bindString(1, str);
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
            bindLong(4, j);
            if (l3 == null) {
                bindNull(5);
            } else {
                bindLong(5, l3.longValue());
            }
            if (l4 == null) {
                bindNull(6);
            } else {
                bindLong(6, l4.longValue());
            }
            if (messageClientStatus2 == null) {
                bindNull(7);
            } else {
                bindString(7, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus2));
            }
            if (str3 == null) {
                bindNull(8);
            } else {
                bindString(8, str3);
            }
            if (bArr2 == null) {
                bindNull(9);
            } else {
                bindBlob(9, bArr2);
            }
            bindLong(10, ((Long) this.messageModelFactory.preservedAdapter.encode(gcj)).longValue());
            if (gcm2 == null) {
                bindNull(11);
            } else {
                bindString(11, (String) this.messageModelFactory.savedStatesAdapter.encode(gcm2));
            }
            bindLong(12, z ? 1 : 0);
            if (screenshottedOrReplayedState2 == null) {
                bindNull(13);
            } else {
                bindString(13, (String) this.messageModelFactory.screenshottedOrReplayedAdapter.encode(screenshottedOrReplayedState2));
            }
            if (snapServerStatus2 == null) {
                bindNull(14);
            } else {
                bindString(14, (String) this.messageModelFactory.snapServerStatusAdapter.encode(snapServerStatus2));
            }
            if (yfj2 == null) {
                bindNull(15);
            } else {
                bindBlob(15, (byte[]) this.messageModelFactory.viewerListAdapter.encode(yfj2));
            }
            if (l5 == null) {
                bindNull(16);
            } else {
                bindLong(16, l5.longValue());
            }
        }
    }

    public static final class InsertMedia extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public InsertMedia(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("INSERT INTO Message(\n    key,\n    feedRowId,\n    senderId,\n    timestamp,\n    sequenceNumber,\n    clientStatus,\n    type,\n    mediaId,\n    mediaType,\n    mediaUrl,\n    cryptoKey,\n    cryptoIV,\n    mediaWidth,\n    mediaHeight,\n    mediaTimerSec,\n    mediaIsInfinite,\n    mediaZipped,\n    mediaVenueId,\n    mediaSourceId,\n    content,\n    preserved,\n    savedStates)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.messageModelFactory = factory;
        }

        public final void bind(String str, Long l, Long l2, long j, Long l3, MessageClientStatus messageClientStatus, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Float f, Boolean bool, Boolean bool2, String str8, String str9, byte[] bArr, gcj gcj, gcm gcm) {
            MessageClientStatus messageClientStatus2 = messageClientStatus;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            String str17 = str9;
            byte[] bArr2 = bArr;
            gcm gcm2 = gcm;
            bindString(1, str);
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
            bindLong(4, j);
            if (l3 == null) {
                bindNull(5);
            } else {
                bindLong(5, l3.longValue());
            }
            if (messageClientStatus2 == null) {
                bindNull(6);
            } else {
                bindString(6, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus2));
            }
            if (str10 == null) {
                bindNull(7);
            } else {
                bindString(7, str10);
            }
            if (str11 == null) {
                bindNull(8);
            } else {
                bindString(8, str11);
            }
            if (str12 == null) {
                bindNull(9);
            } else {
                bindString(9, str12);
            }
            if (str13 == null) {
                bindNull(10);
            } else {
                bindString(10, str13);
            }
            if (str14 == null) {
                bindNull(11);
            } else {
                bindString(11, str14);
            }
            if (str15 == null) {
                bindNull(12);
            } else {
                bindString(12, str15);
            }
            if (num == null) {
                bindNull(13);
            } else {
                bindLong(13, (long) num.intValue());
            }
            if (num2 == null) {
                bindNull(14);
            } else {
                bindLong(14, (long) num2.intValue());
            }
            if (f == null) {
                bindNull(15);
            } else {
                bindDouble(15, (double) f.floatValue());
            }
            long j2 = 0;
            if (bool == null) {
                bindNull(16);
            } else {
                bindLong(16, bool.booleanValue() ? 1 : 0);
            }
            if (bool2 == null) {
                bindNull(17);
            } else {
                if (bool2.booleanValue()) {
                    j2 = 1;
                }
                bindLong(17, j2);
            }
            if (str16 == null) {
                bindNull(18);
            } else {
                bindString(18, str16);
            }
            if (str17 == null) {
                bindNull(19);
            } else {
                bindString(19, str17);
            }
            if (bArr2 == null) {
                bindNull(20);
            } else {
                bindBlob(20, bArr2);
            }
            bindLong(21, ((Long) this.messageModelFactory.preservedAdapter.encode(gcj)).longValue());
            if (gcm2 == null) {
                bindNull(22);
            } else {
                bindString(22, (String) this.messageModelFactory.savedStatesAdapter.encode(gcm2));
            }
        }
    }

    public static final class SetClientStatusForFeedMessages extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public SetClientStatusForFeedMessages(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("UPDATE Message\nSET clientStatus = ?1\nWHERE feedRowId =?2 AND key IN (?3)"));
            this.messageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, Long l, String str) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            bindString(3, str);
        }
    }

    public static final class SetClientStatusForMessages extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public SetClientStatusForMessages(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("UPDATE Message\nSET clientStatus = ?1\nWHERE clientStatus = ?2 AND timestamp < ?3"));
            this.messageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, MessageClientStatus messageClientStatus2, long j) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            if (messageClientStatus2 == null) {
                bindNull(2);
            } else {
                bindString(2, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus2));
            }
            bindLong(3, j);
        }
    }

    public static final class UpdateContentMessage extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public UpdateContentMessage(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("UPDATE Message\nSET\n    senderId=?,\n    timestamp=?,\n    seenTimestamp=?,\n    sequenceNumber=?,\n    clientStatus=?,\n    type=?,\n    content=?,\n    preserved=?,\n    savedStates=?,\n    released=?,\n    screenshottedOrReplayed=?,\n    snapServerStatus=?,\n    viewerList=?,\n    lastInteractionTimestamp=?\nWHERE key=?"));
            this.messageModelFactory = factory;
        }

        public final void bind(Long l, long j, Long l2, Long l3, MessageClientStatus messageClientStatus, String str, byte[] bArr, gcj gcj, gcm gcm, boolean z, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj, Long l4, String str2) {
            MessageClientStatus messageClientStatus2 = messageClientStatus;
            String str3 = str;
            byte[] bArr2 = bArr;
            gcm gcm2 = gcm;
            ScreenshottedOrReplayedState screenshottedOrReplayedState2 = screenshottedOrReplayedState;
            SnapServerStatus snapServerStatus2 = snapServerStatus;
            yfj yfj2 = yfj;
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            long j2 = j;
            bindLong(2, j);
            if (l2 == null) {
                bindNull(3);
            } else {
                bindLong(3, l2.longValue());
            }
            if (l3 == null) {
                bindNull(4);
            } else {
                bindLong(4, l3.longValue());
            }
            if (messageClientStatus2 == null) {
                bindNull(5);
            } else {
                bindString(5, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus2));
            }
            if (str3 == null) {
                bindNull(6);
            } else {
                bindString(6, str3);
            }
            if (bArr2 == null) {
                bindNull(7);
            } else {
                bindBlob(7, bArr2);
            }
            bindLong(8, ((Long) this.messageModelFactory.preservedAdapter.encode(gcj)).longValue());
            if (gcm2 == null) {
                bindNull(9);
            } else {
                bindString(9, (String) this.messageModelFactory.savedStatesAdapter.encode(gcm2));
            }
            bindLong(10, z ? 1 : 0);
            if (screenshottedOrReplayedState2 == null) {
                bindNull(11);
            } else {
                bindString(11, (String) this.messageModelFactory.screenshottedOrReplayedAdapter.encode(screenshottedOrReplayedState2));
            }
            if (snapServerStatus2 == null) {
                bindNull(12);
            } else {
                bindString(12, (String) this.messageModelFactory.snapServerStatusAdapter.encode(snapServerStatus2));
            }
            if (yfj2 == null) {
                bindNull(13);
            } else {
                bindBlob(13, (byte[]) this.messageModelFactory.viewerListAdapter.encode(yfj2));
            }
            if (l4 == null) {
                bindNull(14);
            } else {
                bindLong(14, l4.longValue());
            }
            bindString(15, str2);
        }
    }

    public static final class UpdateMessageClientStatus extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public UpdateMessageClientStatus(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("UPDATE Message\nSET clientStatus=?\nWHERE _id=?"));
            this.messageModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, long j) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.clientStatusAdapter.encode(messageClientStatus));
            }
            bindLong(2, j);
        }
    }

    public static final class UpdateMessageFromServer extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public UpdateMessageFromServer(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("UPDATE Message\nSET\npreserved = ?,\nsavedStates = ?,\ntimestamp = ? ,\nsequenceNumber = ?\nWHERE _id = ?"));
            this.messageModelFactory = factory;
        }

        public final void bind(gcj gcj, gcm gcm, long j, Long l, long j2) {
            bindLong(1, ((Long) this.messageModelFactory.preservedAdapter.encode(gcj)).longValue());
            if (gcm == null) {
                bindNull(2);
            } else {
                bindString(2, (String) this.messageModelFactory.savedStatesAdapter.encode(gcm));
            }
            bindLong(3, j);
            if (l == null) {
                bindNull(4);
            } else {
                bindLong(4, l.longValue());
            }
            bindLong(5, j2);
        }
    }

    public static final class UpdatePreservationState extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public UpdatePreservationState(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("UPDATE Message\nSET preserved = ?\nWHERE _id = ?"));
            this.messageModelFactory = factory;
        }

        public final void bind(gcj gcj, long j) {
            bindLong(1, ((Long) this.messageModelFactory.preservedAdapter.encode(gcj)).longValue());
            bindLong(2, j);
        }
    }

    public static final class UpdateSaveState extends ainy {
        private final Factory<? extends MessageModel> messageModelFactory;

        public UpdateSaveState(pa paVar, Factory<? extends MessageModel> factory) {
            super(MessageModel.TABLE_NAME, paVar.a("UPDATE Message\nSET savedStates = ?\nWHERE _id = ?"));
            this.messageModelFactory = factory;
        }

        public final void bind(gcm gcm, long j) {
            if (gcm == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messageModelFactory.savedStatesAdapter.encode(gcm));
            }
            bindLong(2, j);
        }
    }

    long _id();

    long _modifiedTimestamp();

    MessageClientStatus clientStatus();

    byte[] content();

    String cryptoIV();

    String cryptoKey();

    Long feedRowId();

    String key();

    Long lastInteractionTimestamp();

    Integer mediaHeight();

    String mediaId();

    Boolean mediaIsInfinite();

    String mediaOwner();

    String mediaSourceId();

    Float mediaTimerSec();

    String mediaType();

    String mediaUrl();

    String mediaVenueId();

    Integer mediaWidth();

    Boolean mediaZipped();

    String messageOrderingKey();

    Long payloadId();

    gcj preserved();

    boolean released();

    gcm savedStates();

    ScreenshottedOrReplayedState screenshottedOrReplayed();

    Long seenTimestamp();

    Long senderId();

    Long sequenceNumber();

    SnapServerStatus snapServerStatus();

    long timestamp();

    String type();

    yfj viewerList();
}

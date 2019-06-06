package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import defpackage.aetf;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface InteractionMessagesModel {
    @Deprecated
    public static final String CHATMESSAGEID = "chatMessageId";
    @Deprecated
    public static final String CHATMESSAGETIMESTAMP = "chatMessageTimestamp";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS InteractionMessages(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    feedRowId INTEGER NOT NULL,\n    messageType INTEGER NOT NULL,\n    messageClientStatus INTEGER NOT NULL,\n    messageBodyType INTEGER NOT NULL,\n    senderId INTEGER,\n\n    chatMessageId TEXT,\n    chatMessageTimestamp INTEGER,\n    mischiefUpdateMessageType INTEGER,\n\n    snapId TEXT,\n    hasSound INTEGER DEFAULT 0,\n    -- indicates the original sent/received interactionTimestamp\n    -- should be used for displaying purpose, since silent messages such as read receipts should not be displayed on ff\n    snapMessageTimestamp INTEGER,\n    -- indicates the most recent sending/sent/received/viewed/screenshot/replay interaction\n    -- should be used for recency-based interaction messages ranking\n    interactionTimestamp INTEGER,\n    latestScreenshottedOrReplayed TEXT,\n\n    UNIQUE(feedRowId, messageType)\n)";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String HASSOUND = "hasSound";
    @Deprecated
    public static final String INTERACTIONTIMESTAMP = "interactionTimestamp";
    @Deprecated
    public static final String LATESTSCREENSHOTTEDORREPLAYED = "latestScreenshottedOrReplayed";
    @Deprecated
    public static final String MESSAGEBODYTYPE = "messageBodyType";
    @Deprecated
    public static final String MESSAGECLIENTSTATUS = "messageClientStatus";
    @Deprecated
    public static final String MESSAGETYPE = "messageType";
    @Deprecated
    public static final String MISCHIEFUPDATEMESSAGETYPE = "mischiefUpdateMessageType";
    @Deprecated
    public static final String SENDERID = "senderId";
    @Deprecated
    public static final String SNAPID = "snapId";
    @Deprecated
    public static final String SNAPMESSAGETIMESTAMP = "snapMessageTimestamp";
    @Deprecated
    public static final String TABLE_NAME = "InteractionMessages";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends InteractionMessagesModel> {
        T create(long j, long j2, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState);
    }

    public interface GetInteractionMessagesCreator<T extends GetInteractionMessagesModel> {
        T create(long j, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, FriendLinkType friendLinkType);
    }

    public interface GetNewContentInteractionMessagesCreator<T extends GetNewContentInteractionMessagesModel> {
        T create(long j, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState);
    }

    public interface GetNewContentInteractionMessagesModel {
        String chatMessageId();

        Long chatMessageTimestamp();

        long feedRowId();

        Boolean hasSound();

        Long interactionTimestamp();

        ScreenshottedOrReplayedState latestScreenshottedOrReplayed();

        LocalMessageBodyType messageBodyType();

        MessageClientStatus messageClientStatus();

        InteractionMessageType messageType();

        aetf mischiefUpdateMessageType();

        Long senderId();

        String snapId();

        Long snapMessageTimestamp();
    }

    public interface GetInteractionMessagesModel {
        byte[] authToken();

        String chatMessageId();

        Long chatMessageTimestamp();

        long feedRowId();

        FriendLinkType friendLinkType();

        Boolean hasSound();

        Long interactionTimestamp();

        ScreenshottedOrReplayedState latestScreenshottedOrReplayed();

        LocalMessageBodyType messageBodyType();

        MessageClientStatus messageClientStatus();

        InteractionMessageType messageType();

        aetf mischiefUpdateMessageType();

        Long senderId();

        String snapId();

        Long snapMessageTimestamp();
    }

    public static final class Factory<T extends InteractionMessagesModel> {
        public final Creator<T> creator;
        public final ainu<ScreenshottedOrReplayedState, String> latestScreenshottedOrReplayedAdapter;
        public final ainu<LocalMessageBodyType, Long> messageBodyTypeAdapter;
        public final ainu<MessageClientStatus, Long> messageClientStatusAdapter;
        public final ainu<InteractionMessageType, Long> messageTypeAdapter;
        public final ainu<aetf, Long> mischiefUpdateMessageTypeAdapter;

        final class GetNewContentInteractionMessagesQuery extends ainx {
            private final LocalMessageBodyType[] messageBodyType;

            GetNewContentInteractionMessagesQuery(LocalMessageBodyType[] localMessageBodyTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    InteractionMessages.feedRowId,\n    InteractionMessages.messageType,\n    InteractionMessages.messageClientStatus,\n    InteractionMessages.messageBodyType,\n    InteractionMessages.senderId,\n\n    InteractionMessages.chatMessageId,\n    InteractionMessages.chatMessageTimestamp,\n    InteractionMessages.mischiefUpdateMessageType,\n\n    InteractionMessages.snapId,\n    InteractionMessages.hasSound,\n    InteractionMessages.snapMessageTimestamp,\n    InteractionMessages.interactionTimestamp,\n    InteractionMessages.latestScreenshottedOrReplayed\nFROM InteractionMessages\nINNER JOIN Feed\n    ON InteractionMessages.feedRowId = Feed._id\n-- RECEIVED_NOT_VIEWED_SNAP_WITH_SOUND(2)\n-- RECEIVED_NOT_VIEWED_SNAP_WITH_NO_SOUND(3)\n-- RECEIVED_NOT_VIEWED_CHAT(5)\n-- RECEIVED_NOT_VIEWED_UPDATE_MESSAGE(7)\nWHERE InteractionMessages.messageType IN (2, 3, 5, 7)\nAND InteractionMessages.messageBodyType NOT IN ");
                stringBuilder.append(ainz.a(localMessageBodyTypeArr.length));
                stringBuilder.append("\nGROUP BY Feed._id");
                super(stringBuilder.toString(), new aioa(InteractionMessagesModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.messageBodyType = localMessageBodyTypeArr;
            }

            public final void bindTo(pc pcVar) {
                LocalMessageBodyType[] localMessageBodyTypeArr = this.messageBodyType;
                int length = localMessageBodyTypeArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, ((Long) Factory.this.messageBodyTypeAdapter.encode(localMessageBodyTypeArr[i2])).longValue());
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetInteractionMessagesQuery extends ainx {
            private final long[] feedRowId;

            GetInteractionMessagesQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    InteractionMessages.feedRowId,\n    InteractionMessages.messageType,\n    InteractionMessages.messageClientStatus,\n    InteractionMessages.messageBodyType,\n    InteractionMessages.senderId,\n\n    InteractionMessages.chatMessageId,\n    InteractionMessages.chatMessageTimestamp,\n    InteractionMessages.mischiefUpdateMessageType,\n\n    InteractionMessages.snapId,\n    InteractionMessages.hasSound,\n    InteractionMessages.snapMessageTimestamp,\n    InteractionMessages.interactionTimestamp,\n    InteractionMessages.latestScreenshottedOrReplayed,\n\n    Feed.authToken,\n    Friend.friendLinkType\nFROM InteractionMessages\nJOIN Feed ON InteractionMessages.feedRowId = Feed._id\nLEFT JOIN Friend ON Feed.friendRowId = Friend._id\nWHERE InteractionMessages.feedRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(InteractionMessagesModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.feedRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.feedRowId;
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

        final class GetNewContentFeedPositionQuery extends ainx {
            private final LocalMessageBodyType[] messageBodyType;

            GetNewContentFeedPositionQuery(LocalMessageBodyType[] localMessageBodyTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT COUNT(*)\nFROM FriendsFeedView\nWHERE FriendsFeedView.score >\n(\n    SELECT MAX(FriendsFeedScore.score)\n    FROM Feed\n    LEFT OUTER JOIN InteractionMessages ON Feed._id = InteractionMessages.feedRowId\n    LEFT OUTER JOIN FriendsFeedScore ON InteractionMessages.feedRowId = FriendsFeedScore.feedRowId\n    WHERE InteractionMessages.messageType IN (2, 3, 5, 7)\n    AND InteractionMessages.messageBodyType NOT IN ");
                stringBuilder.append(ainz.a(localMessageBodyTypeArr.length));
                stringBuilder.append("\n    ORDER BY FriendsFeedScore.score DESC\n)");
                super(stringBuilder.toString(), new aioa(FeedModel.TABLE_NAME, FriendModel.TABLE_NAME, StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME, FriendsFeedScoreModel.TABLE_NAME, InteractionMessagesModel.TABLE_NAME));
                this.messageBodyType = localMessageBodyTypeArr;
            }

            public final void bindTo(pc pcVar) {
                LocalMessageBodyType[] localMessageBodyTypeArr = this.messageBodyType;
                int i = 1;
                if (localMessageBodyTypeArr != null) {
                    int length = localMessageBodyTypeArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindLong(i, ((Long) Factory.this.messageBodyTypeAdapter.encode(localMessageBodyTypeArr[i2])).longValue());
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(1);
            }
        }

        public Factory(Creator<T> creator, ainu<InteractionMessageType, Long> ainu, ainu<MessageClientStatus, Long> ainu2, ainu<LocalMessageBodyType, Long> ainu3, ainu<aetf, Long> ainu4, ainu<ScreenshottedOrReplayedState, String> ainu5) {
            this.creator = creator;
            this.messageTypeAdapter = ainu;
            this.messageClientStatusAdapter = ainu2;
            this.messageBodyTypeAdapter = ainu3;
            this.mischiefUpdateMessageTypeAdapter = ainu4;
            this.latestScreenshottedOrReplayedAdapter = ainu5;
        }

        public final ainx getInteractionMessages(long[] jArr) {
            return new GetInteractionMessagesQuery(jArr);
        }

        public final <R extends GetInteractionMessagesModel, T2 extends FriendModel> GetInteractionMessagesMapper<R, T, T2> getInteractionMessagesMapper(GetInteractionMessagesCreator<R> getInteractionMessagesCreator, com.snap.core.db.record.FriendModel.Factory<T2> factory) {
            return new GetInteractionMessagesMapper(getInteractionMessagesCreator, this, factory);
        }

        public final ainx getNewContentFeedPosition(LocalMessageBodyType[] localMessageBodyTypeArr) {
            return new GetNewContentFeedPositionQuery(localMessageBodyTypeArr);
        }

        public final ainw<Long> getNewContentFeedPositionMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getNewContentInteractionMessages(LocalMessageBodyType[] localMessageBodyTypeArr) {
            return new GetNewContentInteractionMessagesQuery(localMessageBodyTypeArr);
        }

        public final <R extends GetNewContentInteractionMessagesModel> GetNewContentInteractionMessagesMapper<R, T> getNewContentInteractionMessagesMapper(GetNewContentInteractionMessagesCreator<R> getNewContentInteractionMessagesCreator) {
            return new GetNewContentInteractionMessagesMapper(getNewContentInteractionMessagesCreator, this);
        }
    }

    public static final class GetInteractionMessagesMapper<T extends GetInteractionMessagesModel, T1 extends InteractionMessagesModel, T2 extends FriendModel> implements ainw<T> {
        private final GetInteractionMessagesCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;
        private final Factory<T1> interactionMessagesModelFactory;

        public GetInteractionMessagesMapper(GetInteractionMessagesCreator<T> getInteractionMessagesCreator, Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = getInteractionMessagesCreator;
            this.interactionMessagesModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetInteractionMessagesCreator getInteractionMessagesCreator = this.creator;
            long j = cursor2.getLong(0);
            InteractionMessageType interactionMessageType = (InteractionMessageType) this.interactionMessagesModelFactory.messageTypeAdapter.decode(Long.valueOf(cursor2.getLong(1)));
            MessageClientStatus messageClientStatus = (MessageClientStatus) this.interactionMessagesModelFactory.messageClientStatusAdapter.decode(Long.valueOf(cursor2.getLong(2)));
            LocalMessageBodyType localMessageBodyType = (LocalMessageBodyType) this.interactionMessagesModelFactory.messageBodyTypeAdapter.decode(Long.valueOf(cursor2.getLong(3)));
            Long valueOf = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            String string = cursor2.isNull(5) ? null : cursor2.getString(5);
            Long valueOf2 = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            aetf aetf = cursor2.isNull(7) ? null : (aetf) this.interactionMessagesModelFactory.mischiefUpdateMessageTypeAdapter.decode(Long.valueOf(cursor2.getLong(7)));
            String string2 = cursor2.isNull(8) ? null : cursor2.getString(8);
            if (cursor2.isNull(9)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            return getInteractionMessagesCreator.create(j, interactionMessageType, messageClientStatus, localMessageBodyType, valueOf, string, valueOf2, aetf, string2, bool, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)), cursor2.isNull(12) ? null : (ScreenshottedOrReplayedState) this.interactionMessagesModelFactory.latestScreenshottedOrReplayedAdapter.decode(cursor2.getString(12)), cursor2.isNull(13) ? null : cursor2.getBlob(13), cursor2.isNull(14) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(14))));
        }
    }

    public static final class GetNewContentInteractionMessagesMapper<T extends GetNewContentInteractionMessagesModel, T1 extends InteractionMessagesModel> implements ainw<T> {
        private final GetNewContentInteractionMessagesCreator<T> creator;
        private final Factory<T1> interactionMessagesModelFactory;

        public GetNewContentInteractionMessagesMapper(GetNewContentInteractionMessagesCreator<T> getNewContentInteractionMessagesCreator, Factory<T1> factory) {
            this.creator = getNewContentInteractionMessagesCreator;
            this.interactionMessagesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetNewContentInteractionMessagesCreator getNewContentInteractionMessagesCreator = this.creator;
            long j = cursor2.getLong(0);
            InteractionMessageType interactionMessageType = (InteractionMessageType) this.interactionMessagesModelFactory.messageTypeAdapter.decode(Long.valueOf(cursor2.getLong(1)));
            MessageClientStatus messageClientStatus = (MessageClientStatus) this.interactionMessagesModelFactory.messageClientStatusAdapter.decode(Long.valueOf(cursor2.getLong(2)));
            LocalMessageBodyType localMessageBodyType = (LocalMessageBodyType) this.interactionMessagesModelFactory.messageBodyTypeAdapter.decode(Long.valueOf(cursor2.getLong(3)));
            Long valueOf = cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4));
            String string = cursor2.isNull(5) ? null : cursor2.getString(5);
            Long valueOf2 = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            aetf aetf = cursor2.isNull(7) ? null : (aetf) this.interactionMessagesModelFactory.mischiefUpdateMessageTypeAdapter.decode(Long.valueOf(cursor2.getLong(7)));
            String string2 = cursor2.isNull(8) ? null : cursor2.getString(8);
            if (cursor2.isNull(9)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            return getNewContentInteractionMessagesCreator.create(j, interactionMessageType, messageClientStatus, localMessageBodyType, valueOf, string, valueOf2, aetf, string2, bool, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)), cursor2.isNull(12) ? null : (ScreenshottedOrReplayedState) this.interactionMessagesModelFactory.latestScreenshottedOrReplayedAdapter.decode(cursor2.getString(12)));
        }
    }

    public static final class DeleteInteractionMessage extends ainy {
        private final Factory<? extends InteractionMessagesModel> interactionMessagesModelFactory;

        public DeleteInteractionMessage(pa paVar, Factory<? extends InteractionMessagesModel> factory) {
            super(InteractionMessagesModel.TABLE_NAME, paVar.a("DELETE FROM InteractionMessages\nWHERE feedRowId = ?1 AND messageType = ?2"));
            this.interactionMessagesModelFactory = factory;
        }

        public final void bind(long j, InteractionMessageType interactionMessageType) {
            bindLong(1, j);
            bindLong(2, ((Long) this.interactionMessagesModelFactory.messageTypeAdapter.encode(interactionMessageType)).longValue());
        }
    }

    public static final class SetInteractionMessage extends ainy {
        private final Factory<? extends InteractionMessagesModel> interactionMessagesModelFactory;

        public SetInteractionMessage(pa paVar, Factory<? extends InteractionMessagesModel> factory) {
            super(InteractionMessagesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO InteractionMessages(\n    feedRowId,\n    messageType,\n    messageClientStatus,\n    messageBodyType,\n    senderId,\n\n    chatMessageId,\n    chatMessageTimestamp,\n    mischiefUpdateMessageType,\n\n    snapId,\n    hasSound,\n    snapMessageTimestamp,\n    interactionTimestamp,\n    latestScreenshottedOrReplayed\n)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.interactionMessagesModelFactory = factory;
        }

        public final void bind(long j, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
            bindLong(1, j);
            bindLong(2, ((Long) this.interactionMessagesModelFactory.messageTypeAdapter.encode(interactionMessageType)).longValue());
            bindLong(3, ((Long) this.interactionMessagesModelFactory.messageClientStatusAdapter.encode(messageClientStatus)).longValue());
            bindLong(4, ((Long) this.interactionMessagesModelFactory.messageBodyTypeAdapter.encode(localMessageBodyType)).longValue());
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
            if (str == null) {
                bindNull(6);
            } else {
                bindString(6, str);
            }
            if (l2 == null) {
                bindNull(7);
            } else {
                bindLong(7, l2.longValue());
            }
            if (aetf == null) {
                bindNull(8);
            } else {
                bindLong(8, ((Long) this.interactionMessagesModelFactory.mischiefUpdateMessageTypeAdapter.encode(aetf)).longValue());
            }
            if (str2 == null) {
                bindNull(9);
            } else {
                bindString(9, str2);
            }
            if (bool == null) {
                bindNull(10);
            } else {
                bindLong(10, bool.booleanValue() ? 1 : 0);
            }
            if (l3 == null) {
                bindNull(11);
            } else {
                bindLong(11, l3.longValue());
            }
            if (l4 == null) {
                bindNull(12);
            } else {
                bindLong(12, l4.longValue());
            }
            if (screenshottedOrReplayedState == null) {
                bindNull(13);
            } else {
                bindString(13, (String) this.interactionMessagesModelFactory.latestScreenshottedOrReplayedAdapter.encode(screenshottedOrReplayedState));
            }
        }
    }

    public static final class Mapper<T extends InteractionMessagesModel> implements ainw<T> {
        private final Factory<T> interactionMessagesModelFactory;

        public Mapper(Factory<T> factory) {
            this.interactionMessagesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            String str;
            Boolean bool;
            Long l;
            ScreenshottedOrReplayedState screenshottedOrReplayedState;
            Cursor cursor2 = cursor;
            Creator creator = this.interactionMessagesModelFactory.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            InteractionMessageType interactionMessageType = (InteractionMessageType) this.interactionMessagesModelFactory.messageTypeAdapter.decode(Long.valueOf(cursor2.getLong(2)));
            MessageClientStatus messageClientStatus = (MessageClientStatus) this.interactionMessagesModelFactory.messageClientStatusAdapter.decode(Long.valueOf(cursor2.getLong(3)));
            LocalMessageBodyType localMessageBodyType = (LocalMessageBodyType) this.interactionMessagesModelFactory.messageBodyTypeAdapter.decode(Long.valueOf(cursor2.getLong(4)));
            Long valueOf = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            String string = cursor2.isNull(6) ? null : cursor2.getString(6);
            Long valueOf2 = cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7));
            aetf aetf = cursor2.isNull(8) ? null : (aetf) this.interactionMessagesModelFactory.mischiefUpdateMessageTypeAdapter.decode(Long.valueOf(cursor2.getLong(8)));
            String string2 = cursor2.isNull(9) ? null : cursor2.getString(9);
            if (cursor2.isNull(10)) {
                str = string2;
                bool = null;
            } else {
                str = string2;
                bool = Boolean.valueOf(cursor2.getInt(10) == 1);
            }
            Long valueOf3 = cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11));
            Long valueOf4 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            if (cursor2.isNull(13)) {
                l = valueOf3;
                screenshottedOrReplayedState = null;
            } else {
                l = valueOf3;
                screenshottedOrReplayedState = (ScreenshottedOrReplayedState) this.interactionMessagesModelFactory.latestScreenshottedOrReplayedAdapter.decode(cursor2.getString(13));
            }
            return creator.create(j, j2, interactionMessageType, messageClientStatus, localMessageBodyType, valueOf, string, valueOf2, aetf, str, bool, l, valueOf4, screenshottedOrReplayedState);
        }
    }

    public static final class DeleteAllInteractionMessages extends ainy {
        public DeleteAllInteractionMessages(pa paVar) {
            super(InteractionMessagesModel.TABLE_NAME, paVar.a("DELETE FROM InteractionMessages"));
        }
    }

    public static final class DeleteAllInteractionsForFeedEntry extends ainy {
        public DeleteAllInteractionsForFeedEntry(pa paVar) {
            super(InteractionMessagesModel.TABLE_NAME, paVar.a("DELETE FROM InteractionMessages\nWHERE feedRowId = ?1"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    long _id();

    String chatMessageId();

    Long chatMessageTimestamp();

    long feedRowId();

    Boolean hasSound();

    Long interactionTimestamp();

    ScreenshottedOrReplayedState latestScreenshottedOrReplayed();

    LocalMessageBodyType messageBodyType();

    MessageClientStatus messageClientStatus();

    InteractionMessageType messageType();

    aetf mischiefUpdateMessageType();

    Long senderId();

    String snapId();

    Long snapMessageTimestamp();
}

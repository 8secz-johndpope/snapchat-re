package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.SnappableLensMetadata;
import defpackage.aesg;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gcp;
import defpackage.pa;
import defpackage.pc;

public interface MessagingSnapModel {
    public static final String ADDDIRECTDOWNLOADURLMETADATA = "ALTER TABLE MessagingSnap\nADD COLUMN directDownloadUrl TEXT";
    public static final String ADDGEOFILTERMETADATA = "ALTER TABLE MessagingSnap\nADD COLUMN geofilterMetadata TEXT";
    public static final String ADDREPLYMEDIA = "ALTER TABLE MessagingSnap\nADD replyMedia TEXT";
    public static final String ADDSNAPPABLELENSMETADATA = "ALTER TABLE MessagingSnap\nADD COLUMN snappableLensMetadata TEXT";
    public static final String ADDVIEWERLIST = "ALTER TABLE MessagingSnap\nADD COLUMN viewerList TEXT";
    @Deprecated
    public static final String BROADCAST = "broadcast";
    @Deprecated
    public static final String BROADCASTHIDETIMER = "broadcastHideTimer";
    @Deprecated
    public static final String BROADCASTSECONDARYTEXT = "broadcastSecondaryText";
    @Deprecated
    public static final String BROADCASTURL = "broadcastUrl";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS MessagingSnap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    snapRowId INTEGER NOT NULL REFERENCES Snap(_id) ON DELETE CASCADE,\n\n    messageRowId INTEGER NOT NULL REFERENCES Message(_id) ON DELETE CASCADE,\n    feedRowId INTEGER REFERENCES Feed(_id) ON DELETE CASCADE,\n\n    serverStatus TEXT,\n    secondaryTimestamp INTEGER,\n\n    pendingDeliveredTimestamp INTEGER,\n    orientation INTEGER,\n    sendStartTimestamp INTEGER,\n\n    -- interactions including screenshot/replay --\n    lastInteractionTimestamp INTEGER,\n    screenshottedOrReplayed TEXT,\n    -- list of friendRowId --\n    viewerList TEXT,\n\n    senderId INTEGER,\n\n    broadcast INTEGER,\n    broadcastUrl TEXT,\n    broadcastSecondaryText TEXT,\n    broadcastHideTimer INTEGER,\n\n    esId TEXT,\n    egData TEXT,\n\n    replyMedia TEXT,\n\n    -- metadata for geofilter analytics\n    geofilterMetadata TEXT,\n\n    -- metadata for Snappable lenses\n    snappableLensMetadata TEXT,\n\n    directDownloadUrl TEXT\n)";
    @Deprecated
    public static final String DIRECTDOWNLOADURL = "directDownloadUrl";
    @Deprecated
    public static final String EGDATA = "egData";
    @Deprecated
    public static final String ESID = "esId";
    @Deprecated
    public static final String FEEDROWID = "feedRowId";
    @Deprecated
    public static final String GEOFILTERMETADATA = "geofilterMetadata";
    @Deprecated
    public static final String LASTINTERACTIONTIMESTAMP = "lastInteractionTimestamp";
    @Deprecated
    public static final String MESSAGEROWID = "messageRowId";
    @Deprecated
    public static final String ORIENTATION = "orientation";
    @Deprecated
    public static final String PENDINGDELIVEREDTIMESTAMP = "pendingDeliveredTimestamp";
    @Deprecated
    public static final String REPLYMEDIA = "replyMedia";
    @Deprecated
    public static final String SCREENSHOTTEDORREPLAYED = "screenshottedOrReplayed";
    @Deprecated
    public static final String SECONDARYTIMESTAMP = "secondaryTimestamp";
    @Deprecated
    public static final String SENDERID = "senderId";
    @Deprecated
    public static final String SENDSTARTTIMESTAMP = "sendStartTimestamp";
    @Deprecated
    public static final String SERVERSTATUS = "serverStatus";
    @Deprecated
    public static final String SNAPPABLELENSMETADATA = "snappableLensMetadata";
    @Deprecated
    public static final String SNAPROWID = "snapRowId";
    @Deprecated
    public static final String TABLE_NAME = "MessagingSnap";
    @Deprecated
    public static final String VIEWERLIST = "viewerList";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends MessagingSnapModel> {
        T create(long j, long j2, long j3, Long l, SnapServerStatus snapServerStatus, Long l2, Long l3, Integer num, Long l4, Long l5, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str, Long l6, Boolean bool, String str2, String str3, Boolean bool2, String str4, String str5, ReplyMedia replyMedia, GeofilterMetadata geofilterMetadata, SnappableLensMetadata snappableLensMetadata, aesg aesg);
    }

    public interface GetPlayablePendingSnapsForFeedCreator<T extends GetPlayablePendingSnapsForFeedModel> {
        T create(long j, long j2, FeedKind feedKind, String str, gcp gcp, String str2, String str3, String str4, long j3, boolean z, long j4, String str5, Boolean bool, String str6, String str7, String str8, String str9, aesg aesg, GeofilterMetadata geofilterMetadata);
    }

    public interface GetSnapInfoForIdCreator<T extends GetSnapInfoForIdModel> {
        T create(String str, gcp gcp, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2);
    }

    public interface GetSnapInfoBySnapRowIDCreator<T extends GetSnapInfoBySnapRowIDModel> {
        T create(String str, long j, String str2, String str3);
    }

    public interface GetSnapsForFeedCreator<T extends GetSnapsForFeedModel> {
        T create(String str, SnapServerStatus snapServerStatus, String str2, long j);
    }

    public interface GetSnapMetadataForSnapIdCreator<T extends GetSnapMetadataForSnapIdModel> {
        T create(String str, gcp gcp, Long l, Long l2, GeofilterMetadata geofilterMetadata, SnappableLensMetadata snappableLensMetadata, String str2, FeedKind feedKind, String str3, long j);
    }

    public interface GetSnapIdInfoForMessageIdCreator<T extends GetSnapIdInfoForMessageIdModel> {
        T create(String str, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2, String str3, Long l);
    }

    public interface GetGroupSnapInfoCreator<T extends GetGroupSnapInfoModel> {
        T create(String str, SnapServerStatus snapServerStatus, Long l, ScreenshottedOrReplayedState screenshottedOrReplayedState);
    }

    public interface GetDirectSnapInfoBySnapRowIDCreator<T extends GetDirectSnapInfoBySnapRowIDModel> {
        T create(Long l, String str, String str2, Long l2, Long l3, long j, gcp gcp, boolean z, long j2, FeedKind feedKind, String str3);
    }

    public interface GetLastSentSnapCreator<T extends GetLastSentSnapModel> {
        T create(Long l, Long l2, String str, gcp gcp, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, FriendLinkType friendLinkType);
    }

    public interface GetLastReceivedSnapCreator<T extends GetLastReceivedSnapModel> {
        T create(Long l, Long l2, String str, gcp gcp, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState);
    }

    public interface GetGroupSnapsOlderThanTimestampCreator<T extends GetGroupSnapsOlderThanTimestampModel> {
        T create(String str, SnapServerStatus snapServerStatus, long j, long j2);
    }

    public interface GetDirectSnapsOlderThanTimestampCreator<T extends GetDirectSnapsOlderThanTimestampModel> {
        T create(String str, long j);
    }

    public interface SnapDumpCreator<T extends SnapDumpModel> {
        T create(String str, String str2, Long l, String str3, gcp gcp, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l2);
    }

    public interface GetReplyMediaInfoForSnapRowIdCreator<T extends GetReplyMediaInfoForSnapRowIdModel> {
        T create(String str, ReplyMedia replyMedia, String str2);
    }

    public interface GetPlayableSnapsByMessageRowIdCreator<T extends GetPlayableSnapsByMessageRowIdModel> {
        T create(String str, long j, String str2, String str3, String str4, gcp gcp, String str5, long j2, Boolean bool, boolean z, Long l, String str6, String str7, String str8, GeofilterMetadata geofilterMetadata, FeedKind feedKind);
    }

    public interface GetDownloadInfoForDirectSnapsCreator<T extends GetDownloadInfoForDirectSnapsModel> {
        T create(String str, String str2, String str3, String str4, aesg aesg);
    }

    public interface GetAllMessagingSnapsCreator<T extends GetAllMessagingSnapsModel> {
        T create(long j, long j2, long j3, FeedKind feedKind, String str, String str2, gcp gcp, String str3, String str4, String str5, long j4, boolean z, long j5, String str6, Boolean bool, String str7, String str8, String str9, String str10, aesg aesg, GeofilterMetadata geofilterMetadata, SnapServerStatus snapServerStatus, MessageClientStatus messageClientStatus, Long l, ReplyMedia replyMedia, String str11, ScreenshottedOrReplayedState screenshottedOrReplayedState, boolean z2, SnappableLensMetadata snappableLensMetadata, Long l2);
    }

    public static final class Factory<T extends MessagingSnapModel> {
        public final Creator<T> creator;
        public final ainu<aesg, String> directDownloadUrlAdapter;
        public final ainu<GeofilterMetadata, String> geofilterMetadataAdapter;
        public final ainu<ReplyMedia, String> replyMediaAdapter;
        public final ainu<ScreenshottedOrReplayedState, String> screenshottedOrReplayedAdapter;
        public final ainu<SnapServerStatus, String> serverStatusAdapter;
        public final ainu<SnappableLensMetadata, String> snappableLensMetadataAdapter;

        final class GetLastReceivedSnapQuery extends ainx {
            private final Long[] feedRowId;
            private final SnapServerStatus[] serverStatus;
            private final com.snap.core.db.record.SnapModel.Factory<? extends SnapModel> snapModelFactory;
            private final gcp[] snapType;
            private final String username;

            GetLastReceivedSnapQuery(com.snap.core.db.record.SnapModel.Factory<? extends SnapModel> factory, String str, SnapServerStatus[] snapServerStatusArr, gcp[] gcpArr, Long[] lArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        MessagingSnap.feedRowId,\n        MessagingSnap.senderId,\n        Snap.snapId,\n        Snap.snapType, -- com.snap.core.model.SnapType\n        Snap.timestamp AS messageTimestamp, -- received timestamp\n        MAX(ifnull(MessagingSnap.lastInteractionTimestamp, 0), Snap.timestamp) AS interactionTimestamp, -- last received/viewed/screenshot/replay timestamp\n        MessagingSnap.serverStatus, -- com.snap.core.db.column.SnapServerStatus\n        MessagingSnap.screenshottedOrReplayed\n    FROM MessagingSnap\n    JOIN Message ON MessagingSnap.messageRowId = Message._id -- require this join same as getPlayablePendingSnapsForFeed\n    JOIN Friend ON MessagingSnap.senderId = Friend._id\n    JOIN Snap ON MessagingSnap.snapRowId = Snap._id\n    JOIN Feed ON Feed._id = MessagingSnap.feedRowId\n    WHERE\n    -- sender's username != {myUsername}\n    Friend.username != ?1\n    AND MessagingSnap.serverStatus IN ");
                stringBuilder.append(ainz.a(snapServerStatusArr.length));
                stringBuilder.append("\n    AND Snap.snapId IS NOT NULL\n    AND Snap.snapType IN ");
                stringBuilder.append(ainz.a(gcpArr.length));
                stringBuilder.append("\n    AND MessagingSnap.feedRowId IN ");
                stringBuilder.append(ainz.a(lArr.length));
                stringBuilder.append("\n    ORDER BY MessagingSnap.feedRowId, MAX(ifnull(MessagingSnap.lastInteractionTimestamp, 0), Snap.timestamp) ASC\n) GROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessagingSnapModel.TABLE_NAME, MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.snapModelFactory = factory;
                this.username = str;
                this.serverStatus = snapServerStatusArr;
                this.snapType = gcpArr;
                this.feedRowId = lArr;
            }

            public final void bindTo(pc pcVar) {
                int length;
                int i;
                int i2;
                int i3;
                pcVar.bindString(1, this.username);
                SnapServerStatus[] snapServerStatusArr = this.serverStatus;
                int i4 = 0;
                if (snapServerStatusArr != null) {
                    length = snapServerStatusArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        i3 = i2 + 1;
                        pcVar.bindString(i2, (String) Factory.this.serverStatusAdapter.encode(snapServerStatusArr[i]));
                        i++;
                        i2 = i3;
                    }
                } else {
                    i2 = 3;
                    pcVar.bindNull(2);
                }
                gcp[] gcpArr = this.snapType;
                i = gcpArr.length;
                length = 0;
                while (length < i) {
                    i3 = i2 + 1;
                    pcVar.bindLong(i2, ((Long) this.snapModelFactory.snapTypeAdapter.encode(gcpArr[length])).longValue());
                    length++;
                    i2 = i3;
                }
                Long[] lArr = this.feedRowId;
                if (lArr != null) {
                    i = lArr.length;
                    while (i4 < i) {
                        int i5 = i2 + 1;
                        pcVar.bindLong(i2, lArr[i4].longValue());
                        i4++;
                        i2 = i5;
                    }
                    return;
                }
                pcVar.bindNull(i2);
            }
        }

        final class GetGroupSnapsOlderThanTimestampQuery extends ainx {
            private final SnapServerStatus[] serverStatus;
            private final long timestamp;

            GetGroupSnapsOlderThanTimestampQuery(long j, SnapServerStatus[] snapServerStatusArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT Snap.snapId, MessagingSnap.serverStatus, Snap.timestamp, Feed._id AS feedId\nFROM MessagingSnap\n    JOIN Snap ON MessagingSnap.snapRowId = Snap._id\n    JOIN Feed ON MessagingSnap.feedRowId = Feed._id\n-- is group\nWHERE Feed.kind = 1\n    -- Snap.timestamp <= {one day ago timestamp}\n    AND Snap.timestamp <= ?1\n    -- serverStatus = 'DELIVERED'\n    AND serverStatus IN ");
                stringBuilder.append(ainz.a(snapServerStatusArr.length));
                super(stringBuilder.toString(), new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.timestamp = j;
                this.serverStatus = snapServerStatusArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.timestamp);
                SnapServerStatus[] snapServerStatusArr = this.serverStatus;
                int i = 2;
                if (snapServerStatusArr != null) {
                    int length = snapServerStatusArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i + 1;
                        pcVar.bindString(i, (String) Factory.this.serverStatusAdapter.encode(snapServerStatusArr[i2]));
                        i2++;
                        i = i3;
                    }
                    return;
                }
                pcVar.bindNull(2);
            }
        }

        final class GetDirectSnapsOlderThanTimestampQuery extends ainx {
            private final long timestamp;

            GetDirectSnapsOlderThanTimestampQuery(long j) {
                super("SELECT Snap.snapId, Feed._id AS feedId\nFROM MessagingSnap\n    JOIN Snap ON MessagingSnap.snapRowId = Snap._id\n    JOIN Feed ON MessagingSnap.feedRowId = Feed._id\n-- is 1-1 chat\nWHERE Feed.kind = 0\n-- Snap.timestamp <= {31 days ago timestamp}\nAND Snap.timestamp <= ?1", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.timestamp = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.timestamp);
            }
        }

        final class DeleteMessagingSnapsQuery extends ainx {
            private final String[] snapId;

            DeleteMessagingSnapsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM MessagingSnap\nWHERE snapRowId IN (SELECT Snap._id FROM Snap WHERE Snap.snapId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append(")");
                super(stringBuilder.toString(), new aioa(MessagingSnapModel.TABLE_NAME));
                this.snapId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.snapId;
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

        final class GetDirectSnapInfoBySnapRowIDQuery extends ainx {
            private final long snapRowId;

            GetDirectSnapInfoBySnapRowIDQuery(long j) {
                super("SELECT\n    MessagingSnap.feedRowId,\n    Friend.displayName,\n    Friend.username,\n    Friend.score,\n    MessagingSnap.secondaryTimestamp,\n    Snap.timestamp,\n    Snap.snapType,\n    Snap.isInfiniteDuration,\n    Snap.durationInMs,\n    Feed.kind,\n    Feed.key AS feedKey\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId=Snap._id\nLEFT OUTER JOIN Friend ON MessagingSnap.senderId = Friend._id\nLEFT OUTER JOIN Feed ON feedRowId = Feed._id\nWHERE MessagingSnap.snapRowId = ?1", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.snapRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.snapRowId);
            }
        }

        final class GetDirectSnapInfoQuery extends ainx {
            private final String arg1;

            GetDirectSnapInfoQuery(String str) {
                super("SELECT\n    Friend.username,\n    MessagingSnap.serverStatus,\n    MessagingSnap.lastInteractionTimestamp,\n    MessagingSnap.screenshottedOrReplayed\nFROM MessagingSnap\nLEFT OUTER JOIN Friend ON MessagingSnap.senderId = Friend._id\nWHERE MessagingSnap.snapRowId = (SELECT Snap._id FROM Snap WHERE Snap.snapId LIKE ?1||'%')", new aioa(MessagingSnapModel.TABLE_NAME, FriendModel.TABLE_NAME, SnapModel.TABLE_NAME));
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

        final class GetDownloadInfoForDirectSnapsQuery extends ainx {
            private final long snapRowId;

            GetDownloadInfoForDirectSnapsQuery(long j) {
                super("SELECT\nSnap.snapId,\nSnap.mediaId,\nSnap.mediaIv,\nSnap.mediaKey,\nMessagingSnap.directDownloadUrl\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nWHERE snapRowId = ?1\n/* TODO remove this query with snap refactor. This limit is just here to prevent a crash that may have been introduced by the migration */\nLIMIT 1", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.snapRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.snapRowId);
            }
        }

        final class GetGroupSnapInfoQuery extends ainx {
            private final String key;

            GetGroupSnapInfoQuery(String str) {
                super("SELECT\n    Friend.username,\n    MessagingSnap.serverStatus,\n    MessagingSnap.lastInteractionTimestamp,\n    MessagingSnap.screenshottedOrReplayed\nFROM MessagingSnap\nLEFT OUTER JOIN Friend ON MessagingSnap.senderId = Friend._id\nWHERE MessagingSnap.messageRowId = (SELECT Message._id FROM Message WHERE Message.key = ?1)", new aioa(MessagingSnapModel.TABLE_NAME, FriendModel.TABLE_NAME, MessageModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        final class GetLastSentSnapQuery extends ainx {
            private final long[] _id;
            private final SnapServerStatus[] serverStatus;
            private final String username;

            GetLastSentSnapQuery(String str, SnapServerStatus[] snapServerStatusArr, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT *\nFROM (\n    SELECT\n        MessagingSnap.feedRowId,\n        MessagingSnap.senderId,\n        Snap.snapId,\n        Snap.snapType, -- com.snap.core.model.SnapType\n        Snap.timestamp AS messageTimestamp, -- sent timestamp\n        MAX(ifnull(MessagingSnap.lastInteractionTimestamp, 0), Snap.timestamp) AS interactionTimestamp,\n        MessagingSnap.serverStatus, -- com.snap.core.db.column.SnapServerStatus\n        MessagingSnap.screenshottedOrReplayed,\n        Feed.authToken,\n        Correspondent.friendLinkType\n    FROM MessagingSnap\n    JOIN Feed ON MessagingSnap.feedRowId = Feed._id\n    JOIN Snap ON MessagingSnap.snapRowId = Snap._id\n    JOIN Friend AS Self ON MessagingSnap.senderId = Self._id\n    -- left outer join because Feed.friendRowId is null for group chat --\n    LEFT OUTER JOIN Friend AS Correspondent ON Feed.friendRowId = Correspondent._id\n    WHERE\n        -- sender's username = {myUsername}\n        Self.username = ?1\n        AND MessagingSnap.serverStatus IN ");
                stringBuilder.append(ainz.a(snapServerStatusArr.length));
                stringBuilder.append("\n        AND Feed._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                stringBuilder.append("\n    ORDER BY MessagingSnap.feedRowId, MAX(ifnull(MessagingSnap.lastInteractionTimestamp, 0), Snap.timestamp) ASC\n) GROUP BY feedRowId");
                super(stringBuilder.toString(), new aioa(MessagingSnapModel.TABLE_NAME, FeedModel.TABLE_NAME, SnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.username = str;
                this.serverStatus = snapServerStatusArr;
                this._id = jArr;
            }

            public final void bindTo(pc pcVar) {
                int length;
                int i;
                int i2;
                pcVar.bindString(1, this.username);
                SnapServerStatus[] snapServerStatusArr = this.serverStatus;
                int i3 = 0;
                if (snapServerStatusArr != null) {
                    length = snapServerStatusArr.length;
                    i = 0;
                    i2 = 2;
                    while (i < length) {
                        int i4 = i2 + 1;
                        pcVar.bindString(i2, (String) Factory.this.serverStatusAdapter.encode(snapServerStatusArr[i]));
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

        final class GetPlayablePendingSnapsForFeedQuery extends ainx {
            private final Long feedRowId;
            private final SnapServerStatus serverStatus;
            private final String username;

            GetPlayablePendingSnapsForFeedQuery(Long l, SnapServerStatus snapServerStatus, String str) {
                super("SELECT\nmessageRowId,\nsnapRowId,\nFeed.kind,\nSnap.snapId,\nSnap.snapType,\nSnap.mediaUrl,\nSnap.mediaKey,\nSnap.mediaIv,\nSnap.durationInMs,\nSnap.isInfiniteDuration,\nSnap.timestamp,\nSnap.mediaId,\nSnap.zipped,\nSnap.attachmentUrl,\nSnap.cognacAttachmentUri,\nMessage.mediaId,\nFriend.username AS senderUsername,\ndirectDownloadUrl,\ngeofilterMetadata\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nJOIN Message ON MessagingSnap.messageRowId = Message._id\nJOIN Friend ON MessagingSnap.senderId = Friend._id\nLEFT OUTER JOIN Feed ON MessagingSnap.feedRowId = Feed._id\nWHERE MessagingSnap.feedRowId = ?1 AND serverStatus = ?2\nAND Snap.snapId IS NOT NULL\nAND MessagingSnap.senderId != (\n    SELECT Friend._id\n    FROM Friend\n    WHERE Friend.username = ?3\n)\nORDER BY Snap.timestamp ASC", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.feedRowId = l;
                this.serverStatus = snapServerStatus;
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.feedRowId;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                SnapServerStatus snapServerStatus = this.serverStatus;
                if (snapServerStatus != null) {
                    pcVar.bindString(2, (String) Factory.this.serverStatusAdapter.encode(snapServerStatus));
                } else {
                    pcVar.bindNull(2);
                }
                pcVar.bindString(3, this.username);
            }
        }

        final class GetPlayableSnapsByMessageRowIdQuery extends ainx {
            private final long[] messageRowId;

            GetPlayableSnapsByMessageRowIdQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\nSnap.snapId,\nSnap.timestamp,\nSnap.mediaId,\nSnap.mediaIv,\nSnap.mediaKey,\nSnap.snapType,\nSnap.mediaUrl,\nSnap.durationInMs,\nSnap.zipped,\nSnap.isInfiniteDuration,\nSnap.storyRowId,\nSnap.groupType,\nSnap.attachmentUrl,\nSnap.cognacAttachmentUri,\ngeofilterMetadata,\nFeed.kind\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nLEFT OUTER JOIN Feed ON MessagingSnap.feedRowId = Feed._id\nWHERE messageRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                stringBuilder.append("\nORDER BY timestamp ASC");
                super(stringBuilder.toString(), new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedModel.TABLE_NAME));
                this.messageRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.messageRowId;
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

        final class GetReplyMediaInfoForSnapRowIdQuery extends ainx {
            private final long snapRowId;

            GetReplyMediaInfoForSnapRowIdQuery(long j) {
                super("SELECT\nSnap.snapId,\nMessagingSnap.replyMedia,\nMessage.key\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nJOIN Message ON messageRowId = Message._id\nWHERE snapRowId = ?1\n/* TODO remove this query with snap refactor. This limit is just here to prevent a crash that may have been introduced by the migration */\nLIMIT 1", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MessageModel.TABLE_NAME));
                this.snapRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.snapRowId);
            }
        }

        final class GetServerStatusForSnapIdQuery extends ainx {
            private final String arg1;

            GetServerStatusForSnapIdQuery(String str) {
                super("SELECT\nserverStatus\nFROM MessagingSnap\nWHERE snapRowId = (SELECT Snap._id FROM Snap WHERE Snap.snapId LIKE ?1||'%')", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
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

        final class GetSnapIdInfoForMessageIdQuery extends ainx {
            private final String arg1;

            GetSnapIdInfoForMessageIdQuery(String str) {
                super("SELECT\nSnap.snapId,\nMessagingSnap.screenshottedOrReplayed,\nMessage.key,\nMessage.mediaId,\nMessage.sequenceNumber\nFROM MessagingSnap\nJOIN Message ON messageRowId = Message._id\nJOIN Snap ON MessagingSnap.snapRowId=Snap._id\nWHERE Snap.snapId LIKE ?1||'%'", new aioa(MessagingSnapModel.TABLE_NAME, MessageModel.TABLE_NAME, SnapModel.TABLE_NAME));
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

        final class GetSnapInfoBySnapRowIDQuery extends ainx {
            private final long snapRowId;

            GetSnapInfoBySnapRowIDQuery(long j) {
                super("SELECT\n    Snap.snapId,\n    Snap.timestamp,\n    Snap.attachmentUrl,\n    Friend.username\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId=Snap._id\nJOIN Friend ON MessagingSnap.senderId = Friend._id\nWHERE MessagingSnap.snapRowId = ?1", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.snapRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.snapRowId);
            }
        }

        final class GetSnapInfoForIdQuery extends ainx {
            private final String arg1;
            private final Long feedRowId;

            GetSnapInfoForIdQuery(String str, Long l) {
                super("SELECT\nSnap.snapId,\nSnap.snapType,\nMessagingSnap.screenshottedOrReplayed,\nMessagingSnap.esId\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nWHERE MessagingSnap.snapRowId = (SELECT Snap._id FROM Snap WHERE Snap.snapId LIKE ?1||'%')\nAND MessagingSnap.feedRowId = ?2", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.arg1 = str;
                this.feedRowId = l;
            }

            public final void bindTo(pc pcVar) {
                String str = this.arg1;
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

        final class GetSnapMetadataForSnapIdQuery extends ainx {
            private final String snapId;

            GetSnapMetadataForSnapIdQuery(String str) {
                super("SELECT\nSnap.snapId,\nSnap.snapType,\nMessagingSnap.senderId,\nMessagingSnap.feedRowId,\nMessagingSnap.geofilterMetadata,\nMessagingSnap.snappableLensMetadata,\nFeed.key AS conversationId,\nFeed.kind,\nFriend.username AS senderUsername,\nSnap.durationInMs\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nJOIN Feed ON MessagingSnap.feedRowId = Feed._id\nJOIN Friend ON MessagingSnap.senderId = Friend._id\nWHERE Snap.snapId = ?1\n/* TODO remove this query with snap refactor. This limit is just here to prevent a crash that may have been introduced by the migration */\nLIMIT 1", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.snapId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.snapId);
            }
        }

        final class GetSnapsForFeedQuery extends ainx {
            private final long _id;

            GetSnapsForFeedQuery(long j) {
                super("SELECT\n    Snap.snapId,\n    MessagingSnap.serverStatus,\n    Friend.username,\n    Snap.timestamp\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId=Snap._id\nJOIN Feed ON MessagingSnap.feedRowId = Feed._id\nLEFT OUTER JOIN Friend ON MessagingSnap.senderId = Friend._id\nWHERE Feed._id = ?1\nORDER BY Snap.timestamp ASC", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetViewerListBySnapRowIdQuery extends ainx {
            private final long snapRowId;

            GetViewerListBySnapRowIdQuery(long j) {
                super("SELECT\nMessagingSnap.viewerList\nFROM\nMessagingSnap\nWHERE snapRowId = ?1\nLIMIT 1", new aioa(MessagingSnapModel.TABLE_NAME));
                this.snapRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.snapRowId);
            }
        }

        final class SnapDumpQuery extends ainx {
            private final Long feedRowId;

            SnapDumpQuery(Long l) {
                super("SELECT\nFeed.key AS conversationKey,\nSnap.snapId,\nSnap.timestamp,\nFriend.username AS senderUsername,\nSnap.snapType, -- com.snap.core.model.SnapType\nMessagingSnap.serverStatus, -- com.snap.core.db.column.SnapServerStatus\nMessagingSnap.screenshottedOrReplayed,\nMessagingSnap.lastInteractionTimestamp\nFROM MessagingSnap\nLEFT OUTER JOIN Friend ON MessagingSnap.senderId = Friend._id\nLEFT OUTER JOIN Snap ON MessagingSnap.snapRowId = Snap._id\nLEFT OUTER JOIN Feed ON MessagingSnap.feedRowId = Feed._id\nWHERE MessagingSnap.feedRowId = ?1\nORDER BY timestamp DESC", new aioa(MessagingSnapModel.TABLE_NAME, FriendModel.TABLE_NAME, SnapModel.TABLE_NAME, FeedModel.TABLE_NAME));
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

        final class UpdateSnapServerStatusBySnapIdsQuery extends ainx {
            private final SnapServerStatus serverStatus;
            private final String[] snapId;

            UpdateSnapServerStatusBySnapIdsQuery(SnapServerStatus snapServerStatus, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("UPDATE MessagingSnap\nSET serverStatus=?1\nWHERE snapRowId IN (SELECT Snap._id FROM Snap WHERE Snap.snapId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append(")");
                super(stringBuilder.toString(), new aioa(MessagingSnapModel.TABLE_NAME));
                this.serverStatus = snapServerStatus;
                this.snapId = strArr;
            }

            public final void bindTo(pc pcVar) {
                SnapServerStatus snapServerStatus = this.serverStatus;
                if (snapServerStatus != null) {
                    pcVar.bindString(1, (String) Factory.this.serverStatusAdapter.encode(snapServerStatus));
                } else {
                    pcVar.bindNull(1);
                }
                int i = 2;
                String[] strArr = this.snapId;
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

        public Factory(Creator<T> creator, ainu<SnapServerStatus, String> ainu, ainu<ScreenshottedOrReplayedState, String> ainu2, ainu<ReplyMedia, String> ainu3, ainu<GeofilterMetadata, String> ainu4, ainu<SnappableLensMetadata, String> ainu5, ainu<aesg, String> ainu6) {
            this.creator = creator;
            this.serverStatusAdapter = ainu;
            this.screenshottedOrReplayedAdapter = ainu2;
            this.replyMediaAdapter = ainu3;
            this.geofilterMetadataAdapter = ainu4;
            this.snappableLensMetadataAdapter = ainu5;
            this.directDownloadUrlAdapter = ainu6;
        }

        public final ainx deleteMessagingSnaps(String[] strArr) {
            return new DeleteMessagingSnapsQuery(strArr);
        }

        public final ainx getAllMessagingSnaps() {
            return new ainx("SELECT\nMessagingSnap._id,\nmessageRowId,\nsnapRowId,\nFeed.kind,\nFeed.key,\nSnap.snapId,\nSnap.snapType,\nSnap.mediaUrl,\nSnap.mediaKey,\nSnap.mediaIv,\nSnap.durationInMs,\nSnap.isInfiniteDuration,\nSnap.timestamp,\nSnap.mediaId,\nSnap.zipped,\nSnap.attachmentUrl,\nSnap.cognacAttachmentUri,\nMessage.mediaId,\nFriend.username AS senderUsername,\ndirectDownloadUrl,\ngeofilterMetadata,\nserverStatus,\nMessage.clientStatus,\nMessage.senderId,\nreplyMedia,\nMessagingSnap.viewerList,\nMessagingSnap.screenshottedOrReplayed,\nMessage.released,\nMessagingSnap.snappableLensMetadata,\nMessage.sequenceNumber\nFROM MessagingSnap\nJOIN Snap ON MessagingSnap.snapRowId = Snap._id\nJOIN Message ON MessagingSnap.messageRowId = Message._id\nJOIN Friend ON MessagingSnap.senderId = Friend._id\nJOIN Feed ON Feed._id = Message.feedRowId\nWHERE Snap.snapId IS NOT NULL\nORDER BY Snap.timestamp ASC\nLIMIT 100", new aioa(MessagingSnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MessageModel.TABLE_NAME, FriendModel.TABLE_NAME, FeedModel.TABLE_NAME));
        }

        public final <R extends GetAllMessagingSnapsModel, T1 extends FeedModel, T2 extends SnapModel, T4 extends MessageModel> GetAllMessagingSnapsMapper<R, T1, T2, T, T4> getAllMessagingSnapsMapper(GetAllMessagingSnapsCreator<R> getAllMessagingSnapsCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, com.snap.core.db.record.MessageModel.Factory<T4> factory3) {
            return new GetAllMessagingSnapsMapper(getAllMessagingSnapsCreator, factory, factory2, this, factory3);
        }

        public final ainx getDirectSnapInfo(String str) {
            return new GetDirectSnapInfoQuery(str);
        }

        public final ainx getDirectSnapInfoBySnapRowID(long j) {
            return new GetDirectSnapInfoBySnapRowIDQuery(j);
        }

        public final <R extends GetDirectSnapInfoBySnapRowIDModel, T1 extends SnapModel, T2 extends FeedModel> GetDirectSnapInfoBySnapRowIDMapper<R, T1, T2> getDirectSnapInfoBySnapRowIDMapper(GetDirectSnapInfoBySnapRowIDCreator<R> getDirectSnapInfoBySnapRowIDCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T2> factory2) {
            return new GetDirectSnapInfoBySnapRowIDMapper(getDirectSnapInfoBySnapRowIDCreator, factory, factory2);
        }

        public final <R extends GetDirectSnapInfoModel> GetDirectSnapInfoMapper<R, T> getDirectSnapInfoMapper(GetDirectSnapInfoCreator<R> getDirectSnapInfoCreator) {
            return new GetDirectSnapInfoMapper(getDirectSnapInfoCreator, this);
        }

        public final ainx getDirectSnapsOlderThanTimestamp(long j) {
            return new GetDirectSnapsOlderThanTimestampQuery(j);
        }

        public final <R extends GetDirectSnapsOlderThanTimestampModel> GetDirectSnapsOlderThanTimestampMapper<R> getDirectSnapsOlderThanTimestampMapper(GetDirectSnapsOlderThanTimestampCreator<R> getDirectSnapsOlderThanTimestampCreator) {
            return new GetDirectSnapsOlderThanTimestampMapper(getDirectSnapsOlderThanTimestampCreator);
        }

        public final ainx getDownloadInfoForDirectSnaps(long j) {
            return new GetDownloadInfoForDirectSnapsQuery(j);
        }

        public final <R extends GetDownloadInfoForDirectSnapsModel> GetDownloadInfoForDirectSnapsMapper<R, T> getDownloadInfoForDirectSnapsMapper(GetDownloadInfoForDirectSnapsCreator<R> getDownloadInfoForDirectSnapsCreator) {
            return new GetDownloadInfoForDirectSnapsMapper(getDownloadInfoForDirectSnapsCreator, this);
        }

        public final ainx getGroupSnapInfo(String str) {
            return new GetGroupSnapInfoQuery(str);
        }

        public final <R extends GetGroupSnapInfoModel> GetGroupSnapInfoMapper<R, T> getGroupSnapInfoMapper(GetGroupSnapInfoCreator<R> getGroupSnapInfoCreator) {
            return new GetGroupSnapInfoMapper(getGroupSnapInfoCreator, this);
        }

        public final ainx getGroupSnapsOlderThanTimestamp(long j, SnapServerStatus[] snapServerStatusArr) {
            return new GetGroupSnapsOlderThanTimestampQuery(j, snapServerStatusArr);
        }

        public final <R extends GetGroupSnapsOlderThanTimestampModel> GetGroupSnapsOlderThanTimestampMapper<R, T> getGroupSnapsOlderThanTimestampMapper(GetGroupSnapsOlderThanTimestampCreator<R> getGroupSnapsOlderThanTimestampCreator) {
            return new GetGroupSnapsOlderThanTimestampMapper(getGroupSnapsOlderThanTimestampCreator, this);
        }

        public final ainx getLastReceivedSnap(com.snap.core.db.record.SnapModel.Factory<? extends SnapModel> factory, String str, SnapServerStatus[] snapServerStatusArr, gcp[] gcpArr, Long[] lArr) {
            return new GetLastReceivedSnapQuery(factory, str, snapServerStatusArr, gcpArr, lArr);
        }

        public final <R extends GetLastReceivedSnapModel, T1 extends SnapModel> GetLastReceivedSnapMapper<R, T1, T> getLastReceivedSnapMapper(GetLastReceivedSnapCreator<R> getLastReceivedSnapCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory) {
            return new GetLastReceivedSnapMapper(getLastReceivedSnapCreator, factory, this);
        }

        public final ainx getLastSentSnap(String str, SnapServerStatus[] snapServerStatusArr, long[] jArr) {
            return new GetLastSentSnapQuery(str, snapServerStatusArr, jArr);
        }

        public final <R extends GetLastSentSnapModel, T1 extends SnapModel, T3 extends FriendModel> GetLastSentSnapMapper<R, T1, T, T3> getLastSentSnapMapper(GetLastSentSnapCreator<R> getLastSentSnapCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T3> factory2) {
            return new GetLastSentSnapMapper(getLastSentSnapCreator, factory, this, factory2);
        }

        public final ainx getPlayablePendingSnapsForFeed(Long l, SnapServerStatus snapServerStatus, String str) {
            return new GetPlayablePendingSnapsForFeedQuery(l, snapServerStatus, str);
        }

        public final <R extends GetPlayablePendingSnapsForFeedModel, T1 extends FeedModel, T2 extends SnapModel> GetPlayablePendingSnapsForFeedMapper<R, T1, T2, T> getPlayablePendingSnapsForFeedMapper(GetPlayablePendingSnapsForFeedCreator<R> getPlayablePendingSnapsForFeedCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2) {
            return new GetPlayablePendingSnapsForFeedMapper(getPlayablePendingSnapsForFeedCreator, factory, factory2, this);
        }

        public final ainx getPlayableSnapsByMessageRowId(long[] jArr) {
            return new GetPlayableSnapsByMessageRowIdQuery(jArr);
        }

        public final <R extends GetPlayableSnapsByMessageRowIdModel, T1 extends SnapModel, T3 extends FeedModel> GetPlayableSnapsByMessageRowIdMapper<R, T1, T, T3> getPlayableSnapsByMessageRowIdMapper(GetPlayableSnapsByMessageRowIdCreator<R> getPlayableSnapsByMessageRowIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T3> factory2) {
            return new GetPlayableSnapsByMessageRowIdMapper(getPlayableSnapsByMessageRowIdCreator, factory, this, factory2);
        }

        public final ainx getReplyMediaInfoForSnapRowId(long j) {
            return new GetReplyMediaInfoForSnapRowIdQuery(j);
        }

        public final <R extends GetReplyMediaInfoForSnapRowIdModel> GetReplyMediaInfoForSnapRowIdMapper<R, T> getReplyMediaInfoForSnapRowIdMapper(GetReplyMediaInfoForSnapRowIdCreator<R> getReplyMediaInfoForSnapRowIdCreator) {
            return new GetReplyMediaInfoForSnapRowIdMapper(getReplyMediaInfoForSnapRowIdCreator, this);
        }

        public final ainx getServerStatusForSnapId(String str) {
            return new GetServerStatusForSnapIdQuery(str);
        }

        public final ainw<SnapServerStatus> getServerStatusForSnapIdMapper() {
            return new ainw<SnapServerStatus>() {
                public SnapServerStatus map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (SnapServerStatus) Factory.this.serverStatusAdapter.decode(cursor.getString(0));
                }
            };
        }

        public final ainx getSnapIdInfoForMessageId(String str) {
            return new GetSnapIdInfoForMessageIdQuery(str);
        }

        public final <R extends GetSnapIdInfoForMessageIdModel> GetSnapIdInfoForMessageIdMapper<R, T> getSnapIdInfoForMessageIdMapper(GetSnapIdInfoForMessageIdCreator<R> getSnapIdInfoForMessageIdCreator) {
            return new GetSnapIdInfoForMessageIdMapper(getSnapIdInfoForMessageIdCreator, this);
        }

        public final ainx getSnapInfoBySnapRowID(long j) {
            return new GetSnapInfoBySnapRowIDQuery(j);
        }

        public final <R extends GetSnapInfoBySnapRowIDModel> GetSnapInfoBySnapRowIDMapper<R> getSnapInfoBySnapRowIDMapper(GetSnapInfoBySnapRowIDCreator<R> getSnapInfoBySnapRowIDCreator) {
            return new GetSnapInfoBySnapRowIDMapper(getSnapInfoBySnapRowIDCreator);
        }

        public final ainx getSnapInfoForId(String str, Long l) {
            return new GetSnapInfoForIdQuery(str, l);
        }

        public final <R extends GetSnapInfoForIdModel, T1 extends SnapModel> GetSnapInfoForIdMapper<R, T1, T> getSnapInfoForIdMapper(GetSnapInfoForIdCreator<R> getSnapInfoForIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory) {
            return new GetSnapInfoForIdMapper(getSnapInfoForIdCreator, factory, this);
        }

        public final ainx getSnapMetadataForSnapId(String str) {
            return new GetSnapMetadataForSnapIdQuery(str);
        }

        public final <R extends GetSnapMetadataForSnapIdModel, T1 extends SnapModel, T3 extends FeedModel> GetSnapMetadataForSnapIdMapper<R, T1, T, T3> getSnapMetadataForSnapIdMapper(GetSnapMetadataForSnapIdCreator<R> getSnapMetadataForSnapIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T3> factory2) {
            return new GetSnapMetadataForSnapIdMapper(getSnapMetadataForSnapIdCreator, factory, this, factory2);
        }

        public final ainx getSnapsForFeed(long j) {
            return new GetSnapsForFeedQuery(j);
        }

        public final <R extends GetSnapsForFeedModel> GetSnapsForFeedMapper<R, T> getSnapsForFeedMapper(GetSnapsForFeedCreator<R> getSnapsForFeedCreator) {
            return new GetSnapsForFeedMapper(getSnapsForFeedCreator, this);
        }

        public final ainx getViewerListBySnapRowId(long j) {
            return new GetViewerListBySnapRowIdQuery(j);
        }

        public final ainw<String> getViewerListBySnapRowIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.isNull(0) ? null : cursor.getString(0);
                }
            };
        }

        public final ainx snapDump(Long l) {
            return new SnapDumpQuery(l);
        }

        public final <R extends SnapDumpModel, T1 extends SnapModel> SnapDumpMapper<R, T1, T> snapDumpMapper(SnapDumpCreator<R> snapDumpCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory) {
            return new SnapDumpMapper(snapDumpCreator, factory, this);
        }

        public final ainx updateSnapServerStatusBySnapIds(SnapServerStatus snapServerStatus, String[] strArr) {
            return new UpdateSnapServerStatusBySnapIdsQuery(snapServerStatus, strArr);
        }
    }

    public static final class GetPlayablePendingSnapsForFeedMapper<T extends GetPlayablePendingSnapsForFeedModel, T1 extends FeedModel, T2 extends SnapModel, T3 extends MessagingSnapModel> implements ainw<T> {
        private final GetPlayablePendingSnapsForFeedCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final Factory<T3> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;

        public GetPlayablePendingSnapsForFeedMapper(GetPlayablePendingSnapsForFeedCreator<T> getPlayablePendingSnapsForFeedCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, Factory<T3> factory3) {
            this.creator = getPlayablePendingSnapsForFeedCreator;
            this.feedModelFactory = factory;
            this.snapModelFactory = factory2;
            this.messagingSnapModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetPlayablePendingSnapsForFeedCreator getPlayablePendingSnapsForFeedCreator = this.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            FeedKind feedKind = cursor2.isNull(2) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(2)));
            String string = cursor2.getString(3);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(4)));
            String string2 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string3 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string4 = cursor2.isNull(7) ? null : cursor2.getString(7);
            long j3 = cursor2.getLong(8);
            boolean z = cursor2.getInt(9) == 1;
            long j4 = cursor2.getLong(10);
            String string5 = cursor2.isNull(11) ? null : cursor2.getString(11);
            if (cursor2.isNull(12)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(12) == 1);
            }
            return getPlayablePendingSnapsForFeedCreator.create(j, j2, feedKind, string, gcp, string2, string3, string4, j3, z, j4, string5, bool, cursor2.isNull(13) ? null : cursor2.getString(13), cursor2.isNull(14) ? null : cursor2.getString(14), cursor2.isNull(15) ? null : cursor2.getString(15), cursor2.getString(16), cursor2.isNull(17) ? null : (aesg) this.messagingSnapModelFactory.directDownloadUrlAdapter.decode(cursor2.getString(17)), cursor2.isNull(18) ? null : (GeofilterMetadata) this.messagingSnapModelFactory.geofilterMetadataAdapter.decode(cursor2.getString(18)));
        }
    }

    public static final class GetSnapInfoForIdMapper<T extends GetSnapInfoForIdModel, T1 extends SnapModel, T2 extends MessagingSnapModel> implements ainw<T> {
        private final GetSnapInfoForIdCreator<T> creator;
        private final Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetSnapInfoForIdMapper(GetSnapInfoForIdCreator<T> getSnapInfoForIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, Factory<T2> factory2) {
            this.creator = getSnapInfoForIdCreator;
            this.snapModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            GetSnapInfoForIdCreator getSnapInfoForIdCreator = this.creator;
            String string = cursor.getString(0);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(1)));
            String str = null;
            ScreenshottedOrReplayedState screenshottedOrReplayedState = cursor.isNull(2) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(2));
            if (!cursor.isNull(3)) {
                str = cursor.getString(3);
            }
            return getSnapInfoForIdCreator.create(string, gcp, screenshottedOrReplayedState, str);
        }
    }

    public static final class GetSnapInfoBySnapRowIDMapper<T extends GetSnapInfoBySnapRowIDModel> implements ainw<T> {
        private final GetSnapInfoBySnapRowIDCreator<T> creator;

        public GetSnapInfoBySnapRowIDMapper(GetSnapInfoBySnapRowIDCreator<T> getSnapInfoBySnapRowIDCreator) {
            this.creator = getSnapInfoBySnapRowIDCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.getString(3));
        }
    }

    public static final class GetSnapsForFeedMapper<T extends GetSnapsForFeedModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetSnapsForFeedCreator<T> creator;
        private final Factory<T1> messagingSnapModelFactory;

        public GetSnapsForFeedMapper(GetSnapsForFeedCreator<T> getSnapsForFeedCreator, Factory<T1> factory) {
            this.creator = getSnapsForFeedCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor.getString(1)), cursor.isNull(2) ? null : cursor.getString(2), cursor.getLong(3));
        }
    }

    public static final class GetSnapMetadataForSnapIdMapper<T extends GetSnapMetadataForSnapIdModel, T1 extends SnapModel, T2 extends MessagingSnapModel, T3 extends FeedModel> implements ainw<T> {
        private final GetSnapMetadataForSnapIdCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T3> feedModelFactory;
        private final Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetSnapMetadataForSnapIdMapper(GetSnapMetadataForSnapIdCreator<T> getSnapMetadataForSnapIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, Factory<T2> factory2, com.snap.core.db.record.FeedModel.Factory<T3> factory3) {
            this.creator = getSnapMetadataForSnapIdCreator;
            this.snapModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
            this.feedModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            GetSnapMetadataForSnapIdCreator getSnapMetadataForSnapIdCreator = this.creator;
            String string = cursor.getString(0);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(1)));
            SnappableLensMetadata snappableLensMetadata = null;
            Long valueOf = cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2));
            Long valueOf2 = cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3));
            GeofilterMetadata geofilterMetadata = cursor.isNull(4) ? null : (GeofilterMetadata) this.messagingSnapModelFactory.geofilterMetadataAdapter.decode(cursor.getString(4));
            if (!cursor.isNull(5)) {
                snappableLensMetadata = (SnappableLensMetadata) this.messagingSnapModelFactory.snappableLensMetadataAdapter.decode(cursor.getString(5));
            }
            return getSnapMetadataForSnapIdCreator.create(string, gcp, valueOf, valueOf2, geofilterMetadata, snappableLensMetadata, cursor.getString(6), (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor.getLong(7))), cursor.getString(8), cursor.getLong(9));
        }
    }

    public static final class GetSnapIdInfoForMessageIdMapper<T extends GetSnapIdInfoForMessageIdModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetSnapIdInfoForMessageIdCreator<T> creator;
        private final Factory<T1> messagingSnapModelFactory;

        public GetSnapIdInfoForMessageIdMapper(GetSnapIdInfoForMessageIdCreator<T> getSnapIdInfoForMessageIdCreator, Factory<T1> factory) {
            this.creator = getSnapIdInfoForMessageIdCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(1)), cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)));
        }
    }

    public static final class GetGroupSnapInfoMapper<T extends GetGroupSnapInfoModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetGroupSnapInfoCreator<T> creator;
        private final Factory<T1> messagingSnapModelFactory;

        public GetGroupSnapInfoMapper(GetGroupSnapInfoCreator<T> getGroupSnapInfoCreator, Factory<T1> factory) {
            this.creator = getGroupSnapInfoCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetGroupSnapInfoCreator getGroupSnapInfoCreator = this.creator;
            ScreenshottedOrReplayedState screenshottedOrReplayedState = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            SnapServerStatus snapServerStatus = cursor.isNull(1) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor.getString(1));
            Long valueOf = cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2));
            if (!cursor.isNull(3)) {
                screenshottedOrReplayedState = (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(3));
            }
            return getGroupSnapInfoCreator.create(string, snapServerStatus, valueOf, screenshottedOrReplayedState);
        }
    }

    public static final class GetDirectSnapInfoBySnapRowIDMapper<T extends GetDirectSnapInfoBySnapRowIDModel, T1 extends SnapModel, T2 extends FeedModel> implements ainw<T> {
        private final GetDirectSnapInfoBySnapRowIDCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T2> feedModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetDirectSnapInfoBySnapRowIDMapper(GetDirectSnapInfoBySnapRowIDCreator<T> getDirectSnapInfoBySnapRowIDCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.FeedModel.Factory<T2> factory2) {
            this.creator = getDirectSnapInfoBySnapRowIDCreator;
            this.snapModelFactory = factory;
            this.feedModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.isNull(0) ? null : Long.valueOf(cursor2.getLong(0)), cursor2.isNull(1) ? null : cursor2.getString(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3)), cursor2.isNull(4) ? null : Long.valueOf(cursor2.getLong(4)), cursor2.getLong(5), (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(6))), cursor2.getInt(7) == 1, cursor2.getLong(8), cursor2.isNull(9) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(9))), cursor2.isNull(10) ? null : cursor2.getString(10));
        }
    }

    public static final class GetLastSentSnapMapper<T extends GetLastSentSnapModel, T1 extends SnapModel, T2 extends MessagingSnapModel, T3 extends FriendModel> implements ainw<T> {
        private final GetLastSentSnapCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T3> friendModelFactory;
        private final Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetLastSentSnapMapper(GetLastSentSnapCreator<T> getLastSentSnapCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3) {
            this.creator = getLastSentSnapCreator;
            this.snapModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
            this.friendModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.isNull(0) ? null : Long.valueOf(cursor2.getLong(0)), cursor2.isNull(1) ? null : Long.valueOf(cursor2.getLong(1)), cursor2.getString(2), (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(3))), cursor2.getLong(4), cursor2.getLong(5), cursor2.isNull(6) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor2.getString(6)), cursor2.isNull(7) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(7)), cursor2.isNull(8) ? null : cursor2.getBlob(8), cursor2.isNull(9) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(9))));
        }
    }

    public static final class GetLastReceivedSnapMapper<T extends GetLastReceivedSnapModel, T1 extends SnapModel, T2 extends MessagingSnapModel> implements ainw<T> {
        private final GetLastReceivedSnapCreator<T> creator;
        private final Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetLastReceivedSnapMapper(GetLastReceivedSnapCreator<T> getLastReceivedSnapCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, Factory<T2> factory2) {
            this.creator = getLastReceivedSnapCreator;
            this.snapModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : Long.valueOf(cursor.getLong(0)), cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1)), cursor.getString(2), (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(3))), cursor.getLong(4), cursor.getLong(5), cursor.isNull(6) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor.getString(6)), cursor.isNull(7) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(7)));
        }
    }

    public static final class GetGroupSnapsOlderThanTimestampMapper<T extends GetGroupSnapsOlderThanTimestampModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetGroupSnapsOlderThanTimestampCreator<T> creator;
        private final Factory<T1> messagingSnapModelFactory;

        public GetGroupSnapsOlderThanTimestampMapper(GetGroupSnapsOlderThanTimestampCreator<T> getGroupSnapsOlderThanTimestampCreator, Factory<T1> factory) {
            this.creator = getGroupSnapsOlderThanTimestampCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor.getString(1)), cursor.getLong(2), cursor.getLong(3));
        }
    }

    public static final class GetDirectSnapsOlderThanTimestampMapper<T extends GetDirectSnapsOlderThanTimestampModel> implements ainw<T> {
        private final GetDirectSnapsOlderThanTimestampCreator<T> creator;

        public GetDirectSnapsOlderThanTimestampMapper(GetDirectSnapsOlderThanTimestampCreator<T> getDirectSnapsOlderThanTimestampCreator) {
            this.creator = getDirectSnapsOlderThanTimestampCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1));
        }
    }

    public static final class SnapDumpMapper<T extends SnapDumpModel, T1 extends SnapModel, T2 extends MessagingSnapModel> implements ainw<T> {
        private final SnapDumpCreator<T> creator;
        private final Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public SnapDumpMapper(SnapDumpCreator<T> snapDumpCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, Factory<T2> factory2) {
            this.creator = snapDumpCreator;
            this.snapModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.isNull(0) ? null : cursor.getString(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(4))), cursor.isNull(5) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor.getString(5)), cursor.isNull(6) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(6)), cursor.isNull(7) ? null : Long.valueOf(cursor.getLong(7)));
        }
    }

    public static final class GetReplyMediaInfoForSnapRowIdMapper<T extends GetReplyMediaInfoForSnapRowIdModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetReplyMediaInfoForSnapRowIdCreator<T> creator;
        private final Factory<T1> messagingSnapModelFactory;

        public GetReplyMediaInfoForSnapRowIdMapper(GetReplyMediaInfoForSnapRowIdCreator<T> getReplyMediaInfoForSnapRowIdCreator, Factory<T1> factory) {
            this.creator = getReplyMediaInfoForSnapRowIdCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : (ReplyMedia) this.messagingSnapModelFactory.replyMediaAdapter.decode(cursor.getString(1)), cursor.getString(2));
        }
    }

    public static final class GetPlayableSnapsByMessageRowIdMapper<T extends GetPlayableSnapsByMessageRowIdModel, T1 extends SnapModel, T2 extends MessagingSnapModel, T3 extends FeedModel> implements ainw<T> {
        private final GetPlayableSnapsByMessageRowIdCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T3> feedModelFactory;
        private final Factory<T2> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetPlayableSnapsByMessageRowIdMapper(GetPlayableSnapsByMessageRowIdCreator<T> getPlayableSnapsByMessageRowIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, Factory<T2> factory2, com.snap.core.db.record.FeedModel.Factory<T3> factory3) {
            this.creator = getPlayableSnapsByMessageRowIdCreator;
            this.snapModelFactory = factory;
            this.messagingSnapModelFactory = factory2;
            this.feedModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetPlayableSnapsByMessageRowIdCreator getPlayableSnapsByMessageRowIdCreator = this.creator;
            String string = cursor2.getString(0);
            long j = cursor2.getLong(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            long j2 = cursor2.getLong(7);
            if (cursor2.isNull(8)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(8) == 1);
            }
            return getPlayableSnapsByMessageRowIdCreator.create(string, j, string2, string3, string4, gcp, string5, j2, bool, cursor2.getInt(9) == 1, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.isNull(12) ? null : cursor2.getString(12), cursor2.isNull(13) ? null : cursor2.getString(13), cursor2.isNull(14) ? null : (GeofilterMetadata) this.messagingSnapModelFactory.geofilterMetadataAdapter.decode(cursor2.getString(14)), cursor2.isNull(15) ? null : (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(15))));
        }
    }

    public static final class GetDownloadInfoForDirectSnapsMapper<T extends GetDownloadInfoForDirectSnapsModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetDownloadInfoForDirectSnapsCreator<T> creator;
        private final Factory<T1> messagingSnapModelFactory;

        public GetDownloadInfoForDirectSnapsMapper(GetDownloadInfoForDirectSnapsCreator<T> getDownloadInfoForDirectSnapsCreator, Factory<T1> factory) {
            this.creator = getDownloadInfoForDirectSnapsCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : (aesg) this.messagingSnapModelFactory.directDownloadUrlAdapter.decode(cursor.getString(4)));
        }
    }

    public static final class GetAllMessagingSnapsMapper<T extends GetAllMessagingSnapsModel, T1 extends FeedModel, T2 extends SnapModel, T3 extends MessagingSnapModel, T4 extends MessageModel> implements ainw<T> {
        private final GetAllMessagingSnapsCreator<T> creator;
        private final com.snap.core.db.record.FeedModel.Factory<T1> feedModelFactory;
        private final com.snap.core.db.record.MessageModel.Factory<T4> messageModelFactory;
        private final Factory<T3> messagingSnapModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;

        public GetAllMessagingSnapsMapper(GetAllMessagingSnapsCreator<T> getAllMessagingSnapsCreator, com.snap.core.db.record.FeedModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, Factory<T3> factory3, com.snap.core.db.record.MessageModel.Factory<T4> factory4) {
            this.creator = getAllMessagingSnapsCreator;
            this.feedModelFactory = factory;
            this.snapModelFactory = factory2;
            this.messagingSnapModelFactory = factory3;
            this.messageModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            GetAllMessagingSnapsCreator getAllMessagingSnapsCreator = this.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            long j3 = cursor2.getLong(2);
            FeedKind feedKind = (FeedKind) this.feedModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(3)));
            String string = cursor2.getString(4);
            String string2 = cursor2.getString(5);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            String string3 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string4 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string5 = cursor2.isNull(9) ? null : cursor2.getString(9);
            long j4 = cursor2.getLong(10);
            boolean z = cursor2.getInt(11) == 1;
            long j5 = cursor2.getLong(12);
            String string6 = cursor2.isNull(13) ? null : cursor2.getString(13);
            if (cursor2.isNull(14)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(14) == 1);
            }
            return getAllMessagingSnapsCreator.create(j, j2, j3, feedKind, string, string2, gcp, string3, string4, string5, j4, z, j5, string6, bool, cursor2.isNull(15) ? null : cursor2.getString(15), cursor2.isNull(16) ? null : cursor2.getString(16), cursor2.isNull(17) ? null : cursor2.getString(17), cursor2.getString(18), cursor2.isNull(19) ? null : (aesg) this.messagingSnapModelFactory.directDownloadUrlAdapter.decode(cursor2.getString(19)), cursor2.isNull(20) ? null : (GeofilterMetadata) this.messagingSnapModelFactory.geofilterMetadataAdapter.decode(cursor2.getString(20)), cursor2.isNull(21) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor2.getString(21)), cursor2.isNull(22) ? null : (MessageClientStatus) this.messageModelFactory.clientStatusAdapter.decode(cursor2.getString(22)), cursor2.isNull(23) ? null : Long.valueOf(cursor2.getLong(23)), cursor2.isNull(24) ? null : (ReplyMedia) this.messagingSnapModelFactory.replyMediaAdapter.decode(cursor2.getString(24)), cursor2.isNull(25) ? null : cursor2.getString(25), cursor2.isNull(26) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(26)), cursor2.getInt(27) == 1, cursor2.isNull(28) ? null : (SnappableLensMetadata) this.messagingSnapModelFactory.snappableLensMetadataAdapter.decode(cursor2.getString(28)), cursor2.isNull(29) ? null : Long.valueOf(cursor2.getLong(29)));
        }
    }

    public interface GetAllMessagingSnapsModel {
        String Message_mediaId();

        long _id();

        String attachmentUrl();

        MessageClientStatus clientStatus();

        String cognacAttachmentUri();

        aesg directDownloadUrl();

        long durationInMs();

        GeofilterMetadata geofilterMetadata();

        boolean isInfiniteDuration();

        String key();

        FeedKind kind();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        long messageRowId();

        boolean released();

        ReplyMedia replyMedia();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        Long senderId();

        String senderUsername();

        Long sequenceNumber();

        SnapServerStatus serverStatus();

        String snapId();

        long snapRowId();

        gcp snapType();

        SnappableLensMetadata snappableLensMetadata();

        long timestamp();

        String viewerList();

        Boolean zipped();
    }

    public interface GetDirectSnapInfoBySnapRowIDModel {
        String displayName();

        long durationInMs();

        String feedKey();

        Long feedRowId();

        boolean isInfiniteDuration();

        FeedKind kind();

        Long score();

        Long secondaryTimestamp();

        gcp snapType();

        long timestamp();

        String username();
    }

    public interface GetDirectSnapInfoCreator<T extends GetDirectSnapInfoModel> {
        T create(String str, SnapServerStatus snapServerStatus, Long l, ScreenshottedOrReplayedState screenshottedOrReplayedState);
    }

    public interface GetDirectSnapInfoModel {
        Long lastInteractionTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        SnapServerStatus serverStatus();

        String username();
    }

    public interface GetDirectSnapsOlderThanTimestampModel {
        long feedId();

        String snapId();
    }

    public interface GetDownloadInfoForDirectSnapsModel {
        aesg directDownloadUrl();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String snapId();
    }

    public interface GetGroupSnapInfoModel {
        Long lastInteractionTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        SnapServerStatus serverStatus();

        String username();
    }

    public interface GetGroupSnapsOlderThanTimestampModel {
        long feedId();

        SnapServerStatus serverStatus();

        String snapId();

        long timestamp();
    }

    public interface GetLastReceivedSnapModel {
        Long feedRowId();

        long interactionTimestamp();

        long messageTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        Long senderId();

        SnapServerStatus serverStatus();

        String snapId();

        gcp snapType();
    }

    public interface GetLastSentSnapModel {
        byte[] authToken();

        Long feedRowId();

        FriendLinkType friendLinkType();

        long interactionTimestamp();

        long messageTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        Long senderId();

        SnapServerStatus serverStatus();

        String snapId();

        gcp snapType();
    }

    public interface GetPlayablePendingSnapsForFeedModel {
        String Message_mediaId();

        String attachmentUrl();

        String cognacAttachmentUri();

        aesg directDownloadUrl();

        long durationInMs();

        GeofilterMetadata geofilterMetadata();

        boolean isInfiniteDuration();

        FeedKind kind();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        long messageRowId();

        String senderUsername();

        String snapId();

        long snapRowId();

        gcp snapType();

        long timestamp();

        Boolean zipped();
    }

    public interface GetPlayableSnapsByMessageRowIdModel {
        String attachmentUrl();

        String cognacAttachmentUri();

        long durationInMs();

        GeofilterMetadata geofilterMetadata();

        String groupType();

        boolean isInfiniteDuration();

        FeedKind kind();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        String snapId();

        gcp snapType();

        Long storyRowId();

        long timestamp();

        Boolean zipped();
    }

    public interface GetReplyMediaInfoForSnapRowIdModel {
        String key();

        ReplyMedia replyMedia();

        String snapId();
    }

    public interface GetSnapIdInfoForMessageIdModel {
        String key();

        String mediaId();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        Long sequenceNumber();

        String snapId();
    }

    public interface GetSnapInfoBySnapRowIDModel {
        String attachmentUrl();

        String snapId();

        long timestamp();

        String username();
    }

    public interface GetSnapInfoForIdModel {
        String esId();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        String snapId();

        gcp snapType();
    }

    public interface GetSnapMetadataForSnapIdModel {
        String conversationId();

        long durationInMs();

        Long feedRowId();

        GeofilterMetadata geofilterMetadata();

        FeedKind kind();

        Long senderId();

        String senderUsername();

        String snapId();

        gcp snapType();

        SnappableLensMetadata snappableLensMetadata();
    }

    public interface GetSnapsForFeedModel {
        SnapServerStatus serverStatus();

        String snapId();

        long timestamp();

        String username();
    }

    public interface SnapDumpModel {
        String conversationKey();

        Long lastInteractionTimestamp();

        ScreenshottedOrReplayedState screenshottedOrReplayed();

        String senderUsername();

        SnapServerStatus serverStatus();

        String snapId();

        gcp snapType();

        Long timestamp();
    }

    public static final class GetDirectSnapInfoMapper<T extends GetDirectSnapInfoModel, T1 extends MessagingSnapModel> implements ainw<T> {
        private final GetDirectSnapInfoCreator<T> creator;
        private final Factory<T1> messagingSnapModelFactory;

        public GetDirectSnapInfoMapper(GetDirectSnapInfoCreator<T> getDirectSnapInfoCreator, Factory<T1> factory) {
            this.creator = getDirectSnapInfoCreator;
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            GetDirectSnapInfoCreator getDirectSnapInfoCreator = this.creator;
            ScreenshottedOrReplayedState screenshottedOrReplayedState = null;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            SnapServerStatus snapServerStatus = cursor.isNull(1) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor.getString(1));
            Long valueOf = cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2));
            if (!cursor.isNull(3)) {
                screenshottedOrReplayedState = (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor.getString(3));
            }
            return getDirectSnapInfoCreator.create(string, snapServerStatus, valueOf, screenshottedOrReplayedState);
        }
    }

    public static final class Mapper<T extends MessagingSnapModel> implements ainw<T> {
        private final Factory<T> messagingSnapModelFactory;

        public Mapper(Factory<T> factory) {
            this.messagingSnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            Creator creator = this.messagingSnapModelFactory.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            long j3 = cursor2.getLong(2);
            Long valueOf = cursor2.isNull(3) ? null : Long.valueOf(cursor2.getLong(3));
            SnapServerStatus snapServerStatus = cursor2.isNull(4) ? null : (SnapServerStatus) this.messagingSnapModelFactory.serverStatusAdapter.decode(cursor2.getString(4));
            Long valueOf2 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Long valueOf3 = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            Integer valueOf4 = cursor2.isNull(7) ? null : Integer.valueOf(cursor2.getInt(7));
            Long valueOf5 = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            Long valueOf6 = cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9));
            ScreenshottedOrReplayedState screenshottedOrReplayedState = cursor2.isNull(10) ? null : (ScreenshottedOrReplayedState) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.decode(cursor2.getString(10));
            String string = cursor2.isNull(11) ? null : cursor2.getString(11);
            Long valueOf7 = cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12));
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            String string2 = cursor2.isNull(14) ? null : cursor2.getString(14);
            String string3 = cursor2.isNull(15) ? null : cursor2.getString(15);
            if (cursor2.isNull(16)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            return creator.create(j, j2, j3, valueOf, snapServerStatus, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, screenshottedOrReplayedState, string, valueOf7, bool, string2, string3, bool2, cursor2.isNull(17) ? null : cursor2.getString(17), cursor2.isNull(18) ? null : cursor2.getString(18), cursor2.isNull(19) ? null : (ReplyMedia) this.messagingSnapModelFactory.replyMediaAdapter.decode(cursor2.getString(19)), cursor2.isNull(20) ? null : (GeofilterMetadata) this.messagingSnapModelFactory.geofilterMetadataAdapter.decode(cursor2.getString(20)), cursor2.isNull(21) ? null : (SnappableLensMetadata) this.messagingSnapModelFactory.snappableLensMetadataAdapter.decode(cursor2.getString(21)), cursor2.isNull(22) ? null : (aesg) this.messagingSnapModelFactory.directDownloadUrlAdapter.decode(cursor2.getString(22)));
        }
    }

    public static final class ClearBaseSnapsForFeed extends ainy {
        public ClearBaseSnapsForFeed(pa paVar) {
            super(SnapModel.TABLE_NAME, paVar.a("DELETE FROM Snap WHERE Snap._id IN (SELECT MessagingSnap.snapRowId FROM MessagingSnap WHERE MessagingSnap.feedRowId=?)"));
        }

        public final void bind(Long l) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
        }
    }

    public static final class ClearSnapsForFeed extends ainy {
        public ClearSnapsForFeed(pa paVar) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("DELETE FROM MessagingSnap WHERE feedRowId=?"));
        }

        public final void bind(Long l) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
        }
    }

    public static final class DeleteAllMessagingSnaps extends ainy {
        public DeleteAllMessagingSnaps(pa paVar) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("DELETE FROM MessagingSnap"));
        }
    }

    public static final class DeleteFailedMessagingSnapsNotInConversation extends ainy {
        private final com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> messageModelFactory;

        public DeleteFailedMessagingSnapsNotInConversation(pa paVar, com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("DELETE FROM MessagingSnap\nWHERE messageRowId IN (\n    SELECT _id FROM Message WHERE clientStatus=?1 AND feedRowId=?2 AND key NOT IN (?3)\n)"));
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

    public static final class DeleteMessagingSnapsFromConversationWithStatus extends ainy {
        private final com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> messageModelFactory;

        public DeleteMessagingSnapsFromConversationWithStatus(pa paVar, com.snap.core.db.record.MessageModel.Factory<? extends MessageModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("DELETE FROM MessagingSnap\nWHERE messageRowId IN (\n    SELECT _id FROM Message WHERE clientStatus=?1 AND feedRowId=?2\n)"));
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

    public static final class DeleteSnap extends ainy {
        public DeleteSnap(pa paVar) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("DELETE FROM MessagingSnap\nWHERE snapRowId = (SELECT Snap._id FROM Snap WHERE Snap.snapId LIKE ?||'%')"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class InsertMessageSnap extends ainy {
        private final Factory<? extends MessagingSnapModel> messagingSnapModelFactory;

        public InsertMessageSnap(pa paVar, Factory<? extends MessagingSnapModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO MessagingSnap(\n    snapRowId,\n    messageRowId,\n    feedRowId,\n    serverStatus,\n    secondaryTimestamp,\n    pendingDeliveredTimestamp,\n    orientation,\n    sendStartTimestamp,\n    senderId,\n    broadcast,\n    broadcastHideTimer,\n    broadcastSecondaryText,\n    broadcastUrl,\n    replyMedia,\n    geofilterMetadata,\n    snappableLensMetadata,\n    directDownloadUrl)\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"));
            this.messagingSnapModelFactory = factory;
        }

        public final void bind(long j, long j2, Long l, SnapServerStatus snapServerStatus, Long l2, Long l3, Integer num, Long l4, Long l5, Boolean bool, Boolean bool2, String str, String str2, ReplyMedia replyMedia, GeofilterMetadata geofilterMetadata, SnappableLensMetadata snappableLensMetadata, aesg aesg) {
            SnapServerStatus snapServerStatus2 = snapServerStatus;
            String str3 = str;
            String str4 = str2;
            ReplyMedia replyMedia2 = replyMedia;
            GeofilterMetadata geofilterMetadata2 = geofilterMetadata;
            SnappableLensMetadata snappableLensMetadata2 = snappableLensMetadata;
            aesg aesg2 = aesg;
            bindLong(1, j);
            bindLong(2, j2);
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            if (snapServerStatus2 == null) {
                bindNull(4);
            } else {
                bindString(4, (String) this.messagingSnapModelFactory.serverStatusAdapter.encode(snapServerStatus2));
            }
            if (l2 == null) {
                bindNull(5);
            } else {
                bindLong(5, l2.longValue());
            }
            if (l3 == null) {
                bindNull(6);
            } else {
                bindLong(6, l3.longValue());
            }
            if (num == null) {
                bindNull(7);
            } else {
                bindLong(7, (long) num.intValue());
            }
            if (l4 == null) {
                bindNull(8);
            } else {
                bindLong(8, l4.longValue());
            }
            if (l5 == null) {
                bindNull(9);
            } else {
                bindLong(9, l5.longValue());
            }
            long j3 = 1;
            if (bool == null) {
                bindNull(10);
            } else {
                bindLong(10, bool.booleanValue() ? 1 : 0);
            }
            if (bool2 == null) {
                bindNull(11);
            } else {
                if (!bool2.booleanValue()) {
                    j3 = 0;
                }
                bindLong(11, j3);
            }
            if (str3 == null) {
                bindNull(12);
            } else {
                bindString(12, str3);
            }
            if (str4 == null) {
                bindNull(13);
            } else {
                bindString(13, str4);
            }
            if (replyMedia2 == null) {
                bindNull(14);
            } else {
                bindString(14, (String) this.messagingSnapModelFactory.replyMediaAdapter.encode(replyMedia2));
            }
            if (geofilterMetadata2 == null) {
                bindNull(15);
            } else {
                bindString(15, (String) this.messagingSnapModelFactory.geofilterMetadataAdapter.encode(geofilterMetadata2));
            }
            if (snappableLensMetadata2 == null) {
                bindNull(16);
            } else {
                bindString(16, (String) this.messagingSnapModelFactory.snappableLensMetadataAdapter.encode(snappableLensMetadata2));
            }
            if (aesg2 == null) {
                bindNull(17);
            } else {
                bindString(17, (String) this.messagingSnapModelFactory.directDownloadUrlAdapter.encode(aesg2));
            }
        }
    }

    public static final class UpdateSnapScreenshottedOrReplayByKey extends ainy {
        private final Factory<? extends MessagingSnapModel> messagingSnapModelFactory;

        public UpdateSnapScreenshottedOrReplayByKey(pa paVar, Factory<? extends MessagingSnapModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("UPDATE MessagingSnap\nSET screenshottedOrReplayed=?\nWHERE CASE ?\n    -- group snap: key on message.key --\n    WHEN 1 THEN messageRowId = (SELECT Message._id FROM Message WHERE Message.key = ?)\n    -- 1-1 snap: key on snapId --\n    ELSE snapRowId = (SELECT Snap._id FROM Snap WHERE Snap.snapId LIKE ?||'%')\nEND"));
            this.messagingSnapModelFactory = factory;
        }

        public final void bind(ScreenshottedOrReplayedState screenshottedOrReplayedState, Object obj, String str, String str2) {
            if (screenshottedOrReplayedState == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.encode(screenshottedOrReplayedState));
            }
            if (obj == null) {
                bindNull(2);
            } else if (obj instanceof String) {
                bindString(2, (String) obj);
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                bindDouble(2, ((Double) obj).doubleValue());
            } else {
                long longValue;
                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Long)) {
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Boolean) {
                    longValue = ((Boolean) obj).booleanValue() ? 1 : 0;
                } else if (obj instanceof byte[]) {
                    bindBlob(2, (byte[]) obj);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg2");
                }
                bindLong(2, longValue);
            }
            bindString(3, str);
            if (str2 == null) {
                bindNull(4);
            } else {
                bindString(4, str2);
            }
        }
    }

    public static final class UpdateSnapScreenshottedReplayByKeyWithoutSuffix extends ainy {
        private final Factory<? extends MessagingSnapModel> messagingSnapModelFactory;

        public UpdateSnapScreenshottedReplayByKeyWithoutSuffix(pa paVar, Factory<? extends MessagingSnapModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("UPDATE MessagingSnap\nSET screenshottedOrReplayed=?\nWHERE messageRowId = (SELECT Message._id FROM Message WHERE Message.key = ?)"));
            this.messagingSnapModelFactory = factory;
        }

        public final void bind(ScreenshottedOrReplayedState screenshottedOrReplayedState, String str) {
            if (screenshottedOrReplayedState == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messagingSnapModelFactory.screenshottedOrReplayedAdapter.encode(screenshottedOrReplayedState));
            }
            bindString(2, str);
        }
    }

    public static final class UpdateSnapServerStatusById extends ainy {
        private final Factory<? extends MessagingSnapModel> messagingSnapModelFactory;

        public UpdateSnapServerStatusById(pa paVar, Factory<? extends MessagingSnapModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("UPDATE MessagingSnap\n-- SET serverStatus = VIEW\nSET serverStatus = ?2\nWHERE snapRowId = ?1"));
            this.messagingSnapModelFactory = factory;
        }

        public final void bind(long j, SnapServerStatus snapServerStatus) {
            bindLong(1, j);
            if (snapServerStatus == null) {
                bindNull(2);
            } else {
                bindString(2, (String) this.messagingSnapModelFactory.serverStatusAdapter.encode(snapServerStatus));
            }
        }
    }

    public static final class UpdateSnapServerStatusByKey extends ainy {
        private final Factory<? extends MessagingSnapModel> messagingSnapModelFactory;

        public UpdateSnapServerStatusByKey(pa paVar, Factory<? extends MessagingSnapModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("UPDATE MessagingSnap\nSET\n    serverStatus=?,\n    lastInteractionTimestamp=MAX(ifnull(lastInteractionTimestamp, 0), ?)\nWHERE CASE ?\n    -- group snap: key on message.key --\n    WHEN 1 THEN messageRowId = (SELECT Message._id FROM Message WHERE Message.key = ?)\n    -- 1-1 snap: key on snapId --\n    ELSE snapRowId = (SELECT Snap._id FROM Snap WHERE Snap.snapId LIKE ?||'%')\nEND"));
            this.messagingSnapModelFactory = factory;
        }

        public final void bind(SnapServerStatus snapServerStatus, Object obj, Object obj2, String str, String str2) {
            if (snapServerStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messagingSnapModelFactory.serverStatusAdapter.encode(snapServerStatus));
            }
            long j = 1;
            if (obj == null) {
                bindNull(2);
            } else if (obj instanceof String) {
                bindString(2, (String) obj);
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                bindDouble(2, ((Double) obj).doubleValue());
            } else {
                long longValue;
                if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Long)) {
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Boolean) {
                    longValue = ((Boolean) obj).booleanValue() ? 1 : 0;
                } else if (obj instanceof byte[]) {
                    bindBlob(2, (byte[]) obj);
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg2");
                }
                bindLong(2, longValue);
            }
            if (obj2 == null) {
                bindNull(3);
            } else if (obj2 instanceof String) {
                bindString(3, (String) obj2);
            } else if ((obj2 instanceof Float) || (obj2 instanceof Double)) {
                bindDouble(3, ((Double) obj2).doubleValue());
            } else if ((obj2 instanceof Integer) || (obj2 instanceof Short) || (obj2 instanceof Long)) {
                bindLong(3, ((Long) obj2).longValue());
            } else if (obj2 instanceof Boolean) {
                if (!((Boolean) obj2).booleanValue()) {
                    j = 0;
                }
                bindLong(3, j);
            } else if (obj2 instanceof byte[]) {
                bindBlob(3, (byte[]) obj2);
            } else {
                throw new IllegalArgumentException("Attempting to bind an object that is not one of (String, Integer, Short, Long, Float, Double, Boolean, byte[]) to argument arg3");
            }
            bindString(4, str);
            if (str2 == null) {
                bindNull(5);
            } else {
                bindString(5, str2);
            }
        }
    }

    public static final class UpdateSnapServerStatusForFeed extends ainy {
        private final Factory<? extends MessagingSnapModel> messagingSnapModelFactory;

        public UpdateSnapServerStatusForFeed(pa paVar, Factory<? extends MessagingSnapModel> factory) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("UPDATE MessagingSnap\nSET serverStatus=?1\nWHERE feedRowId =?2 AND snapRowId IN\n ( SELECT _id FROM Snap WHERE Snap.snapId IN (?3))"));
            this.messagingSnapModelFactory = factory;
        }

        public final void bind(SnapServerStatus snapServerStatus, Long l, String str) {
            if (snapServerStatus == null) {
                bindNull(1);
            } else {
                bindString(1, (String) this.messagingSnapModelFactory.serverStatusAdapter.encode(snapServerStatus));
            }
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            bindString(3, str);
        }
    }

    public static final class UpdateViewerListBySnapRowId extends ainy {
        public UpdateViewerListBySnapRowId(pa paVar) {
            super(MessagingSnapModel.TABLE_NAME, paVar.a("UPDATE MessagingSnap\nSET viewerList = ?\nWHERE snapRowId = ?"));
        }

        public final void bind(String str, long j) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            bindLong(2, j);
        }
    }

    long _id();

    Boolean broadcast();

    Boolean broadcastHideTimer();

    String broadcastSecondaryText();

    String broadcastUrl();

    aesg directDownloadUrl();

    String egData();

    String esId();

    Long feedRowId();

    GeofilterMetadata geofilterMetadata();

    Long lastInteractionTimestamp();

    long messageRowId();

    Integer orientation();

    Long pendingDeliveredTimestamp();

    ReplyMedia replyMedia();

    ScreenshottedOrReplayedState screenshottedOrReplayed();

    Long secondaryTimestamp();

    Long sendStartTimestamp();

    Long senderId();

    SnapServerStatus serverStatus();

    long snapRowId();

    SnappableLensMetadata snappableLensMetadata();

    String viewerList();
}

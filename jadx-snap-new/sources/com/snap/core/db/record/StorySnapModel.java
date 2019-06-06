package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import defpackage.ageb;
import defpackage.agec;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gcp;
import defpackage.pa;
import defpackage.pc;

public interface StorySnapModel {
    public static final String ADDCLIENTSTATUSCOLUMN = "ALTER TABLE StorySnap\nADD COLUMN clientStatus INTEGER";
    public static final String ADDCREATIONTIMESTAMPCOLUMN = "ALTER TABLE StorySnap ADD COLUMN creationTimestamp INTEGER";
    public static final String ADDCREATIVEKITSOURCEAPPNAMECOLUMN = "ALTER TABLE StorySnap ADD COLUMN creativeKitSourceAppName TEXT";
    public static final String ADDCREATIVEKITSOURCEAPPOAUTHCLIENTIDCOLUMN = "ALTER TABLE StorySnap ADD COLUMN creativeKitSourceAppOAuthClientId TEXT";
    public static final String ADDFRIENDSCREENCAPTURERECORDINGCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN friendScreenCaptureRecordingCount INTEGER";
    public static final String ADDFRIENDSCREENCAPTURESHOTCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN friendScreenCaptureShotCount INTEGER";
    public static final String ADDFRIENDSCREENSHOTCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN friendScreenshotCount INTEGER";
    public static final String ADDFRIENDSNAPSAVECOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN friendSnapSaveCount INTEGER";
    public static final String ADDFRIENDVIEWCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN friendViewCount INTEGER";
    public static final String ADDOTHERSCREENCAPTURERECORDINGCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN otherScreenCaptureRecordingCount INTEGER";
    public static final String ADDOTHERSCREENCAPTURESHOTCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN otherScreenCaptureShotCount INTEGER";
    public static final String ADDOTHERSCREENSHOTCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN otherScreenshotCount INTEGER";
    public static final String ADDOTHERSNAPSAVECOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN otherSnapSaveCount INTEGER";
    public static final String ADDOTHERVIEWCOUNTCOLUMN = "ALTER TABLE StorySnap ADD COLUMN otherViewCount INTEGER";
    public static final String ADDPENDINGSERVERCONFIRMATIONCOLUMN = "ALTER TABLE StorySnap ADD COLUMN pendingServerConfirmation INTEGER";
    public static final String ADDPOSTEDTIMESTAMPCOLUMN = "ALTER TABLE StorySnap ADD COLUMN postedTimestamp INTEGER";
    public static final String ADDSERVERRANKINGIDCOLUMN = "ALTER TABLE StorySnap\nADD COLUMN serverRankingId TEXT";
    public static final String ADDSNAPSOURCECOLUMN = "ALTER TABLE StorySnap ADD COLUMN snapSource INTEGER";
    public static final String ADDSTORYROWIDCOLUMN = "ALTER TABLE StorySnap\nADD COLUMN storyRowId INTEGER NOT NULL DEFAULT -1";
    @Deprecated
    public static final String ANIMATEDSNAPTYPE = "animatedSnapType";
    @Deprecated
    public static final String BRANDFRIENDLINESS = "brandFriendliness";
    @Deprecated
    public static final String CANONICALDISPLAYTIME = "canonicalDisplayTime";
    @Deprecated
    public static final String CAPTIONTEXTDISPLAY = "captionTextDisplay";
    @Deprecated
    public static final String CLIENTID = "clientId";
    @Deprecated
    public static final String CLIENTSTATUS = "clientStatus";
    @Deprecated
    public static final String CONTEXTHINT = "contextHint";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS StorySnap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    snapRowId INTEGER NOT NULL,\n    username TEXT,\n    clientId TEXT NOT NULL,\n    storyRowId INTEGER NOT NULL,\n    captionTextDisplay TEXT,\n    filterId TEXT,\n\n    thumbnailUrl TEXT,\n    largeThumbnailUrl TEXT,\n    viewed INTEGER, -- true if the snap has been viewed\n    viewedTimestamp INTEGER, -- TODO (abeltyukov): deprecate this field\n\n    isOfficialStory INTEGER,\n\n    isPublic INTEGER,\n    mediaD2sUrl TEXT,\n    needAuth INTEGER NOT NULL,\n    storyFilterId TEXT,\n    thumbnailIv TEXT,\n    canonicalDisplayTime INTEGER,\n    expirationTimestamp INTEGER,\n    venueId TEXT,\n    flushableId TEXT, -- used to report read, screenshot, save states to servers\n    displayName TEXT, -- used for showing the display name of the snap's attributed user.\n\n    snapAttachmentUrl TEXT, -- used for URL attachments\n    contextHint TEXT, -- used for Context Cards\n\n    animatedSnapType TEXT, -- whether the snap contained animations, for analytics\n    lensMetadata TEXT, -- metadata for lenses analytics\n    filterLensId TEXT, -- metadata for lenses analytics\n    unlockablesSnapInfo TEXT, -- metadata for unlockables analytics\n    encryptedGeoLoggingData TEXT, -- encrypted metadata about geo logging, for analytics\n\n    ruleFileParams TEXT, -- serialized map for controlling media quality for direct-to-storage downloads\n    brandFriendliness INTEGER, -- Brand friendliness from server story snap\n    clientStatus INTEGER,\n\n    friendScreenCaptureRecordingCount INTEGER,\n    friendScreenCaptureShotCount INTEGER,\n    friendScreenshotCount INTEGER,\n    friendSnapSaveCount INTEGER,\n    friendViewCount INTEGER,\n    otherScreenCaptureRecordingCount INTEGER,\n    otherScreenCaptureShotCount INTEGER,\n    otherScreenshotCount INTEGER,\n    otherSnapSaveCount INTEGER,\n    otherViewCount INTEGER,\n\n    pendingServerConfirmation INTEGER, -- whether posts are waiting to be confirmed by StoriesResponse\n    postedTimestamp INTEGER, -- used for posting timeout logic for detecting async posting failures\n\n    creationTimestamp INTEGER, -- used to display original creation time when posting from memories / camera roll\n    snapSource INTEGER, -- used to determine source when posting from memories / camera roll\n\n    creativeKitSourceAppName TEXT, -- used to display source app name when posting from Snap Kit Creative Kit\n    creativeKitSourceAppOAuthClientId TEXT, -- used to identify source app when posting from Snap Kit Creative Kit\n\n    serverRankingId TEXT, -- used for story story view blizzard event\n\n    -- (storyRowId, clientId) should be unique and consistent across local and server synced snaps\n    UNIQUE(storyRowId, clientId),\n\n    -- should have unique snapRowId for each story\n    UNIQUE(storyRowId, snapRowId)\n)";
    @Deprecated
    public static final String CREATIONTIMESTAMP = "creationTimestamp";
    @Deprecated
    public static final String CREATIVEKITSOURCEAPPNAME = "creativeKitSourceAppName";
    @Deprecated
    public static final String CREATIVEKITSOURCEAPPOAUTHCLIENTID = "creativeKitSourceAppOAuthClientId";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    public static final String DROPTABLE = "DROP TABLE StorySnap";
    @Deprecated
    public static final String ENCRYPTEDGEOLOGGINGDATA = "encryptedGeoLoggingData";
    @Deprecated
    public static final String EXPIRATIONTIMESTAMP = "expirationTimestamp";
    @Deprecated
    public static final String FILTERID = "filterId";
    @Deprecated
    public static final String FILTERLENSID = "filterLensId";
    @Deprecated
    public static final String FLUSHABLEID = "flushableId";
    @Deprecated
    public static final String FRIENDSCREENCAPTURERECORDINGCOUNT = "friendScreenCaptureRecordingCount";
    @Deprecated
    public static final String FRIENDSCREENCAPTURESHOTCOUNT = "friendScreenCaptureShotCount";
    @Deprecated
    public static final String FRIENDSCREENSHOTCOUNT = "friendScreenshotCount";
    @Deprecated
    public static final String FRIENDSNAPSAVECOUNT = "friendSnapSaveCount";
    @Deprecated
    public static final String FRIENDVIEWCOUNT = "friendViewCount";
    @Deprecated
    public static final String ISOFFICIALSTORY = "isOfficialStory";
    @Deprecated
    public static final String ISPUBLIC = "isPublic";
    @Deprecated
    public static final String LARGETHUMBNAILURL = "largeThumbnailUrl";
    @Deprecated
    public static final String LENSMETADATA = "lensMetadata";
    @Deprecated
    public static final String MEDIAD2SURL = "mediaD2sUrl";
    @Deprecated
    public static final String NEEDAUTH = "needAuth";
    @Deprecated
    public static final String OTHERSCREENCAPTURERECORDINGCOUNT = "otherScreenCaptureRecordingCount";
    @Deprecated
    public static final String OTHERSCREENCAPTURESHOTCOUNT = "otherScreenCaptureShotCount";
    @Deprecated
    public static final String OTHERSCREENSHOTCOUNT = "otherScreenshotCount";
    @Deprecated
    public static final String OTHERSNAPSAVECOUNT = "otherSnapSaveCount";
    @Deprecated
    public static final String OTHERVIEWCOUNT = "otherViewCount";
    @Deprecated
    public static final String PENDINGSERVERCONFIRMATION = "pendingServerConfirmation";
    @Deprecated
    public static final String POSTEDTIMESTAMP = "postedTimestamp";
    @Deprecated
    public static final String RULEFILEPARAMS = "ruleFileParams";
    @Deprecated
    public static final String SERVERRANKINGID = "serverRankingId";
    @Deprecated
    public static final String SNAPATTACHMENTURL = "snapAttachmentUrl";
    @Deprecated
    public static final String SNAPROWID = "snapRowId";
    @Deprecated
    public static final String SNAPSOURCE = "snapSource";
    @Deprecated
    public static final String STORYFILTERID = "storyFilterId";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String TABLE_NAME = "StorySnap";
    @Deprecated
    public static final String THUMBNAILIV = "thumbnailIv";
    @Deprecated
    public static final String THUMBNAILURL = "thumbnailUrl";
    @Deprecated
    public static final String UNLOCKABLESSNAPINFO = "unlockablesSnapInfo";
    @Deprecated
    public static final String USERNAME = "username";
    @Deprecated
    public static final String VENUEID = "venueId";
    @Deprecated
    public static final String VIEWED = "viewed";
    @Deprecated
    public static final String VIEWEDTIMESTAMP = "viewedTimestamp";
    @Deprecated
    public static final String _ID = "_id";

    public static final class Factory<T extends StorySnapModel> {
        public final ainu<MessageClientStatus, Long> clientStatusAdapter;
        public final Creator<T> creator;

        final class SelectStorySnapForThumbnailByUsernameQuery extends ainx {
            private final StoryKind[] excludeStoryKinds;
            private final com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> storyModelFactory;
            private final String username;

            SelectStorySnapForThumbnailByUsernameQuery(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, StoryKind[] storyKindArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT StorySnap.clientId,\n  StorySnap.needAuth,\n  StorySnap.largeThumbnailUrl,\n  StorySnap.thumbnailUrl,\n  StorySnap.thumbnailIv,\n  StorySnap.clientStatus,\n  StorySnap.storyRowId,\n  Snap.snapId,\n  Snap.timestamp,\n  Snap.mediaId,\n  Snap.mediaKey,\n  Story.storyId,\n  Story.kind,\n  Story.displayName\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nWHERE StorySnap.username = ?1 AND Story.kind NOT IN ");
                stringBuilder.append(ainz.a(storyKindArr.length));
                stringBuilder.append("\nORDER BY StorySnap.clientStatus ASC, Snap.timestamp DESC\nLIMIT 1");
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyModelFactory = factory;
                this.username = str;
                this.excludeStoryKinds = storyKindArr;
            }

            public final void bindTo(pc pcVar) {
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                int i = 2;
                StoryKind[] storyKindArr = this.excludeStoryKinds;
                int length = storyKindArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, ((Long) this.storyModelFactory.kindAdapter.encode(storyKindArr[i2])).longValue());
                    i2++;
                    i = i3;
                }
            }
        }

        final class SelectExpiredStorySnapRowIdsQuery extends ainx {
            private final Long expirationTimestamp;

            SelectExpiredStorySnapRowIdsQuery(Long l) {
                super("SELECT _id\nFROM StorySnap\nWHERE expirationTimestamp < ?1 AND clientStatus != 2", new aioa(StorySnapModel.TABLE_NAME));
                this.expirationTimestamp = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.expirationTimestamp;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class GetPostedAndServerConfirmedStorySnapIdsQuery extends ainx {
            private final String username;

            GetPostedAndServerConfirmedStorySnapIdsQuery(String str) {
                super("SELECT Snap.snapId\nFROM Snap\nJOIN StorySnap ON StorySnap.snapRowId = Snap._id\nWHERE StorySnap.username = ?1\n    AND StorySnap.clientStatus = 5 -- OK\n    AND COALESCE(StorySnap.pendingServerConfirmation, 0) = 0", new aioa(SnapModel.TABLE_NAME, StorySnapModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectStorySnapsForPlayingQuery extends ainx {
            private final long storyRowId;

            SelectStorySnapsForPlayingQuery(long j) {
                super("SELECT StorySnap._id,\n  Snap.snapId,\n  StorySnap.username,\n  StorySnap.clientId,\n  Snap.mediaId,\n  Snap.snapType,\n  Snap.mediaKey,\n  Snap.mediaIv,\n  Snap.mediaUrl,\n  StorySnap.mediaD2sUrl,\n  Snap.durationInMs,\n  Snap.timestamp,\n  StorySnap.needAuth,\n  StorySnap.viewed,\n  StorySnap.flushableId,\n  Snap.isInfiniteDuration,\n  Snap.zipped,\n  StorySnap.largeThumbnailUrl,\n  StorySnap.thumbnailUrl,\n  StorySnap.thumbnailIv,\n  StorySnap.captionTextDisplay,\n  Story.displayName,\n  StorySnap.displayName AS attributedUserDisplayName,\n  StorySnap.isOfficialStory,\n  StorySnap.venueId,\n  StorySnap.isPublic,\n  StorySnap.expirationTimestamp,\n  StorySnap.snapRowId,\n  StorySnap.filterId,\n  StorySnap.storyFilterId,\n  Story._id AS storyRowId,\n  Story.storyId,\n  Story.isLocal,\n  Story.groupStoryType,\n  StorySnap.snapAttachmentUrl,\n  StorySnap.contextHint,\n  StorySnap.animatedSnapType,\n  StorySnap.lensMetadata,\n  StorySnap.filterLensId,\n  StorySnap.unlockablesSnapInfo,\n  StorySnap.encryptedGeoLoggingData,\n  StorySnap.ruleFileParams,\n  StorySnap.brandFriendliness,\n  Story.kind,\n  Friend.userId,\n  Friend.friendLinkType,\n  COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n  StorySnap.snapSource,\n  StorySnap.creationTimestamp,\n  Story.userName AS storyUsername,\n  StorySnap.clientStatus,\n  StorySnap.creativeKitSourceAppName,\n  StorySnap.creativeKitSourceAppOAuthClientId,\n  StorySnap.serverRankingId\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nLEFT OUTER JOIN Friend ON StorySnap.username = Friend.username\nWHERE StorySnap.storyRowId=?1\nGROUP BY StorySnap._id\nORDER BY Snap.timestamp ASC", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.storyRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
            }
        }

        final class SelectStorySnapForThumbnailByStoryRowIdQuery extends ainx {
            private final long _id;

            SelectStorySnapForThumbnailByStoryRowIdQuery(long j) {
                super("SELECT StorySnap.clientId,\n  StorySnap.needAuth,\n  StorySnap.largeThumbnailUrl,\n  StorySnap.thumbnailUrl,\n  StorySnap.thumbnailIv,\n  StorySnap.clientStatus,\n  StorySnap.storyRowId,\n  StorySnap.viewed,\n  Snap.snapId,\n  Snap.timestamp,\n  Snap.mediaId,\n  Snap.mediaKey,\n  Story.storyId,\n  Story.kind,\n  Story.displayName\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nWHERE Story._id = ?1\nORDER BY StorySnap.clientStatus ASC, Snap.timestamp DESC\nLIMIT 1", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetDownloadDataForStorySnapQuery extends ainx {
            private final String clientId;
            private final StoryKind kind;
            private final String storyId;
            private final com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> storyModelFactory;

            GetDownloadDataForStorySnapQuery(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, String str2, StoryKind storyKind) {
                super("SELECT\n    Snap.snapId,\n    Snap.mediaId,\n    Snap.snapType,\n    Snap.mediaKey,\n    Snap.mediaIv,\n    coalesce(StorySnap.mediaD2sUrl, Snap.mediaUrl) AS mediaUrl,\n    StorySnap.ruleFileParams\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nWHERE StorySnap.clientId = ?1 AND Story.storyId = ?2 AND Story.kind = ?3", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyModelFactory = factory;
                this.clientId = str;
                this.storyId = str2;
                this.kind = storyKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.clientId);
                pcVar.bindString(2, this.storyId);
                pcVar.bindLong(3, ((Long) this.storyModelFactory.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class DeleteStorySnapByRowIdsQuery extends ainx {
            private final long[] _id;

            DeleteStorySnapByRowIdsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM StorySnap\nWHERE _id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME));
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

        final class GetBrandFriendlinessByStoryIdsQuery extends ainx {
            private final String[] storyId;

            GetBrandFriendlinessByStoryIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Story.storyId,\n    Snap.snapId,\n    StorySnap.brandFriendliness\nFROM StorySnap\nJOIN Snap ON (Snap._id = StorySnap.snapRowId)\nJOIN Story ON (Story._id = StorySnap.storyRowId)\nWHERE Story.storyId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append(" AND Story.kind IN (0, 1)");
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyId = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.storyId;
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

        final class GetClientStatusQuery extends ainx {
            private final long _id;

            GetClientStatusQuery(long j) {
                super("SELECT clientStatus\nFROM StorySnap\nWHERE _id = ?1", new aioa(StorySnapModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetFailedRetryableStorySnapClientIdsQuery extends ainx {
            private final long storyRowId;

            GetFailedRetryableStorySnapClientIdsQuery(long j) {
                super("SELECT\n    StorySnap.clientId\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nWHERE StorySnap.storyRowId = ?1\nAND StorySnap.clientStatus = 3  -- MessageClientStatus.FAILED\nORDER BY Snap.timestamp ASC", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.storyRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
            }
        }

        final class GetIsPendingServerConfirmationQuery extends ainx {
            private final String snapId;

            GetIsPendingServerConfirmationQuery(String str) {
                super("SELECT COUNT(1)\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nWHERE Snap.snapId = ?1 AND StorySnap.pendingServerConfirmation = 1\nLIMIT 1", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.snapId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.snapId);
            }
        }

        final class GetLargeThumbnailForStorySnapQuery extends ainx {
            private final long _id;

            GetLargeThumbnailForStorySnapQuery(long j) {
                super("SELECT\n    Snap.mediaKey,\n    StorySnap.largeThumbnailUrl,\n    StorySnap.thumbnailIv,\n    StorySnap.needAuth,\n    Snap.mediaId,\n    StorySnap.viewed\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nWHERE StorySnap._id=?1", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetPendingStorySnapRowIdsQuery extends ainx {
            private final String clientId;
            private final long storyRowId;

            GetPendingStorySnapRowIdsQuery(long j, String str) {
                super("SELECT _id AS id, snapRowId\nFROM StorySnap\nWHERE storyRowId = ?1 AND clientId = ?2 AND clientStatus != 5", new aioa(StorySnapModel.TABLE_NAME));
                this.storyRowId = j;
                this.clientId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindString(2, this.clientId);
            }
        }

        final class GetRecordCountForStoryRowIdSnapRowIdQuery extends ainx {
            private final long snapRowId;
            private final long storyRowId;

            GetRecordCountForStoryRowIdSnapRowIdQuery(long j, long j2) {
                super("SELECT COUNT(1) AS count\nFROM StorySnap\nWHERE storyRowId=?1 AND snapRowId=?2", new aioa(StorySnapModel.TABLE_NAME));
                this.storyRowId = j;
                this.snapRowId = j2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, this.snapRowId);
            }
        }

        final class GetRowIdAndViewedByStoryRowIdClientIdQuery extends ainx {
            private final String clientId;
            private final long storyRowId;

            GetRowIdAndViewedByStoryRowIdClientIdQuery(long j, String str) {
                super("SELECT _id,\n    viewed\nFROM StorySnap\nWHERE storyRowId = ?1 AND clientId = ?2", new aioa(StorySnapModel.TABLE_NAME));
                this.storyRowId = j;
                this.clientId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindString(2, this.clientId);
            }
        }

        final class GetRowIdsBySnapIdsQuery extends ainx {
            private final String[] snapId;

            GetRowIdsBySnapIdsQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT _id\nFROM StorySnap\nWHERE StorySnap.snapRowId IN (SELECT Snap._id FROM Snap WHERE Snap.snapId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                stringBuilder.append(")");
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
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

        final class GetRowIdsByStoryRowIdQuery extends ainx {
            private final long storyRowId;

            GetRowIdsByStoryRowIdQuery(long j) {
                super("SELECT _id\nFROM StorySnap\nWHERE storyRowId = ?1", new aioa(StorySnapModel.TABLE_NAME));
                this.storyRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
            }
        }

        final class GetStoryManagementStoriesMetadataQuery extends ainx {
            private final long[] _id;

            GetStoryManagementStoriesMetadataQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    StorySnap.clientId,\n    StorySnap.clientStatus,\n    (\n      SELECT MAX(COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0))\n      FROM StorySnap\n      WHERE StorySnap.storyRowId = Story._id\n    ) AS maxViewCount,\n    (\n      SELECT SUM(COALESCE(StorySnap.friendScreenshotCount + StorySnap.otherScreenshotCount, 0))\n      FROM StorySnap\n      WHERE StorySnap.storyRowId = Story._id\n    ) AS totalScreenshotCount,\n    Story._id AS storyRowId,\n    Story.storyId,\n    Story.kind,\n    Story.displayName,\n    (\n        SELECT MIN(viewed)\n        FROM StorySnap\n        WHERE StorySnap.storyRowId = Story._id\n    ) AS viewed,\n    MobStoryMetadata.storyType,\n    MobStoryMetadata.subText,\n    MobStoryMetadata.typeExtraData,\n    MobStoryMetadata.creatorUsername,\n    (\n        SELECT COUNT(*)\n        FROM StorySnap\n        WHERE StorySnap.storyRowId = Story._id\n            AND StorySnap.clientStatus IN (0, 1, 2) -- MessageClientStatus.QUEUED, .PENDING, .SENDING\n    ) AS waitingToAddCount,\n    (\n        SELECT COUNT(*)\n        FROM StorySnap\n        WHERE StorySnap.storyRowId = Story._id\n            AND StorySnap.clientStatus IN (3, 4) -- MessageClientStatus.FAILED, .FAILED_NON_RECOVERABLE\n    ) AS failedToAddCount\nFROM Story\nLEFT JOIN StorySnap ON StorySnap.storyRowId = Story._id\nLEFT JOIN Snap ON Snap._id = StorySnap.snapRowId\nLEFT JOIN MobStoryMetadata ON MobStoryMetadata.storyRowId = Story._id\nWHERE Story._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                stringBuilder.append("\n-- if display name is not set, that means metadata has not been fetched yet\nAND (Story.displayName IS NOT NULL AND Story.displayName != '')\nGROUP BY Story._id\nORDER BY Story._id ASC,\n    StorySnap.clientStatus ASC,\n    Snap.timestamp DESC");
                super(stringBuilder.toString(), new aioa(StoryModel.TABLE_NAME, StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME));
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

        final class GetStoryManagementStorySnapsForPlayingQuery extends ainx {
            private final long _id;
            private final String currentUsername;

            GetStoryManagementStorySnapsForPlayingQuery(long j, String str) {
                super("SELECT\n    StorySnap._id,\n    Snap.snapId,\n    StorySnap.username,\n    StorySnap.clientId,\n    Snap.mediaId,\n    Snap.snapType,\n    Snap.mediaKey,\n    Snap.mediaIv,\n    Snap.mediaUrl,\n    StorySnap.mediaD2sUrl,\n    Snap.durationInMs,\n    Snap.timestamp,\n    StorySnap.needAuth,\n    StorySnap.viewed,\n    StorySnap.flushableId,\n    Snap.isInfiniteDuration,\n    Snap.zipped,\n    StorySnap.largeThumbnailUrl,\n    StorySnap.thumbnailUrl,\n    StorySnap.thumbnailIv,\n    StorySnap.captionTextDisplay,\n    Story.displayName,\n    StorySnap.displayName AS attributedUserDisplayName,\n    StorySnap.isOfficialStory,\n    StorySnap.venueId,\n    StorySnap.isPublic,\n    StorySnap.expirationTimestamp,\n    StorySnap.snapRowId,\n    StorySnap.filterId,\n    StorySnap.storyFilterId,\n    Story._id AS storyRowId,\n    Story.storyId,\n    Story.isLocal,\n    Story.groupStoryType,\n    StorySnap.snapAttachmentUrl,\n    StorySnap.contextHint,\n    StorySnap.animatedSnapType,\n    StorySnap.lensMetadata,\n    StorySnap.filterLensId,\n    StorySnap.unlockablesSnapInfo,\n    StorySnap.encryptedGeoLoggingData,\n    StorySnap.ruleFileParams,\n    StorySnap.brandFriendliness,\n    Story.kind,\n    Friend.userId,\n    Friend.friendLinkType,\n    COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n    COALESCE(StorySnap.friendScreenshotCount + StorySnap.otherScreenshotCount, 0) AS totalScreenshotCount,\n    StorySnap.snapSource,\n    StorySnap.creationTimestamp,\n    Story.userName AS storyUsername,\n    StorySnap.clientStatus,\n    StorySnap.creativeKitSourceAppName,\n    StorySnap.creativeKitSourceAppOAuthClientId,\n    StorySnap.serverRankingId\nFROM StorySnap\nJOIN Snap ON Snap._id = StorySnap.snapRowId\nJOIN Story ON Story._id = StorySnap.storyRowId\nLEFT OUTER JOIN Friend ON StorySnap.username = Friend.username\nWHERE Story._id = ?1\nAND (\n  -- if current user is poster\n  StorySnap.username = ?2\n  -- user is group story creator\n  OR (Story.kind = 1 AND Story.userName = ?2)\n  -- Story management permissions of Business stories are gated server side. Allow results through if of this kind\n  OR (Story.kind = 6)\n)\nORDER BY Snap.timestamp ASC", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this._id = j;
                this.currentUsername = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
                String str = this.currentUsername;
                if (str != null) {
                    pcVar.bindString(2, str);
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class GetStoryManagementStorySnapsQuery extends ainx {
            private final long[] _id;
            private final String username;

            GetStoryManagementStorySnapsQuery(String str, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    StorySnap._id,\n    StorySnap.username,\n    StorySnap.clientId,\n    StorySnap.viewed,\n    StorySnap.clientStatus,\n    StorySnap.captionTextDisplay,\n    Snap._id AS snapRowId,\n    Snap.snapId,\n    StorySnap.storyRowId,\n    Snap.snapType,\n    Snap.mediaUrl,\n    Snap.mediaKey,\n    Snap.mediaIv,\n    Snap.mediaId,\n    Snap.durationInMs,\n    Snap.isInfiniteDuration,\n    Snap.timestamp,\n    Snap.zipped,\n    Snap.attachmentUrl,\n    COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n    COALESCE(StorySnap.friendScreenshotCount + StorySnap.otherScreenshotCount, 0) AS totalScreenshotCount,\n    Story.kind,\n    Story.storyId\nFROM StorySnap\nJOIN Snap ON Snap._id = StorySnap.snapRowId\nJOIN Story ON Story._id = StorySnap.storyRowId\nWHERE\n(\n  -- if current user is poster\n  StorySnap.username = ?1\n  -- user is group story creator\n  OR (Story.kind = 1 AND Story.userName = ?1)\n  -- Story management permissions of Business stories are gated server side. Allow results through if of this kind\n  OR (Story.kind = 6)\n)\nAND Story._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                stringBuilder.append("\n-- if display name is not set, that means metadata has not been fetched yet\nAND (Story.displayName IS NOT NULL AND Story.displayName != '')");
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.username = str;
                this._id = jArr;
            }

            public final void bindTo(pc pcVar) {
                String str = this.username;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                int i = 2;
                long[] jArr = this._id;
                int length = jArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetStorySnapCountQuery extends ainx {
            private final long storyRowId;

            GetStorySnapCountQuery(long j) {
                super("SELECT COUNT(*)\nFROM StorySnap\nWHERE StorySnap.storyRowId = ?1", new aioa(StorySnapModel.TABLE_NAME));
                this.storyRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
            }
        }

        final class GetThumbnailForStorySnapQuery extends ainx {
            private final String clientId;
            private final StoryKind kind;
            private final String storyId;
            private final com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> storyModelFactory;

            GetThumbnailForStorySnapQuery(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, String str2, StoryKind storyKind) {
                super("SELECT\n    Snap.snapId,\n    Snap.mediaKey,\n    StorySnap.largeThumbnailUrl,\n    StorySnap.thumbnailUrl,\n    StorySnap.thumbnailIv,\n    StorySnap.needAuth,\n    Snap.mediaId,\n    StorySnap.viewed\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nWHERE StorySnap.clientId = ?1 AND Story.storyId = ?2 AND Story.kind = ?3", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyModelFactory = factory;
                this.clientId = str;
                this.storyId = str2;
                this.kind = storyKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.clientId);
                pcVar.bindString(2, this.storyId);
                pcVar.bindLong(3, ((Long) this.storyModelFactory.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class GetUnorphanedSnapRowIdsQuery extends ainx {
            private final long[] snapRowId;

            GetUnorphanedSnapRowIdsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT DISTINCT StorySnap.snapRowId\nFROM StorySnap\nWHERE StorySnap.snapRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME));
                this.snapRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.snapRowId;
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

        final class GetUnviewedStoryCountQuery extends ainx {
            private final StoryKind kind;
            private final String storyId;
            private final com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> storyModelFactory;

            GetUnviewedStoryCountQuery(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, StoryKind storyKind) {
                super("SELECT COUNT(Snap.snapId) AS storyCount\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON Story._id = StorySnap.storyRowId\nWHERE Story.storyId = ?1 AND Story.kind = ?2 AND StorySnap.viewed = 0", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyModelFactory = factory;
                this.storyId = str;
                this.kind = storyKind;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
                pcVar.bindLong(2, ((Long) this.storyModelFactory.kindAdapter.encode(this.kind)).longValue());
            }
        }

        final class GetUpdatedTimestampsAndViewStatusForStoryRowIdQuery extends ainx {
            private final long storyRowId;

            GetUpdatedTimestampsAndViewStatusForStoryRowIdQuery(long j) {
                super("SELECT\n    StorySnap.storyRowId,\n    Snap.timestamp AS latestTimestamp,\n    StorySnap.expirationTimestamp AS expirationTimestamp,\n    StorySnap.viewed AS viewed\nFROM StorySnap\nJOIN Snap ON Snap._id = StorySnap.snapRowId\nWHERE StorySnap.storyRowId = ?1", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
                this.storyRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
            }
        }

        final class SelectFriendStorySnapForThumbnailQuery extends ainx {
            private final String username;

            SelectFriendStorySnapForThumbnailQuery(String str) {
                super("SELECT\n  StorySnap.thumbnailUrl,\n  StorySnap.largeThumbnailUrl,\n  StorySnap.thumbnailIv,\n  StorySnap.needAuth,\n  Snap.snapId,\n  Snap.mediaId,\n  Snap.mediaKey\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nWHERE Story._id IN (\n    SELECT storyRowId\n    FROM StoryViewPlayableFriendStoriesMapping\n    WHERE username = ?1\n)\nGROUP BY Snap.mediaKey\nORDER BY Snap.timestamp DESC\nLIMIT 1", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectFriendStorySnapsForPlayingQuery extends ainx {
            private final String username;

            SelectFriendStorySnapsForPlayingQuery(String str) {
                super("SELECT StorySnap._id,\n  Snap.snapId,\n  StorySnap.username,\n  StorySnap.clientId,\n  Snap.mediaId,\n  Snap.snapType,\n  Snap.mediaKey,\n  Snap.mediaIv,\n  Snap.mediaUrl,\n  StorySnap.mediaD2sUrl,\n  Snap.durationInMs,\n  Snap.timestamp,\n  StorySnap.needAuth,\n  StorySnap.viewed,\n  StorySnap.flushableId,\n  Snap.isInfiniteDuration,\n  Snap.zipped,\n  StorySnap.largeThumbnailUrl,\n  StorySnap.thumbnailUrl,\n  StorySnap.thumbnailIv,\n  StorySnap.captionTextDisplay,\n  Story.displayName,\n  StorySnap.displayName AS attributedUserDisplayName,\n  StorySnap.isOfficialStory,\n  StorySnap.venueId,\n  StorySnap.isPublic,\n  StorySnap.expirationTimestamp,\n  StorySnap.snapRowId,\n  StorySnap.filterId,\n  StorySnap.storyFilterId,\n  Story._id AS storyRowId,\n  Story.storyId,\n  Story.isLocal,\n  Story.groupStoryType,\n  StorySnap.snapAttachmentUrl,\n  StorySnap.contextHint,\n  StorySnap.animatedSnapType,\n  StorySnap.lensMetadata,\n  StorySnap.filterLensId,\n  StorySnap.unlockablesSnapInfo,\n  StorySnap.encryptedGeoLoggingData,\n  StorySnap.ruleFileParams,\n  StorySnap.brandFriendliness,\n  Story.kind,\n  Friend.userId,\n  Friend.friendLinkType,\n  COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n  StorySnap.snapSource,\n  StorySnap.creationTimestamp,\n  Story.userName AS storyUsername,\n  StorySnap.clientStatus,\n  StorySnap.creativeKitSourceAppName,\n  StorySnap.creativeKitSourceAppOAuthClientId,\n  StorySnap.serverRankingId\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nLEFT OUTER JOIN Friend ON StorySnap.username = Friend.username\nWHERE Story._id IN (\n    SELECT storyRowId\n    FROM StoryViewPlayableFriendStoriesMapping\n    WHERE username = ?1\n)", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME, FriendModel.TABLE_NAME, MobStoryMetadataModel.TABLE_NAME));
                this.username = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.username);
            }
        }

        final class SelectLocallyPersistedPostedFieldsQuery extends ainx {
            private final long[] storyRowId;

            SelectLocallyPersistedPostedFieldsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    StorySnap.storyRowId,\n    StorySnap.clientId,\n    StorySnap.viewed,\n    StorySnap.postedTimestamp\nFROM StorySnap\nWHERE StorySnap.storyRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME));
                this.storyRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.storyRowId;
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

        final class SelectSnapDataForDeletionQuery extends ainx {
            private final long[] _id;

            SelectSnapDataForDeletionQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT StorySnap._id AS storySnapRowId,\nSnap._id AS snapRowId,\nSnap.snapId,\nStorySnap.expirationTimestamp,\nStorySnap.storyRowId,\nStorySnap.clientStatus\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nWHERE StorySnap._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME));
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

        final class SelectStoryManagementChromeDataQuery extends ainx {
            private final String clientId;
            private final StoryKind kind;
            private final String storyId;
            private final com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> storyModelFactory;

            SelectStoryManagementChromeDataQuery(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, StoryKind storyKind, String str2) {
                super("SELECT COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n    StorySnap.clientStatus,\n    StorySnap.clientId\nFROM StorySnap\nJOIN Story ON Story._id = StorySnap.storyRowId\nWHERE Story.storyId = ?1 AND Story.kind = ?2 AND StorySnap.clientId = ?3", new aioa(StorySnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyModelFactory = factory;
                this.storyId = str;
                this.kind = storyKind;
                this.clientId = str2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
                pcVar.bindLong(2, ((Long) this.storyModelFactory.kindAdapter.encode(this.kind)).longValue());
                pcVar.bindString(3, this.clientId);
            }
        }

        final class SelectStorySnapForPlayingBySnapRowIdQuery extends ainx {
            private final long snapRowId;

            SelectStorySnapForPlayingBySnapRowIdQuery(long j) {
                super("SELECT StorySnap._id,\n  Snap.snapId,\n  StorySnap.username,\n  StorySnap.clientId,\n  Snap.mediaId,\n  Snap.snapType,\n  Snap.mediaKey,\n  Snap.mediaIv,\n  Snap.mediaUrl,\n  StorySnap.mediaD2sUrl,\n  Snap.durationInMs,\n  Snap.timestamp,\n  StorySnap.needAuth,\n  StorySnap.viewed,\n  StorySnap.flushableId,\n  Snap.isInfiniteDuration,\n  Snap.zipped,\n  StorySnap.largeThumbnailUrl,\n  StorySnap.thumbnailUrl,\n  StorySnap.thumbnailIv,\n  StorySnap.captionTextDisplay,\n  Story.displayName,\n  StorySnap.displayName AS attributedUserDisplayName,\n  StorySnap.isOfficialStory,\n  StorySnap.venueId,\n  StorySnap.isPublic,\n  StorySnap.expirationTimestamp,\n  StorySnap.snapRowId,\n  StorySnap.filterId,\n  StorySnap.storyFilterId,\n  Story._id AS storyRowId,\n  Story.storyId,\n  Story.isLocal,\n  Story.groupStoryType,\n  StorySnap.snapAttachmentUrl,\n  StorySnap.contextHint,\n  StorySnap.animatedSnapType,\n  StorySnap.lensMetadata,\n  StorySnap.filterLensId,\n  StorySnap.unlockablesSnapInfo,\n  StorySnap.encryptedGeoLoggingData,\n  StorySnap.ruleFileParams,\n  StorySnap.brandFriendliness,\n  Story.kind,\n  Friend.userId,\n  Friend.friendLinkType,\n  COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n  StorySnap.snapSource,\n  StorySnap.creationTimestamp,\n  Story.userName AS storyUsername,\n  StorySnap.clientStatus,\n  StorySnap.creativeKitSourceAppName,\n  StorySnap.creativeKitSourceAppOAuthClientId,\n  StorySnap.serverRankingId\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nLEFT OUTER JOIN Friend ON StorySnap.username = Friend.username\nWHERE Snap._id=?1\nGROUP BY StorySnap._id\nLIMIT 1", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME, FriendModel.TABLE_NAME));
                this.snapRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.snapRowId);
            }
        }

        final class SelectStorySnapViewReportingInfoQuery extends ainx {
            private final long[] _id;

            SelectStorySnapViewReportingInfoQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    StorySnap.flushableId,\n    StorySnap.isPublic,\n    StorySnap.isOfficialStory,\n    StorySnap.clientId,\n    Story.storyId,\n    Story.kind,\n    Snap.snapId,\n    Friend.friendLinkType\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON Story._id = StorySnap.storyRowId\nLEFT OUTER JOIN Friend ON Friend.username = StorySnap.username\nWHERE StorySnap._id IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME, FriendModel.TABLE_NAME));
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

        final class SelectStorySnapsQuery extends ainx {
            private final long storyRowId;

            SelectStorySnapsQuery(long j) {
                super("SELECT StorySnap._id,\n StorySnap.username,\n StorySnap.clientId,\n StorySnap.viewed,\n StorySnap.snapRowId,\n StorySnap.clientStatus,\n Snap.snapId,\n StorySnap.storyRowId,\n Snap.snapType,\n Snap.mediaUrl,\n Snap.mediaKey,\n Snap.mediaIv,\n Snap.mediaId,\n Snap.durationInMs,\n Snap.isInfiniteDuration,\n Snap.timestamp,\n COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n COALESCE(StorySnap.friendScreenshotCount + StorySnap.otherScreenshotCount, 0) AS totalScreenshotCount,\n Story.kind,\n Story.storyId\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nLEFT OUTER JOIN Story ON StorySnap.storyRowId = Story._id\nWHERE StorySnap.storyRowId = ?1\nGROUP BY Snap.snapId\nORDER BY Snap.timestamp ASC", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this.storyRowId = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
            }
        }

        final class StorySnapDumpQuery extends ainx {
            private final Long _id;

            StorySnapDumpQuery(Long l) {
                super("SELECT\n    Story.userName AS storyUsername,\n    StorySnap._id AS storySnapRowId,\n    StorySnap.username AS storySnapUsername,\n    StorySnap.viewed AS storySnapViewed,\n    StorySnap.expirationTimestamp AS storySnapExpirationTimestamp,\n    Story.storyId AS storyId,\n    Story.viewed AS storyViewed,\n    Story.latestExpirationTimestamp AS storyLatestExpirationTimestamp\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nLEFT OUTER JOIN Story ON StorySnap.storyRowId = Story._id\nWHERE Story._id = ?1\nORDER BY StorySnap.expirationTimestamp DESC", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
                this._id = l;
            }

            public final void bindTo(pc pcVar) {
                Long l = this._id;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        public Factory(Creator<T> creator, ainu<MessageClientStatus, Long> ainu) {
            this.creator = creator;
            this.clientStatusAdapter = ainu;
        }

        public final ainx deleteStorySnapByRowIds(long[] jArr) {
            return new DeleteStorySnapByRowIdsQuery(jArr);
        }

        public final ainx getBrandFriendlinessByStoryIds(String[] strArr) {
            return new GetBrandFriendlinessByStoryIdsQuery(strArr);
        }

        public final <R extends GetBrandFriendlinessByStoryIdsModel> GetBrandFriendlinessByStoryIdsMapper<R> getBrandFriendlinessByStoryIdsMapper(GetBrandFriendlinessByStoryIdsCreator<R> getBrandFriendlinessByStoryIdsCreator) {
            return new GetBrandFriendlinessByStoryIdsMapper(getBrandFriendlinessByStoryIdsCreator);
        }

        public final ainx getClientStatus(long j) {
            return new GetClientStatusQuery(j);
        }

        public final ainw<MessageClientStatus> getClientStatusMapper() {
            return new ainw<MessageClientStatus>() {
                public MessageClientStatus map(Cursor cursor) {
                    return cursor.isNull(0) ? null : (MessageClientStatus) Factory.this.clientStatusAdapter.decode(Long.valueOf(cursor.getLong(0)));
                }
            };
        }

        public final ainx getDownloadDataForStorySnap(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, String str2, StoryKind storyKind) {
            return new GetDownloadDataForStorySnapQuery(factory, str, str2, storyKind);
        }

        public final <R extends GetDownloadDataForStorySnapModel, T1 extends SnapModel> GetDownloadDataForStorySnapMapper<R, T1> getDownloadDataForStorySnapMapper(GetDownloadDataForStorySnapCreator<R> getDownloadDataForStorySnapCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory) {
            return new GetDownloadDataForStorySnapMapper(getDownloadDataForStorySnapCreator, factory);
        }

        public final ainx getFailedRetryableStorySnapClientIds(long j) {
            return new GetFailedRetryableStorySnapClientIdsQuery(j);
        }

        public final ainw<String> getFailedRetryableStorySnapClientIdsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getIsPendingServerConfirmation(String str) {
            return new GetIsPendingServerConfirmationQuery(str);
        }

        public final ainw<Long> getIsPendingServerConfirmationMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getLargeThumbnailForStorySnap(long j) {
            return new GetLargeThumbnailForStorySnapQuery(j);
        }

        public final <R extends GetLargeThumbnailForStorySnapModel> GetLargeThumbnailForStorySnapMapper<R> getLargeThumbnailForStorySnapMapper(GetLargeThumbnailForStorySnapCreator<R> getLargeThumbnailForStorySnapCreator) {
            return new GetLargeThumbnailForStorySnapMapper(getLargeThumbnailForStorySnapCreator);
        }

        public final ainx getPendingStorySnapRowIds(long j, String str) {
            return new GetPendingStorySnapRowIdsQuery(j, str);
        }

        public final <R extends GetPendingStorySnapRowIdsModel> GetPendingStorySnapRowIdsMapper<R> getPendingStorySnapRowIdsMapper(GetPendingStorySnapRowIdsCreator<R> getPendingStorySnapRowIdsCreator) {
            return new GetPendingStorySnapRowIdsMapper(getPendingStorySnapRowIdsCreator);
        }

        public final ainx getPostedAndServerConfirmedStorySnapIds(String str) {
            return new GetPostedAndServerConfirmedStorySnapIdsQuery(str);
        }

        public final ainw<String> getPostedAndServerConfirmedStorySnapIdsMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getRecordCountForStoryRowIdSnapRowId(long j, long j2) {
            return new GetRecordCountForStoryRowIdSnapRowIdQuery(j, j2);
        }

        public final ainw<Long> getRecordCountForStoryRowIdSnapRowIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getRowIdAndViewedByStoryRowIdClientId(long j, String str) {
            return new GetRowIdAndViewedByStoryRowIdClientIdQuery(j, str);
        }

        public final <R extends GetRowIdAndViewedByStoryRowIdClientIdModel> GetRowIdAndViewedByStoryRowIdClientIdMapper<R> getRowIdAndViewedByStoryRowIdClientIdMapper(GetRowIdAndViewedByStoryRowIdClientIdCreator<R> getRowIdAndViewedByStoryRowIdClientIdCreator) {
            return new GetRowIdAndViewedByStoryRowIdClientIdMapper(getRowIdAndViewedByStoryRowIdClientIdCreator);
        }

        public final ainx getRowIdsBySnapIds(String[] strArr) {
            return new GetRowIdsBySnapIdsQuery(strArr);
        }

        public final ainw<Long> getRowIdsBySnapIdsMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getRowIdsByStoryRowId(long j) {
            return new GetRowIdsByStoryRowIdQuery(j);
        }

        public final ainw<Long> getRowIdsByStoryRowIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getStoryManagementStoriesMetadata(long[] jArr) {
            return new GetStoryManagementStoriesMetadataQuery(jArr);
        }

        public final <R extends GetStoryManagementStoriesMetadataModel, T2 extends StoryModel, T3 extends MobStoryMetadataModel> GetStoryManagementStoriesMetadataMapper<R, T, T2, T3> getStoryManagementStoriesMetadataMapper(GetStoryManagementStoriesMetadataCreator<R> getStoryManagementStoriesMetadataCreator, com.snap.core.db.record.StoryModel.Factory<T2> factory, com.snap.core.db.record.MobStoryMetadataModel.Factory<T3> factory2) {
            return new GetStoryManagementStoriesMetadataMapper(getStoryManagementStoriesMetadataCreator, this, factory, factory2);
        }

        public final ainx getStoryManagementStorySnaps(String str, long[] jArr) {
            return new GetStoryManagementStorySnapsQuery(str, jArr);
        }

        public final ainx getStoryManagementStorySnapsForPlaying(long j, String str) {
            return new GetStoryManagementStorySnapsForPlayingQuery(j, str);
        }

        public final <R extends GetStoryManagementStorySnapsForPlayingModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel> GetStoryManagementStorySnapsForPlayingMapper<R, T1, T2, T3, T> getStoryManagementStorySnapsForPlayingMapper(GetStoryManagementStorySnapsForPlayingCreator<R> getStoryManagementStorySnapsForPlayingCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3) {
            return new GetStoryManagementStorySnapsForPlayingMapper(getStoryManagementStorySnapsForPlayingCreator, factory, factory2, factory3, this);
        }

        public final <R extends GetStoryManagementStorySnapsModel, T2 extends SnapModel, T3 extends StoryModel> GetStoryManagementStorySnapsMapper<R, T, T2, T3> getStoryManagementStorySnapsMapper(GetStoryManagementStorySnapsCreator<R> getStoryManagementStorySnapsCreator, com.snap.core.db.record.SnapModel.Factory<T2> factory, com.snap.core.db.record.StoryModel.Factory<T3> factory2) {
            return new GetStoryManagementStorySnapsMapper(getStoryManagementStorySnapsCreator, this, factory, factory2);
        }

        public final ainx getStorySnapCount(long j) {
            return new GetStorySnapCountQuery(j);
        }

        public final ainw<Long> getStorySnapCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getThumbnailForStorySnap(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, String str2, StoryKind storyKind) {
            return new GetThumbnailForStorySnapQuery(factory, str, str2, storyKind);
        }

        public final <R extends GetThumbnailForStorySnapModel> GetThumbnailForStorySnapMapper<R> getThumbnailForStorySnapMapper(GetThumbnailForStorySnapCreator<R> getThumbnailForStorySnapCreator) {
            return new GetThumbnailForStorySnapMapper(getThumbnailForStorySnapCreator);
        }

        public final ainx getUnorphanedSnapRowIds(long[] jArr) {
            return new GetUnorphanedSnapRowIdsQuery(jArr);
        }

        public final ainw<Long> getUnorphanedSnapRowIdsMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getUnviewedStoryCount(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, StoryKind storyKind) {
            return new GetUnviewedStoryCountQuery(factory, str, storyKind);
        }

        public final ainw<Long> getUnviewedStoryCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getUpdatedTimestampsAndViewStatusForStoryRowId(long j) {
            return new GetUpdatedTimestampsAndViewStatusForStoryRowIdQuery(j);
        }

        public final <R extends GetUpdatedTimestampsAndViewStatusForStoryRowIdModel> GetUpdatedTimestampsAndViewStatusForStoryRowIdMapper<R> getUpdatedTimestampsAndViewStatusForStoryRowIdMapper(GetUpdatedTimestampsAndViewStatusForStoryRowIdCreator<R> getUpdatedTimestampsAndViewStatusForStoryRowIdCreator) {
            return new GetUpdatedTimestampsAndViewStatusForStoryRowIdMapper(getUpdatedTimestampsAndViewStatusForStoryRowIdCreator);
        }

        public final ainx playableStorySnapRecordBase() {
            return new ainx("SELECT StorySnap._id,\n  Snap.snapId,\n  StorySnap.username,\n  StorySnap.clientId,\n  Snap.mediaId,\n  Snap.snapType,\n  Snap.mediaKey,\n  Snap.mediaIv,\n  Snap.mediaUrl,\n  StorySnap.mediaD2sUrl,\n  Snap.durationInMs,\n  Snap.timestamp,\n  StorySnap.needAuth,\n  StorySnap.viewed,\n  StorySnap.flushableId,\n  Snap.isInfiniteDuration,\n  Snap.zipped,\n  StorySnap.largeThumbnailUrl,\n  StorySnap.thumbnailUrl,\n  StorySnap.thumbnailIv,\n  StorySnap.captionTextDisplay,\n  Story.displayName,\n  StorySnap.displayName AS attributedUserDisplayName,\n  StorySnap.isOfficialStory,\n  StorySnap.venueId,\n  StorySnap.isPublic,\n  StorySnap.expirationTimestamp,\n  StorySnap.snapRowId,\n  StorySnap.filterId,\n  StorySnap.storyFilterId,\n  Story._id AS storyRowId,\n  Story.storyId,\n  Story.isLocal,\n  Story.groupStoryType,\n  StorySnap.snapAttachmentUrl,\n  StorySnap.contextHint,\n  StorySnap.animatedSnapType,\n  StorySnap.lensMetadata,\n  StorySnap.filterLensId,\n  StorySnap.unlockablesSnapInfo,\n  StorySnap.encryptedGeoLoggingData,\n  StorySnap.ruleFileParams,\n  StorySnap.brandFriendliness,\n  Story.kind,\n  Friend.userId,\n  Friend.friendLinkType,\n  COALESCE(StorySnap.friendViewCount + StorySnap.otherViewCount, 0) AS totalViewCount,\n  StorySnap.snapSource,\n  StorySnap.creationTimestamp,\n  Story.userName AS storyUsername,\n  StorySnap.clientStatus,\n  StorySnap.creativeKitSourceAppName,\n  StorySnap.creativeKitSourceAppOAuthClientId,\n  StorySnap.serverRankingId\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nJOIN Story ON StorySnap.storyRowId = Story._id\nLEFT OUTER JOIN Friend ON StorySnap.username = Friend.username\nLIMIT 0", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME, FriendModel.TABLE_NAME));
        }

        public final <R extends PlayableStorySnapRecordBaseModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel> PlayableStorySnapRecordBaseMapper<R, T1, T2, T3, T> playableStorySnapRecordBaseMapper(PlayableStorySnapRecordBaseCreator<R> playableStorySnapRecordBaseCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3) {
            return new PlayableStorySnapRecordBaseMapper(playableStorySnapRecordBaseCreator, factory, factory2, factory3, this);
        }

        public final ainx selectExpiredStorySnapRowIds(Long l) {
            return new SelectExpiredStorySnapRowIdsQuery(l);
        }

        public final ainw<Long> selectExpiredStorySnapRowIdsMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx selectFriendStorySnapForThumbnail(String str) {
            return new SelectFriendStorySnapForThumbnailQuery(str);
        }

        public final <R extends SelectFriendStorySnapForThumbnailModel> SelectFriendStorySnapForThumbnailMapper<R> selectFriendStorySnapForThumbnailMapper(SelectFriendStorySnapForThumbnailCreator<R> selectFriendStorySnapForThumbnailCreator) {
            return new SelectFriendStorySnapForThumbnailMapper(selectFriendStorySnapForThumbnailCreator);
        }

        public final ainx selectFriendStorySnapsForPlaying(String str) {
            return new SelectFriendStorySnapsForPlayingQuery(str);
        }

        public final <R extends SelectFriendStorySnapsForPlayingModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel> SelectFriendStorySnapsForPlayingMapper<R, T1, T2, T3, T> selectFriendStorySnapsForPlayingMapper(SelectFriendStorySnapsForPlayingCreator<R> selectFriendStorySnapsForPlayingCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3) {
            return new SelectFriendStorySnapsForPlayingMapper(selectFriendStorySnapsForPlayingCreator, factory, factory2, factory3, this);
        }

        public final ainx selectLocallyPersistedPostedFields(long[] jArr) {
            return new SelectLocallyPersistedPostedFieldsQuery(jArr);
        }

        public final <R extends SelectLocallyPersistedPostedFieldsModel> SelectLocallyPersistedPostedFieldsMapper<R> selectLocallyPersistedPostedFieldsMapper(SelectLocallyPersistedPostedFieldsCreator<R> selectLocallyPersistedPostedFieldsCreator) {
            return new SelectLocallyPersistedPostedFieldsMapper(selectLocallyPersistedPostedFieldsCreator);
        }

        public final ainx selectSnapDataForDeletion(long[] jArr) {
            return new SelectSnapDataForDeletionQuery(jArr);
        }

        public final <R extends SelectSnapDataForDeletionModel> SelectSnapDataForDeletionMapper<R, T> selectSnapDataForDeletionMapper(SelectSnapDataForDeletionCreator<R> selectSnapDataForDeletionCreator) {
            return new SelectSnapDataForDeletionMapper(selectSnapDataForDeletionCreator, this);
        }

        public final ainx selectStoryManagementChromeData(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, StoryKind storyKind, String str2) {
            return new SelectStoryManagementChromeDataQuery(factory, str, storyKind, str2);
        }

        public final <R extends SelectStoryManagementChromeDataModel> SelectStoryManagementChromeDataMapper<R, T> selectStoryManagementChromeDataMapper(SelectStoryManagementChromeDataCreator<R> selectStoryManagementChromeDataCreator) {
            return new SelectStoryManagementChromeDataMapper(selectStoryManagementChromeDataCreator, this);
        }

        public final ainx selectStorySnapForPlayingBySnapRowId(long j) {
            return new SelectStorySnapForPlayingBySnapRowIdQuery(j);
        }

        public final <R extends SelectStorySnapForPlayingBySnapRowIdModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel> SelectStorySnapForPlayingBySnapRowIdMapper<R, T1, T2, T3, T> selectStorySnapForPlayingBySnapRowIdMapper(SelectStorySnapForPlayingBySnapRowIdCreator<R> selectStorySnapForPlayingBySnapRowIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3) {
            return new SelectStorySnapForPlayingBySnapRowIdMapper(selectStorySnapForPlayingBySnapRowIdCreator, factory, factory2, factory3, this);
        }

        public final ainx selectStorySnapForThumbnailByStoryRowId(long j) {
            return new SelectStorySnapForThumbnailByStoryRowIdQuery(j);
        }

        public final <R extends SelectStorySnapForThumbnailByStoryRowIdModel, T2 extends StoryModel> SelectStorySnapForThumbnailByStoryRowIdMapper<R, T, T2> selectStorySnapForThumbnailByStoryRowIdMapper(SelectStorySnapForThumbnailByStoryRowIdCreator<R> selectStorySnapForThumbnailByStoryRowIdCreator, com.snap.core.db.record.StoryModel.Factory<T2> factory) {
            return new SelectStorySnapForThumbnailByStoryRowIdMapper(selectStorySnapForThumbnailByStoryRowIdCreator, this, factory);
        }

        public final ainx selectStorySnapForThumbnailByUsername(com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory, String str, StoryKind[] storyKindArr) {
            return new SelectStorySnapForThumbnailByUsernameQuery(factory, str, storyKindArr);
        }

        public final <R extends SelectStorySnapForThumbnailByUsernameModel, T2 extends StoryModel> SelectStorySnapForThumbnailByUsernameMapper<R, T, T2> selectStorySnapForThumbnailByUsernameMapper(SelectStorySnapForThumbnailByUsernameCreator<R> selectStorySnapForThumbnailByUsernameCreator, com.snap.core.db.record.StoryModel.Factory<T2> factory) {
            return new SelectStorySnapForThumbnailByUsernameMapper(selectStorySnapForThumbnailByUsernameCreator, this, factory);
        }

        public final ainx selectStorySnapViewReportingInfo(long[] jArr) {
            return new SelectStorySnapViewReportingInfoQuery(jArr);
        }

        public final <R extends SelectStorySnapViewReportingInfoModel, T1 extends StoryModel, T2 extends FriendModel> SelectStorySnapViewReportingInfoMapper<R, T1, T2> selectStorySnapViewReportingInfoMapper(SelectStorySnapViewReportingInfoCreator<R> selectStorySnapViewReportingInfoCreator, com.snap.core.db.record.StoryModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            return new SelectStorySnapViewReportingInfoMapper(selectStorySnapViewReportingInfoCreator, factory, factory2);
        }

        public final ainx selectStorySnaps(long j) {
            return new SelectStorySnapsQuery(j);
        }

        public final ainx selectStorySnapsForPlaying(long j) {
            return new SelectStorySnapsForPlayingQuery(j);
        }

        public final <R extends SelectStorySnapsForPlayingModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel> SelectStorySnapsForPlayingMapper<R, T1, T2, T3, T> selectStorySnapsForPlayingMapper(SelectStorySnapsForPlayingCreator<R> selectStorySnapsForPlayingCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3) {
            return new SelectStorySnapsForPlayingMapper(selectStorySnapsForPlayingCreator, factory, factory2, factory3, this);
        }

        public final <R extends SelectStorySnapsModel, T2 extends SnapModel, T3 extends StoryModel> SelectStorySnapsMapper<R, T, T2, T3> selectStorySnapsMapper(SelectStorySnapsCreator<R> selectStorySnapsCreator, com.snap.core.db.record.SnapModel.Factory<T2> factory, com.snap.core.db.record.StoryModel.Factory<T3> factory2) {
            return new SelectStorySnapsMapper(selectStorySnapsCreator, this, factory, factory2);
        }

        public final ainx storySnapDump(Long l) {
            return new StorySnapDumpQuery(l);
        }

        public final <R extends StorySnapDumpModel> StorySnapDumpMapper<R> storySnapDumpMapper(StorySnapDumpCreator<R> storySnapDumpCreator) {
            return new StorySnapDumpMapper(storySnapDumpCreator);
        }

        public final ainx storySnapRecordBase() {
            return new ainx("SELECT\nStorySnap._id,\nStorySnap.snapRowId,\nSnap.snapId,\nStorySnap.clientId,\nStory.storyId,\nStory.kind,\nSnap.snapType,\nSnap.mediaId,\nSnap.mediaKey,\nSnap.durationInMs,\nSnap.timestamp,\nStorySnap.clientStatus\nFROM StorySnap\nJOIN Snap ON StorySnap.snapRowId = Snap._id\nLEFT OUTER JOIN Story ON StorySnap.storyRowId = Story._id\nLIMIT 0", new aioa(StorySnapModel.TABLE_NAME, SnapModel.TABLE_NAME, StoryModel.TABLE_NAME));
        }

        public final <R extends StorySnapRecordBaseModel, T1 extends StoryModel, T2 extends SnapModel> StorySnapRecordBaseMapper<R, T1, T2, T> storySnapRecordBaseMapper(StorySnapRecordBaseCreator<R> storySnapRecordBaseCreator, com.snap.core.db.record.StoryModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2) {
            return new StorySnapRecordBaseMapper(storySnapRecordBaseCreator, factory, factory2, this);
        }
    }

    public interface Creator<T extends StorySnapModel> {
        T create(long j, long j2, String str, String str2, long j3, String str3, String str4, String str5, String str6, Boolean bool, Long l, Boolean bool2, Boolean bool3, String str7, boolean z, String str8, String str9, Long l2, Long l3, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Integer num, MessageClientStatus messageClientStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool4, Long l4, Long l5, Integer num12, String str21, String str22, String str23);
    }

    public interface SelectStorySnapForThumbnailByUsernameModel {
        String clientId();

        MessageClientStatus clientStatus();

        String displayName();

        StoryKind kind();

        String largeThumbnailUrl();

        String mediaId();

        String mediaKey();

        boolean needAuth();

        String snapId();

        String storyId();

        long storyRowId();

        String thumbnailIv();

        String thumbnailUrl();

        long timestamp();
    }

    public static final class UpdatePendingServerVerificationSnapsToFailed extends ainy {
        public UpdatePendingServerVerificationSnapsToFailed(pa paVar) {
            super(StorySnapModel.TABLE_NAME, paVar.a("UPDATE StorySnap\nSET clientStatus = 4 -- FAILED_NON_RECOVERABLE\nWHERE clientStatus = 5 AND pendingServerConfirmation = 1 AND postedTimestamp < :asyncPostingFailureTimeoutTimestamp"));
        }

        public final void bind(Long l) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
        }
    }

    public interface SelectStorySnapsCreator<T extends SelectStorySnapsModel> {
        T create(long j, String str, String str2, Boolean bool, long j2, MessageClientStatus messageClientStatus, String str3, long j3, gcp gcp, String str4, String str5, String str6, String str7, long j4, boolean z, long j5, long j6, long j7, StoryKind storyKind, String str8);
    }

    public interface SelectStorySnapsForPlayingCreator<T extends SelectStorySnapsForPlayingModel> {
        T create(long j, String str, String str2, String str3, String str4, gcp gcp, String str5, String str6, String str7, String str8, long j2, long j3, boolean z, Boolean bool, String str9, boolean z2, Boolean bool2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, Boolean bool4, Long l, long j4, String str17, String str18, long j5, String str19, Boolean bool5, GroupStoryType groupStoryType, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num, StoryKind storyKind, String str28, FriendLinkType friendLinkType, long j6, Integer num2, Long l2, String str29, MessageClientStatus messageClientStatus, String str30, String str31, String str32);
    }

    public interface SelectFriendStorySnapsForPlayingCreator<T extends SelectFriendStorySnapsForPlayingModel> {
        T create(long j, String str, String str2, String str3, String str4, gcp gcp, String str5, String str6, String str7, String str8, long j2, long j3, boolean z, Boolean bool, String str9, boolean z2, Boolean bool2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, Boolean bool4, Long l, long j4, String str17, String str18, long j5, String str19, Boolean bool5, GroupStoryType groupStoryType, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num, StoryKind storyKind, String str28, FriendLinkType friendLinkType, long j6, Integer num2, Long l2, String str29, MessageClientStatus messageClientStatus, String str30, String str31, String str32);
    }

    public interface SelectStorySnapForPlayingBySnapRowIdCreator<T extends SelectStorySnapForPlayingBySnapRowIdModel> {
        T create(long j, String str, String str2, String str3, String str4, gcp gcp, String str5, String str6, String str7, String str8, long j2, long j3, boolean z, Boolean bool, String str9, boolean z2, Boolean bool2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, Boolean bool4, Long l, long j4, String str17, String str18, long j5, String str19, Boolean bool5, GroupStoryType groupStoryType, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num, StoryKind storyKind, String str28, FriendLinkType friendLinkType, long j6, Integer num2, Long l2, String str29, MessageClientStatus messageClientStatus, String str30, String str31, String str32);
    }

    public interface SelectStorySnapViewReportingInfoCreator<T extends SelectStorySnapViewReportingInfoModel> {
        T create(String str, Boolean bool, Boolean bool2, String str2, String str3, StoryKind storyKind, String str4, FriendLinkType friendLinkType);
    }

    public interface SelectStorySnapForThumbnailByUsernameCreator<T extends SelectStorySnapForThumbnailByUsernameModel> {
        T create(String str, boolean z, String str2, String str3, String str4, MessageClientStatus messageClientStatus, long j, String str5, long j2, String str6, String str7, String str8, StoryKind storyKind, String str9);
    }

    public interface SelectStorySnapForThumbnailByStoryRowIdCreator<T extends SelectStorySnapForThumbnailByStoryRowIdModel> {
        T create(String str, boolean z, String str2, String str3, String str4, MessageClientStatus messageClientStatus, long j, Boolean bool, String str5, long j2, String str6, String str7, String str8, StoryKind storyKind, String str9);
    }

    public interface SelectFriendStorySnapForThumbnailCreator<T extends SelectFriendStorySnapForThumbnailModel> {
        T create(String str, String str2, String str3, boolean z, String str4, String str5, String str6);
    }

    public interface GetThumbnailForStorySnapCreator<T extends GetThumbnailForStorySnapModel> {
        T create(String str, String str2, String str3, String str4, String str5, boolean z, String str6, Boolean bool);
    }

    public interface GetDownloadDataForStorySnapCreator<T extends GetDownloadDataForStorySnapModel> {
        T create(String str, String str2, gcp gcp, String str3, String str4, String str5, String str6);
    }

    public interface GetPendingStorySnapRowIdsCreator<T extends GetPendingStorySnapRowIdsModel> {
        T create(long j, long j2);
    }

    public interface SelectSnapDataForDeletionCreator<T extends SelectSnapDataForDeletionModel> {
        T create(long j, long j2, String str, Long l, long j3, MessageClientStatus messageClientStatus);
    }

    public interface GetBrandFriendlinessByStoryIdsCreator<T extends GetBrandFriendlinessByStoryIdsModel> {
        T create(String str, String str2, Integer num);
    }

    public interface StorySnapDumpCreator<T extends StorySnapDumpModel> {
        T create(String str, long j, String str2, Boolean bool, Long l, String str3, Boolean bool2, Long l2);
    }

    public interface GetStoryManagementStoriesMetadataCreator<T extends GetStoryManagementStoriesMetadataModel> {
        T create(String str, MessageClientStatus messageClientStatus, long j, long j2, long j3, String str2, StoryKind storyKind, String str3, Long l, ageb ageb, String str4, agec agec, String str5, long j4, long j5);
    }

    public interface GetStoryManagementStorySnapsCreator<T extends GetStoryManagementStorySnapsModel> {
        T create(long j, String str, String str2, Boolean bool, MessageClientStatus messageClientStatus, String str3, long j2, String str4, long j3, gcp gcp, String str5, String str6, String str7, String str8, long j4, boolean z, long j5, Boolean bool2, String str9, long j6, long j7, StoryKind storyKind, String str10);
    }

    public interface GetStoryManagementStorySnapsForPlayingCreator<T extends GetStoryManagementStorySnapsForPlayingModel> {
        T create(long j, String str, String str2, String str3, String str4, gcp gcp, String str5, String str6, String str7, String str8, long j2, long j3, boolean z, Boolean bool, String str9, boolean z2, Boolean bool2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, Boolean bool4, Long l, long j4, String str17, String str18, long j5, String str19, Boolean bool5, GroupStoryType groupStoryType, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num, StoryKind storyKind, String str28, FriendLinkType friendLinkType, long j6, long j7, Integer num2, Long l2, String str29, MessageClientStatus messageClientStatus, String str30, String str31, String str32);
    }

    public interface SelectLocallyPersistedPostedFieldsCreator<T extends SelectLocallyPersistedPostedFieldsModel> {
        T create(long j, String str, Boolean bool, Long l);
    }

    public interface GetUpdatedTimestampsAndViewStatusForStoryRowIdCreator<T extends GetUpdatedTimestampsAndViewStatusForStoryRowIdModel> {
        T create(long j, long j2, Long l, Boolean bool);
    }

    public interface GetRowIdAndViewedByStoryRowIdClientIdCreator<T extends GetRowIdAndViewedByStoryRowIdClientIdModel> {
        T create(long j, Boolean bool);
    }

    public interface SelectStoryManagementChromeDataCreator<T extends SelectStoryManagementChromeDataModel> {
        T create(long j, MessageClientStatus messageClientStatus, String str);
    }

    public interface PlayableStorySnapRecordBaseModel {
        long _id();

        String animatedSnapType();

        String attributedUserDisplayName();

        Integer brandFriendliness();

        String captionTextDisplay();

        String clientId();

        MessageClientStatus clientStatus();

        String contextHint();

        Long creationTimestamp();

        String creativeKitSourceAppName();

        String creativeKitSourceAppOAuthClientId();

        String displayName();

        long durationInMs();

        String encryptedGeoLoggingData();

        Long expirationTimestamp();

        String filterId();

        String filterLensId();

        String flushableId();

        FriendLinkType friendLinkType();

        GroupStoryType groupStoryType();

        boolean isInfiniteDuration();

        Boolean isLocal();

        Boolean isOfficialStory();

        Boolean isPublic();

        StoryKind kind();

        String largeThumbnailUrl();

        String lensMetadata();

        String mediaD2sUrl();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        boolean needAuth();

        String ruleFileParams();

        String serverRankingId();

        String snapAttachmentUrl();

        String snapId();

        long snapRowId();

        Integer snapSource();

        gcp snapType();

        String storyFilterId();

        String storyId();

        long storyRowId();

        String storyUsername();

        String thumbnailIv();

        String thumbnailUrl();

        long timestamp();

        long totalViewCount();

        String unlockablesSnapInfo();

        String userId();

        String username();

        String venueId();

        Boolean viewed();

        Boolean zipped();
    }

    public interface StorySnapRecordBaseModel {
        long _id();

        String clientId();

        MessageClientStatus clientStatus();

        long durationInMs();

        StoryKind kind();

        String mediaId();

        String mediaKey();

        String snapId();

        long snapRowId();

        gcp snapType();

        String storyId();

        long timestamp();
    }

    public interface SelectStorySnapForPlayingBySnapRowIdModel {
        long _id();

        String animatedSnapType();

        String attributedUserDisplayName();

        Integer brandFriendliness();

        String captionTextDisplay();

        String clientId();

        MessageClientStatus clientStatus();

        String contextHint();

        Long creationTimestamp();

        String creativeKitSourceAppName();

        String creativeKitSourceAppOAuthClientId();

        String displayName();

        long durationInMs();

        String encryptedGeoLoggingData();

        Long expirationTimestamp();

        String filterId();

        String filterLensId();

        String flushableId();

        FriendLinkType friendLinkType();

        GroupStoryType groupStoryType();

        boolean isInfiniteDuration();

        Boolean isLocal();

        Boolean isOfficialStory();

        Boolean isPublic();

        StoryKind kind();

        String largeThumbnailUrl();

        String lensMetadata();

        String mediaD2sUrl();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        boolean needAuth();

        String ruleFileParams();

        String serverRankingId();

        String snapAttachmentUrl();

        String snapId();

        long snapRowId();

        Integer snapSource();

        gcp snapType();

        String storyFilterId();

        String storyId();

        long storyRowId();

        String storyUsername();

        String thumbnailIv();

        String thumbnailUrl();

        long timestamp();

        long totalViewCount();

        String unlockablesSnapInfo();

        String userId();

        String username();

        String venueId();

        Boolean viewed();

        Boolean zipped();
    }

    public interface SelectStorySnapsForPlayingModel {
        long _id();

        String animatedSnapType();

        String attributedUserDisplayName();

        Integer brandFriendliness();

        String captionTextDisplay();

        String clientId();

        MessageClientStatus clientStatus();

        String contextHint();

        Long creationTimestamp();

        String creativeKitSourceAppName();

        String creativeKitSourceAppOAuthClientId();

        String displayName();

        long durationInMs();

        String encryptedGeoLoggingData();

        Long expirationTimestamp();

        String filterId();

        String filterLensId();

        String flushableId();

        FriendLinkType friendLinkType();

        GroupStoryType groupStoryType();

        boolean isInfiniteDuration();

        Boolean isLocal();

        Boolean isOfficialStory();

        Boolean isPublic();

        StoryKind kind();

        String largeThumbnailUrl();

        String lensMetadata();

        String mediaD2sUrl();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        boolean needAuth();

        String ruleFileParams();

        String serverRankingId();

        String snapAttachmentUrl();

        String snapId();

        long snapRowId();

        Integer snapSource();

        gcp snapType();

        String storyFilterId();

        String storyId();

        long storyRowId();

        String storyUsername();

        String thumbnailIv();

        String thumbnailUrl();

        long timestamp();

        long totalViewCount();

        String unlockablesSnapInfo();

        String userId();

        String username();

        String venueId();

        Boolean viewed();

        Boolean zipped();
    }

    public interface SelectStorySnapForThumbnailByStoryRowIdModel {
        String clientId();

        MessageClientStatus clientStatus();

        String displayName();

        StoryKind kind();

        String largeThumbnailUrl();

        String mediaId();

        String mediaKey();

        boolean needAuth();

        String snapId();

        String storyId();

        long storyRowId();

        String thumbnailIv();

        String thumbnailUrl();

        long timestamp();

        Boolean viewed();
    }

    public interface GetDownloadDataForStorySnapModel {
        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        String ruleFileParams();

        String snapId();

        gcp snapType();
    }

    public static final class SelectStorySnapsMapper<T extends SelectStorySnapsModel, T1 extends StorySnapModel, T2 extends SnapModel, T3 extends StoryModel> implements ainw<T> {
        private final SelectStorySnapsCreator<T> creator;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T3> storyModelFactory;
        private final Factory<T1> storySnapModelFactory;

        public SelectStorySnapsMapper(SelectStorySnapsCreator<T> selectStorySnapsCreator, Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, com.snap.core.db.record.StoryModel.Factory<T3> factory3) {
            this.creator = selectStorySnapsCreator;
            this.storySnapModelFactory = factory;
            this.snapModelFactory = factory2;
            this.storyModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectStorySnapsCreator selectStorySnapsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            String string2 = cursor2.getString(2);
            if (cursor2.isNull(3)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(3) == 1);
            }
            return selectStorySnapsCreator.create(j, string, string2, bool, cursor2.getLong(4), cursor2.isNull(5) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(5))), cursor2.getString(6), cursor2.getLong(7), (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(8))), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.isNull(12) ? null : cursor2.getString(12), cursor2.getLong(13), cursor2.getInt(14) == 1, cursor2.getLong(15), cursor2.getLong(16), cursor2.getLong(17), cursor2.isNull(18) ? null : (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(18))), cursor2.isNull(19) ? null : cursor2.getString(19));
        }
    }

    public static final class SelectStorySnapsForPlayingMapper<T extends SelectStorySnapsForPlayingModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel, T4 extends StorySnapModel> implements ainw<T> {
        private final SelectStorySnapsForPlayingCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T3> friendModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T4> storySnapModelFactory;

        public SelectStorySnapsForPlayingMapper(SelectStorySnapsForPlayingCreator<T> selectStorySnapsForPlayingCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3, Factory<T4> factory4) {
            this.creator = selectStorySnapsForPlayingCreator;
            this.snapModelFactory = factory;
            this.storyModelFactory = factory2;
            this.friendModelFactory = factory3;
            this.storySnapModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Cursor cursor2 = cursor;
            SelectStorySnapsForPlayingCreator selectStorySnapsForPlayingCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string6 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string7 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string8 = cursor2.isNull(9) ? null : cursor2.getString(9);
            long j2 = cursor2.getLong(10);
            long j3 = cursor2.getLong(11);
            boolean z = cursor2.getInt(12) == 1;
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            String string9 = cursor2.isNull(14) ? null : cursor2.getString(14);
            boolean z2 = cursor2.getInt(15) == 1;
            if (cursor2.isNull(16)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            String string10 = cursor2.isNull(17) ? null : cursor2.getString(17);
            String string11 = cursor2.isNull(18) ? null : cursor2.getString(18);
            String string12 = cursor2.isNull(19) ? null : cursor2.getString(19);
            String string13 = cursor2.isNull(20) ? null : cursor2.getString(20);
            String string14 = cursor2.isNull(21) ? null : cursor2.getString(21);
            String string15 = cursor2.isNull(22) ? null : cursor2.getString(22);
            if (cursor2.isNull(23)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(23) == 1);
            }
            String string16 = cursor2.isNull(24) ? null : cursor2.getString(24);
            if (cursor2.isNull(25)) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(cursor2.getInt(25) == 1);
            }
            Long valueOf = cursor2.isNull(26) ? null : Long.valueOf(cursor2.getLong(26));
            long j4 = cursor2.getLong(27);
            String string17 = cursor2.isNull(28) ? null : cursor2.getString(28);
            String string18 = cursor2.isNull(29) ? null : cursor2.getString(29);
            long j5 = cursor2.getLong(30);
            String string19 = cursor2.getString(31);
            if (cursor2.isNull(32)) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(cursor2.getInt(32) == 1);
            }
            return selectStorySnapsForPlayingCreator.create(j, string, string2, string3, string4, gcp, string5, string6, string7, string8, j2, j3, z, bool, string9, z2, bool2, string10, string11, string12, string13, string14, string15, bool3, string16, bool4, valueOf, j4, string17, string18, j5, string19, bool5, cursor2.isNull(33) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(33))), cursor2.isNull(34) ? null : cursor2.getString(34), cursor2.isNull(35) ? null : cursor2.getString(35), cursor2.isNull(36) ? null : cursor2.getString(36), cursor2.isNull(37) ? null : cursor2.getString(37), cursor2.isNull(38) ? null : cursor2.getString(38), cursor2.isNull(39) ? null : cursor2.getString(39), cursor2.isNull(40) ? null : cursor2.getString(40), cursor2.isNull(41) ? null : cursor2.getString(41), cursor2.isNull(42) ? null : Integer.valueOf(cursor2.getInt(42)), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(43))), cursor2.isNull(44) ? null : cursor2.getString(44), cursor2.isNull(45) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(45))), cursor2.getLong(46), cursor2.isNull(47) ? null : Integer.valueOf(cursor2.getInt(47)), cursor2.isNull(48) ? null : Long.valueOf(cursor2.getLong(48)), cursor2.isNull(49) ? null : cursor2.getString(49), cursor2.isNull(50) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(50))), cursor2.isNull(51) ? null : cursor2.getString(51), cursor2.isNull(52) ? null : cursor2.getString(52), cursor2.isNull(53) ? null : cursor2.getString(53));
        }
    }

    public static final class SelectFriendStorySnapsForPlayingMapper<T extends SelectFriendStorySnapsForPlayingModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel, T4 extends StorySnapModel> implements ainw<T> {
        private final SelectFriendStorySnapsForPlayingCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T3> friendModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T4> storySnapModelFactory;

        public SelectFriendStorySnapsForPlayingMapper(SelectFriendStorySnapsForPlayingCreator<T> selectFriendStorySnapsForPlayingCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3, Factory<T4> factory4) {
            this.creator = selectFriendStorySnapsForPlayingCreator;
            this.snapModelFactory = factory;
            this.storyModelFactory = factory2;
            this.friendModelFactory = factory3;
            this.storySnapModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Cursor cursor2 = cursor;
            SelectFriendStorySnapsForPlayingCreator selectFriendStorySnapsForPlayingCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string6 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string7 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string8 = cursor2.isNull(9) ? null : cursor2.getString(9);
            long j2 = cursor2.getLong(10);
            long j3 = cursor2.getLong(11);
            boolean z = cursor2.getInt(12) == 1;
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            String string9 = cursor2.isNull(14) ? null : cursor2.getString(14);
            boolean z2 = cursor2.getInt(15) == 1;
            if (cursor2.isNull(16)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            String string10 = cursor2.isNull(17) ? null : cursor2.getString(17);
            String string11 = cursor2.isNull(18) ? null : cursor2.getString(18);
            String string12 = cursor2.isNull(19) ? null : cursor2.getString(19);
            String string13 = cursor2.isNull(20) ? null : cursor2.getString(20);
            String string14 = cursor2.isNull(21) ? null : cursor2.getString(21);
            String string15 = cursor2.isNull(22) ? null : cursor2.getString(22);
            if (cursor2.isNull(23)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(23) == 1);
            }
            String string16 = cursor2.isNull(24) ? null : cursor2.getString(24);
            if (cursor2.isNull(25)) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(cursor2.getInt(25) == 1);
            }
            Long valueOf = cursor2.isNull(26) ? null : Long.valueOf(cursor2.getLong(26));
            long j4 = cursor2.getLong(27);
            String string17 = cursor2.isNull(28) ? null : cursor2.getString(28);
            String string18 = cursor2.isNull(29) ? null : cursor2.getString(29);
            long j5 = cursor2.getLong(30);
            String string19 = cursor2.getString(31);
            if (cursor2.isNull(32)) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(cursor2.getInt(32) == 1);
            }
            return selectFriendStorySnapsForPlayingCreator.create(j, string, string2, string3, string4, gcp, string5, string6, string7, string8, j2, j3, z, bool, string9, z2, bool2, string10, string11, string12, string13, string14, string15, bool3, string16, bool4, valueOf, j4, string17, string18, j5, string19, bool5, cursor2.isNull(33) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(33))), cursor2.isNull(34) ? null : cursor2.getString(34), cursor2.isNull(35) ? null : cursor2.getString(35), cursor2.isNull(36) ? null : cursor2.getString(36), cursor2.isNull(37) ? null : cursor2.getString(37), cursor2.isNull(38) ? null : cursor2.getString(38), cursor2.isNull(39) ? null : cursor2.getString(39), cursor2.isNull(40) ? null : cursor2.getString(40), cursor2.isNull(41) ? null : cursor2.getString(41), cursor2.isNull(42) ? null : Integer.valueOf(cursor2.getInt(42)), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(43))), cursor2.isNull(44) ? null : cursor2.getString(44), cursor2.isNull(45) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(45))), cursor2.getLong(46), cursor2.isNull(47) ? null : Integer.valueOf(cursor2.getInt(47)), cursor2.isNull(48) ? null : Long.valueOf(cursor2.getLong(48)), cursor2.isNull(49) ? null : cursor2.getString(49), cursor2.isNull(50) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(50))), cursor2.isNull(51) ? null : cursor2.getString(51), cursor2.isNull(52) ? null : cursor2.getString(52), cursor2.isNull(53) ? null : cursor2.getString(53));
        }
    }

    public static final class SelectStorySnapForPlayingBySnapRowIdMapper<T extends SelectStorySnapForPlayingBySnapRowIdModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel, T4 extends StorySnapModel> implements ainw<T> {
        private final SelectStorySnapForPlayingBySnapRowIdCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T3> friendModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T4> storySnapModelFactory;

        public SelectStorySnapForPlayingBySnapRowIdMapper(SelectStorySnapForPlayingBySnapRowIdCreator<T> selectStorySnapForPlayingBySnapRowIdCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3, Factory<T4> factory4) {
            this.creator = selectStorySnapForPlayingBySnapRowIdCreator;
            this.snapModelFactory = factory;
            this.storyModelFactory = factory2;
            this.friendModelFactory = factory3;
            this.storySnapModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Cursor cursor2 = cursor;
            SelectStorySnapForPlayingBySnapRowIdCreator selectStorySnapForPlayingBySnapRowIdCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string6 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string7 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string8 = cursor2.isNull(9) ? null : cursor2.getString(9);
            long j2 = cursor2.getLong(10);
            long j3 = cursor2.getLong(11);
            boolean z = cursor2.getInt(12) == 1;
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            String string9 = cursor2.isNull(14) ? null : cursor2.getString(14);
            boolean z2 = cursor2.getInt(15) == 1;
            if (cursor2.isNull(16)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            String string10 = cursor2.isNull(17) ? null : cursor2.getString(17);
            String string11 = cursor2.isNull(18) ? null : cursor2.getString(18);
            String string12 = cursor2.isNull(19) ? null : cursor2.getString(19);
            String string13 = cursor2.isNull(20) ? null : cursor2.getString(20);
            String string14 = cursor2.isNull(21) ? null : cursor2.getString(21);
            String string15 = cursor2.isNull(22) ? null : cursor2.getString(22);
            if (cursor2.isNull(23)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(23) == 1);
            }
            String string16 = cursor2.isNull(24) ? null : cursor2.getString(24);
            if (cursor2.isNull(25)) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(cursor2.getInt(25) == 1);
            }
            Long valueOf = cursor2.isNull(26) ? null : Long.valueOf(cursor2.getLong(26));
            long j4 = cursor2.getLong(27);
            String string17 = cursor2.isNull(28) ? null : cursor2.getString(28);
            String string18 = cursor2.isNull(29) ? null : cursor2.getString(29);
            long j5 = cursor2.getLong(30);
            String string19 = cursor2.getString(31);
            if (cursor2.isNull(32)) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(cursor2.getInt(32) == 1);
            }
            return selectStorySnapForPlayingBySnapRowIdCreator.create(j, string, string2, string3, string4, gcp, string5, string6, string7, string8, j2, j3, z, bool, string9, z2, bool2, string10, string11, string12, string13, string14, string15, bool3, string16, bool4, valueOf, j4, string17, string18, j5, string19, bool5, cursor2.isNull(33) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(33))), cursor2.isNull(34) ? null : cursor2.getString(34), cursor2.isNull(35) ? null : cursor2.getString(35), cursor2.isNull(36) ? null : cursor2.getString(36), cursor2.isNull(37) ? null : cursor2.getString(37), cursor2.isNull(38) ? null : cursor2.getString(38), cursor2.isNull(39) ? null : cursor2.getString(39), cursor2.isNull(40) ? null : cursor2.getString(40), cursor2.isNull(41) ? null : cursor2.getString(41), cursor2.isNull(42) ? null : Integer.valueOf(cursor2.getInt(42)), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(43))), cursor2.isNull(44) ? null : cursor2.getString(44), cursor2.isNull(45) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(45))), cursor2.getLong(46), cursor2.isNull(47) ? null : Integer.valueOf(cursor2.getInt(47)), cursor2.isNull(48) ? null : Long.valueOf(cursor2.getLong(48)), cursor2.isNull(49) ? null : cursor2.getString(49), cursor2.isNull(50) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(50))), cursor2.isNull(51) ? null : cursor2.getString(51), cursor2.isNull(52) ? null : cursor2.getString(52), cursor2.isNull(53) ? null : cursor2.getString(53));
        }
    }

    public static final class SelectStorySnapViewReportingInfoMapper<T extends SelectStorySnapViewReportingInfoModel, T1 extends StoryModel, T2 extends FriendModel> implements ainw<T> {
        private final SelectStorySnapViewReportingInfoCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T2> friendModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T1> storyModelFactory;

        public SelectStorySnapViewReportingInfoMapper(SelectStorySnapViewReportingInfoCreator<T> selectStorySnapViewReportingInfoCreator, com.snap.core.db.record.StoryModel.Factory<T1> factory, com.snap.core.db.record.FriendModel.Factory<T2> factory2) {
            this.creator = selectStorySnapViewReportingInfoCreator;
            this.storyModelFactory = factory;
            this.friendModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            SelectStorySnapViewReportingInfoCreator selectStorySnapViewReportingInfoCreator = this.creator;
            boolean z = false;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            if (cursor.isNull(1)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor.getInt(1) == 1);
            }
            if (cursor.isNull(2)) {
                bool2 = null;
            } else {
                if (cursor.getInt(2) == 1) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            }
            return selectStorySnapViewReportingInfoCreator.create(string, bool, bool2, cursor.getString(3), cursor.getString(4), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor.getLong(5))), cursor.getString(6), cursor.isNull(7) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor.getLong(7))));
        }
    }

    public static final class SelectStorySnapForThumbnailByUsernameMapper<T extends SelectStorySnapForThumbnailByUsernameModel, T1 extends StorySnapModel, T2 extends StoryModel> implements ainw<T> {
        private final SelectStorySnapForThumbnailByUsernameCreator<T> creator;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T1> storySnapModelFactory;

        public SelectStorySnapForThumbnailByUsernameMapper(SelectStorySnapForThumbnailByUsernameCreator<T> selectStorySnapForThumbnailByUsernameCreator, Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2) {
            this.creator = selectStorySnapForThumbnailByUsernameCreator;
            this.storySnapModelFactory = factory;
            this.storyModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            SelectStorySnapForThumbnailByUsernameCreator selectStorySnapForThumbnailByUsernameCreator = this.creator;
            boolean z = false;
            String string = cursor2.getString(0);
            if (cursor2.getInt(1) == 1) {
                z = true;
            }
            return selectStorySnapForThumbnailByUsernameCreator.create(string, z, cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(5))), cursor2.getLong(6), cursor2.getString(7), cursor2.getLong(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.getString(11), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(12))), cursor2.isNull(13) ? null : cursor2.getString(13));
        }
    }

    public static final class SelectStorySnapForThumbnailByStoryRowIdMapper<T extends SelectStorySnapForThumbnailByStoryRowIdModel, T1 extends StorySnapModel, T2 extends StoryModel> implements ainw<T> {
        private final SelectStorySnapForThumbnailByStoryRowIdCreator<T> creator;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T1> storySnapModelFactory;

        public SelectStorySnapForThumbnailByStoryRowIdMapper(SelectStorySnapForThumbnailByStoryRowIdCreator<T> selectStorySnapForThumbnailByStoryRowIdCreator, Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2) {
            this.creator = selectStorySnapForThumbnailByStoryRowIdCreator;
            this.storySnapModelFactory = factory;
            this.storyModelFactory = factory2;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Cursor cursor2 = cursor;
            SelectStorySnapForThumbnailByStoryRowIdCreator selectStorySnapForThumbnailByStoryRowIdCreator = this.creator;
            boolean z = false;
            String string = cursor2.getString(0);
            boolean z2 = cursor2.getInt(1) == 1;
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.isNull(3) ? null : cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            MessageClientStatus messageClientStatus = cursor2.isNull(5) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            long j = cursor2.getLong(6);
            if (cursor2.isNull(7)) {
                bool = null;
            } else {
                if (cursor2.getInt(7) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return selectStorySnapForThumbnailByStoryRowIdCreator.create(string, z2, string2, string3, string4, messageClientStatus, j, bool, cursor2.getString(8), cursor2.getLong(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.getString(12), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(13))), cursor2.isNull(14) ? null : cursor2.getString(14));
        }
    }

    public static final class SelectFriendStorySnapForThumbnailMapper<T extends SelectFriendStorySnapForThumbnailModel> implements ainw<T> {
        private final SelectFriendStorySnapForThumbnailCreator<T> creator;

        public SelectFriendStorySnapForThumbnailMapper(SelectFriendStorySnapForThumbnailCreator<T> selectFriendStorySnapForThumbnailCreator) {
            this.creator = selectFriendStorySnapForThumbnailCreator;
        }

        public final T map(Cursor cursor) {
            SelectFriendStorySnapForThumbnailCreator selectFriendStorySnapForThumbnailCreator = this.creator;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            boolean z = true;
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            String string3 = cursor.isNull(2) ? null : cursor.getString(2);
            if (cursor.getInt(3) != 1) {
                z = false;
            }
            return selectFriendStorySnapForThumbnailCreator.create(string, string2, string3, z, cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : cursor.getString(6));
        }
    }

    public static final class GetThumbnailForStorySnapMapper<T extends GetThumbnailForStorySnapModel> implements ainw<T> {
        private final GetThumbnailForStorySnapCreator<T> creator;

        public GetThumbnailForStorySnapMapper(GetThumbnailForStorySnapCreator<T> getThumbnailForStorySnapCreator) {
            this.creator = getThumbnailForStorySnapCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            GetThumbnailForStorySnapCreator getThumbnailForStorySnapCreator = this.creator;
            boolean z = false;
            String string = cursor.getString(0);
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            String string3 = cursor.isNull(2) ? null : cursor.getString(2);
            String string4 = cursor.isNull(3) ? null : cursor.getString(3);
            String string5 = cursor.isNull(4) ? null : cursor.getString(4);
            boolean z2 = cursor.getInt(5) == 1;
            String string6 = cursor.isNull(6) ? null : cursor.getString(6);
            if (cursor.isNull(7)) {
                bool = null;
            } else {
                if (cursor.getInt(7) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return getThumbnailForStorySnapCreator.create(string, string2, string3, string4, string5, z2, string6, bool);
        }
    }

    public static final class GetDownloadDataForStorySnapMapper<T extends GetDownloadDataForStorySnapModel, T1 extends SnapModel> implements ainw<T> {
        private final GetDownloadDataForStorySnapCreator<T> creator;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;

        public GetDownloadDataForStorySnapMapper(GetDownloadDataForStorySnapCreator<T> getDownloadDataForStorySnapCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory) {
            this.creator = getDownloadDataForStorySnapCreator;
            this.snapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.isNull(1) ? null : cursor.getString(1), (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : cursor.getString(6));
        }
    }

    public static final class GetPendingStorySnapRowIdsMapper<T extends GetPendingStorySnapRowIdsModel> implements ainw<T> {
        private final GetPendingStorySnapRowIdsCreator<T> creator;

        public GetPendingStorySnapRowIdsMapper(GetPendingStorySnapRowIdsCreator<T> getPendingStorySnapRowIdsCreator) {
            this.creator = getPendingStorySnapRowIdsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getLong(1));
        }
    }

    public static final class SelectSnapDataForDeletionMapper<T extends SelectSnapDataForDeletionModel, T1 extends StorySnapModel> implements ainw<T> {
        private final SelectSnapDataForDeletionCreator<T> creator;
        private final Factory<T1> storySnapModelFactory;

        public SelectSnapDataForDeletionMapper(SelectSnapDataForDeletionCreator<T> selectSnapDataForDeletionCreator, Factory<T1> factory) {
            this.creator = selectSnapDataForDeletionCreator;
            this.storySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getLong(1), cursor.getString(2), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), cursor.getLong(4), cursor.isNull(5) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor.getLong(5))));
        }
    }

    public static final class GetBrandFriendlinessByStoryIdsMapper<T extends GetBrandFriendlinessByStoryIdsModel> implements ainw<T> {
        private final GetBrandFriendlinessByStoryIdsCreator<T> creator;

        public GetBrandFriendlinessByStoryIdsMapper(GetBrandFriendlinessByStoryIdsCreator<T> getBrandFriendlinessByStoryIdsCreator) {
            this.creator = getBrandFriendlinessByStoryIdsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getString(1), cursor.isNull(2) ? null : Integer.valueOf(cursor.getInt(2)));
        }
    }

    public static final class StorySnapDumpMapper<T extends StorySnapDumpModel> implements ainw<T> {
        private final StorySnapDumpCreator<T> creator;

        public StorySnapDumpMapper(StorySnapDumpCreator<T> storySnapDumpCreator) {
            this.creator = storySnapDumpCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            StorySnapDumpCreator storySnapDumpCreator = this.creator;
            boolean z = false;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            long j = cursor.getLong(1);
            String string2 = cursor.isNull(2) ? null : cursor.getString(2);
            if (cursor.isNull(3)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor.getInt(3) == 1);
            }
            Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
            String string3 = cursor.isNull(5) ? null : cursor.getString(5);
            if (cursor.isNull(6)) {
                bool2 = null;
            } else {
                if (cursor.getInt(6) == 1) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            }
            return storySnapDumpCreator.create(string, j, string2, bool, valueOf, string3, bool2, cursor.isNull(7) ? null : Long.valueOf(cursor.getLong(7)));
        }
    }

    public static final class GetStoryManagementStoriesMetadataMapper<T extends GetStoryManagementStoriesMetadataModel, T1 extends StorySnapModel, T2 extends StoryModel, T3 extends MobStoryMetadataModel> implements ainw<T> {
        private final GetStoryManagementStoriesMetadataCreator<T> creator;
        private final com.snap.core.db.record.MobStoryMetadataModel.Factory<T3> mobStoryMetadataModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T1> storySnapModelFactory;

        public GetStoryManagementStoriesMetadataMapper(GetStoryManagementStoriesMetadataCreator<T> getStoryManagementStoriesMetadataCreator, Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.MobStoryMetadataModel.Factory<T3> factory3) {
            this.creator = getStoryManagementStoriesMetadataCreator;
            this.storySnapModelFactory = factory;
            this.storyModelFactory = factory2;
            this.mobStoryMetadataModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Long l;
            ageb ageb;
            ageb ageb2;
            agec agec;
            Cursor cursor2 = cursor;
            GetStoryManagementStoriesMetadataCreator getStoryManagementStoriesMetadataCreator = this.creator;
            String string = cursor2.isNull(0) ? null : cursor2.getString(0);
            MessageClientStatus messageClientStatus = cursor2.isNull(1) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(1)));
            long j = cursor2.getLong(2);
            long j2 = cursor2.getLong(3);
            long j3 = cursor2.getLong(4);
            String string2 = cursor2.getString(5);
            StoryKind storyKind = (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            String string3 = cursor2.isNull(7) ? null : cursor2.getString(7);
            Long valueOf = cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8));
            if (cursor2.isNull(9)) {
                l = valueOf;
                ageb = null;
            } else {
                l = valueOf;
                ageb = (ageb) this.mobStoryMetadataModelFactory.storyTypeAdapter.decode(Long.valueOf(cursor2.getLong(9)));
            }
            String string4 = cursor2.isNull(10) ? null : cursor2.getString(10);
            if (cursor2.isNull(11)) {
                ageb2 = ageb;
                agec = null;
            } else {
                ageb2 = ageb;
                agec = (agec) this.mobStoryMetadataModelFactory.typeExtraDataAdapter.decode(cursor2.getBlob(11));
            }
            return getStoryManagementStoriesMetadataCreator.create(string, messageClientStatus, j, j2, j3, string2, storyKind, string3, l, ageb2, string4, agec, cursor2.isNull(12) ? null : cursor2.getString(12), cursor2.getLong(13), cursor2.getLong(14));
        }
    }

    public static final class GetStoryManagementStorySnapsMapper<T extends GetStoryManagementStorySnapsModel, T1 extends StorySnapModel, T2 extends SnapModel, T3 extends StoryModel> implements ainw<T> {
        private final GetStoryManagementStorySnapsCreator<T> creator;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T3> storyModelFactory;
        private final Factory<T1> storySnapModelFactory;

        public GetStoryManagementStorySnapsMapper(GetStoryManagementStorySnapsCreator<T> getStoryManagementStorySnapsCreator, Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, com.snap.core.db.record.StoryModel.Factory<T3> factory3) {
            this.creator = getStoryManagementStorySnapsCreator;
            this.storySnapModelFactory = factory;
            this.snapModelFactory = factory2;
            this.storyModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            GetStoryManagementStorySnapsCreator getStoryManagementStorySnapsCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.isNull(1) ? null : cursor2.getString(1);
            String string2 = cursor2.getString(2);
            if (cursor2.isNull(3)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(3) == 1);
            }
            MessageClientStatus messageClientStatus = cursor2.isNull(4) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(4)));
            String string3 = cursor2.isNull(5) ? null : cursor2.getString(5);
            long j2 = cursor2.getLong(6);
            String string4 = cursor2.getString(7);
            long j3 = cursor2.getLong(8);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(9)));
            String string5 = cursor2.isNull(10) ? null : cursor2.getString(10);
            String string6 = cursor2.isNull(11) ? null : cursor2.getString(11);
            String string7 = cursor2.isNull(12) ? null : cursor2.getString(12);
            String string8 = cursor2.isNull(13) ? null : cursor2.getString(13);
            long j4 = cursor2.getLong(14);
            boolean z = cursor2.getInt(15) == 1;
            long j5 = cursor2.getLong(16);
            if (cursor2.isNull(17)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(17) == 1);
            }
            return getStoryManagementStorySnapsCreator.create(j, string, string2, bool, messageClientStatus, string3, j2, string4, j3, gcp, string5, string6, string7, string8, j4, z, j5, bool2, cursor2.isNull(18) ? null : cursor2.getString(18), cursor2.getLong(19), cursor2.getLong(20), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(21))), cursor2.getString(22));
        }
    }

    public static final class GetStoryManagementStorySnapsForPlayingMapper<T extends GetStoryManagementStorySnapsForPlayingModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel, T4 extends StorySnapModel> implements ainw<T> {
        private final GetStoryManagementStorySnapsForPlayingCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T3> friendModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T4> storySnapModelFactory;

        public GetStoryManagementStorySnapsForPlayingMapper(GetStoryManagementStorySnapsForPlayingCreator<T> getStoryManagementStorySnapsForPlayingCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3, Factory<T4> factory4) {
            this.creator = getStoryManagementStorySnapsForPlayingCreator;
            this.snapModelFactory = factory;
            this.storyModelFactory = factory2;
            this.friendModelFactory = factory3;
            this.storySnapModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Cursor cursor2 = cursor;
            GetStoryManagementStorySnapsForPlayingCreator getStoryManagementStorySnapsForPlayingCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string6 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string7 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string8 = cursor2.isNull(9) ? null : cursor2.getString(9);
            long j2 = cursor2.getLong(10);
            long j3 = cursor2.getLong(11);
            boolean z = cursor2.getInt(12) == 1;
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            String string9 = cursor2.isNull(14) ? null : cursor2.getString(14);
            boolean z2 = cursor2.getInt(15) == 1;
            if (cursor2.isNull(16)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            String string10 = cursor2.isNull(17) ? null : cursor2.getString(17);
            String string11 = cursor2.isNull(18) ? null : cursor2.getString(18);
            String string12 = cursor2.isNull(19) ? null : cursor2.getString(19);
            String string13 = cursor2.isNull(20) ? null : cursor2.getString(20);
            String string14 = cursor2.isNull(21) ? null : cursor2.getString(21);
            String string15 = cursor2.isNull(22) ? null : cursor2.getString(22);
            if (cursor2.isNull(23)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(23) == 1);
            }
            String string16 = cursor2.isNull(24) ? null : cursor2.getString(24);
            if (cursor2.isNull(25)) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(cursor2.getInt(25) == 1);
            }
            Long valueOf = cursor2.isNull(26) ? null : Long.valueOf(cursor2.getLong(26));
            long j4 = cursor2.getLong(27);
            String string17 = cursor2.isNull(28) ? null : cursor2.getString(28);
            String string18 = cursor2.isNull(29) ? null : cursor2.getString(29);
            long j5 = cursor2.getLong(30);
            String string19 = cursor2.getString(31);
            if (cursor2.isNull(32)) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(cursor2.getInt(32) == 1);
            }
            return getStoryManagementStorySnapsForPlayingCreator.create(j, string, string2, string3, string4, gcp, string5, string6, string7, string8, j2, j3, z, bool, string9, z2, bool2, string10, string11, string12, string13, string14, string15, bool3, string16, bool4, valueOf, j4, string17, string18, j5, string19, bool5, cursor2.isNull(33) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(33))), cursor2.isNull(34) ? null : cursor2.getString(34), cursor2.isNull(35) ? null : cursor2.getString(35), cursor2.isNull(36) ? null : cursor2.getString(36), cursor2.isNull(37) ? null : cursor2.getString(37), cursor2.isNull(38) ? null : cursor2.getString(38), cursor2.isNull(39) ? null : cursor2.getString(39), cursor2.isNull(40) ? null : cursor2.getString(40), cursor2.isNull(41) ? null : cursor2.getString(41), cursor2.isNull(42) ? null : Integer.valueOf(cursor2.getInt(42)), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(43))), cursor2.isNull(44) ? null : cursor2.getString(44), cursor2.isNull(45) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(45))), cursor2.getLong(46), cursor2.getLong(47), cursor2.isNull(48) ? null : Integer.valueOf(cursor2.getInt(48)), cursor2.isNull(49) ? null : Long.valueOf(cursor2.getLong(49)), cursor2.isNull(50) ? null : cursor2.getString(50), cursor2.isNull(51) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(51))), cursor2.isNull(52) ? null : cursor2.getString(52), cursor2.isNull(53) ? null : cursor2.getString(53), cursor2.isNull(54) ? null : cursor2.getString(54));
        }
    }

    public static final class SelectLocallyPersistedPostedFieldsMapper<T extends SelectLocallyPersistedPostedFieldsModel> implements ainw<T> {
        private final SelectLocallyPersistedPostedFieldsCreator<T> creator;

        public SelectLocallyPersistedPostedFieldsMapper(SelectLocallyPersistedPostedFieldsCreator<T> selectLocallyPersistedPostedFieldsCreator) {
            this.creator = selectLocallyPersistedPostedFieldsCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            SelectLocallyPersistedPostedFieldsCreator selectLocallyPersistedPostedFieldsCreator = this.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            if (cursor.isNull(2)) {
                bool = null;
            } else {
                if (cursor.getInt(2) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return selectLocallyPersistedPostedFieldsCreator.create(j, string, bool, cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)));
        }
    }

    public static final class GetUpdatedTimestampsAndViewStatusForStoryRowIdMapper<T extends GetUpdatedTimestampsAndViewStatusForStoryRowIdModel> implements ainw<T> {
        private final GetUpdatedTimestampsAndViewStatusForStoryRowIdCreator<T> creator;

        public GetUpdatedTimestampsAndViewStatusForStoryRowIdMapper(GetUpdatedTimestampsAndViewStatusForStoryRowIdCreator<T> getUpdatedTimestampsAndViewStatusForStoryRowIdCreator) {
            this.creator = getUpdatedTimestampsAndViewStatusForStoryRowIdCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            GetUpdatedTimestampsAndViewStatusForStoryRowIdCreator getUpdatedTimestampsAndViewStatusForStoryRowIdCreator = this.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            long j2 = cursor.getLong(1);
            Long valueOf = cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2));
            if (cursor.isNull(3)) {
                bool = null;
            } else {
                if (cursor.getInt(3) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return getUpdatedTimestampsAndViewStatusForStoryRowIdCreator.create(j, j2, valueOf, bool);
        }
    }

    public static final class GetRowIdAndViewedByStoryRowIdClientIdMapper<T extends GetRowIdAndViewedByStoryRowIdClientIdModel> implements ainw<T> {
        private final GetRowIdAndViewedByStoryRowIdClientIdCreator<T> creator;

        public GetRowIdAndViewedByStoryRowIdClientIdMapper(GetRowIdAndViewedByStoryRowIdClientIdCreator<T> getRowIdAndViewedByStoryRowIdClientIdCreator) {
            this.creator = getRowIdAndViewedByStoryRowIdClientIdCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            GetRowIdAndViewedByStoryRowIdClientIdCreator getRowIdAndViewedByStoryRowIdClientIdCreator = this.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.isNull(1)) {
                bool = null;
            } else {
                if (cursor.getInt(1) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return getRowIdAndViewedByStoryRowIdClientIdCreator.create(j, bool);
        }
    }

    public static final class SelectStoryManagementChromeDataMapper<T extends SelectStoryManagementChromeDataModel, T1 extends StorySnapModel> implements ainw<T> {
        private final SelectStoryManagementChromeDataCreator<T> creator;
        private final Factory<T1> storySnapModelFactory;

        public SelectStoryManagementChromeDataMapper(SelectStoryManagementChromeDataCreator<T> selectStoryManagementChromeDataCreator, Factory<T1> factory) {
            this.creator = selectStoryManagementChromeDataCreator;
            this.storySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor.getLong(1))), cursor.getString(2));
        }
    }

    public interface GetBrandFriendlinessByStoryIdsModel {
        Integer brandFriendliness();

        String snapId();

        String storyId();
    }

    public interface GetLargeThumbnailForStorySnapCreator<T extends GetLargeThumbnailForStorySnapModel> {
        T create(String str, String str2, String str3, boolean z, String str4, Boolean bool);
    }

    public interface GetLargeThumbnailForStorySnapModel {
        String largeThumbnailUrl();

        String mediaId();

        String mediaKey();

        boolean needAuth();

        String thumbnailIv();

        Boolean viewed();
    }

    public interface GetPendingStorySnapRowIdsModel {
        long id();

        long snapRowId();
    }

    public interface GetRowIdAndViewedByStoryRowIdClientIdModel {
        long _id();

        Boolean viewed();
    }

    public interface GetStoryManagementStoriesMetadataModel {
        String clientId();

        MessageClientStatus clientStatus();

        String creatorUsername();

        String displayName();

        long failedToAddCount();

        StoryKind kind();

        long maxViewCount();

        String storyId();

        long storyRowId();

        ageb storyType();

        String subText();

        long totalScreenshotCount();

        agec typeExtraData();

        Long viewed();

        long waitingToAddCount();
    }

    public interface GetStoryManagementStorySnapsForPlayingModel {
        long _id();

        String animatedSnapType();

        String attributedUserDisplayName();

        Integer brandFriendliness();

        String captionTextDisplay();

        String clientId();

        MessageClientStatus clientStatus();

        String contextHint();

        Long creationTimestamp();

        String creativeKitSourceAppName();

        String creativeKitSourceAppOAuthClientId();

        String displayName();

        long durationInMs();

        String encryptedGeoLoggingData();

        Long expirationTimestamp();

        String filterId();

        String filterLensId();

        String flushableId();

        FriendLinkType friendLinkType();

        GroupStoryType groupStoryType();

        boolean isInfiniteDuration();

        Boolean isLocal();

        Boolean isOfficialStory();

        Boolean isPublic();

        StoryKind kind();

        String largeThumbnailUrl();

        String lensMetadata();

        String mediaD2sUrl();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        boolean needAuth();

        String ruleFileParams();

        String serverRankingId();

        String snapAttachmentUrl();

        String snapId();

        long snapRowId();

        Integer snapSource();

        gcp snapType();

        String storyFilterId();

        String storyId();

        long storyRowId();

        String storyUsername();

        String thumbnailIv();

        String thumbnailUrl();

        long timestamp();

        long totalScreenshotCount();

        long totalViewCount();

        String unlockablesSnapInfo();

        String userId();

        String username();

        String venueId();

        Boolean viewed();

        Boolean zipped();
    }

    public interface GetStoryManagementStorySnapsModel {
        long _id();

        String attachmentUrl();

        String captionTextDisplay();

        String clientId();

        MessageClientStatus clientStatus();

        long durationInMs();

        boolean isInfiniteDuration();

        StoryKind kind();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        String snapId();

        long snapRowId();

        gcp snapType();

        String storyId();

        long storyRowId();

        long timestamp();

        long totalScreenshotCount();

        long totalViewCount();

        String username();

        Boolean viewed();

        Boolean zipped();
    }

    public interface GetThumbnailForStorySnapModel {
        String largeThumbnailUrl();

        String mediaId();

        String mediaKey();

        boolean needAuth();

        String snapId();

        String thumbnailIv();

        String thumbnailUrl();

        Boolean viewed();
    }

    public interface GetUpdatedTimestampsAndViewStatusForStoryRowIdModel {
        Long expirationTimestamp();

        long latestTimestamp();

        long storyRowId();

        Boolean viewed();
    }

    public interface PlayableStorySnapRecordBaseCreator<T extends PlayableStorySnapRecordBaseModel> {
        T create(long j, String str, String str2, String str3, String str4, gcp gcp, String str5, String str6, String str7, String str8, long j2, long j3, boolean z, Boolean bool, String str9, boolean z2, Boolean bool2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, Boolean bool4, Long l, long j4, String str17, String str18, long j5, String str19, Boolean bool5, GroupStoryType groupStoryType, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num, StoryKind storyKind, String str28, FriendLinkType friendLinkType, long j6, Integer num2, Long l2, String str29, MessageClientStatus messageClientStatus, String str30, String str31, String str32);
    }

    public interface SelectFriendStorySnapForThumbnailModel {
        String largeThumbnailUrl();

        String mediaId();

        String mediaKey();

        boolean needAuth();

        String snapId();

        String thumbnailIv();

        String thumbnailUrl();
    }

    public interface SelectFriendStorySnapsForPlayingModel {
        long _id();

        String animatedSnapType();

        String attributedUserDisplayName();

        Integer brandFriendliness();

        String captionTextDisplay();

        String clientId();

        MessageClientStatus clientStatus();

        String contextHint();

        Long creationTimestamp();

        String creativeKitSourceAppName();

        String creativeKitSourceAppOAuthClientId();

        String displayName();

        long durationInMs();

        String encryptedGeoLoggingData();

        Long expirationTimestamp();

        String filterId();

        String filterLensId();

        String flushableId();

        FriendLinkType friendLinkType();

        GroupStoryType groupStoryType();

        boolean isInfiniteDuration();

        Boolean isLocal();

        Boolean isOfficialStory();

        Boolean isPublic();

        StoryKind kind();

        String largeThumbnailUrl();

        String lensMetadata();

        String mediaD2sUrl();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        boolean needAuth();

        String ruleFileParams();

        String serverRankingId();

        String snapAttachmentUrl();

        String snapId();

        long snapRowId();

        Integer snapSource();

        gcp snapType();

        String storyFilterId();

        String storyId();

        long storyRowId();

        String storyUsername();

        String thumbnailIv();

        String thumbnailUrl();

        long timestamp();

        long totalViewCount();

        String unlockablesSnapInfo();

        String userId();

        String username();

        String venueId();

        Boolean viewed();

        Boolean zipped();
    }

    public interface SelectLocallyPersistedPostedFieldsModel {
        String clientId();

        Long postedTimestamp();

        long storyRowId();

        Boolean viewed();
    }

    public interface SelectSnapDataForDeletionModel {
        MessageClientStatus clientStatus();

        Long expirationTimestamp();

        String snapId();

        long snapRowId();

        long storyRowId();

        long storySnapRowId();
    }

    public interface SelectStoryManagementChromeDataModel {
        String clientId();

        MessageClientStatus clientStatus();

        long totalViewCount();
    }

    public interface SelectStorySnapViewReportingInfoModel {
        String clientId();

        String flushableId();

        FriendLinkType friendLinkType();

        Boolean isOfficialStory();

        Boolean isPublic();

        StoryKind kind();

        String snapId();

        String storyId();
    }

    public interface SelectStorySnapsModel {
        long _id();

        String clientId();

        MessageClientStatus clientStatus();

        long durationInMs();

        boolean isInfiniteDuration();

        StoryKind kind();

        String mediaId();

        String mediaIv();

        String mediaKey();

        String mediaUrl();

        String snapId();

        long snapRowId();

        gcp snapType();

        String storyId();

        long storyRowId();

        long timestamp();

        long totalScreenshotCount();

        long totalViewCount();

        String username();

        Boolean viewed();
    }

    public interface StorySnapDumpModel {
        String storyId();

        Long storyLatestExpirationTimestamp();

        Long storySnapExpirationTimestamp();

        long storySnapRowId();

        String storySnapUsername();

        Boolean storySnapViewed();

        String storyUsername();

        Boolean storyViewed();
    }

    public interface StorySnapRecordBaseCreator<T extends StorySnapRecordBaseModel> {
        T create(long j, long j2, String str, String str2, String str3, StoryKind storyKind, gcp gcp, String str4, String str5, long j3, long j4, MessageClientStatus messageClientStatus);
    }

    public static final class GetLargeThumbnailForStorySnapMapper<T extends GetLargeThumbnailForStorySnapModel> implements ainw<T> {
        private final GetLargeThumbnailForStorySnapCreator<T> creator;

        public GetLargeThumbnailForStorySnapMapper(GetLargeThumbnailForStorySnapCreator<T> getLargeThumbnailForStorySnapCreator) {
            this.creator = getLargeThumbnailForStorySnapCreator;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            GetLargeThumbnailForStorySnapCreator getLargeThumbnailForStorySnapCreator = this.creator;
            boolean z = false;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            String string2 = cursor.isNull(1) ? null : cursor.getString(1);
            String string3 = cursor.isNull(2) ? null : cursor.getString(2);
            boolean z2 = cursor.getInt(3) == 1;
            String string4 = cursor.isNull(4) ? null : cursor.getString(4);
            if (cursor.isNull(5)) {
                bool = null;
            } else {
                if (cursor.getInt(5) == 1) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return getLargeThumbnailForStorySnapCreator.create(string, string2, string3, z2, string4, bool);
        }
    }

    public static final class Mapper<T extends StorySnapModel> implements ainw<T> {
        private final Factory<T> storySnapModelFactory;

        public Mapper(Factory<T> factory) {
            this.storySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Cursor cursor2 = cursor;
            Creator creator = this.storySnapModelFactory.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            String string = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string2 = cursor2.getString(3);
            long j3 = cursor2.getLong(4);
            String string3 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string4 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string5 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string6 = cursor2.isNull(8) ? null : cursor2.getString(8);
            if (cursor2.isNull(9)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            Long valueOf = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            if (cursor2.isNull(11)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(11) == 1);
            }
            if (cursor2.isNull(12)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(12) == 1);
            }
            String string7 = cursor2.isNull(13) ? null : cursor2.getString(13);
            boolean z = cursor2.getInt(14) == 1;
            String string8 = cursor2.isNull(15) ? null : cursor2.getString(15);
            String string9 = cursor2.isNull(16) ? null : cursor2.getString(16);
            Long valueOf2 = cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17));
            Long valueOf3 = cursor2.isNull(18) ? null : Long.valueOf(cursor2.getLong(18));
            String string10 = cursor2.isNull(19) ? null : cursor2.getString(19);
            String string11 = cursor2.isNull(20) ? null : cursor2.getString(20);
            String string12 = cursor2.isNull(21) ? null : cursor2.getString(21);
            String string13 = cursor2.isNull(22) ? null : cursor2.getString(22);
            String string14 = cursor2.isNull(23) ? null : cursor2.getString(23);
            String string15 = cursor2.isNull(24) ? null : cursor2.getString(24);
            String string16 = cursor2.isNull(25) ? null : cursor2.getString(25);
            String string17 = cursor2.isNull(26) ? null : cursor2.getString(26);
            String string18 = cursor2.isNull(27) ? null : cursor2.getString(27);
            String string19 = cursor2.isNull(28) ? null : cursor2.getString(28);
            String string20 = cursor2.isNull(29) ? null : cursor2.getString(29);
            Integer valueOf4 = cursor2.isNull(30) ? null : Integer.valueOf(cursor2.getInt(30));
            MessageClientStatus messageClientStatus = cursor2.isNull(31) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(31)));
            Integer valueOf5 = cursor2.isNull(32) ? null : Integer.valueOf(cursor2.getInt(32));
            Integer valueOf6 = cursor2.isNull(33) ? null : Integer.valueOf(cursor2.getInt(33));
            Integer valueOf7 = cursor2.isNull(34) ? null : Integer.valueOf(cursor2.getInt(34));
            Integer valueOf8 = cursor2.isNull(35) ? null : Integer.valueOf(cursor2.getInt(35));
            Integer valueOf9 = cursor2.isNull(36) ? null : Integer.valueOf(cursor2.getInt(36));
            Integer valueOf10 = cursor2.isNull(37) ? null : Integer.valueOf(cursor2.getInt(37));
            Integer valueOf11 = cursor2.isNull(38) ? null : Integer.valueOf(cursor2.getInt(38));
            Integer valueOf12 = cursor2.isNull(39) ? null : Integer.valueOf(cursor2.getInt(39));
            Integer valueOf13 = cursor2.isNull(40) ? null : Integer.valueOf(cursor2.getInt(40));
            Integer valueOf14 = cursor2.isNull(41) ? null : Integer.valueOf(cursor2.getInt(41));
            if (cursor2.isNull(42)) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(cursor2.getInt(42) == 1);
            }
            return creator.create(j, j2, string, string2, j3, string3, string4, string5, string6, bool, valueOf, bool2, bool3, string7, z, string8, string9, valueOf2, valueOf3, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, valueOf4, messageClientStatus, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, bool4, cursor2.isNull(43) ? null : Long.valueOf(cursor2.getLong(43)), cursor2.isNull(44) ? null : Long.valueOf(cursor2.getLong(44)), cursor2.isNull(45) ? null : Integer.valueOf(cursor2.getInt(45)), cursor2.isNull(46) ? null : cursor2.getString(46), cursor2.isNull(47) ? null : cursor2.getString(47), cursor2.isNull(48) ? null : cursor2.getString(48));
        }
    }

    public static final class PlayableStorySnapRecordBaseMapper<T extends PlayableStorySnapRecordBaseModel, T1 extends SnapModel, T2 extends StoryModel, T3 extends FriendModel, T4 extends StorySnapModel> implements ainw<T> {
        private final PlayableStorySnapRecordBaseCreator<T> creator;
        private final com.snap.core.db.record.FriendModel.Factory<T3> friendModelFactory;
        private final com.snap.core.db.record.SnapModel.Factory<T1> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T2> storyModelFactory;
        private final Factory<T4> storySnapModelFactory;

        public PlayableStorySnapRecordBaseMapper(PlayableStorySnapRecordBaseCreator<T> playableStorySnapRecordBaseCreator, com.snap.core.db.record.SnapModel.Factory<T1> factory, com.snap.core.db.record.StoryModel.Factory<T2> factory2, com.snap.core.db.record.FriendModel.Factory<T3> factory3, Factory<T4> factory4) {
            this.creator = playableStorySnapRecordBaseCreator;
            this.snapModelFactory = factory;
            this.storyModelFactory = factory2;
            this.friendModelFactory = factory3;
            this.storySnapModelFactory = factory4;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Cursor cursor2 = cursor;
            PlayableStorySnapRecordBaseCreator playableStorySnapRecordBaseCreator = this.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.isNull(2) ? null : cursor2.getString(2);
            String string3 = cursor2.getString(3);
            String string4 = cursor2.isNull(4) ? null : cursor2.getString(4);
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            String string5 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string6 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string7 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string8 = cursor2.isNull(9) ? null : cursor2.getString(9);
            long j2 = cursor2.getLong(10);
            long j3 = cursor2.getLong(11);
            boolean z = cursor2.getInt(12) == 1;
            if (cursor2.isNull(13)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(13) == 1);
            }
            String string9 = cursor2.isNull(14) ? null : cursor2.getString(14);
            boolean z2 = cursor2.getInt(15) == 1;
            if (cursor2.isNull(16)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(16) == 1);
            }
            String string10 = cursor2.isNull(17) ? null : cursor2.getString(17);
            String string11 = cursor2.isNull(18) ? null : cursor2.getString(18);
            String string12 = cursor2.isNull(19) ? null : cursor2.getString(19);
            String string13 = cursor2.isNull(20) ? null : cursor2.getString(20);
            String string14 = cursor2.isNull(21) ? null : cursor2.getString(21);
            String string15 = cursor2.isNull(22) ? null : cursor2.getString(22);
            if (cursor2.isNull(23)) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(cursor2.getInt(23) == 1);
            }
            String string16 = cursor2.isNull(24) ? null : cursor2.getString(24);
            if (cursor2.isNull(25)) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(cursor2.getInt(25) == 1);
            }
            Long valueOf = cursor2.isNull(26) ? null : Long.valueOf(cursor2.getLong(26));
            long j4 = cursor2.getLong(27);
            String string17 = cursor2.isNull(28) ? null : cursor2.getString(28);
            String string18 = cursor2.isNull(29) ? null : cursor2.getString(29);
            long j5 = cursor2.getLong(30);
            String string19 = cursor2.getString(31);
            if (cursor2.isNull(32)) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(cursor2.getInt(32) == 1);
            }
            return playableStorySnapRecordBaseCreator.create(j, string, string2, string3, string4, gcp, string5, string6, string7, string8, j2, j3, z, bool, string9, z2, bool2, string10, string11, string12, string13, string14, string15, bool3, string16, bool4, valueOf, j4, string17, string18, j5, string19, bool5, cursor2.isNull(33) ? null : (GroupStoryType) this.storyModelFactory.groupStoryTypeAdapter.decode(Long.valueOf(cursor2.getLong(33))), cursor2.isNull(34) ? null : cursor2.getString(34), cursor2.isNull(35) ? null : cursor2.getString(35), cursor2.isNull(36) ? null : cursor2.getString(36), cursor2.isNull(37) ? null : cursor2.getString(37), cursor2.isNull(38) ? null : cursor2.getString(38), cursor2.isNull(39) ? null : cursor2.getString(39), cursor2.isNull(40) ? null : cursor2.getString(40), cursor2.isNull(41) ? null : cursor2.getString(41), cursor2.isNull(42) ? null : Integer.valueOf(cursor2.getInt(42)), (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(43))), cursor2.isNull(44) ? null : cursor2.getString(44), cursor2.isNull(45) ? null : (FriendLinkType) this.friendModelFactory.friendLinkTypeAdapter.decode(Long.valueOf(cursor2.getLong(45))), cursor2.getLong(46), cursor2.isNull(47) ? null : Integer.valueOf(cursor2.getInt(47)), cursor2.isNull(48) ? null : Long.valueOf(cursor2.getLong(48)), cursor2.isNull(49) ? null : cursor2.getString(49), cursor2.isNull(50) ? null : (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(50))), cursor2.isNull(51) ? null : cursor2.getString(51), cursor2.isNull(52) ? null : cursor2.getString(52), cursor2.isNull(53) ? null : cursor2.getString(53));
        }
    }

    public static final class StorySnapRecordBaseMapper<T extends StorySnapRecordBaseModel, T1 extends StoryModel, T2 extends SnapModel, T3 extends StorySnapModel> implements ainw<T> {
        private final StorySnapRecordBaseCreator<T> creator;
        private final com.snap.core.db.record.SnapModel.Factory<T2> snapModelFactory;
        private final com.snap.core.db.record.StoryModel.Factory<T1> storyModelFactory;
        private final Factory<T3> storySnapModelFactory;

        public StorySnapRecordBaseMapper(StorySnapRecordBaseCreator<T> storySnapRecordBaseCreator, com.snap.core.db.record.StoryModel.Factory<T1> factory, com.snap.core.db.record.SnapModel.Factory<T2> factory2, Factory<T3> factory3) {
            this.creator = storySnapRecordBaseCreator;
            this.storyModelFactory = factory;
            this.snapModelFactory = factory2;
            this.storySnapModelFactory = factory3;
        }

        public final T map(Cursor cursor) {
            long j;
            MessageClientStatus messageClientStatus;
            Cursor cursor2 = cursor;
            StorySnapRecordBaseCreator storySnapRecordBaseCreator = this.creator;
            long j2 = cursor2.getLong(0);
            long j3 = cursor2.getLong(1);
            String string = cursor2.getString(2);
            String string2 = cursor2.getString(3);
            String string3 = cursor2.isNull(4) ? null : cursor2.getString(4);
            StoryKind storyKind = cursor2.isNull(5) ? null : (StoryKind) this.storyModelFactory.kindAdapter.decode(Long.valueOf(cursor2.getLong(5)));
            gcp gcp = (gcp) this.snapModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            String string4 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            long j4 = cursor2.getLong(9);
            long j5 = cursor2.getLong(10);
            if (cursor2.isNull(11)) {
                j = j4;
                messageClientStatus = null;
            } else {
                j = j4;
                messageClientStatus = (MessageClientStatus) this.storySnapModelFactory.clientStatusAdapter.decode(Long.valueOf(cursor2.getLong(11)));
            }
            return storySnapRecordBaseCreator.create(j2, j3, string, string2, string3, storyKind, gcp, string4, string5, j, j5, messageClientStatus);
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(StorySnapModel.TABLE_NAME, paVar.a("DELETE FROM StorySnap"));
        }
    }

    public static final class InsertRow extends ainy {
        private final Factory<? extends StorySnapModel> storySnapModelFactory;

        public InsertRow(pa paVar, Factory<? extends StorySnapModel> factory) {
            super(StorySnapModel.TABLE_NAME, paVar.a("INSERT INTO StorySnap(snapRowId,\n    username,\n    clientId,\n    captionTextDisplay,\n    filterId,\n    venueId,\n    thumbnailUrl,\n    largeThumbnailUrl,\n    viewed,\n    isOfficialStory,\n    isPublic,\n    mediaD2sUrl,\n    needAuth,\n    storyFilterId,\n    thumbnailIv,\n    canonicalDisplayTime,\n    expirationTimestamp,\n    flushableId,\n    displayName,\n    snapAttachmentUrl,\n    contextHint,\n    animatedSnapType,\n    lensMetadata,\n    filterLensId,\n    unlockablesSnapInfo,\n    encryptedGeoLoggingData,\n    ruleFileParams,\n    brandFriendliness,\n    clientStatus,\n    storyRowId,\n    friendScreenCaptureRecordingCount,\n    friendScreenCaptureShotCount,\n    friendScreenshotCount,\n    friendSnapSaveCount,\n    friendViewCount,\n    otherScreenCaptureRecordingCount,\n    otherScreenCaptureShotCount,\n    otherScreenshotCount,\n    otherSnapSaveCount,\n    otherViewCount,\n    pendingServerConfirmation,\n    postedTimestamp,\n    creationTimestamp,\n    snapSource,\n    creativeKitSourceAppName,\n    creativeKitSourceAppOAuthClientId,\n    serverRankingId)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,\n        ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.storySnapModelFactory = factory;
        }

        public final void bind(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, boolean z, String str9, String str10, Long l, Long l2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Integer num, MessageClientStatus messageClientStatus, long j2, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool4, Long l3, Long l4, Integer num12, String str21, String str22, String str23) {
            String str24 = str;
            String str25 = str3;
            String str26 = str4;
            String str27 = str5;
            String str28 = str6;
            String str29 = str7;
            String str30 = str8;
            String str31 = str9;
            String str32 = str10;
            String str33 = str11;
            String str34 = str12;
            String str35 = str13;
            String str36 = str14;
            String str37 = str15;
            String str38 = str16;
            bindLong(1, j);
            if (str24 == null) {
                bindNull(2);
            } else {
                bindString(2, str24);
            }
            bindString(3, str2);
            if (str25 == null) {
                bindNull(4);
            } else {
                bindString(4, str25);
            }
            if (str26 == null) {
                bindNull(5);
            } else {
                bindString(5, str26);
            }
            if (str27 == null) {
                bindNull(6);
            } else {
                bindString(6, str27);
            }
            if (str28 == null) {
                bindNull(7);
            } else {
                bindString(7, str28);
            }
            if (str29 == null) {
                bindNull(8);
            } else {
                bindString(8, str29);
            }
            long j3 = 1;
            if (bool == null) {
                bindNull(9);
            } else {
                bindLong(9, bool.booleanValue() ? 1 : 0);
            }
            if (bool2 == null) {
                bindNull(10);
            } else {
                bindLong(10, bool2.booleanValue() ? 1 : 0);
            }
            if (bool3 == null) {
                bindNull(11);
            } else {
                bindLong(11, bool3.booleanValue() ? 1 : 0);
            }
            if (str30 == null) {
                bindNull(12);
            } else {
                bindString(12, str30);
            }
            bindLong(13, z ? 1 : 0);
            if (str31 == null) {
                bindNull(14);
            } else {
                bindString(14, str31);
            }
            if (str32 == null) {
                bindNull(15);
            } else {
                bindString(15, str32);
            }
            if (l == null) {
                bindNull(16);
            } else {
                bindLong(16, l.longValue());
            }
            if (l2 == null) {
                bindNull(17);
            } else {
                bindLong(17, l2.longValue());
            }
            if (str33 == null) {
                bindNull(18);
            } else {
                bindString(18, str33);
            }
            if (str34 == null) {
                bindNull(19);
            } else {
                bindString(19, str34);
            }
            if (str35 == null) {
                bindNull(20);
            } else {
                bindString(20, str35);
            }
            str24 = str14;
            if (str24 == null) {
                bindNull(21);
            } else {
                bindString(21, str24);
            }
            str24 = str15;
            if (str24 == null) {
                bindNull(22);
            } else {
                bindString(22, str24);
            }
            str24 = str16;
            if (str24 == null) {
                bindNull(23);
            } else {
                bindString(23, str24);
            }
            str24 = str17;
            if (str24 == null) {
                bindNull(24);
            } else {
                bindString(24, str24);
            }
            str24 = str18;
            if (str24 == null) {
                bindNull(25);
            } else {
                bindString(25, str24);
            }
            str24 = str19;
            if (str24 == null) {
                bindNull(26);
            } else {
                bindString(26, str24);
            }
            str24 = str20;
            if (str24 == null) {
                bindNull(27);
            } else {
                bindString(27, str24);
            }
            if (num == null) {
                bindNull(28);
            } else {
                bindLong(28, (long) num.intValue());
            }
            MessageClientStatus messageClientStatus2 = messageClientStatus;
            if (messageClientStatus2 == null) {
                bindNull(29);
            } else {
                bindLong(29, ((Long) this.storySnapModelFactory.clientStatusAdapter.encode(messageClientStatus2)).longValue());
            }
            bindLong(30, j2);
            if (num2 == null) {
                bindNull(31);
            } else {
                bindLong(31, (long) num2.intValue());
            }
            if (num3 == null) {
                bindNull(32);
            } else {
                bindLong(32, (long) num3.intValue());
            }
            if (num4 == null) {
                bindNull(33);
            } else {
                bindLong(33, (long) num4.intValue());
            }
            if (num5 == null) {
                bindNull(34);
            } else {
                bindLong(34, (long) num5.intValue());
            }
            if (num6 == null) {
                bindNull(35);
            } else {
                bindLong(35, (long) num6.intValue());
            }
            if (num7 == null) {
                bindNull(36);
            } else {
                bindLong(36, (long) num7.intValue());
            }
            if (num8 == null) {
                bindNull(37);
            } else {
                bindLong(37, (long) num8.intValue());
            }
            if (num9 == null) {
                bindNull(38);
            } else {
                bindLong(38, (long) num9.intValue());
            }
            if (num10 == null) {
                bindNull(39);
            } else {
                bindLong(39, (long) num10.intValue());
            }
            if (num11 == null) {
                bindNull(40);
            } else {
                bindLong(40, (long) num11.intValue());
            }
            if (bool4 == null) {
                bindNull(41);
            } else {
                if (!bool4.booleanValue()) {
                    j3 = 0;
                }
                bindLong(41, j3);
            }
            if (l3 == null) {
                bindNull(42);
            } else {
                bindLong(42, l3.longValue());
            }
            if (l4 == null) {
                bindNull(43);
            } else {
                bindLong(43, l4.longValue());
            }
            if (num12 == null) {
                bindNull(44);
            } else {
                bindLong(44, (long) num12.intValue());
            }
            str24 = str21;
            if (str24 == null) {
                bindNull(45);
            } else {
                bindString(45, str24);
            }
            str24 = str22;
            if (str24 == null) {
                bindNull(46);
            } else {
                bindString(46, str24);
            }
            str24 = str23;
            if (str24 == null) {
                bindNull(47);
            } else {
                bindString(47, str24);
            }
        }
    }

    public static final class MarkAsViewed extends ainy {
        private final com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> storyModelFactory;

        public MarkAsViewed(pa paVar, com.snap.core.db.record.StoryModel.Factory<? extends StoryModel> factory) {
            super(StorySnapModel.TABLE_NAME, paVar.a("UPDATE StorySnap\nSET viewed = 1\nWHERE storyRowId = (\n    SELECT _id\n    FROM Story\n    WHERE Story.storyId = ? AND Story.kind = ?\n) AND StorySnap.clientId = ?"));
            this.storyModelFactory = factory;
        }

        public final void bind(String str, StoryKind storyKind, String str2) {
            bindString(1, str);
            bindLong(2, ((Long) this.storyModelFactory.kindAdapter.encode(storyKind)).longValue());
            bindString(3, str2);
        }
    }

    public static final class UpdateRowByRowId extends ainy {
        private final Factory<? extends StorySnapModel> storySnapModelFactory;

        public UpdateRowByRowId(pa paVar, Factory<? extends StorySnapModel> factory) {
            super(StorySnapModel.TABLE_NAME, paVar.a("UPDATE StorySnap\nSET username = ?,\n    captionTextDisplay = ?,\n    filterId = ?,\n    venueId = ?,\n    thumbnailUrl = ?,\n    largeThumbnailUrl = ?,\n    viewed = ?,\n    isOfficialStory = ?,\n    isPublic = ?,\n    mediaD2sUrl = ?,\n    needAuth = ?,\n    storyFilterId = ?,\n    thumbnailIv = ?,\n    canonicalDisplayTime = ?,\n    expirationTimestamp = ?,\n    flushableId = ?,\n    displayName = ?,\n    snapAttachmentUrl = ?,\n    contextHint = ?,\n    animatedSnapType = ?,\n    lensMetadata = ?,\n    filterLensId = ?,\n    unlockablesSnapInfo = ?,\n    encryptedGeoLoggingData = ?,\n    ruleFileParams = ?,\n    brandFriendliness = ?,\n    clientStatus = ?,\n    friendScreenCaptureRecordingCount = ?,\n    friendScreenCaptureShotCount = ?,\n    friendScreenshotCount = ?,\n    friendSnapSaveCount = ?,\n    friendViewCount = ?,\n    otherScreenCaptureRecordingCount = ?,\n    otherScreenCaptureShotCount = ?,\n    otherScreenshotCount = ?,\n    otherSnapSaveCount = ?,\n    otherViewCount = ?,\n    pendingServerConfirmation = ?,\n    postedTimestamp = ?,\n    serverRankingId = ?\nWHERE _id = ?"));
            this.storySnapModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, String str7, boolean z, String str8, String str9, Long l, Long l2, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, MessageClientStatus messageClientStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool4, Long l3, String str20, long j) {
            String str21 = str;
            String str22 = str2;
            String str23 = str3;
            String str24 = str4;
            String str25 = str5;
            String str26 = str6;
            String str27 = str7;
            String str28 = str8;
            String str29 = str9;
            String str30 = str10;
            String str31 = str11;
            String str32 = str12;
            String str33 = str13;
            String str34 = str14;
            String str35 = str15;
            if (str21 == null) {
                bindNull(1);
            } else {
                bindString(1, str21);
            }
            if (str22 == null) {
                bindNull(2);
            } else {
                bindString(2, str22);
            }
            if (str23 == null) {
                bindNull(3);
            } else {
                bindString(3, str23);
            }
            if (str24 == null) {
                bindNull(4);
            } else {
                bindString(4, str24);
            }
            if (str25 == null) {
                bindNull(5);
            } else {
                bindString(5, str25);
            }
            if (str26 == null) {
                bindNull(6);
            } else {
                bindString(6, str26);
            }
            long j2 = 0;
            if (bool == null) {
                bindNull(7);
            } else {
                bindLong(7, bool.booleanValue() ? 1 : 0);
            }
            if (bool2 == null) {
                bindNull(8);
            } else {
                bindLong(8, bool2.booleanValue() ? 1 : 0);
            }
            if (bool3 == null) {
                bindNull(9);
            } else {
                bindLong(9, bool3.booleanValue() ? 1 : 0);
            }
            if (str27 == null) {
                bindNull(10);
            } else {
                bindString(10, str27);
            }
            bindLong(11, z ? 1 : 0);
            if (str28 == null) {
                bindNull(12);
            } else {
                bindString(12, str28);
            }
            if (str29 == null) {
                bindNull(13);
            } else {
                bindString(13, str29);
            }
            if (l == null) {
                bindNull(14);
            } else {
                bindLong(14, l.longValue());
            }
            if (l2 == null) {
                bindNull(15);
            } else {
                bindLong(15, l2.longValue());
            }
            if (str30 == null) {
                bindNull(16);
            } else {
                bindString(16, str30);
            }
            if (str31 == null) {
                bindNull(17);
            } else {
                bindString(17, str31);
            }
            if (str32 == null) {
                bindNull(18);
            } else {
                bindString(18, str32);
            }
            if (str33 == null) {
                bindNull(19);
            } else {
                bindString(19, str33);
            }
            if (str34 == null) {
                bindNull(20);
            } else {
                bindString(20, str34);
            }
            str21 = str15;
            if (str21 == null) {
                bindNull(21);
            } else {
                bindString(21, str21);
            }
            str21 = str16;
            if (str21 == null) {
                bindNull(22);
            } else {
                bindString(22, str21);
            }
            str21 = str17;
            if (str21 == null) {
                bindNull(23);
            } else {
                bindString(23, str21);
            }
            str21 = str18;
            if (str21 == null) {
                bindNull(24);
            } else {
                bindString(24, str21);
            }
            str21 = str19;
            if (str21 == null) {
                bindNull(25);
            } else {
                bindString(25, str21);
            }
            if (num == null) {
                bindNull(26);
            } else {
                bindLong(26, (long) num.intValue());
            }
            MessageClientStatus messageClientStatus2 = messageClientStatus;
            if (messageClientStatus2 == null) {
                bindNull(27);
            } else {
                bindLong(27, ((Long) this.storySnapModelFactory.clientStatusAdapter.encode(messageClientStatus2)).longValue());
            }
            if (num2 == null) {
                bindNull(28);
            } else {
                bindLong(28, (long) num2.intValue());
            }
            if (num3 == null) {
                bindNull(29);
            } else {
                bindLong(29, (long) num3.intValue());
            }
            if (num4 == null) {
                bindNull(30);
            } else {
                bindLong(30, (long) num4.intValue());
            }
            if (num5 == null) {
                bindNull(31);
            } else {
                bindLong(31, (long) num5.intValue());
            }
            if (num6 == null) {
                bindNull(32);
            } else {
                bindLong(32, (long) num6.intValue());
            }
            if (num7 == null) {
                bindNull(33);
            } else {
                bindLong(33, (long) num7.intValue());
            }
            if (num8 == null) {
                bindNull(34);
            } else {
                bindLong(34, (long) num8.intValue());
            }
            if (num9 == null) {
                bindNull(35);
            } else {
                bindLong(35, (long) num9.intValue());
            }
            if (num10 == null) {
                bindNull(36);
            } else {
                bindLong(36, (long) num10.intValue());
            }
            if (num11 == null) {
                bindNull(37);
            } else {
                bindLong(37, (long) num11.intValue());
            }
            if (bool4 == null) {
                bindNull(38);
            } else {
                if (bool4.booleanValue()) {
                    j2 = 1;
                }
                bindLong(38, j2);
            }
            if (l3 == null) {
                bindNull(39);
            } else {
                bindLong(39, l3.longValue());
            }
            str21 = str20;
            if (str21 == null) {
                bindNull(40);
            } else {
                bindString(40, str21);
            }
            bindLong(41, j);
        }
    }

    public static final class UpdateSnapRowId extends ainy {
        public UpdateSnapRowId(pa paVar) {
            super(StorySnapModel.TABLE_NAME, paVar.a("UPDATE StorySnap\nSET snapRowId = ?\nWHERE _id = ?"));
        }

        public final void bind(long j, long j2) {
            bindLong(1, j);
            bindLong(2, j2);
        }
    }

    public static final class UpdateStatusByRowId extends ainy {
        private final Factory<? extends StorySnapModel> storySnapModelFactory;

        public UpdateStatusByRowId(pa paVar, Factory<? extends StorySnapModel> factory) {
            super(StorySnapModel.TABLE_NAME, paVar.a("UPDATE StorySnap\nSET clientStatus = ?\nWHERE _id = ?"));
            this.storySnapModelFactory = factory;
        }

        public final void bind(MessageClientStatus messageClientStatus, long j) {
            if (messageClientStatus == null) {
                bindNull(1);
            } else {
                bindLong(1, ((Long) this.storySnapModelFactory.clientStatusAdapter.encode(messageClientStatus)).longValue());
            }
            bindLong(2, j);
        }
    }

    long _id();

    String animatedSnapType();

    Integer brandFriendliness();

    Long canonicalDisplayTime();

    String captionTextDisplay();

    String clientId();

    MessageClientStatus clientStatus();

    String contextHint();

    Long creationTimestamp();

    String creativeKitSourceAppName();

    String creativeKitSourceAppOAuthClientId();

    String displayName();

    String encryptedGeoLoggingData();

    Long expirationTimestamp();

    String filterId();

    String filterLensId();

    String flushableId();

    Integer friendScreenCaptureRecordingCount();

    Integer friendScreenCaptureShotCount();

    Integer friendScreenshotCount();

    Integer friendSnapSaveCount();

    Integer friendViewCount();

    Boolean isOfficialStory();

    Boolean isPublic();

    String largeThumbnailUrl();

    String lensMetadata();

    String mediaD2sUrl();

    boolean needAuth();

    Integer otherScreenCaptureRecordingCount();

    Integer otherScreenCaptureShotCount();

    Integer otherScreenshotCount();

    Integer otherSnapSaveCount();

    Integer otherViewCount();

    Boolean pendingServerConfirmation();

    Long postedTimestamp();

    String ruleFileParams();

    String serverRankingId();

    String snapAttachmentUrl();

    long snapRowId();

    Integer snapSource();

    String storyFilterId();

    long storyRowId();

    String thumbnailIv();

    String thumbnailUrl();

    String unlockablesSnapInfo();

    String username();

    String venueId();

    Boolean viewed();

    Long viewedTimestamp();
}

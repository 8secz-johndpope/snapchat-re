package com.snap.core.db;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.core.db.SnapDbSchema.Indices;
import com.snap.core.db.SnapDbSchema.Tables;
import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.migrate.MigrateDB_1037_8Kt;
import com.snap.core.db.migrate.MigrateDB_1037_9Kt;
import com.snap.core.db.migrate.MigrateDB_1038_3Kt;
import com.snap.core.db.migrate.MigrateDB_1038_4Kt;
import com.snap.core.db.migrate.MigrateDB_1044_13Kt;
import com.snap.core.db.migrate.MigrateDB_1044_17Kt;
import com.snap.core.db.migrate.MigrateDB_1044_4Kt;
import com.snap.core.db.migrate.MigrateDB_1045_5Kt;
import com.snap.core.db.migrate.MigrateDB_1046_1Kt;
import com.snap.core.db.migrate.MigrateDB_1046_2Kt;
import com.snap.core.db.migrate.MigrateDB_1046_3Kt;
import com.snap.core.db.migrate.MigrateDB_1047_10Kt;
import com.snap.core.db.migrate.MigrateDB_1054_6Kt;
import com.snap.core.db.migrate.MigrateDb_1036_11Kt;
import com.snap.core.db.migrate.MigrateDb_1037_3Kt;
import com.snap.core.db.record.CharmsModel;
import com.snap.core.db.record.CognacAppListModel;
import com.snap.core.db.record.DiscoverFeedSectionsModel;
import com.snap.core.db.record.DiscoverFeedStoryModel;
import com.snap.core.db.record.DiscoverStorySnapModel;
import com.snap.core.db.record.FeedMemberModel;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.FriendWhoAddedMeModel;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.core.db.record.MessageModel;
import com.snap.core.db.record.MessagingSnapModel;
import com.snap.core.db.record.MobStoryMetadataModel;
import com.snap.core.db.record.NetworkMessageModel;
import com.snap.core.db.record.PlaybackSnapViewModel;
import com.snap.core.db.record.PostableStoryModel;
import com.snap.core.db.record.PublisherSnapPageModel;
import com.snap.core.db.record.SnapDbSchemaInitialVersionKt;
import com.snap.core.db.record.SnapModel;
import com.snap.core.db.record.SnapTokenModel;
import com.snap.core.db.record.StoryCorpusSignalsModel;
import com.snap.core.db.record.StoryInteractionSignalsModel;
import com.snap.core.db.record.StoryNoteModel;
import com.snap.core.db.record.StorySnapModel;
import com.snap.core.db.record.StorySubscriptionModel;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.ajyu;
import defpackage.akcr;
import defpackage.pa;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.opencv.imgproc.Imgproc;

public final class SnapDbSchemaVersionController extends DbSchemaVersionController {
    private Set<Tables> schemaChangedViews = new LinkedHashSet();

    public SnapDbSchemaVersionController(DbSchema dbSchema) {
        akcr.b(dbSchema, "schema");
        super(dbSchema);
    }

    public final String getInitialTableCreationStatement(TableSpec tableSpec) {
        akcr.b(tableSpec, "table");
        return SnapDbSchemaInitialVersionKt.getInitialSnapDbTableCreationStatement((Tables) tableSpec);
    }

    public final Integer getMinUpgradableVersion() {
        return Integer.valueOf(57);
    }

    public final void markViewSchemaChanged(Tables tables) {
        akcr.b(tables, "view");
        if ((tables.getTableType() == TableType.VIEW ? 1 : null) != null) {
            this.schemaChangedViews.add(tables);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tables.getTableName());
        stringBuilder.append(" is not a view");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public final void migrateDB_1036_12(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDb_1036_11Kt.deleteDuplicateSnapViews(paVar);
        createIndex(paVar, Indices.PLAYBACK_VIEW_SNAP_ID);
    }

    public final void migrateDB_1036_13(pa paVar) {
        akcr.b(paVar, "db");
        String str = PublisherSnapPageModel.TABLE_NAME;
        addColumn(paVar, str, PublisherSnapPageModel.PUBLISHTIMESTAMPMS, PublisherSnapPageModel.ADDPUBLISHTIMESTAMPMS);
        addColumn(paVar, str, "thumbnailUrl", PublisherSnapPageModel.ADDTHUMBNAILURL);
    }

    public final void migrateDB_1037_1(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, MessagingSnapModel.TABLE_NAME, MessagingSnapModel.GEOFILTERMETADATA, MessagingSnapModel.ADDGEOFILTERMETADATA);
    }

    public final void migrateDB_1037_10(pa paVar) {
        akcr.b(paVar, "db");
        String str = DiscoverStorySnapModel.TABLE_NAME;
        addColumn(paVar, str, DiscoverStorySnapModel.STREAMINGMEDIAIV, DiscoverStorySnapModel.ADDSTREAMINGMEDIAIV);
        addColumn(paVar, str, DiscoverStorySnapModel.STREAMINGMEDIAKEY, DiscoverStorySnapModel.ADDSTREAMINGMEDIAKEY);
        addColumn(paVar, str, DiscoverStorySnapModel.STREAMINGMETADATAURL, DiscoverStorySnapModel.ADDSTREAMINGMETADATAURL);
    }

    public final void migrateDB_1037_11(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1037_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, DiscoverStorySnapModel.TABLE_NAME, "displayName", DiscoverStorySnapModel.ADDDISPLAYNAME);
    }

    public final void migrateDB_1037_3(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, StorySnapModel.TABLE_NAME, "storyRowId", StorySnapModel.ADDSTORYROWIDCOLUMN);
        executeStatement(paVar, MigrateDb_1037_3Kt.populateStorySnapStoryRowIdsStatement());
    }

    public final void migrateDB_1037_4(pa paVar) {
        akcr.b(paVar, "db");
        createIndex(paVar, Indices.PLAYBACK_VIEW_STORY_ID);
    }

    public final void migrateDB_1037_5(pa paVar) {
        akcr.b(paVar, "db");
        String str = "timestamp";
        addColumn(paVar, PublisherSnapPageModel.TABLE_NAME, str, PublisherSnapPageModel.ADDTIMESTAMP);
        addColumn(paVar, DiscoverStorySnapModel.TABLE_NAME, str, DiscoverStorySnapModel.ADDTIMESTAMP);
        addColumn(paVar, DiscoverFeedStoryModel.TABLE_NAME, str, DiscoverFeedStoryModel.ADDTIMESTAMP);
    }

    public final void migrateDB_1037_6(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.MULTI_RECIPIENT_SENDING_SNAP);
    }

    public final void migrateDB_1037_8(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDB_1037_8Kt.cleanLocalMessageState(paVar);
    }

    public final void migrateDB_1037_9(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDB_1037_9Kt.deleteOldStickerMessages(paVar);
    }

    public final void migrateDB_1038_1(pa paVar) {
        akcr.b(paVar, "db");
        String str = "Feed_temp";
        renameTable(paVar, FeedModel.TABLE_NAME, str);
        paVar.c("CREATE TABLE IF NOT EXISTS Feed (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    key TEXT NOT NULL UNIQUE,\n\n    specifiedName TEXT, -- A name chosen by the group (not generated)\n    participantString TEXT, -- Displayable string with a group chat's members\n    participantsSize INTEGER NOT NULL DEFAULT 1,\n    friendRowId INTEGER, -- If this is a one-on-one chat, the friend's id.\n    iterToken TEXT, -- this is a token used for conversation pagination.\n\n    displayTimestamp INTEGER NOT NULL DEFAULT 0,\n    displayInteractionType TEXT, -- the type of the last interaction\n\n    lastInteractionTimestamp INTEGER DEFAULT 0,\n    lastInteractionUserId INTEGER, -- last user that did something\n\n    -- check https://snapchat.quip.com/x1DnAyDCbaPa for snap release design\n    -- Used in 1-1 Snap Release, represents my release of my received snap\n    myReceivedSnapReleaseTimestamp INTEGER NOT NULL DEFAULT 0,\n    -- Used in 1-1 Snap Release, represents my release of my sent snap\n    mySentSnapReleaseTimestamp INTEGER NOT NULL DEFAULT 0,\n\n    clearedTimestamp INTEGER DEFAULT 0,\n\n    storySkipCount INTEGER NOT NULL DEFAULT 0, -- how many times the user has swiped to skip a story in the feed. AKA: FRIEND_STORY_AUTO_ADVANCE_SKIP_COUNT\n\n    lastReadTimestamp INTEGER,\n    lastReader TEXT,\n    lastWriteTimestamp INTEGER,\n    lastWriteType TEXT,\n    lastWriter TEXT,\n\n    myLastReadTimestamp INTEGER,\n    friendLastReadTimestamp INTEGER,\n\n    lastSnapType INTEGER,\n    storyRowId INTEGER, -- either null or Story._id as DatabaseKey<Story>\n    groupStoryMuted INTEGER DEFAULT 0,\n    authToken BLOB, -- SignedPayload --\n\n    laterContentExists INTEGER DEFAULT 0 NOT NULL,\n\n    groupVersion INTEGER DEFAULT 0 NOT NULL,\n\n    kind INTEGER NOT NULL\n)");
        StringBuilder stringBuilder = new StringBuilder("INSERT INTO Feed(_id, key, specifiedName, participantString, participantsSize, friendRowId, iterToken, displayTimestamp, displayInteractionType, lastInteractionTimestamp, lastInteractionUserId, myReceivedSnapReleaseTimestamp, clearedTimestamp, storySkipCount, lastReadTimestamp, lastReader, lastWriteTimestamp, lastWriteType, lastWriter, myLastReadTimestamp, friendLastReadTimestamp, lastSnapType, storyRowId, groupStoryMuted, authToken, laterContentExists, groupVersion, kind) SELECT _id, key, specifiedName, participantString, participantsSize, friendRowId, iterToken, displayTimestamp, displayInteractionType, lastInteractionTimestamp, lastInteractionUserId, releaseTimestamp, clearedTimestamp, storySkipCount, lastReadTimestamp, lastReader, lastWriteTimestamp, lastWriteType, lastWriter, myLastReadTimestamp, friendLastReadTimestamp, lastSnapType, storyRowId, groupStoryMuted, authToken, laterContentExists, groupVersion, kind FROM ");
        stringBuilder.append(str);
        stringBuilder.append(';');
        paVar.c(stringBuilder.toString());
        dropTable(paVar, str);
    }

    public final void migrateDB_1038_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, NetworkMessageModel.TABLE_NAME, "released", NetworkMessageModel.ADDRELEASED);
    }

    public final void migrateDB_1038_3(pa paVar) {
        akcr.b(paVar, "db");
        String tableName = Tables.STORY_SNAP.getTableName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tableName);
        stringBuilder.append("_temp");
        String stringBuilder2 = stringBuilder.toString();
        renameTable(paVar, tableName, stringBuilder2);
        executeStatement(paVar, MigrateDB_1038_3Kt.getStorySnapTableCreateStatement_1038_3());
        StringBuilder stringBuilder3 = new StringBuilder("INSERT OR IGNORE INTO ");
        stringBuilder3.append(tableName);
        stringBuilder3.append(" SELECT * FROM ");
        stringBuilder3.append(stringBuilder2);
        executeStatement(paVar, stringBuilder3.toString());
        dropTable(paVar, stringBuilder2);
    }

    public final void migrateDB_1038_4(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDB_1038_4Kt.cleanInvalidRecipients(paVar);
    }

    public final void migrateDB_1038_5(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, DiscoverStorySnapModel.TABLE_NAME, "thumbnailUrl", DiscoverStorySnapModel.ADDTHUMBNAILURL);
    }

    public final void migrateDB_1038_6(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.LASTINTERACTIONWRITERID, FeedModel.ADDLASTINTERACTIONWRITERID);
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1038_7(pa paVar) {
        akcr.b(paVar, "db");
        executeStatement(paVar, "UPDATE SequenceNumbers SET serverLatest = null");
    }

    public final void migrateDB_1039_1(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.FRIENDSCREENCAPTURERECORDINGCOUNT, StorySnapModel.ADDFRIENDSCREENCAPTURERECORDINGCOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.FRIENDSCREENCAPTURESHOTCOUNT, StorySnapModel.ADDFRIENDSCREENCAPTURESHOTCOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.FRIENDSCREENSHOTCOUNT, StorySnapModel.ADDFRIENDSCREENSHOTCOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.FRIENDSNAPSAVECOUNT, StorySnapModel.ADDFRIENDSNAPSAVECOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.FRIENDVIEWCOUNT, StorySnapModel.ADDFRIENDVIEWCOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.OTHERSCREENCAPTURERECORDINGCOUNT, StorySnapModel.ADDOTHERSCREENCAPTURERECORDINGCOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.OTHERSCREENCAPTURESHOTCOUNT, StorySnapModel.ADDOTHERSCREENCAPTURESHOTCOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.OTHERSCREENSHOTCOUNT, StorySnapModel.ADDOTHERSCREENSHOTCOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.OTHERSNAPSAVECOUNT, StorySnapModel.ADDOTHERSNAPSAVECOUNTCOLUMN);
        addColumn(paVar, Tables.STORY_SNAP.getTableName(), StorySnapModel.OTHERVIEWCOUNT, StorySnapModel.ADDOTHERVIEWCOUNTCOLUMN);
    }

    public final void migrateDB_1039_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, PublisherSnapPageModel.TABLE_NAME, PublisherSnapPageModel.PUBLISHERID, PublisherSnapPageModel.ADDPUBLISHERID);
    }

    public final void migrateDB_1039_3(pa paVar) {
        akcr.b(paVar, "db");
        String initialSnapDbTableCreationStatement = SnapDbSchemaInitialVersionKt.getInitialSnapDbTableCreationStatement(Tables.PROMOTED_STORY_SNAP);
        if (initialSnapDbTableCreationStatement == null) {
            akcr.a();
        }
        executeStatement(paVar, initialSnapDbTableCreationStatement);
    }

    public final void migrateDB_1039_4(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.FITSCREENPARTICIPANTSTRING, FeedModel.ADDFITSCREENPARTICIPANTSTRING);
    }

    public final void migrateDB_1039_5(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1039_6(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("CREATE TABLE IF NOT EXISTS StoryInteractionSignals (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    storyId TEXT NOT NULL,\n    corpus INTEGER NOT NULL,\n\n    -- Profile Action Signals\n    lastFavoriteTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastUnfavoriteTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastHideTimestampSecs INTEGER NOT NULL DEFAULT 0,\n\n    -- View signals\n    shortViewsScore REAL NOT NULL DEFAULT 0,\n    shortViewsScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    longViewsScore REAL NOT NULL DEFAULT 0,\n    longViewsScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastLongViewVersion INTEGER NOT NULL DEFAULT -2147483648,\n\n    -- Impression Signals\n    shortImpressionScore REAL NOT NULL DEFAULT 0,\n    shortImpressionScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    longImpressionsScore REAL NOT NULL DEFAULT 0,\n    longImpressionsScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    lastLongImpressionVersion INTEGER NOT NULL DEFAULT -2147483648,\n    qualifiedLongImpressionScore REAL NOT NULL DEFAULT 0,\n    qualifiedLongImpressionScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n\n    -- Tap Story key\n    longViewTapStoryKey INTEGER NOT NULL DEFAULT 0,\n\n    -- New Signals\n    tapStoryKey INTEGER NOT NULL DEFAULT 0,\n    lastViewVersion INTEGER NOT NULL DEFAULT 0,\n    numWatches INTEGER NOT NULL DEFAULT 0,\n    maxSnapCompletionPercent REAL NOT NULL DEFAULT 0,\n    maxTotalTimeWatched REAL NOT NULL DEFAULT 0,\n    lastViewNumSnapsInStory INTEGER NOT NULL DEFAULT 0,\n    lastStoryLengthSeconds INTEGER NOT NULL DEFAULT 0,\n    isSubscribed INTEGER DEFAULT 0,\n    isHidden INTEGER DEFAULT 0,\n    lastVersionLongImpressionCount INTEGER NOT NULL DEFAULT 0,\n    lastWatchedIndex INTEGER NOT NULL DEFAULT 0,\n    numSnapsViewedFromLatestVersion INTEGER NOT NULL DEFAULT 0,\n    totalImpressionTime REAL NOT NULL DEFAULT 0,\n    numSnapsViewedScore REAL NOT NULL DEFAULT 0,\n    numSnapsViewedScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    totalWatchTimeScore REAL NOT NULL DEFAULT 0,\n    totalWatchTimeScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    totalImpressionTimeScore REAL NOT NULL DEFAULT 0,\n    totalImpressionTimeScoreTimestampSecs INTEGER NOT NULL DEFAULT 0,\n\n    -- For expiration\n    lastUpdatedTimestampSecs INTEGER NOT NULL DEFAULT 0,\n    UNIQUE(storyId) ON CONFLICT IGNORE\n)");
        paVar.c(StoryCorpusSignalsModel.CREATE_TABLE);
    }

    public final void migrateDB_1039_7(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("DELETE\nFROM Message\nWHERE key IN (\n    SELECT Message.key FROM Message\n    LEFT OUTER JOIN MessagingSnap ON Message._id = MessagingSnap.messageRowId\n    LEFT OUTER JOIN Snap ON MessagingSnap.snapRowId = Snap._id\n    WHERE Message.type = 'snap' AND Snap._id is null\n)");
    }

    public final void migrateDB_1040_1(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.GROUPSYNCCONTENTTYPE, FeedModel.ADDGROUPSYNCCONTENTTYPE);
    }

    public final void migrateDB_1040_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.SORTINGTIMESTAMP, FeedModel.ADDSORTINGTIMESTAMP);
    }

    public final void migrateDB_1040_3(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, StoryInteractionSignalsModel.TABLE_NAME);
        dropTable(paVar, StoryCorpusSignalsModel.TABLE_NAME);
        paVar.c(StoryInteractionSignalsModel.CREATE_TABLE);
        paVar.c(StoryCorpusSignalsModel.CREATE_TABLE);
    }

    public final void migrateDB_1040_4(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1040_5(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.TOP_SUGGESTED_FRIEND);
        createIndex(paVar, Indices.FRIEND_USER_ID);
    }

    public final void migrateDB_1040_6(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FriendModel.TABLE_NAME, FriendModel.FRIENDMOJICATEGORIES, FriendModel.ADDFRIENDMOJICATEGORIES);
        paVar.c("DELETE FROM FriendSyncState");
    }

    public final void migrateDB_1040_7(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1041_1(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.MESSAGERETENTIONINMINUTES, FeedModel.ADDMESSAGERETENTIONINMINUTES);
    }

    public final void migrateDB_1041_4(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1041_5(pa paVar) {
        akcr.b(paVar, "db");
        Tables tables = Tables.UNLOCKABLES;
        String tableName = tables.getTableName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tableName);
        stringBuilder.append("_temp");
        String stringBuilder2 = stringBuilder.toString();
        renameTable(paVar, tableName, stringBuilder2);
        String initialTableCreationStatement = getInitialTableCreationStatement(tables);
        if (initialTableCreationStatement == null) {
            akcr.a();
        }
        executeStatement(paVar, initialTableCreationStatement);
        StringBuilder stringBuilder3 = new StringBuilder("INSERT OR IGNORE INTO ");
        stringBuilder3.append(tableName);
        stringBuilder3.append(" SELECT * FROM ");
        stringBuilder3.append(stringBuilder2);
        executeStatement(paVar, stringBuilder3.toString());
        dropTable(paVar, stringBuilder2);
    }

    public final void migrateDB_1042_1(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("CREATE TABLE IF NOT EXISTS PreviewAttachmentHistory (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    url TEXT NOT NULL UNIQUE,\n\n    displayedUrl TEXT NOT NULL,\n    faviconPath TEXT NOT NULL,\n    title TEXT NOT NULL\n)");
    }

    public final void migrateDB_1042_10(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.DDML_DATA);
        createTable(paVar, (TableSpec) Tables.DDML_MODEL);
    }

    public final void migrateDB_1042_11(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, DiscoverFeedSectionsModel.TABLE_NAME, DiscoverFeedSectionsModel.USELARGETILES, DiscoverFeedSectionsModel.ADDUSELARGETILESCOLUMN);
    }

    public final void migrateDB_1042_12(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, MessagingSnapModel.TABLE_NAME, MessagingSnapModel.DIRECTDOWNLOADURL, MessagingSnapModel.ADDDIRECTDOWNLOADURLMETADATA);
    }

    public final void migrateDB_1042_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, StorySnapModel.TABLE_NAME, StorySnapModel.PENDINGSERVERCONFIRMATION, StorySnapModel.ADDPENDINGSERVERCONFIRMATIONCOLUMN);
    }

    public final void migrateDB_1042_3(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, StorySnapModel.TABLE_NAME, StorySnapModel.POSTEDTIMESTAMP, StorySnapModel.ADDPOSTEDTIMESTAMPCOLUMN);
    }

    public final void migrateDB_1042_4(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.NOTIFICATIONMUTED, FeedModel.ADDNOTIFICATIONMUTED);
    }

    public final void migrateDB_1042_5(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.STORY_SUBSCRIPTION);
    }

    public final void migrateDB_1042_6(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.DF_SECTIONS);
    }

    public final void migrateDB_1042_8(pa paVar) {
        akcr.b(paVar, "db");
        String str = NetworkMessageModel.TABLE_NAME;
        String str2 = "screenshottedOrReplayed";
        addColumn(paVar, str, str2, NetworkMessageModel.ADDSCREENSHOTTEDORREPLAYED);
        String str3 = "snapServerStatus";
        addColumn(paVar, str, str3, NetworkMessageModel.ADDSNAPSERVERSTATUS);
        str = MessageModel.TABLE_NAME;
        addColumn(paVar, str, str2, MessageModel.ADDSCREENSHOTTEDORREPLAYED);
        addColumn(paVar, str, str3, MessageModel.ADDSNAPSERVERSTATUS);
        str = LocalMessageActionModel.TABLE_NAME;
        addColumn(paVar, str, str2, LocalMessageActionModel.ADDSCREENSHOTTEDORREPLAYED);
        addColumn(paVar, str, str3, LocalMessageActionModel.ADDSNAPSERVERSTATUS);
    }

    public final void migrateDB_1043_1(pa paVar) {
        akcr.b(paVar, "db");
        String str = StorySnapModel.TABLE_NAME;
        addColumn(paVar, str, "creationTimestamp", StorySnapModel.ADDCREATIONTIMESTAMPCOLUMN);
        addColumn(paVar, str, "snapSource", StorySnapModel.ADDSNAPSOURCECOLUMN);
    }

    public final void migrateDB_1043_2(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1043_3(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, MessageModel.TABLE_NAME, "seenTimestamp", MessageModel.ADDSEENTIMESTAMP);
    }

    public final void migrateDB_1043_4(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, "NetworkConversation");
    }

    public final void migrateDB_1043_5(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, MessagingSnapModel.TABLE_NAME, MessagingSnapModel.SNAPPABLELENSMETADATA, MessagingSnapModel.ADDSNAPPABLELENSMETADATA);
    }

    public final void migrateDB_1044_1(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, Tables.STORY_SUBSCRIPTION.getTableName());
        createTable(paVar, (TableSpec) Tables.STORY_SUBSCRIPTION);
    }

    public final void migrateDB_1044_10(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, StorySubscriptionModel.TABLE_NAME, StorySubscriptionModel.ISNOTIFOPTEDIN, StorySubscriptionModel.ADDISNOTIFOPTEDINCOLUMN);
    }

    public final void migrateDB_1044_11(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("DELETE FROM FeedSyncState");
    }

    public final void migrateDB_1044_12(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1044_13(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.CONFIG_RULE);
    }

    public final void migrateDB_1044_14(pa paVar) {
        akcr.b(paVar, "db");
        String tableName = Tables.STORY_SUBSCRIPTION.getTableName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tableName);
        stringBuilder.append("_temp");
        String stringBuilder2 = stringBuilder.toString();
        renameTable(paVar, tableName, stringBuilder2);
        executeStatement(paVar, MigrateDB_1044_13Kt.getStorySubscriptionTableCreateStatement_1044_14());
        StringBuilder stringBuilder3 = new StringBuilder("INSERT OR IGNORE INTO ");
        stringBuilder3.append(tableName);
        stringBuilder3.append(" SELECT * FROM ");
        stringBuilder3.append(stringBuilder2);
        executeStatement(paVar, stringBuilder3.toString());
        dropTable(paVar, stringBuilder2);
    }

    public final void migrateDB_1044_16(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.LENS_PERSISTENT_STORAGE);
    }

    public final void migrateDB_1044_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, StorySubscriptionModel.TABLE_NAME, StorySubscriptionModel.ADDEDTIMESTAMPMS, StorySubscriptionModel.ADDADDEDTIMESTAMPCOLUMN);
    }

    public final void migrateDB_1044_3(pa paVar) {
        akcr.b(paVar, "db");
        String str = "lastInteractionTimestamp";
        addColumn(paVar, MessageModel.TABLE_NAME, str, MessageModel.ADDLASTINTERACTIONTIMESTAMP);
        addColumn(paVar, NetworkMessageModel.TABLE_NAME, str, NetworkMessageModel.ADDLASTINTERACTIONTIMESTAMP);
    }

    public final void migrateDB_1044_4(pa paVar) {
        akcr.b(paVar, "db");
        String tableName = Tables.STORY.getTableName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tableName);
        stringBuilder.append("_temp");
        String stringBuilder2 = stringBuilder.toString();
        renameTable(paVar, tableName, stringBuilder2);
        executeStatement(paVar, MigrateDB_1044_4Kt.getStoryTableCreateStatement_1044_4());
        StringBuilder stringBuilder3 = new StringBuilder("INSERT OR IGNORE INTO ");
        stringBuilder3.append(tableName);
        stringBuilder3.append(" SELECT * FROM ");
        stringBuilder3.append(stringBuilder2);
        executeStatement(paVar, stringBuilder3.toString());
        dropTable(paVar, stringBuilder2);
    }

    public final void migrateDB_1044_5(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.CHARMS_OWNER_METADATA);
        createTable(paVar, (TableSpec) Tables.CHARMS);
    }

    public final void migrateDB_1044_6(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.PASSPORT_ENTRIES);
    }

    public final void migrateDB_1044_7(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.COGNAC_STATE);
    }

    public final void migrateDB_1044_8(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, "PostableStory", PostableStoryModel.THIRDPARTYAPPSTORYTTL, PostableStoryModel.ADDTHIRDPARTYAPPSTORYTTL);
    }

    public final void migrateDB_1044_9(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.GROUPMOBID, FeedModel.ADDGROUPMOBID);
    }

    public final void migrateDB_1045_1(pa paVar) {
        akcr.b(paVar, "db");
        StringBuilder stringBuilder = new StringBuilder();
        String str = "PostableStory";
        stringBuilder.append(str);
        stringBuilder.append("_temp");
        String stringBuilder2 = stringBuilder.toString();
        renameTable(paVar, str, stringBuilder2);
        executeStatement(paVar, MigrateDB_1044_17Kt.get_MigrateDB_1045_1_PostableStoryTableSchema());
        String str2 = MigrateDB_1044_17Kt.get_MigrateDB_1045_1_copyTableValue_statement(stringBuilder2);
        StringBuilder stringBuilder3 = new StringBuilder("INSERT OR IGNORE INTO ");
        stringBuilder3.append(str);
        stringBuilder3.append(' ');
        stringBuilder3.append(str2);
        executeStatement(paVar, stringBuilder3.toString());
        dropTable(paVar, stringBuilder2);
    }

    public final void migrateDB_1045_10(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.MAP_EXPLORE_READ_STATUS);
    }

    public final void migrateDB_1045_11(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, SnapModel.TABLE_NAME, SnapModel.COGNACATTACHMENTURI, SnapModel.ADDCOGNACATTACHMENTURI);
    }

    public final void migrateDB_1045_12(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.STORY_ACTIVE_SNAPS);
        markViewSchemaChanged(Tables.FRIENDS_FEED);
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1045_13(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, "PassportEntry", "placeId", "ALTER TABLE PassportEntry\nADD placeId TEXT");
    }

    public final void migrateDB_1045_3(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.BLACKLIST_FRIEND);
        createTable(paVar, (TableSpec) Tables.CUSTOM_FRIEND);
    }

    public final void migrateDB_1045_4(pa paVar) {
        akcr.b(paVar, "db");
        String str = "viewerList";
        addColumn(paVar, MessageModel.TABLE_NAME, str, MessageModel.ADDVIEWERLIST);
        addColumn(paVar, NetworkMessageModel.TABLE_NAME, str, NetworkMessageModel.ADDVIEWERLIST);
    }

    public final void migrateDB_1045_5(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, Tables.CHARMS.getTableName());
        executeStatement(paVar, MigrateDB_1045_5Kt.getCharmsTableCreateStatement_1045_5());
    }

    public final void migrateDB_1045_6(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, "PlaybackSnapView", PlaybackSnapViewModel.VIEWDURATIONMILLIS, PlaybackSnapViewModel.ADDVIEWDURATIONCOLUMN);
    }

    public final void migrateDB_1045_7(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1045_8(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, "\n            CREATE VIEW IF NOT EXISTS StoryViewActiveSnaps AS\n            SELECT\n                *,\n                -- there is a bug in SQLDelight that does not generate the correct nullable type when left joining Views\n                -- adding these fields as helpers to be used for these cases until the bug can be addressed\n                CASE WHEN _id IS NULL THEN NULL ELSE _id END AS storyRowIdNullable,\n                CAST (CASE WHEN Story.storyId IS NULL THEN NULL ELSE '' END AS TEXT) AS storyIdNullable\n            FROM Story\n            WHERE Story._id IN (SELECT DISTINCT StorySnap.storyRowId FROM StorySnap);\n        ");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1046_1(pa paVar) {
        akcr.b(paVar, "db");
        StringBuilder stringBuilder = new StringBuilder();
        String str = "PlaybackSnapView";
        stringBuilder.append(str);
        stringBuilder.append("_temp");
        String stringBuilder2 = stringBuilder.toString();
        renameTable(paVar, str, stringBuilder2);
        executeStatement(paVar, MigrateDB_1046_1Kt.get_MigrateDB_1046_1_tableCreationStatement());
        String str2 = MigrateDB_1046_1Kt.get_MigrateDB_1046_1_copyTableValueStatement(stringBuilder2);
        StringBuilder stringBuilder3 = new StringBuilder("INSERT OR IGNORE INTO ");
        stringBuilder3.append(str);
        stringBuilder3.append(' ');
        stringBuilder3.append(str2);
        executeStatement(paVar, stringBuilder3.toString());
        dropTable(paVar, stringBuilder2);
    }

    public final void migrateDB_1046_2(pa paVar) {
        akcr.b(paVar, "db");
        StringBuilder stringBuilder = new StringBuilder();
        String str = StoryNoteModel.TABLE_NAME;
        stringBuilder.append(str);
        stringBuilder.append("_temp");
        String stringBuilder2 = stringBuilder.toString();
        renameTable(paVar, str, stringBuilder2);
        executeStatement(paVar, MigrateDB_1046_2Kt.getStoryNoteTableCreateStatement_1046_2());
        StringBuilder stringBuilder3 = new StringBuilder("\n            INSERT OR IGNORE INTO ");
        stringBuilder3.append(str);
        stringBuilder3.append(" (\n                snapId,\n                storySnapRowId,\n                timestamp,\n                viewer,\n                isFriendViewPublic,\n                isScreenShotted,\n                noteType,\n                isSaved)\n            SELECT\n                snapId,\n                storySnapRowId,\n                timestamp,\n                viewer,\n                isFriendViewPublic,\n                isScreenShotted,\n                CASE WHEN noteType = \"FRIEND_STORY_NOTE\" THEN 0 ELSE 1 END,\n                isSaved\n            FROM ");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(";\n        ");
        executeStatement(paVar, stringBuilder3.toString());
        dropTable(paVar, stringBuilder2);
    }

    public final void migrateDB_1046_3(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDB_1046_3Kt.update_custom_story_snap_clientids_1046_3(paVar);
    }

    public final void migrateDB_1046_5(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDb_1036_11Kt.deleteDuplicateSnapViews(paVar);
        createIndex(paVar, Indices.PLAYBACK_SNAP_VIEW_ROW_ID);
        createIndex(paVar, Indices.PLAYBACK_VIEW_SNAP_ID);
        createIndex(paVar, Indices.PLAYBACK_VIEW_STORY_ID);
    }

    public final void migrateDB_1047_1(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, UnlockablesModel.TABLE_NAME, UnlockablesModel.DATAVERSION, UnlockablesModel.ADDCOLUMNDATAVERSION);
    }

    public final void migrateDB_1047_10(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDB_1047_10Kt.removeDanglingReferencesPointingToFriendAndFeedTable(paVar);
    }

    public final void migrateDB_1047_11(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1047_2(pa paVar) {
        akcr.b(paVar, "db");
        String str = CharmsModel.TABLE_NAME;
        addColumn(paVar, str, CharmsModel.DESCRIPTIONVARIABLESMETADATA, CharmsModel.ADDCOLUMNDESCRIPTIONVARIABLESMETADATA);
        addColumn(paVar, str, CharmsModel.BITMOJITEMPLATEUSER1ID, CharmsModel.ADDCOLUMNBITMOJITEMPLATEUSER1IDMETADATA);
        addColumn(paVar, str, CharmsModel.BITMOJITEMPLATEUSER2ID, CharmsModel.ADDCOLUMNBITMOJITEMPLATEUSER2IDMETADATA);
    }

    public final void migrateDB_1047_3(pa paVar) {
        akcr.b(paVar, "db");
        String str = StorySnapModel.TABLE_NAME;
        addColumn(paVar, str, StorySnapModel.CREATIVEKITSOURCEAPPNAME, StorySnapModel.ADDCREATIVEKITSOURCEAPPNAMECOLUMN);
        addColumn(paVar, str, StorySnapModel.CREATIVEKITSOURCEAPPOAUTHCLIENTID, StorySnapModel.ADDCREATIVEKITSOURCEAPPOAUTHCLIENTIDCOLUMN);
    }

    public final void migrateDB_1047_4(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedMemberModel.TABLE_NAME, FeedMemberModel.JOINEDTIMESTAMP, FeedMemberModel.ADDJOINEDTIMESTAMPCOLUMN);
    }

    public final void migrateDB_1047_5(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.LEGAL_AGREEMENT);
    }

    public final void migrateDB_1047_6(pa paVar) {
        akcr.b(paVar, "db");
        String str = DiscoverStorySnapModel.TABLE_NAME;
        addColumn(paVar, str, "shareable", DiscoverStorySnapModel.ADDSHAREABLE);
        addColumn(paVar, str, DiscoverStorySnapModel.DYNAMICSNAPSOURCE, DiscoverStorySnapModel.ADDDYNAMICSNAPSOURCE);
    }

    public final void migrateDB_1047_7(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, SnapTokenModel.TABLE_NAME, SnapTokenModel.ACCESSTOKENSPB, SnapTokenModel.ADDACCESSTOKENSPB);
    }

    public final void migrateDB_1047_8(pa paVar, int i) {
        akcr.b(paVar, "db");
    }

    public final void migrateDB_1047_9(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0049 in {6, 8, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void migrateDB_1048_1(defpackage.pa r11) {
        /*
        r10 = this;
        r0 = "db";
        defpackage.akcr.b(r11, r0);
        r0 = "\n                    SELECT _id, storyId FROM Story WHERE kind = 1 AND (storyId LIKE 'high_bits:%low_bits:%');\n                ";
        r0 = defpackage.akfu.b(r0);
        r1 = 0;
        r0 = r11.a(r0, r1);
        r0 = (java.io.Closeable) r0;
        r2 = r0;	 Catch:{ Throwable -> 0x0042 }
        r2 = (android.database.Cursor) r2;	 Catch:{ Throwable -> 0x0042 }
        r3 = r2.moveToNext();	 Catch:{ Throwable -> 0x0042 }
        if (r3 == 0) goto L_0x003c;	 Catch:{ Throwable -> 0x0042 }
        r3 = 0;	 Catch:{ Throwable -> 0x0042 }
        r4 = r2.getLong(r3);	 Catch:{ Throwable -> 0x0042 }
        r6 = "UPDATE Story SET isPostable=0 WHERE _id = ?;";	 Catch:{ Throwable -> 0x0042 }
        r7 = 1;	 Catch:{ Throwable -> 0x0042 }
        r8 = new java.lang.Long[r7];	 Catch:{ Throwable -> 0x0042 }
        r9 = java.lang.Long.valueOf(r4);	 Catch:{ Throwable -> 0x0042 }
        r8[r3] = r9;	 Catch:{ Throwable -> 0x0042 }
        r11.b(r6, r8);	 Catch:{ Throwable -> 0x0042 }
        r6 = "UPDATE StorySnap SET expirationTimestamp=0 WHERE storyRowId = ?;";	 Catch:{ Throwable -> 0x0042 }
        r7 = new java.lang.Long[r7];	 Catch:{ Throwable -> 0x0042 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ Throwable -> 0x0042 }
        r7[r3] = r4;	 Catch:{ Throwable -> 0x0042 }
        r11.b(r6, r7);	 Catch:{ Throwable -> 0x0042 }
        goto L_0x0015;
        defpackage.akax.a(r0, r1);
        return;
        r11 = move-exception;
        goto L_0x0045;
        r11 = move-exception;
        r1 = r11;
        throw r1;	 Catch:{ all -> 0x0040 }
        defpackage.akax.a(r0, r1);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.SnapDbSchemaVersionController.migrateDB_1048_1(pa):void");
    }

    public final void migrateDB_1048_2(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1048_3(pa paVar) {
        akcr.b(paVar, "db");
        createIndex(paVar, Indices.UNLOCKABLES_UNLOCK_MECHANISM);
    }

    public final void migrateDB_1048_4(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("DELETE FROM FriendSyncState");
        paVar.c("DELETE FROM FeedSyncState");
    }

    public final void migrateDB_1048_5(pa paVar) {
        akcr.b(paVar, "db");
    }

    public final void migrateDB_1048_7(pa paVar) {
        akcr.b(paVar, "db");
        migrateDB_1047_6(paVar);
    }

    public final void migrateDB_1048_8(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, UnlockablesModel.TABLE_NAME, UnlockablesModel.REMOVEDLOCALLY, UnlockablesModel.ADDCOLUMNREMOVEDLOCALLY);
        createIndex(paVar, Indices.UNLOCKABLES_REMOVED_LOCALLY);
    }

    public final void migrateDB_1049_1(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.LENS_STATISTICS_STORAGE);
    }

    public final void migrateDB_1049_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.GROUPCREATIONREQUESTID, FeedModel.ADDGROUPCREATIONREQUESTID);
    }

    public final void migrateDB_1049_3(pa paVar) {
        akcr.b(paVar, "db");
        String str = DiscoverStorySnapModel.TABLE_NAME;
        addColumn(paVar, str, "filterId", DiscoverStorySnapModel.ADDFILTERIDCOLUMN);
        addColumn(paVar, str, "storyFilterId", DiscoverStorySnapModel.ADDSTORYFILTERIDCOLUMN);
        addColumn(paVar, str, "venueId", DiscoverStorySnapModel.ADDVENUEIDCOLUMN);
        addColumn(paVar, str, "unlockablesSnapInfo", DiscoverStorySnapModel.ADDUNLOCKABLESSNAPINFOCOLUMN);
        addColumn(paVar, str, "encryptedGeoLoggingData", DiscoverStorySnapModel.ADDENCRYPTEDGEOLOGGINGDATACOLUMN);
    }

    public final void migrateDB_1049_4(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, StorySnapModel.TABLE_NAME, StorySnapModel.SERVERRANKINGID, StorySnapModel.ADDSERVERRANKINGIDCOLUMN);
    }

    public final void migrateDB_1049_5(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.RETRO_PERSISTENCE_EVENTS);
    }

    public final void migrateDB_1049_6(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.COGNAC_APP_LIST);
    }

    public final void migrateDB_1049_7(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDB_1047_10Kt.removeDanglingReferencesPointingToFriendAndFeedTable(paVar);
    }

    public final void migrateDB_1050_1(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.ISTEMPORARYGROUP, FeedModel.ADDISTEMPORARYGROUP);
    }

    public final void migrateDB_1050_10(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1050_11(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, MobStoryMetadataModel.TABLE_NAME);
        createTable(paVar, MobStoryMetadataModel.CREATE_TABLE);
    }

    public final void migrateDB_1050_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.ISARROYO, FeedModel.ADDISARROYO);
    }

    public final void migrateDB_1050_3(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, MessageModel.TABLE_NAME, MessageModel._MODIFIEDTIMESTAMP, MessageModel.ADDMODIFIEDTIMESTAMP);
        paVar.c(MessageModel.CREATEMODIFICATIONTRIGGER);
    }

    public final void migrateDB_1050_4(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.MOB_STORY_METADATA);
    }

    public final void migrateDB_1050_6(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.COGNAC_LOCAL_STORAGE);
    }

    public final void migrateDB_1050_7(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FriendModel.TABLE_NAME, FriendModel.ISOFFICIAL, FriendModel.ADDISOFFICIAL);
    }

    public final void migrateDB_1050_8(pa paVar) {
        akcr.b(paVar, "db");
        String str = PublisherSnapPageModel.TABLE_NAME;
        String str2 = PublisherSnapPageModel.PUBLISHERFORMALNAME;
        addColumn(paVar, str, str2, PublisherSnapPageModel.ADDPUBLISHERFORMALNAME);
        StringBuilder stringBuilder = new StringBuilder("UPDATE ");
        stringBuilder.append(str);
        stringBuilder.append(" SET ");
        stringBuilder.append(str2);
        stringBuilder.append(" = ");
        stringBuilder.append(PublisherSnapPageModel.PUBLISHERNAME);
        paVar.c(stringBuilder.toString());
    }

    public final void migrateDB_1050_9(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("DROP TRIGGER IF EXISTS message_modifiedTimestamp");
        paVar.c(MessageModel.CREATEMODIFICATIONTRIGGER);
        paVar.c(MessageModel.CREATEMODIFICATIONINSERTTRIGGER);
    }

    public final void migrateDB_1051_1(pa paVar) {
        akcr.b(paVar, "db");
        String str = "hidden";
        String str2 = FeedModel.TABLE_NAME;
        addColumn(paVar, str2, str, FeedModel.ADDHIDDENBOOLEAN);
        String str3 = "UPDATE ";
        StringBuilder stringBuilder = new StringBuilder(str3);
        stringBuilder.append(str2);
        String str4 = " SET ";
        stringBuilder.append(str4);
        stringBuilder.append(str);
        String str5 = "=1 WHERE ";
        stringBuilder.append(str5);
        stringBuilder.append("lastInteractionTimestamp");
        stringBuilder.append(" IS NULL");
        paVar.c(stringBuilder.toString());
        stringBuilder = new StringBuilder(str3);
        stringBuilder.append(str2);
        stringBuilder.append(str4);
        stringBuilder.append(str);
        stringBuilder.append(str5);
        stringBuilder.append(FeedModel.GROUPSYNCCONTENTTYPE);
        stringBuilder.append(" = 0 AND ");
        stringBuilder.append("kind");
        stringBuilder.append(" = 1");
        paVar.c(stringBuilder.toString());
    }

    public final void migrateDB_1051_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FriendWhoAddedMeModel.TABLE_NAME, FriendWhoAddedMeModel.HASVIEWED, FriendWhoAddedMeModel.ADDHASVIEWED);
    }

    public final void migrateDB_1051_3(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.CONFIG_ETAG);
    }

    public final void migrateDB_1051_4(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1051_5(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.SENDTO_LAST_SNAP_RECIPIENTS);
    }

    public final void migrateDB_1051_6(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FriendmojiModel.TABLE_NAME, FriendmojiModel.PICKERDESCRIPTION, FriendmojiModel.ADDPICKERDESCRIPTION);
    }

    public final void migrateDB_1051_7(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1051_8(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, Tables.RETRO_PERSISTENCE_EVENTS.getTableName());
        createTable(paVar, "\n                    CREATE TABLE IF NOT EXISTS RetroPersistenceEvents (\n                    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n                    category INTEGER NOT NULL,\n                    batchTrackUrl TEXT,\n                    singleTrackUrl TEXT NOT NULL,\n                    payload BLOB NOT NULL,\n                    numberOfAttempts INTEGER NOT NULL DEFAULT 1,\n                    expirationTimestampMillis INTEGER NOT NULL);\n                ");
    }

    public final void migrateDB_1051_9(pa paVar) {
        akcr.b(paVar, "db");
        createIndex(paVar, Indices.FRIEND_USERNAME);
        createIndex(paVar, Indices.STORY_USERNAME);
        createIndex(paVar, Indices.STORY_SNAP_STORY_ROW_ID);
        createIndex(paVar, Indices.STORY_SNAP_USERNAME);
        createIndex(paVar, Indices.STORY_SNAP_SNAP_ROW_ID);
        createIndex(paVar, Indices.MOBSTORY_METADATA_STORY_ROW_ID);
        createIndex(paVar, Indices.POSTABLE_STORY_STORY_ROW_ID);
        createIndex(paVar, Indices.STORY_NOTE_STORY_SNAP_ROW_ID);
    }

    public final void migrateDB_1052_1(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.CONNECTED_APPS);
        createTable(paVar, (TableSpec) Tables.CONNECTED_APP_SCOPES);
        createIndex(paVar, Indices.CONNECTED_APP_SCOPES_APP_ID_PLUS_NAME);
    }

    public final void migrateDB_1052_2(pa paVar) {
        akcr.b(paVar, "db");
        createIndex(paVar, Indices.STORY_NOTE_STORY_SNAP_ROW_ID_VIEWER);
        createIndex(paVar, Indices.STORY_NOTE_SNAP_ID);
    }

    public final void migrateDB_1052_3(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, Tables.CONNECTED_APP_SCOPES.getTableName());
        createTable(paVar, (TableSpec) Tables.CONNECTED_APP_SCOPES);
        createIndex(paVar, Indices.CONNECTED_APP_SCOPES_APP_ID_PLUS_NAME);
    }

    public final void migrateDB_1052_4(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, UnlockablesModel.TABLE_NAME, "checksum", UnlockablesModel.ADDCOLUMNCHECKSUM);
    }

    public final void migrateDB_1052_5(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.PLAYABLE_FRIEND_STORIES_MAPPING);
        markViewSchemaChanged(Tables.FRIEND_STORIES_ACTIVE_SNAPS);
    }

    public final void migrateDB_1052_6(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1052_7(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.FRIEND_STORIES_ACTIVE_SNAPS);
        markViewSchemaChanged(Tables.FRIENDS_FEED);
    }

    public final void migrateDB_1052_8(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.SOURCEPAGE, FeedModel.ADDSOURCEPAGE);
    }

    public final void migrateDB_1053_1(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, CognacAppListModel.TABLE_NAME, CognacAppListModel.ISCOMPATIBLE, CognacAppListModel.ADDISCOMPATIBLE);
    }

    public final void migrateDB_1054_1(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.CHAT_ATTACHMENTS);
    }

    public final void migrateDB_1054_2(pa paVar) {
        akcr.b(paVar, "db");
        paVar.c("DELETE FROM FriendSyncState");
    }

    public final void migrateDB_1054_3(pa paVar) {
        akcr.b(paVar, "db");
        String str = CognacAppListModel.TABLE_NAME;
        addColumn(paVar, str, CognacAppListModel.PUBLISHERTYPE, CognacAppListModel.ADDPUBLISHERTYPE);
        addColumn(paVar, str, CognacAppListModel.PRIVACYPOLICYURL, CognacAppListModel.ADDPRIVACYPOLICYURL);
        addColumn(paVar, str, CognacAppListModel.TERMSOFSERVICEURL, CognacAppListModel.ADDTERMSOFSERVICEURL);
    }

    public final void migrateDB_1054_4(pa paVar) {
        akcr.b(paVar, "db");
        markViewSchemaChanged(Tables.DISCOVER_FEED);
    }

    public final void migrateDB_1054_5(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.BENCHMARK_REQUEST);
    }

    public final void migrateDB_1054_6(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, Tables.CHAT_ATTACHMENTS.getTableName());
        executeStatement(paVar, MigrateDB_1054_6Kt.getChatAttachmentsTableCreateStatement_1054_6());
    }

    public final void migrateDB_1054_7(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.WEATHER);
    }

    public final void migrateDB_1054_8(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.CONFIG_RULE);
    }

    public final void migrateDB_1055_1(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.PROFILE_SAVED_MEDIA_MESSAGE);
    }

    public final void migrateDB_1055_2(pa paVar) {
        akcr.b(paVar, "db");
        String str = UnlockablesModel.TABLE_NAME;
        addColumn(paVar, str, UnlockablesModel.UPDATETIME, UnlockablesModel.ADDUPDATETIME);
        addColumn(paVar, str, UnlockablesModel.ORDERPOSITION, UnlockablesModel.ADDORDERPOSITION);
    }

    public final void migrateDB_1055_3(pa paVar) {
        akcr.b(paVar, "db");
        MigrateDB_1047_10Kt.removeDanglingReferencesPointingToFriendAndFeedTable(paVar);
    }

    public final void migrateDB_1055_4(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, Tables.CHARMS.getTableName(), CharmsModel.DISPLAYCOUNT, CharmsModel.ADDCOLUMNDISPLAYCOUNT);
    }

    public final void migrateDB_1055_5(pa paVar) {
        akcr.b(paVar, "db");
        String str = PublisherSnapPageModel.TABLE_NAME;
        addColumn(paVar, str, PublisherSnapPageModel.TILEID, PublisherSnapPageModel.ADDTILEID);
        addColumn(paVar, str, PublisherSnapPageModel.TILEIMAGEURL, PublisherSnapPageModel.ADDTILEIMAGEURL);
    }

    public final void migrateDB_1055_6(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, "BitmojiSticker");
        dropTable(paVar, "ContextualSticker");
        dropTable(paVar, "CustomStickerImage");
        dropTable(paVar, "RecentSticker");
        dropTable(paVar, "StickerTag");
    }

    public final void migrateDB_1056_1(pa paVar) {
        akcr.b(paVar, "db");
        dropTable(paVar, "ShakeTicket");
    }

    public final void migrateDB_1056_2(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.GROUPCREATIONTIMESTAMP, FeedModel.ADDGROUPCREATIONTIMESTAMP);
    }

    public final void migrateDB_1056_3(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FriendModel.TABLE_NAME, FriendModel.SNAPPROID, FriendModel.ADDSNAPPROID);
    }

    public final void migrateDB_1056_4(pa paVar) {
        akcr.b(paVar, "db");
        createTable(paVar, (TableSpec) Tables.UPLOADED_MEDIA_TABLE);
    }

    public final void migrateDB_1056_5(pa paVar) {
        akcr.b(paVar, "db");
        String str = PublisherSnapPageModel.TABLE_NAME;
        addColumn(paVar, str, PublisherSnapPageModel.TILEHEADLINE, PublisherSnapPageModel.ADDTILEHEADLINE);
        addColumn(paVar, str, PublisherSnapPageModel.TILEPROGRESS, PublisherSnapPageModel.ADDTILEPROGRESS);
        addColumn(paVar, str, PublisherSnapPageModel.TILESHOWSUBTITLE, PublisherSnapPageModel.ADDTILESHOWSUBTITLE);
        addColumn(paVar, str, PublisherSnapPageModel.TILEBADGESIZE, PublisherSnapPageModel.ADDTILEBADGESIZE);
        addColumn(paVar, str, PublisherSnapPageModel.TILEBADGETITLE, PublisherSnapPageModel.ADDTILEBADGETITLE);
        addColumn(paVar, str, PublisherSnapPageModel.TILEBADGEBGCOLOR, PublisherSnapPageModel.ADDTILEBADGEBGCOLOR);
        addColumn(paVar, str, PublisherSnapPageModel.TILEBADGETEXTCOLOR, PublisherSnapPageModel.ADDTILEBADGETEXTCOLOR);
    }

    public final void migrateDB_1056_6(pa paVar) {
        akcr.b(paVar, "db");
        addColumn(paVar, FeedModel.TABLE_NAME, FeedModel.COGNACNOTIFICATIONMUTED, FeedModel.ADDCOGNACNOTIFICATIONMUTED);
    }

    public final void recreateSchemaChangedViews(pa paVar) {
        akcr.b(paVar, "db");
        for (Tables recreateView : ajyu.a((Iterable) this.schemaChangedViews, (Comparator) new SnapDbSchemaVersionController$recreateSchemaChangedViews$$inlined$compareBy$1())) {
            recreateView(paVar, recreateView);
        }
    }

    public final void upgrade(pa paVar, int i, int i2) {
        akcr.b(paVar, "db");
        if (i < 59) {
            migrateDB_1036_12(paVar);
        }
        if (i < 60) {
            migrateDB_1036_13(paVar);
        }
        if (i < 61) {
            migrateDB_1037_1(paVar);
        }
        if (i < 62) {
            migrateDB_1037_2(paVar);
        }
        if (i < 63) {
            migrateDB_1037_3(paVar);
        }
        if (i < 64) {
            migrateDB_1037_4(paVar);
        }
        if (i < 65) {
            migrateDB_1037_5(paVar);
        }
        if (i < 66) {
            migrateDB_1037_6(paVar);
        }
        if (i < 67) {
            migrateDB_1037_8(paVar);
        }
        if (i < 68) {
            migrateDB_1037_9(paVar);
        }
        if (i < 69) {
            migrateDB_1037_10(paVar);
        }
        if (i < 70) {
            migrateDB_1037_11(paVar);
        }
        if (i < 71) {
            migrateDB_1038_1(paVar);
        }
        if (i < 72) {
            migrateDB_1038_2(paVar);
        }
        if (i < 73) {
            migrateDB_1038_3(paVar);
        }
        if (i < 74) {
            migrateDB_1038_4(paVar);
        }
        if (i < 75) {
            migrateDB_1038_5(paVar);
        }
        if (i < 76) {
            migrateDB_1038_6(paVar);
        }
        if (i < 77) {
            migrateDB_1038_7(paVar);
        }
        if (i < 78) {
            migrateDB_1039_1(paVar);
        }
        if (i < 79) {
            migrateDB_1039_2(paVar);
        }
        if (i < 80) {
            migrateDB_1039_3(paVar);
        }
        if (i < 81) {
            migrateDB_1039_4(paVar);
        }
        if (i < 82) {
            migrateDB_1039_5(paVar);
        }
        if (i < 83) {
            migrateDB_1039_6(paVar);
        }
        if (i < 84) {
            migrateDB_1039_7(paVar);
        }
        if (i < 85) {
            migrateDB_1040_1(paVar);
        }
        if (i < 86) {
            migrateDB_1040_2(paVar);
        }
        if (i < 87) {
            migrateDB_1040_3(paVar);
        }
        if (i < 88) {
            migrateDB_1040_4(paVar);
        }
        if (i < 89) {
            migrateDB_1040_5(paVar);
        }
        if (i < 90) {
            migrateDB_1040_6(paVar);
        }
        if (i < 91) {
            migrateDB_1040_7(paVar);
        }
        if (i < 92) {
            migrateDB_1041_1(paVar);
        }
        if (i < 95) {
            migrateDB_1041_4(paVar);
        }
        if (i < 96) {
            migrateDB_1041_5(paVar);
        }
        if (i < 97) {
            migrateDB_1042_1(paVar);
        }
        if (i < 98) {
            migrateDB_1042_2(paVar);
        }
        if (i < 99) {
            migrateDB_1042_3(paVar);
        }
        if (i < 100) {
            migrateDB_1042_4(paVar);
        }
        if (i < 101) {
            migrateDB_1042_5(paVar);
        }
        if (i < 102) {
            migrateDB_1042_6(paVar);
        }
        if (i < 104) {
            migrateDB_1042_8(paVar);
        }
        if (i < 106) {
            migrateDB_1042_10(paVar);
        }
        if (i < 107) {
            migrateDB_1042_11(paVar);
        }
        if (i < 108) {
            migrateDB_1042_12(paVar);
        }
        if (i < 109) {
            migrateDB_1043_1(paVar);
        }
        if (i < 110) {
            migrateDB_1043_2(paVar);
        }
        if (i < 111) {
            migrateDB_1043_3(paVar);
        }
        if (i < 112) {
            migrateDB_1043_4(paVar);
        }
        if (i < 113) {
            migrateDB_1043_5(paVar);
        }
        if (i < 115) {
            migrateDB_1044_1(paVar);
        }
        if (i < 116) {
            migrateDB_1044_2(paVar);
        }
        if (i < 117) {
            migrateDB_1044_3(paVar);
        }
        if (i < 118) {
            migrateDB_1044_4(paVar);
        }
        if (i < 119) {
            migrateDB_1044_5(paVar);
        }
        if (i < 120) {
            migrateDB_1044_6(paVar);
        }
        if (i < Imgproc.COLOR_YUV2RGBA_YVYU) {
            migrateDB_1044_7(paVar);
        }
        if (i < Imgproc.COLOR_YUV2BGRA_YVYU) {
            migrateDB_1044_8(paVar);
        }
        if (i < 123) {
            migrateDB_1044_9(paVar);
        }
        if (i < 124) {
            migrateDB_1044_10(paVar);
        }
        if (i < 125) {
            migrateDB_1044_11(paVar);
        }
        if (i < 126) {
            migrateDB_1044_12(paVar);
        }
        if (i < 127) {
            migrateDB_1044_13(paVar);
        }
        if (i < 128) {
            migrateDB_1044_14(paVar);
        }
        if (i < 130) {
            migrateDB_1044_16(paVar);
        }
        if (i < Imgproc.COLOR_RGB2YUV_YV12) {
            migrateDB_1045_1(paVar);
        }
        if (i < Imgproc.COLOR_RGBA2YUV_YV12) {
            migrateDB_1045_3(paVar);
        }
        if (i < Imgproc.COLOR_BGRA2YUV_YV12) {
            migrateDB_1045_4(paVar);
        }
        if (i < 135) {
            migrateDB_1045_5(paVar);
        }
        if (i < 136) {
            migrateDB_1045_6(paVar);
        }
        if (i < 137) {
            migrateDB_1045_7(paVar);
        }
        if (i < 138) {
            migrateDB_1045_8(paVar);
        }
        if (i < 140) {
            migrateDB_1045_10(paVar);
        }
        if (i < 141) {
            migrateDB_1045_11(paVar);
        }
        if (i < 142) {
            migrateDB_1045_12(paVar);
        }
        if (i < 143) {
            migrateDB_1045_13(paVar);
        }
        if (i < 144) {
            migrateDB_1046_1(paVar);
        }
        if (i < 145) {
            migrateDB_1046_2(paVar);
        }
        if (i < 146) {
            migrateDB_1046_3(paVar);
        }
        if (i < 148) {
            migrateDB_1046_5(paVar);
        }
        if (i < 149) {
            migrateDB_1047_1(paVar);
        }
        if (i < MapboxConstants.ANIMATION_DURATION_SHORT) {
            migrateDB_1047_2(paVar);
        }
        if (i < 151) {
            migrateDB_1047_3(paVar);
        }
        if (i < 152) {
            migrateDB_1047_4(paVar);
        }
        if (i < 153) {
            migrateDB_1047_5(paVar);
        }
        if (i < 154) {
            migrateDB_1047_6(paVar);
        }
        if (i < 155) {
            migrateDB_1047_7(paVar);
        }
        if (i < 156) {
            migrateDB_1047_8(paVar, i);
        }
        if (i < 157) {
            migrateDB_1047_9(paVar);
        }
        if (i < 158) {
            migrateDB_1047_10(paVar);
        }
        if (i < 159) {
            migrateDB_1047_11(paVar);
        }
        if (i < 160) {
            migrateDB_1048_1(paVar);
        }
        if (i < 161) {
            migrateDB_1048_2(paVar);
        }
        if (i < 162) {
            migrateDB_1048_3(paVar);
        }
        if (i < 163) {
            migrateDB_1048_4(paVar);
        }
        if (i < 164) {
            migrateDB_1048_5(paVar);
        }
        if (i < 166) {
            migrateDB_1048_7(paVar);
        }
        if (i < 167) {
            migrateDB_1048_8(paVar);
        }
        if (i < 168) {
            migrateDB_1049_1(paVar);
        }
        if (i < 169) {
            migrateDB_1049_2(paVar);
        }
        if (i < 170) {
            migrateDB_1049_3(paVar);
        }
        if (i < 171) {
            migrateDB_1049_4(paVar);
        }
        if (i < 172) {
            migrateDB_1049_5(paVar);
        }
        if (i < 173) {
            migrateDB_1049_6(paVar);
        }
        if (i < 174) {
            migrateDB_1049_7(paVar);
        }
        if (i < 175) {
            migrateDB_1050_1(paVar);
        }
        if (i < 176) {
            migrateDB_1050_2(paVar);
        }
        if (i < 177) {
            migrateDB_1050_3(paVar);
        }
        if (i < 178) {
            migrateDB_1050_4(paVar);
        }
        if (i < 180) {
            migrateDB_1050_6(paVar);
        }
        if (i < 181) {
            migrateDB_1050_7(paVar);
        }
        if (i < 182) {
            migrateDB_1050_8(paVar);
        }
        if (i < 183) {
            migrateDB_1050_9(paVar);
        }
        if (i < 184) {
            migrateDB_1050_10(paVar);
        }
        if (i < 185) {
            migrateDB_1050_11(paVar);
        }
        if (i < 186) {
            migrateDB_1051_1(paVar);
        }
        if (i < 187) {
            migrateDB_1051_2(paVar);
        }
        if (i < 188) {
            migrateDB_1051_3(paVar);
        }
        if (i < 189) {
            migrateDB_1051_4(paVar);
        }
        if (i < 190) {
            migrateDB_1051_5(paVar);
        }
        if (i < 191) {
            migrateDB_1051_6(paVar);
        }
        if (i < 192) {
            migrateDB_1051_7(paVar);
        }
        if (i < 193) {
            migrateDB_1051_8(paVar);
        }
        if (i < 194) {
            migrateDB_1051_9(paVar);
        }
        if (i < 195) {
            migrateDB_1052_1(paVar);
        }
        if (i < 196) {
            migrateDB_1052_2(paVar);
        }
        if (i < 197) {
            migrateDB_1052_3(paVar);
        }
        if (i < 198) {
            migrateDB_1052_4(paVar);
        }
        if (i < 199) {
            migrateDB_1052_5(paVar);
        }
        if (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
            migrateDB_1052_6(paVar);
        }
        if (i < 201) {
            migrateDB_1052_7(paVar);
        }
        if (i < 202) {
            migrateDB_1052_8(paVar);
        }
        if (i < 203) {
            migrateDB_1053_1(paVar);
        }
        if (i < 204) {
            migrateDB_1054_1(paVar);
        }
        if (i < 205) {
            migrateDB_1054_2(paVar);
        }
        if (i < 206) {
            migrateDB_1054_3(paVar);
        }
        if (i < 207) {
            migrateDB_1054_4(paVar);
        }
        if (i < 208) {
            migrateDB_1054_5(paVar);
        }
        if (i < 209) {
            migrateDB_1054_6(paVar);
        }
        if (i < 210) {
            migrateDB_1054_7(paVar);
        }
        if (i < 211) {
            migrateDB_1054_8(paVar);
        }
        if (i < 214) {
            migrateDB_1055_1(paVar);
        }
        if (i < 215) {
            migrateDB_1055_2(paVar);
        }
        if (i < 216) {
            migrateDB_1055_3(paVar);
        }
        if (i < 217) {
            migrateDB_1055_4(paVar);
        }
        if (i < 218) {
            migrateDB_1055_5(paVar);
        }
        if (i < 219) {
            migrateDB_1055_6(paVar);
        }
        if (i < 220) {
            migrateDB_1056_1(paVar);
        }
        if (i < 221) {
            migrateDB_1056_2(paVar);
        }
        if (i < 222) {
            migrateDB_1056_3(paVar);
        }
        if (i < 223) {
            migrateDB_1056_4(paVar);
        }
        if (i < 224) {
            migrateDB_1056_5(paVar);
        }
        if (i < SnapDbSchemaVersionControllerKt.SNAP_DB_CURRENT_VERSION) {
            migrateDB_1056_6(paVar);
        }
        recreateSchemaChangedViews(paVar);
    }
}

package com.snap.core.db;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.SnapDbCoreFeature;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import com.snap.core.db.query.DiscoverFeedModel;
import com.snap.core.db.query.FriendsFeedModel;
import com.snap.core.db.record.BenchmarkRequestRecordModel;
import com.snap.core.db.record.BestFriendModel;
import com.snap.core.db.record.CharmsModel;
import com.snap.core.db.record.CharmsOwnerMetadataModel;
import com.snap.core.db.record.ChatAttachmentsModel;
import com.snap.core.db.record.CognacAppListModel;
import com.snap.core.db.record.CognacLocalStorageModel;
import com.snap.core.db.record.CognacRVModel;
import com.snap.core.db.record.CognacStateModel;
import com.snap.core.db.record.ConfigEtagModel;
import com.snap.core.db.record.ConfigRuleModel;
import com.snap.core.db.record.ConnectedAppScopesModel;
import com.snap.core.db.record.ConnectedAppsModel;
import com.snap.core.db.record.ContactModel;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.DdmlModelModel;
import com.snap.core.db.record.DiscoverFeedSectionsModel;
import com.snap.core.db.record.DiscoverFeedStoryModel;
import com.snap.core.db.record.DiscoverStorySnapModel;
import com.snap.core.db.record.FeedItemSyncStateModel;
import com.snap.core.db.record.FeedMemberModel;
import com.snap.core.db.record.FeedModel;
import com.snap.core.db.record.FeedSyncStateModel;
import com.snap.core.db.record.FriendModel;
import com.snap.core.db.record.FriendSyncStateModel;
import com.snap.core.db.record.FriendWhoAddedMeModel;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.core.db.record.FriendsFeedScoreModel;
import com.snap.core.db.record.FriendsFeedServerSignalsModel;
import com.snap.core.db.record.FriendsFeedSharedSignalsModel;
import com.snap.core.db.record.GeofilterModel;
import com.snap.core.db.record.InteractionMessagesModel;
import com.snap.core.db.record.LegalAgreementModel;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.MessageModel;
import com.snap.core.db.record.MessagingSnapModel;
import com.snap.core.db.record.MobStoryMetadataModel;
import com.snap.core.db.record.MultiRecipientSendingSnapModel;
import com.snap.core.db.record.MultiRecipientSnapModel;
import com.snap.core.db.record.NetworkGatewayInfoModel;
import com.snap.core.db.record.NetworkMessageModel;
import com.snap.core.db.record.PendingSnapModel;
import com.snap.core.db.record.PlaybackSnapViewModel;
import com.snap.core.db.record.PostableStoryModel;
import com.snap.core.db.record.PreferencesModel;
import com.snap.core.db.record.PromotedStorySnapModel;
import com.snap.core.db.record.PublisherSnapPageModel;
import com.snap.core.db.record.RetroPersistenceEventsModel;
import com.snap.core.db.record.SeenSequenceNumbersModel;
import com.snap.core.db.record.SendToLastSnapRecipientsModel;
import com.snap.core.db.record.SequenceNumbersModel;
import com.snap.core.db.record.SnapModel;
import com.snap.core.db.record.SnapTokenModel;
import com.snap.core.db.record.StickerMessageModel;
import com.snap.core.db.record.StoryCorpusSignalsModel;
import com.snap.core.db.record.StoryInteractionSignalsModel;
import com.snap.core.db.record.StoryModel;
import com.snap.core.db.record.StoryNoteModel;
import com.snap.core.db.record.StorySnapModel;
import com.snap.core.db.record.StorySubscriptionModel;
import com.snap.core.db.record.StorySyncStateModel;
import com.snap.core.db.record.SuggestedFriendModel;
import com.snap.core.db.record.SuggestedFriendPlacementModel;
import com.snap.core.db.record.TalkAuthContextModel;
import com.snap.core.db.record.TopSuggestedFriendModel;
import com.snap.core.db.record.UnlockablesModel;
import com.snap.core.db.record.UploadedMediaModel;
import defpackage.ajyh;
import defpackage.akcr;
import java.util.List;

public final class SnapDbSchema implements DbSchema {

    public enum TableConstraints {
    }

    public enum Indices implements IndexSpec {
        DISCOVER_STORY_SNAP("discoverStorySnap_idx_storyRowId", Tables.DISCOVER_STORY_SNAP, false, r9),
        FEED_TIMESTAMP("feed_timestamp", Tables.FEED, false, "lastInteractionTimestamp DESC"),
        FEED_FRIEND("feed_friendRowId", Tables.FEED, false, "friendRowId"),
        MESSAGE_FEED("message_idx_feedRowId", Tables.MESSAGE, false, r2),
        MESSAGE_MEDIA_REF("message_media_ref_idx_messageId", Tables.MESSAGE_MEDIA_REF, false, "messageId"),
        MULTI_RECIPIENT_KEY("multi_recipient_snap_key", Tables.MULTI_RECIPIENT_SNAP, false, "key ASC"),
        NETWORK_MESSAGE_CONVERSATION("message_idx_conversation", Tables.NETWORK_MESSAGE, false, "conversationId"),
        PENDING_SNAP_FEED("pending_snap_feed", Tables.PENDING_SNAP, false, r2),
        PLAYBACK_SNAP_VIEW_ROW_ID("playback_snap_view_row_id", Tables.PLAYBACK_SNAP_VIEW, false, r3),
        PLAYBACK_VIEW_SNAP_ID("playback_view_snap_id", Tables.PLAYBACK_SNAP_VIEW, true, r4),
        PLAYBACK_VIEW_STORY_ID("playback_view_story_id", Tables.PLAYBACK_SNAP_VIEW, false, "storyId", PlaybackSnapViewModel.VIEWSTARTTIMESTAMPMILLIS),
        PUBLISHER_SNAP_PAGE("publisher_snap_story_row_id", Tables.PUBLISHER_SNAP_PAGE, false, r9),
        SEQUENCE_NUMBERS("sequence_number_user_idx", Tables.SEQUENCE_NUMBERS, true, r2, r5),
        UNLOCKABLES_TYPE("unlockbales_type_index", Tables.UNLOCKABLES, false, "type"),
        UNLOCKABLES_UNLOCK_MECHANISM("unlockables_unlock_mechanism_index", Tables.UNLOCKABLES, false, UnlockablesModel.UNLOCKMECHANISM),
        UNLOCKABLES_REMOVED_LOCALLY("unlockables_removed_locally_index", Tables.UNLOCKABLES, false, UnlockablesModel.REMOVEDLOCALLY),
        FRIEND_USER_ID("friend_user_id_index", Tables.FRIEND, true, "userId"),
        SNAP_ROW_ID("snap_row_id_index", Tables.MESSAGING_SNAP, true, r3),
        MESSAGE_ROW_ID("message_row_id_index", Tables.MESSAGING_SNAP, true, MessagingSnapModel.MESSAGEROWID),
        FRIEND_USERNAME("friend_username", Tables.FRIEND, true, r5),
        STORY_USERNAME("story_username", Tables.STORY, false, StoryModel.USERNAME),
        STORY_SNAP_STORY_ROW_ID("story_snap_story_row_id", Tables.STORY_SNAP, false, r9),
        STORY_SNAP_USERNAME("story_snap_username", Tables.STORY_SNAP, false, r5),
        STORY_SNAP_SNAP_ROW_ID("story_snap_snap_row_id", Tables.STORY_SNAP, false, r3),
        MOBSTORY_METADATA_STORY_ROW_ID("mob_story_metadata_story_row_id", Tables.MOB_STORY_METADATA, true, r9),
        POSTABLE_STORY_STORY_ROW_ID("postable_story_story_row_id", Tables.POSTABLE_STORY, true, r9),
        STORY_NOTE_STORY_SNAP_ROW_ID("story_notes_snap_row_id", r9, false, r2),
        STORY_NOTE_STORY_SNAP_ROW_ID_VIEWER("story_notes_story_snap_row_id_viewer", Tables.STORY_NOTE, true, r2, StoryNoteModel.VIEWER),
        STORY_NOTE_SNAP_ID("story_notes_snap_id", Tables.STORY_NOTE, false, r4),
        CONNECTED_APP_SCOPES_APP_ID_PLUS_NAME("connected_app_scopes_app_id_plus_name", Tables.CONNECTED_APP_SCOPES, true, "appId", "name");
        
        private final String[] indexColumns;
        private final String indexName;
        private final TableSpec table;
        private final boolean unique;

        protected Indices(String str, TableSpec tableSpec, boolean z, String... strArr) {
            akcr.b(str, "indexName");
            akcr.b(tableSpec, "table");
            akcr.b(strArr, "indexColumns");
            this.indexName = str;
            this.table = tableSpec;
            this.unique = z;
            this.indexColumns = strArr;
        }

        public final String[] getIndexColumns() {
            return this.indexColumns;
        }

        public final String getIndexName() {
            return this.indexName;
        }

        public final TableSpec getTable() {
            return this.table;
        }

        public final boolean getUnique() {
            return this.unique;
        }
    }

    public enum Tables implements TableSpec {
        BEST_FRIEND(BestFriendModel.TABLE_NAME, BestFriendModel.CREATE_TABLE, null, 4, null),
        CHARMS(CharmsModel.TABLE_NAME, CharmsModel.CREATE_TABLE, null, 4, null),
        CHARMS_OWNER_METADATA(CharmsOwnerMetadataModel.TABLE_NAME, CharmsOwnerMetadataModel.CREATE_TABLE, null, 4, null),
        CHAT_ATTACHMENTS(ChatAttachmentsModel.TABLE_NAME, ChatAttachmentsModel.CREATE_TABLE, null, 4, null),
        COGNAC_RV(CognacRVModel.TABLE_NAME, CognacRVModel.CREATE_TABLE, null, 4, null),
        COGNAC_STATE(CognacStateModel.TABLE_NAME, CognacStateModel.CREATE_TABLE, null, 4, null),
        COGNAC_APP_LIST(CognacAppListModel.TABLE_NAME, CognacAppListModel.CREATE_TABLE, null, 4, null),
        COGNAC_LOCAL_STORAGE(CognacLocalStorageModel.TABLE_NAME, CognacLocalStorageModel.CREATE_TABLE, null, 4, null),
        CONNECTED_APPS(ConnectedAppsModel.TABLE_NAME, ConnectedAppsModel.CREATE_TABLE, null, 4, null),
        CONNECTED_APP_SCOPES(ConnectedAppScopesModel.TABLE_NAME, ConnectedAppScopesModel.CREATE_TABLE, null, 4, null),
        CONTACTS(ContactModel.TABLE_NAME, ContactModel.CREATE_TABLE, null, 4, null),
        COMMERCE_CHECKOUT_CART("CommerceCheckoutCart", "CREATE TABLE IF NOT EXISTS CommerceCheckoutCart(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storeId TEXT NOT NULL UNIQUE,\n    cart BLOB NOT NULL\n)", null, 4, null),
        DISCOVER_FEED_STORY(DiscoverFeedStoryModel.TABLE_NAME, DiscoverFeedStoryModel.CREATE_TABLE, null, 4, null),
        DISCOVER_STORY_SNAP(DiscoverStorySnapModel.TABLE_NAME, DiscoverStorySnapModel.CREATE_TABLE, null, 4, null),
        FEED_AST(FriendsFeedScoreModel.TABLE_NAME, FriendsFeedScoreModel.CREATE_TABLE, null, 4, null),
        FEED_ITEM_SYNC_STATE(FeedItemSyncStateModel.TABLE_NAME, FeedItemSyncStateModel.CREATE_TABLE, null, 4, null),
        FEED_MEMBER(FeedMemberModel.TABLE_NAME, FeedMemberModel.CREATE_TABLE, null, 4, null),
        FEED_SYNC_STATE(FeedSyncStateModel.TABLE_NAME, FeedSyncStateModel.CREATE_TABLE, null, 4, null),
        FEED(FeedModel.TABLE_NAME, FeedModel.CREATE_TABLE, null, 4, null),
        FRIEND(FriendModel.TABLE_NAME, FriendModel.CREATE_TABLE, null, 4, null),
        FRIEND_SYNC_STATE(FriendSyncStateModel.TABLE_NAME, FriendSyncStateModel.CREATE_TABLE, null, 4, null),
        FRIEND_WHO_ADDDED_ME(FriendWhoAddedMeModel.TABLE_NAME, FriendWhoAddedMeModel.CREATE_TABLE, null, 4, null),
        FRIENDMOJI(FriendmojiModel.TABLE_NAME, FriendmojiModel.CREATE_TABLE, null, 4, null),
        FRIENDS_FEED_SERVER_SIGNAL(FriendsFeedServerSignalsModel.TABLE_NAME, FriendsFeedServerSignalsModel.CREATE_TABLE, null, 4, null),
        FRIENDS_FEED_SHARED_SIGNAL(FriendsFeedSharedSignalsModel.TABLE_NAME, FriendsFeedSharedSignalsModel.CREATE_TABLE, null, 4, null),
        INTERACTION_MESSAGES(InteractionMessagesModel.TABLE_NAME, InteractionMessagesModel.CREATE_TABLE, null, 4, null),
        LOCAL_MESSAGE_ACTION(LocalMessageActionModel.TABLE_NAME, LocalMessageActionModel.CREATE_TABLE, null, 4, null),
        MESSAGE(MessageModel.TABLE_NAME, MessageModel.CREATE_TABLE, null, 4, null),
        MESSAGE_MEDIA_REF(MessageMediaRefModel.TABLE_NAME, MessageMediaRefModel.CREATE_TABLE, null, 4, null),
        MESSAGING_SNAP(MessagingSnapModel.TABLE_NAME, MessagingSnapModel.CREATE_TABLE, null, 4, null),
        MOB_STORY_METADATA(MobStoryMetadataModel.TABLE_NAME, MobStoryMetadataModel.CREATE_TABLE, null, 4, null),
        MULTI_RECIPIENT_SNAP(MultiRecipientSnapModel.TABLE_NAME, MultiRecipientSnapModel.CREATE_TABLE, null, 4, null),
        MULTI_RECIPIENT_SENDING_SNAP(MultiRecipientSendingSnapModel.TABLE_NAME, MultiRecipientSendingSnapModel.CREATE_TABLE, null, 4, null),
        NETWORK_GATEWAY_INFO(NetworkGatewayInfoModel.TABLE_NAME, NetworkGatewayInfoModel.CREATE_TABLE, null, 4, null),
        NETWORK_MESSAGE(NetworkMessageModel.TABLE_NAME, NetworkMessageModel.CREATE_TABLE, null, 4, null),
        PASSPORT_ENTRIES("PassportEntry", "CREATE TABLE IF NOT EXISTS PassportEntry(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    entryId TEXT NOT NULL UNIQUE,\n    cardType INTEGER NOT NULL,\n    title TEXT NOT NULL,\n    subtitle TEXT NOT NULL,\n    timestamp INTEGER NOT NULL,\n    bitmojiStickerId TEXT,\n    friendIds TEXT, -- comma separated list of friendIds,\n    placeId TEXT\n)", null, 4, null),
        PENDING_SNAP(PendingSnapModel.TABLE_NAME, PendingSnapModel.CREATE_TABLE, null, 4, null),
        PLAYBACK_SNAP_VIEW("PlaybackSnapView", PlaybackSnapViewModel.CREATE_TABLE, null, 4, null),
        POSTABLE_STORY("PostableStory", PostableStoryModel.CREATE_TABLE, null, 4, null),
        PUBLISHER_SNAP_PAGE(PublisherSnapPageModel.TABLE_NAME, PublisherSnapPageModel.CREATE_TABLE, null, 4, null),
        PREFERENCES(PreferencesModel.TABLE_NAME, PreferencesModel.CREATE_TABLE, null, 4, null),
        SEQUENCE_NUMBERS(SequenceNumbersModel.TABLE_NAME, SequenceNumbersModel.CREATE_TABLE, null, 4, null),
        SENDTO_LAST_SNAP_RECIPIENTS(SendToLastSnapRecipientsModel.TABLE_NAME, SendToLastSnapRecipientsModel.CREATE_TABLE, null, 4, null),
        SNAP(SnapModel.TABLE_NAME, SnapModel.CREATE_TABLE, null, 4, null),
        STICKER_MESSAGE(StickerMessageModel.TABLE_NAME, StickerMessageModel.CREATE_TABLE, null, 4, null),
        STORY(StoryModel.TABLE_NAME, StoryModel.CREATE_TABLE, null, 4, null),
        STORY_NOTE(StoryNoteModel.TABLE_NAME, StoryNoteModel.CREATE_TABLE, null, 4, null),
        STORY_SNAP(StorySnapModel.TABLE_NAME, StorySnapModel.CREATE_TABLE, null, 4, null),
        STORY_SYNC_STATE(StorySyncStateModel.TABLE_NAME, StorySyncStateModel.CREATE_TABLE, null, 4, null),
        STORY_SUBSCRIPTION(StorySubscriptionModel.TABLE_NAME, StorySubscriptionModel.CREATE_TABLE, null, 4, null),
        SUGGESTED_FRIEND(SuggestedFriendModel.TABLE_NAME, SuggestedFriendModel.CREATE_TABLE, null, 4, null),
        SUGGESTED_FRIEND_PLACEMENT(SuggestedFriendPlacementModel.TABLE_NAME, SuggestedFriendPlacementModel.CREATE_TABLE, null, 4, null),
        TOP_SUGGESTED_FRIEND(TopSuggestedFriendModel.TABLE_NAME, TopSuggestedFriendModel.CREATE_TABLE, null, 4, null),
        TALK_AUTH_CONTEXT(TalkAuthContextModel.TABLE_NAME, TalkAuthContextModel.CREATE_TABLE, null, 4, null),
        SEEN_SEQUENCE_NUMBERS(SeenSequenceNumbersModel.TABLE_NAME, SeenSequenceNumbersModel.CREATE_TABLE, null, 4, null),
        SNAP_TOKEN(SnapTokenModel.TABLE_NAME, SnapTokenModel.CREATE_TABLE, null, 4, null),
        GEOFILTER(GeofilterModel.TABLE_NAME, GeofilterModel.CREATE_TABLE, null, 4, null),
        UNLOCKABLES(UnlockablesModel.TABLE_NAME, UnlockablesModel.CREATE_TABLE, null, 4, null),
        DDML_DATA(DdmlDataModel.TABLE_NAME, DdmlDataModel.CREATE_TABLE, null, 4, null),
        CONFIG_RULE(ConfigRuleModel.TABLE_NAME, ConfigRuleModel.CREATE_TABLE, null, 4, null),
        CONFIG_ETAG(ConfigEtagModel.TABLE_NAME, ConfigEtagModel.CREATE_TABLE, null, 4, null),
        BENCHMARK_REQUEST(BenchmarkRequestRecordModel.TABLE_NAME, BenchmarkRequestRecordModel.CREATE_TABLE, null, 4, null),
        DDML_MODEL(DdmlModelModel.TABLE_NAME, DdmlModelModel.CREATE_TABLE, null, 4, null),
        PROMOTED_STORY_SNAP(PromotedStorySnapModel.TABLE_NAME, PromotedStorySnapModel.CREATE_TABLE, null, 4, null),
        DF_STORY_INTERACTION_SIGNALS(StoryInteractionSignalsModel.TABLE_NAME, StoryInteractionSignalsModel.CREATE_TABLE, null, 4, null),
        DF_STORY_CORPUS_SIGNALS(StoryCorpusSignalsModel.TABLE_NAME, StoryCorpusSignalsModel.CREATE_TABLE, null, 4, null),
        PREVIEW_ATTACHMENT_HISTORY("PreviewAttachmentHistory", "CREATE TABLE IF NOT EXISTS PreviewAttachmentHistory (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    url TEXT NOT NULL UNIQUE,\n    displayedUrl TEXT NOT NULL,\n    faviconPath TEXT NOT NULL,\n    title TEXT NOT NULL\n)", null, 4, null),
        DF_SECTIONS(DiscoverFeedSectionsModel.TABLE_NAME, DiscoverFeedSectionsModel.CREATE_TABLE, null, 4, null),
        LENS_PERSISTENT_STORAGE("LensPersistentStorage", "CREATE TABLE IF NOT EXISTS LensPersistentStorage(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    lensId TEXT NOT NULL UNIQUE,\n    data BLOB NOT NULL\n)", null, 4, null),
        LENS_STATISTICS_STORAGE("LensStatisticsStorage", "CREATE TABLE IF NOT EXISTS LensStatisticsStorage(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    lensId TEXT NOT NULL UNIQUE,\n    impressionCount INTEGER NOT NULL DEFAULT 0\n)", null, 4, null),
        RETRO_PERSISTENCE_EVENTS(RetroPersistenceEventsModel.TABLE_NAME, RetroPersistenceEventsModel.CREATE_TABLE, null, 4, null),
        WEATHER("Weather", "CREATE TABLE IF NOT EXISTS Weather(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    updateTimestamp INTEGER NOT NULL,\n    location TEXT NOT NULL,\n    tempF REAL NOT NULL,\n    forecastType INTEGER NOT NULL,\n    forecastTempF REAL NOT NULL,\n    forecastCondition INTEGER NOT NULL,\n    forecastEpochMs INTEGER NOT NULL\n)", null, 4, null),
        PROFILE_SAVED_MEDIA_MESSAGE("ProfileSavedMediaMessage", "CREATE TABLE IF NOT EXISTS ProfileSavedMediaMessage(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n\n    -- Identifier of the owner to which this saved media belongs.\n    -- If the owner is a friend (this media is saved in a 1:1 conversation),\n    -- this value will be the string representation of the UUID of the friend’s user ID.\n    -- If the owner is a chat group (this media is saved in a group conversation),\n    -- this value will be the string representation of the UUID of the chat group’s ID (a.k.a mischief ID).\n    ownerID TEXT NOT NULL,\n\n    -- Identifier of the saved chat message containing media.\n    messageID TEXT NOT NULL,\n\n    -- Identifier of chat media in the saved message.\n    -- Information stored in this column are derived from `serializedParcelContent` to avoid unnecessary\n    -- projections and deserialization.\n    mediaIDs TEXT NOT NULL,\n\n    -- Identifier of the conversation to which this saved media belongs.\n    -- This information is used to fetch media data.\n    conversationId TEXT NOT NULL,\n\n    -- The Username of the sender who has sent the chat message in which this saved media exists.\n    -- This information is used to fetch media data.\n    -- NOTICE: Usage of username is consciously and unavoidably introduced here since conversation\n    -- API requires it to fetch media.\n    senderUsername TEXT NOT NULL,\n\n    -- Message body type of the saved media message.\n    -- https://github.sc-corp.net/Snapchat/json-schema/blob/master/json/message_body_type.json\n    -- This field is used to deserializing [SerializableParcelContent].\n    messageBodyType TEXT NOT NULL,\n\n    -- [SerializableParcelContent] generated from the saved chat message represented in this row.\n    serializedParcelContent BLOB,\n\n    -- ownerID and messageID form a unique index together.\n    UNIQUE(ownerID, messageID)\n)", null, 4, null),
        UPLOADED_MEDIA_TABLE(UploadedMediaModel.TABLE_NAME, UploadedMediaModel.CREATE_TABLE, null, 4, null),
        STORY_ACTIVE_SNAPS(StoryModel.STORYVIEWACTIVESNAPS_VIEW_NAME, StoryModel.CREATESTORYVIEWACTIVESNAPS, TableType.VIEW),
        PLAYABLE_FRIEND_STORIES_MAPPING(StoryModel.STORYVIEWPLAYABLEFRIENDSTORIESMAPPING_VIEW_NAME, StoryModel.CREATESTORYVIEWPLAYABLEFRIENDSTORIESMAPPING, TableType.VIEW),
        FRIEND_STORIES_ACTIVE_SNAPS(StoryModel.STORYVIEWFRIENDSTORIESACTIVESNAPS_VIEW_NAME, StoryModel.CREATESTORYVIEWFRIENDSTORIESACTIVESNAPS, TableType.VIEW),
        FRIENDS_FEED(FriendsFeedModel.FRIENDSFEEDVIEW_VIEW_NAME, FriendsFeedModel.CREATEFRIENDSFEEDVIEW, TableType.VIEW),
        DISCOVER_FEED(DiscoverFeedModel.DISCOVERFEEDFRIENDSTORIESVIEW_VIEW_NAME, DiscoverFeedModel.CREATEDISCOVERFEEDFRIENDSTORIESVIEW, TableType.VIEW),
        BLACKLIST_FRIEND("BlacklistFriend", "CREATE TABLE IF NOT EXISTS BlacklistFriend(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    friendId TEXT NOT NULL UNIQUE\n)", null, 4, null),
        CUSTOM_FRIEND("CustomFriend", "CREATE TABLE IF NOT EXISTS CustomFriend(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    friendId TEXT NOT NULL UNIQUE\n)", null, 4, null),
        MAP_EXPLORE_READ_STATUS("MapExploreReadStatus", "CREATE TABLE IF NOT EXISTS MapExploreReadStatus(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    -- ownerId can be either the userId, or 'Map' for map statuses\n    ownerId TEXT NOT NULL UNIQUE,\n    lastReadTimestamp INTEGER NOT NULL\n)", null, 4, null),
        LEGAL_AGREEMENT(LegalAgreementModel.TABLE_NAME, LegalAgreementModel.CREATE_TABLE, null, 4, null);
        
        private final String creationStatement;
        private final String tableName;
        private final TableType tableType;

        protected Tables(String str, String str2, TableType tableType) {
            akcr.b(str, "tableName");
            akcr.b(str2, "creationStatement");
            akcr.b(tableType, "tableType");
            this.tableName = str;
            this.creationStatement = str2;
            this.tableType = tableType;
        }

        public final String getCreationStatement() {
            return this.creationStatement;
        }

        public final String getTableName() {
            return this.tableName;
        }

        public final TableType getTableType() {
            return this.tableType;
        }
    }

    public enum Triggers implements TriggerSpec {
        MESSAGE_MODIFIED_TIMESTAMP("message_modifiedTimestamp", MessageModel.TABLE_NAME, MessageModel.CREATEMODIFICATIONTRIGGER),
        MESSAGE_MODIFIED_TIMESTAMP_INSERT("message_modifiedTimestamp_insert", MessageModel.TABLE_NAME, MessageModel.CREATEMODIFICATIONINSERTTRIGGER);
        
        private final String tableName;
        private final String triggerName;
        private final String triggerStatement;

        protected Triggers(String str, String str2, String str3) {
            akcr.b(str, "triggerName");
            akcr.b(str2, "tableName");
            akcr.b(str3, "triggerStatement");
            this.triggerName = str;
            this.tableName = str2;
            this.triggerStatement = str3;
        }

        public final String getTableName() {
            return this.tableName;
        }

        public final String getTriggerName() {
            return this.triggerName;
        }

        public final String getTriggerStatement() {
            return this.triggerStatement;
        }
    }

    public final SnapDbCoreFeature getAttribution() {
        return SnapDbCoreFeature.INSTANCE;
    }

    public final String getDatabaseName() {
        return "main.db";
    }

    public final List<Indices> getIndices() {
        return ajyh.a((Object[]) Indices.values());
    }

    public final SnapDbSchemaVersionController getSchemaVersionController() {
        return new SnapDbSchemaVersionController(this);
    }

    public final List<Tables> getTables() {
        return ajyh.a((Object[]) Tables.values());
    }

    public final List<Triggers> getTriggers() {
        return ajyh.a((Object[]) Triggers.values());
    }

    public final int getVersion() {
        return SnapDbSchemaVersionControllerKt.SNAP_DB_CURRENT_VERSION;
    }
}

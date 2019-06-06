package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapModel.GetPendingStorySnapRowIdsModel;
import com.snap.core.db.record.StorySnapModel.SelectSnapDataForDeletionModel;
import com.snap.core.db.record.StorySnapRecord.BrandFriendliness;
import com.snap.core.db.record.StorySnapRecord.LatestTimestampsAndViewStatusRecord;
import com.snap.core.db.record.StorySnapRecord.RowIdAndViewedRecord;
import com.snap.core.db.record.StorySnapRecord.SelectFriendStorySnapForThumbnailRecord;
import com.snap.core.db.record.StorySnapRecord.SelectFriendStorySnapsForPlayingRecord;
import com.snap.core.db.record.StorySnapRecord.SelectLocallyPersistedPostedFieldsRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStoryManagementChromeDataRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByStoryRowIdRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByUsernameRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapViewReportingInfoRecord;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapsForPlayingRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementPlayableStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStoryMetadataRecord;
import com.snap.core.db.record.StorySnapRecord.StoryManagementStorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StorySnapDownload;
import com.snap.core.db.record.StorySnapRecord.StorySnapDump;
import com.snap.core.db.record.StorySnapRecord.ThumbnailDetails;
import defpackage.ainw;

public class LegacyStorySnapQueries {
    public static final ainw<BrandFriendliness> BRAND_FRIENDLINESS_ROW_MAPPER = StorySnapRecord.FACTORY.getBrandFriendlinessByStoryIdsMapper(-$$Lambda$2q_g7wPcCssm8Gxb7Ap_SzTt6BQ.INSTANCE);
    public static final ainw<StoryManagementStoryMetadataRecord> GET_STORY_MANAGEMENT_STORY_METADATA_MAPPER = StorySnapRecord.FACTORY.getStoryManagementStoriesMetadataMapper(-$$Lambda$s2HIVRr5Zmfgnj077FBbsGTeiuE.INSTANCE, StoryRecord.FACTORY, MobStoryMetadataRecord.getFACTORY());
    public static final ainw<StoryManagementStorySnapRecord> GET_STORY_MANAGEMENT_STORY_SNAP_MAPPER = StorySnapRecord.FACTORY.getStoryManagementStorySnapsMapper(-$$Lambda$n8yRTu2SXDs-9EDMYs6riqS7XEs.INSTANCE, SnapRecord.FACTORY, StoryRecord.FACTORY);
    public static final ainw<ThumbnailDetails> GET_THUMBNAIL_MAPPER = StorySnapRecord.FACTORY.getThumbnailForStorySnapMapper(-$$Lambda$N6sgv8L0OyE4XOvRufTz3PNiwHw.INSTANCE);
    public static final ainw<GetPendingStorySnapRowIdsModel> PENDING_STORY_SNAP_ROW_IDS_MAPPER = StorySnapRecord.FACTORY.getPendingStorySnapRowIdsMapper(-$$Lambda$PYGDoEpwyjTB6T7GudKcVVGgPnQ.INSTANCE);
    public static final ainw<SelectFriendStorySnapsForPlayingRecord> SELECT_FRIEND_PLAYABLE_STORY_SNAPS_MAPPER = StorySnapRecord.FACTORY.selectFriendStorySnapsForPlayingMapper(-$$Lambda$7K4F5L51v6oYZvP7X6960YDrsGs.INSTANCE, SnapRecord.FACTORY, StoryRecord.FACTORY, FriendRecord.FACTORY);
    public static final ainw<LatestTimestampsAndViewStatusRecord> SELECT_LATEST_SNAPS_STATUS_MAPPER = StorySnapRecord.FACTORY.getUpdatedTimestampsAndViewStatusForStoryRowIdMapper(-$$Lambda$XiNutoxMlJfPdfoIUZ2MbOpIO1o.INSTANCE);
    public static final ainw<SelectLocallyPersistedPostedFieldsRecord> SELECT_LOCALLY_PERSISTED_POSTED_FIELDS_MAPPER = StorySnapRecord.FACTORY.selectLocallyPersistedPostedFieldsMapper(-$$Lambda$gBR4uuPb3S8C235PixTO49G4nhU.INSTANCE);
    public static final ainw<StoryManagementPlayableStorySnapRecord> SELECT_PLAYABLE_STORY_MANAGEMENT_STORY_SNAP_MAPPER = StorySnapRecord.FACTORY.getStoryManagementStorySnapsForPlayingMapper(-$$Lambda$oFQnA2BeXtSStx4ndHg35yVlFIQ.INSTANCE, SnapRecord.FACTORY, StoryRecord.FACTORY, FriendRecord.FACTORY);
    public static final ainw<SelectStorySnapsForPlayingRecord> SELECT_PLAYABLE_STORY_SNAPS_MAPPER = StorySnapRecord.FACTORY.selectStorySnapsForPlayingMapper(-$$Lambda$iXs8tyv940y1cCQvXKaDJag5cp8.INSTANCE, SnapRecord.FACTORY, StoryRecord.FACTORY, FriendRecord.FACTORY);
    public static final ainw<SelectStorySnapsForPlayingRecord> SELECT_PLAYABLE_STORY_SNAP_MAPPER = StorySnapRecord.FACTORY.selectStorySnapForPlayingBySnapRowIdMapper(-$$Lambda$JIa_gwi0BgMiRX-z3FbESlfiHr0.INSTANCE, SnapRecord.FACTORY, StoryRecord.FACTORY, FriendRecord.FACTORY);
    public static final ainw<RowIdAndViewedRecord> SELECT_ROW_ID_AND_VIEWED_ROW_MAPPER = StorySnapRecord.FACTORY.getRowIdAndViewedByStoryRowIdClientIdMapper(-$$Lambda$Zbt3cX5ajA6PScGiBNytxvj7bCE.INSTANCE);
    public static final ainw<SelectSnapDataForDeletionModel> SELECT_SNAP_DATA_FOR_DELETION_MODEL_ROW_MAPPER = StorySnapRecord.FACTORY.selectSnapDataForDeletionMapper(-$$Lambda$bBkEvIXC7mFHo_Ly2WhgkAVoGPw.INSTANCE);
    public static final ainw<SelectStoryManagementChromeDataRecord> SELECT_STORY_MANAGEMENT_CHROME_DATA_RECORD_ROW_MAPPER = StorySnapRecord.FACTORY.selectStoryManagementChromeDataMapper(-$$Lambda$nfa2_8LFXT0gzmIzmAoVW9sa8bs.INSTANCE);
    public static final ainw<SelectStorySnapRecord> SELECT_STORY_SNAPS_MAPPER = StorySnapRecord.FACTORY.selectStorySnapsMapper(-$$Lambda$5J3-GRPDL4nGadPxTCCs17llVxY.INSTANCE, SnapRecord.FACTORY, StoryRecord.FACTORY);
    public static final ainw<SelectStorySnapViewReportingInfoRecord> SELECT_STORY_SNAP_VIEW_REPORTING_INFO_MAPPER = StorySnapRecord.FACTORY.selectStorySnapViewReportingInfoMapper(-$$Lambda$7wxrDwFmS4FILoALT4MIVcY8YNE.INSTANCE, StoryRecord.FACTORY, FriendRecord.FACTORY);
    public static final ainw<SelectFriendStorySnapForThumbnailRecord> SELECT_THUMBNAIL_FRIEND_STORY_SNAP_MAPPER = StorySnapRecord.FACTORY.selectFriendStorySnapForThumbnailMapper(-$$Lambda$0BtrFJ_qXbDkQ0hanli-MCN20tc.INSTANCE);
    public static final ainw<SelectStorySnapForThumbnailByStoryRowIdRecord> SELECT_THUMBNAIL_STORY_SNAP_BY_STORY_ROW_ID_MAPPER = StorySnapRecord.FACTORY.selectStorySnapForThumbnailByStoryRowIdMapper(-$$Lambda$zVT5Qqeniyha2VJVBnjI4qLXjWs.INSTANCE, StoryRecord.FACTORY);
    public static final ainw<SelectStorySnapForThumbnailByUsernameRecord> SELECT_THUMBNAIL_STORY_SNAP_BY_USERNAME_MODEL = StorySnapRecord.FACTORY.selectStorySnapForThumbnailByUsernameMapper(-$$Lambda$1wBD0Ik9X1Czh8z8b61ohwNYD2w.INSTANCE, StoryRecord.FACTORY);
    public static final ainw<StorySnapDownload> STORY_SNAP_DOWNLOAD_MAPPER = StorySnapRecord.FACTORY.getDownloadDataForStorySnapMapper(-$$Lambda$xa2yZJD7XGjpv60vHtiV1eacXaE.INSTANCE, SnapRecord.FACTORY);
    public static final ainw<StorySnapDump> STORY_SNAP_DUMP_ROW_MAPPER = StorySnapRecord.FACTORY.storySnapDumpMapper(-$$Lambda$tEzAL3B4xUY0bCBo8wAaUvkV6PI.INSTANCE);
}

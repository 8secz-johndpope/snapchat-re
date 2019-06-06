package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.StoriesMessageClientStatusColumnAdapter;
import com.snap.core.db.record.StorySnapModel.Factory;
import com.snap.core.db.record.StorySnapModel.GetBrandFriendlinessByStoryIdsModel;
import com.snap.core.db.record.StorySnapModel.GetDownloadDataForStorySnapModel;
import com.snap.core.db.record.StorySnapModel.GetPendingStorySnapRowIdsModel;
import com.snap.core.db.record.StorySnapModel.GetRowIdAndViewedByStoryRowIdClientIdModel;
import com.snap.core.db.record.StorySnapModel.GetStoryManagementStoriesMetadataModel;
import com.snap.core.db.record.StorySnapModel.GetStoryManagementStorySnapsForPlayingModel;
import com.snap.core.db.record.StorySnapModel.GetStoryManagementStorySnapsModel;
import com.snap.core.db.record.StorySnapModel.GetThumbnailForStorySnapModel;
import com.snap.core.db.record.StorySnapModel.GetUpdatedTimestampsAndViewStatusForStoryRowIdModel;
import com.snap.core.db.record.StorySnapModel.PlayableStorySnapRecordBaseModel;
import com.snap.core.db.record.StorySnapModel.SelectFriendStorySnapForThumbnailModel;
import com.snap.core.db.record.StorySnapModel.SelectFriendStorySnapsForPlayingModel;
import com.snap.core.db.record.StorySnapModel.SelectLocallyPersistedPostedFieldsModel;
import com.snap.core.db.record.StorySnapModel.SelectSnapDataForDeletionModel;
import com.snap.core.db.record.StorySnapModel.SelectStoryManagementChromeDataModel;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForPlayingBySnapRowIdModel;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForThumbnailByStoryRowIdModel;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForThumbnailByUsernameModel;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapViewReportingInfoModel;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapsForPlayingModel;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapsModel;
import com.snap.core.db.record.StorySnapModel.StorySnapDumpModel;
import com.snap.core.db.record.StorySnapModel.StorySnapRecordBaseModel;
import java.util.List;

@AutoValue
public abstract class StorySnapRecord implements StorySnapModel {
    public static final Factory<StorySnapRecord> FACTORY = new Factory(-$$Lambda$_yh4flWjFJXQj0uvESi_xTlIamE.INSTANCE, new StoriesMessageClientStatusColumnAdapter());

    @AutoValue
    public static abstract class SelectStorySnapForThumbnailByUsernameRecord implements SelectStorySnapForThumbnailByUsernameModel {
    }

    @AutoValue
    public static abstract class SelectStorySnapsForPlayingRecord extends PlayableStorySnapRecord implements SelectStorySnapForPlayingBySnapRowIdModel, SelectStorySnapsForPlayingModel {
    }

    public static abstract class PlayableStorySnapRecord implements PlayableStorySnapRecordBaseModel, StorySnapRecordBase {
    }

    public interface StorySnapRecordBase extends StorySnapRecordBaseModel {
    }

    @AutoValue
    public static abstract class SelectStorySnapForThumbnailByStoryRowIdRecord implements SelectStorySnapForThumbnailByStoryRowIdModel {
    }

    @AutoValue
    public static abstract class StorySnapDownload implements GetDownloadDataForStorySnapModel {
    }

    @AutoValue
    public static abstract class BrandFriendliness implements GetBrandFriendlinessByStoryIdsModel {
    }

    @AutoValue
    public static abstract class LatestTimestampsAndViewStatusRecord implements GetUpdatedTimestampsAndViewStatusForStoryRowIdModel {
    }

    @AutoValue
    public static abstract class PendingStorySnapRowIds implements GetPendingStorySnapRowIdsModel {
    }

    @AutoValue
    public static abstract class RowIdAndViewedRecord implements GetRowIdAndViewedByStoryRowIdClientIdModel {
    }

    @AutoValue
    public static abstract class SelectFriendStorySnapForThumbnailRecord implements SelectFriendStorySnapForThumbnailModel {
    }

    @AutoValue
    public static abstract class SelectLocallyPersistedPostedFieldsRecord implements SelectLocallyPersistedPostedFieldsModel {
    }

    @AutoValue
    public static abstract class SelectSnapDataForDeletionRecord implements SelectSnapDataForDeletionModel {
    }

    @AutoValue
    public static abstract class SelectStoryManagementChromeDataRecord implements SelectStoryManagementChromeDataModel {
    }

    @AutoValue
    public static abstract class SelectStorySnapViewReportingInfoRecord implements SelectStorySnapViewReportingInfoModel {
    }

    @AutoValue
    public static abstract class StoryManagementStoryMetadataRecord implements GetStoryManagementStoriesMetadataModel {
    }

    @AutoValue
    public static abstract class StorySnapDump implements StorySnapDumpModel {
    }

    @AutoValue
    public static abstract class ThumbnailDetails implements GetThumbnailForStorySnapModel {
    }

    @AutoValue
    public static abstract class SelectStorySnapRecord implements SelectStorySnapsModel, StorySnapRecordBase {
    }

    @AutoValue
    public static abstract class StoryManagementStorySnapRecord implements GetStoryManagementStorySnapsModel, StorySnapRecordBase {
    }

    @AutoValue
    public static abstract class SelectFriendStorySnapsForPlayingRecord extends PlayableStorySnapRecord implements SelectFriendStorySnapsForPlayingModel {
        private List<Long> associatedStorySnapRowIds;

        public List<Long> getAssociatedStorySnapRowIds() {
            return this.associatedStorySnapRowIds;
        }

        public void setAssociatedStorySnapRowIds(List<Long> list) {
            this.associatedStorySnapRowIds = list;
        }
    }

    @AutoValue
    public static abstract class StoryManagementPlayableStorySnapRecord extends PlayableStorySnapRecord implements GetStoryManagementStorySnapsForPlayingModel {
    }
}

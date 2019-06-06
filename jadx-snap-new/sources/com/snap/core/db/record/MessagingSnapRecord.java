package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.GeofilterMetadataColumnAdapter;
import com.snap.core.db.column.MediaUrlColumnAdapter;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ReplyMediaColumnAdapter;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.ScreenshottedOrReplayedStateAdapter;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.core.db.column.SnappableLensMetadataColumnAdapter;
import com.snap.core.db.record.MessagingSnapModel.Factory;
import com.snap.core.db.record.MessagingSnapModel.GetAllMessagingSnapsModel;
import com.snap.core.db.record.MessagingSnapModel.GetDirectSnapInfoBySnapRowIDModel;
import com.snap.core.db.record.MessagingSnapModel.GetDirectSnapsOlderThanTimestampModel;
import com.snap.core.db.record.MessagingSnapModel.GetDownloadInfoForDirectSnapsModel;
import com.snap.core.db.record.MessagingSnapModel.GetGroupSnapInfoModel;
import com.snap.core.db.record.MessagingSnapModel.GetGroupSnapsOlderThanTimestampModel;
import com.snap.core.db.record.MessagingSnapModel.GetLastReceivedSnapModel;
import com.snap.core.db.record.MessagingSnapModel.GetLastSentSnapModel;
import com.snap.core.db.record.MessagingSnapModel.GetPlayablePendingSnapsForFeedModel;
import com.snap.core.db.record.MessagingSnapModel.GetPlayableSnapsByMessageRowIdModel;
import com.snap.core.db.record.MessagingSnapModel.GetReplyMediaInfoForSnapRowIdModel;
import com.snap.core.db.record.MessagingSnapModel.GetSnapIdInfoForMessageIdModel;
import com.snap.core.db.record.MessagingSnapModel.GetSnapInfoBySnapRowIDModel;
import com.snap.core.db.record.MessagingSnapModel.GetSnapInfoForIdModel;
import com.snap.core.db.record.MessagingSnapModel.GetSnapMetadataForSnapIdModel;
import com.snap.core.db.record.MessagingSnapModel.GetSnapsForFeedModel;
import com.snap.core.db.record.MessagingSnapModel.SnapDumpModel;
import defpackage.aesg;
import defpackage.ainu;
import defpackage.ainv;

@AutoValue
public abstract class MessagingSnapRecord implements MessagingSnapModel {
    private static final ainu<aesg, String> DIRECT_DOWNLOAD_URL_METADATA_ADAPTER = new MediaUrlColumnAdapter();
    public static final Factory<MessagingSnapRecord> FACTORY = new Factory(-$$Lambda$ERUZhGW_ARVZpp8lhcH_XX2kOSU.INSTANCE, SERVER_SNAP_STATUS_ADAPTER, SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER, REPLY_MEDIA_ADAPTER, GEOFILTER_METADATA_ADAPTER, SNAPPABLE_LENS_METADATA_ADAPTER, DIRECT_DOWNLOAD_URL_METADATA_ADAPTER);
    private static final ainu<GeofilterMetadata, String> GEOFILTER_METADATA_ADAPTER = new GeofilterMetadataColumnAdapter();
    private static final ainu<ReplyMedia, String> REPLY_MEDIA_ADAPTER = new ReplyMediaColumnAdapter();
    private static final ainu<ScreenshottedOrReplayedState, String> SCREENSHOTTED_OR_REPLAYED_STATE_ADAPTER = new ScreenshottedOrReplayedStateAdapter();
    private static final ainu<SnapServerStatus, String> SERVER_SNAP_STATUS_ADAPTER = ainv.a(SnapServerStatus.class);
    private static final ainu<SnappableLensMetadata, String> SNAPPABLE_LENS_METADATA_ADAPTER = new SnappableLensMetadataColumnAdapter();

    @AutoValue
    public static abstract class DirectSnapInfo implements GetDownloadInfoForDirectSnapsModel {
    }

    @AutoValue
    public static abstract class DirectSnapsOlderThanTimestamp implements GetDirectSnapsOlderThanTimestampModel {
    }

    @AutoValue
    public static abstract class GetAllMessagingSnapsLimt100 implements GetAllMessagingSnapsModel {
    }

    @AutoValue
    public static abstract class GroupSnapsOlderThanTimestamp implements GetGroupSnapsOlderThanTimestampModel {
    }

    @AutoValue
    public static abstract class LastReceivedSnap implements GetLastReceivedSnapModel {
    }

    @AutoValue
    public static abstract class LastSentSnap implements GetLastSentSnapModel {
    }

    @AutoValue
    public static abstract class PlayableRecord implements GetPlayablePendingSnapsForFeedModel {
        public boolean isGroup() {
            return kind() == FeedKind.GROUP;
        }
    }

    @AutoValue
    public static abstract class PlayableSnap implements GetPlayableSnapsByMessageRowIdModel {
        public boolean isGroup() {
            return kind() == FeedKind.GROUP;
        }
    }

    @AutoValue
    public static abstract class ReplyMediaInfo implements GetReplyMediaInfoForSnapRowIdModel {
    }

    @AutoValue
    public static abstract class SnapDump implements SnapDumpModel {
    }

    @AutoValue
    public static abstract class SnapIdInfo implements GetSnapIdInfoForMessageIdModel {
    }

    @AutoValue
    public static abstract class SnapInfo implements GetSnapInfoForIdModel {
    }

    @AutoValue
    public static abstract class SnapInfoBySnapRowID implements GetSnapInfoBySnapRowIDModel {
    }

    @AutoValue
    public static abstract class SnapMetaData implements GetSnapMetadataForSnapIdModel {
        public boolean isGroup() {
            return kind() == FeedKind.GROUP;
        }
    }

    @AutoValue
    public static abstract class SnapOperaChromeInfo implements GetDirectSnapInfoBySnapRowIDModel {
    }

    @AutoValue
    public static abstract class SnapStateInfo implements GetGroupSnapInfoModel {
    }

    @AutoValue
    public static abstract class SnapsForFeed implements GetSnapsForFeedModel {
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.core.db.record.MessagingSnapModel.GetAllMessagingSnapsCreator;
import com.snap.core.db.record.MessagingSnapModel.GetAllMessagingSnapsModel;
import defpackage.aesg;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$WD3cI3S1OnOjNv9MNLhCyFQ761A implements GetAllMessagingSnapsCreator {
    public static final /* synthetic */ -$$Lambda$WD3cI3S1OnOjNv9MNLhCyFQ761A INSTANCE = new -$$Lambda$WD3cI3S1OnOjNv9MNLhCyFQ761A();

    private /* synthetic */ -$$Lambda$WD3cI3S1OnOjNv9MNLhCyFQ761A() {
    }

    public final GetAllMessagingSnapsModel create(long j, long j2, long j3, FeedKind feedKind, String str, String str2, gcp gcp, String str3, String str4, String str5, long j4, boolean z, long j5, String str6, Boolean bool, String str7, String str8, String str9, String str10, aesg aesg, GeofilterMetadata geofilterMetadata, SnapServerStatus snapServerStatus, MessageClientStatus messageClientStatus, Long l, ReplyMedia replyMedia, String str11, ScreenshottedOrReplayedState screenshottedOrReplayedState, boolean z2, SnappableLensMetadata snappableLensMetadata, Long l2) {
        return new AutoValue_MessagingSnapRecord_GetAllMessagingSnapsLimt100(j, j2, j3, feedKind, str, str2, gcp, str3, str4, str5, j4, z, j5, str6, bool, str7, str8, str9, str10, aesg, geofilterMetadata, snapServerStatus, messageClientStatus, l, replyMedia, str11, screenshottedOrReplayedState, z2, snappableLensMetadata, l2);
    }
}

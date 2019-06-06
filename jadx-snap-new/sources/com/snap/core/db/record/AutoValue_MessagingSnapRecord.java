package com.snap.core.db.record;

import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.SnappableLensMetadata;
import defpackage.aesg;

final class AutoValue_MessagingSnapRecord extends MessagingSnapRecord {
    private final long _id;
    private final Boolean broadcast;
    private final Boolean broadcastHideTimer;
    private final String broadcastSecondaryText;
    private final String broadcastUrl;
    private final aesg directDownloadUrl;
    private final String egData;
    private final String esId;
    private final Long feedRowId;
    private final GeofilterMetadata geofilterMetadata;
    private final Long lastInteractionTimestamp;
    private final long messageRowId;
    private final Integer orientation;
    private final Long pendingDeliveredTimestamp;
    private final ReplyMedia replyMedia;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long secondaryTimestamp;
    private final Long sendStartTimestamp;
    private final Long senderId;
    private final SnapServerStatus serverStatus;
    private final long snapRowId;
    private final SnappableLensMetadata snappableLensMetadata;
    private final String viewerList;

    AutoValue_MessagingSnapRecord(long j, long j2, long j3, Long l, SnapServerStatus snapServerStatus, Long l2, Long l3, Integer num, Long l4, Long l5, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str, Long l6, Boolean bool, String str2, String str3, Boolean bool2, String str4, String str5, ReplyMedia replyMedia, GeofilterMetadata geofilterMetadata, SnappableLensMetadata snappableLensMetadata, aesg aesg) {
        this._id = j;
        this.snapRowId = j2;
        this.messageRowId = j3;
        this.feedRowId = l;
        this.serverStatus = snapServerStatus;
        this.secondaryTimestamp = l2;
        this.pendingDeliveredTimestamp = l3;
        this.orientation = num;
        this.sendStartTimestamp = l4;
        this.lastInteractionTimestamp = l5;
        this.screenshottedOrReplayed = screenshottedOrReplayedState;
        this.viewerList = str;
        this.senderId = l6;
        this.broadcast = bool;
        this.broadcastUrl = str2;
        this.broadcastSecondaryText = str3;
        this.broadcastHideTimer = bool2;
        this.esId = str4;
        this.egData = str5;
        this.replyMedia = replyMedia;
        this.geofilterMetadata = geofilterMetadata;
        this.snappableLensMetadata = snappableLensMetadata;
        this.directDownloadUrl = aesg;
    }

    public final long _id() {
        return this._id;
    }

    public final Boolean broadcast() {
        return this.broadcast;
    }

    public final Boolean broadcastHideTimer() {
        return this.broadcastHideTimer;
    }

    public final String broadcastSecondaryText() {
        return this.broadcastSecondaryText;
    }

    public final String broadcastUrl() {
        return this.broadcastUrl;
    }

    public final aesg directDownloadUrl() {
        return this.directDownloadUrl;
    }

    public final String egData() {
        return this.egData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessagingSnapRecord) {
            MessagingSnapRecord messagingSnapRecord = (MessagingSnapRecord) obj;
            if (this._id == messagingSnapRecord._id() && this.snapRowId == messagingSnapRecord.snapRowId() && this.messageRowId == messagingSnapRecord.messageRowId()) {
                Long l = this.feedRowId;
                if (l != null ? !l.equals(messagingSnapRecord.feedRowId()) : messagingSnapRecord.feedRowId() != null) {
                    SnapServerStatus snapServerStatus = this.serverStatus;
                    if (snapServerStatus != null ? !snapServerStatus.equals(messagingSnapRecord.serverStatus()) : messagingSnapRecord.serverStatus() != null) {
                        l = this.secondaryTimestamp;
                        if (l != null ? !l.equals(messagingSnapRecord.secondaryTimestamp()) : messagingSnapRecord.secondaryTimestamp() != null) {
                            l = this.pendingDeliveredTimestamp;
                            if (l != null ? !l.equals(messagingSnapRecord.pendingDeliveredTimestamp()) : messagingSnapRecord.pendingDeliveredTimestamp() != null) {
                                Integer num = this.orientation;
                                if (num != null ? !num.equals(messagingSnapRecord.orientation()) : messagingSnapRecord.orientation() != null) {
                                    l = this.sendStartTimestamp;
                                    if (l != null ? !l.equals(messagingSnapRecord.sendStartTimestamp()) : messagingSnapRecord.sendStartTimestamp() != null) {
                                        l = this.lastInteractionTimestamp;
                                        if (l != null ? !l.equals(messagingSnapRecord.lastInteractionTimestamp()) : messagingSnapRecord.lastInteractionTimestamp() != null) {
                                            ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                            if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(messagingSnapRecord.screenshottedOrReplayed()) : messagingSnapRecord.screenshottedOrReplayed() != null) {
                                                String str = this.viewerList;
                                                if (str != null ? !str.equals(messagingSnapRecord.viewerList()) : messagingSnapRecord.viewerList() != null) {
                                                    l = this.senderId;
                                                    if (l != null ? !l.equals(messagingSnapRecord.senderId()) : messagingSnapRecord.senderId() != null) {
                                                        Boolean bool = this.broadcast;
                                                        if (bool != null ? !bool.equals(messagingSnapRecord.broadcast()) : messagingSnapRecord.broadcast() != null) {
                                                            str = this.broadcastUrl;
                                                            if (str != null ? !str.equals(messagingSnapRecord.broadcastUrl()) : messagingSnapRecord.broadcastUrl() != null) {
                                                                str = this.broadcastSecondaryText;
                                                                if (str != null ? !str.equals(messagingSnapRecord.broadcastSecondaryText()) : messagingSnapRecord.broadcastSecondaryText() != null) {
                                                                    bool = this.broadcastHideTimer;
                                                                    if (bool != null ? !bool.equals(messagingSnapRecord.broadcastHideTimer()) : messagingSnapRecord.broadcastHideTimer() != null) {
                                                                        str = this.esId;
                                                                        if (str != null ? !str.equals(messagingSnapRecord.esId()) : messagingSnapRecord.esId() != null) {
                                                                            str = this.egData;
                                                                            if (str != null ? !str.equals(messagingSnapRecord.egData()) : messagingSnapRecord.egData() != null) {
                                                                                ReplyMedia replyMedia = this.replyMedia;
                                                                                if (replyMedia != null ? !replyMedia.equals(messagingSnapRecord.replyMedia()) : messagingSnapRecord.replyMedia() != null) {
                                                                                    GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
                                                                                    if (geofilterMetadata != null ? !geofilterMetadata.equals(messagingSnapRecord.geofilterMetadata()) : messagingSnapRecord.geofilterMetadata() != null) {
                                                                                        SnappableLensMetadata snappableLensMetadata = this.snappableLensMetadata;
                                                                                        if (snappableLensMetadata != null ? !snappableLensMetadata.equals(messagingSnapRecord.snappableLensMetadata()) : messagingSnapRecord.snappableLensMetadata() != null) {
                                                                                            aesg aesg = this.directDownloadUrl;
                                                                                            return aesg != null ? !aesg.equals(messagingSnapRecord.directDownloadUrl()) : messagingSnapRecord.directDownloadUrl() != null;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final String esId() {
        return this.esId;
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final GeofilterMetadata geofilterMetadata() {
        return this.geofilterMetadata;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.snapRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.messageRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.feedRowId;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        i = (i ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        l = this.secondaryTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.pendingDeliveredTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Integer num = this.orientation;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        l = this.sendStartTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastInteractionTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        i = (i ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        String str = this.viewerList;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.senderId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.broadcast;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.broadcastUrl;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.broadcastSecondaryText;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.broadcastHideTimer;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.esId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.egData;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ReplyMedia replyMedia = this.replyMedia;
        i = (i ^ (replyMedia == null ? 0 : replyMedia.hashCode())) * 1000003;
        GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
        i = (i ^ (geofilterMetadata == null ? 0 : geofilterMetadata.hashCode())) * 1000003;
        SnappableLensMetadata snappableLensMetadata = this.snappableLensMetadata;
        i = (i ^ (snappableLensMetadata == null ? 0 : snappableLensMetadata.hashCode())) * 1000003;
        aesg aesg = this.directDownloadUrl;
        if (aesg != null) {
            i2 = aesg.hashCode();
        }
        return i ^ i2;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final long messageRowId() {
        return this.messageRowId;
    }

    public final Integer orientation() {
        return this.orientation;
    }

    public final Long pendingDeliveredTimestamp() {
        return this.pendingDeliveredTimestamp;
    }

    public final ReplyMedia replyMedia() {
        return this.replyMedia;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final Long secondaryTimestamp() {
        return this.secondaryTimestamp;
    }

    public final Long sendStartTimestamp() {
        return this.sendStartTimestamp;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final SnapServerStatus serverStatus() {
        return this.serverStatus;
    }

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final SnappableLensMetadata snappableLensMetadata() {
        return this.snappableLensMetadata;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessagingSnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", messageRowId=");
        stringBuilder.append(this.messageRowId);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", secondaryTimestamp=");
        stringBuilder.append(this.secondaryTimestamp);
        stringBuilder.append(", pendingDeliveredTimestamp=");
        stringBuilder.append(this.pendingDeliveredTimestamp);
        stringBuilder.append(", orientation=");
        stringBuilder.append(this.orientation);
        stringBuilder.append(", sendStartTimestamp=");
        stringBuilder.append(this.sendStartTimestamp);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", viewerList=");
        stringBuilder.append(this.viewerList);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", broadcast=");
        stringBuilder.append(this.broadcast);
        stringBuilder.append(", broadcastUrl=");
        stringBuilder.append(this.broadcastUrl);
        stringBuilder.append(", broadcastSecondaryText=");
        stringBuilder.append(this.broadcastSecondaryText);
        stringBuilder.append(", broadcastHideTimer=");
        stringBuilder.append(this.broadcastHideTimer);
        stringBuilder.append(", esId=");
        stringBuilder.append(this.esId);
        stringBuilder.append(", egData=");
        stringBuilder.append(this.egData);
        stringBuilder.append(", replyMedia=");
        stringBuilder.append(this.replyMedia);
        stringBuilder.append(", geofilterMetadata=");
        stringBuilder.append(this.geofilterMetadata);
        stringBuilder.append(", snappableLensMetadata=");
        stringBuilder.append(this.snappableLensMetadata);
        stringBuilder.append(", directDownloadUrl=");
        stringBuilder.append(this.directDownloadUrl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String viewerList() {
        return this.viewerList;
    }
}

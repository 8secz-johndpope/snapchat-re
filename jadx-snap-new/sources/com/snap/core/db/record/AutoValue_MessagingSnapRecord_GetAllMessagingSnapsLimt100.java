package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.core.db.record.MessagingSnapRecord.GetAllMessagingSnapsLimt100;
import defpackage.aesg;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_GetAllMessagingSnapsLimt100 extends GetAllMessagingSnapsLimt100 {
    private final String Message_mediaId;
    private final long _id;
    private final String attachmentUrl;
    private final MessageClientStatus clientStatus;
    private final String cognacAttachmentUri;
    private final aesg directDownloadUrl;
    private final long durationInMs;
    private final GeofilterMetadata geofilterMetadata;
    private final boolean isInfiniteDuration;
    private final String key;
    private final FeedKind kind;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final long messageRowId;
    private final boolean released;
    private final ReplyMedia replyMedia;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long senderId;
    private final String senderUsername;
    private final Long sequenceNumber;
    private final SnapServerStatus serverStatus;
    private final String snapId;
    private final long snapRowId;
    private final gcp snapType;
    private final SnappableLensMetadata snappableLensMetadata;
    private final long timestamp;
    private final String viewerList;
    private final Boolean zipped;

    AutoValue_MessagingSnapRecord_GetAllMessagingSnapsLimt100(long j, long j2, long j3, FeedKind feedKind, String str, String str2, gcp gcp, String str3, String str4, String str5, long j4, boolean z, long j5, String str6, Boolean bool, String str7, String str8, String str9, String str10, aesg aesg, GeofilterMetadata geofilterMetadata, SnapServerStatus snapServerStatus, MessageClientStatus messageClientStatus, Long l, ReplyMedia replyMedia, String str11, ScreenshottedOrReplayedState screenshottedOrReplayedState, boolean z2, SnappableLensMetadata snappableLensMetadata, Long l2) {
        FeedKind feedKind2 = feedKind;
        String str12 = str;
        String str13 = str2;
        gcp gcp2 = gcp;
        String str14 = str10;
        this._id = j;
        this.messageRowId = j2;
        this.snapRowId = j3;
        if (feedKind2 != null) {
            this.kind = feedKind2;
            if (str12 != null) {
                this.key = str12;
                if (str13 != null) {
                    this.snapId = str13;
                    if (gcp2 != null) {
                        this.snapType = gcp2;
                        this.mediaUrl = str3;
                        this.mediaKey = str4;
                        this.mediaIv = str5;
                        this.durationInMs = j4;
                        this.isInfiniteDuration = z;
                        this.timestamp = j5;
                        this.mediaId = str6;
                        this.zipped = bool;
                        this.attachmentUrl = str7;
                        this.cognacAttachmentUri = str8;
                        this.Message_mediaId = str9;
                        if (str14 != null) {
                            this.senderUsername = str14;
                            this.directDownloadUrl = aesg;
                            this.geofilterMetadata = geofilterMetadata;
                            this.serverStatus = snapServerStatus;
                            this.clientStatus = messageClientStatus;
                            this.senderId = l;
                            this.replyMedia = replyMedia;
                            this.viewerList = str11;
                            this.screenshottedOrReplayed = screenshottedOrReplayedState;
                            this.released = z2;
                            this.snappableLensMetadata = snappableLensMetadata;
                            this.sequenceNumber = l2;
                            return;
                        }
                        throw new NullPointerException("Null senderUsername");
                    }
                    throw new NullPointerException("Null snapType");
                }
                throw new NullPointerException("Null snapId");
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null kind");
    }

    public final String Message_mediaId() {
        return this.Message_mediaId;
    }

    public final long _id() {
        return this._id;
    }

    public final String attachmentUrl() {
        return this.attachmentUrl;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final String cognacAttachmentUri() {
        return this.cognacAttachmentUri;
    }

    public final aesg directDownloadUrl() {
        return this.directDownloadUrl;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetAllMessagingSnapsLimt100) {
            GetAllMessagingSnapsLimt100 getAllMessagingSnapsLimt100 = (GetAllMessagingSnapsLimt100) obj;
            if (this._id == getAllMessagingSnapsLimt100._id() && this.messageRowId == getAllMessagingSnapsLimt100.messageRowId() && this.snapRowId == getAllMessagingSnapsLimt100.snapRowId() && this.kind.equals(getAllMessagingSnapsLimt100.kind()) && this.key.equals(getAllMessagingSnapsLimt100.key()) && this.snapId.equals(getAllMessagingSnapsLimt100.snapId()) && this.snapType.equals(getAllMessagingSnapsLimt100.snapType())) {
                String str = this.mediaUrl;
                if (str != null ? !str.equals(getAllMessagingSnapsLimt100.mediaUrl()) : getAllMessagingSnapsLimt100.mediaUrl() != null) {
                    str = this.mediaKey;
                    if (str != null ? !str.equals(getAllMessagingSnapsLimt100.mediaKey()) : getAllMessagingSnapsLimt100.mediaKey() != null) {
                        str = this.mediaIv;
                        if (str != null ? !str.equals(getAllMessagingSnapsLimt100.mediaIv()) : getAllMessagingSnapsLimt100.mediaIv() != null) {
                            if (this.durationInMs == getAllMessagingSnapsLimt100.durationInMs() && this.isInfiniteDuration == getAllMessagingSnapsLimt100.isInfiniteDuration() && this.timestamp == getAllMessagingSnapsLimt100.timestamp()) {
                                str = this.mediaId;
                                if (str != null ? !str.equals(getAllMessagingSnapsLimt100.mediaId()) : getAllMessagingSnapsLimt100.mediaId() != null) {
                                    Boolean bool = this.zipped;
                                    if (bool != null ? !bool.equals(getAllMessagingSnapsLimt100.zipped()) : getAllMessagingSnapsLimt100.zipped() != null) {
                                        str = this.attachmentUrl;
                                        if (str != null ? !str.equals(getAllMessagingSnapsLimt100.attachmentUrl()) : getAllMessagingSnapsLimt100.attachmentUrl() != null) {
                                            str = this.cognacAttachmentUri;
                                            if (str != null ? !str.equals(getAllMessagingSnapsLimt100.cognacAttachmentUri()) : getAllMessagingSnapsLimt100.cognacAttachmentUri() != null) {
                                                str = this.Message_mediaId;
                                                if (str != null ? !str.equals(getAllMessagingSnapsLimt100.Message_mediaId()) : getAllMessagingSnapsLimt100.Message_mediaId() != null) {
                                                    if (this.senderUsername.equals(getAllMessagingSnapsLimt100.senderUsername())) {
                                                        aesg aesg = this.directDownloadUrl;
                                                        if (aesg != null ? !aesg.equals(getAllMessagingSnapsLimt100.directDownloadUrl()) : getAllMessagingSnapsLimt100.directDownloadUrl() != null) {
                                                            GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
                                                            if (geofilterMetadata != null ? !geofilterMetadata.equals(getAllMessagingSnapsLimt100.geofilterMetadata()) : getAllMessagingSnapsLimt100.geofilterMetadata() != null) {
                                                                SnapServerStatus snapServerStatus = this.serverStatus;
                                                                if (snapServerStatus != null ? !snapServerStatus.equals(getAllMessagingSnapsLimt100.serverStatus()) : getAllMessagingSnapsLimt100.serverStatus() != null) {
                                                                    MessageClientStatus messageClientStatus = this.clientStatus;
                                                                    if (messageClientStatus != null ? !messageClientStatus.equals(getAllMessagingSnapsLimt100.clientStatus()) : getAllMessagingSnapsLimt100.clientStatus() != null) {
                                                                        Long l = this.senderId;
                                                                        if (l != null ? !l.equals(getAllMessagingSnapsLimt100.senderId()) : getAllMessagingSnapsLimt100.senderId() != null) {
                                                                            ReplyMedia replyMedia = this.replyMedia;
                                                                            if (replyMedia != null ? !replyMedia.equals(getAllMessagingSnapsLimt100.replyMedia()) : getAllMessagingSnapsLimt100.replyMedia() != null) {
                                                                                str = this.viewerList;
                                                                                if (str != null ? !str.equals(getAllMessagingSnapsLimt100.viewerList()) : getAllMessagingSnapsLimt100.viewerList() != null) {
                                                                                    ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                                                                    if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(getAllMessagingSnapsLimt100.screenshottedOrReplayed()) : getAllMessagingSnapsLimt100.screenshottedOrReplayed() != null) {
                                                                                        if (this.released == getAllMessagingSnapsLimt100.released()) {
                                                                                            SnappableLensMetadata snappableLensMetadata = this.snappableLensMetadata;
                                                                                            if (snappableLensMetadata != null ? !snappableLensMetadata.equals(getAllMessagingSnapsLimt100.snappableLensMetadata()) : getAllMessagingSnapsLimt100.snappableLensMetadata() != null) {
                                                                                                l = this.sequenceNumber;
                                                                                                return l != null ? !l.equals(getAllMessagingSnapsLimt100.sequenceNumber()) : getAllMessagingSnapsLimt100.sequenceNumber() != null;
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
    }

    public final GeofilterMetadata geofilterMetadata() {
        return this.geofilterMetadata;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.messageRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.snapRowId;
        i = (((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.kind.hashCode()) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.snapId.hashCode()) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        String str = this.mediaUrl;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaKey;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.durationInMs;
        i = (i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i3 = 1231;
        i = (i ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        long j4 = this.timestamp;
        i = (i ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        String str2 = this.mediaId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.zipped;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str2 = this.attachmentUrl;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.cognacAttachmentUri;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.Message_mediaId;
        i = (((i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.senderUsername.hashCode()) * 1000003;
        aesg aesg = this.directDownloadUrl;
        i = (i ^ (aesg == null ? 0 : aesg.hashCode())) * 1000003;
        GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
        i = (i ^ (geofilterMetadata == null ? 0 : geofilterMetadata.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        i = (i ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        Long l = this.senderId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        ReplyMedia replyMedia = this.replyMedia;
        i = (i ^ (replyMedia == null ? 0 : replyMedia.hashCode())) * 1000003;
        str2 = this.viewerList;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        i = (i ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        if (!this.released) {
            i3 = 1237;
        }
        i = (i ^ i3) * 1000003;
        SnappableLensMetadata snappableLensMetadata = this.snappableLensMetadata;
        i = (i ^ (snappableLensMetadata == null ? 0 : snappableLensMetadata.hashCode())) * 1000003;
        Long l2 = this.sequenceNumber;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final boolean isInfiniteDuration() {
        return this.isInfiniteDuration;
    }

    public final String key() {
        return this.key;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final String mediaIv() {
        return this.mediaIv;
    }

    public final String mediaKey() {
        return this.mediaKey;
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final long messageRowId() {
        return this.messageRowId;
    }

    public final boolean released() {
        return this.released;
    }

    public final ReplyMedia replyMedia() {
        return this.replyMedia;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final SnapServerStatus serverStatus() {
        return this.serverStatus;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final SnappableLensMetadata snappableLensMetadata() {
        return this.snappableLensMetadata;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetAllMessagingSnapsLimt100{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", messageRowId=");
        stringBuilder.append(this.messageRowId);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", zipped=");
        stringBuilder.append(this.zipped);
        stringBuilder.append(", attachmentUrl=");
        stringBuilder.append(this.attachmentUrl);
        stringBuilder.append(", cognacAttachmentUri=");
        stringBuilder.append(this.cognacAttachmentUri);
        stringBuilder.append(", Message_mediaId=");
        stringBuilder.append(this.Message_mediaId);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", directDownloadUrl=");
        stringBuilder.append(this.directDownloadUrl);
        stringBuilder.append(", geofilterMetadata=");
        stringBuilder.append(this.geofilterMetadata);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", replyMedia=");
        stringBuilder.append(this.replyMedia);
        stringBuilder.append(", viewerList=");
        stringBuilder.append(this.viewerList);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append(", snappableLensMetadata=");
        stringBuilder.append(this.snappableLensMetadata);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String viewerList() {
        return this.viewerList;
    }

    public final Boolean zipped() {
        return this.zipped;
    }
}

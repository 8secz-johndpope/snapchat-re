package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.LastMessage;
import defpackage.gcp;

final class AutoValue_MessageRecord_LastMessage extends LastMessage {
    private final long _id;
    private final MessageClientStatus clientStatus;
    private final Long senderUserId;
    private final String senderUsername;
    private final Long sequenceNumber;
    private final ScreenshottedOrReplayedState snapScreenshottedOrReplayed;
    private final SnapServerStatus snapServerStatus;
    private final gcp snapType;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastMessage(long j, String str, long j2, MessageClientStatus messageClientStatus, Long l, gcp gcp, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2, Long l2) {
        this._id = j;
        this.type = str;
        this.timestamp = j2;
        this.clientStatus = messageClientStatus;
        this.sequenceNumber = l;
        this.snapType = gcp;
        this.snapServerStatus = snapServerStatus;
        this.snapScreenshottedOrReplayed = screenshottedOrReplayedState;
        this.senderUsername = str2;
        this.senderUserId = l2;
    }

    public final long _id() {
        return this._id;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastMessage) {
            LastMessage lastMessage = (LastMessage) obj;
            if (this._id == lastMessage._id()) {
                String str = this.type;
                if (str != null ? !str.equals(lastMessage.type()) : lastMessage.type() != null) {
                    if (this.timestamp == lastMessage.timestamp()) {
                        MessageClientStatus messageClientStatus = this.clientStatus;
                        if (messageClientStatus != null ? !messageClientStatus.equals(lastMessage.clientStatus()) : lastMessage.clientStatus() != null) {
                            Long l = this.sequenceNumber;
                            if (l != null ? !l.equals(lastMessage.sequenceNumber()) : lastMessage.sequenceNumber() != null) {
                                gcp gcp = this.snapType;
                                if (gcp != null ? !gcp.equals(lastMessage.snapType()) : lastMessage.snapType() != null) {
                                    SnapServerStatus snapServerStatus = this.snapServerStatus;
                                    if (snapServerStatus != null ? !snapServerStatus.equals(lastMessage.snapServerStatus()) : lastMessage.snapServerStatus() != null) {
                                        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.snapScreenshottedOrReplayed;
                                        if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(lastMessage.snapScreenshottedOrReplayed()) : lastMessage.snapScreenshottedOrReplayed() != null) {
                                            str = this.senderUsername;
                                            if (str != null ? !str.equals(lastMessage.senderUsername()) : lastMessage.senderUsername() != null) {
                                                l = this.senderUserId;
                                                return l != null ? !l.equals(lastMessage.senderUserId()) : lastMessage.senderUserId() != null;
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

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.type;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.timestamp;
        i = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        Long l = this.sequenceNumber;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        gcp gcp = this.snapType;
        i = (i ^ (gcp == null ? 0 : gcp.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        i = (i ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.snapScreenshottedOrReplayed;
        i = (i ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        String str2 = this.senderUsername;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l2 = this.senderUserId;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final Long senderUserId() {
        return this.senderUserId;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final ScreenshottedOrReplayedState snapScreenshottedOrReplayed() {
        return this.snapScreenshottedOrReplayed;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LastMessage{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", snapScreenshottedOrReplayed=");
        stringBuilder.append(this.snapScreenshottedOrReplayed);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", senderUserId=");
        stringBuilder.append(this.senderUserId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

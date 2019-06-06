package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapRecord.LastReceivedSnap;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_LastReceivedSnap extends LastReceivedSnap {
    private final Long feedRowId;
    private final long interactionTimestamp;
    private final long messageTimestamp;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long senderId;
    private final SnapServerStatus serverStatus;
    private final String snapId;
    private final gcp snapType;

    AutoValue_MessagingSnapRecord_LastReceivedSnap(Long l, Long l2, String str, gcp gcp, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        this.feedRowId = l;
        this.senderId = l2;
        if (str != null) {
            this.snapId = str;
            if (gcp != null) {
                this.snapType = gcp;
                this.messageTimestamp = j;
                this.interactionTimestamp = j2;
                this.serverStatus = snapServerStatus;
                this.screenshottedOrReplayed = screenshottedOrReplayedState;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastReceivedSnap) {
            LastReceivedSnap lastReceivedSnap = (LastReceivedSnap) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastReceivedSnap.feedRowId()) : lastReceivedSnap.feedRowId() != null) {
                l = this.senderId;
                if (l != null ? !l.equals(lastReceivedSnap.senderId()) : lastReceivedSnap.senderId() != null) {
                    if (this.snapId.equals(lastReceivedSnap.snapId()) && this.snapType.equals(lastReceivedSnap.snapType()) && this.messageTimestamp == lastReceivedSnap.messageTimestamp() && this.interactionTimestamp == lastReceivedSnap.interactionTimestamp()) {
                        SnapServerStatus snapServerStatus = this.serverStatus;
                        if (snapServerStatus != null ? !snapServerStatus.equals(lastReceivedSnap.serverStatus()) : lastReceivedSnap.serverStatus() != null) {
                            ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                            return screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(lastReceivedSnap.screenshottedOrReplayed()) : lastReceivedSnap.screenshottedOrReplayed() != null;
                        }
                    }
                }
            }
        }
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        Long l = this.feedRowId;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.senderId;
        hashCode = (((((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ this.snapId.hashCode()) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        long j = this.messageTimestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        j = this.interactionTimestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        if (screenshottedOrReplayedState != null) {
            i = screenshottedOrReplayedState.hashCode();
        }
        return hashCode ^ i;
    }

    public final long interactionTimestamp() {
        return this.interactionTimestamp;
    }

    public final long messageTimestamp() {
        return this.messageTimestamp;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final SnapServerStatus serverStatus() {
        return this.serverStatus;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LastReceivedSnap{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", messageTimestamp=");
        stringBuilder.append(this.messageTimestamp);
        stringBuilder.append(", interactionTimestamp=");
        stringBuilder.append(this.interactionTimestamp);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapRecord.LastSentSnap;
import defpackage.gcp;
import java.util.Arrays;

final class AutoValue_MessagingSnapRecord_LastSentSnap extends LastSentSnap {
    private final byte[] authToken;
    private final Long feedRowId;
    private final FriendLinkType friendLinkType;
    private final long interactionTimestamp;
    private final long messageTimestamp;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long senderId;
    private final SnapServerStatus serverStatus;
    private final String snapId;
    private final gcp snapType;

    AutoValue_MessagingSnapRecord_LastSentSnap(Long l, Long l2, String str, gcp gcp, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, FriendLinkType friendLinkType) {
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
                this.authToken = bArr;
                this.friendLinkType = friendLinkType;
                return;
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final byte[] authToken() {
        return this.authToken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastSentSnap) {
            LastSentSnap lastSentSnap = (LastSentSnap) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastSentSnap.feedRowId()) : lastSentSnap.feedRowId() != null) {
                l = this.senderId;
                if (l != null ? !l.equals(lastSentSnap.senderId()) : lastSentSnap.senderId() != null) {
                    if (this.snapId.equals(lastSentSnap.snapId()) && this.snapType.equals(lastSentSnap.snapType()) && this.messageTimestamp == lastSentSnap.messageTimestamp() && this.interactionTimestamp == lastSentSnap.interactionTimestamp()) {
                        SnapServerStatus snapServerStatus = this.serverStatus;
                        if (snapServerStatus != null ? !snapServerStatus.equals(lastSentSnap.serverStatus()) : lastSentSnap.serverStatus() != null) {
                            ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                            if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(lastSentSnap.screenshottedOrReplayed()) : lastSentSnap.screenshottedOrReplayed() != null) {
                                if (Arrays.equals(this.authToken, lastSentSnap instanceof AutoValue_MessagingSnapRecord_LastSentSnap ? ((AutoValue_MessagingSnapRecord_LastSentSnap) lastSentSnap).authToken : lastSentSnap.authToken())) {
                                    FriendLinkType friendLinkType = this.friendLinkType;
                                    return friendLinkType != null ? !friendLinkType.equals(lastSentSnap.friendLinkType()) : lastSentSnap.friendLinkType() != null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
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
        hashCode = (((hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003) ^ Arrays.hashCode(this.authToken)) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i = friendLinkType.hashCode();
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
        StringBuilder stringBuilder = new StringBuilder("LastSentSnap{feedRowId=");
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
        stringBuilder.append(", authToken=");
        stringBuilder.append(Arrays.toString(this.authToken));
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

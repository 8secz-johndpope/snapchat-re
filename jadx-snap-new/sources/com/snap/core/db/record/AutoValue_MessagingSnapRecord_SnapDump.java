package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapRecord.SnapDump;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_SnapDump extends SnapDump {
    private final String conversationKey;
    private final Long lastInteractionTimestamp;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final String senderUsername;
    private final SnapServerStatus serverStatus;
    private final String snapId;
    private final gcp snapType;
    private final Long timestamp;

    AutoValue_MessagingSnapRecord_SnapDump(String str, String str2, Long l, String str3, gcp gcp, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l2) {
        this.conversationKey = str;
        this.snapId = str2;
        this.timestamp = l;
        this.senderUsername = str3;
        this.snapType = gcp;
        this.serverStatus = snapServerStatus;
        this.screenshottedOrReplayed = screenshottedOrReplayedState;
        this.lastInteractionTimestamp = l2;
    }

    public final String conversationKey() {
        return this.conversationKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapDump) {
            SnapDump snapDump = (SnapDump) obj;
            String str = this.conversationKey;
            if (str != null ? !str.equals(snapDump.conversationKey()) : snapDump.conversationKey() != null) {
                str = this.snapId;
                if (str != null ? !str.equals(snapDump.snapId()) : snapDump.snapId() != null) {
                    Long l = this.timestamp;
                    if (l != null ? !l.equals(snapDump.timestamp()) : snapDump.timestamp() != null) {
                        str = this.senderUsername;
                        if (str != null ? !str.equals(snapDump.senderUsername()) : snapDump.senderUsername() != null) {
                            gcp gcp = this.snapType;
                            if (gcp != null ? !gcp.equals(snapDump.snapType()) : snapDump.snapType() != null) {
                                SnapServerStatus snapServerStatus = this.serverStatus;
                                if (snapServerStatus != null ? !snapServerStatus.equals(snapDump.serverStatus()) : snapDump.serverStatus() != null) {
                                    ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                    if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(snapDump.screenshottedOrReplayed()) : snapDump.screenshottedOrReplayed() != null) {
                                        l = this.lastInteractionTimestamp;
                                        return l != null ? !l.equals(snapDump.lastInteractionTimestamp()) : snapDump.lastInteractionTimestamp() != null;
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
        String str = this.conversationKey;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.snapId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.timestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str2 = this.senderUsername;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        gcp gcp = this.snapType;
        hashCode = (hashCode ^ (gcp == null ? 0 : gcp.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        Long l2 = this.lastInteractionTimestamp;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final String senderUsername() {
        return this.senderUsername;
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

    public final Long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapDump{conversationKey=");
        stringBuilder.append(this.conversationKey);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

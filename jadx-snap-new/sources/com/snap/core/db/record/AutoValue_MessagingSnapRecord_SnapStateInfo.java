package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessagingSnapRecord.SnapStateInfo;

final class AutoValue_MessagingSnapRecord_SnapStateInfo extends SnapStateInfo {
    private final Long lastInteractionTimestamp;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final SnapServerStatus serverStatus;
    private final String username;

    AutoValue_MessagingSnapRecord_SnapStateInfo(String str, SnapServerStatus snapServerStatus, Long l, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        this.username = str;
        this.serverStatus = snapServerStatus;
        this.lastInteractionTimestamp = l;
        this.screenshottedOrReplayed = screenshottedOrReplayedState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapStateInfo) {
            SnapStateInfo snapStateInfo = (SnapStateInfo) obj;
            String str = this.username;
            if (str != null ? !str.equals(snapStateInfo.username()) : snapStateInfo.username() != null) {
                SnapServerStatus snapServerStatus = this.serverStatus;
                if (snapServerStatus != null ? !snapServerStatus.equals(snapStateInfo.serverStatus()) : snapStateInfo.serverStatus() != null) {
                    Long l = this.lastInteractionTimestamp;
                    if (l != null ? !l.equals(snapStateInfo.lastInteractionTimestamp()) : snapStateInfo.lastInteractionTimestamp() != null) {
                        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                        return screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(snapStateInfo.screenshottedOrReplayed()) : snapStateInfo.screenshottedOrReplayed() != null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.username;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        SnapServerStatus snapServerStatus = this.serverStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        Long l = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        if (screenshottedOrReplayedState != null) {
            i = screenshottedOrReplayedState.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final SnapServerStatus serverStatus() {
        return this.serverStatus;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapStateInfo{username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", serverStatus=");
        stringBuilder.append(this.serverStatus);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.GetSnapStatesByMessageIds;

final class AutoValue_MessageRecord_GetSnapStatesByMessageIds extends GetSnapStatesByMessageIds {
    private final String key;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final SnapServerStatus snapServerStatus;

    AutoValue_MessageRecord_GetSnapStatesByMessageIds(String str, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        if (str != null) {
            this.key = str;
            this.snapServerStatus = snapServerStatus;
            this.screenshottedOrReplayed = screenshottedOrReplayedState;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetSnapStatesByMessageIds) {
            GetSnapStatesByMessageIds getSnapStatesByMessageIds = (GetSnapStatesByMessageIds) obj;
            if (this.key.equals(getSnapStatesByMessageIds.key())) {
                SnapServerStatus snapServerStatus = this.snapServerStatus;
                if (snapServerStatus != null ? !snapServerStatus.equals(getSnapStatesByMessageIds.snapServerStatus()) : getSnapStatesByMessageIds.snapServerStatus() != null) {
                    ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                    return screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(getSnapStatesByMessageIds.screenshottedOrReplayed()) : getSnapStatesByMessageIds.screenshottedOrReplayed() != null;
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        int i = 0;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        if (screenshottedOrReplayedState != null) {
            i = screenshottedOrReplayedState.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetSnapStatesByMessageIds{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

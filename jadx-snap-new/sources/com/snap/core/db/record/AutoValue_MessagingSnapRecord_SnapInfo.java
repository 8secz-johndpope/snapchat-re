package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.MessagingSnapRecord.SnapInfo;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_SnapInfo extends SnapInfo {
    private final String esId;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final String snapId;
    private final gcp snapType;

    AutoValue_MessagingSnapRecord_SnapInfo(String str, gcp gcp, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2) {
        if (str != null) {
            this.snapId = str;
            if (gcp != null) {
                this.snapType = gcp;
                this.screenshottedOrReplayed = screenshottedOrReplayedState;
                this.esId = str2;
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
        if (obj instanceof SnapInfo) {
            SnapInfo snapInfo = (SnapInfo) obj;
            if (this.snapId.equals(snapInfo.snapId()) && this.snapType.equals(snapInfo.snapType())) {
                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(snapInfo.screenshottedOrReplayed()) : snapInfo.screenshottedOrReplayed() != null) {
                    String str = this.esId;
                    return str != null ? !str.equals(snapInfo.esId()) : snapInfo.esId() != null;
                }
            }
        }
    }

    public final String esId() {
        return this.esId;
    }

    public final int hashCode() {
        int hashCode = (((this.snapId.hashCode() ^ 1000003) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        int i = 0;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        String str = this.esId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode ^ i;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapInfo{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", esId=");
        stringBuilder.append(this.esId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

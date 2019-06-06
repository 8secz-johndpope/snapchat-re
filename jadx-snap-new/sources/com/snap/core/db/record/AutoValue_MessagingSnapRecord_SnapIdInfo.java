package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.MessagingSnapRecord.SnapIdInfo;

final class AutoValue_MessagingSnapRecord_SnapIdInfo extends SnapIdInfo {
    private final String key;
    private final String mediaId;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long sequenceNumber;
    private final String snapId;

    AutoValue_MessagingSnapRecord_SnapIdInfo(String str, ScreenshottedOrReplayedState screenshottedOrReplayedState, String str2, String str3, Long l) {
        if (str != null) {
            this.snapId = str;
            this.screenshottedOrReplayed = screenshottedOrReplayedState;
            if (str2 != null) {
                this.key = str2;
                this.mediaId = str3;
                this.sequenceNumber = l;
                return;
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapIdInfo) {
            SnapIdInfo snapIdInfo = (SnapIdInfo) obj;
            if (this.snapId.equals(snapIdInfo.snapId())) {
                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(snapIdInfo.screenshottedOrReplayed()) : snapIdInfo.screenshottedOrReplayed() != null) {
                    if (this.key.equals(snapIdInfo.key())) {
                        String str = this.mediaId;
                        if (str != null ? !str.equals(snapIdInfo.mediaId()) : snapIdInfo.mediaId() != null) {
                            Long l = this.sequenceNumber;
                            return l != null ? !l.equals(snapIdInfo.sequenceNumber()) : snapIdInfo.sequenceNumber() != null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        int i = 0;
        hashCode = (((hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.mediaId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.sequenceNumber;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapIdInfo{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

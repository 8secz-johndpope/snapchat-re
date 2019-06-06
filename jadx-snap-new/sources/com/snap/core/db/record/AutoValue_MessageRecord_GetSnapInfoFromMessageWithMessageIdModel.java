package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.GetSnapInfoFromMessageWithMessageIdModel;
import defpackage.yfj;

final class AutoValue_MessageRecord_GetSnapInfoFromMessageWithMessageIdModel extends GetSnapInfoFromMessageWithMessageIdModel {
    private final long _id;
    private final String key;
    private final Long lastInteractionTimestamp;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final String senderUsername;
    private final SnapServerStatus snapServerStatus;
    private final long timestamp;
    private final String type;
    private final yfj viewerList;

    AutoValue_MessageRecord_GetSnapInfoFromMessageWithMessageIdModel(long j, String str, String str2, String str3, long j2, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, yfj yfj, Long l) {
        this._id = j;
        if (str != null) {
            this.key = str;
            if (str2 != null) {
                this.senderUsername = str2;
                this.type = str3;
                this.timestamp = j2;
                this.screenshottedOrReplayed = screenshottedOrReplayedState;
                this.snapServerStatus = snapServerStatus;
                this.viewerList = yfj;
                this.lastInteractionTimestamp = l;
                return;
            }
            throw new NullPointerException("Null senderUsername");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetSnapInfoFromMessageWithMessageIdModel) {
            GetSnapInfoFromMessageWithMessageIdModel getSnapInfoFromMessageWithMessageIdModel = (GetSnapInfoFromMessageWithMessageIdModel) obj;
            if (this._id == getSnapInfoFromMessageWithMessageIdModel._id() && this.key.equals(getSnapInfoFromMessageWithMessageIdModel.key()) && this.senderUsername.equals(getSnapInfoFromMessageWithMessageIdModel.senderUsername())) {
                String str = this.type;
                if (str != null ? !str.equals(getSnapInfoFromMessageWithMessageIdModel.type()) : getSnapInfoFromMessageWithMessageIdModel.type() != null) {
                    if (this.timestamp == getSnapInfoFromMessageWithMessageIdModel.timestamp()) {
                        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                        if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(getSnapInfoFromMessageWithMessageIdModel.screenshottedOrReplayed()) : getSnapInfoFromMessageWithMessageIdModel.screenshottedOrReplayed() != null) {
                            SnapServerStatus snapServerStatus = this.snapServerStatus;
                            if (snapServerStatus != null ? !snapServerStatus.equals(getSnapInfoFromMessageWithMessageIdModel.snapServerStatus()) : getSnapInfoFromMessageWithMessageIdModel.snapServerStatus() != null) {
                                yfj yfj = this.viewerList;
                                if (yfj != null ? !yfj.equals(getSnapInfoFromMessageWithMessageIdModel.viewerList()) : getSnapInfoFromMessageWithMessageIdModel.viewerList() != null) {
                                    Long l = this.lastInteractionTimestamp;
                                    return l != null ? !l.equals(getSnapInfoFromMessageWithMessageIdModel.lastInteractionTimestamp()) : getSnapInfoFromMessageWithMessageIdModel.lastInteractionTimestamp() != null;
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
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.senderUsername.hashCode()) * 1000003;
        String str = this.type;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.timestamp;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        yfj yfj = this.viewerList;
        hashCode = (hashCode ^ (yfj == null ? 0 : yfj.hashCode())) * 1000003;
        Long l = this.lastInteractionTimestamp;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
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

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetSnapInfoFromMessageWithMessageIdModel{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", viewerList=");
        stringBuilder.append(this.viewerList);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }

    public final yfj viewerList() {
        return this.viewerList;
    }
}

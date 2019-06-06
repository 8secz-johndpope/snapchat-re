package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.ReceivedSnapsModel;
import java.util.Arrays;

final class AutoValue_MessageRecord_ReceivedSnapsModel extends ReceivedSnapsModel {
    private final byte[] content;
    private final Long feedRowId;
    private final long interactionTimestamp;
    private final String key;
    private final long messageTimestamp;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long senderId;
    private final SnapServerStatus snapServerStatus;

    AutoValue_MessageRecord_ReceivedSnapsModel(Long l, Long l2, String str, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr) {
        this.feedRowId = l;
        this.senderId = l2;
        if (str != null) {
            this.key = str;
            this.messageTimestamp = j;
            this.interactionTimestamp = j2;
            this.snapServerStatus = snapServerStatus;
            this.screenshottedOrReplayed = screenshottedOrReplayedState;
            this.content = bArr;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final byte[] content() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReceivedSnapsModel) {
            ReceivedSnapsModel receivedSnapsModel = (ReceivedSnapsModel) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(receivedSnapsModel.feedRowId()) : receivedSnapsModel.feedRowId() != null) {
                l = this.senderId;
                if (l != null ? !l.equals(receivedSnapsModel.senderId()) : receivedSnapsModel.senderId() != null) {
                    if (this.key.equals(receivedSnapsModel.key()) && this.messageTimestamp == receivedSnapsModel.messageTimestamp() && this.interactionTimestamp == receivedSnapsModel.interactionTimestamp()) {
                        SnapServerStatus snapServerStatus = this.snapServerStatus;
                        if (snapServerStatus != null ? !snapServerStatus.equals(receivedSnapsModel.snapServerStatus()) : receivedSnapsModel.snapServerStatus() != null) {
                            ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                            if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(receivedSnapsModel.screenshottedOrReplayed()) : receivedSnapsModel.screenshottedOrReplayed() != null) {
                                if (Arrays.equals(this.content, receivedSnapsModel instanceof AutoValue_MessageRecord_ReceivedSnapsModel ? ((AutoValue_MessageRecord_ReceivedSnapsModel) receivedSnapsModel).content : receivedSnapsModel.content())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        Long l = this.feedRowId;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        Long l2 = this.senderId;
        hashCode = (((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ this.key.hashCode()) * 1000003;
        long j = this.messageTimestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        j = this.interactionTimestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        if (screenshottedOrReplayedState != null) {
            i = screenshottedOrReplayedState.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ Arrays.hashCode(this.content);
    }

    public final long interactionTimestamp() {
        return this.interactionTimestamp;
    }

    public final String key() {
        return this.key;
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

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReceivedSnapsModel{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", messageTimestamp=");
        stringBuilder.append(this.messageTimestamp);
        stringBuilder.append(", interactionTimestamp=");
        stringBuilder.append(this.interactionTimestamp);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

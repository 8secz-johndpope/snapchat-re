package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.LastSentSnapModel;
import java.util.Arrays;

final class AutoValue_MessageRecord_LastSentSnapModel extends LastSentSnapModel {
    private final byte[] authToken;
    private final byte[] content;
    private final Long feedRowId;
    private final FriendLinkType friendLinkType;
    private final long interactionTimestamp;
    private final String key;
    private final long messageTimestamp;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long senderId;
    private final SnapServerStatus snapServerStatus;

    AutoValue_MessageRecord_LastSentSnapModel(Long l, Long l2, String str, long j, long j2, SnapServerStatus snapServerStatus, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, byte[] bArr2, FriendLinkType friendLinkType) {
        this.feedRowId = l;
        this.senderId = l2;
        if (str != null) {
            this.key = str;
            this.messageTimestamp = j;
            this.interactionTimestamp = j2;
            this.snapServerStatus = snapServerStatus;
            this.screenshottedOrReplayed = screenshottedOrReplayedState;
            this.content = bArr;
            this.authToken = bArr2;
            this.friendLinkType = friendLinkType;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final byte[] authToken() {
        return this.authToken;
    }

    public final byte[] content() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastSentSnapModel) {
            LastSentSnapModel lastSentSnapModel = (LastSentSnapModel) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(lastSentSnapModel.feedRowId()) : lastSentSnapModel.feedRowId() != null) {
                l = this.senderId;
                if (l != null ? !l.equals(lastSentSnapModel.senderId()) : lastSentSnapModel.senderId() != null) {
                    if (this.key.equals(lastSentSnapModel.key()) && this.messageTimestamp == lastSentSnapModel.messageTimestamp() && this.interactionTimestamp == lastSentSnapModel.interactionTimestamp()) {
                        SnapServerStatus snapServerStatus = this.snapServerStatus;
                        if (snapServerStatus != null ? !snapServerStatus.equals(lastSentSnapModel.snapServerStatus()) : lastSentSnapModel.snapServerStatus() != null) {
                            ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                            if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(lastSentSnapModel.screenshottedOrReplayed()) : lastSentSnapModel.screenshottedOrReplayed() != null) {
                                boolean z = lastSentSnapModel instanceof AutoValue_MessageRecord_LastSentSnapModel;
                                if (Arrays.equals(this.content, z ? ((AutoValue_MessageRecord_LastSentSnapModel) lastSentSnapModel).content : lastSentSnapModel.content())) {
                                    if (Arrays.equals(this.authToken, z ? ((AutoValue_MessageRecord_LastSentSnapModel) lastSentSnapModel).authToken : lastSentSnapModel.authToken())) {
                                        FriendLinkType friendLinkType = this.friendLinkType;
                                        return friendLinkType != null ? !friendLinkType.equals(lastSentSnapModel.friendLinkType()) : lastSentSnapModel.friendLinkType() != null;
                                    }
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
        hashCode = (((hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ this.key.hashCode()) * 1000003;
        long j = this.messageTimestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        j = this.interactionTimestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        hashCode = (((((hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003) ^ Arrays.hashCode(this.authToken)) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i = friendLinkType.hashCode();
        }
        return hashCode ^ i;
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
        StringBuilder stringBuilder = new StringBuilder("LastSentSnapModel{feedRowId=");
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
        stringBuilder.append(", authToken=");
        stringBuilder.append(Arrays.toString(this.authToken));
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

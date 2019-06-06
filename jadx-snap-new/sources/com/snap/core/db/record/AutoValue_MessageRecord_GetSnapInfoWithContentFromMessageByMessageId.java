package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.MessageRecord.GetSnapInfoWithContentFromMessageByMessageId;
import java.util.Arrays;

final class AutoValue_MessageRecord_GetSnapInfoWithContentFromMessageByMessageId extends GetSnapInfoWithContentFromMessageByMessageId {
    private final long _id;
    private final byte[] content;
    private final String key;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final String senderUsername;
    private final Long sequenceNumber;

    AutoValue_MessageRecord_GetSnapInfoWithContentFromMessageByMessageId(long j, String str, String str2, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, byte[] bArr) {
        this._id = j;
        if (str != null) {
            this.key = str;
            if (str2 != null) {
                this.senderUsername = str2;
                this.screenshottedOrReplayed = screenshottedOrReplayedState;
                this.sequenceNumber = l;
                this.content = bArr;
                return;
            }
            throw new NullPointerException("Null senderUsername");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final byte[] content() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetSnapInfoWithContentFromMessageByMessageId) {
            GetSnapInfoWithContentFromMessageByMessageId getSnapInfoWithContentFromMessageByMessageId = (GetSnapInfoWithContentFromMessageByMessageId) obj;
            if (this._id == getSnapInfoWithContentFromMessageByMessageId._id() && this.key.equals(getSnapInfoWithContentFromMessageByMessageId.key()) && this.senderUsername.equals(getSnapInfoWithContentFromMessageByMessageId.senderUsername())) {
                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(getSnapInfoWithContentFromMessageByMessageId.screenshottedOrReplayed()) : getSnapInfoWithContentFromMessageByMessageId.screenshottedOrReplayed() != null) {
                    Long l = this.sequenceNumber;
                    if (l != null ? !l.equals(getSnapInfoWithContentFromMessageByMessageId.sequenceNumber()) : getSnapInfoWithContentFromMessageByMessageId.sequenceNumber() != null) {
                        if (Arrays.equals(this.content, getSnapInfoWithContentFromMessageByMessageId instanceof AutoValue_MessageRecord_GetSnapInfoWithContentFromMessageByMessageId ? ((AutoValue_MessageRecord_GetSnapInfoWithContentFromMessageByMessageId) getSnapInfoWithContentFromMessageByMessageId).content : getSnapInfoWithContentFromMessageByMessageId.content())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.senderUsername.hashCode()) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        int i = 0;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        Long l = this.sequenceNumber;
        if (l != null) {
            i = l.hashCode();
        }
        return Arrays.hashCode(this.content) ^ ((hashCode ^ i) * 1000003);
    }

    public final String key() {
        return this.key;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetSnapInfoWithContentFromMessageByMessageId{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

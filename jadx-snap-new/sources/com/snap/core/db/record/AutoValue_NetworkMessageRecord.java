package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.yfj;
import java.util.Arrays;
import java.util.List;

final class AutoValue_NetworkMessageRecord extends NetworkMessageRecord {
    private final long _id;
    private final MessageClientStatus clientStatus;
    private final byte[] content;
    private final String conversationId;
    private final Long groupVersion;
    private final Long lastInteractionTimestamp;
    private final String messageId;
    private final String messageType;
    private final gcj preserved;
    private final boolean released;
    private final List<String> savedBy;
    private final gcm savedStates;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final List<String> seenBy;
    private final Long seenTimestamp;
    private final long senderId;
    private final long sentTimestamp;
    private final Long sequenceNumber;
    private final SnapServerStatus snapServerStatus;
    private final yfj viewerList;

    AutoValue_NetworkMessageRecord(long j, String str, String str2, long j2, Long l, long j3, Long l2, Long l3, List<String> list, List<String> list2, MessageClientStatus messageClientStatus, String str3, byte[] bArr, gcj gcj, gcm gcm, boolean z, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, Long l4, yfj yfj) {
        String str4 = str;
        String str5 = str3;
        byte[] bArr2 = bArr;
        gcj gcj2 = gcj;
        this._id = j;
        if (str4 != null) {
            this.messageId = str4;
            this.conversationId = str2;
            this.sentTimestamp = j2;
            this.seenTimestamp = l;
            this.senderId = j3;
            this.sequenceNumber = l2;
            this.groupVersion = l3;
            this.seenBy = list;
            this.savedBy = list2;
            this.clientStatus = messageClientStatus;
            if (str5 != null) {
                this.messageType = str5;
                if (bArr2 != null) {
                    this.content = bArr2;
                    if (gcj2 != null) {
                        this.preserved = gcj2;
                        this.savedStates = gcm;
                        this.released = z;
                        this.screenshottedOrReplayed = screenshottedOrReplayedState;
                        this.snapServerStatus = snapServerStatus;
                        this.lastInteractionTimestamp = l4;
                        this.viewerList = yfj;
                        return;
                    }
                    throw new NullPointerException("Null preserved");
                }
                throw new NullPointerException("Null content");
            }
            throw new NullPointerException("Null messageType");
        }
        throw new NullPointerException("Null messageId");
    }

    public final long _id() {
        return this._id;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final byte[] content() {
        return this.content;
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkMessageRecord) {
            NetworkMessageRecord networkMessageRecord = (NetworkMessageRecord) obj;
            if (this._id == networkMessageRecord._id() && this.messageId.equals(networkMessageRecord.messageId())) {
                String str = this.conversationId;
                if (str != null ? !str.equals(networkMessageRecord.conversationId()) : networkMessageRecord.conversationId() != null) {
                    if (this.sentTimestamp == networkMessageRecord.sentTimestamp()) {
                        Long l = this.seenTimestamp;
                        if (l != null ? !l.equals(networkMessageRecord.seenTimestamp()) : networkMessageRecord.seenTimestamp() != null) {
                            if (this.senderId == networkMessageRecord.senderId()) {
                                l = this.sequenceNumber;
                                if (l != null ? !l.equals(networkMessageRecord.sequenceNumber()) : networkMessageRecord.sequenceNumber() != null) {
                                    l = this.groupVersion;
                                    if (l != null ? !l.equals(networkMessageRecord.groupVersion()) : networkMessageRecord.groupVersion() != null) {
                                        List list = this.seenBy;
                                        if (list != null ? !list.equals(networkMessageRecord.seenBy()) : networkMessageRecord.seenBy() != null) {
                                            list = this.savedBy;
                                            if (list != null ? !list.equals(networkMessageRecord.savedBy()) : networkMessageRecord.savedBy() != null) {
                                                MessageClientStatus messageClientStatus = this.clientStatus;
                                                if (messageClientStatus != null ? !messageClientStatus.equals(networkMessageRecord.clientStatus()) : networkMessageRecord.clientStatus() != null) {
                                                    if (this.messageType.equals(networkMessageRecord.messageType())) {
                                                        if (Arrays.equals(this.content, networkMessageRecord instanceof AutoValue_NetworkMessageRecord ? ((AutoValue_NetworkMessageRecord) networkMessageRecord).content : networkMessageRecord.content()) && this.preserved.equals(networkMessageRecord.preserved())) {
                                                            gcm gcm = this.savedStates;
                                                            if (gcm != null ? !gcm.equals(networkMessageRecord.savedStates()) : networkMessageRecord.savedStates() != null) {
                                                                if (this.released == networkMessageRecord.released()) {
                                                                    ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                                                    if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(networkMessageRecord.screenshottedOrReplayed()) : networkMessageRecord.screenshottedOrReplayed() != null) {
                                                                        SnapServerStatus snapServerStatus = this.snapServerStatus;
                                                                        if (snapServerStatus != null ? !snapServerStatus.equals(networkMessageRecord.snapServerStatus()) : networkMessageRecord.snapServerStatus() != null) {
                                                                            l = this.lastInteractionTimestamp;
                                                                            if (l != null ? !l.equals(networkMessageRecord.lastInteractionTimestamp()) : networkMessageRecord.lastInteractionTimestamp() != null) {
                                                                                yfj yfj = this.viewerList;
                                                                                return yfj != null ? !yfj.equals(networkMessageRecord.viewerList()) : networkMessageRecord.viewerList() != null;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long groupVersion() {
        return this.groupVersion;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.messageId.hashCode()) * 1000003;
        String str = this.conversationId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.sentTimestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.seenTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        j2 = this.senderId;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l2 = this.sequenceNumber;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        l2 = this.groupVersion;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        List list = this.seenBy;
        hashCode = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        list = this.savedBy;
        hashCode = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (((((((hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003) ^ this.messageType.hashCode()) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003) ^ this.preserved.hashCode()) * 1000003;
        gcm gcm = this.savedStates;
        hashCode = (((hashCode ^ (gcm == null ? 0 : gcm.hashCode())) * 1000003) ^ (this.released ? 1231 : 1237)) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        l2 = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        yfj yfj = this.viewerList;
        if (yfj != null) {
            i = yfj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final String messageId() {
        return this.messageId;
    }

    public final String messageType() {
        return this.messageType;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final boolean released() {
        return this.released;
    }

    public final List<String> savedBy() {
        return this.savedBy;
    }

    public final gcm savedStates() {
        return this.savedStates;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final List<String> seenBy() {
        return this.seenBy;
    }

    public final Long seenTimestamp() {
        return this.seenTimestamp;
    }

    public final long senderId() {
        return this.senderId;
    }

    public final long sentTimestamp() {
        return this.sentTimestamp;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkMessageRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", sentTimestamp=");
        stringBuilder.append(this.sentTimestamp);
        stringBuilder.append(", seenTimestamp=");
        stringBuilder.append(this.seenTimestamp);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", groupVersion=");
        stringBuilder.append(this.groupVersion);
        stringBuilder.append(", seenBy=");
        stringBuilder.append(this.seenBy);
        stringBuilder.append(", savedBy=");
        stringBuilder.append(this.savedBy);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.messageType);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.savedStates);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", viewerList=");
        stringBuilder.append(this.viewerList);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final yfj viewerList() {
        return this.viewerList;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.model.MessageRecipient;
import defpackage.gci;
import defpackage.gcj;
import java.util.Arrays;
import java.util.List;

final class AutoValue_LocalMessageActionRecord extends LocalMessageActionRecord {
    private final long _id;
    private final long actionTimestamp;
    private final gci actionType;
    private final byte[] analytics;
    private final MessageClientStatus clientStatus;
    private final byte[] content;
    private final String conversationId;
    private final Integer currentUserSaveVersion;
    private final Boolean currentUserSaved;
    private final Long groupVersion;
    private final String messageId;
    private final String messageType;
    private final gcj preserved;
    private final List<Long> recipientUserIds;
    private final List<MessageRecipient> recipients;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final List<Long> seenBy;
    private final Long seenTimestamp;
    private final Long senderUserId;
    private final Long sentTimestamp;
    private final Long sequenceNumber;
    private final SnapServerStatus snapServerStatus;

    AutoValue_LocalMessageActionRecord(long j, gci gci, long j2, String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5, List<Long> list, List<Long> list2, gcj gcj, Boolean bool, Integer num, MessageClientStatus messageClientStatus, String str3, byte[] bArr, byte[] bArr2, List<MessageRecipient> list3, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus) {
        gci gci2 = gci;
        String str4 = str;
        this._id = j;
        if (gci2 != null) {
            this.actionType = gci2;
            this.actionTimestamp = j2;
            if (str4 != null) {
                this.messageId = str4;
                this.conversationId = str2;
                this.sentTimestamp = l;
                this.seenTimestamp = l2;
                this.senderUserId = l3;
                this.sequenceNumber = l4;
                this.groupVersion = l5;
                this.seenBy = list;
                this.recipientUserIds = list2;
                this.preserved = gcj;
                this.currentUserSaved = bool;
                this.currentUserSaveVersion = num;
                this.clientStatus = messageClientStatus;
                this.messageType = str3;
                this.content = bArr;
                this.analytics = bArr2;
                this.recipients = list3;
                this.screenshottedOrReplayed = screenshottedOrReplayedState;
                this.snapServerStatus = snapServerStatus;
                return;
            }
            throw new NullPointerException("Null messageId");
        }
        throw new NullPointerException("Null actionType");
    }

    public final long _id() {
        return this._id;
    }

    public final long actionTimestamp() {
        return this.actionTimestamp;
    }

    public final gci actionType() {
        return this.actionType;
    }

    public final byte[] analytics() {
        return this.analytics;
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

    public final Integer currentUserSaveVersion() {
        return this.currentUserSaveVersion;
    }

    public final Boolean currentUserSaved() {
        return this.currentUserSaved;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalMessageActionRecord) {
            LocalMessageActionRecord localMessageActionRecord = (LocalMessageActionRecord) obj;
            if (this._id == localMessageActionRecord._id() && this.actionType.equals(localMessageActionRecord.actionType()) && this.actionTimestamp == localMessageActionRecord.actionTimestamp() && this.messageId.equals(localMessageActionRecord.messageId())) {
                String str = this.conversationId;
                if (str != null ? !str.equals(localMessageActionRecord.conversationId()) : localMessageActionRecord.conversationId() != null) {
                    Long l = this.sentTimestamp;
                    if (l != null ? !l.equals(localMessageActionRecord.sentTimestamp()) : localMessageActionRecord.sentTimestamp() != null) {
                        l = this.seenTimestamp;
                        if (l != null ? !l.equals(localMessageActionRecord.seenTimestamp()) : localMessageActionRecord.seenTimestamp() != null) {
                            l = this.senderUserId;
                            if (l != null ? !l.equals(localMessageActionRecord.senderUserId()) : localMessageActionRecord.senderUserId() != null) {
                                l = this.sequenceNumber;
                                if (l != null ? !l.equals(localMessageActionRecord.sequenceNumber()) : localMessageActionRecord.sequenceNumber() != null) {
                                    l = this.groupVersion;
                                    if (l != null ? !l.equals(localMessageActionRecord.groupVersion()) : localMessageActionRecord.groupVersion() != null) {
                                        List list = this.seenBy;
                                        if (list != null ? !list.equals(localMessageActionRecord.seenBy()) : localMessageActionRecord.seenBy() != null) {
                                            list = this.recipientUserIds;
                                            if (list != null ? !list.equals(localMessageActionRecord.recipientUserIds()) : localMessageActionRecord.recipientUserIds() != null) {
                                                gcj gcj = this.preserved;
                                                if (gcj != null ? !gcj.equals(localMessageActionRecord.preserved()) : localMessageActionRecord.preserved() != null) {
                                                    Boolean bool = this.currentUserSaved;
                                                    if (bool != null ? !bool.equals(localMessageActionRecord.currentUserSaved()) : localMessageActionRecord.currentUserSaved() != null) {
                                                        Integer num = this.currentUserSaveVersion;
                                                        if (num != null ? !num.equals(localMessageActionRecord.currentUserSaveVersion()) : localMessageActionRecord.currentUserSaveVersion() != null) {
                                                            MessageClientStatus messageClientStatus = this.clientStatus;
                                                            if (messageClientStatus != null ? !messageClientStatus.equals(localMessageActionRecord.clientStatus()) : localMessageActionRecord.clientStatus() != null) {
                                                                str = this.messageType;
                                                                if (str != null ? !str.equals(localMessageActionRecord.messageType()) : localMessageActionRecord.messageType() != null) {
                                                                    boolean z = localMessageActionRecord instanceof AutoValue_LocalMessageActionRecord;
                                                                    if (Arrays.equals(this.content, z ? ((AutoValue_LocalMessageActionRecord) localMessageActionRecord).content : localMessageActionRecord.content())) {
                                                                        if (Arrays.equals(this.analytics, z ? ((AutoValue_LocalMessageActionRecord) localMessageActionRecord).analytics : localMessageActionRecord.analytics())) {
                                                                            list = this.recipients;
                                                                            if (list != null ? !list.equals(localMessageActionRecord.recipients()) : localMessageActionRecord.recipients() != null) {
                                                                                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                                                                if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(localMessageActionRecord.screenshottedOrReplayed()) : localMessageActionRecord.screenshottedOrReplayed() != null) {
                                                                                    SnapServerStatus snapServerStatus = this.snapServerStatus;
                                                                                    return snapServerStatus != null ? !snapServerStatus.equals(localMessageActionRecord.snapServerStatus()) : localMessageActionRecord.snapServerStatus() != null;
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
    }

    public final Long groupVersion() {
        return this.groupVersion;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.actionType.hashCode()) * 1000003;
        long j2 = this.actionTimestamp;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.messageId.hashCode()) * 1000003;
        String str = this.conversationId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.sentTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.seenTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.senderUserId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.sequenceNumber;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.groupVersion;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        List list = this.seenBy;
        hashCode = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        list = this.recipientUserIds;
        hashCode = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        gcj gcj = this.preserved;
        hashCode = (hashCode ^ (gcj == null ? 0 : gcj.hashCode())) * 1000003;
        Boolean bool = this.currentUserSaved;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Integer num = this.currentUserSaveVersion;
        hashCode = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        str = this.messageType;
        hashCode = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003) ^ Arrays.hashCode(this.analytics)) * 1000003;
        list = this.recipients;
        hashCode = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        if (snapServerStatus != null) {
            i = snapServerStatus.hashCode();
        }
        return hashCode ^ i;
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

    public final List<Long> recipientUserIds() {
        return this.recipientUserIds;
    }

    public final List<MessageRecipient> recipients() {
        return this.recipients;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final List<Long> seenBy() {
        return this.seenBy;
    }

    public final Long seenTimestamp() {
        return this.seenTimestamp;
    }

    public final Long senderUserId() {
        return this.senderUserId;
    }

    public final Long sentTimestamp() {
        return this.sentTimestamp;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocalMessageActionRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", actionType=");
        stringBuilder.append(this.actionType);
        stringBuilder.append(", actionTimestamp=");
        stringBuilder.append(this.actionTimestamp);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.messageId);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", sentTimestamp=");
        stringBuilder.append(this.sentTimestamp);
        stringBuilder.append(", seenTimestamp=");
        stringBuilder.append(this.seenTimestamp);
        stringBuilder.append(", senderUserId=");
        stringBuilder.append(this.senderUserId);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", groupVersion=");
        stringBuilder.append(this.groupVersion);
        stringBuilder.append(", seenBy=");
        stringBuilder.append(this.seenBy);
        stringBuilder.append(", recipientUserIds=");
        stringBuilder.append(this.recipientUserIds);
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append(", currentUserSaved=");
        stringBuilder.append(this.currentUserSaved);
        stringBuilder.append(", currentUserSaveVersion=");
        stringBuilder.append(this.currentUserSaveVersion);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.messageType);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", analytics=");
        stringBuilder.append(Arrays.toString(this.analytics));
        stringBuilder.append(", recipients=");
        stringBuilder.append(this.recipients);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

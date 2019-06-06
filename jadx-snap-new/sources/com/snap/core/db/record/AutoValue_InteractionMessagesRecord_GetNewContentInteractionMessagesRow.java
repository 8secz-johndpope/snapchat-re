package com.snap.core.db.record;

import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.InteractionMessagesRecord.GetNewContentInteractionMessagesRow;
import defpackage.aetf;

final class AutoValue_InteractionMessagesRecord_GetNewContentInteractionMessagesRow extends GetNewContentInteractionMessagesRow {
    private final String chatMessageId;
    private final Long chatMessageTimestamp;
    private final long feedRowId;
    private final Boolean hasSound;
    private final Long interactionTimestamp;
    private final ScreenshottedOrReplayedState latestScreenshottedOrReplayed;
    private final LocalMessageBodyType messageBodyType;
    private final MessageClientStatus messageClientStatus;
    private final InteractionMessageType messageType;
    private final aetf mischiefUpdateMessageType;
    private final Long senderId;
    private final String snapId;
    private final Long snapMessageTimestamp;

    AutoValue_InteractionMessagesRecord_GetNewContentInteractionMessagesRow(long j, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        this.feedRowId = j;
        if (interactionMessageType != null) {
            this.messageType = interactionMessageType;
            if (messageClientStatus != null) {
                this.messageClientStatus = messageClientStatus;
                if (localMessageBodyType != null) {
                    this.messageBodyType = localMessageBodyType;
                    this.senderId = l;
                    this.chatMessageId = str;
                    this.chatMessageTimestamp = l2;
                    this.mischiefUpdateMessageType = aetf;
                    this.snapId = str2;
                    this.hasSound = bool;
                    this.snapMessageTimestamp = l3;
                    this.interactionTimestamp = l4;
                    this.latestScreenshottedOrReplayed = screenshottedOrReplayedState;
                    return;
                }
                throw new NullPointerException("Null messageBodyType");
            }
            throw new NullPointerException("Null messageClientStatus");
        }
        throw new NullPointerException("Null messageType");
    }

    public final String chatMessageId() {
        return this.chatMessageId;
    }

    public final Long chatMessageTimestamp() {
        return this.chatMessageTimestamp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetNewContentInteractionMessagesRow) {
            GetNewContentInteractionMessagesRow getNewContentInteractionMessagesRow = (GetNewContentInteractionMessagesRow) obj;
            if (this.feedRowId == getNewContentInteractionMessagesRow.feedRowId() && this.messageType.equals(getNewContentInteractionMessagesRow.messageType()) && this.messageClientStatus.equals(getNewContentInteractionMessagesRow.messageClientStatus()) && this.messageBodyType.equals(getNewContentInteractionMessagesRow.messageBodyType())) {
                Long l = this.senderId;
                if (l != null ? !l.equals(getNewContentInteractionMessagesRow.senderId()) : getNewContentInteractionMessagesRow.senderId() != null) {
                    String str = this.chatMessageId;
                    if (str != null ? !str.equals(getNewContentInteractionMessagesRow.chatMessageId()) : getNewContentInteractionMessagesRow.chatMessageId() != null) {
                        l = this.chatMessageTimestamp;
                        if (l != null ? !l.equals(getNewContentInteractionMessagesRow.chatMessageTimestamp()) : getNewContentInteractionMessagesRow.chatMessageTimestamp() != null) {
                            aetf aetf = this.mischiefUpdateMessageType;
                            if (aetf != null ? !aetf.equals(getNewContentInteractionMessagesRow.mischiefUpdateMessageType()) : getNewContentInteractionMessagesRow.mischiefUpdateMessageType() != null) {
                                str = this.snapId;
                                if (str != null ? !str.equals(getNewContentInteractionMessagesRow.snapId()) : getNewContentInteractionMessagesRow.snapId() != null) {
                                    Boolean bool = this.hasSound;
                                    if (bool != null ? !bool.equals(getNewContentInteractionMessagesRow.hasSound()) : getNewContentInteractionMessagesRow.hasSound() != null) {
                                        l = this.snapMessageTimestamp;
                                        if (l != null ? !l.equals(getNewContentInteractionMessagesRow.snapMessageTimestamp()) : getNewContentInteractionMessagesRow.snapMessageTimestamp() != null) {
                                            l = this.interactionTimestamp;
                                            if (l != null ? !l.equals(getNewContentInteractionMessagesRow.interactionTimestamp()) : getNewContentInteractionMessagesRow.interactionTimestamp() != null) {
                                                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.latestScreenshottedOrReplayed;
                                                return screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(getNewContentInteractionMessagesRow.latestScreenshottedOrReplayed()) : getNewContentInteractionMessagesRow.latestScreenshottedOrReplayed() != null;
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

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final Boolean hasSound() {
        return this.hasSound;
    }

    public final int hashCode() {
        long j = this.feedRowId;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.messageType.hashCode()) * 1000003) ^ this.messageClientStatus.hashCode()) * 1000003) ^ this.messageBodyType.hashCode()) * 1000003;
        Long l = this.senderId;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.chatMessageId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.chatMessageTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        aetf aetf = this.mischiefUpdateMessageType;
        hashCode = (hashCode ^ (aetf == null ? 0 : aetf.hashCode())) * 1000003;
        str = this.snapId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.hasSound;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.snapMessageTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.interactionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.latestScreenshottedOrReplayed;
        if (screenshottedOrReplayedState != null) {
            i = screenshottedOrReplayedState.hashCode();
        }
        return hashCode ^ i;
    }

    public final Long interactionTimestamp() {
        return this.interactionTimestamp;
    }

    public final ScreenshottedOrReplayedState latestScreenshottedOrReplayed() {
        return this.latestScreenshottedOrReplayed;
    }

    public final LocalMessageBodyType messageBodyType() {
        return this.messageBodyType;
    }

    public final MessageClientStatus messageClientStatus() {
        return this.messageClientStatus;
    }

    public final InteractionMessageType messageType() {
        return this.messageType;
    }

    public final aetf mischiefUpdateMessageType() {
        return this.mischiefUpdateMessageType;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final Long snapMessageTimestamp() {
        return this.snapMessageTimestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetNewContentInteractionMessagesRow{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", messageType=");
        stringBuilder.append(this.messageType);
        stringBuilder.append(", messageClientStatus=");
        stringBuilder.append(this.messageClientStatus);
        stringBuilder.append(", messageBodyType=");
        stringBuilder.append(this.messageBodyType);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", chatMessageId=");
        stringBuilder.append(this.chatMessageId);
        stringBuilder.append(", chatMessageTimestamp=");
        stringBuilder.append(this.chatMessageTimestamp);
        stringBuilder.append(", mischiefUpdateMessageType=");
        stringBuilder.append(this.mischiefUpdateMessageType);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", hasSound=");
        stringBuilder.append(this.hasSound);
        stringBuilder.append(", snapMessageTimestamp=");
        stringBuilder.append(this.snapMessageTimestamp);
        stringBuilder.append(", interactionTimestamp=");
        stringBuilder.append(this.interactionTimestamp);
        stringBuilder.append(", latestScreenshottedOrReplayed=");
        stringBuilder.append(this.latestScreenshottedOrReplayed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

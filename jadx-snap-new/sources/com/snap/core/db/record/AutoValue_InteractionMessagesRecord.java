package com.snap.core.db.record;

import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import defpackage.aetf;

final class AutoValue_InteractionMessagesRecord extends InteractionMessagesRecord {
    private final long _id;
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

    AutoValue_InteractionMessagesRecord(long j, long j2, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState) {
        InteractionMessageType interactionMessageType2 = interactionMessageType;
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        LocalMessageBodyType localMessageBodyType2 = localMessageBodyType;
        this._id = j;
        this.feedRowId = j2;
        if (interactionMessageType2 != null) {
            this.messageType = interactionMessageType2;
            if (messageClientStatus2 != null) {
                this.messageClientStatus = messageClientStatus2;
                if (localMessageBodyType2 != null) {
                    this.messageBodyType = localMessageBodyType2;
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

    public final long _id() {
        return this._id;
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
        if (obj instanceof InteractionMessagesRecord) {
            InteractionMessagesRecord interactionMessagesRecord = (InteractionMessagesRecord) obj;
            if (this._id == interactionMessagesRecord._id() && this.feedRowId == interactionMessagesRecord.feedRowId() && this.messageType.equals(interactionMessagesRecord.messageType()) && this.messageClientStatus.equals(interactionMessagesRecord.messageClientStatus()) && this.messageBodyType.equals(interactionMessagesRecord.messageBodyType())) {
                Long l = this.senderId;
                if (l != null ? !l.equals(interactionMessagesRecord.senderId()) : interactionMessagesRecord.senderId() != null) {
                    String str = this.chatMessageId;
                    if (str != null ? !str.equals(interactionMessagesRecord.chatMessageId()) : interactionMessagesRecord.chatMessageId() != null) {
                        l = this.chatMessageTimestamp;
                        if (l != null ? !l.equals(interactionMessagesRecord.chatMessageTimestamp()) : interactionMessagesRecord.chatMessageTimestamp() != null) {
                            aetf aetf = this.mischiefUpdateMessageType;
                            if (aetf != null ? !aetf.equals(interactionMessagesRecord.mischiefUpdateMessageType()) : interactionMessagesRecord.mischiefUpdateMessageType() != null) {
                                str = this.snapId;
                                if (str != null ? !str.equals(interactionMessagesRecord.snapId()) : interactionMessagesRecord.snapId() != null) {
                                    Boolean bool = this.hasSound;
                                    if (bool != null ? !bool.equals(interactionMessagesRecord.hasSound()) : interactionMessagesRecord.hasSound() != null) {
                                        l = this.snapMessageTimestamp;
                                        if (l != null ? !l.equals(interactionMessagesRecord.snapMessageTimestamp()) : interactionMessagesRecord.snapMessageTimestamp() != null) {
                                            l = this.interactionTimestamp;
                                            if (l != null ? !l.equals(interactionMessagesRecord.interactionTimestamp()) : interactionMessagesRecord.interactionTimestamp() != null) {
                                                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.latestScreenshottedOrReplayed;
                                                return screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(interactionMessagesRecord.latestScreenshottedOrReplayed()) : interactionMessagesRecord.latestScreenshottedOrReplayed() != null;
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
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.feedRowId;
        i = (((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.messageType.hashCode()) * 1000003) ^ this.messageClientStatus.hashCode()) * 1000003) ^ this.messageBodyType.hashCode()) * 1000003;
        Long l = this.senderId;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.chatMessageId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l = this.chatMessageTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        aetf aetf = this.mischiefUpdateMessageType;
        i = (i ^ (aetf == null ? 0 : aetf.hashCode())) * 1000003;
        str = this.snapId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.hasSound;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.snapMessageTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.interactionTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.latestScreenshottedOrReplayed;
        if (screenshottedOrReplayedState != null) {
            i2 = screenshottedOrReplayedState.hashCode();
        }
        return i ^ i2;
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
        StringBuilder stringBuilder = new StringBuilder("InteractionMessagesRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
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

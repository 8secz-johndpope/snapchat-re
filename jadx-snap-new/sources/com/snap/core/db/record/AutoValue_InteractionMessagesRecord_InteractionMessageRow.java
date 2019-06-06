package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.InteractionMessageType;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.record.InteractionMessagesRecord.InteractionMessageRow;
import defpackage.aetf;
import java.util.Arrays;

final class AutoValue_InteractionMessagesRecord_InteractionMessageRow extends InteractionMessageRow {
    private final byte[] authToken;
    private final String chatMessageId;
    private final Long chatMessageTimestamp;
    private final long feedRowId;
    private final FriendLinkType friendLinkType;
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

    AutoValue_InteractionMessagesRecord_InteractionMessageRow(long j, InteractionMessageType interactionMessageType, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l, String str, Long l2, aetf aetf, String str2, Boolean bool, Long l3, Long l4, ScreenshottedOrReplayedState screenshottedOrReplayedState, byte[] bArr, FriendLinkType friendLinkType) {
        InteractionMessageType interactionMessageType2 = interactionMessageType;
        MessageClientStatus messageClientStatus2 = messageClientStatus;
        LocalMessageBodyType localMessageBodyType2 = localMessageBodyType;
        this.feedRowId = j;
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
                    this.authToken = bArr;
                    this.friendLinkType = friendLinkType;
                    return;
                }
                throw new NullPointerException("Null messageBodyType");
            }
            throw new NullPointerException("Null messageClientStatus");
        }
        throw new NullPointerException("Null messageType");
    }

    public final byte[] authToken() {
        return this.authToken;
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
        if (obj instanceof InteractionMessageRow) {
            InteractionMessageRow interactionMessageRow = (InteractionMessageRow) obj;
            if (this.feedRowId == interactionMessageRow.feedRowId() && this.messageType.equals(interactionMessageRow.messageType()) && this.messageClientStatus.equals(interactionMessageRow.messageClientStatus()) && this.messageBodyType.equals(interactionMessageRow.messageBodyType())) {
                Long l = this.senderId;
                if (l != null ? !l.equals(interactionMessageRow.senderId()) : interactionMessageRow.senderId() != null) {
                    String str = this.chatMessageId;
                    if (str != null ? !str.equals(interactionMessageRow.chatMessageId()) : interactionMessageRow.chatMessageId() != null) {
                        l = this.chatMessageTimestamp;
                        if (l != null ? !l.equals(interactionMessageRow.chatMessageTimestamp()) : interactionMessageRow.chatMessageTimestamp() != null) {
                            aetf aetf = this.mischiefUpdateMessageType;
                            if (aetf != null ? !aetf.equals(interactionMessageRow.mischiefUpdateMessageType()) : interactionMessageRow.mischiefUpdateMessageType() != null) {
                                str = this.snapId;
                                if (str != null ? !str.equals(interactionMessageRow.snapId()) : interactionMessageRow.snapId() != null) {
                                    Boolean bool = this.hasSound;
                                    if (bool != null ? !bool.equals(interactionMessageRow.hasSound()) : interactionMessageRow.hasSound() != null) {
                                        l = this.snapMessageTimestamp;
                                        if (l != null ? !l.equals(interactionMessageRow.snapMessageTimestamp()) : interactionMessageRow.snapMessageTimestamp() != null) {
                                            l = this.interactionTimestamp;
                                            if (l != null ? !l.equals(interactionMessageRow.interactionTimestamp()) : interactionMessageRow.interactionTimestamp() != null) {
                                                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.latestScreenshottedOrReplayed;
                                                if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(interactionMessageRow.latestScreenshottedOrReplayed()) : interactionMessageRow.latestScreenshottedOrReplayed() != null) {
                                                    if (Arrays.equals(this.authToken, interactionMessageRow instanceof AutoValue_InteractionMessagesRecord_InteractionMessageRow ? ((AutoValue_InteractionMessagesRecord_InteractionMessageRow) interactionMessageRow).authToken : interactionMessageRow.authToken())) {
                                                        FriendLinkType friendLinkType = this.friendLinkType;
                                                        return friendLinkType != null ? !friendLinkType.equals(interactionMessageRow.friendLinkType()) : interactionMessageRow.friendLinkType() != null;
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

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
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
        hashCode = (((hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003) ^ Arrays.hashCode(this.authToken)) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i = friendLinkType.hashCode();
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
        StringBuilder stringBuilder = new StringBuilder("InteractionMessageRow{feedRowId=");
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
        stringBuilder.append(", authToken=");
        stringBuilder.append(Arrays.toString(this.authToken));
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

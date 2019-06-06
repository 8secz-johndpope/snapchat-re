package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.yfj;
import java.util.Arrays;

final class AutoValue_MessageRecord extends MessageRecord {
    private final long _id;
    private final long _modifiedTimestamp;
    private final MessageClientStatus clientStatus;
    private final byte[] content;
    private final String cryptoIV;
    private final String cryptoKey;
    private final Long feedRowId;
    private final String key;
    private final Long lastInteractionTimestamp;
    private final Integer mediaHeight;
    private final String mediaId;
    private final Boolean mediaIsInfinite;
    private final String mediaOwner;
    private final String mediaSourceId;
    private final Float mediaTimerSec;
    private final String mediaType;
    private final String mediaUrl;
    private final String mediaVenueId;
    private final Integer mediaWidth;
    private final Boolean mediaZipped;
    private final String messageOrderingKey;
    private final Long payloadId;
    private final gcj preserved;
    private final boolean released;
    private final gcm savedStates;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final Long seenTimestamp;
    private final Long senderId;
    private final Long sequenceNumber;
    private final SnapServerStatus snapServerStatus;
    private final long timestamp;
    private final String type;
    private final yfj viewerList;

    AutoValue_MessageRecord(long j, long j2, String str, Long l, long j3, Long l2, Long l3, MessageClientStatus messageClientStatus, Long l4, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, Float f, Boolean bool, Boolean bool2, String str9, String str10, Long l5, byte[] bArr, gcj gcj, gcm gcm, boolean z, String str11, ScreenshottedOrReplayedState screenshottedOrReplayedState, SnapServerStatus snapServerStatus, Long l6, yfj yfj) {
        String str12 = str;
        gcj gcj2 = gcj;
        this._id = j;
        this._modifiedTimestamp = j2;
        if (str12 != null) {
            this.key = str12;
            this.feedRowId = l;
            this.timestamp = j3;
            this.seenTimestamp = l2;
            this.senderId = l3;
            this.clientStatus = messageClientStatus;
            this.sequenceNumber = l4;
            this.type = str2;
            this.cryptoKey = str3;
            this.cryptoIV = str4;
            this.mediaId = str5;
            this.mediaType = str6;
            this.mediaUrl = str7;
            this.mediaWidth = num;
            this.mediaHeight = num2;
            this.mediaOwner = str8;
            this.mediaTimerSec = f;
            this.mediaIsInfinite = bool;
            this.mediaZipped = bool2;
            this.mediaVenueId = str9;
            this.mediaSourceId = str10;
            this.payloadId = l5;
            this.content = bArr;
            if (gcj2 != null) {
                this.preserved = gcj2;
                this.savedStates = gcm;
                this.released = z;
                this.messageOrderingKey = str11;
                this.screenshottedOrReplayed = screenshottedOrReplayedState;
                this.snapServerStatus = snapServerStatus;
                this.lastInteractionTimestamp = l6;
                this.viewerList = yfj;
                return;
            }
            throw new NullPointerException("Null preserved");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final long _modifiedTimestamp() {
        return this._modifiedTimestamp;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final byte[] content() {
        return this.content;
    }

    public final String cryptoIV() {
        return this.cryptoIV;
    }

    public final String cryptoKey() {
        return this.cryptoKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageRecord) {
            MessageRecord messageRecord = (MessageRecord) obj;
            if (this._id == messageRecord._id() && this._modifiedTimestamp == messageRecord._modifiedTimestamp() && this.key.equals(messageRecord.key())) {
                Long l = this.feedRowId;
                if (l != null ? !l.equals(messageRecord.feedRowId()) : messageRecord.feedRowId() != null) {
                    if (this.timestamp == messageRecord.timestamp()) {
                        l = this.seenTimestamp;
                        if (l != null ? !l.equals(messageRecord.seenTimestamp()) : messageRecord.seenTimestamp() != null) {
                            l = this.senderId;
                            if (l != null ? !l.equals(messageRecord.senderId()) : messageRecord.senderId() != null) {
                                MessageClientStatus messageClientStatus = this.clientStatus;
                                if (messageClientStatus != null ? !messageClientStatus.equals(messageRecord.clientStatus()) : messageRecord.clientStatus() != null) {
                                    l = this.sequenceNumber;
                                    if (l != null ? !l.equals(messageRecord.sequenceNumber()) : messageRecord.sequenceNumber() != null) {
                                        String str = this.type;
                                        if (str != null ? !str.equals(messageRecord.type()) : messageRecord.type() != null) {
                                            str = this.cryptoKey;
                                            if (str != null ? !str.equals(messageRecord.cryptoKey()) : messageRecord.cryptoKey() != null) {
                                                str = this.cryptoIV;
                                                if (str != null ? !str.equals(messageRecord.cryptoIV()) : messageRecord.cryptoIV() != null) {
                                                    str = this.mediaId;
                                                    if (str != null ? !str.equals(messageRecord.mediaId()) : messageRecord.mediaId() != null) {
                                                        str = this.mediaType;
                                                        if (str != null ? !str.equals(messageRecord.mediaType()) : messageRecord.mediaType() != null) {
                                                            str = this.mediaUrl;
                                                            if (str != null ? !str.equals(messageRecord.mediaUrl()) : messageRecord.mediaUrl() != null) {
                                                                Integer num = this.mediaWidth;
                                                                if (num != null ? !num.equals(messageRecord.mediaWidth()) : messageRecord.mediaWidth() != null) {
                                                                    num = this.mediaHeight;
                                                                    if (num != null ? !num.equals(messageRecord.mediaHeight()) : messageRecord.mediaHeight() != null) {
                                                                        str = this.mediaOwner;
                                                                        if (str != null ? !str.equals(messageRecord.mediaOwner()) : messageRecord.mediaOwner() != null) {
                                                                            Float f = this.mediaTimerSec;
                                                                            if (f != null ? !f.equals(messageRecord.mediaTimerSec()) : messageRecord.mediaTimerSec() != null) {
                                                                                Boolean bool = this.mediaIsInfinite;
                                                                                if (bool != null ? !bool.equals(messageRecord.mediaIsInfinite()) : messageRecord.mediaIsInfinite() != null) {
                                                                                    bool = this.mediaZipped;
                                                                                    if (bool != null ? !bool.equals(messageRecord.mediaZipped()) : messageRecord.mediaZipped() != null) {
                                                                                        str = this.mediaVenueId;
                                                                                        if (str != null ? !str.equals(messageRecord.mediaVenueId()) : messageRecord.mediaVenueId() != null) {
                                                                                            str = this.mediaSourceId;
                                                                                            if (str != null ? !str.equals(messageRecord.mediaSourceId()) : messageRecord.mediaSourceId() != null) {
                                                                                                l = this.payloadId;
                                                                                                if (l != null ? !l.equals(messageRecord.payloadId()) : messageRecord.payloadId() != null) {
                                                                                                    if (Arrays.equals(this.content, messageRecord instanceof AutoValue_MessageRecord ? ((AutoValue_MessageRecord) messageRecord).content : messageRecord.content()) && this.preserved.equals(messageRecord.preserved())) {
                                                                                                        gcm gcm = this.savedStates;
                                                                                                        if (gcm != null ? !gcm.equals(messageRecord.savedStates()) : messageRecord.savedStates() != null) {
                                                                                                            if (this.released == messageRecord.released()) {
                                                                                                                str = this.messageOrderingKey;
                                                                                                                if (str != null ? !str.equals(messageRecord.messageOrderingKey()) : messageRecord.messageOrderingKey() != null) {
                                                                                                                    ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                                                                                                    if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(messageRecord.screenshottedOrReplayed()) : messageRecord.screenshottedOrReplayed() != null) {
                                                                                                                        SnapServerStatus snapServerStatus = this.snapServerStatus;
                                                                                                                        if (snapServerStatus != null ? !snapServerStatus.equals(messageRecord.snapServerStatus()) : messageRecord.snapServerStatus() != null) {
                                                                                                                            l = this.lastInteractionTimestamp;
                                                                                                                            if (l != null ? !l.equals(messageRecord.lastInteractionTimestamp()) : messageRecord.lastInteractionTimestamp() != null) {
                                                                                                                                yfj yfj = this.viewerList;
                                                                                                                                return yfj != null ? !yfj.equals(messageRecord.viewerList()) : messageRecord.viewerList() != null;
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

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this._modifiedTimestamp;
        i = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.key.hashCode()) * 1000003;
        Long l = this.feedRowId;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j3 = this.timestamp;
        i = (i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        Long l2 = this.seenTimestamp;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        l2 = this.senderId;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        l2 = this.sequenceNumber;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str = this.type;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.cryptoKey;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.cryptoIV;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaType;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaUrl;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.mediaWidth;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.mediaHeight;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        str = this.mediaOwner;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Float f = this.mediaTimerSec;
        i = (i ^ (f == null ? 0 : f.hashCode())) * 1000003;
        Boolean bool = this.mediaIsInfinite;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        bool = this.mediaZipped;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.mediaVenueId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaSourceId;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        l2 = this.payloadId;
        i = (((((i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003) ^ this.preserved.hashCode()) * 1000003;
        gcm gcm = this.savedStates;
        i = (((i ^ (gcm == null ? 0 : gcm.hashCode())) * 1000003) ^ (this.released ? 1231 : 1237)) * 1000003;
        str = this.messageOrderingKey;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        i = (i ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        i = (i ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        l2 = this.lastInteractionTimestamp;
        i = (i ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        yfj yfj = this.viewerList;
        if (yfj != null) {
            i2 = yfj.hashCode();
        }
        return i ^ i2;
    }

    public final String key() {
        return this.key;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final Integer mediaHeight() {
        return this.mediaHeight;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final Boolean mediaIsInfinite() {
        return this.mediaIsInfinite;
    }

    public final String mediaOwner() {
        return this.mediaOwner;
    }

    public final String mediaSourceId() {
        return this.mediaSourceId;
    }

    public final Float mediaTimerSec() {
        return this.mediaTimerSec;
    }

    public final String mediaType() {
        return this.mediaType;
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final String mediaVenueId() {
        return this.mediaVenueId;
    }

    public final Integer mediaWidth() {
        return this.mediaWidth;
    }

    public final Boolean mediaZipped() {
        return this.mediaZipped;
    }

    public final String messageOrderingKey() {
        return this.messageOrderingKey;
    }

    public final Long payloadId() {
        return this.payloadId;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final boolean released() {
        return this.released;
    }

    public final gcm savedStates() {
        return this.savedStates;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final Long seenTimestamp() {
        return this.seenTimestamp;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", _modifiedTimestamp=");
        stringBuilder.append(this._modifiedTimestamp);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", seenTimestamp=");
        stringBuilder.append(this.seenTimestamp);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", cryptoKey=");
        stringBuilder.append(this.cryptoKey);
        stringBuilder.append(", cryptoIV=");
        stringBuilder.append(this.cryptoIV);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", mediaType=");
        stringBuilder.append(this.mediaType);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaWidth=");
        stringBuilder.append(this.mediaWidth);
        stringBuilder.append(", mediaHeight=");
        stringBuilder.append(this.mediaHeight);
        stringBuilder.append(", mediaOwner=");
        stringBuilder.append(this.mediaOwner);
        stringBuilder.append(", mediaTimerSec=");
        stringBuilder.append(this.mediaTimerSec);
        stringBuilder.append(", mediaIsInfinite=");
        stringBuilder.append(this.mediaIsInfinite);
        stringBuilder.append(", mediaZipped=");
        stringBuilder.append(this.mediaZipped);
        stringBuilder.append(", mediaVenueId=");
        stringBuilder.append(this.mediaVenueId);
        stringBuilder.append(", mediaSourceId=");
        stringBuilder.append(this.mediaSourceId);
        stringBuilder.append(", payloadId=");
        stringBuilder.append(this.payloadId);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.savedStates);
        stringBuilder.append(", released=");
        stringBuilder.append(this.released);
        stringBuilder.append(", messageOrderingKey=");
        stringBuilder.append(this.messageOrderingKey);
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

    public final String type() {
        return this.type;
    }

    public final yfj viewerList() {
        return this.viewerList;
    }
}

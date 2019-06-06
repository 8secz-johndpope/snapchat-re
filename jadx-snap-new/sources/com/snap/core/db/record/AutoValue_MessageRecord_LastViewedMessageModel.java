package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.LastViewedMessageModel;

final class AutoValue_MessageRecord_LastViewedMessageModel extends LastViewedMessageModel {
    private final long _id;
    private final MessageClientStatus clientStatus;
    private final Long senderId;
    private final Long sequenceNumber;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_LastViewedMessageModel(long j, String str, Long l, long j2, MessageClientStatus messageClientStatus, Long l2) {
        this._id = j;
        this.type = str;
        this.senderId = l;
        this.timestamp = j2;
        this.clientStatus = messageClientStatus;
        this.sequenceNumber = l2;
    }

    public final long _id() {
        return this._id;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LastViewedMessageModel) {
            LastViewedMessageModel lastViewedMessageModel = (LastViewedMessageModel) obj;
            if (this._id == lastViewedMessageModel._id()) {
                String str = this.type;
                if (str != null ? !str.equals(lastViewedMessageModel.type()) : lastViewedMessageModel.type() != null) {
                    Long l = this.senderId;
                    if (l != null ? !l.equals(lastViewedMessageModel.senderId()) : lastViewedMessageModel.senderId() != null) {
                        if (this.timestamp == lastViewedMessageModel.timestamp()) {
                            MessageClientStatus messageClientStatus = this.clientStatus;
                            if (messageClientStatus != null ? !messageClientStatus.equals(lastViewedMessageModel.clientStatus()) : lastViewedMessageModel.clientStatus() != null) {
                                l = this.sequenceNumber;
                                return l != null ? !l.equals(lastViewedMessageModel.sequenceNumber()) : lastViewedMessageModel.sequenceNumber() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        String str = this.type;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.senderId;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        long j2 = this.timestamp;
        i = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        Long l2 = this.sequenceNumber;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return i ^ i2;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LastViewedMessageModel{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

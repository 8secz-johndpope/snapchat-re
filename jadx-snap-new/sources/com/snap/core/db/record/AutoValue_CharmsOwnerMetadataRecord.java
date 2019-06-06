package com.snap.core.db.record;

import java.util.Arrays;

final class AutoValue_CharmsOwnerMetadataRecord extends CharmsOwnerMetadataRecord {
    private final long _id;
    private final String ownerId;
    private final byte[] syncToken;
    private final long unviewedCount;

    AutoValue_CharmsOwnerMetadataRecord(long j, String str, byte[] bArr, long j2) {
        this._id = j;
        if (str != null) {
            this.ownerId = str;
            if (bArr != null) {
                this.syncToken = bArr;
                this.unviewedCount = j2;
                return;
            }
            throw new NullPointerException("Null syncToken");
        }
        throw new NullPointerException("Null ownerId");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CharmsOwnerMetadataRecord) {
            CharmsOwnerMetadataRecord charmsOwnerMetadataRecord = (CharmsOwnerMetadataRecord) obj;
            if (this._id == charmsOwnerMetadataRecord._id() && this.ownerId.equals(charmsOwnerMetadataRecord.ownerId())) {
                return Arrays.equals(this.syncToken, charmsOwnerMetadataRecord instanceof AutoValue_CharmsOwnerMetadataRecord ? ((AutoValue_CharmsOwnerMetadataRecord) charmsOwnerMetadataRecord).syncToken : charmsOwnerMetadataRecord.syncToken()) && this.unviewedCount == charmsOwnerMetadataRecord.unviewedCount();
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.ownerId.hashCode()) * 1000003) ^ Arrays.hashCode(this.syncToken)) * 1000003;
        long j2 = this.unviewedCount;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final String ownerId() {
        return this.ownerId;
    }

    public final byte[] syncToken() {
        return this.syncToken;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharmsOwnerMetadataRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", ownerId=");
        stringBuilder.append(this.ownerId);
        stringBuilder.append(", syncToken=");
        stringBuilder.append(Arrays.toString(this.syncToken));
        stringBuilder.append(", unviewedCount=");
        stringBuilder.append(this.unviewedCount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long unviewedCount() {
        return this.unviewedCount;
    }
}

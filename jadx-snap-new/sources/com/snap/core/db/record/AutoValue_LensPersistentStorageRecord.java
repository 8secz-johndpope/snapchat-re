package com.snap.core.db.record;

import java.util.Arrays;

final class AutoValue_LensPersistentStorageRecord extends LensPersistentStorageRecord {
    private final long _id;
    private final byte[] data;
    private final String lensId;

    AutoValue_LensPersistentStorageRecord(long j, String str, byte[] bArr) {
        this._id = j;
        if (str != null) {
            this.lensId = str;
            if (bArr != null) {
                this.data = bArr;
                return;
            }
            throw new NullPointerException("Null data");
        }
        throw new NullPointerException("Null lensId");
    }

    public final long _id() {
        return this._id;
    }

    public final byte[] data() {
        return this.data;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LensPersistentStorageRecord) {
            LensPersistentStorageRecord lensPersistentStorageRecord = (LensPersistentStorageRecord) obj;
            if (this._id == lensPersistentStorageRecord._id() && this.lensId.equals(lensPersistentStorageRecord.lensId())) {
                if (Arrays.equals(this.data, lensPersistentStorageRecord instanceof AutoValue_LensPersistentStorageRecord ? ((AutoValue_LensPersistentStorageRecord) lensPersistentStorageRecord).data : lensPersistentStorageRecord.data())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        return Arrays.hashCode(this.data) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.lensId.hashCode()) * 1000003);
    }

    public final String lensId() {
        return this.lensId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LensPersistentStorageRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", lensId=");
        stringBuilder.append(this.lensId);
        stringBuilder.append(", data=");
        stringBuilder.append(Arrays.toString(this.data));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.RetroEventsCategory;
import com.snap.core.db.record.RetroPersistenceEventsRecord.GetEventOfIdImpl;
import java.util.Arrays;

final class AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl extends GetEventOfIdImpl {
    private final long _id;
    private final String batchTrackUrl;
    private final RetroEventsCategory category;
    private final long expirationTimestampMillis;
    private final long numberOfAttempts;
    private final byte[] payload;
    private final String singleTrackUrl;

    AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl(long j, RetroEventsCategory retroEventsCategory, String str, String str2, byte[] bArr, long j2, long j3) {
        this._id = j;
        if (retroEventsCategory != null) {
            this.category = retroEventsCategory;
            this.batchTrackUrl = str;
            if (str2 != null) {
                this.singleTrackUrl = str2;
                if (bArr != null) {
                    this.payload = bArr;
                    this.numberOfAttempts = j2;
                    this.expirationTimestampMillis = j3;
                    return;
                }
                throw new NullPointerException("Null payload");
            }
            throw new NullPointerException("Null singleTrackUrl");
        }
        throw new NullPointerException("Null category");
    }

    public final long _id() {
        return this._id;
    }

    public final String batchTrackUrl() {
        return this.batchTrackUrl;
    }

    public final RetroEventsCategory category() {
        return this.category;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetEventOfIdImpl) {
            GetEventOfIdImpl getEventOfIdImpl = (GetEventOfIdImpl) obj;
            if (this._id == getEventOfIdImpl._id() && this.category.equals(getEventOfIdImpl.category())) {
                String str = this.batchTrackUrl;
                if (str != null ? !str.equals(getEventOfIdImpl.batchTrackUrl()) : getEventOfIdImpl.batchTrackUrl() != null) {
                    if (this.singleTrackUrl.equals(getEventOfIdImpl.singleTrackUrl())) {
                        return Arrays.equals(this.payload, getEventOfIdImpl instanceof AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl ? ((AutoValue_RetroPersistenceEventsRecord_GetEventOfIdImpl) getEventOfIdImpl).payload : getEventOfIdImpl.payload()) && this.numberOfAttempts == getEventOfIdImpl.numberOfAttempts() && this.expirationTimestampMillis == getEventOfIdImpl.expirationTimestampMillis();
                    }
                }
            }
        }
    }

    public final long expirationTimestampMillis() {
        return this.expirationTimestampMillis;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.category.hashCode()) * 1000003;
        String str = this.batchTrackUrl;
        hashCode = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.singleTrackUrl.hashCode()) * 1000003) ^ Arrays.hashCode(this.payload)) * 1000003;
        long j2 = this.numberOfAttempts;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.expirationTimestampMillis;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final long numberOfAttempts() {
        return this.numberOfAttempts;
    }

    public final byte[] payload() {
        return this.payload;
    }

    public final String singleTrackUrl() {
        return this.singleTrackUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetEventOfIdImpl{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", category=");
        stringBuilder.append(this.category);
        stringBuilder.append(", batchTrackUrl=");
        stringBuilder.append(this.batchTrackUrl);
        stringBuilder.append(", singleTrackUrl=");
        stringBuilder.append(this.singleTrackUrl);
        stringBuilder.append(", payload=");
        stringBuilder.append(Arrays.toString(this.payload));
        stringBuilder.append(", numberOfAttempts=");
        stringBuilder.append(this.numberOfAttempts);
        stringBuilder.append(", expirationTimestampMillis=");
        stringBuilder.append(this.expirationTimestampMillis);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

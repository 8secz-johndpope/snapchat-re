package com.snap.core.db.record;

import java.util.Arrays;

final class AutoValue_SnapTokenRecord extends SnapTokenRecord {
    private final long _id;
    private final String accessTokens;
    private final byte[] accessTokensPb;
    private final String refreshToken;
    private final String userId;

    AutoValue_SnapTokenRecord(long j, String str, String str2, String str3, byte[] bArr) {
        this._id = j;
        if (str != null) {
            this.userId = str;
            if (str2 != null) {
                this.accessTokens = str2;
                if (str3 != null) {
                    this.refreshToken = str3;
                    this.accessTokensPb = bArr;
                    return;
                }
                throw new NullPointerException("Null refreshToken");
            }
            throw new NullPointerException("Null accessTokens");
        }
        throw new NullPointerException("Null userId");
    }

    public final long _id() {
        return this._id;
    }

    public final String accessTokens() {
        return this.accessTokens;
    }

    public final byte[] accessTokensPb() {
        return this.accessTokensPb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapTokenRecord) {
            SnapTokenRecord snapTokenRecord = (SnapTokenRecord) obj;
            if (this._id == snapTokenRecord._id() && this.userId.equals(snapTokenRecord.userId()) && this.accessTokens.equals(snapTokenRecord.accessTokens()) && this.refreshToken.equals(snapTokenRecord.refreshToken())) {
                if (Arrays.equals(this.accessTokensPb, snapTokenRecord instanceof AutoValue_SnapTokenRecord ? ((AutoValue_SnapTokenRecord) snapTokenRecord).accessTokensPb : snapTokenRecord.accessTokensPb())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this._id;
        return Arrays.hashCode(this.accessTokensPb) ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.accessTokens.hashCode()) * 1000003) ^ this.refreshToken.hashCode()) * 1000003);
    }

    public final String refreshToken() {
        return this.refreshToken;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapTokenRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", accessTokens=");
        stringBuilder.append(this.accessTokens);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.refreshToken);
        stringBuilder.append(", accessTokensPb=");
        stringBuilder.append(Arrays.toString(this.accessTokensPb));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }
}

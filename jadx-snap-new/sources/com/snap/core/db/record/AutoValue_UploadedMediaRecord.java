package com.snap.core.db.record;

import defpackage.acgp;

final class AutoValue_UploadedMediaRecord extends UploadedMediaRecord {
    private final long _id;
    private final String content_id;
    private final String encryption_iv;
    private final String encryption_key;
    private final long expiration_timestamp_sec;
    private final String session_id;
    private final acgp upload_location;
    private final long upload_size;

    AutoValue_UploadedMediaRecord(long j, String str, String str2, String str3, String str4, long j2, acgp acgp, long j3) {
        this._id = j;
        if (str != null) {
            this.session_id = str;
            if (str2 != null) {
                this.content_id = str2;
                if (str3 != null) {
                    this.encryption_key = str3;
                    if (str4 != null) {
                        this.encryption_iv = str4;
                        this.upload_size = j2;
                        if (acgp != null) {
                            this.upload_location = acgp;
                            this.expiration_timestamp_sec = j3;
                            return;
                        }
                        throw new NullPointerException("Null upload_location");
                    }
                    throw new NullPointerException("Null encryption_iv");
                }
                throw new NullPointerException("Null encryption_key");
            }
            throw new NullPointerException("Null content_id");
        }
        throw new NullPointerException("Null session_id");
    }

    public final long _id() {
        return this._id;
    }

    public final String content_id() {
        return this.content_id;
    }

    public final String encryption_iv() {
        return this.encryption_iv;
    }

    public final String encryption_key() {
        return this.encryption_key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UploadedMediaRecord) {
            UploadedMediaRecord uploadedMediaRecord = (UploadedMediaRecord) obj;
            return this._id == uploadedMediaRecord._id() && this.session_id.equals(uploadedMediaRecord.session_id()) && this.content_id.equals(uploadedMediaRecord.content_id()) && this.encryption_key.equals(uploadedMediaRecord.encryption_key()) && this.encryption_iv.equals(uploadedMediaRecord.encryption_iv()) && this.upload_size == uploadedMediaRecord.upload_size() && this.upload_location.equals(uploadedMediaRecord.upload_location()) && this.expiration_timestamp_sec == uploadedMediaRecord.expiration_timestamp_sec();
        }
    }

    public final long expiration_timestamp_sec() {
        return this.expiration_timestamp_sec;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.session_id.hashCode()) * 1000003) ^ this.content_id.hashCode()) * 1000003) ^ this.encryption_key.hashCode()) * 1000003) ^ this.encryption_iv.hashCode()) * 1000003;
        long j2 = this.upload_size;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.upload_location.hashCode()) * 1000003;
        j2 = this.expiration_timestamp_sec;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final String session_id() {
        return this.session_id;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UploadedMediaRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", session_id=");
        stringBuilder.append(this.session_id);
        stringBuilder.append(", content_id=");
        stringBuilder.append(this.content_id);
        stringBuilder.append(", encryption_key=");
        stringBuilder.append(this.encryption_key);
        stringBuilder.append(", encryption_iv=");
        stringBuilder.append(this.encryption_iv);
        stringBuilder.append(", upload_size=");
        stringBuilder.append(this.upload_size);
        stringBuilder.append(", upload_location=");
        stringBuilder.append(this.upload_location);
        stringBuilder.append(", expiration_timestamp_sec=");
        stringBuilder.append(this.expiration_timestamp_sec);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final acgp upload_location() {
        return this.upload_location;
    }

    public final long upload_size() {
        return this.upload_size;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.record.MessageRecord.GetContentForMessageModel;
import java.util.Arrays;

final class AutoValue_MessageRecord_GetContentForMessageModel extends GetContentForMessageModel {
    private final String Feed_key;
    private final long _id;
    private final byte[] content;
    private final String key;
    private final String senderUsername;
    private final long timestamp;
    private final String type;

    AutoValue_MessageRecord_GetContentForMessageModel(long j, String str, String str2, String str3, byte[] bArr, long j2, String str4) {
        this._id = j;
        if (str != null) {
            this.key = str;
            if (str2 != null) {
                this.senderUsername = str2;
                this.type = str3;
                this.content = bArr;
                this.timestamp = j2;
                if (str4 != null) {
                    this.Feed_key = str4;
                    return;
                }
                throw new NullPointerException("Null Feed_key");
            }
            throw new NullPointerException("Null senderUsername");
        }
        throw new NullPointerException("Null key");
    }

    public final String Feed_key() {
        return this.Feed_key;
    }

    public final long _id() {
        return this._id;
    }

    public final byte[] content() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetContentForMessageModel) {
            GetContentForMessageModel getContentForMessageModel = (GetContentForMessageModel) obj;
            if (this._id == getContentForMessageModel._id() && this.key.equals(getContentForMessageModel.key()) && this.senderUsername.equals(getContentForMessageModel.senderUsername())) {
                String str = this.type;
                if (str != null ? !str.equals(getContentForMessageModel.type()) : getContentForMessageModel.type() != null) {
                    return Arrays.equals(this.content, getContentForMessageModel instanceof AutoValue_MessageRecord_GetContentForMessageModel ? ((AutoValue_MessageRecord_GetContentForMessageModel) getContentForMessageModel).content : getContentForMessageModel.content()) && this.timestamp == getContentForMessageModel.timestamp() && this.Feed_key.equals(getContentForMessageModel.Feed_key());
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.senderUsername.hashCode()) * 1000003;
        String str = this.type;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003;
        long j2 = this.timestamp;
        return this.Feed_key.hashCode() ^ ((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String key() {
        return this.key;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetContentForMessageModel{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", Feed_key=");
        stringBuilder.append(this.Feed_key);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}

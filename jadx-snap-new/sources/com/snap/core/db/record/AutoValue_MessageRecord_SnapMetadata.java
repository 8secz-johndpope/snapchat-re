package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.MessageRecord.SnapMetadata;
import java.util.Arrays;

final class AutoValue_MessageRecord_SnapMetadata extends SnapMetadata {
    private final long _id;
    private final byte[] content;
    private final String conversationId;
    private final FeedKind feedKind;
    private final String senderUsername;

    AutoValue_MessageRecord_SnapMetadata(long j, byte[] bArr, FeedKind feedKind, String str, String str2) {
        this._id = j;
        this.content = bArr;
        if (feedKind != null) {
            this.feedKind = feedKind;
            if (str != null) {
                this.conversationId = str;
                if (str2 != null) {
                    this.senderUsername = str2;
                    return;
                }
                throw new NullPointerException("Null senderUsername");
            }
            throw new NullPointerException("Null conversationId");
        }
        throw new NullPointerException("Null feedKind");
    }

    public final long _id() {
        return this._id;
    }

    public final byte[] content() {
        return this.content;
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapMetadata) {
            SnapMetadata snapMetadata = (SnapMetadata) obj;
            if (this._id == snapMetadata._id()) {
                return Arrays.equals(this.content, snapMetadata instanceof AutoValue_MessageRecord_SnapMetadata ? ((AutoValue_MessageRecord_SnapMetadata) snapMetadata).content : snapMetadata.content()) && this.feedKind.equals(snapMetadata.feedKind()) && this.conversationId.equals(snapMetadata.conversationId()) && this.senderUsername.equals(snapMetadata.senderUsername());
            }
        }
    }

    public final FeedKind feedKind() {
        return this.feedKind;
    }

    public final int hashCode() {
        long j = this._id;
        return this.senderUsername.hashCode() ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003) ^ this.feedKind.hashCode()) * 1000003) ^ this.conversationId.hashCode()) * 1000003);
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapMetadata{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", feedKind=");
        stringBuilder.append(this.feedKind);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

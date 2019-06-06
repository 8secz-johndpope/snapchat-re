package com.snap.core.db.record;

import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.record.MessagingSnapRecord.ReplyMediaInfo;

final class AutoValue_MessagingSnapRecord_ReplyMediaInfo extends ReplyMediaInfo {
    private final String key;
    private final ReplyMedia replyMedia;
    private final String snapId;

    AutoValue_MessagingSnapRecord_ReplyMediaInfo(String str, ReplyMedia replyMedia, String str2) {
        if (str != null) {
            this.snapId = str;
            this.replyMedia = replyMedia;
            if (str2 != null) {
                this.key = str2;
                return;
            }
            throw new NullPointerException("Null key");
        }
        throw new NullPointerException("Null snapId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReplyMediaInfo) {
            ReplyMediaInfo replyMediaInfo = (ReplyMediaInfo) obj;
            if (this.snapId.equals(replyMediaInfo.snapId())) {
                ReplyMedia replyMedia = this.replyMedia;
                if (replyMedia != null ? !replyMedia.equals(replyMediaInfo.replyMedia()) : replyMediaInfo.replyMedia() != null) {
                    if (this.key.equals(replyMediaInfo.key())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.snapId.hashCode() ^ 1000003) * 1000003;
        ReplyMedia replyMedia = this.replyMedia;
        return ((hashCode ^ (replyMedia == null ? 0 : replyMedia.hashCode())) * 1000003) ^ this.key.hashCode();
    }

    public final String key() {
        return this.key;
    }

    public final ReplyMedia replyMedia() {
        return this.replyMedia;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ReplyMediaInfo{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", replyMedia=");
        stringBuilder.append(this.replyMedia);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

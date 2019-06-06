package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.MessageRecord.GetSnapOperaInfo;
import java.util.Arrays;

final class AutoValue_MessageRecord_GetSnapOperaInfo extends GetSnapOperaInfo {
    private final byte[] content;
    private final String displayName;
    private final String feedKey;
    private final Long feedRowId;
    private final FeedKind kind;
    private final Long score;
    private final long timestamp;
    private final String username;

    AutoValue_MessageRecord_GetSnapOperaInfo(Long l, String str, String str2, Long l2, long j, byte[] bArr, FeedKind feedKind, String str3) {
        this.feedRowId = l;
        this.displayName = str;
        this.username = str2;
        this.score = l2;
        this.timestamp = j;
        this.content = bArr;
        this.kind = feedKind;
        this.feedKey = str3;
    }

    public final byte[] content() {
        return this.content;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GetSnapOperaInfo) {
            GetSnapOperaInfo getSnapOperaInfo = (GetSnapOperaInfo) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(getSnapOperaInfo.feedRowId()) : getSnapOperaInfo.feedRowId() != null) {
                String str = this.displayName;
                if (str != null ? !str.equals(getSnapOperaInfo.displayName()) : getSnapOperaInfo.displayName() != null) {
                    str = this.username;
                    if (str != null ? !str.equals(getSnapOperaInfo.username()) : getSnapOperaInfo.username() != null) {
                        l = this.score;
                        if (l != null ? !l.equals(getSnapOperaInfo.score()) : getSnapOperaInfo.score() != null) {
                            if (this.timestamp == getSnapOperaInfo.timestamp()) {
                                if (Arrays.equals(this.content, getSnapOperaInfo instanceof AutoValue_MessageRecord_GetSnapOperaInfo ? ((AutoValue_MessageRecord_GetSnapOperaInfo) getSnapOperaInfo).content : getSnapOperaInfo.content())) {
                                    FeedKind feedKind = this.kind;
                                    if (feedKind != null ? !feedKind.equals(getSnapOperaInfo.kind()) : getSnapOperaInfo.kind() != null) {
                                        str = this.feedKey;
                                        return str != null ? !str.equals(getSnapOperaInfo.feedKey()) : getSnapOperaInfo.feedKey() != null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final String feedKey() {
        return this.feedKey;
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        Long l = this.feedRowId;
        int i = 0;
        int hashCode = ((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003;
        String str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.username;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l2 = this.score;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        long j = this.timestamp;
        hashCode = (((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ Arrays.hashCode(this.content)) * 1000003;
        FeedKind feedKind = this.kind;
        hashCode = (hashCode ^ (feedKind == null ? 0 : feedKind.hashCode())) * 1000003;
        String str2 = this.feedKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final Long score() {
        return this.score;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetSnapOperaInfo{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", content=");
        stringBuilder.append(Arrays.toString(this.content));
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", feedKey=");
        stringBuilder.append(this.feedKey);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.MessagingSnapRecord.SnapOperaChromeInfo;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_SnapOperaChromeInfo extends SnapOperaChromeInfo {
    private final String displayName;
    private final long durationInMs;
    private final String feedKey;
    private final Long feedRowId;
    private final boolean isInfiniteDuration;
    private final FeedKind kind;
    private final Long score;
    private final Long secondaryTimestamp;
    private final gcp snapType;
    private final long timestamp;
    private final String username;

    AutoValue_MessagingSnapRecord_SnapOperaChromeInfo(Long l, String str, String str2, Long l2, Long l3, long j, gcp gcp, boolean z, long j2, FeedKind feedKind, String str3) {
        this.feedRowId = l;
        this.displayName = str;
        this.username = str2;
        this.score = l2;
        this.secondaryTimestamp = l3;
        this.timestamp = j;
        if (gcp != null) {
            this.snapType = gcp;
            this.isInfiniteDuration = z;
            this.durationInMs = j2;
            this.kind = feedKind;
            this.feedKey = str3;
            return;
        }
        throw new NullPointerException("Null snapType");
    }

    public final String displayName() {
        return this.displayName;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapOperaChromeInfo) {
            SnapOperaChromeInfo snapOperaChromeInfo = (SnapOperaChromeInfo) obj;
            Long l = this.feedRowId;
            if (l != null ? !l.equals(snapOperaChromeInfo.feedRowId()) : snapOperaChromeInfo.feedRowId() != null) {
                String str = this.displayName;
                if (str != null ? !str.equals(snapOperaChromeInfo.displayName()) : snapOperaChromeInfo.displayName() != null) {
                    str = this.username;
                    if (str != null ? !str.equals(snapOperaChromeInfo.username()) : snapOperaChromeInfo.username() != null) {
                        l = this.score;
                        if (l != null ? !l.equals(snapOperaChromeInfo.score()) : snapOperaChromeInfo.score() != null) {
                            l = this.secondaryTimestamp;
                            if (l != null ? !l.equals(snapOperaChromeInfo.secondaryTimestamp()) : snapOperaChromeInfo.secondaryTimestamp() != null) {
                                if (this.timestamp == snapOperaChromeInfo.timestamp() && this.snapType.equals(snapOperaChromeInfo.snapType()) && this.isInfiniteDuration == snapOperaChromeInfo.isInfiniteDuration() && this.durationInMs == snapOperaChromeInfo.durationInMs()) {
                                    FeedKind feedKind = this.kind;
                                    if (feedKind != null ? !feedKind.equals(snapOperaChromeInfo.kind()) : snapOperaChromeInfo.kind() != null) {
                                        str = this.feedKey;
                                        return str != null ? !str.equals(snapOperaChromeInfo.feedKey()) : snapOperaChromeInfo.feedKey() != null;
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
        l2 = this.secondaryTimestamp;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        long j = this.timestamp;
        hashCode = (((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.snapType.hashCode()) * 1000003) ^ (this.isInfiniteDuration ? 1231 : 1237)) * 1000003;
        j = this.durationInMs;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        FeedKind feedKind = this.kind;
        hashCode = (hashCode ^ (feedKind == null ? 0 : feedKind.hashCode())) * 1000003;
        String str2 = this.feedKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isInfiniteDuration() {
        return this.isInfiniteDuration;
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final Long score() {
        return this.score;
    }

    public final Long secondaryTimestamp() {
        return this.secondaryTimestamp;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapOperaChromeInfo{feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", secondaryTimestamp=");
        stringBuilder.append(this.secondaryTimestamp);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
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

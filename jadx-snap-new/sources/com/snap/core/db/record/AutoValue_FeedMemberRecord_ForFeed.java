package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberRecord.ForFeed;

final class AutoValue_FeedMemberRecord_ForFeed extends ForFeed {
    private final String displayName;
    private final long friendRowId;
    private final Long joinedTimestamp;
    private final String username;

    AutoValue_FeedMemberRecord_ForFeed(long j, Long l, String str, String str2) {
        this.friendRowId = j;
        this.joinedTimestamp = l;
        this.displayName = str;
        if (str2 != null) {
            this.username = str2;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ForFeed) {
            ForFeed forFeed = (ForFeed) obj;
            if (this.friendRowId == forFeed.friendRowId()) {
                Long l = this.joinedTimestamp;
                if (l != null ? !l.equals(forFeed.joinedTimestamp()) : forFeed.joinedTimestamp() != null) {
                    String str = this.displayName;
                    if (str != null ? !str.equals(forFeed.displayName()) : forFeed.displayName() != null) {
                        if (this.username.equals(forFeed.username())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long friendRowId() {
        return this.friendRowId;
    }

    public final int hashCode() {
        long j = this.friendRowId;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Long l = this.joinedTimestamp;
        int i2 = 0;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.displayName;
        if (str != null) {
            i2 = str.hashCode();
        }
        return this.username.hashCode() ^ ((i ^ i2) * 1000003);
    }

    public final Long joinedTimestamp() {
        return this.joinedTimestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForFeed{friendRowId=");
        stringBuilder.append(this.friendRowId);
        stringBuilder.append(", joinedTimestamp=");
        stringBuilder.append(this.joinedTimestamp);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}

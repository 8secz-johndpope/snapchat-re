package com.snap.core.db.record;

import com.snap.core.db.record.FriendRecord.UsernameAndAddedTimestamp;

final class AutoValue_FriendRecord_UsernameAndAddedTimestamp extends UsernameAndAddedTimestamp {
    private final Long addedTimestamp;
    private final String username;

    AutoValue_FriendRecord_UsernameAndAddedTimestamp(String str, Long l) {
        if (str != null) {
            this.username = str;
            this.addedTimestamp = l;
            return;
        }
        throw new NullPointerException("Null username");
    }

    public final Long addedTimestamp() {
        return this.addedTimestamp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UsernameAndAddedTimestamp) {
            UsernameAndAddedTimestamp usernameAndAddedTimestamp = (UsernameAndAddedTimestamp) obj;
            if (this.username.equals(usernameAndAddedTimestamp.username())) {
                Long l = this.addedTimestamp;
                return l != null ? !l.equals(usernameAndAddedTimestamp.addedTimestamp()) : usernameAndAddedTimestamp.addedTimestamp() != null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.username.hashCode() ^ 1000003) * 1000003;
        Long l = this.addedTimestamp;
        return hashCode ^ (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UsernameAndAddedTimestamp{username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", addedTimestamp=");
        stringBuilder.append(this.addedTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String username() {
        return this.username;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberRecord.AllParticipants;

final class AutoValue_FeedMemberRecord_AllParticipants extends AllParticipants {
    private final String displayName;
    private final long friendRowId;
    private final String username;

    AutoValue_FeedMemberRecord_AllParticipants(long j, String str, String str2) {
        this.friendRowId = j;
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
        if (obj instanceof AllParticipants) {
            AllParticipants allParticipants = (AllParticipants) obj;
            if (this.friendRowId == allParticipants.friendRowId()) {
                String str = this.displayName;
                if (str != null ? !str.equals(allParticipants.displayName()) : allParticipants.displayName() != null) {
                    if (this.username.equals(allParticipants.username())) {
                        return true;
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
        String str = this.displayName;
        return this.username.hashCode() ^ ((i ^ (str == null ? 0 : str.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AllParticipants{friendRowId=");
        stringBuilder.append(this.friendRowId);
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

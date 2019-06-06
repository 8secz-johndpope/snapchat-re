package com.snap.core.db.record;

final class AutoValue_FriendsFeedScoreRecord extends FriendsFeedScoreRecord {
    private final long _id;
    private final long feedRowId;
    private final Float prevInteractionAgeSecs;
    private final Float score;

    AutoValue_FriendsFeedScoreRecord(long j, long j2, Float f, Float f2) {
        this._id = j;
        this.feedRowId = j2;
        this.score = f;
        this.prevInteractionAgeSecs = f2;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendsFeedScoreRecord) {
            FriendsFeedScoreRecord friendsFeedScoreRecord = (FriendsFeedScoreRecord) obj;
            if (this._id == friendsFeedScoreRecord._id() && this.feedRowId == friendsFeedScoreRecord.feedRowId()) {
                Float f = this.score;
                if (f != null ? !f.equals(friendsFeedScoreRecord.score()) : friendsFeedScoreRecord.score() != null) {
                    f = this.prevInteractionAgeSecs;
                    return f != null ? !f.equals(friendsFeedScoreRecord.prevInteractionAgeSecs()) : friendsFeedScoreRecord.prevInteractionAgeSecs() != null;
                }
            }
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.feedRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Float f = this.score;
        int i2 = 0;
        i = (i ^ (f == null ? 0 : f.hashCode())) * 1000003;
        Float f2 = this.prevInteractionAgeSecs;
        if (f2 != null) {
            i2 = f2.hashCode();
        }
        return i ^ i2;
    }

    public final Float prevInteractionAgeSecs() {
        return this.prevInteractionAgeSecs;
    }

    public final Float score() {
        return this.score;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsFeedScoreRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", score=");
        stringBuilder.append(this.score);
        stringBuilder.append(", prevInteractionAgeSecs=");
        stringBuilder.append(this.prevInteractionAgeSecs);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

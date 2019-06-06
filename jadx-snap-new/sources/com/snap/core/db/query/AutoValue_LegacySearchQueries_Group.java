package com.snap.core.db.query;

import com.snap.core.db.query.LegacySearchQueries.Group;

final class AutoValue_LegacySearchQueries_Group extends Group {
    private final long _id;
    private final String displayName;
    private final Long groupLastInteractionTimestamp;
    private final String key;
    private final Long lastInteractionTimestamp;
    private final String participantBitmojiAvatarId;
    private final String participantBitmojiSelfieId;
    private final String participantDisplayName;
    private final String participantString;
    private final String participantUserId;
    private final String participantUsername;
    private final String specifiedName;
    private final Long storyLatestExpirationTimestamp;
    private final Long storyLatestTimestamp;
    private final Boolean storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;

    AutoValue_LegacySearchQueries_Group(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Long l2, Long l3, Long l4, Long l5, Boolean bool, Boolean bool2) {
        String str10 = str;
        String str11 = str7;
        this._id = j;
        if (str10 != null) {
            this.key = str10;
            this.displayName = str2;
            this.specifiedName = str3;
            this.participantString = str4;
            this.participantUserId = str5;
            this.participantDisplayName = str6;
            if (str11 != null) {
                this.participantUsername = str11;
                this.participantBitmojiAvatarId = str8;
                this.participantBitmojiSelfieId = str9;
                this.lastInteractionTimestamp = l;
                this.groupLastInteractionTimestamp = l2;
                this.storyRowId = l3;
                this.storyLatestExpirationTimestamp = l4;
                this.storyLatestTimestamp = l5;
                this.storyViewed = bool;
                this.storyMuted = bool2;
                return;
            }
            throw new NullPointerException("Null participantUsername");
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Group) {
            Group group = (Group) obj;
            if (this._id == group._id() && this.key.equals(group.key())) {
                String str = this.displayName;
                if (str != null ? !str.equals(group.displayName()) : group.displayName() != null) {
                    str = this.specifiedName;
                    if (str != null ? !str.equals(group.specifiedName()) : group.specifiedName() != null) {
                        str = this.participantString;
                        if (str != null ? !str.equals(group.participantString()) : group.participantString() != null) {
                            str = this.participantUserId;
                            if (str != null ? !str.equals(group.participantUserId()) : group.participantUserId() != null) {
                                str = this.participantDisplayName;
                                if (str != null ? !str.equals(group.participantDisplayName()) : group.participantDisplayName() != null) {
                                    if (this.participantUsername.equals(group.participantUsername())) {
                                        str = this.participantBitmojiAvatarId;
                                        if (str != null ? !str.equals(group.participantBitmojiAvatarId()) : group.participantBitmojiAvatarId() != null) {
                                            str = this.participantBitmojiSelfieId;
                                            if (str != null ? !str.equals(group.participantBitmojiSelfieId()) : group.participantBitmojiSelfieId() != null) {
                                                Long l = this.lastInteractionTimestamp;
                                                if (l != null ? !l.equals(group.lastInteractionTimestamp()) : group.lastInteractionTimestamp() != null) {
                                                    l = this.groupLastInteractionTimestamp;
                                                    if (l != null ? !l.equals(group.groupLastInteractionTimestamp()) : group.groupLastInteractionTimestamp() != null) {
                                                        l = this.storyRowId;
                                                        if (l != null ? !l.equals(group.storyRowId()) : group.storyRowId() != null) {
                                                            l = this.storyLatestExpirationTimestamp;
                                                            if (l != null ? !l.equals(group.storyLatestExpirationTimestamp()) : group.storyLatestExpirationTimestamp() != null) {
                                                                l = this.storyLatestTimestamp;
                                                                if (l != null ? !l.equals(group.storyLatestTimestamp()) : group.storyLatestTimestamp() != null) {
                                                                    Boolean bool = this.storyViewed;
                                                                    if (bool != null ? !bool.equals(group.storyViewed()) : group.storyViewed() != null) {
                                                                        bool = this.storyMuted;
                                                                        return bool != null ? !bool.equals(group.storyMuted()) : group.storyMuted() != null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long groupLastInteractionTimestamp() {
        return this.groupLastInteractionTimestamp;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003;
        String str = this.displayName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.specifiedName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.participantString;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.participantUserId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.participantDisplayName;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.participantUsername.hashCode()) * 1000003;
        str = this.participantBitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.participantBitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.groupLastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestExpirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.storyLatestTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.storyMuted;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final Long lastInteractionTimestamp() {
        return this.lastInteractionTimestamp;
    }

    public final String participantBitmojiAvatarId() {
        return this.participantBitmojiAvatarId;
    }

    public final String participantBitmojiSelfieId() {
        return this.participantBitmojiSelfieId;
    }

    public final String participantDisplayName() {
        return this.participantDisplayName;
    }

    public final String participantString() {
        return this.participantString;
    }

    public final String participantUserId() {
        return this.participantUserId;
    }

    public final String participantUsername() {
        return this.participantUsername;
    }

    public final String specifiedName() {
        return this.specifiedName;
    }

    public final Long storyLatestExpirationTimestamp() {
        return this.storyLatestExpirationTimestamp;
    }

    public final Long storyLatestTimestamp() {
        return this.storyLatestTimestamp;
    }

    public final Boolean storyMuted() {
        return this.storyMuted;
    }

    public final Long storyRowId() {
        return this.storyRowId;
    }

    public final Boolean storyViewed() {
        return this.storyViewed;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Group{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", specifiedName=");
        stringBuilder.append(this.specifiedName);
        stringBuilder.append(", participantString=");
        stringBuilder.append(this.participantString);
        stringBuilder.append(", participantUserId=");
        stringBuilder.append(this.participantUserId);
        stringBuilder.append(", participantDisplayName=");
        stringBuilder.append(this.participantDisplayName);
        stringBuilder.append(", participantUsername=");
        stringBuilder.append(this.participantUsername);
        stringBuilder.append(", participantBitmojiAvatarId=");
        stringBuilder.append(this.participantBitmojiAvatarId);
        stringBuilder.append(", participantBitmojiSelfieId=");
        stringBuilder.append(this.participantBitmojiSelfieId);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", groupLastInteractionTimestamp=");
        stringBuilder.append(this.groupLastInteractionTimestamp);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyLatestExpirationTimestamp=");
        stringBuilder.append(this.storyLatestExpirationTimestamp);
        stringBuilder.append(", storyLatestTimestamp=");
        stringBuilder.append(this.storyLatestTimestamp);
        stringBuilder.append(", storyViewed=");
        stringBuilder.append(this.storyViewed);
        stringBuilder.append(", storyMuted=");
        stringBuilder.append(this.storyMuted);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

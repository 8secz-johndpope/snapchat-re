package com.snap.core.db.query;

import com.snap.core.db.query.LegacySendToQueries.Group;

final class AutoValue_LegacySendToQueries_Group extends Group {
    private final long _id;
    private final String displayName;
    private final Long groupCreationTimestamp;
    private final Long groupLastInteractionTimestamp;
    private final String key;
    private final Long lastInteractionTimestamp;
    private final String participantBitmojiAvatarId;
    private final String participantBitmojiSelfieId;
    private final String participantDisplayName;
    private final String participantString;
    private final String participantUsername;
    private final String specifiedName;

    AutoValue_LegacySendToQueries_Group(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.displayName = str2;
            this.specifiedName = str3;
            this.participantString = str4;
            this.participantDisplayName = str5;
            if (str6 != null) {
                this.participantUsername = str6;
                this.participantBitmojiAvatarId = str7;
                this.participantBitmojiSelfieId = str8;
                this.groupCreationTimestamp = l;
                this.lastInteractionTimestamp = l2;
                this.groupLastInteractionTimestamp = l3;
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
                            str = this.participantDisplayName;
                            if (str != null ? !str.equals(group.participantDisplayName()) : group.participantDisplayName() != null) {
                                if (this.participantUsername.equals(group.participantUsername())) {
                                    str = this.participantBitmojiAvatarId;
                                    if (str != null ? !str.equals(group.participantBitmojiAvatarId()) : group.participantBitmojiAvatarId() != null) {
                                        str = this.participantBitmojiSelfieId;
                                        if (str != null ? !str.equals(group.participantBitmojiSelfieId()) : group.participantBitmojiSelfieId() != null) {
                                            Long l = this.groupCreationTimestamp;
                                            if (l != null ? !l.equals(group.groupCreationTimestamp()) : group.groupCreationTimestamp() != null) {
                                                l = this.lastInteractionTimestamp;
                                                if (l != null ? !l.equals(group.lastInteractionTimestamp()) : group.lastInteractionTimestamp() != null) {
                                                    l = this.groupLastInteractionTimestamp;
                                                    return l != null ? !l.equals(group.groupLastInteractionTimestamp()) : group.groupLastInteractionTimestamp() != null;
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

    public final Long groupCreationTimestamp() {
        return this.groupCreationTimestamp;
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
        str = this.participantDisplayName;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.participantUsername.hashCode()) * 1000003;
        str = this.participantBitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.participantBitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.groupCreationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.lastInteractionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.groupLastInteractionTimestamp;
        if (l2 != null) {
            i = l2.hashCode();
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

    public final String participantUsername() {
        return this.participantUsername;
    }

    public final String specifiedName() {
        return this.specifiedName;
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
        stringBuilder.append(", participantDisplayName=");
        stringBuilder.append(this.participantDisplayName);
        stringBuilder.append(", participantUsername=");
        stringBuilder.append(this.participantUsername);
        stringBuilder.append(", participantBitmojiAvatarId=");
        stringBuilder.append(this.participantBitmojiAvatarId);
        stringBuilder.append(", participantBitmojiSelfieId=");
        stringBuilder.append(this.participantBitmojiSelfieId);
        stringBuilder.append(", groupCreationTimestamp=");
        stringBuilder.append(this.groupCreationTimestamp);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.lastInteractionTimestamp);
        stringBuilder.append(", groupLastInteractionTimestamp=");
        stringBuilder.append(this.groupLastInteractionTimestamp);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

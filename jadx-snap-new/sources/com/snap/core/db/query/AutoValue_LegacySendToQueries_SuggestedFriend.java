package com.snap.core.db.query;

import com.snap.core.db.query.LegacySendToQueries.SuggestedFriend;

final class AutoValue_LegacySendToQueries_SuggestedFriend extends SuggestedFriend {
    private final long _id;
    private final String bitmojiAvatarId;
    private final String bitmojiSelfieId;
    private final String displayName;
    private final Boolean isAdded;
    private final boolean isOfficial;
    private final String suggestionReason;
    private final String suggestionToken;
    private final String userId;
    private final String username;

    static final class Builder extends com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder {
        private Long _id;
        private String bitmojiAvatarId;
        private String bitmojiSelfieId;
        private String displayName;
        private Boolean isAdded;
        private Boolean isOfficial;
        private String suggestionReason;
        private String suggestionToken;
        private String userId;
        private String username;

        Builder() {
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder _id(long j) {
            this._id = Long.valueOf(j);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder bitmojiAvatarId(String str) {
            this.bitmojiAvatarId = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder bitmojiSelfieId(String str) {
            this.bitmojiSelfieId = str;
            return this;
        }

        public final SuggestedFriend build() {
            StringBuilder stringBuilder;
            String str = "";
            if (this._id == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" _id");
                str = stringBuilder.toString();
            }
            if (this.username == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" username");
                str = stringBuilder.toString();
            }
            if (this.isOfficial == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isOfficial");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_LegacySendToQueries_SuggestedFriend(this._id.longValue(), this.username, this.userId, this.displayName, this.bitmojiSelfieId, this.bitmojiAvatarId, this.isOfficial.booleanValue(), this.isAdded, this.suggestionReason, this.suggestionToken);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder displayName(String str) {
            this.displayName = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder isAdded(Boolean bool) {
            this.isAdded = bool;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder isOfficial(boolean z) {
            this.isOfficial = Boolean.valueOf(z);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder suggestionReason(String str) {
            this.suggestionReason = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder suggestionToken(String str) {
            this.suggestionToken = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder userId(String str) {
            this.userId = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.SuggestedFriend.Builder username(String str) {
            if (str != null) {
                this.username = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }
    }

    private AutoValue_LegacySendToQueries_SuggestedFriend(long j, String str, String str2, String str3, String str4, String str5, boolean z, Boolean bool, String str6, String str7) {
        this._id = j;
        this.username = str;
        this.userId = str2;
        this.displayName = str3;
        this.bitmojiSelfieId = str4;
        this.bitmojiAvatarId = str5;
        this.isOfficial = z;
        this.isAdded = bool;
        this.suggestionReason = str6;
        this.suggestionToken = str7;
    }

    public final long _id() {
        return this._id;
    }

    public final String bitmojiAvatarId() {
        return this.bitmojiAvatarId;
    }

    public final String bitmojiSelfieId() {
        return this.bitmojiSelfieId;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SuggestedFriend) {
            SuggestedFriend suggestedFriend = (SuggestedFriend) obj;
            if (this._id == suggestedFriend._id() && this.username.equals(suggestedFriend.username())) {
                String str = this.userId;
                if (str != null ? !str.equals(suggestedFriend.userId()) : suggestedFriend.userId() != null) {
                    str = this.displayName;
                    if (str != null ? !str.equals(suggestedFriend.displayName()) : suggestedFriend.displayName() != null) {
                        str = this.bitmojiSelfieId;
                        if (str != null ? !str.equals(suggestedFriend.bitmojiSelfieId()) : suggestedFriend.bitmojiSelfieId() != null) {
                            str = this.bitmojiAvatarId;
                            if (str != null ? !str.equals(suggestedFriend.bitmojiAvatarId()) : suggestedFriend.bitmojiAvatarId() != null) {
                                if (this.isOfficial == suggestedFriend.isOfficial()) {
                                    Boolean bool = this.isAdded;
                                    if (bool != null ? !bool.equals(suggestedFriend.isAdded()) : suggestedFriend.isAdded() != null) {
                                        str = this.suggestionReason;
                                        if (str != null ? !str.equals(suggestedFriend.suggestionReason()) : suggestedFriend.suggestionReason() != null) {
                                            str = this.suggestionToken;
                                            return str != null ? !str.equals(suggestedFriend.suggestionToken()) : suggestedFriend.suggestionToken() != null;
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

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.username.hashCode()) * 1000003;
        String str = this.userId;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.bitmojiAvatarId;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.isOfficial ? 1231 : 1237)) * 1000003;
        Boolean bool = this.isAdded;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.suggestionReason;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.suggestionToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isAdded() {
        return this.isAdded;
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    public final String suggestionReason() {
        return this.suggestionReason;
    }

    public final String suggestionToken() {
        return this.suggestionToken;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SuggestedFriend{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", bitmojiSelfieId=");
        stringBuilder.append(this.bitmojiSelfieId);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.bitmojiAvatarId);
        stringBuilder.append(", isOfficial=");
        stringBuilder.append(this.isOfficial);
        stringBuilder.append(", isAdded=");
        stringBuilder.append(this.isAdded);
        stringBuilder.append(", suggestionReason=");
        stringBuilder.append(this.suggestionReason);
        stringBuilder.append(", suggestionToken=");
        stringBuilder.append(this.suggestionToken);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userId() {
        return this.userId;
    }

    public final String username() {
        return this.username;
    }
}

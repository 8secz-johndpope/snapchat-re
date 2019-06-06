package com.snap.core.db.query;

import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.query.LegacySendToQueries.PostableStory;
import com.snapchat.soju.android.Geofence;

final class AutoValue_LegacySendToQueries_PostableStory extends PostableStory {
    private final long _id;
    private final Long creationTimestamp;
    private final String customTitle;
    private final String displayName;
    private final Long feedId;
    private final Geofence geofence;
    private final GroupStoryRankType groupStoryRankType;
    private final GroupStoryType groupStoryType;
    private final Boolean hasActiveStory;
    private final Boolean isLocal;
    private final Boolean isSpectaclesStory;
    private final StoryKind kind;
    private final Long lastActionTimestamp;
    private final long latestActiveStorySnapPostTimestamp;
    private final Long latestUserPostTimestamp;
    private final String mischiefId;
    private final PrivacyType myStoryPrivacyOverride;
    private final String storyId;
    private final String subtext;
    private final String thumbnailUrl;
    private final String userName;

    static final class Builder extends com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder {
        private Long _id;
        private Long creationTimestamp;
        private String customTitle;
        private String displayName;
        private Long feedId;
        private Geofence geofence;
        private GroupStoryRankType groupStoryRankType;
        private GroupStoryType groupStoryType;
        private Boolean hasActiveStory;
        private Boolean isLocal;
        private Boolean isSpectaclesStory;
        private StoryKind kind;
        private Long lastActionTimestamp;
        private Long latestActiveStorySnapPostTimestamp;
        private Long latestUserPostTimestamp;
        private String mischiefId;
        private PrivacyType myStoryPrivacyOverride;
        private String storyId;
        private String subtext;
        private String thumbnailUrl;
        private String userName;

        Builder() {
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder _id(long j) {
            this._id = Long.valueOf(j);
            return this;
        }

        public final PostableStory build() {
            StringBuilder stringBuilder;
            String str = "";
            if (this._id == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" _id");
                str = stringBuilder.toString();
            }
            if (this.storyId == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" storyId");
                str = stringBuilder.toString();
            }
            if (this.kind == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" kind");
                str = stringBuilder.toString();
            }
            if (this.latestActiveStorySnapPostTimestamp == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" latestActiveStorySnapPostTimestamp");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_LegacySendToQueries_PostableStory(this._id.longValue(), this.storyId, this.userName, this.displayName, this.kind, this.isLocal, this.groupStoryType, this.mischiefId, this.subtext, this.isSpectaclesStory, this.geofence, this.groupStoryRankType, this.customTitle, this.hasActiveStory, this.lastActionTimestamp, this.latestUserPostTimestamp, this.creationTimestamp, this.thumbnailUrl, this.myStoryPrivacyOverride, this.latestActiveStorySnapPostTimestamp.longValue(), this.feedId);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder creationTimestamp(Long l) {
            this.creationTimestamp = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder customTitle(String str) {
            this.customTitle = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder displayName(String str) {
            this.displayName = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder feedId(Long l) {
            this.feedId = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder geofence(Geofence geofence) {
            this.geofence = geofence;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder groupStoryRankType(GroupStoryRankType groupStoryRankType) {
            this.groupStoryRankType = groupStoryRankType;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder groupStoryType(GroupStoryType groupStoryType) {
            this.groupStoryType = groupStoryType;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder hasActiveStory(Boolean bool) {
            this.hasActiveStory = bool;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder isLocal(Boolean bool) {
            this.isLocal = bool;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder isSpectaclesStory(Boolean bool) {
            this.isSpectaclesStory = bool;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder kind(StoryKind storyKind) {
            if (storyKind != null) {
                this.kind = storyKind;
                return this;
            }
            throw new NullPointerException("Null kind");
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder lastActionTimestamp(Long l) {
            this.lastActionTimestamp = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder latestActiveStorySnapPostTimestamp(long j) {
            this.latestActiveStorySnapPostTimestamp = Long.valueOf(j);
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder latestUserPostTimestamp(Long l) {
            this.latestUserPostTimestamp = l;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder mischiefId(String str) {
            this.mischiefId = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder myStoryPrivacyOverride(PrivacyType privacyType) {
            this.myStoryPrivacyOverride = privacyType;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder storyId(String str) {
            if (str != null) {
                this.storyId = str;
                return this;
            }
            throw new NullPointerException("Null storyId");
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder subtext(String str) {
            this.subtext = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder thumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        public final com.snap.core.db.query.LegacySendToQueries.PostableStory.Builder userName(String str) {
            this.userName = str;
            return this;
        }
    }

    private AutoValue_LegacySendToQueries_PostableStory(long j, String str, String str2, String str3, StoryKind storyKind, Boolean bool, GroupStoryType groupStoryType, String str4, String str5, Boolean bool2, Geofence geofence, GroupStoryRankType groupStoryRankType, String str6, Boolean bool3, Long l, Long l2, Long l3, String str7, PrivacyType privacyType, long j2, Long l4) {
        this._id = j;
        this.storyId = str;
        this.userName = str2;
        this.displayName = str3;
        this.kind = storyKind;
        this.isLocal = bool;
        this.groupStoryType = groupStoryType;
        this.mischiefId = str4;
        this.subtext = str5;
        this.isSpectaclesStory = bool2;
        this.geofence = geofence;
        this.groupStoryRankType = groupStoryRankType;
        this.customTitle = str6;
        this.hasActiveStory = bool3;
        this.lastActionTimestamp = l;
        this.latestUserPostTimestamp = l2;
        this.creationTimestamp = l3;
        this.thumbnailUrl = str7;
        this.myStoryPrivacyOverride = privacyType;
        this.latestActiveStorySnapPostTimestamp = j2;
        this.feedId = l4;
    }

    public final long _id() {
        return this._id;
    }

    public final Long creationTimestamp() {
        return this.creationTimestamp;
    }

    public final String customTitle() {
        return this.customTitle;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PostableStory) {
            PostableStory postableStory = (PostableStory) obj;
            if (this._id == postableStory._id() && this.storyId.equals(postableStory.storyId())) {
                String str = this.userName;
                if (str != null ? !str.equals(postableStory.userName()) : postableStory.userName() != null) {
                    str = this.displayName;
                    if (str != null ? !str.equals(postableStory.displayName()) : postableStory.displayName() != null) {
                        if (this.kind.equals(postableStory.kind())) {
                            Boolean bool = this.isLocal;
                            if (bool != null ? !bool.equals(postableStory.isLocal()) : postableStory.isLocal() != null) {
                                GroupStoryType groupStoryType = this.groupStoryType;
                                if (groupStoryType != null ? !groupStoryType.equals(postableStory.groupStoryType()) : postableStory.groupStoryType() != null) {
                                    str = this.mischiefId;
                                    if (str != null ? !str.equals(postableStory.mischiefId()) : postableStory.mischiefId() != null) {
                                        str = this.subtext;
                                        if (str != null ? !str.equals(postableStory.subtext()) : postableStory.subtext() != null) {
                                            bool = this.isSpectaclesStory;
                                            if (bool != null ? !bool.equals(postableStory.isSpectaclesStory()) : postableStory.isSpectaclesStory() != null) {
                                                Geofence geofence = this.geofence;
                                                if (geofence != null ? !geofence.equals(postableStory.geofence()) : postableStory.geofence() != null) {
                                                    GroupStoryRankType groupStoryRankType = this.groupStoryRankType;
                                                    if (groupStoryRankType != null ? !groupStoryRankType.equals(postableStory.groupStoryRankType()) : postableStory.groupStoryRankType() != null) {
                                                        str = this.customTitle;
                                                        if (str != null ? !str.equals(postableStory.customTitle()) : postableStory.customTitle() != null) {
                                                            bool = this.hasActiveStory;
                                                            if (bool != null ? !bool.equals(postableStory.hasActiveStory()) : postableStory.hasActiveStory() != null) {
                                                                Long l = this.lastActionTimestamp;
                                                                if (l != null ? !l.equals(postableStory.lastActionTimestamp()) : postableStory.lastActionTimestamp() != null) {
                                                                    l = this.latestUserPostTimestamp;
                                                                    if (l != null ? !l.equals(postableStory.latestUserPostTimestamp()) : postableStory.latestUserPostTimestamp() != null) {
                                                                        l = this.creationTimestamp;
                                                                        if (l != null ? !l.equals(postableStory.creationTimestamp()) : postableStory.creationTimestamp() != null) {
                                                                            str = this.thumbnailUrl;
                                                                            if (str != null ? !str.equals(postableStory.thumbnailUrl()) : postableStory.thumbnailUrl() != null) {
                                                                                PrivacyType privacyType = this.myStoryPrivacyOverride;
                                                                                if (privacyType != null ? !privacyType.equals(postableStory.myStoryPrivacyOverride()) : postableStory.myStoryPrivacyOverride() != null) {
                                                                                    if (this.latestActiveStorySnapPostTimestamp == postableStory.latestActiveStorySnapPostTimestamp()) {
                                                                                        l = this.feedId;
                                                                                        return l != null ? !l.equals(postableStory.feedId()) : postableStory.feedId() != null;
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
                }
            }
        }
    }

    public final Long feedId() {
        return this.feedId;
    }

    public final Geofence geofence() {
        return this.geofence;
    }

    public final GroupStoryRankType groupStoryRankType() {
        return this.groupStoryRankType;
    }

    public final GroupStoryType groupStoryType() {
        return this.groupStoryType;
    }

    public final Boolean hasActiveStory() {
        return this.hasActiveStory;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        String str = this.userName;
        int i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003;
        Boolean bool = this.isLocal;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        GroupStoryType groupStoryType = this.groupStoryType;
        hashCode = (hashCode ^ (groupStoryType == null ? 0 : groupStoryType.hashCode())) * 1000003;
        str = this.mischiefId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.subtext;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.isSpectaclesStory;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Geofence geofence = this.geofence;
        hashCode = (hashCode ^ (geofence == null ? 0 : geofence.hashCode())) * 1000003;
        GroupStoryRankType groupStoryRankType = this.groupStoryRankType;
        hashCode = (hashCode ^ (groupStoryRankType == null ? 0 : groupStoryRankType.hashCode())) * 1000003;
        str = this.customTitle;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.hasActiveStory;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.lastActionTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.latestUserPostTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.creationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str = this.thumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        PrivacyType privacyType = this.myStoryPrivacyOverride;
        hashCode = (hashCode ^ (privacyType == null ? 0 : privacyType.hashCode())) * 1000003;
        long j2 = this.latestActiveStorySnapPostTimestamp;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Long l2 = this.feedId;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Boolean isLocal() {
        return this.isLocal;
    }

    public final Boolean isSpectaclesStory() {
        return this.isSpectaclesStory;
    }

    public final StoryKind kind() {
        return this.kind;
    }

    public final Long lastActionTimestamp() {
        return this.lastActionTimestamp;
    }

    public final long latestActiveStorySnapPostTimestamp() {
        return this.latestActiveStorySnapPostTimestamp;
    }

    public final Long latestUserPostTimestamp() {
        return this.latestUserPostTimestamp;
    }

    public final String mischiefId() {
        return this.mischiefId;
    }

    public final PrivacyType myStoryPrivacyOverride() {
        return this.myStoryPrivacyOverride;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final String subtext() {
        return this.subtext;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PostableStory{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", userName=");
        stringBuilder.append(this.userName);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", isLocal=");
        stringBuilder.append(this.isLocal);
        stringBuilder.append(", groupStoryType=");
        stringBuilder.append(this.groupStoryType);
        stringBuilder.append(", mischiefId=");
        stringBuilder.append(this.mischiefId);
        stringBuilder.append(", subtext=");
        stringBuilder.append(this.subtext);
        stringBuilder.append(", isSpectaclesStory=");
        stringBuilder.append(this.isSpectaclesStory);
        stringBuilder.append(", geofence=");
        stringBuilder.append(this.geofence);
        stringBuilder.append(", groupStoryRankType=");
        stringBuilder.append(this.groupStoryRankType);
        stringBuilder.append(", customTitle=");
        stringBuilder.append(this.customTitle);
        stringBuilder.append(", hasActiveStory=");
        stringBuilder.append(this.hasActiveStory);
        stringBuilder.append(", lastActionTimestamp=");
        stringBuilder.append(this.lastActionTimestamp);
        stringBuilder.append(", latestUserPostTimestamp=");
        stringBuilder.append(this.latestUserPostTimestamp);
        stringBuilder.append(", creationTimestamp=");
        stringBuilder.append(this.creationTimestamp);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", myStoryPrivacyOverride=");
        stringBuilder.append(this.myStoryPrivacyOverride);
        stringBuilder.append(", latestActiveStorySnapPostTimestamp=");
        stringBuilder.append(this.latestActiveStorySnapPostTimestamp);
        stringBuilder.append(", feedId=");
        stringBuilder.append(this.feedId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String userName() {
        return this.userName;
    }
}

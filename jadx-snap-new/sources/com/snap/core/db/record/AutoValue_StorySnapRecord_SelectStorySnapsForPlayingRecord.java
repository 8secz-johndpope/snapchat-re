package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapsForPlayingRecord;
import defpackage.gcp;

final class AutoValue_StorySnapRecord_SelectStorySnapsForPlayingRecord extends SelectStorySnapsForPlayingRecord {
    private final long _id;
    private final String animatedSnapType;
    private final String attributedUserDisplayName;
    private final Integer brandFriendliness;
    private final String captionTextDisplay;
    private final String clientId;
    private final MessageClientStatus clientStatus;
    private final String contextHint;
    private final Long creationTimestamp;
    private final String creativeKitSourceAppName;
    private final String creativeKitSourceAppOAuthClientId;
    private final String displayName;
    private final long durationInMs;
    private final String encryptedGeoLoggingData;
    private final Long expirationTimestamp;
    private final String filterId;
    private final String filterLensId;
    private final String flushableId;
    private final FriendLinkType friendLinkType;
    private final GroupStoryType groupStoryType;
    private final boolean isInfiniteDuration;
    private final Boolean isLocal;
    private final Boolean isOfficialStory;
    private final Boolean isPublic;
    private final StoryKind kind;
    private final String largeThumbnailUrl;
    private final String lensMetadata;
    private final String mediaD2sUrl;
    private final String mediaId;
    private final String mediaIv;
    private final String mediaKey;
    private final String mediaUrl;
    private final boolean needAuth;
    private final String ruleFileParams;
    private final String serverRankingId;
    private final String snapAttachmentUrl;
    private final String snapId;
    private final long snapRowId;
    private final Integer snapSource;
    private final gcp snapType;
    private final String storyFilterId;
    private final String storyId;
    private final long storyRowId;
    private final String storyUsername;
    private final String thumbnailIv;
    private final String thumbnailUrl;
    private final long timestamp;
    private final long totalViewCount;
    private final String unlockablesSnapInfo;
    private final String userId;
    private final String username;
    private final String venueId;
    private final Boolean viewed;
    private final Boolean zipped;

    AutoValue_StorySnapRecord_SelectStorySnapsForPlayingRecord(long j, String str, String str2, String str3, String str4, gcp gcp, String str5, String str6, String str7, String str8, long j2, long j3, boolean z, Boolean bool, String str9, boolean z2, Boolean bool2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, Boolean bool4, Long l, long j4, String str17, String str18, long j5, String str19, Boolean bool5, GroupStoryType groupStoryType, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num, StoryKind storyKind, String str28, FriendLinkType friendLinkType, long j6, Integer num2, Long l2, String str29, MessageClientStatus messageClientStatus, String str30, String str31, String str32) {
        String str33 = str;
        String str34 = str3;
        gcp gcp2 = gcp;
        String str35 = str19;
        StoryKind storyKind2 = storyKind;
        this._id = j;
        if (str33 != null) {
            this.snapId = str33;
            this.username = str2;
            if (str34 != null) {
                this.clientId = str34;
                this.mediaId = str4;
                if (gcp2 != null) {
                    this.snapType = gcp2;
                    this.mediaKey = str5;
                    this.mediaIv = str6;
                    this.mediaUrl = str7;
                    this.mediaD2sUrl = str8;
                    this.durationInMs = j2;
                    this.timestamp = j3;
                    this.needAuth = z;
                    this.viewed = bool;
                    this.flushableId = str9;
                    this.isInfiniteDuration = z2;
                    this.zipped = bool2;
                    this.largeThumbnailUrl = str10;
                    this.thumbnailUrl = str11;
                    this.thumbnailIv = str12;
                    this.captionTextDisplay = str13;
                    this.displayName = str14;
                    this.attributedUserDisplayName = str15;
                    this.isOfficialStory = bool3;
                    this.venueId = str16;
                    this.isPublic = bool4;
                    this.expirationTimestamp = l;
                    this.snapRowId = j4;
                    this.filterId = str17;
                    this.storyFilterId = str18;
                    this.storyRowId = j5;
                    if (str35 != null) {
                        this.storyId = str35;
                        this.isLocal = bool5;
                        this.groupStoryType = groupStoryType;
                        this.snapAttachmentUrl = str20;
                        this.contextHint = str21;
                        this.animatedSnapType = str22;
                        this.lensMetadata = str23;
                        this.filterLensId = str24;
                        this.unlockablesSnapInfo = str25;
                        this.encryptedGeoLoggingData = str26;
                        this.ruleFileParams = str27;
                        this.brandFriendliness = num;
                        if (storyKind2 != null) {
                            this.kind = storyKind2;
                            this.userId = str28;
                            this.friendLinkType = friendLinkType;
                            this.totalViewCount = j6;
                            this.snapSource = num2;
                            this.creationTimestamp = l2;
                            this.storyUsername = str29;
                            this.clientStatus = messageClientStatus;
                            this.creativeKitSourceAppName = str30;
                            this.creativeKitSourceAppOAuthClientId = str31;
                            this.serverRankingId = str32;
                            return;
                        }
                        throw new NullPointerException("Null kind");
                    }
                    throw new NullPointerException("Null storyId");
                }
                throw new NullPointerException("Null snapType");
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null snapId");
    }

    public final long _id() {
        return this._id;
    }

    public final String animatedSnapType() {
        return this.animatedSnapType;
    }

    public final String attributedUserDisplayName() {
        return this.attributedUserDisplayName;
    }

    public final Integer brandFriendliness() {
        return this.brandFriendliness;
    }

    public final String captionTextDisplay() {
        return this.captionTextDisplay;
    }

    public final String clientId() {
        return this.clientId;
    }

    public final MessageClientStatus clientStatus() {
        return this.clientStatus;
    }

    public final String contextHint() {
        return this.contextHint;
    }

    public final Long creationTimestamp() {
        return this.creationTimestamp;
    }

    public final String creativeKitSourceAppName() {
        return this.creativeKitSourceAppName;
    }

    public final String creativeKitSourceAppOAuthClientId() {
        return this.creativeKitSourceAppOAuthClientId;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final String encryptedGeoLoggingData() {
        return this.encryptedGeoLoggingData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectStorySnapsForPlayingRecord) {
            SelectStorySnapsForPlayingRecord selectStorySnapsForPlayingRecord = (SelectStorySnapsForPlayingRecord) obj;
            if (this._id == selectStorySnapsForPlayingRecord._id() && this.snapId.equals(selectStorySnapsForPlayingRecord.snapId())) {
                String str = this.username;
                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.username()) : selectStorySnapsForPlayingRecord.username() != null) {
                    if (this.clientId.equals(selectStorySnapsForPlayingRecord.clientId())) {
                        str = this.mediaId;
                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.mediaId()) : selectStorySnapsForPlayingRecord.mediaId() != null) {
                            if (this.snapType.equals(selectStorySnapsForPlayingRecord.snapType())) {
                                str = this.mediaKey;
                                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.mediaKey()) : selectStorySnapsForPlayingRecord.mediaKey() != null) {
                                    str = this.mediaIv;
                                    if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.mediaIv()) : selectStorySnapsForPlayingRecord.mediaIv() != null) {
                                        str = this.mediaUrl;
                                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.mediaUrl()) : selectStorySnapsForPlayingRecord.mediaUrl() != null) {
                                            str = this.mediaD2sUrl;
                                            if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.mediaD2sUrl()) : selectStorySnapsForPlayingRecord.mediaD2sUrl() != null) {
                                                if (this.durationInMs == selectStorySnapsForPlayingRecord.durationInMs() && this.timestamp == selectStorySnapsForPlayingRecord.timestamp() && this.needAuth == selectStorySnapsForPlayingRecord.needAuth()) {
                                                    Boolean bool = this.viewed;
                                                    if (bool != null ? !bool.equals(selectStorySnapsForPlayingRecord.viewed()) : selectStorySnapsForPlayingRecord.viewed() != null) {
                                                        str = this.flushableId;
                                                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.flushableId()) : selectStorySnapsForPlayingRecord.flushableId() != null) {
                                                            if (this.isInfiniteDuration == selectStorySnapsForPlayingRecord.isInfiniteDuration()) {
                                                                bool = this.zipped;
                                                                if (bool != null ? !bool.equals(selectStorySnapsForPlayingRecord.zipped()) : selectStorySnapsForPlayingRecord.zipped() != null) {
                                                                    str = this.largeThumbnailUrl;
                                                                    if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.largeThumbnailUrl()) : selectStorySnapsForPlayingRecord.largeThumbnailUrl() != null) {
                                                                        str = this.thumbnailUrl;
                                                                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.thumbnailUrl()) : selectStorySnapsForPlayingRecord.thumbnailUrl() != null) {
                                                                            str = this.thumbnailIv;
                                                                            if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.thumbnailIv()) : selectStorySnapsForPlayingRecord.thumbnailIv() != null) {
                                                                                str = this.captionTextDisplay;
                                                                                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.captionTextDisplay()) : selectStorySnapsForPlayingRecord.captionTextDisplay() != null) {
                                                                                    str = this.displayName;
                                                                                    if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.displayName()) : selectStorySnapsForPlayingRecord.displayName() != null) {
                                                                                        str = this.attributedUserDisplayName;
                                                                                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.attributedUserDisplayName()) : selectStorySnapsForPlayingRecord.attributedUserDisplayName() != null) {
                                                                                            bool = this.isOfficialStory;
                                                                                            if (bool != null ? !bool.equals(selectStorySnapsForPlayingRecord.isOfficialStory()) : selectStorySnapsForPlayingRecord.isOfficialStory() != null) {
                                                                                                str = this.venueId;
                                                                                                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.venueId()) : selectStorySnapsForPlayingRecord.venueId() != null) {
                                                                                                    bool = this.isPublic;
                                                                                                    if (bool != null ? !bool.equals(selectStorySnapsForPlayingRecord.isPublic()) : selectStorySnapsForPlayingRecord.isPublic() != null) {
                                                                                                        Long l = this.expirationTimestamp;
                                                                                                        if (l != null ? !l.equals(selectStorySnapsForPlayingRecord.expirationTimestamp()) : selectStorySnapsForPlayingRecord.expirationTimestamp() != null) {
                                                                                                            if (this.snapRowId == selectStorySnapsForPlayingRecord.snapRowId()) {
                                                                                                                str = this.filterId;
                                                                                                                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.filterId()) : selectStorySnapsForPlayingRecord.filterId() != null) {
                                                                                                                    str = this.storyFilterId;
                                                                                                                    if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.storyFilterId()) : selectStorySnapsForPlayingRecord.storyFilterId() != null) {
                                                                                                                        if (this.storyRowId == selectStorySnapsForPlayingRecord.storyRowId() && this.storyId.equals(selectStorySnapsForPlayingRecord.storyId())) {
                                                                                                                            bool = this.isLocal;
                                                                                                                            if (bool != null ? !bool.equals(selectStorySnapsForPlayingRecord.isLocal()) : selectStorySnapsForPlayingRecord.isLocal() != null) {
                                                                                                                                GroupStoryType groupStoryType = this.groupStoryType;
                                                                                                                                if (groupStoryType != null ? !groupStoryType.equals(selectStorySnapsForPlayingRecord.groupStoryType()) : selectStorySnapsForPlayingRecord.groupStoryType() != null) {
                                                                                                                                    str = this.snapAttachmentUrl;
                                                                                                                                    if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.snapAttachmentUrl()) : selectStorySnapsForPlayingRecord.snapAttachmentUrl() != null) {
                                                                                                                                        str = this.contextHint;
                                                                                                                                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.contextHint()) : selectStorySnapsForPlayingRecord.contextHint() != null) {
                                                                                                                                            str = this.animatedSnapType;
                                                                                                                                            if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.animatedSnapType()) : selectStorySnapsForPlayingRecord.animatedSnapType() != null) {
                                                                                                                                                str = this.lensMetadata;
                                                                                                                                                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.lensMetadata()) : selectStorySnapsForPlayingRecord.lensMetadata() != null) {
                                                                                                                                                    str = this.filterLensId;
                                                                                                                                                    if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.filterLensId()) : selectStorySnapsForPlayingRecord.filterLensId() != null) {
                                                                                                                                                        str = this.unlockablesSnapInfo;
                                                                                                                                                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.unlockablesSnapInfo()) : selectStorySnapsForPlayingRecord.unlockablesSnapInfo() != null) {
                                                                                                                                                            str = this.encryptedGeoLoggingData;
                                                                                                                                                            if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.encryptedGeoLoggingData()) : selectStorySnapsForPlayingRecord.encryptedGeoLoggingData() != null) {
                                                                                                                                                                str = this.ruleFileParams;
                                                                                                                                                                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.ruleFileParams()) : selectStorySnapsForPlayingRecord.ruleFileParams() != null) {
                                                                                                                                                                    Integer num = this.brandFriendliness;
                                                                                                                                                                    if (num != null ? !num.equals(selectStorySnapsForPlayingRecord.brandFriendliness()) : selectStorySnapsForPlayingRecord.brandFriendliness() != null) {
                                                                                                                                                                        if (this.kind.equals(selectStorySnapsForPlayingRecord.kind())) {
                                                                                                                                                                            str = this.userId;
                                                                                                                                                                            if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.userId()) : selectStorySnapsForPlayingRecord.userId() != null) {
                                                                                                                                                                                FriendLinkType friendLinkType = this.friendLinkType;
                                                                                                                                                                                if (friendLinkType != null ? !friendLinkType.equals(selectStorySnapsForPlayingRecord.friendLinkType()) : selectStorySnapsForPlayingRecord.friendLinkType() != null) {
                                                                                                                                                                                    if (this.totalViewCount == selectStorySnapsForPlayingRecord.totalViewCount()) {
                                                                                                                                                                                        num = this.snapSource;
                                                                                                                                                                                        if (num != null ? !num.equals(selectStorySnapsForPlayingRecord.snapSource()) : selectStorySnapsForPlayingRecord.snapSource() != null) {
                                                                                                                                                                                            l = this.creationTimestamp;
                                                                                                                                                                                            if (l != null ? !l.equals(selectStorySnapsForPlayingRecord.creationTimestamp()) : selectStorySnapsForPlayingRecord.creationTimestamp() != null) {
                                                                                                                                                                                                str = this.storyUsername;
                                                                                                                                                                                                if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.storyUsername()) : selectStorySnapsForPlayingRecord.storyUsername() != null) {
                                                                                                                                                                                                    MessageClientStatus messageClientStatus = this.clientStatus;
                                                                                                                                                                                                    if (messageClientStatus != null ? !messageClientStatus.equals(selectStorySnapsForPlayingRecord.clientStatus()) : selectStorySnapsForPlayingRecord.clientStatus() != null) {
                                                                                                                                                                                                        str = this.creativeKitSourceAppName;
                                                                                                                                                                                                        if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.creativeKitSourceAppName()) : selectStorySnapsForPlayingRecord.creativeKitSourceAppName() != null) {
                                                                                                                                                                                                            str = this.creativeKitSourceAppOAuthClientId;
                                                                                                                                                                                                            if (str != null ? !str.equals(selectStorySnapsForPlayingRecord.creativeKitSourceAppOAuthClientId()) : selectStorySnapsForPlayingRecord.creativeKitSourceAppOAuthClientId() != null) {
                                                                                                                                                                                                                str = this.serverRankingId;
                                                                                                                                                                                                                return str != null ? !str.equals(selectStorySnapsForPlayingRecord.serverRankingId()) : selectStorySnapsForPlayingRecord.serverRankingId() != null;
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long expirationTimestamp() {
        return this.expirationTimestamp;
    }

    public final String filterId() {
        return this.filterId;
    }

    public final String filterLensId() {
        return this.filterLensId;
    }

    public final String flushableId() {
        return this.flushableId;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final GroupStoryType groupStoryType() {
        return this.groupStoryType;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        String str = this.username;
        int i = 0;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.clientId.hashCode()) * 1000003;
        str = this.mediaId;
        hashCode = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        str = this.mediaKey;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.mediaD2sUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.durationInMs;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.timestamp;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        int i2 = 1231;
        hashCode = (hashCode ^ (this.needAuth ? 1231 : 1237)) * 1000003;
        Boolean bool = this.viewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.flushableId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        if (!this.isInfiniteDuration) {
            i2 = 1237;
        }
        hashCode = (hashCode ^ i2) * 1000003;
        bool = this.zipped;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.largeThumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.thumbnailUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.thumbnailIv;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.captionTextDisplay;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.displayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.attributedUserDisplayName;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.isOfficialStory;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str = this.venueId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.isPublic;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.expirationTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        j2 = this.snapRowId;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        str = this.filterId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.storyFilterId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        j2 = this.storyRowId;
        hashCode = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.storyId.hashCode()) * 1000003;
        bool = this.isLocal;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        GroupStoryType groupStoryType = this.groupStoryType;
        hashCode = (hashCode ^ (groupStoryType == null ? 0 : groupStoryType.hashCode())) * 1000003;
        str = this.snapAttachmentUrl;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.contextHint;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.animatedSnapType;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.lensMetadata;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.filterLensId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.unlockablesSnapInfo;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.encryptedGeoLoggingData;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.ruleFileParams;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Integer num = this.brandFriendliness;
        hashCode = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.kind.hashCode()) * 1000003;
        str = this.userId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        hashCode = (hashCode ^ (friendLinkType == null ? 0 : friendLinkType.hashCode())) * 1000003;
        j2 = this.totalViewCount;
        hashCode = (hashCode ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Integer num2 = this.snapSource;
        hashCode = (hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Long l2 = this.creationTimestamp;
        hashCode = (hashCode ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str2 = this.storyUsername;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        hashCode = (hashCode ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        str2 = this.creativeKitSourceAppName;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.creativeKitSourceAppOAuthClientId;
        hashCode = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.serverRankingId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isInfiniteDuration() {
        return this.isInfiniteDuration;
    }

    public final Boolean isLocal() {
        return this.isLocal;
    }

    public final Boolean isOfficialStory() {
        return this.isOfficialStory;
    }

    public final Boolean isPublic() {
        return this.isPublic;
    }

    public final StoryKind kind() {
        return this.kind;
    }

    public final String largeThumbnailUrl() {
        return this.largeThumbnailUrl;
    }

    public final String lensMetadata() {
        return this.lensMetadata;
    }

    public final String mediaD2sUrl() {
        return this.mediaD2sUrl;
    }

    public final String mediaId() {
        return this.mediaId;
    }

    public final String mediaIv() {
        return this.mediaIv;
    }

    public final String mediaKey() {
        return this.mediaKey;
    }

    public final String mediaUrl() {
        return this.mediaUrl;
    }

    public final boolean needAuth() {
        return this.needAuth;
    }

    public final String ruleFileParams() {
        return this.ruleFileParams;
    }

    public final String serverRankingId() {
        return this.serverRankingId;
    }

    public final String snapAttachmentUrl() {
        return this.snapAttachmentUrl;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final Integer snapSource() {
        return this.snapSource;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final String storyFilterId() {
        return this.storyFilterId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String storyUsername() {
        return this.storyUsername;
    }

    public final String thumbnailIv() {
        return this.thumbnailIv;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectStorySnapsForPlayingRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", mediaId=");
        stringBuilder.append(this.mediaId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", mediaKey=");
        stringBuilder.append(this.mediaKey);
        stringBuilder.append(", mediaIv=");
        stringBuilder.append(this.mediaIv);
        stringBuilder.append(", mediaUrl=");
        stringBuilder.append(this.mediaUrl);
        stringBuilder.append(", mediaD2sUrl=");
        stringBuilder.append(this.mediaD2sUrl);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", needAuth=");
        stringBuilder.append(this.needAuth);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", flushableId=");
        stringBuilder.append(this.flushableId);
        stringBuilder.append(", isInfiniteDuration=");
        stringBuilder.append(this.isInfiniteDuration);
        stringBuilder.append(", zipped=");
        stringBuilder.append(this.zipped);
        stringBuilder.append(", largeThumbnailUrl=");
        stringBuilder.append(this.largeThumbnailUrl);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", thumbnailIv=");
        stringBuilder.append(this.thumbnailIv);
        stringBuilder.append(", captionTextDisplay=");
        stringBuilder.append(this.captionTextDisplay);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append(", attributedUserDisplayName=");
        stringBuilder.append(this.attributedUserDisplayName);
        stringBuilder.append(", isOfficialStory=");
        stringBuilder.append(this.isOfficialStory);
        stringBuilder.append(", venueId=");
        stringBuilder.append(this.venueId);
        stringBuilder.append(", isPublic=");
        stringBuilder.append(this.isPublic);
        stringBuilder.append(", expirationTimestamp=");
        stringBuilder.append(this.expirationTimestamp);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", filterId=");
        stringBuilder.append(this.filterId);
        stringBuilder.append(", storyFilterId=");
        stringBuilder.append(this.storyFilterId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", isLocal=");
        stringBuilder.append(this.isLocal);
        stringBuilder.append(", groupStoryType=");
        stringBuilder.append(this.groupStoryType);
        stringBuilder.append(", snapAttachmentUrl=");
        stringBuilder.append(this.snapAttachmentUrl);
        stringBuilder.append(", contextHint=");
        stringBuilder.append(this.contextHint);
        stringBuilder.append(", animatedSnapType=");
        stringBuilder.append(this.animatedSnapType);
        stringBuilder.append(", lensMetadata=");
        stringBuilder.append(this.lensMetadata);
        stringBuilder.append(", filterLensId=");
        stringBuilder.append(this.filterLensId);
        stringBuilder.append(", unlockablesSnapInfo=");
        stringBuilder.append(this.unlockablesSnapInfo);
        stringBuilder.append(", encryptedGeoLoggingData=");
        stringBuilder.append(this.encryptedGeoLoggingData);
        stringBuilder.append(", ruleFileParams=");
        stringBuilder.append(this.ruleFileParams);
        stringBuilder.append(", brandFriendliness=");
        stringBuilder.append(this.brandFriendliness);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append(", totalViewCount=");
        stringBuilder.append(this.totalViewCount);
        stringBuilder.append(", snapSource=");
        stringBuilder.append(this.snapSource);
        stringBuilder.append(", creationTimestamp=");
        stringBuilder.append(this.creationTimestamp);
        stringBuilder.append(", storyUsername=");
        stringBuilder.append(this.storyUsername);
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", creativeKitSourceAppName=");
        stringBuilder.append(this.creativeKitSourceAppName);
        stringBuilder.append(", creativeKitSourceAppOAuthClientId=");
        stringBuilder.append(this.creativeKitSourceAppOAuthClientId);
        stringBuilder.append(", serverRankingId=");
        stringBuilder.append(this.serverRankingId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long totalViewCount() {
        return this.totalViewCount;
    }

    public final String unlockablesSnapInfo() {
        return this.unlockablesSnapInfo;
    }

    public final String userId() {
        return this.userId;
    }

    public final String username() {
        return this.username;
    }

    public final String venueId() {
        return this.venueId;
    }

    public final Boolean viewed() {
        return this.viewed;
    }

    public final Boolean zipped() {
        return this.zipped;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;

final class AutoValue_StorySnapRecord extends StorySnapRecord {
    private final long _id;
    private final String animatedSnapType;
    private final Integer brandFriendliness;
    private final Long canonicalDisplayTime;
    private final String captionTextDisplay;
    private final String clientId;
    private final MessageClientStatus clientStatus;
    private final String contextHint;
    private final Long creationTimestamp;
    private final String creativeKitSourceAppName;
    private final String creativeKitSourceAppOAuthClientId;
    private final String displayName;
    private final String encryptedGeoLoggingData;
    private final Long expirationTimestamp;
    private final String filterId;
    private final String filterLensId;
    private final String flushableId;
    private final Integer friendScreenCaptureRecordingCount;
    private final Integer friendScreenCaptureShotCount;
    private final Integer friendScreenshotCount;
    private final Integer friendSnapSaveCount;
    private final Integer friendViewCount;
    private final Boolean isOfficialStory;
    private final Boolean isPublic;
    private final String largeThumbnailUrl;
    private final String lensMetadata;
    private final String mediaD2sUrl;
    private final boolean needAuth;
    private final Integer otherScreenCaptureRecordingCount;
    private final Integer otherScreenCaptureShotCount;
    private final Integer otherScreenshotCount;
    private final Integer otherSnapSaveCount;
    private final Integer otherViewCount;
    private final Boolean pendingServerConfirmation;
    private final Long postedTimestamp;
    private final String ruleFileParams;
    private final String serverRankingId;
    private final String snapAttachmentUrl;
    private final long snapRowId;
    private final Integer snapSource;
    private final String storyFilterId;
    private final long storyRowId;
    private final String thumbnailIv;
    private final String thumbnailUrl;
    private final String unlockablesSnapInfo;
    private final String username;
    private final String venueId;
    private final Boolean viewed;
    private final Long viewedTimestamp;

    AutoValue_StorySnapRecord(long j, long j2, String str, String str2, long j3, String str3, String str4, String str5, String str6, Boolean bool, Long l, Boolean bool2, Boolean bool3, String str7, boolean z, String str8, String str9, Long l2, Long l3, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Integer num, MessageClientStatus messageClientStatus, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Boolean bool4, Long l4, Long l5, Integer num12, String str21, String str22, String str23) {
        String str24 = str2;
        this._id = j;
        this.snapRowId = j2;
        this.username = str;
        if (str24 != null) {
            this.clientId = str24;
            this.storyRowId = j3;
            this.captionTextDisplay = str3;
            this.filterId = str4;
            this.thumbnailUrl = str5;
            this.largeThumbnailUrl = str6;
            this.viewed = bool;
            this.viewedTimestamp = l;
            this.isOfficialStory = bool2;
            this.isPublic = bool3;
            this.mediaD2sUrl = str7;
            this.needAuth = z;
            this.storyFilterId = str8;
            this.thumbnailIv = str9;
            this.canonicalDisplayTime = l2;
            this.expirationTimestamp = l3;
            this.venueId = str10;
            this.flushableId = str11;
            this.displayName = str12;
            this.snapAttachmentUrl = str13;
            this.contextHint = str14;
            this.animatedSnapType = str15;
            this.lensMetadata = str16;
            this.filterLensId = str17;
            this.unlockablesSnapInfo = str18;
            this.encryptedGeoLoggingData = str19;
            this.ruleFileParams = str20;
            this.brandFriendliness = num;
            this.clientStatus = messageClientStatus;
            this.friendScreenCaptureRecordingCount = num2;
            this.friendScreenCaptureShotCount = num3;
            this.friendScreenshotCount = num4;
            this.friendSnapSaveCount = num5;
            this.friendViewCount = num6;
            this.otherScreenCaptureRecordingCount = num7;
            this.otherScreenCaptureShotCount = num8;
            this.otherScreenshotCount = num9;
            this.otherSnapSaveCount = num10;
            this.otherViewCount = num11;
            this.pendingServerConfirmation = bool4;
            this.postedTimestamp = l4;
            this.creationTimestamp = l5;
            this.snapSource = num12;
            this.creativeKitSourceAppName = str21;
            this.creativeKitSourceAppOAuthClientId = str22;
            this.serverRankingId = str23;
            return;
        }
        throw new NullPointerException("Null clientId");
    }

    public final long _id() {
        return this._id;
    }

    public final String animatedSnapType() {
        return this.animatedSnapType;
    }

    public final Integer brandFriendliness() {
        return this.brandFriendliness;
    }

    public final Long canonicalDisplayTime() {
        return this.canonicalDisplayTime;
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

    public final String encryptedGeoLoggingData() {
        return this.encryptedGeoLoggingData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StorySnapRecord) {
            StorySnapRecord storySnapRecord = (StorySnapRecord) obj;
            if (this._id == storySnapRecord._id() && this.snapRowId == storySnapRecord.snapRowId()) {
                String str = this.username;
                if (str != null ? !str.equals(storySnapRecord.username()) : storySnapRecord.username() != null) {
                    if (this.clientId.equals(storySnapRecord.clientId()) && this.storyRowId == storySnapRecord.storyRowId()) {
                        str = this.captionTextDisplay;
                        if (str != null ? !str.equals(storySnapRecord.captionTextDisplay()) : storySnapRecord.captionTextDisplay() != null) {
                            str = this.filterId;
                            if (str != null ? !str.equals(storySnapRecord.filterId()) : storySnapRecord.filterId() != null) {
                                str = this.thumbnailUrl;
                                if (str != null ? !str.equals(storySnapRecord.thumbnailUrl()) : storySnapRecord.thumbnailUrl() != null) {
                                    str = this.largeThumbnailUrl;
                                    if (str != null ? !str.equals(storySnapRecord.largeThumbnailUrl()) : storySnapRecord.largeThumbnailUrl() != null) {
                                        Boolean bool = this.viewed;
                                        if (bool != null ? !bool.equals(storySnapRecord.viewed()) : storySnapRecord.viewed() != null) {
                                            Long l = this.viewedTimestamp;
                                            if (l != null ? !l.equals(storySnapRecord.viewedTimestamp()) : storySnapRecord.viewedTimestamp() != null) {
                                                bool = this.isOfficialStory;
                                                if (bool != null ? !bool.equals(storySnapRecord.isOfficialStory()) : storySnapRecord.isOfficialStory() != null) {
                                                    bool = this.isPublic;
                                                    if (bool != null ? !bool.equals(storySnapRecord.isPublic()) : storySnapRecord.isPublic() != null) {
                                                        str = this.mediaD2sUrl;
                                                        if (str != null ? !str.equals(storySnapRecord.mediaD2sUrl()) : storySnapRecord.mediaD2sUrl() != null) {
                                                            if (this.needAuth == storySnapRecord.needAuth()) {
                                                                str = this.storyFilterId;
                                                                if (str != null ? !str.equals(storySnapRecord.storyFilterId()) : storySnapRecord.storyFilterId() != null) {
                                                                    str = this.thumbnailIv;
                                                                    if (str != null ? !str.equals(storySnapRecord.thumbnailIv()) : storySnapRecord.thumbnailIv() != null) {
                                                                        l = this.canonicalDisplayTime;
                                                                        if (l != null ? !l.equals(storySnapRecord.canonicalDisplayTime()) : storySnapRecord.canonicalDisplayTime() != null) {
                                                                            l = this.expirationTimestamp;
                                                                            if (l != null ? !l.equals(storySnapRecord.expirationTimestamp()) : storySnapRecord.expirationTimestamp() != null) {
                                                                                str = this.venueId;
                                                                                if (str != null ? !str.equals(storySnapRecord.venueId()) : storySnapRecord.venueId() != null) {
                                                                                    str = this.flushableId;
                                                                                    if (str != null ? !str.equals(storySnapRecord.flushableId()) : storySnapRecord.flushableId() != null) {
                                                                                        str = this.displayName;
                                                                                        if (str != null ? !str.equals(storySnapRecord.displayName()) : storySnapRecord.displayName() != null) {
                                                                                            str = this.snapAttachmentUrl;
                                                                                            if (str != null ? !str.equals(storySnapRecord.snapAttachmentUrl()) : storySnapRecord.snapAttachmentUrl() != null) {
                                                                                                str = this.contextHint;
                                                                                                if (str != null ? !str.equals(storySnapRecord.contextHint()) : storySnapRecord.contextHint() != null) {
                                                                                                    str = this.animatedSnapType;
                                                                                                    if (str != null ? !str.equals(storySnapRecord.animatedSnapType()) : storySnapRecord.animatedSnapType() != null) {
                                                                                                        str = this.lensMetadata;
                                                                                                        if (str != null ? !str.equals(storySnapRecord.lensMetadata()) : storySnapRecord.lensMetadata() != null) {
                                                                                                            str = this.filterLensId;
                                                                                                            if (str != null ? !str.equals(storySnapRecord.filterLensId()) : storySnapRecord.filterLensId() != null) {
                                                                                                                str = this.unlockablesSnapInfo;
                                                                                                                if (str != null ? !str.equals(storySnapRecord.unlockablesSnapInfo()) : storySnapRecord.unlockablesSnapInfo() != null) {
                                                                                                                    str = this.encryptedGeoLoggingData;
                                                                                                                    if (str != null ? !str.equals(storySnapRecord.encryptedGeoLoggingData()) : storySnapRecord.encryptedGeoLoggingData() != null) {
                                                                                                                        str = this.ruleFileParams;
                                                                                                                        if (str != null ? !str.equals(storySnapRecord.ruleFileParams()) : storySnapRecord.ruleFileParams() != null) {
                                                                                                                            Integer num = this.brandFriendliness;
                                                                                                                            if (num != null ? !num.equals(storySnapRecord.brandFriendliness()) : storySnapRecord.brandFriendliness() != null) {
                                                                                                                                MessageClientStatus messageClientStatus = this.clientStatus;
                                                                                                                                if (messageClientStatus != null ? !messageClientStatus.equals(storySnapRecord.clientStatus()) : storySnapRecord.clientStatus() != null) {
                                                                                                                                    num = this.friendScreenCaptureRecordingCount;
                                                                                                                                    if (num != null ? !num.equals(storySnapRecord.friendScreenCaptureRecordingCount()) : storySnapRecord.friendScreenCaptureRecordingCount() != null) {
                                                                                                                                        num = this.friendScreenCaptureShotCount;
                                                                                                                                        if (num != null ? !num.equals(storySnapRecord.friendScreenCaptureShotCount()) : storySnapRecord.friendScreenCaptureShotCount() != null) {
                                                                                                                                            num = this.friendScreenshotCount;
                                                                                                                                            if (num != null ? !num.equals(storySnapRecord.friendScreenshotCount()) : storySnapRecord.friendScreenshotCount() != null) {
                                                                                                                                                num = this.friendSnapSaveCount;
                                                                                                                                                if (num != null ? !num.equals(storySnapRecord.friendSnapSaveCount()) : storySnapRecord.friendSnapSaveCount() != null) {
                                                                                                                                                    num = this.friendViewCount;
                                                                                                                                                    if (num != null ? !num.equals(storySnapRecord.friendViewCount()) : storySnapRecord.friendViewCount() != null) {
                                                                                                                                                        num = this.otherScreenCaptureRecordingCount;
                                                                                                                                                        if (num != null ? !num.equals(storySnapRecord.otherScreenCaptureRecordingCount()) : storySnapRecord.otherScreenCaptureRecordingCount() != null) {
                                                                                                                                                            num = this.otherScreenCaptureShotCount;
                                                                                                                                                            if (num != null ? !num.equals(storySnapRecord.otherScreenCaptureShotCount()) : storySnapRecord.otherScreenCaptureShotCount() != null) {
                                                                                                                                                                num = this.otherScreenshotCount;
                                                                                                                                                                if (num != null ? !num.equals(storySnapRecord.otherScreenshotCount()) : storySnapRecord.otherScreenshotCount() != null) {
                                                                                                                                                                    num = this.otherSnapSaveCount;
                                                                                                                                                                    if (num != null ? !num.equals(storySnapRecord.otherSnapSaveCount()) : storySnapRecord.otherSnapSaveCount() != null) {
                                                                                                                                                                        num = this.otherViewCount;
                                                                                                                                                                        if (num != null ? !num.equals(storySnapRecord.otherViewCount()) : storySnapRecord.otherViewCount() != null) {
                                                                                                                                                                            bool = this.pendingServerConfirmation;
                                                                                                                                                                            if (bool != null ? !bool.equals(storySnapRecord.pendingServerConfirmation()) : storySnapRecord.pendingServerConfirmation() != null) {
                                                                                                                                                                                l = this.postedTimestamp;
                                                                                                                                                                                if (l != null ? !l.equals(storySnapRecord.postedTimestamp()) : storySnapRecord.postedTimestamp() != null) {
                                                                                                                                                                                    l = this.creationTimestamp;
                                                                                                                                                                                    if (l != null ? !l.equals(storySnapRecord.creationTimestamp()) : storySnapRecord.creationTimestamp() != null) {
                                                                                                                                                                                        num = this.snapSource;
                                                                                                                                                                                        if (num != null ? !num.equals(storySnapRecord.snapSource()) : storySnapRecord.snapSource() != null) {
                                                                                                                                                                                            str = this.creativeKitSourceAppName;
                                                                                                                                                                                            if (str != null ? !str.equals(storySnapRecord.creativeKitSourceAppName()) : storySnapRecord.creativeKitSourceAppName() != null) {
                                                                                                                                                                                                str = this.creativeKitSourceAppOAuthClientId;
                                                                                                                                                                                                if (str != null ? !str.equals(storySnapRecord.creativeKitSourceAppOAuthClientId()) : storySnapRecord.creativeKitSourceAppOAuthClientId() != null) {
                                                                                                                                                                                                    str = this.serverRankingId;
                                                                                                                                                                                                    return str != null ? !str.equals(storySnapRecord.serverRankingId()) : storySnapRecord.serverRankingId() != null;
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

    public final Integer friendScreenCaptureRecordingCount() {
        return this.friendScreenCaptureRecordingCount;
    }

    public final Integer friendScreenCaptureShotCount() {
        return this.friendScreenCaptureShotCount;
    }

    public final Integer friendScreenshotCount() {
        return this.friendScreenshotCount;
    }

    public final Integer friendSnapSaveCount() {
        return this.friendSnapSaveCount;
    }

    public final Integer friendViewCount() {
        return this.friendViewCount;
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.snapRowId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.username;
        int i2 = 0;
        i = (((i ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.clientId.hashCode()) * 1000003;
        long j3 = this.storyRowId;
        i = (i ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        String str2 = this.captionTextDisplay;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.filterId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.thumbnailUrl;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.largeThumbnailUrl;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.viewed;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.viewedTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        bool = this.isOfficialStory;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        bool = this.isPublic;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        str2 = this.mediaD2sUrl;
        i = (((i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.needAuth ? 1231 : 1237)) * 1000003;
        str2 = this.storyFilterId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.thumbnailIv;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        l = this.canonicalDisplayTime;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.expirationTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        str2 = this.venueId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.flushableId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.displayName;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.snapAttachmentUrl;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.contextHint;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.animatedSnapType;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.lensMetadata;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.filterLensId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.unlockablesSnapInfo;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.encryptedGeoLoggingData;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.ruleFileParams;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Integer num = this.brandFriendliness;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        MessageClientStatus messageClientStatus = this.clientStatus;
        i = (i ^ (messageClientStatus == null ? 0 : messageClientStatus.hashCode())) * 1000003;
        num = this.friendScreenCaptureRecordingCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.friendScreenCaptureShotCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.friendScreenshotCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.friendSnapSaveCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.friendViewCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.otherScreenCaptureRecordingCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.otherScreenCaptureShotCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.otherScreenshotCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.otherSnapSaveCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        num = this.otherViewCount;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        bool = this.pendingServerConfirmation;
        i = (i ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        l = this.postedTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.creationTimestamp;
        i = (i ^ (l == null ? 0 : l.hashCode())) * 1000003;
        num = this.snapSource;
        i = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        str2 = this.creativeKitSourceAppName;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        str2 = this.creativeKitSourceAppOAuthClientId;
        i = (i ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.serverRankingId;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i ^ i2;
    }

    public final Boolean isOfficialStory() {
        return this.isOfficialStory;
    }

    public final Boolean isPublic() {
        return this.isPublic;
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

    public final boolean needAuth() {
        return this.needAuth;
    }

    public final Integer otherScreenCaptureRecordingCount() {
        return this.otherScreenCaptureRecordingCount;
    }

    public final Integer otherScreenCaptureShotCount() {
        return this.otherScreenCaptureShotCount;
    }

    public final Integer otherScreenshotCount() {
        return this.otherScreenshotCount;
    }

    public final Integer otherSnapSaveCount() {
        return this.otherSnapSaveCount;
    }

    public final Integer otherViewCount() {
        return this.otherViewCount;
    }

    public final Boolean pendingServerConfirmation() {
        return this.pendingServerConfirmation;
    }

    public final Long postedTimestamp() {
        return this.postedTimestamp;
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

    public final long snapRowId() {
        return this.snapRowId;
    }

    public final Integer snapSource() {
        return this.snapSource;
    }

    public final String storyFilterId() {
        return this.storyFilterId;
    }

    public final long storyRowId() {
        return this.storyRowId;
    }

    public final String thumbnailIv() {
        return this.thumbnailIv;
    }

    public final String thumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StorySnapRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", snapRowId=");
        stringBuilder.append(this.snapRowId);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", storyRowId=");
        stringBuilder.append(this.storyRowId);
        stringBuilder.append(", captionTextDisplay=");
        stringBuilder.append(this.captionTextDisplay);
        stringBuilder.append(", filterId=");
        stringBuilder.append(this.filterId);
        stringBuilder.append(", thumbnailUrl=");
        stringBuilder.append(this.thumbnailUrl);
        stringBuilder.append(", largeThumbnailUrl=");
        stringBuilder.append(this.largeThumbnailUrl);
        stringBuilder.append(", viewed=");
        stringBuilder.append(this.viewed);
        stringBuilder.append(", viewedTimestamp=");
        stringBuilder.append(this.viewedTimestamp);
        stringBuilder.append(", isOfficialStory=");
        stringBuilder.append(this.isOfficialStory);
        stringBuilder.append(", isPublic=");
        stringBuilder.append(this.isPublic);
        stringBuilder.append(", mediaD2sUrl=");
        stringBuilder.append(this.mediaD2sUrl);
        stringBuilder.append(", needAuth=");
        stringBuilder.append(this.needAuth);
        stringBuilder.append(", storyFilterId=");
        stringBuilder.append(this.storyFilterId);
        stringBuilder.append(", thumbnailIv=");
        stringBuilder.append(this.thumbnailIv);
        stringBuilder.append(", canonicalDisplayTime=");
        stringBuilder.append(this.canonicalDisplayTime);
        stringBuilder.append(", expirationTimestamp=");
        stringBuilder.append(this.expirationTimestamp);
        stringBuilder.append(", venueId=");
        stringBuilder.append(this.venueId);
        stringBuilder.append(", flushableId=");
        stringBuilder.append(this.flushableId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
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
        stringBuilder.append(", clientStatus=");
        stringBuilder.append(this.clientStatus);
        stringBuilder.append(", friendScreenCaptureRecordingCount=");
        stringBuilder.append(this.friendScreenCaptureRecordingCount);
        stringBuilder.append(", friendScreenCaptureShotCount=");
        stringBuilder.append(this.friendScreenCaptureShotCount);
        stringBuilder.append(", friendScreenshotCount=");
        stringBuilder.append(this.friendScreenshotCount);
        stringBuilder.append(", friendSnapSaveCount=");
        stringBuilder.append(this.friendSnapSaveCount);
        stringBuilder.append(", friendViewCount=");
        stringBuilder.append(this.friendViewCount);
        stringBuilder.append(", otherScreenCaptureRecordingCount=");
        stringBuilder.append(this.otherScreenCaptureRecordingCount);
        stringBuilder.append(", otherScreenCaptureShotCount=");
        stringBuilder.append(this.otherScreenCaptureShotCount);
        stringBuilder.append(", otherScreenshotCount=");
        stringBuilder.append(this.otherScreenshotCount);
        stringBuilder.append(", otherSnapSaveCount=");
        stringBuilder.append(this.otherSnapSaveCount);
        stringBuilder.append(", otherViewCount=");
        stringBuilder.append(this.otherViewCount);
        stringBuilder.append(", pendingServerConfirmation=");
        stringBuilder.append(this.pendingServerConfirmation);
        stringBuilder.append(", postedTimestamp=");
        stringBuilder.append(this.postedTimestamp);
        stringBuilder.append(", creationTimestamp=");
        stringBuilder.append(this.creationTimestamp);
        stringBuilder.append(", snapSource=");
        stringBuilder.append(this.snapSource);
        stringBuilder.append(", creativeKitSourceAppName=");
        stringBuilder.append(this.creativeKitSourceAppName);
        stringBuilder.append(", creativeKitSourceAppOAuthClientId=");
        stringBuilder.append(this.creativeKitSourceAppOAuthClientId);
        stringBuilder.append(", serverRankingId=");
        stringBuilder.append(this.serverRankingId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String unlockablesSnapInfo() {
        return this.unlockablesSnapInfo;
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

    public final Long viewedTimestamp() {
        return this.viewedTimestamp;
    }
}

package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapViewReportingInfoRecord;

final class AutoValue_StorySnapRecord_SelectStorySnapViewReportingInfoRecord extends SelectStorySnapViewReportingInfoRecord {
    private final String clientId;
    private final String flushableId;
    private final FriendLinkType friendLinkType;
    private final Boolean isOfficialStory;
    private final Boolean isPublic;
    private final StoryKind kind;
    private final String snapId;
    private final String storyId;

    AutoValue_StorySnapRecord_SelectStorySnapViewReportingInfoRecord(String str, Boolean bool, Boolean bool2, String str2, String str3, StoryKind storyKind, String str4, FriendLinkType friendLinkType) {
        this.flushableId = str;
        this.isPublic = bool;
        this.isOfficialStory = bool2;
        if (str2 != null) {
            this.clientId = str2;
            if (str3 != null) {
                this.storyId = str3;
                if (storyKind != null) {
                    this.kind = storyKind;
                    if (str4 != null) {
                        this.snapId = str4;
                        this.friendLinkType = friendLinkType;
                        return;
                    }
                    throw new NullPointerException("Null snapId");
                }
                throw new NullPointerException("Null kind");
            }
            throw new NullPointerException("Null storyId");
        }
        throw new NullPointerException("Null clientId");
    }

    public final String clientId() {
        return this.clientId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectStorySnapViewReportingInfoRecord) {
            SelectStorySnapViewReportingInfoRecord selectStorySnapViewReportingInfoRecord = (SelectStorySnapViewReportingInfoRecord) obj;
            String str = this.flushableId;
            if (str != null ? !str.equals(selectStorySnapViewReportingInfoRecord.flushableId()) : selectStorySnapViewReportingInfoRecord.flushableId() != null) {
                Boolean bool = this.isPublic;
                if (bool != null ? !bool.equals(selectStorySnapViewReportingInfoRecord.isPublic()) : selectStorySnapViewReportingInfoRecord.isPublic() != null) {
                    bool = this.isOfficialStory;
                    if (bool != null ? !bool.equals(selectStorySnapViewReportingInfoRecord.isOfficialStory()) : selectStorySnapViewReportingInfoRecord.isOfficialStory() != null) {
                        if (this.clientId.equals(selectStorySnapViewReportingInfoRecord.clientId()) && this.storyId.equals(selectStorySnapViewReportingInfoRecord.storyId()) && this.kind.equals(selectStorySnapViewReportingInfoRecord.kind()) && this.snapId.equals(selectStorySnapViewReportingInfoRecord.snapId())) {
                            FriendLinkType friendLinkType = this.friendLinkType;
                            return friendLinkType != null ? !friendLinkType.equals(selectStorySnapViewReportingInfoRecord.friendLinkType()) : selectStorySnapViewReportingInfoRecord.friendLinkType() != null;
                        }
                    }
                }
            }
        }
    }

    public final String flushableId() {
        return this.flushableId;
    }

    public final FriendLinkType friendLinkType() {
        return this.friendLinkType;
    }

    public final int hashCode() {
        String str = this.flushableId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Boolean bool = this.isPublic;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        bool = this.isOfficialStory;
        hashCode = (((((((((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ this.clientId.hashCode()) * 1000003) ^ this.storyId.hashCode()) * 1000003) ^ this.kind.hashCode()) * 1000003) ^ this.snapId.hashCode()) * 1000003;
        FriendLinkType friendLinkType = this.friendLinkType;
        if (friendLinkType != null) {
            i = friendLinkType.hashCode();
        }
        return hashCode ^ i;
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

    public final String snapId() {
        return this.snapId;
    }

    public final String storyId() {
        return this.storyId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectStorySnapViewReportingInfoRecord{flushableId=");
        stringBuilder.append(this.flushableId);
        stringBuilder.append(", isPublic=");
        stringBuilder.append(this.isPublic);
        stringBuilder.append(", isOfficialStory=");
        stringBuilder.append(this.isOfficialStory);
        stringBuilder.append(", clientId=");
        stringBuilder.append(this.clientId);
        stringBuilder.append(", storyId=");
        stringBuilder.append(this.storyId);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", friendLinkType=");
        stringBuilder.append(this.friendLinkType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

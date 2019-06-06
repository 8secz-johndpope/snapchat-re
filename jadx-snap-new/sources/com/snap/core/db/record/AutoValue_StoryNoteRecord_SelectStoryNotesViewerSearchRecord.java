package com.snap.core.db.record;

import com.snap.core.db.record.StoryNoteRecord.SelectStoryNotesViewerSearchRecord;

final class AutoValue_StoryNoteRecord_SelectStoryNotesViewerSearchRecord extends SelectStoryNotesViewerSearchRecord {
    private final long _id;
    private final String friendBitmojiAvatarId;
    private final String friendBitmojiSelfieId;
    private final String friendDisplayName;
    private final String friendUserId;
    private final String friendUsername;
    private final boolean isSaved;
    private final boolean isScreenShotted;
    private final Long storyLatestTimestamp;
    private final Boolean storyMuted;
    private final Long storyRowId;
    private final Boolean storyViewed;
    private final String viewer;

    AutoValue_StoryNoteRecord_SelectStoryNotesViewerSearchRecord(long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, Boolean bool, Long l, Boolean bool2, Long l2) {
        this._id = j;
        if (str != null) {
            this.viewer = str;
            this.isScreenShotted = z;
            this.isSaved = z2;
            this.friendDisplayName = str2;
            this.friendUserId = str3;
            this.friendUsername = str4;
            this.friendBitmojiAvatarId = str5;
            this.friendBitmojiSelfieId = str6;
            this.storyMuted = bool;
            this.storyRowId = l;
            this.storyViewed = bool2;
            this.storyLatestTimestamp = l2;
            return;
        }
        throw new NullPointerException("Null viewer");
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectStoryNotesViewerSearchRecord) {
            SelectStoryNotesViewerSearchRecord selectStoryNotesViewerSearchRecord = (SelectStoryNotesViewerSearchRecord) obj;
            if (this._id == selectStoryNotesViewerSearchRecord._id() && this.viewer.equals(selectStoryNotesViewerSearchRecord.viewer()) && this.isScreenShotted == selectStoryNotesViewerSearchRecord.isScreenShotted() && this.isSaved == selectStoryNotesViewerSearchRecord.isSaved()) {
                String str = this.friendDisplayName;
                if (str != null ? !str.equals(selectStoryNotesViewerSearchRecord.friendDisplayName()) : selectStoryNotesViewerSearchRecord.friendDisplayName() != null) {
                    str = this.friendUserId;
                    if (str != null ? !str.equals(selectStoryNotesViewerSearchRecord.friendUserId()) : selectStoryNotesViewerSearchRecord.friendUserId() != null) {
                        str = this.friendUsername;
                        if (str != null ? !str.equals(selectStoryNotesViewerSearchRecord.friendUsername()) : selectStoryNotesViewerSearchRecord.friendUsername() != null) {
                            str = this.friendBitmojiAvatarId;
                            if (str != null ? !str.equals(selectStoryNotesViewerSearchRecord.friendBitmojiAvatarId()) : selectStoryNotesViewerSearchRecord.friendBitmojiAvatarId() != null) {
                                str = this.friendBitmojiSelfieId;
                                if (str != null ? !str.equals(selectStoryNotesViewerSearchRecord.friendBitmojiSelfieId()) : selectStoryNotesViewerSearchRecord.friendBitmojiSelfieId() != null) {
                                    Boolean bool = this.storyMuted;
                                    if (bool != null ? !bool.equals(selectStoryNotesViewerSearchRecord.storyMuted()) : selectStoryNotesViewerSearchRecord.storyMuted() != null) {
                                        Long l = this.storyRowId;
                                        if (l != null ? !l.equals(selectStoryNotesViewerSearchRecord.storyRowId()) : selectStoryNotesViewerSearchRecord.storyRowId() != null) {
                                            bool = this.storyViewed;
                                            if (bool != null ? !bool.equals(selectStoryNotesViewerSearchRecord.storyViewed()) : selectStoryNotesViewerSearchRecord.storyViewed() != null) {
                                                l = this.storyLatestTimestamp;
                                                return l != null ? !l.equals(selectStoryNotesViewerSearchRecord.storyLatestTimestamp()) : selectStoryNotesViewerSearchRecord.storyLatestTimestamp() != null;
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

    public final String friendBitmojiAvatarId() {
        return this.friendBitmojiAvatarId;
    }

    public final String friendBitmojiSelfieId() {
        return this.friendBitmojiSelfieId;
    }

    public final String friendDisplayName() {
        return this.friendDisplayName;
    }

    public final String friendUserId() {
        return this.friendUserId;
    }

    public final String friendUsername() {
        return this.friendUsername;
    }

    public final int hashCode() {
        long j = this._id;
        int i = 1231;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.viewer.hashCode()) * 1000003) ^ (this.isScreenShotted ? 1231 : 1237)) * 1000003;
        if (!this.isSaved) {
            i = 1237;
        }
        hashCode = (hashCode ^ i) * 1000003;
        String str = this.friendDisplayName;
        i = 0;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendUserId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendUsername;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendBitmojiAvatarId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.friendBitmojiSelfieId;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Boolean bool = this.storyMuted;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l = this.storyRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        bool = this.storyViewed;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l2 = this.storyLatestTimestamp;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final boolean isSaved() {
        return this.isSaved;
    }

    public final boolean isScreenShotted() {
        return this.isScreenShotted;
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

    public final String viewer() {
        return this.viewer;
    }
}

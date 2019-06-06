package com.snap.core.db.record;

import com.snap.core.db.column.StoryNoteType;
import com.snap.core.db.record.StoryNoteRecord.SelectStoryNotesRecord;

final class AutoValue_StoryNoteRecord_SelectStoryNotesRecord extends SelectStoryNotesRecord {
    private final Boolean isFriendViewPublic;
    private final boolean isSaved;
    private final boolean isScreenShotted;
    private final StoryNoteType noteType;
    private final Long timestamp;
    private final String viewer;

    AutoValue_StoryNoteRecord_SelectStoryNotesRecord(Long l, String str, Boolean bool, boolean z, StoryNoteType storyNoteType, boolean z2) {
        this.timestamp = l;
        if (str != null) {
            this.viewer = str;
            this.isFriendViewPublic = bool;
            this.isScreenShotted = z;
            this.noteType = storyNoteType;
            this.isSaved = z2;
            return;
        }
        throw new NullPointerException("Null viewer");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SelectStoryNotesRecord) {
            SelectStoryNotesRecord selectStoryNotesRecord = (SelectStoryNotesRecord) obj;
            Long l = this.timestamp;
            if (l != null ? !l.equals(selectStoryNotesRecord.timestamp()) : selectStoryNotesRecord.timestamp() != null) {
                if (this.viewer.equals(selectStoryNotesRecord.viewer())) {
                    Boolean bool = this.isFriendViewPublic;
                    if (bool != null ? !bool.equals(selectStoryNotesRecord.isFriendViewPublic()) : selectStoryNotesRecord.isFriendViewPublic() != null) {
                        if (this.isScreenShotted == selectStoryNotesRecord.isScreenShotted()) {
                            StoryNoteType storyNoteType = this.noteType;
                            if (storyNoteType != null ? !storyNoteType.equals(selectStoryNotesRecord.noteType()) : selectStoryNotesRecord.noteType() != null) {
                                if (this.isSaved == selectStoryNotesRecord.isSaved()) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.timestamp;
        int i = 0;
        int hashCode = ((((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003) ^ this.viewer.hashCode()) * 1000003;
        Boolean bool = this.isFriendViewPublic;
        int i2 = 1231;
        hashCode = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ (this.isScreenShotted ? 1231 : 1237)) * 1000003;
        StoryNoteType storyNoteType = this.noteType;
        if (storyNoteType != null) {
            i = storyNoteType.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        if (!this.isSaved) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    public final Boolean isFriendViewPublic() {
        return this.isFriendViewPublic;
    }

    public final boolean isSaved() {
        return this.isSaved;
    }

    public final boolean isScreenShotted() {
        return this.isScreenShotted;
    }

    public final StoryNoteType noteType() {
        return this.noteType;
    }

    public final Long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectStoryNotesRecord{timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", viewer=");
        stringBuilder.append(this.viewer);
        stringBuilder.append(", isFriendViewPublic=");
        stringBuilder.append(this.isFriendViewPublic);
        stringBuilder.append(", isScreenShotted=");
        stringBuilder.append(this.isScreenShotted);
        stringBuilder.append(", noteType=");
        stringBuilder.append(this.noteType);
        stringBuilder.append(", isSaved=");
        stringBuilder.append(this.isSaved);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String viewer() {
        return this.viewer;
    }
}

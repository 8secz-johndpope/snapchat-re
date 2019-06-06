package com.snap.core.db.record;

import com.snap.core.db.record.FeedRecord.GroupChatGroupStoryDisplayName;

final class AutoValue_FeedRecord_GroupChatGroupStoryDisplayName extends GroupChatGroupStoryDisplayName {
    private final String displayName;
    private final String mobStoryId;

    AutoValue_FeedRecord_GroupChatGroupStoryDisplayName(String str, String str2) {
        this.mobStoryId = str;
        this.displayName = str2;
    }

    public final String displayName() {
        return this.displayName;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupChatGroupStoryDisplayName) {
            GroupChatGroupStoryDisplayName groupChatGroupStoryDisplayName = (GroupChatGroupStoryDisplayName) obj;
            String str = this.mobStoryId;
            if (str != null ? !str.equals(groupChatGroupStoryDisplayName.mobStoryId()) : groupChatGroupStoryDisplayName.mobStoryId() != null) {
                str = this.displayName;
                return str != null ? !str.equals(groupChatGroupStoryDisplayName.displayName()) : groupChatGroupStoryDisplayName.displayName() != null;
            }
        }
    }

    public final int hashCode() {
        String str = this.mobStoryId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.displayName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String mobStoryId() {
        return this.mobStoryId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupChatGroupStoryDisplayName{mobStoryId=");
        stringBuilder.append(this.mobStoryId);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.displayName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

package com.snap.ui.avatar;

import defpackage.akcr;
import java.util.List;

public final class AvatarsInfo {
    private final List<Avatar> avatars;
    private final FeedStoryInfo friendStoryInfo;
    private final boolean hasActiveTyping;
    private final boolean isStillNewFriend;

    public AvatarsInfo(List<Avatar> list, FeedStoryInfo feedStoryInfo, boolean z, boolean z2) {
        akcr.b(list, "avatars");
        this.avatars = list;
        this.friendStoryInfo = feedStoryInfo;
        this.isStillNewFriend = z;
        this.hasActiveTyping = z2;
    }

    public static /* synthetic */ AvatarsInfo copy$default(AvatarsInfo avatarsInfo, List list, FeedStoryInfo feedStoryInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = avatarsInfo.avatars;
        }
        if ((i & 2) != 0) {
            feedStoryInfo = avatarsInfo.friendStoryInfo;
        }
        if ((i & 4) != 0) {
            z = avatarsInfo.isStillNewFriend;
        }
        if ((i & 8) != 0) {
            z2 = avatarsInfo.hasActiveTyping;
        }
        return avatarsInfo.copy(list, feedStoryInfo, z, z2);
    }

    public final List<Avatar> component1() {
        return this.avatars;
    }

    public final FeedStoryInfo component2() {
        return this.friendStoryInfo;
    }

    public final boolean component3() {
        return this.isStillNewFriend;
    }

    public final boolean component4() {
        return this.hasActiveTyping;
    }

    public final AvatarsInfo copy(List<Avatar> list, FeedStoryInfo feedStoryInfo, boolean z, boolean z2) {
        akcr.b(list, "avatars");
        return new AvatarsInfo(list, feedStoryInfo, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarsInfo) {
                AvatarsInfo avatarsInfo = (AvatarsInfo) obj;
                if (akcr.a(this.avatars, avatarsInfo.avatars) && akcr.a(this.friendStoryInfo, avatarsInfo.friendStoryInfo)) {
                    if ((this.isStillNewFriend == avatarsInfo.isStillNewFriend ? 1 : null) != null) {
                        if ((this.hasActiveTyping == avatarsInfo.hasActiveTyping ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<Avatar> getAvatars() {
        return this.avatars;
    }

    public final FeedStoryInfo getFriendStoryInfo() {
        return this.friendStoryInfo;
    }

    public final boolean getHasActiveTyping() {
        return this.hasActiveTyping;
    }

    public final int hashCode() {
        List list = this.avatars;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        FeedStoryInfo feedStoryInfo = this.friendStoryInfo;
        if (feedStoryInfo != null) {
            i = feedStoryInfo.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.isStillNewFriend;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.hasActiveTyping;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isStillNewFriend() {
        return this.isStillNewFriend;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AvatarsInfo(avatars=");
        stringBuilder.append(this.avatars);
        stringBuilder.append(", friendStoryInfo=");
        stringBuilder.append(this.friendStoryInfo);
        stringBuilder.append(", isStillNewFriend=");
        stringBuilder.append(this.isStillNewFriend);
        stringBuilder.append(", hasActiveTyping=");
        stringBuilder.append(this.hasActiveTyping);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

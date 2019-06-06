package com.snap.ui.avatar;

import java.util.List;

final class AvatarCache$loadFromDatabase$8 implements Runnable {
    final /* synthetic */ List $avatars;
    final /* synthetic */ long $feedId;
    final /* synthetic */ Long $lastInteractionTimestamp;
    final /* synthetic */ String $lastWriterUsername;
    final /* synthetic */ String $typingUsername;
    final /* synthetic */ AvatarCache this$0;

    AvatarCache$loadFromDatabase$8(AvatarCache avatarCache, long j, String str, String str2, List list, Long l) {
        this.this$0 = avatarCache;
        this.$feedId = j;
        this.$typingUsername = str;
        this.$lastWriterUsername = str2;
        this.$avatars = list;
        this.$lastInteractionTimestamp = l;
    }

    public final void run() {
        this.this$0.notifyObservers(this.$feedId, this.$typingUsername, this.$lastWriterUsername, this.$avatars, this.$lastInteractionTimestamp);
    }
}

package com.snap.ui.avatar;

import defpackage.zfw;

final class AvatarCache$loadAvatarsForFeed$$inlined$apply$lambda$1 implements Runnable {
    final /* synthetic */ long $feedId$inlined;
    final /* synthetic */ Long $lastInteractionTimestamp$inlined;
    final /* synthetic */ String $lastWriterUsername$inlined;
    final /* synthetic */ zfw $schedulers$inlined;
    final /* synthetic */ String $typingUsername$inlined;
    final /* synthetic */ AvatarCache this$0;

    AvatarCache$loadAvatarsForFeed$$inlined$apply$lambda$1(AvatarCache avatarCache, long j, zfw zfw, String str, String str2, Long l) {
        this.this$0 = avatarCache;
        this.$feedId$inlined = j;
        this.$schedulers$inlined = zfw;
        this.$typingUsername$inlined = str;
        this.$lastWriterUsername$inlined = str2;
        this.$lastInteractionTimestamp$inlined = l;
    }

    public final void run() {
        this.this$0.loadFromDatabase(this.$feedId$inlined, this.$typingUsername$inlined, this.$lastWriterUsername$inlined, this.$lastInteractionTimestamp$inlined, this.$schedulers$inlined.l());
    }
}

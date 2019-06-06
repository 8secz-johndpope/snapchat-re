package com.snap.ui.avatar;

import defpackage.akcr;
import defpackage.zkb.a;
import defpackage.zkb.b;

public final class AvatarDrawable$loadingStateListener$1 implements b {
    final /* synthetic */ AvatarDrawable this$0;

    AvatarDrawable$loadingStateListener$1(AvatarDrawable avatarDrawable) {
        this.this$0 = avatarDrawable;
    }

    public final void onLoadingStateChanged(a aVar) {
        akcr.b(aVar, "state");
        this.this$0.updateDrawablePositions();
        if (aVar == a.LOADED || aVar == a.FAILED) {
            AvatarDrawable avatarDrawable = this.this$0;
            avatarDrawable.avatarsLoaded = avatarDrawable.avatarsLoaded + 1;
            if (avatarDrawable.avatarsLoaded == this.this$0.avatars.size()) {
                b access$getLoadCompleteCallback$p = this.this$0.loadCompleteCallback;
                if (access$getLoadCompleteCallback$p != null) {
                    access$getLoadCompleteCallback$p.onLoadingStateChanged(a.LOADED);
                }
            }
        }
    }
}

package com.snap.ui.avatar;

import com.snapchat.android.framework.ui.animations.ArcView;
import defpackage.akbk;
import defpackage.akcs;

final class AvatarView$arcView$2 extends akcs implements akbk<ArcView> {
    final /* synthetic */ AvatarView this$0;

    AvatarView$arcView$2(AvatarView avatarView) {
        this.this$0 = avatarView;
        super(0);
    }

    public final ArcView invoke() {
        return AvatarView.access$getRendererController$p(this.this$0).archView();
    }
}

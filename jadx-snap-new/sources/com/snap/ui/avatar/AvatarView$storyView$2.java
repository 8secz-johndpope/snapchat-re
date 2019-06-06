package com.snap.ui.avatar;

import android.widget.ImageView;
import defpackage.akbk;
import defpackage.akcs;

final class AvatarView$storyView$2 extends akcs implements akbk<ImageView> {
    final /* synthetic */ AvatarView this$0;

    AvatarView$storyView$2(AvatarView avatarView) {
        this.this$0 = avatarView;
        super(0);
    }

    public final ImageView invoke() {
        return AvatarView.access$getRendererController$p(this.this$0).storyView();
    }
}

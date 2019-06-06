package com.snap.ui.avatar;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.akcr;
import defpackage.jxj.b.a;

public final class ViewBasedAvatarRendererControllerFactory implements AvatarRendererControllerFactory {
    public final AvatarRendererController newController(AvatarView avatarView, AttributeSet attributeSet, TypedArray typedArray) {
        akcr.b(avatarView, "view");
        akcr.b(typedArray, "customAttrs");
        Object context = avatarView.getContext();
        akcr.a(context, "view.context");
        SharedRenderData sharedRenderData = new SharedRenderData(context);
        sharedRenderData.setAttributes(typedArray);
        context = new a().c(sharedRenderData.ignoreMemoryOptimization()).e().b();
        akcr.a(context, "ViewBitmapLoader.Request…\n                .build()");
        RingRenderer ringRenderer = new RingRenderer(sharedRenderData);
        ringRenderer.setAttributes(typedArray);
        return new AvatarRendererController(avatarView, sharedRenderData, ringRenderer, new NewFriendEmojiRenderer(avatarView), new ArcRenderer(sharedRenderData), new StoryViewRenderer(typedArray, sharedRenderData), new StoryReplayRenderer(avatarView, typedArray, sharedRenderData), new BitmojiArmRenderer(avatarView, context), new BitmojisRenderer(sharedRenderData, avatarView, context, attributeSet));
    }
}

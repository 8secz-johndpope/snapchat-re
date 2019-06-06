package com.snap.ui.avatar;

import android.content.res.TypedArray;
import android.widget.FrameLayout.LayoutParams;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.akcr;

public final class StoryReplayRenderer {
    private final AvatarView parentView;
    private SnapImageView storyReplayView;
    private final int storyReplayViewPadding;
    private int storyReplayViewResourceId;

    public StoryReplayRenderer(AvatarView avatarView, TypedArray typedArray, SharedRenderData sharedRenderData) {
        akcr.b(avatarView, "parentView");
        akcr.b(typedArray, "customAttrs");
        akcr.b(sharedRenderData, "sharedRenderData");
        this.parentView = avatarView;
        this.storyReplayViewPadding = typedArray.getDimensionPixelOffset(8, sharedRenderData.getDefaultImagePadding());
        this.storyReplayViewResourceId = typedArray.getResourceId(9, R.drawable.grey_replay_icon);
    }

    public final void hide() {
        SnapImageView snapImageView = this.storyReplayView;
        if (snapImageView != null) {
            snapImageView.setVisibility(4);
        }
    }

    public final void recycle() {
        SnapImageView snapImageView = this.storyReplayView;
        if (snapImageView != null) {
            snapImageView.clear();
            this.storyReplayView = null;
        }
    }

    public final void setReplayBackground(int i) {
        this.storyReplayViewResourceId = i;
    }

    public final void show() {
        SnapImageView snapImageView = this.storyReplayView;
        if (snapImageView == null) {
            Object context = this.parentView.getContext();
            akcr.a(context, "parentView.context");
            SnapImageView snapImageView2 = new SnapImageView(context, null, 0, null, 14, null);
            snapImageView2.setId(R.id.avatar_story_replay);
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            int i = this.storyReplayViewPadding;
            layoutParams.setMargins(-i, -i, -i, -i);
            snapImageView2.setLayoutParams(layoutParams);
            snapImageView2.setImageResource(this.storyReplayViewResourceId);
            this.parentView.addView(snapImageView2);
            this.storyReplayView = snapImageView2;
        }
        snapImageView.setVisibility(0);
    }
}

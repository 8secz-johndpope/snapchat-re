package com.snap.ui.avatar;

import android.widget.FrameLayout.LayoutParams;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.animations.ArcView;
import defpackage.akcr;

public final class ArcRenderer {
    private final ArcView arcView = new ArcView(this.sharedRenderData.getContext());
    private final SharedRenderData sharedRenderData;

    public ArcRenderer(SharedRenderData sharedRenderData) {
        akcr.b(sharedRenderData, "sharedRenderData");
        this.sharedRenderData = sharedRenderData;
        this.arcView.setId(R.id.avatar_arc);
        this.arcView.a(this.sharedRenderData.getResources().getColor(R.color.regular_blue));
        this.arcView.setLayoutParams(new LayoutParams(-1, -1));
        this.arcView.setVisibility(8);
    }

    public final void addTo(AvatarView avatarView) {
        akcr.b(avatarView, "parentView");
        avatarView.addView(this.arcView);
    }

    public final ArcView archView() {
        return this.arcView;
    }

    public final void hide() {
        this.arcView.setVisibility(8);
    }

    public final void show() {
        this.arcView.setVisibility(0);
    }
}

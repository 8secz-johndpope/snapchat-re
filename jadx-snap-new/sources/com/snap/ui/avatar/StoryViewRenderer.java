package com.snap.ui.avatar;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.akcr;
import defpackage.idl;
import defpackage.jxj;
import defpackage.jxj.b.a;

public final class StoryViewRenderer {
    private int emptyStoryViewResourceId;
    private final SnapImageView storyView;

    public StoryViewRenderer(TypedArray typedArray, SharedRenderData sharedRenderData) {
        akcr.b(typedArray, "customAttrs");
        akcr.b(sharedRenderData, "sharedRenderData");
        this.storyView = new SnapImageView(sharedRenderData.getContext(), null, 0, null, 14, null);
        this.emptyStoryViewResourceId = typedArray.getResourceId(1, R.drawable.empty_custom_story);
        SnapImageView snapImageView = this.storyView;
        Object f = new a().d(true).a((int) R.color.loading_gray).c(sharedRenderData.ignoreMemoryOptimization()).b();
        akcr.a(f, "ViewBitmapLoader.Request…\n                .build()");
        snapImageView.setRequestOptions(f);
        this.storyView.setId(R.id.avatar_story);
        this.storyView.setLayoutParams(new LayoutParams(-1, -1));
        this.storyView.setScaleType(ScaleType.CENTER_CROP);
    }

    public final void addTo(AvatarView avatarView) {
        akcr.b(avatarView, "parentView");
        avatarView.addView(this.storyView);
    }

    public final void hide() {
        this.storyView.setVisibility(4);
    }

    public final void recycle() {
        this.storyView.clear();
    }

    public final void setDrawable(Drawable drawable) {
        this.storyView.setImageDrawable(drawable);
    }

    public final void setEmptyStoryImageResource() {
        this.storyView.setImageResource(this.emptyStoryViewResourceId);
    }

    public final void setImageUri(Uri uri, idl idl) {
        akcr.b(uri, "thumbnailUri");
        akcr.b(idl, "uiPage");
        this.storyView.setImageUri(uri, idl);
    }

    public final void setStoryThumbnailRequestListener(jxj.a aVar) {
        akcr.b(aVar, "requestListener");
        this.storyView.setRequestListener(aVar);
    }

    public final void show() {
        this.storyView.setVisibility(0);
    }

    public final SnapImageView storyView() {
        return this.storyView;
    }
}

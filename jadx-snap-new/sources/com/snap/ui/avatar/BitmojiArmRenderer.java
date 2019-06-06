package com.snap.ui.avatar;

import android.net.Uri;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.akcr;
import defpackage.idl;
import defpackage.jxj.b;

public final class BitmojiArmRenderer {
    private SnapImageView bitmojiArmView;
    private final int bitmojiArmWidth = ((int) abtp.a(16.0f, this.parentView.getContext()));
    private final AvatarView parentView;
    private final b requestOptions;

    public BitmojiArmRenderer(AvatarView avatarView, b bVar) {
        akcr.b(avatarView, "parentView");
        akcr.b(bVar, "requestOptions");
        this.parentView = avatarView;
        this.requestOptions = bVar;
    }

    private final SnapImageView getOrCreateBitmojiArmView() {
        SnapImageView snapImageView = this.bitmojiArmView;
        if (snapImageView != null) {
            return snapImageView;
        }
        Object context = this.parentView.getContext();
        akcr.a(context, "parentView.context");
        SnapImageView snapImageView2 = new SnapImageView(context, null, 0, null, 14, null);
        snapImageView2.setId(R.id.avatar_arm);
        LayoutParams layoutParams = new LayoutParams(this.bitmojiArmWidth, -1);
        layoutParams.gravity = 1;
        snapImageView2.setScaleType(ScaleType.FIT_END);
        snapImageView2.setLayoutParams(layoutParams);
        snapImageView2.setRequestOptions(this.requestOptions);
        this.bitmojiArmView = snapImageView2;
        this.parentView.addView(snapImageView2);
        return snapImageView2;
    }

    public final void clearArm() {
        SnapImageView snapImageView = this.bitmojiArmView;
        if (snapImageView != null) {
            snapImageView.clear();
        }
    }

    public final void hide() {
        SnapImageView snapImageView = this.bitmojiArmView;
        if (snapImageView != null) {
            snapImageView.setVisibility(4);
        }
    }

    public final void recycle() {
        if (this.bitmojiArmView != null) {
            clearArm();
            this.bitmojiArmView = null;
        }
    }

    public final void setArm(Uri uri, idl idl) {
        akcr.b(uri, "bitmojiArmUri");
        akcr.b(idl, "uiPage");
        SnapImageView orCreateBitmojiArmView = getOrCreateBitmojiArmView();
        if ((akcr.a((Object) uri, orCreateBitmojiArmView.getImageUri()) ^ 1) != 0) {
            orCreateBitmojiArmView.setImageUri(uri, idl);
        }
    }

    public final void setForSize(float f, float f2, int i) {
        if (i != 0) {
            SnapImageView orCreateBitmojiArmView = getOrCreateBitmojiArmView();
            if (i == 1) {
                orCreateBitmojiArmView.setScaleX(1.0f);
                orCreateBitmojiArmView.setScaleY(1.0f);
                orCreateBitmojiArmView.setTranslationX(f * 0.05f);
            } else if (i != 2) {
                if (i == 3) {
                    orCreateBitmojiArmView.setScaleX(0.75f);
                    orCreateBitmojiArmView.setScaleY(0.75f);
                    orCreateBitmojiArmView.setTranslationX(f * 0.05f);
                    orCreateBitmojiArmView.setTranslationY(f2 * 0.18f);
                }
                return;
            } else {
                orCreateBitmojiArmView.setScaleX(0.75f);
                orCreateBitmojiArmView.setScaleY(0.75f);
                orCreateBitmojiArmView.setTranslationX((((0.29300004f * f) / 2.0f) * 0.92999995f) + (f * 0.05f));
            }
            orCreateBitmojiArmView.setTranslationY(f2 * 0.18f);
        }
    }

    public final void show() {
        getOrCreateBitmojiArmView().setVisibility(0);
    }
}

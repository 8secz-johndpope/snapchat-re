package com.snap.ui.avatar;

import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.bitmoji.view.BitmojiSilhouetteView;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.ajyu;
import defpackage.akcr;
import defpackage.idl;
import defpackage.jxj.b;
import java.util.List;

public final class BitmojisRenderer {
    private final BitmojiSilhouetteView[] bitmojiViews;
    private final float groupTypingTranslationY;
    private final SharedRenderData sharedRenderData;
    private final float singleTypingTranslationY;

    public BitmojisRenderer(SharedRenderData sharedRenderData, AvatarView avatarView, b bVar, AttributeSet attributeSet) {
        akcr.b(sharedRenderData, "sharedRenderData");
        akcr.b(avatarView, "parentView");
        akcr.b(bVar, "bitmojiRequestOptions");
        this.sharedRenderData = sharedRenderData;
        this.singleTypingTranslationY = abtp.a(10.0f, avatarView.getContext());
        this.groupTypingTranslationY = abtp.a(5.0f, avatarView.getContext());
        BitmojiSilhouetteView bitmojiSilhouetteView = new BitmojiSilhouetteView(avatarView.getContext(), attributeSet);
        bitmojiSilhouetteView.setRequestOptions(bVar);
        bitmojiSilhouetteView.setId(R.id.avatar_silhouette_1);
        bitmojiSilhouetteView.setLayoutParams(new LayoutParams(-1, -1));
        bitmojiSilhouetteView.setAlpha(0.3f);
        bitmojiSilhouetteView.setBackgroundColor(avatarView.getResources().getColor(R.color.transparent));
        BitmojiSilhouetteView bitmojiSilhouetteView2 = new BitmojiSilhouetteView(avatarView.getContext(), attributeSet);
        bitmojiSilhouetteView2.setRequestOptions(bVar);
        bitmojiSilhouetteView2.setId(R.id.avatar_silhouette_2);
        bitmojiSilhouetteView2.setLayoutParams(new LayoutParams(-1, -1));
        bitmojiSilhouetteView2.setAlpha(0.3f);
        bitmojiSilhouetteView2.setBackgroundColor(avatarView.getResources().getColor(R.color.transparent));
        BitmojiSilhouetteView bitmojiSilhouetteView3 = new BitmojiSilhouetteView(avatarView.getContext(), attributeSet);
        bitmojiSilhouetteView3.setRequestOptions(bVar);
        bitmojiSilhouetteView3.setId(R.id.avatar_silhouette_3);
        bitmojiSilhouetteView3.setLayoutParams(new LayoutParams(-1, -1));
        bitmojiSilhouetteView3.setBackgroundColor(avatarView.getResources().getColor(R.color.transparent));
        this.bitmojiViews = new BitmojiSilhouetteView[]{bitmojiSilhouetteView3, bitmojiSilhouetteView, bitmojiSilhouetteView2};
    }

    public final void addTo(AvatarView avatarView) {
        akcr.b(avatarView, "view");
        avatarView.addView(this.bitmojiViews[1]);
        avatarView.addView(this.bitmojiViews[2]);
        avatarView.addView(this.bitmojiViews[0]);
    }

    public final void hide() {
        for (BitmojiSilhouetteView visibility : this.bitmojiViews) {
            visibility.setVisibility(4);
        }
    }

    public final void recycle() {
        for (BitmojiSilhouetteView clear : this.bitmojiViews) {
            clear.clear();
        }
    }

    public final void resetPivots() {
        float centerX = this.sharedRenderData.getDrawRectF().centerX();
        float imagePaddingBottom = this.sharedRenderData.getDrawRectF().bottom - ((float) this.sharedRenderData.imagePaddingBottom());
        for (BitmojiSilhouetteView bitmojiSilhouetteView : this.bitmojiViews) {
            bitmojiSilhouetteView.setPivotX(centerX);
            bitmojiSilhouetteView.setPivotY(imagePaddingBottom);
        }
    }

    public final void setAvatars(List<Avatar> list, idl idl) {
        akcr.b(list, "avatars");
        BitmojiSilhouetteView[] bitmojiSilhouetteViewArr = this.bitmojiViews;
        int length = bitmojiSilhouetteViewArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            BitmojiSilhouetteView bitmojiSilhouetteView = bitmojiSilhouetteViewArr[i];
            int i3 = i2 + 1;
            Avatar avatar = (Avatar) ajyu.a((List) list, i2);
            if (avatar != null) {
                bitmojiSilhouetteView.a(avatar.getUsername(), avatar.getBitmojiUri(), avatar.getFallbackColor(), idl);
                if (avatar != null) {
                    i++;
                    i2 = i3;
                }
            }
            bitmojiSilhouetteView.a();
            i++;
            i2 = i3;
        }
    }

    public final void setForSize(boolean z, int i, float f, float f2) {
        float f3 = MapboxConstants.MINIMUM_ZOOM;
        BitmojiSilhouetteView bitmojiSilhouetteView;
        float f4;
        if (i == 1) {
            bitmojiSilhouetteView = this.bitmojiViews[0];
            if (z) {
                bitmojiSilhouetteView.setScaleX(1.15f);
                bitmojiSilhouetteView.setScaleY(1.15f);
                bitmojiSilhouetteView.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                bitmojiSilhouetteView.setTranslationY(this.singleTypingTranslationY);
                return;
            }
            bitmojiSilhouetteView.setScaleX(1.0f);
            bitmojiSilhouetteView.setScaleY(1.0f);
            bitmojiSilhouetteView.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
            bitmojiSilhouetteView.setTranslationY((-f2) * -0.02f);
        } else if (i != 2) {
            if (i == 3) {
                bitmojiSilhouetteView = this.bitmojiViews[0];
                bitmojiSilhouetteView.setTranslationX(MapboxConstants.MINIMUM_ZOOM);
                if (z) {
                    f3 = this.groupTypingTranslationY;
                }
                f4 = -f2;
                bitmojiSilhouetteView.setTranslationY((-0.02f * f4) + f3);
                bitmojiSilhouetteView.setScaleX(1.01f);
                bitmojiSilhouetteView.setScaleY(1.01f);
                bitmojiSilhouetteView = this.bitmojiViews[1];
                bitmojiSilhouetteView.setTranslationX(((-f) * 0.68f) / 2.0f);
                f4 *= 0.02f;
                bitmojiSilhouetteView.setTranslationY(f4);
                bitmojiSilhouetteView.setScaleX(0.83f);
                bitmojiSilhouetteView.setScaleY(0.83f);
                bitmojiSilhouetteView = this.bitmojiViews[2];
                bitmojiSilhouetteView.setTranslationX((f * 0.68f) / 2.0f);
                bitmojiSilhouetteView.setTranslationY(f4);
                bitmojiSilhouetteView.setScaleX(0.83f);
                bitmojiSilhouetteView.setScaleY(0.83f);
            }
        } else {
            bitmojiSilhouetteView = this.bitmojiViews[0];
            bitmojiSilhouetteView.setTranslationX(((0.29300004f * f) / 2.0f) * 0.92999995f);
            if (z) {
                f3 = this.groupTypingTranslationY;
            }
            f4 = -f2;
            bitmojiSilhouetteView.setTranslationY((-0.02f * f4) + f3);
            bitmojiSilhouetteView.setScaleX(1.01f);
            bitmojiSilhouetteView.setScaleY(1.01f);
            bitmojiSilhouetteView = this.bitmojiViews[1];
            bitmojiSilhouetteView.setTranslationX(((-f) * 0.41900003f) / 2.0f);
            bitmojiSilhouetteView.setTranslationY(f4 * 0.02f);
            bitmojiSilhouetteView.setScaleX(0.83f);
            bitmojiSilhouetteView.setScaleY(0.83f);
        }
    }

    public final void showSize(int i) {
        int i2 = 0;
        this.bitmojiViews[0].setVisibility(0);
        BitmojiSilhouetteView bitmojiSilhouetteView = this.bitmojiViews[1];
        int i3 = (i == 0 || i > 1) ? 0 : 4;
        bitmojiSilhouetteView.setVisibility(i3);
        bitmojiSilhouetteView = this.bitmojiViews[2];
        if (i != 0 && i <= 2) {
            i2 = 4;
        }
        bitmojiSilhouetteView.setVisibility(i2);
    }
}

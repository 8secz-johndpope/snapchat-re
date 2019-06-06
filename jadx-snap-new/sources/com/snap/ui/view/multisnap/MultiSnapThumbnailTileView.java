package com.snap.ui.view.multisnap;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.imageloading.view.SnapImageView;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.jwj;
import defpackage.jxj.b;
import defpackage.kaz;

public final class MultiSnapThumbnailTileView extends SnapImageView {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(MultiSnapThumbnailTileView.class), "accelerateInterpolator", "getAccelerateInterpolator()Landroid/view/animation/AccelerateInterpolator;"), new akdc(akde.a(MultiSnapThumbnailTileView.class), "decelerateInterpolator", "getDecelerateInterpolator()Landroid/view/animation/DecelerateInterpolator;"), new akdc(akde.a(MultiSnapThumbnailTileView.class), "allCornersRequestOptions", "getAllCornersRequestOptions()Lcom/snap/imageloading/api/ViewBitmapLoader$RequestOptions;")};
    private final ajxe accelerateInterpolator$delegate = ajxh.a(MultiSnapThumbnailTileView$accelerateInterpolator$2.INSTANCE);
    private final ajxe allCornersRequestOptions$delegate = ajxh.a(new MultiSnapThumbnailTileView$allCornersRequestOptions$2(this));
    private kaz<jwj> bitmap;
    private final ajxe decelerateInterpolator$delegate = ajxh.a(MultiSnapThumbnailTileView$decelerateInterpolator$2.INSTANCE);
    private boolean isActive = true;
    private Animation prevAnimation;
    private final float radius;
    private final boolean shouldEnableAnimation;
    private final int thumbnailWidth;
    private Integer timestamp = Integer.valueOf(0);

    public MultiSnapThumbnailTileView(Context context, int i, int i2, float f) {
        akcr.b(context, "context");
        super(context, null, 0, null, 14, null);
        this.thumbnailWidth = i;
        this.radius = f;
        LayoutParams layoutParams = new LayoutParams(this.thumbnailWidth, i2);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        setScaleType(ScaleType.FIT_XY);
        setVisibility(4);
        this.timestamp = null;
    }

    private final void animateX(boolean z, int i) {
        Animation animation = this.prevAnimation;
        if (animation != null) {
            animation.cancel();
        }
        int i2 = 0;
        if (z) {
            setVisibility(0);
        } else {
            Object allCornersRequestOptions = getAllCornersRequestOptions();
            akcr.a(allCornersRequestOptions, "allCornersRequestOptions");
            setRequestOptionsAndReload(allCornersRequestOptions);
        }
        float f = (float) (z ? (-this.thumbnailWidth) * i : 0);
        if (!z) {
            i2 = (-this.thumbnailWidth) * i;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, (float) i2, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        translateAnimation.setDuration(300);
        translateAnimation.setInterpolator(z ? getAccelerateInterpolator() : getDecelerateInterpolator());
        translateAnimation.setAnimationListener(new MultiSnapThumbnailTileView$animateX$$inlined$apply$lambda$1(this, z));
        this.prevAnimation = translateAnimation;
        startAnimation(this.prevAnimation);
    }

    private final AccelerateInterpolator getAccelerateInterpolator() {
        return (AccelerateInterpolator) this.accelerateInterpolator$delegate.b();
    }

    private final b getAllCornersRequestOptions() {
        return (b) this.allCornersRequestOptions$delegate.b();
    }

    private final DecelerateInterpolator getDecelerateInterpolator() {
        return (DecelerateInterpolator) this.decelerateInterpolator$delegate.b();
    }

    public final void dispose() {
        clear();
        kaz kaz = this.bitmap;
        if (kaz != null) {
            kaz.dispose();
        }
    }

    public final Integer getTimestamp() {
        return this.timestamp;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setImage(kaz<jwj> kaz) {
        Bitmap a;
        kaz kaz2 = this.bitmap;
        this.bitmap = kaz.a((kaz) kaz, "MultiSnapThumbnailTileView");
        kaz kaz3 = this.bitmap;
        if (kaz3 != null) {
            jwj jwj = (jwj) kaz3.a();
            if (jwj != null) {
                a = jwj.a();
                setImageBitmap(a);
                kaz.b(kaz2);
            }
        }
        a = null;
        setImageBitmap(a);
        kaz.b(kaz2);
    }

    public final void setRequestOptionsAndReload(b bVar) {
        akcr.b(bVar, "requestOptions");
        setRequestOptions(bVar);
        setImageDrawable(getDrawable());
    }

    public final void setTimestamp(Integer num) {
        this.timestamp = num;
    }

    public final void setVisibility(int i, boolean z, int i2) {
        boolean z2 = true;
        this.isActive = i == 0;
        if (this.prevAnimation != null || getVisibility() != i) {
            if (z && this.shouldEnableAnimation) {
                if (i != 0) {
                    z2 = false;
                }
                animateX(z2, i2);
                return;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                ((LayoutParams) layoutParams).setMargins(i == 0 ? 0 : (-this.thumbnailWidth) + 1, 0, 0, 0);
                setVisibility(i);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }
}

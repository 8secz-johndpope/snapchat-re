package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.ly.a;
import defpackage.ob;
import defpackage.oc;
import defpackage.od;
import defpackage.oe;
import defpackage.of;

public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = new int[]{16842801};
    private static final of IMPL;
    private final oe mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    static {
        of ocVar = VERSION.SDK_INT >= 21 ? new oc() : VERSION.SDK_INT >= 17 ? new ob() : new od();
        IMPL = ocVar;
        IMPL.a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int i2;
        super(context, attributeSet, i);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new oe() {
            private Drawable a;

            public final void a(int i, int i2) {
                if (i > CardView.this.mUserSetMinWidth) {
                    super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.mUserSetMinHeight) {
                    super.setMinimumHeight(i2);
                }
            }

            public final void a(int i, int i2, int i3, int i4) {
                CardView.this.mShadowBounds.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                super.setPadding(i + cardView.mContentPadding.left, i2 + CardView.this.mContentPadding.top, i3 + CardView.this.mContentPadding.right, i4 + CardView.this.mContentPadding.bottom);
            }

            public final void a(Drawable drawable) {
                this.a = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            public final boolean a() {
                return CardView.this.getUseCompatPadding();
            }

            public final boolean b() {
                return CardView.this.getPreventCornerOverlap();
            }

            public final Drawable c() {
                return this.a;
            }

            public final View d() {
                return CardView.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            Resources resources;
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i2 = R.color.cardview_dark_background;
            }
            colorStateList = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList2 = colorStateList;
        float dimension = obtainStyledAttributes.getDimension(3, MapboxConstants.MINIMUM_ZOOM);
        float dimension2 = obtainStyledAttributes.getDimension(4, MapboxConstants.MINIMUM_ZOOM);
        float dimension3 = obtainStyledAttributes.getDimension(5, MapboxConstants.MINIMUM_ZOOM);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(7, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(6, true);
        i2 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.mContentPadding.left = obtainStyledAttributes.getDimensionPixelSize(10, i2);
        this.mContentPadding.top = obtainStyledAttributes.getDimensionPixelSize(12, i2);
        this.mContentPadding.right = obtainStyledAttributes.getDimensionPixelSize(11, i2);
        this.mContentPadding.bottom = obtainStyledAttributes.getDimensionPixelSize(9, i2);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        IMPL.a(this.mCardViewDelegate, context, colorStateList2, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.i(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.e(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.a(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.d(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (IMPL instanceof oc) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == AudioPlayer.INFINITY_LOOP_COUNT) {
            i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) IMPL.b(this.mCardViewDelegate)), MeasureSpec.getSize(i)), mode);
        }
        mode = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == AudioPlayer.INFINITY_LOOP_COUNT) {
            i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) IMPL.c(this.mCardViewDelegate)), MeasureSpec.getSize(i2)), mode);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.a(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.a(this.mCardViewDelegate, colorStateList);
    }

    public void setCardElevation(float f) {
        IMPL.c(this.mCardViewDelegate, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.f(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.b(this.mCardViewDelegate, f);
    }

    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.h(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.a(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.g(this.mCardViewDelegate);
        }
    }
}

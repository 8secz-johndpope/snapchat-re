package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.la;
import defpackage.lx.a;
import defpackage.ma;
import defpackage.ot;

public class AppCompatImageHelper {
    private ot mImageTint;
    private ot mInternalImageTint;
    private ot mTmpInfo;
    private final ImageView mView;

    public AppCompatImageHelper(ImageView imageView) {
        this.mView = imageView;
    }

    private boolean applyFrameworkTintUsingColorFilter(Drawable drawable) {
        if (this.mTmpInfo == null) {
            this.mTmpInfo = new ot();
        }
        ot otVar = this.mTmpInfo;
        otVar.a();
        ColorStateList a = la.a(this.mView);
        if (a != null) {
            otVar.d = true;
            otVar.a = a;
        }
        Mode b = la.a.b(this.mView);
        if (b != null) {
            otVar.c = true;
            otVar.b = b;
        }
        if (!otVar.d && !otVar.c) {
            return false;
        }
        AppCompatDrawableManager.tintDrawable(drawable, otVar, this.mView.getDrawableState());
        return true;
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        int i = VERSION.SDK_INT;
        return i > 21 ? this.mInternalImageTint != null : i == 21;
    }

    /* Access modifiers changed, original: 0000 */
    public void applySupportImageTint() {
        Drawable drawable = this.mView.getDrawable();
        if (drawable != null) {
            DrawableUtils.fixDrawable(drawable);
        }
        if (drawable != null && (!shouldApplyFrameworkTintUsingColorFilter() || !applyFrameworkTintUsingColorFilter(drawable))) {
            ot otVar = this.mImageTint;
            if (otVar != null) {
                AppCompatDrawableManager.tintDrawable(drawable, otVar, this.mView.getDrawableState());
                return;
            }
            otVar = this.mInternalImageTint;
            if (otVar != null) {
                AppCompatDrawableManager.tintDrawable(drawable, otVar, this.mView.getDrawableState());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public ColorStateList getSupportImageTintList() {
        ot otVar = this.mImageTint;
        return otVar != null ? otVar.a : null;
    }

    /* Access modifiers changed, original: 0000 */
    public Mode getSupportImageTintMode() {
        ot otVar = this.mImageTint;
        return otVar != null ? otVar.b : null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean hasOverlappingRendering() {
        return VERSION.SDK_INT < 21 || !(this.mView.getBackground() instanceof RippleDrawable);
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, a.g, i, 0);
        try {
            Drawable drawable = this.mView.getDrawable();
            if (drawable == null) {
                int resourceId = obtainStyledAttributes.getResourceId(1, -1);
                if (resourceId != -1) {
                    drawable = ma.b(this.mView.getContext(), resourceId);
                    if (drawable != null) {
                        this.mView.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            if (obtainStyledAttributes.hasValue(2)) {
                la.a(this.mView, obtainStyledAttributes.getColorStateList(2));
            }
            if (obtainStyledAttributes.hasValue(3)) {
                la.a(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(3, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public void setImageResource(int i) {
        if (i != 0) {
            Drawable b = ma.b(this.mView.getContext(), i);
            if (b != null) {
                DrawableUtils.fixDrawable(b);
            }
            this.mView.setImageDrawable(b);
        } else {
            this.mView.setImageDrawable(null);
        }
        applySupportImageTint();
    }

    /* Access modifiers changed, original: 0000 */
    public void setInternalImageTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.mInternalImageTint == null) {
                this.mInternalImageTint = new ot();
            }
            ot otVar = this.mInternalImageTint;
            otVar.a = colorStateList;
            otVar.d = true;
        } else {
            this.mInternalImageTint = null;
        }
        applySupportImageTint();
    }

    /* Access modifiers changed, original: 0000 */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.mImageTint == null) {
            this.mImageTint = new ot();
        }
        ot otVar = this.mImageTint;
        otVar.a = colorStateList;
        otVar.d = true;
        applySupportImageTint();
    }

    /* Access modifiers changed, original: 0000 */
    public void setSupportImageTintMode(Mode mode) {
        if (this.mImageTint == null) {
            this.mImageTint = new ot();
        }
        ot otVar = this.mImageTint;
        otVar.b = mode;
        otVar.c = true;
        applySupportImageTint();
    }
}

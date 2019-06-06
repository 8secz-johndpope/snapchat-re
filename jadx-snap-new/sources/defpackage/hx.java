package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: hx */
class hx extends Drawable implements Callback, hv, hw {
    static final Mode a = Mode.SRC_IN;
    a b;
    Drawable c;
    private int d;
    private Mode e;
    private boolean f;
    private boolean g;

    /* renamed from: hx$a */
    public static abstract class a extends ConstantState {
        int a;
        ConstantState b;
        ColorStateList c = null;
        Mode d = hx.a;

        a(a aVar) {
            if (aVar != null) {
                this.a = aVar.a;
                this.b = aVar.b;
                this.c = aVar.c;
                this.d = aVar.d;
            }
        }

        public int getChangingConfigurations() {
            int i = this.a;
            ConstantState constantState = this.b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: hx$b */
    static class b extends a {
        b(a aVar) {
            super(aVar);
        }

        public final Drawable newDrawable(Resources resources) {
            return new hx(this, resources);
        }
    }

    hx(Drawable drawable) {
        this.b = b();
        a(drawable);
    }

    hx(a aVar, Resources resources) {
        this.b = aVar;
        aVar = this.b;
        if (aVar != null && aVar.b != null) {
            a(this.b.b.newDrawable(resources));
        }
    }

    private boolean a(int[] iArr) {
        if (!c()) {
            return false;
        }
        ColorStateList colorStateList = this.b.c;
        Mode mode = this.b.d;
        if (colorStateList == null || mode == null) {
            this.f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f && colorForState == this.d && mode == this.e)) {
                setColorFilter(colorForState, mode);
                this.d = colorForState;
                this.e = mode;
                this.f = true;
                return true;
            }
        }
        return false;
    }

    public final Drawable a() {
        return this.c;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            a aVar = this.b;
            if (aVar != null) {
                aVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* Access modifiers changed, original: 0000 */
    public a b() {
        return new b(this.b);
    }

    /* Access modifiers changed, original: protected */
    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.b;
        return (changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0)) | this.c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        a aVar = this.b;
        if (aVar != null) {
            if ((aVar.b != null ? 1 : null) != null) {
                this.b.a = getChangingConfigurations();
                return this.b;
            }
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    public int[] getState() {
        return this.c.getState();
    }

    public Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (c()) {
            a aVar = this.b;
            if (aVar != null) {
                colorStateList = aVar.c;
                return (colorStateList == null && colorStateList.isStateful()) || this.c.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.g && super.mutate() == this) {
            this.b = b();
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.b;
            if (aVar != null) {
                Drawable drawable2 = this.c;
                aVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.g = true;
        }
        return this;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.b.c = colorStateList;
        a(getState());
    }

    public void setTintMode(Mode mode) {
        this.b.d = mode;
        a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

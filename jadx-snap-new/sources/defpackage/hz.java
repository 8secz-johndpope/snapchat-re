package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import defpackage.hx.a;
import java.lang.reflect.Method;

/* renamed from: hz */
final class hz extends hy {
    private static Method d;

    /* renamed from: hz$a */
    static class a extends defpackage.hx.a {
        a(defpackage.hx.a aVar) {
            super(aVar);
        }

        public final Drawable newDrawable(Resources resources) {
            return new hz(this, resources);
        }
    }

    hz(Drawable drawable) {
        super(drawable);
        hz.d();
    }

    hz(a aVar, Resources resources) {
        super(aVar, resources);
        hz.d();
    }

    private static void d() {
        if (d == null) {
            try {
                d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final a b() {
        return new a(this.b);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final Rect getDirtyBounds() {
        return this.c.getDirtyBounds();
    }

    public final void getOutline(Outline outline) {
        this.c.getOutline(outline);
    }

    public final void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.c.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.c.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.c.setTintMode(mode);
        }
    }
}

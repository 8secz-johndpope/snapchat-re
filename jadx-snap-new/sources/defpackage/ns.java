package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.lx.a;

/* renamed from: ns */
public final class ns {
    private final View a;
    private final AppCompatDrawableManager b;
    private int c = -1;
    private ot d;
    private ot e;
    private ot f;

    public ns(View view) {
        this.a = view;
        this.b = AppCompatDrawableManager.get();
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new ot();
        }
        ot otVar = this.f;
        otVar.a();
        ColorStateList x = kb.a.x(this.a);
        if (x != null) {
            otVar.d = true;
            otVar.a = x;
        }
        Mode y = kb.a.y(this.a);
        if (y != null) {
            otVar.c = true;
            otVar.b = y;
        }
        if (!otVar.d && !otVar.c) {
            return false;
        }
        AppCompatDrawableManager.tintDrawable(drawable, otVar, this.a.getDrawableState());
        return true;
    }

    private void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new ot();
            }
            ot otVar = this.d;
            otVar.a = colorStateList;
            otVar.d = true;
        } else {
            this.d = null;
        }
        d();
    }

    private boolean e() {
        int i = VERSION.SDK_INT;
        return i > 21 ? this.d != null : i == 21;
    }

    public final void a() {
        this.c = -1;
        b(null);
        d();
    }

    public final void a(int i) {
        this.c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.b;
        b(appCompatDrawableManager != null ? appCompatDrawableManager.getTintList(this.a.getContext(), i) : null);
        d();
    }

    public final void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new ot();
        }
        ot otVar = this.e;
        otVar.a = colorStateList;
        otVar.d = true;
        d();
    }

    public final void a(Mode mode) {
        if (this.e == null) {
            this.e = new ot();
        }
        ot otVar = this.e;
        otVar.b = mode;
        otVar.c = true;
        d();
    }

    public final void a(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.a.getContext(), attributeSet, a.C, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                this.c = obtainStyledAttributes.getResourceId(0, -1);
                ColorStateList tintList = this.b.getTintList(this.a.getContext(), this.c);
                if (tintList != null) {
                    b(tintList);
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                kb.a(this.a, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                kb.a(this.a, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(2, -1), null));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    public final ColorStateList b() {
        ot otVar = this.e;
        return otVar != null ? otVar.a : null;
    }

    public final Mode c() {
        ot otVar = this.e;
        return otVar != null ? otVar.b : null;
    }

    public final void d() {
        Drawable background = this.a.getBackground();
        if (background != null && (!e() || !a(background))) {
            ot otVar = this.e;
            if (otVar != null) {
                AppCompatDrawableManager.tintDrawable(background, otVar, this.a.getDrawableState());
                return;
            }
            otVar = this.d;
            if (otVar != null) {
                AppCompatDrawableManager.tintDrawable(background, otVar, this.a.getDrawableState());
            }
        }
    }
}

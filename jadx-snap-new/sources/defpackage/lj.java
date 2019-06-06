package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ml.a;

/* renamed from: lj */
public abstract class lj {

    /* renamed from: lj$a */
    public static class a extends MarginLayoutParams {
        public int gravity;

        public a(int i) {
            this(-2, -1, i);
        }

        public a(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = 8388627;
        }

        public a(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = 0;
            this.gravity = i3;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.lx.a.b);
            this.gravity = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public a(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public a(a aVar) {
            super(aVar);
            this.gravity = 0;
            this.gravity = aVar.gravity;
        }
    }

    @Deprecated
    /* renamed from: lj$b */
    public static abstract class b {
        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract CharSequence d();
    }

    public abstract int a();

    public ml a(a aVar) {
        return null;
    }

    public void a(float f) {
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void a(CharSequence charSequence) {
    }

    public void a(boolean z) {
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public Context b() {
        return null;
    }

    public void b(boolean z) {
    }

    public void c() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void c(boolean z) {
    }

    public void d() {
    }

    public void d(boolean z) {
    }

    public boolean e() {
        return false;
    }
}

package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.lx.a;

/* renamed from: nz */
final class nz extends ny {
    private ot f;
    private ot g;

    nz(TextView textView) {
        super(textView);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        super.a();
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.a.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f = ny.a(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(5, 0));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.g = ny.a(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(6, 0));
        }
        obtainStyledAttributes.recycle();
    }
}

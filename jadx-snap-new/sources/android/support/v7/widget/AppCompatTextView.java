package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.ka;
import defpackage.kt;
import defpackage.ns;
import defpackage.nu;
import defpackage.ny;

public class AppCompatTextView extends TextView implements ka, kt {
    private final ns mBackgroundTintHelper;
    private final ny mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mBackgroundTintHelper = new ns(this);
        this.mBackgroundTintHelper.a(attributeSet, i);
        this.mTextHelper = ny.a((TextView) this);
        this.mTextHelper.a(attributeSet, i);
        this.mTextHelper.a();
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.d();
        }
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        ny nyVar = this.mTextHelper;
        return nyVar != null ? Math.round(nyVar.b.d) : -1;
    }

    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        ny nyVar = this.mTextHelper;
        return nyVar != null ? Math.round(nyVar.b.c) : -1;
    }

    public int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        ny nyVar = this.mTextHelper;
        return nyVar != null ? Math.round(nyVar.b.b) : -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ny nyVar = this.mTextHelper;
        return nyVar != null ? nyVar.b.e : new int[0];
    }

    public int getAutoSizeTextType() {
        if (a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        } else {
            ny nyVar = this.mTextHelper;
            return nyVar != null ? nyVar.b.a : 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ns nsVar = this.mBackgroundTintHelper;
        return nsVar != null ? nsVar.b() : null;
    }

    public Mode getSupportBackgroundTintMode() {
        ns nsVar = this.mBackgroundTintHelper;
        return nsVar != null ? nsVar.c() : null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return nu.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.b();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mTextHelper != null && !a && this.mTextHelper.b.d()) {
            this.mTextHelper.b.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        ns nsVar = this.mBackgroundTintHelper;
        if (nsVar != null) {
            nsVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
            return;
        }
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a(i, f);
        }
    }
}

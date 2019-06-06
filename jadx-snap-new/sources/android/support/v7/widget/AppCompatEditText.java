package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.ka;
import defpackage.ns;
import defpackage.nu;
import defpackage.ny;

public class AppCompatEditText extends EditText implements ka {
    private final ns mBackgroundTintHelper;
    private final ny mTextHelper;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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
}

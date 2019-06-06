package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.snapchat.android.R;
import defpackage.lf;
import defpackage.ma;
import defpackage.nt;
import defpackage.ny;

public class AppCompatRadioButton extends RadioButton implements lf {
    private final nt mCompoundButtonHelper;
    private final ny mTextHelper;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mCompoundButtonHelper = new nt(this);
        this.mCompoundButtonHelper.a(attributeSet, i);
        this.mTextHelper = new ny(this);
        this.mTextHelper.a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        nt ntVar = this.mCompoundButtonHelper;
        return ntVar != null ? ntVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        nt ntVar = this.mCompoundButtonHelper;
        return ntVar != null ? ntVar.a : null;
    }

    public Mode getSupportButtonTintMode() {
        nt ntVar = this.mCompoundButtonHelper;
        return ntVar != null ? ntVar.b : null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(ma.b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        nt ntVar = this.mCompoundButtonHelper;
        if (ntVar != null) {
            ntVar.a();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        nt ntVar = this.mCompoundButtonHelper;
        if (ntVar != null) {
            ntVar.a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        nt ntVar = this.mCompoundButtonHelper;
        if (ntVar != null) {
            ntVar.a(mode);
        }
    }
}

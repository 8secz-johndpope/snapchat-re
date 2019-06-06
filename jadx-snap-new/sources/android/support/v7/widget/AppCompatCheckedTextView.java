package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import defpackage.ma;
import defpackage.nu;
import defpackage.ny;

public class AppCompatCheckedTextView extends CheckedTextView {
    private static final int[] TINT_ATTRS = new int[]{16843016};
    private final ny mTextHelper;

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mTextHelper = ny.a((TextView) this);
        this.mTextHelper.a(attributeSet, i);
        this.mTextHelper.a();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, TINT_ATTRS, i, 0);
        setCheckMarkDrawable(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
    }

    /* Access modifiers changed, original: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return nu.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ma.b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ny nyVar = this.mTextHelper;
        if (nyVar != null) {
            nyVar.a(context, i);
        }
    }
}

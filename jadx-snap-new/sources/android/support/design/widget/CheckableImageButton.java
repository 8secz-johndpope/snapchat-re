package android.support.design.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import com.snapchat.android.R;
import defpackage.jl;
import defpackage.kb.j;
import defpackage.kk;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] a = new int[]{16842912};
    private boolean b;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CheckableImageButton(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        j.a((View) this, new jl() {
            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            public final void onInitializeAccessibilityNodeInfo(View view, kk kkVar) {
                super.onInitializeAccessibilityNodeInfo(view, kkVar);
                kkVar.a(true);
                kkVar.a.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    public boolean isChecked() {
        return this.b;
    }

    public int[] onCreateDrawableState(int i) {
        return this.b ? mergeDrawableStates(super.onCreateDrawableState(i + 1), a) : super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
            sendAccessibilityEvent(ItemAnimator.FLAG_MOVED);
        }
    }

    public void toggle() {
        setChecked(this.b ^ 1);
    }
}

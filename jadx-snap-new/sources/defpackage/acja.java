package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: acja */
public class acja extends FrameLayout implements aciz {
    protected boolean a;
    private boolean b = true;
    private boolean c;
    private Runnable d = new -$$Lambda$TewozsyApcg3fYXDSYqOxxdHIwI(this);

    public acja(Context context) {
        super(context);
    }

    public acja(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public acja(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
    }

    public final void a(boolean z) {
        this.b = z ^ 1;
        if (this.b && this.c) {
            removeCallbacks(this.d);
            postOnAnimation(this.d);
        }
    }

    public void forceLayout() {
        boolean z = this.b;
        this.c = z ^ 1;
        if (z) {
            this.a = true;
            super.forceLayout();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a = false;
    }

    public void requestLayout() {
        boolean z = this.b;
        this.c = z ^ 1;
        if (z) {
            this.a = true;
            super.requestLayout();
        }
    }
}

package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import defpackage.cm;
import defpackage.cm.e;

public final class Snackbar extends cm<Snackbar> {

    public static final class SnackbarLayout extends e {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* Access modifiers changed, original: protected|final */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            i = getChildCount();
            i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i2, AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), AudioPlayer.INFINITY_LOOP_COUNT));
                }
            }
        }
    }
}

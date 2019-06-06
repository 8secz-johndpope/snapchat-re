package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.snapchat.android.R;

public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
    private final int b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.a * 2), this.b), AudioPlayer.INFINITY_LOOP_COUNT), i2);
    }
}

package com.snap.commerce.lib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.List;

public class CarouselIndicator extends LinearLayout {
    private final Context a;
    private int b = 0;
    private int c = 0;
    private final List<View> d = new ArrayList();

    public CarouselIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
    }

    public final void a(int i) {
        this.d.clear();
        int i2 = 0;
        this.c = 0;
        removeAllViews();
        this.b = i;
        if (i != 1) {
            while (i2 < i) {
                View view = new View(this.a);
                view.setBackgroundResource(R.drawable.carsousel_indicator_unselected_background);
                int dimension = (int) this.a.getResources().getDimension(R.dimen.carousel_indicator_size);
                int dimension2 = (int) this.a.getResources().getDimension(R.dimen.carousel_indicator_gap);
                LayoutParams layoutParams = new LayoutParams(dimension, dimension);
                dimension2 /= 2;
                layoutParams.leftMargin = dimension2;
                layoutParams.rightMargin = dimension2;
                this.d.add(view);
                addView(view, layoutParams);
                i2++;
            }
            if (!this.d.isEmpty()) {
                ((View) this.d.get(this.c)).setBackgroundResource(R.drawable.carousel_indicator_selected_background);
            }
        }
    }

    public final void b(int i) {
        if (this.b != 1) {
            int i2 = this.c;
            if (i2 != i) {
                ((View) this.d.get(i2)).setBackgroundResource(R.drawable.carsousel_indicator_unselected_background);
                this.c = i;
                ((View) this.d.get(this.c)).setBackgroundResource(R.drawable.carousel_indicator_selected_background);
            }
        }
    }
}

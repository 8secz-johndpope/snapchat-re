package com.snap.commerce.lib.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.e;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.snapchat.android.R;
import defpackage.absi.a;
import defpackage.ajws;
import defpackage.fkn;
import defpackage.fpl;
import defpackage.frm;
import defpackage.thv;
import java.util.ArrayList;
import java.util.List;

public class ProductInfoImagesView extends RelativeLayout implements e {
    public final List<e> a;
    private final fpl b = new fpl();
    private ViewPager c;
    private CarouselIndicator d;
    private final Context e;

    public ProductInfoImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.product_info_images_view, this);
        this.e = context;
        this.a = new ArrayList();
    }

    public final void a(int i) {
        this.d.b(i);
    }

    public final void a(int i, int i2) {
        if (i == 1) {
            CarouselIndicator carouselIndicator = this.d;
            if (carouselIndicator != null) {
                carouselIndicator.setVisibility(8);
            }
            return;
        }
        CarouselIndicator carouselIndicator2 = this.d;
        if (carouselIndicator2 != null) {
            carouselIndicator2.a(i);
            this.d.b(i2);
            this.d.setVisibility(0);
        }
    }

    public final void a(int i, boolean z, int i2) {
        this.c.a(i, false);
        a(fpl.a(i2, i));
    }

    public final void a(List<thv> list, ajws<frm> ajws, int i) {
        this.c.a(new fkn(list, ajws));
        this.c.b(i);
    }

    public final void b(int i) {
        this.c.b(i);
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.product_info_images_wrapper);
        int dimensionPixelSize = this.e.getResources().getDisplayMetrics().heightPixels - this.e.getResources().getDimensionPixelSize(R.dimen.product_info_details_card_height);
        if (!a.a.b()) {
            dimensionPixelSize += this.e.getResources().getDimensionPixelSize(R.dimen.product_info_details_card_no_nav_bar_padding);
        }
        frameLayout.setLayoutParams(new LayoutParams(-1, dimensionPixelSize + this.e.getResources().getDimensionPixelSize(R.dimen.default_gap)));
        this.d = (CarouselIndicator) findViewById(R.id.product_info_image_carousel_indicator);
        this.c = (ViewPager) findViewById(R.id.product_info_images_vp);
        this.c.a((e) this);
    }

    public void onPageScrollStateChanged(int i) {
        for (e onPageScrollStateChanged : this.a) {
            onPageScrollStateChanged.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        for (e onPageScrolled : this.a) {
            onPageScrolled.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        for (e onPageSelected : this.a) {
            onPageSelected.onPageSelected(i);
        }
    }
}

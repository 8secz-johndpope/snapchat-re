package com.snap.commerce.lib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.snapchat.android.R;
import defpackage.ajwo;
import defpackage.fqo;
import defpackage.frm;

public class ProductCardLayout extends RelativeLayout {
    public ProductCardView a;
    public ProductVariantPickerView b;
    public final ajwo<frm> c = new ajwo();

    public ProductCardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.product_card_layout, this);
    }

    private /* synthetic */ void a(View view) {
        this.c.a(fqo.a);
    }

    public final ProductCardView a() {
        return this.a;
    }

    public final void b() {
        this.b.f();
    }

    public final ProductVariantPickerView c() {
        return this.b;
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ProductCardView) findViewById(R.id.cart_details_view);
        this.b = (ProductVariantPickerView) findViewById(R.id.item_picker_view);
        this.a.b.setOnClickListener(new -$$Lambda$ProductCardLayout$sP38wc_M1IDHCqVMNQ0B_yAro28(this));
    }
}

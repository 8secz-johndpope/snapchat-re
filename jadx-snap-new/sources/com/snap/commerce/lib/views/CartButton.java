package com.snap.commerce.lib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.ajcx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ajei;
import defpackage.fiy;
import java.util.Locale;

public class CartButton extends RelativeLayout {
    private final Context a;
    private final ajei b = new ajei();
    private ImageView c;
    private TextView d;
    private boolean e;

    public CartButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.checkout_btn_layout, this);
        this.a = getContext();
    }

    private /* synthetic */ void b(fiy fiy) {
        if ((fiy.h() == 0 ? 1 : null) != null) {
            this.c.setImageDrawable(this.a.getResources().getDrawable(this.e ? R.drawable.marco_polo_store_bag_empty : R.drawable.marco_polo_bag_empty));
            this.d.setVisibility(8);
            return;
        }
        this.c.setImageDrawable(this.a.getResources().getDrawable(this.e ? R.drawable.marco_polo_store_bag_full : R.drawable.marco_polo_bag_full));
        this.d.setVisibility(0);
        Object obj = fiy.h() > 9 ? 1 : null;
        float dimensionPixelSize = (float) this.a.getResources().getDimensionPixelSize(obj != null ? R.dimen.checkout_cart_button_count_tv_font_full_size : R.dimen.checkout_cart_button_count_tv_font_default_size);
        if (obj != null) {
            this.d.setText(R.string.marco_polo_over_9);
        } else {
            this.d.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(fiy.h())}));
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.d.getLayoutParams();
        marginLayoutParams.topMargin = this.a.getResources().getDimensionPixelSize(obj != null ? R.dimen.checkout_cart_button_count_tv_full_top_margin : R.dimen.checkout_cart_button_count_tv_default_top_margin);
        this.d.setLayoutParams(marginLayoutParams);
        this.d.setTextSize(0, dimensionPixelSize);
    }

    public final void a() {
        this.e = true;
    }

    public final void a(fiy fiy) {
        this.b.a(ajcx.a(new -$$Lambda$CartButton$Aqf5kFBdfS1CuIbSSNNdQD4X0-w(this, fiy)).b(ajee.a(ajef.a)).e());
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.a();
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.checkout_bag_btn_iv);
        this.d = (TextView) findViewById(R.id.checkout_bag_btn_counter);
    }
}

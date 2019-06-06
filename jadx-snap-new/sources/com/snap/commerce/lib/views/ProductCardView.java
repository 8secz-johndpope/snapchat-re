package com.snap.commerce.lib.views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.snap.ui.view.button.RegistrationNavButton;
import com.snapchat.android.R;
import defpackage.fok;
import defpackage.fol;
import defpackage.fpa;
import defpackage.fpv;
import defpackage.frm;
import defpackage.zfw;
import defpackage.zlx;
import defpackage.zmf;
import defpackage.zms;
import defpackage.znh;

public class ProductCardView extends RelativeLayout {
    public final ProductDetailsRecyclerView a = ((ProductDetailsRecyclerView) findViewById(R.id.product_details_scroll_view));
    final RegistrationNavButton b;
    private final RegistrationNavButton c;
    private final View d;

    public ProductCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.product_card_view, this);
        this.a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.a.setItemAnimator(null);
        this.b = (RegistrationNavButton) findViewById(R.id.cart_add_to_bag_btn);
        this.c = (RegistrationNavButton) findViewById(R.id.cart_add_to_bag_error);
        this.d = findViewById(R.id.product_card_button_panel);
    }

    public final RegistrationNavButton a() {
        return this.b;
    }

    public final void a(zfw zfw, fok fok, znh<fpa> znh) {
        ProductDetailsRecyclerView productDetailsRecyclerView = this.a;
        productDetailsRecyclerView.a = new zmf(new zms((zlx) fok, fol.class), new fpv(frm.class, productDetailsRecyclerView.e));
        productDetailsRecyclerView.c = zfw;
        productDetailsRecyclerView.setLayoutManager(productDetailsRecyclerView.b);
        productDetailsRecyclerView.setAdapter(productDetailsRecyclerView.a);
        productDetailsRecyclerView.a.a((znh) znh);
    }

    public final void a(znh<fpa> znh) {
        ProductDetailsRecyclerView productDetailsRecyclerView = this.a;
        if (productDetailsRecyclerView.a != null) {
            productDetailsRecyclerView.a.a((znh) znh);
        }
    }

    public final void a(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    public final RegistrationNavButton b() {
        return this.c;
    }

    public final void c() {
        this.a.a();
    }

    public final void d() {
        ProductDetailsRecyclerView productDetailsRecyclerView = this.a;
        if (productDetailsRecyclerView.a != null) {
            productDetailsRecyclerView.smoothScrollToPosition(productDetailsRecyclerView.a.getItemCount() - 1);
        }
    }
}

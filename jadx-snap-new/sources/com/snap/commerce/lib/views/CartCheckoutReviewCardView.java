package com.snap.commerce.lib.views;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.view.button.RegistrationNavButton;
import com.snapchat.android.R;
import defpackage.abnz;
import defpackage.fkl;
import defpackage.fpn;
import defpackage.fpr;
import defpackage.fqq;
import defpackage.frm;
import defpackage.tgz;
import defpackage.thb.a;
import java.util.List;
import java.util.Map;

public class CartCheckoutReviewCardView extends fpr implements abnz {
    private final fkl f;
    private RecyclerView g = ((RecyclerView) findViewById(R.id.product_review_list_scroll_view));
    private RegistrationNavButton h;
    private View i;
    private View j;
    private View k;
    private View l;
    private TextView m;
    private FrameLayout n;
    private SnapImageView o;
    private TextView p;
    private TextView q;
    private RegistrationNavButton r;
    private RegistrationNavButton s;
    private int t = 0;
    private boolean u = true;
    private boolean v = true;

    public CartCheckoutReviewCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g.setLayoutManager(new LinearLayoutManager(this.a, 1, false));
        this.l = findViewById(R.id.transparent_view);
        this.i = findViewById(R.id.cart_review_empty_cart_view);
        this.r = (RegistrationNavButton) findViewById(R.id.keep_shopping_btn);
        this.o = (SnapImageView) findViewById(R.id.merchant_image);
        this.p = (TextView) findViewById(R.id.merchant_name_text);
        this.q = (TextView) findViewById(R.id.merchant_item_number_text);
        this.k = findViewById(R.id.checkout_review_returns);
        this.j = findViewById(R.id.cart_review_non_empty);
        this.s = (RegistrationNavButton) findViewById(R.id.cart_add_to_bag_error);
        this.h = (RegistrationNavButton) findViewById(R.id.checkout_btn);
        this.m = (TextView) findViewById(R.id.subtotal_costs);
        a(true);
        this.r.enable((int) R.string.marco_polo_keep_shopping);
        this.r.setOnClickListener(new -$$Lambda$CartCheckoutReviewCardView$VzSRfeStqRxFmplDnneJOOXa8MQ(this));
        this.h.setOnClickListener(new -$$Lambda$CartCheckoutReviewCardView$M9jzO4KMB2yF13BEb5rr5TOR8wQ(this));
        this.f = new fkl(this.a, this.e);
        this.g.setAdapter(this.f);
    }

    private /* synthetic */ void b(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                e();
                return;
            }
            if (this.d.booleanValue()) {
                this.b.setVisibility(0);
                this.b.setAlpha(0.7f);
            }
            this.c.setVisibility(0);
            this.c.setY((float) (getMeasuredHeight() - this.c.getMeasuredHeight()));
        } else if (z2) {
            f();
        } else {
            g();
        }
    }

    public final void a(FrameLayout frameLayout) {
        this.n = frameLayout;
        inflate(this.a, R.layout.product_review_layout, frameLayout);
    }

    public final void a(fpn fpn) {
        this.v = fpn.n;
        if (!fpn.a) {
            this.t = fpn.d;
            a(true);
            List list = fpn.b;
            Map map = fpn.c;
            fkl fkl = this.f;
            fkl.a.clear();
            fkl.b.clear();
            fkl.a.addAll(list);
            fkl.b.putAll(map);
            this.f.notifyDataSetChanged();
        }
        this.p.setText(fpn.f);
        this.q.setText(this.a.getResources().getQuantityString(R.plurals.payments_num_purchased_items, fpn.h, new Object[]{Integer.valueOf(fpn.h)}));
        new tgz(a.a).a(this.a, this.o, fpn.j);
        if (TextUtils.isEmpty(fpn.k)) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
            this.k.setOnClickListener(new -$$Lambda$CartCheckoutReviewCardView$iSPKyi75iOfvn1nyqqrm0zFGM6I(this, fpn));
        }
        this.m.setText(fpn.m.c());
        int i = fpn.i;
        this.n.measure(0, 0);
        LayoutParams layoutParams = this.g.getLayoutParams();
        layoutParams.height = i <= 1 ? -2 : (int) this.a.getResources().getDimension(R.dimen.cart_review_items_max_height);
        this.g.setLayoutParams(layoutParams);
    }

    public final void a(boolean z) {
        if (this.h != null) {
            if (this.t != 0) {
                String string = this.a.getString(R.string.commerce_error_item_quantity_invalid, new Object[]{Integer.toString(this.t)});
                this.h.setVisibility(8);
                this.s.enable(string);
                this.s.setVisibility(0);
                return;
            }
            this.s.setVisibility(8);
            this.h.setVisibility(0);
            int i = R.string.marco_polo_checkout;
            RegistrationNavButton registrationNavButton;
            if (z) {
                registrationNavButton = this.h;
                if (!this.v) {
                    i = R.string.marco_polo_checkout_on_website;
                }
                registrationNavButton.enable(i);
                this.h.setClickable(true);
                this.h.setTextColor(-1);
                return;
            }
            registrationNavButton = this.h;
            if (!this.v) {
                i = R.string.marco_polo_checkout_on_website;
            }
            registrationNavButton.disable(i);
            this.h.setTextColor(-7829368);
        }
    }

    public final void a(boolean z, boolean z2) {
        postDelayed(new -$$Lambda$CartCheckoutReviewCardView$_23pSdEeTrScf6iOWsLkkSpsUDM(this, z, z2), 100);
    }

    public final frm b() {
        return fqq.a;
    }

    public final void b(boolean z) {
        int i = 8;
        this.j.setVisibility(z ? 8 : 0);
        View view = this.i;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void c(boolean z) {
        this.u = z;
        a(z);
        this.l.setVisibility(z ? 8 : 0);
        this.l.setEnabled(z ^ 1);
        this.b.setEnabled(z);
    }

    public final boolean d() {
        return !this.u;
    }

    public final void x_() {
        this.h.showProgressBar(0);
    }
}

package com.snap.commerce.lib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.snapchat.android.R;
import defpackage.abnz;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajei;
import defpackage.ajwo;
import defpackage.akcr;
import defpackage.fpn;
import defpackage.fpz;
import defpackage.fqd;
import defpackage.fqe;
import defpackage.fqg;
import defpackage.fqi;
import defpackage.fqr;
import defpackage.frm;
import defpackage.frq;
import defpackage.frt;
import defpackage.fsl;
import defpackage.fsn;
import defpackage.fsp;
import java.util.List;

public final class CartCheckoutReview extends RelativeLayout implements abnz {
    final ajwo<frm> a;
    public final ajei b = new ajei();
    private CartCheckoutReviewCardView c;
    private ProductQuantityPickerView d;

    static final class a implements OnClickListener {
        private /* synthetic */ CartCheckoutReview a;

        a(CartCheckoutReview cartCheckoutReview) {
            this.a = cartCheckoutReview;
        }

        public final void onClick(View view) {
            this.a.a.a(fqr.a);
        }
    }

    public CartCheckoutReview(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<ProductPageUserAction>()");
        this.a = ajwo;
        View.inflate(getContext(), R.layout.cart_checkout_review_container, this);
    }

    private final void a(boolean z, boolean z2) {
        CartCheckoutReviewCardView cartCheckoutReviewCardView = this.c;
        if (cartCheckoutReviewCardView == null) {
            akcr.a("cartCheckoutReviewCardView");
        }
        cartCheckoutReviewCardView.a(z, z2);
    }

    public final ajdp<frm> a() {
        ajwo ajwo = this.a;
        CartCheckoutReviewCardView cartCheckoutReviewCardView = this.c;
        if (cartCheckoutReviewCardView == null) {
            akcr.a("cartCheckoutReviewCardView");
        }
        ajdp e = ajwo.e((ajdt) cartCheckoutReviewCardView.c());
        ProductQuantityPickerView productQuantityPickerView = this.d;
        if (productQuantityPickerView == null) {
            akcr.a("itemQuantityMenuView");
        }
        Object e2 = e.e((ajdt) productQuantityPickerView.c());
        akcr.a(e2, "userActionSource.mergeWi…enuView.userActionSource)");
        return e2;
    }

    public final void a(fpz fpz) {
        akcr.b(fpz, "event");
        String str = "cartCheckoutReviewCardView";
        CartCheckoutReviewCardView cartCheckoutReviewCardView;
        boolean z;
        CartCheckoutReviewCardView cartCheckoutReviewCardView2;
        if (fpz instanceof fqd) {
            cartCheckoutReviewCardView = this.c;
            if (cartCheckoutReviewCardView == null) {
                akcr.a(str);
            }
            cartCheckoutReviewCardView.a(true);
        } else if (fpz instanceof fqg) {
            z = ((fqg) fpz).a;
            if (b()) {
                a(false, z);
            }
        } else if (fpz instanceof fsl) {
            fsl fsl = (fsl) fpz;
            a(fsl.a, fsl.b);
        } else if (fpz instanceof fqe) {
            z = ((fqe) fpz).a;
            cartCheckoutReviewCardView2 = this.c;
            if (cartCheckoutReviewCardView2 == null) {
                akcr.a(str);
            }
            cartCheckoutReviewCardView2.c(z);
        } else if (fpz instanceof fsp) {
            fpn fpn = ((fsp) fpz).a;
            cartCheckoutReviewCardView2 = this.c;
            if (cartCheckoutReviewCardView2 == null) {
                akcr.a(str);
            }
            cartCheckoutReviewCardView2.a(fpn);
        } else if (fpz instanceof frq) {
            cartCheckoutReviewCardView = this.c;
            if (cartCheckoutReviewCardView == null) {
                akcr.a(str);
            }
            cartCheckoutReviewCardView.x_();
        } else {
            String str2 = "itemQuantityMenuView";
            ProductQuantityPickerView productQuantityPickerView;
            if (fpz instanceof frt) {
                List list = ((frt) fpz).a;
                ProductQuantityPickerView productQuantityPickerView2 = this.d;
                if (productQuantityPickerView2 == null) {
                    akcr.a(str2);
                }
                productQuantityPickerView2.a(getResources().getString(R.string.marco_polo_checkout_review_quantity_header), list);
                productQuantityPickerView = this.d;
                if (productQuantityPickerView == null) {
                    akcr.a(str2);
                }
                productQuantityPickerView.e();
            } else if (fpz instanceof fqi) {
                productQuantityPickerView = this.d;
                if (productQuantityPickerView == null) {
                    akcr.a(str2);
                }
                productQuantityPickerView.f();
            } else {
                if (fpz instanceof fsn) {
                    z = ((fsn) fpz).a;
                    cartCheckoutReviewCardView2 = this.c;
                    if (cartCheckoutReviewCardView2 == null) {
                        akcr.a(str);
                    }
                    cartCheckoutReviewCardView2.b(z);
                }
            }
        }
    }

    public final boolean b() {
        CartCheckoutReviewCardView cartCheckoutReviewCardView = this.c;
        if (cartCheckoutReviewCardView == null) {
            akcr.a("cartCheckoutReviewCardView");
        }
        return cartCheckoutReviewCardView.h();
    }

    public final boolean d() {
        ProductQuantityPickerView productQuantityPickerView = this.d;
        String str = "itemQuantityMenuView";
        if (productQuantityPickerView == null) {
            akcr.a(str);
        }
        if (productQuantityPickerView.h()) {
            productQuantityPickerView = this.d;
            if (productQuantityPickerView == null) {
                akcr.a(str);
            }
            productQuantityPickerView.f();
            return true;
        }
        CartCheckoutReviewCardView cartCheckoutReviewCardView = this.c;
        if (cartCheckoutReviewCardView == null) {
            akcr.a("cartCheckoutReviewCardView");
        }
        return cartCheckoutReviewCardView.d();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.cart_checkout_review_card);
        akcr.a(findViewById, "findViewById(R.id.cart_checkout_review_card)");
        this.c = (CartCheckoutReviewCardView) findViewById;
        findViewById(R.id.checkout_review_fragment_close_view).setOnClickListener(new a(this));
        findViewById = findViewById(R.id.cart_checkout_review_quantity_picker);
        akcr.a(findViewById, "findViewById(R.id.cart_c…t_review_quantity_picker)");
        this.d = (ProductQuantityPickerView) findViewById;
    }
}

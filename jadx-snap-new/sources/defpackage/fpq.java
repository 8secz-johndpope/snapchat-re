package defpackage;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.snap.commerce.lib.views.CartButton;
import com.snap.commerce.lib.views.CartCheckoutReview;
import com.snap.commerce.lib.views.ProductCardLayout;
import com.snap.commerce.lib.views.ProductInfoImagesView;
import com.snapchat.android.R;

/* renamed from: fpq */
public final class fpq {
    public final View a;
    final FragmentActivity b;
    public final ProductCardLayout c;
    final CartButton d;
    public final CartCheckoutReview e;
    public final ajei f = new ajei();
    public final ajwo<frm> g;
    public final ProductInfoImagesView h;
    public final zke i;
    private final View j;
    private fjl k;
    private final zkf l;

    /* renamed from: fpq$1 */
    static final class 1 implements OnClickListener {
        private /* synthetic */ fpq a;

        1(fpq fpq) {
            this.a = fpq;
        }

        public final void onClick(View view) {
            FragmentActivity fragmentActivity = this.a.b;
            if (fragmentActivity != null) {
                fragmentActivity.onBackPressed();
            }
        }
    }

    /* renamed from: fpq$2 */
    static final class 2 implements OnClickListener {
        private /* synthetic */ fpq a;

        2(fpq fpq) {
            this.a = fpq;
        }

        public final void onClick(View view) {
            this.a.g.a(fqp.a);
        }
    }

    /* renamed from: fpq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: fpq$d */
    static final class d implements Runnable {
        private /* synthetic */ fpq a;

        d(fpq fpq) {
            this.a = fpq;
        }

        public final void run() {
            Context context = this.a.a.getContext();
            View inflate = View.inflate(context, R.layout.custom_toast_layout, null);
            Object obj = (TextView) inflate.findViewById(R.id.custom_toast_container_text);
            akcr.a(obj, "textView");
            obj.setText(context.getString(R.string.marco_polo_shipping_outside_us));
            Toast toast = new Toast(context);
            toast.setGravity(48, 0, 0);
            toast.setDuration(0);
            toast.setView(inflate);
            toast.show();
        }
    }

    /* renamed from: fpq$b */
    static final class b<T> implements ajfb<fiy> {
        private /* synthetic */ fpq a;

        b(fpq fpq) {
            this.a = fpq;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.d.a((fiy) obj);
        }
    }

    /* renamed from: fpq$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    public fpq(Context context, zkf zkf) {
        akcr.b(context, "context");
        akcr.b(zkf, "rxBus");
        this.l = zkf;
        Object inflate = View.inflate(context, R.layout.product_info_fragment_layout, null);
        akcr.a(inflate, "View.inflate(context, R.…fo_fragment_layout, null)");
        this.a = inflate;
        this.b = (FragmentActivity) context;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<ProductPageUserAction>()");
        this.g = ajwo;
        this.i = this.l.a();
        this.k = fjl.NATIVE;
        this.h = (ProductInfoImagesView) a(R.id.product_info_images_view);
        this.c = (ProductCardLayout) a(R.id.product_card_container);
        this.j = a(R.id.product_info_fragment_close_view);
        this.d = (CartButton) a(R.id.checkout_bag_btn);
        this.e = (CartCheckoutReview) a(R.id.checkout_cart_review_container);
        this.j.setOnClickListener(new 1(this));
        this.d.setOnClickListener(new 2(this));
    }

    private final <T extends View> T a(int i) {
        Object findViewById = this.a.findViewById(i);
        akcr.a(findViewById, "view.findViewById(viewId)");
        return findViewById;
    }

    /* JADX WARNING: Missing block: B:46:0x0172, code skipped:
            if (r8 != false) goto L_0x0177;
     */
    @defpackage.akqq(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void handleProductDetailViewEvent(defpackage.frn r8) {
        /*
        r7 = this;
        r0 = "event";
        defpackage.akcr.b(r8, r0);
        r0 = r8 instanceof defpackage.fqk;
        if (r0 == 0) goto L_0x001f;
    L_0x0009:
        r8 = (defpackage.fqk) r8;
        r0 = r8.b;
        r7.k = r0;
        r0 = r7.c;
        r0 = r0.a();
        r1 = r8.a;
        r2 = r8.c;
        r8 = r8.d;
        r0.a(r1, r2, r8);
        return;
    L_0x001f:
        r0 = r8 instanceof defpackage.frr;
        if (r0 == 0) goto L_0x004d;
    L_0x0023:
        r8 = (defpackage.frr) r8;
        r0 = new fpq$d;
        r0.<init>(r7);
        r0 = (java.lang.Runnable) r0;
        r0 = defpackage.ajcx.a(r0);
        r1 = r8.a;
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r1 = (defpackage.ajdw) r1;
        r0 = r0.b(r1);
        r0 = r0.e();
        r1 = "Completable.fromRunnable…             .subscribe()";
        defpackage.akcr.a(r0, r1);
        r8 = r8.b;
        defpackage.ajvv.a(r0, r8);
        return;
    L_0x004d:
        r0 = r8 instanceof defpackage.frs;
        r1 = "productCard.productCardView";
        r2 = 0;
        if (r0 == 0) goto L_0x00a6;
    L_0x0054:
        r8 = (defpackage.frs) r8;
        r0 = java.util.Locale.getDefault();
        r3 = "Locale.getDefault()";
        defpackage.akcr.a(r0, r3);
        r3 = 2;
        r4 = new java.lang.Object[r3];
        r5 = r7.c;
        r5 = r5.getResources();
        r6 = 2131888439; // 0x7f120937 float:1.9411513E38 double:1.0532928385E-314;
        r5 = r5.getString(r6);
        r4[r2] = r5;
        r5 = 1;
        r6 = r8.a;
        r4[r5] = r6;
        r3 = java.util.Arrays.copyOf(r4, r3);
        r4 = "%s %s";
        r0 = java.lang.String.format(r0, r4, r3);
        r3 = "java.lang.String.format(locale, format, *args)";
        defpackage.akcr.a(r0, r3);
        r3 = r7.c;
        r3 = r3.c();
        r8 = r8.b;
        r3.a(r0, r8);
        r8 = r7.c;
        r8 = r8.a();
        defpackage.akcr.a(r8, r1);
        r8.setEnabled(r2);
        r8 = r7.c;
        r8 = r8.c();
        r8.e();
        return;
    L_0x00a6:
        r0 = r8 instanceof defpackage.fqh;
        if (r0 == 0) goto L_0x00b0;
    L_0x00aa:
        r8 = r7.c;
        r8.b();
        return;
    L_0x00b0:
        r0 = r8 instanceof defpackage.fsr;
        if (r0 == 0) goto L_0x00c2;
    L_0x00b4:
        r8 = (defpackage.fsr) r8;
        r0 = r7.c;
        r0 = r0.a();
        r8 = r8.a;
        r0.a(r8);
        return;
    L_0x00c2:
        r0 = r8 instanceof defpackage.fro;
        r3 = "soldOutButton";
        r4 = "addToBagButton";
        r5 = 8;
        if (r0 == 0) goto L_0x00fc;
    L_0x00cc:
        r8 = r7.c;
        r8 = r8.a();
        defpackage.akcr.a(r8, r1);
        r8 = r8.a();
        r0 = r7.c;
        r0 = r0.a();
        defpackage.akcr.a(r0, r1);
        r0 = r0.b();
        defpackage.akcr.a(r8, r4);
        r8.setVisibility(r2);
        r1 = 2131888364; // 0x7f1208ec float:1.9411361E38 double:1.0532928014E-314;
        r8.enable(r1);
        r0.disable(r1);
        defpackage.akcr.a(r0, r3);
        r0.setVisibility(r5);
        return;
    L_0x00fc:
        r0 = r8 instanceof defpackage.fru;
        if (r0 == 0) goto L_0x0130;
    L_0x0100:
        r8 = r7.c;
        r8 = r8.a();
        defpackage.akcr.a(r8, r1);
        r8 = r8.a();
        r0 = r7.c;
        r0 = r0.a();
        defpackage.akcr.a(r0, r1);
        r0 = r0.b();
        r1 = 2131888416; // 0x7f120920 float:1.9411467E38 double:1.053292827E-314;
        r8.disable(r1);
        defpackage.akcr.a(r8, r4);
        r8.setVisibility(r5);
        defpackage.akcr.a(r0, r3);
        r0.setVisibility(r2);
        r0.enable(r1);
        return;
    L_0x0130:
        r0 = r8 instanceof defpackage.fsj;
        if (r0 == 0) goto L_0x0142;
    L_0x0134:
        r8 = (defpackage.fsj) r8;
        r0 = r7.c;
        r0 = r0.a();
        r8 = r8.a;
        r0.a(r8);
        return;
    L_0x0142:
        r0 = r8 instanceof defpackage.fpy;
        if (r0 == 0) goto L_0x0150;
    L_0x0146:
        r8 = r7.c;
        r8 = r8.a();
        r8.c();
        return;
    L_0x0150:
        r0 = r8 instanceof defpackage.fqf;
        if (r0 == 0) goto L_0x015e;
    L_0x0154:
        r8 = r7.c;
        r8 = r8.a();
        r8.d();
        return;
    L_0x015e:
        r0 = r8 instanceof defpackage.fsm;
        if (r0 == 0) goto L_0x017b;
    L_0x0162:
        r8 = (defpackage.fsm) r8;
        r8 = r8.a;
        r0 = r7.k;
        r1 = defpackage.fjl.DISCOVER;
        if (r0 != r1) goto L_0x0170;
    L_0x016c:
        r8 = r7.j;
        r0 = r8;
        goto L_0x0175;
    L_0x0170:
        r0 = r7.j;
        if (r8 == 0) goto L_0x0175;
    L_0x0174:
        goto L_0x0177;
    L_0x0175:
        r2 = 8;
    L_0x0177:
        r0.setVisibility(r2);
        return;
    L_0x017b:
        r0 = r8 instanceof defpackage.fsk;
        if (r0 == 0) goto L_0x018e;
    L_0x017f:
        r8 = (defpackage.fsk) r8;
        r8 = r8.a;
        r0 = r7.d;
        if (r8 == 0) goto L_0x0188;
    L_0x0187:
        goto L_0x018a;
    L_0x0188:
        r2 = 8;
    L_0x018a:
        r0.setVisibility(r2);
        return;
    L_0x018e:
        r0 = r8 instanceof defpackage.fss;
        if (r0 == 0) goto L_0x01a5;
    L_0x0192:
        r8 = (defpackage.fss) r8;
        r0 = r8.a;
        if (r0 == 0) goto L_0x01a4;
    L_0x0198:
        r0 = r8.b;
        r1 = -1;
        if (r0 == r1) goto L_0x01a4;
    L_0x019d:
        r0 = r7.h;
        r8 = r8.b;
        r0.b(r8);
    L_0x01a4:
        return;
    L_0x01a5:
        r0 = r8 instanceof defpackage.fqj;
        if (r0 == 0) goto L_0x01b9;
    L_0x01a9:
        r8 = (defpackage.fqj) r8;
        r0 = r8.a;
        r8 = r8.b;
        r1 = r7.h;
        r2 = r7.g;
        r2 = (defpackage.ajws) r2;
        r1.a(r0, r2, r8);
        return;
    L_0x01b9:
        r0 = r8 instanceof defpackage.fqc;
        if (r0 == 0) goto L_0x01c9;
    L_0x01bd:
        r8 = (defpackage.fqc) r8;
        r0 = r8.a;
        r8 = r8.b;
        r1 = r7.h;
        r1.a(r0, r8);
        return;
    L_0x01c9:
        r0 = r8 instanceof defpackage.fso;
        if (r0 == 0) goto L_0x01d7;
    L_0x01cd:
        r8 = (defpackage.fso) r8;
        r8 = r8.a;
        r0 = r7.h;
        r0.a(r8);
        return;
    L_0x01d7:
        r0 = r8 instanceof defpackage.fsq;
        if (r0 == 0) goto L_0x01e7;
    L_0x01db:
        r8 = (defpackage.fsq) r8;
        r0 = r8.a;
        r8 = r8.b;
        r1 = r7.h;
        r1.a(r0, r2, r8);
        return;
    L_0x01e7:
        r0 = r8 instanceof defpackage.fpx;
        if (r0 == 0) goto L_0x020d;
    L_0x01eb:
        r8 = (defpackage.fpx) r8;
        r8 = r8.a;
        r8 = r8.n();
        r0 = new fpq$b;
        r0.<init>(r7);
        r0 = (defpackage.ajfb) r0;
        r1 = defpackage.fpq.c.a;
        r1 = (defpackage.ajfb) r1;
        r8 = r8.a(r0, r1);
        r0 = "checkoutCart.checkoutCar…e checkout bag failed\")})";
        defpackage.akcr.a(r8, r0);
        r0 = r7.f;
        defpackage.ajvv.a(r8, r0);
        return;
    L_0x020d:
        r0 = r8 instanceof defpackage.fpz;
        if (r0 == 0) goto L_0x0218;
    L_0x0211:
        r0 = r7.e;
        r8 = (defpackage.fpz) r8;
        r0.a(r8);
    L_0x0218:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpq.handleProductDetailViewEvent(frn):void");
    }
}

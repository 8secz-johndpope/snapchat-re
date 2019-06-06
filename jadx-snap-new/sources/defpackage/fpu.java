package defpackage;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.snap.commerce.lib.views.CartButton;
import com.snap.commerce.lib.views.CartCheckoutReview;
import com.snap.commerce.lib.views.StoreMainTabView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fpu */
public final class fpu {
    public final View a;
    final FragmentActivity b;
    final View c = a(R.id.product_info_fragment_close_view);
    final StoreMainTabView d;
    public final CartCheckoutReview e;
    final CartButton f;
    public final ajei g = new ajei();
    public final zke h = this.k.a();
    private final View i = a(R.id.product_info_fragment_close_view_tap_target);
    private final SnapFontTextView j;
    private final zkf k;
    private final fok l;

    /* renamed from: fpu$1 */
    static final class 1 implements OnClickListener {
        private /* synthetic */ fpu a;

        1(fpu fpu) {
            this.a = fpu;
        }

        public final void onClick(View view) {
            if (this.a.c.getVisibility() == 0) {
                FragmentActivity fragmentActivity = this.a.b;
                if (fragmentActivity != null) {
                    fragmentActivity.onBackPressed();
                }
            }
        }
    }

    /* renamed from: fpu$2 */
    static final class 2 implements OnClickListener {
        private /* synthetic */ fpu a;

        2(fpu fpu) {
            this.a = fpu;
        }

        public final void onClick(View view) {
            this.a.d.c();
        }
    }

    /* renamed from: fpu$3 */
    static final class 3 implements OnClickListener {
        private /* synthetic */ fpu a;

        3(fpu fpu) {
            this.a = fpu;
        }

        public final void onClick(View view) {
            this.a.h.a(fqp.a);
        }
    }

    /* renamed from: fpu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: fpu$d */
    static final class d implements Runnable {
        private /* synthetic */ fpu a;

        d(fpu fpu) {
            this.a = fpu;
        }

        public final void run() {
            Context context = this.a.a.getContext();
            View inflate = View.inflate(context, R.layout.custom_toast_layout, null);
            Object obj = (TextView) inflate.findViewById(R.id.custom_toast_container_text);
            akcr.a(obj, "textView");
            obj.setText(context.getString(R.string.marco_polo_bitmoji_merch_coming_soon));
            Toast toast = new Toast(context);
            toast.setGravity(48, 0, 0);
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        }
    }

    /* renamed from: fpu$b */
    static final class b<T> implements ajfb<fiy> {
        private /* synthetic */ fpu a;

        b(fpu fpu) {
            this.a = fpu;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f.a((fiy) obj);
        }
    }

    /* renamed from: fpu$c */
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

    public fpu(Context context, zkf zkf, fok fok) {
        akcr.b(context, "context");
        akcr.b(zkf, "rxBus");
        akcr.b(fok, "commerceBindingContext");
        this.k = zkf;
        this.l = fok;
        Object inflate = View.inflate(context, R.layout.store_fragment_layout, null);
        akcr.a(inflate, "View.inflate(context, R.…re_fragment_layout, null)");
        this.a = inflate;
        this.b = (FragmentActivity) context;
        this.i.setOnClickListener(new 1(this));
        this.d = (StoreMainTabView) a(R.id.marco_polo_store_main_categories);
        this.j = (SnapFontTextView) a(R.id.store_title_text_view);
        this.j.setOnClickListener(new 2(this));
        this.e = (CartCheckoutReview) a(R.id.store_fragment_checkout_cart_review_container);
        this.f = (CartButton) a(R.id.store_ui_checkout_bag_btn);
        this.f.a();
        this.f.setOnClickListener(new 3(this));
        this.d.a(this.k);
    }

    private final <T extends View> T a(int i) {
        Object findViewById = this.a.findViewById(i);
        akcr.a(findViewById, "view.findViewById(viewId)");
        return findViewById;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void handleCommerceViewEvent(fqb fqb) {
        akcr.b(fqb, "event");
        ajej e;
        if (fqb instanceof fqn) {
            thy thy = ((fqn) fqb).a;
            this.j.setText(thy.b());
            fko fko = new fko(this.b, this.k, thy, this.l);
            ajej a = this.k.a(fko);
            akcr.a((Object) a, "rxBus.subscribe(storeViewMainTabPagerAdapter)");
            ajvv.a(a, this.g);
            this.d.a(fko);
            if (thy.f()) {
                this.d.b();
            } else {
                this.d.a();
            }
        } else if (fqb instanceof frp) {
            e = ajcx.a((Runnable) new d(this)).b((ajdw) ((frp) fqb).a.l()).e();
            akcr.a((Object) e, "Completable.fromRunnable…             .subscribe()");
            ajvv.a(e, this.g);
        } else if (fqb instanceof fsm) {
            this.c.setVisibility(((fsm) fqb).a ? 0 : 8);
        } else if (fqb instanceof fpx) {
            e = ((fpx) fqb).a.n().a((ajfb) new b(this), (ajfb) c.a);
            akcr.a((Object) e, "event.checkoutCart.check… checkout bag failed \")})");
            ajvv.a(e, this.g);
        } else {
            if (fqb instanceof fpz) {
                this.e.a((fpz) fqb);
            }
        }
    }
}

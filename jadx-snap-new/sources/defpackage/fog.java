package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snapchat.android.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fog */
public final class fog extends tih {
    private zmf a;
    private fje b;
    private TextView c;
    private View d;
    private final zkf e = new zkf();
    private String m;
    private ArrayList<fja> n;
    private final fok o;
    private final tjj p;
    private final flb q;
    private final fpd r;

    public fog(fok fok, tjj tjj, flb flb, fpd fpd) {
        this.o = fok;
        this.p = tjj;
        this.q = flb;
        this.r = fpd;
    }

    private void c() {
        List list = this.n;
        if (list != null) {
            this.a.a(fpd.a(this.m, list));
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.d = layoutInflater.inflate(R.layout.shipping_options_layout, viewGroup, false);
        tlw.a(this.g, this.d).a((int) R.string.marco_polo_checkout_shipping_method);
        this.c = (TextView) this.d.findViewById(R.id.shipping_options_error);
        this.c.setText(this.f.getString(R.string.marco_polo_checkout_shipping_options_error));
        RecyclerView recyclerView = (RecyclerView) this.d.findViewById(R.id.shipping_options_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f, 1, false));
        this.a = new zmf(new zms(this.o, fol.class), this.e.b);
        ArrayList arrayList = this.n;
        if (arrayList == null || arrayList.isEmpty()) {
            this.c.setVisibility(0);
        } else {
            c();
            recyclerView.setItemAnimator(new ziv("ShippingOptionsPage"));
            recyclerView.setHasFixedSize(true);
            recyclerView.addItemDecoration(new DividerItemDecoration(this.f, 1));
            recyclerView.setAdapter(this.a);
        }
        return this.d;
    }

    public final void a() {
        this.p.a(aagf.SHIPPING_METHOD_LIST);
    }

    public final void a(Context context, Bundle bundle, boolean z, tgq tgq, zkf zkf, FragmentActivity fragmentActivity, fv fvVar) {
        super.a(context, bundle, z, tgq, zkf, fragmentActivity, fvVar);
        bundle.putBoolean("payments_checkout_navigation_idfr", true);
        this.m = bundle.getString("checkout_shipping_option_selected_bundle_idfr");
        this.n = bundle.getParcelableArrayList("checkout_shipping_options_bundle_idfr");
        this.e.a(this);
    }

    public final void a(fje fje) {
        this.b = fje;
    }

    public final void b() {
        this.p.b();
    }

    public final void d() {
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onShippingOptionClickedEvent(fpj fpj) {
        this.m = fpj.a.a;
        c();
        String str = this.m;
        if (str != null) {
            flb flb = this.q;
            String str2 = "shippingMethodId";
            akcr.b(str, str2);
            Object obj = flb.c.b;
            akcr.a(obj, "logger.params");
            BigDecimal bigDecimal = ((fmh) flb.b.get()).b.d;
            akcr.b(obj, "params");
            akcr.b(str, str2);
            akcr.b(bigDecimal, "shippingAmount");
            aagp aagp = new aagp();
            aafn aafn = aagp;
            tjm.a(obj, aafn, aafm.UPDATE, true, null);
            aagp.e = str;
            aagp.f = Double.valueOf(bigDecimal.doubleValue());
            flb.c.a((aaga) aafn);
        }
        this.b.a(fpj.a);
        this.i.onBackPressed();
    }
}

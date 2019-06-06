package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: tka */
public final class tka {
    private tgq a;
    private final tku b;
    private final zmf c;
    private final tkj d;
    private final boolean e;
    private List<thi> f;
    private String g;
    private String h;
    private final tig i;

    public tka(tkj tkj, Bundle bundle, zmf zmf, tku tku, boolean z, tgq tgq, tig tig) {
        this.d = tkj;
        if (bundle != null) {
            this.h = bundle.getString("SHIPPING_ADDRESS_ERROR_ID_BUNDLE_IDFR");
            this.g = bundle.getString("SELECTED_SHIPPING_ADDRESS_ID");
        }
        this.a = tgq;
        this.c = zmf;
        this.e = z;
        this.b = tku;
        this.i = tig;
    }

    private void a() {
        List list = this.f;
        if (list != null) {
            this.c.a(tku.a(list, this.e, this.g));
        }
    }

    public final void a(aggw aggw) {
        List<agjm> list = aggw.b;
        ArrayList<thi> arrayList = new ArrayList();
        if (list != null) {
            for (agjm thi : list) {
                arrayList.add(new thi(thi));
            }
        }
        if (this.h != null) {
            for (thi thi2 : arrayList) {
                if (thi2.a.equals(this.h)) {
                    thi2.c = false;
                }
            }
        }
        if (this.g == null && this.e) {
            List list2 = aggw.b;
            String str = null;
            if (list2 != null) {
                thi a = thi.a(list2);
                if (a != null) {
                    str = a.a;
                }
            }
            this.g = str;
        }
        this.f = arrayList;
        a();
        this.d.e();
    }

    public final void a(Throwable th) {
        this.d.e();
        if (th instanceof thg) {
            the the = ((thg) th).a;
            tkj tkj = this.d;
            tkj.a.setText(tlm.a(the, tkj.i.getResources()));
            return;
        }
        th.getLocalizedMessage();
        Log.getStackTraceString(th);
        abpe.a("ShippingAddressListController");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onNewShippingAddressEvent(tla tla) {
        if (this.e) {
            this.i.a(this.a);
        } else {
            this.i.a();
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onShippingAddressSelectedEvent(tkz tkz) {
        thi thi = tkz.a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("payments_shipping_address_bundle_idfr", thi);
        if (this.e) {
            this.g = thi.a;
            a();
            if (thi.c) {
                tgq tgq = this.a;
                if (tgq != null) {
                    tgq.a(thi);
                }
                this.d.d();
                return;
            }
            this.i.b(bundle, this.a);
            return;
        }
        this.i.a(bundle);
    }
}

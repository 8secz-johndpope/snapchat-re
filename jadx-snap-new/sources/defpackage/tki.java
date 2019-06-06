package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: tki */
public final class tki extends tih {
    private final AtomicInteger A = new AtomicInteger();
    public final tjj a;
    public final ajei b = new ajei();
    private final tkp c;
    private final tlc d;
    private final tkm e;
    private final zfw m;
    private final tgo n;
    private final tlq o;
    private final tig p;
    private final tgw q;
    private zmf r;
    private zmf s;
    private View t;
    private View u;
    private View v;
    private tlw w;
    private String x;
    private String y;
    private the z;

    public tki(tkp tkp, tlc tlc, tkm tkm, ajwy<zgb> ajwy, tgo tgo, tlq tlq, tig tig, tjj tjj, tgw tgw) {
        this.c = tkp;
        this.d = tlc;
        this.e = tkm;
        ajwy.get();
        this.m = zgb.a(tfv.A.callsite("PaymentsMethodSettingPage"));
        this.n = tgo;
        this.o = tlq;
        this.p = tig;
        this.a = tjj;
        this.q = tgw;
    }

    private boolean a(String str) {
        String str2 = this.x;
        return str2 != null && TextUtils.equals(str, str2);
    }

    private void c(Throwable th) {
        if (!(th instanceof thg)) {
            th.getLocalizedMessage();
        }
    }

    private void f() {
        this.t.setVisibility(8);
        b();
        i();
    }

    private void i() {
        if (this.t != null && this.A.decrementAndGet() <= 0) {
            this.t.setVisibility(8);
            this.u.setVisibility(0);
        }
    }

    private void j() {
        this.t.setVisibility(8);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.v = layoutInflater.inflate(R.layout.payments_fragments_method_list_v2, viewGroup, false);
        this.t = this.v.findViewById(R.id.payments_loading_progress);
        this.u = this.v.findViewById(R.id.payments_settings_container);
        if (this.l) {
            this.v.findViewById(R.id.payments_payment_method_header).setVisibility(8);
            this.v.findViewById(R.id.payment_settings_header_separator).setVisibility(8);
            this.v.findViewById(R.id.payments_other_options).setVisibility(8);
        } else {
            this.v.findViewById(R.id.payments_shipping_address_option).setOnClickListener(new -$$Lambda$tki$QmiIcBscQKbttfkYFDVCYDGbsZg(this));
            this.v.findViewById(R.id.payments_contact_info_option).setOnClickListener(new -$$Lambda$tki$FMV8COrYU_8tpt494uwvdgt4OiM(this));
            this.v.findViewById(R.id.payments_order_information_option).setOnClickListener(new -$$Lambda$tki$OClMiyQqHvudzWNQ2_URSw1nxmI(this));
        }
        this.w = tlw.a(h(), this.v);
        if (this.l) {
            this.w.a((int) R.string.payments_edit_action_bar);
        } else {
            this.w.a((int) R.string.payments_settings_field_v2);
            View findViewById = this.w.findViewById(R.id.sc_header_bottom_border);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        RecyclerView recyclerView = (RecyclerView) this.v.findViewById(R.id.payments_method_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(g(), 1, false));
        recyclerView.setAdapter(this.r);
        recyclerView = (RecyclerView) this.v.findViewById(R.id.recent_orders);
        recyclerView.setLayoutManager(new LinearLayoutManager(g(), 1, false));
        recyclerView.setItemAnimator(new ziv("PaymentsMethodSettingPage"));
        recyclerView.addItemDecoration(new DividerItemDecoration(g(), 1));
        recyclerView.setAdapter(this.s);
        this.b.a(this.o.a().b((ajdw) this.m.g()).a((ajdw) this.m.l()).a(new -$$Lambda$sevuHbZhetwb3gyRhIXS5OwGvxc(this), new -$$Lambda$5GLMXSi4tAHrJNZxlIgQnHQgyrg(this)));
        if (this.t != null) {
            this.A.incrementAndGet();
            this.u.setVisibility(4);
            this.t.setVisibility(0);
        }
        this.b.a(this.n.a().b((ajdw) this.m.g()).a((ajdw) this.m.b()).f(new -$$Lambda$00YF9IkyQV0kziIbbfADv3y0yzU(this)).a((ajdw) this.m.l()).a(new -$$Lambda$ach_B8g3D7oiHo0bVcLDGO0bbUM(this), new -$$Lambda$Fnm7i25g7EUgJ6A86HcMAH2Ouuc(this)));
        this.b.a(this.n.b().b((ajdw) this.m.g()).a(-$$Lambda$tki$JBrZoUOQijzSEiuaIzaZzcCGe2M.INSTANCE, new -$$Lambda$tki$8iUHh399Pofo8YpX1NvRIZDJj_8(this)));
        return this.v;
    }

    public final znh<tlb> a(agit agit) {
        List a = thr.a(agit);
        return a.isEmpty() ? znk.a : tlc.a(g(), a);
    }

    public final void a(Context context, Bundle bundle, boolean z, tgq tgq, zkf zkf, FragmentActivity fragmentActivity, fv fvVar) {
        super.a(context, bundle, z, tgq, zkf, fragmentActivity, fvVar);
        zkf.a(this);
        this.y = h().getString("PAYMENTS_METHOD_CURRENTLY_SELECTED_ID");
        this.s = new zmf(new zms(this.c, tkq.class), zkf.b);
        this.r = new zmf(new zms(this.c, tkq.class), zkf.b);
        this.x = h().getString("INVALID_PAYMENTS_CARD_ID", null);
        this.z = (the) h().getParcelable("INVALID_PAYMENTS_CARD_ERROR");
        this.a.f();
    }

    public final void a(Throwable th) {
        i();
        this.v.findViewById(R.id.transaction_history_entry).setVisibility(8);
        if (th instanceof thg) {
            this.q.a(g(), ((thg) th).a);
            return;
        }
        th.getLocalizedMessage();
        Log.getStackTraceString(th);
        abpe.a("PaymentsMethodSettingPage");
    }

    public final void a(znh<tlb> znh) {
        znh znh2;
        i();
        View findViewById = this.v.findViewById(R.id.transaction_history_entry);
        findViewById.setVisibility(0);
        View findViewById2 = this.v.findViewById(R.id.payments_order_information_option);
        findViewById2.setVisibility(8);
        if (znh2.a() == 0) {
            findViewById.setVisibility(8);
        } else if (znh2.a() > 2) {
            znh2 = znk.a(Arrays.asList(new tlb[]{(tlb) znh2.a(0), (tlb) znh2.a(1)}));
            findViewById2.setVisibility(0);
        }
        this.s.a(znh2);
    }

    public final boolean a() {
        return this.l;
    }

    public final void b() {
        List list = this.o.a;
        Context g = g();
        boolean z = this.l;
        Object obj = this.x;
        Object obj2 = this.y;
        akcr.b(list, "paymentMethods");
        akcr.b(g, "context");
        ArrayList arrayList = new ArrayList(list.size() + 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tho tho = (tho) it.next();
            thm thm = tho.a;
            akcr.a((Object) thm, "paymentMethod.paymentsCard");
            boolean a = akcr.a(obj2, tho.b);
            Object e = thm.e();
            Object a2 = tii.a(thm);
            akcr.a(a2, "PaymentsCardNumberFormatter.formatExpiry(card)");
            Object[] objArr = new Object[2];
            objArr[0] = String.valueOf(thm.f.intValue());
            String valueOf = String.valueOf(thm.g.intValue());
            if (valueOf != null) {
                Object substring = valueOf.substring(2);
                akcr.a(substring, "(this as java.lang.String).substring(startIndex)");
                objArr[1] = substring;
                a2 = String.format(a2, Arrays.copyOf(objArr, 2));
                akcr.a(a2, "java.lang.String.format(format, *args)");
                boolean d = thm.d();
                boolean z2 = thm.c() && (akcr.a(tho.b, obj) ^ 1) != 0;
                Drawable a3 = tlo.a(g, thm);
                akcr.a(e, "lastFour");
                Iterator it2 = it;
                tlf tlf = r3;
                tlf tlf2 = new tlf(a, e, a2, d, z, z2, a3, tho);
                arrayList.add(tlf);
                it = it2;
            } else {
                throw new ajxt("null cannot be cast to non-null type java.lang.String");
            }
        }
        arrayList.add(new tle(z));
        this.r.a(znk.a((List) arrayList));
    }

    public final void b(Throwable th) {
        this.b.a(ajcx.a(new -$$Lambda$tki$ec7glxMc_OqyAjbhh4wsktBtusM(this)).b((ajdw) this.m.l()).e());
    }

    public final void c() {
        e();
        this.b.a(ajcx.a(new -$$Lambda$tki$BTt4WGPPp37LUsrfY5GdwSBl1K4(this)).b((ajdw) this.m.l()).e());
    }

    public final void d() {
        this.i.onBackPressed();
    }

    public final void e() {
        String str = this.y;
        if (str != null && this.o.a(str) == null) {
            this.y = null;
            this.w.a(false);
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onOrderItemClickedEvent(tkw tkw) {
        this.p.a(tkw.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPaymentMethodItemClickedEvent(tkx tkx) {
        tho tho = tkx.a;
        if (tho.b != null) {
            if (this.l && tho.a.c() && !a(tho.a.a)) {
                this.y = tho.b;
                b();
                if (this.k != null) {
                    this.k.a(Collections.singletonList(tho), false);
                }
                d();
                return;
            }
            Bundle bundle = new Bundle();
            tho = this.o.a(tho.b);
            if (tho != null) {
                bundle.putString("payments_editing_card_id_bundle_key", tho.b);
                String str = tho.b;
                if (this.z != null && a(str)) {
                    bundle.putParcelable("payments_editing_card_error_bundle_key", this.z);
                }
            }
            String str2 = "payments_card_billing_address_key";
            Parcelable parcelable = h().getParcelable(str2);
            if (parcelable != null) {
                bundle.putParcelable(str2, parcelable);
            }
            if (this.l) {
                this.p.c(bundle, this.k);
            } else {
                this.p.b(bundle);
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPaymentMethodNewCardClickedEvent(tky tky) {
        if (this.l) {
            Bundle bundle = new Bundle();
            String str = "payments_card_billing_address_key";
            Parcelable parcelable = h().getParcelable(str);
            if (parcelable != null) {
                bundle.putParcelable(str, parcelable);
            }
            this.p.c(bundle, this.k);
            return;
        }
        this.p.c();
    }
}

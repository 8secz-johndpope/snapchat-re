package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snapchat.android.R;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: tkg */
public final class tkg extends tih {
    private View a;
    private View b;
    private TextView c;
    private final tgo d;
    private final zfw e;
    private final tkp m;
    private final tjj n;
    private final tlc o;
    private final tig p;
    private final ajei q = new ajei();
    private zmf r;

    public tkg(tgo tgo, tkp tkp, tjj tjj, tlc tlc, tig tig) {
        this.d = tgo;
        this.e = zgb.a(tfv.A.callsite("OrderHistoryPage"));
        this.m = tkp;
        this.n = tjj;
        this.o = tlc;
        this.p = tig;
    }

    private void a(Throwable th) {
        if (th instanceof thg) {
            the the = ((thg) th).a;
            this.b.setVisibility(8);
            this.c.setText(tlm.a(the, this.f.getResources()));
            this.c.setVisibility(0);
            return;
        }
        th.getLocalizedMessage();
        Log.getStackTraceString(th);
        abpe.a("OrderHistoryPage");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.a = layoutInflater.inflate(R.layout.payments_order_history_fragment, viewGroup, false);
        this.b = this.a.findViewById(R.id.payments_loading_progress);
        this.c = (TextView) this.a.findViewById(R.id.order_history_empty_label);
        tlw.a(this.g, this.a).a((int) R.string.payments_order_history);
        RecyclerView recyclerView = (RecyclerView) this.a.findViewById(R.id.order_history_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f, 1, false));
        recyclerView.setItemAnimator(new ziv("OrderHistoryPage"));
        recyclerView.addItemDecoration(new DividerItemDecoration(this.f, 1));
        recyclerView.setAdapter(this.r);
        this.q.a(this.d.a().b((ajdw) this.e.g()).a((ajdw) this.e.b()).f(new -$$Lambda$GLX25RrNO58CgaTbTm6PIY4Bhck(this)).a((ajdw) this.e.l()).a(new -$$Lambda$uKL7n8fmdUeZi3k8EG8FAAqT7gA(this), new -$$Lambda$tkg$2mCqU0eZeb3eg69zisoqV17O12w(this)));
        return this.a;
    }

    public final znh<tlb> a(agit agit) {
        List a = thr.a(agit);
        return a.isEmpty() ? znk.a : tlc.a(this.f, a);
    }

    public final void a() {
        this.n.a(aagf.ORDER_HISTORY);
    }

    public final void a(Context context, Bundle bundle, boolean z, tgq tgq, zkf zkf, FragmentActivity fragmentActivity, fv fvVar) {
        super.a(context, bundle, z, tgq, zkf, fragmentActivity, fvVar);
        zkf.a(this);
        this.r = new zmf(new zms(this.m, tkq.class), zkf.b);
    }

    public final void a(znh<tlb> znh) {
        this.b.setVisibility(8);
        this.r.a((znh) znh);
    }

    public final void b() {
        this.n.b();
    }

    public final void c() {
        this.q.a();
    }

    public final void d() {
        this.i.onBackPressed();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onOrderItemClickedEvent(tkw tkw) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("payments_order_bundle_idfr", tkw.a);
        this.p.c(bundle);
    }
}

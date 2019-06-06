package com.snap.shake2report.settings.reportsection;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.ui.view.ScHeaderView;
import defpackage.achb;
import defpackage.aily;
import defpackage.ailz;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfl;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyn;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.akqq;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.wqp;
import defpackage.wqv;
import defpackage.wuc;
import defpackage.wud;
import defpackage.wue;
import defpackage.wug;
import defpackage.wum;
import defpackage.wun;
import defpackage.wuo;
import defpackage.wvp;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkf;
import defpackage.zll;
import defpackage.zln;
import defpackage.zlx;
import defpackage.zmf;
import defpackage.zms;
import defpackage.znk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

public class ReportTechnicalIssuePresenter extends zll<ReportTechnicalIssueFragment> implements k {
    final ajxe a = ajxh.a(g.a);
    final zkf b;
    final achb<zjm, zjk> c;
    final ajwy<wqp> d;
    private final ajxe e;
    private final ajxe f = ajxh.a(new a(this));
    private final ajei g = new ajei();
    private final Context h;
    private final wud i;
    private final wug j;

    static final class b implements OnClickListener {
        private /* synthetic */ ReportTechnicalIssuePresenter a;

        b(ReportTechnicalIssuePresenter reportTechnicalIssuePresenter) {
            this.a = reportTechnicalIssuePresenter;
        }

        public final void onClick(View view) {
            this.a.c.e();
        }
    }

    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "issueTypeList");
            Iterable<wuc> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (wuc wum : iterable) {
                arrayList.add(new wum(wum));
            }
            return (List) arrayList;
        }
    }

    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class e<T> implements ajfb<List<? extends wum>> {
        private /* synthetic */ ReportTechnicalIssuePresenter a;

        e(ReportTechnicalIssuePresenter reportTechnicalIssuePresenter) {
            this.a = reportTechnicalIssuePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            zmf a = this.a.a();
            akcr.a((Object) list, "it");
            a.a(znk.a(list));
        }
    }

    public static final class RecyclerViewLinerLayoutManager extends LinearLayoutManager {
        public RecyclerViewLinerLayoutManager(Context context) {
            akcr.b(context, "context");
            super(context);
        }

        public final boolean canScrollVertically() {
            return false;
        }
    }

    static final class a extends akcs implements akbk<zmf> {
        private /* synthetic */ ReportTechnicalIssuePresenter a;

        a(ReportTechnicalIssuePresenter reportTechnicalIssuePresenter) {
            this.a = reportTechnicalIssuePresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zmf((zms) this.a.a.b(), this.a.b.a());
        }
    }

    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        f(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(wqv.g, "ReportTechnicalIssuePresenter");
        }
    }

    static final class g extends akcs implements akbk<zms> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zms((zlx) new wun(), wuo.class);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ReportTechnicalIssuePresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(ReportTechnicalIssuePresenter.class), "viewFactory", "getViewFactory()Lcom/snap/ui/recycling/factory/ViewFactory;"), new akdc(akde.a(ReportTechnicalIssuePresenter.class), "adapter", "getAdapter()Lcom/snap/ui/recycling/adapter/BindingViewModelAdapter;")};
    }

    public ReportTechnicalIssuePresenter(Context context, wud wud, zkf zkf, achb<zjm, zjk> achb, wug wug, ajwy<wqp> ajwy, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(wud, "issueTypeDataSource");
        akcr.b(zkf, "bus");
        akcr.b(achb, "navigationHost");
        akcr.b(wug, "reportTechnicalIssueController");
        akcr.b(ajwy, "blizzardAnalyticsHelper");
        akcr.b(zgb, "schedulersProvider");
        this.h = context;
        this.i = wud;
        this.b = zkf;
        this.c = achb;
        this.j = wug;
        this.d = ajwy;
        this.e = ajxh.a(new f(zgb));
    }

    private final zfw b() {
        return (zfw) this.e.b();
    }

    /* Access modifiers changed, original: final */
    public final zmf a() {
        return (zmf) this.f.b();
    }

    /* renamed from: a */
    public final void takeTarget(ReportTechnicalIssueFragment reportTechnicalIssueFragment) {
        akcr.b(reportTechnicalIssueFragment, "target");
        super.takeTarget(reportTechnicalIssueFragment);
        reportTechnicalIssueFragment.getLifecycle().a(this);
        ajej a = this.b.a(this);
        akcr.a((Object) a, "bus.subscribe(this)");
        ajvv.a(a, this.g);
    }

    public void dropTarget() {
        ReportTechnicalIssueFragment reportTechnicalIssueFragment = (ReportTechnicalIssueFragment) getTarget();
        if (reportTechnicalIssueFragment != null) {
            j lifecycle = reportTechnicalIssueFragment.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
        this.g.a();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onFragmentResume() {
        ReportTechnicalIssueFragment reportTechnicalIssueFragment = (ReportTechnicalIssueFragment) getTarget();
        RecyclerView recyclerView = null;
        ScHeaderView b = reportTechnicalIssueFragment != null ? reportTechnicalIssueFragment.b() : null;
        if (b == null) {
            akcr.a();
        }
        b.setBackArrowOnClickListener(new b(this));
        reportTechnicalIssueFragment = (ReportTechnicalIssueFragment) getTarget();
        if (reportTechnicalIssueFragment != null) {
            recyclerView = reportTechnicalIssueFragment.e;
            if (recyclerView == null) {
                akcr.a("recycleView");
            }
        }
        if (recyclerView == null) {
            akcr.a();
        }
        recyclerView.setLayoutManager(new RecyclerViewLinerLayoutManager(this.h));
        recyclerView.addItemDecoration(new wue(this.h));
        recyclerView.setAdapter(a());
        wud wud = this.i;
        wuc[] values = wuc.values();
        Object i = ajdp.a((wuc[]) Arrays.copyOf(values, values.length)).a((ajfl) new defpackage.wud.a(wud)).a(16).i();
        akcr.a(i, "Observable.fromArray(*Is…          .toObservable()");
        zln.bindTo$default(this, i.p(c.a).b((ajdw) b().h()).a((ajdw) b().l()).c((ajfb) d.a).f((ajfb) new e(this)), this, null, null, 6, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onScreenItemSelected(wvp wvp) {
        akcr.b(wvp, "event");
        wug wug = this.j;
        wuc wuc = wvp.a;
        aily aily = aily.IN_SETTING_REPORT;
        ReportTechnicalIssueFragment reportTechnicalIssueFragment = (ReportTechnicalIssueFragment) getTarget();
        ailz h = reportTechnicalIssueFragment != null ? reportTechnicalIssueFragment.h() : null;
        if (h == null) {
            akcr.a();
        }
        ajvv.a(wug.a(wuc, aily, h, null), this.g);
    }
}

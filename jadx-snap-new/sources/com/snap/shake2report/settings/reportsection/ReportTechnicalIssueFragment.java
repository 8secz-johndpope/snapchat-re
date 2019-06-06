package com.snap.shake2report.settings.reportsection;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.ScHeaderView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.aaos;
import defpackage.achb;
import defpackage.acih;
import defpackage.ailz;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.wqp;
import defpackage.wui;
import defpackage.wuj;
import defpackage.wuk;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkf;
import defpackage.zkq;

public final class ReportTechnicalIssueFragment extends MainPageFragment implements wuk, zjq {
    public ReportTechnicalIssuePresenter a;
    public zkf b;
    public zkq c;
    public achb<zjm, zjk> d;
    public RecyclerView e;
    private ScHeaderView f;
    private SnapFontTextView g;
    private ailz h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    private SnapFontTextView i() {
        SnapFontTextView snapFontTextView = this.g;
        if (snapFontTextView == null) {
            akcr.a("descriptionView");
        }
        return snapFontTextView;
    }

    public final long S_() {
        return 2000;
    }

    public final void a(acih acih) {
        if (acih instanceof wui) {
            wui wui = (wui) acih;
            ailz ailz = wui.a;
            akcr.b(ailz, "<set-?>");
            this.h = ailz;
            ReportTechnicalIssuePresenter reportTechnicalIssuePresenter = this.a;
            if (reportTechnicalIssuePresenter == null) {
                akcr.a("presenter");
            }
            ailz ailz2 = wui.a;
            akcr.b(ailz2, "reportType");
            int i = wuj.b[ailz2.ordinal()];
            int i2 = R.string.s2r_report_a_technical_issue_label;
            if (i != 1 && i == 2) {
                i2 = R.string.s2r_suggest_an_improvement_label;
            }
            ReportTechnicalIssueFragment reportTechnicalIssueFragment = (ReportTechnicalIssueFragment) reportTechnicalIssuePresenter.getTarget();
            ScHeaderView b = reportTechnicalIssueFragment != null ? reportTechnicalIssueFragment.b() : null;
            if (b == null) {
                akcr.a();
            }
            b.setTitleText(i2);
            if (h() == ailz.PROBLEM) {
                i().setText(R.string.s2r_report_technical_issue_top_description);
                return;
            }
            i().setText(R.string.s2r_suggest_improvement_top_description);
        }
    }

    public final ScHeaderView b() {
        ScHeaderView scHeaderView = this.f;
        if (scHeaderView == null) {
            akcr.a("headerView");
        }
        return scHeaderView;
    }

    public final ailz h() {
        ailz ailz = this.h;
        if (ailz == null) {
            akcr.a("reportType");
        }
        return ailz;
    }

    public final boolean o_() {
        aaos aaos;
        ReportTechnicalIssuePresenter reportTechnicalIssuePresenter = this.a;
        if (reportTechnicalIssuePresenter == null) {
            akcr.a("presenter");
        }
        ReportTechnicalIssueFragment reportTechnicalIssueFragment = (ReportTechnicalIssueFragment) reportTechnicalIssuePresenter.getTarget();
        ailz h = reportTechnicalIssueFragment != null ? reportTechnicalIssueFragment.h() : null;
        if (h != null) {
            int i = wuj.a[h.ordinal()];
            if (i != 1 && i == 2) {
                aaos = aaos.SUGGEST_AN_IMPROVEMENT;
                ((wqp) reportTechnicalIssuePresenter.d.get()).a(aaos);
                return super.o_();
            }
        }
        aaos = aaos.REPORT_A_TECHNICAL_ISSUE;
        ((wqp) reportTechnicalIssuePresenter.d.get()).a(aaos);
        return super.o_();
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        ReportTechnicalIssuePresenter reportTechnicalIssuePresenter = this.a;
        if (reportTechnicalIssuePresenter == null) {
            akcr.a("presenter");
        }
        reportTechnicalIssuePresenter.takeTarget(this);
        super.onAttach(context);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(R.layout.s2r_report_technical_issue_fragment, viewGroup, false);
        akcr.a(inflate, "inflater.inflate(R.layou…agment, container, false)");
        Object findViewById = inflate.findViewById(R.id.s2r_report_technical_issue_header);
        akcr.a(findViewById, "view.findViewById(R.id.s…t_technical_issue_header)");
        ScHeaderView scHeaderView = (ScHeaderView) findViewById;
        String str = "<set-?>";
        akcr.b(scHeaderView, str);
        this.f = scHeaderView;
        findViewById = inflate.findViewById(R.id.s2r_report_page_description);
        akcr.a(findViewById, "view.findViewById(R.id.s…_report_page_description)");
        SnapFontTextView snapFontTextView = (SnapFontTextView) findViewById;
        akcr.b(snapFontTextView, str);
        this.g = snapFontTextView;
        findViewById = inflate.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        akcr.b(recyclerView, str);
        this.e = recyclerView;
        return inflate;
    }

    public final void onDetach() {
        ReportTechnicalIssuePresenter reportTechnicalIssuePresenter = this.a;
        if (reportTechnicalIssuePresenter == null) {
            akcr.a("presenter");
        }
        reportTechnicalIssuePresenter.dropTarget();
        super.onDetach();
    }
}

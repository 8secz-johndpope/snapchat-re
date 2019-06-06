package com.snap.shake2report.ui.reportpage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.snap.shake2report.ui.attachmentview.AttachmentView;
import com.snap.shake2report.ui.featureselector.S2RAdditionalInfoView;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.ScHeaderView;
import defpackage.aipx;
import defpackage.akcr;
import defpackage.fz;
import defpackage.wwm;

public final class ReportPageFragment extends MainPageFragment implements wwm {
    public ReportPagePresenter a;
    private View b;
    private ScHeaderView c;
    private EditText d;
    private Button e;
    private S2RAdditionalInfoView f;
    private AttachmentView g;

    public final View b() {
        View view = this.b;
        if (view == null) {
            akcr.a("fragmentView");
        }
        return view;
    }

    public final ScHeaderView c() {
        ScHeaderView scHeaderView = this.c;
        if (scHeaderView == null) {
            akcr.a("headerView");
        }
        return scHeaderView;
    }

    public final EditText h() {
        EditText editText = this.d;
        if (editText == null) {
            akcr.a("descriptionInput");
        }
        return editText;
    }

    public final Button i() {
        Button button = this.e;
        if (button == null) {
            akcr.a("submitButton");
        }
        return button;
    }

    public final S2RAdditionalInfoView j() {
        S2RAdditionalInfoView s2RAdditionalInfoView = this.f;
        if (s2RAdditionalInfoView == null) {
            akcr.a("additionalInfoView");
        }
        return s2RAdditionalInfoView;
    }

    public final AttachmentView k() {
        AttachmentView attachmentView = this.g;
        if (attachmentView == null) {
            akcr.a("attachmentView");
        }
        return attachmentView;
    }

    public final fz l() {
        Object childFragmentManager = getChildFragmentManager();
        akcr.a(childFragmentManager, "childFragmentManager");
        return childFragmentManager;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        ReportPagePresenter reportPagePresenter = this.a;
        if (reportPagePresenter == null) {
            akcr.a("presenter");
        }
        reportPagePresenter.takeTarget((wwm) this);
        super.onAttach(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00df  */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
        r6 = this;
        r9 = "inflater";
        defpackage.akcr.b(r7, r9);
        r9 = 0;
        r0 = 2131559233; // 0x7f0d0341 float:1.8743804E38 double:1.053130189E-314;
        r7 = r7.inflate(r0, r8, r9);
        if (r7 == 0) goto L_0x011f;
    L_0x000f:
        r8 = "<set-?>";
        defpackage.akcr.b(r7, r8);
        r6.b = r7;
        r7 = r6.b();
        r0 = 2131429836; // 0x7f0b09cc float:1.8481356E38 double:1.0530662585E-314;
        r7 = r7.findViewById(r0);
        r0 = "fragmentView.findViewById(R.id.s2r_header)";
        defpackage.akcr.a(r7, r0);
        r7 = (com.snap.ui.view.ScHeaderView) r7;
        defpackage.akcr.b(r7, r8);
        r6.c = r7;
        r7 = r6.b();
        r0 = 2131429825; // 0x7f0b09c1 float:1.8481334E38 double:1.053066253E-314;
        r7 = r7.findViewById(r0);
        r0 = "fragmentView.findViewById(R.id.s2r_description)";
        defpackage.akcr.a(r7, r0);
        r7 = (android.widget.EditText) r7;
        defpackage.akcr.b(r7, r8);
        r6.d = r7;
        r7 = r6.b();
        r0 = 2131429881; // 0x7f0b09f9 float:1.8481447E38 double:1.0530662807E-314;
        r7 = r7.findViewById(r0);
        r0 = "fragmentView.findViewById(R.id.s2r_submit_button)";
        defpackage.akcr.a(r7, r0);
        r7 = (android.widget.Button) r7;
        defpackage.akcr.b(r7, r8);
        r6.e = r7;
        r7 = r6.b();
        r0 = 2131429815; // 0x7f0b09b7 float:1.8481313E38 double:1.053066248E-314;
        r7 = r7.findViewById(r0);
        r0 = "fragmentView.findViewByI…s2r_additional_info_view)";
        defpackage.akcr.a(r7, r0);
        r7 = (com.snap.shake2report.ui.featureselector.S2RAdditionalInfoView) r7;
        defpackage.akcr.b(r7, r8);
        r6.f = r7;
        r7 = r6.b();
        r0 = 2131429819; // 0x7f0b09bb float:1.8481321E38 double:1.05306625E-314;
        r7 = r7.findViewById(r0);
        r0 = "fragmentView.findViewByI…r_attachment_view_layout)";
        defpackage.akcr.a(r7, r0);
        r7 = (com.snap.shake2report.ui.attachmentview.AttachmentView) r7;
        defpackage.akcr.b(r7, r8);
        r6.g = r7;
        r7 = r6.a;
        if (r7 != 0) goto L_0x0092;
    L_0x008d:
        r8 = "presenter";
        defpackage.akcr.a(r8);
    L_0x0092:
        r8 = r6.getActivity();
        r0 = 0;
        if (r8 == 0) goto L_0x00a6;
    L_0x0099:
        r8 = r8.getIntent();
        if (r8 == 0) goto L_0x00a6;
    L_0x009f:
        r1 = "stacktrace";
        r8 = r8.getStringExtra(r1);
        goto L_0x00a7;
    L_0x00a6:
        r8 = r0;
    L_0x00a7:
        r1 = r6.getActivity();
        if (r1 == 0) goto L_0x00ba;
    L_0x00ad:
        r1 = r1.getIntent();
        if (r1 == 0) goto L_0x00ba;
    L_0x00b3:
        r2 = "shakeId";
        r1 = r1.getStringExtra(r2);
        goto L_0x00bb;
    L_0x00ba:
        r1 = r0;
    L_0x00bb:
        r2 = r6.getActivity();
        if (r2 == 0) goto L_0x00cd;
    L_0x00c1:
        r2 = r2.getIntent();
        if (r2 == 0) goto L_0x00cd;
    L_0x00c7:
        r0 = "crashLabel";
        r0 = r2.getStringExtra(r0);
    L_0x00cd:
        r2 = r8;
        r2 = (java.lang.CharSequence) r2;
        r3 = 1;
        if (r2 == 0) goto L_0x00dc;
    L_0x00d3:
        r2 = r2.length();
        if (r2 != 0) goto L_0x00da;
    L_0x00d9:
        goto L_0x00dc;
    L_0x00da:
        r2 = 0;
        goto L_0x00dd;
    L_0x00dc:
        r2 = 1;
    L_0x00dd:
        if (r2 != 0) goto L_0x011a;
    L_0x00df:
        r2 = r1;
        r2 = (java.lang.CharSequence) r2;
        if (r2 == 0) goto L_0x00ed;
    L_0x00e4:
        r2 = r2.length();
        if (r2 != 0) goto L_0x00eb;
    L_0x00ea:
        goto L_0x00ed;
    L_0x00eb:
        r2 = 0;
        goto L_0x00ee;
    L_0x00ed:
        r2 = 1;
    L_0x00ee:
        if (r2 != 0) goto L_0x011a;
    L_0x00f0:
        r2 = r7.a;
        if (r1 != 0) goto L_0x00f7;
    L_0x00f4:
        defpackage.akcr.a();
    L_0x00f7:
        r4 = defpackage.ailz.PROBLEM;
        r5 = defpackage.aily.SHAKE_REPORT;
        r2.a(r1, r4, r5, r3);
        r1 = r7.a;
        if (r8 != 0) goto L_0x0105;
    L_0x0102:
        defpackage.akcr.a();
    L_0x0105:
        r1.l = r8;
        r8 = r7.a;
        r1 = new defpackage.wvm[r3];
        r2 = defpackage.wvm.LOG;
        r1[r9] = r2;
        r9 = defpackage.ajym.c(r1);
        r8.a(r9);
        r7 = r7.a;
        r7.m = r0;
    L_0x011a:
        r7 = r6.b();
        return r7;
    L_0x011f:
        r7 = new ajxt;
        r8 = "null cannot be cast to non-null type android.view.View";
        r7.<init>(r8);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.shake2report.ui.reportpage.ReportPageFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        super.onDetach();
        ReportPagePresenter reportPagePresenter = this.a;
        if (reportPagePresenter == null) {
            akcr.a("presenter");
        }
        reportPagePresenter.dropTarget();
    }
}

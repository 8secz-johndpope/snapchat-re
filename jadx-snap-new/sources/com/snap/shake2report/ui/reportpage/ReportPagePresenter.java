package com.snap.shake2report.ui.reportpage;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.snap.shake2report.ui.attachmentview.AttachmentView;
import com.snap.shake2report.ui.featureselector.S2RAdditionalInfoView;
import com.snap.ui.view.ScHeaderView;
import com.snapchat.android.R;
import defpackage.achd;
import defpackage.ailz;
import defpackage.ajei;
import defpackage.ajwy;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.gpb;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.wqp;
import defpackage.wqv;
import defpackage.wvl;
import defpackage.wvq;
import defpackage.wvx;
import defpackage.wwh;
import defpackage.wwl;
import defpackage.wwm;
import defpackage.wwn;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ReportPagePresenter extends zll<wwm> implements k {
    final wvl a;
    final wvq b;
    final wwl c;
    private final ajei d = new ajei();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final Context f;
    private final zke g;
    private final zgb h;
    private final gpb i;
    private final wvx j;
    private final ajwy<wwn> k;
    private final ajwy<wqp> l;

    static final class a implements OnFocusChangeListener {
        private /* synthetic */ ReportPagePresenter a;

        a(ReportPagePresenter reportPagePresenter) {
            this.a = reportPagePresenter;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                wwl wwl = this.a.c;
                if (view != null) {
                    wwl.a = ((TextView) view).getText().toString();
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.widget.TextView");
            }
        }
    }

    static final class b implements OnClickListener {
        final /* synthetic */ ReportPagePresenter a;

        /* renamed from: com.snap.shake2report.ui.reportpage.ReportPagePresenter$b$1 */
        static final class AnonymousClass1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ b a;

            AnonymousClass1(b bVar) {
                this.a = bVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                ReportPagePresenter.a(this.a.a);
                return ajxw.a;
            }
        }

        b(ReportPagePresenter reportPagePresenter) {
            this.a = reportPagePresenter;
        }

        public final void onClick(View view) {
            if (this.a.a.n) {
                wvq wvq = this.a.b;
                akbk anonymousClass1 = new AnonymousClass1(this);
                akcr.b(anonymousClass1, "submitTicketFunction");
                zgy a = defpackage.zgy.a.a(new defpackage.zgy.a(wvq.a, wvq.b, new zjm(wqv.g, "s2r_db_dump_warning_dialog", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 16).a((int) R.string.s2r_db_dump_submit_warning_dialog_title).b((int) R.string.s2r_db_dump_warning_dialog_body).a((int) R.string.s2r_db_dump_warning_dialog_button, (akbl) new defpackage.wvq.a(anonymousClass1), true), null, false, null, null, null, 31).a();
                wvq.b.a((achd) a, wvq.a(a), null);
                return;
            }
            ReportPagePresenter.a(this.a);
        }
    }

    public ReportPagePresenter(Context context, zke zke, zgb zgb, wvl wvl, gpb gpb, wvq wvq, wvx wvx, wwl wwl, ajwy<wwn> ajwy, ajwy<wqp> ajwy2) {
        akcr.b(context, "context");
        akcr.b(zke, "dispatcher");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(wvl, "reportConfigProvider");
        akcr.b(gpb, "userAuthStore");
        akcr.b(wvq, "shake2ReportDialogNavigator");
        akcr.b(wvx, "attachmentViewPresenter");
        akcr.b(wwl, "reportPageIntermediateDataHolder");
        akcr.b(ajwy, "reportTicketPreparationHelper");
        akcr.b(ajwy2, "blizzardAnalyticsHelper");
        this.f = context;
        this.g = zke;
        this.h = zgb;
        this.a = wvl;
        this.i = gpb;
        this.b = wvq;
        this.j = wvx;
        this.c = wwl;
        this.k = ajwy;
        this.l = ajwy2;
    }

    private final void a(String str) {
        Toast.makeText(this.f, str, 0).show();
    }

    /* renamed from: a */
    public final void takeTarget(wwm wwm) {
        akcr.b(wwm, "target");
        super.takeTarget(wwm);
        wwm.getLifecycle().a(this);
    }

    public final void dropTarget() {
        wwm wwm = (wwm) getTarget();
        if (wwm != null) {
            j lifecycle = wwm.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onFragmentResumed() {
        if (this.a.n) {
            wvq wvq = this.b;
            zgy a = new defpackage.zgy.a(wvq.a, wvq.b, new zjm(wqv.g, "s2r_db_tweak_option_dialog", false, false, true, false, null, false, false, false, false, null, 4076), true, null, 16).a((int) R.string.s2r_db_dump_warning_dialog_title).b((int) R.string.s2r_db_dump_warning_dialog_body).a((int) R.string.s2r_db_dump_warning_dialog_button, (akbl) defpackage.wvq.b.a, true).a();
            wvq.b.a((achd) a, wvq.a(a), null);
        }
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onFragmentStart() {
        boolean z = true;
        if (this.e.compareAndSet(false, true)) {
            wwm wwm = (wwm) getTarget();
            if (wwm != null) {
                ScHeaderView c = wwm.c();
                if (c != null) {
                    c.setTitleText(this.a.d);
                }
            }
            wwm = (wwm) getTarget();
            EditText editText = null;
            if (wwm != null) {
                S2RAdditionalInfoView j = wwm.j();
                if (j != null) {
                    wwm wwm2 = (wwm) getTarget();
                    Object b = wwm2 != null ? wwm2.b() : null;
                    if (b == null) {
                        akcr.a();
                    }
                    gpb gpb = this.i;
                    zgb zgb = this.h;
                    wvl wvl = this.a;
                    akcr.b(b, "rootView");
                    akcr.b(gpb, "userAuthStore");
                    akcr.b(zgb, "schedulersProvider");
                    akcr.b(wvl, "reportConfigProvider");
                    j.a = (wwh) b.findViewById(wvl.e ? R.id.s2r_internal_additional_info_collector : R.id.s2r_beta_additional_info_collector);
                    wwh wwh = j.a;
                    if (wwh == null) {
                        akcr.a();
                    }
                    wwh.a(b, gpb, zgb, wvl);
                }
            }
            wwm = (wwm) getTarget();
            if (wwm != null) {
                AttachmentView k = wwm.k();
                if (k != null) {
                    wvx wvx = this.j;
                    Object obj = (wwm) getTarget();
                    if (obj == null) {
                        akcr.a();
                    }
                    akcr.a(obj, "target!!");
                    akcr.b(wvx, "presenter");
                    akcr.b(obj, "reportPageTarget");
                    wvx.takeTarget(new com.snap.shake2report.ui.attachmentview.AttachmentView.a((ViewPager) k.findViewById(R.id.s2r_fragment_attachments_view_pager), obj));
                }
            }
            wwm = (wwm) getTarget();
            EditText h = wwm != null ? wwm.h() : null;
            if (h == null) {
                akcr.a();
            }
            h.setOnFocusChangeListener(new a(this));
            CharSequence charSequence = this.c.a;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (!z) {
                wwm wwm3 = (wwm) getTarget();
                if (wwm3 != null) {
                    editText = wwm3.h();
                }
                if (editText == null) {
                    akcr.a();
                }
                editText.setText(charSequence);
            } else if (this.a.b == ailz.SUGGESTION) {
                wwm = (wwm) getTarget();
                if (wwm != null) {
                    editText = wwm.h();
                }
                if (editText == null) {
                    akcr.a();
                }
                editText.setHint(R.string.s2r_suggest_improvement_description_hint);
            }
            wwm = (wwm) getTarget();
            if (wwm != null) {
                Button i = wwm.i();
                if (i != null) {
                    i.setOnClickListener(new b(this));
                }
            }
        }
    }

    @s(a = defpackage.j.a.ON_STOP)
    public final void onFragmentStop() {
        this.d.a();
        wwm wwm = (wwm) getTarget();
        if (wwm != null) {
            S2RAdditionalInfoView j = wwm.j();
            if (j != null) {
                wwh wwh = j.a;
                if (wwh == null) {
                    akcr.a();
                }
                wwh.c();
            }
        }
    }
}

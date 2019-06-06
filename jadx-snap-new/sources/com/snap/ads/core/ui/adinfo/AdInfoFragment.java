package com.snap.ads.core.ui.adinfo;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.achd;
import defpackage.acih;
import defpackage.aipx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.cur;
import defpackage.cut;
import defpackage.cuu;
import defpackage.cvf;
import defpackage.kky;
import defpackage.zjq;
import defpackage.zkq;

public final class AdInfoFragment extends MainPageFragment implements cuu, zjq {
    public cut a;
    public ajwy<zkq> b;
    private ajei c;
    private View d;
    private View e;
    private cvf f;

    static final class b implements OnClickListener {
        private /* synthetic */ AdInfoFragment a;

        b(AdInfoFragment adInfoFragment) {
            this.a = adInfoFragment;
        }

        public final void onClick(View view) {
            cut a = this.a.a();
            cuu cuu = (cuu) a.getTarget();
            if (cuu != null) {
                cvf b = cuu.b();
                if (b != null) {
                    ((kky) a.a.b()).a(b.c, b.b);
                }
            }
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ AdInfoFragment a;

        c(AdInfoFragment adInfoFragment) {
            this.a = adInfoFragment;
        }

        public final void onClick(View view) {
            cut a = this.a.a();
            cur cur = new cur(a.b, a.h, a.c, a.d, a.e, a.f, a.g);
            a.h.a((achd) cur, cur.p, null);
        }
    }

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            this.a.setPadding(0, rect.top, 0, rect.bottom);
        }
    }

    private View h() {
        View view = this.e;
        if (view == null) {
            akcr.a("reportAdView");
        }
        return view;
    }

    public final long S_() {
        return -1;
    }

    public final cut a() {
        cut cut = this.a;
        if (cut == null) {
            akcr.a("presenter");
        }
        return cut;
    }

    public final void a(acih acih) {
        super.a(acih);
        if (acih instanceof cvf) {
            cvf cvf = (cvf) acih;
            akcr.b(cvf, "<set-?>");
            this.f = cvf;
            h().setVisibility(b().a ? 0 : 8);
        }
    }

    public final cvf b() {
        cvf cvf = this.f;
        if (cvf == null) {
            akcr.a("adInfoNavigablePayload");
        }
        return cvf;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        cut cut = this.a;
        if (cut == null) {
            akcr.a("presenter");
        }
        cut.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        this.c = new ajei();
        View inflate = layoutInflater.inflate(R.layout.ad_info_page, viewGroup, false);
        ajwy ajwy = this.b;
        if (ajwy == null) {
            akcr.a("insetsDetector");
        }
        Object obj = ajwy.get();
        akcr.a(obj, "insetsDetector.get()");
        ajej f = ((zkq) obj).a().f((ajfb) new a(inflate));
        akcr.a((Object) f, "insetsDetector.get().win…ect.bottom)\n            }");
        ajei ajei = this.c;
        if (ajei == null) {
            akcr.a("disposable");
        }
        ajvv.a(f, ajei);
        return inflate;
    }

    public final void onDetach() {
        cut cut = this.a;
        if (cut == null) {
            akcr.a("presenter");
        }
        cut.dropTarget();
        super.onDetach();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.ad_info_page_report_ad_container);
        akcr.a(findViewById, "view.findViewById(R.id.a…page_report_ad_container)");
        String str = "<set-?>";
        akcr.b(findViewById, str);
        this.e = findViewById;
        Object findViewById2 = view.findViewById(R.id.ad_info_page_about_ad_container);
        akcr.a(findViewById2, "view.findViewById(R.id.a…_page_about_ad_container)");
        akcr.b(findViewById2, str);
        this.d = findViewById2;
        h().setOnClickListener(new b(this));
        view = this.d;
        if (view == null) {
            akcr.a("aboutAdsView");
        }
        view.setOnClickListener(new c(this));
    }
}

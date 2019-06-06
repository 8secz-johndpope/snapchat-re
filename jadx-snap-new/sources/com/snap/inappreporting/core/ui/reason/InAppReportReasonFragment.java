package com.snap.inappreporting.core.ui.reason;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.inappreporting.core.ui.shared.SubmitReportButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajyn;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.kke;
import defpackage.kko;
import defpackage.kmf;
import defpackage.kmy;
import defpackage.knn;
import defpackage.kno;
import defpackage.knp;
import defpackage.knq;
import defpackage.knr;
import defpackage.knt;
import defpackage.knu;
import defpackage.knv;
import defpackage.knw;
import defpackage.knz;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zjq;
import defpackage.zkq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class InAppReportReasonFragment extends MainPageFragment implements knw, zjq {
    public aipn<zkq> a;
    public aipn<zhh> b;
    public kno c;
    public knt d;
    public aipn<zgb> e;
    final akbl<View, ajxw> f = new b(this);
    final akbl<View, ajxw> g = new e(this);
    final akbl<View, ajxw> h = new d(this);
    private TextView i;
    private ImageView j;
    private RecyclerView k;
    private TextView l;
    private SubmitReportButton m;
    private final ajxe n = ajxh.a(new h(this));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class c<T> implements ajfb<knv> {
        private /* synthetic */ InAppReportReasonFragment a;

        c(InAppReportReasonFragment inAppReportReasonFragment) {
            this.a = inAppReportReasonFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (knv) obj;
            this.a.j();
            knt i = this.a.i();
            String str = "state";
            akcr.a(obj, str);
            akcr.b(obj, str);
            Object obj2 = (knw) i.getTarget();
            if (obj2 != null) {
                akcr.a(obj2, "target ?: return");
                int b = obj.b.b();
                kko kko = obj.a;
                Object string = i.a.getString(b);
                String str2 = "template";
                int i2 = 0;
                int i3 = 1;
                if (knu.a[kko.a().ordinal()] != 1) {
                    akcr.a(string, str2);
                } else {
                    akcr.a(string, str2);
                    string = String.format(string, Arrays.copyOf(new Object[]{kko.c()}, 1));
                    akcr.a(string, "java.lang.String.format(format, *args)");
                }
                knt.a(string, new defpackage.knt.b(obj2.a().getText()), new defpackage.knt.c(obj2.a()));
                Iterable<Object> c = obj.b.c();
                Collection arrayList = new ArrayList(ajyn.a((Iterable) c, 10));
                for (Object obj3 : c) {
                    arrayList.add(new knq(akcr.a(obj3, obj.c), obj3));
                }
                List list = (List) arrayList;
                obj2.d().setAdapter(new knr(i.a, list, new defpackage.knt.d(i)));
                Iterable<knq> iterable = list;
                if (!((Collection) iterable).isEmpty()) {
                    for (knq knq : iterable) {
                        if (knq.a) {
                            break;
                        }
                    }
                }
                i3 = 0;
                obj2.h().setState(i3);
                if (!((knz) i.b.get()).a(obj.a)) {
                    i2 = 4;
                }
                knt.a(Integer.valueOf(i2), new defpackage.knt.e(obj2.f()), new defpackage.knt.f(obj2.f()));
            }
            InAppReportReasonFragment inAppReportReasonFragment = this.a;
            inAppReportReasonFragment.b().setOnClickListener(new knn(inAppReportReasonFragment.f));
            inAppReportReasonFragment.h().setOnClickListener(new knn(inAppReportReasonFragment.g));
            inAppReportReasonFragment.f().setOnClickListener(new knn(inAppReportReasonFragment.h));
        }
    }

    static final class f<T> implements ajfb<Integer> {
        private /* synthetic */ View a;

        f(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            View view = this.a;
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = this.a.getPaddingTop();
            int paddingRight = this.a.getPaddingRight();
            akcr.a(obj, "height");
            view.setPadding(paddingLeft, paddingTop, paddingRight, obj.intValue());
        }
    }

    static final class g<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        g(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, rect.top, marginLayoutParams.rightMargin, rect.bottom);
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppReportReasonFragment a;

        b(InAppReportReasonFragment inAppReportReasonFragment) {
            this.a = inAppReportReasonFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((kmy) ((kno) this.a.i().c.get()).f.get()).d();
            return ajxw.a;
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppReportReasonFragment a;

        d(InAppReportReasonFragment inAppReportReasonFragment) {
            this.a = inAppReportReasonFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            knt i = this.a.i();
            knz knz = (knz) i.b.get();
            knv knv = ((kno) i.c.get()).a;
            if (knv == null) {
                akcr.a("state");
            }
            String c = knv.a.c();
            knz.a(knz.a(true).a((int) R.string.raw_string_snap_id).b(c).a((int) R.string.raw_string_copy, (akbl) new defpackage.knt.a(knz, c), false).a());
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppReportReasonFragment a;

        e(InAppReportReasonFragment inAppReportReasonFragment) {
            this.a = inAppReportReasonFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            kno kno = (kno) this.a.i().c.get();
            knv knv = kno.a;
            if (knv == null) {
                akcr.a("state");
            }
            kmf kmf = knv.c;
            if (kmf != null) {
                ((kmy) kno.f.get()).a(kmf, "");
            } else {
                ((kmy) kno.f.get()).a((Throwable) new IllegalArgumentException("Attempted to submit a `null` reason"));
            }
            return ajxw.a;
        }
    }

    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ InAppReportReasonFragment a;

        h(InAppReportReasonFragment inAppReportReasonFragment) {
            this.a = inAppReportReasonFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aipn aipn = this.a.e;
            if (aipn == null) {
                akcr.a("schedulersProvider");
            }
            aipn.get();
            return zgb.a(kke.h, "InAppReportReasonFragment");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(InAppReportReasonFragment.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    private final zfw k() {
        return (zfw) this.n.b();
    }

    public final long S_() {
        return -1;
    }

    public final TextView a() {
        TextView textView = this.i;
        if (textView == null) {
            akcr.a("reasonsHeader");
        }
        return textView;
    }

    public final ImageView b() {
        ImageView imageView = this.j;
        if (imageView == null) {
            akcr.a("reportXButton");
        }
        return imageView;
    }

    public final RecyclerView d() {
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            akcr.a("reasonsListing");
        }
        return recyclerView;
    }

    public final TextView f() {
        TextView textView = this.l;
        if (textView == null) {
            akcr.a("showSnapIdButton");
        }
        return textView;
    }

    /* renamed from: g */
    public final SubmitReportButton h() {
        SubmitReportButton submitReportButton = this.m;
        if (submitReportButton == null) {
            akcr.a("submissionButton");
        }
        return submitReportButton;
    }

    public final knt i() {
        knt knt = this.d;
        if (knt == null) {
            akcr.a("presenter");
        }
        return knt;
    }

    /* Access modifiers changed, original: final */
    public final void j() {
        b().setOnClickListener(null);
        h().setOnClickListener(null);
        f().setOnClickListener(null);
    }

    public final boolean o_() {
        knt knt = this.d;
        if (knt == null) {
            akcr.a("presenter");
        }
        ((kmy) ((kno) knt.c.get()).f.get()).b();
        return true;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        knt knt = this.d;
        if (knt == null) {
            akcr.a("presenter");
        }
        knt.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kno kno = this.c;
        if (kno == null) {
            akcr.a("handler");
        }
        ajej f = ((kmy) kno.f.get()).a().b((ajdw) ((zfw) kno.c.b()).h()).f((ajfb) new knp(new defpackage.kno.b(kno)));
        akcr.a((Object) f, "inAppReportUiController.…onInAppReportStateUpdate)");
        ajvv.a(f, kno.b);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_in_app_report_reason, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        kno kno = this.c;
        if (kno == null) {
            akcr.a("handler");
        }
        kno.b.a();
    }

    public final void onDetach() {
        super.onDetach();
        knt knt = this.d;
        if (knt == null) {
            akcr.a("presenter");
        }
        knt.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        j();
    }

    public final void onResume() {
        super.onResume();
        kno kno = this.c;
        if (kno == null) {
            akcr.a("handler");
        }
        ScopedFragment.a((ScopedFragment) this, kno.d.a((ajdw) k().l()).f((ajfb) new c(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.in_app_report_reason_x_button);
        akcr.a(findViewById, "view.findViewById(R.id.i…p_report_reason_x_button)");
        ImageView imageView = (ImageView) findViewById;
        String str = "<set-?>";
        akcr.b(imageView, str);
        this.j = imageView;
        findViewById = view.findViewById(R.id.in_app_report_reason_reasons_header);
        akcr.a(findViewById, "view.findViewById(R.id.i…rt_reason_reasons_header)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.i = textView;
        findViewById = view.findViewById(R.id.in_app_report_reason_reasons_listing);
        akcr.a(findViewById, "view.findViewById(R.id.i…t_reason_reasons_listing)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        akcr.b(recyclerView, str);
        this.k = recyclerView;
        findViewById = view.findViewById(R.id.in_app_report_reason_submit_button);
        akcr.a(findViewById, "view.findViewById(R.id.i…ort_reason_submit_button)");
        SubmitReportButton submitReportButton = (SubmitReportButton) findViewById;
        akcr.b(submitReportButton, str);
        this.m = submitReportButton;
        findViewById = view.findViewById(R.id.in_app_report_reason_snap_id_helper_button);
        akcr.a(findViewById, "view.findViewById(R.id.i…on_snap_id_helper_button)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.l = textView;
        d().setHasFixedSize(false);
        d().setLayoutManager(new LinearLayoutManager(getActivity()));
        aipn aipn = this.b;
        if (aipn == null) {
            akcr.a("softKeyboardDetector");
        }
        findViewById = aipn.get();
        akcr.a(findViewById, "softKeyboardDetector.get()");
        ajej f = ((zhh) findViewById).a().b((ajdw) k().l()).f((ajfb) new f(view));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        aipn = this.a;
        if (aipn == null) {
            akcr.a("insetsDetector");
        }
        findViewById = aipn.get();
        akcr.a(findViewById, "insetsDetector.get()");
        ScopedFragment.a((ScopedFragment) this, ((zkq) findViewById).a().b((ajdw) k().l()).f((ajfb) new g(view)), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }
}

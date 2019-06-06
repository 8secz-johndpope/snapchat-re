package com.snap.inappreporting.core.ui.context;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.snap.inappreporting.core.ui.shared.SubmitReportButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.abtj;
import defpackage.aipn;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akgb;
import defpackage.kke;
import defpackage.kmf;
import defpackage.kmy;
import defpackage.knh;
import defpackage.kni;
import defpackage.knj;
import defpackage.knk;
import defpackage.knk.i;
import defpackage.knk.m;
import defpackage.knk.n;
import defpackage.knk.o;
import defpackage.knk.p;
import defpackage.knk.q;
import defpackage.knk.r;
import defpackage.knk.s;
import defpackage.knk.t;
import defpackage.knk.u;
import defpackage.knl;
import defpackage.knm;
import defpackage.knz;
import defpackage.kod;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zjq;
import defpackage.zkq;
import defpackage.zpj;

public final class InAppReportContextFragment extends MainPageFragment implements knm, zjq {
    public aipn<zkq> a;
    public aipn<zhh> b;
    public kni c;
    public knk d;
    public aipn<zgb> e;
    final b f = new b(this);
    final akbl<View, ajxw> g = new c(this);
    final akbl<View, ajxw> h = new f(this);
    final akbl<View, ajxw> i = new e(this);
    private EditText j;
    private ImageView k;
    private TextView l;
    private TextView m;
    private SubmitReportButton n;
    private zfw o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ InAppReportContextFragment a;

        b(InAppReportContextFragment inAppReportContextFragment) {
            this.a = inAppReportContextFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            knk i4 = this.a.i();
            String valueOf = String.valueOf(charSequence);
            String str = "context";
            akcr.b(valueOf, str);
            kni kni = (kni) i4.d.get();
            akcr.b(valueOf, str);
            knl knl = kni.a;
            if (knl == null) {
                akcr.a("state");
            }
            kni.a(knl.a(knl, null, valueOf, null, 5));
        }
    }

    static final class d<T> implements ajfb<knl> {
        private /* synthetic */ InAppReportContextFragment a;

        d(InAppReportContextFragment inAppReportContextFragment) {
            this.a = inAppReportContextFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (knl) obj;
            this.a.j();
            knk i = this.a.i();
            String str = "state";
            akcr.a(obj, str);
            akcr.b(obj, str);
            Object obj2 = (knm) i.getTarget();
            if (obj2 != null) {
                Object valueOf;
                akbk pVar;
                q qVar;
                akcr.a(obj2, "target ?: return");
                int i2 = 0;
                int max = Math.max(0, i.a() - obj.b.length());
                knk.a(String.valueOf(max), new n(obj2.d().getText()), new o(obj2.d()));
                if (max <= 10) {
                    valueOf = Integer.valueOf(((Number) i.a.b()).intValue());
                    pVar = new p(obj2.d());
                    qVar = new q(obj2.d());
                } else {
                    valueOf = Integer.valueOf(i.b());
                    pVar = new r(obj2.d());
                    qVar = new s(obj2.d());
                }
                knk.a(valueOf, pVar, qVar);
                kod h = obj2.h();
                int i3 = 1;
                if ((akgb.a(obj.b) ^ 1) == 0) {
                    i3 = 3;
                }
                h.setState(i3);
                if (!((knz) i.c.get()).a(obj.a)) {
                    i2 = 4;
                }
                knk.a(Integer.valueOf(i2), new t(obj2.f()), new u(obj2.f()));
            }
            InAppReportContextFragment inAppReportContextFragment = this.a;
            inAppReportContextFragment.a().addTextChangedListener(inAppReportContextFragment.f);
            inAppReportContextFragment.b().setOnClickListener(new knh(inAppReportContextFragment.g));
            inAppReportContextFragment.h().setOnClickListener(new knh(inAppReportContextFragment.h));
            inAppReportContextFragment.f().setOnClickListener(new knh(inAppReportContextFragment.i));
        }
    }

    static final class g<T> implements ajfb<Integer> {
        private /* synthetic */ View a;

        g(View view) {
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

    static final class h<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        h(View view) {
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

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppReportContextFragment a;

        c(InAppReportContextFragment inAppReportContextFragment) {
            this.a = inAppReportContextFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            ((kmy) ((kni) this.a.i().d.get()).f.get()).d();
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppReportContextFragment a;

        e(InAppReportContextFragment inAppReportContextFragment) {
            this.a = inAppReportContextFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            knk i = this.a.i();
            knz knz = (knz) i.c.get();
            knl knl = ((kni) i.d.get()).a;
            if (knl == null) {
                akcr.a("state");
            }
            String c = knl.a.c();
            knz.a(knz.a(true).a((int) R.string.raw_string_snap_id).b(c).a((int) R.string.raw_string_copy, (akbl) new m(knz, c), false).a());
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppReportContextFragment a;

        f(InAppReportContextFragment inAppReportContextFragment) {
            this.a = inAppReportContextFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            knk i = this.a.i();
            kni kni = (kni) i.d.get();
            knl knl = kni.a;
            String str = "state";
            if (knl == null) {
                akcr.a(str);
            }
            kmf kmf = knl.c;
            if (kmf != null) {
                kmy kmy = (kmy) kni.f.get();
                knl knl2 = kni.a;
                if (knl2 == null) {
                    akcr.a(str);
                }
                kmy.a(kmf, knl2.b);
            } else {
                ((kmy) kni.f.get()).a((Throwable) new IllegalArgumentException("Attempted to submit a `null` reason"));
            }
            knm knm = (knm) i.getTarget();
            if (knm != null) {
                zpj.a(knm.a().getContext(), knm.a().getWindowToken());
            }
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public final long S_() {
        return -1;
    }

    public final EditText a() {
        EditText editText = this.j;
        if (editText == null) {
            akcr.a("contextInput");
        }
        return editText;
    }

    public final ImageView b() {
        ImageView imageView = this.k;
        if (imageView == null) {
            akcr.a("reportXButton");
        }
        return imageView;
    }

    public final TextView d() {
        TextView textView = this.l;
        if (textView == null) {
            akcr.a("contextWordCount");
        }
        return textView;
    }

    public final TextView f() {
        TextView textView = this.m;
        if (textView == null) {
            akcr.a("showSnapIdButton");
        }
        return textView;
    }

    /* renamed from: g */
    public final SubmitReportButton h() {
        SubmitReportButton submitReportButton = this.n;
        if (submitReportButton == null) {
            akcr.a("submissionButton");
        }
        return submitReportButton;
    }

    public final knk i() {
        knk knk = this.d;
        if (knk == null) {
            akcr.a("presenter");
        }
        return knk;
    }

    /* Access modifiers changed, original: final */
    public final void j() {
        b().setOnClickListener(null);
        h().setOnClickListener(null);
        f().setOnClickListener(null);
        a().removeTextChangedListener(this.f);
    }

    public final boolean o_() {
        knk knk = this.d;
        if (knk == null) {
            akcr.a("presenter");
        }
        ((kmy) ((kni) knk.d.get()).f.get()).c();
        return false;
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        knk knk = this.d;
        if (knk == null) {
            akcr.a("presenter");
        }
        knk.takeTarget(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kni kni = this.c;
        if (kni == null) {
            akcr.a("handler");
        }
        ajej f = ((kmy) kni.f.get()).a().b((ajdw) ((zfw) kni.c.b()).h()).f((ajfb) new knj(new defpackage.kni.b(kni)));
        akcr.a((Object) f, "inAppReportUiController.…onInAppReportStateUpdate)");
        ajvv.a(f, kni.b);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_in_app_report_context, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        kni kni = this.c;
        if (kni == null) {
            akcr.a("handler");
        }
        kni.b.a();
    }

    public final void onDetach() {
        super.onDetach();
        knk knk = this.d;
        if (knk == null) {
            akcr.a("presenter");
        }
        knk.dropTarget();
    }

    public final void onPause() {
        IBinder windowToken;
        super.onPause();
        j();
        Context context = a().getContext();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                windowToken = currentFocus.getWindowToken();
                zpj.a(context, windowToken);
            }
        }
        windowToken = null;
        zpj.a(context, windowToken);
    }

    public final void onResume() {
        super.onResume();
        kni kni = this.c;
        if (kni == null) {
            akcr.a("handler");
        }
        ajdp ajdp = kni.d;
        zfw zfw = this.o;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, ajdp.a((ajdw) zfw.l()).f((ajfb) new d(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
        a().clearFocus();
        if (a().requestFocus()) {
            abtj.a(a().getContext(), a());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.in_app_report_context_x_button);
        akcr.a(findViewById, "view.findViewById(R.id.i…_report_context_x_button)");
        ImageView imageView = (ImageView) findViewById;
        String str = "<set-?>";
        akcr.b(imageView, str);
        this.k = imageView;
        findViewById = view.findViewById(R.id.in_app_report_context_text_box);
        akcr.a(findViewById, "view.findViewById(R.id.i…_report_context_text_box)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.j = editText;
        findViewById = view.findViewById(R.id.in_app_report_context_word_count);
        akcr.a(findViewById, "view.findViewById(R.id.i…eport_context_word_count)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.l = textView;
        findViewById = view.findViewById(R.id.in_app_report_context_submit_button);
        akcr.a(findViewById, "view.findViewById(R.id.i…rt_context_submit_button)");
        SubmitReportButton submitReportButton = (SubmitReportButton) findViewById;
        akcr.b(submitReportButton, str);
        this.n = submitReportButton;
        findViewById = view.findViewById(R.id.in_app_report_context_snap_id_helper_button);
        akcr.a(findViewById, "view.findViewById(R.id.i…xt_snap_id_helper_button)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.m = textView;
        aipn aipn = this.e;
        if (aipn == null) {
            akcr.a("schedulersProvider");
        }
        aipn.get();
        this.o = zgb.a(kke.h, "InAppReportContextFragment");
        aipn = this.b;
        if (aipn == null) {
            akcr.a("softKeyboardDetector");
        }
        findViewById = aipn.get();
        akcr.a(findViewById, "softKeyboardDetector.get()");
        ajdp a = ((zhh) findViewById).a();
        zfw zfw = this.o;
        String str2 = "schedulers";
        if (zfw == null) {
            akcr.a(str2);
        }
        ajej f = a.b((ajdw) zfw.l()).f((ajfb) new g(view));
        ScopedFragment scopedFragment = this;
        ScopedFragment.a((ScopedFragment) this, f, scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
        aipn = this.a;
        if (aipn == null) {
            akcr.a("insetsDetector");
        }
        findViewById = aipn.get();
        akcr.a(findViewById, "insetsDetector.get()");
        a = ((zkq) findViewById).a();
        zfw zfw2 = this.o;
        if (zfw2 == null) {
            akcr.a(str2);
        }
        ScopedFragment.a((ScopedFragment) this, a.b((ajdw) zfw2.l()).f((ajfb) new h(view)), scopedFragment, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
    }

    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        knk knk = this.d;
        if (knk == null) {
            akcr.a("presenter");
        }
        knm knm = (knm) knk.getTarget();
        if (knm != null) {
            knk.a("", new defpackage.knk.b(knm.a().getText()), new defpackage.knk.c(knm.a()));
            knk.a(String.valueOf(knk.a()), new defpackage.knk.d(knm.d().getText()), new defpackage.knk.e(knm.d()));
            knk.a(Integer.valueOf(knk.b()), new defpackage.knk.f(knm.d()), new defpackage.knk.g(knm.d()));
            knk.a(Integer.valueOf(4), new defpackage.knk.h(knm.f()), new i(knm.f()));
            knm.h().setState(3);
        }
    }
}

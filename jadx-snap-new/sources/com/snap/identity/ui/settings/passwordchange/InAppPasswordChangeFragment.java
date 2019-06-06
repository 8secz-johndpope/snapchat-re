package com.snap.identity.ui.settings.passwordchange;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snap.identity.ui.settings.shared.BaseIdentitySettingsFragment;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snapchat.android.R;
import defpackage.abtj;
import defpackage.achi;
import defpackage.aipx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akgb;
import defpackage.ira;
import defpackage.itu;
import defpackage.izd;
import defpackage.jnu;
import defpackage.jnv;
import defpackage.jnw;
import defpackage.jnx;
import defpackage.jny;
import defpackage.joa;
import defpackage.joa.i;
import defpackage.joa.j;
import defpackage.joa.k;
import defpackage.joa.l;
import defpackage.joa.m;
import defpackage.joa.n;
import defpackage.joa.o;
import defpackage.joa.p;
import defpackage.joa.q;
import defpackage.joa.r;
import defpackage.joa.s;
import defpackage.job;
import defpackage.joc;
import defpackage.jod;
import defpackage.joo;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;

public final class InAppPasswordChangeFragment extends BaseIdentitySettingsFragment implements jod, zjq {
    public jnx a;
    public joa b;
    private EditText c;
    private ImageView d;
    private TextView e;
    private TextView f;
    private ProgressBar j;
    private EditText k;
    private ImageView l;
    private TextView m;
    private SettingsStatefulButton n;
    private zfw o;
    private final c p = new c(this);
    private final b q = new b(this);
    private final akbw<View, Boolean, ajxw> r = new f(this);
    private final akbl<View, ajxw> s = new h(this);
    private final akbl<View, ajxw> t = new e(this);
    private final akbl<View, ajxw> u = new d(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ InAppPasswordChangeFragment a;

        b(InAppPasswordChangeFragment inAppPasswordChangeFragment) {
            this.a = inAppPasswordChangeFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.l().b(String.valueOf(charSequence));
        }
    }

    public static final class c implements TextWatcher {
        private /* synthetic */ InAppPasswordChangeFragment a;

        c(InAppPasswordChangeFragment inAppPasswordChangeFragment) {
            this.a = inAppPasswordChangeFragment;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.l().a(String.valueOf(charSequence));
        }
    }

    static final class g<T> implements ajfb<joc> {
        private /* synthetic */ InAppPasswordChangeFragment a;

        g(InAppPasswordChangeFragment inAppPasswordChangeFragment) {
            this.a = inAppPasswordChangeFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (joc) obj;
            this.a.m();
            joa joa = this.a.b;
            if (joa == null) {
                akcr.a("presenter");
            }
            akcr.a(obj, "it");
            akcr.b(obj, "s");
            Object obj2 = (jod) joa.getTarget();
            if (obj2 != null) {
                akcr.a(obj2, "target ?: return");
                int i = job.a[obj.g.ordinal()];
                int i2 = 2;
                int i3 = 0;
                jnu jnu = i != 1 ? (i == 2 || i == 3) ? new jnu(0, ((Number) joa.c.b()).intValue(), (String) joa.e.b()) : new jnu() : new jnu(0, ((Number) joa.b.b()).intValue(), (String) joa.d.b());
                TextView f = obj2.f();
                akcr.b(f, "textView");
                Object obj3 = (f.getVisibility() == jnu.a && akcr.a(f.getText(), jnu.c) && f.getCurrentTextColor() == jnu.b) ? 1 : null;
                if (obj3 == null) {
                    obj2.f().setText(jnu.c);
                    obj2.f().setTextColor(jnu.b);
                    obj2.f().setVisibility(jnu.a);
                }
                Object obj4 = obj.f ? (String) joa.a.b() : obj.b;
                i = obj.d ^ 1;
                int i4 = akgb.a((CharSequence) obj4) ? 8 : 0;
                int i5 = ((akgb.a((CharSequence) obj.c) ^ 1) == 0 || (akcr.a(obj.c, obj.a) ^ 1) == 0) ? 8 : 0;
                obj2.a().setEnabled(i);
                obj2.h().setEnabled(i);
                joo k = obj2.k();
                if (obj.d) {
                    i2 = 1;
                } else {
                    Object obj5 = ((akgb.a((CharSequence) obj.a) ^ 1) == 0 || !akcr.a(obj.a, obj.c) || !akgb.a(obj.b) || obj.f) ? null : 1;
                    if (obj5 != null) {
                        i2 = 0;
                    }
                }
                k.setState(i2);
                if ((akgb.a(obj.a) ^ 1) == 0 || !obj.e) {
                    i3 = 8;
                }
                joa.a(Integer.valueOf(i3), new defpackage.joa.d(obj2.g()), new l(obj2.g()));
                joa.a(obj.a, new m(obj2.a().getText()), new n(obj2.a()));
                joa.a(obj.c, new o(obj2.h().getText()), new p(obj2.h()));
                joa.a(obj4, new q(obj2.d().getText()), new r(obj2.d()));
                joa.a(Integer.valueOf(i4), new s(obj2.b()), new defpackage.joa.e(obj2.b()));
                joa.a(Integer.valueOf(i4), new defpackage.joa.f(obj2.d()), new defpackage.joa.g(obj2.d()));
                joa.a(Integer.valueOf(i5), new defpackage.joa.h(obj2.i()), new i(obj2.i()));
                joa.a(Integer.valueOf(i5), new j(obj2.j()), new k(obj2.j()));
            }
            this.a.n();
        }
    }

    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppPasswordChangeFragment a;

        d(InAppPasswordChangeFragment inAppPasswordChangeFragment) {
            this.a = inAppPasswordChangeFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.l().b("");
            return ajxw.a;
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppPasswordChangeFragment a;

        e(InAppPasswordChangeFragment inAppPasswordChangeFragment) {
            this.a = inAppPasswordChangeFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.l().a("");
            return ajxw.a;
        }
    }

    static final class f extends akcs implements akbw<View, Boolean, ajxw> {
        private /* synthetic */ InAppPasswordChangeFragment a;

        f(InAppPasswordChangeFragment inAppPasswordChangeFragment) {
            this.a = inAppPasswordChangeFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(view, "<anonymous parameter 0>");
            jnx l = this.a.l();
            if (booleanValue || (akgb.a(l.b().a) ^ 1) == 0) {
                l.a(joc.a(l.b(), null, null, null, false, false, false, null, 111));
            } else {
                l.a(joc.a(l.b(), null, null, null, false, true, false, izd.UNKNOWN, 15));
                jnx jnx = l;
                ajej a = ((ira) l.e.get()).g(l.b().a).b((ajdw) l.a().l()).a((ajfb) new jny(new defpackage.jnx.c(jnx)), (ajfb) new jny(new defpackage.jnx.d(jnx)));
                akcr.a((Object) a, "identityApi.get().getPas…mitDefaultMessageOnError)");
                ajvv.a(a, l.c);
            }
            return ajxw.a;
        }
    }

    static final class h extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ InAppPasswordChangeFragment a;

        h(InAppPasswordChangeFragment inAppPasswordChangeFragment) {
            this.a = inAppPasswordChangeFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            jnx l = this.a.l();
            l.a(joc.a(l.b(), null, null, null, true, false, false, null, 119));
            jnx jnx = l;
            ajej a = ((ira) l.e.get()).f(l.b().a).b((ajdw) l.a().l()).a((ajdw) l.a().l()).a((ajfb) new jny(new defpackage.jnx.e(jnx)), (ajfb) new jny(new defpackage.jnx.f(jnx)));
            akcr.a((Object) a, "identityApi.get().change…mitDefaultMessageOnError)");
            ajvv.a(a, l.c);
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    private SettingsStatefulButton p() {
        SettingsStatefulButton settingsStatefulButton = this.n;
        if (settingsStatefulButton == null) {
            akcr.a("saveButton");
        }
        return settingsStatefulButton;
    }

    public final long S_() {
        return -1;
    }

    public final EditText a() {
        EditText editText = this.c;
        if (editText == null) {
            akcr.a("newPwd");
        }
        return editText;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        a().clearFocus();
        if (a().requestFocus()) {
            abtj.a(getContext(), a());
        }
    }

    public final ImageView b() {
        ImageView imageView = this.d;
        if (imageView == null) {
            akcr.a("newPwdErrX");
        }
        return imageView;
    }

    public final TextView d() {
        TextView textView = this.e;
        if (textView == null) {
            akcr.a("newPwdErrMsg");
        }
        return textView;
    }

    public final TextView f() {
        TextView textView = this.f;
        if (textView == null) {
            akcr.a("newPwdEmoji");
        }
        return textView;
    }

    public final ProgressBar g() {
        ProgressBar progressBar = this.j;
        if (progressBar == null) {
            akcr.a("pwdStrengthProgress");
        }
        return progressBar;
    }

    public final EditText h() {
        EditText editText = this.k;
        if (editText == null) {
            akcr.a("confirmPwd");
        }
        return editText;
    }

    public final ImageView i() {
        ImageView imageView = this.l;
        if (imageView == null) {
            akcr.a("confirmPwdErrX");
        }
        return imageView;
    }

    public final TextView j() {
        TextView textView = this.m;
        if (textView == null) {
            akcr.a("confirmPwdErrMsg");
        }
        return textView;
    }

    public final /* synthetic */ joo k() {
        return p();
    }

    public final jnx l() {
        jnx jnx = this.a;
        if (jnx == null) {
            akcr.a("handler");
        }
        return jnx;
    }

    /* Access modifiers changed, original: final */
    public final void m() {
        p().setOnClickListener(null);
        b().setOnClickListener(null);
        a().setOnFocusChangeListener(null);
        i().setOnClickListener(null);
        a().removeTextChangedListener(this.p);
        h().removeTextChangedListener(this.q);
    }

    /* Access modifiers changed, original: final */
    public final void n() {
        a().addTextChangedListener(this.p);
        p().setOnClickListener(new jnv(this.s));
        h().addTextChangedListener(this.q);
        a().setOnFocusChangeListener(new jnw(this.r));
        b().setOnClickListener(new jnv(this.t));
        i().setOnClickListener(new jnv(this.u));
    }

    public final void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        joa joa = this.b;
        if (joa == null) {
            akcr.a("presenter");
        }
        joa.takeTarget(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_settings_password_change, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        jnx jnx = this.a;
        if (jnx == null) {
            akcr.a("handler");
        }
        jnx.c.dispose();
    }

    public final void onDetach() {
        super.onDetach();
        joa joa = this.b;
        if (joa == null) {
            akcr.a("presenter");
        }
        joa.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        m();
    }

    public final void onResume() {
        super.onResume();
        jnx jnx = this.a;
        if (jnx == null) {
            akcr.a("handler");
        }
        Object h = jnx.b.h((Object) jnx.b());
        akcr.a(h, "subject.startWith(state)");
        zfw zfw = this.o;
        if (zfw == null) {
            akcr.a("schedulers");
        }
        ScopedFragment.a((ScopedFragment) this, h.a((ajdw) zfw.l()).f((ajfb) new g(this)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_PAUSE);
        n();
    }

    public final void onStart() {
        super.onStart();
        jnx jnx = this.a;
        if (jnx == null) {
            akcr.a("handler");
        }
        jnx.a = new Handler(Looper.getMainLooper());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        Object findViewById = view.findViewById(R.id.password_change_save_button);
        akcr.a(findViewById, "view.findViewById(R.id.p…sword_change_save_button)");
        SettingsStatefulButton settingsStatefulButton = (SettingsStatefulButton) findViewById;
        String str = "<set-?>";
        akcr.b(settingsStatefulButton, str);
        this.n = settingsStatefulButton;
        findViewById = view.findViewById(R.id.password_change_new_password_field);
        akcr.a(findViewById, "view.findViewById(R.id.p…hange_new_password_field)");
        EditText editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.c = editText;
        findViewById = view.findViewById(R.id.password_change_new_password_emoji);
        akcr.a(findViewById, "view.findViewById(R.id.p…hange_new_password_emoji)");
        TextView textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.f = textView;
        findViewById = view.findViewById(R.id.password_change_new_password_error_red_x);
        akcr.a(findViewById, "view.findViewById(R.id.p…new_password_error_red_x)");
        ImageView imageView = (ImageView) findViewById;
        akcr.b(imageView, str);
        this.d = imageView;
        findViewById = view.findViewById(R.id.password_change_new_password_error_message);
        akcr.a(findViewById, "view.findViewById(R.id.p…w_password_error_message)");
        textView = (TextView) findViewById;
        akcr.b(textView, str);
        this.e = textView;
        findViewById = view.findViewById(R.id.password_change_new_password_strength_progress_bar);
        akcr.a(findViewById, "view.findViewById(R.id.p…rd_strength_progress_bar)");
        ProgressBar progressBar = (ProgressBar) findViewById;
        akcr.b(progressBar, str);
        this.j = progressBar;
        findViewById = view.findViewById(R.id.password_change_confirm_password_field);
        akcr.a(findViewById, "view.findViewById(R.id.p…e_confirm_password_field)");
        editText = (EditText) findViewById;
        akcr.b(editText, str);
        this.k = editText;
        findViewById = view.findViewById(R.id.password_change_confirm_password_error_red_x);
        akcr.a(findViewById, "view.findViewById(R.id.p…irm_password_error_red_x)");
        imageView = (ImageView) findViewById;
        akcr.b(imageView, str);
        this.l = imageView;
        Object findViewById2 = view.findViewById(R.id.password_change_confirm_password_error_message);
        akcr.a(findViewById2, "view.findViewById(R.id.p…m_password_error_message)");
        TextView textView2 = (TextView) findViewById2;
        akcr.b(textView2, str);
        this.m = textView2;
        o().get();
        this.o = zgb.a(itu.e.callsite("InAppPasswordChangeFragment"));
    }
}

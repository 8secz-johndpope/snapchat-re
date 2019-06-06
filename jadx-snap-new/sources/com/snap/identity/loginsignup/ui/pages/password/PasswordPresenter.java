package com.snap.identity.loginsignup.ui.pages.password;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.identity.api.sharedui.ProgressButton;
import com.snapchat.android.R;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.isf;
import defpackage.ish;
import defpackage.izt;
import defpackage.jap;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jgo;
import defpackage.jgp;
import defpackage.jgq;
import defpackage.jhh;
import defpackage.jrl;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class PasswordPresenter extends zll<jgq> implements defpackage.k {
    String a;
    boolean b;
    String c;
    boolean d;
    boolean e;
    boolean f;
    final aipn<zke> g;
    final aipn<jbw> h;
    final aipn<jhh> i;
    final aipn<isf> j;
    private boolean k = true;
    private final zfw l;
    private final e m;
    private final akbl<View, ajxw> n;
    private final akbl<View, ajxw> o;
    private final aipn<Context> p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class e implements TextWatcher {
        private /* synthetic */ PasswordPresenter a;

        e(PasswordPresenter passwordPresenter) {
            this.a = passwordPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            PasswordPresenter passwordPresenter = this.a;
            passwordPresenter.a = String.valueOf(charSequence);
            if ((akgb.a(passwordPresenter.c) ^ 1) != 0) {
                ((zke) passwordPresenter.g.get()).a(new izt());
            }
            passwordPresenter.c = "";
            passwordPresenter.a();
        }
    }

    static final class d<T> implements ajfb<jeb> {
        private /* synthetic */ PasswordPresenter a;

        d(PasswordPresenter passwordPresenter) {
            this.a = passwordPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jeb) obj;
            PasswordPresenter passwordPresenter = this.a;
            akcr.a(obj, "session");
            if (akgb.a(passwordPresenter.c) && (akgb.a(obj.B) ^ 1) != 0) {
                passwordPresenter.b = false;
            }
            passwordPresenter.c = obj.B;
            passwordPresenter.a();
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ PasswordPresenter a;

        b(PasswordPresenter passwordPresenter) {
            this.a = passwordPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            PasswordPresenter passwordPresenter = this.a;
            Object a = ((jhh) passwordPresenter.i.get()).a(passwordPresenter.a, ((jbw) passwordPresenter.h.get()).c().r);
            akcr.a(a, "validator.get().checkPas…Error(password, username)");
            if ((akgb.a((CharSequence) a) ^ 1) != 0) {
                ((jbw) passwordPresenter.h.get()).j(a);
            } else {
                passwordPresenter.b = true;
                ((isf) passwordPresenter.j.get()).a(aaoo.INITIAL_INFO_SUBMITTED, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
                ((zke) passwordPresenter.g.get()).a(new jap(passwordPresenter.a));
            }
            passwordPresenter.a();
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ PasswordPresenter a;

        c(PasswordPresenter passwordPresenter) {
            this.a = passwordPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            PasswordPresenter passwordPresenter = this.a;
            passwordPresenter.d ^= 1;
            passwordPresenter.e = true;
            passwordPresenter.a();
            passwordPresenter.e = false;
            return ajxw.a;
        }
    }

    static final class f extends akcq implements akbk<String> {
        f(Editable editable) {
            super(0, editable);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(Editable.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((Editable) this.receiver).toString();
        }
    }

    static final class g extends akcq implements akbl<Integer, ajxw> {
        g(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setSelection";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setSelection(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setSelection(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class h extends akcq implements akbk<Boolean> {
        h(EditText editText) {
            super(0, editText);
        }

        public final String getName() {
            return "isEnabled";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "isEnabled()Z";
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((EditText) this.receiver).isEnabled());
        }
    }

    static final class i extends akcq implements akbl<Boolean, ajxw> {
        i(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setEnabled";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setEnabled(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setEnabled(((Boolean) obj).booleanValue());
            return ajxw.a;
        }
    }

    static final class j extends akcq implements akbk<Integer> {
        j(EditText editText) {
            super(0, editText);
        }

        public final String getName() {
            return "getSelectionStart";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "getSelectionStart()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((EditText) this.receiver).getSelectionStart());
        }
    }

    static final class k extends akcq implements akbl<Integer, ajxw> {
        k(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setSelection";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setSelection(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setSelection(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class l extends akcq implements akbk<String> {
        l(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    static final class m extends akcq implements akbl<CharSequence, ajxw> {
        m(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class n extends akcq implements akbk<Integer> {
        n(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((TextView) this.receiver).getVisibility());
        }
    }

    static final class o extends akcq implements akbl<Integer, ajxw> {
        o(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class p extends akcq implements akbl<CharSequence, ajxw> {
        p(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class q extends akcq implements akbl<Integer, ajxw> {
        q(ProgressButton progressButton) {
            super(1, progressButton);
        }

        public final String getName() {
            return "setState";
        }

        public final akej getOwner() {
            return akde.a(ProgressButton.class);
        }

        public final String getSignature() {
            return "setState(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ProgressButton) this.receiver).setState(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class r extends akcq implements akbk<Integer> {
        r(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((TextView) this.receiver).getVisibility());
        }
    }

    static final class s extends akcq implements akbl<Integer, ajxw> {
        s(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class t extends akcq implements akbk<Integer> {
        t(EditText editText) {
            super(0, editText);
        }

        public final String getName() {
            return "getInputType";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "getInputType()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((EditText) this.receiver).getInputType());
        }
    }

    static final class u extends akcq implements akbl<Integer, ajxw> {
        u(EditText editText) {
            super(1, editText);
        }

        public final String getName() {
            return "setInputType";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "setInputType(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((EditText) this.receiver).setInputType(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class v extends akcq implements akbk<String> {
        v(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    static final class w extends akcq implements akbl<CharSequence, ajxw> {
        w(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class x extends akcq implements akbk<Integer> {
        x(EditText editText) {
            super(0, editText);
        }

        public final String getName() {
            return "getSelectionStart";
        }

        public final akej getOwner() {
            return akde.a(EditText.class);
        }

        public final String getSignature() {
            return "getSelectionStart()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((EditText) this.receiver).getSelectionStart());
        }
    }

    static {
        a aVar = new a();
    }

    public PasswordPresenter(aipn<zke> aipn, aipn<Context> aipn2, aipn<jbw> aipn3, aipn<jhh> aipn4, aipn<isf> aipn5, zgb zgb) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "context");
        akcr.b(aipn3, "store");
        akcr.b(aipn4, "validator");
        akcr.b(aipn5, "stateTransitionService");
        akcr.b(zgb, "schedulersProviders");
        this.g = aipn;
        this.p = aipn2;
        this.h = aipn3;
        this.i = aipn4;
        this.j = aipn5;
        String str = "";
        this.a = str;
        this.c = str;
        this.l = zgb.a(jbv.y, "PasswordPresenter");
        this.m = new e(this);
        this.n = new b(this);
        this.o = new c(this);
    }

    private final boolean b() {
        return this.f && !this.b;
    }

    private final void c() {
        jgq jgq = (jgq) getTarget();
        if (jgq != null) {
            jgq.a().addTextChangedListener(this.m);
            jgq.c().setOnClickListener(new jgp(this.n));
            jgq.d().setOnClickListener(new jgp(this.o));
        }
    }

    private final void d() {
        jgq jgq = (jgq) getTarget();
        if (jgq != null) {
            jgq.a().removeTextChangedListener(this.m);
            jgq.c().setOnClickListener(null);
            jgq.d().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.k) {
            Object obj = (jgq) getTarget();
            if (obj != null) {
                Context context;
                int i;
                akcr.a(obj, "target ?: return");
                d();
                jrl.a(this.a, new f(obj.a().getText()), new p(obj.a()));
                int i2 = 1;
                jrl.a(Integer.valueOf((akgb.a((CharSequence) this.a) ^ 1) != 0 ? 0 : 8), new r(obj.d()), new s(obj.d()));
                jrl.a(Integer.valueOf(this.d ? 129 : 145), new t(obj.a()), new u(obj.a()));
                if (this.d) {
                    context = (Context) this.p.get();
                    i = R.string.password_show;
                } else {
                    context = (Context) this.p.get();
                    i = R.string.password_hide;
                }
                jrl.a(context.getText(i), new v(obj.d().getText()), new w(obj.d()));
                if (this.e) {
                    jrl.a(Integer.valueOf(this.a.length()), new x(obj.a()), new g(obj.a()));
                }
                jrl.a(Boolean.valueOf(this.b ^ 1), new h(obj.a()), new i(obj.a()));
                if (b()) {
                    Object obj2 = this.p.get();
                    akcr.a(obj2, "context.get()");
                    jrl.a((Context) obj2, obj.a());
                    jrl.a(Integer.valueOf(this.a.length()), new j(obj.a()), new k(obj.a()));
                }
                jrl.a(this.c, new l(obj.b().getText()), new m(obj.b()));
                jrl.a(Integer.valueOf((akgb.a((CharSequence) this.c) ^ 1) != 0 ? 0 : 4), new n(obj.b()), new o(obj.b()));
                if (akgb.a(this.a) || (akgb.a(this.c) ^ 1) != 0) {
                    i2 = 0;
                } else if (this.b) {
                    i2 = 2;
                }
                jrl.a(Integer.valueOf(i2), new jgo(obj.c()), new q(obj.c()));
                c();
            }
        }
    }

    /* renamed from: a */
    public final void takeTarget(jgq jgq) {
        akcr.b(jgq, "target");
        super.takeTarget(jgq);
        jgq.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jgq) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        zln.bindTo$default(this, ((jbw) this.h.get()).a().a((ajdw) this.l.l()).f((ajfb) new d(this)), this, null, null, 6, null);
        this.a = ((jbw) this.h.get()).c().t;
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        d();
        this.k = true;
    }

    @defpackage.s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        c();
        this.k = false;
        a();
    }
}

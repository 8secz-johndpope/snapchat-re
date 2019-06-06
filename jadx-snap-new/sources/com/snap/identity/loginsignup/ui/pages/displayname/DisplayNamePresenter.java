package com.snap.identity.loginsignup.ui.pages.displayname;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.aavk;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akfr;
import defpackage.akgb;
import defpackage.ifs;
import defpackage.iym;
import defpackage.izs;
import defpackage.izv;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jeq;
import defpackage.jer;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import java.util.List;

public final class DisplayNamePresenter extends zll<jer> implements k {
    String a;
    String b;
    String c;
    final aipn<zke> d;
    final aipn<jbk> e;
    private boolean f = true;
    private final zfw g = zgb.a(jbv.y.callsite("LoginSignup.DisplayNamePresenter"));
    private final b h = new b(this);
    private final c i = new c(this);
    private final akbl<View, ajxw> j = new a(this);
    private final aipn<jbw> k;
    private final iym l;
    private final ifs m;

    public static final class b implements TextWatcher {
        private /* synthetic */ DisplayNamePresenter a;

        b(DisplayNamePresenter displayNamePresenter) {
            this.a = displayNamePresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DisplayNamePresenter displayNamePresenter = this.a;
            displayNamePresenter.a = String.valueOf(charSequence);
            if ((((CharSequence) displayNamePresenter.c).length() > 0 ? 1 : null) != null) {
                ((zke) displayNamePresenter.d.get()).a(new izs());
            }
            displayNamePresenter.c = "";
            displayNamePresenter.a();
        }
    }

    public static final class c implements TextWatcher {
        private /* synthetic */ DisplayNamePresenter a;

        c(DisplayNamePresenter displayNamePresenter) {
            this.a = displayNamePresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DisplayNamePresenter displayNamePresenter = this.a;
            displayNamePresenter.b = String.valueOf(charSequence);
            if ((((CharSequence) displayNamePresenter.c).length() > 0 ? 1 : null) != null) {
                ((zke) displayNamePresenter.d.get()).a(new izs());
            }
            displayNamePresenter.c = "";
            displayNamePresenter.a();
        }
    }

    static final class d<T> implements ajfb<jeb> {
        private /* synthetic */ DisplayNamePresenter a;

        d(DisplayNamePresenter displayNamePresenter) {
            this.a = displayNamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jeb) obj;
            DisplayNamePresenter displayNamePresenter = this.a;
            akcr.a(obj, "session");
            displayNamePresenter.c = obj.y;
            displayNamePresenter.a();
        }
    }

    static final class e<T> implements ajfb<String> {
        private /* synthetic */ DisplayNamePresenter a;

        e(DisplayNamePresenter displayNamePresenter) {
            this.a = displayNamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (String) obj;
            if ((((CharSequence) this.a.a).length() == 0 ? 1 : null) != null) {
                if ((((CharSequence) this.a.b).length() == 0 ? 1 : null) != null) {
                    jbk jbk;
                    aavk aavk;
                    akcr.a(obj, "it");
                    List a = new akfr(" ").a((CharSequence) obj, 2);
                    int size = a.size();
                    if (size != 1) {
                        if (size == 2) {
                            this.a.a = (String) a.get(0);
                            this.a.b = (String) a.get(1);
                            ((jbk) this.a.e.get()).a(aavk.FIRST_NAME);
                            jbk = (jbk) this.a.e.get();
                            aavk = aavk.LAST_NAME;
                        }
                        this.a.a();
                    }
                    this.a.a = (String) a.get(0);
                    jbk = (jbk) this.a.e.get();
                    aavk = aavk.FIRST_NAME;
                    jbk.a(aavk);
                    this.a.a();
                }
            }
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ DisplayNamePresenter a;

        a(DisplayNamePresenter displayNamePresenter) {
            this.a = displayNamePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            DisplayNamePresenter displayNamePresenter = this.a;
            ((zke) displayNamePresenter.d.get()).a(new izv(displayNamePresenter.a, displayNamePresenter.b));
            return ajxw.a;
        }
    }

    public DisplayNamePresenter(aipn<zke> aipn, zgb zgb, aipn<jbw> aipn2, iym iym, aipn<jbk> aipn3, ifs ifs) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn2, "store");
        akcr.b(iym, "displayNameLoader");
        akcr.b(aipn3, LocalMessageActionModel.ANALYTICS);
        akcr.b(ifs, "permissionHelper");
        this.d = aipn;
        this.k = aipn2;
        this.l = iym;
        this.e = aipn3;
        this.m = ifs;
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
    }

    private final void b() {
        jer jer = (jer) getTarget();
        if (jer != null) {
            jer.a().addTextChangedListener(this.h);
            jer.b().addTextChangedListener(this.i);
            jer.c().setOnClickListener(new jeq(this.j));
        }
    }

    private final void c() {
        jer jer = (jer) getTarget();
        if (jer != null) {
            jer.a().removeTextChangedListener(this.h);
            jer.b().removeTextChangedListener(this.i);
            jer.c().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.f) {
            Object obj = (jer) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                c();
                int i = 1;
                if ((akcr.a(obj.a().getText().toString(), this.a) ^ 1) != 0) {
                    obj.a().setText(this.a);
                }
                int length = this.a.length();
                if (obj.a().getSelectionStart() != length) {
                    obj.a().setSelection(length);
                }
                if ((akcr.a(obj.b().getText().toString(), this.b) ^ 1) != 0) {
                    obj.b().setText(this.b);
                }
                length = this.b.length();
                if (obj.b().getSelectionStart() != length) {
                    obj.b().setSelection(length);
                }
                if ((akcr.a(obj.d().getText().toString(), this.c) ^ 1) != 0) {
                    obj.d().setText(this.c);
                    if ((((CharSequence) this.c).length() > 0 ? 1 : null) != null) {
                        obj.d().setVisibility(0);
                    } else {
                        obj.d().setVisibility(8);
                    }
                }
                if (((akgb.a(this.a) ^ 1) == 0 && (akgb.a(this.b) ^ 1) == 0) || !akgb.a(this.c)) {
                    i = 0;
                }
                obj.c().setState(i);
                b();
            }
        }
    }

    /* renamed from: a */
    public final void takeTarget(jer jer) {
        akcr.b(jer, "target");
        super.takeTarget(jer);
        jer.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jer) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        zln zln = this;
        zln.bindTo$default(this, ((jbw) this.k.get()).a().a((ajdw) this.g.l()).f((ajfb) new d(this)), zln, null, null, 6, null);
        jeb c = ((jbw) this.k.get()).c();
        this.a = c.o;
        this.b = c.p;
        Object obj = 1;
        if ((((CharSequence) this.a).length() == 0 ? 1 : null) != null) {
            if (this.b.length() != 0) {
                obj = null;
            }
            if (obj != null && this.m.f()) {
                zln.bindTo$default(this, this.l.o().b((ajdw) this.g.h()).a((ajdw) this.g.l()).a((ajfb) new e(this), (ajfb) f.a), zln, null, null, 6, null);
            }
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        c();
        this.f = true;
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        b();
        this.f = false;
        a();
    }
}

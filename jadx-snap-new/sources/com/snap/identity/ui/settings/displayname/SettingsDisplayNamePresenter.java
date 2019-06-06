package com.snap.identity.ui.settings.displayname;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snapchat.android.R;
import defpackage.abkq;
import defpackage.agzs;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.gpb;
import defpackage.iqe;
import defpackage.ira;
import defpackage.ity;
import defpackage.j;
import defpackage.jnl;
import defpackage.jnm;
import defpackage.k;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import defpackage.zln;

public final class SettingsDisplayNamePresenter extends zll<jnm> implements k {
    String a;
    String b;
    String c;
    int d;
    int e;
    final zfw f;
    final ira g;
    private final String h = "SettingsDisplayNamePresenter";
    private boolean i;
    private final b j;
    private final OnClickListener k;
    private final OnClickListener l;
    private final gpb m;
    private final Context n;
    private final aipn<iqe> o;

    public enum a {
        ;
        
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = 0;

        static {
            int[] iArr = new int[]{1, 2, 3};
            a = 1;
            b = 2;
            c = 3;
            d = iArr;
        }

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ SettingsDisplayNamePresenter a;

        b(SettingsDisplayNamePresenter settingsDisplayNamePresenter) {
            this.a = settingsDisplayNamePresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SettingsDisplayNamePresenter settingsDisplayNamePresenter = this.a;
            settingsDisplayNamePresenter.b = String.valueOf(charSequence);
            settingsDisplayNamePresenter.c = "";
            settingsDisplayNamePresenter.a();
            settingsDisplayNamePresenter.b();
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ SettingsDisplayNamePresenter a;

        d(SettingsDisplayNamePresenter settingsDisplayNamePresenter) {
            this.a = settingsDisplayNamePresenter;
        }

        public final void onClick(View view) {
            SettingsDisplayNamePresenter settingsDisplayNamePresenter = this.a;
            settingsDisplayNamePresenter.e = 3;
            settingsDisplayNamePresenter.d = 1;
            String str = "";
            settingsDisplayNamePresenter.c = str;
            settingsDisplayNamePresenter.g.a(str).a((ajdw) settingsDisplayNamePresenter.f.l()).e((ajfb) new c(settingsDisplayNamePresenter));
            settingsDisplayNamePresenter.b();
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ SettingsDisplayNamePresenter a;

        e(SettingsDisplayNamePresenter settingsDisplayNamePresenter) {
            this.a = settingsDisplayNamePresenter;
        }

        public final void onClick(View view) {
            SettingsDisplayNamePresenter settingsDisplayNamePresenter = this.a;
            settingsDisplayNamePresenter.d = 3;
            settingsDisplayNamePresenter.e = 1;
            settingsDisplayNamePresenter.c = "";
            settingsDisplayNamePresenter.g.a(settingsDisplayNamePresenter.b).a((ajdw) settingsDisplayNamePresenter.f.l()).e((ajfb) new g(settingsDisplayNamePresenter));
            settingsDisplayNamePresenter.b();
        }
    }

    static final class c<T> implements ajfb<agzs> {
        private /* synthetic */ SettingsDisplayNamePresenter a;

        c(SettingsDisplayNamePresenter settingsDisplayNamePresenter) {
            this.a = settingsDisplayNamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsDisplayNamePresenter.a(this.a, (agzs) obj);
        }
    }

    static final class f<T> implements ajfb<abkq> {
        private /* synthetic */ SettingsDisplayNamePresenter a;

        f(SettingsDisplayNamePresenter settingsDisplayNamePresenter) {
            this.a = settingsDisplayNamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            abkq abkq = (abkq) obj;
            SettingsDisplayNamePresenter settingsDisplayNamePresenter = this.a;
            String str = abkq.c;
            if (str == null) {
                str = "";
            }
            settingsDisplayNamePresenter.a = str;
            SettingsDisplayNamePresenter settingsDisplayNamePresenter2 = this.a;
            settingsDisplayNamePresenter2.b = settingsDisplayNamePresenter2.a;
            this.a.a();
            this.a.b();
        }
    }

    static final class g<T> implements ajfb<agzs> {
        private /* synthetic */ SettingsDisplayNamePresenter a;

        g(SettingsDisplayNamePresenter settingsDisplayNamePresenter) {
            this.a = settingsDisplayNamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsDisplayNamePresenter.a(this.a, (agzs) obj);
        }
    }

    public SettingsDisplayNamePresenter(gpb gpb, Context context, ira ira, aipn<iqe> aipn, zgb zgb) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(context, "context");
        akcr.b(ira, "identityApi");
        akcr.b(aipn, LocalMessageActionModel.ANALYTICS);
        akcr.b(zgb, "schedulersProvider");
        this.m = gpb;
        this.n = context;
        this.g = ira;
        this.o = aipn;
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = 1;
        this.e = 1;
        this.f = zgb.a(ity.d, this.h);
        this.i = true;
        this.j = new b(this);
        this.k = new d(this);
        this.l = new e(this);
    }

    /* JADX WARNING: Missing block: B:21:0x0082, code skipped:
            if (r6 == null) goto L_0x0084;
     */
    public static final /* synthetic */ void a(com.snap.identity.ui.settings.displayname.SettingsDisplayNamePresenter r5, defpackage.agzs r6) {
        /*
        if (r6 == 0) goto L_0x0005;
    L_0x0002:
        r0 = r6.d;
        goto L_0x0006;
    L_0x0005:
        r0 = 0;
    L_0x0006:
        r1 = java.lang.Boolean.TRUE;
        r0 = defpackage.akcr.a(r0, r1);
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x007b;
    L_0x0010:
        r0 = r5.o;
        r0 = r0.get();
        r0 = (defpackage.iqe) r0;
        r3 = r5.a;
        r3 = (java.lang.CharSequence) r3;
        r3 = r3.length();
        if (r3 <= 0) goto L_0x0024;
    L_0x0022:
        r3 = 1;
        goto L_0x0025;
    L_0x0024:
        r3 = 0;
    L_0x0025:
        r6 = r6.a;
        r6 = r6.d;
        r4 = "response.`object`.display";
        defpackage.akcr.a(r6, r4);
        r6 = (java.lang.CharSequence) r6;
        r6 = r6.length();
        if (r6 <= 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0038;
    L_0x0037:
        r1 = 0;
    L_0x0038:
        r6 = defpackage.abhu.DISPLAY_NAME;
        r6 = defpackage.iqe.a(r6, r3, r1);
        r2 = r0.b;
        r2 = r2.get();
        r2 = (defpackage.dib) r2;
        r6 = (defpackage.aajt) r6;
        r2.a(r6);
        r6 = r0.a;
        r6 = r6.get();
        r6 = (defpackage.ilv) r6;
        r0 = defpackage.iog.SETTINGS_DISPLAY_NAME_CHANGE;
        r2 = "before";
        r0 = r0.a(r2, r3);
        r2 = "after";
        r0 = r0.a(r2, r1);
        r6.c(r0, 1);
        r6 = r5.n;
        defpackage.jrl.a(r6);
        r5 = r5.n;
        if (r5 == 0) goto L_0x0073;
    L_0x006d:
        r5 = (android.app.Activity) r5;
        r5.onBackPressed();
        return;
    L_0x0073:
        r5 = new ajxt;
        r6 = "null cannot be cast to non-null type android.app.Activity";
        r5.<init>(r6);
        throw r5;
    L_0x007b:
        r5.a();
        if (r6 == 0) goto L_0x0084;
    L_0x0080:
        r6 = r6.c;
        if (r6 != 0) goto L_0x0086;
    L_0x0084:
        r6 = "";
    L_0x0086:
        r0 = r6;
        r0 = (java.lang.CharSequence) r0;
        r0 = r0.length();
        if (r0 <= 0) goto L_0x0090;
    L_0x008f:
        goto L_0x0091;
    L_0x0090:
        r1 = 0;
    L_0x0091:
        if (r1 == 0) goto L_0x0094;
    L_0x0093:
        goto L_0x00a6;
    L_0x0094:
        r6 = r5.n;
        r6 = r6.getResources();
        r0 = 2131889610; // 0x7f120dca float:1.9413888E38 double:1.053293417E-314;
        r6 = r6.getString(r0);
        r0 = "context.resources.getStr…ring.settings_save_error)";
        defpackage.akcr.a(r6, r0);
    L_0x00a6:
        r5.c = r6;
        r5.b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.displayname.SettingsDisplayNamePresenter.a(com.snap.identity.ui.settings.displayname.SettingsDisplayNamePresenter, agzs):void");
    }

    private final void c() {
        jnm jnm = (jnm) getTarget();
        if (jnm != null) {
            jnm.a().addTextChangedListener(this.j);
            jnm.d().setOnClickListener(this.k);
            jnm.b().setOnClickListener(this.l);
        }
    }

    private final void d() {
        jnm jnm = (jnm) getTarget();
        if (jnm != null) {
            jnm.a().removeTextChangedListener(this.j);
            jnm.d().setOnClickListener(null);
            jnm.b().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        int i = 1;
        this.d = (akcr.a(this.b, this.a) ^ 1) != 0 ? 2 : 1;
        if ((((CharSequence) this.b).length() == 0 ? 1 : null) == null) {
            i = 2;
        }
        this.e = i;
    }

    /* renamed from: a */
    public final void takeTarget(jnm jnm) {
        akcr.b(jnm, "target");
        super.takeTarget(jnm);
        jnm.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.i) {
            Object obj = (jnm) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                d();
                if ((akcr.a(obj.a().getText().toString(), this.b) ^ 1) != 0) {
                    obj.a().setText(this.b);
                    obj.a().setSelection(this.b.length());
                }
                if ((((CharSequence) this.c).length() > 0 ? 1 : null) != null) {
                    obj.g().setVisibility(0);
                    obj.h().setText(this.c);
                    obj.h().setVisibility(0);
                } else {
                    obj.g().setVisibility(8);
                    obj.h().setVisibility(8);
                }
                int i = jnl.a[this.d - 1];
                if (i != 1) {
                    if (i == 2) {
                        obj.b().setVisibility(0);
                        obj.b().setText(R.string.settings_save);
                        obj.b().setClickable(true);
                    } else if (i == 3) {
                        obj.b().setVisibility(8);
                    }
                    obj.c().setVisibility(8);
                } else {
                    obj.b().setText("");
                    obj.b().setClickable(false);
                    obj.c().setVisibility(0);
                }
                i = jnl.b[this.e - 1];
                if (i != 1) {
                    if (i == 2) {
                        obj.d().setVisibility(8);
                    } else if (i == 3) {
                        obj.d().setVisibility(0);
                    }
                    obj.f().setVisibility(8);
                } else {
                    obj.d().setVisibility(8);
                    obj.f().setVisibility(0);
                }
                c();
            }
        }
    }

    public final void dropTarget() {
        jnm jnm = (jnm) getTarget();
        if (jnm != null) {
            j lifecycle = jnm.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        zln.bindTo$default(this, this.m.c().a((ajdw) this.f.l()).e().e((ajfb) new f(this)), this, null, null, 6, null);
        c();
        a();
        b();
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        d();
        this.i = true;
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        c();
        this.i = false;
        b();
    }
}

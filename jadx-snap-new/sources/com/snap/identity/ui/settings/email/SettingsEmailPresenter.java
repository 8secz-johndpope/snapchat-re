package com.snap.identity.ui.settings.email;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snapchat.android.R;
import defpackage.abkq;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.aepa;
import defpackage.ahdj;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akws;
import defpackage.akxa;
import defpackage.fth;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.iqe;
import defpackage.ira;
import defpackage.irc;
import defpackage.ity;
import defpackage.jic;
import defpackage.jno;
import defpackage.joe;
import defpackage.jof;
import defpackage.jrl;
import defpackage.s;
import defpackage.tnj;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;

public final class SettingsEmailPresenter extends zll<jno> implements defpackage.k {
    String a;
    String b;
    String c;
    String d;
    boolean e;
    boolean f;
    final zfw g;
    final Context h;
    final ira i;
    final tnj j;
    final achb<zjm, zjk> k;
    final aipn<jof> l;
    final aipn<iqe> m;
    private final String n = "SettingsEmailPresenter";
    private boolean o;
    private boolean p;
    private final OnClickListener q;
    private final OnClickListener r;
    private final OnClickListener s;
    private final b t;
    private final gpb u;
    private final ftl v;

    public enum a {
        ;
        
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = 0;
        public static final int d = 0;
        public static final int e = 0;
        public static final int f = 0;

        static {
            int[] iArr = new int[]{1, 2, 3, 4, 5, 6};
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = 6;
            g = iArr;
        }

        public static int[] a() {
            return (int[]) g.clone();
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ SettingsEmailPresenter a;

        b(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SettingsEmailPresenter.a(this.a, String.valueOf(charSequence));
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ SettingsEmailPresenter a;

        c(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final void onClick(View view) {
            SettingsEmailPresenter.a(this.a);
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ SettingsEmailPresenter a;

        d(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final void onClick(View view) {
            SettingsEmailPresenter.a(this.a, "");
        }
    }

    static final class g implements OnClickListener {
        private /* synthetic */ SettingsEmailPresenter a;

        g(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final void onClick(View view) {
            zln zln = this.a;
            zln.f = true;
            jrl.a(zln.h);
            zln.bindTo$default(zln, zln.i.i().a((ajdw) zln.g.l()).a((ajfb) new h(zln), (ajfb) new i(zln)), zln, null, null, 6, null);
            zln.a();
        }
    }

    static final class e<T> implements ajfb<abkq> {
        private /* synthetic */ SettingsEmailPresenter a;

        e(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            abkq abkq = (abkq) obj;
            SettingsEmailPresenter settingsEmailPresenter = this.a;
            String str = abkq.d;
            if (str == null) {
                str = "";
            }
            settingsEmailPresenter.a = str;
            SettingsEmailPresenter settingsEmailPresenter2 = this.a;
            settingsEmailPresenter2.c = (((CharSequence) settingsEmailPresenter2.b).length() > 0 ? 1 : null) != null ? this.a.b : this.a.a;
            this.a.a();
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class h<T> implements ajfb<akxa<aepa>> {
        final /* synthetic */ SettingsEmailPresenter a;

        static final class a extends akcs implements akbl<View, ajxw> {
            private /* synthetic */ h a;
            private /* synthetic */ zjm b;

            a(h hVar, zjm zjm) {
                this.a = hVar;
                this.b = zjm;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((View) obj, "it");
                this.a.a.k.a((achg) this.b, true, true, null);
                this.a.a.a();
                return ajxw.a;
            }
        }

        h(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (akxa) obj;
            this.a.f = false;
            akcr.a(obj2, "resp");
            if (!obj2.c()) {
                akws a = obj2.a();
                if (a == null || a.e()) {
                    zjm zjm = new zjm(irc.t, "update_info", false, false, true, false, null, false, false, false, false, null, 4076);
                    defpackage.zgy.a aVar = new defpackage.zgy.a(this.a.h, this.a.k, zjm, false, null, 16);
                    String string = this.a.h.getString(R.string.email_resend_succeed_title);
                    akcr.a((Object) string, "context.getString(R.stri…ail_resend_succeed_title)");
                    defpackage.zgy.a a2 = aVar.a(string);
                    string = this.a.h.getString(R.string.email_sent_explanation);
                    akcr.a((Object) string, "context.getString(R.string.email_sent_explanation)");
                    zgy a3 = a2.b(string).a((int) R.string.okay, (akbl) new a(this, zjm), false).a();
                    this.a.k.a((achd) a3, a3.a, null);
                    this.a.a();
                }
            }
            SettingsEmailPresenter settingsEmailPresenter = this.a;
            Object string2 = settingsEmailPresenter.h.getString(R.string.email_resend_error);
            akcr.a(string2, "context.getString(R.string.email_resend_error)");
            settingsEmailPresenter.d = string2;
            this.a.a();
            this.a.a();
        }
    }

    static final class i<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsEmailPresenter a;

        i(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsEmailPresenter settingsEmailPresenter = this.a;
            settingsEmailPresenter.f = false;
            Object string = settingsEmailPresenter.h.getString(R.string.email_resend_error);
            akcr.a(string, "context.getString(R.string.email_resend_error)");
            settingsEmailPresenter.d = string;
            this.a.a();
        }
    }

    static final class j<T> implements ajfb<defpackage.ira.b<ahdj>> {
        private /* synthetic */ SettingsEmailPresenter a;
        private /* synthetic */ String b;

        j(SettingsEmailPresenter settingsEmailPresenter, String str) {
            this.a = settingsEmailPresenter;
            this.b = str;
        }

        /* JADX WARNING: Missing block: B:15:0x008a, code skipped:
            if ((((java.lang.CharSequence) r10.a.b).length() > 0 ? 1 : null) != null) goto L_0x008c;
     */
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
            r10 = this;
            r11 = (defpackage.ira.b) r11;
            r0 = r10.a;
            r1 = 0;
            r0.e = r1;
            r0 = r11.a;
            r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
            if (r0 != r2) goto L_0x0051;
        L_0x000d:
            r3 = r10.a;
            r11 = r3.l;
            r11 = r11.get();
            r4 = r11;
            r4 = (defpackage.jof) r4;
            r5 = 2131889504; // 0x7f120d60 float:1.9413673E38 double:1.0532933647E-314;
            r6 = 2131887039; // 0x7f1203bf float:1.9408674E38 double:1.053292147E-314;
            r7 = 0;
            r8 = 0;
            r9 = 12;
            r11 = defpackage.jof.a(r4, r5, r6, r7, r8, r9);
            r0 = r3.g;
            r0 = r0.l();
            r0 = (defpackage.zfr) r0;
            r0 = (defpackage.ajdw) r0;
            r11 = r11.b(r0);
            r0 = new com.snap.identity.ui.settings.email.SettingsEmailPresenter$l;
            r0.<init>(r3);
            r0 = (defpackage.ajfb) r0;
            r1 = new com.snap.identity.ui.settings.email.SettingsEmailPresenter$m;
            r1.<init>(r3);
            r1 = (defpackage.ajfb) r1;
            r4 = r11.a(r0, r1);
            r5 = r3;
            r5 = (defpackage.zln) r5;
            r6 = 0;
            r7 = 0;
            r8 = 6;
            r9 = 0;
            defpackage.zln.bindTo$default(r3, r4, r5, r6, r7, r8, r9);
            return;
        L_0x0051:
            r0 = r11.b;
            r0 = (defpackage.ahdj) r0;
            r0 = r0.a;
            r2 = java.lang.Boolean.TRUE;
            r0 = defpackage.akcr.a(r0, r2);
            if (r0 == 0) goto L_0x00b6;
        L_0x005f:
            r11 = r10.a;
            r11 = r11.m;
            r11 = r11.get();
            r11 = (defpackage.iqe) r11;
            r0 = r10.a;
            r0 = r0.a;
            r0 = (java.lang.CharSequence) r0;
            r0 = r0.length();
            r2 = 1;
            if (r0 <= 0) goto L_0x0078;
        L_0x0076:
            r0 = 1;
            goto L_0x0079;
        L_0x0078:
            r0 = 0;
        L_0x0079:
            if (r0 != 0) goto L_0x008c;
        L_0x007b:
            r0 = r10.a;
            r0 = r0.b;
            r0 = (java.lang.CharSequence) r0;
            r0 = r0.length();
            if (r0 <= 0) goto L_0x0089;
        L_0x0087:
            r0 = 1;
            goto L_0x008a;
        L_0x0089:
            r0 = 0;
        L_0x008a:
            if (r0 == 0) goto L_0x008d;
        L_0x008c:
            r1 = 1;
        L_0x008d:
            r11.b(r1);
            r11 = r10.a;
            r11 = r11.j;
            r11 = r11.b();
            r0 = defpackage.jic.PENDING_EMAIL;
            r0 = (defpackage.fth) r0;
            r1 = r10.b;
            r11 = r11.a(r0, r1);
            r11.b();
            r11 = r10.a;
            r0 = r10.b;
            r11.b = r0;
            r11 = r11.h;
            defpackage.jrl.a(r11);
            r11 = r10.a;
            r11.a();
            return;
        L_0x00b6:
            r0 = r10.a;
            r1 = r11.b;
            r1 = (defpackage.ahdj) r1;
            r1 = r1.c;
            r1 = (java.lang.CharSequence) r1;
            r1 = android.text.TextUtils.isEmpty(r1);
            if (r1 == 0) goto L_0x00d8;
        L_0x00c6:
            r11 = r10.a;
            r11 = r11.h;
            r11 = r11.getResources();
            r1 = 2131887127; // 0x7f120417 float:1.9408852E38 double:1.0532921903E-314;
            r11 = r11.getString(r1);
            r1 = "context.resources.getStr….string.email_save_error)";
            goto L_0x00e0;
        L_0x00d8:
            r11 = r11.b;
            r11 = (defpackage.ahdj) r11;
            r11 = r11.c;
            r1 = "resp.body.message";
        L_0x00e0:
            defpackage.akcr.a(r11, r1);
            r0.d = r11;
            r11 = r10.a;
            r11.a();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.email.SettingsEmailPresenter$j.accept(java.lang.Object):void");
        }
    }

    static final class k<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsEmailPresenter a;

        k(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsEmailPresenter settingsEmailPresenter = this.a;
            settingsEmailPresenter.e = false;
            Object string = settingsEmailPresenter.h.getResources().getString(R.string.email_save_error);
            akcr.a(string, "context.resources.getStr….string.email_save_error)");
            settingsEmailPresenter.d = string;
            this.a.a();
        }
    }

    static final class l<T> implements ajfb<joe> {
        private /* synthetic */ SettingsEmailPresenter a;

        l(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((joe) obj).a) {
                SettingsEmailPresenter.a(this.a);
                return;
            }
            SettingsEmailPresenter settingsEmailPresenter = this.a;
            settingsEmailPresenter.e = false;
            settingsEmailPresenter.a();
        }
    }

    static final class m<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsEmailPresenter a;

        m(SettingsEmailPresenter settingsEmailPresenter) {
            this.a = settingsEmailPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsEmailPresenter settingsEmailPresenter = this.a;
            settingsEmailPresenter.e = false;
            settingsEmailPresenter.a();
        }
    }

    public SettingsEmailPresenter(gpb gpb, Context context, ira ira, ftl ftl, tnj tnj, achb<zjm, zjk> achb, aipn<jof> aipn, aipn<iqe> aipn2, zgb zgb) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(context, "context");
        akcr.b(ira, "identityApi");
        akcr.b(ftl, "configProvider");
        akcr.b(tnj, "prefs");
        akcr.b(achb, "navigationHost");
        akcr.b(aipn, "passwordValidationHelper");
        akcr.b(aipn2, LocalMessageActionModel.ANALYTICS);
        akcr.b(zgb, "schedulersProvider");
        this.u = gpb;
        this.h = context;
        this.i = ira;
        this.v = ftl;
        this.j = tnj;
        this.k = achb;
        this.l = aipn;
        this.m = aipn2;
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        this.g = zgb.a(ity.d, this.n);
        this.p = true;
        this.q = new g(this);
        this.r = new c(this);
        this.s = new d(this);
        this.t = new b(this);
    }

    public static final /* synthetic */ void a(SettingsEmailPresenter settingsEmailPresenter, String str) {
        settingsEmailPresenter.d = "";
        settingsEmailPresenter.c = str;
        settingsEmailPresenter.a();
    }

    private void b() {
        jno jno = (jno) getTarget();
        if (jno != null) {
            jno.a().addTextChangedListener(this.t);
            jno.c().setOnClickListener(this.r);
            jno.h().setOnClickListener(this.q);
            jno.d().setOnClickListener(this.s);
        }
    }

    private void c() {
        jno jno = (jno) getTarget();
        if (jno != null) {
            jno.a().removeTextChangedListener(this.t);
            jno.c().setOnClickListener(null);
            jno.h().setOnClickListener(null);
            jno.d().setOnClickListener(null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019f  */
    public final void a() {
        /*
        r11 = this;
        r0 = r11.p;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r11.getTarget();
        r0 = (defpackage.jno) r0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r1 = "target?: return";
        defpackage.akcr.a(r0, r1);
        r11.c();
        r1 = r11.b;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        r2 = 0;
        r3 = 1;
        if (r1 <= 0) goto L_0x0024;
    L_0x0022:
        r1 = 1;
        goto L_0x0025;
    L_0x0024:
        r1 = 0;
    L_0x0025:
        if (r1 == 0) goto L_0x002a;
    L_0x0027:
        r1 = r11.b;
        goto L_0x002c;
    L_0x002a:
        r1 = r11.a;
    L_0x002c:
        r4 = r11.a;
        r4 = defpackage.akcr.a(r1, r4);
        if (r4 == 0) goto L_0x003a;
    L_0x0034:
        r4 = r11.o;
        if (r4 == 0) goto L_0x003a;
    L_0x0038:
        r4 = 1;
        goto L_0x003b;
    L_0x003a:
        r4 = 0;
    L_0x003b:
        r5 = r11.e;
        r6 = 3;
        r7 = 6;
        r8 = 2;
        if (r5 == 0) goto L_0x0044;
    L_0x0042:
        r1 = 6;
        goto L_0x0082;
    L_0x0044:
        r5 = r11.c;
        r5 = (java.lang.CharSequence) r5;
        r5 = r5.length();
        if (r5 != 0) goto L_0x0050;
    L_0x004e:
        r5 = 1;
        goto L_0x0051;
    L_0x0050:
        r5 = 0;
    L_0x0051:
        if (r5 == 0) goto L_0x0055;
    L_0x0053:
        r1 = 5;
        goto L_0x0082;
    L_0x0055:
        r5 = r11.c;
        r5 = defpackage.akcr.a(r1, r5);
        if (r5 == 0) goto L_0x0061;
    L_0x005d:
        if (r4 == 0) goto L_0x0061;
    L_0x005f:
        r1 = 3;
        goto L_0x0082;
    L_0x0061:
        r5 = r11.c;
        r5 = defpackage.akcr.a(r1, r5);
        if (r5 == 0) goto L_0x006d;
    L_0x0069:
        if (r4 != 0) goto L_0x006d;
    L_0x006b:
        r1 = 1;
        goto L_0x0082;
    L_0x006d:
        r4 = r11.c;
        r4 = defpackage.akcr.a(r1, r4);
        r4 = r4 ^ r3;
        if (r4 == 0) goto L_0x007c;
    L_0x0076:
        r4 = r11.o;
        if (r4 == 0) goto L_0x007c;
    L_0x007a:
        r1 = 2;
        goto L_0x0082;
    L_0x007c:
        r4 = r11.c;
        defpackage.akcr.a(r1, r4);
        r1 = 4;
    L_0x0082:
        r4 = r0.a();
        r4 = r4.getText();
        r4 = r4.toString();
        r5 = r11.c;
        r4 = defpackage.akcr.a(r4, r5);
        r4 = r4 ^ r3;
        if (r4 == 0) goto L_0x00af;
    L_0x0097:
        r4 = r0.a();
        r5 = r11.c;
        r5 = (java.lang.CharSequence) r5;
        r4.setText(r5);
        r4 = r0.a();
        r5 = r11.c;
        r5 = r5.length();
        r4.setSelection(r5);
    L_0x00af:
        if (r1 == r7) goto L_0x00b3;
    L_0x00b1:
        r4 = 1;
        goto L_0x00b4;
    L_0x00b3:
        r4 = 0;
    L_0x00b4:
        r5 = r0.a();
        r5 = r5.isEnabled();
        if (r5 == r4) goto L_0x00c5;
    L_0x00be:
        r5 = r0.a();
        r5.setEnabled(r4);
    L_0x00c5:
        r4 = defpackage.jnn.a;
        r5 = r1 + -1;
        r4 = r4[r5];
        if (r4 == r3) goto L_0x00df;
    L_0x00cd:
        if (r4 == r8) goto L_0x00d9;
    L_0x00cf:
        r4 = r11.h;
        r7 = 2131887130; // 0x7f12041a float:1.9408858E38 double:1.0532921917E-314;
    L_0x00d4:
        r4 = r4.getString(r7);
        goto L_0x00e5;
    L_0x00d9:
        r4 = r11.h;
        r7 = 2131887128; // 0x7f120418 float:1.9408854E38 double:1.053292191E-314;
        goto L_0x00d4;
    L_0x00df:
        r4 = r11.h;
        r7 = 2131887132; // 0x7f12041c float:1.9408862E38 double:1.0532921927E-314;
        goto L_0x00d4;
    L_0x00e5:
        r7 = r0.b();
        r7 = r7.getText();
        r7 = r7.toString();
        r7 = defpackage.akcr.a(r7, r4);
        r7 = r7 ^ r3;
        if (r7 == 0) goto L_0x0101;
    L_0x00f8:
        r7 = r0.b();
        r4 = (java.lang.CharSequence) r4;
        r7.setText(r4);
    L_0x0101:
        r4 = defpackage.jnn.b;
        r4 = r4[r5];
        if (r4 == r3) goto L_0x011c;
    L_0x0107:
        if (r4 == r8) goto L_0x010c;
    L_0x0109:
        r4 = "";
        goto L_0x012b;
    L_0x010c:
        r4 = r11.h;
        r7 = 2131887131; // 0x7f12041b float:1.940886E38 double:1.053292192E-314;
        r9 = new java.lang.Object[r3];
        r10 = defpackage.abpz.OK_HAND_SIGN;
        r10 = defpackage.abqi.a(r10);
        r9[r2] = r10;
        goto L_0x0127;
    L_0x011c:
        r4 = r11.h;
        r7 = 2131887126; // 0x7f120416 float:1.940885E38 double:1.05329219E-314;
        r9 = new java.lang.Object[r3];
        r10 = r11.a;
        r9[r2] = r10;
    L_0x0127:
        r4 = r4.getString(r7, r9);
    L_0x012b:
        r7 = r0.g();
        r7 = r7.getText();
        r7 = r7.toString();
        r7 = defpackage.akcr.a(r7, r4);
        r7 = r7 ^ r3;
        if (r7 == 0) goto L_0x0147;
    L_0x013e:
        r7 = r0.g();
        r4 = (java.lang.CharSequence) r4;
        r7.setText(r4);
    L_0x0147:
        r4 = defpackage.jnn.c;
        r4 = r4[r5];
        if (r4 == r3) goto L_0x0154;
    L_0x014d:
        if (r4 == r8) goto L_0x0154;
    L_0x014f:
        if (r4 == r6) goto L_0x0153;
    L_0x0151:
        r8 = 0;
        goto L_0x0154;
    L_0x0153:
        r8 = 1;
    L_0x0154:
        r4 = r0.c();
        r4.setState(r8);
        r4 = 8;
        if (r1 != r3) goto L_0x0165;
    L_0x015f:
        r1 = r11.f;
        if (r1 != 0) goto L_0x0165;
    L_0x0163:
        r1 = 0;
        goto L_0x0167;
    L_0x0165:
        r1 = 8;
    L_0x0167:
        r5 = r0.h();
        r5 = r5.getVisibility();
        if (r5 == r1) goto L_0x0178;
    L_0x0171:
        r5 = r0.h();
        r5.setVisibility(r1);
    L_0x0178:
        r1 = r11.f;
        if (r1 == 0) goto L_0x017e;
    L_0x017c:
        r1 = 0;
        goto L_0x0180;
    L_0x017e:
        r1 = 8;
    L_0x0180:
        r5 = r0.i();
        r5 = r5.getVisibility();
        if (r5 == r1) goto L_0x0191;
    L_0x018a:
        r5 = r0.i();
        r5.setVisibility(r1);
    L_0x0191:
        r1 = r11.d;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x019c;
    L_0x019b:
        goto L_0x019d;
    L_0x019c:
        r3 = 0;
    L_0x019d:
        if (r3 == 0) goto L_0x01b9;
    L_0x019f:
        r1 = r0.d();
        r1.setVisibility(r2);
        r1 = r0.f();
        r3 = r11.d;
        r3 = (java.lang.CharSequence) r3;
        r1.setText(r3);
        r0 = r0.f();
        r0.setVisibility(r2);
        goto L_0x01c7;
    L_0x01b9:
        r1 = r0.d();
        r1.setVisibility(r4);
        r0 = r0.f();
        r0.setVisibility(r4);
    L_0x01c7:
        r11.b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.email.SettingsEmailPresenter.a():void");
    }

    /* renamed from: a */
    public final void takeTarget(jno jno) {
        akcr.b(jno, "target");
        super.takeTarget(jno);
        jno.getLifecycle().a(this);
    }

    public final void dropTarget() {
        jno jno = (jno) getTarget();
        if (jno != null) {
            defpackage.j lifecycle = jno.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        jrl.a(this.h);
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        this.o = this.v.a((fth) jic.IS_EMAIL_VERIFIED);
        Object j = this.v.j(jic.PENDING_EMAIL);
        akcr.a(j, "configProvider.getString…urationKey.PENDING_EMAIL)");
        this.b = j;
        zln.bindTo$default(this, this.u.c().a((ajdw) this.g.l()).e().a((ajfb) new e(this), (ajfb) f.a), this, null, null, 6, null);
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        c();
        this.p = true;
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        b();
        this.p = false;
        a();
    }
}

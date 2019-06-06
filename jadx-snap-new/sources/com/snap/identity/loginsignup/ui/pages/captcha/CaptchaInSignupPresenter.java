package com.snap.identity.loginsignup.ui.pages.captcha;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aavu;
import defpackage.aawb;
import defpackage.aaxh;
import defpackage.aaxp;
import defpackage.abkq;
import defpackage.achb;
import defpackage.ahdx;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajwh;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.ajyq;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.akgc;
import defpackage.akhv;
import defpackage.akhw;
import defpackage.akws;
import defpackage.akxa;
import defpackage.gpb;
import defpackage.ilv;
import defpackage.iok;
import defpackage.ira;
import defpackage.isc;
import defpackage.isf;
import defpackage.ish;
import defpackage.jav;
import defpackage.jbi;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jeo;
import defpackage.jep;
import defpackage.jhd;
import defpackage.jhe;
import defpackage.jhf;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import java.util.List;

public final class CaptchaInSignupPresenter extends zll<jeo> implements defpackage.k {
    String a;
    String b;
    String c;
    String d;
    jhd e;
    final zfw f;
    final aipn<Context> g;
    final aipn<zke> h;
    final aipn<ira> i;
    final jhf j;
    final aipn<jbk> k;
    final aipn<isf> l;
    private jep m = jep.START;
    private jep n = jep.START;
    private boolean o;
    private boolean p;
    private aipn<achb<zjm, zjk>> q;
    private final aipn<jbw> r;
    private final aipn<gpb> s;

    static final class a implements OnClickListener {
        private /* synthetic */ CaptchaInSignupPresenter a;

        a(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
        }

        public final void onClick(View view) {
            CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
            List b = captchaInSignupPresenter.e.b();
            captchaInSignupPresenter.a(jep.SOLVING);
            String str = captchaInSignupPresenter.b;
            String str2 = captchaInSignupPresenter.a;
            akcr.b(str, "captchaId");
            akcr.b(b, "selectedItems");
            akcr.b(str2, "username");
            ((isf) captchaInSignupPresenter.l.get()).a(aaoo.SIGNUP_CAPTCHA_SOLVE_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
            zln.bindTo$default(captchaInSignupPresenter, ((ira) captchaInSignupPresenter.i.get()).a(str, b, str2).a((ajdw) captchaInSignupPresenter.f.l()).a((ajfb) new l(captchaInSignupPresenter, str2), (ajfb) new m(captchaInSignupPresenter)), captchaInSignupPresenter, null, null, 6, null);
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ CaptchaInSignupPresenter a;

        b(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
        }

        public final void onClick(View view) {
            CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
            captchaInSignupPresenter.a(captchaInSignupPresenter.a);
        }
    }

    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        d(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akxa akxa = (akxa) obj;
            akcr.b(akxa, "result");
            CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
            Long valueOf = Long.valueOf(-1);
            if (akxa != null) {
                obj = akxa.a();
                if (obj != null) {
                    akcr.a(obj, "result?.response() ?: return Pair(false, -1)");
                    akhv a = obj.a();
                    if (a == null) {
                        return new ajxm(Boolean.FALSE, valueOf);
                    }
                    long a2 = CaptchaInSignupPresenter.a(a);
                    obj = (akhw) obj.f();
                    if (obj == null) {
                        return new ajxm(Boolean.FALSE, Long.valueOf(a2));
                    }
                    akcr.a(obj, "response.body() ?: return Pair(false, latency)");
                    if (obj.b() <= 0) {
                        return new ajxm(Boolean.FALSE, Long.valueOf(a2));
                    }
                    akcr.b(a, "rawResponse");
                    Object a3 = a.a("Content-Disposition");
                    String str = "";
                    if (a3 != null) {
                        akcr.a(a3, "rawResponse.header(CAPTC…HEADER_NAME) ?: return \"\"");
                        CharSequence charSequence = (CharSequence) a3;
                        if (!akgb.a(charSequence)) {
                            int a4 = akgc.a(charSequence, "filename=", 0, false, 6);
                            int a5 = akgc.a(charSequence, ".zip", 0, false, 6);
                            if (!(a4 == -1 || a5 == -1)) {
                                a4 += 9;
                                if (a5 > a4) {
                                    if (a3 != null) {
                                        str = a3.substring(a4, a5);
                                        akcr.a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    } else {
                                        throw new ajxt("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                            }
                        }
                    }
                    captchaInSignupPresenter.b = str;
                    if (akgb.a(captchaInSignupPresenter.b)) {
                        return new ajxm(Boolean.FALSE, Long.valueOf(a2));
                    }
                    jhf jhf = captchaInSignupPresenter.j;
                    Object obj2 = captchaInSignupPresenter.g.get();
                    akcr.a(obj2, "context.get()");
                    List<jhe> a6 = jhf.a((Context) obj2, obj);
                    if (a6.isEmpty()) {
                        return new ajxm(Boolean.FALSE, Long.valueOf(a2));
                    }
                    jhd jhd = captchaInSignupPresenter.e;
                    akcr.b(a6, "newItems");
                    jhd.d();
                    for (jhe add : a6) {
                        jhd.a.add(add);
                    }
                    List list = jhd.a;
                    if (list.size() > 1) {
                        ajyq.a(list, new defpackage.jhd.d());
                    }
                    captchaInSignupPresenter.c = jhf.a(a);
                    return new ajxm(Boolean.TRUE, Long.valueOf(a2));
                }
            }
            return new ajxm(Boolean.FALSE, valueOf);
        }
    }

    static final class e<T> implements ajfb<ajxm<? extends Boolean, ? extends Long>> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        e(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jep jep;
            ajxm ajxm = (ajxm) obj;
            boolean booleanValue = ((Boolean) ajxm.a).booleanValue();
            ((jbk) this.a.k.get()).c(((Number) ajxm.b).longValue(), booleanValue);
            CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
            if (booleanValue) {
                ((isf) captchaInSignupPresenter.l.get()).a(aaoo.SIGNUP_CAPTCHA_LOAD_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
                jep = jep.LOAD_SUCCESS;
            } else {
                jep = jep.LOAD_FAIL;
            }
            captchaInSignupPresenter.a(jep);
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        f(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a(jep.LOAD_FAIL);
            ((jbk) this.a.k.get()).c(-1, false);
        }
    }

    static final class g<T> implements ajfb<abkq> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        g(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
        }

        /* JADX WARNING: Missing block: B:9:0x0033, code skipped:
            if (r7 == null) goto L_0x0035;
     */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (defpackage.abkq) r7;
            r0 = r6.a;
            r7 = r7.e;
            if (r7 == 0) goto L_0x0035;
        L_0x0008:
            r7 = (java.lang.CharSequence) r7;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r1 = (java.lang.Appendable) r1;
            r2 = 0;
            r3 = r7.length();
        L_0x0016:
            if (r2 >= r3) goto L_0x0028;
        L_0x0018:
            r4 = r7.charAt(r2);
            r5 = java.lang.Character.isDigit(r4);
            if (r5 == 0) goto L_0x0025;
        L_0x0022:
            r1.append(r4);
        L_0x0025:
            r2 = r2 + 1;
            goto L_0x0016;
        L_0x0028:
            r1 = (java.lang.StringBuilder) r1;
            r7 = r1.toString();
            r1 = "filterTo(StringBuilder(), predicate).toString()";
            defpackage.akcr.a(r7, r1);
            if (r7 != 0) goto L_0x0037;
        L_0x0035:
            r7 = "";
        L_0x0037:
            r0.d = r7;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.captcha.CaptchaInSignupPresenter$g.accept(java.lang.Object):void");
        }
    }

    static final class l<T> implements ajfb<akxa<ahdx>> {
        private /* synthetic */ CaptchaInSignupPresenter a;
        private /* synthetic */ String b;

        l(CaptchaInSignupPresenter captchaInSignupPresenter, String str) {
            this.a = captchaInSignupPresenter;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            boolean booleanValue;
            akws a = ((akxa) obj).a();
            akhv akhv = null;
            ahdx ahdx = a != null ? (ahdx) a.f() : null;
            if (a != null) {
                akhv = a.a();
            }
            long a2 = CaptchaInSignupPresenter.a(akhv);
            String str = "body.findFriendsEnabled";
            boolean z = false;
            Object obj2;
            if (a != null && a.e() && (ahdx instanceof ahdx)) {
                jbk jbk = (jbk) this.a.k.get();
                int a3 = this.a.e.a();
                aawb aawb = new aawb();
                aawb.a(aaxp.V2);
                aawb.a(Boolean.FALSE);
                aawb.a(Long.valueOf((long) a3));
                aawb.a(((isc) jbk.g.get()).a());
                jbk.a().a(aawb);
                jbk = (jbk) this.a.k.get();
                String str2 = jbk.b().c().n;
                boolean z2 = true;
                if (!akgb.a(str2)) {
                    aaxh aaxh = new aaxh();
                    aaxh.b(str2);
                    aaxh.d(Boolean.valueOf(jbk.m()));
                    aaxh.a(((isc) jbk.g.get()).a());
                    jbk.a().a(aaxh);
                    ((ilv) jbk.f.get()).c(iok.SIGNUP_SOLVE_CAPTCHA.a("is_og", false).a("new_device", jbk.m() ^ 1), 1);
                }
                this.a.a(jep.SOLVE_SUCCESS);
                if ((akgb.a(this.a.d) ^ 1) == 0) {
                    Object obj3 = ahdx.a;
                    akcr.a(obj3, str);
                    if (!obj3.booleanValue()) {
                        z2 = false;
                    }
                }
                obj2 = ahdx.a;
                akcr.a(obj2, str);
                booleanValue = obj2.booleanValue();
                ((zke) this.a.h.get()).a(new jav(this.b, z2));
            } else {
                ((jbk) this.a.k.get()).a(this.a.e.a());
                this.a.a(jep.SOLVE_FAIL);
                if (ahdx instanceof ahdx) {
                    obj2 = ahdx.a;
                    akcr.a(obj2, str);
                    booleanValue = obj2.booleanValue();
                } else {
                    booleanValue = false;
                }
                CaptchaInSignupPresenter.a(this.a);
            }
            jbk jbk2 = (jbk) this.a.k.get();
            if (a != null) {
                z = a.e();
            }
            jeb c = jbk2.b().c();
            if (!akgb.a(c.n)) {
                aavu aavu = new aavu();
                aavu.b(c.n);
                aavu.d(Boolean.valueOf(jbk2.m()));
                aavu.a(Long.valueOf(a2));
                aavu.c(Boolean.valueOf(z));
                aavu.a(((isc) jbk2.g.get()).a());
                aavu.a(Boolean.valueOf(booleanValue));
                jbk2.a().a(aavu);
            }
        }
    }

    static final class m<T> implements ajfb<Throwable> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        m(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((jbk) this.a.k.get()).a(this.a.e.a());
            ((jbk) this.a.k.get()).c(-1, false);
            this.a.a(jep.SOLVE_FAIL);
            CaptchaInSignupPresenter.a(this.a);
        }
    }

    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        c(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.a();
            return ajxw.a;
        }
    }

    static final class j extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        j(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            CaptchaInSignupPresenter captchaInSignupPresenter = this.a;
            captchaInSignupPresenter.a(captchaInSignupPresenter.a);
            return ajxw.a;
        }
    }

    static final class k extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ CaptchaInSignupPresenter a;

        k(CaptchaInSignupPresenter captchaInSignupPresenter) {
            this.a = captchaInSignupPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((zke) this.a.h.get()).a(new jbi());
            return ajxw.a;
        }
    }

    static final class h extends akcq implements akbk<String> {
        h(CharSequence charSequence) {
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

    static final class i extends akcq implements akbl<CharSequence, ajxw> {
        i(TextView textView) {
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

    public CaptchaInSignupPresenter(aipn<Context> aipn, aipn<zke> aipn2, aipn<achb<zjm, zjk>> aipn3, aipn<jbw> aipn4, aipn<ira> aipn5, aipn<gpb> aipn6, zgb zgb, jhf jhf, aipn<jbk> aipn7, aipn<isf> aipn8) {
        akcr.b(aipn, "context");
        akcr.b(aipn2, "eventDispatcher");
        akcr.b(aipn3, "navigationHost");
        akcr.b(aipn4, "store");
        akcr.b(aipn5, "identityApi");
        akcr.b(aipn6, "authStore");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(jhf, "parser");
        akcr.b(aipn7, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn8, "stateTransitionService");
        this.g = aipn;
        this.h = aipn2;
        this.q = aipn3;
        this.r = aipn4;
        this.i = aipn5;
        this.s = aipn6;
        this.j = jhf;
        this.k = aipn7;
        this.l = aipn8;
        String str = "";
        this.a = str;
        this.b = str;
        this.c = str;
        this.d = str;
        Object obj = this.g.get();
        akcr.a(obj, "context.get()");
        this.e = new jhd((Context) obj);
        this.p = true;
        this.f = zgb.a(jbv.y.callsite("CaptchaInSignupPresenter"));
    }

    static long a(akhv akhv) {
        return (akhv == null || akhv.g() < 0 || akhv.h() < 0) ? -1 : akhv.h() - akhv.g();
    }

    private final void b() {
        Object obj = (jeo) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            obj.i().setOnClickListener(new a(this));
            obj.h().setOnClickListener(new b(this));
            this.e.b = new c(this);
        }
    }

    private final void c() {
        Object obj = (jeo) getTarget();
        if (obj != null) {
            akcr.a(obj, "target ?: return");
            obj.i().setOnClickListener(null);
            obj.h().setOnClickListener(null);
            this.e.b = null;
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:27:0x00ed, code skipped:
            r0.g().setVisibility(8);
            r0.h().setVisibility(8);
     */
    /* JADX WARNING: Missing block: B:30:0x014b, code skipped:
            r0.d().setVisibility(4);
            r0.c().setVisibility(8);
     */
    /* JADX WARNING: Missing block: B:37:0x01cd, code skipped:
            if (r0.a().getVisibility() != 0) goto L_0x01e9;
     */
    /* JADX WARNING: Missing block: B:38:0x01cf, code skipped:
            r1 = r1.getResources();
            defpackage.akcr.a(r1, "context.resources");
     */
    /* JADX WARNING: Missing block: B:39:0x01e0, code skipped:
            if ((r1.getConfiguration().screenLayout & 15) >= 2) goto L_0x01e9;
     */
    /* JADX WARNING: Missing block: B:40:0x01e2, code skipped:
            r0.a().setVisibility(8);
     */
    /* JADX WARNING: Missing block: B:41:0x01e9, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:42:0x01ec, code skipped:
            return;
     */
    public final void a() {
        /*
        r8 = this;
        r0 = r8.p;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r8.getTarget();
        r0 = (defpackage.jeo) r0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        r1 = "target ?: return";
        defpackage.akcr.a(r0, r1);
        r1 = r8.g;
        r1 = r1.get();
        r1 = (android.content.Context) r1;
        if (r1 != 0) goto L_0x001e;
    L_0x001d:
        return;
    L_0x001e:
        r8.c();
        r2 = r8.c;
        r2 = (java.lang.CharSequence) r2;
        r2 = defpackage.akgb.a(r2);
        r3 = 1;
        r2 = r2 ^ r3;
        if (r2 == 0) goto L_0x004c;
    L_0x002d:
        r2 = r8.c;
        r4 = new com.snap.identity.loginsignup.ui.pages.captcha.CaptchaInSignupPresenter$h;
        r5 = r0.b();
        r5 = r5.getText();
        r4.<init>(r5);
        r4 = (defpackage.akbk) r4;
        r5 = new com.snap.identity.loginsignup.ui.pages.captcha.CaptchaInSignupPresenter$i;
        r6 = r0.b();
        r5.<init>(r6);
        r5 = (defpackage.akbl) r5;
        defpackage.jrl.a(r2, r4, r5);
    L_0x004c:
        r2 = r8.o;
        if (r2 != 0) goto L_0x0095;
    L_0x0050:
        r8.o = r3;
        r2 = r0.j();
        r2.setHasFixedSize(r3);
        r2 = android.os.Build.VERSION.SDK_INT;
        r4 = 21;
        if (r2 < r4) goto L_0x006d;
    L_0x005f:
        r2 = r0.j();
        r2.setClipChildren(r3);
        r2 = r0.j();
        r2.setClipToOutline(r3);
    L_0x006d:
        r2 = r0.j();
        r4 = new android.support.v7.widget.GridLayoutManager;
        r5 = 3;
        r4.<init>(r1, r5);
        r4 = (android.support.v7.widget.RecyclerView.LayoutManager) r4;
        r2.setLayoutManager(r4);
        r2 = new jhg;
        r4 = r1.getResources();
        r5 = 2131166104; // 0x7f070398 float:1.7946444E38 double:1.0529359576E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r2.<init>(r4);
        r4 = r0.j();
        r2 = (android.support.v7.widget.RecyclerView.ItemDecoration) r2;
        r4.addItemDecoration(r2);
    L_0x0095:
        r2 = r8.m;
        r4 = defpackage.jep.LOAD_SUCCESS;
        r5 = 0;
        r6 = 8;
        if (r2 != r4) goto L_0x00bf;
    L_0x009e:
        r2 = r0.j();
        r2 = r2.getVisibility();
        if (r2 != r6) goto L_0x00bf;
    L_0x00a8:
        r2 = r0.j();
        r4 = r8.e;
        r4 = (android.support.v7.widget.RecyclerView.Adapter) r4;
        r2.setAdapter(r4);
        r2 = r8.e;
        r2.notifyDataSetChanged();
        r2 = r0.j();
        r2.setVisibility(r5);
    L_0x00bf:
        r2 = r8.m;
        r4 = defpackage.jen.a;
        r2 = r2.ordinal();
        r2 = r4[r2];
        r4 = 2;
        r7 = 4;
        switch(r2) {
            case 1: goto L_0x01c5;
            case 2: goto L_0x018c;
            case 3: goto L_0x015a;
            case 4: goto L_0x012f;
            case 5: goto L_0x00fc;
            case 6: goto L_0x00df;
            case 7: goto L_0x00d0;
            default: goto L_0x00ce;
        };
    L_0x00ce:
        goto L_0x01c5;
    L_0x00d0:
        r2 = r0.b();
        r2.setVisibility(r5);
        r2 = r0.j();
        r2.setVisibility(r5);
        goto L_0x00ed;
    L_0x00df:
        r2 = r0.b();
        r2.setVisibility(r6);
        r2 = r0.j();
        r2.setVisibility(r6);
    L_0x00ed:
        r2 = r0.g();
        r2.setVisibility(r6);
        r2 = r0.h();
        r2.setVisibility(r6);
        goto L_0x014b;
    L_0x00fc:
        r2 = r0.b();
        r2.setVisibility(r5);
        r2 = r0.j();
        r2.setVisibility(r5);
        r2 = r0.g();
        r2.setVisibility(r6);
        r2 = r0.h();
        r2.setVisibility(r6);
        r2 = r0.d();
        r2.setVisibility(r7);
        r2 = r0.c();
        r2.setVisibility(r6);
        r2 = r0.i();
        r2.setState(r4);
        goto L_0x01c5;
    L_0x012f:
        r2 = r0.b();
        r2.setVisibility(r6);
        r2 = r0.j();
        r2.setVisibility(r6);
        r2 = r0.g();
        r2.setVisibility(r5);
        r2 = r0.h();
        r2.setVisibility(r5);
    L_0x014b:
        r2 = r0.d();
        r2.setVisibility(r7);
        r2 = r0.c();
        r2.setVisibility(r6);
        goto L_0x0184;
    L_0x015a:
        r2 = r0.b();
        r2.setVisibility(r6);
        r2 = r0.j();
        r2.setVisibility(r6);
        r2 = r0.g();
        r2.setVisibility(r6);
        r2 = r0.h();
        r2.setVisibility(r6);
        r2 = r0.d();
        r2.setVisibility(r5);
        r2 = r0.c();
        r2.setVisibility(r5);
    L_0x0184:
        r2 = r0.i();
        r2.setState(r5);
        goto L_0x01c5;
    L_0x018c:
        r2 = r0.b();
        r2.setVisibility(r5);
        r2 = r0.j();
        r2.setVisibility(r5);
        r2 = r0.g();
        r2.setVisibility(r6);
        r2 = r0.h();
        r2.setVisibility(r6);
        r2 = r0.d();
        r2.setVisibility(r7);
        r2 = r0.c();
        r2.setVisibility(r6);
        r2 = r8.e;
        r2 = r2.c();
        if (r2 == 0) goto L_0x0184;
    L_0x01be:
        r2 = r0.i();
        r2.setState(r3);
    L_0x01c5:
        r2 = r0.a();
        r2 = r2.getVisibility();
        if (r2 != 0) goto L_0x01e9;
    L_0x01cf:
        r1 = r1.getResources();
        r2 = "context.resources";
        defpackage.akcr.a(r1, r2);
        r1 = r1.getConfiguration();
        r1 = r1.screenLayout;
        r1 = r1 & 15;
        if (r1 >= r4) goto L_0x01e9;
    L_0x01e2:
        r0 = r0.a();
        r0.setVisibility(r6);
    L_0x01e9:
        r8.b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.captcha.CaptchaInSignupPresenter.a():void");
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        a(jep.LOADING);
        ((isf) this.l.get()).a(aaoo.SIGNUP_CAPTCHA_LOAD_REQUEST, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        zln.bindTo$default(this, ((ira) this.i.get()).j(str).a(ajwh.c).f(new d(this)).a((ajdw) this.f.l()).a((ajfb) new e(this), (ajfb) new f(this)), this, null, null, 6, null);
    }

    /* renamed from: a */
    public final void takeTarget(jeo jeo) {
        akcr.b(jeo, "target");
        super.takeTarget(jeo);
        jeo.getLifecycle().a(this);
    }

    public final void a(jep jep) {
        akcr.b(jep, "newStatus");
        if (this.n != jep) {
            this.m = jep;
            a();
        }
    }

    public final void dropTarget() {
        Object obj = (jeo) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        jeb c = ((jbw) this.r.get()).c();
        this.a = (akgb.a((CharSequence) c.r) ^ 1) != 0 ? c.r : c.u;
        a(this.a);
        zln.bindTo$default(this, ((gpb) this.s.get()).c().b((ajdw) this.f.h()).e().a((ajdw) this.f.l()).e((ajfb) new g(this)), this, null, null, 6, null);
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.e.d();
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        c();
        this.p = true;
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.p = false;
        a();
        b();
    }
}

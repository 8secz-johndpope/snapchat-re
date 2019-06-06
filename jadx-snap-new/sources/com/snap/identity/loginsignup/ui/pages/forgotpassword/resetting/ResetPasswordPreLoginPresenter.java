package com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.TextView;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.achb;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.ira;
import defpackage.isf;
import defpackage.ish;
import defpackage.izd;
import defpackage.jau;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jfh;
import defpackage.jfi;
import defpackage.jfj;
import defpackage.jfl;
import defpackage.s;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;

public final class ResetPasswordPreLoginPresenter extends zll<jfl> implements defpackage.k {
    String a;
    String b;
    boolean c = true;
    final Context d;
    final aipn<achb<zjm, zjk>> e;
    final aipn<jbk> f;
    final jfh g;
    final aipn<isf> h;
    private final zfw i = zgb.a(jbv.y.callsite(jbv.v.b()));
    private final b j = new b(this);
    private final a k = new a(this);
    private final OnFocusChangeListener l = new e(this);
    private final OnClickListener m = new c(this);
    private final aipn<jbw> n;

    public static final class a implements TextWatcher {
        private /* synthetic */ ResetPasswordPreLoginPresenter a;

        a(ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter) {
            this.a = resetPasswordPreLoginPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
        public final void onTextChanged(java.lang.CharSequence r11, int r12, int r13, int r14) {
            /*
            r10 = this;
            r12 = r10.a;
            r12 = r12.g;
            r13 = "";
            if (r11 == 0) goto L_0x0011;
        L_0x0008:
            r11 = r11.toString();
            if (r11 != 0) goto L_0x000f;
        L_0x000e:
            goto L_0x0011;
        L_0x000f:
            r3 = r11;
            goto L_0x0012;
        L_0x0011:
            r3 = r13;
        L_0x0012:
            r11 = "password";
            defpackage.akcr.b(r3, r11);
            r11 = r3;
            r11 = (java.lang.CharSequence) r11;
            r11 = defpackage.akgb.a(r11);
            r14 = 1;
            r11 = r11 ^ r14;
            if (r11 == 0) goto L_0x003f;
        L_0x0022:
            r11 = r12.a();
            r11 = r11.a;
            r11 = (java.lang.CharSequence) r11;
            r11 = defpackage.akgb.a(r11);
            r11 = r11 ^ r14;
            if (r11 == 0) goto L_0x003f;
        L_0x0031:
            r11 = r12.a();
            r11 = r11.a;
            r11 = defpackage.akcr.a(r3, r11);
            r11 = r11 ^ r14;
            if (r11 == 0) goto L_0x003f;
        L_0x003e:
            goto L_0x0040;
        L_0x003f:
            r14 = 0;
        L_0x0040:
            if (r14 == 0) goto L_0x004b;
        L_0x0042:
            r11 = r12.e;
            r13 = 2131889603; // 0x7f120dc3 float:1.9413874E38 double:1.0532934136E-314;
            r13 = r11.getString(r13);
        L_0x004b:
            r4 = r13;
            r0 = r12.a();
            r1 = 0;
            r2 = 0;
            r11 = "confirmError";
            defpackage.akcr.a(r4, r11);
            r5 = 0;
            r6 = 0;
            r7 = 0;
            r8 = 0;
            r9 = 243; // 0xf3 float:3.4E-43 double:1.2E-321;
            r11 = defpackage.jfj.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
            r12.a(r11);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$a.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public static final class b implements TextWatcher {
        private /* synthetic */ ResetPasswordPreLoginPresenter a;

        b(ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter) {
            this.a = resetPasswordPreLoginPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
        public final void onTextChanged(java.lang.CharSequence r11, int r12, int r13, int r14) {
            /*
            r10 = this;
            r12 = r10.a;
            r12 = r12.g;
            r13 = "";
            if (r11 == 0) goto L_0x0011;
        L_0x0008:
            r11 = r11.toString();
            if (r11 != 0) goto L_0x000f;
        L_0x000e:
            goto L_0x0011;
        L_0x000f:
            r1 = r11;
            goto L_0x0012;
        L_0x0011:
            r1 = r13;
        L_0x0012:
            r11 = "password";
            defpackage.akcr.b(r1, r11);
            r11 = r1;
            r11 = (java.lang.CharSequence) r11;
            r11 = defpackage.akgb.a(r11);
            r14 = 1;
            r11 = r11 ^ r14;
            if (r11 == 0) goto L_0x003f;
        L_0x0022:
            r11 = r12.a();
            r11 = r11.c;
            r11 = (java.lang.CharSequence) r11;
            r11 = defpackage.akgb.a(r11);
            r11 = r11 ^ r14;
            if (r11 == 0) goto L_0x003f;
        L_0x0031:
            r11 = r12.a();
            r11 = r11.c;
            r11 = defpackage.akcr.a(r1, r11);
            r11 = r11 ^ r14;
            if (r11 == 0) goto L_0x003f;
        L_0x003e:
            goto L_0x0040;
        L_0x003f:
            r14 = 0;
        L_0x0040:
            if (r14 == 0) goto L_0x004b;
        L_0x0042:
            r11 = r12.e;
            r13 = 2131889603; // 0x7f120dc3 float:1.9413874E38 double:1.0532934136E-314;
            r13 = r11.getString(r13);
        L_0x004b:
            r4 = r13;
            r0 = r12.a();
            r3 = 0;
            r11 = "confirmError";
            defpackage.akcr.a(r4, r11);
            r5 = 0;
            r6 = 0;
            r7 = defpackage.izd.UNKNOWN;
            r8 = 0;
            r9 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
            r2 = "";
            r11 = defpackage.jfj.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
            r12.a(r11);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ ResetPasswordPreLoginPresenter a;

        c(ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter) {
            this.a = resetPasswordPreLoginPresenter;
        }

        public final void onClick(View view) {
            ((isf) this.a.h.get()).a(aaoo.FORGOT_PASSWORD_RESET_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.LOGIN);
            jfh jfh = this.a.g;
            String str = this.a.a;
            String str2 = this.a.b;
            akcr.b(str, "username");
            akcr.b(str2, "preAuthToken");
            jfh.a(jfj.a(jfh.a(), null, null, null, null, true, false, null, false, 239));
            jfh jfh2 = jfh;
            ajej a = ((ira) jfh.h.get()).e(jfh.a().a, str, str2).a((ajdw) jfh.a.l()).a((ajfb) new jfi(new defpackage.jfh.b(jfh2)), (ajfb) new jfi(new defpackage.jfh.c(jfh2)));
            akcr.a((Object) a, "identityApi.get().reques… ::onChangePasswordError)");
            ajvv.a(a, jfh.c);
        }
    }

    static final class e implements OnFocusChangeListener {
        private /* synthetic */ ResetPasswordPreLoginPresenter a;

        e(ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter) {
            this.a = resetPasswordPreLoginPresenter;
        }

        public final void onFocusChange(View view, boolean z) {
            ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter = this.a;
            if (!z) {
                ((isf) resetPasswordPreLoginPresenter.h.get()).a(aaoo.FORGOT_PASSWORD_CHECK_STRENGTH_SUBMIT, aaop.USER_BLUR_FIELD, ish.LOGIN);
                jfh jfh = resetPasswordPreLoginPresenter.g;
                String str = resetPasswordPreLoginPresenter.a;
                String str2 = resetPasswordPreLoginPresenter.b;
                akcr.b(str, "username");
                akcr.b(str2, "preAuthToken");
                if ((akgb.a(jfh.a().a) ^ 1) != 0) {
                    jfh.a(jfj.a(jfh.a(), null, null, null, null, false, true, izd.UNKNOWN, false, 159));
                    jfh jfh2 = jfh;
                    ajej a = ((ira) jfh.h.get()).d(jfh.a().a, str, str2).a((ajdw) jfh.a.l()).a((ajfb) new jfi(new defpackage.jfh.d(jfh2)), (ajfb) new jfi(new defpackage.jfh.e(jfh2)));
                    akcr.a((Object) a, "identityApi.get().reques…GetPasswordStrengthError)");
                    ajvv.a(a, jfh.c);
                }
            }
        }
    }

    static final class d<T> implements ajfb<jeb> {
        private /* synthetic */ ResetPasswordPreLoginPresenter a;

        d(ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter) {
            this.a = resetPasswordPreLoginPresenter;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            jeb jeb = (jeb) obj;
            this.a.a = jeb.D;
            this.a.b = jeb.C;
        }
    }

    static final class g<T> implements ajfb<jfj> {
        private /* synthetic */ ResetPasswordPreLoginPresenter a;

        g(ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter) {
            this.a = resetPasswordPreLoginPresenter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x016e  */
        public final /* synthetic */ void accept(java.lang.Object r14) {
            /*
            r13 = this;
            r14 = (defpackage.jfj) r14;
            r0 = r13.a;
            r1 = "it";
            defpackage.akcr.a(r14, r1);
            r1 = r0.c;
            r2 = 0;
            if (r1 != 0) goto L_0x0213;
        L_0x000e:
            r1 = r0.getTarget();
            r1 = (defpackage.jfl) r1;
            if (r1 != 0) goto L_0x0018;
        L_0x0016:
            goto L_0x0213;
        L_0x0018:
            r3 = "target ?: return";
            defpackage.akcr.a(r1, r3);
            r0.b();
            r3 = r0.d;
            r4 = "context";
            defpackage.akcr.b(r3, r4);
            r4 = "businessState";
            defpackage.akcr.b(r14, r4);
            r4 = new jfm;
            r5 = r14.e;
            r11 = 1;
            r6 = r5 ^ 1;
            r7 = defpackage.jfk.a(r14);
            r5 = r14.g;
            r8 = defpackage.izd.UNKNOWN;
            r9 = 8;
            if (r5 != r8) goto L_0x0055;
        L_0x003f:
            r5 = r14.b;
            r5 = (java.lang.CharSequence) r5;
            r5 = defpackage.akgb.a(r5);
            r5 = r5 ^ r11;
            if (r5 != 0) goto L_0x0055;
        L_0x004a:
            r5 = r14.d;
            r5 = (java.lang.CharSequence) r5;
            r5 = defpackage.akgb.a(r5);
            r5 = r5 ^ r11;
            if (r5 == 0) goto L_0x005d;
        L_0x0055:
            r5 = defpackage.jfk.a(r14);
            if (r5 != r9) goto L_0x005d;
        L_0x005b:
            r8 = 0;
            goto L_0x005f;
        L_0x005d:
            r8 = 8;
        L_0x005f:
            r5 = r14.b;
            r5 = (java.lang.CharSequence) r5;
            r5 = defpackage.akgb.a(r5);
            r5 = r5 ^ r11;
            r9 = 2131100027; // 0x7f06017b float:1.7812424E38 double:1.052903311E-314;
            if (r5 == 0) goto L_0x007f;
        L_0x006d:
            r5 = new jfn;
            r10 = r14.b;
            r3 = r3.getResources();
            r3 = r3.getColor(r9);
            r5.<init>(r10, r3);
        L_0x007c:
            r9 = r5;
            goto L_0x0103;
        L_0x007f:
            r5 = r14.d;
            r5 = (java.lang.CharSequence) r5;
            r5 = defpackage.akgb.a(r5);
            r5 = r5 ^ r11;
            if (r5 == 0) goto L_0x009a;
        L_0x008a:
            r5 = new jfn;
            r10 = r14.d;
            r3 = r3.getResources();
            r3 = r3.getColor(r9);
            r5.<init>(r10, r3);
            goto L_0x007c;
        L_0x009a:
            r5 = r14.g;
            r9 = defpackage.izd.MEDIUM;
            if (r5 != r9) goto L_0x00c7;
        L_0x00a0:
            r5 = new jfn;
            r9 = 2131888813; // 0x7f120aad float:1.9412272E38 double:1.0532930233E-314;
            r10 = new java.lang.Object[r11];
            r12 = defpackage.abpz.OK_HAND_SIGN;
            r12 = defpackage.abqi.a(r12);
            r10[r2] = r12;
            r9 = r3.getString(r9, r10);
            r10 = "context.getString(R.stri…moji(Emoji.OK_HAND_SIGN))";
            defpackage.akcr.a(r9, r10);
            r3 = r3.getResources();
            r10 = 2131100025; // 0x7f060179 float:1.781242E38 double:1.05290331E-314;
            r3 = r3.getColor(r10);
            r5.<init>(r9, r3);
            goto L_0x007c;
        L_0x00c7:
            r5 = r14.g;
            r9 = defpackage.izd.STRONG;
            if (r5 == r9) goto L_0x00db;
        L_0x00cd:
            r5 = r14.g;
            r9 = defpackage.izd.VERYSTRONG;
            if (r5 != r9) goto L_0x00d4;
        L_0x00d3:
            goto L_0x00db;
        L_0x00d4:
            r3 = new jfn;
            r3.<init>();
            r9 = r3;
            goto L_0x0103;
        L_0x00db:
            r5 = new jfn;
            r9 = 2131888815; // 0x7f120aaf float:1.9412276E38 double:1.053293024E-314;
            r10 = new java.lang.Object[r11];
            r12 = defpackage.abpz.SMILING_FACE_WITH_SUNGLASSES;
            r12 = defpackage.abqi.a(r12);
            r10[r2] = r12;
            r9 = r3.getString(r9, r10);
            r10 = "context.getString(R.stri…NG_FACE_WITH_SUNGLASSES))";
            defpackage.akcr.a(r9, r10);
            r3 = r3.getResources();
            r10 = 2131100023; // 0x7f060177 float:1.7812416E38 double:1.052903309E-314;
            r3 = r3.getColor(r10);
            r5.<init>(r9, r3);
            goto L_0x007c;
        L_0x0103:
            r3 = r14.f;
            if (r3 != 0) goto L_0x0146;
        L_0x0107:
            r3 = r14.e;
            if (r3 == 0) goto L_0x010c;
        L_0x010b:
            goto L_0x0146;
        L_0x010c:
            r3 = r14.g;
            r5 = defpackage.izd.TOO_WEAK;
            if (r3 == r5) goto L_0x0144;
        L_0x0112:
            r3 = r14.g;
            r5 = defpackage.izd.UNKNOWN;
            if (r3 == r5) goto L_0x0144;
        L_0x0118:
            r3 = r14.b;
            r3 = (java.lang.CharSequence) r3;
            r3 = defpackage.akgb.a(r3);
            if (r3 == 0) goto L_0x0144;
        L_0x0122:
            r3 = r14.d;
            r3 = (java.lang.CharSequence) r3;
            r3 = defpackage.akgb.a(r3);
            if (r3 == 0) goto L_0x0144;
        L_0x012c:
            r3 = r14.a;
            r3 = (java.lang.CharSequence) r3;
            r3 = defpackage.akgb.a(r3);
            r3 = r3 ^ r11;
            if (r3 == 0) goto L_0x0144;
        L_0x0137:
            r3 = r14.c;
            r3 = (java.lang.CharSequence) r3;
            r3 = defpackage.akgb.a(r3);
            r3 = r3 ^ r11;
            if (r3 == 0) goto L_0x0144;
        L_0x0142:
            r10 = 1;
            goto L_0x0148;
        L_0x0144:
            r10 = 0;
            goto L_0x0148;
        L_0x0146:
            r3 = 2;
            r10 = 2;
        L_0x0148:
            r5 = r4;
            r5.<init>(r6, r7, r8, r9, r10);
            r3 = r1.a();
            r5 = r4.a;
            r3.setEnabled(r5);
            r3 = r1.b();
            r5 = r4.a;
            r3.setEnabled(r5);
            r3 = r14.h;
            if (r3 == 0) goto L_0x016b;
        L_0x0162:
            r3 = r14.f;
            if (r3 != 0) goto L_0x016b;
        L_0x0166:
            r3 = r14.e;
            if (r3 != 0) goto L_0x016b;
        L_0x016a:
            goto L_0x016c;
        L_0x016b:
            r11 = 0;
        L_0x016c:
            if (r11 == 0) goto L_0x018b;
        L_0x016e:
            r3 = r14.g;
            r5 = defpackage.izd.UNKNOWN;
            if (r3 == r5) goto L_0x0182;
        L_0x0174:
            r3 = r14.g;
            r5 = defpackage.izd.TOO_WEAK;
            if (r3 != r5) goto L_0x017b;
        L_0x017a:
            goto L_0x0182;
        L_0x017b:
            r3 = r0.d;
            r5 = r1.b();
            goto L_0x0188;
        L_0x0182:
            r3 = r0.d;
            r5 = r1.a();
        L_0x0188:
            defpackage.jrl.a(r3, r5);
        L_0x018b:
            r3 = r1.g();
            r5 = r4.e;
            r3.setState(r5);
            r3 = r4.b;
            r3 = java.lang.Integer.valueOf(r3);
            r5 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$h;
            r6 = r1.c();
            r5.<init>(r6);
            r5 = (defpackage.akbk) r5;
            r6 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$i;
            r7 = r1.c();
            r6.<init>(r7);
            r6 = (defpackage.akbl) r6;
            defpackage.jrl.a(r3, r5, r6);
            r3 = r4.c;
            r3 = java.lang.Integer.valueOf(r3);
            r5 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$j;
            r6 = r1.d();
            r5.<init>(r6);
            r5 = (defpackage.akbk) r5;
            r6 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$k;
            r7 = r1.d();
            r6.<init>(r7);
            r6 = (defpackage.akbl) r6;
            defpackage.jrl.a(r3, r5, r6);
            r3 = r4.d;
            r3 = r3.a;
            r5 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$l;
            r6 = r1.f();
            r5.<init>(r6);
            r5 = (defpackage.akbk) r5;
            r6 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$m;
            r7 = r1.f();
            r6.<init>(r7);
            r6 = (defpackage.akbl) r6;
            defpackage.jrl.a(r3, r5, r6);
            r3 = r4.d;
            r3 = r3.b;
            r3 = android.content.res.ColorStateList.valueOf(r3);
            r4 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$n;
            r5 = r1.f();
            r4.<init>(r5);
            r4 = (defpackage.akbk) r4;
            r5 = new com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$o;
            r1 = r1.f();
            r5.<init>(r1);
            r5 = (defpackage.akbl) r5;
            defpackage.jrl.a(r3, r4, r5);
            r0.a();
        L_0x0213:
            r14 = r14.h;
            if (r14 == 0) goto L_0x021e;
        L_0x0217:
            r14 = r13.a;
            r14 = r14.g;
            r14.a(r2);
        L_0x021e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginPresenter$g.accept(java.lang.Object):void");
        }
    }

    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ ResetPasswordPreLoginPresenter a;

        f(ResetPasswordPreLoginPresenter resetPasswordPreLoginPresenter) {
            this.a = resetPasswordPreLoginPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((zke) this.a.g.f.get()).a(new jau());
            return ajxw.a;
        }
    }

    static final class h extends akcq implements akbk<Integer> {
        h(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class i extends akcq implements akbl<Integer, ajxw> {
        i(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class j extends akcq implements akbk<Integer> {
        j(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class k extends akcq implements akbl<Integer, ajxw> {
        k(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class l extends akcq implements akbk<CharSequence> {
        l(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getText()Ljava/lang/CharSequence;";
        }

        public final /* synthetic */ Object invoke() {
            return ((TextView) this.receiver).getText();
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

    static final class n extends akcq implements akbk<ColorStateList> {
        n(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getTextColors";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getTextColors()Landroid/content/res/ColorStateList;";
        }

        public final /* synthetic */ Object invoke() {
            return ((TextView) this.receiver).getTextColors();
        }
    }

    static final class o extends akcq implements akbl<ColorStateList, ajxw> {
        o(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setTextColor";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setTextColor(Landroid/content/res/ColorStateList;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setTextColor((ColorStateList) obj);
            return ajxw.a;
        }
    }

    public ResetPasswordPreLoginPresenter(Context context, aipn<achb<zjm, zjk>> aipn, aipn<jbk> aipn2, jfh jfh, aipn<jbw> aipn3, aipn<isf> aipn4, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(aipn, "navigationHost");
        akcr.b(aipn2, LocalMessageActionModel.ANALYTICS);
        akcr.b(jfh, "processor");
        akcr.b(aipn3, "store");
        akcr.b(aipn4, "stateTransitionService");
        akcr.b(zgb, "schedulersProvider");
        this.d = context;
        this.e = aipn;
        this.f = aipn2;
        this.g = jfh;
        this.n = aipn3;
        this.h = aipn4;
        String str = "";
        this.a = str;
        this.b = str;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        jfl jfl = (jfl) getTarget();
        if (jfl != null) {
            jfl.a().setOnFocusChangeListener(this.l);
            jfl.a().addTextChangedListener(this.j);
            jfl.b().addTextChangedListener(this.k);
            jfl.g().setOnClickListener(this.m);
        }
    }

    /* renamed from: a */
    public final void takeTarget(jfl jfl) {
        akcr.b(jfl, "target");
        super.takeTarget(jfl);
        jfl.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        jfl jfl = (jfl) getTarget();
        if (jfl != null) {
            jfl.a().setOnFocusChangeListener(null);
            jfl.a().removeTextChangedListener(this.j);
            jfl.b().removeTextChangedListener(this.k);
            jfl.g().setOnClickListener(null);
        }
    }

    public final void dropTarget() {
        Object obj = (jfl) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        zln.bindTo$default(this, ((jbw) this.n.get()).a().a((ajdw) this.i.l()).f((ajfb) new d(this)), this, null, null, 6, null);
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.g.c.dispose();
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.c = true;
        b();
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.c = false;
        a();
        zln.bindTo$default(this, this.g.d.a((ajdw) this.i.l()).f((ajfb) new g(this)), this, null, null, 6, null);
    }
}

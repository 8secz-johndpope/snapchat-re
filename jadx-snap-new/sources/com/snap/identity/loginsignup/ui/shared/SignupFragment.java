package com.snap.identity.loginsignup.ui.shared;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.aaua;
import defpackage.aavm;
import defpackage.aipn;
import defpackage.akcr;
import defpackage.jbk;
import defpackage.jbq;

public abstract class SignupFragment extends LoginSignupFragment {
    private jbq a;
    public aipn<jbk> b;

    /* JADX WARNING: Missing block: B:7:0x005c, code skipped:
            r6.a(r0, null, null);
     */
    /* JADX WARNING: Missing block: B:8:0x005f, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:46:0x02d2, code skipped:
            return;
     */
    public void a_(defpackage.achi<defpackage.zjm, defpackage.zjk> r6) {
        /*
        r5 = this;
        r0 = "navigationEvent";
        defpackage.akcr.b(r6, r0);
        super.a_(r6);
        r6 = r5.a;
        if (r6 != 0) goto L_0x0011;
    L_0x000c:
        r0 = "signupPageAnalyticsMixin";
        defpackage.akcr.a(r0);
    L_0x0011:
        r0 = r6.a;
        r1 = defpackage.jbr.a;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 0;
        switch(r0) {
            case 1: goto L_0x02c6;
            case 2: goto L_0x027c;
            case 3: goto L_0x0210;
            case 4: goto L_0x01f6;
            case 5: goto L_0x01b7;
            case 6: goto L_0x0168;
            case 7: goto L_0x012c;
            case 8: goto L_0x00f0;
            case 9: goto L_0x00a1;
            case 10: goto L_0x0060;
            case 11: goto L_0x0052;
            case 12: goto L_0x0021;
            default: goto L_0x001f;
        };
    L_0x001f:
        goto L_0x02d2;
    L_0x0021:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = new aawf;
        r0.<init>();
        r2 = defpackage.aaxp.V2;
        r0.a(r2);
        r2 = r6.g;
        r2 = r2.get();
        r2 = (defpackage.isc) r2;
        r2 = r2.a();
        r0.a(r2);
        r2 = r6.a();
        r0 = (defpackage.aajt) r0;
        r2.a(r0);
        r0 = defpackage.aaua.REGISTRATION_USER_FIND_FRIENDS_SNAPCHATTERS;
        r6.a(r0, r1, r1);
        goto L_0x02d2;
    L_0x0052:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_FIND_FRIENDS_SPLASH;
    L_0x005c:
        r6.a(r0, r1, r1);
        return;
    L_0x0060:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_CAPTCHA;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x00a0;
    L_0x0076:
        r2 = new aawa;
        r2.<init>();
        r3 = java.lang.Boolean.FALSE;
        r2.a(r3);
        r3 = defpackage.aaxp.V2;
        r2.a(r3);
        r3 = r6.g;
        r3 = r3.get();
        r3 = (defpackage.isc) r3;
        r3 = r3.a();
        r2.a(r3);
        r3 = r6.a();
        r2 = (defpackage.aajt) r2;
        r3.a(r2);
        r6.a(r0, r1, r1);
    L_0x00a0:
        return;
    L_0x00a1:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_SIGNUP_EMAIL;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x00ef;
    L_0x00b7:
        r3 = new aaxe;
        r3.<init>();
        r4 = java.lang.Boolean.FALSE;
        r3.b(r4);
        r3.a(r2);
        r2 = defpackage.aaxp.V2;
        r3.a(r2);
        r2 = r6.m();
        r2 = java.lang.Boolean.valueOf(r2);
        r3.a(r2);
        r2 = r6.g;
        r2 = r2.get();
        r2 = (defpackage.isc) r2;
        r2 = r2.a();
        r3.a(r2);
        r2 = r6.a();
        r3 = (defpackage.aajt) r3;
        r2.a(r3);
        r6.a(r0, r1, r1);
    L_0x00ef:
        return;
    L_0x00f0:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_VERIFY_PHONE;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x012b;
    L_0x0106:
        r2 = new aawz;
        r2.<init>();
        r3 = defpackage.aaxp.V2;
        r2.a(r3);
        r3 = r6.g;
        r3 = r3.get();
        r3 = (defpackage.isc) r3;
        r3 = r3.a();
        r2.a(r3);
        r3 = r6.a();
        r2 = (defpackage.aajt) r2;
        r3.a(r2);
        r6.a(r0, r1, r1);
    L_0x012b:
        return;
    L_0x012c:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_SET_PHONE;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x0167;
    L_0x0142:
        r2 = new aaww;
        r2.<init>();
        r3 = defpackage.aaxp.V2;
        r2.a(r3);
        r3 = r6.g;
        r3 = r3.get();
        r3 = (defpackage.isc) r3;
        r3 = r3.a();
        r2.a(r3);
        r3 = r6.a();
        r2 = (defpackage.aajt) r2;
        r3.a(r2);
        r6.a(r0, r1, r1);
    L_0x0167:
        return;
    L_0x0168:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_SIGNUP_PASSWORD;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x01b6;
    L_0x017e:
        r3 = new aaxg;
        r3.<init>();
        r3.a(r2);
        r2 = java.lang.Boolean.FALSE;
        r3.b(r2);
        r2 = defpackage.aaxp.V2;
        r3.a(r2);
        r2 = r6.m();
        r2 = java.lang.Boolean.valueOf(r2);
        r3.a(r2);
        r2 = r6.g;
        r2 = r2.get();
        r2 = (defpackage.isc) r2;
        r2 = r2.a();
        r3.a(r2);
        r2 = r6.a();
        r3 = (defpackage.aajt) r3;
        r2.a(r3);
        r6.a(r0, r1, r1);
    L_0x01b6:
        return;
    L_0x01b7:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_SIGNUP_USERNAME;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x01f5;
    L_0x01cd:
        r3 = new aaxm;
        r3.<init>();
        r3.a(r2);
        r2 = defpackage.aaxp.V2;
        r3.a(r2);
        r2 = r6.g;
        r2 = r2.get();
        r2 = (defpackage.isc) r2;
        r2 = r2.a();
        r3.a(r2);
        r2 = r6.a();
        r3 = (defpackage.aajt) r3;
        r2.a(r3);
        r6.a(r0, r1, r1);
    L_0x01f5:
        return;
    L_0x01f6:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_SIGNUP_SUGGEST_USERNAME;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x020f;
    L_0x020c:
        r6.a(r0, r1, r1);
    L_0x020f:
        return;
    L_0x0210:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_SIGNUP_BIRTHDAY;
        r2 = r6.b();
        r2 = r2.c();
        r3 = r2.H;
        if (r0 == r3) goto L_0x027b;
    L_0x0226:
        r4 = new aaxd;
        r4.<init>();
        r4.a(r3);
        r3 = r2.o;
        r3 = (java.lang.CharSequence) r3;
        r3 = android.text.TextUtils.isEmpty(r3);
        r3 = r3 ^ 1;
        r3 = java.lang.Boolean.valueOf(r3);
        r4.b(r3);
        r2 = r2.p;
        r2 = (java.lang.CharSequence) r2;
        r2 = android.text.TextUtils.isEmpty(r2);
        r2 = r2 ^ 1;
        r2 = java.lang.Boolean.valueOf(r2);
        r4.c(r2);
        r2 = defpackage.aaxp.V2;
        r4.a(r2);
        r2 = r6.m();
        r2 = java.lang.Boolean.valueOf(r2);
        r4.a(r2);
        r2 = r6.g;
        r2 = r2.get();
        r2 = (defpackage.isc) r2;
        r2 = r2.a();
        r4.a(r2);
        r2 = r6.a();
        r4 = (defpackage.aajt) r4;
        r2.a(r4);
        r6.a(r0, r1, r1);
    L_0x027b:
        return;
    L_0x027c:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_USER_DISPLAY_NAME;
        r2 = r6.b();
        r2 = r2.c();
        r2 = r2.H;
        if (r0 == r2) goto L_0x02c5;
    L_0x0292:
        r3 = new aawk;
        r3.<init>();
        r3.a(r2);
        r2 = defpackage.aaxp.V2;
        r3.a(r2);
        r2 = r6.m();
        r2 = java.lang.Boolean.valueOf(r2);
        r3.a(r2);
        r2 = r6.g;
        r2 = r2.get();
        r2 = (defpackage.isc) r2;
        r2 = r2.a();
        r3.a(r2);
        r2 = r6.a();
        r3 = (defpackage.aajt) r3;
        r2.a(r3);
        r6.a(r0, r1, r1);
    L_0x02c5:
        return;
    L_0x02c6:
        r6 = r6.b;
        r6 = r6.get();
        r6 = (defpackage.jbk) r6;
        r0 = defpackage.aaua.REGISTRATION_PERMISSIONS;
        goto L_0x005c;
    L_0x02d2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.shared.SignupFragment.a_(achi):void");
    }

    public abstract aaua f();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public void onStop() {
        super.onStop();
        jbq jbq = this.a;
        if (jbq == null) {
            akcr.a("signupPageAnalyticsMixin");
        }
        akcr.b(this, Event.FRAGMENT);
        if (isVisible()) {
            FragmentActivity activity = getActivity();
            if (activity != null && !activity.isFinishing()) {
                ((jbk) jbq.b.get()).a(aavm.INTERRUPT, jbq.a);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        aaua f = f();
        aipn aipn = this.b;
        if (aipn == null) {
            akcr.a(LocalMessageActionModel.ANALYTICS);
        }
        this.a = new jbq(f, aipn);
    }
}

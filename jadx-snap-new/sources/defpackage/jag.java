package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import com.brightcove.player.event.Event;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.identity.loginsignup.RegistrationReengagementNotificationMushroomReceiver;
import com.snap.identity.loginsignup.ui.pages.birthday.BirthdayFragment;
import com.snap.identity.loginsignup.ui.pages.captcha.CaptchaInSignupFragment;
import com.snap.identity.loginsignup.ui.pages.displayname.DisplayNameFragment;
import com.snap.identity.loginsignup.ui.pages.email.EmailFragment;
import com.snap.identity.loginsignup.ui.pages.findfriends.FindFriendsFragment;
import com.snap.identity.loginsignup.ui.pages.findfriendssplash.FindFriendsSplashFragment;
import com.snap.identity.loginsignup.ui.pages.forgotpassword.resetting.ResetPasswordPreLoginFragment;
import com.snap.identity.loginsignup.ui.pages.forgotpassword.setphone.ForgotPasswordSetPhoneFragment;
import com.snap.identity.loginsignup.ui.pages.forgotpassword.success.ForgotPasswordResetSuccessFragment;
import com.snap.identity.loginsignup.ui.pages.forgotpassword.verifyphone.ForgotPasswordVerifyPhoneFragment;
import com.snap.identity.loginsignup.ui.pages.landing.LandingFragment;
import com.snap.identity.loginsignup.ui.pages.odlv.LoginOdlvLandingFragment;
import com.snap.identity.loginsignup.ui.pages.odlv.LoginOdlvVerifyingFragment;
import com.snap.identity.loginsignup.ui.pages.onetaplogin.OneTapLoginFragment;
import com.snap.identity.loginsignup.ui.pages.password.PasswordFragment;
import com.snap.identity.loginsignup.ui.pages.permissions.PermissionsFragment;
import com.snap.identity.loginsignup.ui.pages.setphone.SetPhoneFragment;
import com.snap.identity.loginsignup.ui.pages.twofa.LoginTwoFAFragment;
import com.snap.identity.loginsignup.ui.pages.username.UsernameFragment;
import com.snap.identity.loginsignup.ui.pages.usernamesuggestion.UsernameSuggestionFragment;
import com.snap.identity.loginsignup.ui.pages.verifyphone.VerifyPhoneFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.aert.b;
import defpackage.jbk.c;
import defpackage.jbk.d;
import defpackage.jek.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.ThreadMode;
import org.jcodec.containers.mp4.boxes.Box;

/* renamed from: jag */
public final class jag implements ajej {
    private final aipn<iru> A;
    private final Set<Object> B;
    private final Set<Object> C;
    private final Set<jbs> D;
    private final ajwy<a> E;
    private final aipn<jed> F;
    private final ifs G;
    private final aipn<isc> H;
    public final ajwr<jbu> a;
    final ajei b = new ajei();
    final akek<ajxw> c = new a((jai) this.e.get());
    public final zfw d;
    aipn<jai> e;
    aipn<achb<zjm, zjk>> f;
    final aipn<Context> g;
    public aipn<jbw> h;
    final aipn<ira> i;
    final aipn<jdu> j;
    final aipn<gpb> k;
    final tnj l;
    final aipn<jbk> m;
    final aipn<iqe> n;
    final aipn<jea> o;
    final jbp p;
    final aipn<jbj> q;
    final aipn<ftl> r;
    final Set<Object> s;
    final aipn<isf> t;
    final aipn<abna> u;
    public final aipn<jig> v;
    private final ajxe w;
    private final ajxe x;
    private ajdx<String> y;
    private final aipn<jhv> z;

    /* renamed from: jag$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ jag a;
        private /* synthetic */ iql b;

        e(jag jag, iql iql) {
            this.a = jag;
            this.b = iql;
        }

        /* JADX WARNING: Missing block: B:5:0x0032, code skipped:
            if (r1 == null) goto L_0x0060;
     */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r3 = this;
            r0 = r3.a;
            r0 = r0.r;
            r0 = r0.get();
            r0 = (defpackage.ftl) r0;
            r1 = defpackage.jdw.PREFERRED_VERIFICATION_METHOD;
            r1 = (defpackage.fth) r1;
            r0 = r0.j(r1);
            r1 = r3.b;
            r1 = r1.b;
            r2 = "authResult.response";
            defpackage.akcr.a(r1, r2);
            r1 = r1.c();
            r2 = "tweak";
            defpackage.akcr.a(r0, r2);
            r2 = r0;
            r2 = (java.lang.CharSequence) r2;
            r2 = r2.length();
            if (r2 != 0) goto L_0x002f;
        L_0x002d:
            r2 = 1;
            goto L_0x0030;
        L_0x002f:
            r2 = 0;
        L_0x0030:
            if (r2 == 0) goto L_0x0035;
        L_0x0032:
            if (r1 != 0) goto L_0x0062;
        L_0x0034:
            goto L_0x0060;
        L_0x0035:
            if (r0 == 0) goto L_0x0063;
        L_0x0037:
            r0 = r0.toUpperCase();
            r1 = "(this as java.lang.String).toUpperCase()";
            defpackage.akcr.a(r0, r1);
            r1 = r0.hashCode();
            r2 = 66081660; // 0x3f0537c float:1.4125099E-36 double:3.2648678E-316;
            if (r1 == r2) goto L_0x005a;
        L_0x0049:
            r2 = 76105038; // 0x489454e float:3.227219E-36 double:3.76008848E-316;
            if (r1 == r2) goto L_0x004f;
        L_0x004e:
            goto L_0x0060;
        L_0x004f:
            r1 = "PHONE";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0060;
        L_0x0057:
            r0 = defpackage.aert.b.PHONE_FIRST_EMAIL_BYPASSED;
            return r0;
        L_0x005a:
            r1 = "EMAIL";
            r0 = r0.equals(r1);
        L_0x0060:
            r1 = defpackage.aert.b.EMAIL_FIRST_PHONE_SKIPPABLE;
        L_0x0062:
            return r1;
        L_0x0063:
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type java.lang.String";
            r0.<init>(r1);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jag$e.call():java.lang.Object");
        }
    }

    /* renamed from: jag$aa */
    static final class aa<T> implements ajfb<iql> {
        private /* synthetic */ jag a;

        aa(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (iql) obj;
            jag jag = this.a;
            akcr.a(obj, "authResult");
            ((jea) jag.o.get()).c();
            jbk jbk = (jbk) jag.m.get();
            Object obj2 = obj.c;
            akcr.a(obj2, "authResult.networkLatency");
            jbk.a(obj2.longValue(), true, aavh.NONE);
            int i = obj.a;
            if (i != 0) {
                i = jah.a[i - 1];
                if (i != 1) {
                    String str = "authResult.response.username";
                    if (i == 2) {
                        obj2 = obj.b.w;
                        akcr.a(obj2, str);
                        Object obj3 = obj.b.Q;
                        akcr.a(obj3, "authResult.response.odlvPreAuthToken");
                        jag.onOdlvRequired(new jao(obj2, obj3, obj.b.R, obj.b.S));
                    } else if (i != 3) {
                        if (i == 4) {
                            if (!((jbw) jag.h.get()).c().w) {
                                ((jbw) jag.h.get()).a(true);
                                jbk = (jbk) jag.m.get();
                                aawq aawq = new aawq();
                                aawq.a(aaxp.V2);
                                aawq.a(Long.valueOf(jbk.b().c().v));
                                aawq.a(jbk.c().a().g);
                                aawq.c(Boolean.FALSE);
                                aawq.b(Boolean.FALSE);
                                aawq.a(Boolean.FALSE);
                                aawq.b(((isc) jbk.g.get()).a());
                                jbk.a().a(aawq);
                                jbk = (jbk) jag.m.get();
                                aawj aawj = new aawj();
                                aawj.d(Boolean.valueOf(jbk.m()));
                                aawj.b(jbk.b().c().n);
                                aawj.a(((isc) jbk.g.get()).a());
                                jbk.a().a(aawj);
                                ((ilv) jbk.f.get()).c(iok.SIGNUP_CREATE_ACCOUNT.a("is_og", false).a("new_device", jbk.m() ^ 1), 1);
                                ((isf) jag.t.get()).a(aaoo.ACCOUNT_CREATED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
                            }
                            jag.b.a(ajdx.c((Callable) new e(jag, obj)).b((ajdw) jag.d.h()).a((ajdw) jag.d.l()).c((ajfb) new f(jag)).c());
                        }
                    } else {
                        String str2 = obj.b.w;
                        akcr.a((Object) str2, str);
                        obj2 = obj.b.B;
                        akcr.a(obj2, "authResult.response.isSmsTwoFaEnabled");
                        boolean booleanValue = obj2.booleanValue();
                        Object obj4 = obj.b.y;
                        akcr.a(obj4, "authResult.response.phoneNumber");
                        obj2 = obj.b.C;
                        akcr.a(obj2, "authResult.response.isOtpTwoFaEnabled");
                        boolean booleanValue2 = obj2.booleanValue();
                        String str3 = obj.b.z;
                        akcr.a((Object) str3, "authResult.response.preAuthToken");
                        jag.onTwoFARequired(new jbd(str2, booleanValue, booleanValue2, str3, obj4));
                    }
                }
            }
        }
    }

    /* renamed from: jag$ab */
    static final class ab<T> implements ajfb<Throwable> {
        private /* synthetic */ jag a;

        ab(jag jag) {
            this.a = jag;
        }

        /* JADX WARNING: Missing block: B:5:0x0027, code skipped:
            if (r7 == null) goto L_0x0029;
     */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
            r6 = this;
            r7 = (java.lang.Throwable) r7;
            r0 = "thrown";
            defpackage.akcr.b(r7, r0);
            r0 = r7 instanceof defpackage.irg;
            r1 = 0;
            r2 = -1;
            if (r0 == 0) goto L_0x0108;
        L_0x000e:
            r0 = r6.a;
            r7 = (defpackage.irg) r7;
            r4 = r0.m;
            r4 = r4.get();
            r4 = (defpackage.jbk) r4;
            r4.f();
            r4 = r7.getMessage();
            r7 = r7.a;
            if (r7 == 0) goto L_0x0029;
        L_0x0025:
            r7 = r7.q;
            if (r7 != 0) goto L_0x002b;
        L_0x0029:
            r7 = "";
        L_0x002b:
            r7 = defpackage.aert.a.valueOf(r7);	 Catch:{ IllegalArgumentException -> 0x0030 }
            goto L_0x0032;
        L_0x0030:
            r7 = defpackage.aert.a.UNRECOGNIZED_VALUE;
        L_0x0032:
            r5 = defpackage.jah.b;
            r7 = r7.ordinal();
            r7 = r5[r7];
            r5 = 1;
            if (r7 == r5) goto L_0x00e2;
        L_0x003d:
            r5 = 2;
            if (r7 == r5) goto L_0x00bc;
        L_0x0040:
            r5 = 3;
            if (r7 == r5) goto L_0x0096;
        L_0x0043:
            r5 = 4;
            if (r7 == r5) goto L_0x0070;
        L_0x0046:
            r5 = 5;
            if (r7 == r5) goto L_0x004a;
        L_0x0049:
            goto L_0x006f;
        L_0x004a:
            r7 = r0.h;
            r7 = r7.get();
            r7 = (defpackage.jbw) r7;
            r7.j(r4);
            r7 = r0.e;
            r7 = r7.get();
            r7 = (defpackage.jai) r7;
            r4 = defpackage.jbv.m;
            r7.a(r4);
            r7 = r0.m;
            r7 = r7.get();
            r7 = (defpackage.jbk) r7;
            r0 = defpackage.aavh.NONE;
            r7.a(r2, r1, r0);
        L_0x006f:
            return;
        L_0x0070:
            r7 = r0.h;
            r7 = r7.get();
            r7 = (defpackage.jbw) r7;
            r7.j(r4);
            r7 = r0.e;
            r7 = r7.get();
            r7 = (defpackage.jai) r7;
            r4 = defpackage.jbv.m;
            r7.a(r4);
            r7 = r0.m;
            r7 = r7.get();
            r7 = (defpackage.jbk) r7;
            r0 = defpackage.aavh.PASSWORD;
            r7.a(r2, r1, r0);
            return;
        L_0x0096:
            r7 = r0.h;
            r7 = r7.get();
            r7 = (defpackage.jbw) r7;
            r7.i(r4);
            r7 = r0.e;
            r7 = r7.get();
            r7 = (defpackage.jai) r7;
            r4 = defpackage.jbv.k;
            r7.a(r4);
            r7 = r0.m;
            r7 = r7.get();
            r7 = (defpackage.jbk) r7;
            r0 = defpackage.aavh.USERNAME;
            r7.a(r2, r1, r0);
            return;
        L_0x00bc:
            r7 = r0.h;
            r7 = r7.get();
            r7 = (defpackage.jbw) r7;
            r7.h(r4);
            r7 = r0.e;
            r7 = r7.get();
            r7 = (defpackage.jai) r7;
            r4 = defpackage.jbv.j;
            r7.a(r4);
            r7 = r0.m;
            r7 = r7.get();
            r7 = (defpackage.jbk) r7;
            r0 = defpackage.aavh.BIRTHDAY;
            r7.a(r2, r1, r0);
            return;
        L_0x00e2:
            r7 = r0.h;
            r7 = r7.get();
            r7 = (defpackage.jbw) r7;
            r7.g(r4);
            r7 = r0.e;
            r7 = r7.get();
            r7 = (defpackage.jai) r7;
            r4 = defpackage.jbv.h;
            r7.a(r4);
            r7 = r0.m;
            r7 = r7.get();
            r7 = (defpackage.jbk) r7;
            r0 = defpackage.aavh.DISPLY_NAME;
            r7.a(r2, r1, r0);
            return;
        L_0x0108:
            r7 = r6.a;
            r0 = r7.m;
            r0 = r0.get();
            r0 = (defpackage.jbk) r0;
            r0.f();
            r0 = r7.g;
            r0 = r0.get();
            r0 = (android.content.Context) r0;
            r4 = 2131887036; // 0x7f1203bc float:1.9408668E38 double:1.0532921453E-314;
            r0 = r0.getString(r4);
            r4 = r7.m;
            r4 = r4.get();
            r4 = (defpackage.jbk) r4;
            r5 = defpackage.aavh.NONE;
            r4.a(r2, r1, r5);
            r7 = r7.h;
            r7 = r7.get();
            r7 = (defpackage.jbw) r7;
            r1 = "message";
            defpackage.akcr.a(r0, r1);
            r7.j(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jag$ab.accept(java.lang.Object):void");
        }
    }

    /* renamed from: jag$b */
    static final class b<T> implements ajfb<Boolean> {
        final /* synthetic */ jag a;

        /* renamed from: jag$b$1 */
        static final class 1 implements ajev {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final void run() {
                ((akbw) this.a.a.c).invoke(jbv.q, new FindFriendsSplashFragment());
            }
        }

        /* renamed from: jag$b$2 */
        static final class 2<T> implements ajfb<Throwable> {
            private /* synthetic */ b a;

            2(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                ((akbw) this.a.a.c).invoke(jbv.q, new FindFriendsSplashFragment());
            }
        }

        b(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "removeCaptcha");
            if (obj.booleanValue()) {
                ajej a = this.a.a().b((ajdw) this.a.d.h()).a((ajdw) this.a.d.l()).a((ajev) new 1(this), (ajfb) new 2(this));
                akcr.a((Object) a, "onSignupHumanVerified()\n…                       })");
                ajvv.a(a, this.a.b);
                return;
            }
            ((akbw) this.a.c).invoke(jbv.s, new CaptchaInSignupFragment());
        }
    }

    /* renamed from: jag$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ jag a;

        c(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((akbw) this.a.c).invoke(jbv.s, new CaptchaInSignupFragment());
        }
    }

    /* renamed from: jag$d */
    static final class d implements ajev {
        private /* synthetic */ jag a;

        d(jag jag) {
            this.a = jag;
        }

        public final void run() {
            this.a.p.b();
            jbk jbk = (jbk) this.a.m.get();
            aawd aawd = new aawd();
            aawd.a(Boolean.TRUE);
            aawd.a(aaxp.V2);
            aawd.a(((isc) jbk.g.get()).a());
            jbk.a().a(aawd);
            ProcessPhoenix.a((Context) this.a.g.get());
        }
    }

    /* renamed from: jag$f */
    static final class f<T> implements ajfb<b> {
        private /* synthetic */ jag a;

        f(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            jag jag = this.a;
            if (bVar == null) {
                bVar = b.EMAIL_FIRST_PHONE_SKIPPABLE;
            }
            jag.onUserVerificationNeeded(new jbe(false, bVar));
        }
    }

    /* renamed from: jag$g */
    static final class g implements ajdb {
        private /* synthetic */ jag a;
        private /* synthetic */ jbu b;

        g(jag jag, jbu jbu) {
            this.a = jag;
            this.b = jbu;
        }

        public final void a(ajcz ajcz) {
            akcr.b(ajcz, "it");
            ((jas) this.a.w.b()).a(RegistrationReengagementNotificationMushroomReceiver.class);
            Object a = gr.a((Context) this.a.g.get());
            akcr.a(a, "NotificationManagerCompat.from(context.get())");
            try {
                a.a();
            } catch (SecurityException unused) {
            }
            ((jbw) this.a.h.get()).k();
            this.a.a.b_(this.b);
        }
    }

    /* renamed from: jag$h */
    static final class h<T> implements ajfb<Boolean> {
        private /* synthetic */ jag a;

        h(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            akbw akbw;
            Object obj2;
            Object landingFragment;
            obj = (Boolean) obj;
            akcr.a(obj, "empty");
            if (obj.booleanValue()) {
                akbw = (akbw) this.a.c;
                obj2 = jbv.b;
                landingFragment = new LandingFragment();
            } else {
                akbw = (akbw) this.a.c;
                obj2 = jbv.d;
                landingFragment = new OneTapLoginFragment();
            }
            akbw.invoke(obj2, landingFragment);
        }
    }

    /* renamed from: jag$i */
    static final class i implements ajev {
        private /* synthetic */ jag a;
        private /* synthetic */ jav b;

        i(jag jag, jav jav) {
            this.a = jag;
            this.b = jav;
        }

        public final void run() {
            if (this.b.a) {
                ((akbw) this.a.c).invoke(jbv.q, new FindFriendsSplashFragment());
            } else {
                this.a.b();
            }
        }
    }

    /* renamed from: jag$j */
    static final class j<T> implements ajfb<Boolean> {
        private /* synthetic */ jag a;

        j(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "isSearchable");
            if (obj.booleanValue()) {
                jbk jbk = (jbk) this.a.m.get();
                jeb c = jbk.b().c();
                if (!akgb.a(c.n)) {
                    aaxc aaxc = new aaxc();
                    aaxc.b(c.n);
                    aaxc.d(Boolean.valueOf(jbk.m()));
                    aaxc.a(Boolean.TRUE);
                    aaxc.a(((isc) jbk.g.get()).a());
                    jbk.a().a(aaxc);
                    ((ilv) jbk.f.get()).c(iok.SIGNUP_GRANT_SEARCHABILITY.a("is_og", false).a("new_device", jbk.m() ^ 1), 1);
                }
            }
        }
    }

    /* renamed from: jag$k */
    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jag$l */
    static final class l implements ajev {
        private /* synthetic */ jag a;

        l(jag jag) {
            this.a = jag;
        }

        public final void run() {
            ((isf) this.a.t.get()).a(aaoo.SIGNUP_VERIFY_PHONE_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        }
    }

    /* renamed from: jag$m */
    static final class m implements ajev {
        private /* synthetic */ jag a;
        private /* synthetic */ jax b;

        m(jag jag, jax jax) {
            this.a = jag;
            this.b = jax;
        }

        public final void run() {
            ((iqe) this.a.n.get()).a(false);
            jbk jbk = (jbk) this.a.m.get();
            aawy aawy = new aawy();
            aawy.a(aaxp.V2);
            aawy.a(((isc) jbk.g.get()).a());
            jbk.a().a(aawy);
            jbk = (jbk) this.a.m.get();
            aaxn aaxn = new aaxn();
            aaxn.d(Boolean.valueOf(jbk.m()));
            aaxn.b(jbk.b().c().n);
            aaxn.a(((isc) jbk.g.get()).a());
            jbk.a().a(aaxn);
            ((ilv) jbk.f.get()).c(iok.SIGNUP_PHONE_VERIFIED.a("is_og", false).a("new_device", jbk.m() ^ 1), 1);
            this.a.l.b().a((fth) jic.INAPP_COUNTRY_CODE, this.b.b);
            ((jbw) this.a.h.get()).e();
            ((akbw) this.a.c).invoke(jbv.q, new FindFriendsSplashFragment());
        }
    }

    /* renamed from: jag$n */
    static final class n<T> implements ajfb<Throwable> {
        public static final n a = new n();

        n() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jag$o */
    static final class o<T> implements ajfl<Long> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "waitTime");
            return l.longValue() > 0;
        }
    }

    /* renamed from: jag$p */
    static final class p<T> implements ajfb<Long> {
        private /* synthetic */ jag a;

        p(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            long longValue = ((Number) obj).longValue();
            jas a = ((jas) this.a.w.b());
            Class cls = RegistrationReengagementNotificationMushroomReceiver.class;
            akcr.b(cls, "receiverClass");
            Object instance = Calendar.getInstance();
            akcr.a(instance, "Calendar.getInstance()");
            akcr.b(instance, "rightNow");
            if (longValue == jat.a) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5), instance.get(11) + 4, instance.get(12), instance.get(13));
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5), 18, 0, 0);
                longValue = gregorianCalendar.before(gregorianCalendar2) ? gregorianCalendar2.getTimeInMillis() : (gregorianCalendar.after(gregorianCalendar2) && gregorianCalendar.before(new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5), 23, 59, 59))) ? gregorianCalendar.getTimeInMillis() : new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5) + 1, 18, 0, 0).getTimeInMillis();
                longValue -= instance.getTimeInMillis();
            }
            try {
                PendingIntent broadcast = PendingIntent.getBroadcast(a.a, 1, new Intent(a.a, cls), Box.MAX_BOX_SIZE);
                long elapsedRealtime = SystemClock.elapsedRealtime() + longValue;
                Object systemService = a.a.getSystemService("alarm");
                if (!(systemService instanceof AlarmManager)) {
                    systemService = null;
                }
                AlarmManager alarmManager = (AlarmManager) systemService;
                if (alarmManager != null) {
                    if (VERSION.SDK_INT >= 23) {
                        alarmManager.setAndAllowWhileIdle(2, elapsedRealtime, broadcast);
                    } else {
                        int i = VERSION.SDK_INT;
                        if (19 <= i) {
                            if (22 >= i) {
                                alarmManager.setExact(2, elapsedRealtime, broadcast);
                            }
                        }
                        alarmManager.set(2, elapsedRealtime, broadcast);
                    }
                    a.a().c();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: jag$q */
    static final class q<T> implements ajfb<String> {
        private /* synthetic */ jag a;

        q(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((isf) this.a.t.get()).a(aaoo.SIGNUP_SAFETYNET_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        }
    }

    /* renamed from: jag$r */
    static final class r<T> implements ajfb<irs> {
        public static final r a = new r();

        r() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jag$s */
    static final class s<T> implements ajfb<Throwable> {
        public static final s a = new s();

        s() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jag$y */
    public static final class y<T> implements ajfb<jeb> {
        final /* synthetic */ jag a;

        /* renamed from: jag$y$1 */
        static final class 1 implements ajev {
            public static final 1 a = new 1();

            1() {
            }

            public final void run() {
            }
        }

        /* renamed from: jag$y$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: jag$y$3 */
        static final class 3<T> implements ajfb<String> {
            private /* synthetic */ y a;

            3(y yVar) {
                this.a = yVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (String) obj;
                jbw jbw = (jbw) this.a.a.h.get();
                akcr.a(obj, "it");
                jbw.d(obj);
                ((isf) this.a.a.t.get()).a(aaoo.SIGNUP_SUGGESTED_USERNAME_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
            }
        }

        public y(jag jag) {
            this.a = jag;
        }

        public final /* synthetic */ void accept(Object obj) {
            jeb jeb = (jeb) obj;
            akcr.b(jeb, "session");
            if (jeb.x) {
                this.a.b();
            } else if (jeb.w) {
                jag jag = this.a;
                zjm zjm = new zjm(irc.t, "LoginSignupCoordinator", false, false, true, false, null, false, false, false, false, null, 4076);
                Object obj2 = jag.f.get();
                String str = "navigationHost.get()";
                akcr.a(obj2, str);
                achb achb = (achb) obj2;
                obj2 = jag.g.get();
                akcr.a(obj2, "context.get()");
                zgy a = zgy.a.a(new zgy.a((Context) obj2, achb, zjm, false, null, 16).a((int) R.string.resume_signup_title).b((int) R.string.resume_signup_description).a((int) R.string.yes, (akbl) new w(jag), false), (akbl) new x(jag), false, Integer.valueOf(R.string.no), null, null, 24).a();
                achb achb2 = (achb) jag.f.get();
                Object obj3 = jag.f.get();
                akcr.a(obj3, str);
                achb achb3 = (achb) obj3;
                achd achd = a;
                Object d = zgz.a.a(false).b((achg) zjm).d();
                akcr.a(d, "DIALOG_PRESENT_BUILDER.s…ageType(pageType).build()");
                achb2.b((acig) new acip(achb3, achd, d));
            } else {
                Iterator it = this.a.s.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                jbj jbj = (jbj) this.a.q.get();
                try {
                    PackageInfo packageInfo = jbj.c.getPackageManager().getPackageInfo(jbj.c.getPackageName(), 0);
                    long j = packageInfo.firstInstallTime;
                    Object akqy = new akqy();
                    akcr.a(akqy, "DateTime.now()");
                    long j2 = akqy.a;
                    if (packageInfo.firstInstallTime == packageInfo.lastUpdateTime && j2 <= jbj.f + j) {
                        jbj.b.a(Boolean.TRUE);
                        jbk jbk = (jbk) jbj.d.get();
                        ajej a2 = jbk.c().b().a((ajdw) jbk.d().l()).a((ajfb) new c(jbk, j), (ajfb) d.a);
                        akcr.a((Object) a2, "loginSignupPersistentSes…e, it)\n                })");
                        ajvv.a(a2, jbk.a);
                        ajej a3 = jbj.g.a((ajfl) jbj.b.a).e().b((ajdw) jbj.a().f()).a((ajfb) new jbj.c(jbj), (ajfb) jbj.d.a);
                        akcr.a((Object) a3, "installReferrerSubject\n …y(installReferrer) }, {})");
                        ajvv.a(a3, jbj.a);
                        ((jbw) this.a.h.get()).h();
                        this.a.b.a(((abna) this.a.u.get()).a().a((ajev) 1.a, (ajfb) 2.a));
                        this.a.b.a(((gpb) this.a.k.get()).a(true).b((ajdw) this.a.d.m()).e());
                        this.a.b.a((ajej) this.a.j.get());
                        this.a.b.a(((jdu) this.a.j.get()).a.a((ajdw) this.a.d.l()).f((ajfb) new 3(this)));
                    }
                } catch (NameNotFoundException | RemoteException unused) {
                }
                jbj.b.a(Boolean.FALSE);
                ((jbw) this.a.h.get()).h();
                this.a.b.a(((abna) this.a.u.get()).a().a((ajev) 1.a, (ajfb) 2.a));
                this.a.b.a(((gpb) this.a.k.get()).a(true).b((ajdw) this.a.d.m()).e());
                this.a.b.a((ajej) this.a.j.get());
                this.a.b.a(((jdu) this.a.j.get()).a.a((ajdw) this.a.d.l()).f((ajfb) new 3(this)));
            }
        }
    }

    /* renamed from: jag$z */
    static final class z<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ jag a;
        private /* synthetic */ jeb b;
        private /* synthetic */ String c;

        z(jag jag, jeb jeb, String str) {
            this.a = jag;
            this.b = jeb;
            this.c = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "safetyNetAttestation");
            ira ira = (ira) this.a.i.get();
            String str2 = this.b.r;
            String str3 = this.c;
            String str4 = this.b.q;
            String str5 = this.b.o;
            String str6 = this.b.p;
            obj = this.a.t.get();
            akcr.a(obj, "stateTransitionService.get()");
            return ira.a(str2, str3, str4, str5, str6, str, (isf) obj);
        }
    }

    /* renamed from: jag$v */
    static final class v extends akcs implements akbk<ajxw> {
        private /* synthetic */ jag a;

        v(jag jag) {
            this.a = jag;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.onAbandonSignupFlow(new izk());
            return ajxw.a;
        }
    }

    /* renamed from: jag$w */
    static final class w extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ jag a;

        w(jag jag) {
            this.a = jag;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            jag jag = this.a;
            ((jbk) jag.m.get()).a(aavm.RESUME, null);
            ((isf) jag.t.get()).a();
            ((akbw) jag.c).invoke(jbv.p, new EmailFragment());
            return ajxw.a;
        }
    }

    /* renamed from: jag$x */
    static final class x extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ jag a;

        x(jag jag) {
            this.a = jag;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.onAbandonSignupFlow(new izk());
            return ajxw.a;
        }
    }

    /* renamed from: jag$a */
    static final class a extends akcq implements akbw<zjm, MainPageFragment, ajxw> {
        a(jai jai) {
            super(2, jai);
        }

        public final String getName() {
            return "navigateToUnfixedPage";
        }

        public final akej getOwner() {
            return akde.a(jai.class);
        }

        public final String getSignature() {
            return "navigateToUnfixedPage(Lcom/snap/ui/deck/MainPageType;Lcom/snap/ui/deck/MainPageFragment;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            zjm zjm = (zjm) obj;
            MainPageFragment mainPageFragment = (MainPageFragment) obj2;
            akcr.b(zjm, "p1");
            akcr.b(mainPageFragment, "p2");
            jai jai = (jai) this.receiver;
            akcr.b(zjm, "pageType");
            akcr.b(mainPageFragment, Event.FRAGMENT);
            zjf zjf = new zjf(zjm, mainPageFragment);
            obj = jbv.x.g().b((achg) zjm).d();
            Object obj3 = jai.a.get();
            akcr.a(obj3, "navigationHost.get()");
            achb achb = (achb) obj3;
            achd achd = zjf;
            akcr.a(obj, "action");
            ((achb) jai.a.get()).b((acig) new acip(achb, achd, obj));
            return ajxw.a;
        }
    }

    /* renamed from: jag$t */
    static final class t extends akcq implements akbk<jdr> {
        t(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (jdr) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: jag$u */
    static final class u extends akcq implements akbk<jas> {
        u(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (jas) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(jag.class), "reengPushManager", "getReengPushManager()Lcom/snap/identity/loginsignup/RegistrationReengagementPushManager;"), new akdc(akde.a(jag.class), "reengPushClientStudyLookup", "getReengPushClientStudyLookup()Lcom/snap/identity/loginsignup/experiment/RegistrationReengagementNotificationClientStudyLookup;")};
    }

    public jag(aipn<jai> aipn, aipn<achb<zjm, zjk>> aipn2, aipn<Context> aipn3, aipn<jbw> aipn4, aipn<ira> aipn5, aipn<jhv> aipn6, aipn<jdu> aipn7, aipn<gpb> aipn8, tnj tnj, aipn<jbk> aipn9, aipn<iqe> aipn10, aipn<jea> aipn11, aipn<iru> aipn12, jbp jbp, aipn<jbj> aipn13, aipn<ftl> aipn14, zgb zgb, Set<Object> set, Set<Object> set2, Set<Object> set3, Set<jbs> set4, ajwy<a> ajwy, aipn<isf> aipn15, aipn<jed> aipn16, ifs ifs, aipn<abna> aipn17, aipn<jig> aipn18, aipn<isc> aipn19, ajwy<jas> ajwy2, ajwy<jdr> ajwy3) {
        aipn<jai> aipn20 = aipn;
        aipn<achb<zjm, zjk>> aipn21 = aipn2;
        aipn<Context> aipn22 = aipn3;
        aipn<jbw> aipn23 = aipn4;
        aipn<ira> aipn24 = aipn5;
        aipn<jhv> aipn25 = aipn6;
        aipn<jdu> aipn26 = aipn7;
        aipn<gpb> aipn27 = aipn8;
        tnj tnj2 = tnj;
        aipn<jbk> aipn28 = aipn9;
        aipn<iqe> aipn29 = aipn10;
        aipn<jea> aipn30 = aipn11;
        aipn<iru> aipn31 = aipn12;
        jbp jbp2 = jbp;
        aipn<jbj> aipn32 = aipn13;
        aipn<ftl> aipn33 = aipn14;
        akcr.b(aipn20, "navigationHelper");
        akcr.b(aipn21, "navigationHost");
        akcr.b(aipn22, "context");
        akcr.b(aipn23, "store");
        akcr.b(aipn24, "identityApi");
        akcr.b(aipn25, "oneTapLoginManager");
        akcr.b(aipn26, "usernameSuggestionFetcher");
        akcr.b(aipn27, "authStore");
        akcr.b(tnj2, "prefs");
        akcr.b(aipn28, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn29, "settingsAnalytics");
        akcr.b(aipn30, "persistentSessionService");
        akcr.b(aipn31, "signupAbandonHandler");
        akcr.b(jbp2, "friendingMetadataService");
        akcr.b(aipn32, "installAnalyticsService");
        akcr.b(aipn14, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(set, "signupStartedHandlers");
        akcr.b(set2, "loginStartedHandlers");
        akcr.b(set3, "loginSignupStartHandlers");
        akcr.b(set4, "loginSignupCompletedPersistentFlags");
        akcr.b(ajwy, "abandonFlowDialogBuilder");
        akcr.b(aipn15, "stateTransitionService");
        akcr.b(aipn16, "phoneAutofillStateProvider");
        akcr.b(ifs, "permissionHelper");
        akcr.b(aipn17, "deviceTokenProvider");
        akcr.b(aipn18, "legalAgreementStoreSharedPrefs");
        akcr.b(aipn19, "longClientIdProvider");
        akcr.b(ajwy2, "reengPushManagerProvider");
        akcr.b(ajwy3, "reengPushClientStudyLookupProvider");
        aipn<ftl> aipn34 = aipn14;
        this.e = aipn20;
        this.f = aipn21;
        this.g = aipn22;
        this.h = aipn23;
        this.i = aipn24;
        this.z = aipn25;
        this.j = aipn26;
        this.k = aipn27;
        this.l = tnj2;
        this.m = aipn28;
        this.n = aipn29;
        this.o = aipn30;
        this.A = aipn31;
        this.p = jbp2;
        this.q = aipn13;
        this.r = aipn34;
        Set<Object> set5 = set2;
        this.B = set;
        this.C = set5;
        Set<jbs> set6 = set4;
        this.s = set3;
        this.D = set6;
        aipn<isf> aipn35 = aipn15;
        this.E = ajwy;
        this.t = aipn35;
        ifs ifs2 = ifs;
        this.F = aipn16;
        this.G = ifs2;
        aipn<jig> aipn36 = aipn18;
        this.u = aipn17;
        this.v = aipn36;
        ajwy<jas> ajwy4 = ajwy2;
        this.H = aipn19;
        Object ajwr = new ajwr();
        akcr.a(ajwr, "SingleSubject.create()");
        this.a = ajwr;
        this.w = ajxh.a(new u(ajwy4));
        this.x = ajxh.a(new t(ajwy3));
        this.d = zgb.a(jbv.y.callsite("LoginSignup.LoginSignupCoordinator"));
    }

    private final void a(jbu jbu) {
        ((jbk) this.m.get()).j();
        ((isf) this.t.get()).a(aaoo.LOGIN_FLOW_COMPLETE, aaop.INTERNAL_PROCESS, ish.LOGIN);
        b(jbu);
    }

    private final void b(jbu jbu) {
        ajei ajei = this.b;
        Iterable<jbs> iterable = this.D;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (jbs a : iterable) {
            arrayList.add(a.a());
        }
        ajei.a(ajcx.b((Iterable) (List) arrayList).b((ajdw) this.d.f()).a((ajdw) this.d.l()).b((ajdb) new g(this, jbu)).e());
    }

    private void c() {
        ajej a = ((ftl) this.r.get()).b((fth) jdw.REG_REMOVE_CAPTCHA).b((ajdw) this.d.h()).a((ajdw) this.d.l()).a((ajfb) new b(this), (ajfb) new c(this));
        akcr.a((Object) a, "configProvider.get().get…ent())\n                })");
        ajvv.a(a, this.b);
    }

    private final void d() {
        ((a) this.E.get()).a().b().a(new v(this)).c().a();
    }

    public final ajcx a() {
        if (!((jbw) this.h.get()).c().x) {
            ((jbw) this.h.get()).b(true);
            ((jbk) this.m.get()).g();
            ((isf) this.t.get()).a(aaoo.SIGNUP_FLOW_ACHIEVE_DNU, aaop.INTERNAL_PROCESS, ish.SIGNUP);
            this.b.a(((jbj) this.q.get()).a(iqp.REGISTER, null).e());
        }
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        ((jbk) this.m.get()).h();
        ((jbk) this.m.get()).a(aavm.FINISH, null);
        ((isf) this.t.get()).a(aaoo.SIGNUP_FLOW_COMPLETE, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        b(jbu.FROM_REGISTRATION);
    }

    public final void dispose() {
        this.b.a();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAbandonSignupFlow(izk izk) {
        akcr.b(izk, "event");
        ((jbw) this.h.get()).k();
        ((isf) this.t.get()).a();
        this.b.a(((iru) this.A.get()).a().a((ajdw) this.d.l()).b((ajev) new d(this)).e());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAllOneTapLoginUsersGotRemovedEvent(izl izl) {
        akcr.b(izl, "event");
        ((akbw) this.c).invoke(jbv.b, new LandingFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onBackFromForgotPasswordResetSuccess(izn izn) {
        akcr.b(izn, "event");
        ((jbw) this.h.get()).a(izn.a);
        ((jai) this.e.get()).a(jbv.c);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onBirthdayCaptured(izo izo) {
        akbw akbw;
        Object obj;
        Object usernameSuggestionFragment;
        akcr.b(izo, "event");
        ((isf) this.t.get()).a(aaoo.SIGNUP_BIRTHDAY_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
        ((jbw) this.h.get()).b(izo.a);
        if ((akgb.a(((jbw) this.h.get()).c().s) ^ 1) != 0) {
            akbw = (akbw) this.c;
            obj = jbv.l;
            usernameSuggestionFragment = new UsernameSuggestionFragment();
        } else {
            akbw = (akbw) this.c;
            obj = jbv.k;
            usernameSuggestionFragment = new UsernameFragment();
        }
        akbw.invoke(obj, usernameSuggestionFragment);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onBirthdayNotEligible(izp izp) {
        akcr.b(izp, "event");
        ((jbw) this.h.get()).k();
        ((isc) this.H.get()).b();
        ((isf) this.t.get()).a();
        this.b.a(((jbj) this.q.get()).a(iqp.UNDER_THIRTEEN, null).e());
        ((jai) this.e.get()).a(jbv.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onChangeUsernameInstead(izq izq) {
        akcr.b(izq, "event");
        ((akbw) this.c).invoke(jbv.k, new UsernameFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClearSignupBirthdayError(izr izr) {
        akcr.b(izr, "event");
        ((jbw) this.h.get()).h("");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClearSignupDisplayNameError(izs izs) {
        akcr.b(izs, "event");
        ((jbw) this.h.get()).g("");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClearSignupPasswordError(izt izt) {
        akcr.b(izt, "event");
        ((jbw) this.h.get()).j("");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onClearSignupUsernameError(izu izu) {
        akcr.b(izu, "event");
        ((jbw) this.h.get()).i("");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onDisplayNameCaptured(izv izv) {
        akcr.b(izv, "event");
        ((isf) this.t.get()).a(aaoo.SIGNUP_DISPLAY_NAME_SUBMIT, aaop.USER_PRESSED_CONTINUE, ish.SIGNUP);
        ((jbw) this.h.get()).a(izv.a, izv.b);
        ((akbw) this.c).invoke(jbv.j, new BirthdayFragment());
        jdu jdu = (jdu) this.j.get();
        String str = izv.a;
        String str2 = izv.b;
        akcr.b(str, "firstName");
        akcr.b(str2, "lastName");
        jdu.dispose();
        jdu.c = ((ira) jdu.d.get()).a(str, str2, "").b((ajdw) jdu.b.g()).a((ajfb) new jdu.a(jdu), (ajfb) new jdu.b(jdu));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onEmailCaptured(izw izw) {
        akcr.b(izw, "event");
        ((jbw) this.h.get()).f(izw.a);
        ((jbw) this.h.get()).g();
        jeb c = ((jbw) this.h.get()).c();
        ((isf) this.t.get()).a(aaoo.SIGNUP_EMAIL_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        if (c.J) {
            c();
        } else {
            ((akbw) this.c).invoke(jbv.n, new SetPhoneFragment());
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onExitSetEmailPage(izx izx) {
        akcr.b(izx, "event");
        d();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onExitSetPhonePage(izy izy) {
        Object obj;
        akcr.b(izy, "event");
        Iterable<Object> g = ((achb) this.f.get()).g();
        if (!((g instanceof Collection) && ((Collection) g).isEmpty())) {
            for (Object obj2 : g) {
                akcr.a(obj2, "it");
                if (akcr.a((zjm) obj2.e(), jbv.p)) {
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj != null) {
            ((achb) this.f.get()).a((achg) jbv.p, false, true, null);
        } else {
            d();
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFindFriendsContinue(izz izz) {
        akcr.b(izz, "event");
        b();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFindFriendsResult(jaa jaa) {
        akcr.b(jaa, "event");
        ((isf) this.t.get()).a(aaoo.SIGNUP_FIND_FRIENDS_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        if (jaa.a) {
            ((akbw) this.c).invoke(jbv.r, new FindFriendsFragment());
        } else {
            b();
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onFindFriendsSplashSkip(jab jab) {
        akcr.b(jab, "event");
        b();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onForgotPasswordCheckVerifyCodeSuccess(jac jac) {
        akcr.b(jac, "event");
        ((isf) this.t.get()).a(aaoo.FORGOT_PASSWORD_VERIFY_PHONE_SUCCEED, aaop.INTERNAL_PROCESS, ish.LOGIN);
        ((akbw) this.c).invoke(jbv.v, new ResetPasswordPreLoginFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onForgotPasswordRequestCodeSuccess(jad jad) {
        akcr.b(jad, "event");
        ((isf) this.t.get()).a(aaoo.FORGOT_PASSWORD_SET_PHONE_SUCCEED, aaop.INTERNAL_PROCESS, ish.LOGIN);
        if ((akgb.a(jad.a) ^ 1) != 0) {
            jbw jbw = (jbw) this.h.get();
            String str = jad.a;
            String str2 = jad.b;
            String str3 = jad.c;
            Object a = jad.d.a();
            akcr.a(a, "event.method.value()");
            jbw.b(str, str2, str3, a);
            ((akbw) this.c).invoke(jbv.u, new ForgotPasswordVerifyPhoneFragment());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onForgotPasswordResetByPhone(jae jae) {
        akcr.b(jae, "event");
        ((jbw) this.h.get()).k(jae.a);
        ((akbw) this.c).invoke(jbv.t, new ForgotPasswordSetPhoneFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onForgotPasswordResetSuccess(jaf jaf) {
        akcr.b(jaf, "event");
        ((akbw) this.c).invoke(jbv.w, new ForgotPasswordResetSuccessFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLoginSuccess(jaj jaj) {
        akcr.b(jaj, "event");
        ((isf) this.t.get()).a(aaoo.LOGIN_OPERATION_SUCCEED, aaop.INTERNAL_PROCESS, ish.LOGIN);
        a(jbu.FROM_LOGIN_NO_TFA);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onNavigateToFirstPageAfterLoadingPageEvent(jal jal) {
        akcr.b(jal, "event");
        ajei ajei = this.b;
        Object b = ((jhv) this.z.get()).a().b((ajdw) this.d.f());
        akcr.a(b, "oneTapLoginManager.get()…scribeOn(schedulers.io())");
        ajei.a(b.e().a((ajdw) this.d.l()).c((ajfb) new h(this)).c());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onOdlvLoginSuccess(jam jam) {
        akcr.b(jam, "event");
        ((isf) this.t.get()).a(aaoo.ODLV_LOGIN_SUCCEED, aaop.INTERNAL_PROCESS, ish.LOGIN);
        a(jbu.FROM_LOGIN_NO_TFA);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onOdlvOtpTypeSelected(jan jan) {
        akcr.b(jan, "event");
        ((jbw) this.h.get()).a(jan.a);
        ((akbw) this.c).invoke(jbv.g, new LoginOdlvVerifyingFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onOdlvRequired(jao jao) {
        akcr.b(jao, "event");
        ((jbw) this.h.get()).a(jao.a, jao.b, jao.c, jao.d);
        ((isf) this.t.get()).a(aaoo.LOGIN_OPERATION_REQUIRE_ODLV, aaop.INTERNAL_PROCESS, ish.LOGIN);
        ((akbw) this.c).invoke(jbv.f, new LoginOdlvLandingFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPasswordCaptured(jap jap) {
        akcr.b(jap, "event");
        ((jbw) this.h.get()).e(jap.a);
        String str = jap.a;
        ((jbw) this.h.get()).j();
        jeb c = ((jbw) this.h.get()).c();
        ((isf) this.t.get()).a(aaoo.SIGNUP_REG_SAFETYNET_SUBMIT, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        ajei ajei = this.b;
        ajdx ajdx = this.y;
        if (ajdx == null) {
            akcr.a("safetyNetAttestation");
        }
        ajei.a(ajdx.a((ajfc) new z(this, c, str)).a((ajdw) this.d.l()).a((ajfb) new aa(this), (ajfb) new ab(this)));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPermissionsCompleted(jaq jaq) {
        akcr.b(jaq, "event");
        ((akbw) this.c).invoke(jbv.h, new DisplayNameFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onReturnToFirstPage(jau jau) {
        akcr.b(jau, "event");
        ((jai) this.e.get()).a(jbv.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSignupCaptchaSolved(jav jav) {
        akcr.b(jav, "event");
        ((isf) this.t.get()).a(aaoo.SIGNUP_CAPTCHA_SOLVE_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        this.b.a(a().a((ajdw) this.d.l()).g(new i(this, jav)));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSignupPhoneNumberCaptured(jaw jaw) {
        akcr.b(jaw, "event");
        ((jbw) this.h.get()).b(jaw.b, jaw.a);
        ((isf) this.t.get()).a(aaoo.SIGNUP_SET_PHONE_SUCCEED, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        ((akbw) this.c).invoke(jbv.o, new VerifyPhoneFragment());
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSignupPhoneVerified(jax jax) {
        akcr.b(jax, "event");
        ((jbw) this.h.get()).b(jax.b, jax.a);
        String b = juo.b(jax.a, jax.b);
        this.b.a(((ira) this.i.get()).c(true).b((ajdw) this.d.g()).a((ajdw) this.d.l()).a((ajfb) new j(this), (ajfb) k.a));
        this.b.a(((gpb) this.k.get()).b(b).b((ajev) new l(this)).b((ajdb) a()).a((ajdw) this.d.l()).a((ajev) new m(this, jax), (ajfb) n.a));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSignupSetPhoneSkipped(jay jay) {
        akcr.b(jay, "event");
        jbk jbk = (jbk) this.m.get();
        if (!akgb.a(jbk.b().c().n)) {
            aawx aawx = new aawx();
            aawx.a(aaxp.V2);
            jbk.a().a(aawx);
        }
        c();
    }

    /* JADX WARNING: Missing block: B:3:0x0099, code skipped:
            if (r1 == null) goto L_0x009b;
     */
    @defpackage.akqq(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onStartLogin(defpackage.jaz r7) {
        /*
        r6 = this;
        r0 = "event";
        defpackage.akcr.b(r7, r0);
        r0 = r6.q;
        r0 = r0.get();
        r0 = (defpackage.jbj) r0;
        r1 = 0;
        r0.a(r1);
        r0 = r6.h;
        r0 = r0.get();
        r0 = (defpackage.jbw) r0;
        r1 = r6.h;
        r1 = r1.get();
        r1 = (defpackage.jbw) r1;
        r1 = r1.i();
        r2 = r7.a;
        r0.a(r1, r2);
        r0 = r6.m;
        r0 = r0.get();
        r0 = (defpackage.jbk) r0;
        r1 = r0.b();
        r1 = r1.c();
        r2 = new aapx;
        r2.<init>();
        r3 = r0.m();
        r3 = java.lang.Boolean.valueOf(r3);
        r2.a(r3);
        r3 = r1.b;
        r2.a(r3);
        r3 = r0.g;
        r3 = r3.get();
        r3 = (defpackage.isc) r3;
        r3 = r3.a();
        r2.b(r3);
        r3 = new aapw;
        r3.<init>();
        r4 = r1.L;
        r3.a(r4);
        r3.a(r2);
        r2 = r0.a();
        r3 = (defpackage.aajt) r3;
        r2.a(r3);
        r2 = r0.f;
        r2 = r2.get();
        r2 = (defpackage.ilv) r2;
        r3 = defpackage.iok.LOGIN_STARTED;
        r4 = "is_og";
        r5 = 0;
        r3 = r3.a(r4, r5);
        r0 = r0.m();
        r0 = r0 ^ 1;
        r4 = "new_device";
        r0 = r3.a(r4, r0);
        r1 = r1.L;
        if (r1 == 0) goto L_0x009b;
    L_0x0095:
        r1 = r1.name();
        if (r1 != 0) goto L_0x009d;
    L_0x009b:
        r1 = "null";
    L_0x009d:
        r3 = "login_source";
        r0 = r0.a(r3, r1);
        r2.c(r0, 1);
        r0 = r6.t;
        r0 = r0.get();
        r0 = (defpackage.isf) r0;
        r0.a();
        r0 = r6.t;
        r0 = r0.get();
        r0 = (defpackage.isf) r0;
        r1 = defpackage.aaoo.LOGIN_FLOW_START;
        r2 = defpackage.aaop.USER_PRESSED_BUTTON;
        r3 = defpackage.ish.LOGIN;
        r0.a(r1, r2, r3);
        r0 = r6.C;
        r0 = r0.iterator();
    L_0x00c8:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x00d2;
    L_0x00ce:
        r0.next();
        goto L_0x00c8;
    L_0x00d2:
        r7 = r7.a;
        r0 = defpackage.aapz.USERNAME_PASSWORD_LOGIN;
        if (r7 != r0) goto L_0x00e6;
    L_0x00d8:
        r7 = r6.c;
        r7 = (defpackage.akbw) r7;
        r0 = defpackage.jbv.c;
        r1 = new com.snap.identity.loginsignup.ui.pages.login.LoginFragment;
        r1.<init>();
        r7.invoke(r0, r1);
    L_0x00e6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jag.onStartLogin(jaz):void");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onStartSignup(jba jba) {
        akbw akbw;
        Object obj;
        Object displayNameFragment;
        akcr.b(jba, "event");
        Object c = ajdx.c((Callable) new jdr.a((jdr) this.x.b()));
        akcr.a(c, "Single.fromCallable { st…per.experiment.waitTime }");
        ajej d = c.b((ajdw) this.d.f()).a((ajfl) o.a).d((ajfb) new p(this));
        akcr.a((Object) d, "reengPushClientStudyLook…itTime)\n                }");
        ajvv.a(d, this.b);
        ((jbj) this.q.get()).a(null);
        String i = ((jbw) this.h.get()).i();
        ((jbw) this.h.get()).l(i);
        ((isf) this.t.get()).a();
        ((isf) this.t.get()).a(aaoo.SIGNUP_FLOW_START, aaop.USER_PRESSED_BUTTON, ish.SIGNUP);
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            it.next();
        }
        jbk jbk = (jbk) this.m.get();
        akcr.b(i, "signupSessionId");
        aaxf aaxf = new aaxf();
        aaxf.a(jbk.b().c().H);
        aaxf.a(Boolean.valueOf(jbk.m()));
        aaxf.a(aaxp.V2);
        aaxf.a(((isc) jbk.g.get()).a());
        jbk.a().a(aaxf);
        jbk.a(aaua.REGISTRATION_USER_SIGNUP, aaua.REGISTRATION_USER_SPLASH_SCREEN, i);
        ((jbk) this.m.get()).a(aavm.BEGIN, null);
        this.p.b();
        if (this.G.g() && this.G.f()) {
            akbw = (akbw) this.c;
            obj = jbv.h;
            displayNameFragment = new DisplayNameFragment();
        } else {
            akbw = (akbw) this.c;
            obj = jbv.i;
            displayNameFragment = new PermissionsFragment();
        }
        akbw.invoke(obj, displayNameFragment);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onSuggestUsernameError(jbb jbb) {
        akcr.b(jbb, "event");
        ((jbw) this.h.get()).i(jbb.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onTwoFALoginSuccess(jbc jbc) {
        akcr.b(jbc, "event");
        ((isf) this.t.get()).a(aaoo.TWO_FA_LOGIN_SUCCEED, aaop.INTERNAL_PROCESS, ish.LOGIN);
        a(jbc.a ? jbu.FROM_TFA_RECOVERY_CODE : jbu.FROM_TFA_NO_RECOVERY_CODE);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onTwoFARequired(jbd jbd) {
        akcr.b(jbd, "event");
        boolean z = jbd.b;
        boolean z2 = jbd.c;
        LoginTwoFAFragment loginTwoFAFragment = new LoginTwoFAFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("sms_enabled", z);
        bundle.putBoolean("otp_enabled", z2);
        loginTwoFAFragment.setArguments(bundle);
        ((jbw) this.h.get()).a(jbd.a, jbd.d, jbd.b, jbd.c, jbd.e);
        ((isf) this.t.get()).a(aaoo.LOGIN_OPERATION_REQUIRE_TWO_FA, aaop.INTERNAL_PROCESS, ish.LOGIN);
        ((akbw) this.c).invoke(jbv.e, loginTwoFAFragment);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUserVerificationNeeded(jbe jbe) {
        akbw akbw;
        Object obj;
        Object setPhoneFragment;
        akcr.b(jbe, "event");
        if (jbe.a) {
            ((isf) this.t.get()).a(aaoo.LOGIN_OPERATION_REQUIRE_REG_VERIFICATION, aaop.INTERNAL_PROCESS, ish.LOGIN);
            ((jbw) this.h.get()).l(((jbw) this.h.get()).i());
            ((jbw) this.h.get()).a(true);
        }
        if (jbe.b == b.PHONE_FIRST_EMAIL_BYPASSED) {
            akbw = (akbw) this.c;
            obj = jbv.n;
            setPhoneFragment = new SetPhoneFragment();
        } else {
            akbw = (akbw) this.c;
            obj = jbv.p;
            setPhoneFragment = new EmailFragment();
        }
        akbw.invoke(obj, setPhoneFragment);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onUsernameCaptured(jbf jbf) {
        akcr.b(jbf, "event");
        ((jbw) this.h.get()).c(jbf.a);
        ((akbw) this.c).invoke(jbv.m, new PasswordFragment());
        ((isf) this.t.get()).a(aaoo.SIGNUP_SAFETYNET_SUBMIT, aaop.INTERNAL_PROCESS, ish.SIGNUP);
        Object a = ((ira) this.i.get()).e(jbf.a).c((ajfb) new q(this)).a();
        akcr.a(a, "identityApi.get()\n      …\n                .cache()");
        this.y = a;
        ajei ajei = this.b;
        ajdx ajdx = this.y;
        if (ajdx == null) {
            akcr.a("safetyNetAttestation");
        }
        ajei.a(ajdx.c());
        if (this.G.g()) {
            ajei = this.b;
            jed jed = (jed) this.F.get();
            Object obj = this.g.get();
            if (obj != null) {
                ajei.a(jed.a((Activity) obj, this.G, this.d, ifu.REG_PHONE_NUMBER, true).b((ajdw) this.d.j()).a((ajfb) r.a, (ajfb) s.a));
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onVerifyByEmailInstead(jbg jbg) {
        akcr.b(jbg, "event");
        ((jbw) this.h.get()).f();
        ((jai) this.e.get()).a(jbv.p, new EmailFragment(), jbv.n);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onVerifyByPhoneInstead(jbh jbh) {
        akcr.b(jbh, "event");
        ((jai) this.e.get()).a(jbv.n, new SetPhoneFragment(), jbv.p);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onVerifyPhoneInsteadOnSignupCaptchaPage(jbi jbi) {
        akcr.b(jbi, "event");
        ((jai) this.e.get()).a(jbv.n, new SetPhoneFragment(), jbv.p);
    }
}

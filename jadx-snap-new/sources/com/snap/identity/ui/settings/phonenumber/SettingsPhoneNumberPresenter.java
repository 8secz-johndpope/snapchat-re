package com.snap.identity.ui.settings.phonenumber;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventType;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.identity.ui.shared.phonenumber.PhonePickerView;
import com.snapchat.android.R;
import defpackage.abtj;
import defpackage.achb;
import defpackage.achd;
import defpackage.ahcd;
import defpackage.ahfv;
import defpackage.aipn;
import defpackage.ajdp;
import defpackage.ajdt;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajej;
import defpackage.ajex;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.fth;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.ifs;
import defpackage.iqe;
import defpackage.iqn;
import defpackage.ira;
import defpackage.irc;
import defpackage.irr;
import defpackage.irs;
import defpackage.iub;
import defpackage.jic;
import defpackage.joe;
import defpackage.jof;
import defpackage.joj;
import defpackage.jok;
import defpackage.jol;
import defpackage.jom;
import defpackage.jon;
import defpackage.joq;
import defpackage.jrl;
import defpackage.jrm;
import defpackage.jrn;
import defpackage.jro;
import defpackage.jug;
import defpackage.jui;
import defpackage.juj;
import defpackage.juk;
import defpackage.jul;
import defpackage.jun;
import defpackage.juo;
import defpackage.tnj;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.concurrent.Callable;

public final class SettingsPhoneNumberPresenter extends zll<jon> implements defpackage.k {
    final zfw a = zgb.a(iub.d, "SettingsPhoneNumberPresenter");
    final jug b = new jug();
    boolean c;
    jrm d = jrn.a();
    final aipn<achb<zjm, zjk>> e;
    final aipn<gpb> f;
    final aipn<jof> g;
    final aipn<ftl> h;
    final aipn<tnj> i;
    final aipn<iqe> j;
    final aipn<joq> k;
    final Context l;
    final jui m;
    final aipn<jun> n;
    private boolean o;
    private boolean p = true;
    private final am q = new am(this);
    private final akbl<View, ajxw> r = new b(this);
    private final akbw<View, Boolean, ajxw> s = new ab(this);
    private final akbl<View, ajxw> t = new c(this);
    private aipn<ira> u;
    private final Activity v;
    private final aipn<ifs> w;

    public static final class am implements TextWatcher {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        am(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SettingsPhoneNumberPresenter.a(this.a, String.valueOf(charSequence));
        }
    }

    static final class aa<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        aa(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
            String string = settingsPhoneNumberPresenter.l.getString(R.string.problem_connecting);
            akcr.a((Object) string, "context.getString(R.string.problem_connecting)");
            settingsPhoneNumberPresenter.a(string);
        }
    }

    static final class ac<T> implements ajfb<String> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        ac(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            akcr.b(str, "verifyCode");
            if (!this.a.d.h && juo.c(this.a.d.e, str)) {
                SettingsPhoneNumberPresenter.a(this.a, str);
                this.a.a();
            }
        }
    }

    static final class ad<T> implements ajfb<Throwable> {
        public static final ad a = new ad();

        ad() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class ah<T> implements ajfb<joe> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        ah(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((joe) obj).a) {
                this.a.a();
                return;
            }
            SettingsPhoneNumberPresenter.a(this.a.l);
            this.a.b();
        }
    }

    static final class ai<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        ai(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsPhoneNumberPresenter.a(this.a.l);
            this.a.b();
        }
    }

    static final class aj<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        aj(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            akcr.b(bVar, "statusAndBody");
            obj = (ahfv) bVar.b;
            Object obj2 = obj.a;
            akcr.a(obj2, "response.logged");
            if (!obj2.booleanValue()) {
                return ajdx.b(obj);
            }
            ((jun) this.a.n.get()).a(this.a.l);
            ((tnj) this.a.i.get()).b().a((fth) jic.INAPP_COUNTRY_CODE, this.a.d.d).b();
            return ((gpb) this.a.f.get()).b(this.a.d.e).c((Callable) new Callable<ahfv>() {
                public final /* bridge */ /* synthetic */ Object call() {
                    return obj;
                }
            });
        }
    }

    static final class ak<T> implements ajfb<ahfv> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        ak(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (ahfv) obj;
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
            String str = EventType.RESPONSE;
            akcr.a(obj2, str);
            akcr.b(obj2, str);
            Object obj3 = obj2.a;
            akcr.a(obj3, "response.logged");
            jrm jrm;
            if (obj3.booleanValue()) {
                settingsPhoneNumberPresenter.b.b();
                ((iqe) settingsPhoneNumberPresenter.j.get()).a(akgb.a(settingsPhoneNumberPresenter.d.a) ^ 1);
                jui jui = settingsPhoneNumberPresenter.m;
                jrm = settingsPhoneNumberPresenter.d;
                obj2 = obj2.b;
                akcr.a(obj2, "response.message");
                settingsPhoneNumberPresenter.d = jui.e(jrm, obj2);
                settingsPhoneNumberPresenter.a(settingsPhoneNumberPresenter.c);
                jrl.a(settingsPhoneNumberPresenter.l);
                settingsPhoneNumberPresenter.b();
                if (((joq) settingsPhoneNumberPresenter.k.get()).b().d) {
                    ((joq) settingsPhoneNumberPresenter.k.get()).p();
                    jrl.a(settingsPhoneNumberPresenter.l);
                    zjm zjm = new zjm(irc.t, "phone_change_disable_two_fa", false, false, true, false, null, false, false, false, false, null, 4076);
                    Context context = settingsPhoneNumberPresenter.l;
                    Object obj4 = settingsPhoneNumberPresenter.e.get();
                    akcr.a(obj4, "navigationHost.get()");
                    zgy a = new defpackage.zgy.a(context, (achb) obj4, zjm, false, null, 24).a((int) R.string.two_fa_settings_phone_changed_title).b((int) R.string.two_fa_settings_phone_changed_msg).a((int) R.string.okay, (akbl) ag.a, true).a();
                    ((achb) settingsPhoneNumberPresenter.e.get()).a((achd) a, a.a, null);
                }
            } else if (akcr.a(obj2.h, Boolean.TRUE)) {
                ((jun) settingsPhoneNumberPresenter.n.get()).a(settingsPhoneNumberPresenter.l);
                jrm = settingsPhoneNumberPresenter.d;
                akcr.b(jrm, "priorState");
                settingsPhoneNumberPresenter.d = jrm.a(jrm, null, null, null, null, null, null, null, false, null, null, null, false, null, null, 16255);
                settingsPhoneNumberPresenter.b();
                zln.bindTo$default(settingsPhoneNumberPresenter, jof.a((jof) settingsPhoneNumberPresenter.g.get(), R.string.settings_mobile_number, R.string.default_password_validation_explanation, false, false, 4).b((ajdw) settingsPhoneNumberPresenter.a.l()).a((ajfb) new ah(settingsPhoneNumberPresenter), (ajfb) new ai(settingsPhoneNumberPresenter)), settingsPhoneNumberPresenter, null, null, 6, null);
            } else {
                String str2 = obj2.b;
                if (str2 == null) {
                    str2 = settingsPhoneNumberPresenter.l.getString(R.string.problem_connecting);
                    akcr.a((Object) str2, "context.getString(R.string.problem_connecting)");
                }
                settingsPhoneNumberPresenter.b(str2);
            }
        }
    }

    static final class al<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        al(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
            Object string = settingsPhoneNumberPresenter.l.getString(R.string.problem_connecting);
            akcr.a(string, "context.getString(R.string.problem_connecting)");
            settingsPhoneNumberPresenter.b(string);
        }
    }

    static final class d<T1, T2, R> implements ajex<irs, Boolean, joj> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            irs irs = (irs) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(irs, "autofillState");
            if (akgb.a(irs.a)) {
                booleanValue = true;
            }
            return new joj(irs.a, irs.b, irs.c, booleanValue);
        }
    }

    static final class e<T> implements ajfb<joj> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        e(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            joj joj = (joj) obj;
            akcr.b(joj, "autofillState");
            SettingsPhoneNumberPresenter.a(this.a, joj);
        }
    }

    static final class f<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        f(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsPhoneNumberPresenter.a(this.a, new joj());
        }
    }

    static final class g<T> implements ajfb<jul> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        g(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            jul jul = (jul) obj;
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
            jrm jrm = settingsPhoneNumberPresenter.d;
            akcr.a((Object) jul, "resendTimerState");
            settingsPhoneNumberPresenter.d = jui.a(jrm, jul);
            this.a.b();
        }
    }

    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class i<T, R> implements ajfc<Throwable, ajeb<? extends irs>> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajdx.b(new irs("", juk.c, irr.EMPTY, iqn.DEFAULT));
        }
    }

    static final class x<T> implements ajfb<Boolean> {
        public static final x a = new x();

        x() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class y<T> implements ajfb<Throwable> {
        public static final y a = new y();

        y() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class z<T> implements ajfb<defpackage.ira.b<ahcd>> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        z(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            defpackage.ira.b bVar = (defpackage.ira.b) obj;
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
            ahcd ahcd = (ahcd) bVar.b;
            akcr.b(ahcd, EventType.RESPONSE);
            Object obj2 = ahcd.b;
            akcr.a(obj2, "response.logged");
            String str;
            if (obj2.booleanValue()) {
                String str2 = "response.message";
                jui jui;
                jrm jrm;
                if (akcr.a(juk.a, ahcd.d)) {
                    ((jun) settingsPhoneNumberPresenter.n.get()).a(settingsPhoneNumberPresenter.l);
                    ((tnj) settingsPhoneNumberPresenter.i.get()).b().a((fth) jic.INAPP_COUNTRY_CODE, settingsPhoneNumberPresenter.d.d).b();
                    ((gpb) settingsPhoneNumberPresenter.f.get()).b(settingsPhoneNumberPresenter.d.e);
                    jui = settingsPhoneNumberPresenter.m;
                    jrm = settingsPhoneNumberPresenter.d;
                    obj = ahcd.a;
                    akcr.a(obj, str2);
                    settingsPhoneNumberPresenter.d = jui.e(jrm, obj);
                    settingsPhoneNumberPresenter.b.b();
                } else {
                    jui = settingsPhoneNumberPresenter.m;
                    jrm = settingsPhoneNumberPresenter.d;
                    str = ahcd.a;
                    akcr.a((Object) str, str2);
                    settingsPhoneNumberPresenter.d = jui.a(jrm, str);
                    settingsPhoneNumberPresenter.b.a();
                }
                SettingsPhoneNumberPresenter.a(settingsPhoneNumberPresenter.l);
                settingsPhoneNumberPresenter.b();
                return;
            }
            str = ahcd.a;
            if (str == null) {
                str = settingsPhoneNumberPresenter.l.getString(R.string.problem_connecting);
                akcr.a((Object) str, "context.getString(R.string.problem_connecting)");
            }
            settingsPhoneNumberPresenter.a(str);
        }
    }

    static final class ab extends akcs implements akbw<View, Boolean, ajxw> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        ab(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            akcr.b(view, "v");
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
            settingsPhoneNumberPresenter.c = booleanValue;
            settingsPhoneNumberPresenter.a(booleanValue);
            settingsPhoneNumberPresenter.b();
            return ajxw.a;
        }
    }

    static final class ae extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        ae(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            jun jun = (jun) this.a.n.get();
            Object u = ((ftl) this.a.h.get()).u(jic.PHONE_VERIFICATION_SMS_FORMAT);
            akcr.a(u, "configProvider.get().obs…_VERIFICATION_SMS_FORMAT)");
            jun.a(u, this.a.l);
            SettingsPhoneNumberPresenter.a(this.a, defpackage.ahcb.b.TEXT);
            return ajxw.a;
        }
    }

    static final class af extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        af(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SettingsPhoneNumberPresenter.a(this.a, defpackage.ahcb.b.CALL);
            return ajxw.a;
        }
    }

    static final class ag extends akcs implements akbl<View, ajxw> {
        public static final ag a = new ag();

        ag() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        b(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            SettingsPhoneNumberPresenter.a(this.a, "");
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsPhoneNumberPresenter a;

        c(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            this.a = settingsPhoneNumberPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "v");
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = this.a;
            if (settingsPhoneNumberPresenter.d.n == defpackage.juk.b.REQUEST_CODE) {
                jrl.a(settingsPhoneNumberPresenter.l);
                zjm zjm = new zjm(irc.t, "choose_request_verify_code_method", false, false, true, false, null, false, false, false, false, null, 4076);
                Context context = settingsPhoneNumberPresenter.l;
                Object obj2 = settingsPhoneNumberPresenter.e.get();
                akcr.a(obj2, "navigationHost.get()");
                defpackage.zgy.a aVar = new defpackage.zgy.a(context, (achb) obj2, zjm, false, null, 24);
                String string = settingsPhoneNumberPresenter.l.getString(R.string.phone_verification_alert_dialog_verification_body, new Object[]{settingsPhoneNumberPresenter.d.c});
                akcr.a((Object) string, "context.getString(R.stri…ssState.inputPhoneNumber)");
                zgy a = defpackage.zgy.a.a(aVar.b(string).a((int) R.string.confirm_phone_number_text, (akbl) new ae(settingsPhoneNumberPresenter), true).a((int) R.string.confirm_phone_number_call, (akbl) new af(settingsPhoneNumberPresenter), true), null, false, null, null, null, 31).a();
                ((achb) settingsPhoneNumberPresenter.e.get()).a((achd) a, a.a, null);
            } else {
                settingsPhoneNumberPresenter.a();
            }
            return ajxw.a;
        }
    }

    static final class a extends akcq implements akbw<String, String, ajxw> {
        a(SettingsPhoneNumberPresenter settingsPhoneNumberPresenter) {
            super(2, settingsPhoneNumberPresenter);
        }

        public final String getName() {
            return "onPhonePickerData";
        }

        public final akej getOwner() {
            return akde.a(SettingsPhoneNumberPresenter.class);
        }

        public final String getSignature() {
            return "onPhonePickerData(Ljava/lang/String;Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            akcr.b(str, "p1");
            akcr.b(str2, "p2");
            SettingsPhoneNumberPresenter settingsPhoneNumberPresenter = (SettingsPhoneNumberPresenter) this.receiver;
            settingsPhoneNumberPresenter.d = jui.a(settingsPhoneNumberPresenter.d, str2, str);
            settingsPhoneNumberPresenter.b();
            return ajxw.a;
        }
    }

    static final class j extends akcq implements akbk<Boolean> {
        j(PhonePickerView phonePickerView) {
            super(0, phonePickerView);
        }

        public final String getName() {
            return "isEnabled";
        }

        public final akej getOwner() {
            return akde.a(PhonePickerView.class);
        }

        public final String getSignature() {
            return "isEnabled()Z";
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((PhonePickerView) this.receiver).isEnabled());
        }
    }

    static final class k extends akcq implements akbl<Integer, ajxw> {
        k(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setTextColor";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setTextColor(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setTextColor(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class l extends akcq implements akbk<Integer> {
        l(TextView textView) {
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

    static final class m extends akcq implements akbl<Integer, ajxw> {
        m(TextView textView) {
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

    static final class n extends akcq implements akbk<CharSequence> {
        n(TextView textView) {
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

    static final class o extends akcq implements akbl<CharSequence, ajxw> {
        o(TextView textView) {
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

    static final class p extends akcq implements akbl<Boolean, ajxw> {
        p(PhonePickerView phonePickerView) {
            super(1, phonePickerView);
        }

        public final String getName() {
            return "setEnabled";
        }

        public final akej getOwner() {
            return akde.a(PhonePickerView.class);
        }

        public final String getSignature() {
            return "setEnabled(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((PhonePickerView) this.receiver).setEnabled(((Boolean) obj).booleanValue());
            return ajxw.a;
        }
    }

    static final class q extends akcq implements akbk<Integer> {
        q(View view) {
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

    static final class r extends akcq implements akbl<Integer, ajxw> {
        r(View view) {
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

    static final class s extends akcq implements akbk<Integer> {
        s(TextView textView) {
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

    static final class t extends akcq implements akbl<Integer, ajxw> {
        t(TextView textView) {
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

    static final class u extends akcq implements akbk<CharSequence> {
        u(TextView textView) {
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

    static final class v extends akcq implements akbl<CharSequence, ajxw> {
        v(TextView textView) {
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

    static final class w extends akcq implements akbk<Integer> {
        w(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getCurrentTextColor";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getCurrentTextColor()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((TextView) this.receiver).getCurrentTextColor());
        }
    }

    public SettingsPhoneNumberPresenter(aipn<achb<zjm, zjk>> aipn, aipn<gpb> aipn2, aipn<ira> aipn3, aipn<jof> aipn4, aipn<ftl> aipn5, aipn<tnj> aipn6, aipn<iqe> aipn7, aipn<joq> aipn8, Activity activity, Context context, aipn<ifs> aipn9, jui jui, aipn<jun> aipn10, zgb zgb) {
        akcr.b(aipn, "navigationHost");
        akcr.b(aipn2, "authStore");
        akcr.b(aipn3, "identityApi");
        akcr.b(aipn4, "passwordValidationHelper");
        akcr.b(aipn5, "configProvider");
        akcr.b(aipn6, "prefs");
        akcr.b(aipn7, LocalMessageActionModel.ANALYTICS);
        akcr.b(aipn8, "tfaFlowManager");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(context, "context");
        akcr.b(aipn9, "permissionHelper");
        akcr.b(jui, "reducers");
        akcr.b(aipn10, "smsAutofillRetrieverRegistry");
        akcr.b(zgb, "schedulersProvider");
        this.e = aipn;
        this.f = aipn2;
        this.u = aipn3;
        this.g = aipn4;
        this.h = aipn5;
        this.i = aipn6;
        this.j = aipn7;
        this.k = aipn8;
        this.v = activity;
        this.l = context;
        this.w = aipn9;
        this.m = jui;
        this.n = aipn10;
    }

    static void a(Context context) {
        View view = null;
        Activity activity = (Activity) (!(context instanceof Activity) ? null : context);
        if (activity != null) {
            view = activity.getCurrentFocus();
        }
        if (context != null && view != null) {
            abtj.a(context, view);
        }
    }

    private static <T> void a(T t, akbk<? extends T> akbk, akbl<? super T, ajxw> akbl) {
        if ((akcr.a(akbk.invoke(), (Object) t) ^ 1) != 0) {
            akbl.invoke(t);
        }
    }

    private final void c() {
        jon jon = (jon) getTarget();
        if (jon != null) {
            jon.a().a = new a(this);
            jon.f().addTextChangedListener(this.q);
            jon.g().setOnClickListener(new jol(this.r));
            jon.d().setOnCheckedChangeListener(new jom(this.s));
            jon.i().setOnClickListener(new jol(this.t));
        }
    }

    private final void d() {
        jon jon = (jon) getTarget();
        if (jon != null) {
            jon.a().a = null;
            jon.f().removeTextChangedListener(this.q);
            jon.g().setOnClickListener(null);
            jon.d().setOnCheckedChangeListener(null);
            jon.i().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.d.n != defpackage.juk.b.VERIFY || this.d.h) {
            b();
            return;
        }
        this.d = jui.b(this.d);
        b();
        zln.bindTo$default(this, ((ira) this.u.get()).a(this.d.g, defpackage.ahft.a.SETTINGS_PHONE_TYPE).b((ajdw) this.a.g()).a((ajfc) new aj(this)).a((ajdw) this.a.l()).a((ajfb) new ak(this), (ajfb) new al(this)), this, null, null, 6, null);
    }

    public final void a(String str) {
        akcr.b(str, "error");
        this.d = this.m.b(this.d, str);
        a(this.l);
        b();
    }

    /* renamed from: a */
    public final void takeTarget(jon jon) {
        akcr.b(jon, "target");
        super.takeTarget(jon);
        jon.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        zln.bindTo$default(this, ((ira) this.u.get()).c(z).b((ajdw) this.a.g()).a((ajdw) this.a.l()).a((ajfb) x.a, (ajfb) y.a), this, null, null, 6, null);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.p) {
            Object obj = (jon) getTarget();
            if (obj != null) {
                Resources resources;
                int i;
                com.snap.identity.ui.settings.shared.SettingsPhoneButton.a aVar;
                akcr.a(obj, "target ?: return");
                d();
                jro a = juj.a(this.d);
                a(Boolean.valueOf(a.d), new j(obj.a()), new p(obj.a()));
                if ((akcr.a(obj.a().c, a.i) ^ 1) != 0) {
                    obj.a().b(a.i);
                }
                if ((akcr.a(obj.a().b, a.h) ^ 1) != 0) {
                    obj.a().a(a.h);
                }
                if (obj.d().isChecked() != this.c) {
                    obj.d().setChecked(this.c);
                }
                if ((akcr.a(obj.f().getText().toString(), a.j) ^ 1) != 0) {
                    obj.f().setText(a.j);
                }
                int i2 = 8;
                int i3 = a.c ? 8 : 0;
                if (obj.f().getVisibility() != i3) {
                    obj.f().setVisibility(i3);
                    if (i3 == 0) {
                        obj.f().requestFocus();
                    }
                }
                a(Integer.valueOf(a.k ? 0 : 8), new q(obj.g()), new r(obj.g()));
                Object obj2 = (akgb.a((CharSequence) a.f) ^ 1) != 0 ? a.f : a.e;
                a(Integer.valueOf(akgb.a((CharSequence) obj2) ? 8 : 0), new s(obj.b()), new t(obj.b()));
                a(obj2, new u(obj.b()), new v(obj.b()));
                if ((akgb.a(a.f) ^ 1) != 0) {
                    resources = this.l.getResources();
                    i = R.color.error_red;
                } else {
                    resources = this.l.getResources();
                    i = R.color.regular_green;
                }
                a(Integer.valueOf(resources.getColor(i)), new w(obj.b()), new k(obj.b()));
                if ((akgb.a(a.g) ^ 1) != 0) {
                    i2 = 0;
                }
                a(Integer.valueOf(i2), new l(obj.h()), new m(obj.h()));
                a(a.g, new n(obj.h()), new o(obj.h()));
                switch (jok.a[a.b.ordinal()]) {
                    case 1:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(2, a.l);
                        break;
                    case 2:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(1, a.l);
                        break;
                    case 3:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(4, a.l);
                        break;
                    case 4:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(0, a.l);
                        break;
                    case 5:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(5, a.l);
                        break;
                    case 6:
                        aVar = new com.snap.identity.ui.settings.shared.SettingsPhoneButton.a(6, a.l);
                        break;
                    default:
                        throw new ajxk();
                }
                Integer currentState = obj.i().getCurrentState();
                int i4 = aVar.a;
                if (currentState == null || currentState.intValue() != i4 || aVar.a == 4) {
                    obj.i().a(aVar);
                }
                c();
            }
        }
    }

    public final void b(String str) {
        akcr.b(str, "error");
        this.d = this.m.d(this.d, str);
        a(this.l);
        b();
    }

    public final void dropTarget() {
        super.dropTarget();
        jon jon = (jon) getTarget();
        if (jon != null) {
            defpackage.j lifecycle = jon.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
    }

    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onCreate() {
        Activity activity = this.v;
        Object obj = this.f.get();
        akcr.a(obj, "authStore.get()");
        gpb gpb = (gpb) obj;
        Object obj2 = this.h.get();
        akcr.a(obj2, "configProvider.get()");
        ftl ftl = (ftl) obj2;
        Object obj3 = this.w.get();
        akcr.a(obj3, "permissionHelper.get()");
        Object h = juo.a(activity, gpb, ftl, (ifs) obj3, this.a, false, null, 96).a((ajdw) this.a.h()).h(i.a);
        akcr.a(h, "TelephonyUtils.loadPhone…utofillSource.DEFAULT)) }");
        obj = ((ftl) this.h.get()).p(jic.IS_SEARCHABLE_BY_PHONE_NUMBER).b((ajdw) this.a.h()).f((ajdt) ajdp.b(Boolean.TRUE));
        akcr.a(obj, "configProvider.get().obs…xt(Observable.just(true))");
        ajej a = ajdp.a((ajdt) h.i(), (ajdt) obj, (ajex) d.a).a((ajdw) this.a.l()).a((ajfb) new e(this), (ajfb) new f(this));
        zln zln = this;
        zln.bindTo$default(this, a, zln, null, null, 6, null);
        zln.bindTo$default(this, this.b.c.a((ajdw) this.a.l()).a((ajfb) new g(this), (ajfb) h.a), zln, null, null, 6, null);
    }

    @defpackage.s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.b.b();
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.p = true;
        d();
        ((jun) this.n.get()).a(this.l);
    }

    @defpackage.s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        this.p = false;
        c();
        b();
    }
}

package com.snap.identity.ui.settings.birthday;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;
import android.widget.TextView;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.identity.ui.settings.shared.SettingsStatefulButton;
import com.snapchat.android.R;
import defpackage.aajt;
import defpackage.abhu;
import defpackage.abkq;
import defpackage.achb;
import defpackage.achd;
import defpackage.acig;
import defpackage.acip;
import defpackage.aepa;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akrl;
import defpackage.dib;
import defpackage.fth;
import defpackage.ftl;
import defpackage.gpb;
import defpackage.hxs;
import defpackage.ilv;
import defpackage.iog;
import defpackage.iqe;
import defpackage.ira;
import defpackage.irc;
import defpackage.itw;
import defpackage.jic;
import defpackage.jlr;
import defpackage.jlt;
import defpackage.joe;
import defpackage.jof;
import defpackage.jvv;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zll;
import defpackage.zln;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class SettingsBirthdayPresenter extends zll<jlt> implements defpackage.k {
    static final GregorianCalendar m = new GregorianCalendar(1900, 0, 1);
    private static final String w = w;
    boolean a;
    GregorianCalendar b;
    GregorianCalendar c;
    boolean d;
    boolean e;
    final zfw f = zgb.a(itw.d, w);
    final OnDateChangedListener g = new c(this);
    final achb<zjm, zjk> h;
    final Context i;
    final ira j;
    final aipn<iqe> k;
    final aipn<jof> l;
    private int n = 2;
    private boolean o;
    private final OnClickListener p = new e(this);
    private final OnCheckedChangeListener q = new d(this);
    private final OnClickListener r = new f(this);
    private final OnClickListener s = new h(this);
    private final gpb t;
    private final hxs u;
    private final ftl v;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public enum b {
        UPDATE_MORE_THAN_TWICE_ERROR,
        UNDER_THIRTEEN_ERROR,
        NEEDS_LAST_CHANGE_CONFIRMATION_ERROR,
        UNRECOGNIZED;
        
        public static final a Companion = null;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(byte b) {
                this();
            }

            public static b a(String str) {
                akcr.b(str, "value");
                try {
                    Object obj = Locale.US;
                    akcr.a(obj, "Locale.US");
                    Object toUpperCase = str.toUpperCase(obj);
                    akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase(locale)");
                    return b.valueOf(toUpperCase);
                } catch (Exception unused) {
                    return b.UNRECOGNIZED;
                }
            }
        }

        static {
            Companion = new a();
        }
    }

    static final class c implements OnDateChangedListener {
        private /* synthetic */ SettingsBirthdayPresenter a;

        c(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
            akrl a = defpackage.iyn.a.a(i, i2, i3);
            if (this.a.e && this.a.b().compareTo(new GregorianCalendar(a.c(), i2 - 1, i3)) >= 0) {
                this.a.c = new GregorianCalendar(a.c(), a.d() - 1, a.f());
            }
            this.a.a((akcr.a(this.a.c, this.a.b) ^ 1) != 0 ? 0 : 2, false);
        }
    }

    static final class d implements OnCheckedChangeListener {
        private /* synthetic */ SettingsBirthdayPresenter a;

        d(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
            settingsBirthdayPresenter.d = z;
            settingsBirthdayPresenter.a();
        }
    }

    static final class e implements OnClickListener {
        private /* synthetic */ SettingsBirthdayPresenter a;

        e(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final void onClick(View view) {
            SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
            settingsBirthdayPresenter.e = true;
            settingsBirthdayPresenter.a();
        }
    }

    static final class f implements OnClickListener {
        private /* synthetic */ SettingsBirthdayPresenter a;

        f(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final void onClick(View view) {
            SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
            String string = settingsBirthdayPresenter.i.getResources().getString(R.string.settings_birthday_update_my_birthday, new Object[]{settingsBirthdayPresenter.c()});
            String string2 = settingsBirthdayPresenter.i.getResources().getString(R.string.settings_birthday_update_years_old, new Object[]{Integer.valueOf(jvv.a(settingsBirthdayPresenter.c))});
            defpackage.zgy.a aVar = new defpackage.zgy.a(settingsBirthdayPresenter.i, settingsBirthdayPresenter.h, new zjm(irc.t, "update_info", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24);
            akcr.a((Object) string, "title");
            defpackage.zgy.a a = aVar.a(string);
            akcr.a((Object) string2, "info");
            zgy a2 = defpackage.zgy.a.a(a.b(string2).a((int) R.string.settings_birthday_ok, (akbl) new g(settingsBirthdayPresenter), true), null, false, null, null, null, 31).a();
            settingsBirthdayPresenter.h.a((achd) a2, a2.a, null);
        }
    }

    static final class h implements OnClickListener {
        private /* synthetic */ SettingsBirthdayPresenter a;

        h(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final void onClick(View view) {
            this.a.a(0, false);
        }
    }

    static final class ab<T> implements ajfb<String> {
        private /* synthetic */ SettingsBirthdayPresenter a;

        ab(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsBirthdayPresenter.a(this.a, (String) obj);
        }
    }

    static final class ac<T> implements ajfb<Throwable> {
        private /* synthetic */ SettingsBirthdayPresenter a;

        ac(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            SettingsBirthdayPresenter.a(this.a, null);
        }
    }

    static final class ad<T> implements ajfb<aepa> {
        private /* synthetic */ SettingsBirthdayPresenter a;

        ad(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2 = (aepa) obj;
            SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
            akcr.a(obj2, "resp");
            Object obj3 = obj2.b;
            akcr.a(obj3, "response.logged");
            if (obj3.booleanValue()) {
                iqe iqe = (iqe) settingsBirthdayPresenter.k.get();
                boolean z = settingsBirthdayPresenter.b != null;
                ((dib) iqe.b.get()).a((aajt) iqe.a(abhu.BIRTHDAY, z, true));
                ((ilv) iqe.a.get()).c(iog.SETTINGS_BIRTHDAY_CHANGE.a("before", z).a("after", true), 1);
                settingsBirthdayPresenter.b = settingsBirthdayPresenter.c;
                settingsBirthdayPresenter.a(2, false);
                if (settingsBirthdayPresenter.i instanceof Activity) {
                    ((Activity) settingsBirthdayPresenter.i).onBackPressed();
                    return;
                }
            }
            b bVar;
            if (TextUtils.isEmpty(obj2.a)) {
                bVar = b.UNRECOGNIZED;
            } else {
                obj2 = obj2.a;
                akcr.a(obj2, "response.message");
                bVar = a.a(obj2);
            }
            int i = jlr.a[bVar.ordinal()];
            zgy a;
            if (i == 1) {
                akcr.a(settingsBirthdayPresenter.j.j().a((ajdw) settingsBirthdayPresenter.f.l()).a((ajfb) new ab(settingsBirthdayPresenter), (ajfb) new ac(settingsBirthdayPresenter)), "identityApi.fetchBirthda…                       })");
            } else if (i == 2) {
                settingsBirthdayPresenter.a(0, false);
                a = defpackage.zgy.a.a(new defpackage.zgy.a(settingsBirthdayPresenter.i, settingsBirthdayPresenter.h, new zjm(irc.t, "confirm_change_birthday_dialog", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.settings_birthday_confirmation_title).b((int) R.string.settings_birthday_confirmation_subtitle).a((int) R.string.continue_text, (akbl) new z(settingsBirthdayPresenter), true), null, false, null, null, null, 31).a();
                settingsBirthdayPresenter.h.b((acig) new acip(settingsBirthdayPresenter.h, a, a.a));
            } else if (i != 3) {
                settingsBirthdayPresenter.a(0, true);
            } else {
                settingsBirthdayPresenter.a(0, false);
                a = new defpackage.zgy.a(settingsBirthdayPresenter.i, settingsBirthdayPresenter.h, new zjm(irc.t, "too_many_updates", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 24).a((int) R.string.settings_birthday_many_updates_title).b((int) R.string.settings_birthday_many_updates_content).a((int) R.string.settings_birthday_ok, (akbl) new aa(settingsBirthdayPresenter), true).a();
                settingsBirthdayPresenter.h.b((acig) new acip(settingsBirthdayPresenter.h, a, a.a));
            }
        }
    }

    static final class i<T> implements ajfb<abkq> {
        private /* synthetic */ SettingsBirthdayPresenter a;

        i(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            GregorianCalendar gregorianCalendar;
            SettingsBirthdayPresenter settingsBirthdayPresenter;
            abkq abkq = (abkq) obj;
            this.a.a = abkq.h != null;
            if (this.a.a) {
                gregorianCalendar = new GregorianCalendar();
                Long l = abkq.h;
                gregorianCalendar.setTimeInMillis(l != null ? l.longValue() : 0);
                settingsBirthdayPresenter = this.a;
            } else {
                settingsBirthdayPresenter = this.a;
                gregorianCalendar = null;
            }
            settingsBirthdayPresenter.b = gregorianCalendar;
            settingsBirthdayPresenter = this.a;
            settingsBirthdayPresenter.c = settingsBirthdayPresenter.b;
            this.a.a(2, false);
            settingsBirthdayPresenter = this.a;
            Object obj2 = (jlt) settingsBirthdayPresenter.getTarget();
            if (obj2 != null) {
                akcr.a(obj2, "target ?: return");
                GregorianCalendar b = settingsBirthdayPresenter.b();
                GregorianCalendar gregorianCalendar2 = settingsBirthdayPresenter.b;
                if (gregorianCalendar2 == null) {
                    gregorianCalendar2 = new GregorianCalendar();
                    gregorianCalendar2.add(1, -18);
                }
                akrl a = defpackage.iyn.a.a(gregorianCalendar2.getTimeInMillis());
                obj2.g().init(a.c(), a.d() - 1, a.f(), settingsBirthdayPresenter.g);
                obj2.g().setMinDate(SettingsBirthdayPresenter.m.getTimeInMillis());
                obj2.g().setMaxDate(b.getTimeInMillis());
            }
            this.a.a();
        }
    }

    static final class j<T> implements ajfb<Boolean> {
        private /* synthetic */ SettingsBirthdayPresenter a;

        j(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
            akcr.a(obj, "value");
            settingsBirthdayPresenter.d = obj.booleanValue();
            this.a.a();
        }
    }

    static final class aa extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsBirthdayPresenter a;

        aa(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
            settingsBirthdayPresenter.c = settingsBirthdayPresenter.b;
            settingsBirthdayPresenter = this.a;
            settingsBirthdayPresenter.e = false;
            settingsBirthdayPresenter.a();
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SettingsBirthdayPresenter a;

        g(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(false);
            return ajxw.a;
        }
    }

    static final class z extends akcs implements akbl<View, ajxw> {
        final /* synthetic */ SettingsBirthdayPresenter a;

        /* renamed from: com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$z$1 */
        static final class AnonymousClass1<T> implements ajfb<joe> {
            private /* synthetic */ z a;

            AnonymousClass1(z zVar) {
                this.a = zVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (((joe) obj).a) {
                    this.a.a.a(true);
                }
                this.a.a.a();
            }
        }

        /* renamed from: com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$z$2 */
        static final class AnonymousClass2<T> implements ajfb<Throwable> {
            private /* synthetic */ z a;

            AnonymousClass2(z zVar) {
                this.a = zVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.a();
            }
        }

        z(SettingsBirthdayPresenter settingsBirthdayPresenter) {
            this.a = settingsBirthdayPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SettingsBirthdayPresenter settingsBirthdayPresenter = this.a;
            zln.bindTo$default(settingsBirthdayPresenter, jof.a((jof) settingsBirthdayPresenter.l.get(), R.string.settings_birthday, R.string.settings_birthday_verify_password, false, false, 12).b((ajdw) this.a.f.l()).a((ajfb) new AnonymousClass1(this), (ajfb) new AnonymousClass2(this)), this.a, null, null, 6, null);
            return ajxw.a;
        }
    }

    static final class k extends akcq implements akbk<String> {
        k(CharSequence charSequence) {
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

    static final class l extends akcq implements akbl<Integer, ajxw> {
        l(SettingsStatefulButton settingsStatefulButton) {
            super(1, settingsStatefulButton);
        }

        public final String getName() {
            return "setState";
        }

        public final akej getOwner() {
            return akde.a(SettingsStatefulButton.class);
        }

        public final String getSignature() {
            return "setState(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((SettingsStatefulButton) this.receiver).setState(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class m extends akcq implements akbk<Integer> {
        m(SettingsStatefulButton settingsStatefulButton) {
            super(0, settingsStatefulButton);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(SettingsStatefulButton.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((SettingsStatefulButton) this.receiver).getVisibility());
        }
    }

    static final class n extends akcq implements akbl<Integer, ajxw> {
        n(SettingsStatefulButton settingsStatefulButton) {
            super(1, settingsStatefulButton);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(SettingsStatefulButton.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((SettingsStatefulButton) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class o extends akcq implements akbk<Integer> {
        o(View view) {
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

    static final class p extends akcq implements akbl<Integer, ajxw> {
        p(View view) {
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

    static final class q extends akcq implements akbk<Integer> {
        q(TextView textView) {
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

    static final class r extends akcq implements akbl<Integer, ajxw> {
        r(TextView textView) {
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

    static final class s extends akcq implements akbl<CharSequence, ajxw> {
        s(TextView textView) {
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

    static final class t extends akcq implements akbk<Boolean> {
        t(CheckBox checkBox) {
            super(0, checkBox);
        }

        public final String getName() {
            return "isClickable";
        }

        public final akej getOwner() {
            return akde.a(CheckBox.class);
        }

        public final String getSignature() {
            return "isClickable()Z";
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((CheckBox) this.receiver).isClickable());
        }
    }

    static final class u extends akcq implements akbl<Boolean, ajxw> {
        u(CheckBox checkBox) {
            super(1, checkBox);
        }

        public final String getName() {
            return "setClickable";
        }

        public final akej getOwner() {
            return akde.a(CheckBox.class);
        }

        public final String getSignature() {
            return "setClickable(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((CheckBox) this.receiver).setClickable(((Boolean) obj).booleanValue());
            return ajxw.a;
        }
    }

    static final class v extends akcq implements akbk<Boolean> {
        v(CheckBox checkBox) {
            super(0, checkBox);
        }

        public final String getName() {
            return "isChecked";
        }

        public final akej getOwner() {
            return akde.a(CheckBox.class);
        }

        public final String getSignature() {
            return "isChecked()Z";
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((CheckBox) this.receiver).isChecked());
        }
    }

    static final class w extends akcq implements akbl<Boolean, ajxw> {
        w(CheckBox checkBox) {
            super(1, checkBox);
        }

        public final String getName() {
            return "setChecked";
        }

        public final akej getOwner() {
            return akde.a(CheckBox.class);
        }

        public final String getSignature() {
            return "setChecked(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((CheckBox) this.receiver).setChecked(((Boolean) obj).booleanValue());
            return ajxw.a;
        }
    }

    static final class x extends akcq implements akbk<Integer> {
        x(DatePicker datePicker) {
            super(0, datePicker);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(DatePicker.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((DatePicker) this.receiver).getVisibility());
        }
    }

    static final class y extends akcq implements akbl<Integer, ajxw> {
        y(DatePicker datePicker) {
            super(1, datePicker);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(DatePicker.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((DatePicker) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public SettingsBirthdayPresenter(gpb gpb, achb<zjm, zjk> achb, Context context, ira ira, hxs hxs, aipn<iqe> aipn, ftl ftl, aipn<jof> aipn2, zgb zgb) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(achb, "navigationHost");
        akcr.b(context, "context");
        akcr.b(ira, "identityApi");
        akcr.b(hxs, "featureConfig");
        akcr.b(aipn, LocalMessageActionModel.ANALYTICS);
        akcr.b(ftl, "configProvider");
        akcr.b(aipn2, "passwordValidationHelper");
        akcr.b(zgb, "schedulersProvider");
        this.t = gpb;
        this.h = achb;
        this.i = context;
        this.j = ira;
        this.u = hxs;
        this.k = aipn;
        this.v = ftl;
        this.l = aipn2;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0106  */
    public final void a() {
        /*
        r8 = this;
        r0 = r8.getTarget();
        r0 = (defpackage.jlt) r0;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r1 = "target ?: return";
        defpackage.akcr.a(r0, r1);
        r1 = r8.c();
        r2 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$k;
        r3 = r0.a();
        r3 = r3.getText();
        r2.<init>(r3);
        r2 = (defpackage.akbk) r2;
        r3 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$s;
        r4 = r0.a();
        r3.<init>(r4);
        r3 = (defpackage.akbl) r3;
        defpackage.jrl.a(r1, r2, r3);
        r1 = r8.b;
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0037;
    L_0x0035:
        r1 = 1;
        goto L_0x0038;
    L_0x0037:
        r1 = 0;
    L_0x0038:
        r1 = java.lang.Boolean.valueOf(r1);
        r4 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$t;
        r5 = r0.f();
        r4.<init>(r5);
        r4 = (defpackage.akbk) r4;
        r5 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$u;
        r6 = r0.f();
        r5.<init>(r6);
        r5 = (defpackage.akbl) r5;
        defpackage.jrl.a(r1, r4, r5);
        r1 = r8.d;
        r1 = java.lang.Boolean.valueOf(r1);
        r4 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$v;
        r5 = r0.f();
        r4.<init>(r5);
        r4 = (defpackage.akbk) r4;
        r5 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$w;
        r6 = r0.f();
        r5.<init>(r6);
        r5 = (defpackage.akbl) r5;
        defpackage.jrl.a(r1, r4, r5);
        r1 = r8.e;
        r4 = 8;
        if (r1 == 0) goto L_0x007c;
    L_0x007a:
        r1 = 0;
        goto L_0x007e;
    L_0x007c:
        r1 = 8;
    L_0x007e:
        r1 = java.lang.Integer.valueOf(r1);
        r5 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$x;
        r6 = r0.g();
        r5.<init>(r6);
        r5 = (defpackage.akbk) r5;
        r6 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$y;
        r7 = r0.g();
        r6.<init>(r7);
        r6 = (defpackage.akbl) r6;
        defpackage.jrl.a(r1, r5, r6);
        r1 = r8.n;
        r1 = java.lang.Integer.valueOf(r1);
        r5 = new jls;
        r6 = r0.b();
        r5.<init>(r6);
        r5 = (defpackage.akbk) r5;
        r6 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$l;
        r7 = r0.b();
        r6.<init>(r7);
        r6 = (defpackage.akbl) r6;
        defpackage.jrl.a(r1, r5, r6);
        r1 = r8.e;
        if (r1 == 0) goto L_0x00e2;
    L_0x00be:
        r1 = r8.b;
        r5 = 0;
        if (r1 == 0) goto L_0x00cc;
    L_0x00c3:
        r6 = r1.getTimeInMillis();
        r1 = java.lang.Long.valueOf(r6);
        goto L_0x00cd;
    L_0x00cc:
        r1 = r5;
    L_0x00cd:
        r6 = r8.c;
        if (r6 == 0) goto L_0x00d9;
    L_0x00d1:
        r5 = r6.getTimeInMillis();
        r5 = java.lang.Long.valueOf(r5);
    L_0x00d9:
        r1 = defpackage.akcr.a(r1, r5);
        r1 = r1 ^ r2;
        if (r1 == 0) goto L_0x00e2;
    L_0x00e0:
        r1 = 0;
        goto L_0x00e4;
    L_0x00e2:
        r1 = 8;
    L_0x00e4:
        r1 = java.lang.Integer.valueOf(r1);
        r2 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$m;
        r5 = r0.b();
        r2.<init>(r5);
        r2 = (defpackage.akbk) r2;
        r5 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$n;
        r6 = r0.b();
        r5.<init>(r6);
        r5 = (defpackage.akbl) r5;
        defpackage.jrl.a(r1, r2, r5);
        r1 = r8.o;
        if (r1 == 0) goto L_0x0106;
    L_0x0105:
        goto L_0x0108;
    L_0x0106:
        r3 = 8;
    L_0x0108:
        r1 = java.lang.Integer.valueOf(r3);
        r2 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$o;
        r4 = r0.d();
        r2.<init>(r4);
        r2 = (defpackage.akbk) r2;
        r4 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$p;
        r5 = r0.d();
        r4.<init>(r5);
        r4 = (defpackage.akbl) r4;
        defpackage.jrl.a(r1, r2, r4);
        r1 = java.lang.Integer.valueOf(r3);
        r2 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$q;
        r3 = r0.c();
        r2.<init>(r3);
        r2 = (defpackage.akbk) r2;
        r3 = new com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter$r;
        r0 = r0.c();
        r3.<init>(r0);
        r3 = (defpackage.akbl) r3;
        defpackage.jrl.a(r1, r2, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.ui.settings.birthday.SettingsBirthdayPresenter.a():void");
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        this.n = i;
        this.o = z;
        a();
    }

    /* renamed from: a */
    public final void takeTarget(jlt jlt) {
        akcr.b(jlt, "target");
        super.takeTarget(jlt);
        jlt.getLifecycle().a(this);
    }

    public final void a(boolean z) {
        a(1, false);
        ira ira = this.j;
        GregorianCalendar gregorianCalendar = this.c;
        if (gregorianCalendar == null) {
            akcr.a();
        }
        zln.bindTo$default(this, ira.a(gregorianCalendar, z).a((ajdw) this.f.l()).e((ajfb) new ad(this)), this, null, null, 6, null);
    }

    /* Access modifiers changed, original: final */
    public final GregorianCalendar b() {
        Calendar instance = GregorianCalendar.getInstance();
        if (instance != null) {
            GregorianCalendar gregorianCalendar = (GregorianCalendar) instance;
            gregorianCalendar.add(1, this.a ? -13 : 0);
            return gregorianCalendar;
        }
        throw new ajxt("null cannot be cast to non-null type java.util.GregorianCalendar");
    }

    /* Access modifiers changed, original: final */
    public final String c() {
        if (this.c == null) {
            return "";
        }
        String string = this.i.getResources().getString(R.string.settings_birthday_format);
        GregorianCalendar gregorianCalendar = this.c;
        if (gregorianCalendar == null) {
            akcr.a();
        }
        Object a = jvv.a(string, Long.valueOf(gregorianCalendar.getTimeInMillis()));
        akcr.a(a, "BirthdayUtils.formatBirt…dBirthday!!.timeInMillis)");
        return a;
    }

    public final void dropTarget() {
        jlt jlt = (jlt) getTarget();
        if (jlt != null) {
            defpackage.j lifecycle = jlt.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onPause() {
        this.u.a((fth) jic.ENABLE_BIRTHDAY_PARTY, Boolean.valueOf(this.d));
    }

    @defpackage.s(a = defpackage.j.a.ON_START)
    public final void onStart() {
        zln zln = this;
        zln.bindTo$default(this, this.t.c().a((ajdw) this.f.l()).e().e((ajfb) new i(this)), zln, null, null, 6, null);
        zln.bindTo$default(this, this.v.p(jic.ENABLE_BIRTHDAY_PARTY).b((ajdw) this.f.h()).a((ajdw) this.f.l()).f((ajfb) new j(this)), zln, null, null, 6, null);
        jlt jlt = (jlt) getTarget();
        if (jlt != null) {
            jlt.a().setOnClickListener(this.p);
            jlt.f().setOnCheckedChangeListener(this.q);
            jlt.b().setOnClickListener(this.r);
            jlt.d().setOnClickListener(this.s);
        }
        a();
    }
}

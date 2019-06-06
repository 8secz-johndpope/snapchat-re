package com.snap.identity.loginsignup.ui.pages.birthday;

import android.content.Context;
import android.view.View;
import android.widget.DatePicker.OnDateChangedListener;
import com.snap.core.db.record.FriendModel;
import com.snap.identity.loginsignup.RegistrationReengagementNotificationMushroomReceiver;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achd;
import defpackage.aipn;
import defpackage.ajef;
import defpackage.ajfb;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.akgb;
import defpackage.akrl;
import defpackage.irc;
import defpackage.izo;
import defpackage.izp;
import defpackage.izr;
import defpackage.jas;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jel;
import defpackage.jem;
import defpackage.k;
import defpackage.s;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import java.util.GregorianCalendar;

public final class BirthdayPresenter extends zll<jem> implements k {
    akrl a;
    String b = "";
    final ajxe c;
    final aipn<zke> d;
    final aipn<Context> e;
    aipn<achb<zjm, zjk>> f;
    final aipn<jbw> g;
    private final int h = 18;
    private boolean i = true;
    private final b j;
    private final akbl<View, ajxw> k;

    public static final class b implements OnDateChangedListener {
        boolean a;
        boolean b;
        final /* synthetic */ BirthdayPresenter c;

        b(BirthdayPresenter birthdayPresenter) {
            this.c = birthdayPresenter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
        /* JADX WARNING: Missing block: B:9:0x0039, code skipped:
            if (r0 > r1.e()) goto L_0x001b;
     */
        public final void onDateChanged(android.widget.DatePicker r6, int r7, int r8, int r9) {
            /*
            r5 = this;
            r0 = r5.a;
            if (r0 != 0) goto L_0x0005;
        L_0x0004:
            return;
        L_0x0005:
            r0 = defpackage.iyn.a.a(r7, r8, r9);
            r1 = r0.c();
            r2 = defpackage.iyn.b;
            r3 = "TODAY";
            defpackage.akcr.a(r2, r3);
            r2 = r2.c();
            r4 = 1;
            if (r1 <= r2) goto L_0x001d;
        L_0x001b:
            r0 = 1;
            goto L_0x003d;
        L_0x001d:
            r1 = r0.c();
            r2 = defpackage.iyn.b;
            defpackage.akcr.a(r2, r3);
            r2 = r2.c();
            if (r1 < r2) goto L_0x003c;
        L_0x002c:
            r0 = r0.e();
            r1 = defpackage.iyn.b;
            defpackage.akcr.a(r1, r3);
            r1 = r1.e();
            if (r0 <= r1) goto L_0x003c;
        L_0x003b:
            goto L_0x001b;
        L_0x003c:
            r0 = 0;
        L_0x003d:
            if (r0 == 0) goto L_0x0072;
        L_0x003f:
            r7 = r5.c;
            r7 = r7.a;
            if (r7 == 0) goto L_0x0071;
        L_0x0045:
            r8 = new java.util.GregorianCalendar;
            r9 = r7.c();
            r0 = r7.d();
            r0 = r0 - r4;
            r7 = r7.f();
            r8.<init>(r9, r0, r7);
            r7 = r8.getTimeInMillis();
            r7 = defpackage.iyn.a.a(r7);
            if (r6 == 0) goto L_0x0071;
        L_0x0061:
            r8 = r7.c();
            r9 = r7.d();
            r9 = r9 - r4;
            r7 = r7.f();
            r6.updateDate(r8, r9, r7);
        L_0x0071:
            return;
        L_0x0072:
            r6 = r5.c;
            r7 = defpackage.iyn.a.a(r7, r8, r9);
            com.snap.identity.loginsignup.ui.pages.birthday.BirthdayPresenter.a(r6, r7);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.birthday.BirthdayPresenter$b.onDateChanged(android.widget.DatePicker, int, int, int):void");
        }
    }

    static final class d<T> implements ajfb<jeb> {
        private /* synthetic */ BirthdayPresenter a;

        d(BirthdayPresenter birthdayPresenter) {
            this.a = birthdayPresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jeb) obj;
            BirthdayPresenter birthdayPresenter = this.a;
            akcr.a(obj, "session");
            birthdayPresenter.b = obj.z;
            birthdayPresenter.a();
        }
    }

    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BirthdayPresenter a;

        a(BirthdayPresenter birthdayPresenter) {
            this.a = birthdayPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            BirthdayPresenter birthdayPresenter = this.a;
            akrl akrl = birthdayPresenter.a;
            if (akrl != null) {
                akcr.b(akrl, "birthdate");
                if (defpackage.iyn.a.a(akrl, new akrl()) >= 13) {
                    ((zke) birthdayPresenter.d.get()).a(new izo(defpackage.iyn.a.a(akrl)));
                } else {
                    ((jas) birthdayPresenter.c.b()).a(RegistrationReengagementNotificationMushroomReceiver.class);
                    zjm zjm = new zjm(irc.t, "LoginSignup.BirthdayPresenter", false, false, true, false, null, false, false, false, false, null, 4076);
                    Object obj2 = birthdayPresenter.e.get();
                    akcr.a(obj2, "context.get()");
                    Context context = (Context) obj2;
                    obj2 = birthdayPresenter.f.get();
                    akcr.a(obj2, "navigationHost.get()");
                    zgy a = new defpackage.zgy.a(context, (achb) obj2, zjm, false, null, 24).b((int) R.string.signup_birthday_not_eligible).a((int) R.string.signup_ok_button, (akbl) new c(birthdayPresenter), false).a();
                    ((achb) birthdayPresenter.f.get()).a((achd) a, a.a, null);
                }
            }
            return ajxw.a;
        }
    }

    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ BirthdayPresenter a;

        c(BirthdayPresenter birthdayPresenter) {
            this.a = birthdayPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((zke) this.a.d.get()).a(new izp());
            return ajxw.a;
        }
    }

    static final class e extends akcq implements akbk<jas> {
        e(ajwy ajwy) {
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
        new aken[1][0] = new akdc(akde.a(BirthdayPresenter.class), "reengPushManager", "getReengPushManager()Lcom/snap/identity/loginsignup/RegistrationReengagementPushManager;");
    }

    public BirthdayPresenter(aipn<zke> aipn, aipn<Context> aipn2, aipn<achb<zjm, zjk>> aipn3, aipn<jbw> aipn4, ajwy<jas> ajwy) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "context");
        akcr.b(aipn3, "navigationHost");
        akcr.b(aipn4, "store");
        akcr.b(ajwy, "reengPushManagerProvider");
        this.d = aipn;
        this.e = aipn2;
        this.f = aipn3;
        this.g = aipn4;
        this.c = ajxh.a(new e(ajwy));
        this.j = new b(this);
        this.k = new a(this);
    }

    public static final /* synthetic */ void a(BirthdayPresenter birthdayPresenter, akrl akrl) {
        birthdayPresenter.a = akrl;
        if ((((CharSequence) birthdayPresenter.b).length() > 0 ? 1 : null) != null) {
            ((zke) birthdayPresenter.d.get()).a(new izr());
        }
        birthdayPresenter.b = "";
        birthdayPresenter.a();
    }

    private final void b() {
        jem jem = (jem) getTarget();
        if (jem != null) {
            jem.b().setOnClickListener(new jel(this.k));
            this.j.a = true;
        }
    }

    private final void c() {
        jem jem = (jem) getTarget();
        if (jem != null) {
            jem.b().setOnClickListener(null);
            this.j.a = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (!this.i) {
            Object obj = (jem) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                c();
                akrl akrl = this.a;
                int i = 1;
                if (akrl != null) {
                    Object b = defpackage.iyn.a.b(akrl);
                    if ((akcr.a(obj.a().getText().toString(), b) ^ 1) != 0) {
                        obj.a().setText((CharSequence) b);
                    }
                }
                if ((akcr.a(obj.d().getText().toString(), this.b) ^ 1) != 0) {
                    obj.d().setText(this.b);
                }
                if (this.a == null || !akgb.a(this.b)) {
                    i = 0;
                }
                obj.b().setState(i);
                b();
            }
        }
    }

    /* renamed from: a */
    public final void takeTarget(jem jem) {
        akcr.b(jem, "target");
        super.takeTarget(jem);
        jem.getLifecycle().a(this);
    }

    public final void dropTarget() {
        Object obj = (jem) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        zln.bindTo$default(this, ((jbw) this.g.get()).a().a(ajef.a()).f((ajfb) new d(this)), this, null, null, 6, null);
        this.a = defpackage.iyn.a.a(((jbw) this.g.get()).c().q);
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onResume() {
        Object obj = (jem) getTarget();
        if (obj != null) {
            akrl akrl;
            akcr.a(obj, "target ?: return");
            b bVar = this.j;
            akcr.b(obj, "target");
            Object obj2 = bVar.c.a;
            if (obj2 == null) {
                akrl = new akrl();
                obj2 = akrl.a(akrl.b.D().b(akrl.a, 18));
            }
            akcr.a(obj2, FriendModel.BIRTHDAY);
            akrl = defpackage.iyn.a.a(new GregorianCalendar(obj2.c(), obj2.d() - 1, obj2.f()).getTimeInMillis());
            if (bVar.b) {
                obj.c().updateDate(akrl.c(), akrl.d() - 1, akrl.f());
            } else {
                obj.c().init(akrl.c(), akrl.d() - 1, akrl.f(), bVar);
                bVar.b = true;
            }
            a();
        }
    }

    @s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        c();
        this.i = true;
    }

    @s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        b();
        this.i = false;
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import com.brightcove.player.event.Event;
import com.snap.identity.ui.legal.LegalAgreementActivity;
import com.snapchat.android.R;
import defpackage.zgy.a;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jjn */
public final class jjn {
    public final ajei a = new ajei();
    aipn<fwy> b;
    aipn<LegalAgreementActivity> c;
    final aipn<ilv> d;
    private final zfw e = zgb.a(jjo.b.callsite("LegalAgreementCoordinator"));
    private aipn<zkf> f;
    private aipn<achb<zjm, zjk>> g;
    private aipn<itj> h;

    /* renamed from: jjn$a */
    static final class a implements ajev {
        private /* synthetic */ jjn a;

        a(jjn jjn) {
            this.a = jjn;
        }

        public final void run() {
            ((LegalAgreementActivity) this.a.c.get()).onBackPressed();
        }
    }

    /* renamed from: jjn$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ieg.a("Failed to set SEEN_PRIVACY_POLICY_GDPR as true.", true, 0);
        }
    }

    /* renamed from: jjn$c */
    static final class c implements ajev {
        private /* synthetic */ jjn a;

        c(jjn jjn) {
            this.a = jjn;
        }

        public final void run() {
            ((ilv) this.a.d.get()).c(ind.TOU_ACCEPT.a("version", "7"), 1);
            ((LegalAgreementActivity) this.a.c.get()).onBackPressed();
        }
    }

    /* renamed from: jjn$d */
    static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ieg.a("Failed to set TOS_VERSION_7_ACCEPTED as true.", true, 0);
        }
    }

    /* renamed from: jjn$e */
    static final class e extends akcs implements akbl<View, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: jjn$f */
    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ jjn a;

        f(jjn jjn) {
            this.a = jjn;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            ((ilv) this.a.d.get()).c(ind.TOU_LOGOUT.a("version", "7"), 1);
            ((fwy) this.a.b.get()).a(fww.TERMS_OF_USE, false);
            ((LegalAgreementActivity) this.a.c.get()).onBackPressed();
            return ajxw.a;
        }
    }

    public jjn(aipn<zkf> aipn, aipn<achb<zjm, zjk>> aipn2, aipn<fwy> aipn3, aipn<LegalAgreementActivity> aipn4, aipn<itj> aipn5, zgb zgb, aipn<ilv> aipn6) {
        akcr.b(aipn, "rxBus");
        akcr.b(aipn2, "navigationHost");
        akcr.b(aipn3, "logoutHelper");
        akcr.b(aipn4, Event.ACTIVITY);
        akcr.b(aipn5, "legalAgreement");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn6, "graphene");
        this.f = aipn;
        this.g = aipn2;
        this.b = aipn3;
        this.c = aipn4;
        this.h = aipn5;
        this.d = aipn6;
    }

    private final void a() {
        this.a.a(((itj) this.h.get()).a(itl.PrivacyPolicy).b((ajdw) this.e.h()).a((ajdw) this.e.l()).a((ajev) new a(this), (ajfb) b.a));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAcceptPrivacyPolicy(jjk jjk) {
        akcr.b(jjk, "event");
        a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAcceptTermsOfUse(jjl jjl) {
        akcr.b(jjl, "event");
        this.a.a(((itj) this.h.get()).a(itl.TermsOfUse).b((ajdw) this.e.h()).a((ajdw) this.e.l()).a((ajev) new c(this), (ajfb) d.a));
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCancelPrivacyPolicy(jjm jjm) {
        akcr.b(jjm, "event");
        a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onLogout(jjs jjs) {
        akcr.b(jjs, "event");
        zjm zjm = new zjm(jjo.b, "legal_logout_confirmation", false, false, true, false, null, false, false, false, false, null, 4076);
        Object obj = this.c.get();
        akcr.a(obj, "activity.get()");
        Context context = (Context) obj;
        obj = this.g.get();
        akcr.a(obj, "navigationHost.get()");
        zgy a = a.a(new a(context, (achb) obj, zjm, false, null, 24).b((int) R.string.tos_logout_dialog_body).a((int) R.string.tos_logout_dialog_title).a((int) R.string.tos_go_back, (akbl) e.a, true), (akbl) new f(this), false, Integer.valueOf(R.string.tos_logout), null, null, 26).a();
        ((achb) this.g.get()).a((achd) a, a.a, null);
    }
}

package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.brightcove.player.event.Event;
import defpackage.iti.a;

/* renamed from: itj */
public final class itj implements iti {
    private aipn<jif> a;
    private aipn<fwx> b;
    private final aipn<gqr> c;

    /* renamed from: itj$b */
    static final class b<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            boolean z = ((Boolean) obj).booleanValue() && !((Boolean) obj2).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: itj$a */
    static final class a<T1, T2, R> implements ajex<Boolean, Boolean, defpackage.iti.a> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return !((Boolean) obj).booleanValue() ? defpackage.iti.a.NeedTermsOfUse : ((Boolean) obj2).booleanValue() ? defpackage.iti.a.NeedPrivacyPolicy : defpackage.iti.a.AllAccepted;
        }
    }

    public itj(aipn<jif> aipn, aipn<fwx> aipn2, aipn<gqr> aipn3) {
        akcr.b(aipn, "legalAgreementStore");
        akcr.b(aipn2, "intentFactory");
        akcr.b(aipn3, "exceptionTracker");
        this.a = aipn;
        this.b = aipn2;
        this.c = aipn3;
    }

    private final void a(Activity activity, itl itl) {
        Intent a = ((fwx) this.b.get()).a("snap.intent.action.REQUEST_LEGAL");
        a.putExtra("REQUEST_LEGAL_AGREEMENT_TYPE", itl.name());
        try {
            activity.startActivity(a);
        } catch (ActivityNotFoundException e) {
            ((gqr) this.c.get()).a(gqt.HIGH, e, jjo.b.callsite("Launch Agreement"));
        }
    }

    public final ajcx a(itl itl) {
        hxs hxs;
        iui iui;
        akcr.b(itl, "legalAgreementType");
        int i = itk.b[itl.ordinal()];
        if (i == 1) {
            hxs = ((jif) this.a.get()).b;
            iui = iui.TOS_VERSION_7_ACCEPTED;
        } else if (i == 2) {
            hxs = ((jif) this.a.get()).b;
            iui = iui.SEEN_PRIVACY_POLICY_GDPR;
        } else {
            throw new ajxk();
        }
        return hxs.c((fth) iui, Boolean.TRUE);
    }

    public final ajdp<a> a() {
        jif jif = (jif) this.a.get();
        Object p = jif.a.p(iui.TOS_VERSION_7_ACCEPTED);
        akcr.a(p, "configProvider.observeBo…n(TOS_VERSION_7_ACCEPTED)");
        Object p2 = jif.a.p(fxs.FEATURE_CONFIG_SYNCED_CLIENT_PROPERTIES);
        akcr.a(p2, "configProvider.observeBo…SYNCED_CLIENT_PROPERTIES)");
        ajdt a = jif.a(p, p2);
        jif jif2 = (jif) this.a.get();
        Object p3 = jif2.a.p(iui.SHOW_PRIVACY_POLICY_GDPR);
        akcr.a(p3, "configProvider.observeBo…SHOW_PRIVACY_POLICY_GDPR)");
        p = jif2.a.p(fxs.FEATURE_CONFIG_SYNCED_FEATURE_SETTINGS);
        String str = "configProvider.observeBo…_SYNCED_FEATURE_SETTINGS)";
        akcr.a(p, str);
        ajdt a2 = jif.a(p3, p);
        jif jif3 = (jif) this.a.get();
        Object p4 = jif3.a.p(iui.SEEN_PRIVACY_POLICY_GDPR);
        akcr.a(p4, "configProvider.observeBo…SEEN_PRIVACY_POLICY_GDPR)");
        p3 = jif3.a.p(fxs.FEATURE_CONFIG_SYNCED_FEATURE_SETTINGS);
        akcr.a(p3, str);
        p = ajdp.a(a2, (ajdt) jif.a(p4, p3), (ajex) b.a);
        akcr.a(p, "Observable.combineLatest…shouldShow && !hasSeen })");
        p2 = ajdp.a(a, (ajdt) p, (ajex) a.a);
        akcr.a(p2, "Observable.combineLatest…\n            }\n        })");
        return p2;
    }

    public final void a(Activity activity, a aVar) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(aVar, "status");
        int i = itk.a[aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    a(activity, itl.PrivacyPolicy);
                }
                return;
            }
            a(activity, itl.TermsOfUse);
        }
    }

    public final boolean b(itl itl) {
        akcr.b(itl, "legalAgreementType");
        int i = itk.c[itl.ordinal()];
        if (i == 1) {
            return ((jif) this.a.get()).a();
        }
        if (i == 2) {
            return ((jif) this.a.get()).b();
        }
        throw new ajxk();
    }
}

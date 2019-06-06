package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.firebase.iid.FirebaseInstanceId;
import com.snap.notification.NotificationHttpInterface;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.concurrent.Callable;

/* renamed from: sco */
public class sco {
    public final zfw a = zgb.a(sdv.a, "NotificationTokenUpdater");
    final ajei b = new ajei();
    final aipn<NotificationHttpInterface> c;
    final tnj d;
    private final ftl e;
    private final aipn<gpb> f;
    private final aipn<gpu> g;

    /* renamed from: sco$e */
    public static final class e extends akcq implements akbl<Context, Integer> {
        public e(GoogleApiAvailability googleApiAvailability) {
            super(1, googleApiAvailability);
        }

        public final String getName() {
            return "isGooglePlayServicesAvailable";
        }

        public final akej getOwner() {
            return akde.a(GoogleApiAvailability.class);
        }

        public final String getSignature() {
            return "isGooglePlayServicesAvailable(Landroid/content/Context;)I";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(((GoogleApiAvailability) this.receiver).isGooglePlayServicesAvailable((Context) obj));
        }
    }

    /* renamed from: sco$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sco$i */
    static final class i<T> implements ajfl<gpt> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            gpt gpt = (gpt) obj;
            akcr.b(gpt, "it");
            return gpt == gpt.LOGGED_OUT;
        }
    }

    /* renamed from: sco$j */
    static final class j<T> implements ajfb<gpt> {
        private /* synthetic */ sco a;

        j(sco sco) {
            this.a = sco;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b.dispose();
        }
    }

    /* renamed from: sco$c */
    public static final class c<V> implements Callable<T> {
        private /* synthetic */ Reference a;

        public c(Reference reference) {
            this.a = reference;
        }

        public final /* synthetic */ Object call() {
            Activity activity = (Activity) this.a.get();
            return activity != null ? activity.getApplicationContext() : null;
        }
    }

    /* renamed from: sco$d */
    public static final class d<T> implements ajfb<ajej> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: sco$f */
    public static final class f<T, R> implements ajfc<Integer, ajdb> {
        private /* synthetic */ sco a;
        private /* synthetic */ Reference b;
        private /* synthetic */ GoogleApiAvailability c;
        private /* synthetic */ boolean d = true;

        public f(sco sco, Reference reference, GoogleApiAvailability googleApiAvailability) {
            this.a = sco;
            this.b = reference;
            this.c = googleApiAvailability;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Integer num = (Integer) obj;
            akcr.b(num, "apiResult");
            sco sco = this.a;
            Reference reference = this.b;
            GoogleApiAvailability googleApiAvailability = this.c;
            boolean z = this.d;
            int intValue = num.intValue();
            if (intValue == 0) {
                obj = ajcx.a((ajev) new k(sco, reference));
                str = "Completable.fromAction {…fNecessary)\n            }";
            } else {
                String str2;
                if (z) {
                    obj = ajcx.a((ajev) new l(reference, googleApiAvailability, intValue));
                    str2 = "Completable.fromAction {…)\n            }\n        }";
                } else {
                    obj = ajvo.a(ajhn.a);
                    str2 = "Completable.complete()";
                }
                akcr.a(obj, str2);
                obj = obj.b((ajdw) sco.a.l());
                str = "showErrorDialogIfNecessa…(schedulers.mainThread())";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: sco$g */
    public static final class g implements ajev {
        public static final g a = new g();

        g() {
        }

        public final void run() {
        }
    }

    /* renamed from: sco$h */
    public static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: sco$o */
    static final class o extends akcq implements akbl<b, ajxw> {
        o(sco sco) {
            super(1, sco);
        }

        public final String getName() {
            return "handleTokenRequestResult";
        }

        public final akej getOwner() {
            return akde.a(sco.class);
        }

        public final String getSignature() {
            return "handleTokenRequestResult(Lcom/snap/notification/NotificationTokenUpdater$TokenRequestResult;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "p1");
            sco sco = (sco) this.receiver;
            akxa akxa = bVar.b;
            akws a = akxa.a();
            if (!akxa.c() && (a == null || a.e())) {
                sco.b.a(sco.d.b().a((fth) sft.LAST_SERVER_ACKNOWLEDGED_DEVICE_TOKEN, bVar.a).b());
            }
            return ajxw.a;
        }
    }

    /* renamed from: sco$k */
    static final class k implements ajev {
        private /* synthetic */ sco a;
        private /* synthetic */ Reference b;

        k(sco sco, Reference reference) {
            this.a = sco;
            this.b = reference;
        }

        public final void run() {
            Activity activity = (Activity) this.b.get();
            if (activity != null) {
                Context applicationContext = activity.getApplicationContext();
                if (applicationContext != null) {
                    this.a.a(applicationContext);
                }
            }
        }
    }

    /* renamed from: sco$m */
    static final class m<V> implements Callable<T> {
        private /* synthetic */ sco a;
        private /* synthetic */ Context b;

        m(sco sco, Context context) {
            this.a = sco;
            this.b = context;
        }

        public final /* synthetic */ Object call() {
            sco sco = this.a;
            Object obj = this.b;
            akcr.a(obj, "appContext");
            return sco.b(obj);
        }
    }

    /* renamed from: sco$n */
    static final class n<T, R> implements ajfc<T, R> {
        private /* synthetic */ sco a;

        n(sco sco) {
            this.a = sco;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            String str2 = "token";
            akcr.b(str, str2);
            sco sco = this.a;
            akcr.b(str, str2);
            aejg aejg = new aejg();
            aejg.a = "android";
            aejg.b = str;
            aejg.c = "com.snap.notification";
            aejg.d = "release";
            Object obj2 = (akxa) ((NotificationHttpInterface) sco.c.get()).updateDeviceToken(aejg).b();
            akcr.a(obj2, "result");
            return new b(str, obj2);
        }
    }

    /* renamed from: sco$p */
    static final class p<T> implements ajfb<Throwable> {
        public static final p a = new p();

        p() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: sco$b */
    public static final class b {
        final String a;
        final akxa<akhw> b;

        public b(String str, akxa<akhw> akxa) {
            akcr.b(str, "token");
            akcr.b(akxa, "result");
            this.a = str;
            this.b = akxa;
        }
    }

    /* renamed from: sco$l */
    static final class l implements ajev {
        private /* synthetic */ Reference a;
        private /* synthetic */ GoogleApiAvailability b;
        private /* synthetic */ int c;

        l(Reference reference, GoogleApiAvailability googleApiAvailability, int i) {
            this.a = reference;
            this.b = googleApiAvailability;
            this.c = i;
        }

        public final void run() {
            abmr.a();
            Activity activity = (Activity) this.a.get();
            if (activity != null) {
                this.b.getErrorDialog(activity, this.c, 0).show();
            }
        }
    }

    static {
        a aVar = new a();
    }

    public sco(aipn<NotificationHttpInterface> aipn, zgb zgb, tnj tnj, ftl ftl, aipn<gpb> aipn2, aipn<gpu> aipn3) {
        akcr.b(aipn, "deviceSyncHttpInterfaceLazy");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tnj, "preferences");
        akcr.b(ftl, "configurationProvider");
        akcr.b(aipn2, "userAuthStore");
        akcr.b(aipn3, "userSession");
        this.c = aipn;
        this.d = tnj;
        this.e = ftl;
        this.f = aipn2;
        this.g = aipn3;
        ajei ajei = this.b;
        ajej f = ((gpu) this.g.get()).a().b((ajdw) this.a.b()).a((ajfl) i.a).a((ajdw) this.a.l()).f((ajfb) new j(this));
        akcr.a((Object) f, "userSession.get()\n      …iteDisposable.dispose() }");
        ajei.a(f);
    }

    private static String a() {
        try {
            FirebaseInstanceId a = FirebaseInstanceId.a();
            return a != null ? a.c() : null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void a(Context context) {
        akcr.b(context, "context");
        Object obj = this.f.get();
        akcr.a(obj, "userAuthStore.get()");
        if (((gpb) obj).b() != null) {
            this.b.a(ajdj.b((Callable) new m(this, context.getApplicationContext())).b((ajdw) this.a.f()).a((ajdw) this.a.g()).f(new n(this)).a((ajdw) this.a.f()).a((ajfb) new scp(new o(this)), (ajfb) p.a));
        }
    }

    public final String b(Context context) {
        akcr.b(context, "context");
        Object a = sco.a();
        return a == null ? null : !akcr.a(a, this.e.j((fth) sft.LAST_SERVER_ACKNOWLEDGED_DEVICE_TOKEN)) ? a : null;
    }
}

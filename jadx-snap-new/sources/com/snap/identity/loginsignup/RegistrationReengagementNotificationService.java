package com.snap.identity.loginsignup;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.snap.core.db.record.LocalMessageActionModel;
import com.snap.identity.loginsignup.ui.LoginSignupActivity;
import com.snapchat.android.R;
import defpackage.abpz;
import defpackage.abqi;
import defpackage.aipp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.gpa;
import defpackage.gpd;
import defpackage.iig;
import defpackage.iqj;
import defpackage.ise;
import defpackage.jbv;
import defpackage.sdg;
import defpackage.sec;
import defpackage.sek;
import defpackage.sfk;
import defpackage.zfw;
import defpackage.zgb;

public final class RegistrationReengagementNotificationService extends Service {
    public ajwy<zgb> a;
    public ajwy<ise> b;
    public ajwy<gpd> c;
    final ajxe d = ajxh.a(new a(this));
    private final ajei e = new ajei();
    private final ajxe f = ajxh.a(new d(this));
    private final ajxe g = ajxh.a(new c(this));

    static final class b<T> implements ajfb<gpa> {
        private /* synthetic */ RegistrationReengagementNotificationService a;
        private /* synthetic */ Context b;

        b(RegistrationReengagementNotificationService registrationReengagementNotificationService, Context context) {
            this.a = registrationReengagementNotificationService;
            this.b = context;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (!iqj.a((gpa) obj) && !defpackage.fxa.a.a()) {
                obj = this.b;
                akcr.a(obj, "context");
                Object uuid = iig.a().toString();
                akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
                Object systemService = obj.getSystemService("notification");
                if (systemService != null) {
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    String string = obj.getResources().getString(R.string.reg_reeng_push_title_mushroom, new Object[]{abqi.a(abpz.GHOST)});
                    String string2 = obj.getResources().getString(R.string.reg_reeng_push_subtitle_mushroom);
                    Intent intent = new Intent(obj, LoginSignupActivity.class);
                    intent.setFlags(603979776);
                    intent.putExtra("fromServerNotification", true);
                    intent.putExtra("type", sec.REGISTRATION_REENGAGEMENT.name());
                    intent.putExtra("notificationId", uuid);
                    obj = new defpackage.go.c(obj).a((CharSequence) string).b((CharSequence) string2).a((int) R.drawable.notification_ghost_sm).a(PendingIntent.getActivity(obj, 0, intent, AudioPlayer.INFINITY_LOOP_COUNT)).b();
                    akcr.a(obj, "builder");
                    sfk sfk = new sfk();
                    sfk.a(sdg.CONFIGURABLE_NOISY);
                    sfk.c = sek.SINGLE.pattern;
                    sfk.d = true;
                    sfk.f = true;
                    sfk.g = true;
                    sfk.l = true;
                    sfk.o = false;
                    notificationManager.notify(uuid.hashCode(), defpackage.sfj.a.a(obj, sfk));
                    ((ise) this.a.d.b()).b();
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
    }

    static final class a extends akcs implements akbk<ise> {
        private /* synthetic */ RegistrationReengagementNotificationService a;

        a(RegistrationReengagementNotificationService registrationReengagementNotificationService) {
            this.a = registrationReengagementNotificationService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.b;
            if (ajwy == null) {
                akcr.a("analyticsProvider");
            }
            return (ise) ajwy.get();
        }
    }

    static final class c extends akcs implements akbk<zgb> {
        private /* synthetic */ RegistrationReengagementNotificationService a;

        c(RegistrationReengagementNotificationService registrationReengagementNotificationService) {
            this.a = registrationReengagementNotificationService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.a;
            if (ajwy == null) {
                akcr.a("schedulersProviderProvider");
            }
            return (zgb) ajwy.get();
        }
    }

    static final class d extends akcs implements akbk<gpd> {
        private /* synthetic */ RegistrationReengagementNotificationService a;

        d(RegistrationReengagementNotificationService registrationReengagementNotificationService) {
            this.a = registrationReengagementNotificationService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.c;
            if (ajwy == null) {
                akcr.a("userAuthStoreReaderProvider");
            }
            return (gpd) ajwy.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(RegistrationReengagementNotificationService.class), "userAuthStoreReader", "getUserAuthStoreReader()Lcom/snap/core/store/UserAuthStoreReader;"), new akdc(akde.a(RegistrationReengagementNotificationService.class), LocalMessageActionModel.ANALYTICS, "getAnalytics()Lcom/snap/identity/api/analytics/RegistrationReengagementPushAnalyticsApi;"), new akdc(akde.a(RegistrationReengagementNotificationService.class), "schedulersProvider", "getSchedulersProvider()Lcom/snap/taskexecution/scheduling/SchedulersProvider;")};
    }

    public final IBinder onBind(Intent intent) {
        akcr.b(intent, "intent");
        return null;
    }

    public final void onCreate() {
        aipp.a((Service) this);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.e.a();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        akcr.b(intent, "intent");
        this.g.b();
        zfw a = zgb.a(jbv.y.callsite("RegistrationReengagementNotificationService"));
        Context applicationContext = getApplicationContext();
        Object obj = (gpd) this.f.b();
        akcr.a(obj, "userAuthStoreReader");
        ajej e = obj.b().b((ajdw) a.f()).e((ajfb) new b(this, applicationContext));
        akcr.a((Object) e, "userAuthStoreReader\n    …          }\n            }");
        ajvv.a(e, this.e);
        return 2;
    }
}

package com.snap.notification.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.aipp;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.cbu;
import defpackage.ilx;
import defpackage.ily;
import defpackage.iop;
import defpackage.iot;
import defpackage.scm;
import defpackage.sdv;
import defpackage.sgj;
import defpackage.sgq;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zta;
import java.util.Map.Entry;

public final class SnapFirebaseMessagingService extends FirebaseMessagingService {
    public ajwy<sgq> b;
    public ajwy<scm> c;
    public ajwy<sgj> d;
    public ajwy<ilx> e;
    public ajwy<zta> f;
    public zgb g;
    private final ajxe h = ajxh.a(new d(this));
    private final ajxe i = ajxh.a(new c(this));

    static final class a implements ajev {
        private /* synthetic */ SnapFirebaseMessagingService a;
        private /* synthetic */ Intent b;

        a(SnapFirebaseMessagingService snapFirebaseMessagingService, Intent intent) {
            this.a = snapFirebaseMessagingService;
            this.b = intent;
        }

        public final void run() {
            ajwy ajwy = this.a.b;
            if (ajwy == null) {
                akcr.a("notificationResponder");
            }
            ((sgq) ajwy.get()).a(this.b);
            this.a.a().c(iop.WORK_RELEASED, this.b);
            this.a.a().a((ily) iop.WORK_RELEASED, this.b);
            this.a.c();
        }
    }

    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ SnapFirebaseMessagingService a;
        private /* synthetic */ Intent b;

        b(SnapFirebaseMessagingService snapFirebaseMessagingService, Intent intent) {
            this.a = snapFirebaseMessagingService;
            this.b = intent;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = "data_trigger";
            this.a.a().a(iot.PURE_MROOM_DATA_MIGR_FAILED.a("reason", this.a.b().a()).a(str, this.a.b().b()).a("entry_point", "notification_service"), this.b);
            this.a.c();
        }
    }

    static final class c extends akcs implements akbk<zta> {
        private /* synthetic */ SnapFirebaseMessagingService a;

        c(SnapFirebaseMessagingService snapFirebaseMessagingService) {
            this.a = snapFirebaseMessagingService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.f;
            if (ajwy == null) {
                akcr.a("pureMushroomMigrationRedirectorProvider");
            }
            return (zta) ajwy.get();
        }
    }

    static final class d extends akcs implements akbk<sgj> {
        private /* synthetic */ SnapFirebaseMessagingService a;

        d(SnapFirebaseMessagingService snapFirebaseMessagingService) {
            this.a = snapFirebaseMessagingService;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.d;
            if (ajwy == null) {
                akcr.a("reporterProvider");
            }
            return (sgj) ajwy.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SnapFirebaseMessagingService.class), "reporter", "getReporter()Lcom/snap/notification/processor/IncomingNotificationReporter;"), new akdc(akde.a(SnapFirebaseMessagingService.class), "pureMushroomMigrationRedirector", "getPureMushroomMigrationRedirector()Lcom/snap/unstuffing/api/PureMushroomMigrationRedirector;")};
    }

    /* Access modifiers changed, original: final */
    public final sgj a() {
        return (sgj) this.h.b();
    }

    public final void a(cbu cbu) {
        if (cbu.a() == null) {
            a().a().c(defpackage.ily.a.a(iop.NULL_REMOTE_DATA), 1);
            c();
            return;
        }
        ajcx a;
        Intent intent = new Intent();
        Object a2 = cbu.a();
        akcr.a(a2, "message.data");
        for (Entry entry : a2.entrySet()) {
            intent.putExtra((String) entry.getKey(), (String) entry.getValue());
        }
        intent.putExtra("com.snap.notification.processing", new Bundle());
        ily ily = iop.PUSH_RECEIVED;
        akcr.b(ily, "metric");
        akcr.b(intent, "intent");
        defpackage.sgj.a.a(ily.b(), intent);
        a().a((ily) iop.PUSH_RECEIVED, intent);
        a();
        sgj.b((ily) iop.WORK_RELEASED, intent);
        if (this.g == null) {
            akcr.a("schedulersProvider");
        }
        zfw a3 = zgb.a(sdv.a.callsite("SnapFirebaseMessagingService"));
        if (b().c()) {
            String str = "data_trigger";
            a().a(iot.PURE_MROOM_DATA_MIGR_STARTED.a("reason", b().a()).a(str, b().b()).a("entry_point", "notification_service"), intent);
            zta b = b();
            Object applicationContext = getApplicationContext();
            akcr.a(applicationContext, "applicationContext");
            a = b.a(applicationContext, false);
        } else {
            a = ajvo.a(ajhn.a);
            akcr.a((Object) a, "Completable.complete()");
        }
        a.b((ajdw) a3.f()).a((ajdw) a3.f()).b((ajev) new a(this, intent)).a((ajfb) new b(this, intent)).a(ajfu.g).e();
    }

    /* Access modifiers changed, original: final */
    public final zta b() {
        return (zta) this.i.b();
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        ajwy ajwy = this.e;
        if (ajwy == null) {
            akcr.a("grapheneInitializationListener");
        }
        ((ilx) ajwy.get()).a(true);
    }

    public final void onCreate() {
        aipp.a((Service) this);
        ajwy ajwy = this.c;
        if (ajwy == null) {
            akcr.a("notificationServiceBinder");
        }
        ((scm) ajwy.get()).a();
        super.onCreate();
    }
}

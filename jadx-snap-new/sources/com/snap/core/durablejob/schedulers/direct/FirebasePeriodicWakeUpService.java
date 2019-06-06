package com.snap.core.durablejob.schedulers.direct;

import android.app.Service;
import com.firebase.jobdispatcher.JobService;
import defpackage.aipp;
import defpackage.ajcx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.bas;
import defpackage.did;
import defpackage.ftl;
import defpackage.gbc;
import defpackage.gbw;
import defpackage.ihh;
import defpackage.ilv;
import defpackage.ilw;
import defpackage.ilx;

public final class FirebasePeriodicWakeUpService extends JobService {
    public static final String n = n;
    public ajwy<gbw> d;
    public ajwy<ilv> e;
    public ajwy<gbc> f;
    public ihh g;
    public ajwy<ilx> h;
    public ajwy<ilw> i;
    public ajwy<did> j;
    public ajwy<ftl> k;
    final ajei l = new ajei();
    long m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements Runnable {
        private /* synthetic */ FirebasePeriodicWakeUpService a;

        b(FirebasePeriodicWakeUpService firebasePeriodicWakeUpService) {
            this.a = firebasePeriodicWakeUpService;
        }

        public final void run() {
            ajwy ajwy = this.a.h;
            if (ajwy == null) {
                akcr.a("grapheneInitListener");
            }
            ajwy ajwy2 = this.a.j;
            if (ajwy2 == null) {
                akcr.a("blizzardInitializer");
            }
            ajwy ajwy3 = this.a.k;
            if (ajwy3 == null) {
                akcr.a("compositeConfigurationProvider");
            }
            defpackage.gbz.a.a(ajwy, ajwy2, ajwy3);
            defpackage.gbz.a.a("onCreate", "FJD", this.a.a());
        }
    }

    static final class c implements Runnable {
        final /* synthetic */ FirebasePeriodicWakeUpService a;
        final /* synthetic */ bas b;

        /* renamed from: com.snap.core.durablejob.schedulers.direct.FirebasePeriodicWakeUpService$c$1 */
        static final class AnonymousClass1 implements ajev {
            private /* synthetic */ c a;

            AnonymousClass1(c cVar) {
                this.a = cVar;
            }

            public final void run() {
                defpackage.gbz.a.a(this.a.a.a(), this.a.a.b(), this.a.a.m, "FJD");
                this.a.a.c(this.a.b);
            }
        }

        /* renamed from: com.snap.core.durablejob.schedulers.direct.FirebasePeriodicWakeUpService$c$2 */
        static final class AnonymousClass2<T> implements ajfb<Throwable> {
            private /* synthetic */ c a;

            AnonymousClass2(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                ajwy a = this.a.a.a();
                ihh b = this.a.a.b();
                long j = this.a.a.m;
                akcr.a((Object) th, "throwable");
                defpackage.gbz.a.a(a, b, j, "FJD", th);
            }
        }

        c(FirebasePeriodicWakeUpService firebasePeriodicWakeUpService, bas bas) {
            this.a = firebasePeriodicWakeUpService;
            this.b = bas;
        }

        public final void run() {
            FirebasePeriodicWakeUpService firebasePeriodicWakeUpService = this.a;
            firebasePeriodicWakeUpService.m = firebasePeriodicWakeUpService.b().c();
            ajwy a = this.a.a();
            ajwy ajwy = this.a.f;
            if (ajwy == null) {
                akcr.a("durableJobManager");
            }
            ajcx a2 = defpackage.gbz.a.a(a, ajwy, "FJD");
            ajwy = this.a.d;
            if (ajwy == null) {
                akcr.a("wakeupSerialSchedulerManager");
            }
            ajej a3 = a2.b(((gbw) ajwy.get()).a).a((ajev) new AnonymousClass1(this), (ajfb) new AnonymousClass2(this));
            akcr.a((Object) a3, "WakeUpSchedulerHelper.st…e)\n                    })");
            ajvv.a(a3, this.a.l);
        }
    }

    static {
        a aVar = new a();
    }

    public final ajwy<ilv> a() {
        ajwy ajwy = this.e;
        if (ajwy == null) {
            akcr.a("graphene");
        }
        return ajwy;
    }

    public final boolean a(bas bas) {
        akcr.b(bas, "jobParameters");
        ajwy ajwy = this.d;
        if (ajwy == null) {
            akcr.a("wakeupSerialSchedulerManager");
        }
        ((gbw) ajwy.get()).a.a((Runnable) new c(this, bas));
        return true;
    }

    public final ihh b() {
        ihh ihh = this.g;
        if (ihh == null) {
            akcr.a("clock");
        }
        return ihh;
    }

    public final boolean b(bas bas) {
        akcr.b(bas, "jobParameters");
        ajwy ajwy = this.e;
        if (ajwy == null) {
            akcr.a("graphene");
        }
        ajwy ajwy2 = this.i;
        if (ajwy2 == null) {
            akcr.a("grapheneFlusher");
        }
        ihh ihh = this.g;
        if (ihh == null) {
            akcr.a("clock");
        }
        long j = this.m;
        ajwy ajwy3 = this.k;
        if (ajwy3 == null) {
            akcr.a("compositeConfigurationProvider");
        }
        defpackage.gbz.a.a(ajwy, ajwy2, ihh, j, "FJD", ajwy3);
        this.l.dispose();
        return false;
    }

    public final void onCreate() {
        aipp.a((Service) this);
        super.onCreate();
        ajwy ajwy = this.d;
        if (ajwy == null) {
            akcr.a("wakeupSerialSchedulerManager");
        }
        ((gbw) ajwy.get()).a.a((Runnable) new b(this));
    }
}

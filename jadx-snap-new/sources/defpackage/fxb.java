package defpackage;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import com.brightcove.player.event.EventType;

/* renamed from: fxb */
public final class fxb<T extends gpp> implements aipt, aipu, aipv, aipw {
    public final ajei a = new ajei();
    public final gps<T> b;
    public final gqa c;
    private final aipn<abss> d;
    private final aipn<abxy> e;
    private final ygi f;
    private final ppn g;
    private final aipn<Object> h;
    private final aipn<jwq> i;
    private final ftl j;
    private final aipn<fxi> k;
    private final tnj l;
    private final ajwy<jxk> m;

    /* renamed from: fxb$a */
    static final class a<T> implements ajfb<Integer> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public fxb(gps<T> gps, aipn<abss> aipn, aipn<abxy> aipn2, ygi ygi, ppn ppn, gqa gqa, gfr gfr, aipn<Object> aipn3, aipn<jwq> aipn4, ftl ftl, aipn<fxi> aipn5, tnj tnj, ajwy<jxk> ajwy) {
        akcr.b(gps, "userComponentManager");
        akcr.b(aipn, "releaseManager");
        akcr.b(aipn2, "scPluginWrapperProvider");
        akcr.b(ygi, "fileManager");
        akcr.b(ppn, "memoryMonitor");
        akcr.b(gqa, "crashManager");
        akcr.b(gfr, "contentBaseUriProvider");
        akcr.b(aipn3, "debugCaptureLogger");
        akcr.b(aipn4, "imageLoadingViewDependencies");
        akcr.b(ftl, "configProvider");
        akcr.b(aipn5, "deviceConfig");
        akcr.b(tnj, "prefs");
        akcr.b(ajwy, EventType.TEST);
        this.b = gps;
        this.d = aipn;
        this.e = aipn2;
        this.f = ygi;
        this.g = ppn;
        this.c = gqa;
        this.h = aipn3;
        this.i = aipn4;
        this.j = ftl;
        this.k = aipn5;
        this.l = tnj;
        this.m = ajwy;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x00b0 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(2:3|4)|5|6|7) */
    public final boolean a() {
        /*
        r6 = this;
        r0 = defpackage.abxx.a();	 Catch:{ all -> 0x00d3 }
        r1 = r6.e;	 Catch:{ all -> 0x00d3 }
        r1 = r1.get();	 Catch:{ all -> 0x00d3 }
        r1 = (defpackage.abxy) r1;	 Catch:{ all -> 0x00d3 }
        r0.a(r1);	 Catch:{ all -> 0x00d3 }
        r0 = r6.d;	 Catch:{ all -> 0x00d3 }
        defpackage.abss.a(r0);	 Catch:{ all -> 0x00d3 }
        r0 = new zfy;	 Catch:{ all -> 0x00d3 }
        r1 = "base";
        r0.<init>(r1);	 Catch:{ all -> 0x00d3 }
        r0 = defpackage.zgd.c;	 Catch:{ all -> 0x00d3 }
        r1 = "core";
        r0 = r0.callsite(r1);	 Catch:{ all -> 0x00d3 }
        r0 = defpackage.zfy.a(r0);	 Catch:{ all -> 0x00d3 }
        r1 = "QualifiedSchedulersProvi…Feature.callsite(\"core\"))";
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x00d3 }
        r1 = r6.l;	 Catch:{ all -> 0x00d3 }
        r1.a();	 Catch:{ all -> 0x00d3 }
        r1 = new jvx$a$a;	 Catch:{ all -> 0x00d3 }
        r1.<init>(r0);	 Catch:{ all -> 0x00d3 }
        r1 = r1.a();	 Catch:{ all -> 0x00d3 }
        r1 = r1.b();	 Catch:{ all -> 0x00d3 }
        r2 = r6.k;	 Catch:{ all -> 0x00d3 }
        r2 = r2.get();	 Catch:{ all -> 0x00d3 }
        r2 = (defpackage.fxi) r2;	 Catch:{ all -> 0x00d3 }
        r2 = r2.a;	 Catch:{ all -> 0x00d3 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00d3 }
        r2 = r6.i;	 Catch:{ all -> 0x00d3 }
        r2 = r2.get();	 Catch:{ all -> 0x00d3 }
        r2 = (defpackage.jwq) r2;	 Catch:{ all -> 0x00d3 }
        r1 = r1.a(r2);	 Catch:{ all -> 0x00d3 }
        r1 = r1.c();	 Catch:{ all -> 0x00d3 }
        defpackage.jvx.a(r1);	 Catch:{ all -> 0x00d3 }
        defpackage.zgd.a();	 Catch:{ all -> 0x00d3 }
        r1 = "org.joda.time.DateTimeZone.Provider";
        r2 = "com.snap.framework.time.DateTimeZoneProvider";
        java.lang.System.setProperty(r1, r2);	 Catch:{ all -> 0x00d3 }
        r1 = r6.f;	 Catch:{ all -> 0x00d3 }
        r1.a();	 Catch:{ all -> 0x00d3 }
        r1 = r6.c;	 Catch:{ all -> 0x00d3 }
        r1.a();	 Catch:{ all -> 0x00d3 }
        r1 = defpackage.abnl.o;	 Catch:{ all -> 0x00d3 }
        if (r1 == 0) goto L_0x00b0;
    L_0x0077:
        r1 = "java.lang.Daemons$FinalizerWatchdogDaemon";
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x00b0 }
        r2 = "clazz";
        defpackage.akcr.a(r1, r2);	 Catch:{ Exception -> 0x00b0 }
        r2 = r1.getSuperclass();	 Catch:{ Exception -> 0x00b0 }
        r3 = "stop";
        r4 = 0;
        r5 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x00b0 }
        r2 = r2.getDeclaredMethod(r3, r5);	 Catch:{ Exception -> 0x00b0 }
        r3 = "method";
        defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x00b0 }
        r3 = 1;
        r2.setAccessible(r3);	 Catch:{ Exception -> 0x00b0 }
        r5 = "INSTANCE";
        r1 = r1.getDeclaredField(r5);	 Catch:{ Exception -> 0x00b0 }
        r5 = "field";
        defpackage.akcr.a(r1, r5);	 Catch:{ Exception -> 0x00b0 }
        r1.setAccessible(r3);	 Catch:{ Exception -> 0x00b0 }
        r3 = 0;
        r1 = r1.get(r3);	 Catch:{ Exception -> 0x00b0 }
        r3 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00b0 }
        r2.invoke(r1, r3);	 Catch:{ Exception -> 0x00b0 }
    L_0x00b0:
        r1 = r6.c;	 Catch:{ all -> 0x00d3 }
        defpackage.gvr.b = r1;	 Catch:{ all -> 0x00d3 }
        r1 = r6.a;	 Catch:{ all -> 0x00d3 }
        r2 = r6.g;	 Catch:{ all -> 0x00d3 }
        r2 = r2.a();	 Catch:{ all -> 0x00d3 }
        r0 = r0.b();	 Catch:{ all -> 0x00d3 }
        r0 = (defpackage.ajdw) r0;	 Catch:{ all -> 0x00d3 }
        r0 = r2.a(r0);	 Catch:{ all -> 0x00d3 }
        r2 = defpackage.fxb.a.a;	 Catch:{ all -> 0x00d3 }
        r2 = (defpackage.ajfb) r2;	 Catch:{ all -> 0x00d3 }
        r0 = r0.f(r2);	 Catch:{ all -> 0x00d3 }
        r0 = r1.a(r0);	 Catch:{ all -> 0x00d3 }
        return r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.a():boolean");
    }

    public final aipq<Activity> activityInjector() {
        return this.b.a().a();
    }

    public final aipq<BroadcastReceiver> broadcastReceiverInjector() {
        return this.b.a().b();
    }

    public final aipq<ContentProvider> contentProviderInjector() {
        return this.b.a().c();
    }

    public final aipq<Service> serviceInjector() {
        return this.b.a().d();
    }
}

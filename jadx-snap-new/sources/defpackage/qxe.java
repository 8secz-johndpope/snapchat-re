package defpackage;

import android.os.SystemClock;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.abln.c;
import defpackage.abln.h;
import defpackage.akdd.e;
import defpackage.qxa.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: qxe */
public final class qxe extends abln implements qxa {
    final ConcurrentHashMap<a, Long> a = new ConcurrentHashMap();
    ConcurrentMap<a, Long> b = new ConcurrentHashMap();
    private ajxm<? extends a, Long> c;
    private boolean d;
    private boolean e;
    private qxi f = qxi.SOURCE_UNKNOWN;
    private final ifb g;
    private final ajdx<iha> h;
    private final ajei i;

    /* renamed from: qxe$a */
    static final class a<T, R> implements ajfc<iha, ajdb> {
        private /* synthetic */ qxe a;
        private /* synthetic */ String b;

        a(qxe qxe, String str) {
            this.a = qxe;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final iha iha = (iha) obj;
            akcr.b(iha, "it");
            Long l = (Long) this.a.b.get(defpackage.qxa.a.PROCESS_INDIVIDUAL_SOURCES);
            Map a = ajzm.a((Map) this.a.b, (Map) this.a.a);
            Collection arrayList = new ArrayList(a.size());
            for (Entry entry : a.entrySet()) {
                defpackage.qxa.a aVar = (defpackage.qxa.a) entry.getKey();
                arrayList.add(ajxs.a(aVar.stepName, (Long) entry.getValue()));
            }
            Map a2 = ajzm.a((Iterable) ajyu.a((Collection) (List) arrayList, (Object) ajxs.a("latency", l)));
            final e eVar = new e();
            ajxm[] ajxmArr = new ajxm[4];
            ajxmArr[0] = ajxs.a("event_name", "ghost_to_feed_ready");
            ajxmArr[1] = ajxs.a("user_agent", this.b);
            ajxmArr[2] = ajxs.a("ts", Long.valueOf(System.currentTimeMillis()));
            ajxmArr[3] = ajxs.a("latencies", a2);
            eVar.a = ajzm.a(ajxmArr);
            return ajcx.a((ajev) new ajev() {
                public final void run() {
                }
            });
        }
    }

    /* renamed from: qxe$b */
    static final class b implements ajev {
        public static final b a = new b();

        b() {
        }

        public final void run() {
        }
    }

    /* renamed from: qxe$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public qxe(aipn<ablh> aipn, ifb ifb, ajdx<iha> ajdx, ajei ajei) {
        akcr.b(aipn, "eventReporter");
        akcr.b(ifb, "userAgent");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(ajei, "userSessionDisposable");
        super(aipn);
        this.g = ifb;
        this.h = ajdx;
        this.i = ajei;
    }

    public final synchronized void a() {
        a(a.BEGIN_RECORDING);
        a(this.f, null, null);
        if (this.d) {
            a((c) qxg.TRIGGERED_BY_NOTIFICATION, (Object) Boolean.valueOf(this.d));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    public final synchronized void a(defpackage.qxa.a r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = "step";
        defpackage.akcr.b(r7, r0);	 Catch:{ all -> 0x004c }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x004c }
        r2 = r7.ordinal();	 Catch:{ all -> 0x004c }
        r3 = r6.c;	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x001d;
    L_0x0012:
        r3 = r3.a;	 Catch:{ all -> 0x004c }
        r3 = (defpackage.qxa.a) r3;	 Catch:{ all -> 0x004c }
        if (r3 == 0) goto L_0x001d;
    L_0x0018:
        r3 = r3.ordinal();	 Catch:{ all -> 0x004c }
        goto L_0x001e;
    L_0x001d:
        r3 = -1;
    L_0x001e:
        if (r2 <= r3) goto L_0x003f;
    L_0x0020:
        r2 = r6.c;	 Catch:{ all -> 0x004c }
        if (r2 == 0) goto L_0x0039;
    L_0x0024:
        r3 = r6.b;	 Catch:{ all -> 0x004c }
        r3 = (java.util.Map) r3;	 Catch:{ all -> 0x004c }
        r2 = r2.b;	 Catch:{ all -> 0x004c }
        r2 = (java.lang.Number) r2;	 Catch:{ all -> 0x004c }
        r4 = r2.longValue();	 Catch:{ all -> 0x004c }
        r4 = r0 - r4;
        r2 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x004c }
        r3.put(r7, r2);	 Catch:{ all -> 0x004c }
    L_0x0039:
        r2 = r7;
        r2 = (defpackage.abln.d) r2;	 Catch:{ all -> 0x004c }
        r6.a(r2);	 Catch:{ all -> 0x004c }
    L_0x003f:
        r2 = new ajxm;	 Catch:{ all -> 0x004c }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x004c }
        r2.<init>(r7, r0);	 Catch:{ all -> 0x004c }
        r6.c = r2;	 Catch:{ all -> 0x004c }
        monitor-exit(r6);
        return;
    L_0x004c:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxe.a(qxa$a):void");
    }

    public final synchronized void a(a aVar, long j) {
        akcr.b(aVar, MapboxNavigationEvent.KEY_STEP);
        a(aVar);
        this.a.put(aVar, Long.valueOf(j));
    }

    public final synchronized void a(qxi qxi) {
        akcr.b(qxi, "sourceType");
        this.f = qxi;
    }

    public final synchronized void a(boolean z) {
        if (f() != null) {
            this.i.a(this.h.e((ajfc) new a(this, this.g.j())).a((ajev) b.a, (ajfb) c.a));
            g();
            a((h) z ? qxj.USER_IN_FEED : qxj.USER_NOT_IN_FEED, SystemClock.elapsedRealtimeNanos());
            e();
        }
    }

    /* JADX WARNING: Missing block: B:13:0x0022, code skipped:
            return;
     */
    public final synchronized void a(boolean r3, java.lang.String r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f();	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x001f;
    L_0x0007:
        r0 = defpackage.qxg.TRIGGERED_BY_NOTIFICATION;	 Catch:{ all -> 0x0023 }
        r0 = (defpackage.abln.c) r0;	 Catch:{ all -> 0x0023 }
        r1 = java.lang.Boolean.valueOf(r3);	 Catch:{ all -> 0x0023 }
        r2.a(r0, r1);	 Catch:{ all -> 0x0023 }
        if (r3 == 0) goto L_0x0021;
    L_0x0014:
        if (r4 == 0) goto L_0x0021;
    L_0x0016:
        r3 = defpackage.qxg.NOTIFICATION_TYPE;	 Catch:{ all -> 0x0023 }
        r3 = (defpackage.abln.c) r3;	 Catch:{ all -> 0x0023 }
        r2.a(r3, r4);	 Catch:{ all -> 0x0023 }
        monitor-exit(r2);
        return;
    L_0x001f:
        r2.d = r3;	 Catch:{ all -> 0x0023 }
    L_0x0021:
        monitor-exit(r2);
        return;
    L_0x0023:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxe.a(boolean, java.lang.String):void");
    }

    public final synchronized void b() {
        a((c) qxg.RESULT_SUCCESS, (Object) Boolean.TRUE);
    }

    public final synchronized void c() {
        if (!this.e) {
            this.e = true;
            a((c) qxg.USER_ENTER_FEED, (Object) Long.valueOf(SystemClock.elapsedRealtimeNanos()));
        }
    }

    public final boolean d() {
        return this.e;
    }

    public final synchronized void e() {
        super.e();
        this.c = null;
        this.b = new ConcurrentHashMap();
        this.d = false;
        this.e = false;
        this.a.clear();
    }
}

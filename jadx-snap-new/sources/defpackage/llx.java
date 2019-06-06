package defpackage;

import android.os.Looper;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import defpackage.mhs.b;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: llx */
public final class llx implements ajfb<lls> {
    final ConcurrentHashMap<b, llp> a;
    private final long b;
    private final TimeUnit c;
    private final akbk<ajxw> d;

    /* renamed from: llx$1 */
    static final class 1 extends akcq implements akbk<ajxw> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final String getName() {
            return "checkNotMainThread";
        }

        public final akej getOwner() {
            return akde.a(mig.class, "lenses-app-bindings_release");
        }

        public final String getSignature() {
            return "checkNotMainThread()V";
        }

        public final /* synthetic */ Object invoke() {
            akbk akbk = mig.b;
            akcr.b(akbk, "lazyMessage");
            Object myLooper = Looper.myLooper();
            if (myLooper == null || (akcr.a(myLooper, Looper.getMainLooper()) ^ 1) != 0) {
                return ajxw.a;
            }
            throw new IllegalStateException(akbk.invoke().toString());
        }
    }

    /* renamed from: llx$a */
    static final class a implements ajev {
        private /* synthetic */ llx a;
        private /* synthetic */ b b;

        a(llx llx, b bVar) {
            this.a = llx;
            this.b = bVar;
        }

        public final void run() {
            this.a.a.remove(this.b);
        }
    }

    public /* synthetic */ llx() {
        this(TimeUnit.MILLISECONDS, 1.a);
    }

    private llx(TimeUnit timeUnit, akbk<ajxw> akbk) {
        akcr.b(timeUnit, "metadataReadyTimeUnit");
        akcr.b(akbk, "backgroundThreadChecker");
        this.b = TelemetryConstants.FLUSH_DELAY_MS;
        this.c = timeUnit;
        this.d = akbk;
        this.a = new ConcurrentHashMap();
    }

    /* JADX WARNING: Missing block: B:18:0x0043, code skipped:
            return;
     */
    private synchronized void a(defpackage.lls r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = "snappableMetadata";
        defpackage.akcr.b(r8, r0);	 Catch:{ all -> 0x0044 }
        r0 = r7.a;	 Catch:{ all -> 0x0044 }
        r0 = (java.util.concurrent.ConcurrentMap) r0;	 Catch:{ all -> 0x0044 }
        r1 = r8.a();	 Catch:{ all -> 0x0044 }
        r2 = r0.get(r1);	 Catch:{ all -> 0x0044 }
        if (r2 != 0) goto L_0x0027;
    L_0x0014:
        r2 = new llp;	 Catch:{ all -> 0x0044 }
        r3 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r5 = r7.c;	 Catch:{ all -> 0x0044 }
        r6 = r7.d;	 Catch:{ all -> 0x0044 }
        r2.<init>(r3, r5, r6);	 Catch:{ all -> 0x0044 }
        r0 = r0.putIfAbsent(r1, r2);	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0027;
    L_0x0026:
        r2 = r0;
    L_0x0027:
        r2 = (defpackage.llp) r2;	 Catch:{ all -> 0x0044 }
        r2.b = r8;	 Catch:{ all -> 0x0044 }
        r0 = r8 instanceof defpackage.lls.b;	 Catch:{ all -> 0x0044 }
        if (r0 == 0) goto L_0x0036;
    L_0x002f:
        r8 = r2.a;	 Catch:{ all -> 0x0044 }
        r8.countDown();	 Catch:{ all -> 0x0044 }
        monitor-exit(r7);
        return;
    L_0x0036:
        r8 = r8 instanceof defpackage.lls.a;	 Catch:{ all -> 0x0044 }
        if (r8 == 0) goto L_0x0042;
    L_0x003a:
        r8 = new java.util.concurrent.CountDownLatch;	 Catch:{ all -> 0x0044 }
        r0 = 1;
        r8.<init>(r0);	 Catch:{ all -> 0x0044 }
        r2.a = r8;	 Catch:{ all -> 0x0044 }
    L_0x0042:
        monitor-exit(r7);
        return;
    L_0x0044:
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llx.a(lls):void");
    }

    /* JADX WARNING: Missing block: B:8:0x002f, code skipped:
            if (r3 == null) goto L_0x0031;
     */
    public final synchronized defpackage.ajdj<java.lang.String> a(defpackage.mhs.b r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "lensId";
        defpackage.akcr.b(r3, r0);	 Catch:{ all -> 0x003e }
        r0 = r2.a;	 Catch:{ all -> 0x003e }
        r0 = r0.get(r3);	 Catch:{ all -> 0x003e }
        r0 = (defpackage.llp) r0;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0031;
    L_0x0010:
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r1 = new llp$a;	 Catch:{ all -> 0x003e }
        r1.<init>(r0);	 Catch:{ all -> 0x003e }
        r1 = (defpackage.ajdm) r1;	 Catch:{ all -> 0x003e }
        r0 = defpackage.ajdj.a(r1);	 Catch:{ all -> 0x003e }
        r1 = "Maybe.create { emitter -…}\n            }\n        }";
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0031;
    L_0x0024:
        r1 = new llx$a;	 Catch:{ all -> 0x003e }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x003e }
        r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x003e }
        r3 = r0.a(r1);	 Catch:{ all -> 0x003e }
        if (r3 != 0) goto L_0x003c;
    L_0x0031:
        r3 = defpackage.ajlu.a;	 Catch:{ all -> 0x003e }
        r3 = defpackage.ajvo.a(r3);	 Catch:{ all -> 0x003e }
        r0 = "let {\n                  …ring>()\n                }";
        defpackage.akcr.a(r3, r0);	 Catch:{ all -> 0x003e }
    L_0x003c:
        monitor-exit(r2);
        return r3;
    L_0x003e:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llx.a(mhs$b):ajdj");
    }

    public final /* synthetic */ void accept(Object obj) {
        a((lls) obj);
    }
}

package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.srs.b;
import defpackage.srs.d;
import defpackage.srs.e;
import defpackage.srs.f;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: qzo */
public class qzo implements qzm {
    final ajxe a = ajxh.a(new b(this));
    final qvd b;
    final srs c;
    final qzn d;
    final ajwy<qoy> e;
    final ihh f;
    final qnk g;
    final ryg h;
    final ajwy<ftl> i;
    final ajwy<qvi> j;
    private final zfw k = zgb.a(qxo.b.callsite("FriendsFeedSnapFetcher"));

    /* renamed from: qzo$b */
    static final class b extends akcs implements akbk<Boolean> {
        private /* synthetic */ qzo a;

        b(qzo qzo) {
            this.a = qzo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(((ftl) this.a.i.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR));
        }
    }

    /* renamed from: qzo$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ qzo a;
        private /* synthetic */ rdt b;

        c(qzo qzo, rdt rdt) {
            this.a = qzo;
            this.b = rdt;
        }

        public final /* synthetic */ Object call() {
            qzo qzo = this.a;
            rdt rdt = this.b;
            akcr.b(rdt, MapboxEvent.KEY_MODEL);
            boolean z = qzo.h.b() && rdt.l.a() && qzo.a(rdt.L._id());
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: qzo$a */
    static final class a<T, R> implements ajfc<List<? extends psf>, ajdb> {
        final /* synthetic */ qzo a;
        final /* synthetic */ long b;
        final /* synthetic */ rdt c;
        private /* synthetic */ boolean d;

        a(qzo qzo, long j, rdt rdt, boolean z) {
            this.a = qzo;
            this.b = j;
            this.c = rdt;
            this.d = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            List list = (List) obj;
            akcr.b(list, "pendingSnaps");
            psf psf = (psf) ajyu.g(list);
            final srt a2 = psf != null ? rfk.a(psf, qxo.b.getPage()) : null;
            if (a2 == null) {
                this.a.d.a(this.c.b(), prl.FAIL, this.c.L.isGroup());
            } else if (this.a.a(this.b)) {
                ihh ihh = this.a.f;
                Object a3 = aesq.SNAP.a();
                akcr.a(a3, "MessageBodyType.SNAP.value()");
                final qdl qdl = new qdl(ihh, a3, a2.c.b.getIntValue());
                qdl.a();
                qdl.d = true;
                idl idl = (this.d ? pql.a : qxo.a).d.b;
                srs srs = this.a.c;
                akcr.b(a2, "playableSnap");
                akcr.b(idl, "uiPage");
                Object j = ajdx.a((ajeb) srs.a(a2.d).f(new d(a2)), (ajeb) ((gfu) srs.a.get()).a(a2.d.a, idl, true, new gdy[0]).f(new e(a2))).c((ajfl) f.a).j();
                akcr.a(j, "Single.concat(\n\n        …NLOADING }.toObservable()");
                a = j.a((ajfc) new ajfc<b, ajdb>(this) {
                    final /* synthetic */ a a;

                    /* renamed from: qzo$a$1$1 */
                    static final class 1 implements ajev {
                        private /* synthetic */ 1 a;

                        1(1 1) {
                            this.a = 1;
                        }

                        public final void run() {
                            this.a.a.a.d.a(this.a.a.c.b(), prl.FAIL, this.a.a.c.L.isGroup());
                        }
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
                    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
                    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
                    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
                    /* JADX WARNING: Missing block: B:38:0x00de, code skipped:
            if (r8 == null) goto L_0x00e0;
     */
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
                        /*
                        r7 = this;
                        r8 = (defpackage.srs.b) r8;
                        r0 = "progress";
                        defpackage.akcr.b(r8, r0);
                        r0 = r7.a;
                        r0 = r0.a;
                        r1 = r0;
                        r2 = r8.a;
                        r3 = defpackage.qzp.b;
                        r2 = r2.ordinal();
                        r2 = r3[r2];
                        r3 = 2;
                        r4 = 1;
                        if (r2 == r4) goto L_0x0058;
                    L_0x001b:
                        r5 = 0;
                        if (r2 == r3) goto L_0x0028;
                    L_0x001e:
                        r6 = 3;
                        if (r2 == r6) goto L_0x0028;
                    L_0x0021:
                        r0 = 4;
                        if (r2 == r0) goto L_0x0025;
                    L_0x0024:
                        goto L_0x006c;
                    L_0x0025:
                        r1.d = r5;
                        goto L_0x006c;
                    L_0x0028:
                        r2 = r1.d;
                        if (r2 != 0) goto L_0x006c;
                    L_0x002c:
                        r1.b = r5;
                        r2 = r8.b;
                        if (r2 == 0) goto L_0x005e;
                    L_0x0032:
                        r2 = r2.e();
                        if (r2 == 0) goto L_0x005e;
                    L_0x0038:
                        r5 = "it";
                        defpackage.akcr.a(r2, r5);
                        r5 = r2.a();
                        r5 = java.lang.Integer.valueOf(r5);
                        r5 = defpackage.srs.a.a(r5);
                        if (r5 != 0) goto L_0x005e;
                    L_0x004b:
                        r2 = r2.c();
                        r5 = "it.error";
                        defpackage.akcr.a(r2, r5);
                        r1.a(r2);
                        goto L_0x005e;
                    L_0x0058:
                        r2 = r1.d;
                        if (r2 != 0) goto L_0x006c;
                    L_0x005c:
                        r1.b = r4;
                    L_0x005e:
                        r1.b();
                        r0 = r0.e;
                        r0 = r0.get();
                        r0 = (defpackage.qoy) r0;
                        r0.a(r1);
                    L_0x006c:
                        r0 = r8.a;
                        r1 = defpackage.srs.c.FAIL_NOT_RETRYABLE;
                        if (r0 == r1) goto L_0x00ac;
                    L_0x0072:
                        r8 = r8.a;
                        r0 = defpackage.qzp.a;
                        r8 = r8.ordinal();
                        r8 = r0[r8];
                        if (r8 == r4) goto L_0x0086;
                    L_0x007e:
                        if (r8 == r3) goto L_0x0083;
                    L_0x0080:
                        r8 = defpackage.prl.FAIL;
                        goto L_0x0088;
                    L_0x0083:
                        r8 = defpackage.prl.SUCCESS;
                        goto L_0x0088;
                    L_0x0086:
                        r8 = defpackage.prl.LOADING;
                    L_0x0088:
                        r0 = r7.a;
                        r0 = r0.a;
                        r0 = r0.d;
                        r1 = r7.a;
                        r1 = r1.c;
                        r1 = r1.b();
                        r2 = r7.a;
                        r2 = r2.c;
                        r2 = r2.L;
                        r2 = r2.isGroup();
                        r0.a(r1, r8, r2);
                        r8 = defpackage.ajhn.a;
                        r8 = defpackage.ajvo.a(r8);
                    L_0x00a9:
                        r8 = (defpackage.ajdb) r8;
                        return r8;
                    L_0x00ac:
                        r8 = r7.a;
                        r8 = r8.a;
                        r0 = r9;
                        r0 = r0.b;
                        r2 = r9;
                        r2 = r2.a;
                        r4 = r7.a;
                        r4 = r4.b;
                        r6 = r8.a;
                        r6 = r6.b();
                        r6 = (java.lang.Boolean) r6;
                        r6 = r6.booleanValue();
                        if (r6 == 0) goto L_0x00ec;
                    L_0x00ca:
                        r0 = r8.b;
                        r0 = r0.o(r2);
                        if (r0 == 0) goto L_0x00e0;
                    L_0x00d2:
                        r8 = r8.j;
                        r8 = r8.get();
                        r8 = (defpackage.qvi) r8;
                        r8 = r8.a(r0, r4);
                        if (r8 != 0) goto L_0x00f2;
                    L_0x00e0:
                        r8 = defpackage.ajhn.a;
                        r8 = defpackage.ajvo.a(r8);
                        r0 = "run {\n                if….complete()\n            }";
                        defpackage.akcr.a(r8, r0);
                        goto L_0x00f2;
                    L_0x00ec:
                        r8 = r8.g;
                        r8 = r8.a(r0, r4);
                    L_0x00f2:
                        r0 = new qzo$a$1$1;
                        r0.<init>(r7);
                        r0 = (defpackage.ajev) r0;
                        r8 = r8.f(r0);
                        goto L_0x00a9;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.qzo$a$1.apply(java.lang.Object):java.lang.Object");
                    }
                }, false);
                return a;
            }
            a = ajvo.a(ajhn.a);
            return a;
        }
    }

    /* renamed from: qzo$d */
    static final class d<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ qzo a;
        private /* synthetic */ rdt b;

        d(qzo qzo, rdt rdt) {
            this.a = qzo;
            this.b = rdt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue() ? this.a.a(this.b, false) : ajvo.a(ajhn.a);
        }
    }

    /* renamed from: qzo$e */
    static final class e implements ajev {
        private /* synthetic */ qzo a;
        private /* synthetic */ rdt b;

        e(qzo qzo, rdt rdt) {
            this.a = qzo;
            this.b = rdt;
        }

        public final void run() {
            qzo qzo = this.a;
            long _id = this.b.L._id();
            prl a = qzo.d.a(_id);
            if (a != prl.SUCCESS && a != prl.NOT_STARTED) {
                qzo.d.a(_id, prl.NOT_STARTED);
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qzo.class), "enableSnapDataRefactor", "getEnableSnapDataRefactor()Z");
    }

    public qzo(qvd qvd, srs srs, qzn qzn, zgb zgb, ajwy<qoy> ajwy, ihh ihh, qnk qnk, ryg ryg, ajwy<ftl> ajwy2, ajwy<qvi> ajwy3) {
        akcr.b(qvd, "messagingRepository");
        akcr.b(srs, "operaMediaDownloader");
        akcr.b(qzn, "snapLoadStateStore");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "loadMessageMetricsController");
        akcr.b(ihh, "clock");
        akcr.b(qnk, "messagingApi");
        akcr.b(ryg, "dataSaverPreferenceWrapper");
        akcr.b(ajwy2, "configProvider");
        akcr.b(ajwy3, "networkMessageProcessor");
        this.b = qvd;
        this.c = srs;
        this.d = qzn;
        this.e = ajwy;
        this.f = ihh;
        this.g = qnk;
        this.h = ryg;
        this.i = ajwy2;
        this.j = ajwy3;
    }

    private final prl b(long j) {
        return this.d.a(j);
    }

    public final ajcx a(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        Object b = ajdx.c((Callable) new c(this, rdt)).b((ajdw) this.k.f()).e((ajfc) new d(this, rdt)).c((ajev) new e(this, rdt)).b((ajdw) this.k.f());
        akcr.a(b, "Single.fromCallable { sh…scribeOn(schedulers.io())");
        return b;
    }

    /* Access modifiers changed, original: final */
    public final ajcx a(rdt rdt, boolean z) {
        Object b = this.g.f(rdt.L._id()).e((ajfc) new a(this, rdt.L._id(), rdt, z)).b((ajdw) this.k.g());
        akcr.a(b, "messagingApi.pendingSnap…eOn(schedulers.network())");
        return b;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(long j) {
        prl b = b(j);
        return (b == prl.SUCCESS || b == prl.LOADING) ? false : true;
    }

    public final ajcx b(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        return a(rdt, true);
    }

    public final boolean c(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        return !rdt.l.a() || b(rdt.L._id()) == prl.SUCCESS;
    }

    public final void d(rdt rdt) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        this.d.a(rdt.L._id(), prl.NOT_STARTED);
    }
}

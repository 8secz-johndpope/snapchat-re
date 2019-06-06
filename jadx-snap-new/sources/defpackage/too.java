package defpackage;

import com.google.common.base.Stopwatch;
import com.mapbox.mapboxsdk.style.layers.Property;
import defpackage.tof.w;
import defpackage.tof.x;
import defpackage.tof.y;
import defpackage.tof.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: too */
public final class too implements tpw {
    final ajxe a = ajxh.a(new h(this));
    long b;
    final ajwy<tof> c;
    final tvd d;
    final ajwy<tol> e;
    final ajwy<ton> f;
    final kqf g;
    private final String h = "AnalyticsActivator";
    private final ajxe i = ajxh.a(i.a);
    private final ajxe j = ajxh.a(new a(this));
    private final ajxe k = ajxh.a(new b(this));
    private final ajei l = new ajei();
    private zfw m;
    private final toc n;
    private final zgb o;
    private final ajdp<tpk> p;
    private final tpl q;
    private final ajde<tps> r;
    private final ajdp<Boolean> s;
    private final ajdp<ajxw> t;

    /* renamed from: too$g */
    static final class g extends akcq implements akbk<ajxw> {
        g(too too) {
            super(0, too);
        }

        public final String getName() {
            return "onDisposed";
        }

        public final akej getOwner() {
            return akde.a(too.class);
        }

        public final String getSignature() {
            return "onDisposed()V";
        }

        public final /* synthetic */ Object invoke() {
            ((too) this.receiver).b().a.a();
            return ajxw.a;
        }
    }

    /* renamed from: too$i */
    static final class i extends akcs implements akbk<Stopwatch> {
        public static final i a = new i();

        i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Stopwatch.createUnstarted();
        }
    }

    /* renamed from: too$a */
    static final class a extends akcs implements akbk<tof> {
        private /* synthetic */ too a;

        a(too too) {
            this.a = too;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tof) this.a.c.get();
        }
    }

    /* renamed from: too$b */
    static final class b extends akcs implements akbk<tol> {
        private /* synthetic */ too a;

        b(too too) {
            this.a = too;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (tol) this.a.e.get();
        }
    }

    /* renamed from: too$h */
    static final class h extends akcs implements akbk<ton> {
        private /* synthetic */ too a;

        h(too too) {
            this.a = too;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ton) this.a.f.get();
        }
    }

    /* renamed from: too$c */
    static final class c<T> implements ajfb<tpk> {
        private /* synthetic */ too a;

        c(too too) {
            this.a = too;
        }

        public final /* synthetic */ void accept(Object obj) {
            tpk tpk = (tpk) obj;
            tof b = this.a.b();
            akcr.a((Object) tpk, "it");
            b.a(tpk);
        }
    }

    /* renamed from: too$d */
    static final class d<T> implements ajfb<List<? extends abyi>> {
        private /* synthetic */ too a;

        d(too too) {
            this.a = too;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            akcr.a(obj, "mediaPackageList");
            if ((((Collection) obj).isEmpty() ^ 1) != 0) {
                this.a.b().a(((abyi) obj.get(0)).a, ((abyi) obj.get(0)).e, this.a.d.d().snapSource);
                tol c = this.a.c();
                String str = ((abyi) obj.get(0)).e.h;
                abbd abbd = this.a.d.d().sourceType;
                akcr.b(abbd, "sourceType");
                dib a = c.a();
                aaik aaik = new aaik();
                aaik.a(str);
                if (abbd == abbd.GALLERY) {
                    aaik.a(aajp.GALLERY_EDIT);
                }
                a.a((aajt) aaik);
            }
        }
    }

    /* renamed from: too$e */
    static final class e<T> implements ajfb<Boolean> {
        private /* synthetic */ too a;

        e(too too) {
            this.a = too;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, Property.VISIBLE);
            String str = "viewTimeStopWatch";
            if (obj.booleanValue()) {
                obj = ((Stopwatch) this.a.i.b());
                akcr.a(obj, str);
                if (obj.isRunning()) {
                    ((Stopwatch) this.a.i.b()).stop();
                }
                ((Stopwatch) this.a.i.b()).start();
                return;
            }
            obj = ((Stopwatch) this.a.i.b());
            akcr.a(obj, str);
            if (obj.isRunning()) {
                ((Stopwatch) this.a.i.b()).stop();
                too too = this.a;
                too.b += ((Stopwatch) this.a.i.b()).elapsed(TimeUnit.MILLISECONDS);
            }
            ((Stopwatch) this.a.i.b()).reset();
            tof b = this.a.b();
            double a = abqq.a(this.a.b);
            for (aaim b2 : b.d().a()) {
                b2.b(Double.valueOf(a));
            }
        }
    }

    /* renamed from: too$f */
    static final class f<T> implements ajfb<ajxw> {
        private /* synthetic */ too a;

        f(too too) {
            this.a = too;
        }

        /* JADX WARNING: Removed duplicated region for block: B:86:0x01c0  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x019b A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01c3  */
        /* JADX WARNING: Missing block: B:73:0x0181, code skipped:
            if ((r6 != null ? (defpackage.alry) defpackage.ajyi.a((java.lang.Object[]) r6, 0) : null) != null) goto L_0x0183;
     */
        public final /* synthetic */ void accept(java.lang.Object r29) {
            /*
            r28 = this;
            r0 = r28;
            r1 = r0.a;
            r2 = r1.b();
            r2 = r2.e();
            r3 = r2.d;
            r4 = r1.b;
            r3.c = r4;
            r3 = r1.c();
            r4 = "previewAnalyticsWrapper";
            defpackage.akcr.b(r2, r4);
            r5 = r2.b;
            r6 = r3.a();
            r7 = r5;
            r7 = (defpackage.aajt) r7;
            r6.a(r7);
            r6 = r5.ax();
            r7 = java.lang.Boolean.TRUE;
            r6 = defpackage.akcr.a(r6, r7);
            r7 = 1;
            r6 = r6 ^ r7;
            if (r6 == 0) goto L_0x0050;
        L_0x0035:
            r6 = r5.c();
            r8 = defpackage.aauu.EXIT_BUTTON;
            if (r6 == r8) goto L_0x0045;
        L_0x003d:
            r5 = r5.c();
            r6 = defpackage.aauu.SYSTEM_BACK;
            if (r5 != r6) goto L_0x0050;
        L_0x0045:
            r5 = r3.a();
            r6 = r2.e;
            r6 = (defpackage.aajt) r6;
            r5.a(r6);
        L_0x0050:
            r5 = r2.c;
            r5 = r5.az();
            r8 = 0;
            if (r5 == 0) goto L_0x0073;
        L_0x005a:
            r5 = (java.lang.Number) r5;
            r5 = r5.longValue();
            r10 = r2.g;
            if (r10 != 0) goto L_0x0068;
        L_0x0064:
            r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));
            if (r10 <= 0) goto L_0x0073;
        L_0x0068:
            r3 = r3.a();
            r5 = r2.c;
            r5 = (defpackage.aajt) r5;
            r3.a(r5);
        L_0x0073:
            r3 = r1.a;
            r3 = r3.b();
            r3 = (defpackage.ton) r3;
            defpackage.akcr.b(r2, r4);
            r4 = r2.d;
            r5 = r4.o;
            r6 = r5;
            r6 = (java.util.Collection) r6;
            r6 = r6.isEmpty();
            r6 = r6 ^ r7;
            r10 = 0;
            if (r6 == 0) goto L_0x0131;
        L_0x008d:
            r5 = r5.get(r10);
            r5 = (defpackage.abzy) r5;
            r5 = r5.a();
            r6 = "selectedGeofilterList[0].id";
            defpackage.akcr.a(r5, r6);
            r6 = r2.d;
            r6 = r6.n;
            r5 = r6.get(r5);
            r5 = (defpackage.iiw) r5;
            if (r5 == 0) goto L_0x0131;
        L_0x00a8:
            r5 = r5.a;
            r6 = r2.b;
            r6 = r6.av();
            if (r6 == 0) goto L_0x00b7;
        L_0x00b2:
            r6 = r6.booleanValue();
            goto L_0x00b8;
        L_0x00b7:
            r6 = 0;
        L_0x00b8:
            r5.l = r6;
            r6 = r2.b;
            r6 = r6.aw();
            if (r6 == 0) goto L_0x00c7;
        L_0x00c2:
            r6 = r6.booleanValue();
            goto L_0x00c8;
        L_0x00c7:
            r6 = 0;
        L_0x00c8:
            r5.j = r6;
            r6 = r2.b;
            r6 = r6.ax();
            if (r6 == 0) goto L_0x00d7;
        L_0x00d2:
            r6 = r6.booleanValue();
            goto L_0x00d8;
        L_0x00d7:
            r6 = 0;
        L_0x00d8:
            r5.k = r6;
            r6 = r2.d;
            r11 = r6.g;
            r5.f = r11;
            r6 = r2.d;
            r11 = r6.h;
            r5.h = r11;
            r6 = r2.b;
            r6 = r6.B();
            if (r6 == 0) goto L_0x00f3;
        L_0x00ee:
            r8 = r6.doubleValue();
            r8 = (long) r8;
        L_0x00f3:
            r5.e = r8;
            r6 = r5.l;
            r8 = 1;
            if (r6 == 0) goto L_0x010b;
        L_0x00fb:
            r6 = r2.b;
            r6 = r6.f();
            if (r6 == 0) goto L_0x0108;
        L_0x0103:
            r11 = r6.longValue();
            goto L_0x0109;
        L_0x0108:
            r11 = r8;
        L_0x0109:
            r5.i = r11;
        L_0x010b:
            r6 = r5.j;
            if (r6 == 0) goto L_0x011f;
        L_0x010f:
            r6 = r2.b;
            r6 = r6.f();
            if (r6 == 0) goto L_0x011c;
        L_0x0117:
            r11 = r6.longValue();
            goto L_0x011d;
        L_0x011c:
            r11 = r8;
        L_0x011d:
            r5.n = r11;
        L_0x011f:
            r6 = r5.k;
            if (r6 == 0) goto L_0x0131;
        L_0x0123:
            r6 = r2.b;
            r6 = r6.f();
            if (r6 == 0) goto L_0x012f;
        L_0x012b:
            r8 = r6.longValue();
        L_0x012f:
            r5.o = r8;
        L_0x0131:
            r5 = r4.o;
            r6 = r5;
            r6 = (java.util.Collection) r6;
            r6 = r6.isEmpty();
            r6 = r6 ^ r7;
            r8 = 0;
            if (r6 == 0) goto L_0x0149;
        L_0x013e:
            r5 = r5.get(r10);
            r5 = (defpackage.abzy) r5;
            r5 = r5.a();
            goto L_0x014a;
        L_0x0149:
            r5 = r8;
        L_0x014a:
            r6 = r3.c;
            r6.b();
            r6 = r4.p;
            r9 = r4.a;
            r5 = defpackage.zrn.a(r5, r8, r6, r9);
            if (r5 == 0) goto L_0x0187;
        L_0x0159:
            r6 = r5.b;
            if (r6 == 0) goto L_0x0164;
        L_0x015d:
            r6 = defpackage.ajyi.a(r6, r10);
            r6 = (defpackage.alru) r6;
            goto L_0x0165;
        L_0x0164:
            r6 = r8;
        L_0x0165:
            if (r6 != 0) goto L_0x0183;
        L_0x0167:
            r6 = r5.a;
            if (r6 == 0) goto L_0x0172;
        L_0x016b:
            r6 = defpackage.ajyi.a(r6, r10);
            r6 = (defpackage.alrq) r6;
            goto L_0x0173;
        L_0x0172:
            r6 = r8;
        L_0x0173:
            if (r6 != 0) goto L_0x0183;
        L_0x0175:
            r6 = r5.c;
            if (r6 == 0) goto L_0x0180;
        L_0x0179:
            r6 = defpackage.ajyi.a(r6, r10);
            r6 = (defpackage.alry) r6;
            goto L_0x0181;
        L_0x0180:
            r6 = r8;
        L_0x0181:
            if (r6 == 0) goto L_0x0187;
        L_0x0183:
            r8 = defpackage.zrn.a(r5);
        L_0x0187:
            r5 = new java.util.ArrayList;
            r5.<init>();
            r6 = new java.util.ArrayList;
            r6.<init>();
            r9 = r4.n;
            r9 = r9.values();
            r9 = r9.iterator();
        L_0x019b:
            r11 = r9.hasNext();
            if (r11 == 0) goto L_0x01d4;
        L_0x01a1:
            r11 = r9.next();
            r11 = (defpackage.iiw) r11;
            r12 = r11.a;
            r13 = "unlockableSwipeInteraction";
            defpackage.akcr.b(r12, r13);
            r12 = r12.b;
            if (r12 == 0) goto L_0x01bb;
        L_0x01b2:
            r12 = r12.c;
            if (r12 == 0) goto L_0x01bb;
        L_0x01b6:
            r12 = r12.booleanValue();
            goto L_0x01bc;
        L_0x01bb:
            r12 = 0;
        L_0x01bc:
            if (r12 != 0) goto L_0x01c0;
        L_0x01be:
            r12 = 1;
            goto L_0x01c1;
        L_0x01c0:
            r12 = 0;
        L_0x01c1:
            if (r12 == 0) goto L_0x019b;
        L_0x01c3:
            r12 = defpackage.iir.a(r11);
            r5.add(r12);
            r11 = r11.a;
            r11 = r11.b;
            if (r11 == 0) goto L_0x019b;
        L_0x01d0:
            r6.add(r11);
            goto L_0x019b;
        L_0x01d4:
            r9 = new iiu;
            r11 = r3.d;
            r6 = (java.util.List) r6;
            r9.<init>(r11, r6);
            r6 = new ajxm;
            r6.<init>(r5, r9);
            r5 = r6.a;
            r5 = (java.util.List) r5;
            r6 = r6.b;
            r6 = (defpackage.iiu) r6;
            r9 = r5;
            r9 = (java.util.Collection) r9;
            r9 = r9.isEmpty();
            r7 = r7 ^ r9;
            if (r7 == 0) goto L_0x033d;
        L_0x01f4:
            r11 = r4.g;
            r7 = r4.a;
            r9 = "unlockablePreviewAnalytics";
            defpackage.akcr.b(r4, r9);
            r9 = new afkn;
            r9.<init>();
            r13 = r4.k;
            r13 = java.lang.Boolean.valueOf(r13);
            r9.b = r13;
            r13 = r4.m;
            r9.c = r13;
            r13 = r4.d;
            r13 = java.lang.Long.valueOf(r13);
            r9.d = r13;
            r13 = r4.c;
            r13 = java.lang.Long.valueOf(r13);
            r9.e = r13;
            r13 = r4.e;
            r13 = java.lang.Long.valueOf(r13);
            r9.h = r13;
            r13 = r4.l;
            r13 = r13.a();
            r9.g = r13;
            r13 = r4.b;
            r13 = java.lang.Long.valueOf(r13);
            r9.f = r13;
            r13 = r4.f;
            r4 = java.lang.Long.valueOf(r13);
            r9.a = r4;
            r4 = r3.b;
            r4 = r4.b();
            r4 = (defpackage.afmf) r4;
            r13 = r3.d;
            r13 = r13.get();
            r14 = "configProvider.get()";
            defpackage.akcr.a(r13, r14);
            r13 = (defpackage.ftl) r13;
            r14 = r3.b();
            r15 = r3.a();
            r10 = "impressionList";
            defpackage.akcr.b(r5, r10);
            r10 = "sessionId";
            defpackage.akcr.b(r7, r10);
            r10 = "snapInfo";
            defpackage.akcr.b(r9, r10);
            r10 = "devInfo";
            defpackage.akcr.b(r4, r10);
            r10 = "unlockableTrackResolver";
            defpackage.akcr.b(r6, r10);
            r10 = "configProvider";
            defpackage.akcr.b(r13, r10);
            r10 = "scheduler";
            defpackage.akcr.b(r14, r10);
            r10 = "compositeDisposable";
            defpackage.akcr.b(r15, r10);
            r10 = new afjf;
            r10.<init>();
            r0 = new afjb;
            r0.<init>();
            r11 = java.lang.Long.valueOf(r11);
            r0.c = r11;
            r0.b = r7;
            r0.d = r5;
            r0.a = r9;
            r0.e = r4;
            r4 = defpackage.aflo.FILTER_CAROUSEL;
            r4 = r4.a();
            r10.a = r4;
            r10.l = r0;
            r0 = new aflk;
            r0.<init>();
            r0.g = r10;
            r4 = r6.c;
            r0.a = r4;
            r4 = r6.d;
            r0.d = r4;
            r4 = new iir$c;
            r4.<init>(r13);
            r4 = (java.util.concurrent.Callable) r4;
            r4 = defpackage.ajdx.c(r4);
            r5 = r14.i();
            r5 = (defpackage.ajdw) r5;
            r4 = r4.b(r5);
            r5 = defpackage.iir.d.a;
            r5 = (defpackage.ajfc) r5;
            r4 = r4.f(r5);
            r5 = "Single.fromCallable {\n  …      }\n                }";
            defpackage.akcr.a(r4, r5);
            r5 = new iir$a;
            r5.<init>(r0);
            r5 = (defpackage.ajfb) r5;
            r7 = defpackage.iir.b.a;
            r7 = (defpackage.ajfb) r7;
            r4 = r4.a(r5, r7);
            r5 = "getFilterOpportunityRequ…e)\n                    })";
            defpackage.akcr.a(r4, r5);
            defpackage.ajvv.a(r4, r15);
            r4 = r3.a;
            r4 = r4.b();
            r4 = (defpackage.ihh) r4;
            r4 = r4.a();
            r4 = java.lang.Long.valueOf(r4);
            r0.p = r4;
            r4 = r3.e;
            r5 = r3.b();
            r5 = r5.g();
            r5 = (defpackage.ajdw) r5;
            r4 = r4.b(r5);
            r5 = new ton$e;
            r5.<init>(r6);
            r5 = (defpackage.ajfc) r5;
            r4 = r4.f(r5);
            r5 = new ton$f;
            r5.<init>(r3, r0, r8);
            r5 = (defpackage.ajfc) r5;
            r0 = r4.f(r5);
            r4 = defpackage.ton.g.a;
            r4 = (defpackage.ajfb) r4;
            r5 = defpackage.ton.h.a;
            r5 = (defpackage.ajfb) r5;
            r0 = r0.a(r4, r5);
            r4 = "trackNetClient\n         …er.gf(TAG, it.message) })";
            defpackage.akcr.a(r0, r4);
            r3 = r3.a();
            defpackage.ajvv.a(r0, r3);
        L_0x033d:
            r0 = r1.g;
            r1 = new kqe$ab;
            r14 = new kqn;
            r3 = r2.d;
            r3 = r3.f;
            r4 = java.lang.Long.valueOf(r3);
            r3 = r2.d;
            r3 = r3.k;
            r5 = java.lang.Boolean.valueOf(r3);
            r3 = r2.d;
            r6 = r3.m;
            r3 = r2.d;
            r7 = r3.d;
            r7 = java.lang.Long.valueOf(r7);
            r3 = r2.d;
            r8 = r3.c;
            r8 = java.lang.Long.valueOf(r8);
            r3 = r2.d;
            r9 = r3.b;
            r9 = java.lang.Long.valueOf(r9);
            r3 = r2.d;
            r3 = r3.l;
            r10 = r3.a();
            r3 = r2.d;
            r11 = r3.e;
            r11 = java.lang.Long.valueOf(r11);
            r3 = r2.d;
            r12 = r3.h;
            r3 = r2.d;
            r17 = r12;
            r12 = r3.j;
            r3 = r2.b;
            r3 = r3.aw();
            if (r3 == 0) goto L_0x0398;
        L_0x0391:
            r3 = r3.booleanValue();
            r21 = r3;
            goto L_0x039a;
        L_0x0398:
            r21 = 0;
        L_0x039a:
            r3 = r2.b;
            r3 = r3.ax();
            if (r3 == 0) goto L_0x03a9;
        L_0x03a2:
            r3 = r3.booleanValue();
            r22 = r3;
            goto L_0x03ab;
        L_0x03a9:
            r22 = 0;
        L_0x03ab:
            r3 = r2.b;
            r3 = r3.av();
            if (r3 == 0) goto L_0x03ba;
        L_0x03b3:
            r3 = r3.booleanValue();
            r25 = r3;
            goto L_0x03bc;
        L_0x03ba:
            r25 = 0;
        L_0x03bc:
            r2 = r2.d;
            r2 = r2.g;
            r19 = r2;
            r23 = 0;
            r24 = 81920; // 0x14000 float:1.14794E-40 double:4.0474E-319;
            r3 = r14;
            r26 = r12;
            r15 = r17;
            r12 = 0;
            r2 = r14;
            r14 = r15;
            r16 = r21;
            r17 = r25;
            r18 = r22;
            r21 = r26;
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19, r21, r23, r24);
            r1.<init>(r2);
            r1 = (defpackage.kqe) r1;
            r0.a(r1);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.too$f.accept(java.lang.Object):void");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(too.class), "viewTimeStopWatch", "getViewTimeStopWatch()Lcom/google/common/base/Stopwatch;"), new akdc(akde.a(too.class), "analyticsComposer", "getAnalyticsComposer()Lcom/snap/preview/analytics/AnalyticsComposer;"), new akdc(akde.a(too.class), "previewBlizzardEventLogger", "getPreviewBlizzardEventLogger()Lcom/snap/preview/analytics/SnapPreviewBlizzardEventLogger;"), new akdc(akde.a(too.class), "unlockableCreateTracksLogger", "getUnlockableCreateTracksLogger()Lcom/snap/preview/analytics/UnlockableCreateTracksLogger;")};
    }

    public too(ajwy<tof> ajwy, toc toc, zgb zgb, tvd tvd, ajdp<tpk> ajdp, tpl tpl, ajde<tps> ajde, ajdp<Boolean> ajdp2, ajdp<ajxw> ajdp3, ajwy<tol> ajwy2, ajwy<ton> ajwy3, kqf kqf) {
        akcr.b(ajwy, "analyticsComposerProvider");
        akcr.b(toc, "previewFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tvd, "previewDataSource");
        akcr.b(ajdp, "sendToDataObservable");
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajde, "segmentSwitchFlowable");
        akcr.b(ajdp2, "previewVisibilityObservable");
        akcr.b(ajdp3, "logEventsObservable");
        akcr.b(ajwy2, "previewBlizzardEventLoggerProvider");
        akcr.b(ajwy3, "unlockableCreateTracksLoggerProvider");
        akcr.b(kqf, "lensesAnalyticsEventHandler");
        this.c = ajwy;
        this.n = toc;
        this.o = zgb;
        this.d = tvd;
        this.p = ajdp;
        this.q = tpl;
        this.r = ajde;
        this.s = ajdp2;
        this.t = ajdp3;
        this.e = ajwy2;
        this.f = ajwy3;
        this.g = kqf;
    }

    public final String a() {
        return this.h;
    }

    /* Access modifiers changed, original: final */
    public final tof b() {
        return (tof) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final tol c() {
        return (tol) this.k.b();
    }

    public final ajej start() {
        this.m = zgb.a(this.n.callsite("AnalyticsActivator"));
        tof b = b();
        tpl tpl = this.q;
        akcr.b(tpl, "previewStartUpConfig");
        b.d = tpl;
        if (tpn.a(this.q)) {
            b = b();
            ajde ajde = this.r;
            akcr.b(ajde, "segmentSwitchFlowable");
            ajdj d = b.c().h.d();
            akcr.a((Object) d, "initialSegmentKeySubject.firstElement()");
            ajvv.a(ajwe.a(d, (akbl) new w(b), ajwe.a, (akbl) new x(b)), b.a);
            Object a = ajde.b((ajdw) b.a().b()).a((ajdw) b.a().b());
            akcr.a(a, "segmentSwitchFlowable\n  …schedulers.computation())");
            akbl yVar = new y(b);
            akbl zVar = new z(b);
            akbk akbk = ajwe.a;
            akcr.b(a, "$receiver");
            akcr.b(yVar, "onError");
            akcr.b(akbk, "onComplete");
            akcr.b(zVar, "onNext");
            ajej a2 = a.a((ajfb) new ajwg(zVar), (ajfb) new ajwg(yVar), (ajev) new ajwf(akbk));
            akcr.a((Object) a2, "subscribe(onNext, onError, onComplete)");
            ajvv.a(a2, b.a);
        }
        gtt gtt = this.d.h;
        if (gtt != null) {
            tof b2 = b();
            akcr.b(gtt, "creativeKitSessionData");
            b2.d().a = gtt.a;
        }
        ajdp ajdp = this.p;
        zfw zfw = this.m;
        String str = "schedulers";
        if (zfw == null) {
            akcr.a(str);
        }
        ajej f = ajdp.a((ajdw) zfw.h()).f((ajfb) new c(this));
        akcr.a((Object) f, "sendToDataObservable\n   …ata(it)\n                }");
        ajvv.a(f, this.l);
        ajdx ajdx = this.d.b;
        zfw = this.m;
        if (zfw == null) {
            akcr.a(str);
        }
        f = ajdx.b((ajdw) zfw.h()).e((ajfb) new d(this));
        akcr.a((Object) f, "previewDataSource.mediaP…      }\n                }");
        ajvv.a(f, this.l);
        f = this.s.j(ajfu.a).f((ajfb) new e(this));
        akcr.a((Object) f, "previewVisibilityObserva…)\n            }\n        }");
        ajvv.a(f, this.l);
        f = this.t.f((ajfb) new f(this));
        akcr.a((Object) f, "logEventsObservable\n    …vents()\n                }");
        ajvv.a(f, this.l);
        this.l.a(ajek.a((ajev) new top(new g(this))));
        return this.l;
    }
}

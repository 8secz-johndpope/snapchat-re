package defpackage;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: actt */
public final class actt {
    final actu a;
    final zkq b;
    private final ajxe c = ajxh.a(new g(this));
    private final ftl d;
    private zgb e;

    /* renamed from: actt$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: actt$b */
    public static final class b<T1, T2, R> implements ajex<Boolean, Boolean, R> {
        public final R apply(Boolean bool, Boolean bool2) {
            boolean z;
            Object obj = bool2;
            Object obj2 = bool;
            akcr.a(obj2, "mapV2");
            if (!obj2.booleanValue()) {
                akcr.a(obj, "statusViewing");
                if (!obj.booleanValue()) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: actt$c */
    static final class c<T> implements ajfl<Boolean> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: actt$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ actt a;
        private /* synthetic */ aclg b;

        /* renamed from: actt$d$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Rect rect = (Rect) obj;
                akcr.b(rect, "insets");
                return Integer.valueOf(rect.bottom);
            }
        }

        d(actt actt, aclg aclg) {
            this.a = actt;
            this.b = aclg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            obj = this.b.k();
            akcr.a(obj, "snapMap.viewStateManager");
            obj = obj.q().b;
            akcr.a(obj, "snapMap.viewStateManager…clusterSelectedObservable");
            Object p = this.a.b.b().p(1.a);
            akcr.a(p, "insetsDetector.fullScree…                        }");
            return ajwa.a(obj, p);
        }
    }

    /* renamed from: actt$e */
    static final class e<T> implements ajfb<ajxm<? extends acqm, ? extends Integer>> {
        private /* synthetic */ actt a;
        private /* synthetic */ ViewGroup b;
        private /* synthetic */ boolean c;
        private /* synthetic */ boolean d;
        private /* synthetic */ boolean e;

        e(actt actt, ViewGroup viewGroup, boolean z, boolean z2, boolean z3) {
            this.a = actt;
            this.b = viewGroup;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        /* JADX WARNING: Missing block: B:48:0x00f7, code skipped:
            if ((defpackage.akcr.a(r14.p.a, r2 != null ? r2.a : null) ^ 1) == 0) goto L_0x00f9;
     */
        public final /* synthetic */ void accept(java.lang.Object r26) {
            /*
            r25 = this;
            r0 = r25;
            r1 = r26;
            r1 = (defpackage.ajxm) r1;
            r2 = r1.a;
            r2 = (defpackage.acqm) r2;
            r1 = r1.b;
            r1 = (java.lang.Integer) r1;
            r3 = r2 instanceof defpackage.acqk;
            r4 = 0;
            r5 = "parentView";
            r6 = 0;
            r7 = 0;
            if (r3 == 0) goto L_0x0088;
        L_0x0017:
            r1 = r0.a;
            r1 = r1.a;
            r2 = r1.d;
            if (r2 == 0) goto L_0x0022;
        L_0x001f:
            r2.cancel();
        L_0x0022:
            r2 = r1.d;
            if (r2 == 0) goto L_0x0029;
        L_0x0026:
            r2.end();
        L_0x0029:
            r2 = r1.e;
            if (r2 == 0) goto L_0x0030;
        L_0x002d:
            r2.cancel();
        L_0x0030:
            r2 = r1.e;
            if (r2 == 0) goto L_0x0037;
        L_0x0034:
            r2.end();
        L_0x0037:
            r2 = r1.a;
            r2 = (java.lang.Iterable) r2;
            r2 = r2.iterator();
        L_0x003f:
            r3 = r2.hasNext();
            if (r3 == 0) goto L_0x0056;
        L_0x0045:
            r3 = r2.next();
            r3 = (java.lang.Runnable) r3;
            r8 = r1.c;
            if (r8 != 0) goto L_0x0052;
        L_0x004f:
            defpackage.akcr.a(r5);
        L_0x0052:
            r8.removeCallbacks(r3);
            goto L_0x003f;
        L_0x0056:
            r2 = r1.a;
            r2.clear();
            r2 = r1.b;
            r2 = (java.lang.Iterable) r2;
            r2 = r2.iterator();
        L_0x0063:
            r3 = r2.hasNext();
            if (r3 == 0) goto L_0x007a;
        L_0x0069:
            r3 = r2.next();
            r3 = (android.view.View) r3;
            r8 = r1.c;
            if (r8 != 0) goto L_0x0076;
        L_0x0073:
            defpackage.akcr.a(r5);
        L_0x0076:
            r8.removeView(r3);
            goto L_0x0063;
        L_0x007a:
            r2 = r1.b;
            r2.clear();
            r1.f = r7;
            r1.d = r6;
            r1.e = r6;
            r1.g = r4;
            return;
        L_0x0088:
            r3 = r2 instanceof defpackage.acql;
            if (r3 == 0) goto L_0x01e7;
        L_0x008c:
            r3 = r0.a;
            r3 = r3.a;
            r8 = r0.b;
            r2 = (defpackage.acql) r2;
            r9 = r2.a;
            r10 = r2.b;
            r2 = r2.c;
            r11 = "bottomInset";
            defpackage.akcr.a(r1, r11);
            r1 = r1.intValue();
            r11 = r0.c;
            r12 = r0.d;
            r13 = r0.e;
            defpackage.akcr.b(r8, r5);
            r5 = "friendMarkers";
            defpackage.akcr.b(r9, r5);
            r5 = "viewState";
            defpackage.akcr.b(r10, r5);
            r3.c = r8;
            r5 = r3.g;
            if (r5 != 0) goto L_0x01e7;
        L_0x00bc:
            r5 = new java.util.ArrayList;
            r5.<init>();
            r5 = (java.util.List) r5;
            r9 = r9.iterator();
        L_0x00c7:
            r14 = r9.hasNext();
            if (r14 == 0) goto L_0x01e4;
        L_0x00cd:
            r14 = r9.next();
            r14 = (defpackage.acvr) r14;
            r15 = r14.j;
            r15 = java.lang.Float.compare(r15, r7);
            if (r15 == 0) goto L_0x01d3;
        L_0x00db:
            r15 = r14.i;
            r15 = java.lang.Float.compare(r15, r7);
            if (r15 != 0) goto L_0x00e5;
        L_0x00e3:
            goto L_0x01d3;
        L_0x00e5:
            r15 = 1;
            if (r13 == 0) goto L_0x00f9;
        L_0x00e8:
            r4 = r14.p;
            r4 = r4.a;
            if (r2 == 0) goto L_0x00f1;
        L_0x00ee:
            r6 = r2.a;
            goto L_0x00f2;
        L_0x00f1:
            r6 = 0;
        L_0x00f2:
            r4 = defpackage.akcr.a(r4, r6);
            r4 = r4 ^ r15;
            if (r4 != 0) goto L_0x01d3;
        L_0x00f9:
            r6 = r14.n();
            r4 = r6 instanceof defpackage.acwa;
            if (r4 != 0) goto L_0x0102;
        L_0x0101:
            r6 = 0;
        L_0x0102:
            r6 = (defpackage.acwa) r6;
            if (r6 == 0) goto L_0x01d3;
        L_0x0106:
            r4 = r6.p;
            if (r4 != 0) goto L_0x010c;
        L_0x010a:
            goto L_0x01d3;
        L_0x010c:
            r6 = r4;
            r6 = (java.lang.CharSequence) r6;
            r6 = r6.length();
            if (r6 != 0) goto L_0x0117;
        L_0x0115:
            r6 = 1;
            goto L_0x0118;
        L_0x0117:
            r6 = 0;
        L_0x0118:
            if (r6 != 0) goto L_0x01d3;
        L_0x011a:
            r6 = r14.k;
            r16 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r6 = r6 + r16;
            r15 = r10.a;
            r6 = r6 * r15;
            r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r6 = r6 / r15;
            r7 = r10.a;
            r7 = r7 / r15;
            r6 = r6 - r7;
            r7 = r10.b;
            r15 = r14.j;
            r7 = r7 * r15;
            r15 = r14.l;
            r16 = r16 - r15;
            r15 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r16 = r16 / r15;
            r0 = r10.b;
            r16 = r16 * r0;
            r7 = r7 / r15;
            r0 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
            r7 = r7 * r0;
            r16 = r16 - r7;
            r0 = r10.b;
            r0 = r0 - r16;
            if (r12 == 0) goto L_0x014a;
        L_0x0148:
            r7 = (float) r1;
            r0 = r0 - r7;
        L_0x014a:
            r7 = r14.i;
            r15 = r10.a;
            r7 = r7 * r15;
            r15 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
            r7 = r7 / r15;
            r15 = r3.f;
            r15 = java.lang.Math.max(r0, r15);
            r3.f = r15;
            r15 = r10.a;
            r15 = r6 / r15;
            r24 = r1;
            r23 = r2;
            r1 = (double) r15;
            r19 = -4631501856787818086; // 0xbfb999999999999a float:-1.5881868E-23 double:-0.1;
            r16 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1));
            if (r16 >= 0) goto L_0x0173;
        L_0x016c:
            r1 = defpackage.actx.FAR_RIGHT;
            r20 = r1;
            r22 = 0;
            goto L_0x0196;
        L_0x0173:
            r16 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1));
            if (r16 < 0) goto L_0x0180;
        L_0x0177:
            r22 = 0;
            r16 = (r15 > r22 ? 1 : (r15 == r22 ? 0 : -1));
            if (r16 >= 0) goto L_0x0182;
        L_0x017d:
            r1 = defpackage.actx.RIGHT;
            goto L_0x0194;
        L_0x0180:
            r22 = 0;
        L_0x0182:
            r15 = (r15 > r22 ? 1 : (r15 == r22 ? 0 : -1));
            if (r15 < 0) goto L_0x0192;
        L_0x0186:
            r19 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
            r15 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1));
            if (r15 >= 0) goto L_0x0192;
        L_0x018f:
            r1 = defpackage.actx.LEFT;
            goto L_0x0194;
        L_0x0192:
            r1 = defpackage.actx.FAR_LEFT;
        L_0x0194:
            r20 = r1;
        L_0x0196:
            r1 = defpackage.actv.a;
            r2 = r20.ordinal();
            r1 = r1[r2];
            r2 = 1;
            if (r1 == r2) goto L_0x01b7;
        L_0x01a1:
            r2 = 2;
            if (r1 == r2) goto L_0x01b5;
        L_0x01a4:
            r2 = 3;
            if (r1 == r2) goto L_0x01b1;
        L_0x01a7:
            r2 = 4;
            if (r1 == r2) goto L_0x01ad;
        L_0x01aa:
            r18 = r6;
            goto L_0x01b9;
        L_0x01ad:
            r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r7 = r7 * r1;
            goto L_0x01b5;
        L_0x01b1:
            r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            r7 = r7 * r1;
            goto L_0x01b7;
        L_0x01b5:
            r6 = r6 + r7;
            goto L_0x01aa;
        L_0x01b7:
            r6 = r6 - r7;
            goto L_0x01aa;
        L_0x01b9:
            r1 = new actw;
            r2 = r14.p;
            r2 = r2.a;
            r6 = "friendMarker.marker.id";
            defpackage.akcr.a(r2, r6);
            r16 = r1;
            r17 = r4;
            r19 = r0;
            r21 = r2;
            r16.<init>(r17, r18, r19, r20, r21);
            r5.add(r1);
            goto L_0x01d9;
        L_0x01d3:
            r24 = r1;
            r23 = r2;
            r22 = 0;
        L_0x01d9:
            r2 = r23;
            r1 = r24;
            r4 = 0;
            r6 = 0;
            r7 = 0;
            r0 = r25;
            goto L_0x00c7;
        L_0x01e4:
            r3.a(r5, r8, r11);
        L_0x01e7:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.actt$e.accept(java.lang.Object):void");
        }
    }

    /* renamed from: actt$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: actt$g */
    static final class g extends akcs implements akbk<zfw> {
        private /* synthetic */ actt a;

        g(actt actt) {
            this.a = actt;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(adcw.b, "StatusBubbleManager");
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(actt.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public actt(ftl ftl, actu actu, zgb zgb, zkq zkq) {
        akcr.b(ftl, "configurationProvider");
        akcr.b(actu, "statusLabelAnimationManager");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zkq, "insetsDetector");
        this.d = ftl;
        this.a = actu;
        this.e = zgb;
        this.b = zkq;
    }

    private final zfw a() {
        return (zfw) this.c.b();
    }

    public final ajej a(ViewGroup viewGroup, aclg aclg, boolean z, boolean z2, boolean z3) {
        akcr.b(viewGroup, "statusBubbleHolder");
        akcr.b(aclg, "snapMap");
        viewGroup.setVisibility(0);
        Object b = this.d.b((fth) adew.MAP_V2);
        akcr.a(b, "configurationProvider.ge…pConfigurationKey.MAP_V2)");
        ajeb ajeb = (ajeb) b;
        Object b2 = this.d.b((fth) adew.MAP_V2_VIEW_STATUS);
        akcr.a(b2, "configurationProvider.ge…onKey.MAP_V2_VIEW_STATUS)");
        b = ajdx.a(ajeb, (ajeb) b2, (ajex) new b());
        akcr.a(b, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        Object a = b.b((ajdw) a().f()).a((ajfl) c.a).b((ajfc) new d(this, aclg)).a((ajdw) a().l()).a((ajfb) new e(this, viewGroup, z, z2, z3), (ajfb) f.a);
        akcr.a(a, "Singles.zip(\n           …                       })");
        return a;
    }
}

package defpackage;

/* renamed from: rpb */
public final class rpb implements abju {
    private final ftl a;

    /* renamed from: rpb$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.rqu.a aVar = (defpackage.rqu.a) obj;
            akcr.b(aVar, "it");
            return Boolean.valueOf(aVar == defpackage.rqu.a.ARROYO);
        }
    }

    /* renamed from: rpb$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ boolean a;

        b(boolean z) {
            this.a = z;
        }

        /* JADX WARNING: Missing block: B:18:0x0045, code skipped:
            if (r5.equals("off") == false) goto L_0x0061;
     */
        /* JADX WARNING: Missing block: B:23:0x0059, code skipped:
            if (r4.a != false) goto L_0x0062;
     */
        /* JADX WARNING: Missing block: B:25:0x005e, code skipped:
            if (r4.a != false) goto L_0x0062;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
            /*
            r4 = this;
            r5 = (defpackage.ajxm) r5;
            r0 = "<name for destructuring parameter 0>";
            defpackage.akcr.b(r5, r0);
            r0 = r5.a;
            r0 = (defpackage.rqu.b) r0;
            r5 = r5.b;
            r5 = (java.lang.String) r5;
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x0014;
        L_0x0013:
            goto L_0x0061;
        L_0x0014:
            r3 = defpackage.rpc.a;
            r0 = r0.ordinal();
            r0 = r3[r0];
            if (r0 == r2) goto L_0x0061;
        L_0x001e:
            r3 = 2;
            if (r0 == r3) goto L_0x0062;
        L_0x0021:
            r3 = 3;
            if (r0 == r3) goto L_0x005c;
        L_0x0024:
            r3 = 4;
            if (r0 == r3) goto L_0x0028;
        L_0x0027:
            goto L_0x0061;
        L_0x0028:
            if (r5 != 0) goto L_0x002b;
        L_0x002a:
            goto L_0x0061;
        L_0x002b:
            r0 = r5.hashCode();
            r3 = 50796; // 0xc66c float:7.118E-41 double:2.50966E-319;
            if (r0 == r3) goto L_0x004f;
        L_0x0034:
            r3 = 96673; // 0x179a1 float:1.35468E-40 double:4.7763E-319;
            if (r0 == r3) goto L_0x0048;
        L_0x0039:
            r3 = 109935; // 0x1ad6f float:1.54052E-40 double:5.4315E-319;
            if (r0 == r3) goto L_0x003f;
        L_0x003e:
            goto L_0x0061;
        L_0x003f:
            r0 = "off";
            r5 = r5.equals(r0);
            if (r5 == 0) goto L_0x0061;
        L_0x0047:
            goto L_0x0062;
        L_0x0048:
            r0 = "all";
            r5 = r5.equals(r0);
            goto L_0x0061;
        L_0x004f:
            r0 = "1v1";
            r5 = r5.equals(r0);
            if (r5 == 0) goto L_0x0061;
        L_0x0057:
            r5 = r4.a;
            if (r5 == 0) goto L_0x0061;
        L_0x005b:
            goto L_0x0062;
        L_0x005c:
            r5 = r4.a;
            if (r5 == 0) goto L_0x0061;
        L_0x0060:
            goto L_0x0062;
        L_0x0061:
            r1 = 1;
        L_0x0062:
            r5 = java.lang.Boolean.valueOf(r1);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rpb$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    public rpb(ftl ftl) {
        akcr.b(ftl, "configProvider");
        this.a = ftl;
    }

    public final ajdp<Boolean> a(boolean z) {
        Object v = this.a.v(rqu.SEND_TYPING_PRESENCE_TWEAK);
        akcr.a(v, "configProvider.observeEn…ND_TYPING_PRESENCE_TWEAK)");
        Object u = this.a.u(rqu.SEND_TYPING_PRESENCE);
        akcr.a(u, "configProvider.observeSt…Key.SEND_TYPING_PRESENCE)");
        Object p = ajwa.a(v, u).p(new b(z));
        akcr.a(p, "Observables.combineLates…          }\n            }");
        return p;
    }

    public final ajdx<Boolean> a() {
        Object a = this.a.b((fth) rqu.IS_LOCK_SCREEN_EXPERIENCE_ENABLED).a();
        akcr.a(a, "configProvider.getBoolea…PERIENCE_ENABLED).cache()");
        return a;
    }

    public final ajdx<Boolean> b() {
        Object f = this.a.m(rqu.PRESENCE_TRANSPORT_TWEAK).f(a.a);
        akcr.a(f, "configProvider\n         …ceTransportTweak.ARROYO }");
        return f;
    }
}

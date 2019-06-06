package defpackage;

import java.util.concurrent.Callable;

/* renamed from: txb */
public final class txb implements toz {
    final ajxe a = ajxh.a(new d(this));
    final ftl b;
    private final ajxe c = ajxh.a(e.a);
    private final ajxe d = ajxh.a(new c(this));
    private final ajxe e = ajxh.a(new b(this));
    private final zgb f;
    private final ajwy<twd> g;

    /* renamed from: txb$e */
    static final class e extends akcs implements akbk<ajwl<adgw>> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: txb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: txb$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ txb a;

        d(txb txb) {
            this.a = txb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite("MediaPlayerCapabilities"));
        }
    }

    /* renamed from: txb$c */
    static final class c extends akcs implements akbk<ajdp<Boolean>> {
        private /* synthetic */ txb a;

        /* renamed from: txb$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                adgw adgw = (adgw) obj;
                String str = "it";
                akcr.b(adgw, str);
                obj = adgw.g();
                boolean z = false;
                if (obj != null) {
                    akcr.a(obj, str);
                    if (obj.b() && obj.a()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        c(txb txb) {
            this.a = txb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c().p(1.a).c();
        }
    }

    /* renamed from: txb$b */
    static final class b extends akcs implements akbk<ajdp<Boolean>> {
        final /* synthetic */ txb a;

        /* renamed from: txb$b$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object call() {
                return Boolean.valueOf(this.a.a.b.a((fth) tum.FAST_MOTION_FILTER_ENABLED));
            }
        }

        b(txb txb) {
            this.a = txb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b((Callable) new 1(this)).b((ajdw) ((zfw) this.a.a.b()).h()).c();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(txb.class), "videoFileMediaSourceSubject", "getVideoFileMediaSourceSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(txb.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(txb.class), "isRewindVideoSupported", "isRewindVideoSupported()Lio/reactivex/Observable;"), new akdc(akde.a(txb.class), "isFastMotionFilterSupported", "isFastMotionFilterSupported()Lio/reactivex/Observable;")};
        a aVar = new a();
    }

    public txb(ftl ftl, zgb zgb, ajwy<twd> ajwy) {
        akcr.b(ftl, "compositeConfigurationProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "previewMetricsProvider");
        this.b = ftl;
        this.f = zgb;
        this.g = ajwy;
    }

    public final ajdp<Boolean> a() {
        return (ajdp) this.d.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARNING: Missing block: B:22:0x006c, code skipped:
            if (r1 == null) goto L_0x006e;
     */
    public final void a(defpackage.adgw r9) {
        /*
        r8 = this;
        r0 = "videoFileMediaSource";
        defpackage.akcr.b(r9, r0);
        r0 = r8.c();
        r0 = r0.q();
        if (r0 != 0) goto L_0x009e;
    L_0x000f:
        r0 = r8.g;
        r0 = r0.get();
        r0 = (defpackage.twd) r0;
        r1 = r9.g();
        r2 = 0;
        if (r1 == 0) goto L_0x0027;
    L_0x001e:
        r1 = r1.a();
        r1 = java.lang.Boolean.valueOf(r1);
        goto L_0x0028;
    L_0x0027:
        r1 = r2;
    L_0x0028:
        r3 = r9.g();
        if (r3 == 0) goto L_0x0037;
    L_0x002e:
        r3 = r3.b();
        r3 = java.lang.Boolean.valueOf(r3);
        goto L_0x0038;
    L_0x0037:
        r3 = r2;
    L_0x0038:
        r4 = r9.g();
        if (r4 == 0) goto L_0x0049;
    L_0x003e:
        r4 = r4.c();
        if (r4 == 0) goto L_0x0049;
    L_0x0044:
        r4 = r4.name();
        goto L_0x004a;
    L_0x0049:
        r4 = r2;
    L_0x004a:
        r5 = r9.g();
        if (r5 == 0) goto L_0x0058;
    L_0x0050:
        r2 = r5.d();
        r2 = java.lang.Integer.valueOf(r2);
    L_0x0058:
        r5 = r0.a;
        r6 = defpackage.ipc.REWIND_VIDEO_CAPABILITIES;
        r6 = defpackage.ily.a.a(r6);
        if (r1 == 0) goto L_0x006e;
    L_0x0062:
        r1 = r1.booleanValue();
        r7 = "playback";
        r1 = r6.a(r7, r1);
        if (r1 != 0) goto L_0x006f;
    L_0x006e:
        r1 = r6;
    L_0x006f:
        if (r3 == 0) goto L_0x007f;
    L_0x0071:
        r3 = r3.booleanValue();
        r6 = "encoding";
        r3 = r1.a(r6, r3);
        if (r3 != 0) goto L_0x007e;
    L_0x007d:
        goto L_0x007f;
    L_0x007e:
        r1 = r3;
    L_0x007f:
        if (r4 == 0) goto L_0x0087;
    L_0x0081:
        r3 = "reason";
        r1 = r1.a(r3, r4);
    L_0x0087:
        r5.c(r1, 1);
        if (r2 == 0) goto L_0x009e;
    L_0x008c:
        r2 = (java.lang.Number) r2;
        r1 = r2.intValue();
        r0 = r0.a;
        r2 = defpackage.ipc.REWIND_VIDEO_CAPABILITIES_POOL;
        r2 = defpackage.ily.a.a(r2);
        r3 = (long) r1;
        r0.b(r2, r3);
    L_0x009e:
        r0 = r8.c();
        r0.a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txb.a(adgw):void");
    }

    public final ajdp<Boolean> b() {
        return (ajdp) this.e.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwl<adgw> c() {
        return (ajwl) this.c.b();
    }
}

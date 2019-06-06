package com.snap.spectacles.lib.fragments.presenters;

import com.snap.spectacles.config.SpectaclesHttpInterface;
import defpackage.abqo;
import defpackage.ahgc;
import defpackage.ahgl;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajeb;
import defpackage.ajei;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajsn;
import defpackage.ajvo;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.akej;
import defpackage.aken;
import defpackage.idd;
import defpackage.j;
import defpackage.k;
import defpackage.s;
import defpackage.xai;
import defpackage.xbd;
import defpackage.xdb;
import defpackage.xme;
import defpackage.xpw;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zll;
import java.util.concurrent.Callable;

public final class SpectaclesEditNamePresenter extends zll<xme> implements k {
    public String a;
    public String b;
    public String c;
    final ajxe d = ajxh.a(a.a);
    public final ajei e;
    final xpw f;
    final ajei g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final abqo k;

    public static final class b<V> implements Callable<Object> {
        final /* synthetic */ SpectaclesEditNamePresenter a;
        private /* synthetic */ xdb b;
        private /* synthetic */ String c;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$1 */
        static final class AnonymousClass1 extends akcs implements akbl<xme, ajxw> {
            private /* synthetic */ b a;

            AnonymousClass1(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((xme) obj, "receiver$0");
                xme xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.m();
                }
                xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.o();
                }
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$2 */
        static final class AnonymousClass2 extends akcs implements akbl<xme, ajxw> {
            private /* synthetic */ b a;
            private /* synthetic */ String b;

            AnonymousClass2(b bVar, String str) {
                this.a = bVar;
                this.b = str;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((xme) obj, "receiver$0");
                xme xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.m();
                }
                xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.b(this.b);
                }
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$3 */
        static final class AnonymousClass3 extends akcs implements akbl<xme, ajxw> {
            private /* synthetic */ b a;

            AnonymousClass3(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((xme) obj, "receiver$0");
                xme xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.n();
                }
                return ajxw.a;
            }
        }

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$4 */
        static final class AnonymousClass4 extends akcs implements akbl<xme, ajxw> {
            private /* synthetic */ b a;
            private /* synthetic */ String b;

            AnonymousClass4(b bVar, String str) {
                this.a = bVar;
                this.b = str;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((xme) obj, "receiver$0");
                xme xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.p();
                }
                return ajxw.a;
            }
        }

        public b(xdb xdb, SpectaclesEditNamePresenter spectaclesEditNamePresenter, String str) {
            this.b = xdb;
            this.a = spectaclesEditNamePresenter;
            this.c = str;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:37:0x013c in {2, 9, 11, 12, 15, 20, 21, 22, 25, 30, 33, 34, 36} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r6 = this;
            r0 = r6.c;
            r0 = (java.lang.CharSequence) r0;
            r1 = r6.a;
            r1 = r1.c;
            if (r1 != 0) goto L_0x000f;
            r2 = "deviceEmoji";
            defpackage.akcr.a(r2);
            r2 = new akfr;
            r2.<init>(r1);
            r1 = "";
            r0 = r2.b(r0, r1);
            if (r0 == 0) goto L_0x0134;
            r0 = (java.lang.CharSequence) r0;
            r0 = defpackage.akgc.b(r0);
            r0 = r0.toString();
            r1 = r0.length();
            r2 = 4;
            r3 = 0;
            if (r1 >= r2) goto L_0x004b;
            r0 = r6.a;
            r0 = r0.getTarget();
            r0 = (defpackage.xme) r0;
            if (r0 == 0) goto L_0x004a;
            r1 = r6.a;
            r2 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$1;
            r2.<init>(r6);
            r2 = (defpackage.akbl) r2;
            r0 = r1.e.a(defpackage.ajcx.b((java.util.concurrent.Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter.d(r1, r0, r2)).b((defpackage.ajdw) r1.c().l()).e());
            r0 = java.lang.Boolean.valueOf(r0);
            return r0;
            return r3;
            r1 = r6.a;
            r2 = "nameCandidate";
            defpackage.akcr.b(r0, r2);
            r2 = r1.f;
            r1 = r1.a;
            if (r1 != 0) goto L_0x005d;
            r4 = "serialNumber";
            defpackage.akcr.a(r4);
            r1 = r2.a(r0, r1);
            if (r1 == 0) goto L_0x007c;
            r1 = r6.a;
            r1 = r1.getTarget();
            r1 = (defpackage.xme) r1;
            if (r1 == 0) goto L_0x007b;
            r2 = r6.a;
            r3 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$2;
            r3.<init>(r6, r0);
            r3 = (defpackage.akbl) r3;
            r0 = r2.e.a(defpackage.ajcx.b((java.util.concurrent.Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter.d(r2, r1, r3)).b((defpackage.ajdw) r2.c().l()).e());
            goto L_0x0045;
            return r3;
            r1 = r6.a;
            r1 = r1.getTarget();
            r1 = (defpackage.xme) r1;
            if (r1 == 0) goto L_0x0092;
            r2 = r6.a;
            r4 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$3;
            r4.<init>(r6);
            r4 = (defpackage.akbl) r4;
            r2.e.a(defpackage.ajcx.b((java.util.concurrent.Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter.d(r2, r1, r4)).b((defpackage.ajdw) r2.c().l()).e());
            r1 = r6.b;
            r1 = r1.k();
            if (r1 == 0) goto L_0x0133;
            r2 = r1.a();
            r2 = (java.lang.CharSequence) r2;
            r4 = r0;
            r4 = (java.lang.CharSequence) r4;
            r2 = android.text.TextUtils.equals(r2, r4);
            if (r2 != 0) goto L_0x0120;
            r1.a(r0);
            r4 = defpackage.abqo.a();
            r1.a(r4);
            r2 = r6.a;
            r2 = r2.b();
            r2 = r2.j();
            r4 = r6.b;
            r4 = r4.d;
            r2.a(r4, r1);
            r1 = r6.a;
            r2 = r6.b;
            r4 = "device";
            defpackage.akcr.b(r2, r4);
            r4 = new ahgl;
            r4.<init>();
            r5 = defpackage.ahgk.UPDATE_DISPLAY;
            r5 = r5.a();
            r4.a = r5;
            r2 = defpackage.xpw.a(r2);
            r4.b = r2;
            r2 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$h;
            r2.<init>(r1);
            r2 = (java.util.concurrent.Callable) r2;
            r2 = defpackage.ajcx.b(r2);
            r5 = r1.c();
            r5 = r5.g();
            r5 = (defpackage.ajdw) r5;
            r2 = r2.b(r5);
            r5 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$i;
            r5.<init>(r1, r4);
            r5 = (java.util.concurrent.Callable) r5;
            r2 = r2.c(r5);
            r4 = r1.c();
            r4 = r4.g();
            r4 = (defpackage.ajdw) r4;
            r2 = r2.b(r4);
            r2 = r2.c();
            r4 = "Completable.fromCallable…             .subscribe()";
            defpackage.akcr.a(r2, r4);
            r1 = r1.g;
            defpackage.ajvv.a(r2, r1);
            r1 = r6.a;
            r1 = r1.getTarget();
            r1 = (defpackage.xme) r1;
            if (r1 == 0) goto L_0x0133;
            r2 = r6.a;
            r3 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b$4;
            r3.<init>(r6, r0);
            goto L_0x0074;
            return r3;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type kotlin.CharSequence";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$b.call():java.lang.Object");
        }
    }

    public static final class c<V> implements Callable<Object> {
        final /* synthetic */ SpectaclesEditNamePresenter a;

        /* renamed from: com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$c$1 */
        static final class AnonymousClass1 extends akcs implements akbl<xme, ajxw> {
            private /* synthetic */ c a;

            AnonymousClass1(c cVar) {
                this.a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((xme) obj, "receiver$0");
                xme xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.a(this.a.a.a());
                }
                xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.j();
                }
                xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.l();
                }
                xme = (xme) this.a.a.getTarget();
                if (xme != null) {
                    xme.k();
                }
                return ajxw.a;
            }
        }

        public c(SpectaclesEditNamePresenter spectaclesEditNamePresenter) {
            this.a = spectaclesEditNamePresenter;
        }

        /* JADX WARNING: Missing block: B:15:0x0045, code skipped:
            if (r0 == null) goto L_0x0047;
     */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r6 = this;
            r0 = r6.a;
            r0 = r0.b();
            r0 = r0.j();
            r1 = r6.a;
            r1 = r1.a;
            if (r1 != 0) goto L_0x0015;
        L_0x0010:
            r2 = "serialNumber";
            defpackage.akcr.a(r2);
        L_0x0015:
            r0 = r0.b(r1);
            r1 = r6.a;
            r2 = r1.f;
            r3 = 0;
            if (r0 == 0) goto L_0x0025;
        L_0x0020:
            r4 = r0.k();
            goto L_0x0026;
        L_0x0025:
            r4 = r3;
        L_0x0026:
            r5 = 1;
            r2 = r2.a(r4, r5);
            r4 = "";
            if (r2 != 0) goto L_0x0030;
        L_0x002f:
            r2 = r4;
        L_0x0030:
            r5 = "<set-?>";
            defpackage.akcr.b(r2, r5);
            r1.b = r2;
            r1 = r6.a;
            if (r0 == 0) goto L_0x0047;
        L_0x003b:
            r0 = r0.k();
            if (r0 == 0) goto L_0x0047;
        L_0x0041:
            r0 = r0.c();
            if (r0 != 0) goto L_0x0048;
        L_0x0047:
            r0 = r4;
        L_0x0048:
            defpackage.akcr.b(r0, r5);
            r1.c = r0;
            r0 = r6.a;
            r0 = r0.getTarget();
            r0 = (defpackage.xme) r0;
            if (r0 == 0) goto L_0x0069;
        L_0x0057:
            r1 = r6.a;
            r2 = new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$c$1;
            r2.<init>(r6);
            r2 = (defpackage.akbl) r2;
            r0 = r1.e.a(defpackage.ajcx.b((java.util.concurrent.Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter.d(r1, r0, r2)).b((defpackage.ajdw) r1.c().l()).e());
            r0 = java.lang.Boolean.valueOf(r0);
            return r0;
        L_0x0069:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter$c.call():java.lang.Object");
        }
    }

    static final class d<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesEditNamePresenter a;
        private /* synthetic */ Object b;
        private /* synthetic */ akbl c;

        d(SpectaclesEditNamePresenter spectaclesEditNamePresenter, Object obj, akbl akbl) {
            this.a = spectaclesEditNamePresenter;
            this.b = obj;
            this.c = akbl;
        }

        public final /* synthetic */ Object call() {
            if (((xme) this.a.getTarget()) == null) {
                return null;
            }
            this.c.invoke(this.b);
            return ajxw.a;
        }
    }

    static final class h<V> implements Callable<Object> {
        private /* synthetic */ SpectaclesEditNamePresenter a;

        h(SpectaclesEditNamePresenter spectaclesEditNamePresenter) {
            this.a = spectaclesEditNamePresenter;
        }

        public final /* synthetic */ Object call() {
            return ((SpectaclesHttpInterface) this.a.i.b());
        }
    }

    static final class i<V> implements Callable<ajxw> {
        private /* synthetic */ SpectaclesEditNamePresenter a;
        private /* synthetic */ ahgl b;

        static final class a<T> implements ajfb<ahgc> {
            public static final a a = new a();

            a() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static final class b<T, R> implements ajfc<Throwable, ajeb<? extends ahgc>> {
            public static final b a = new b();

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((Throwable) obj, "it");
                return ajvo.a(ajsn.a);
            }
        }

        i(SpectaclesEditNamePresenter spectaclesEditNamePresenter, ahgl ahgl) {
            this.a = spectaclesEditNamePresenter;
            this.b = ahgl;
        }

        public final /* synthetic */ Object call() {
            ((SpectaclesHttpInterface) this.a.i.b()).updateSpectaclesDevice(this.b).a((ajdw) this.a.c().f()).c((ajfb) a.a).h(b.a).c();
            return ajxw.a;
        }
    }

    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return xai.f.callsite("SpectaclesEditNamePresenter");
        }
    }

    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ SpectaclesEditNamePresenter a;
        private /* synthetic */ ajwy b;

        e(SpectaclesEditNamePresenter spectaclesEditNamePresenter, ajwy ajwy) {
            this.a = spectaclesEditNamePresenter;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.b.get();
            return zgb.a((idd) this.a.d.b());
        }
    }

    static final class f extends akcs implements akbk<xbd> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (xbd) this.a.get();
        }
    }

    static final class g extends akcq implements akbk<SpectaclesHttpInterface> {
        g(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (SpectaclesHttpInterface) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(SpectaclesEditNamePresenter.class), "specsCoreComponent", "getSpecsCoreComponent()Lcom/snap/spectacles/base/di/components/SpectaclesCoreComponent;"), new akdc(akde.a(SpectaclesEditNamePresenter.class), "spectaclesHttpInterface", "getSpectaclesHttpInterface()Lcom/snap/spectacles/config/SpectaclesHttpInterface;"), new akdc(akde.a(SpectaclesEditNamePresenter.class), "callSite", "getCallSite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(SpectaclesEditNamePresenter.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
    }

    public SpectaclesEditNamePresenter(ajwy<xbd> ajwy, xpw xpw, aipn<SpectaclesHttpInterface> aipn, ajwy<zgb> ajwy2, abqo abqo, ajei ajei) {
        akcr.b(ajwy, "specsCoreComponentLazy");
        akcr.b(xpw, "deviceUtils");
        akcr.b(aipn, "httpInterface");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(abqo, "clock");
        akcr.b(ajei, "userSessionDisposable");
        this.f = xpw;
        this.k = abqo;
        this.g = ajei;
        this.h = ajxh.a(new f(ajwy));
        this.i = ajxh.a(new g(aipn));
        this.j = ajxh.a(new e(this, ajwy2));
        this.e = new ajei();
    }

    public final String a() {
        String str = this.b;
        if (str == null) {
            akcr.a("deviceName");
        }
        return str;
    }

    /* renamed from: a */
    public final void takeTarget(xme xme) {
        akcr.b(xme, "target");
        super.takeTarget(xme);
        xme.getLifecycle().a(this);
    }

    public final xbd b() {
        return (xbd) this.h.b();
    }

    public final zfw c() {
        return (zfw) this.j.b();
    }

    public final void dropTarget() {
        xme xme = (xme) getTarget();
        if (xme != null) {
            j lifecycle = xme.getLifecycle();
            if (lifecycle != null) {
                lifecycle.b(this);
            }
        }
        super.dropTarget();
    }

    @s(a = defpackage.j.a.ON_DESTROY)
    public final void onDestroy() {
        this.e.a();
    }
}

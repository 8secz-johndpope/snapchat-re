package defpackage;

import com.google.common.base.Optional;
import java.util.Map;

/* renamed from: acpe */
public final class acpe {
    public ajwy<acpi> a;
    final ajxe b = ajxh.a(new h(this));
    public final zfw c = zgb.a(adcw.b.callsite("MapEffectsController"));
    public final ajwl<Optional<String>> d;
    final ajwo<acpt> e;
    final acpc f;
    private final ajxe g = ajxh.a(new g(this));

    /* renamed from: acpe$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acpe$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ acpu a;

        e(acpu acpu) {
            this.a = acpu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((acpm) obj, "it");
            return new acpt(((acpm) this.a).b);
        }
    }

    /* renamed from: acpe$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ acpu a;

        f(acpu acpu) {
            this.a = acpu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((acpm) obj, "it");
            return this.a;
        }
    }

    /* renamed from: acpe$g */
    static final class g extends akcs implements akbk<acpi> {
        private /* synthetic */ acpe a;

        g(acpe acpe) {
            this.a = acpe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajwy ajwy = this.a.a;
            if (ajwy == null) {
                akcr.a("rendererProvider");
            }
            return (acpi) ajwy.get();
        }
    }

    /* renamed from: acpe$h */
    static final class h extends akcs implements akbk<acpi[]> {
        private /* synthetic */ acpe a;

        h(acpe acpe) {
            this.a = acpe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new acpi[]{this.a.a()};
        }
    }

    /* renamed from: acpe$b */
    public static final class b extends akcq implements akca<actz, Map<String, acpm>, Optional<String>, ajdp<? extends acpu>> {
        public b(acpe acpe) {
            super(3, acpe);
        }

        public final String getName() {
            return "loadNewEffect";
        }

        public final akej getOwner() {
            return akde.a(acpe.class);
        }

        public final String getSignature() {
            return "loadNewEffect$map_core_release(Lcom/snapchat/map/gl/BackgroundGLThread;Ljava/util/Map;Lcom/google/common/base/Optional;)Lio/reactivex/Observable;";
        }

        /* JADX WARNING: Missing block: B:5:0x0041, code skipped:
            if (r8 == null) goto L_0x0043;
     */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            /*
            r6 = this;
            r5 = r7;
            r5 = (defpackage.actz) r5;
            r8 = (java.util.Map) r8;
            r9 = (com.google.common.base.Optional) r9;
            r7 = "p1";
            defpackage.akcr.b(r5, r7);
            r7 = "p2";
            defpackage.akcr.b(r8, r7);
            r7 = "p3";
            defpackage.akcr.b(r9, r7);
            r7 = r6.receiver;
            r7 = (defpackage.acpe) r7;
            r0 = "glThread";
            defpackage.akcr.b(r5, r0);
            r1 = "loadedEffects";
            defpackage.akcr.b(r8, r1);
            r1 = "effectNameOptional";
            defpackage.akcr.b(r9, r1);
            r1 = r9.isPresent();
            if (r1 == 0) goto L_0x0089;
        L_0x002f:
            r1 = r9.get();
            r1 = (java.lang.String) r1;
            r8 = r8.get(r1);
            r8 = (defpackage.acpm) r8;
            if (r8 == 0) goto L_0x0043;
        L_0x003d:
            r8 = defpackage.ajdp.b(r8);
            if (r8 != 0) goto L_0x0094;
        L_0x0043:
            r7 = r7.f;
            r8 = r9.get();
            r9 = "effectNameOptional.get()";
            defpackage.akcr.a(r8, r9);
            r4 = r8;
            r4 = (java.lang.String) r4;
            r8 = "effectName";
            defpackage.akcr.b(r4, r8);
            defpackage.akcr.b(r5, r0);
            r8 = new acpb;
            r1 = r7.a;
            r2 = r7.b;
            r3 = r7.c;
            r0 = r8;
            r0.<init>(r1, r2, r3, r4, r5);
            r7 = r8.a;
            r9 = r8.b;
            r0 = "weather.json";
            r7 = r7.a(r9, r0);
            r9 = new acpb$d;
            r9.<init>(r8);
            r9 = (defpackage.ajfc) r9;
            r7 = r7.a(r9);
            r8 = "downloader.ensureMapWorl…  }\n                    }";
            defpackage.akcr.a(r7, r8);
            r7 = r7.i();
            r8 = "assetDownloader.loadEffe… glThread).toObservable()";
            defpackage.akcr.a(r7, r8);
            return r7;
        L_0x0089:
            r7 = defpackage.acph.a;
            r8 = defpackage.ajdp.b(r7);
            r7 = "Observable.just(HideWorldEffect)";
            defpackage.akcr.a(r8, r7);
        L_0x0094:
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acpe$b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: acpe$c */
    public static final class c extends akcq implements akca<Map<String, acpm>, acwr, acpu, ajdp<acpu>> {
        public c(acpe acpe) {
            super(3, acpe);
        }

        public final String getName() {
            return "onEffectLoaded";
        }

        public final akej getOwner() {
            return akde.a(acpe.class);
        }

        public final String getSignature() {
            return "onEffectLoaded$map_core_release(Ljava/util/Map;Lcom/snapchat/map/gl/overlay/GLOverlayController;Lcom/snapchat/map/feature/effect/WorldEffectResult;)Lio/reactivex/Observable;";
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0085 in {2, 4, 7, 10, 12} preds:[]
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
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            /*
            r3 = this;
            r4 = (java.util.Map) r4;
            r5 = (defpackage.acwr) r5;
            r6 = (defpackage.acpu) r6;
            r0 = "p1";
            defpackage.akcr.b(r4, r0);
            r0 = "p2";
            defpackage.akcr.b(r5, r0);
            r0 = "p3";
            defpackage.akcr.b(r6, r0);
            r0 = r3.receiver;
            r0 = (defpackage.acpe) r0;
            r1 = "loadedEffects";
            defpackage.akcr.b(r4, r1);
            r1 = "glOverlayController";
            defpackage.akcr.b(r5, r1);
            r1 = "worldEffectResult";
            defpackage.akcr.b(r6, r1);
            r1 = r6 instanceof defpackage.acpn;
            if (r1 == 0) goto L_0x0036;
            r4 = defpackage.ajdp.b(r6);
            r5 = "Observable.just(worldEffectResult)";
            defpackage.akcr.a(r4, r5);
            return r4;
            r1 = r6 instanceof defpackage.acpm;
            if (r1 == 0) goto L_0x0065;
            r1 = r6;
            r1 = (defpackage.acpm) r1;
            r2 = r1.b;
            r4.put(r2, r6);
            r4 = r0.b;
            r4 = r4.b();
            r4 = (defpackage.acpi[]) r4;
            r4 = (defpackage.acwq.b[]) r4;
            r5.a(r4);
            r4 = r0.a();
            r4 = r4.a(r1);
            r5 = new acpe$e;
            r5.<init>(r6);
            r5 = (defpackage.ajfc) r5;
            r4 = r4.p(r5);
            r5 = "renderer.show(worldEffec…worldEffectResult.name) }";
            goto L_0x0032;
            r4 = r6 instanceof defpackage.acpt;
            if (r4 == 0) goto L_0x007f;
            r4 = r0.a();
            r4 = r4.a();
            r5 = new acpe$f;
            r5.<init>(r6);
            r5 = (defpackage.ajfc) r5;
            r4 = r4.p(r5);
            r5 = "renderer.hide().map { worldEffectResult }";
            goto L_0x0032;
            r4 = new ajxk;
            r4.<init>();
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acpe$c.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: acpe$d */
    public static final class d extends akcq implements akbl<acpu, ajxw> {
        public d(acpe acpe) {
            super(1, acpe);
        }

        public final String getName() {
            return "hideOnComplete";
        }

        public final akej getOwner() {
            return akde.a(acpe.class);
        }

        public final String getSignature() {
            return "hideOnComplete$map_core_release(Lcom/snapchat/map/feature/effect/WorldEffectResult;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (acpu) obj;
            akcr.b(obj, "p1");
            acpe acpe = (acpe) this.receiver;
            akcr.b(obj, "event");
            if (obj instanceof acpt) {
                acpe.e.a(obj);
            }
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(acpe.class), "renderer", "getRenderer()Lcom/snapchat/map/feature/effect/MapEffectsRenderer;"), new akdc(akde.a(acpe.class), "rendererArray", "getRendererArray()[Lcom/snapchat/map/feature/effect/MapEffectsRenderer;")};
        a aVar = new a();
    }

    public acpe(zgb zgb, acpc acpc) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(acpc, "assetDownloader");
        this.f = acpc;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.d = ajwl;
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create()");
        this.e = ajwl;
    }

    /* Access modifiers changed, original: final */
    public final acpi a() {
        return (acpi) this.g.b();
    }

    public final ajdp<acpt> a(String str) {
        this.d.a(Optional.fromNullable(str));
        if (str != null) {
            return this.e;
        }
        Object b = ajdp.b(acph.a);
        akcr.a(b, "Observable.just(HideWorldEffect)");
        return b;
    }
}

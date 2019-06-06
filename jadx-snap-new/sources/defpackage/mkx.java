package defpackage;

import android.content.Context;
import com.looksery.sdk.DeviceClass;
import com.looksery.sdk.InstrumentationDelegatesFactory;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.Logger;
import com.looksery.sdk.audio.AudioPlaybackService;
import com.looksery.sdk.audio.AudioServices;
import com.looksery.sdk.audio.ScenariumAudioPlaybackService;
import com.looksery.sdk.exception.LookseryOutOfMemoryException;
import com.looksery.sdk.exception.LookseryOutOfOpenGlMemoryException;
import com.looksery.sdk.exception.LookserySdkException;
import com.looksery.sdk.io.LensCoreResources;
import com.looksery.sdk.io.ResourceResolver;
import com.looksery.sdk.listener.LookseryNativeExceptionListener;
import com.looksery.sdk.listener.ProfilerEventListener;
import com.looksery.sdk.media.ExoPlayerAudioTrackFactory;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.miq.c.a;
import defpackage.mmw.b;
import defpackage.mnc.a.d;
import defpackage.mnc.a.e;
import defpackage.mnc.a.f;
import defpackage.mnc.a.g;
import defpackage.mnc.a.h;
import defpackage.mnc.a.i;
import defpackage.mnc.a.j;
import defpackage.mnc.a.k;
import defpackage.mnc.a.l;
import defpackage.mnc.a.m;
import defpackage.mnc.a.n;
import defpackage.mor.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: mkx */
public final class mkx implements mmf {
    public static final a e;
    private final ajxe A;
    private final ajxe B;
    private final mng C;
    final ajxe<mpn> a;
    final LinkedBlockingDeque<akbl<LSCoreManagerWrapper, ajxw>> b = new LinkedBlockingDeque();
    final mhk c;
    final zfw d;
    private final ajei f = new ajei();
    private volatile boolean g;
    private final ajxe h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final ajxe q;
    private final ajxe r;
    private final ajxe s;
    private final ajxe t;
    private final ajxe u;
    private final ajxe v;
    private final ajxe w;
    private final ajxe x;
    private final ajxe y;
    private final ajxe z;

    /* renamed from: mkx$a */
    public static final class a {

        /* renamed from: mkx$a$a */
        static final class a implements InstrumentationDelegatesFactory {
            static volatile boolean a;
            public static final a b = new a();

            /* renamed from: mkx$a$a$a */
            static final class a implements Logger {
                public static final a a = new a();

                a() {
                }

                public final void printMessage(int i, String str) {
                }
            }

            private a() {
            }

            public final Logger newLogger() {
                return a.a;
            }

            public final ProfilerEventListener newProfilerEventListener() {
                return null;
            }
        }

        /* renamed from: mkx$a$k */
        static final class k extends akcs implements akbk<mky> {
            public static final k a = new k();

            k() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new mky();
            }
        }

        /* renamed from: mkx$a$p */
        static final class p extends akcs implements akbl<mkx, mma> {
            public static final p a = new p();

            p() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "it");
                return new mma(mkx);
            }
        }

        /* renamed from: mkx$a$q */
        static final class q extends akcs implements akbl<mkx, mlb> {
            public static final q a = new q();

            q() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "it");
                return new mlb(mkx);
            }
        }

        /* renamed from: mkx$a$m */
        static final class m extends akcs implements akbl<mkx, mkh> {
            public static final m a = new m();

            m() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "it");
                return new mkh(mkx);
            }
        }

        /* renamed from: mkx$a$n */
        static final class n extends akcs implements akbl<mkx, mlm> {
            public static final n a = new n();

            n() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "it");
                return new mlm(mkx);
            }
        }

        /* renamed from: mkx$a$b */
        static final class b extends akcs implements akbk<AudioPlaybackService> {
            private /* synthetic */ mmu a;

            b(mmu mmu) {
                this.a = mmu;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return AudioServices.playback(LensCoreResources.getResolver(), this.a.c.a());
            }
        }

        /* renamed from: mkx$a$r */
        static final class r extends akcs implements akbk<ScenariumAudioPlaybackService> {
            private /* synthetic */ Context a;

            r(Context context) {
                this.a = context;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                ResourceResolver resolver = LensCoreResources.getResolver();
                return AudioServices.scenariumPlaybackService(resolver, ExoPlayerAudioTrackFactory.newInstance(this.a, resolver));
            }
        }

        /* renamed from: mkx$a$l */
        static final class l extends akcs implements akbl<mkx, mlq> {
            final /* synthetic */ moq a;
            private /* synthetic */ c b;

            /* renamed from: mkx$a$l$1 */
            static final class 1 extends akcs implements akbl<abpq, ajxw> {
                private /* synthetic */ l a;

                1(l lVar) {
                    this.a = lVar;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    abpq abpq = (abpq) obj;
                    akcr.b(abpq, "it");
                    this.a.a.a = abpq;
                    return ajxw.a;
                }
            }

            l(c cVar, moq moq) {
                this.b = cVar;
                this.a = moq;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mlq(mkx, this.b, new 1(this));
            }
        }

        /* renamed from: mkx$a$c */
        static final class c extends akcs implements akbl<mkx, mls> {
            final /* synthetic */ moq a;
            private /* synthetic */ mmu b;

            /* renamed from: mkx$a$c$1 */
            static final class 1 extends akcs implements akbk<abpq> {
                private /* synthetic */ c a;

                1(c cVar) {
                    this.a = cVar;
                    super(0);
                }

                public final /* bridge */ /* synthetic */ Object invoke() {
                    return this.a.a.a;
                }
            }

            c(moq moq, mmu mmu) {
                this.a = moq;
                this.b = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mls(this.b.a, mkx, this.b.o, this.b.c, new 1(this));
            }
        }

        /* renamed from: mkx$a$o */
        static final class o extends akcs implements akbl<mkx, mkd> {
            private /* synthetic */ ajxe a;
            private /* synthetic */ ajxe b;

            o(ajxe ajxe, ajxe ajxe2) {
                this.a = ajxe;
                this.b = ajxe2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mkx) obj, "it");
                Object b = this.a.b();
                akcr.a(b, "legacyAudioPlaybackService.value");
                AudioPlaybackService audioPlaybackService = (AudioPlaybackService) b;
                Object b2 = this.b.b();
                akcr.a(b2, "scenariumAudioPlaybackService.value");
                return new mkd(audioPlaybackService, (ScenariumAudioPlaybackService) b2);
            }
        }

        /* renamed from: mkx$a$d */
        static final class d extends akcs implements akbl<mkx, mkp> {
            private /* synthetic */ mmu a;

            d(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "lensCore");
                return new mkp(mkx, this.a.h, this.a.c);
            }
        }

        /* renamed from: mkx$a$e */
        static final class e extends akcs implements akbl<mkx, LSCoreManagerWrapper> {
            final /* synthetic */ mmu a;
            private /* synthetic */ Context b;
            private /* synthetic */ miw.c c;
            private /* synthetic */ a d;
            private /* synthetic */ ajxe e;
            private /* synthetic */ ajxe f;
            private /* synthetic */ ajxe g;

            /* renamed from: mkx$a$e$3 */
            static final class 3 implements LookseryNativeExceptionListener {
                private /* synthetic */ e a;
                private /* synthetic */ mkx b;

                3(e eVar, mkx mkx) {
                    this.a = eVar;
                    this.b = mkx;
                }

                public final void onExceptionInNativeCode(LookserySdkException lookserySdkException) {
                    mng mng = this.a.a.i;
                    if (mng != null) {
                        String str = "exception";
                        akcr.a((Object) lookserySdkException, str);
                        akcr.b(lookserySdkException, str);
                        mmw.c cVar = lookserySdkException instanceof LookseryOutOfOpenGlMemoryException ? new mmw.c(lookserySdkException, mmx.a(lookserySdkException)) : lookserySdkException instanceof LookseryOutOfMemoryException ? new b(lookserySdkException, mmx.a(lookserySdkException)) : new defpackage.mmw.a(lookserySdkException, mmx.a(lookserySdkException));
                        mng.a(cVar);
                    }
                }
            }

            /* renamed from: mkx$a$e$1 */
            static final class 1<T> implements ajfb<Boolean> {
                private /* synthetic */ mna a;

                1(mna mna) {
                    this.a = mna;
                }

                public final /* synthetic */ void accept(Object obj) {
                    obj = (Boolean) obj;
                    mna mna = this.a;
                    akcr.a(obj, "it");
                    mna.a(obj.booleanValue());
                }
            }

            /* renamed from: mkx$a$e$2 */
            static final class 2 implements ajev {
                private /* synthetic */ Closeable a;

                2(Closeable closeable) {
                    this.a = closeable;
                }

                public final void run() {
                    this.a.close();
                }
            }

            e(Context context, miw.c cVar, a aVar, ajxe ajxe, ajxe ajxe2, ajxe ajxe3, mmu mmu) {
                this.b = context;
                this.c = cVar;
                this.d = aVar;
                this.e = ajxe;
                this.f = ajxe2;
                this.g = ajxe3;
                this.a = mmu;
                super(1);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0186 in {4, 10, 16, 17, 20, 22} preds:[]
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
                	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
                	at java.util.ArrayList.forEach(ArrayList.java:1257)
                	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
                	at jadx.core.ProcessClass.process(ProcessClass.java:32)
                	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
                	at jadx.api.JavaClass.decompile(JavaClass.java:62)
                	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
                */
            private com.looksery.sdk.LSCoreManagerWrapper a(defpackage.mkx r9) {
                /*
                r8 = this;
                r0 = "lensCore";
                defpackage.akcr.b(r9, r0);
                r0 = new com.looksery.sdk.media.ExoPlayerVideoStreamFactory;
                r1 = r8.b;
                r2 = com.looksery.sdk.io.LensCoreResources.getResolver();
                r0.<init>(r1, r2);
                r1 = new mna;
                r2 = r8.a;
                r2 = r2.p;
                r1.<init>(r2);
                r2 = r8.c;
                r3 = defpackage.mja.FORCE_TO_USE_SW_RECORDING;
                r3 = (defpackage.mje) r3;
                r2 = r2.a(r3);
                r3 = 1;
                r2 = r2.c(r3);
                r3 = new mkx$a$e$1;
                r3.<init>(r1);
                r3 = (defpackage.ajfb) r3;
                r2 = r2.f(r3);
                r3 = "reader\n                 …                        }";
                defpackage.akcr.a(r2, r3);
                r9.a(r2);
                r2 = new com.looksery.sdk.domain.CoreConfiguration$CoreConfigurationBuilder;
                r3 = r8.b;
                r2.<init>(r3);
                r3 = 0;
                r2 = r2.setDisableTracking(r3);
                r4 = r8.a;
                r4 = r4.g;
                r2 = r2.setPreferGmsFaceDetector(r4);
                r4 = r8.d;
                r4 = (com.looksery.sdk.InstrumentationDelegatesFactory) r4;
                r2 = r2.setInstrumentationDelegatesFactory(r4);
                r4 = new com.looksery.sdk.media.DefaultVideoCodecFactory;
                r1 = (com.looksery.sdk.media.VideoWriterFactory) r1;
                r0 = (com.looksery.sdk.media.VideoStreamFactory) r0;
                r4.<init>(r1, r0);
                r4 = (com.looksery.sdk.media.VideoCodecFactory) r4;
                r0 = r2.setVideoCodecFactory(r4);
                r1 = new mkk;
                r2 = r8.a;
                r2 = r2.f;
                r1.<init>(r2);
                r1 = (com.looksery.sdk.ExperimentProvider) r1;
                r0 = r0.setExperimentProvider(r1);
                r0 = r0.build();
                r1 = r8.a;
                r1 = r1.h;
                r1 = (com.looksery.sdk.io.ResourceResolver) r1;
                r2 = com.looksery.sdk.io.LensCoreResources.Chaining.HEAD;
                r4 = "content";
                r1 = com.looksery.sdk.io.LensCoreResources.chainResolverForScheme(r4, r1, r2);
                r2 = "LensCoreResources.chainR…eResources.Chaining.HEAD)";
                defpackage.akcr.a(r1, r2);
                r2 = new mkx$a$e$2;
                r2.<init>(r1);
                r2 = (defpackage.ajev) r2;
                r1 = defpackage.ajek.a(r2);
                r2 = "Disposables.fromAction {…                        }";
                defpackage.akcr.a(r1, r2);
                r9.a(r1);
                r1 = new com.looksery.sdk.LSCoreManagerWrapper;
                r2 = r8.b;
                r1.<init>(r2, r0);
                r1.printOpenGLVersion();
                r0 = 1;
                r1.setShouldCatchNativeExceptions(r0);
                r1.setInitialisationAsync(r0);
                r1.setInitializationEffectEnabled(r0);
                r0 = new mkx$a$e$3;
                r0.<init>(r8, r9);
                r0 = (com.looksery.sdk.listener.LookseryNativeExceptionListener) r0;
                r1.setNativeExceptionListener(r0);
                r0 = com.looksery.sdk.DeviceClass.HIGH_END;
                r1.setDeviceClass(r0);
                r0 = com.looksery.sdk.domain.RecordingState.PREVIEW;
                r1.setRecordingState(r0);
                r0 = defpackage.mkx.e;
                r0 = defpackage.mnp.a(r0);
                r1.setFaceTrackingResourcesPath(r0);
                r0 = r8.e;
                r0 = r0.b();
                r0 = (com.looksery.sdk.audio.AudioPlaybackService) r0;
                r1.setAudioPlaybackService(r0);
                r0 = r8.f;
                r0 = r0.b();
                r0 = (com.looksery.sdk.audio.ScenariumAudioPlaybackService) r0;
                r1.setScenariumAudioPlaybackService(r0);
                r0 = r8.a;
                r0 = r0.j;
                if (r0 == 0) goto L_0x010f;
                r2 = r1.pickRecentCrashCrumbs();
                r4 = "pickRecentCrashCrumbs()";
                defpackage.akcr.a(r2, r4);
                r4 = r2.length;
                if (r3 >= r4) goto L_0x010f;
                r5 = r2[r3];
                r6 = r5.activeEffectId;
                r7 = "crumb.activeEffectId";
                defpackage.akcr.a(r6, r7);
                r5 = r5.upcomingEffectId;
                r7 = "crumb.upcomingEffectId";
                defpackage.akcr.a(r5, r7);
                r0.a(r6, r5);
                r3 = r3 + 1;
                goto L_0x00f7;
                r0 = r8.g;
                r0 = r0.b();
                r0 = (com.looksery.sdk.listener.CryptographyDelegate) r0;
                r1.setCryptographyDelegate(r0);
                r0 = r8.a;	 Catch:{ all -> 0x0184 }
                r0 = r0.l;	 Catch:{ all -> 0x0184 }
                r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x0184 }
                r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0184 }
                r3 = 10;	 Catch:{ all -> 0x0184 }
                r3 = defpackage.ajyn.a(r0, r3);	 Catch:{ all -> 0x0184 }
                r2.<init>(r3);	 Catch:{ all -> 0x0184 }
                r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0184 }
                r0 = r0.iterator();	 Catch:{ all -> 0x0184 }
                r3 = r0.hasNext();	 Catch:{ all -> 0x0184 }
                if (r3 == 0) goto L_0x0147;	 Catch:{ all -> 0x0184 }
                r3 = r0.next();	 Catch:{ all -> 0x0184 }
                r3 = (defpackage.akbl) r3;	 Catch:{ all -> 0x0184 }
                r3 = r3.invoke(r9);	 Catch:{ all -> 0x0184 }
                r3 = (defpackage.mph) r3;	 Catch:{ all -> 0x0184 }
                r2.add(r3);	 Catch:{ all -> 0x0184 }
                goto L_0x0131;	 Catch:{ all -> 0x0184 }
                r2 = (java.util.List) r2;	 Catch:{ all -> 0x0184 }
                r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0184 }
                r0 = r9.q();	 Catch:{ all -> 0x0184 }
                if (r0 == 0) goto L_0x017c;	 Catch:{ all -> 0x0184 }
                r0 = (defpackage.mlo) r0;	 Catch:{ all -> 0x0184 }
                r0 = defpackage.ajyu.a(r2, r0);	 Catch:{ all -> 0x0184 }
                r2 = new mpj;
                r0 = (java.lang.Iterable) r0;
                r2.<init>(r9, r0);
                r2 = (com.looksery.sdk.listener.UriListener) r2;
                r1.setUriListener(r2);
                r9 = r8.a;
                r9 = r9.q;
                r1.setFrameTimestampCorrectionEnabled(r9);
                r9 = r8.a;
                r9 = r9.r;
                if (r9 == 0) goto L_0x017b;
                r9 = r8.a;
                r9 = r9.a;
                r9 = com.looksery.sdk.Trackers.deviceMotionWithTimestampCorrection(r9);
                r1.setDeviceMotionTracker(r9);
                return r1;
                r9 = new ajxt;	 Catch:{ all -> 0x0184 }
                r0 = "null cannot be cast to non-null type com.snap.lenses.core.DefaultTextInputProcessor";	 Catch:{ all -> 0x0184 }
                r9.<init>(r0);	 Catch:{ all -> 0x0184 }
                throw r9;	 Catch:{ all -> 0x0184 }
                r9 = move-exception;
                throw r9;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mkx$a$e.a(mkx):com.looksery.sdk.LSCoreManagerWrapper");
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return a((mkx) obj);
            }
        }

        /* renamed from: mkx$a$f */
        static final class f extends akcs implements akbl<mkx, mlj> {
            private /* synthetic */ ajdp a;
            private /* synthetic */ mmu b;

            /* renamed from: mkx$a$f$1 */
            public static final class 1 implements akbk<String> {
                1() {
                }

                public final /* synthetic */ Object invoke() {
                    Object uuid = iig.a().toString();
                    akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
                    return uuid;
                }
            }

            f(ajdp ajdp, mmu mmu) {
                this.a = ajdp;
                this.b = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "it");
                mka mka = this.b.h;
                akbk 1 = new 1();
                lnr lnr = this.b.k;
                Object obj2 = this.a;
                akcr.a(obj2, "retainAssets");
                return new mlj(mkx, mka, 1, lnr, obj2);
            }
        }

        /* renamed from: mkx$a$g */
        static final class g extends akcs implements akbl<mkx, mki> {
            private /* synthetic */ mmu a;

            g(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mkx mkx = (mkx) obj;
                akcr.b(mkx, "it");
                return new mki(mkx, this.a.m);
            }
        }

        /* renamed from: mkx$a$h */
        static final class h extends akcs implements akbl<mkx, mlo> {
            private /* synthetic */ mmu a;

            h(mmu mmu) {
                this.a = mmu;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mkx) obj, "it");
                return new mlo(this.a.c, this.a.d);
            }
        }

        /* renamed from: mkx$a$i */
        static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ mmu a;

            i(mmu mmu) {
                this.a = mmu;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final miq miq = (miq) obj;
                akcr.b(miq, MessageMediaRefModel.URI);
                return miq instanceof defpackage.miq.c.a ? ajdx.b(ajxs.a(mnp.a((defpackage.miq.c.a) miq), ajfq.INSTANCE)) : miq instanceof defpackage.miq.d.a ? this.a.h.a((defpackage.miq.d.a) miq).f(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        ajej ajej = (ajej) obj;
                        akcr.b(ajej, "it");
                        return ajxs.a(((defpackage.miq.d.a) miq).a(), ajej);
                    }
                }) : ajvo.a(ajsn.a);
            }
        }

        /* renamed from: mkx$a$s */
        static final class s<T1, T2, R> implements ajex<ajxm<? extends String, ? extends ajej>, ajxm<? extends String, ? extends ajej>, ajxm<? extends String, ? extends ajej>> {
            public static final s a = new s();

            s() {
            }

            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                ajxm ajxm = (ajxm) obj;
                ajxm ajxm2 = (ajxm) obj2;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                akcr.b(ajxm2, "new");
                ((ajej) ajxm.b).dispose();
                return ajxm2;
            }
        }

        /* renamed from: mkx$a$j */
        static final class j extends akcs implements akbk<mkx> {
            final /* synthetic */ c a;
            private /* synthetic */ mnc b;
            private /* synthetic */ ajdp c;
            private /* synthetic */ ajdp d;
            private /* synthetic */ a e;
            private /* synthetic */ ajdp f;
            private /* synthetic */ ajdp g;
            private /* synthetic */ mmu h;

            /* renamed from: mkx$a$j$2 */
            static final class 2<T> implements ajfb<Boolean> {
                private /* synthetic */ j a;

                2(j jVar) {
                    this.a = jVar;
                }

                public final /* synthetic */ void accept(Object obj) {
                    obj = (Boolean) obj;
                    akcr.a(obj, "it");
                    a.a = obj.booleanValue();
                }
            }

            /* renamed from: mkx$a$j$3 */
            static final class 3<T> implements ajfb<DeviceClass> {
                private /* synthetic */ j a;

                3(j jVar) {
                    this.a = jVar;
                }

                public final /* synthetic */ void accept(Object obj) {
                    DeviceClass deviceClass = (DeviceClass) obj;
                    c cVar = this.a.a;
                    akcr.a((Object) deviceClass, "deviceClass");
                    akcr.b(deviceClass, "value");
                    if (cVar.a != deviceClass) {
                        cVar.a = deviceClass;
                        cVar.b = (mor) cVar.c.invoke(deviceClass);
                    }
                }
            }

            j(mnc mnc, ajdp ajdp, ajdp ajdp2, a aVar, ajdp ajdp3, c cVar, ajdp ajdp4, mmu mmu) {
                this.b = mnc;
                this.c = ajdp;
                this.d = ajdp2;
                this.e = aVar;
                this.f = ajdp3;
                this.a = cVar;
                this.g = ajdp4;
                this.h = mmu;
                super(0);
            }

            private mkx a() {
                mnc mnc = this.b;
                mhk mhk = this.h.b;
                mng mng = this.h.i;
                if (mng == null) {
                    mng = defpackage.mng.a.a;
                }
                final mkx mkx = new mkx(mnc, mhk, mng, this.h.c);
                ajej f = this.c.f((ajfb) new ajfb<ajxm<? extends String, ? extends ajej>>() {
                    public final /* synthetic */ void accept(Object obj) {
                        ajxm ajxm = (ajxm) obj;
                        final String str = (String) ajxm.a;
                        final ajej ajej = (ajej) ajxm.b;
                        mkx mkx = mkx;
                        akcr.a((Object) ajej, "disposable");
                        mkx.a(ajej);
                        mkx.b(new akbl<LSCoreManagerWrapper, ajxw>(this) {
                            private /* synthetic */ 1 a;

                            public final /* synthetic */ Object invoke(Object obj) {
                                LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
                                akcr.b(lSCoreManagerWrapper, "receiver$0");
                                if (!mkx.isDisposed()) {
                                    Object obj2 = ajej;
                                    akcr.a(obj2, "disposable");
                                    if (!obj2.isDisposed()) {
                                        lSCoreManagerWrapper.setFaceTrackingResourcesPath(str);
                                    }
                                }
                                return ajxw.a;
                            }
                        });
                    }
                });
                akcr.a((Object) f, "trackingData\n           …                        }");
                mkx.a(f);
                f = this.d.f((ajfb) new 2(this));
                akcr.a((Object) f, "nativeLogs\n             …                        }");
                mkx.a(f);
                f = this.f.f((ajfb) new 3(this));
                akcr.a((Object) f, "imageResolutionDeviceCla…                        }");
                mkx.a(f);
                f = this.g.f((ajfb) new ajfb<DeviceClass>() {
                    public final /* synthetic */ void accept(Object obj) {
                        final DeviceClass deviceClass = (DeviceClass) obj;
                        mkx.b(new akbl<LSCoreManagerWrapper, ajxw>() {
                            public final /* synthetic */ Object invoke(Object obj) {
                                LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
                                akcr.b(lSCoreManagerWrapper, "receiver$0");
                                lSCoreManagerWrapper.setDeviceClass(deviceClass);
                                return ajxw.a;
                            }
                        });
                    }
                });
                akcr.a((Object) f, "featureGatingDeviceClass…                        }");
                mkx.a(f);
                return mkx;
            }

            public final /* synthetic */ Object invoke() {
                return a();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        static akbk<mmf> a(mmu mmu) {
            mmu mmu2 = mmu;
            String str = "reader.long(DEVICE_CLUST…CLUSTER_SERVER_UNKNOWN)))";
            Context applicationContext = mmu2.a.getApplicationContext();
            ajxe a = ajxh.a(new b(mmu2));
            ajxe a2 = ajxh.a(new r(applicationContext));
            a aVar = a.b;
            c cVar = new c();
            ajxe a3 = ajxh.a(k.a);
            miw.c a4 = mmu2.f.a(defpackage.miw.b.a.a);
            ajdp c = a4.a(mja.LENSES_RETAIN_LENS_ASSETS).c(1).c();
            moq moq = new moq();
            defpackage.mnc.a aVar2 = new defpackage.mnc.a();
            akbl lVar = new l(cVar, moq);
            aVar2.a.put(mov.class, new n(lVar));
            lVar = new c(moq, mmu2);
            aVar2.a.put(mpa.class, new n(lVar));
            akbl oVar = new o(a, a2);
            aVar2.a.put(mjh.class, new n(oVar));
            oVar = new d(mmu2);
            aVar2.a.put(mmi.class, new n(oVar));
            defpackage.mnc.a aVar3 = aVar2;
            akbl eVar = new e(applicationContext, a4, aVar, a, a2, a3, mmu);
            aVar3.a.put(LSCoreManagerWrapper.class, new n(eVar));
            oVar = p.a;
            aVar3.a.put(mpl.class, new n(oVar));
            oVar = new f(c, mmu2);
            aVar3.a.put(mny.class, new n(oVar));
            oVar = new g(mmu2);
            aVar3.a.put(mjn.class, new n(oVar));
            oVar = q.a;
            aVar3.a.put(mnq.class, new n(oVar));
            oVar = m.a;
            aVar3.a.put(mjm.class, new n(oVar));
            oVar = n.a;
            aVar3.a.put(mop.class, new n(oVar));
            oVar = new h(mmu2);
            aVar3.a.put(mou.class, new n(oVar));
            akcr.b(mmu2, "lensCoreConfiguration");
            oVar = defpackage.mnc.a.a.a;
            if (!aVar3.a.containsKey(mov.class)) {
                aVar3.a.put(mov.class, new n(oVar));
            }
            oVar = f.a;
            if (!aVar3.a.containsKey(mji.class)) {
                aVar3.a.put(mji.class, new n(oVar));
            }
            oVar = new g(mmu2);
            if (!aVar3.a.containsKey(mmi.class)) {
                aVar3.a.put(mmi.class, new n(oVar));
            }
            oVar = new h(mmu2);
            if (!aVar3.a.containsKey(mpa.class)) {
                aVar3.a.put(mpa.class, new n(oVar));
            }
            oVar = new i(mmu2);
            if (!aVar3.a.containsKey(mpb.class)) {
                aVar3.a.put(mpb.class, new n(oVar));
            }
            oVar = j.a;
            if (!aVar3.a.containsKey(mmk.class)) {
                aVar3.a.put(mmk.class, new n(oVar));
            }
            oVar = new k(mmu2);
            if (!aVar3.a.containsKey(mnu.class)) {
                aVar3.a.put(mnu.class, new n(oVar));
            }
            oVar = l.a;
            if (!aVar3.a.containsKey(mmg.class)) {
                aVar3.a.put(mmg.class, new n(oVar));
            }
            oVar = m.a;
            if (!aVar3.a.containsKey(mjl.class)) {
                aVar3.a.put(mjl.class, new n(oVar));
            }
            oVar = new defpackage.mnc.a.b(mmu2);
            if (!aVar3.a.containsKey(mnt.class)) {
                aVar3.a.put(mnt.class, new n(oVar));
            }
            oVar = defpackage.mnc.a.c.a;
            if (!aVar3.a.containsKey(mjf.class)) {
                aVar3.a.put(mjf.class, new n(oVar));
            }
            oVar = new d(mmu2);
            if (!aVar3.a.containsKey(mmj.class)) {
                aVar3.a.put(mmj.class, new n(oVar));
            }
            oVar = e.a;
            if (!aVar3.a.containsKey(mnb.class)) {
                aVar3.a.put(mnb.class, new n(oVar));
            }
            mnc mnc = new mnc(aVar3.a);
            Object b = mmu2.e.a(defpackage.mpf.a.a.a).j(ajfu.a).b(250, TimeUnit.MILLISECONDS, (ajdw) mmu2.c.b()).x(new i(mmu2)).b((ajex) s.a);
            akcr.a(b, "configuration.trackingDa…                        }");
            ajdp c2 = a4.a(mja.NATIVE_LOGS_ENABLED).c(1);
            Object a5 = a4.e(mja.DEVICE_CLUSTER).a(mmd.a(a4.a(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_ENABLED), a4.e(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_HIGH_END_START), a4.e(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_MID_END_START), a4.e(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_LOW_END_START), a4.e(mja.IMAGE_RESOLUTION_DEVICE_CLUSTER_SERVER_UNKNOWN)));
            akcr.a(a5, str);
            Object a6 = a4.e(mja.DEVICE_CLUSTER).a(mmd.a(a4.a(mja.FEATURE_GATING_DEVICE_CLUSTER_ENABLED), a4.e(mja.FEATURE_GATING_DEVICE_CLUSTER_HIGH_END_START), a4.e(mja.FEATURE_GATING_DEVICE_CLUSTER_MID_END_START), a4.e(mja.FEATURE_GATING_DEVICE_CLUSTER_LOW_END_START), a4.e(mja.FEATURE_GATING_DEVICE_CLUSTER_SERVER_UNKNOWN)));
            akcr.a(a6, str);
            return new j(mnc, b, c2, aVar, a5, cVar, a6, mmu);
        }
    }

    /* renamed from: mkx$x */
    static final class x extends akcs implements akbk<mpn> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        x(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new mpn((LSCoreManagerWrapper) this.b.a(LSCoreManagerWrapper.class, this.a));
        }
    }

    /* renamed from: mkx$t */
    static final class t extends akcs implements akbk<mov> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        t(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mov) this.b.a(mov.class, this.a);
        }
    }

    /* renamed from: mkx$i */
    static final class i extends akcs implements akbk<mmi> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        i(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mmi) this.b.a(mmi.class, this.a);
        }
    }

    /* renamed from: mkx$u */
    static final class u extends akcs implements akbk<mpa> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        u(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mpa) this.b.a(mpa.class, this.a);
        }
    }

    /* renamed from: mkx$v */
    static final class v extends akcs implements akbk<mpb> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        v(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mpb) this.b.a(mpb.class, this.a);
        }
    }

    /* renamed from: mkx$k */
    static final class k extends akcs implements akbk<mmk> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        k(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mmk) this.b.a(mmk.class, this.a);
        }
    }

    /* renamed from: mkx$c */
    static final class c extends akcs implements akbk<mjh> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        c(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mjh) this.b.a(mjh.class, this.a);
        }
    }

    /* renamed from: mkx$d */
    static final class d extends akcs implements akbk<mji> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        d(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mji) this.b.a(mji.class, this.a);
        }
    }

    /* renamed from: mkx$p */
    static final class p extends akcs implements akbk<mnu> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        p(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mnu) this.b.a(mnu.class, this.a);
        }
    }

    /* renamed from: mkx$h */
    static final class h extends akcs implements akbk<mmg> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        h(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mmg) this.b.a(mmg.class, this.a);
        }
    }

    /* renamed from: mkx$w */
    static final class w extends akcs implements akbk<mpl> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        w(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mpl) this.b.a(mpl.class, this.a);
        }
    }

    /* renamed from: mkx$g */
    static final class g extends akcs implements akbk<mjn> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        g(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mjn) this.b.a(mjn.class, this.a);
        }
    }

    /* renamed from: mkx$q */
    static final class q extends akcs implements akbk<mny> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        q(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mny) this.b.a(mny.class, this.a);
        }
    }

    /* renamed from: mkx$m */
    static final class m extends akcs implements akbk<mnq> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        m(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mnq) this.b.a(mnq.class, this.a);
        }
    }

    /* renamed from: mkx$f */
    static final class f extends akcs implements akbk<mjm> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        f(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mjm) this.b.a(mjm.class, this.a);
        }
    }

    /* renamed from: mkx$r */
    static final class r extends akcs implements akbk<mop> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        r(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mop) this.b.a(mop.class, this.a);
        }
    }

    /* renamed from: mkx$e */
    static final class e extends akcs implements akbk<mjl> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        e(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mjl) this.b.a(mjl.class, this.a);
        }
    }

    /* renamed from: mkx$s */
    static final class s extends akcs implements akbk<mou> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        s(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mou) this.b.a(mou.class, this.a);
        }
    }

    /* renamed from: mkx$o */
    static final class o extends akcs implements akbk<mnt> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        o(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mnt) this.b.a(mnt.class, this.a);
        }
    }

    /* renamed from: mkx$b */
    static final class b extends akcs implements akbk<mjf> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        b(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mjf) this.b.a(mjf.class, this.a);
        }
    }

    /* renamed from: mkx$j */
    static final class j extends akcs implements akbk<mmj> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        j(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mmj) this.b.a(mmj.class, this.a);
        }
    }

    /* renamed from: mkx$l */
    static final class l extends akcs implements akbk<mnb> {
        private /* synthetic */ mkx a;
        private /* synthetic */ mnc b;

        l(mkx mkx, mnc mnc) {
            this.a = mkx;
            this.b = mnc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (mnb) this.b.a(mnb.class, this.a);
        }
    }

    /* renamed from: mkx$n */
    static final class n implements ajev {
        private /* synthetic */ mkx a;
        private /* synthetic */ akbl b;

        n(mkx mkx, akbl akbl) {
            this.a = mkx;
            this.b = akbl;
        }

        public final void run() {
            this.a.b.remove(this.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mkx.class), "textureProcessor", "getTextureProcessor()Lcom/snap/lenses/core/TextureProcessor;"), new akdc(akde.a(mkx.class), "filterApplicator", "getFilterApplicator()Lcom/snap/lenses/core/FilterApplicator;"), new akdc(akde.a(mkx.class), "touchProcessor", "getTouchProcessor()Lcom/snap/lenses/core/TouchProcessor;"), new akdc(akde.a(mkx.class), "tracker", "getTracker()Lcom/snap/lenses/core/Tracker;"), new akdc(akde.a(mkx.class), "hintProcessor", "getHintProcessor()Lcom/snap/lenses/core/HintProcessor;"), new akdc(akde.a(mkx.class), "audioPlayer", "getAudioPlayer()Lcom/snap/lenses/core/AudioPlayer;"), new akdc(akde.a(mkx.class), "audioProcessor", "getAudioProcessor()Lcom/snap/lenses/core/AudioProcessor;"), new akdc(akde.a(mkx.class), "profiler", "getProfiler()Lcom/snap/lenses/core/Profiler;"), new akdc(akde.a(mkx.class), "faceFeaturesReporter", "getFaceFeaturesReporter()Lcom/snap/lenses/core/FaceFeaturesReporter;"), new akdc(akde.a(mkx.class), "userDataProcessor", "getUserDataProcessor()Lcom/snap/lenses/core/UserDataProcessor;"), new akdc(akde.a(mkx.class), "clientInterfaceProcessor", "getClientInterfaceProcessor()Lcom/snap/lenses/core/ClientInterfaceProcessor;"), new akdc(akde.a(mkx.class), "remoteAssetsProcessor", "getRemoteAssetsProcessor()Lcom/snap/lenses/core/RemoteAssetsProcessor;"), new akdc(akde.a(mkx.class), "persistenceProcessor", "getPersistenceProcessor()Lcom/snap/lenses/core/PersistenceProcessor;"), new akdc(akde.a(mkx.class), "captureProcessor", "getCaptureProcessor()Lcom/snap/lenses/core/CaptureProcessor;"), new akdc(akde.a(mkx.class), "screenZonesProcessor", "getScreenZonesProcessor()Lcom/snap/lenses/core/ScreenZonesProcessor;"), new akdc(akde.a(mkx.class), "bitmojiDataProcessor", "getBitmojiDataProcessor()Lcom/snap/lenses/core/BitmojiDataProcessor;"), new akdc(akde.a(mkx.class), "textInputProcessor", "getTextInputProcessor()Lcom/snap/lenses/core/TextInputProcessor;"), new akdc(akde.a(mkx.class), "presetProcessor", "getPresetProcessor()Lcom/snap/lenses/core/PresetProcessor;"), new akdc(akde.a(mkx.class), "analyticsReporter", "getAnalyticsReporter()Lcom/snap/lenses/core/AnalyticsReporter;"), new akdc(akde.a(mkx.class), "geoDataProcessor", "getGeoDataProcessor()Lcom/snap/lenses/core/GeoDataProcessor;"), new akdc(akde.a(mkx.class), "memoryMonitor", "getMemoryMonitor()Lcom/snap/lenses/core/MemoryMonitor;")};
        a aVar = new a();
        String str = "/looksery/core/LightTrackingData";
        akcr.b(str, "path");
        StringBuilder stringBuilder = new StringBuilder("file://android_asset/");
        stringBuilder.append(akgc.a(str, (CharSequence) "/"));
        e = miq.a.a(stringBuilder.toString());
    }

    public mkx(mnc mnc, mhk mhk, mng mng, zfw zfw) {
        akcr.b(mnc, "multiComponentFactory");
        akcr.b(mhk, "clock");
        akcr.b(mng, "nativeExceptionHandler");
        akcr.b(zfw, "qualifiedSchedulers");
        this.c = mhk;
        this.C = mng;
        this.d = zfw;
        this.a = ajxh.a(new x(this, mnc));
        this.h = ajxh.a(new t(this, mnc));
        this.i = ajxh.a(new i(this, mnc));
        this.j = ajxh.a(new u(this, mnc));
        this.k = ajxh.a(new v(this, mnc));
        this.l = ajxh.a(new k(this, mnc));
        this.m = ajxh.a(new c(this, mnc));
        this.n = ajxh.a(new d(this, mnc));
        this.o = ajxh.a(new p(this, mnc));
        this.p = ajxh.a(new h(this, mnc));
        this.q = ajxh.a(new w(this, mnc));
        this.r = ajxh.a(new g(this, mnc));
        this.s = ajxh.a(new q(this, mnc));
        this.t = ajxh.a(new m(this, mnc));
        this.u = ajxh.a(new f(this, mnc));
        this.v = ajxh.a(new r(this, mnc));
        this.w = ajxh.a(new e(this, mnc));
        this.x = ajxh.a(new s(this, mnc));
        this.y = ajxh.a(new o(this, mnc));
        this.z = ajxh.a(new b(this, mnc));
        this.A = ajxh.a(new j(this, mnc));
        this.B = ajxh.a(new l(this, mnc));
    }

    private final void a(LSCoreManagerWrapper lSCoreManagerWrapper) {
        if (!this.b.isEmpty()) {
            akbl akbl;
            ArrayList<akbl> arrayList = new ArrayList();
            while (!this.b.isEmpty()) {
                akbl = (akbl) this.b.poll();
                if (akbl != null) {
                    arrayList.add(akbl);
                }
            }
            for (akbl akbl2 : arrayList) {
                akbl2.invoke(lSCoreManagerWrapper);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final ajej a(akbl<? super LSCoreManagerWrapper, ajxw> akbl) {
        if (!isDisposed()) {
            return b(akbl);
        }
        Object a = ajek.a(ajfu.b);
        akcr.a(a, "Disposables.empty()");
        return a;
    }

    public final mkx a(ajej ajej) {
        akcr.b(ajej, "disposable");
        this.f.a(ajej);
        return this;
    }

    public final mmi a() {
        return (mmi) this.i.b();
    }

    public final ajej b(akbl<? super LSCoreManagerWrapper, ajxw> akbl) {
        akcr.b(akbl, "work");
        this.b.add(akbl);
        Object a = ajek.a((ajev) new n(this, akbl));
        akcr.a(a, "Disposables.fromAction {…ue.remove(work)\n        }");
        return a;
    }

    public final mjf b() {
        return (mjf) this.z.b();
    }

    public final mjh c() {
        return (mjh) this.m.b();
    }

    public final mkx c(akbl<? super LSCoreManagerWrapper, ajxw> akbl) {
        akcr.b(akbl, "work");
        a(b(akbl));
        return this;
    }

    public final mji d() {
        return (mji) this.n.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f A:{Catch:{ all -> 0x001a }} */
    public final void dispose() {
        /*
        r5 = this;
        r0 = r5.g;	 Catch:{ all -> 0x006a }
        r1 = 1;
        r5.g = r1;	 Catch:{ all -> 0x006a }
        if (r0 != 0) goto L_0x000f;
    L_0x0007:
        r2 = r5.f;	 Catch:{ all -> 0x000d }
        r2.a();	 Catch:{ all -> 0x000d }
        goto L_0x000f;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006a }
    L_0x000f:
        if (r0 != 0) goto L_0x001c;
    L_0x0011:
        r0 = r5.a;	 Catch:{ all -> 0x001a }
        r0 = r0.a();	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        goto L_0x001d;
    L_0x001a:
        r0 = move-exception;
        goto L_0x0068;
    L_0x001c:
        r1 = 0;
    L_0x001d:
        if (r1 == 0) goto L_0x0069;
    L_0x001f:
        r0 = r5.a;	 Catch:{ all -> 0x001a }
        r0 = r0.b();	 Catch:{ all -> 0x001a }
        r0 = (defpackage.mpn) r0;	 Catch:{ all -> 0x001a }
        r1 = r0.a();	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0036;
    L_0x002d:
        r0 = r0.b;	 Catch:{ all -> 0x001a }
        r5.a(r0);	 Catch:{ all -> 0x001a }
        r0.release();	 Catch:{ all -> 0x001a }
        goto L_0x0069;
    L_0x0036:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x001a }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x001a }
        r3 = "Called on a thread with id [";
        r2.<init>(r3);	 Catch:{ all -> 0x001a }
        r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x001a }
        r4 = "currentThread()";
        defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x001a }
        r3 = r3.getId();	 Catch:{ all -> 0x001a }
        r2.append(r3);	 Catch:{ all -> 0x001a }
        r3 = "] while expecting id [";
        r2.append(r3);	 Catch:{ all -> 0x001a }
        r3 = r0.a;	 Catch:{ all -> 0x001a }
        r2.append(r3);	 Catch:{ all -> 0x001a }
        r0 = 93;
        r2.append(r0);	 Catch:{ all -> 0x001a }
        r0 = r2.toString();	 Catch:{ all -> 0x001a }
        r1.<init>(r0);	 Catch:{ all -> 0x001a }
        r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x001a }
        throw r1;	 Catch:{ all -> 0x001a }
    L_0x0068:
        throw r0;	 Catch:{ all -> 0x006a }
    L_0x0069:
        return;
    L_0x006a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkx.dispose():void");
    }

    public final mjl e() {
        return (mjl) this.w.b();
    }

    public final mjm f() {
        return (mjm) this.u.b();
    }

    public final mjn g() {
        return (mjn) this.r.b();
    }

    public final mmg h() {
        return (mmg) this.p.b();
    }

    public final mmj i() {
        return (mmj) this.A.b();
    }

    public final boolean isDisposed() {
        return this.g;
    }

    public final mmk j() {
        return (mmk) this.l.b();
    }

    public final mnb k() {
        return (mnb) this.B.b();
    }

    public final mnq l() {
        return (mnq) this.t.b();
    }

    public final mnt m() {
        return (mnt) this.y.b();
    }

    public final mnu n() {
        return (mnu) this.o.b();
    }

    public final mny o() {
        return (mny) this.s.b();
    }

    public final mop p() {
        return (mop) this.v.b();
    }

    public final mou q() {
        return (mou) this.x.b();
    }

    public final mov r() {
        return (mov) this.h.b();
    }

    public final mpa s() {
        return (mpa) this.j.b();
    }

    public final mpb t() {
        return (mpb) this.k.b();
    }

    public final mpl u() {
        return (mpl) this.q.b();
    }
}

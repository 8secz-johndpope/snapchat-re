package defpackage;

import com.brightcove.player.event.Event;
import com.google.common.base.Stopwatch;
import com.google.common.io.BaseEncoding;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.lenses.lens.LensDownloaderHttpInterface;
import defpackage.kqe.d;
import defpackage.mhs.b;
import defpackage.miq.e;
import defpackage.miq.f;
import defpackage.mwc.a;
import java.io.Closeable;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;

/* renamed from: mul */
public final class mul implements mwc {
    final ConcurrentHashMap<b, muq> a = new ConcurrentHashMap();
    final zfw b;
    final kqf c;
    private final ajxe d = ajxh.a(new b(this));
    private final mvr e;
    private final mxa f;
    private final mwp g;

    /* renamed from: mul$b */
    static final class b extends akcs implements akbk<ajdw> {
        private /* synthetic */ mul a;

        b(mul mul) {
            this.a = mul;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zfx.a((ajdw) this.a.b.g(), 2);
        }
    }

    /* renamed from: mul$a */
    static final class a implements ajea<defpackage.mwc.a> {
        final ajxe<akwh<akhw>> a;
        private final mwp b;
        private final mvr c;
        private final mux d;

        /* renamed from: mul$a$b */
        static final class b implements ajev {
            private /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            public final void run() {
                a aVar = this.a;
                if (aVar.a.a()) {
                    ((akwh) aVar.a.b()).b();
                }
            }
        }

        /* renamed from: mul$a$a */
        static final class a extends akcs implements akbk<akwh<akhw>> {
            private /* synthetic */ mxa a;
            private /* synthetic */ e b;

            a(mxa mxa, e eVar) {
                this.a = mxa;
                this.b = eVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return ((LensDownloaderHttpInterface) this.a.a(LensDownloaderHttpInterface.class)).downloadZipArchive(this.b.a());
            }
        }

        public a(mxa mxa, mwp mwp, mvr mvr, mux mux, e eVar) {
            akcr.b(mxa, "remoteServiceFactory");
            akcr.b(mwp, "signatureValidator");
            akcr.b(mvr, "cacheResolver");
            akcr.b(mux, "lens");
            akcr.b(eVar, MessageMediaRefModel.URI);
            this.b = mwp;
            this.c = mvr;
            this.d = mux;
            this.a = ajxh.a(new a(mxa, eVar));
        }

        private static defpackage.mwc.a.a a(mux mux, String str) {
            return a.a(mux, (Throwable) new RuntimeException(str));
        }

        private static defpackage.mwc.a.a a(mux mux, Throwable th) {
            return new defpackage.mwc.a.a(mux, th);
        }

        private static defpackage.mwc.a.b a(mux mux, File file) {
            StringBuilder stringBuilder = new StringBuilder("file://");
            stringBuilder.append(file.getPath());
            return new defpackage.mwc.a.b(mux, defpackage.miq.a.a(stringBuilder.toString()));
        }

        private final defpackage.mwc.a a() {
            File a = this.c.a(this.d);
            Closeable abnr;
            try {
                if (!a.exists() && !a.mkdirs()) {
                    return a.a(this.d, "Failed to create path for downloaded lens content");
                }
                akws a2 = ((akwh) this.a.b()).a();
                if (a2.e()) {
                    Object obj = (akhw) a2.f();
                    if (obj == null) {
                        return a.a(this.d, "Response body is null");
                    }
                    defpackage.mwc.a.b a3;
                    akcr.a(obj, "body() ?: return failed(… \"Response body is null\")");
                    abnr = new abnr(obj.c());
                    byte[] a4 = mhr.a((ZipInputStream) (abnr) abnr, a, mhr.a);
                    String str = this.d.c;
                    if (str == null || (akgb.a(str) ^ 1) == 0) {
                        a3 = a.a(this.d, a);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(BaseEncoding.base16().encode(a4));
                        stringBuilder.append(this.d.a);
                        defpackage.mwp.a a5 = this.b.a(str, stringBuilder.toString());
                        if (a5 instanceof defpackage.mwp.a.b) {
                            a3 = a.a(this.d, a);
                        } else if (a5 instanceof defpackage.mwp.a.a) {
                            a.a(a);
                            a3 = a.a(this.d, ((defpackage.mwp.a.a) a5).a);
                        } else {
                            a3 = a.a(this.d, "unknown");
                        }
                    }
                    defpackage.mwc.a aVar = a3;
                    akax.a(abnr, null);
                    return aVar;
                }
                defpackage.mwc.a.a a6;
                akhw g = a2.g();
                if (g != null) {
                    mux mux = this.d;
                    String g2 = g.g();
                    akcr.a((Object) g2, "error.string()");
                    a6 = a.a(mux, g2);
                } else {
                    a6 = a.a(this.d, "unknown");
                }
                return a6;
            } catch (Exception e) {
                a.a(a);
                return a.a(this.d, (Throwable) e);
            } catch (Throwable th) {
                akax.a(abnr, r1);
            }
        }

        private static void a(File file) {
            if (file.exists()) {
                akbf.c(file);
            }
        }

        public final void subscribe(ajdy<defpackage.mwc.a> ajdy) {
            akcr.b(ajdy, Event.EMITTER);
            if (!ajdy.isDisposed()) {
                if (!ajdy.isDisposed()) {
                    ajdy.a(ajek.a((ajev) new b(this)));
                }
                if (!ajdy.isDisposed()) {
                    ajdy.a(a());
                }
            }
        }
    }

    /* renamed from: mul$c */
    static final class c implements ajev {
        private /* synthetic */ mul a;
        private /* synthetic */ mux b;

        c(mul mul, mux mux) {
            this.a = mul;
            this.b = mux;
        }

        public final void run() {
            this.a.a.remove(this.b.a);
        }
    }

    /* renamed from: mul$d */
    static final class d<T> implements ajfb<ajej> {
        private /* synthetic */ Stopwatch a;

        d(Stopwatch stopwatch) {
            this.a = stopwatch;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.start();
        }
    }

    /* renamed from: mul$e */
    static final class e<T> implements ajfb<a> {
        private /* synthetic */ mul a;
        private /* synthetic */ Stopwatch b;

        e(mul mul, Stopwatch stopwatch) {
            this.a = mul;
            this.b = stopwatch;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            if (aVar instanceof a.b) {
                this.a.c.a(new d(((a.b) aVar).a.a.a, this.b.elapsed(TimeUnit.MILLISECONDS)));
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mul.class), "networkScheduler", "getNetworkScheduler()Lio/reactivex/Scheduler;");
    }

    public mul(mvr mvr, mxa mxa, zfw zfw, kqf kqf, mwp mwp) {
        akcr.b(mvr, "cacheResolver");
        akcr.b(mxa, "remoteServiceFactory");
        akcr.b(zfw, "schedulers");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(mwp, "signatureValidator");
        this.e = mvr;
        this.f = mxa;
        this.b = zfw;
        this.c = kqf;
        this.g = mwp;
    }

    public final ajdx<a> a(mux mux) {
        akcr.b(mux, "lens");
        miq miq = mux.b;
        StringBuilder stringBuilder;
        if (miq instanceof f) {
            Object obj = (f) miq;
            muq muq = (muq) this.a.get(mux.a);
            if (muq != null && akcr.a(muq.a, obj)) {
                return muq.b;
            }
            Stopwatch createUnstarted = Stopwatch.createUnstarted();
            Object c = ajdx.a((ajea) new a(this.f, this.g, this.e, mux, (e) obj)).b((ajdw) this.d.b()).b((ajev) new c(this, mux)).b((ajfb) new d(createUnstarted)).c((ajfb) new e(this, createUnstarted));
            akcr.a(c, "Single.create(\n         …      }\n                }");
            stringBuilder = new StringBuilder("completedDownload[");
            stringBuilder.append(mux.a);
            stringBuilder.append(']');
            c = c.a();
            Map map = this.a;
            b bVar = mux.a;
            miq = (miq) obj;
            akcr.a(c, "result");
            map.put(bVar, new muq(miq, c));
            return c;
        }
        stringBuilder = new StringBuilder("Passed lens(");
        stringBuilder.append(mux.a);
        stringBuilder.append(") should contain remote uri but has ");
        stringBuilder.append(mux.b);
        Object b = ajdx.b(new a.a(mux, new IllegalArgumentException(stringBuilder.toString())));
        akcr.a(b, "Single.just(LensDownload…as ${lens.contentUri}\")))");
        return b;
    }
}

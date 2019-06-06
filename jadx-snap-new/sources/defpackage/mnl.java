package defpackage;

import com.snap.lenses.core.TrackingDataHttpInterface;
import com.snap.lenses.core.TrackingDataHttpInterface.DefaultImpls;
import defpackage.miq.c.a;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: mnl */
public final class mnl implements mpf {
    final mxa a;
    final mpc b;
    final mpd c;
    final zfw d;

    /* renamed from: mnl$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ mnl a;

        a(mnl mnl) {
            this.a = mnl;
        }

        public final /* synthetic */ Object call() {
            return (TrackingDataHttpInterface) this.a.a.a(TrackingDataHttpInterface.class);
        }
    }

    /* renamed from: mnl$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TrackingDataHttpInterface trackingDataHttpInterface = (TrackingDataHttpInterface) obj;
            akcr.b(trackingDataHttpInterface, "api");
            StringBuilder stringBuilder = new StringBuilder("lens/");
            stringBuilder.append(this.a);
            stringBuilder.append(".zip");
            return DefaultImpls.trackingDataResource$default(trackingDataHttpInterface, stringBuilder.toString(), null, 2, null);
        }
    }

    /* renamed from: mnl$c */
    static final class c<Upstream, Downstream> implements ajdu<akhw, miq> {
        final /* synthetic */ mnl a;
        final /* synthetic */ String b;

        /* renamed from: mnl$c$1 */
        static final class 1 extends akcq implements akbl<akhw, InputStream> {
            public static final 1 a = new 1();

            1() {
                super(1);
            }

            public final String getName() {
                return "byteStream";
            }

            public final akej getOwner() {
                return akde.a(akhw.class);
            }

            public final String getSignature() {
                return "byteStream()Ljava/io/InputStream;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akhw akhw = (akhw) obj;
                akcr.b(akhw, "p1");
                return akhw.c();
            }
        }

        /* renamed from: mnl$c$2 */
        static final class 2 extends akcq implements akbl<InputStream, abnr> {
            public static final 2 a = new 2();

            2() {
                super(1);
            }

            public final String getName() {
                return "<init>";
            }

            public final akej getOwner() {
                return akde.a(abnr.class);
            }

            public final String getSignature() {
                return "<init>(Ljava/io/InputStream;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return new abnr((InputStream) obj);
            }
        }

        /* renamed from: mnl$c$6 */
        static final class 6 extends akcq implements akbl<File, Boolean> {
            public static final 6 a = new 6();

            6() {
                super(1);
            }

            public final String getName() {
                return "hasContent";
            }

            public final akej getOwner() {
                return akde.a(mhr.class, "lenses-core_release");
            }

            public final String getSignature() {
                return "hasContent(Ljava/io/File;)Z";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                File file = (File) obj;
                akcr.b(file, "p1");
                return Boolean.valueOf(mhr.a(file));
            }
        }

        /* renamed from: mnl$c$7 */
        static final class 7 extends akcq implements akbl<File, a> {
            public static final 7 a = new 7();

            7() {
                super(1);
            }

            public final String getName() {
                return "toUri";
            }

            public final akej getOwner() {
                return akde.a(mhr.class, "lenses-core_release");
            }

            public final String getSignature() {
                return "toUri(Ljava/io/File;)Lcom/snap/lenses/common/Uri$Local$File;";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                File file = (File) obj;
                akcr.b(file, "p1");
                return mhr.b(file);
            }
        }

        /* renamed from: mnl$c$3 */
        static final class 3<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            3(c cVar) {
                this.a = cVar;
            }

            private ajxm<File, byte[]> a(abnr abnr) {
                akcr.b(abnr, "inputStream");
                File a = this.a.a.b.a();
                Closeable closeable = abnr;
                try {
                    byte[] a2 = mhr.a((ZipInputStream) (abnr) closeable, a, mhr.a);
                    akax.a(closeable, null);
                    return ajxs.a(a, a2);
                } catch (Throwable th) {
                    akax.a(closeable, th);
                }
            }

            public final /* synthetic */ Object apply(Object obj) {
                return a((abnr) obj);
            }
        }

        /* renamed from: mnl$c$4 */
        static final class 4<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ c a;

            4(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajxm ajxm = (ajxm) obj;
                akcr.b(ajxm, "<name for destructuring parameter 0>");
                return this.a.a.c.a(this.a.b, (File) ajxm.a, (byte[]) ajxm.b);
            }
        }

        /* renamed from: mnl$c$5 */
        static final class 5<T, R> implements ajfc<T, R> {
            private /* synthetic */ c a;

            5(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                File file = (File) obj;
                akcr.b(file, "it");
                return mhr.a(file, this.a.b);
            }
        }

        c(mnl mnl, String str) {
            this.a = mnl;
            this.b = str;
        }

        public final /* synthetic */ ajdt apply(ajdp ajdp) {
            akcr.b(ajdp, "it");
            return ajdp.a((ajdw) this.a.d.f()).p(new mnm(1.a)).p(new mnm(2.a)).p(new 3(this)).n(new 4(this)).p(new 5(this)).f((ajdt) ajvo.a(ajot.a)).a((ajfl) new mnn(6.a)).p(new mnm(7.a));
        }
    }

    public mnl(mxa mxa, mpc mpc, mpd mpd, zfw zfw) {
        akcr.b(mxa, "remoteServiceFactory");
        akcr.b(mpc, "trackingDataCacheResolver");
        akcr.b(mpd, "checksumValidator");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = mxa;
        this.b = mpc;
        this.c = mpd;
        this.d = zfw;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x00a0 in {2, 4, 7, 9} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.ajdp<defpackage.miq> a(defpackage.mpf.a r5) {
        /*
        r4 = this;
        r0 = "queryCriteria";
        defpackage.akcr.b(r5, r0);
        r0 = defpackage.mpf.a.a.a;
        r0 = defpackage.akcr.a(r5, r0);
        if (r0 == 0) goto L_0x0019;
        r5 = defpackage.ajot.a;
        r5 = defpackage.ajvo.a(r5);
        r0 = "Observable.empty()";
        defpackage.akcr.a(r5, r0);
        return r5;
        r0 = r5 instanceof defpackage.mpf.a.b;
        if (r0 == 0) goto L_0x009a;
        r5 = (defpackage.mpf.a.b) r5;
        r5 = r5.a;
        r0 = new mnl$a;
        r0.<init>(r4);
        r0 = (java.util.concurrent.Callable) r0;
        r0 = defpackage.ajdx.c(r0);
        r1 = r4.d;
        r1 = r1.f();
        r1 = (defpackage.ajdw) r1;
        r0 = r0.b(r1);
        r1 = r4.d;
        r1 = r1.g();
        r1 = (defpackage.ajdw) r1;
        r0 = r0.a(r1);
        r1 = new mnl$b;
        r1.<init>(r5);
        r1 = (defpackage.ajfc) r1;
        r0 = r0.a(r1);
        r1 = "Single.fromCallable { re…$trackingDataName.zip\") }";
        defpackage.akcr.a(r0, r1);
        r1 = new java.lang.StringBuilder;
        r2 = "sendingRequestFor[";
        r1.<init>(r2);
        r1.append(r5);
        r2 = 93;
        r1.append(r2);
        r1 = new java.lang.StringBuilder;
        r3 = "failedToDownload[";
        r1.<init>(r3);
        r1.append(r5);
        r1.append(r2);
        r1 = new java.lang.StringBuilder;
        r3 = "downloaded[";
        r1.<init>(r3);
        r1.append(r5);
        r1.append(r2);
        r1 = defpackage.ajsn.a;
        r1 = defpackage.ajvo.a(r1);
        r0 = r0.a(r1);
        r0 = r0.i();
        r1 = new mnl$c;
        r1.<init>(r4, r5);
        r1 = (defpackage.ajdu) r1;
        r5 = r0.a(r1);
        r0 = "resolveUri(queryCriteria.name)";
        goto L_0x0015;
        r5 = new ajxk;
        r5.<init>();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnl.a(mpf$a):ajdp");
    }
}

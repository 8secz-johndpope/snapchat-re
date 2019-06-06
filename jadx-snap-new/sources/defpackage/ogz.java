package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.concurrent.Callable;

/* renamed from: ogz */
public final class ogz implements odx {
    ohz a;
    yeu b;
    yeu c;
    yeu d;
    final idd e;
    final abyi f;
    final abyy g;
    final ogw h;
    private ogv i;
    private kaz<jwj> j;
    private NavigableMap<Integer, kaz<jwj>> k;
    private final ajxe l;
    private final ajxe m;
    private final ajxe n;
    private final ajxe o;
    private final ajxe p;
    private final kaz<jwj> q;
    private final Map<ohy, ohx> r;
    private final NavigableMap<Integer, kaz<jwj>> s;

    /* renamed from: ogz$b */
    static final class b extends akcs implements akbk<yeu> {
        private /* synthetic */ ogz a;

        b(ogz ogz) {
            this.a = ogz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abmr.b();
            this.a.m();
            ogz ogz = this.a;
            ogz.b = ogz.h.g.c(ohq.EDITS, this.a.f.c);
            return this.a.b;
        }
    }

    /* renamed from: ogz$a */
    static final class a extends akcs implements akbk<abyy> {
        private /* synthetic */ ogz a;

        a(ogz ogz) {
            this.a = ogz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abmr.b();
            this.a.m();
            abyy abyy = this.a.g;
            if (abyy != null) {
                return abyy;
            }
            yeu o = this.a.o();
            return o != null ? (abyy) ((iha) this.a.h.i.get()).a((InputStream) o.d(), abyy.class) : null;
        }
    }

    /* renamed from: ogz$c */
    static final class c extends akcs implements akbk<yeu> {
        private /* synthetic */ ogz a;

        c(ogz ogz) {
            this.a = ogz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abmr.b();
            this.a.m();
            Object c = this.a.h.g.c(ohq.MEDIA, this.a.f.d);
            if (c != null) {
                akcr.a(c, "mediaPackageManager.file…w FileNotFoundException()");
                this.a.c = c;
                return c;
            }
            throw new FileNotFoundException();
        }
    }

    /* renamed from: ogz$e */
    static final class e extends akcs implements akbk<yeu> {
        private /* synthetic */ ogz a;

        e(ogz ogz) {
            this.a = ogz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abmr.b();
            this.a.m();
            ogz ogz = this.a;
            ogz.d = ogz.h.g.c(ohq.OVERLAY, this.a.f.c);
            return this.a.d;
        }
    }

    /* renamed from: ogz$d */
    static final class d extends akcs implements akbk<ajdx<Optional<ohz>>> {
        final /* synthetic */ ogz a;

        /* renamed from: ogz$d$a */
        static final class a<V> implements Callable<T> {
            private /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object call() {
                abmr.b();
                this.a.a.m();
                return this.a.a.a;
            }
        }

        /* renamed from: ogz$d$b */
        static final class b<V> implements Callable<T> {
            private /* synthetic */ d a;

            b(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object call() {
                return this.a.a.p();
            }
        }

        /* renamed from: ogz$d$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                ohz ohz = (ohz) obj;
                akcr.b(ohz, "it");
                return Optional.of(ohz);
            }
        }

        /* renamed from: ogz$d$2 */
        static final class 2<T> implements ajfb<Optional<ohz>> {
            private /* synthetic */ d a;

            2(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a.m();
            }
        }

        /* renamed from: ogz$d$c */
        static final class c<T, R> implements ajfc<T, ajdn<? extends R>> {
            final /* synthetic */ d a;

            /* renamed from: ogz$d$c$1 */
            static final class 1<T> implements ajfb<ohz> {
                private /* synthetic */ c a;

                1(c cVar) {
                    this.a = cVar;
                }

                public final /* synthetic */ void accept(Object obj) {
                    ohz ohz = (ohz) obj;
                    synchronized (this.a.a.a) {
                        if (this.a.a.a.n()) {
                            this.a.a.a.a = ohz;
                        } else {
                            ohz.dispose();
                        }
                    }
                }
            }

            c(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                yeu yeu = (yeu) obj;
                akcr.b(yeu, "it");
                oec oec = (oec) this.a.a.h.j.get();
                idd idd = this.a.a.e;
                String str = this.a.a.f.c;
                obj = yeu.d();
                akcr.a(obj, "it.inputStream");
                return oec.a(idd, str, (InputStream) obj).c((ajfb) new 1(this)).h();
            }
        }

        d(ogz ogz) {
            this.a = ogz;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object b = ajdj.b((Callable) new a(this));
            akcr.a(b, "Maybe.fromCallable<Overl…chedOverlayBlob\n        }");
            Object a = ajdj.b((Callable) new b(this)).a((ajfc) new c(this));
            akcr.a(a, "Maybe.fromCallable {\n   …    }.toMaybe()\n        }");
            return b.b((ajdn) a).f(1.a).a((ajeb) ajdx.b(Optional.absent())).a().c((ajfb) new 2(this));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ogz.class), "editsFileSnapshot", "getEditsFileSnapshot()Lcom/snap/storage/cache/FileSnapshot;"), new akdc(akde.a(ogz.class), "edits", "getEdits()Lcom/snapchat/android/media/overlay/metadata/Edits;"), new akdc(akde.a(ogz.class), "mediaFileSnapshot", "getMediaFileSnapshot()Lcom/snap/storage/cache/FileSnapshot;"), new akdc(akde.a(ogz.class), "overlayFileSnapshot", "getOverlayFileSnapshot()Lcom/snap/storage/cache/FileSnapshot;"), new akdc(akde.a(ogz.class), "overlayBlob", "getOverlayBlob()Lio/reactivex/Single;")};
    }

    public ogz(idd idd, abyi abyi, kaz<jwj> kaz, abyy abyy, Map<ohy, ohx> map, NavigableMap<Integer, kaz<jwj>> navigableMap, ogw ogw) {
        akcr.b(idd, "caller");
        akcr.b(abyi, "mediaPackage");
        akcr.b(ogw, "mediaPackageManager");
        this.e = idd;
        this.f = abyi;
        this.q = kaz;
        this.g = abyy;
        this.r = map;
        this.s = navigableMap;
        this.h = ogw;
        this.l = ajxh.a(new b(this));
        this.m = ajxh.a(new a(this));
        this.n = ajxh.a(new c(this));
        this.o = ajxh.a(new e(this));
        this.p = ajxh.a(new d(this));
    }

    private final yeu q() {
        return (yeu) this.n.b();
    }

    private final void r() {
        kaz kaz = this.j;
        if (kaz != null) {
            kaz.dispose();
        }
        NavigableMap navigableMap = this.k;
        if (navigableMap != null) {
            Collection<kaz> values = navigableMap.values();
            if (values != null) {
                for (kaz dispose : values) {
                    dispose.dispose();
                }
            }
        }
        ohz ohz = this.a;
        if (ohz != null) {
            ohz.m();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:53:0x012c in {8, 10, 11, 19, 21, 23, 24, 30, 36, 37, 42, 43, 45, 46, 49, 52} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized defpackage.odx a() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.i;	 Catch:{ all -> 0x0129 }
        if (r0 != 0) goto L_0x0124;	 Catch:{ all -> 0x0129 }
        r0 = r6.q;	 Catch:{ all -> 0x0129 }
        r1 = 0;	 Catch:{ all -> 0x0129 }
        if (r0 == 0) goto L_0x0025;	 Catch:{ all -> 0x0129 }
        r2 = r0.isDisposed();	 Catch:{ all -> 0x0129 }
        if (r2 != 0) goto L_0x001b;	 Catch:{ all -> 0x0129 }
        r2 = r6.e;	 Catch:{ all -> 0x0129 }
        r2 = r2.toString();	 Catch:{ all -> 0x0129 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x0129 }
        goto L_0x0026;	 Catch:{ all -> 0x0129 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0129 }
        r1 = "Cached bitmaps from async write of MediaPackage are no longer valid";	 Catch:{ all -> 0x0129 }
        r0.<init>(r1);	 Catch:{ all -> 0x0129 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0129 }
        throw r0;	 Catch:{ all -> 0x0129 }
        r0 = r1;	 Catch:{ all -> 0x0129 }
        r6.j = r0;	 Catch:{ all -> 0x0129 }
        r0 = r6.s;	 Catch:{ all -> 0x0129 }
        if (r0 == 0) goto L_0x0091;	 Catch:{ all -> 0x0129 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0129 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0129 }
        r3 = r0.size();	 Catch:{ all -> 0x0129 }
        r2.<init>(r3);	 Catch:{ all -> 0x0129 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0129 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0129 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0129 }
        r3 = r0.hasNext();	 Catch:{ all -> 0x0129 }
        if (r3 == 0) goto L_0x0087;	 Catch:{ all -> 0x0129 }
        r3 = r0.next();	 Catch:{ all -> 0x0129 }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ all -> 0x0129 }
        r4 = r3.getValue();	 Catch:{ all -> 0x0129 }
        r5 = "entry.value";	 Catch:{ all -> 0x0129 }
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x0129 }
        r4 = (defpackage.kaz) r4;	 Catch:{ all -> 0x0129 }
        r4 = r4.isDisposed();	 Catch:{ all -> 0x0129 }
        if (r4 != 0) goto L_0x007a;	 Catch:{ all -> 0x0129 }
        r4 = r3.getKey();	 Catch:{ all -> 0x0129 }
        r3 = r3.getValue();	 Catch:{ all -> 0x0129 }
        r3 = (defpackage.kaz) r3;	 Catch:{ all -> 0x0129 }
        r5 = r6.e;	 Catch:{ all -> 0x0129 }
        r5 = r5.toString();	 Catch:{ all -> 0x0129 }
        r3 = r3.a(r5);	 Catch:{ all -> 0x0129 }
        r3 = defpackage.ajxs.a(r4, r3);	 Catch:{ all -> 0x0129 }
        r2.add(r3);	 Catch:{ all -> 0x0129 }
        goto L_0x0041;	 Catch:{ all -> 0x0129 }
        r6.r();	 Catch:{ all -> 0x0129 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0129 }
        r1 = "thumbnails from async write of MediaPackage are no longer valid";	 Catch:{ all -> 0x0129 }
        r0.<init>(r1);	 Catch:{ all -> 0x0129 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0129 }
        throw r0;	 Catch:{ all -> 0x0129 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0129 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0129 }
        r0 = defpackage.ajzm.a(r2);	 Catch:{ all -> 0x0129 }
        if (r0 != 0) goto L_0x0095;	 Catch:{ all -> 0x0129 }
        r0 = defpackage.ajyx.a;	 Catch:{ all -> 0x0129 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0129 }
        r2 = new java.util.concurrent.ConcurrentSkipListMap;	 Catch:{ all -> 0x0129 }
        r2.<init>(r0);	 Catch:{ all -> 0x0129 }
        r2 = (java.util.NavigableMap) r2;	 Catch:{ all -> 0x0129 }
        r6.k = r2;	 Catch:{ all -> 0x0129 }
        r0 = r6.r;	 Catch:{ all -> 0x0129 }
        if (r0 == 0) goto L_0x0113;	 Catch:{ all -> 0x0129 }
        r1 = r0.values();	 Catch:{ all -> 0x0129 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x0129 }
        r2 = r1 instanceof java.util.Collection;	 Catch:{ all -> 0x0129 }
        if (r2 == 0) goto L_0x00b5;	 Catch:{ all -> 0x0129 }
        r2 = r1;	 Catch:{ all -> 0x0129 }
        r2 = (java.util.Collection) r2;	 Catch:{ all -> 0x0129 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0129 }
        if (r2 != 0) goto L_0x00cd;	 Catch:{ all -> 0x0129 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0129 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0129 }
        if (r2 == 0) goto L_0x00cd;	 Catch:{ all -> 0x0129 }
        r2 = r1.next();	 Catch:{ all -> 0x0129 }
        r2 = (defpackage.ohx) r2;	 Catch:{ all -> 0x0129 }
        r2 = r2.isDisposed();	 Catch:{ all -> 0x0129 }
        if (r2 == 0) goto L_0x00b9;	 Catch:{ all -> 0x0129 }
        r1 = 1;	 Catch:{ all -> 0x0129 }
        goto L_0x00ce;	 Catch:{ all -> 0x0129 }
        r1 = 0;	 Catch:{ all -> 0x0129 }
        if (r1 != 0) goto L_0x0106;	 Catch:{ all -> 0x0129 }
        r1 = new ohz$a;	 Catch:{ all -> 0x0129 }
        r2 = r6.e;	 Catch:{ all -> 0x0129 }
        r1.<init>(r2);	 Catch:{ all -> 0x0129 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0129 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0129 }
        r2 = r0.hasNext();	 Catch:{ all -> 0x0129 }
        if (r2 == 0) goto L_0x0101;	 Catch:{ all -> 0x0129 }
        r2 = r0.next();	 Catch:{ all -> 0x0129 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0129 }
        r3 = r2.getKey();	 Catch:{ all -> 0x0129 }
        r3 = (defpackage.ohy) r3;	 Catch:{ all -> 0x0129 }
        r2 = r2.getValue();	 Catch:{ all -> 0x0129 }
        r2 = (defpackage.ohx) r2;	 Catch:{ all -> 0x0129 }
        r4 = r6.e;	 Catch:{ all -> 0x0129 }
        r2 = r2.a(r4);	 Catch:{ all -> 0x0129 }
        r1.a(r3, r2);	 Catch:{ all -> 0x0129 }
        goto L_0x00df;	 Catch:{ all -> 0x0129 }
        r1 = r1.a();	 Catch:{ all -> 0x0129 }
        goto L_0x0113;	 Catch:{ all -> 0x0129 }
        r6.r();	 Catch:{ all -> 0x0129 }
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0129 }
        r1 = "Cached bitmaps from async write of MediaPackage are no longer valid";	 Catch:{ all -> 0x0129 }
        r0.<init>(r1);	 Catch:{ all -> 0x0129 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x0129 }
        throw r0;	 Catch:{ all -> 0x0129 }
        r6.a = r1;	 Catch:{ all -> 0x0129 }
        r0 = new ogv;	 Catch:{ all -> 0x0129 }
        r1 = r6.f;	 Catch:{ all -> 0x0129 }
        r2 = r6.e;	 Catch:{ all -> 0x0129 }
        r3 = r6.h;	 Catch:{ all -> 0x0129 }
        r3 = r3.g;	 Catch:{ all -> 0x0129 }
        r0.<init>(r1, r2, r3);	 Catch:{ all -> 0x0129 }
        r6.i = r0;	 Catch:{ all -> 0x0129 }
        r0 = r6;	 Catch:{ all -> 0x0129 }
        r0 = (defpackage.odx) r0;	 Catch:{ all -> 0x0129 }
        monitor-exit(r6);
        return r0;
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogz.a():odx");
    }

    public final abyi b() {
        return this.f;
    }

    public final abyy c() {
        return (abyy) this.m.b();
    }

    public final synchronized void close() {
        ogv ogv = this.i;
        if (ogv != null) {
            ogv.m();
            yeu yeu = this.c;
            if (yeu != null) {
                yeu.close();
            }
            yeu = this.b;
            if (yeu != null) {
                yeu.close();
            }
            yeu = this.d;
            if (yeu != null) {
                yeu.close();
            }
            r();
        }
        this.i = null;
    }

    public final FileInputStream d() {
        abmr.b();
        m();
        yeu o = o();
        return o != null ? o.d() : null;
    }

    public final Uri e() {
        m();
        abmr.b();
        try {
            Object fromFile = Uri.fromFile(q().c());
            akcr.a(fromFile, "Uri.fromFile(mediaFileSnapshot.cleanFile)");
            return fromFile;
        } catch (Exception e) {
            throw new gce("Unable to get mediaUri", (Throwable) e);
        }
    }

    public final FileInputStream f() {
        m();
        abmr.b();
        try {
            Object d = q().d();
            akcr.a(d, "mediaFileSnapshot.inputStream");
            return d;
        } catch (Exception e) {
            throw new gce("Unable to get mediaStream", (Throwable) e);
        }
    }

    public final long g() {
        m();
        abmr.b();
        try {
            return q().f();
        } catch (Exception e) {
            throw new gce("Unable to get mediaSize", (Throwable) e);
        }
    }

    public final kaz<jwj> h() {
        return this.j;
    }

    public final NavigableMap<Integer, kaz<jwj>> i() {
        return this.k;
    }

    public final boolean j() {
        m();
        abmr.b();
        return this.a != null || this.h.g.b(ohq.OVERLAY, this.f.c);
    }

    public final ajdx<Optional<ohz>> k() {
        return (ajdx) this.p.b();
    }

    public final FileInputStream l() {
        abmr.b();
        m();
        yeu p = p();
        return p != null ? p.d() : null;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void m() {
        if (this.i == null) {
            throw new gce("Reader is not open.");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    final synchronized boolean n() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.i;	 Catch:{ all -> 0x000a }
        if (r0 == 0) goto L_0x0008;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x0006;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogz.n():boolean");
    }

    /* Access modifiers changed, original: final */
    public final yeu o() {
        return (yeu) this.l.b();
    }

    /* Access modifiers changed, original: final */
    public final yeu p() {
        return (yeu) this.o.b();
    }
}

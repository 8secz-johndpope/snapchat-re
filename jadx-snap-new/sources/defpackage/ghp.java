package defpackage;

import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.google.common.base.Preconditions;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ghx.a;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ghp */
public final class ghp implements ggc {
    final akbk<String> a = ghq.a;
    List<? extends Entry<? extends Class<? extends fts>, ? extends ajdx<fts>>> b;
    final gfs c;
    private final AtomicLong d = new AtomicLong(0);
    private final ajxe e;
    private final git f;

    /* renamed from: ghp$n */
    static final class n extends akcs implements akbk<UriMatcher> {
        private /* synthetic */ ghp a;
        private /* synthetic */ Map b;

        n(ghp ghp, Map map) {
            this.a = ghp;
            this.b = map;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ghp ghp = this.a;
            Map map = this.b;
            UriMatcher uriMatcher = new UriMatcher(-1);
            ghp.b = ajyu.k(map.entrySet());
            List<Entry> list = ghp.b;
            if (list == null) {
                akcr.a("uriHandlerEntries");
            }
            int i = 0;
            for (Entry key : list) {
                Class cls = (Class) key.getKey();
                if (cls.isAnnotationPresent(ftr.class)) {
                    Annotation annotation = cls.getAnnotation(ftr.class);
                    if (annotation != null) {
                        uriMatcher.addURI((String) ghp.a.invoke(), ((ftr) annotation).a(), i);
                    } else {
                        throw new ajxt("null cannot be cast to non-null type com.snap.content.UriHandlerPathSpec");
                    }
                }
                i++;
            }
            return uriMatcher;
        }
    }

    /* renamed from: ghp$l */
    static final class l<V> implements Callable<T> {
        private /* synthetic */ ghp a;
        private /* synthetic */ Uri b;

        l(ghp ghp, Uri uri) {
            this.a = ghp;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(((UriMatcher) this.a.e.b()).match(this.b));
        }
    }

    /* renamed from: ghp$m */
    static final class m<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ghp a;
        private /* synthetic */ Uri b;
        private /* synthetic */ rzg c;
        private /* synthetic */ boolean d;
        private /* synthetic */ gdy[] e;

        m(ghp ghp, Uri uri, rzg rzg, boolean z, gdy[] gdyArr) {
            this.a = ghp;
            this.b = uri;
            this.c = rzg;
            this.d = z;
            this.e = gdyArr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, "match");
            return this.a.a(this.b, this.c, num.intValue(), this.d, (Set) ajyi.h(this.e));
        }
    }

    /* renamed from: ghp$a */
    static final class a extends akcs implements akbk<ajdx<gej>> {
        private /* synthetic */ fts a;
        private /* synthetic */ ghp b;
        private /* synthetic */ int c;
        private /* synthetic */ Uri d;
        private /* synthetic */ Set e;
        private /* synthetic */ rzg f;
        private /* synthetic */ boolean g;

        a(fts fts, ghp ghp, int i, Uri uri, Set set, rzg rzg, boolean z) {
            this.a = fts;
            this.b = ghp;
            this.c = i;
            this.d = uri;
            this.e = set;
            this.f = rzg;
            this.g = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(this.d, ajzs.a(this.f), this.g, ajzs.a(gdy.READ_CACHE_ONLY));
        }
    }

    /* renamed from: ghp$b */
    static final class b extends akcs implements akbk<ajdj<gej>> {
        final /* synthetic */ ghp a;
        final /* synthetic */ rzg b;
        final /* synthetic */ boolean c;
        private /* synthetic */ int d;
        private /* synthetic */ Uri e;
        private /* synthetic */ Set f;

        /* renamed from: ghp$b$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Uri uri = (Uri) obj;
                akcr.b(uri, "fallbackUri");
                return this.a.a.a(uri, this.a.b, ((UriMatcher) this.a.a.e.b()).match(uri), this.a.c, (Set) ajyy.a);
            }
        }

        b(ghp ghp, int i, Uri uri, Set set, rzg rzg, boolean z) {
            this.a = ghp;
            this.d = i;
            this.e = uri;
            this.f = set;
            this.b = rzg;
            this.c = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object d = this.a.c.a(this.e).d((ajfc) new 1(this));
            akcr.a(d, "fallbackUriProvider.get(…                        }");
            return d;
        }
    }

    /* renamed from: ghp$c */
    static final class c extends akcs implements akbk<ajdx<gej>> {
        private /* synthetic */ fts a;
        private /* synthetic */ ghp b;
        private /* synthetic */ int c;
        private /* synthetic */ Uri d;
        private /* synthetic */ Set e;
        private /* synthetic */ rzg f;
        private /* synthetic */ boolean g;

        c(fts fts, ghp ghp, int i, Uri uri, Set set, rzg rzg, boolean z) {
            this.a = fts;
            this.b = ghp;
            this.c = i;
            this.d = uri;
            this.e = set;
            this.f = rzg;
            this.g = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(this.d, ajzs.a(this.f), this.g, this.e);
        }
    }

    /* renamed from: ghp$g */
    static final class g<T, R> implements ajfc<Throwable, gej> {
        public static final g a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "e");
            return a.a(th, null);
        }
    }

    /* renamed from: ghp$h */
    static final class h<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((gej) obj, "it");
            return ajvo.a(ajot.a);
        }
    }

    /* renamed from: ghp$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ ghp a;
        private /* synthetic */ Uri b;

        d(ghp ghp, Uri uri) {
            this.a = ghp;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(((UriMatcher) this.a.e.b()).match(this.b));
        }
    }

    /* renamed from: ghp$i */
    static final class i<V> implements Callable<T> {
        private /* synthetic */ ghp a;
        private /* synthetic */ Uri b;

        i(ghp ghp, Uri uri) {
            this.a = ghp;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(((UriMatcher) this.a.e.b()).match(this.b));
        }
    }

    /* renamed from: ghp$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ghp a;
        private /* synthetic */ Uri b;
        private /* synthetic */ idl c;
        private /* synthetic */ boolean d;
        private /* synthetic */ Uri e;

        /* renamed from: ghp$e$1 */
        static final class 1<T> implements ajfb<gej> {
            private /* synthetic */ e a;

            1(e eVar) {
                this.a = eVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                akcr.b((gej) obj, "toResult");
            }
        }

        e(ghp ghp, Uri uri, idl idl, boolean z, Uri uri2) {
            this.a = ghp;
            this.b = uri;
            this.c = idl;
            this.d = z;
            this.e = uri2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, "match");
            if (num.intValue() == -1) {
                obj = ajdx.b((Throwable) ghq.a(this.b));
                akcr.a(obj, "Single.error(noMatchUriException(toUri))");
                return obj;
            }
            fts a = this.a.a(num.intValue());
            Uri uri = this.b;
            Set a2 = ajzs.a(new rzg(this.c));
            boolean z = this.d;
            Object emptySet = Collections.emptySet();
            akcr.a(emptySet, "Collections.emptySet()");
            Object c = this.a.a(this.e, this.c, true, new gdy[0]).c((ajfb) new 1(this));
            akcr.a(c, "resolve(fromUri, page, t…                        }");
            return a.a(uri, a2, z, emptySet, c);
        }
    }

    /* renamed from: ghp$f */
    static final class f<T> implements ajfb<gej> {
        private /* synthetic */ Uri a;
        private /* synthetic */ idl b;

        f(Uri uri, idl idl) {
            this.a = uri;
            this.b = idl;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ghp$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ghp a;
        private /* synthetic */ Uri b;
        private /* synthetic */ idl c;
        private /* synthetic */ CancellationSignal d;

        j(ghp ghp, Uri uri, idl idl, CancellationSignal cancellationSignal) {
            this.a = ghp;
            this.b = uri;
            this.c = idl;
            this.d = cancellationSignal;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Integer num = (Integer) obj;
            akcr.b(num, "match");
            return this.a.a(this.b, this.c, num.intValue(), this.d);
        }
    }

    /* renamed from: ghp$k */
    static final class k extends akcq implements akbk<ajxw> {
        k(CancellationSignal cancellationSignal) {
            super(0, cancellationSignal);
        }

        public final String getName() {
            return "cancel";
        }

        public final akej getOwner() {
            return akde.a(CancellationSignal.class);
        }

        public final String getSignature() {
            return "cancel()V";
        }

        public final /* synthetic */ Object invoke() {
            ((CancellationSignal) this.receiver).cancel();
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ghp.class), "uriMatcher", "getUriMatcher()Landroid/content/UriMatcher;");
    }

    public ghp(Map<Class<? extends fts>, ? extends ajdx<fts>> map, gfs gfs, git git) {
        akcr.b(map, "providedUriOpenHandlersMap");
        akcr.b(gfs, "fallbackUriProvider");
        akcr.b(git, "resolveStatusTracker");
        this.c = gfs;
        this.f = git;
        this.e = ajxh.a(new n(this, map));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x0108 in {4, 6, 8, 13, 14, 17, 22, 23, 24, 27, 29, 32, 34, 35, 39, 41} preds:[]
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
    private final defpackage.ajdx<defpackage.gej> a(android.net.Uri r17, defpackage.rzg r18, int r19, boolean r20, java.util.Set<? extends defpackage.gdy> r21) {
        /*
        r16 = this;
        r0 = r19;
        r9 = "resolveProvider";
        r10 = "checkCacheProvider";
        r1 = "";
        defpackage.in.a(r1);
        r1 = -1;
        if (r0 != r1) goto L_0x002b;
        r0 = defpackage.ghq.a(r17);	 Catch:{ RuntimeException -> 0x0026, all -> 0x0021 }
        r0 = (java.lang.Throwable) r0;	 Catch:{ RuntimeException -> 0x0026, all -> 0x0021 }
        r0 = defpackage.ajdx.b(r0);	 Catch:{ RuntimeException -> 0x0026, all -> 0x0021 }
        r1 = "Single.error(noMatchUriException(uri))";	 Catch:{ RuntimeException -> 0x0026, all -> 0x0021 }
        defpackage.akcr.a(r0, r1);	 Catch:{ RuntimeException -> 0x0026, all -> 0x0021 }
        r11 = r16;
        goto L_0x00ee;
        r0 = move-exception;
        r11 = r16;
        goto L_0x0104;
        r0 = move-exception;
        r11 = r16;
        goto L_0x00f5;
        r11 = r16;
        r12 = r11.a(r0);	 Catch:{  }
        r1 = r21;	 Catch:{  }
        r1 = (java.util.Collection) r1;	 Catch:{  }
        r1 = r1.isEmpty();	 Catch:{  }
        r1 = r1 ^ 1;	 Catch:{  }
        if (r1 == 0) goto L_0x0042;	 Catch:{  }
        r13 = r17;	 Catch:{  }
        r1 = r21;	 Catch:{  }
        goto L_0x0048;	 Catch:{  }
        r13 = r17;	 Catch:{  }
        r1 = r12.b(r13);	 Catch:{  }
        r14 = new gir;	 Catch:{  }
        r14.<init>(r1);	 Catch:{  }
        r15 = new ghp$a;	 Catch:{  }
        r1 = r15;	 Catch:{  }
        r2 = r12;	 Catch:{  }
        r3 = r16;	 Catch:{  }
        r4 = r19;	 Catch:{  }
        r5 = r17;	 Catch:{  }
        r6 = r21;	 Catch:{  }
        r7 = r18;	 Catch:{  }
        r8 = r20;	 Catch:{  }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{  }
        r15 = (defpackage.akbk) r15;	 Catch:{  }
        defpackage.akcr.b(r15, r10);	 Catch:{  }
        r14.a = r15;	 Catch:{  }
        r8 = new ghp$b;	 Catch:{  }
        r1 = r8;	 Catch:{  }
        r2 = r16;	 Catch:{  }
        r3 = r19;	 Catch:{  }
        r4 = r17;	 Catch:{  }
        r5 = r21;	 Catch:{  }
        r6 = r18;	 Catch:{  }
        r7 = r20;	 Catch:{  }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{  }
        r8 = (defpackage.akbk) r8;	 Catch:{  }
        r1 = "fallbackProvider";	 Catch:{  }
        defpackage.akcr.b(r8, r1);	 Catch:{  }
        r14.b = r8;	 Catch:{  }
        r15 = new ghp$c;	 Catch:{  }
        r1 = r15;	 Catch:{  }
        r2 = r12;	 Catch:{  }
        r3 = r16;	 Catch:{  }
        r4 = r19;	 Catch:{  }
        r5 = r17;	 Catch:{  }
        r6 = r21;	 Catch:{  }
        r7 = r18;	 Catch:{  }
        r8 = r20;	 Catch:{  }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{  }
        r15 = (defpackage.akbk) r15;	 Catch:{  }
        defpackage.akcr.b(r15, r9);	 Catch:{  }
        r14.c = r15;	 Catch:{  }
        r0 = r14.d;	 Catch:{  }
        r0 = defpackage.gei.a(r0);	 Catch:{  }
        if (r0 == 0) goto L_0x00ab;	 Catch:{  }
        r0 = r15.invoke();	 Catch:{  }
        r0 = (defpackage.ajdx) r0;	 Catch:{  }
        goto L_0x00ee;	 Catch:{  }
        r0 = r14.d;	 Catch:{  }
        r1 = defpackage.gdy.PREFER_FALLBACK_URI;	 Catch:{  }
        r0 = r0.contains(r1);	 Catch:{  }
        if (r0 == 0) goto L_0x00d9;	 Catch:{  }
        r0 = r14.a;	 Catch:{  }
        if (r0 != 0) goto L_0x00bc;	 Catch:{  }
        defpackage.akcr.a(r10);	 Catch:{  }
        r0 = r0.invoke();	 Catch:{  }
        r0 = (defpackage.ajdx) r0;	 Catch:{  }
        r1 = new gir$b;	 Catch:{  }
        r1.<init>(r14);	 Catch:{  }
        r1 = (defpackage.akbl) r1;	 Catch:{  }
        r0 = defpackage.gis.a(r0, r1);	 Catch:{  }
        r1 = new gir$c;	 Catch:{  }
        r1.<init>(r14);	 Catch:{  }
        r1 = (defpackage.akbl) r1;	 Catch:{  }
        r0 = defpackage.gis.a(r0, r1);	 Catch:{  }
        goto L_0x00ee;	 Catch:{  }
        r0 = r14.c;	 Catch:{  }
        if (r0 != 0) goto L_0x00e0;	 Catch:{  }
        defpackage.akcr.a(r9);	 Catch:{  }
        r0 = r0.invoke();	 Catch:{  }
        r0 = (defpackage.ajdx) r0;	 Catch:{  }
        r1 = new gir$a;	 Catch:{  }
        r1.<init>(r14);	 Catch:{  }
        r1 = (defpackage.akbl) r1;	 Catch:{  }
        goto L_0x00d4;
        defpackage.in.a();	 Catch:{ RuntimeException -> 0x00f4 }
        return r0;
        r0 = move-exception;
        goto L_0x0104;
        r0 = move-exception;
        r0 = (java.lang.Throwable) r0;	 Catch:{ all -> 0x00f2 }
        r0 = defpackage.ajdx.b(r0);	 Catch:{ all -> 0x00f2 }
        r1 = "Single.error(e)";	 Catch:{ all -> 0x00f2 }
        defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x00f2 }
        defpackage.in.a();
        return r0;
        defpackage.in.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghp.a(android.net.Uri, rzg, int, boolean, java.util.Set):ajdx");
    }

    private final ajdx<gej> a(Uri uri, rzg rzg, boolean z, gdy... gdyArr) {
        long andIncrement = this.d.getAndIncrement();
        Uri uri2 = uri;
        Object a = ajdx.c((Callable) new l(this, uri)).a((ajfc) new m(this, uri, rzg, z, gdyArr));
        akcr.a(a, "Single.fromCallable { ur…ssControls.toHashSet()) }");
        return giu.a(a, this.f, uri2, rzg, ajyi.h(gdyArr), andIncrement);
    }

    public final ajcx a(Uri uri, idl idl, float f) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        String str2 = "page";
        akcr.b(idl, str2);
        akcr.b(uri, str);
        akcr.b(idl, str2);
        return gfu.a.a(this, uri, idl, f);
    }

    public final ajcx a(Uri uri, idl idl, float f, String str) {
        String str2 = MessageMediaRefModel.URI;
        akcr.b(uri, str2);
        String str3 = "page";
        akcr.b(idl, str3);
        akcr.b(uri, str2);
        akcr.b(idl, str3);
        Object e = a(uri, idl, f, rzc.Prefetch, str).e();
        akcr.a(e, "associateContentWithPrio…ackingId).ignoreElement()");
        return e;
    }

    public final ajdx<gej> a(Uri uri, Uri uri2, idl idl, boolean z) {
        akcr.b(uri, "toUri");
        akcr.b(uri2, "fromUri");
        akcr.b(idl, "page");
        Object c = ajdx.c((Callable) new d(this, uri)).a((ajfc) new e(this, uri, idl, z, uri2)).c((ajfb) new f(uri2, idl));
        akcr.a(c, "Single.fromCallable { ur…ult)}\")\n                }");
        return c;
    }

    public final ajdx<AssetFileDescriptor> a(Uri uri, idl idl) {
        akcr.b(uri, MessageMediaRefModel.URI);
        CancellationSignal cancellationSignal = new CancellationSignal();
        Object c = ajdx.c((Callable) new i(this, uri)).a((ajfc) new j(this, uri, idl, cancellationSignal)).c((ajev) new ghr(new k(cancellationSignal)));
        akcr.a(c, "Single.fromCallable { ur…OnDispose(signal::cancel)");
        return c;
    }

    public final ajdx<gej> a(Uri uri, idl idl, float f, rzc rzc, String str) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(idl, "page");
        akcr.b(rzc, "requestPriority");
        Preconditions.checkArgument(rze.a(rzc), "Only prefetch request priority are allowed", new Object[0]);
        return a(uri, new rzg(idl, rzc, f, uri, str), true, new gdy[0]);
    }

    /* Access modifiers changed, original: final */
    public final ajdx<AssetFileDescriptor> a(Uri uri, idl idl, int i, CancellationSignal cancellationSignal) {
        if (i != -1) {
            try {
                return a(i).a(uri, cancellationSignal, new rzg(idl, uri));
            } catch (RuntimeException e) {
                throw e;
            }
        }
        throw ghq.a(uri);
    }

    public final ajdx<gej> a(Uri uri, idl idl, boolean z, String str, gdy... gdyArr) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(idl, "page");
        akcr.b(gdyArr, "cacheAccessControls");
        return a(uri, new rzg(idl, rzc.UserInitiated, 1.0f, uri, str), z, (gdy[]) Arrays.copyOf(gdyArr, gdyArr.length));
    }

    public final ajdx<gej> a(Uri uri, idl idl, boolean z, gdy... gdyArr) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(idl, "page");
        akcr.b(gdyArr, "cacheAccessControls");
        return ggc.a.a(this, uri, idl, z, gdyArr);
    }

    /* Access modifiers changed, original: final */
    public final fts a(int i) {
        List list = this.b;
        if (list == null) {
            akcr.a("uriHandlerEntries");
        }
        Object b = ((ajdx) ((Entry) list.get(i)).getValue()).b();
        akcr.a(b, "uriHandlerEntries[index].value.blockingGet()");
        return (fts) b;
    }

    public final ajdp<gfw> b(Uri uri, idl idl) {
        akcr.b(uri, MessageMediaRefModel.URI);
        ajdp b = this.f.b(uri);
        if (idl == null) {
            idl = idn.a;
        }
        Object d = a(uri, idl, true, gdy.READ_CACHE_ONLY).g(g.a).d((ajfc) h.a);
        akcr.a(d, "resolve(uri, page ?: DEF…ty<SnapContentStatus>() }");
        d = ajdp.c((ajdt) b, (ajdt) d);
        akcr.a(d, "Observable.mergeDelayErr…rvable, lookupObservable)");
        return d;
    }
}

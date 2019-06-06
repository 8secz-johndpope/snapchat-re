package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.util.LruCache;
import com.google.common.base.Optional;
import com.google.common.collect.Sets;
import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.gfr.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ogw */
public class ogw implements odu {
    final Object a = new Object();
    final Map<String, ohs> b = new ConcurrentHashMap();
    final LruCache<String, Throwable> c = new LruCache(24);
    String d;
    final Map<String, oha> e = new ConcurrentHashMap();
    final ajxe f = ajxh.a(e.a);
    final ygi g;
    final ohr h;
    final aipn<iha> i;
    final aipn<oec> j;
    final ajdw k;
    final aipn<ohj> l;
    private final ajei m = new ajei();
    private final Context n;

    /* renamed from: ogw$e */
    static final class e extends akcs implements akbk<UriMatcher> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            UriMatcher uriMatcher = new UriMatcher(-1);
            uriMatcher.addURI(a.a(), "composite/*/package/*", 0);
            return uriMatcher;
        }
    }

    /* renamed from: ogw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ogw$k */
    static final class k<V> implements Callable<T> {
        final /* synthetic */ ogw a;
        final /* synthetic */ idd b;
        final /* synthetic */ kaz c;

        /* renamed from: ogw$k$a */
        static final class a<T> implements ajwy<oha> {
            private /* synthetic */ k a;

            a(k kVar) {
                this.a = kVar;
            }

            public final /* synthetic */ Object get() {
                idd idd = this.a.b;
                String a = odv.a();
                Object a2 = this.a.c.a(this.a.b.toString());
                akcr.a(a2, "bitmap.clone(caller.toString())");
                ajdw ajdw = this.a.a.k;
                Object obj = this.a.a.i.get();
                akcr.a(obj, "serializationHelper.get()");
                return new ohc(idd, a, a2, ajdw, (iha) obj, this.a.a);
            }
        }

        k(ogw ogw, idd idd, kaz kaz) {
            this.a = ogw;
            this.b = idd;
            this.c = kaz;
        }

        public final /* synthetic */ Object call() {
            abmr.a("Can't create media package builder on the UI thread.");
            return new ogt(this.b, new a(this), this.a);
        }
    }

    /* renamed from: ogw$r */
    static final class r<V> implements Callable<T> {
        private /* synthetic */ ogw a;
        private /* synthetic */ String b;
        private /* synthetic */ idd c;
        private /* synthetic */ boolean d;
        private /* synthetic */ List e;

        r(ogw ogw, String str, idd idd, boolean z, List list) {
            this.a = ogw;
            this.b = str;
            this.c = idd;
            this.d = z;
            this.e = list;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:54:0x0171 in {8, 11, 15, 21, 22, 23, 29, 31, 34, 36, 41, 42, 44, 47, 48, 50, 53} preds:[]
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
        private com.google.common.base.Optional<defpackage.abyk> a() {
            /*
            r18 = this;
            r1 = r18;
            r0 = r1.a;
            r2 = r0.a;
            monitor-enter(r2);
            r0 = r1.a;	 Catch:{ all -> 0x016e }
            r0 = r0.b;	 Catch:{ all -> 0x016e }
            r3 = r1.b;	 Catch:{ all -> 0x016e }
            r0 = r0.get(r3);	 Catch:{ all -> 0x016e }
            r0 = (defpackage.ohs) r0;	 Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x0027;	 Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x001f;	 Catch:{ all -> 0x016e }
            r0 = (defpackage.abyk) r0;	 Catch:{ all -> 0x016e }
            r0 = com.google.common.base.Optional.of(r0);	 Catch:{ all -> 0x016e }
            monitor-exit(r2);
            return r0;
            r0 = new ajxt;	 Catch:{ all -> 0x016e }
            r3 = "null cannot be cast to non-null type com.snapchat.android.media.model.MediaPackageSession";	 Catch:{ all -> 0x016e }
            r0.<init>(r3);	 Catch:{ all -> 0x016e }
            throw r0;	 Catch:{ all -> 0x016e }
            r0 = r1.a;	 Catch:{ all -> 0x016e }
            r0 = r0.l;	 Catch:{ all -> 0x016e }
            r0 = r0.get();	 Catch:{ all -> 0x016e }
            r0 = (defpackage.ohj) r0;	 Catch:{ all -> 0x016e }
            r3 = r1.c;	 Catch:{ all -> 0x016e }
            r4 = r1.b;	 Catch:{ all -> 0x016e }
            r5 = "caller";	 Catch:{ all -> 0x016e }
            defpackage.akcr.b(r3, r5);	 Catch:{ all -> 0x016e }
            r5 = "sessionId";	 Catch:{ all -> 0x016e }
            defpackage.akcr.b(r4, r5);	 Catch:{ all -> 0x016e }
            r5 = r0.a();	 Catch:{ all -> 0x016e }
            r6 = "MediaPackageRepository:getMediaPackageSession";	 Catch:{ all -> 0x016e }
            r7 = r0.b();	 Catch:{ all -> 0x016e }
            r7 = r7.a();	 Catch:{ all -> 0x016e }
            r7 = r7.a(r4);	 Catch:{ all -> 0x016e }
            r5 = r5.queryAsList(r6, r7);	 Catch:{ all -> 0x016e }
            r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x016e }
            r6 = new java.util.ArrayList;	 Catch:{ all -> 0x016e }
            r7 = 10;	 Catch:{ all -> 0x016e }
            r8 = defpackage.ajyn.a(r5, r7);	 Catch:{ all -> 0x016e }
            r6.<init>(r8);	 Catch:{ all -> 0x016e }
            r6 = (java.util.Collection) r6;	 Catch:{ all -> 0x016e }
            r5 = r5.iterator();	 Catch:{ all -> 0x016e }
            r8 = r5.hasNext();	 Catch:{ all -> 0x016e }
            if (r8 == 0) goto L_0x007c;	 Catch:{ all -> 0x016e }
            r8 = r5.next();	 Catch:{ all -> 0x016e }
            r8 = (defpackage.oho) r8;	 Catch:{ all -> 0x016e }
            r8 = r0.a(r8);	 Catch:{ all -> 0x016e }
            r6.add(r8);	 Catch:{ all -> 0x016e }
            goto L_0x0068;	 Catch:{ all -> 0x016e }
            r6 = (java.util.List) r6;	 Catch:{ all -> 0x016e }
            r6 = (java.lang.Iterable) r6;	 Catch:{ all -> 0x016e }
            r0 = new java.util.ArrayList;	 Catch:{ all -> 0x016e }
            r5 = defpackage.ajyn.a(r6, r7);	 Catch:{ all -> 0x016e }
            r0.<init>(r5);	 Catch:{ all -> 0x016e }
            r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x016e }
            r5 = r6.iterator();	 Catch:{ all -> 0x016e }
            r6 = r5.hasNext();	 Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x00b8;	 Catch:{ all -> 0x016e }
            r6 = r5.next();	 Catch:{ all -> 0x016e }
            r8 = r6;	 Catch:{ all -> 0x016e }
            r8 = (defpackage.abyi) r8;	 Catch:{ all -> 0x016e }
            r6 = r8.b;	 Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x00a2;	 Catch:{ all -> 0x016e }
            if (r8 != 0) goto L_0x00b4;	 Catch:{ all -> 0x016e }
            r9 = 0;	 Catch:{ all -> 0x016e }
            r10 = defpackage.odv.a();	 Catch:{ all -> 0x016e }
            r11 = 0;	 Catch:{ all -> 0x016e }
            r12 = 0;	 Catch:{ all -> 0x016e }
            r13 = 0;	 Catch:{ all -> 0x016e }
            r14 = 0;	 Catch:{ all -> 0x016e }
            r15 = 0;	 Catch:{ all -> 0x016e }
            r16 = 0;	 Catch:{ all -> 0x016e }
            r17 = 253; // 0xfd float:3.55E-43 double:1.25E-321;	 Catch:{ all -> 0x016e }
            r8 = defpackage.abyi.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x016e }
            r0.add(r8);	 Catch:{ all -> 0x016e }
            goto L_0x008f;	 Catch:{ all -> 0x016e }
            r0 = (java.util.List) r0;	 Catch:{ all -> 0x016e }
            r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x016e }
            r5 = new java.util.ArrayList;	 Catch:{ all -> 0x016e }
            r6 = defpackage.ajyn.a(r0, r7);	 Catch:{ all -> 0x016e }
            r5.<init>(r6);	 Catch:{ all -> 0x016e }
            r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x016e }
            r0 = r0.iterator();	 Catch:{ all -> 0x016e }
            r6 = r0.hasNext();	 Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x00f1;	 Catch:{ all -> 0x016e }
            r6 = r0.next();	 Catch:{ all -> 0x016e }
            r6 = (defpackage.abyi) r6;	 Catch:{ all -> 0x016e }
            r7 = r6.a;	 Catch:{ all -> 0x016e }
            r7 = defpackage.akcr.a(r4, r7);	 Catch:{ all -> 0x016e }
            if (r7 == 0) goto L_0x00e3;	 Catch:{ all -> 0x016e }
            r5.add(r6);	 Catch:{ all -> 0x016e }
            goto L_0x00cb;	 Catch:{ all -> 0x016e }
            r0 = "Check failed.";	 Catch:{ all -> 0x016e }
            r3 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x016e }
            r0 = r0.toString();	 Catch:{ all -> 0x016e }
            r3.<init>(r0);	 Catch:{ all -> 0x016e }
            r3 = (java.lang.Throwable) r3;	 Catch:{ all -> 0x016e }
            throw r3;	 Catch:{ all -> 0x016e }
            r5 = (java.util.List) r5;	 Catch:{ all -> 0x016e }
            r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x016e }
            r0 = new ohj$b;	 Catch:{ all -> 0x016e }
            r0.<init>();	 Catch:{ all -> 0x016e }
            r0 = (java.util.Comparator) r0;	 Catch:{ all -> 0x016e }
            r0 = defpackage.ajyu.a(r5, r0);	 Catch:{ all -> 0x016e }
            r4 = r0.isEmpty();	 Catch:{ all -> 0x016e }
            if (r4 == 0) goto L_0x0110;	 Catch:{ all -> 0x016e }
            r0 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x016e }
            r3 = "Optional.absent()";	 Catch:{ all -> 0x016e }
            defpackage.akcr.a(r0, r3);	 Catch:{ all -> 0x016e }
            goto L_0x011c;	 Catch:{ all -> 0x016e }
            r4 = new ohs;	 Catch:{ all -> 0x016e }
            r4.<init>(r0, r3);	 Catch:{ all -> 0x016e }
            r0 = com.google.common.base.Optional.of(r4);	 Catch:{ all -> 0x016e }
            r3 = "Optional.of(MediaPackage…onImpl(packages, caller))";	 Catch:{ all -> 0x016e }
            goto L_0x010c;	 Catch:{ all -> 0x016e }
            r3 = r0.isPresent();	 Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x014f;	 Catch:{ all -> 0x016e }
            r3 = r1.a;	 Catch:{ all -> 0x016e }
            r3 = r3.b;	 Catch:{ all -> 0x016e }
            r4 = r0.get();	 Catch:{ all -> 0x016e }
            r4 = (defpackage.ohs) r4;	 Catch:{ all -> 0x016e }
            r4 = r4.b;	 Catch:{ all -> 0x016e }
            r5 = r0.get();	 Catch:{ all -> 0x016e }
            r6 = "session.get()";	 Catch:{ all -> 0x016e }
            defpackage.akcr.a(r5, r6);	 Catch:{ all -> 0x016e }
            r3.put(r4, r5);	 Catch:{ all -> 0x016e }
            r0 = r0.get();	 Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x0147;	 Catch:{ all -> 0x016e }
            r0 = (defpackage.abyk) r0;	 Catch:{ all -> 0x016e }
            r0 = com.google.common.base.Optional.of(r0);	 Catch:{ all -> 0x016e }
            goto L_0x016c;	 Catch:{ all -> 0x016e }
            r0 = new ajxt;	 Catch:{ all -> 0x016e }
            r3 = "null cannot be cast to non-null type com.snapchat.android.media.model.MediaPackageSession";	 Catch:{ all -> 0x016e }
            r0.<init>(r3);	 Catch:{ all -> 0x016e }
            throw r0;	 Catch:{ all -> 0x016e }
            r0 = r1.d;	 Catch:{ all -> 0x016e }
            if (r0 == 0) goto L_0x0168;	 Catch:{ all -> 0x016e }
            r0 = new ohs;	 Catch:{ all -> 0x016e }
            r3 = r1.e;	 Catch:{ all -> 0x016e }
            r4 = r1.c;	 Catch:{ all -> 0x016e }
            r0.<init>(r3, r4);	 Catch:{ all -> 0x016e }
            r3 = r1.a;	 Catch:{ all -> 0x016e }
            r3 = r3.b;	 Catch:{ all -> 0x016e }
            r4 = r0.b;	 Catch:{ all -> 0x016e }
            r3.put(r4, r0);	 Catch:{ all -> 0x016e }
            r0 = (defpackage.abyk) r0;	 Catch:{ all -> 0x016e }
            goto L_0x0142;	 Catch:{ all -> 0x016e }
            r0 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x016e }
            monitor-exit(r2);
            return r0;
            r0 = move-exception;
            monitor-exit(r2);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw$r.a():com.google.common.base.Optional");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: ogw$f */
    static final class f<V> implements Callable<T> {
        private /* synthetic */ abyi a;

        f(abyi abyi) {
            this.a = abyi;
        }

        public final /* synthetic */ Object call() {
            abmr.a("Can't create media package reader on the UI thread.");
            return this.a;
        }
    }

    /* renamed from: ogw$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ogw a;
        private /* synthetic */ idd b;

        g(ogw ogw, idd idd) {
            this.a = ogw;
            this.b = idd;
        }

        private ajdx<? extends odx> a(abyi abyi) {
            oha oha;
            akcr.b(abyi, "mediaPackage");
            synchronized (this.a.a) {
                oha = (oha) this.a.e.get(abyi.b);
            }
            if (oha != null) {
                ajdx b = ajdx.b(oha.a(abyi, this.b));
                if (b != null) {
                    return b;
                }
            }
            Object b2 = ajdx.b((Object) new ogz(this.b, abyi, null, null, null, this.a, 60));
            akcr.a(b2, "Single.just(MediaPackage…MediaPackageManagerImpl))");
            return b2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((abyi) obj);
        }
    }

    /* renamed from: ogw$n */
    static final class n implements ajev {
        private /* synthetic */ oha a;
        private /* synthetic */ ogw b;
        private /* synthetic */ abyi c;

        n(oha oha, ogw ogw, abyi abyi) {
            this.a = oha;
            this.b = ogw;
            this.c = abyi;
        }

        public final void run() {
            synchronized (this.b.a) {
                this.b.e.remove(this.c.b);
                this.a.m();
            }
        }
    }

    /* renamed from: ogw$ad */
    static final class ad<V> implements Callable<T> {
        private /* synthetic */ abyi a;
        private /* synthetic */ List b;

        ad(abyi abyi, List list) {
            this.a = abyi;
            this.b = list;
        }

        public final /* synthetic */ Object call() {
            List arrayList = new ArrayList();
            abyo a = this.a.a();
            int i = 0;
            for (Number intValue : ajyu.a((Collection) this.b, (Object) Integer.valueOf(a.b))) {
                int intValue2 = intValue.intValue();
                Object obj = 1;
                Object obj2 = intValue2 > 0 ? 1 : null;
                if (ajxy.a && obj2 == null) {
                    throw new AssertionError("Split offset must be non-negative.");
                }
                obj2 = intValue2 <= a.b ? 1 : null;
                if (ajxy.a && obj2 == null) {
                    throw new AssertionError("Split offset is out of bounds of the media segment.");
                }
                if (i >= intValue2) {
                    obj = null;
                }
                if (ajxy.a && obj == null) {
                    throw new AssertionError("Split offsets must be sorted and unique.");
                }
                abyi abyi = r7;
                abyi abyi2 = new abyi(this.a.a, odv.a(), this.a.c, this.a.d, this.a.e, new abyo(a.a + i, intValue2 - i, a.c, a.d, a.e, a.f), this.a.f, this.a.g);
                arrayList.add(abyi);
                i = intValue2;
            }
            return arrayList;
        }
    }

    /* renamed from: ogw$j */
    static final class j<V> implements Callable<T> {
        final /* synthetic */ ogw a;
        final /* synthetic */ idd b;
        final /* synthetic */ String c;

        /* renamed from: ogw$j$a */
        static final class a<T> implements ajwy<oha> {
            private /* synthetic */ j a;

            a(j jVar) {
                this.a = jVar;
            }

            public final /* synthetic */ Object get() {
                idd idd = this.a.b;
                String a = odv.a();
                String str = this.a.c;
                ajdw ajdw = this.a.a.k;
                Object obj = this.a.a.i.get();
                akcr.a(obj, "serializationHelper.get()");
                return new ohd(idd, a, str, ajdw, (iha) obj, this.a.a);
            }
        }

        j(ogw ogw, idd idd, String str) {
            this.a = ogw;
            this.b = idd;
            this.c = str;
        }

        public final /* synthetic */ Object call() {
            abmr.a("Can't create media package builder on the UI thread.");
            return new ogt(this.b, new a(this), this.a);
        }
    }

    /* renamed from: ogw$s */
    static final class s<V> implements Callable<T> {
        private /* synthetic */ ogw a;
        private /* synthetic */ Uri b;

        s(ogw ogw, Uri uri) {
            this.a = ogw;
            this.b = uri;
        }

        public final /* synthetic */ Object call() {
            ohj ohj = (ohj) this.a.l.get();
            Uri uri = this.b;
            akcr.b(uri, MessageMediaRefModel.URI);
            SqlDelightDbClient a = ohj.a();
            ohl b = ohj.b().b();
            Object uri2 = uri.toString();
            akcr.a(uri2, "uri.toString()");
            ohp ohp = (ohp) ajyu.g(a.queryAsList("MediaPackageRepository:lookupMediaPackageUri", b.a(uri2)));
            if (ohp != null) {
                Optional of = Optional.of(Uri.parse(ohp.a()));
                if (of != null) {
                    return of;
                }
            }
            Object absent = Optional.absent();
            akcr.a(absent, "Optional.absent()");
            return absent;
        }
    }

    /* renamed from: ogw$t */
    static final class t<V> implements Callable<T> {
        private /* synthetic */ ogw a;
        private /* synthetic */ idd b;

        t(ogw ogw, idd idd) {
            this.a = ogw;
            this.b = idd;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x0102 in {7, 10, 17, 21, 22, 27, 29, 30, 32, 35} preds:[]
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
        private com.google.common.base.Optional<defpackage.ohs> a() {
            /*
            r8 = this;
            r0 = r8.a;
            r0 = r0.a;
            monitor-enter(r0);
            r1 = r8.a;	 Catch:{ all -> 0x00ff }
            r1 = r1.d;	 Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x001d;	 Catch:{ all -> 0x00ff }
            r2 = r8.a;	 Catch:{ all -> 0x00ff }
            r2 = r2.b;	 Catch:{ all -> 0x00ff }
            r1 = r2.get(r1);	 Catch:{ all -> 0x00ff }
            r1 = (defpackage.ohs) r1;	 Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x001d;	 Catch:{ all -> 0x00ff }
            r1 = com.google.common.base.Optional.of(r1);	 Catch:{ all -> 0x00ff }
            goto L_0x00fd;	 Catch:{ all -> 0x00ff }
            r1 = r8.a;	 Catch:{ all -> 0x00ff }
            r1 = r1.l;	 Catch:{ all -> 0x00ff }
            r1 = r1.get();	 Catch:{ all -> 0x00ff }
            r1 = (defpackage.ohj) r1;	 Catch:{ all -> 0x00ff }
            r2 = r8.b;	 Catch:{ all -> 0x00ff }
            r3 = "caller";	 Catch:{ all -> 0x00ff }
            defpackage.akcr.b(r2, r3);	 Catch:{ all -> 0x00ff }
            r3 = r1.c();	 Catch:{ all -> 0x00ff }
            r4 = r3.isEmpty();	 Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x0042;	 Catch:{ all -> 0x00ff }
            r1 = com.google.common.base.Optional.absent();	 Catch:{ all -> 0x00ff }
            r2 = "Optional.absent()";	 Catch:{ all -> 0x00ff }
            defpackage.akcr.a(r1, r2);	 Catch:{ all -> 0x00ff }
            goto L_0x00ab;	 Catch:{ all -> 0x00ff }
            r4 = defpackage.ajyu.h(r3);	 Catch:{ all -> 0x00ff }
            r4 = (defpackage.oho) r4;	 Catch:{ all -> 0x00ff }
            r4 = r4.a();	 Catch:{ all -> 0x00ff }
            r3 = (java.lang.Iterable) r3;	 Catch:{ all -> 0x00ff }
            r5 = new java.util.ArrayList;	 Catch:{ all -> 0x00ff }
            r5.<init>();	 Catch:{ all -> 0x00ff }
            r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x00ff }
            r3 = r3.iterator();	 Catch:{ all -> 0x00ff }
            r6 = r3.hasNext();	 Catch:{ all -> 0x00ff }
            if (r6 == 0) goto L_0x0074;	 Catch:{ all -> 0x00ff }
            r6 = r3.next();	 Catch:{ all -> 0x00ff }
            r7 = r6;	 Catch:{ all -> 0x00ff }
            r7 = (defpackage.oho) r7;	 Catch:{ all -> 0x00ff }
            r7 = r7.a();	 Catch:{ all -> 0x00ff }
            r7 = defpackage.akcr.a(r7, r4);	 Catch:{ all -> 0x00ff }
            if (r7 == 0) goto L_0x0059;	 Catch:{ all -> 0x00ff }
            r5.add(r6);	 Catch:{ all -> 0x00ff }
            goto L_0x0059;	 Catch:{ all -> 0x00ff }
            r5 = (java.util.List) r5;	 Catch:{ all -> 0x00ff }
            r5 = (java.lang.Iterable) r5;	 Catch:{ all -> 0x00ff }
            r3 = new java.util.ArrayList;	 Catch:{ all -> 0x00ff }
            r4 = 10;	 Catch:{ all -> 0x00ff }
            r4 = defpackage.ajyn.a(r5, r4);	 Catch:{ all -> 0x00ff }
            r3.<init>(r4);	 Catch:{ all -> 0x00ff }
            r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x00ff }
            r4 = r5.iterator();	 Catch:{ all -> 0x00ff }
            r5 = r4.hasNext();	 Catch:{ all -> 0x00ff }
            if (r5 == 0) goto L_0x009d;	 Catch:{ all -> 0x00ff }
            r5 = r4.next();	 Catch:{ all -> 0x00ff }
            r5 = (defpackage.oho) r5;	 Catch:{ all -> 0x00ff }
            r5 = r1.a(r5);	 Catch:{ all -> 0x00ff }
            r3.add(r5);	 Catch:{ all -> 0x00ff }
            goto L_0x0089;	 Catch:{ all -> 0x00ff }
            r3 = (java.util.List) r3;	 Catch:{ all -> 0x00ff }
            r1 = new ohs;	 Catch:{ all -> 0x00ff }
            r1.<init>(r3, r2);	 Catch:{ all -> 0x00ff }
            r1 = com.google.common.base.Optional.of(r1);	 Catch:{ all -> 0x00ff }
            r2 = "Optional.of(MediaPackage…l(mediaPackages, caller))";	 Catch:{ all -> 0x00ff }
            goto L_0x003e;	 Catch:{ all -> 0x00ff }
            r2 = r1.isPresent();	 Catch:{ all -> 0x00ff }
            if (r2 == 0) goto L_0x00f8;	 Catch:{ all -> 0x00ff }
            r2 = r8.a;	 Catch:{ all -> 0x00ff }
            r3 = r1.get();	 Catch:{ all -> 0x00ff }
            r3 = (defpackage.ohs) r3;	 Catch:{ all -> 0x00ff }
            r3 = r3.b;	 Catch:{ all -> 0x00ff }
            r2.d = r3;	 Catch:{ all -> 0x00ff }
            r2 = r8.a;	 Catch:{ all -> 0x00ff }
            r2 = r2.b;	 Catch:{ all -> 0x00ff }
            r3 = r1.get();	 Catch:{ all -> 0x00ff }
            r3 = (defpackage.ohs) r3;	 Catch:{ all -> 0x00ff }
            r3 = r3.b;	 Catch:{ all -> 0x00ff }
            r4 = r1.get();	 Catch:{ all -> 0x00ff }
            r5 = "session.get()";	 Catch:{ all -> 0x00ff }
            defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x00ff }
            r2 = r2.put(r3, r4);	 Catch:{ all -> 0x00ff }
            r2 = (defpackage.ohs) r2;	 Catch:{ all -> 0x00ff }
            if (r2 != 0) goto L_0x00db;	 Catch:{ all -> 0x00ff }
            goto L_0x00fd;	 Catch:{ all -> 0x00ff }
            r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00ff }
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ff }
            r4 = "Recovered a session with id ";	 Catch:{ all -> 0x00ff }
            r3.<init>(r4);	 Catch:{ all -> 0x00ff }
            r2 = r2.b;	 Catch:{ all -> 0x00ff }
            r3.append(r2);	 Catch:{ all -> 0x00ff }
            r2 = ", but one already exists";	 Catch:{ all -> 0x00ff }
            r3.append(r2);	 Catch:{ all -> 0x00ff }
            r2 = r3.toString();	 Catch:{ all -> 0x00ff }
            r1.<init>(r2);	 Catch:{ all -> 0x00ff }
            r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x00ff }
            throw r1;	 Catch:{ all -> 0x00ff }
            r2 = r8.a;	 Catch:{ all -> 0x00ff }
            r3 = 0;	 Catch:{ all -> 0x00ff }
            r2.d = r3;	 Catch:{ all -> 0x00ff }
            monitor-exit(r0);
            return r1;
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw$t.a():com.google.common.base.Optional");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: ogw$aa */
    static final class aa<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final aa a = new aa();

        aa() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "it");
            return set;
        }
    }

    /* renamed from: ogw$ab */
    static final class ab<T, R> implements ajfc<String, ajdb> {
        private /* synthetic */ ogw a;
        private /* synthetic */ idd b;

        ab(ogw ogw, idd idd) {
            this.a = ogw;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return this.a.c(this.b, str);
        }
    }

    /* renamed from: ogw$ac */
    static final class ac implements ajev {
        private /* synthetic */ ogw a;
        private /* synthetic */ String b;

        ac(ogw ogw, String str) {
            this.a = ogw;
            this.b = str;
        }

        public final void run() {
            synchronized (this.a.a) {
                this.a.d = this.b;
            }
        }
    }

    /* renamed from: ogw$b */
    static final class b<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Set set = (Set) obj;
            akcr.b(set, "it");
            return set;
        }
    }

    /* renamed from: ogw$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ogw a;
        private /* synthetic */ String b;
        private /* synthetic */ idd c;
        private /* synthetic */ List d;

        c(ogw ogw, String str, idd idd, List list) {
            this.a = ogw;
            this.b = str;
            this.c = idd;
            this.d = list;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "sessionId");
            return this.a.a(this.c, str, this.d, false);
        }
    }

    /* renamed from: ogw$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ ogw a;
        private /* synthetic */ List b;
        private /* synthetic */ String c;
        private /* synthetic */ idd d;

        d(ogw ogw, List list, String str, idd idd) {
            this.a = ogw;
            this.b = list;
            this.c = str;
            this.d = idd;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x00a1 in {5, 7, 14, 18, 21, 24} preds:[]
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
        private defpackage.ohs a(java.util.List<com.google.common.base.Optional<defpackage.abyk>> r14) {
            /*
            r13 = this;
            r0 = "sessions";
            defpackage.akcr.b(r14, r0);
            r14 = (java.lang.Iterable) r14;
            r14 = r14.iterator();
            r0 = r14.hasNext();
            if (r0 == 0) goto L_0x002d;
            r0 = r14.next();
            r0 = (com.google.common.base.Optional) r0;
            r1 = "it";
            defpackage.akcr.a(r0, r1);
            r0 = r0.isPresent();
            if (r0 == 0) goto L_0x0023;
            goto L_0x000b;
            r14 = new java.lang.IllegalArgumentException;
            r0 = "Media package session is not active for a media package.";
            r14.<init>(r0);
            r14 = (java.lang.Throwable) r14;
            throw r14;
            r14 = r13.a;
            r14 = r14.a;
            monitor-enter(r14);
            r0 = r13.b;	 Catch:{ all -> 0x009e }
            r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x009e }
            r1 = new java.util.ArrayList;	 Catch:{ all -> 0x009e }
            r2 = 10;	 Catch:{ all -> 0x009e }
            r2 = defpackage.ajyn.a(r0, r2);	 Catch:{ all -> 0x009e }
            r1.<init>(r2);	 Catch:{ all -> 0x009e }
            r1 = (java.util.Collection) r1;	 Catch:{ all -> 0x009e }
            r0 = r0.iterator();	 Catch:{ all -> 0x009e }
            r2 = r0.hasNext();	 Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0067;	 Catch:{ all -> 0x009e }
            r2 = r0.next();	 Catch:{ all -> 0x009e }
            r3 = r2;	 Catch:{ all -> 0x009e }
            r3 = (defpackage.abyi) r3;	 Catch:{ all -> 0x009e }
            r4 = r13.c;	 Catch:{ all -> 0x009e }
            r5 = 0;	 Catch:{ all -> 0x009e }
            r6 = 0;	 Catch:{ all -> 0x009e }
            r7 = 0;	 Catch:{ all -> 0x009e }
            r8 = 0;	 Catch:{ all -> 0x009e }
            r9 = 0;	 Catch:{ all -> 0x009e }
            r10 = 0;	 Catch:{ all -> 0x009e }
            r11 = 0;	 Catch:{ all -> 0x009e }
            r12 = 254; // 0xfe float:3.56E-43 double:1.255E-321;	 Catch:{ all -> 0x009e }
            r2 = defpackage.abyi.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ all -> 0x009e }
            r1.add(r2);	 Catch:{ all -> 0x009e }
            goto L_0x0047;	 Catch:{ all -> 0x009e }
            r1 = (java.util.List) r1;	 Catch:{ all -> 0x009e }
            r0 = new ohs;	 Catch:{ all -> 0x009e }
            r2 = r13.d;	 Catch:{ all -> 0x009e }
            r0.<init>(r1, r2);	 Catch:{ all -> 0x009e }
            r1 = (java.lang.Iterable) r1;	 Catch:{ all -> 0x009e }
            r1 = r1.iterator();	 Catch:{ all -> 0x009e }
            r2 = r1.hasNext();	 Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x0093;	 Catch:{ all -> 0x009e }
            r2 = r1.next();	 Catch:{ all -> 0x009e }
            r2 = (defpackage.abyi) r2;	 Catch:{ all -> 0x009e }
            r3 = r0.a;	 Catch:{ all -> 0x009e }
            r4 = new ogv;	 Catch:{ all -> 0x009e }
            r5 = r13.d;	 Catch:{ all -> 0x009e }
            r6 = r13.a;	 Catch:{ all -> 0x009e }
            r6 = r6.g;	 Catch:{ all -> 0x009e }
            r4.<init>(r2, r5, r6);	 Catch:{ all -> 0x009e }
            r3.add(r4);	 Catch:{ all -> 0x009e }
            goto L_0x0076;	 Catch:{ all -> 0x009e }
            r1 = r13.a;	 Catch:{ all -> 0x009e }
            r1 = r1.b;	 Catch:{ all -> 0x009e }
            r2 = r13.c;	 Catch:{ all -> 0x009e }
            r1.put(r2, r0);	 Catch:{ all -> 0x009e }
            monitor-exit(r14);
            return r0;
            r0 = move-exception;
            monitor-exit(r14);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw$d.a(java.util.List):ohs");
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((List) obj);
        }
    }

    /* renamed from: ogw$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyk abyk = (abyk) obj;
            akcr.b(abyk, "it");
            return (ohs) abyk;
        }
    }

    /* renamed from: ogw$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ ogw a;
        final /* synthetic */ odz b;
        final /* synthetic */ List c;
        final /* synthetic */ List d;

        i(ogw ogw, odz odz, List list, List list2) {
            this.a = ogw;
            this.b = odz;
            this.c = list;
            this.d = list2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final ohs ohs = (ohs) obj;
            akcr.b(ohs, "newSession");
            ogw ogw = this.a;
            for (abyi b : ohs.c()) {
                ogw.b(b);
            }
            return ((ohj) this.a.l.get()).a().runInTransaction("MediaPackageManagerImpl:createdPersistedMediaPackageSession", new akbl<ainf.a, ajxw>(this) {
                private /* synthetic */ i a;

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((ainf.a) obj, "tx");
                    ohj ohj = (ohj) this.a.a.l.get();
                    Object obj2 = ohs;
                    akcr.a(obj2, "newSession");
                    odz odz = this.a.b;
                    akcr.b(obj2, "session");
                    akcr.b(odz, "state");
                    for (abyi abyi : obj2.c()) {
                        if (akcr.a(obj2.b, abyi.a)) {
                            ohj.a(abyi, odz);
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                    List list = this.a.c;
                    if (list != null) {
                        Iterable iterable = this.a.d;
                        Collection arrayList = new ArrayList(ajyn.a(iterable, 10));
                        int i = 0;
                        for (Object next : iterable) {
                            int i2 = i + 1;
                            if (i < 0) {
                                ajym.a();
                            }
                            ogw.a(this.a.a, ((abyi) next).a, (abym) list.get(i), i);
                            arrayList.add(ajxw.a);
                            i = i2;
                        }
                    }
                    return ajxw.a;
                }
            }).a((ajfb) new ajfb<Throwable>(this) {
                private /* synthetic */ i a;

                public final /* synthetic */ void accept(Object obj) {
                    ogw ogw = this.a.a;
                    Object obj2 = ohs;
                    akcr.a(obj2, "newSession");
                    ogw.a(ogw, (abyk) obj2);
                }
            }).c((Callable) new Callable<ohs>() {
                public final /* bridge */ /* synthetic */ Object call() {
                    return ohs;
                }
            });
        }
    }

    /* renamed from: ogw$m */
    static final class m<T, R> implements ajfc<T, R> {
        final /* synthetic */ ogw a;
        final /* synthetic */ abyi b;
        final /* synthetic */ idd c;

        /* renamed from: ogw$m$a */
        static final class a<T> implements ajwy<oha> {
            private /* synthetic */ m a;

            a(m mVar) {
                this.a = mVar;
            }

            public final /* synthetic */ Object get() {
                idd idd = this.a.c;
                abyi abyi = this.a.b;
                ajdw ajdw = this.a.a.k;
                Object obj = this.a.a.i.get();
                akcr.a(obj, "serializationHelper.get()");
                return new ogu(idd, abyi, ajdw, (iha) obj, this.a.a);
            }
        }

        m(ogw ogw, abyi abyi, idd idd) {
            this.a = ogw;
            this.b = abyi;
            this.c = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            if (optional.isPresent()) {
                abmr.a("Can't create media package builder on the UI thread.");
                return new ogt(this.c, new a(this), this.a);
            }
            throw new IllegalArgumentException("Media package session is not found for this media package", (Throwable) this.a.c.get(this.b.a));
        }
    }

    /* renamed from: ogw$o */
    static final class o<T, R> implements ajfc<T, ajdn<? extends R>> {
        public static final o a = new o();

        o() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "compositeUri");
            return optional.isPresent() ? ajdj.b(optional.get()) : ajvo.a(ajlu.a);
        }
    }

    /* renamed from: ogw$p */
    static final class p<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ ogw a;
        private /* synthetic */ Uri b;
        private /* synthetic */ idd c;

        /* renamed from: ogw$p$1 */
        static final class 1<T, R> implements ajfc<T, ajdn<? extends R>> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                final Optional optional = (Optional) obj;
                akcr.b(optional, "it");
                return ajdj.b((Callable) new Callable<T>() {
                    public final /* synthetic */ Object call() {
                        return (abyk) optional.get();
                    }
                });
            }
        }

        p(ogw ogw, Uri uri, idd idd) {
            this.a = ogw;
            this.b = uri;
            this.c = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, "compositeUri");
            if (((UriMatcher) this.a.f.b()).match(uri) == -1) {
                StringBuilder stringBuilder = new StringBuilder("Unexpected uri:");
                stringBuilder.append(this.b);
                return ajdj.b((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            }
            String str = (String) uri.getPathSegments().get(1);
            obj = uri.getPathSegments().get(3);
            akcr.a(obj, "compositeUri.pathSegments[3]");
            final int parseInt = Integer.parseInt((String) obj);
            ogw ogw = this.a;
            idd idd = this.c;
            akcr.a((Object) str, "sessionId");
            return ogw.b(idd, str).b((ajfc) 1.a).f(new ajfc<T, R>() {
                public final /* synthetic */ Object apply(Object obj) {
                    abyk abyk = (abyk) obj;
                    akcr.b(abyk, "mediaPackageSession");
                    return (abyi) abyk.c().get(parseInt);
                }
            });
        }
    }

    /* renamed from: ogw$q */
    static final class q<T> implements ajfb<Throwable> {
        private /* synthetic */ Uri a;
        private /* synthetic */ idd b;

        q(Uri uri, idd idd) {
            this.a = uri;
            this.b = idd;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ogw$v */
    static final class v<T> implements ajfb<Throwable> {
        private /* synthetic */ ogw a;
        private /* synthetic */ abyi b;

        v(ogw ogw, abyi abyi) {
            this.a = ogw;
            this.b = abyi;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c(this.b);
        }
    }

    /* renamed from: ogw$w */
    static final class w<T, R> implements ajfc<Optional<abyk>, ajdb> {
        final /* synthetic */ ogw a;
        final /* synthetic */ int b;
        final /* synthetic */ abym c;
        private /* synthetic */ String d;

        /* renamed from: ogw$w$a */
        static final class a extends akcs implements akbl<defpackage.ainf.a, ajxw> {
            private /* synthetic */ abyk a;
            private /* synthetic */ w b;

            a(abyk abyk, w wVar) {
                this.a = abyk;
                this.b = wVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((defpackage.ainf.a) obj, "tx");
                ogw.a(this.b.a, ((abyi) this.a.c().get(this.b.b)).a, this.b.c, this.b.b);
                return ajxw.a;
            }
        }

        w(ogw ogw, int i, abym abym, String str) {
            this.a = ogw;
            this.b = i;
            this.c = abym;
            this.d = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "optionalMediaSession");
            abyk abyk = (abyk) optional.orNull();
            if (abyk != null) {
                ajcx runInTransaction = ((ohj) this.a.l.get()).a().runInTransaction("MediaPackageManagerImpl:registerMediaPackageLookupUri", new a(abyk, this));
                if (runInTransaction != null) {
                    return runInTransaction;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Invalid sessionId=");
            stringBuilder.append(this.d);
            return ajcx.b((Throwable) new IllegalArgumentException(stringBuilder.toString()));
        }
    }

    /* renamed from: ogw$x */
    static final class x implements ajev {
        private /* synthetic */ ogw a;

        x(ogw ogw) {
            this.a = ogw;
        }

        public final void run() {
            synchronized (this.a.a) {
                ogw.a(this.a);
            }
            this.a.g.b(ajzs.a(this.a.h));
        }
    }

    /* renamed from: ogw$y */
    static final class y implements ajev {
        private /* synthetic */ ogw a;

        y(ogw ogw) {
            this.a = ogw;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0033 in {6, 9, 12} preds:[]
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
        public final void run() {
            /*
            r5 = this;
            r0 = r5.a;
            r0 = r0.a;
            monitor-enter(r0);
            r1 = r5.a;	 Catch:{ all -> 0x0030 }
            r1 = r1.b;	 Catch:{ all -> 0x0030 }
            r1 = r1.values();	 Catch:{ all -> 0x0030 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0030 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0029;	 Catch:{ all -> 0x0030 }
            r2 = r1.next();	 Catch:{ all -> 0x0030 }
            r2 = (defpackage.ohs) r2;	 Catch:{ all -> 0x0030 }
            r3 = r5.a;	 Catch:{ all -> 0x0030 }
            r4 = r2;	 Catch:{ all -> 0x0030 }
            r4 = (defpackage.abyk) r4;	 Catch:{ all -> 0x0030 }
            defpackage.ogw.a(r3, r4);	 Catch:{ all -> 0x0030 }
            r2.m();	 Catch:{ all -> 0x0030 }
            goto L_0x0011;	 Catch:{ all -> 0x0030 }
            r1 = r5.a;	 Catch:{ all -> 0x0030 }
            defpackage.ogw.a(r1);	 Catch:{ all -> 0x0030 }
            monitor-exit(r0);
            return;
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw$y.run():void");
        }
    }

    /* renamed from: ogw$z */
    static final class z<T, R> implements ajfc<Optional<abyk>, ajdb> {
        final /* synthetic */ ogw a;
        final /* synthetic */ String b;
        final /* synthetic */ idd c;

        z(ogw ogw, String str, idd idd) {
            this.a = ogw;
            this.b = str;
            this.c = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final Optional optional = (Optional) obj;
            akcr.b(optional, "activeSession");
            return ((ohj) this.a.l.get()).a().runInTransaction("MediaPackageManagerImpl:releaseMediaPackageSession", new akbl<ainf.a, ajxw>(this) {
                private /* synthetic */ z a;

                public final /* synthetic */ Object invoke(Object obj) {
                    akcr.b((ainf.a) obj, "it");
                    ohj ohj = (ohj) this.a.a.l.get();
                    String str = this.a.b;
                    akcr.b(str, "sessionId");
                    ohj.b().b().b(str);
                    ohj.b().a().b(str);
                    int changedRowCount = ohj.a().getChangedRowCount();
                    Object obj2 = optional;
                    akcr.a(obj2, "activeSession");
                    if (obj2.isPresent()) {
                        synchronized (this.a.a.a) {
                            StringBuilder stringBuilder = new StringBuilder("releaseMediaPackageSession by ");
                            stringBuilder.append(this.a.c);
                            this.a.a.c.put(this.a.b, new Throwable(stringBuilder.toString()));
                            ohs ohs = (ohs) this.a.a.b.remove(this.a.b);
                            if (akcr.a(this.a.a.d, this.a.b)) {
                                this.a.a.d = null;
                            }
                            if (changedRowCount > 0 && ohs != null) {
                                try {
                                    ogw.a(this.a.a, (abyk) ohs);
                                } catch (Throwable th) {
                                    if (ohs != null) {
                                        ohs.m();
                                    }
                                }
                            }
                            if (ohs != null) {
                                ohs.m();
                            }
                        }
                    }
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: ogw$l */
    static final class l extends akcs implements akbl<abyk, ajcx> {
        private /* synthetic */ ogw a;
        private /* synthetic */ idd b;

        l(ogw ogw, idd idd) {
            this.a = ogw;
            this.b = idd;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            abyk abyk = (abyk) obj;
            akcr.b(abyk, "it");
            return this.a.a(abyk.b(), this.b.a("setSoleRecoverableSession"));
        }
    }

    /* renamed from: ogw$u */
    static final class u extends akcs implements akbl<ainf.a, ajxw> {
        private /* synthetic */ ogw a;
        private /* synthetic */ abyi b;

        u(ogw ogw, abyi abyi) {
            this.a = ogw;
            this.b = abyi;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((ainf.a) obj, "tx");
            ((ohj) this.a.l.get()).a(this.b, odz.RECOVERABLE);
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ogw.class), "compositeUriMatcher", "getCompositeUriMatcher()Landroid/content/UriMatcher;");
        a aVar = new a();
    }

    public ogw(Context context, ygi ygi, ohr ohr, aipn<iha> aipn, aipn<oec> aipn2, ajdw ajdw, aipn<ohj> aipn3) {
        akcr.b(context, "context");
        akcr.b(ygi, "fileManager");
        akcr.b(ohr, "mediaPackageManagerFileGroup");
        akcr.b(aipn, "serializationHelper");
        akcr.b(aipn2, "overlayBlobConverter");
        akcr.b(ajdw, "asyncWritesScheduler");
        akcr.b(aipn3, "mediaPackageRepository");
        this.n = context;
        this.g = ygi;
        this.h = ohr;
        this.i = aipn;
        this.j = aipn2;
        this.k = ajdw;
        this.l = aipn3;
    }

    private final ajdx<abyk> a(idd idd, List<abyi> list, odz odz, List<abym> list2) {
        Object a = a(idd, (List) list).f(h.a).a((ajfc) new i(this, odz, null, list));
        akcr.a(a, "cloneMediaPackageSession…      }\n                }");
        return a;
    }

    public final ajcx a() {
        Object b;
        String str;
        if (this.g.b()) {
            ohj ohj = (ohj) this.l.get();
            b = ohj.b.reset(ohj.a, null).b((ajev) new y(this));
            str = "mediaPackageRepository.g…      }\n                }";
        } else {
            b = ajcx.a((ajev) new x(this));
            str = "Completable.fromAction{\n…FileGroup))\n            }";
        }
        akcr.a(b, str);
        return b;
    }

    /* JADX WARNING: Missing block: B:6:0x0023, code skipped:
            if (r5 == null) goto L_0x0025;
     */
    public final defpackage.ajcx a(defpackage.abyi r5) {
        /*
        r4 = this;
        r0 = "mediaPackage";
        defpackage.akcr.b(r5, r0);
        r0 = r4.a;
        monitor-enter(r0);
        r1 = r4.e;	 Catch:{ all -> 0x0032 }
        r2 = r5.b;	 Catch:{ all -> 0x0032 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0032 }
        r1 = (defpackage.oha) r1;	 Catch:{ all -> 0x0032 }
        if (r1 == 0) goto L_0x0025;
    L_0x0014:
        r2 = r1.f;	 Catch:{ all -> 0x0032 }
        r2 = (defpackage.ajcx) r2;	 Catch:{ all -> 0x0032 }
        r3 = new ogw$n;	 Catch:{ all -> 0x0032 }
        r3.<init>(r1, r4, r5);	 Catch:{ all -> 0x0032 }
        r3 = (defpackage.ajev) r3;	 Catch:{ all -> 0x0032 }
        r5 = r2.f(r3);	 Catch:{ all -> 0x0032 }
        if (r5 != 0) goto L_0x0030;
    L_0x0025:
        r5 = defpackage.ajhn.a;	 Catch:{ all -> 0x0032 }
        r5 = defpackage.ajvo.a(r5);	 Catch:{ all -> 0x0032 }
        r1 = "Completable.complete()";
        defpackage.akcr.a(r5, r1);	 Catch:{ all -> 0x0032 }
    L_0x0030:
        monitor-exit(r0);
        return r5;
    L_0x0032:
        r5 = move-exception;
        monitor-exit(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw.a(abyi):ajcx");
    }

    public final ajcx a(idd idd, String str, abym abym, int i) {
        akcr.b(idd, "caller");
        akcr.b(str, "sessionId");
        akcr.b(abym, "lookupUris");
        Object e = b(idd, str).e((ajfc) new w(this, i, abym, str));
        akcr.a(e, "lookupMediaPackageSessio…d=$sessionId\"))\n        }");
        return e;
    }

    public final ajcx a(String str, idd idd) {
        akcr.b(str, "sessionId");
        akcr.b(idd, "caller");
        ajcx a = ajcx.a((ajev) new ac(this, str));
        Iterable<oho> c = ((ohj) this.l.get()).c();
        Collection arrayList = new ArrayList(ajyn.a((Iterable) c, 10));
        for (oho a2 : c) {
            arrayList.add(a2.a());
        }
        Iterable o = ajyu.o((List) arrayList);
        arrayList = new ArrayList();
        for (Object next : o) {
            if ((akcr.a((String) next, (Object) str) ^ 1) != 0) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (String c2 : iterable) {
            arrayList2.add(c(idd, c2));
        }
        Object b = a.b((ajdb) ajcx.b((Iterable) (List) arrayList2));
        akcr.a(b, "Completable.fromAction {…(it) }\n\n                )");
        return b;
    }

    public final ajdj<abyi> a(Uri uri, idd idd) {
        akcr.b(uri, "lookupUri");
        akcr.b(idd, "caller");
        Object b = a(uri).b((ajfc) o.a).a((ajfc) new p(this, uri, idd)).a((ajfb) new q(uri, idd)).b(ajfu.g);
        akcr.a(b, "this.lookupMediaPackageU…       .onErrorComplete()");
        return b;
    }

    public final ajdx<Optional<Uri>> a(Uri uri) {
        akcr.b(uri, "lookupUri");
        Object c = ajdx.c((Callable) new s(this, uri));
        akcr.a(c, "Single.fromCallable { me…iaPackageUri(lookupUri) }");
        return c;
    }

    public final ajdx<odt> a(idd idd) {
        String str = "caller";
        akcr.b(idd, str);
        akcr.b(idd, str);
        return a(idd, odv.a());
    }

    public final ajdx<odt> a(idd idd, abyi abyi) {
        akcr.b(idd, "caller");
        akcr.b(abyi, "mediaPackage");
        Object f = b(idd, abyi.a).f(new m(this, abyi, idd));
        akcr.a(f, "lookupMediaPackageSessio…Provider, this)\n        }");
        return f;
    }

    public final ajdx<List<abyi>> a(idd idd, abyi abyi, int i) {
        akcr.b(idd, "caller");
        akcr.b(abyi, "mediaPackage");
        return a(idd, abyi, ajyl.a(Integer.valueOf(i)));
    }

    public final ajdx<List<abyi>> a(idd idd, abyi abyi, List<Integer> list) {
        akcr.b(idd, "caller");
        akcr.b(abyi, "mediaPackage");
        akcr.b(list, "splitOffsets");
        Object c = ajdx.c((Callable) new ad(abyi, list));
        akcr.a(c, "Single.fromCallable {\n  …     outputList\n        }");
        return c;
    }

    public final ajdx<odt> a(idd idd, String str) {
        akcr.b(idd, "caller");
        akcr.b(str, "mediaId");
        Object c = ajdx.c((Callable) new j(this, idd, str));
        akcr.a(c, "Single.fromCallable {\n  …aPackageBuilder\n        }");
        return c;
    }

    public final ajdx<Optional<abyk>> a(idd idd, String str, List<abyi> list, boolean z) {
        akcr.b(idd, "caller");
        akcr.b(str, "sessionId");
        akcr.b(list, "mediaPackages");
        Object c = ajdx.c((Callable) new r(this, str, idd, z, list));
        akcr.a(c, "Single.fromCallable {\n  …}\n            }\n        }");
        return c;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0080 in {5, 7, 9} preds:[]
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
    public final defpackage.ajdx<defpackage.abyk> a(defpackage.idd r5, java.util.List<defpackage.abyi> r6) {
        /*
        r4 = this;
        r0 = "caller";
        defpackage.akcr.b(r5, r0);
        r0 = "mediaPackages";
        defpackage.akcr.b(r6, r0);
        r0 = r6.isEmpty();
        r0 = r0 ^ 1;
        if (r0 == 0) goto L_0x0072;
        r0 = defpackage.odv.a();
        r1 = r6;
        r1 = (java.lang.Iterable) r1;
        r2 = new java.util.ArrayList;
        r3 = 10;
        r3 = defpackage.ajyn.a(r1, r3);
        r2.<init>(r3);
        r2 = (java.util.Collection) r2;
        r1 = r1.iterator();
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x003c;
        r3 = r1.next();
        r3 = (defpackage.abyi) r3;
        r3 = r3.a;
        r2.add(r3);
        goto L_0x002a;
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r1 = defpackage.ajyu.m(r2);
        r1 = defpackage.ajdp.b(r1);
        r2 = defpackage.ogw.b.a;
        r2 = (defpackage.ajfc) r2;
        r1 = r1.l(r2);
        r2 = new ogw$c;
        r2.<init>(r4, r0, r5, r6);
        r2 = (defpackage.ajfc) r2;
        r1 = r1.n(r2);
        r2 = 16;
        r1 = r1.a(r2);
        r2 = new ogw$d;
        r2.<init>(r4, r6, r0, r5);
        r2 = (defpackage.ajfc) r2;
        r5 = r1.f(r2);
        r6 = "Observable.just(mediaPac…      }\n                }";
        defpackage.akcr.a(r5, r6);
        return r5;
        r5 = new java.lang.IllegalStateException;
        r6 = "Media package session requires at least one media package";
        r6 = r6.toString();
        r5.<init>(r6);
        r5 = (java.lang.Throwable) r5;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogw.a(idd, java.util.List):ajdx");
    }

    public final ajdx<odt> a(idd idd, kaz<jwj> kaz) {
        akcr.b(idd, "caller");
        akcr.b(kaz, "bitmap");
        Object c = ajdx.c((Callable) new k(this, idd, kaz));
        akcr.a(c, "Single.fromCallable {\n  …Provider, this)\n        }");
        return c;
    }

    public final void a(boolean z) {
        ygi ygi = this.g;
        Object[] objArr = new ygh[1];
        ohr ohr = this.h;
        if (ohr != null) {
            objArr[0] = ohr;
            ygi.a((Set) Sets.newHashSet(objArr), z);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.storage.filemanager.FileGroup");
    }

    public final ajdx<Optional<? extends abyk>> b(idd idd) {
        akcr.b(idd, "caller");
        Object c = ajdx.c((Callable) new t(this, idd));
        akcr.a(c, "Single.fromCallable {\n  …n\n            }\n        }");
        return c;
    }

    public final ajdx<List<abyi>> b(idd idd, abyi abyi) {
        String str = "caller";
        akcr.b(idd, str);
        String str2 = "mediaPackage";
        akcr.b(abyi, str2);
        akcr.b(idd, str);
        akcr.b(abyi, str2);
        return a(idd, abyi, odu.a.a(abyi.a().b));
    }

    public final ajdx<Optional<abyk>> b(idd idd, String str) {
        akcr.b(idd, "caller");
        akcr.b(str, "sessionId");
        return a(idd, str, (List) ajyw.a, false);
    }

    public final ajdx<abyk> b(idd idd, List<abyi> list) {
        akcr.b(idd, "caller");
        akcr.b(list, "mediaPackages");
        return a(idd, (List) list, odz.PERSISTED, null);
    }

    public final void b(abyi abyi) {
        akcr.b(abyi, "mediaPackage");
        this.g.h(ohq.MEDIA, abyi.d);
        this.g.h(ohq.OVERLAY, abyi.c);
        this.g.h(ohq.EDITS, abyi.c);
    }

    public final ajcx c(idd idd, String str) {
        akcr.b(idd, "caller");
        akcr.b(str, "sessionId");
        Object e = b(idd, str).e((ajfc) new z(this, str, idd));
        akcr.a(e, "lookupMediaPackageSessio…      }\n                }");
        return e;
    }

    public final ajdx<odx> c(idd idd, abyi abyi) {
        akcr.b(idd, "caller");
        akcr.b(abyi, "mediaPackage");
        Object a = ajdx.c((Callable) new f(abyi)).a((ajfc) new g(this, idd));
        akcr.a(a, "Single.fromCallable {\n  …geManagerImpl))\n        }");
        return a;
    }

    public final ajdx<abyk> c(idd idd, List<abyi> list) {
        akcr.b(idd, "caller");
        akcr.b(list, "mediaPackages");
        return igs.a(a(idd, (List) list, odz.RECOVERABLE, null), (akbl) new l(this, idd));
    }

    /* Access modifiers changed, original: final */
    public final void c(abyi abyi) {
        this.g.i(ohq.MEDIA, abyi.d);
        this.g.i(ohq.OVERLAY, abyi.c);
        this.g.i(ohq.EDITS, abyi.c);
    }

    public final ajcx d(idd idd, List<abyi> list) {
        akcr.b(idd, "caller");
        akcr.b(list, "mediaPackages");
        Iterable<abyi> iterable = list;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (abyi abyi : iterable) {
            arrayList.add(abyi.a);
        }
        Object a = ajdp.b(ajyu.m((List) arrayList)).l(aa.a).a((ajfc) new ab(this, idd), false);
        akcr.a(a, "Observable.just(mediaPac…kageSession(caller, it) }");
        return a;
    }

    public final void e(idd idd, List<abyi> list) {
        akcr.b(idd, "caller");
        akcr.b(list, "mediaPackages");
        ajcx a = d(idd, list).b(this.k).a(ajfu.g);
        akcr.a((Object) a, "releaseMediaPackages(cal…       .onErrorComplete()");
        igh.a(a, (ajfo) this.m).e();
    }
}

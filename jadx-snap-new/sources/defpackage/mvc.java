package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import defpackage.miq.e;
import defpackage.muo.a;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: mvc */
public abstract class mvc {

    /* renamed from: mvc$d */
    public interface d {
        ide a();

        zgb b();

        Context c();

        kqf d();

        Supplier<iha> e();
    }

    /* renamed from: mvc$a */
    public static abstract class a {
        public final ArrayList<akca<Context, zfw, Gson, mwe>> j = new ArrayList();

        /* renamed from: mvc$a$b */
        static final class b extends akcs implements akca<Context, zfw, Gson, mwe> {
            private /* synthetic */ mwe a;

            b(mwe mwe) {
                this.a = mwe;
                super(3);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                zfw zfw = (zfw) obj2;
                Gson gson = (Gson) obj3;
                akcr.b((Context) obj, "<anonymous parameter 0>");
                akcr.b(zfw, "<anonymous parameter 1>");
                akcr.b(gson, "<anonymous parameter 2>");
                return this.a;
            }
        }

        /* renamed from: mvc$a$a */
        static final class a extends akcs implements akca<Context, zfw, Gson, mwe> {
            private /* synthetic */ String a;
            private /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
                super(3);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                Context context = (Context) obj;
                zfw zfw = (zfw) obj2;
                Gson gson = (Gson) obj3;
                String str = "context";
                akcr.b(context, str);
                String str2 = "qualifiedSchedulers";
                akcr.b(zfw, str2);
                akcr.b(gson, "gson");
                String str3 = this.a;
                String str4 = this.b;
                akcr.b(context, str);
                akcr.b(str3, "lensesListJsonAssetPath");
                akcr.b(str4, "lensContentDirectoryAssetPath");
                akcr.b(zfw, str2);
                akbl mty = new mty(str4);
                akbl mwo = new mwo(context, "drawable");
                obj = context.getAssets();
                akcr.a(obj, "context.assets");
                return new mtz(mty, mwo, new mub(obj, str3), zfw, gson);
            }
        }

        public abstract a a(Gson gson);

        public final a a(String str, String str2) {
            akcr.b(str, "lensesListJsonPath");
            akcr.b(str2, "lensesContentDirectoryPath");
            a aVar = this;
            aVar.j.add(new a(str, str2));
            return aVar;
        }

        public abstract a a(Collection<? extends akca<? super Context, ? super zfw, ? super Gson, ? extends mwe>> collection);

        public abstract a a(mof mof);

        public abstract a a(mok<? super moc> mok);

        public abstract a a(d dVar);

        public final a a(mwe mwe) {
            akcr.b(mwe, "lensRepository");
            a aVar = this;
            aVar.j.add(new b(mwe));
            return aVar;
        }

        public abstract a a(mwp mwp);

        public abstract a a(mxa mxa);

        public abstract a a(boolean z);

        public abstract mvc a();

        public abstract a b();
    }

    /* renamed from: mvc$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mvc$c */
    public static final class c {

        /* renamed from: mvc$c$a */
        static final class a<T> implements Supplier<T> {
            private /* synthetic */ Context a;

            a(Context context) {
                this.a = context;
            }

            public final /* synthetic */ Object get() {
                File cacheDir = this.a.getCacheDir();
                akcr.a((Object) cacheDir, "context.cacheDir");
                return mhr.a(cacheDir, "lens");
            }
        }

        /* renamed from: mvc$c$b */
        public static final class b implements mvr {
            private /* synthetic */ HashFunction a;
            private /* synthetic */ Supplier b;

            b(HashFunction hashFunction, Supplier supplier) {
                this.a = hashFunction;
                this.b = supplier;
            }

            public final File a(mux mux) {
                akcr.b(mux, "lens");
                abmr.a("LensContentCacheResolver#transform must not be called on the main thread");
                miq miq = mux.b;
                if (miq instanceof e) {
                    return new File((File) this.b.get(), this.a.hashString(((e) miq).a(), Charset.defaultCharset()).toString());
                }
                throw new RuntimeException("Lens with empty content Uri is not supported");
            }
        }

        /* renamed from: mvc$c$d */
        static final class d extends akcq implements akbl<muo, ajxw> {
            d(ajws ajws) {
                super(1, ajws);
            }

            public final String getName() {
                return "onNext";
            }

            public final akej getOwner() {
                return akde.a(ajws.class);
            }

            public final String getSignature() {
                return "onNext(Ljava/lang/Object;)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                muo muo = (muo) obj;
                akcr.b(muo, "p1");
                ((ajws) this.receiver).a((Object) muo);
                return ajxw.a;
            }
        }

        /* renamed from: mvc$c$e */
        public static final class e implements mxa {
            private /* synthetic */ akwt a;

            e(akwt akwt) {
                this.a = akwt;
            }

            public final <T> T a(Class<T> cls) {
                akcr.b(cls, "t");
                return this.a.a((Class) cls);
            }
        }

        /* renamed from: mvc$c$c */
        static final class c extends akcs implements akbk<mvz> {
            private /* synthetic */ zfw a;
            private /* synthetic */ zgb b;
            private /* synthetic */ ide c;
            private /* synthetic */ boolean d;
            private /* synthetic */ mvr e;
            private /* synthetic */ mwc f;
            private /* synthetic */ mok g;
            private /* synthetic */ ajdp h;

            c(zfw zfw, zgb zgb, ide ide, boolean z, mvr mvr, mwc mwc, mok mok, ajdp ajdp) {
                this.a = zfw;
                this.b = zgb;
                this.c = ide;
                this.d = z;
                this.e = mvr;
                this.f = mwc;
                this.g = mok;
                this.h = ajdp;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new mvz(this.e, this.a, this.f);
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdp<muo> a(ajws<muo> ajws) {
            akcr.b(ajws, "lensDownloadPrioritySubject");
            return ajws;
        }

        public static final ajws<muo> a() {
            Object r = ajwl.i(a.a).r();
            akcr.a(r, "BehaviorSubject.createDe…y.Default).toSerialized()");
            return r;
        }

        public static final Supplier<File> a(Context context) {
            akcr.b(context, "context");
            Object memoize = Suppliers.memoize(new a(context));
            akcr.a(memoize, "Suppliers.memoize { cont….cacheDir.child(\"lens\") }");
            return memoize;
        }

        public static final Gson a(Gson gson) {
            return gson == null ? new GsonBuilder().create() : gson;
        }

        public static final Set<mwe> a(Context context, ide ide, zgb zgb, Gson gson, Collection<? extends akca<? super Context, ? super zfw, ? super Gson, ? extends mwe>> collection) {
            akcr.b(context, "applicationContext");
            akcr.b(ide, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            akcr.b(gson, "gson");
            akcr.b(collection, "lensRepositoryFactories");
            if (collection.isEmpty()) {
                Object emptySet = Collections.emptySet();
                akcr.a(emptySet, "emptySet()");
                return emptySet;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (akca invoke : collection) {
                linkedHashSet.add(invoke.invoke(context, zgb.a(ide.callsite("lensRepositoryFactory")), gson));
            }
            return linkedHashSet;
        }

        public static final mvr a(Supplier<File> supplier) {
            akcr.b(supplier, "cacheDir");
            return new b(Hashing.murmur3_32(), supplier);
        }

        public static final mvu a(mof mof, Supplier<iha> supplier, ide ide, zgb zgb) {
            akcr.b(mof, "resourceResolverFactory");
            akcr.b(supplier, "serializationHelperSupplier");
            akcr.b(ide, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            return new mui(mof, supplier, zgb.a(ide.callsite("DefaultLensContentInfoProvider")));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x009e in {4, 7, 8, 10} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public static final defpackage.mvv a(defpackage.ide r11, defpackage.zgb r12, defpackage.mvr r13, defpackage.mwc r14, defpackage.mok<? super defpackage.moc> r15, defpackage.ajdp<defpackage.muo> r16, boolean r17) {
            /*
            r0 = r11;
            r8 = r15;
            r9 = r16;
            r1 = "attributedFeature";
            defpackage.akcr.b(r11, r1);
            r1 = "schedulersProvider";
            r3 = r12;
            defpackage.akcr.b(r12, r1);
            r1 = "cacheResolver";
            r6 = r13;
            defpackage.akcr.b(r13, r1);
            r1 = "lensDownloader";
            r7 = r14;
            defpackage.akcr.b(r14, r1);
            r1 = "resourceUriResolver";
            defpackage.akcr.b(r15, r1);
            r1 = "downloadPriority";
            defpackage.akcr.b(r9, r1);
            r1 = "LensContentTransformer";	 Catch:{ all -> 0x009c }
            r1 = r11.callsite(r1);	 Catch:{ all -> 0x009c }
            r2 = defpackage.zgb.a(r1);	 Catch:{ all -> 0x009c }
            if (r17 == 0) goto L_0x0053;	 Catch:{ all -> 0x009c }
            r10 = new mvc$c$c;	 Catch:{ all -> 0x009c }
            r1 = r10;	 Catch:{ all -> 0x009c }
            r3 = r12;	 Catch:{ all -> 0x009c }
            r4 = r11;	 Catch:{ all -> 0x009c }
            r5 = r17;	 Catch:{ all -> 0x009c }
            r6 = r13;	 Catch:{ all -> 0x009c }
            r7 = r14;	 Catch:{ all -> 0x009c }
            r8 = r15;	 Catch:{ all -> 0x009c }
            r9 = r16;	 Catch:{ all -> 0x009c }
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x009c }
            r10 = (defpackage.akbk) r10;	 Catch:{ all -> 0x009c }
            r0 = "receiver$0";	 Catch:{ all -> 0x009c }
            defpackage.akcr.b(r10, r0);	 Catch:{ all -> 0x009c }
            r0 = defpackage.ajxh.a(r10);	 Catch:{ all -> 0x009c }
            r1 = new mvw$a;	 Catch:{ all -> 0x009c }
            r1.<init>(r0);	 Catch:{ all -> 0x009c }
            r1 = (defpackage.mvv) r1;	 Catch:{ all -> 0x009c }
            goto L_0x009b;	 Catch:{ all -> 0x009c }
            r1 = new mwm;	 Catch:{ all -> 0x009c }
            r2 = defpackage.muf.a;	 Catch:{ all -> 0x009c }
            r2 = (defpackage.mwh) r2;	 Catch:{ all -> 0x009c }
            r3 = "PriorityContentTransformer";	 Catch:{ all -> 0x009c }
            r0 = r11.callsite(r3);	 Catch:{ all -> 0x009c }
            r0 = defpackage.zgb.a(r0);	 Catch:{ all -> 0x009c }
            r1.<init>(r15, r2, r9, r0);	 Catch:{ all -> 0x009c }
            r0 = new mwn;	 Catch:{ all -> 0x009c }
            r2 = defpackage.mwl.a;	 Catch:{ all -> 0x009c }
            r2 = (defpackage.mwh) r2;	 Catch:{ all -> 0x009c }
            r0.<init>(r15, r2);	 Catch:{ all -> 0x009c }
            r2 = new mun;	 Catch:{ all -> 0x009c }
            r3 = defpackage.mur.a;	 Catch:{ all -> 0x009c }
            r3 = (defpackage.mwh) r3;	 Catch:{ all -> 0x009c }
            r2.<init>(r15, r3);	 Catch:{ all -> 0x009c }
            r3 = 3;	 Catch:{ all -> 0x009c }
            r3 = new defpackage.mvv[r3];	 Catch:{ all -> 0x009c }
            r4 = 0;	 Catch:{ all -> 0x009c }
            r2 = (defpackage.mvv) r2;	 Catch:{ all -> 0x009c }
            r3[r4] = r2;	 Catch:{ all -> 0x009c }
            r2 = 1;	 Catch:{ all -> 0x009c }
            r1 = (defpackage.mvv) r1;	 Catch:{ all -> 0x009c }
            r3[r2] = r1;	 Catch:{ all -> 0x009c }
            r1 = 2;	 Catch:{ all -> 0x009c }
            r0 = (defpackage.mvv) r0;	 Catch:{ all -> 0x009c }
            r3[r1] = r0;	 Catch:{ all -> 0x009c }
            r0 = defpackage.ajzt.d(r3);	 Catch:{ all -> 0x009c }
            r0 = (java.util.Set) r0;	 Catch:{ all -> 0x009c }
            r1 = "contentTransformers";	 Catch:{ all -> 0x009c }
            defpackage.akcr.b(r0, r1);	 Catch:{ all -> 0x009c }
            r1 = new mvx$a;	 Catch:{ all -> 0x009c }
            r1.<init>(r0);	 Catch:{ all -> 0x009c }
            goto L_0x0050;
            return r1;
            r0 = move-exception;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mvc$c.a(ide, zgb, mvr, mwc, mok, ajdp, boolean):mvv");
        }

        public static final mwa a(mok<? super moc> mok, ide ide, zgb zgb) {
            akcr.b(mok, "resourceUriResolver");
            akcr.b(ide, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            return new muk(mok, zgb.a(ide.callsite("DefaultLensDownloadStatusProvider")));
        }

        public static final mwc a(mvr mvr, mxa mxa, ide ide, zgb zgb, kqf kqf, mwp mwp) {
            akcr.b(mvr, "cacheResolver");
            akcr.b(mxa, "remoteServiceFactory");
            akcr.b(ide, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            akcr.b(kqf, "analyticsEventHandler");
            akcr.b(mwp, "signatureValidator");
            return new mul(mvr, mxa, zgb.a(ide.callsite("DefaultLensDownloader")), kqf, mwp);
        }

        public static final mwe a(mvv mvv, Set<mwe> set, ide ide, zgb zgb, boolean z) {
            akcr.b(mvv, "lensContentTransformer");
            akcr.b(set, "lensRepositories");
            akcr.b(ide, "attributedFeature");
            akcr.b(zgb, "schedulersProvider");
            if (set.isEmpty()) {
                return mwd.a();
            }
            mwe a = mwd.a(mwd.a((Collection) set, zgb.a(ide.callsite("LensRepositories.withLensContentTransformer#lensRepository"))), mvv);
            mwe mwe = z ? a : null;
            if (mwe != null) {
                a = new mwk(mwe, zgb.a(ide.callsite("OptionalLocalLensRepository")));
            }
            return a;
        }

        public static final mxa a(mxa mxa) {
            return mxa == null ? new e(new akwt.a().a("https://snapchat.com").a()) : mxa;
        }

        public static final ajfb<muo> b(ajws<muo> ajws) {
            akcr.b(ajws, "inputs");
            return new mvd(new d(ajws));
        }
    }

    static {
        b bVar = new b();
    }

    public abstract mwe b();

    public abstract mvv c();

    public abstract ajfb<muo> d();

    public abstract mwa e();

    public abstract mvu f();
}

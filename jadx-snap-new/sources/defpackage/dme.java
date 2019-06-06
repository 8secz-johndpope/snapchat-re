package defpackage;

import com.google.common.base.Optional;
import com.google.protobuf.nano.MessageNano;
import com.snapchat.client.content_resolution.BoltNetworkRulesProviderCallback;
import com.snapchat.client.content_resolution.ContentDescriptorResolver;
import com.snapchat.client.content_resolution.ContentObjectResolver;
import com.snapchat.client.content_resolution.MossRankedMediaVariantsProviderCallback;
import defpackage.fth.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: dme */
public final class dme implements dly {
    static final byte[] i = new byte[0];
    final ajxe a;
    volatile ajdx<ContentDescriptorResolver> b;
    volatile ajdx<ContentObjectResolver> c;
    final ajxe d;
    final ajxe e;
    final ajwy<dlv> f;
    final ajwy<ing> g;
    final ajwy<evg> h;
    private final ajxe j = ajxh.a(new b(this));
    private final ajxe k = ajxh.a(new e(this));
    private final ajxe l = ajxh.a(new d(this));
    private final ajxe m;
    private final ajxe n;
    private final Optional<ajwy<exs>> o;

    /* renamed from: dme$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: dme$b */
    static final class b extends akcs implements akbk<dlv> {
        private /* synthetic */ dme a;

        b(dme dme) {
            this.a = dme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dlv) this.a.f.get();
        }
    }

    /* renamed from: dme$e */
    static final class e extends akcs implements akbk<ing> {
        private /* synthetic */ dme a;

        e(dme dme) {
            this.a = dme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ing) this.a.g.get();
        }
    }

    /* renamed from: dme$d */
    static final class d extends akcs implements akbk<evg> {
        private /* synthetic */ dme a;

        d(dme dme) {
            this.a = dme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (evg) this.a.h.get();
        }
    }

    /* renamed from: dme$s */
    static final class s extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        s(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(dlw.a, "BoltResolversImpl");
        }
    }

    /* renamed from: dme$f */
    static final class f extends akcs implements akbk<Long> {
        private /* synthetic */ dme a;

        f(dme dme) {
            this.a = dme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(((evg) this.a.l.b()).f(dmj.CONTENT_DESCRIPTOR_RESOLVE_TIMEOUT_MS, new acce()));
        }
    }

    /* renamed from: dme$h */
    static final class h extends akcs implements akbk<Long> {
        private /* synthetic */ dme a;

        h(dme dme) {
            this.a = dme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(((evg) this.a.l.b()).f(dmj.CONTENT_OBJECT_RESOLVE_TIMEOUT_MS, new acce()));
        }
    }

    /* renamed from: dme$c */
    static final class c extends akcs implements akbk<1> {
        final /* synthetic */ dme a;

        /* renamed from: dme$c$1 */
        public static final class 1 extends BoltNetworkRulesProviderCallback {
            private /* synthetic */ c a;

            1(c cVar) {
                this.a = cVar;
            }

            public final byte[] getNetworkRules() {
                return ((evg) this.a.a.l.b()).h(dmj.NETWORK_RULES_PROTO, new acce());
            }
        }

        c(dme dme) {
            this.a = dme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new 1(this);
        }
    }

    /* renamed from: dme$n */
    static final class n extends akcs implements akbk<1> {
        final /* synthetic */ dme a;

        /* renamed from: dme$n$1 */
        public static final class 1 extends MossRankedMediaVariantsProviderCallback {
            private /* synthetic */ n a;

            1(n nVar) {
                this.a = nVar;
            }

            public final byte[] getRankedMediaVariants(String str) {
                if (str != null) {
                    if ((((CharSequence) str).length() == 0 ? 1 : null) == null) {
                        Object a = a.a((Type) byte[].class, dme.i);
                        akcr.a(a, "fromObject(ByteArray::cl…s.java, EMPTY_BYTE_ARRAY)");
                        return ((evg) this.a.a.l.b()).h(new evi(str, a, ftg.BOLT), new acce());
                    }
                }
                return dme.i;
            }
        }

        n(dme dme) {
            this.a = dme;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new 1(this);
        }
    }

    /* renamed from: dme$g */
    static final class g extends akcq implements akbl<exs, ajdx<ContentDescriptorResolver>> {
        g(dme dme) {
            super(1, dme);
        }

        public final String getName() {
            return "createContentDescriptorResolver";
        }

        public final akej getOwner() {
            return akde.a(dme.class);
        }

        public final String getSignature() {
            return "createContentDescriptorResolver(Lcom/snap/client/api/ClientLoader;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            exs exs = (exs) obj;
            akcr.b(exs, "p1");
            return dme.a((dme) this.receiver, exs);
        }
    }

    /* renamed from: dme$i */
    static final class i extends akcq implements akbl<exs, ajdx<ContentObjectResolver>> {
        i(dme dme) {
            super(1, dme);
        }

        public final String getName() {
            return "createContentObjectResolver";
        }

        public final akej getOwner() {
            return akde.a(dme.class);
        }

        public final String getSignature() {
            return "createContentObjectResolver(Lcom/snap/client/api/ClientLoader;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            exs exs = (exs) obj;
            akcr.b(exs, "p1");
            return dme.b((dme) this.receiver, exs);
        }
    }

    /* renamed from: dme$j */
    static final class j<V> implements Callable<T> {
        private /* synthetic */ dme a;

        j(dme dme) {
            this.a = dme;
        }

        public final /* synthetic */ Object call() {
            return ContentDescriptorResolver.create((BoltNetworkRulesProviderCallback) this.a.d.b(), ((ing) this.a.k.b()).a());
        }
    }

    /* renamed from: dme$l */
    static final class l<V> implements Callable<T> {
        private /* synthetic */ dme a;

        l(dme dme) {
            this.a = dme;
        }

        public final /* synthetic */ Object call() {
            return ContentObjectResolver.createWithProvider((MossRankedMediaVariantsProviderCallback) this.a.e.b(), ((ing) this.a.k.b()).a());
        }
    }

    /* renamed from: dme$o */
    static final class o<V> implements Callable<T> {
        private /* synthetic */ acev a;

        o(acev acev) {
            this.a = acev;
        }

        public final /* synthetic */ Object call() {
            return MessageNano.toByteArray(this.a);
        }
    }

    /* renamed from: dme$k */
    static final class k<T> implements ajfb<Throwable> {
        private /* synthetic */ dme a;
        private /* synthetic */ exs b;

        k(dme dme, exs exs) {
            this.a = dme;
            this.b = exs;
        }

        public final /* synthetic */ void accept(Object obj) {
            dme dme = this.a;
            dme.b = dme.a(dme, this.b);
        }
    }

    /* renamed from: dme$m */
    static final class m<T> implements ajfb<Throwable> {
        private /* synthetic */ dme a;
        private /* synthetic */ exs b;

        m(dme dme, exs exs) {
            this.a = dme;
            this.b = exs;
        }

        public final /* synthetic */ void accept(Object obj) {
            dme dme = this.a;
            dme.c = dme.b(dme, this.b);
        }
    }

    /* renamed from: dme$q */
    static final class q<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ byte[] a;
        private /* synthetic */ dme b;

        q(dme dme, byte[] bArr) {
            this.b = dme;
            this.a = bArr;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final acgd acgd = (acgd) obj;
            akcr.b(acgd, "networkMapping");
            return this.b.b.f(new ajfc<T, R>(this) {
                private /* synthetic */ q a;

                public final /* synthetic */ Object apply(Object obj) {
                    ContentDescriptorResolver contentDescriptorResolver = (ContentDescriptorResolver) obj;
                    akcr.b(contentDescriptorResolver, "resolver");
                    return contentDescriptorResolver.resolveSerializedContentDescriptor(this.a.a, MessageNano.toByteArray(acgd));
                }
            });
        }
    }

    /* renamed from: dme$r */
    static final class r<T, R> implements ajfc<T, R> {
        private /* synthetic */ acew a;

        r(acew acew) {
            this.a = acew;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ContentObjectResolver contentObjectResolver = (ContentObjectResolver) obj;
            akcr.b(contentObjectResolver, "resolver");
            obj = acgb.a(contentObjectResolver.resolveSerializedContentObjectWithMediaBundle(MessageNano.toByteArray(this.a)));
            akcr.a(obj, "mediaVariant");
            return obj.b();
        }
    }

    /* renamed from: dme$p */
    static final class p extends akcq implements akbl<byte[], ajdx<ArrayList<String>>> {
        p(dme dme) {
            super(1, dme);
        }

        public final String getName() {
            return "resolveContentDescriptor";
        }

        public final akej getOwner() {
            return akde.a(dme.class);
        }

        public final String getSignature() {
            return "resolveContentDescriptor([B)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            byte[] bArr = (byte[]) obj;
            akcr.b(bArr, "p1");
            dme dme = (dme) this.receiver;
            obj = dme.b().a().b((ajdw) dme.c().g()).a((ajfc) new q(dme, bArr)).c(((Number) dme.a.b()).longValue(), TimeUnit.MILLISECONDS);
            akcr.a(obj, "boltConfigProvider\n     …s, TimeUnit.MILLISECONDS)");
            return obj;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(dme.class), "boltConfigProvider", "getBoltConfigProvider()Lcom/snap/bolt/api/BoltConfigProvider;"), new akdc(akde.a(dme.class), "clientMetricsProcessorProvider", "getClientMetricsProcessorProvider()Lcom/snap/graphene/impl/processor/ClientMetricsProcessorProvider;"), new akdc(akde.a(dme.class), "circumstanceEngineApi", "getCircumstanceEngineApi()Lcom/snap/circumstanceengine/api/CircumstanceEngineApi;"), new akdc(akde.a(dme.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(dme.class), "contentDescriptorResolveTimeoutMs", "getContentDescriptorResolveTimeoutMs()J"), new akdc(akde.a(dme.class), "contentObjectResolveTimeoutMs", "getContentObjectResolveTimeoutMs()J"), new akdc(akde.a(dme.class), "boltNetworkRulesProvider", "getBoltNetworkRulesProvider()Lcom/snapchat/client/content_resolution/BoltNetworkRulesProviderCallback;"), new akdc(akde.a(dme.class), "mossRankedMediaVariantsProvider", "getMossRankedMediaVariantsProvider()Lcom/snapchat/client/content_resolution/MossRankedMediaVariantsProviderCallback;")};
        a aVar = new a();
    }

    public dme(ajwy<dlv> ajwy, Optional<ajwy<exs>> optional, ajwy<ing> ajwy2, ajwy<evg> ajwy3, ajwy<zgb> ajwy4) {
        akcr.b(ajwy, "boltConfigProviderProvider");
        akcr.b(optional, "optionalClientLoaderProvider");
        akcr.b(ajwy2, "clientMetricsProcessorProviderProvider");
        akcr.b(ajwy3, "circumstanceEngineApiProvider");
        akcr.b(ajwy4, "schedulersProvider");
        this.f = ajwy;
        this.o = optional;
        this.g = ajwy2;
        this.h = ajwy3;
        this.m = ajxh.a(new s(ajwy4));
        this.a = ajxh.a(new f(this));
        this.n = ajxh.a(new h(this));
        dme dme = this;
        this.b = d().a((ajfc) new dmf(new g(dme))).a();
        this.c = d().a((ajfc) new dmf(new i(dme))).a();
        this.d = ajxh.a(new c(this));
        this.e = ajxh.a(new n(this));
    }

    public static final /* synthetic */ ajdx a(dme dme, exs exs) {
        Object b = exs.a().b((ajeb) ajdx.c((Callable) new j(dme))).d((ajfb) new k(dme, exs)).b((ajdw) dme.c().b());
        akcr.a(b, "loader\n                .…schedulers.computation())");
        return b;
    }

    public static final /* synthetic */ ajdx b(dme dme, exs exs) {
        Object b = exs.a().b((ajeb) ajdx.c((Callable) new l(dme))).d((ajfb) new m(dme, exs)).b((ajdw) dme.c().b());
        akcr.a(b, "loader\n                .…schedulers.computation())");
        return b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0037 in {2, 4, 6, 8} preds:[]
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
    private final defpackage.ajdx<defpackage.exs> d() {
        /*
        r2 = this;
        r0 = r2.o;
        r0 = r0.isPresent();
        r1 = 1;
        if (r0 != r1) goto L_0x001f;
        r0 = r2.o;
        r0 = r0.get();
        r0 = (defpackage.ajwy) r0;
        r0 = r0.get();
        r0 = defpackage.ajdx.b(r0);
        r1 = "Single.just(optionalClie…aderProvider.get().get())";
        defpackage.akcr.a(r0, r1);
        return r0;
        if (r0 != 0) goto L_0x0031;
        r0 = new java.lang.RuntimeException;
        r1 = "ClientLoader is unavailable in this environment";
        r0.<init>(r1);
        r0 = (java.lang.Throwable) r0;
        r0 = defpackage.ajdx.b(r0);
        r1 = "Single.error(RuntimeExce…le in this environment\"))";
        goto L_0x001b;
        r0 = new ajxk;
        r0.<init>();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dme.d():ajdx");
    }

    public final ajdx<ArrayList<String>> a(acev acev) {
        akcr.b(acev, "contentDescriptor");
        Object b = ajdx.c((Callable) new o(acev)).a((ajfc) new dmf(new p(this))).b((ajdw) c().b());
        akcr.a(b, "Single.fromCallable {\n  …schedulers.computation())");
        return b;
    }

    public final ajdx<acev> a(acew acew) {
        Object b;
        String str;
        akcr.b(acew, "contentObject");
        if (acew.b()) {
            b = ajdx.b(acew.c());
            str = "Single.just(contentObject.contentDescriptor)";
        } else {
            b = this.c.f(new r(acew)).b((ajdw) c().b()).c(((Number) this.n.b()).longValue(), TimeUnit.MILLISECONDS);
            str = "contentObjectResolver.ma…s, TimeUnit.MILLISECONDS)";
        }
        akcr.a(b, str);
        return b;
    }

    public final void a() {
        b().b();
    }

    /* Access modifiers changed, original: final */
    public final dlv b() {
        return (dlv) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final zfw c() {
        return (zfw) this.m.b();
    }
}

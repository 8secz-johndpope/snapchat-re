package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.akdd.e;
import defpackage.ghx.a;
import defpackage.ovh.j;
import java.io.ByteArrayInputStream;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "memories_snap_media_prefetcher")
/* renamed from: pfe */
public final class pfe extends ggm {
    final ajxe a;
    final ajwy<pep> b;
    final pfd c;
    final pfg d;
    final pkh e;
    final ajwy<gqr> f;
    private final ajxe g;
    private final ajwy<ovh> h;

    /* renamed from: pfe$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: pfe$h */
    static final class h<V> implements Callable<T> {
        private /* synthetic */ Uri a;

        h(Uri uri) {
            this.a = uri;
        }

        public final /* synthetic */ Object call() {
            return a.a((Throwable) new pfk("request failed", 2), null);
        }
    }

    /* renamed from: pfe$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pfe a;
        private /* synthetic */ org b;
        private /* synthetic */ Set c;

        c(pfe pfe, org org, Set set) {
            this.a = pfe;
            this.b = org;
            this.c = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyy abyy = (abyy) obj;
            akcr.b(abyy, "edits");
            if (!this.a.e.a(this.b.b, abyy)) {
                return pfe.a(this.b);
            }
            pfe pfe = this.a;
            org org = this.b;
            Set set = this.c;
            akcr.b(org, "requestInfo");
            akcr.b(set, "schedulingContexts");
            e eVar = new e();
            String str = org.c;
            if (str != null) {
                Uri a = ssd.a.a(gfr.a.b(), str, "memories_streaming", new ssf(0, 512000), null, null);
                pfg pfg = pfe.d;
                Object newHashSet = Sets.newHashSet(gdy.IGNORE_WRITE_CACHE);
                akcr.a(newHashSet, "Sets.newHashSet(CacheAcc…ntrol.IGNORE_WRITE_CACHE)");
                obj = pfg.a(a, set, true, (Set) newHashSet).f(new e(pfe, set, eVar));
                akcr.a(obj, "streamingResult.map {\n  …e.toLong())\n            }");
                return obj;
            }
            obj = ajdx.b(a.a((Throwable) new peo("Unable to find download url for media", 2), null));
            akcr.a(obj, "Single.just(FailedConten…rl for media\")\n        ))");
            return obj;
        }
    }

    /* renamed from: pfe$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pfe a;
        private /* synthetic */ org b;
        private /* synthetic */ Set c;

        d(pfe pfe, org org, Set set) {
            this.a = pfe;
            this.b = org;
            this.c = set;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            if (!gej.a() || !this.b.b.a()) {
                return pfe.a(this.b);
            }
            pfe pfe = this.a;
            obj = ((pep) pfe.b.get()).a(gej).b((ajdw) ((zfw) pfe.a.b()).b()).a((ajfc) new c(pfe, this.b, this.c));
            akcr.a(obj, "editsContentResultUtils.…      }\n                }");
            return obj;
        }
    }

    /* renamed from: pfe$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ pfe a;
        private /* synthetic */ long b = 512000;
        private /* synthetic */ Set c;
        private /* synthetic */ defpackage.akdd.e d;

        e(pfe pfe, Set set, defpackage.akdd.e eVar) {
            this.a = pfe;
            this.c = set;
            this.d = eVar;
        }

        private gej a(gej gej) {
            akcr.b(gej, "it");
            if (!gej.a()) {
                return gej;
            }
            byte[] bArr = new byte[((int) this.b)];
            try {
                Object b = gej.b();
                akcr.a(b, "it.openDefaultAsset()");
                int i = 0;
                while (i < ((int) this.b)) {
                    i += b.read(bArr, 0, (int) this.b);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                gej.close();
            }
            gej.close();
            this.d.a = new ByteArrayInputStream(bArr);
            Supplier ofInstance = Suppliers.ofInstance((ByteArrayInputStream) this.d.a);
            akcr.a((Object) ofInstance, "Suppliers.ofInstance(inputStream)");
            Optional of = Optional.of(ofInstance.get());
            akcr.a((Object) of, "Optional.of(inputStreamSupplier.get())");
            return gem.a(ofInstance, "prefetched_bytes", of, true, (long) bArr.length, 32);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((gej) obj);
        }
    }

    /* renamed from: pfe$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pfe a;
        private /* synthetic */ Set b;
        private /* synthetic */ boolean c;
        private /* synthetic */ Set d;

        f(pfe pfe, Set set, boolean z, Set set2) {
            this.a = pfe;
            this.b = set;
            this.c = z;
            this.d = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            org org = (org) obj;
            akcr.b(org, "it");
            pfe pfe = this.a;
            Set set = this.b;
            boolean z = this.c;
            Set set2 = this.d;
            pfd pfd = pfe.c;
            String str = org.a;
            akcr.b(str, "snapId");
            obj = pfd.a(pnj.e(str), set, z, set2).a((ajfc) new d(pfe, org, set));
            akcr.a(obj, "memoriesSnapEditsUriHand…      }\n                }");
            return obj;
        }
    }

    /* renamed from: pfe$g */
    static final class g<T, R> implements ajfc<Throwable, gej> {
        private /* synthetic */ pfe a;

        g(pfe pfe) {
            this.a = pfe;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            ((gqr) this.a.f.get()).a(gqt.NORMAL, th, ((idd) this.a.g.b()));
            return a.a(th, null);
        }
    }

    /* renamed from: pfe$b */
    static final class b extends akcs implements akbk<idd> {
        private /* synthetic */ oiy a;

        b(oiy oiy) {
            this.a = oiy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.callsite("MemoriesSnapMediaPrefetcherUriHandler");
        }
    }

    /* renamed from: pfe$i */
    static final class i extends akcs implements akbk<zfw> {
        private /* synthetic */ pfe a;
        private /* synthetic */ zgb b;

        i(pfe pfe, zgb zgb) {
            this.a = pfe;
            this.b = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(((idd) this.a.g.b()));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(pfe.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(pfe.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        a aVar = new a();
    }

    public pfe(oiy oiy, zgb zgb, ajwy<pep> ajwy, ajwy<ovh> ajwy2, pfd pfd, pfg pfg, pkh pkh, ajwy<gqr> ajwy3) {
        akcr.b(oiy, "feature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "editsContentResultUtils");
        akcr.b(ajwy2, "memoriesDownloadRepository");
        akcr.b(pfd, "memoriesSnapEditsUriHandler");
        akcr.b(pfg, "memoriesStreamingUriHandler");
        akcr.b(pkh, "streamingHelper");
        akcr.b(ajwy3, "exceptionTrackerProvider");
        this.b = ajwy;
        this.h = ajwy2;
        this.c = pfd;
        this.d = pfg;
        this.e = pkh;
        this.f = ajwy3;
        this.g = ajxh.a(new b(oiy));
        this.a = ajxh.a(new i(this, zgb));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String queryParameter = uri.getQueryParameter("ID");
        if (queryParameter == null) {
            Object b = ajdx.b(a.a((Throwable) new IllegalArgumentException("missing ID"), null));
            akcr.a(b, "Single.just(FailedConten…\")\n                    ))");
            return b;
        }
        ovh ovh = (ovh) this.h.get();
        akcr.b(queryParameter, "snapId");
        Object b2 = ajdj.b((Callable) new j(ovh, queryParameter)).b((ajdw) ovh.c().i());
        akcr.a(b2, "Maybe\n                .f…eOn(schedulers.queries())");
        ajdx a = b2.d((ajfc) new f(this, set, z, set2)).h(new g(this)).a((ajeb) ajdx.c((Callable) new h(uri)));
        akcr.a((Object) a, "memoriesDownloadReposito…     )\n                })");
        return gem.a(a, z);
    }
}

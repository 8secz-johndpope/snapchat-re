package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.google.gson.stream.JsonReader;
import com.snapchat.research.previewcv.SkyFilter;
import com.snapchat.research.previewcv.SnapFillBase.a;
import defpackage.ttk.b;
import defpackage.ttk.g;
import defpackage.ttn.d;
import defpackage.ttn.e;
import defpackage.ttn.f;
import defpackage.ttn.h;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: tte */
public final class tte {
    final ajxe a;
    final ajxe b;
    final ArrayList<aehv> c;
    final ajdx<iha> d;
    private final ajxe e;
    private final ajxe f;
    private final ajxe g = ajxh.a(j.a);

    /* renamed from: tte$j */
    static final class j extends akcs implements akbk<ajei> {
        public static final j a = new j();

        j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajei();
        }
    }

    /* renamed from: tte$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: tte$d */
    static final class d extends akcs implements akbk<gfu> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gfu) this.a.get();
        }
    }

    /* renamed from: tte$b */
    static final class b extends akcs implements akbk<jwa> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (jwa) this.a.get();
        }
    }

    /* renamed from: tte$c */
    static final class c extends akcs implements akbk<jwc> {
        private /* synthetic */ jwe a;

        c(jwe jwe) {
            this.a = jwe;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a();
        }
    }

    /* renamed from: tte$o */
    static final class o extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        o(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite("ContextFilterDataSource"));
        }
    }

    /* renamed from: tte$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ tte a;

        e(tte tte) {
            this.a = tte;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final gej gej = (gej) obj;
            akcr.b(gej, "result");
            if (gej.a()) {
                return this.a.d.f(new ajfc<T, R>() {
                    public final /* synthetic */ Object apply(Object obj) {
                        iha iha = (iha) obj;
                        akcr.b(iha, "it");
                        aehu aehu = new aehu(iha.b());
                        Object obj2 = gej;
                        akcr.a(obj2, "result");
                        return aehu.a(new JsonReader(new InputStreamReader(((gdt) obj2.c().get(0)).b())));
                    }
                });
            }
            StringBuilder stringBuilder = new StringBuilder("Load filter metadata was not successful: ");
            stringBuilder.append(gej.e());
            return ajdx.b((Throwable) new IOException(stringBuilder.toString()));
        }
    }

    /* renamed from: tte$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: tte$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ aehv a;
        private /* synthetic */ tte b;
        private /* synthetic */ ajei c;
        private /* synthetic */ String d;
        private /* synthetic */ SkyFilter e;
        private /* synthetic */ tti f;
        private /* synthetic */ tti g;

        /* renamed from: tte$g$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                kaz kaz = (kaz) obj;
                akcr.b(kaz, "it");
                Object a = this.a.a.a();
                akcr.a(a, "skyItem.skyTypeEnum");
                return new ttd(ttl.a(a), kaz);
            }
        }

        g(tte tte, ajei ajei, String str, aehv aehv, SkyFilter skyFilter, tti tti, tti tti2) {
            this.b = tte;
            this.c = ajei;
            this.d = str;
            this.a = aehv;
            this.e = skyFilter;
            this.f = tti;
            this.g = tti2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            Object obj2 = (kaz) ajxm.a;
            obj = (ttg) ajxm.b;
            Object a = ((jwa) this.b.f.b());
            akcr.a(a, "bitmapFactory");
            ttn ttn = new ttn(a, ((ajei) this.b.g.b()), this.c);
            String str = this.d;
            Object a2 = this.a.a();
            akcr.a(a2, "skyItem.skyTypeEnum");
            SkyFilter skyFilter = this.e;
            String str2 = "skyBitmap";
            akcr.a(obj2, str2);
            tti tti = this.f;
            tti tti2 = this.g;
            String str3 = "snapRotationData";
            akcr.a(obj, str3);
            akcr.b(str, "tag");
            akcr.b(a2, "skyType");
            akcr.b(skyFilter, "skyFilter");
            akcr.b(obj2, str2);
            akcr.b(tti, "baseBitmapMat");
            akcr.b(tti2, "skyMaskMat");
            akcr.b(obj, str3);
            obj2 = ajdx.c((Callable) new d(ttn, obj2));
            akcr.a(obj2, "Single.fromCallable {\n  …(matDisposable)\n        }");
            obj = obj2.a((ajfc) new e(ttn, skyFilter, tti)).a((ajfc) new f(ttn, skyFilter, a2, tti, tti2)).a((ajfc) new defpackage.ttn.g(ttn, str)).a((ajfc) new h(ttn, str, obj));
            akcr.a(obj, "prepareSkyBitmapMat(skyB…onData)\n                }");
            return obj.f(new 1(this));
        }
    }

    /* renamed from: tte$h */
    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: tte$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "result");
            if (gej.a()) {
                obj = gej.c().get(0);
                akcr.a(obj, "result.assets[0]");
                obj = ((gdt) obj).d();
                akcr.a(obj, "result.assets[0].uri");
                return ajdx.b(obj.getPath());
            }
            StringBuilder stringBuilder = new StringBuilder("Load sky model was not successful: ");
            stringBuilder.append(gej.e());
            return ajdx.b((Throwable) new IOException(stringBuilder.toString()));
        }
    }

    /* renamed from: tte$k */
    static final class k<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ tte a;
        private /* synthetic */ String b;

        k(tte tte, String str) {
            this.a = tte;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            ajxm ajxm2 = (ajxm) ajxm.a;
            obj = (ttg) ajxm.b;
            String str = (String) ajxm2.a;
            Object obj2 = (kaz) ajxm2.b;
            Object a = ((jwa) this.a.f.b());
            akcr.a(a, "bitmapFactory");
            ttk ttk = new ttk(a, ((ajei) this.a.g.b()));
            String str2 = this.b;
            String str3 = "snapBitmap";
            akcr.a(obj2, str3);
            String str4 = "snapRotationData";
            akcr.a(obj, str4);
            akcr.b(str2, "tag");
            akcr.b(str, "modelPath");
            akcr.b(obj2, str3);
            akcr.b(obj, str4);
            Object a2 = ajcx.a((ajev) g.a);
            akcr.a(a2, "Completable.fromAction {…e\n            }\n        }");
            Object skyFilter = new SkyFilter(str, a.a);
            skyFilter.b();
            skyFilter.c();
            Object b = a2.b((ajeb) ajdx.b(skyFilter));
            akcr.a(b, "loadLibraries()\n        …ateSkyFilter(modelPath)))");
            obj = ajdx.c((Callable) new ttk.h(ttk, obj2, str2, obj));
            akcr.a(obj, "Single.fromCallable {\n  …(matDisposable)\n        }");
            obj = ajwd.a(b, (ajeb) obj).a((ajfc) new ttk.e(ttk)).d((ajfb) ttk.f.a).c(Optional.absent());
            akcr.a(obj, "loadLibraries()\n        …bsent<SkyFilterBundle>())");
            return obj;
        }
    }

    /* renamed from: tte$l */
    static final class l<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ tte a;
        final /* synthetic */ String b;
        final /* synthetic */ ajdp c;
        final /* synthetic */ ajei d;

        /* renamed from: tte$l$1 */
        static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
            private /* synthetic */ l a;

            1(l lVar) {
                this.a = lVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                aeht aeht = (aeht) obj;
                akcr.b(aeht, "it");
                obj = aeht.a;
                akcr.a(obj, "it.skies");
                akdv a = akef.a(0, obj.size());
                obj = ajdx.b(ajyl.a(obj.get(new Random().nextInt((((Number) a.c()).intValue() + 1) - ((Number) a.b()).intValue()) + ((Number) a.b()).intValue())));
                akcr.a(obj, "Single.just(listOf(skies[index]))");
                return obj;
            }
        }

        l(tte tte, String str, ajdp ajdp, ajei ajei) {
            this.a = tte;
            this.b = str;
            this.c = ajdp;
            this.d = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            if (!optional.isPresent()) {
                return ajdx.b((Object) ajyw.a);
            }
            final b bVar = (b) optional.get();
            tte tte = this.a;
            gfu a = tte.a();
            Uri build = gfr.a.b().buildUpon().appendPath("context_filter_metadata").build();
            akcr.a((Object) build, "SnapContentBaseUriProvid…\n                .build()");
            Object a2 = a.a(build, (idl) toc.d.getPage(), true, new gdy[0]).a((ajfc) new e(tte));
            akcr.a(a2, "contentResolver.resolve(…  }\n                    }");
            return a2.a((ajfc) new 1(this)).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                final /* synthetic */ l a;

                /* renamed from: tte$l$2$1 */
                static final class 1<T, R> implements ajfc<T, ajeb<? extends R>> {
                    private /* synthetic */ 2 a;

                    1(2 2) {
                        this.a = 2;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        aehv aehv = (aehv) obj;
                        akcr.b(aehv, "skyMetadata");
                        tte tte = this.a.a.a;
                        String str = this.a.a.b;
                        SkyFilter skyFilter = bVar.a;
                        tti tti = bVar.b;
                        tti tti2 = bVar.c;
                        ajdp ajdp = this.a.a.c;
                        ajei ajei = this.a.a.d;
                        jxa b = new jxa.a().a(ajei).b();
                        akcr.a((Object) b, "RequestOptions.Builder()…\n                .build()");
                        Object d = ((jwc) tte.a.b()).a(Uri.parse(aehv.b), (idl) toc.d.getPage(), b).d((ajfb) f.a);
                        akcr.a(d, "bitmapLoader.loadBitmap(…ed to load sky bitmap\") }");
                        obj = ajdp.e();
                        akcr.a(obj, "snapRotationDataObservable.firstOrError()");
                        obj = ajwd.a(d, (ajeb) obj).a((ajfc) new g(tte, ajei, str, aehv, skyFilter, tti, tti2));
                        akcr.a(obj, "bitmapLoader.loadBitmap(…      }\n                }");
                        return obj;
                    }
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "skyMetadataList");
                    this.a.a.c.addAll(list);
                    return ajdp.b((Iterable) list).n(new 1(this)).a(16);
                }
            });
        }
    }

    /* renamed from: tte$m */
    static final class m<T> implements ajfb<Throwable> {
        public static final m a = new m();

        m() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: tte$n */
    static final class n implements ajev {
        private /* synthetic */ tte a;

        n(tte tte) {
            this.a = tte;
        }

        public final void run() {
            ((ajei) this.a.g.b()).dispose();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tte.class), "contentResolver", "getContentResolver()Lcom/snap/core/net/content/api/SnapContentResolver;"), new akdc(akde.a(tte.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(tte.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(tte.class), "matDisposable", "getMatDisposable()Lio/reactivex/disposables/CompositeDisposable;"), new akdc(akde.a(tte.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        a aVar = new a();
    }

    public tte(zgb zgb, ajwy<gfu> ajwy, ajwy<jwa> ajwy2, jwe jwe, ajdx<iha> ajdx) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "contentResolverProvider");
        akcr.b(ajwy2, "bitmapFactoryProvider");
        akcr.b(jwe, "bitmapLoaderFactory");
        akcr.b(ajdx, "serializationHelper");
        this.d = ajdx;
        this.e = ajxh.a(new d(ajwy));
        this.f = ajxh.a(new b(ajwy2));
        this.a = ajxh.a(new c(jwe));
        this.b = ajxh.a(new o(zgb));
        this.c = new ArrayList();
    }

    /* Access modifiers changed, original: final */
    public final gfu a() {
        return (gfu) this.e.b();
    }
}

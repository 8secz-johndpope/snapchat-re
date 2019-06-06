package defpackage;

import com.google.common.base.Supplier;
import defpackage.mjo.b;
import defpackage.myh.c;
import java.util.Set;

/* renamed from: lkx */
abstract class lkx {

    /* renamed from: lkx$a */
    public static final class a {

        /* renamed from: lkx$a$b */
        public static final class b extends ide {
            private final idj a;
            private /* synthetic */ ide b;
            private /* synthetic */ ide c;

            b(ide ide, ide ide2, String str, idi idi) {
                this.b = ide;
                this.c = ide2;
                super(str, idi);
                this.a = typedUiPage((idl) ide.getPage(), new String[0]);
            }

            public final idj getPage() {
                return this.a;
            }
        }

        /* renamed from: lkx$a$c */
        static final class c extends akcs implements akbk<mxa> {
            private /* synthetic */ ajwy a;

            c(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mxa k = lfu.k();
                    if (k != null) {
                        return k;
                    }
                }
                return defpackage.mxa.a.a;
            }
        }

        /* renamed from: lkx$a$d */
        static final class d extends akcs implements akbk<mof> {
            private /* synthetic */ ajwy a;

            d(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mof b = lfu.r().b();
                    if (b != null) {
                        return b;
                    }
                }
                return defpackage.mof.a.a;
            }
        }

        /* renamed from: lkx$a$e */
        static final class e extends akcs implements akbk<mok<? super moc>> {
            private /* synthetic */ ajwy a;

            e(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                lfu lfu = (lfu) this.a.get();
                if (lfu != null) {
                    mok c = lfu.r().c();
                    if (c != null) {
                        return c;
                    }
                }
                return defpackage.mok.a.a;
            }
        }

        /* renamed from: lkx$a$a */
        public static final class a implements toe {
            private final String a = "LensesPreviewFeatureComponent";
            private /* synthetic */ adim b;
            private /* synthetic */ lkf c;

            a(adim adim, lkf lkf) {
                this.b = adim;
                this.c = lkf;
            }

            public final ajej start() {
                adim adim = this.b;
                adiv adiv = this.c;
                akcr.b(adiv, "internalRenderPass");
                adim.a.set(adiv);
                Object a = ajek.a(ajfu.b);
                akcr.a(a, "Disposables.empty()");
                return a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static lfu a(defpackage.lfu.a aVar, ide ide) {
            akcr.b(ide, "attributedFeature");
            return aVar != null ? aVar.a(ide).a() : null;
        }

        public static mjo a(lkw lkw, mxa mxa, mof mof, boolean z, mok<moc> mok, lnr lnr, Set<akbl<mmt, mph>> set) {
            akcr.b(lkw, "lensesPreviewFeatureComponent");
            akcr.b(mxa, "remoteServiceFactory");
            akcr.b(mof, "resourceResolverFactory");
            akcr.b(mok, "resourceUriResolver");
            akcr.b(lnr, "assetUploader");
            akcr.b(set, "uriDataHandlerFactories");
            return b.a(lkw).a(mxa).a(z).a(mof).a((mok) mok).a((Set) set).a(lnr).c();
        }

        public static myh a(mwe mwe, lkw lkw) {
            akcr.b(mwe, "lensRepository");
            akcr.b(lkw, "lensesPreviewFeatureComponent");
            c cVar = lkw;
            akcr.b(cVar, "parentComponent");
            return (myh) mym.b().a(cVar).a(mwd.a()).a(mwe).a();
        }
    }

    static {
        a aVar = new a();
    }

    public static final ajdp<mmt> a(lkf lkf) {
        akcr.b(lkf, "renderPass");
        Object a = ajdp.a((ajdt) lkf);
        akcr.a(a, "Observable.unsafeCreate(renderPass)");
        return a;
    }

    public static final Supplier<mmf> a(mjo mjo) {
        akcr.b(mjo, "coreComponent");
        return mjo.b();
    }

    public static final ide a(ide ide, ide ide2) {
        akcr.b(ide, "previewAttributedFeature");
        akcr.b(ide2, "lensesAttributedFeature");
        return new b(ide, ide2, ide2.getName(), idi.CAMERA_PLATFORM);
    }

    public static final lkf a(Supplier<mmf> supplier) {
        akcr.b(supplier, "lensCoreSupplier");
        return new lkf(supplier);
    }

    public static final mjo a(lkw lkw, mxa mxa, mof mof, boolean z, mok<moc> mok, lnr lnr, Set<akbl<mmt, mph>> set) {
        return a.a(lkw, mxa, mof, z, mok, lnr, set);
    }

    public static final mwe a(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "dataComponent");
        lfu lfu = (lfu) ajwy.get();
        if (lfu != null) {
            mwe l = lfu.l();
            if (l != null) {
                return l;
            }
        }
        return mwd.a();
    }

    public static final toe a(lkf lkf, adim adim) {
        akcr.b(lkf, "lensCoreRenderPass");
        akcr.b(adim, "lateInitRenderPass");
        return new a(adim, lkf);
    }

    public static final twa a(myh myh) {
        akcr.b(myh, "carouselComponent");
        return new lkv(myh.a());
    }

    public static final mxa b(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        return mxb.a(new c(ajwy));
    }

    public static final mof c(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        return mog.a(new d(ajwy));
    }

    public static final mok<moc> d(ajwy<lfu> ajwy) {
        akcr.b(ajwy, "lensesDataComponent");
        return mol.a(new e(ajwy));
    }

    public static final miw e(ajwy<lbp> ajwy) {
        akcr.b(ajwy, "lensesConfigurationComponent");
        lbp lbp = (lbp) ajwy.get();
        if (lbp != null) {
            miw e = lbp.e();
            if (e != null) {
                return e;
            }
        }
        return new miy();
    }
}

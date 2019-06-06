package defpackage;

import defpackage.foi.j;
import defpackage.foi.k;
import defpackage.foi.l;
import defpackage.foi.m;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fln */
public final class fln {
    public zkf a;
    public zke b;
    public final ajei c = new ajei();
    final zfw d;
    boolean e;
    public final ajwo<ajxw> f;
    public final ajwo<tht> g;
    public flk h;
    Boolean i;
    public final flm j;
    public final flg k;
    final fit l;
    final tjj m;
    final foi n;
    private fjl o;
    private thy p;
    private fiy q;
    private final tha r;
    private final fjc s;
    private final flq t;
    private final fmi u;
    private final fmu v;
    private final fpm w;
    private final tgo x;
    private final tgp y;

    /* renamed from: fln$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: fln$i */
    static final class i implements Runnable {
        private /* synthetic */ fln a;

        i(fln fln) {
            this.a = fln;
        }

        public final void run() {
            if (!this.a.l.a()) {
                zke zke = this.a.b;
                if (zke == null) {
                    akcr.a("dispatcher");
                }
                zke.a(fpy.a);
                ajvv.a(this.a.l.b(), this.a.c);
            }
        }
    }

    /* renamed from: fln$b */
    public static final class b<T1, T2, R> implements ajex<ajxw, tht, tht> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            tht tht = (tht) obj2;
            akcr.b((ajxw) obj, "<anonymous parameter 0>");
            akcr.b(tht, "product");
            return tht;
        }
    }

    /* renamed from: fln$c */
    public static final class c<T> implements ajfb<tht> {
        private /* synthetic */ fln a;

        public c(fln fln) {
            this.a = fln;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajej a;
            obj = (tht) obj;
            fln fln = this.a;
            akcr.a(obj, "it");
            foi foi = fln.n;
            akcr.b(obj, "product");
            thw b = obj.b();
            String str = "Disposables.empty()";
            if (b != null) {
                String c = b.c();
                obj = obj.a();
                akcr.a(obj, "product.storeInfo");
                String e = obj.e();
                if (!(e == null || c == null)) {
                    a = foi.a().c((ajfc) new j(foi, c, b, e)).a((ajdw) foi.a.g()).e((ajfc) new k(foi)).a((ajev) l.a, (ajfb) m.a);
                    akcr.a((Object) a, "whenPixelEventEnabled()\n… view content event!\") })");
                    ajvv.a(a, fln.c);
                }
            }
            a = ajek.a(ajfu.b);
            akcr.a((Object) a, str);
            ajvv.a(a, fln.c);
        }
    }

    /* renamed from: fln$d */
    public static final class d<T> implements ajfb<Throwable> {
        public static final d a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fln$e */
    static final class e<T> implements ajfb<fiy> {
        private /* synthetic */ fln a;

        e(fln fln) {
            this.a = fln;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.k.a((fiy) obj);
        }
    }

    /* renamed from: fln$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fln$h */
    static final class h<T> implements ajfb<Throwable> {
        public static final h a = new h();

        h() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fln$j */
    static final class j<T> implements ajfb<aggw> {
        private /* synthetic */ fln a;

        j(fln fln) {
            this.a = fln;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fln$l */
    static final class l<T> implements ajfb<ahjg> {
        private /* synthetic */ fln a;

        l(fln fln) {
            this.a = fln;
        }

        public final /* synthetic */ void accept(Object obj) {
            ahjg ahjg = (ahjg) obj;
            if (ahjg != null) {
                List list = ahjg.a;
                if (list != null) {
                    this.a.i = Boolean.valueOf(list.size() > 0);
                }
            }
        }
    }

    /* renamed from: fln$n */
    public static final class n<T> implements ajfb<frm> {
        private /* synthetic */ fln a;

        public n(fln fln) {
            this.a = fln;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (frm) obj;
            fln fln = this.a;
            akcr.a(obj, "it");
            fln.handleProductDetailPageUserActionEvents(obj);
        }
    }

    /* renamed from: fln$o */
    public static final class o<T> implements ajfb<Throwable> {
        public static final o a = new o();

        o() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fln$g */
    static final class g extends akcq implements akbl<Boolean, ajxw> {
        g(fln fln) {
            super(1, fln);
        }

        public final String getName() {
            return "showOutOfUsToast";
        }

        public final akej getOwner() {
            return akde.a(fln.class);
        }

        public final String getSignature() {
            return "showOutOfUsToast(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            fln fln = (fln) this.receiver;
            if (!((Boolean) obj).booleanValue()) {
                synchronized (fln) {
                    if (fln.e) {
                    } else {
                        fln.e = true;
                        zke zke = fln.b;
                        if (zke == null) {
                            akcr.a("dispatcher");
                        }
                        zke.a(new frr(fln.d, fln.c));
                        fln.m.a(aagv.REGION_OUTSIDE_US);
                    }
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: fln$k */
    static final class k extends akcq implements akbl<Throwable, ajxw> {
        k(fln fln) {
            super(1, fln);
        }

        public final String getName() {
            return "onError";
        }

        public final akej getOwner() {
            return akde.a(fln.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            fln.a(th);
            return ajxw.a;
        }
    }

    /* renamed from: fln$m */
    static final class m extends akcq implements akbl<Throwable, ajxw> {
        m(fln fln) {
            super(1, fln);
        }

        public final String getName() {
            return "onError";
        }

        public final akej getOwner() {
            return akde.a(fln.class);
        }

        public final String getSignature() {
            return "onError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            fln.a(th);
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public fln(tha tha, flm flm, flg flg, fjc fjc, flq flq, fmi fmi, fmu fmu, fit fit, fpm fpm, tgo tgo, tgp tgp, tjj tjj, ajwy<zgb> ajwy, foi foi) {
        akcr.b(tha, "imagePreloader");
        akcr.b(flm, "productCardController");
        akcr.b(flg, "cartViewController");
        akcr.b(fjc, "navigationController");
        akcr.b(flq, "productSelectionModel");
        akcr.b(fmi, "productInfoDataStore");
        akcr.b(fmu, "checkoutCartUtils");
        akcr.b(fit, "commerceUserPref");
        akcr.b(fpm, "locationValidator");
        akcr.b(tgo, "paymentsApis");
        akcr.b(tgp, "paymentsServiceApis");
        akcr.b(tjj, "logger");
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(foi, "commercePixelLogger");
        this.r = tha;
        this.j = flm;
        this.k = flg;
        this.s = fjc;
        this.t = flq;
        this.u = fmi;
        this.v = fmu;
        this.l = fit;
        this.w = fpm;
        this.x = tgo;
        this.y = tgp;
        this.m = tjj;
        this.n = foi;
        ajwy.get();
        this.d = zgb.a(fiq.o.callsite("ProductPresenter"));
        Object ajwo = new ajwo();
        String str = "PublishSubject.create()";
        akcr.a(ajwo, str);
        this.f = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.g = ajwo;
    }

    private final void a() {
        this.m.b(aafr.REVIEW_ORDER);
        zke zke = this.b;
        String str = "dispatcher";
        if (zke == null) {
            akcr.a(str);
        }
        zke.a(new fsl(false, true));
        zke = this.b;
        if (zke == null) {
            akcr.a(str);
        }
        zke.a(new fsm(true));
    }

    public static final /* synthetic */ void a(Throwable th) {
        if (!(th instanceof thg)) {
            th.getLocalizedMessage();
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void handleProductDetailPageUserActionEvents(frm frm) {
        akcr.b(frm, "event");
        int i = 0;
        String str = "dispatcher";
        Object h;
        zke zke;
        ajej e;
        fiy fiy;
        zke zke2;
        int i2;
        if (frm instanceof fqv) {
            fqv fqv = (fqv) frm;
            this.o = fqv.b;
            tht tht = fqv.a;
            this.t.a(tht);
            fmi fmi = this.u;
            akcr.b(tht, "productInfoModel");
            fmi.a.put(tht.c(), tht);
            this.j.a(fqv.a, fqv.b, this.t);
            zke zke3 = this.b;
            if (zke3 == null) {
                akcr.a(str);
            }
            zke3.a(new fsm(true));
            Object a = this.r.a(fqv.a.b(agii.ORIGINAL));
            akcr.a(a, "imagePreloader.preloadIm…(ImageSizeType.ORIGINAL))");
            ajvv.a((ajej) a, this.c);
            a = this.v.a(tht.g());
            akcr.a(a, "checkoutCartUtils.getCheckoutCart(product.storeId)");
            zke3 = this.b;
            if (zke3 == null) {
                akcr.a(str);
            }
            zke3.a(new fpx(a));
            zke3 = this.b;
            if (zke3 == null) {
                akcr.a(str);
            }
            zke3.a(new fqu(a));
            if (this.t.b()) {
                i = tid.d(tht, this.t.c());
            }
            zke zke4 = this.b;
            if (zke4 == null) {
                akcr.a(str);
            }
            h = tht.h();
            akcr.a(h, "product.imageUrlStrings");
            zke4.a(new fqw(h, i));
            this.g.a(fqv.a);
        } else if (frm instanceof fqw) {
            fqw fqw = (fqw) frm;
            flk flk = this.h;
            if (flk == null) {
                akcr.a("productInfoImageViewController");
            }
            flk.a(fqw.a, fqw.b);
        } else if (frm instanceof fqu) {
            fqu fqu = (fqu) frm;
            this.q = fqu.a;
            this.p = fqu.a.b();
            ajej a2 = fqu.a.n().a((ajdw) this.d.f()).a((ajfb) new e(this), (ajfb) f.a);
            akcr.a((Object) a2, "event.checkoutCart.check… update checkout cart\")})");
            ajvv.a(a2, this.c);
            for (Object h2 : fqu.a.d()) {
                tha tha = this.r;
                akcr.a(h2, "product");
                h2 = tha.a(h2.a().b(agii.SMALL));
                akcr.a(h2, "imagePreloader.preloadIm…rls(ImageSizeType.SMALL))");
                ajvv.a((ajej) h2, this.c);
            }
        } else if (frm instanceof frc) {
            zke = this.b;
            if (zke == null) {
                akcr.a(str);
            }
            zke.a(fqd.a);
            e = ajcx.a((Runnable) new i(this)).b((ajdw) this.d.f()).e();
            akcr.a((Object) e, "Completable.fromRunnable…edulers.io()).subscribe()");
            ajvv.a(e, this.c);
            thy thy = this.p;
            if (thy != null) {
                e = this.w.a(thy).b((ajdw) this.d.f()).a((ajdw) this.d.l()).a((ajfb) new flo(new g(this)), (ajfb) h.a);
                akcr.a((Object) e, "locationValidator.doesSh…to get user location!\") }");
                ajvv.a(e, this.c);
            }
            fiy = this.q;
            if (fiy != null && fiy.h() == 0) {
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fsl(false, false));
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fsm(true));
            }
            this.f.a(ajxw.a);
        } else if (frm instanceof fqz) {
            this.j.a();
            zke = this.b;
            if (zke == null) {
                akcr.a(str);
            }
            zke.a(fqh.a);
        } else if (frm instanceof fpw) {
            this.j.b(this.t);
        } else if (frm instanceof fqy) {
            this.j.a((fqy) frm, this.t);
        } else if (frm instanceof fqo) {
            this.j.a(this.t);
            fln fln = this;
            e = this.x.b().b((ajdw) this.d.g()).a((ajfb) new j(this), (ajfb) new flp(new k(fln)));
            akcr.a((Object) e, "paymentsApis.getAccountI…           this::onError)");
            ajvv.a(e, this.c);
            e = this.y.d().b((ajdw) this.d.g()).a((ajfb) new l(this), (ajfb) new flp(new m(fln)));
            akcr.a((Object) e, "paymentsServiceApis.getP…           this::onError)");
            ajvv.a(e, this.c);
        } else if (frm instanceof fqx) {
            e = this.j.a((fqx) frm, this.t);
            akcr.a((Object) e, "productCardController.on…t, productSelectionModel)");
            ajvv.a(e, this.c);
        } else if (frm instanceof fra) {
            zke = this.b;
            if (zke == null) {
                akcr.a(str);
            }
            zke.a(fqf.a);
        } else if (frm instanceof frb) {
            frb frb = (frb) frm;
            zke2 = this.b;
            if (zke2 == null) {
                akcr.a(str);
            }
            zke2.a(new fsj(false));
            zke2 = this.b;
            if (zke2 == null) {
                akcr.a(str);
            }
            zke2.a(new fsm(false));
            zke2 = this.b;
            if (zke2 == null) {
                akcr.a(str);
            }
            zke2.a(new fsk(false));
            fjc fjc = this.s;
            List list = frb.b;
            i2 = frb.a;
            zkf zkf = this.a;
            if (zkf == null) {
                akcr.a("pageBus");
            }
            fjc.a(list, i2, zkf);
        } else if (frm instanceof frh) {
            zke = this.b;
            if (zke == null) {
                akcr.a(str);
            }
            zke.a(new fsj(true));
            zke = this.b;
            if (zke == null) {
                akcr.a(str);
            }
            zke.a(new fsm(true));
            zke = this.b;
            if (zke == null) {
                akcr.a(str);
            }
            zke.a(new fsk(true));
        } else if (frm instanceof frl) {
            frl frl = (frl) frm;
            zke2 = this.b;
            if (zke2 == null) {
                akcr.a(str);
            }
            zke2.a(new fsq(frl.a, frl.b));
        } else if (frm instanceof fqp) {
            this.m.a(aafp.CART_ICON, aagf.PRODUCT_DETAILS.name());
            this.m.a(aafr.REVIEW_ORDER);
            fiy = this.q;
            if (fiy != null) {
                zke2 = this.b;
                if (zke2 == null) {
                    akcr.a(str);
                }
                zke2.a(new fsn(fiy.i()));
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fsm(false));
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fsl(true, true));
            }
        } else if (frm instanceof fri) {
            fri fri = (fri) frm;
            fpn fpn = fri.a;
            e = this.s.a(fpn.k, fpn.l, fri.b).e();
            akcr.a((Object) e, "navigationController.nav…vent.context).subscribe()");
            ajvv.a(e, this.c);
        } else if (frm instanceof fqs) {
            fqs fqs = (fqs) frm;
            this.m.a(aafp.GO_TO_CHECKOUT, aafr.REVIEW_ORDER.name());
            this.k.a(fqs.a, this.i);
        } else if (frm instanceof fre) {
            fre fre = (fre) frm;
            ths ths = fre.b;
            i2 = fre.a;
            if (ths != null) {
                fiy fiy2 = this.q;
                if (fiy2 != null) {
                    fiy2.a(ths, i2 + 1);
                }
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fqi());
            }
        } else if (frm instanceof frd) {
            this.k.a(((frd) frm).a);
        } else if (frm instanceof frg) {
            ths ths2 = ((frg) frm).a;
            fiy fiy3 = this.q;
            if (fiy3 != null) {
                fiy3.a(ths2, 0);
            }
            fiy = this.q;
            if (fiy != null && fiy.i()) {
                a();
            }
        } else if (frm instanceof fqt) {
            a();
        } else if (frm instanceof fqr) {
            a();
        } else if (frm instanceof fqq) {
            a();
        } else {
            if (frm instanceof frf) {
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fqi());
            }
        }
    }
}

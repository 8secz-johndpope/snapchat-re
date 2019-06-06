package defpackage;

import android.util.SparseArray;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fpt */
public final class fpt {
    public zkf a;
    public zke b;
    public final ajei c = new ajei();
    final zfw d;
    final fit e;
    public final flg f;
    private final SparseArray<fmj> g;
    private fiy h;
    private final fiw i;
    private final fjg j;
    private final fjc k;
    private final fpf l;
    private final fmu m;
    private final ftl n;
    private final tjj o;
    private final ajwy<zgb> p;

    /* renamed from: fpt$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: fpt$b */
    static final class b<T> implements ajfb<fiy> {
        private /* synthetic */ fpt a;

        b(fpt fpt) {
            this.a = fpt;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.f.a((fiy) obj);
        }
    }

    /* renamed from: fpt$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fpt$d */
    static final class d<T1, T2, T3, T4, R> implements ajfe<Boolean, Boolean, String, String, Boolean> {
        private /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            obj3 = (String) obj3;
            obj4 = (String) obj4;
            akcr.b(obj3, "prodSnapStoreId");
            akcr.b(obj4, "devSnapStoreId");
            booleanValue = booleanValue && !booleanValue2 && (akcr.a(this.a, obj3) || akcr.a(this.a, obj4));
            return Boolean.valueOf(booleanValue);
        }
    }

    /* renamed from: fpt$e */
    static final class e<T> implements ajfb<frz> {
        private /* synthetic */ fpt a;

        e(fpt fpt) {
            this.a = fpt;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (frz) obj;
            fpt fpt = this.a;
            akcr.a(obj, "it");
            if (obj instanceof fsa) {
                zke zke = fpt.b;
                if (zke == null) {
                    akcr.a("dispatcher");
                }
                fsa fsa = (fsa) obj;
                zke.a(new fql(fsa.a, fsa.b, fsa.c));
            }
        }
    }

    /* renamed from: fpt$f */
    static final class f<T> implements ajfb<Throwable> {
        public static final f a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fpt$g */
    static final class g<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ fpt a;

        g(fpt fpt) {
            this.a = fpt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx d;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (bool.booleanValue()) {
                zke zke = this.a.b;
                if (zke == null) {
                    akcr.a("dispatcher");
                }
                zke.a(new frp(this.a.d));
                d = this.a.e.d();
            } else {
                d = ajvo.a(ajhn.a);
            }
            return d;
        }
    }

    /* renamed from: fpt$h */
    public static final class h<T> implements ajfb<frm> {
        private /* synthetic */ fpt a;

        public h(fpt fpt) {
            this.a = fpt;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (frm) obj;
            fpt fpt = this.a;
            akcr.a(obj, "it");
            fpt.handleCommerceUserAction((fqa) obj);
        }
    }

    /* renamed from: fpt$i */
    public static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    public fpt(fiw fiw, fjg fjg, fjc fjc, fit fit, flg flg, fpf fpf, fmu fmu, ftl ftl, tjj tjj, ajwy<zgb> ajwy) {
        akcr.b(fiw, "commerceApis");
        akcr.b(fjg, "commerceOperaLauncher");
        akcr.b(fjc, "commerceNavigationController");
        akcr.b(fit, "commerceUserPref");
        akcr.b(flg, "cartViewController");
        akcr.b(fpf, "storeGridItemViewModelFactory");
        akcr.b(fmu, "checkoutCartUtils");
        akcr.b(ftl, "configProvider");
        akcr.b(tjj, "logger");
        akcr.b(ajwy, "schedulersProvider");
        this.i = fiw;
        this.j = fjg;
        this.k = fjc;
        this.e = fit;
        this.f = flg;
        this.l = fpf;
        this.m = fmu;
        this.n = ftl;
        this.o = tjj;
        this.p = ajwy;
        this.p.get();
        this.d = zgb.a(fiq.o.callsite("StorePresenter"));
        this.g = new SparseArray();
    }

    private final void a(int i, boolean z) {
        fmj fmj = (fmj) this.g.get(i);
        if (z) {
            fmj.b();
        } else {
            fmj.a();
        }
    }

    private final void b() {
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

    public final void a() {
        zke zke = this.b;
        String str = "dispatcher";
        if (zke == null) {
            akcr.a(str);
        }
        zke.a(fqd.a);
        fiy fiy = this.h;
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
    }

    @akqq(a = ThreadMode.MAIN)
    public final void handleCommerceUserAction(fqa fqa) {
        akcr.b(fqa, "event");
        boolean z = fqa instanceof frk;
        if (z) {
            frk frk = (frk) fqa;
            this.o.a(frk.a.c, frk.b, frk.c);
        } else if (fqa instanceof frw) {
            frw frw = (frw) fqa;
            this.o.a(frw.a, frw.b, frw.c, frw.d);
        } else if (fqa instanceof frv) {
            this.o.c();
        } else if (fqa instanceof fsc) {
            this.o.d();
        } else if (fqa instanceof fsb) {
            this.o.e();
        } else if (fqa instanceof fse) {
            fse fse = (fse) fqa;
            this.o.a(fse.a, fse.b);
        } else if (fqa instanceof fsd) {
            fsd fsd = (fsd) fqa;
            this.o.b(fsd.a, fsd.b);
        } else if (fqa instanceof fqp) {
            this.o.a(aafp.CART_ICON, aagf.STORE.name());
            this.o.a(aafr.REVIEW_ORDER);
        } else if (fqa instanceof fqs) {
            this.o.a(aafp.GO_TO_CHECKOUT, aafr.REVIEW_ORDER.name());
        } else if ((fqa instanceof fqt) || (fqa instanceof fqr) || (fqa instanceof fqq)) {
            this.o.b(aafr.REVIEW_ORDER);
        }
        String str = "dispatcher";
        ajej e;
        fiy fiy;
        zke zke;
        if (fqa instanceof fqm) {
            fqm fqm = (fqm) fqa;
            String a = fqm.a.a();
            zke zke2 = this.b;
            if (zke2 == null) {
                akcr.a(str);
            }
            zke2.a(new fqn(fqm.a));
            akcr.a((Object) a, "storeId");
            Object a2 = this.m.a(a);
            akcr.a(a2, "it");
            ajej a3 = a2.n().a((ajdw) this.d.f()).a((ajfb) new b(this), (ajfb) c.a);
            akcr.a((Object) a3, "it.checkoutCartSubject\n …checkout cart updated\")})");
            ajvv.a(a3, this.c);
            zke zke3 = this.b;
            if (zke3 == null) {
                akcr.a(str);
            }
            zke3.a(new fpx(a2));
            this.h = a2;
            a2 = fqm.a.d();
            akcr.a(a2, "event.storeInfo.storeCategories");
            int i = 0;
            for (Object obj : (Iterable) a2) {
                akcr.a(obj, "storeCategory");
                fiw fiw = this.i;
                ajei ajei = this.c;
                Object obj2 = this.p.get();
                akcr.a(obj2, "schedulersProvider.get()");
                zgb zgb = (zgb) obj2;
                Object a4 = obj.a();
                akcr.a(a4, "storeCategory.categoryId");
                flr flr = new flr(fiw, ajei, zgb, a, a4);
                Object b = obj.b();
                akcr.a(b, "storeCategory.categoryName");
                fmj fmj = new fmj(flr, a, i, b, this.l, this.c);
                a3 = fmj.a.a((ajfb) new e(this), (ajfb) f.a);
                akcr.a((Object) a3, "pageProvider.actionSourc…ider\")\n                })");
                ajvv.a(a3, this.c);
                this.g.put(i, fmj);
                a(i, false);
                i++;
            }
            Object a5 = fqm.a.a();
            akcr.a(a5, "event.storeInfo.storeID");
            a5 = ajdp.a((ajdt) this.n.p(tgt.BITMOJI_MERCH_IOS_ENABLED), (ajdt) this.e.c().i(), (ajdt) this.n.u(tgt.SNAP_STORE_PROD_STORE_ID), (ajdt) this.n.u(tgt.SNAP_STORE_TEST_STORE_ID), (ajfe) new d(a5)).e();
            akcr.a(a5, "Observable.combineLatest…          .firstOrError()");
            e = a5.a((ajdw) this.d.h()).e((ajfc) new g(this)).e();
            akcr.a((Object) e, "checkShouldShowBitmojiMe…             .subscribe()");
            ajvv.a(e, this.c);
        } else if (z) {
            frk frk2 = (frk) fqa;
            e = this.j.a(frk2.d, frk2.a).e();
            akcr.a((Object) e, "commerceOperaLauncher.la…             .subscribe()");
            ajvv.a(e, this.c);
        } else if (fqa instanceof frj) {
            a(((frj) fqa).a, false);
        } else if (fqa instanceof fry) {
            a(((fry) fqa).a, true);
        } else if (fqa instanceof fqp) {
            fiy = this.h;
            if (fiy != null) {
                zke zke4 = this.b;
                if (zke4 == null) {
                    akcr.a(str);
                }
                zke4.a(new fsn(fiy.i()));
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
        } else if (fqa instanceof fri) {
            fri fri = (fri) fqa;
            fpn fpn = fri.a;
            e = this.k.a(fpn.k, fpn.l, fri.b).e();
            akcr.a((Object) e, "commerceNavigationContro…             .subscribe()");
            ajvv.a(e, this.c);
        } else if (fqa instanceof fqs) {
            this.f.a(((fqs) fqa).a, null);
        } else if (fqa instanceof fre) {
            fre fre = (fre) fqa;
            ths ths = fre.b;
            int i2 = fre.a;
            if (ths != null) {
                fiy fiy2 = this.h;
                if (fiy2 != null) {
                    fiy2.a(ths, i2 + 1);
                }
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fqi());
            }
        } else if (fqa instanceof frd) {
            this.f.a(((frd) fqa).a);
        } else if (fqa instanceof frg) {
            ths ths2 = ((frg) fqa).a;
            fiy fiy3 = this.h;
            if (fiy3 != null) {
                fiy3.a(ths2, 0);
            }
            fiy = this.h;
            if (fiy != null && fiy.i()) {
                b();
            }
        } else if (fqa instanceof fqt) {
            b();
        } else if (fqa instanceof fqr) {
            b();
        } else if (fqa instanceof fqq) {
            b();
        } else {
            if (fqa instanceof frf) {
                zke = this.b;
                if (zke == null) {
                    akcr.a(str);
                }
                zke.a(new fqi());
            }
        }
    }
}

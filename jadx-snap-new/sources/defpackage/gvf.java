package defpackage;

import com.brightcove.player.event.EventType;
import com.snap.core.db.column.DdmlRecord;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import defpackage.guz.a;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: gvf */
public final class gvf extends zgi {
    final ajxe a;
    final ajxe b;
    final ajxe c = ajxh.a(d.a);
    final ajei d = new ajei();
    final ftl e;

    /* renamed from: gvf$a */
    static final class a extends akcq implements akbk<guj> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (guj) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: gvf$d */
    static final class d extends akcs implements akbk<Random> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Random();
        }
    }

    /* renamed from: gvf$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(gus.a, "DdmlSampleLifeCycleObserver");
        }
    }

    /* renamed from: gvf$c */
    static final class c implements ajev {
        private /* synthetic */ gvf a;

        c(gvf gvf) {
            this.a = gvf;
        }

        public final void run() {
            this.a.d.a();
        }
    }

    /* renamed from: gvf$b */
    static final class b implements ajev {
        final /* synthetic */ gvf a;

        /* renamed from: gvf$b$3 */
        static final class 3<T, R> implements ajfc<Boolean, ajdb> {
            private /* synthetic */ b a;

            3(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                int i;
                akcr.b((Boolean) obj, "it");
                String str = "B";
                String str2 = "A";
                String str3 = "enum1";
                gvh gvh = new gvh(str3, new String[]{str2, str, "C"}, new double[]{0.3d, 0.7d});
                String str4 = "bool1";
                gvc gvc = new gvc(str4);
                String str5 = "double1";
                gvg gvg = new gvg(str5);
                r12 = new gvd[3];
                int i2 = 0;
                r12[0] = gvh;
                r12[1] = gvc;
                r12[2] = gvg;
                Object gve = new gve(r12);
                adsy adsy = new adsy();
                adsy.a = new adsx();
                adsw adsw = new adsw();
                adsw.b();
                adta adta = new adta();
                new adtf().a(str4).a(new adsm());
                adta.a = new adtf[]{r14};
                adta adta2 = new adta();
                adtf adtf = new adtf();
                adsp adsp = new adsp();
                adsp.a = new double[]{0.0d, 10.0d};
                adtf.a(str5).a(adsp);
                adta2.a = new adtf[]{adtf};
                adta adta3 = new adta();
                adtf adtf2 = new adtf();
                adsq adsq = new adsq();
                adsq.a = new String[]{str2, str};
                adsq.b();
                adtf2.a(str3).a(adsq);
                adta3.a = new adtf[]{adtf2};
                adsw.a = new adta[]{adta, adta2, adta3};
                adsw.e();
                Object obj2 = adsy.a;
                akcr.a(obj2, "ddmlModelSpecAndParams.model");
                obj2.a(adsw);
                adsu adsu = new adsu();
                adsu.a = new double[]{0.1d, -0.2d, 0.5d, 0.3d, -0.4d};
                adsy.b = adsu;
                Random random = (Random) this.a.a.c.b();
                str2 = "ddmlRecordConfig";
                akcr.b(gve, str2);
                String str6 = "ddmlModelSpecAndParams";
                akcr.b(adsy, str6);
                str4 = "random";
                akcr.b(random, str4);
                akcr.b(gve, str2);
                akcr.b(adsy, str6);
                akcr.b(random, str4);
                DdmlRecord[] ddmlRecordArr = new DdmlRecord[1];
                for (i = 0; i <= 0; i++) {
                    ddmlRecordArr[0] = new DdmlRecord();
                }
                i = 0;
                while (true) {
                    String str7 = "Assertion failed";
                    Object obj3;
                    if (i <= 0) {
                        String str8;
                        Object obj4 = ddmlRecordArr[i2];
                        akcr.b(obj4, "ddmlRecord");
                        akcr.b(gve, str2);
                        akcr.b(random, str4);
                        gvd[] gvdArr = gve.a;
                        int length = gvdArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            gvd[] gvdArr2;
                            gvd gvd = gvdArr[i3];
                            if (gvd instanceof gvh) {
                                gvh gvh2 = (gvh) gvd;
                                String str9 = gvh2.a;
                                int i4 = (gvh2.b.length == 0 ? 1 : 0) ^ 1;
                                if (ajxy.a && i4 == 0) {
                                    throw new AssertionError(str7);
                                }
                                str8 = str2;
                                Object obj5 = gvh2.c.length == gvh2.b.length + -1 ? 1 : null;
                                if (ajxy.a && obj5 == null) {
                                    throw new AssertionError(str7);
                                }
                                String str10;
                                double nextDouble = random.nextDouble();
                                for (i4 = gvh2.c.length - 1; i4 >= 0; i4--) {
                                    if (nextDouble > gvh2.c[i4]) {
                                        str10 = gvh2.b[i4 + 1];
                                        break;
                                    }
                                }
                                str10 = gvh2.b[0];
                                obj4.set(str9, str10);
                            } else {
                                str8 = str2;
                                if (gvd instanceof gvc) {
                                    obj4.set(((gvc) gvd).a, random.nextDouble() <= 0.6d);
                                } else if (gvd instanceof gvg) {
                                    obj3 = gve;
                                    gvdArr2 = gvdArr;
                                    obj4.set(((gvg) gvd).a, random.nextDouble() * 10.0d);
                                    i3++;
                                    gve = obj3;
                                    gvdArr = gvdArr2;
                                    str2 = str8;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            obj3 = gve;
                            gvdArr2 = gvdArr;
                            i3++;
                            gve = obj3;
                            gvdArr = gvdArr2;
                            str2 = str8;
                        }
                        str8 = str2;
                        obj3 = gve;
                        i++;
                        str2 = str8;
                        i2 = 0;
                    } else {
                        double[] a = a.a(adsy, ddmlRecordArr);
                        obj3 = a.length == 1 ? 1 : null;
                        if (ajxy.a && obj3 == null) {
                            throw new AssertionError(str7);
                        }
                        for (int i5 = 0; i5 <= 0; i5++) {
                            ddmlRecordArr[0].set(EventType.RESPONSE, random.nextDouble() < a[0]);
                        }
                        return ((guj) this.a.a.a.b()).a("sample1", ddmlRecordArr[0]);
                    }
                }
            }
        }

        /* renamed from: gvf$b$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object call() {
                return Boolean.valueOf(this.a.a.e.a((fth) gup.ENABLE_DDML_DATA_GENERATION));
            }
        }

        /* renamed from: gvf$b$2 */
        static final class 2<T> implements ajfl<Boolean> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "shouldCollect");
                return bool.booleanValue();
            }
        }

        b(gvf gvf) {
            this.a = gvf;
        }

        public final void run() {
            this.a.d.a(ajdx.c((Callable) new 1(this)).b((ajdw) ((zfw) this.a.b.b()).f()).a((ajfl) 2.a).e(new 3(this)).e());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gvf.class), "ddmlRecordPersistence", "getDdmlRecordPersistence()Lcom/snap/ddml/api/DdmlRecordPersistence;"), new akdc(akde.a(gvf.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(gvf.class), "random", "getRandom()Ljava/util/Random;")};
    }

    public gvf(ajwy<guj> ajwy, zgb zgb, zgk<b> zgk, ftl ftl) {
        akcr.b(ajwy, "ddmlRecordPersistenceProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(ftl, "compositeConfigurationProvider");
        super(zgk);
        this.e = ftl;
        this.a = ajxh.a(new a(ajwy));
        this.b = ajxh.a(new e(zgb));
    }

    public final ajej a() {
        Object a = ajek.a((ajev) new b(this));
        akcr.a(a, "Disposables.fromAction {…  .subscribe())\n        }");
        return a;
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction { disposable.clear() }");
        return a;
    }
}

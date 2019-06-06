package defpackage;

import com.google.common.base.Supplier;
import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.kqe.t;
import defpackage.ksm.a;
import defpackage.mjf.b;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: krh */
public final class krh implements ksr {
    Supplier<iha> a;
    private final kre b;

    /* renamed from: krh$i */
    static final class i extends akcq implements akbl<kst, aajt> {
        i(krh krh) {
            super(1, krh);
        }

        public final String getName() {
            return "filterLensSwipe";
        }

        public final akej getOwner() {
            return akde.a(krh.class);
        }

        public final String getSignature() {
            return "filterLensSwipe$lenses_analytics_core_release(Lcom/snap/lenses/analytics/reporter/LensReport;)Lcom/snapchat/analytics/types/EventBase;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String b;
            kst kst = (kst) obj;
            akcr.b(kst, "p1");
            krh krh = (krh) this.receiver;
            akcr.b(kst, "lensReport");
            aapq aanw = kst.x ? new aanw() : new aalz();
            aanw.a(kst.j);
            aanw.i(Long.valueOf(kst.c));
            aanw.h(Long.valueOf(kst.b));
            aanw.g(Double.valueOf(krh.a(kst.g)));
            aanw.d(Double.valueOf(krh.a(kst.h)));
            aanw.c(Double.valueOf(krh.a(kst.i)));
            aanw.j(Long.valueOf(1));
            aanw.e(kst.f);
            aanw.e(Long.valueOf(kst.p));
            aanw.d(Long.valueOf(kst.o));
            aanw.d(Long.valueOf(kst.o));
            aanw.c(kst.t);
            if ((kst.n.isEmpty() ^ 1) != 0) {
                b = ((iha) krh.a.get()).b(kst.n);
                akcr.a((Object) b, "serializationHelper.get(…ort.expressionToCountMap)");
            } else {
                b = "{}";
            }
            aanw.d(b);
            aanw.f(kst.w);
            aanw.g(kst.v);
            Double d = kst.F;
            if (d == null) {
                d = kst.y;
            }
            aanw.e(d);
            d = kst.G;
            if (d == null) {
                d = kst.z;
            }
            aanw.f(d);
            Double d2 = null;
            Long l;
            double longValue;
            Double d3;
            if (kst.x) {
                aanw aanw2 = (aanw) aanw;
                aanw2.a(kst.a.a.a);
                aanw2.a(kst.k);
                aanw2.b(Long.valueOf(kst.d));
                l = kst.r;
                if (l != null) {
                    longValue = (double) l.longValue();
                    Double.isNaN(longValue);
                    d2 = Double.valueOf(longValue / 1000.0d);
                }
                aanw2.a(d2);
                d3 = kst.E;
                if (d3 == null) {
                    d3 = kst.q;
                }
                aanw2.b(d3);
                aanw2.c(Long.valueOf(kst.s));
                aanw2.a(Long.valueOf(0));
                aanw2.a(kst.e);
                aanw2.a(Boolean.valueOf(kst.u));
                aanw2.b(kst.a.s.b);
            } else {
                aalz aalz = (aalz) aanw;
                aalz.a(kst.a.a.a);
                aalz.a(kst.k);
                aalz.b(Long.valueOf(kst.d));
                l = kst.r;
                if (l != null) {
                    longValue = (double) l.longValue();
                    Double.isNaN(longValue);
                    d2 = Double.valueOf(longValue / 1000.0d);
                }
                aalz.a(d2);
                d3 = kst.E;
                if (d3 == null) {
                    d3 = kst.q;
                }
                aalz.b(d3);
                aalz.c(Long.valueOf(kst.s));
                aalz.a(Long.valueOf(0));
                aalz.a(kst.e);
                aalz.a(Boolean.valueOf(kst.u));
            }
            return aanw;
        }
    }

    /* renamed from: krh$e */
    static final class e extends akcq implements akbl<kst, aajt> {
        e(krh krh) {
            super(1, krh);
        }

        public final String getName() {
            return "lensCameraFlip";
        }

        public final akej getOwner() {
            return akde.a(krh.class);
        }

        public final String getSignature() {
            return "lensCameraFlip$lenses_analytics_core_release(Lcom/snap/lenses/analytics/reporter/LensReport;)Lcom/snapchat/analytics/types/EventBase;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            kst kst = (kst) obj;
            akcr.b(kst, "p1");
            akcr.b(kst, "lensReport");
            aape aaoa = kst.x ? new aaoa() : new aapd();
            if (kst.x) {
                aaoa aaoa2 = (aaoa) aaoa;
                aaoa2.a(kst.a.a.a);
                aaoa2.a(kst.k);
                aaoa2.a(Long.valueOf(kst.d));
                aaoa2.a(Double.valueOf(krh.a(kst.g)));
                aaoa2.b(kst.f);
                aaoa2.a(kst.l);
                aaoa2.a(Boolean.valueOf(kst.m));
            } else {
                aapd aapd = (aapd) aaoa;
                aapd.a(kst.a.a.a);
                aapd.a(kst.k);
                aapd.a(Long.valueOf(kst.d));
                aapd.a(Double.valueOf(krh.a(kst.g)));
                aapd.b(kst.f);
                aapd.a(kst.l);
                aapd.a(Boolean.valueOf(kst.m));
            }
            return aaoa;
        }
    }

    /* renamed from: krh$g */
    static final class g extends akcs implements akbk<aalx> {
        private /* synthetic */ krh a;
        private /* synthetic */ String b;
        private /* synthetic */ long c;
        private /* synthetic */ long d;
        private /* synthetic */ long e;

        g(krh krh, String str, long j, long j2, long j3) {
            this.a = krh;
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = j3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String str = this.b;
            long j = this.c;
            long j2 = this.d;
            long j3 = this.e;
            akcr.b(str, DiscoverStorySnapModel.LENSID);
            aalx aalx = new aalx();
            aalx.a(str);
            aalx.a(Double.valueOf(krh.a(j)));
            aalx.b(Long.valueOf(j3));
            aalx.a(Long.valueOf(j2));
            return aalx;
        }
    }

    /* renamed from: krh$a */
    static final class a extends akcs implements akbk<aajt> {
        private /* synthetic */ akbl a;
        private /* synthetic */ kst b;

        a(akbl akbl, kst kst) {
            this.a = akbl;
            this.b = kst;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return (aajt) this.a.invoke(this.b);
        }
    }

    /* renamed from: krh$b */
    static final class b extends akcs implements akbk<aanu> {
        private /* synthetic */ krh a;
        private /* synthetic */ ksm b;

        b(krh krh, ksm ksm) {
            this.a = krh;
            this.b = ksm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ksm ksm = this.b;
            akcr.b(ksm, "carouselReport");
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();
            for (a aVar : ksm.c) {
                Object format;
                String str = "java.lang.String.format(locale, format, *args)";
                String str2 = "Locale.US";
                if (((defpackage.ksm.b) ksm.d.get(aVar.a)) != null) {
                    Object obj = Locale.US;
                    akcr.a(obj, str2);
                    format = String.format(obj, "%d~%s~%.01f~%.01f", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.c), r7.a, Double.valueOf(krh.a(r7.b)), Double.valueOf(krh.a(r7.c))}, 4));
                    akcr.a(format, str);
                    if ((((CharSequence) stringBuilder).length() > 0 ? 1 : null) != null) {
                        stringBuilder.append(',');
                    }
                    stringBuilder.append(format);
                }
                if ((((CharSequence) stringBuilder2).length() > 0 ? 1 : null) != null) {
                    stringBuilder2.append(',');
                }
                format = Locale.US;
                akcr.a(format, str2);
                Object format2 = String.format(format, "%d~%s~%d", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.c), r6, Integer.valueOf(aVar.b ^ 1)}, 3));
                akcr.a(format2, str);
                stringBuilder2.append(format2);
            }
            aanu aanu = new aanu();
            aanu.a(ksm.a);
            aanu.b(stringBuilder.toString());
            aanu.c(stringBuilder2.toString());
            aanu.a(Double.valueOf(krh.a(ksm.b)));
            aanu.a(ksm.e);
            aanu.a(aapb.INSTANT_ACTIVATION);
            return aanu;
        }
    }

    /* renamed from: krh$d */
    static final class d extends akcs implements akbk<aapg> {
        private /* synthetic */ krh a;
        private /* synthetic */ kqi b;
        private /* synthetic */ b c;

        d(krh krh, kqi kqi, b bVar) {
            this.a = krh;
            this.b = kqi;
            this.c = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aaob aaob;
            kqi kqi = this.b;
            b.a aVar = (b.a) this.c;
            akcr.b(kqi, "analyticsSession");
            akcr.b(aVar, "coreEvent");
            if (kqi.h) {
                aaob = new aaob();
                aaob.a(kqi.a);
            } else {
                aaob = new aapf();
                aaob.a(kqi.a);
            }
            aapg aapg = aaob;
            aapg.c(Long.valueOf(aVar.e ? 1 : 0));
            aapg.b(kqi.k.a());
            aapg.c(aVar.a);
            aapg.d(aVar.c);
            aapg.a(Long.valueOf((long) aVar.b));
            aapg.b(Long.valueOf((long) aVar.d));
            return aapg;
        }
    }

    /* renamed from: krh$f */
    static final class f extends akcs implements akbk<aajt> {
        private /* synthetic */ krh a;
        private /* synthetic */ krp b;

        f(krh krh, krp krp) {
            this.a = krh;
            this.b = krp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            aanx aanx;
            krp krp = this.b;
            akcr.b(krp, "optionReport");
            if (krp.i) {
                aanx = new aanx();
                aanx.c(krp.g);
                aanx.b(krp.a);
                aanx.a(krp.e);
                aanx.a(Long.valueOf(krp.f));
                aanx.a(krp.h);
            } else {
                aanx = new aapn();
                aanx.c(krp.g);
                aanx.b(krp.a);
                aanx.a(krp.e);
                aanx.a(Long.valueOf(krp.f));
                aanx.a(krp.h);
            }
            abgb abgb = aanx;
            abgb.g(Double.valueOf(krh.a(krp.d)));
            abgb.i(Long.valueOf(krp.c));
            abgb.h(Long.valueOf(krp.b));
            return abgb;
        }
    }

    /* renamed from: krh$c */
    static final class c extends akcq implements akbl<kst, aank> {
        c(krh krh) {
            super(1, krh);
        }

        public final String getName() {
            return "createGeofilterAttachmentView";
        }

        public final akej getOwner() {
            return akde.a(krh.class);
        }

        public final String getSignature() {
            return "createGeofilterAttachmentView$lenses_analytics_core_release(Lcom/snap/lenses/analytics/reporter/LensReport;)Lcom/snapchat/analytics/types/GeofilterAttachmentView;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            kst kst = (kst) obj;
            akcr.b(kst, "p1");
            akcr.b(kst, "lensReport");
            aank aank = new aank();
            aank.a(kst.a.a.toString());
            aank.b(kst.f);
            aank.a(abbd.LENS);
            Float f = kst.B;
            aank.a(f != null ? Double.valueOf((double) f.floatValue()) : null);
            aank.a(kst.e);
            if (aank.a() == aasc.DEEP_LINK_ATTACHMENT) {
                aapc aapc = akcr.a(kst.C, Boolean.TRUE) ? aapc.STORE_OPENED : akcr.a(kst.D, Boolean.TRUE) ? aapc.WEBVIEW_OPENED : aapc.APP_OPENED;
                aank.a(aapc);
            }
            return aank;
        }
    }

    /* renamed from: krh$h */
    static final class h extends akcq implements akbl<kst, aajt> {
        h(krh krh) {
            super(1, krh);
        }

        public final String getName() {
            return "filterLensSpin";
        }

        public final akej getOwner() {
            return akde.a(krh.class);
        }

        public final String getSignature() {
            return "filterLensSpin$lenses_analytics_core_release(Lcom/snap/lenses/analytics/reporter/LensReport;)Lcom/snapchat/analytics/types/EventBase;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            kst kst = (kst) obj;
            akcr.b(kst, "p1");
            akcr.b(kst, "lensReport");
            aapq aanv = kst.x ? new aanv() : new aaly();
            aanv.i(Long.valueOf(kst.c));
            aanv.h(Long.valueOf(kst.b));
            aanv.g(Double.valueOf(krh.a(kst.g)));
            aanv.d(Double.valueOf(krh.a(kst.h)));
            aanv.j(Long.valueOf(1));
            aanv.e(kst.f);
            aanv.a(kst.j);
            aanv.c(Double.valueOf(0.0d));
            aanv.c(kst.t);
            if (kst.x) {
                aanv aanv2 = (aanv) aanv;
                aanv2.a(kst.a.a.a);
                aanv2.b(Long.valueOf(kst.d));
                aanv2.a(kst.k);
                aanv2.a(Long.valueOf(0));
                aanv2.c(Long.valueOf(kst.s));
                aanv2.b(kst.a.s.b);
            } else {
                aaly aaly = (aaly) aanv;
                aaly.a(kst.a.a.a);
                aaly.b(Long.valueOf(kst.d));
                aaly.a(kst.k);
                aaly.a(Long.valueOf(0));
                aaly.c(Long.valueOf(kst.s));
            }
            return aanv;
        }
    }

    public krh(kre kre, Supplier<iha> supplier) {
        akcr.b(kre, "eventLogger");
        akcr.b(supplier, "serializationHelper");
        this.b = kre;
        this.a = supplier;
    }

    public static double a(long j) {
        double d = (double) (j / 100);
        Double.isNaN(d);
        return d / 10.0d;
    }

    private final void a(akbl<? super kst, ? extends aajt> akbl, kst kst) {
        this.b.a(new a(akbl, kst));
    }

    public final void a(String str, long j, long j2, long j3) {
        String str2 = str;
        akcr.b(str, DiscoverStorySnapModel.LENSID);
        this.b.a(new g(this, str2, j, j2, j3));
    }

    public final void a(kqi kqi) {
        akcr.b(kqi, "sessionData");
    }

    public final void a(kqi kqi, t tVar) {
        akcr.b(kqi, "sessionData");
        akcr.b(tVar, "event");
        b bVar = tVar.b;
        if (bVar instanceof b.a) {
            this.b.a(new d(this, kqi, bVar));
        }
    }

    public final void a(krp krp) {
        akcr.b(krp, "optionReport");
        this.b.a(new f(this, krp));
    }

    public final void a(ksm ksm) {
        akcr.b(ksm, "carouselReport");
        this.b.a(new b(this, ksm));
    }

    public final void a(kst kst) {
        akcr.b(kst, "lensReport");
        a((akbl) new i(this), kst);
    }

    public final void b(kst kst) {
        akcr.b(kst, "lensReport");
        a((akbl) new e(this), kst);
    }

    public final void c(kst kst) {
        akcr.b(kst, "lensReport");
        a((akbl) new h(this), kst);
    }

    public final void d(kst kst) {
        akcr.b(kst, "lensReport");
        a((akbl) new c(this), kst);
    }
}

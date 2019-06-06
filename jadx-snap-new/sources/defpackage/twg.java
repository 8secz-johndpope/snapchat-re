package defpackage;

import defpackage.twi.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: twg */
public final class twg implements toe {
    final ajwy<tzq> a;
    final ajwy<txi> b;
    final tvd c;
    private final ajei d = new ajei();
    private final String e = "PreviewMotionControllerPreloader";
    private final tpl f;
    private final ajdp<tpd> g;
    private final ajdp<Boolean> h;
    private final ajwy<twi> i;
    private final toi j;

    /* renamed from: twg$a */
    final class a implements toh {

        /* renamed from: twg$a$a */
        static final class a extends akcs implements akbl<aaim, String> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                aaim aaim = (aaim) obj;
                akcr.b(aaim, "it");
                return aaim.aB();
            }
        }

        /* renamed from: twg$a$b */
        static final class b extends akcs implements akbl<aaim, String> {
            public static final b a = new b();

            b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                aaim aaim = (aaim) obj;
                akcr.b(aaim, "it");
                return aaim.aA();
            }
        }

        public final void a(aaim aaim, akez<? extends aaim> akez) {
            akcr.b(aaim, "directSnapPreview");
            akcr.b(akez, "segmentEvents");
            if (aaim.aB() == null) {
                aaim.z((String) akfh.b(akfh.c(akez, a.a)));
            }
            if (aaim.aA() == null) {
                aaim.y((String) akfh.b(akfh.c(akez, b.a)));
            }
        }

        public final void a(iip iip) {
            akcr.b(iip, "previewAnalyticsWrapper");
            tob tob = twg.this.c.j;
            for (aaim aaim : iip.a()) {
                aaim.z(tob.a);
                aaim.y(tob.b);
            }
        }
    }

    /* renamed from: twg$b */
    static final class b<T> implements ajfb<a> {
        private /* synthetic */ twg a;

        b(twg twg) {
            this.a = twg;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            ((txi) this.a.b.get()).m().a(Float.valueOf(aVar.a));
            tzq tzq = (tzq) this.a.a.get();
            float f = aVar.a;
            Collection arrayList = new ArrayList();
            for (Object next : tzq.b.b()) {
                if (((tyw) next).k()) {
                    arrayList.add(next);
                }
            }
            Collection arrayList2 = new ArrayList();
            for (tyw Z_ : (List) arrayList) {
                uab uab = (uab) tzq.a.get(Z_.Z_());
                if (uab != null) {
                    arrayList2.add(uab);
                }
            }
            for (Object obj2 : (List) arrayList2) {
                akcr.a(obj2, "tool");
                obj2.setRotation(f);
            }
        }
    }

    /* renamed from: twg$c */
    static final class c<T> implements ajfb<tpd> {
        private /* synthetic */ twi a;

        c(twi twi) {
            this.a = twi;
        }

        public final /* synthetic */ void accept(Object obj) {
            tpd tpd = (tpd) obj;
            if (tpd != null) {
                int i = twh.a[tpd.ordinal()];
                if (i == 1 || i == 2) {
                    this.a.b.a(true);
                    return;
                }
                if (i == 3) {
                    this.a.b.a(false);
                }
            }
        }
    }

    /* renamed from: twg$d */
    static final class d<T> implements ajfb<Boolean> {
        private /* synthetic */ twi a;

        d(twi twi) {
            this.a = twi;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            twi twi;
            if (obj.booleanValue()) {
                twi = this.a;
                twi.b.a((abqm) twi);
                return;
            }
            twi = this.a;
            twi.b.b(twi);
        }
    }

    public twg(tpl tpl, ajdp<tpd> ajdp, ajdp<Boolean> ajdp2, ajwy<tzq> ajwy, ajwy<txi> ajwy2, ajwy<twi> ajwy3, tvd tvd, toi toi) {
        akcr.b(tpl, "previewStartUpConfig");
        akcr.b(ajdp, "previewControlEventObservable");
        akcr.b(ajdp2, "previewVisibleObservable");
        akcr.b(ajwy, "previewEditLayerControllerProvider");
        akcr.b(ajwy2, "previewMediaPlayerProvider");
        akcr.b(ajwy3, "previewMotionEventControllerProvider");
        akcr.b(tvd, "previewDataSource");
        akcr.b(toi, "analyticsProviderStorage");
        this.f = tpl;
        this.g = ajdp;
        this.h = ajdp2;
        this.a = ajwy;
        this.b = ajwy2;
        this.i = ajwy3;
        this.c = tvd;
        this.j = toi;
    }

    public final ajej start() {
        if (tpt.a(this.f)) {
            this.j.a(new a());
            twi twi = (twi) this.i.get();
            igk.a(twi.a.f((ajfb) new b(this)), this.d);
            igk.a(this.g.f((ajfb) new c(twi)), this.d);
            igk.a(this.h.j(ajfu.a).f((ajfb) new d(twi)), this.d);
            return this.d;
        }
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        return obj;
    }
}

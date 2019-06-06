package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: acmy */
public final class acmy {
    public final igw a;
    public long b;
    public final acnf c;
    final nce d;
    private final ajxe e = ajxh.a(new e(this));
    private final dis f;

    /* renamed from: acmy$a */
    public static final class a<T> implements ajfb<ajxm<? extends addm, ? extends Integer>> {
        private /* synthetic */ acmy a;

        public a(acmy acmy) {
            this.a = acmy;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            addm addm = (addm) ajxm.a;
            int intValue = ((Number) ajxm.b).intValue();
            acmy acmy = this.a;
            aaqn aaqn = new aaqn();
            aaqn.a(Long.valueOf(this.a.b));
            aaqn.a(addm.c);
            aaqn.b(Long.valueOf((long) intValue));
            aaqn.a(Boolean.valueOf(this.a.d.b()));
            acmy.f.a(aaqn);
        }
    }

    /* renamed from: acmy$b */
    static final class b<T> implements ajfb<ajxm<? extends addm, ? extends Integer>> {
        private /* synthetic */ acmy a;
        private /* synthetic */ String b;

        b(acmy acmy, String str) {
            this.a = acmy;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            addm addm = (addm) ajxm.a;
            int intValue = ((Number) ajxm.b).intValue();
            acmy acmy = this.a;
            aaqo aaqo = new aaqo();
            aaqo.a(Long.valueOf(this.a.b));
            aaqo.a(addm.c);
            aaqo.b(Long.valueOf((long) intValue));
            aaqo.b(this.b);
            aaqo.a(Boolean.valueOf(this.a.d.b()));
            acmy.f.a(aaqo);
        }
    }

    /* renamed from: acmy$c */
    static final class c<T> implements ajfb<ajxm<? extends addm, ? extends Integer>> {
        private /* synthetic */ acmy a;
        private /* synthetic */ aaqp b;
        private /* synthetic */ double c;
        private /* synthetic */ String d;

        c(acmy acmy, aaqp aaqp, double d, String str) {
            this.a = acmy;
            this.b = aaqp;
            this.c = d;
            this.d = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            addm addm = (addm) ajxm.a;
            int intValue = ((Number) ajxm.b).intValue();
            acmy acmy = this.a;
            aaqq aaqq = new aaqq();
            aaqq.a(Long.valueOf(this.a.b));
            aaqq.a(addm.c);
            aaqq.a(this.b);
            aaqq.b(Long.valueOf((long) intValue));
            aaqq.a(Double.valueOf(this.c));
            aaqq.b(this.d);
            aaqq.a(Boolean.valueOf(this.a.d.b()));
            acmy.f.a(aaqq);
        }
    }

    /* renamed from: acmy$d */
    public static final class d<T> implements ajfb<addm> {
        private /* synthetic */ acmy a;

        public d(acmy acmy) {
            this.a = acmy;
        }

        public final /* synthetic */ void accept(Object obj) {
            addm addm = (addm) obj;
            acmy acmy = this.a;
            aaqr aaqr = new aaqr();
            aaqr.a(Long.valueOf(this.a.b));
            aaqr.a(addm.c);
            aaqr.a(Boolean.valueOf(this.a.d.b()));
            acmy.f.a(aaqr);
        }
    }

    /* renamed from: acmy$e */
    static final class e extends akcs implements akbk<ajdp<ajxm<? extends addm, ? extends Integer>>> {
        private /* synthetic */ acmy a;

        e(acmy acmy) {
            this.a = acmy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajwa.a(this.a.c.b(), this.a.c.c);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acmy.class), "statusScoreObservable", "getStatusScoreObservable()Lio/reactivex/Observable;");
    }

    public acmy(dis dis, acnf acnf, nce nce, ajei ajei) {
        akcr.b(dis, "eventLogger");
        akcr.b(acnf, "eggHuntReactiveModel");
        akcr.b(nce, "locationPreferences");
        akcr.b(ajei, "activityDisposable");
        this.f = dis;
        this.c = acnf;
        this.d = nce;
        igw igw = new igw();
        ajei.a((ajej) igw);
        this.a = igw;
    }

    public final ajdp<ajxm<addm, Integer>> a() {
        return (ajdp) this.e.b();
    }

    public final void a(String str, aaqp aaqp, double d) {
        akcr.b(str, "markerId");
        akcr.b(aaqp, MapboxEvent.KEY_RESOLUTION);
        igk.a(a().e().e((ajfb) new c(this, aaqp, d, str)), this.a);
    }
}

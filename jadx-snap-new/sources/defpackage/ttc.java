package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ttc */
public final class ttc {
    public String a;
    public aalt b;
    public aalt c;
    public abaw d;
    public aasc e;
    public zmy f;
    public int g;
    public boolean h;
    public boolean i;
    public final List<Long> j = new ArrayList();
    public final Set<String> k = new LinkedHashSet();
    public final iis l;
    private int m;
    private int n;
    private final ajxe o;
    private final ajxe p;
    private final iiy q;

    /* renamed from: ttc$a */
    static final class a extends akcs implements akbk<dib> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (dib) this.a.get();
        }
    }

    /* renamed from: ttc$b */
    static final class b extends akcs implements akbk<twd> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (twd) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ttc.class), "blizzardEventLogger", "getBlizzardEventLogger()Lcom/snap/blizzard/BlizzardEventLogger;"), new akdc(akde.a(ttc.class), "previewMetricsPlugin", "getPreviewMetricsPlugin()Lcom/snap/preview/metrics/PreviewMetricsPlugin;")};
    }

    public ttc(ajwy<dib> ajwy, ajwy<twd> ajwy2, ihh ihh) {
        akcr.b(ajwy, "blizzardEventLoggerProvider");
        akcr.b(ajwy2, "previewMetricsPluginProvider");
        akcr.b(ihh, "clock");
        this.o = ajxh.a(new a(ajwy));
        this.p = ajxh.a(new b(ajwy2));
        this.q = new iiy(ihh);
        this.l = new iis(ihh);
    }

    private final void a(int i, zmy zmy) {
        if (zmy instanceof ilj) {
            iiy iiy = this.q;
            Object a = ((ilj) zmy).c.a();
            akcr.a(a, "currentFilter.geofilterResponse.id");
            iiy.a(a, (long) i);
        }
    }

    private final void a(abzy abzy, iix iix) {
        double d;
        aans aans = new aans();
        aans.a(abzy.a());
        String str = this.a;
        if (str == null) {
            akcr.a("sessionId");
        }
        aans.b(str);
        aans.a(this.d);
        aans.a(this.e);
        aans.c(abzy.i());
        aans.a(this.c);
        aans.h(Long.valueOf(iix.b));
        aans.i(Long.valueOf((long) this.n));
        aans.j(Long.valueOf(1));
        List a = iix.a.a();
        if (a.isEmpty()) {
            d = 0.0d;
        } else {
            d = (double) ((Number) ajyu.h(a)).longValue();
            Double.isNaN(d);
            d /= 1000.0d;
        }
        aans.g(Double.valueOf(d));
        b().a((aajt) aans);
        ahyr h = abzy.h();
        if (h != null) {
            String str2 = h.a;
            if (str2 != null) {
                a().b(str2);
            }
        }
    }

    private final dib b() {
        return (dib) this.o.b();
    }

    public final twd a() {
        return (twd) this.p.b();
    }

    public final void a(int i, zmy zmy, int i2, int i3) {
        akcr.b(zmy, "viewModel");
        this.n = i3;
        if (this.m != i) {
            this.j.add(Long.valueOf(zmy.getId()));
            if (zmy instanceof ilj) {
                Set set = this.k;
                Object a = ((ilj) zmy).c.a();
                akcr.a(a, "viewModel.geofilterResponse.id");
                set.add(a);
            }
            boolean z = zmy instanceof tui;
            if (z && ((tui) zmy).a != acae.UNFILTERED) {
                this.h = true;
            }
            if (z && acae.SKY_FILTER_TYPES.contains(((tui) zmy).a)) {
                this.i = true;
            }
            a(this.f);
            a(i2, zmy);
        }
        this.m = i;
        this.f = zmy;
    }

    public final void a(zmy zmy) {
        if (zmy instanceof ilj) {
            zmy = this.f;
            if (zmy != null) {
                abzy abzy = ((ilj) zmy).c;
                Object a = abzy.a();
                akcr.a(a, "geofilterResponse.id");
                iix a2 = this.q.a(a);
                if (a2 != null) {
                    this.l.a(new iiw(new iiv(a, abzy.q(), a2.a.a(), a2.b, (byte) 0), abzy.i()));
                    a(abzy, a2);
                    return;
                }
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.geofilters.ui.viewmodel.GeoFilterPageViewModelBase");
        }
    }
}

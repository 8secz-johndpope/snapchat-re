package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: twf */
public final class twf {
    final EnumMap<twe, abll> a = new EnumMap(twe.class);
    public int b;
    public zfz c;
    public final zfo d;
    private final EnumSet<twe> e = EnumSet.allOf(twe.class);
    private final ilv f;
    private final tvd g;

    /* renamed from: twf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: twf$b */
    static final class b extends abll {
        final ilv a;
        final ilz b;

        public b(abll abll, ilv ilv, ilz ilz) {
            akcr.b(abll, "timer");
            akcr.b(ilv, "graphene");
            akcr.b(ilz, "metricWithDimensions");
            super(abll);
            this.a = ilv;
            this.b = ilz;
        }

        public final abll a() {
            super.a();
            this.a.a(this.b, TimeUnit.NANOSECONDS.toMillis(c().longValue() - b()));
            return this;
        }
    }

    static {
        a aVar = new a();
    }

    public twf(ilv ilv, tvd tvd, zfo zfo) {
        akcr.b(ilv, "graphene");
        akcr.b(tvd, "previewDataSource");
        akcr.b(zfo, "cpuStatsLogger");
        this.f = ilv;
        this.g = tvd;
        this.d = zfo;
    }

    private static abll a(abll abll, ilv ilv, ilz ilz) {
        return new b(abll, ilv, ilz);
    }

    private void b(twb twb) {
        akcr.b(twb, "event");
        if (twb == twb.ENTER_SEND_TO_PAGE_GESTURE) {
            tvd tvd = this.g;
            (tvd != null ? tvd.j : null).e = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public final abll a(twe twe, akbl<? super ily, ilz> akbl) {
        akcr.b(twe, "previewSection");
        akcr.b(akbl, "setDimensions");
        abll a = abll.a(twe);
        ily ily = twe.grapheneMetric;
        if (ily == null) {
            return a;
        }
        akcr.a((Object) a, "timer");
        return twf.a(a, this.f, (ilz) akbl.invoke(ily));
    }

    public final List<abll> a(twb twb) {
        akcr.b(twb, "event");
        List arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            twe twe = (twe) it.next();
            if (twb == twe.endEvent) {
                Object obj = (abll) this.a.get(twe);
                if (obj != null) {
                    akcr.a(obj, "it");
                    arrayList.add(obj);
                    this.a.remove(twe);
                }
            }
        }
        return arrayList;
    }

    public final void a(twb twb, boolean z, akbl<? super ily, ilz> akbl) {
        akcr.b(twb, "event");
        akcr.b(akbl, "setDimensions");
        twb.name();
        zgo.b();
        b(twb);
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            Object obj = (twe) it.next();
            if (twb == obj.startEvent && (z || !this.a.containsKey(obj))) {
                Map map = this.a;
                akcr.a(obj, "previewSection");
                map.put(obj, a(obj, akbl));
            }
            if (twb == obj.endEvent && this.a.containsKey(obj)) {
                abll abll = (abll) this.a.get(obj);
                if (abll != null) {
                    abll.a();
                }
                this.a.remove(obj);
            }
        }
    }
}

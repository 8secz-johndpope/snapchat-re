package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: gsw */
public final class gsw implements gqw {
    final ajwy<gte> a;
    private final ajwy<gtd> b;

    /* renamed from: gsw$a */
    static final class a<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ gsw a;
        private /* synthetic */ gqv b;

        a(gsw gsw, gqv gqv) {
            this.a = gsw;
            this.b = gqv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            if (bool.booleanValue()) {
                gte gte = (gte) this.a.a.get();
                gsw gsw = this.a;
                gqv gqv = this.b;
                gtb gtb = r4;
                gtb gtb2 = new gtb(gqv.a, ailp.JAVA, gqv.b, gqv.e, System.currentTimeMillis(), null, gqv.g, gsw.b(gqv), gqv.d, ((gte) gsw.a.get()).a(), ((gte) gsw.a.get()).b(), gqv.h, gqv.i);
                a = gte.a(gtb);
            } else {
                a = ajvo.a(ajhn.a);
            }
            return a;
        }
    }

    public gsw(ajwy<gte> ajwy, ajwy<gtd> ajwy2) {
        akcr.b(ajwy, "snapAirCrashReporter");
        akcr.b(ajwy2, "snapAirCrashReportGating");
        this.a = ajwy;
        this.b = ajwy2;
    }

    static List<aill> b(gqv gqv) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : gqv.f.entrySet()) {
            aill aill = new aill();
            aill.a = (String) entry.getKey();
            aill.b = (String) entry.getValue();
            arrayList.add(aill);
        }
        return arrayList;
    }

    public final ajcx a(gqv gqv) {
        akcr.b(gqv, "annotatedJavaCrash");
        Object e = ((gtd) this.b.get()).a().e((ajfc) new a(this, gqv));
        akcr.a(e, "snapAirCrashReportGating…      }\n                }");
        return e;
    }
}

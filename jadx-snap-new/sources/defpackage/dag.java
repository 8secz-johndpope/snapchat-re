package defpackage;

import android.util.SparseIntArray;
import com.google.common.base.Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: dag */
public final class dag {
    private final ajwy<iha> a;
    private final Map<Class<? extends das>, a> b = new HashMap();

    /* renamed from: dag$a */
    interface a {
        void convertToBlizzard(das das, aaah aaah, boolean z, aabc aabc);
    }

    public dag(ajwy<iha> ajwy) {
        this.a = ajwy;
    }

    private static <I extends Number> String a(Map<String, I> map) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Entry entry : map.entrySet()) {
            stringBuilder.append('\"');
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("\":");
            stringBuilder.append(entry.getValue());
            stringBuilder.append(',');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private synchronized void a() {
        if (this.b.isEmpty()) {
            this.b.put(dbn.class, -$$Lambda$dag$3flLIkHh5uuLMFj3vyqlxJ2mahU.INSTANCE);
            this.b.put(dba.class, -$$Lambda$dag$N0n_cyWwN8N4Cp9ym83ss2CK558.INSTANCE);
            this.b.put(dbf.class, -$$Lambda$dag$-eI0rUTFcfDYUV8GZe1m6Udx8Qk.INSTANCE);
            this.b.put(day.class, -$$Lambda$dag$jbvOIsvSEZMwNueBhTAHcM3T4DI.INSTANCE);
            this.b.put(dav.class, -$$Lambda$dag$A-45Ns3hnsFz3SBgmtdRkFyHWPM.INSTANCE);
            this.b.put(dbb.class, -$$Lambda$dag$OvDWyohQy-IP29xBRWhUYYhTf4I.INSTANCE);
            this.b.put(dbk.class, -$$Lambda$dag$EE_0CGMfSYSw6VpSQQv7KC9h3-A.INSTANCE);
            this.b.put(dal.class, -$$Lambda$dag$1ZOOCdk5FUWirMQhjj_8s6YXVLM.INSTANCE);
            this.b.put(dap.class, new -$$Lambda$dag$vZNNguPOjO2NDFsDUNmUlRcUx48(this));
            this.b.put(dbl.class, -$$Lambda$dag$y0wcuM3jen2is6HsDRTNe8soFHg.INSTANCE);
        }
    }

    private static String b(Map<String, dao> map) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Entry entry : map.entrySet()) {
            dao dao = (dao) entry.getValue();
            stringBuilder.append('\"');
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("\":{\"cameraVisibleTimeMs\":");
            stringBuilder.append(dao.a);
            stringBuilder.append(",\"cameraOpenTimeWithStartupTimeMs\":");
            stringBuilder.append(dao.b);
            stringBuilder.append(",\"cameraOpenTimeMs\":");
            stringBuilder.append(dao.c);
            stringBuilder.append("},");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private static /* synthetic */ void b(das das, aaah aaah, boolean z, aabc aabc) {
        if (!z) {
            dbl dbl = (dbl) das;
            if (!Strings.isNullOrEmpty(dbl.b) || !Strings.isNullOrEmpty(dbl.a)) {
                aaub aaub = new aaub();
                aaub.a = dbl.b;
                aaub.b = dbl.a;
                aaah.a(aaub);
            }
        }
    }

    private /* synthetic */ void c(das das, aaah aaah, boolean z, aabc aabc) {
        dap dap = (dap) das;
        jh jhVar = dap.a;
        for (int i = 0; i < jhVar.size(); i++) {
            if (dap.b((Class) jhVar.b(i))) {
                a((das) jhVar.c(i), aaah, z, aabc);
            }
        }
    }

    private static /* synthetic */ void d(das das, aaah aaah, boolean z, aabc aabc) {
        dal dal = (dal) das;
        if (z) {
            aact aact = new aact();
            aact.b = Long.valueOf(dal.a);
            aact.a = Long.valueOf(dal.b);
            aact.c = Long.valueOf(dal.c);
            aact.d = dag.a(new HashMap(dal.d));
            aact.e = dag.b(das.a(dal.e, null));
            aaah.a(aact);
        }
    }

    private static /* synthetic */ void e(das das, aaah aaah, boolean z, aabc aabc) {
        dbk dbk = (dbk) das;
        if (z) {
            aasu aasu = new aasu();
            aasu.a = Long.valueOf(dbk.b);
            aasu.b = Long.valueOf(dbk.a);
            aasu.c = Long.valueOf((long) dbk.c);
            aasu.d = Long.valueOf(dbk.d);
            aasu.e = Long.valueOf((long) dbk.e);
            aasu.f = dbk.f;
            aaah.a(aasu);
        }
    }

    private static /* synthetic */ void f(das das, aaah aaah, boolean z, aabc aabc) {
        dbb dbb = (dbb) das;
        if (z) {
            aaps aaps = new aaps();
            StringBuilder stringBuilder = new StringBuilder("1:");
            stringBuilder.append(dbb.c);
            stringBuilder.append(",2:");
            stringBuilder.append(dbb.b);
            stringBuilder.append(",3:");
            stringBuilder.append(dbb.a);
            aaps.a = stringBuilder.toString();
            aaps.b = Long.valueOf(dbb.d);
            aaah.a(aaps);
        }
    }

    private static /* synthetic */ void g(das das, aaah aaah, boolean z, aabc aabc) {
        dav dav = (dav) das;
        if (z && aabc == aabc.ACTIVE_FOREGROUND) {
            StringBuilder stringBuilder = new StringBuilder();
            for (SparseIntArray sparseIntArray : dav.a) {
                int size = sparseIntArray.size();
                for (int i = 0; i < size; i++) {
                    if (sparseIntArray.valueAt(i) > 0) {
                        stringBuilder.append(sparseIntArray.keyAt(i));
                        stringBuilder.append(':');
                        stringBuilder.append(sparseIntArray.valueAt(i));
                        stringBuilder.append(',');
                    }
                }
                stringBuilder.append(';');
                aahk aahk = new aahk();
                aahk.a = stringBuilder.toString();
                aaah.a(aahk);
            }
        }
    }

    private static /* synthetic */ void h(das das, aaah aaah, boolean z, aabc aabc) {
        day day = (day) das;
        if (z) {
            aahl aahl = new aahl();
            aahl.a = Long.valueOf(day.b);
            aahl.b = Long.valueOf(day.a);
            aaah.a(aahl);
        }
    }

    private static /* synthetic */ void i(das das, aaah aaah, boolean z, aabc aabc) {
        dbf dbf = (dbf) das;
        if (z) {
            aasp aasp = new aasp();
            aasp.c = Long.valueOf(dbf.b);
            aasp.d = Long.valueOf(dbf.a);
            aasp.a = Long.valueOf(dbf.d);
            aasp.b = Long.valueOf(dbf.c);
            aaah.a(aasp);
            aass aass = new aass();
            aass.c = Long.valueOf(dbf.f);
            aass.d = Long.valueOf(dbf.e);
            aass.a = Long.valueOf(dbf.h);
            aass.b = Long.valueOf(dbf.g);
            aaah.a(aass);
        }
    }

    private static /* synthetic */ void j(das das, aaah aaah, boolean z, aabc aabc) {
        dba dba = (dba) das;
        if (z) {
            aabn aabn = new aabn();
            aabn.a = Double.valueOf(Float.valueOf(dba.a).doubleValue());
            aabn.c = Long.valueOf(dba.c);
            aabn.b = Long.valueOf(dba.b);
            aaah.a(aabn);
            return;
        }
        aaah.d = Double.valueOf(Float.valueOf(dba.a).doubleValue());
    }

    private static /* synthetic */ void k(das das, aaah aaah, boolean z, aabc aabc) {
        dbn dbn = (dbn) das;
        if (!z) {
            abia abia = new abia();
            abia.a = Long.valueOf(dbn.b);
            abia.b = Long.valueOf(dbn.a);
            aaah.a(abia);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(das das, aaah aaah, boolean z, aabc aabc) {
        a();
        if (!(das == null || aaah == null)) {
            a aVar = (a) this.b.get(das.getClass());
            if (aVar != null) {
                aVar.convertToBlizzard(das, aaah, z, aabc);
            }
        }
    }
}
